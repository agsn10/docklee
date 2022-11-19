package com.docklee.ui.resource;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class ResourceInspector {

    private List<Class<?>> resources = null;
    private Class<?> resource = null;

    private ResourceInspector(){ }

    public static ResourceInspector create(){
        return new ResourceInspector();
    }
    public ResourceInspector defineTarget(List<Class<?>> resources){
        this.resources = resources;
        return this;
    }

    public ResourceInspector defineTarget(Class<?> resource){
        this.resource = resource;
        return this;
    }

    public Getter get(){
        return new Getter(this);
    }

    public Checker check(){
        return new Checker(this);
    }

    public class Checker{
        private ResourceInspector ResourceInspector;

        public Checker(final com.docklee.ui.resource.ResourceInspector resourceInspector) {
            ResourceInspector = resourceInspector;
        }
    }

    public class Getter{

        private Class<?> target = null;
        private ResourceInspector resourceInspector;

        public Getter(final com.docklee.ui.resource.ResourceInspector resourceInspector) {
            this.resourceInspector = resourceInspector;
        }

        public Getter target(Class<?> target){
            this.target = target;
            return this;
        }

        public List<Object> getTagFromResource(){
            Objects.requireNonNull(this.target);

            List<Object> objectList = new ArrayList<>(0);
            List<Class<?>> classList = this.resourceInspector.resources;
            Class<?> aClass = this.resourceInspector.resource;

            Optional.ofNullable(aClass).ifPresent( clazz ->{
                Optional<Annotation> annoOpt = Stream.of(clazz.getAnnotations()).filter(annotation -> annotation.annotationType().equals(target)).collect(Collectors.toList()).stream().findFirst();
                annoOpt.ifPresent(annotation -> {
                    objectList.add(annotation);
                });
            });

            Optional.ofNullable(classList).ifPresent( clazzList ->{
                clazzList.forEach(obj ->{
                    if(!obj.isInterface()){
                        try {
                            Class<?> c = Class.forName(obj.toString().split(" ")[1]);
                            Constructor<?> cons = c.getDeclaredConstructor();
                            cons.setAccessible(true);
                            Object o = cons.newInstance();
                            List list = Stream.of(o.getClass().getAnnotations())
                                              .filter(annotation -> annotation.annotationType().equals(target))
                                              .collect(Collectors.toList());
                            if(list.isEmpty()){
                                for(Class<?> clazz : o.getClass().getInterfaces())
                                    list = Stream.of(clazz.getAnnotations())
                                                 .filter(annotation -> annotation.annotationType().equals(target))
                                                 .collect(Collectors.toList());
                                objectList.addAll(list);
                            }else
                                objectList.addAll(list);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
            });

            return objectList;
        }
    }
}
