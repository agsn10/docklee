package com.docklee.model.pojo;

import java.io.Serializable;

import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Contact</code> may be used in Info.contact() to define a contact.
 * </p>
 *
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-03-2022
 */
public class Contact implements Serializable {

    private String email;
    private Extension[] extensions;
    private String name;
    private String url;

    public String getEmail() {
        return email;
    }
    public void setEmail(final String email) {
        this.email = email;
    }

    public Extension[] getExtensions() {
        return extensions;
    }
    public void setExtensions(final Extension[] extensions) {
        this.extensions = extensions;
    }

    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(final String url) {
        this.url = url;
    }

    static public class Builder {

        private Contact anContact = new Contact();

        private Builder() {

        }

        static public Builder create() {
            return new Builder();
        }

        public Builder withEmail(String email) {
            anContact.setEmail(email);
            return this;
        }

        public Builder withName(String name) {
            anContact.setName(name);
            return this;
        }

        public Builder withUrl(String url) {
            anContact.setUrl(url);
            return this;
        }

        public Contact build() {
            return anContact;
        }
    }
}


