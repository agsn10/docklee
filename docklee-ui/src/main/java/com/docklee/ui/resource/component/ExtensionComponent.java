package com.docklee.ui.resource.component;

import com.docklee.model.pojo.APIDefinition;
import com.docklee.model.pojo.extensions.Extension;

public class ExtensionComponent extends Component{

    public ExtensionComponent(final APIDefinition apiDefinition) {
        super(apiDefinition);
    }

    /**
     * @return
     */
    @Override
    public String create() {
            getComponent().append("<div role='tabpanel' class='tab-pane fade' id='extension'>");
            getComponent().append("     <div class='col-md-12' style='margin-top: 2px; padding-left: 0px; padding-right: 0px; height: 240px; overflow-y: scroll; margin-bottom: 5px;'>");
            getComponent().append("         <table class='table table-sm'>");
            getComponent().append("             <thead style='background-color: #09c; color: white;'>");
            getComponent().append("                 <tr>");
            getComponent().append("                     <th scope='col'><b>#</b></th>");
            getComponent().append("                     <th scope='col'><b>Name</b></th>");
            getComponent().append("                     <th scope='col'><b>Ext. Prop. Name</b></th>");
            getComponent().append("                     <th scope='col'><b>Ext. Prop. Value</b></th>");
            getComponent().append("                 </tr>");
            getComponent().append("             </thead>");
            getComponent().append("             <tbody>");
            int i=0;
        for (Extension extension : getApiDefinition().getExtensions()) {
            getComponent().append("                 <tr>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + (i+1) + "</td>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + extension.getName() + "</td>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + extension.getProperties()[i].getName() + "</td>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + extension.getProperties()[i].getValue() + "</td>");
            getComponent().append("                 </tr>");
            i++;
        }
            getComponent().append("             </tbody>");
            getComponent().append("         </table>");
            getComponent().append("     </div>");
            getComponent().append("</div>");
        return getComponent().toString();
    }
}
