package com.docklee.ui.resource.component;

import com.docklee.model.pojo.APIDefinition;

public class ServersComponent extends Component{

    public ServersComponent(final APIDefinition apiDefinition) {
        super(apiDefinition);
    }

    /**
     * @return
     */
    @Override
    public String create() {
        getComponent().append("<div role='tabpanel' class='tab-pane fade' id='servers'>");
        getComponent().append("     <div class='col-md-12' style='margin-top: 2px; padding-left: 0px; padding-right: 0px; height: 260px; overflow-y: scroll; margin-bottom: 5px;'>");
        getComponent().append("         <table class='table table-sm'>");
        getComponent().append("             <thead style='background-color: #09c; color: white;'>");
        getComponent().append("                 <tr>");
        getComponent().append("                     <th scope='col'><b>#</b></th>");
        getComponent().append("                     <th scope='col'><b>Description</b></th>");
        getComponent().append("                     <th scope='col'><b>Url</b></th>");
        getComponent().append("                     <th scope='col' style='text-align: center; width: 210px'><b>Extensions</b></th>");
        getComponent().append("                     <th scope='col' style='text-align: center; width: 210px'><b>Server Variable</b></th>");
        getComponent().append("                 </tr>");
        getComponent().append("             </thead>");
        getComponent().append("             <tbody>");
        getComponent().append("                 <tr>");
        getComponent().append("                     <td scope='row' style='vertical-align: middle'>1</td>");
        getComponent().append("                     <td style='vertical-align: middle'>Description of the server</td>");
        getComponent().append("                     <td style='vertical-align: middle'>http://www.docklee.com.br</td>");
        getComponent().append("                     <td style='text-align: center; width: 210px;'>");
        getComponent().append("                         <button type='button' class='btn btn-sm btn-info waves-effect waves-light' onclick=\"show('multiCollapseExample4');\"><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</button>");
        getComponent().append("                     </td>");
        getComponent().append("                     <td style='text-align: center; width: 210px;'>");
        getComponent().append("                         <button type='button' class='btn btn-sm btn-info waves-effect waves-light' onclick=\"show('multiCollapseExample4');\"><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</button>");
        getComponent().append("                     </td>");
        getComponent().append("                 </tr>");
        getComponent().append("                 <tr id='multiCollapseExample4' style='display: none;'>");
        getComponent().append("                     <td colspan='5'>");
        getComponent().append("                         <div class='card card-body'>");
        getComponent().append("                             <table class='table table-sm'>");
        getComponent().append("                                 <thead>");
        getComponent().append("                                     <tr>");
        getComponent().append("                                         <th><strong>#</strong></th>");
        getComponent().append("                                         <th><strong>Name</strong></th>");
        getComponent().append("                                         <th><strong>Value</strong></th>");
        getComponent().append("                                     </tr>");
        getComponent().append("                                 </thead>");
        getComponent().append("                                 <tbody>");
        getComponent().append("                                     <tr>");
        getComponent().append("                                         <td>1</td>");
        getComponent().append("                                         <td>Mark</td>");
        getComponent().append("                                         <td>Otto</td>");
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
