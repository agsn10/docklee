package com.docklee.ui.resource.component;

import com.docklee.model.pojo.APIDefinition;

public class InfoComponent extends Component{

    public InfoComponent(final APIDefinition apiDefinition) {
        super(apiDefinition);
    }

    /**
     * @return
     */
    @Override
    public String create() {
        getComponent().append("<div role='tabpanel' class='tab-pane fade in active show' id='info'>");
        getComponent().append("    <form>");
        getComponent().append("        <div class='form-row'>");
        getComponent().append("            <div class='form-group col-md-4'>");
        getComponent().append("                <label class='font-weight-bold'>Title</label>");
        getComponent().append("                <div style='width: 100%'><label>"+getApiDefinition().getInfo().getTitle()+"</label></div>");
        getComponent().append("            </div>");
        getComponent().append("            <div class='form-group col-md-6'>");
        getComponent().append("                <label class='font-weight-bold'>Description</label>");
        getComponent().append("                <div style='width: 100%'><label>"+getApiDefinition().getInfo().getDescription()+"</label></div>");
        getComponent().append("            </div>");
        getComponent().append("            <div class='form-group col-md-1'>");
        getComponent().append("                <label class='font-weight-bold'>Version</label>");
        getComponent().append("                <div style='width: 100%'><h4><span class='badge' style='background-color:#4D7A97'>1.0.0</span></h4></div>");
        getComponent().append("            </div>");
        getComponent().append("            <div class='form-group col-md-1'>");
        getComponent().append("                <label class='font-weight-bold' style='margin-left: 10px'>OAS</label>");
        getComponent().append("                <div style='width: 100%'><h4><span class='badge' style='background-color: #F8981D'>3.0.1</span></h4></div>");
        getComponent().append("            </div>");
        getComponent().append("        </div>");
        getComponent().append("        <div class='form-row'>");
        getComponent().append("            <div class='form-group col-md-4'>");
        getComponent().append("                <label class='font-weight-bold'>Contact Email</label>");
        getComponent().append("                <div style='width: 100%'><label>"+getApiDefinition().getInfo().getContact().getEmail()+"</label></div>");
        getComponent().append("            </div>");
        getComponent().append("            <div class='form-group col-md-4'>");
        getComponent().append("                <label class='font-weight-bold'>Contact Name</label>");
        getComponent().append("                <div style='width: 100%'><label>"+getApiDefinition().getInfo().getContact().getName()+"</label></div>");
        getComponent().append("            </div>");
        getComponent().append("            <div class='form-group col-md-4'>");
        getComponent().append("                <label class='font-weight-bold'>Contact URL</label>");
        getComponent().append("                <div style='width: 100%'><a style='color:#007bff'>"+getApiDefinition().getInfo().getContact().getUrl()+"</a></div>");
        getComponent().append("            </div>");
        getComponent().append("        </div>");
        getComponent().append("        <div class='form-row'>");
        getComponent().append("            <div class='form-group col-md-4'>");
        getComponent().append("                <label class='font-weight-bold'>License Name</label>");
        getComponent().append("                <div style='width: 100%'><label>"+getApiDefinition().getInfo().getLicense().getName()+"</label></div>");
        getComponent().append("            </div>");
        getComponent().append("            <div class='form-group col-md-4'>");
        getComponent().append("                <label class='font-weight-bold'>License URL</label>");
        getComponent().append("                <div style='width: 100%'><a style='color:#007bff'>"+getApiDefinition().getInfo().getLicense().getUrl()+"</a></div>");
        getComponent().append("            </div>");
        getComponent().append("            <div class='form-group col-md-4'>");
        getComponent().append("                <label class='font-weight-bold'>Terms Of Service</label>");
        getComponent().append("                <div style='width: 100%'><a style='color:#007bff'>"+getApiDefinition().getInfo().getTermsOfService()+"</a></div>");
        getComponent().append("            </div>");
        getComponent().append("        </div>");
        getComponent().append("    </form>");
        getComponent().append("</div>");
        return getComponent().toString();
    }
}
