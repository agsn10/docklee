package com.docklee.core;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractDockleeManager extends HttpServlet implements Serializable {

    protected String packageToScan;

    public AbstractDockleeManager(final String packageToScan) {
        this.packageToScan = packageToScan;
    }



}
