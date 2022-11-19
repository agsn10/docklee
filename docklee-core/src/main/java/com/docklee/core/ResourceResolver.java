package com.docklee.core;

import java.io.IOException;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import com.google.common.reflect.ClassPath;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ResourceResolver</code> ....
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 22-11-2020 
 */
public final class ResourceResolver {

	private boolean isChecked = false;

	/**
	 * Constructor
	 * */
	private ResourceResolver() { }

	private static class LazyHolder {
		static final ResourceResolver INSTANCE = new ResourceResolver();
	}

	public static ResourceResolver getInstance() {
		return LazyHolder.INSTANCE;
	}

	public void checkResources(DockleeManager dockleeManager, HttpServletRequest req){
		try {
			if(!isChecked) {
				ContextManager contextManager = ContextManager.getInstance().loadContext(req.getServletContext());
				if (Objects.isNull(dockleeManager.getPackageToScan()) && Objects.isNull(dockleeManager.getApiDefinition()))
					throw new IllegalArgumentException("The parameters PackageToScan & ApiDefinition from DockleeConfiguration is required!");
				Set<Class<?>> set = loadResources(dockleeManager.getPackageToScan());
				if (!set.isEmpty())
					set.stream().forEach(clazz -> contextManager.getContext(ContextInfo.Ctx.RESOURCE_INFO).put(clazz.getName(), clazz));
				contextManager.getContext(ContextInfo.Ctx.GLOBAL_DATA).put(ContextInfo.GlobalData.API_DEFINITION, dockleeManager.getApiDefinition());
				contextManager.saveContext(req.getServletContext(), contextManager);
				isChecked = true;
			}
		}catch (Exception e){
			e.printStackTrace();
			System.exit(0);
		}
	}

	private Set<Class<?>> loadResources(final String packageName) throws IOException {
		return ClassPath.from(ClassLoader.getSystemClassLoader())
						.getAllClasses()
						.stream()
						.filter(clazz -> clazz.getPackageName().equalsIgnoreCase(packageName))
						.map(clazz -> clazz.load())
						.collect(Collectors.toSet());
	}
}
