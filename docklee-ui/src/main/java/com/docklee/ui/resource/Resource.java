package com.docklee.ui.resource;

import com.docklee.ui.resource.exception.ResourceException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * 	The class <code>Resource</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 22-11-2020 
 * @see {@link ???}
 */
public interface Resource {

	/**
	* <p>
	* The class <code>getResource</code> ...
	* </p>
	* 
	* @param reference
    * @return String
	*/
	public String getResource(ResourceType reference) throws ResourceException;
	
	/**
	* <p>
	* The class <code>ResourceType</code> ...
	* </p>
	* 
	* @author Antonio Neto [<()>] - Initial implementation.
	* @version 1.0.0
	* @since 22-11-2020 
	*/
	public interface ResourceType{	
		public String getReference();
		public String getResource();
	}
}