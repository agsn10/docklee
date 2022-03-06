package com.docklee.core;

import java.util.HashSet;
import java.util.Set;

import com.docklee.core.exception.LoadResourceException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ResourceResolver</code> ....
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 22-11-2020 
 */
public final class ResourceResolver {

	/**
	 * Constructor
	 * */
	private ResourceResolver() { }

	private static class LazyHolder {
		static final ResourceResolver INSTANCE = new ResourceResolver();
	}

	/**
	 * 
	 * */
	public static ResourceResolver getInstance() {
		return LazyHolder.INSTANCE;
	}

	/**
	 * 
	 * @param resources
	 * @return Set<Class<?>>
	 * */
	public Set<Class<?>> loadResources(final String resources) throws LoadResourceException {
		Set<Class<?>> set = new HashSet<>();
		try {
			set.add(Class.forName(resources.trim()));
		} catch (ClassNotFoundException e) {
			throw new LoadResourceException(e);
		}
		return set;
	}
}
