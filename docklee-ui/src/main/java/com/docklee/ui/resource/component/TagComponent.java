package com.docklee.ui.resource.component;

import com.docklee.model.pojo.APIDefinition;
import com.docklee.model.pojo.extensions.Tag;

public class TagComponent extends Component{

    public TagComponent(final APIDefinition apiDefinition) {
        super(apiDefinition);
    }

    /**
     * @return
     */
    @Override
    public String create() {
        getComponent().append("<div role='tabpanel' class='tab-pane fade' id='tag'>");
        getComponent().append("     <div class='col-md-12' style='margin-top: 2px; padding-left: 0px; padding-right: 0px; height: 240px; overflow-y: scroll; margin-bottom: 5px;'>");
        getComponent().append("         <table class='table table-sm'>");
        getComponent().append("             <thead style='background-color: #09c; color: white;'>");
        getComponent().append("                 <tr>");
        getComponent().append("                     <th scope='col'><b>#</b></th>");
        getComponent().append("                     <th scope='col'><b>name</b></th>");
        getComponent().append("                     <th scope='col'><b>Description</b></th>");
        getComponent().append("                     <th scope='col' style='text-align: center; width: 210px'><b>Extensions</b></th>");
        getComponent().append("                     <th scope='col' style='text-align: center; width: 210px'><b>External Docs</b></th>");
        getComponent().append("                 </tr>");
        getComponent().append("             </thead>");
        getComponent().append("             <tbody>");
        int i=1;
        for(Tag tag : getApiDefinition().getTags()) {
            getComponent().append("                 <tr>");
            getComponent().append("                     <td scope='row' style='vertical-align: middle; padding-top: 0rem !important; padding-bottom: 0rem !important;'>"+i+++"</td>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0rem !important; padding-bottom: 0rem !important;'>"+tag.getName()+"</td>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0rem !important; padding-bottom: 0rem !important;'>"+tag.getDescription()+"</td>");
            getComponent().append("                     <td style='text-align: center; width: 210px; padding-top: 0rem !important; padding-bottom: 0rem !important;'>");
            getComponent().append("                         <button type='button' class='btn btn-sm btn-info waves-effect waves-light' onclick=\"show('multiCollapseExample4');\"><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</button>");
            getComponent().append("                     </td>");
            getComponent().append("                     <td style='text-align: center; width: 210px; padding-top: 0rem !important; padding-bottom: 0rem !important;'>");
            getComponent().append("                         <button type='button' class='btn btn-sm btn-info waves-effect waves-light' onclick=\"show('multiCollapseExample4');\"><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</button>");
            getComponent().append("                     </td>");
            getComponent().append("                 </tr>");
        }
        getComponent().append("             </tbody>");
        getComponent().append("         </table>");
        getComponent().append("     </div>");
        getComponent().append("</div>");
        return getComponent().toString();
    }
}
