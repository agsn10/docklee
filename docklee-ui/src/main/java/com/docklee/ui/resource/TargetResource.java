package com.docklee.ui.resource;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>TargetResource</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 22-11-2020 
 */
public final class TargetResource {

	public static final String BASE_URL = "${base_url}";
	public static final String PORT = "{port}";
	
	/**
	 * Contructor
	 * */
	private TargetResource(){ }
	
	
	public final class Login{
		
		/**
		 * Contructor
		 * */
		private Login(){ }
		
		public static final String BOOTSTRAP_MIN_CSS = "${bootstrap_min_css}";
		public static final String MDB_MIN_CSS = "${mdb_min_css}";
		public static final String LOGIN_CSS = "${login_css}";
		public static final String JQUERY_3_3_1_MIN_JS = "${jquery_3_3_1_min_js}";
		public static final String POPPER_MIN_JS = "${popper_min_js}";
		public static final String BOOTSTRAP_MIN_JS = "${bootstrap_min_js}";
		public static final String MDB_MIN_JS = "${mdb_min_js}";
		public static final String LOGIN_JS = "${login_js}";
	}
	
	public final class ApiDocumentation{
		
		/**
		 * Contructor
		 * */
		private ApiDocumentation(){ }
		
		public static final String JQUERY_3_3_1_MIN_JS = "${jquery_3_3_1_min_js}";
		public static final String BOOTSTRAP_MIN_JS = "${bootstrap_min_js}";
		public static final String MDB_MIN_JS = "${mdb_min_js}";
		public static final String POPPER_MIN_JS = "${popper_min_js}";
		public static final String BOOTSTRAP_MIN_CSS = "${bootstrap_min_css}";
		public static final String MDB_MIN_CSS = "${mdb_min_css}";

		public static final String API_INFO = "${api.info}";
		public static final String API_SERVERS = "${api.servers}";
		public static final String API_SECURITY_REQUIREMENT = "${api.security.requirement}";
		public static final String API_EXTERNAL_DOCUMENTATION = "${api.external.documentation}";
		public static final String API_EXTENSION = "${api.extension}";
		public static final String API_TAG = "${api.tag}";
		public static final String API_RESOURCES = "${api.resources}";
		public static final String API_RESOURCE_OPERATIONS = "${api.resource.operation}";
	}
}
