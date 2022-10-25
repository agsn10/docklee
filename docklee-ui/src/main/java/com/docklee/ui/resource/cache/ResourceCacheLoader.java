package com.docklee.ui.resource.cache;

import java.io.IOException;
import java.net.URISyntaxException;

import com.docklee.ui.resource.ResourceResolver;
import com.google.common.cache.CacheLoader;

public final class ResourceCacheLoader extends CacheLoader<String, String>{

	@Override
	public String load(String css) throws Exception {
		String resource = "";
		try {
			resource = ResourceResolver.getResource(css);
		} catch (IOException | URISyntaxException e) {
			System.out.println("Error loading resource css: "+css);
			System.err.println(e);
		}
		return resource;
	}

}
