package com.docklee.ui.resource.component;

import java.util.Objects;

import com.docklee.annotation.extensions.Tag;
import com.docklee.model.pojo.APIDefinition;
import com.docklee.model.pojo.extensions.Extension;

public class ResourceComponent extends Component{

    private Tag tag;
    public ResourceComponent(final APIDefinition apiDefinition, final Tag tag) {
        super(apiDefinition);
        this.tag = tag;
    }

    /**
     * @return
     */
    @Override
    public String create() {
            getComponent().append("<div class='col-lg-3 col-md-6'>");
            getComponent().append("     <div class='card box'>");
            getComponent().append("         <div class='card-body'>");
            getComponent().append("             <h3 class='card-title'>"+(Objects.nonNull(tag) ? tag.name() : "NO DATA")+" Resource</h3>");
            getComponent().append("             <p></p> <p></p> <span style='margin-left: 5px;' class='badge badge-secondary'>"+(Objects.nonNull(tag) ? tag.name() : "NO DATA")+"</span> <p></p>");
            getComponent().append("             <p class='card-text'>"+(Objects.nonNull(tag) ? tag.description() : "NO DATA")+"</p>");
            getComponent().append("             <a href='#' class='btn waves-effect waves-light' style='background-color: #4D7A97 !important;' onclick=\"change('services','service_detail')\"><i class='fa fa-info-circle' aria-hidden='true'></i> Detail</a>");
            getComponent().append("         </div>");
            getComponent().append("     </div>");
            getComponent().append("</div>");
        return getComponent().toString();
    }
}
