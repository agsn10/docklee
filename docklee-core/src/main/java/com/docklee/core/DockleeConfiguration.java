package com.docklee.core;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * */
import org.springframework.boot.web.servlet.ServletRegistrationBean;

public class DockleeConfiguration{

    private final String urlMapping = "/docklee/*";
    private String pkg;
    private int loadOnStartup = 1;
    private Set<String> listUrlMappings = new HashSet<>(0);

    private DockleeConfiguration() {
    }

    public static DockleeConfiguration create(){
        return new DockleeConfiguration();
    }

    public DockleeConfiguration packageToScan(final String pkg){
        this.pkg = pkg;
        return this;
    }

    public DockleeConfiguration loadOnStartup(int loadOnStartup){
        this.loadOnStartup = loadOnStartup;
        return this;
    }

    public DockleeConfiguration defaultMapping(){
        listUrlMappings.add(urlMapping);
        return this;
    }

    public DockleeConfiguration addUrlMappings(final String... urlMappings){
        Stream.of(urlMappings).forEach( url -> listUrlMappings.add(url));
        return this;
    }

    public ServletRegistrationBean build(){
        if(listUrlMappings.isEmpty()) listUrlMappings.add(urlMapping);
        ServletRegistrationBean servlet = new ServletRegistrationBean(new DockleeManager(this.pkg), listUrlMappings.stream().toArray(String[]::new));
        servlet.setLoadOnStartup(loadOnStartup);
        return servlet;
    }


    public static void main(String[] args) {
        DockleeConfiguration.create()
                            .defaultMapping()
                            .packageToScan("com.dsm.core.web.resource")
                            .loadOnStartup(1)
                            .build();
    }
}
