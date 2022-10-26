package com.docklee.ui.resource.component;

import com.docklee.model.pojo.APIDefinition;
import com.docklee.model.pojo.ExternalDocumentation;
import com.docklee.model.pojo.ServerVariable;
import com.docklee.model.pojo.extensions.Extension;
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
            String oneId = String.valueOf("dckl"+tag.hashCode()+i+1), twoId = String.valueOf("dckl"+tag.hashCode()+i+2);
            getComponent().append("                 <tr>");
            getComponent().append("                     <td scope='row' style='vertical-align: middle; padding-top: 0rem !important; padding-bottom: 0rem !important;'>"+i+++"</td>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0rem !important; padding-bottom: 0rem !important;'>"+tag.getName()+"</td>");
            getComponent().append("                     <td style='vertical-align: middle; padding-top: 0rem !important; padding-bottom: 0rem !important;'>"+tag.getDescription()+"</td>");
            getComponent().append("                     <td style='text-align: center; width: 210px; padding-top: 0rem !important; padding-bottom: 0rem !important;'>");
            getComponent().append("                         <button type='button' class='btn btn-sm btn-info waves-effect waves-light' data-toggle='modal' data-target='#"+oneId+"'><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</button>");
            getComponent().append("                     </td>");
            getComponent().append("                     <td style='text-align: center; width: 210px; padding-top: 0rem !important; padding-bottom: 0rem !important;'>");
            getComponent().append("                         <button type='button' class='btn btn-sm btn-info waves-effect waves-light' data-toggle='modal' data-target='#"+twoId+"'><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</button>");
            getComponent().append("                     </td>");
            getComponent().append("                 </tr>");
            getModals().add(createExtensionModal(oneId, tag.getExtensions()));
            getModals().add(createExternalDocsModal(twoId, tag.getExternalDocs()));
        }
        getComponent().append("             </tbody>");
        getComponent().append("         </table>");
        getComponent().append("     </div>");
        getComponent().append("</div>");
        getModals().forEach(modal -> getComponent().append(modal));
        return getComponent().toString();
    }

    private String createExternalDocsModal(String id, ExternalDocumentation documentation){
        StringBuilder modal = new StringBuilder();
        modal.append("<div class='modal fade' id='"+id+"' data-backdrop='static' data-keyboard='false' tabindex='-1' aria-labelledby='staticBackdropLabel' aria-hidden='true'>");
        modal.append("  <div class='modal-dialog modal-xl'>");
        modal.append("      <div class='modal-content'>");
        modal.append("          <div class='modal-header'>");
        modal.append("              <h5 class='modal-title' id='staticBackdropLabel'>External Documentation</h5>");
        modal.append("              <button type='button' class='close' data-dismiss='modal' aria-label='Close'>");
        modal.append("                  <span aria-hidden='true'>&times;</span>");
        modal.append("              </button>");
        modal.append("          </div>");
        modal.append("          <div class='modal-body'>");

        modal.append("              <div class='col-md-12' style='margin-top: 2px; padding-left: 0px; padding-right: 0px; height: 240px; overflow-y: scroll; margin-bottom: 5px;'>");
        modal.append("                  <table class='table table-sm'>");
        modal.append("                      <thead style='background-color: #09c; color: white;'>");
        modal.append("                          <tr>");
        modal.append("                              <th scope='col'><b>Description</b></th>");
        modal.append("                              <th scope='col'><b>URL</b></th>");
        modal.append("                          </tr>");
        modal.append("                      </thead>");
        modal.append("                      <tbody>");
        modal.append("                           <tr>");
        modal.append("                               <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'>"+documentation.getDescription()+"</td>");
        modal.append("                               <td style='vertical-align: middle; padding-top: 0.5rem !important; padding-bottom: 0.5rem !important;'><a style='color:#007bff'>"+documentation.getUrl()+"</a></td>");
        modal.append("                           </tr>");
        modal.append("                           <tr>");
        modal.append("                              <td colspan='2'>");
        modal.append("                                  <div>");
        modal.append("                                      <label style='font-size: 22px;'>Extensions</label>");
        modal.append("                                      <table class='table table-sm'>");
        modal.append("                                          <thead>");
        modal.append("                                              <tr>");
        modal.append("                                                   <th scope='col'><strong>#</strong></th>");
        modal.append("                                                   <th scope='col'><strong>Name</strong></th>");
        modal.append("                                                   <th scope='col'><strong>Ext. Prop. Name</strong></th>");
        modal.append("                                                   <th scope='col'><strong>Ext. Prop. Value</strong></th>");
        modal.append("                                               </tr>");
        modal.append("                                          </thead>");
        modal.append("                                          <tbody>");
        modal.append("                                              <tr>");
        modal.append("                                                  <th scope='row'>1</th>");
        modal.append("                                                  <td>Mark</td>");
        modal.append("                                                  <td>Otto</td>");
        modal.append("                                                  <td>@mdo</td>");
        modal.append("                                              </tr>");
        modal.append("                                          </tbody>");
        modal.append("                                      </table>");
        modal.append("                                  </div>");
        modal.append("                              </td>");
        modal.append("                          </tr>");
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
}
