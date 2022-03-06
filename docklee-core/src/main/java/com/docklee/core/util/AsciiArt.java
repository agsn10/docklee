package com.docklee.core.util;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import com.docklee.core.ContextInfo;
import com.docklee.core.ContextManager;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>AsciiArt</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 20-11-2020 
 */
public class AsciiArt {

	/**
	 * Constructor
	 * */
    public AsciiArt() {  }

    /**
     * 
     * 
     * @param text
     * @param artChar
     * @param settings
     * @return String
     * */
    public String drawString( String text, String artChar, Settings settings) {
        
    	BufferedImage image = getImageIntegerMode(settings.width, settings.height);
        Graphics2D graphics2D = getGraphics2D(image.getGraphics(), settings);
        graphics2D.drawString(text, 6, ((int) (settings.height * 0.67)));
        StringBuilder logo = new StringBuilder();
        for (int y = 0; y < settings.height; y++) {
        	
    	    StringBuilder stringBuilder = new StringBuilder();   	    
    	    for (int x = 0; x < settings.width; x++) 
    	        stringBuilder.append(image.getRGB(x, y) == -16777216 ? " " : artChar);    
    	    
    	    if (stringBuilder.toString().trim().isEmpty()) 
    	        continue;    	        	 
    	    logo.append("\n"+stringBuilder.toString());    	    
    	}  
        return logo.toString();
    }

    /**
     * 
     * 
     * @param width
     * @param height
     * @return BufferedImage
     * */
    private BufferedImage getImageIntegerMode(int width, int height) {
        return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    /**
     * 
     * 
     * @param graphics
     * @param settings
     * @return Graphics2D
     * */
    private Graphics2D getGraphics2D(final Graphics graphics, final Settings settings) {
        graphics.setFont(settings.font);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        return graphics2D;
    }

    
    /**
     * <p><b>Docklee</b> - Api Documentation</p>
     * <p>
     * The class <code>AsciiArt</code> ...
     * </p>
     * 
     * @author Antonio Neto [<()>] - Initial implementation.
     * @version 1.0.0
     * @since 20-11-2020 
     */
    public class Settings {
        public Font font;
        public int width;
        public int height;

        public Settings(Font font, int width, int height) {
            this.font = font;
            this.width = width;
            this.height = height;
        }
    }
}