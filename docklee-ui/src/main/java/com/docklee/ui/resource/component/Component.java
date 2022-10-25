package com.docklee.ui.resource.component;

import java.util.ArrayList;
import java.util.List;

import com.docklee.model.pojo.APIDefinition;

public abstract class Component {

    private List<String> modals = new ArrayList<>(0);
    private StringBuilder component = new StringBuilder();
    private APIDefinition apiDefinition;

    public Component(final APIDefinition apiDefinition) {
        this.apiDefinition = apiDefinition;
    }

    public abstract String create();

    protected APIDefinition getApiDefinition() {
        return apiDefinition;
    }

    public StringBuilder getComponent() {
        return component;
    }
    public List<String> getModals() {
        return modals;
    }
}
