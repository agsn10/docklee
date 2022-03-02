package com.docklee.ui.resource;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import com.docklee.ui.resource.cache.Caches;
import com.docklee.ui.resource.exception.ResourceException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * 	The class <b>Resources</b> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 27-02-2022
 */
public final class Resources extends HashMap<String, String> implements Serializable, Resource{

	private static final long serialVersionUID = -4948629426339059949L;

	private Resources() {}

    private static class LazyHolder {
        static final Resources INSTANCE = new Resources();
    }

    public static Resources getInstance() {
        return LazyHolder.INSTANCE;
    }
	
    /**
     * 
     * @param reference
     * @return String 
     * @exception ResourceException
     * */
	@Override
	public String getResource(ResourceType reference) throws ResourceException {
		 try {			 
			 String folder = null;
			 if(reference instanceof HtmlResource)
				 folder = "html"+File.separator;			 
			 if(reference instanceof CssResource)
				 folder = "css"+File.separator;			  
			 if(reference instanceof JsResource)
				 folder = "js"+File.separator;
			 
			 return Caches.CACHE_RESOURCE.get(folder.concat(reference.getResource()));
			 
		} catch (ExecutionException e) {
			throw new ResourceException(e);
		}
	}

}
