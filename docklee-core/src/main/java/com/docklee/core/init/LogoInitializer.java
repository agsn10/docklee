package com.docklee.core.init;

import java.awt.*;

import com.docklee.core.ContextInfo;
import com.docklee.core.ContextManager;
import com.docklee.core.exception.InitializerException;
import com.docklee.core.util.AsciiArt;

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
public class LogoInitializer implements ContextInitializer.Initializer{

	private ContextManager contextManager;
	
	public LogoInitializer(ContextManager contextManager) {
		super();
		this.contextManager = contextManager;
	}

	@Override
	public void perform() throws InitializerException {
		try {
			AsciiArt asciiArt = new AsciiArt();
	        AsciiArt.Settings settings = asciiArt.new Settings(new Font("SansSerif", Font.BOLD, 12), ContextInfo.DOCKLEE_NAME_LOGO.length() * 15, 15); // 15 pixel width per character
	        System.out.println(asciiArt.drawString(ContextInfo.DOCKLEE_NAME_LOGO, "*", settings));
	        System.out.println("					                        API DOCUMENTATION");
	        System.out.println("\n	   Listening on: "+contextManager.getContext(ContextInfo.Ctx.GLOBAL_DATA).get(ContextInfo.GlobalData.BASE_URL).toString());
	        System.out.println();
		}catch (Exception e) {
			System.out.println(e);
			throw new InitializerException(e);
		}
        
	}

}
