package com.docklee.model.mapper;

import com.docklee.model.exception.MappingException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * 	This interface is used to implement a Docklee mapper.
 * </p>
 * 
 * @param I
 * @param O
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public interface Mapper<I, O> {

	/**
	 * 
	 * @param input
	 * @return 
	 * @exception MappingException
	 * */
	public O map(I input) throws MappingException;
}
