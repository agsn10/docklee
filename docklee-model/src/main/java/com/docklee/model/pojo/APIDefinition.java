package com.docklee.model.pojo;

import java.io.Serializable;

import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.extensions.Tag;
import com.docklee.model.pojo.operations.Server;
import com.docklee.model.pojo.security.SecurityRequirement;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>APIDefinition</code> ...
 * </p>
 *
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-03-2022
 */
public class APIDefinition implements Serializable {

    private Extension[] extensions;
    private ExternalDocumentation externalDocs;
    private Info info;
    private SecurityRequirement[] security;
    private Server[] servers;
    private Tag[] tags;

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

    public Info getInfo() {
        return info;
    }
    public void setInfo(final Info info) {
        this.info = info;
    }

    public SecurityRequirement[] getSecurity() {
        return security;
    }
    public void setSecurity(final SecurityRequirement[] security) {
        this.security = security;
    }

    public Server[] getServers() {
        return servers;
    }
    public void setServers(final Server[] servers) {
        this.servers = servers;
    }

    public Tag[] getTags() {
        return tags;
    }
    public void setTags(final Tag[] tags) {
        this.tags = tags;
    }
}
