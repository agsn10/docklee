package com.docklee.core.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docklee.core.exception.ActionException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * 	This interface is used to implement a Docklee action.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 27-02-2022
 */
public interface Action {
		
	/**
	* <p>
	* The class <code>execute</code> ...
	* </p>
	* 
	* @param request Interface HttpServletRequest.
	* @param response Interface HttpServletResponse.
	*/
	public void execute(HttpServletRequest request, HttpServletResponse response)throws ActionException;
}
