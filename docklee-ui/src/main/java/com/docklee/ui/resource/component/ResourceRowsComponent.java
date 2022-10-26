package com.docklee.ui.resource.component;

import java.util.ArrayList;
import java.util.List;

import com.docklee.model.pojo.APIDefinition;

public class ResourceRowsComponent extends Component{

    private List<List<ResourceComponent>> resourceComponentList = new ArrayList<>(0);

    public ResourceRowsComponent(final APIDefinition apiDefinition, final List<List<ResourceComponent>> resourceComponentList) {
        super(apiDefinition);
        this.resourceComponentList = resourceComponentList;
    }

    /**
     * @return
     */
    @Override
    public String create() {

        for(List<ResourceComponent> listComponent : resourceComponentList) {
                getComponent().append("<section class='p-3'>");
                getComponent().append("     <!-- Grid row -->");
                getComponent().append("     <div class='row'>");
            for(ResourceComponent component : listComponent) {
                getComponent().append("         <!-- Grid column -->");
                getComponent().append("             " + component.create());
                getComponent().append("         <!-- Grid column -->");
            }
                getComponent().append("     </div>");
                getComponent().append("     <!-- Grid row -->");
                getComponent().append("</section>");
        }
        return getComponent().toString();
    }
}
