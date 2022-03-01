package com.docklee.ui.resource;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

import com.docklee.ui.resource.exception.HandlerException;
import com.docklee.ui.resource.exception.ResourceException;
import com.docklee.ui.resource.handler.ResourceHandler;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>LayoutBuilder</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 22-11-2020 
 */
public class LayoutBuilder implements Serializable{

	private static final long serialVersionUID = -1047290843760555764L;
	
	private ResourceHandler handler;
	private Resource.ResourceType resourceType;
	private Map<String, String> infoMap;
	
	private LayoutBuilder() {}
	
	/**
	 * <p>
	 * The method <code>create</code> ...
	 * </p>
	 * 
	 * @return LayoutBuilder
	 */
	public static LayoutBuilder create() {
		return new LayoutBuilder();
	}
	
	/**
	 * <p>
	 * The method <code>setResourceBase</code> when invoked executes the action.
	 * </p>
	 * 
	 * @param resourceType 
	 * @return LayoutBuilder
	 */
	public LayoutBuilder setResourceBase(Resource.ResourceType resourceType) {
		this.resourceType = resourceType;
		return this;
	}

	/**
	 * <p>
	 * The method <code>setInfoMap</code> define the infoMap.
	 * </p>
	 *
	 * @param infoMap
	 * @return LayoutBuilder
	 */
	public LayoutBuilder setInfoMap(Map<String, String> infoMap) {
		this.infoMap = infoMap;
		return this;
	}
	
	/**
	 * <p>
	 * The method <code>setResourceHandler</code> ...
	 * </p>
	 * 
	 * @param handler
	 * @return LayoutBuilder
	 */
	public LayoutBuilder setResourceHandler(ResourceHandler handler) {
		this.handler = handler;
		return this;
	}
	
	/**
	 * <p>
	 * The method <code>build</code> ...
	 * </p>
	 * 
	 * @return String
	 * @exception ResourceException
	 */
	public String build() throws ResourceException {
	
		if(Objects.isNull(handler))	return Resources.getInstance().getResource(resourceType);
		
		try {			
			return handler.handle(Resources.getInstance().getResource(resourceType), this.infoMap);
		} catch (HandlerException | ResourceException e) {
			throw new ResourceException(e);
		}
	}
}