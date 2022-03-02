package com.docklee.core.action.impl;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docklee.core.action.Action;
import com.docklee.core.exception.ActionException;
import com.docklee.core.exception.ResourceException;
import com.docklee.ui.resource.HtmlResource;
import com.docklee.ui.resource.LayoutBuilder;
import com.docklee.ui.resource.handler.LoginHandler;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ShowLoginAction</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 27-02-2022
 */
public class ShowLoginAction implements Action {

	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ActionException
	 * */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ActionException {
		try {
			response.getWriter().write(LayoutBuilder.create().setResourceBase(HtmlResource.LOGIN).setResourceHandler(new LoginHandler(request.getServletContext())).build());
		} catch (IOException | ResourceException e) {
			throw new ActionException(e);
		}
	}
}
