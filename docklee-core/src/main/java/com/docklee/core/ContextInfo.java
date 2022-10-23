package com.docklee.core;

import java.io.Serializable;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ContextInfo</code> has as main function to group values ​​in constants to be used by in context.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see {@link ContextManager}
 */
public final class ContextInfo implements Serializable{

	/** Used to obtain the ... */
	public static final String DOCKLEE_NAME_LOGO = "Docklee";

	private ContextInfo() {}

	public final class Ctx{
			
			private Ctx() {}
			
			/** Used to obtain the ... */
			public static final String RESOURCE_INFO = "ctx.resource.info";
			/** Used to obtain the ... */
			public static final String SERVER_INFO = "cxt.server.info";
			/** Used to obtain the ... */
			public static final String GLOBAL_DATA = "ctx.global.data";
	}
	
	 /**
	   * <p>
	   * The interface <code>GlobalData</code> represents the actions performed through the console.
	   * </p>
	   * 
	   * @author Antonio Neto [<()>] - Initial implementation.
	   * @version 1.0.0
	   * @since 18-11-2020 
	   */
	public final class GlobalData{
		
		private GlobalData() {}

		/** Used to obtain the ... */
		public static final String BASE_URL = "base.url";
		 /** Used to obtain the ... */
		 public static final String API_DEFINITION = "api.definition";
		/** Used to obtain the ... */
		public static final String LOGIN_USERNAME = "com.docklee.login.username";
		/** Used to obtain the ... */
		public static final String LOGIN_PASSWORD = "com.docklee.login.password";
	}

	 /**
	   * <p>
	   * The interface <code>ServerInfo</code> represents information related to the server context.
	   * </p>
	   * 
	   * @author Antonio Neto [<()>] - Initial implementation.
	   * @version 1.0.0
	   * @since 18-11-2020
	   */
	public final class ServerInfo{
		
		private ServerInfo() {}
		
		/** Used to obtain the following server context information. For example: http://127.0.0.1:8080<b>/api-documentation</b>  */
		public static final String CONTEXT_PATH= "contextPath";
		/**	Used to obtain the following server context information. For example: pt_BR  */
		public static final String LOCALE = "locale";
		/**	Used to obtain the following server context information. For example: http://127.0.0.1:<b>8080</b>/api-documentation  */
		public static final String SERVER_PORT= "serverPort";
		/**	Used to obtain the following server context information. For example: http://<b>127.0.0.1</b>:8080/api-documentation  */
		public static final String SERVER_NAME = "serverName";
		/**	Used to obtain the following server context information. For example: http://127.0.0.1:8080/api-documentation<b>/docklee</b>  */
		public static final String SERVLET_PATH = "servletPath";
		/** Used to obtain the following server context information. For example:  */
		public static final String REQUEST_URI = "requestURI";
		/** Used to obtain the following server context information. For example:  */
		public static final String REMOTE_USER = "remoteUser";
		/** Used to obtain the following server context information. For example:  */
		public static final String REMOTE_HOST = "remoteHost";
		/** Used to obtain the following server context information. For example:  */
		public static final String PATH_INFO = "pathInfo";
		/** Used to obtain the following server context information. For example:  */
		public static final String SCHEME = "scheme";
		/** Used to obtain the following server context information. For example:  */
		public static final String PROTOCOL = "protocol";
		/** Used to obtain the following server context information. For example:  */
		public static final String LOCAL_PORT = "localPort";
		/** Used to obtain the following server context information. For example:  */
		public static final String CHARACTER_ENCODING = "characterEncoding";
		/** Used to obtain the following server context information. For example:  */
		public static final String LOCAL_NAME = "localName";			
	}
	
}
