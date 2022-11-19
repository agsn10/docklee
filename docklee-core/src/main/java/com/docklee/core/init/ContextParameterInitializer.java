package com.docklee.core.init;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.boot.autoconfigure.web.ServerProperties;

import com.docklee.core.ContextInfo;
import com.docklee.core.ContextManager;
import com.docklee.core.DockleeManager;
import com.docklee.core.exception.InitializerException;
import com.docklee.core.util.InetAddress;
import com.google.common.collect.Iterables;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>LogoInitializer</code> ....
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 21-11-2020 
 */
public class ContextParameterInitializer implements ContextInitializer.Initializer{

	private ContextManager contextManager;
	private ServletContext servletContext;
	private final String PROTOCOL_HTTP = "http://";
	private final String PROTOCOL_HTTPS = "https://";
	
	public ContextParameterInitializer(ContextManager contextManager, ServletContext servletContext) {
		super();
		this.contextManager = contextManager;
		this.servletContext = servletContext;
	}

	@Override
	public void perform() throws InitializerException {

		if (!servletContext.getServletRegistrations().isEmpty()) {
			final Map<String, ? extends ServletRegistration> map = servletContext.getServletRegistrations();
			Optional<String> optional = map.entrySet().stream()
				.filter(sr -> sr.getValue().getClassName().equals(DockleeManager.class.getName()))
				.map(Map.Entry::getKey)
				.findFirst();
			if (optional.isPresent()) {
				try {
					String scheme = !servletContext.getSessionCookieConfig().isSecure() ? PROTOCOL_HTTP : PROTOCOL_HTTPS;
					String host = InetAddress.getLocalHostLANAddress().toString().replace("/", "");
					String contextPath = servletContext.getContextPath();
					String resourcePath = Iterables.get(servletContext.getServletRegistrations().get(optional.get()).getMappings(),0).replace("/*", "");
					ServerProperties serverProperties;
					String baseUrl = String.format(scheme.concat("%s:%s%s%s"), host, "{port}", contextPath, resourcePath);
					contextManager.getContext(ContextInfo.Ctx.GLOBAL_DATA).put(ContextInfo.GlobalData.BASE_URL, baseUrl);
					contextManager.saveContext(servletContext, contextManager);
				} catch (IOException e) {
					throw new InitializerException(e);
				}
			}
		}
	}
}
