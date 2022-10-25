package com.docklee.ui.resource.component;

import com.docklee.model.pojo.APIDefinition;
import com.docklee.model.pojo.security.SecurityRequirement;

public class SecurityRequirementComponent extends Component{

    public SecurityRequirementComponent(final APIDefinition apiDefinition) {
        super(apiDefinition);
    }

    /**
     * @return
     */
    @Override
    public String create() {
            getComponent().append("<div role='tabpanel' class='tab-pane fade' id='security'>");
            getComponent().append("     <div class='col-md-12' style='margin-top: 2px; padding-left: 0px; padding-right: 0px; height: 240px; overflow-y: scroll; margin-bottom: 5px;'>");
            getComponent().append("         <table class='table table-sm'>");
            getComponent().append("             <thead style='background-color: #09c; color: white;'>");
            getComponent().append("                 <tr>");
            getComponent().append("                     <th scope='col'><b>#</b></th>");
            getComponent().append("                     <th scope='col'><b>Name</b></th>");
            getComponent().append("                     <th scope='col'><b>Scopes</b></th>");
            getComponent().append("                 </tr>");
            getComponent().append("             </thead>");
            getComponent().append("             <tbody>");
        int i=1;
        for(SecurityRequirement requirement : getApiDefinition ().getSecurity()) {
            getComponent().append("                 <tr>");
            getComponent().append("                     <td scope='row' style='vertical-align: middle; padding-top: 0.4rem !important; padding-bottom: 0.4rem !important;'>"+i+++"</td>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0.4rem !important; padding-bottom: 0.4rem !important;'>"+requirement.getName()+"</td>");

            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0.4rem !important; padding-bottom: 0.4rem !important;'>"+scopesGenerate(requirement.getScopes())+"</td>");
            getComponent().append("                 </tr>");
        }
            getComponent().append("             </tbody>");
            getComponent().append("         </table>");
            getComponent().append("     </div>");
            getComponent().append("</div>");
        return getComponent().toString();
    }

    private String scopesGenerate(String[] scopes){
        String badges = "";
        for(String badge : scopes)
            badges += "<span style='margin-left: 5px;' class='badge badge-secondary'>"+badge+"</span>";
        return badges;
    }
}
