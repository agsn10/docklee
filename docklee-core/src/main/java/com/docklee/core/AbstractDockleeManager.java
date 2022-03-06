package com.docklee.core;

import java.io.Serializable;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;

import com.docklee.core.exception.InitializerException;
import com.docklee.core.init.ContextInitializer;
import com.docklee.core.init.ContextParameterInitializer;
import com.docklee.core.init.LogoInitializer;
import com.docklee.core.init.ResourcesInitializer;
import com.docklee.model.pojo.APIDefinition;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>AbstractDockleeManager</code> ....
 * </p>
 *
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 05-02-2022
 */
public abstract class AbstractDockleeManager extends HttpServlet implements Serializable, ServletContextListener {

    private final ContextManager contextManager = ContextManager.getInstance();

    protected String packageToScan;
    protected APIDefinition apiDefinition;

    public AbstractDockleeManager(final String packageToScan, final APIDefinition apiDefinition) {
        this.packageToScan = packageToScan;
        this.apiDefinition = apiDefinition;
    }

    /**
     * <p>
     * The method <code>contextInitialized</code> is called at startup of the Docklee application context to perform the startup operations of the framework.
     * </p>
     *
     * @param sce This is the event class for notifications about changes to the servlet context of a web application.
     */
    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        ServletContextListener.super.contextInitialized(sce);
        contextManager.loadContext(sce.getServletContext());
        try {
            ContextInitializer.newInstance()
                .addInitializer(new ContextParameterInitializer(contextManager, sce.getServletContext()))
                //.addInitializer(new ResourcesInitializer(sce.getServletContext(), contextManager, this.packageToScan))
                .addInitializer(new LogoInitializer(contextManager))
                .init();
        } catch (InitializerException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    @Override
    public void contextDestroyed(final ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
