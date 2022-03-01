package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.media.Encoding;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.headers.Header;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>EncodingMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class EncodingMapper implements Serializable, Mapper<Encoding, com.docklee.model.pojo.media.Encoding> {

	private static final long serialVersionUID = 563849208965691462L;

	@Override
	public com.docklee.model.pojo.media.Encoding map(Encoding input) throws MappingException {
		com.docklee.model.pojo.media.Encoding encoding = new com.docklee.model.pojo.media.Encoding();
		encoding.setAllowReserved(input.allowReserved());
		encoding.setContentType(input.contentType());
		encoding.setExplode(input.explode());
		encoding.setName(input.name());
		encoding.setStyle(input.style());
		if(ArrayUtils.isNotEmpty(input.extensions())) {
			Extension[] extensions = new Extension[input.extensions().length];
			for(int i=0; i<input.extensions().length; i++)
				extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
			encoding.setExtensions(extensions);
		}
		if(ArrayUtils.isNotEmpty(input.headers())) {
			Header[] headers = new Header[input.headers().length];
			for(int i=0; i<input.headers().length; i++)
				headers[i] = new HeaderMapper().map(input.headers()[i]);
			encoding.setHeaders(headers);
		}
		
		return encoding;
	}



}
