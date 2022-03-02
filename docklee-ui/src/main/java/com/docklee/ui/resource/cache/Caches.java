package com.docklee.ui.resource.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * 	The class <b>Caches</b> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
public final class Caches {

	/**
	 * Constructor
	 */
	private Caches() {	}

    /**
     * 
     * */
	public static final LoadingCache<String, String> CACHE_RESOURCE = CacheBuilder.newBuilder().build(new ResourceCacheLoader());
}
