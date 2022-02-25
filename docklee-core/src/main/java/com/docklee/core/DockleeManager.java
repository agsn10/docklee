package com.docklee.core;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DockleeManager extends AbstractDockleeManager{

    public DockleeManager(final String packageToScan) {
        super(packageToScan);
    }

    /**
     * <p>
     * The method <code>init</code> initializes resources for the ServiceManager.
     * </p>
     *
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        super.init();
    }

    /**
     * <p>
     * The method <code>doGet</code> .....
     * </p>
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    /**
     * <p>
     * The method <code>doPost</code> .....
     * </p>
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    /**
     * <p>
     * The method <code>processRequest</code> processes all requests coming in GET or POST http method.
     * </p>
     *
     * @param req Interface HttpServletRequest from container.
     * @param resp Interface HttpServletResponse from container.
     * @throws
     */
    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().write("Hello World!");
    }
}
