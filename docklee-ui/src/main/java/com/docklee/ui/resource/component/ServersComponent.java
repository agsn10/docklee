package com.docklee.ui.resource.component;

import java.util.ArrayList;
import java.util.List;

import com.docklee.model.pojo.APIDefinition;
import com.docklee.model.pojo.ServerVariable;
import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.operations.Server;

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
            getComponent().append("     <div class='col-md-12' style='margin-top: 2px; padding-left: 0px; padding-right: 0px; height: 240px; overflow-y: scroll; margin-bottom: 5px;'>");
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
            int i=1;
        for(Server server : getApiDefinition().getServers()) {
            getComponent().append("                 <tr>");
            getComponent().append("                     <td scope='row' style='vertical-align: middle; padding-top: 0rem !important; padding-bottom: 0rem !important;'>"+i+++"</td>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0rem !important; padding-bottom: 0rem !important;'>"+server.getDescription()+"</td>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0rem !important; padding-bottom: 0rem !important;'>"+server.getUrl()+"</td>");
            String oneId = String.valueOf("dckl"+server.hashCode()+i+1), twoId = String.valueOf("dckl"+server.hashCode()+i+2);
            getComponent().append("                     <td style='text-align: center; width: 210px; padding-top: 0rem !important; padding-bottom: 0rem !important;'>");
            getComponent().append("                         <button type='button' class='btn btn-sm btn-info waves-effect waves-light' data-toggle='modal' data-target='#"+oneId+"'><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</button>");
            getComponent().append("                     </td>");
            getComponent().append("                     <td style='text-align: center; width: 210px; padding-top: 0rem !important; padding-bottom: 0rem !important;'>");
            getComponent().append("                         <button type='button' class='btn btn-sm btn-info waves-effect waves-light' data-toggle='modal' data-target='#"+twoId+"'><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</button>");
            getComponent().append("                     </td>");
            getComponent().append("                 </tr>");
            getModals().add(createExtensionModal(oneId, server.getExtensions()));
            getModals().add(createServerVariableModal(twoId, server.getVariables()));
        }
            getComponent().append("             </tbody>");
            getComponent().append("         </table>");
            getComponent().append("     </div>");
            getComponent().append("</div>");
            getModals().forEach(modal -> getComponent().append(modal));
        return getComponent().toString();
    }

    private String createExtensionModal(String id, Extension[] extensions){
        StringBuilder modal = new StringBuilder();
        modal.append("<div class='modal fade' id='"+id+"' data-backdrop='static' data-keyboard='false' tabindex='-1' aria-labelledby='staticBackdropLabel' aria-hidden='true'>");
        modal.append("  <div class='modal-dialog modal-lg'>");
        modal.append("      <div class='modal-content'>");
        modal.append("          <div class='modal-header'>");
        modal.append("              <h5 class='modal-title' id='staticBackdropLabel'>Extensions</h5>");
        modal.append("              <button type='button' class='close' data-dismiss='modal' aria-label='Close'>");
        modal.append("                  <span aria-hidden='true'>&times;</span>");
        modal.append("              </button>");
        modal.append("          </div>");
        modal.append("          <div class='modal-body'>");
        modal.append("              <div class='col-md-12' style='margin-top: 2px; padding-left: 0px; padding-right: 0px; margin-bottom: 5px;'>");
        modal.append("                  <table class='table table-sm'>");
        modal.append("                      <thead style='background-color: #09c; color: white;'>");
        modal.append("                          <tr>");
        modal.append("                              <th scope='col'><b>#</b></th>");
        modal.append("                              <th scope='col'><b>Name</b></th>");
        modal.append("                              <th scope='col'><b>Ext. Prop. Name</b></th>");
        modal.append("                              <th scope='col'><b>Ext. Prop. Value</b></th>");
        modal.append("                          </tr>");
        modal.append("                      </thead>");
        modal.append("                      <tbody>");
        int j=0;
        for (Extension extension : extensions) {
            modal.append("                      <tr>");
            modal.append("                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + (j+1) + "</td>");
            modal.append("                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + extension.getName() + "</td>");
            modal.append("                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + extension.getProperties()[j].getName() + "</td>");
            modal.append("                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + extension.getProperties()[j].getValue() + "</td>");
            modal.append("                      </tr>");
            j++;
        }
        modal.append("                      </tbody>");
        modal.append("                  </table>");
        modal.append("              </div>");
        modal.append("          </div>");
        modal.append("          <div class='modal-footer'>");
        modal.append("              <button type='button' class='btn btn-secondary' data-dismiss='modal'>Close</button>");
        modal.append("          </div>");
        modal.append("      </div>");
        modal.append("  </div>");
        modal.append("</div>");
        return modal.toString();
    }

    private String createServerVariableModal(String id, ServerVariable[] serverVariables){
        StringBuilder modal = new StringBuilder();
        modal.append("<div class='modal fade' id='"+id+"' data-backdrop='static' data-keyboard='false' tabindex='-1' aria-labelledby='staticBackdropLabel' aria-hidden='true'>");
        modal.append("  <div class='modal-dialog modal-xl'>");
        modal.append("      <div class='modal-content'>");
        modal.append("          <div class='modal-header'>");
        modal.append("              <h5 class='modal-title' id='staticBackdropLabel'>Server Variables</h5>");
        modal.append("              <button type='button' class='close' data-dismiss='modal' aria-label='Close'>");
        modal.append("                  <span aria-hidden='true'>&times;</span>");
        modal.append("              </button>");
        modal.append("          </div>");
        modal.append("          <div class='modal-body'>");

        modal.append("              <div class='col-md-12' style='margin-top: 2px; padding-left: 0px; padding-right: 0px; margin-bottom: 5px;'>");
        modal.append("                  <table class='table table-sm'>");
        modal.append("                      <thead style='background-color: #09c; color: white;'>");
        modal.append("                          <tr>");
        modal.append("                              <th scope='col'><b>#</b></th>");
        modal.append("                              <th scope='col'><b>Name</b></th>");
        modal.append("                              <th scope='col'><b>Description</b></th>");
        modal.append("                              <th scope='col'><b>Allowable Values</b></th>");
        modal.append("                              <th scope='col'><b>Default Value</b></th>");
        modal.append("                              <th scope='col' style='text-align: center;'><b>Extensions</b></th>");
        modal.append("                          </tr>");
        modal.append("                      </thead>");
        modal.append("                      <tbody>");
        int j=0;
        for (ServerVariable variable : serverVariables) {
            String variableId = "dckl"+variable.hashCode()+j;
            modal.append("                      <tr>");
            modal.append("                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + (j+1) + "</td>");
            modal.append("                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + variable.getName() + "</td>");
            modal.append("                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + variable.getDescription() + "</td>");
            modal.append("                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + createAllowableValues(variable.getAllowableValues()) + "</td>");
            modal.append("                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + variable.getDefaultValue() + "</td>");
            modal.append("                          <td style='text-align: center; width: 210px; padding-top: 0rem !important; padding-bottom: 0rem !important;'>");
            modal.append("                              <button type='button' class='btn btn-sm btn-info waves-effect waves-light' onclick=\"show('"+variableId+"');\"><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</button>");
            modal.append("                          </td>");
            modal.append("                      </tr>");

            modal.append("                      <tr id='"+variableId+"' style='display: none'>");
            modal.append("                          <td colspan='6'");
            modal.append("                              <div class='card-body'>");
            modal.append("                                  <table class='table table-sm table-striped'>");
            modal.append("                                      <thead style='background-color: #09c; color: white;'>");
            modal.append("                                          <tr>");
            modal.append("                                                  <th scope='col'><b>#</b></th>");
            modal.append("                                                  <th scope='col'><b>Name</b></th>");
            modal.append("                                                  <th scope='col'><b>Ext. Prop. Name</b></th>");
            modal.append("                                                  <th scope='col'><b>Ext. Prop. Value</b></th>");
            modal.append("                                          </tr>");
            modal.append("                                      </thead>");
            modal.append("                                      <tbody>");
            int i=0;
            for (Extension extension : variable.getExtensions()) {
                modal.append("                                      <tr>");
                modal.append("                                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + (i+1) + "</td>");
                modal.append("                                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + extension.getName() + "</td>");
                modal.append("                                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + extension.getProperties()[j].getName() + "</td>");
                modal.append("                                          <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>" + extension.getProperties()[j].getValue() + "</td>");
                modal.append("                                      </tr>");
                i++;
            }
            modal.append("                                      </tbody>");
            modal.append("                                  </table>");
            modal.append("                              </div>");
            modal.append("                          </td>");
            modal.append("                      </tr>");

                j++;
        }
        modal.append("                      </tbody>");
        modal.append("                  </table>");
        modal.append("              </div>");

        modal.append("          </div>");
        modal.append("          <div class='modal-footer'>");
        modal.append("              <button type='button' class='btn btn-secondary' data-dismiss='modal'>Close</button>");
        modal.append("          </div>");
        modal.append("      </div>");
        modal.append("  </div>");
        modal.append("</div>");
        return modal.toString();
    }

    private String createAllowableValues(String[] values){
        String badges = "";
        for(String badge : values)
            badges += "<span style='margin-left: 5px;' class='badge badge-secondary'>"+badge+"</span>";
        return badges;
    }
}
