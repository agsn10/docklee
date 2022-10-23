package com.docklee.ui.resource.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import com.docklee.model.pojo.APIDefinition;
import com.docklee.ui.resource.CssResource;
import com.docklee.ui.resource.JsResource;
import com.docklee.ui.resource.Resources;
import com.docklee.ui.resource.TargetResource;
import com.docklee.ui.resource.component.ExtensionComponent;
import com.docklee.ui.resource.component.ExternalDocumentationComponent;
import com.docklee.ui.resource.component.InfoComponent;
import com.docklee.ui.resource.component.SecurityRequirementComponent;
import com.docklee.ui.resource.component.ServersComponent;
import com.docklee.ui.resource.component.TagComponent;
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

		try {

			HashMap<String, HashMap<String, Object>> context = (HashMap<String, HashMap<String, Object>> ) this.servletContext.getAttribute(ConstantsResources.DOCKLEE_CONTEXT);
			APIDefinition apiDefinition = (APIDefinition) context.get(ConstantsResources.CTX_GLOBAL_DATA).get(ConstantsResources.API_DEFINITION);
			HashMap<String, String> targets = new HashMap<String, String> (){{

				put(TargetResource.ApiDocumentation.JQUERY_3_3_1_MIN_JS, Resources.getInstance().getResource(JsResource.JQUERY_3_3_1_MIN));
				put(TargetResource.ApiDocumentation.POPPER_MIN_JS, Resources.getInstance().getResource(JsResource.POPPER_MIN));
				put(TargetResource.ApiDocumentation.BOOTSTRAP_MIN_JS, Resources.getInstance().getResource(JsResource.BOOTSTRAP_MIN));
				put(TargetResource.ApiDocumentation.MDB_MIN_JS, Resources.getInstance().getResource(JsResource.MDB_MIN));
				put(TargetResource.ApiDocumentation.BOOTSTRAP_MIN_CSS, Resources.getInstance().getResource(CssResource.BOOTSTRAP_MIN));
				put(TargetResource.ApiDocumentation.MDB_MIN_CSS, Resources.getInstance().getResource(CssResource.MDB_MIN));

				put(TargetResource.ApiDocumentation.API_INFO, new InfoComponent(apiDefinition).create());
				put(TargetResource.ApiDocumentation.API_SERVERS, new ServersComponent(apiDefinition).create());
				put(TargetResource.ApiDocumentation.API_SECURITY_REQUIREMENT, new SecurityRequirementComponent(apiDefinition).create());
				put(TargetResource.ApiDocumentation.API_EXTERNAL_DOCUMENTATION, new ExternalDocumentationComponent(apiDefinition).create());
				put(TargetResource.ApiDocumentation.API_EXTENSION, new ExtensionComponent(apiDefinition).create());
				put(TargetResource.ApiDocumentation.API_TAG, new TagComponent(apiDefinition).create());
			/*
				put(TargetResource.ApiDocumentation.INFO_TITLE, apiDefinition.getInfo().getTitle());
				put(TargetResource.ApiDocumentation.INFO_DESCRIPTION, apiDefinition.getInfo().getDescription());
				put(TargetResource.ApiDocumentation.INFO_VERSION, apiDefinition.getInfo().getVersion());

				put(TargetResource.ApiDocumentation.INFO_CONTACT_EMAIL, apiDefinition.getInfo().getContact().getEmail());
				put(TargetResource.ApiDocumentation.INFO_CONTACT_NAME, apiDefinition.getInfo().getContact().getName());
				put(TargetResource.ApiDocumentation.INFO_CONTACT_URL, apiDefinition.getInfo().getContact().getUrl());

				put(TargetResource.ApiDocumentation.INFO_LICENSE_NAME, apiDefinition.getInfo().getLicense().getName());
				put(TargetResource.ApiDocumentation.INFO_LICENSE_URL, apiDefinition.getInfo().getLicense().getUrl());
				put(TargetResource.ApiDocumentation.INFO_LICENSE_TERMS, apiDefinition.getInfo().getContact().getUrl());
			*/
			}};

			for(Map.Entry<String, String> res : targets.entrySet()) 
				resource = resource.replace(res.getKey(), res.getValue());	
			
		} catch (ResourceException e) {
			throw new HandlerException(e);
		}
		return resource;
	}

}