package com.docklee.ui.resource.component;

import com.docklee.model.pojo.APIDefinition;

public class ExternalDocumentationComponent extends Component{

    public ExternalDocumentationComponent(final APIDefinition apiDefinition) {
        super(apiDefinition);
    }

    /**
     * @return
     */
    @Override
    public String create() {
        getComponent().append("<div role='tabpanel' class='tab-pane fade' id='externalDocumentation'>");
        getComponent().append("     <div class='col-md-12' style='margin-top: 2px; padding-left: 0px; padding-right: 0px; height: 240px; overflow-y: scroll; margin-bottom: 5px;'>");
        getComponent().append("         <table class='table table-sm'>");
        getComponent().append("             <thead style='background-color: #09c; color: white;'>");
        getComponent().append("                 <tr>");
        getComponent().append("                     <th scope='col'><b>Description</b></th>");
        getComponent().append("                     <th scope='col'><b>URL</b></th>");
        getComponent().append("                 </tr>");
        getComponent().append("             </thead>");
        getComponent().append("             <tbody>");
        getComponent().append("                 <tr>");
        getComponent().append("                     <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>"+getApiDefinition().getExternalDocs().getDescription()+"</td>");
        getComponent().append("                     <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'><a style='color:#007bff'>"+getApiDefinition().getExternalDocs().getUrl()+"</a></td>");
        getComponent().append("                 </tr>");
        getComponent().append("                 <tr>");
        getComponent().append("                     <td colspan='2'>");
        getComponent().append("                         <div>");
        getComponent().append("                             <label style='font-size: 22px;'>Extensions</label>");
        getComponent().append("                             <table class='table table-sm'>");
        getComponent().append("                                 <thead>");
        getComponent().append("                                     <tr>");
        getComponent().append("                                         <th scope='col'><strong>#</strong></th>");
        getComponent().append("                                         <th scope='col'><strong>Name</strong></th>");
        getComponent().append("                                         <th scope='col'><strong>Ext. Prop. Name</strong></th>");
        getComponent().append("                                         <th scope='col'><strong>Ext. Prop. Value</strong></th>");
        getComponent().append("                                     </tr>");
        getComponent().append("                                 </thead>");
        getComponent().append("                                 <tbody>");
        getComponent().append("                                     <tr>");
        getComponent().append("                                         <th scope='row'>1</th>");
        getComponent().append("                                         <td>Mark</td>");
        getComponent().append("                                         <td>Otto</td>");
        getComponent().append("                                         <td>@mdo</td>");
        getComponent().append("                                     </tr>");
        getComponent().append("                                 </tbody>");
        getComponent().append("                             </table>");
        getComponent().append("                         </div>");
        getComponent().append("                     </td>");
        getComponent().append("                 </tr>");
        getComponent().append("             </tbody>");
        getComponent().append("         </table>");
        getComponent().append("     </div>");
        getComponent().append("</div>");
        return getComponent().toString();
    }
}
