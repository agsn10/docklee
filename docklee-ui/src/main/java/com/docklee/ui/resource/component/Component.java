package com.docklee.ui.resource.component;

import com.docklee.model.pojo.APIDefinition;

public abstract class Component {

    private APIDefinition apiDefinition;

    public Component(final APIDefinition apiDefinition) {
        this.apiDefinition = apiDefinition;
    }

    public abstract String create();

    public APIDefinition getApiDefinition() {
        return apiDefinition;
    }
}
