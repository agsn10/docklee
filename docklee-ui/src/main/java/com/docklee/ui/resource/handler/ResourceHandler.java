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

	interface ConstantResources{
		public final String DOCKLEE_CONTEXT = "docklee_context";
		public final String CTX_GLOBAL_DATA = "ctx.global.data";
		public final String API_DEFINITION = "api.definition";
	}

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
