package com.docklee.ui.resource.component;

import com.docklee.model.pojo.APIDefinition;

public class ResourceOperationsComponent extends Component{

    public ResourceOperationsComponent(final APIDefinition apiDefinition) {
        super(apiDefinition);
    }

    /**
     * @return
     */
    @Override
    public String create() {
            getComponent().append("<div class='card' style='margin-bottom: 7px; background-color: #EEEEEF; -webkit-box-shadow: 0 0px 0px 0 rgb(0 0 0 / 0%), 0 0px 0px 0 rgb(0 0 0 / 0%); box-shadow: 0 0px 0px 0 rgb(0 0 0 / 0%), 0 0px 0px 0 rgb(0 0 0 / 0%); '>");
            getComponent().append("     <div class='card-body' style='padding: 0.4rem;'>");
            getComponent().append("         <div class='row' style='margin-right: 0px; margin-left: 0px;'>");
            getComponent().append("             <h6 style='margin-top: 4px;'><span class='badge btn-success'>GET</span></h6>");
            getComponent().append("             <label style='margin-top: 5px; margin-left: 10px;'>/orders/{UUUID}</label>");
            getComponent().append("             <label style='margin-top: 5px; margin-left: 10px'><b>Get Order</b></label>");
            getComponent().append("         </div>");
            getComponent().append("     </div>");
            getComponent().append("</div>");
        return getComponent().toString();
    }
}
