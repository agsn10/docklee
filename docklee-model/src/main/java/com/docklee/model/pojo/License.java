package com.docklee.model.pojo;

import java.io.Serializable;

import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>License</code> may be used in Info.license() to define a license.
 * </p>
 *
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-03-2022
 */
public class License implements Serializable {

    private Extension[] extensions;
    private String name;
    private String url;

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

        private License anLicense = new License();

        private Builder(){

        }

        static public Builder create() {
            return new Builder();
        }

        public Builder withExtensions(Extension[] extensions) {
            anLicense.setExtensions(extensions);
            return this;
        }

        public Builder withName(String name) {
            anLicense.setName(name);
            return this;
        }

        public Builder withUrl(String url) {
            anLicense.setUrl(url);
            return this;
        }

        public License build() {
            return anLicense;
        }

    }
}
