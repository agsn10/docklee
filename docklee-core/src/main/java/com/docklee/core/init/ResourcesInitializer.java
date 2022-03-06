package com.docklee.core.init;

import java.util.Set;

import javax.servlet.ServletContext;

import com.docklee.core.ContextInfo;
import com.docklee.core.ContextManager;
import com.docklee.core.ResourceResolver;
import com.docklee.core.exception.InitializerException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ResourcesInitializer</code> ....
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 22-11-2020 
 */
public class ResourcesInitializer implements ContextInitializer.Initializer{

	private ServletContext servletContext;
	private ContextManager contextManager;
	private String packageToScan;
	
	public ResourcesInitializer(ServletContext servletContext, ContextManager contextManager, String packageToScan) {
		super();
		this.servletContext = servletContext;
		this.contextManager = contextManager;
		this.packageToScan = packageToScan;
	}

	@Override
	public void perform() throws InitializerException {
		try {
			 Set<Class<?>> set = ResourceResolver.getInstance().loadResources(this.packageToScan);
			 if(!set.isEmpty())
				 set.stream().forEach(clazz -> this.contextManager.getContext(ContextInfo.Ctx.RESOURCE_INFO).put(clazz.getName(), clazz));
			 contextManager.saveContext(this.servletContext, this.contextManager);
		} catch (Exception e) { throw new InitializerException(e); }
	}

}
