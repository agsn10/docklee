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
 * The class <code>LoginHandler</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 27-02-2022
 */
public class LoginHandler implements ResourceHandler {

	
	private ServletContext servletContext; 
	
	/**
	 * Constructor
	 * 
	 * @param servletContext
	 */
	public LoginHandler(ServletContext servletContext) {
		super();
		this.servletContext = servletContext;
	}

	/**
	 * 
	 * @param resource
	 * @exception HandlerException
	 * */
	@Override
	public String handle(String resource, Map<String, String> infoMap) throws HandlerException {
		HashMap<String, String> targets = new HashMap<>();
		// ContextManager contextManager = ContextManager.getInstance().loadContext(this.servletContext);
		String baseUrl =  ""; //contextManager.getContext(ContextInfo.Ctx.GLOBAL_DATA).get(ContextInfo.GlobalData.BASE_URL).toString();
		String port = ""; //contextManager.getContext(ContextInfo.Ctx.SERVER_INFO).get(ContextInfo.ServerInfo.LOCAL_PORT).toString();

		try {
			targets.put(TargetResource.Login.BOOTSTRAP_MIN_JS, Resources.getInstance().getResource(JsResource.BOOTSTRAP_MIN));
			targets.put(TargetResource.Login.JQUERY_3_3_1_MIN_JS, Resources.getInstance().getResource(JsResource.JQUERY_3_3_1_MIN));
			targets.put(TargetResource.Login.LOGIN_JS, Resources.getInstance().getResource(JsResource.LOGIN).replace(TargetResource.BASE_URL, baseUrl.replace(TargetResource.PORT, port)));
			targets.put(TargetResource.Login.MDB_MIN_JS, Resources.getInstance().getResource(JsResource.MDB_MIN));
			targets.put(TargetResource.Login.POPPER_MIN_JS, Resources.getInstance().getResource(JsResource.POPPER_MIN));
			targets.put(TargetResource.Login.LOGIN_CSS, Resources.getInstance().getResource(CssResource.LOGIN));
			targets.put(TargetResource.Login.BOOTSTRAP_MIN_CSS, Resources.getInstance().getResource(CssResource.BOOTSTRAP_MIN));
			targets.put(TargetResource.Login.MDB_MIN_CSS, Resources.getInstance().getResource(CssResource.MDB_MIN));
			for(Map.Entry<String, String> res : targets.entrySet()) 
				resource = resource.replace(res.getKey(), res.getValue());	
			
		} catch (ResourceException e) {
			throw new HandlerException(e);
		}
		return resource;
	}

}
