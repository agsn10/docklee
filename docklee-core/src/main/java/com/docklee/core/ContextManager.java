package com.docklee.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * 	This interface is used to implement a Docklee action.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
public final class ContextManager extends HashMap<String, HashMap<String, Object>> implements Serializable{

	private static final long serialVersionUID = -8296597487503238759L;

    public static final String DOCKLEE_CONTEXT = "docklee_context";
    
    /**
	 * 
	 * */
    private ContextManager() { }
    
    /**
	 * 
	 * */
    private static class LazyHolder {
		static final ContextManager INSTANCE = new ContextManager();
	}

	/**
	 * 
	 * */
	public static ContextManager getInstance() {
		return LazyHolder.INSTANCE;
	}
    
    /**
	 * <p>
	 * The method <code>loadContext</code> loads the Gandlee context from the container context.
	 * </p>
	 * 
	 * @param servletContext The ServletContext from container.
	 * @return The context Docklee.
	 */
	public ContextManager loadContext(ServletContext servletContext){

		ContextManager contextManager  = (ContextManager) servletContext.getAttribute(ContextManager.DOCKLEE_CONTEXT);
		if(contextManager == null){
			contextManager = new ContextManager();
		    servletContext.setAttribute(ContextManager.DOCKLEE_CONTEXT, contextManager);
		}	
		return contextManager;
	}
	
	 /**
	 * <p>
	 * The method <code>getContext</code> gets the context.
	 * </p>
	 * 
	 * @param context The context name.
	 * @return Return all values the context or NULL.
	 */
	public Map<String, Object> getContext(String context){
		if(Objects.isNull(this.get(context))){
			this.put(context, new HashMap<String, Object>());
			return this.get(context);
		}
		return this.get(context);
	}
	
	 /**
	 * <p>
	 * The method <code>saveContext</code> saves the data in the Gandlee context in the context of the container.
	 * </p>
	 * 
	 * @param servletContext ServletContext from container.
	 * @param contextManager Docklee context. 
	 */
	public void saveContext(ServletContext servletContext, ContextManager contextManager){
		servletContext.setAttribute(ContextManager.DOCKLEE_CONTEXT, contextManager);
	}	
	
	 /**
	 * <p>
	 * The method <code>loadServerInfo</code> loads the information from the ServerInfo context.
	 * </p>
	 * 
	 * @param request Interface HttpServletRequest.
	 * @param contextManager The context of Docklee.
	 */
	public void loadServerInfo(HttpServletRequest request, ContextManager contextManager) {
		
		if (contextManager != null && !contextManager.containsKey(ContextInfo.Ctx.SERVER_INFO)) {
			HashMap<String, Object> mapServerInfo = new HashMap<String, Object>();
			mapServerInfo.put(ContextInfo.ServerInfo.CONTEXT_PATH, request.getContextPath());
			mapServerInfo.put(ContextInfo.ServerInfo.LOCALE, request.getLocale());
			mapServerInfo.put(ContextInfo.ServerInfo.SERVER_PORT, request.getServerPort());
			mapServerInfo.put(ContextInfo.ServerInfo.SERVER_NAME, request.getServerName());
			mapServerInfo.put(ContextInfo.ServerInfo.SERVLET_PATH, request.getServletPath());
			mapServerInfo.put(ContextInfo.ServerInfo.REQUEST_URI, request.getRequestURI());
			mapServerInfo.put(ContextInfo.ServerInfo.REMOTE_USER, request.getRemoteUser());
			mapServerInfo.put(ContextInfo.ServerInfo.REMOTE_HOST, request.getRemoteHost());
			mapServerInfo.put(ContextInfo.ServerInfo.PATH_INFO, request.getPathInfo());
			mapServerInfo.put(ContextInfo.ServerInfo.PROTOCOL, request.getProtocol());
			mapServerInfo.put(ContextInfo.ServerInfo.LOCAL_PORT, request.getLocalPort());
			mapServerInfo.put(ContextInfo.ServerInfo.CHARACTER_ENCODING, request.getCharacterEncoding());
			mapServerInfo.put(ContextInfo.ServerInfo.LOCAL_NAME, request.getLocalName());
			mapServerInfo.put(ContextInfo.ServerInfo.SCHEME, request.getScheme());
			contextManager.put(ContextInfo.Ctx.SERVER_INFO, mapServerInfo);	
			contextManager.saveContext(request.getServletContext(), contextManager);
		}
	}
}
