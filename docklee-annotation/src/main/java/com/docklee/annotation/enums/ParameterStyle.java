package com.docklee.annotation.enums;

import java.io.Serializable;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 02-11-2020 
 */
public enum ParameterStyle implements Comparable<ParameterStyle>, Serializable {
	DEEPOBJECT, 
	DEFAULT, 
	FORM, 
	LABEL, 
	MATRIX, 
	PIPEDELIMITED, 
	SIMPLE, 
	SPACEDELIMITED
}
