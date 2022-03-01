package com.docklee.ui.resource;

public enum CssResource implements Resource.ResourceType{
		
	LOGIN("login","login.css"),

	MDB_MIN("mdb.min","mdb.min.css"),
	BOOTSTRAP_MIN("bootstrap.min","bootstrap.min.css");

	private String reference;
	private String resource;
	
	CssResource(String reference, String resource) {
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
