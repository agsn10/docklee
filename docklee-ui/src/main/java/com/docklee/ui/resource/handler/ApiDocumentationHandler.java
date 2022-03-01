package com.docklee.ui.resource.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import com.docklee.ui.resource.CssResource;
import com.docklee.ui.resource.JsResource;
import com.docklee.ui.resource.Resources;
import com.docklee.ui.resource.TargetResource;
import com.docklee.ui.resource.exception.HandlerException;
import com.docklee.ui.resource.exception.ResourceException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ApiDocumentationHandler</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 23-11-2020 
 */
public class ApiDocumentationHandler implements ResourceHandler{

	private ServletContext servletContext;
	
	public ApiDocumentationHandler(ServletContext servletContext) {
		super();
		this.servletContext = servletContext;
	}
	
	@Override
	public String handle(String resource, Map<String, String> infoMap) throws HandlerException {
		HashMap<String, String> targets = new HashMap<>();
		try {
			
			//ContextManager  contextManager = ContextManager.getInstance().loadContext(this.servletContext);
			
//			targets.put(TargetResource.Console.PROTOCOL, contextManager.getContext(ContextInfo.Ctx.SERVER_INFO).get(ContextInfo.ServerInfo.PROTOCOL).toString());
//			targets.put(TargetResource.Console.SCHEME, contextManager.getContext(ContextInfo.Ctx.SERVER_INFO).get(ContextInfo.ServerInfo.SHEME).toString());
//			targets.put(TargetResource.Console.SERVER_NAME, InetAddressUtil.getComputerName());
//			targets.put(TargetResource.Console.SERVER_PORT, contextManager.getContext(ContextInfo.Ctx.SERVER_INFO).get(ContextInfo.ServerInfo.SERVER_PORT).toString());
//			targets.put(TargetResource.Console.CONTEXT_PATH, contextManager.getContext(ContextInfo.Ctx.SERVER_INFO).get(ContextInfo.ServerInfo.CONTEXT_PATH).toString());
//			targets.put(TargetResource.Console.SERVLET_PATH, contextManager.getContext(ContextInfo.Ctx.SERVER_INFO).get(ContextInfo.ServerInfo.SERVLET_PATH).toString());
//			
//			targets.put(TargetResource.Console.LIST_PRODUCTS, Components.Products.createList());
//			targets.put(TargetResource.Console.LIST_REST_SERVICES, Components.RestServices.createList(contextManager));
//			targets.put(TargetResource.Console.LIST_SOAP_SERVICES, Components.SoapServices.createList(contextManager));
//			targets.put(TargetResource.Console.DEV_TOOLS_SERVICES_SOAP, Components.SoapServices.createListSoapServicesDevTools(this.servletContext));
//			targets.put(TargetResource.Console.DEV_TOOLS_SERVICES_REST, Components.RestServices.createListRestServicesDevTools(this.servletContext));
//			
//			targets.put(TargetResource.Console.FILE_SAVER_JS, Resources.getInstance().getResource(JSResource.FILE_SAVER));
			targets.put(TargetResource.ApiDocumentation.JQUERY_3_3_1_MIN_JS, Resources.getInstance().getResource(JsResource.JQUERY_3_3_1_MIN));
			targets.put(TargetResource.ApiDocumentation.POPPER_MIN_JS, Resources.getInstance().getResource(JsResource.POPPER_MIN));
			targets.put(TargetResource.ApiDocumentation.BOOTSTRAP_MIN_JS, Resources.getInstance().getResource(JsResource.BOOTSTRAP_MIN));
			targets.put(TargetResource.ApiDocumentation.MDB_MIN_JS, Resources.getInstance().getResource(JsResource.MDB_MIN));
//			targets.put(TargetResource.Console.SPLIT_1_3_5_MIN_MIN_JS, Resources.getInstance().getResource(JSResource.SPLIT_MIN));
//			targets.put(TargetResource.Console.CHART_BUNDLE_2_7_2_JS, Resources.getInstance().getResource(JSResource.CHARTJS_BUNDLE));
//			targets.put(TargetResource.Console.CHART_PLUGIN_ANNOTATION_0_5_7_MIN_JS, Resources.getInstance().getResource(JSResource.CHARTJS_PLUGIN_ANNOTATION));
//			targets.put(TargetResource.Console.D3_4_13_0_MIN_JS, Resources.getInstance().getResource(JSResource.D3));
//			targets.put(TargetResource.Console.CONSOLE_JS, Resources.getInstance().getResource(JSResource.CONSOLE));
//			targets.put(TargetResource.Console.CONSOLE_CHART_JS, Resources.getInstance().getResource(JSResource.CONSOLE_CHART));
//			targets.put(TargetResource.Console.TEMPETURE_JS, Resources.getInstance().getResource(JSResource.TEMPERATURE));
//			targets.put(TargetResource.Console.CONSOLE_MAP_JS, Resources.getInstance().getResource(JSResource.CONSOLE_MAP));
//			
//			targets.put(TargetResource.Console.CONSOLE_CSS, Resources.getInstance().getResource(CSSResource.CONSOLE));
			targets.put(TargetResource.ApiDocumentation.BOOTSTRAP_MIN_CSS, Resources.getInstance().getResource(CssResource.BOOTSTRAP_MIN));
			targets.put(TargetResource.ApiDocumentation.MDB_MIN_CSS, Resources.getInstance().getResource(CssResource.MDB_MIN));
			
			for(Map.Entry<String, String> res : targets.entrySet()) 
				resource = resource.replace(res.getKey(), res.getValue());	
			
		} catch (ResourceException e) {
			throw new HandlerException(e);
		}
		return resource;
	}

}
