package com.docklee.ui.resource.handler;

import java.util.Map;

import com.docklee.ui.resource.exception.HandlerException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The interface <code>ResourceHandler</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 22-11-2020 
 */
public interface ResourceHandler {

	/**
	 * <p>
	 * The method <code>handle</code> ...
	 * </p>
	 * 
	 * @param resource
	 * @return String
	 * @exception HandlerException
	 */
	public String handle(String resource, Map<String, String> inofMap) throws HandlerException;
}
