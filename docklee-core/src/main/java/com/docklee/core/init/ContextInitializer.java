package com.docklee.core.init;

import java.util.ArrayList;
import java.util.Objects;

import com.docklee.core.exception.InitializerException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ContextInitializer</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 21-11-2020 
 */
public final class ContextInitializer extends ArrayList<ContextInitializer.Initializer>{
	
	
	private ContextInitializer() {}
	
	/**
	 * <p>
	 * The method <code>aNewInstance</code> creates an object facility.
	 * </p>
	 * 
	 * @return ContextInitializer
	 */
	public static ContextInitializer newInstance() {
		return new ContextInitializer();
	}
	
	
	/**
	 * <p>
	 * The method <code>addInitializer</code> adds an initializer to run in the same order as it was added..
	 * </p>
	 * 
	 * @param initializer An implementation of the initializer.
	 */
	public ContextInitializer addInitializer(Initializer initializer) {
		this.add(initializer);
		return this;
	}
	
	
	/**
	 * <p>
	 * The method <code>init</code> .
	 * </p>
	 * 
	 * @throws InitializerException 
	 */
	public void init() throws InitializerException {
		for(Initializer initializer : this) 
			if(Objects.nonNull(initializer)) 			
				initializer.perform();		
	}
	
	/**
	 * <p><b>Docklee</b> - Api Documentation</p>
	 * <p>
	 * The interface <code>Initializer</code> ....
	 * </p>
	 * 
	 * @author Antonio Neto [<()>] - Initial implementation.
	 * @version 1.0.0
	 * @since 21-11-2020 
	 */
	public interface Initializer{
		/**
		 * <p>
		 * The method <code>perform</code> performs the desired boot operation.
		 * </p>
		 *
		 * @throws InitializerException
		 */
		public void perform() throws InitializerException;
		
	}
}
