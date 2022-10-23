package com.docklee.core.action.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docklee.core.ContextManager;
import com.docklee.core.action.Action;
import com.docklee.core.exception.ActionException;
import com.docklee.core.exception.ResourceException;
import com.docklee.ui.resource.HtmlResource;
import com.docklee.ui.resource.LayoutBuilder;
import com.docklee.ui.resource.handler.ApiDocumentationHandler;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>DoRedirectLoginAction</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 23-11-2020 
 */
public class DoRedirectLoginAction implements Action {

	/**
	 * <p>
	 * The method <code>execute</code> when invoked executes the action.
	 * </p>
	 * 
	 * @param request The interface HttpServletRequest from container.
	 * @param response The interface HttpServletResponse from container.
	 */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)throws ActionException {
		try {
			response.getWriter().write(LayoutBuilder.create()
				                                    .setInfoMap(new HashMap<String, String>(0){{ }})
				                                    .setResourceBase(HtmlResource.API_DOCUMENTATION)
				                                    .setResourceHandler(new ApiDocumentationHandler(request.getServletContext()))
					                                .build()
			                          );
		} catch (IOException | ResourceException e) {
			throw new ActionException(e);
		}
	}

}
