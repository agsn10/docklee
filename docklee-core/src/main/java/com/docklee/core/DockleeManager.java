package com.docklee.core;

import static com.docklee.core.action.ActionOrchestrator.aNewActionOrchestrator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docklee.core.action.ActionOrchestrator;

public class DockleeManager extends AbstractDockleeManager{

    /**
     *
     * */
    private final ActionOrchestrator orchestrator = aNewActionOrchestrator();

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
        orchestrator.inicializeActions();
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
        String action = orchestrator.getAction(req, resp);
        orchestrator.executeAction(action);
    }
}
