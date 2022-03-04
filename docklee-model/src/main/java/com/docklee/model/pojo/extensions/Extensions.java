package com.docklee.model.pojo.extensions;

import java.io.Serializable;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Extensions</code> container for repeatable Extension.
 * </p>
 *
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-03-2022
 */
public class Extensions implements Serializable {

    private Extension[] value;

    public Extension[] getValue() {
        return value;
    }
    public void setValue(final Extension[] value) {
        this.value = value;
    }
}
