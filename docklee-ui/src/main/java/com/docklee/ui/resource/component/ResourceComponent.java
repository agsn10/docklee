package com.docklee.ui.resource.component;

import com.docklee.model.pojo.APIDefinition;
import com.docklee.model.pojo.extensions.Extension;

public class ResourceComponent extends Component{

    public ResourceComponent(final APIDefinition apiDefinition) {
        super(apiDefinition);
    }

    /**
     * @return
     */
    @Override
    public String create() {
            getComponent().append("<div class='col-lg-3 col-md-6'>");
            getComponent().append("     <div class='card box'>");
            getComponent().append("         <div class='card-body'>");
            getComponent().append("             <h3 class='card-title'>Customer Resource</h3>");
            getComponent().append("             <p></p> <p></p> <span style='margin-left: 5px;' class='badge badge-secondary'>juice</span> <span style='margin-left: 5px;' class='badge badge-secondary'>fruit</span> <span style='margin-left: 5px;' class='badge badge-secondary'>natural</span> <span style='margin-left: 5px;' class='badge badge-secondary'>health</span> <p></p>");
            getComponent().append("             <p class='card-text'>With supporting text below as a natural lead-in to additional content.</p>");
            getComponent().append("             <a href='#' class='btn waves-effect waves-light' style='background-color: #4D7A97 !important;'><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</a>");
            getComponent().append("         </div>");
            getComponent().append("     </div>");
            getComponent().append("</div>");
        return getComponent().toString();
    }
}
