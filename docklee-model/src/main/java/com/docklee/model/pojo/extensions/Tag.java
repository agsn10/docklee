package com.docklee.model.pojo.extensions;

import java.io.Serializable;

import com.docklee.model.pojo.ExternalDocumentation;

public class Tag implements Serializable {

    private String name;
    private String description;
    private Extension[] extensions;
    private ExternalDocumentation externalDocs;

    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(final String description) {
        this.description = description;
    }

    public Extension[] getExtensions() {
        return extensions;
    }
    public void setExtensions(final Extension[] extensions) {
        this.extensions = extensions;
    }

    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }
    public void setExternalDocs(final ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }
}
