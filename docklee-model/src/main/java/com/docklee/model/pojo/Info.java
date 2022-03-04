package com.docklee.model.pojo;

import java.io.Serializable;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Info</code> may be used in APIDefinition.info() to populate the Info section of the API document.
 * </p>
 *
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-03-2022
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#infoObject">Info (OpenAPI specification)</a>
 */
public class Info implements Serializable {

    private String title;
    private String version;
    private String description;
    private String termsOfService;
    private License license;
    private Contact contact;

    public String getTitle() {
        return title;
    }
    public void setTitle(final String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(final String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(final String description) {
        this.description = description;
    }

    public String getTermsOfService() {
        return termsOfService;
    }
    public void setTermsOfService(final String termsOfService) {
        this.termsOfService = termsOfService;
    }

    public License getLicense() {
        return license;
    }
    public void setLicense(final License license) {
        this.license = license;
    }

    public Contact getContact() {
        return contact;
    }
    public void setContact(final Contact contact) {
        this.contact = contact;
    }
}
