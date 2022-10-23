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

        StringBuilder builder = new StringBuilder();
        builder.append("<div role='tabpanel' class='tab-pane fade in active show' id='info'>");
        builder.append("    <form>");
        builder.append("        <div class='form-row'>");
        builder.append("            <div class='form-group col-md-4'>");
        builder.append("                <label class='font-weight-bold'>Title</label>");
        builder.append("                <div style='width: 100%'><label>API JSONService</label></div>");
        builder.append("            </div>");
        builder.append("            <div class='form-group col-md-6'>");
        builder.append("                <label class='font-weight-bold'>Description</label>");
        builder.append("                <div style='width: 100%'><label>This service provides an API to teach monkeys how to eat bananas.</label></div>");
        builder.append("            </div>");
        builder.append("            <div class='form-group col-md-1'>");
        builder.append("                <label class='font-weight-bold'>Version</label>");
        builder.append("                <div style='width: 100%'><h4><span class='badge' style='background-color:#4D7A97'>1.0.0</span></h4></div>");
        builder.append("            </div>");
        builder.append("            <div class='form-group col-md-1'>");
        builder.append("                <label class='font-weight-bold' style='margin-left: 10px'>OAS</label>");
        builder.append("                <div style='width: 100%'><h4><span class='badge' style='background-color: #F8981D'>3.0.1</span></h4></div>");
        builder.append("            </div>");
        builder.append("        </div>");
        builder.append("        <div class='form-row'>");
        builder.append("            <div class='form-group col-md-4'>");
        builder.append("                <label class='font-weight-bold'>Contact Email</label>");
        builder.append("                <div style='width: 100%'><label>agsn10@hotmail.com</label></div>");
        builder.append("            </div>");
        builder.append("            <div class='form-group col-md-4'>");
        builder.append("                <label class='font-weight-bold'>Contact Name</label>");
        builder.append("                <div style='width: 100%'><label>Antonio Neto</label></div>");
        builder.append("            </div>");
        builder.append("            <div class='form-group col-md-4'>");
        builder.append("                <label class='font-weight-bold'>Contact URL</label>");
        builder.append("                <div style='width: 100%'><a style='color:#007bff'>http://www.docklee.com/contact</a></div>");
        builder.append("            </div>");
        builder.append("        </div>");
        builder.append("        <div class='form-row'>");
        builder.append("            <div class='form-group col-md-4'>");
        builder.append("                <label class='font-weight-bold'>License Name</label>");
        builder.append("                <div style='width: 100%'><label>Docklee License</label></div>");
        builder.append("            </div>");
        builder.append("            <div class='form-group col-md-4'>");
        builder.append("                <label class='font-weight-bold'>License URL</label>");
        builder.append("                <div style='width: 100%'><a style='color:#007bff'>http://www.docklee.com/license</a></div>");
        builder.append("            </div>");
        builder.append("            <div class='form-group col-md-4'>");
        builder.append("                <label class='font-weight-bold'>Terms Of Service</label>");
        builder.append("                <div style='width: 100%'><a style='color:#007bff'>http://www.docklee.com/term</a></div>");
        builder.append("            </div>");
        builder.append("        </div>");
        builder.append("    </form>");
        builder.append("</div>");
        return builder.toString();
    }
}
