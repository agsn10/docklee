package com.docklee.ui.resource;

public enum JsResource implements Resource.ResourceType{
	
	LOGIN("login","login.js"),
	
	MDB_MIN("mdb","mdb.min.js"),
	BOOTSTRAP_MIN("bootstrap.min","bootstrap.min.js"),
	JQUERY_3_3_1_MIN("jquery-3.3.1.min","jquery-3.3.1.min.js"),
	POPPER_MIN("popper.min","popper.min.js");

	private String reference;
	private String resource;
	
	JsResource(String reference, String resource) {
		this.reference = reference;
		this.resource = resource;
	}
	
	@Override
	public String getReference() {
		return reference;
	}

	@Override
	public String getResource() {
		return resource;
	}

}
