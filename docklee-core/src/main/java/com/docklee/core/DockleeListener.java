package com.docklee.core;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.Query;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.docklee.core.exception.InitializerException;
import com.docklee.core.init.ContextInitializer;
import com.docklee.core.init.ContextParameterInitializer;
import com.docklee.core.init.LogoInitializer;

/**
 *
 * @since 08-03-2022
 * */
@WebListener
public class DockleeListener implements ServletContextListener {

    private final ContextManager contextManager = ContextManager.getInstance();

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
        try {
            ContextInitializer.newInstance()
                .addInitializer(new ContextParameterInitializer(contextManager, sce.getServletContext()))
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
