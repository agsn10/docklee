package com.docklee.ui.resource;

public enum HtmlResource implements Resource.ResourceType{
	
	LOGIN("login","login.html"),
	API_DOCUMENTATION("api_documentation","api_documentation.html");

	private String reference;
	private String resource;
	
	HtmlResource(String reference, String resource) {
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
