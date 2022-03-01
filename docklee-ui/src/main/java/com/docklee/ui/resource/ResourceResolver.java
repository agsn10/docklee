package com.docklee.ui.resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import com.google.common.base.Charsets;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>FileResource</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 27-02-2022
 */
public final class ResourceResolver {

	/**
	 * Constructor
	 * */
	private ResourceResolver() { }
	
	
	/**
	 * 
	 * @param resourceName
	 * @return String
	 * @exception IOException
	 * @exception URISyntaxException
	 * */
	public static String getResource(String resourceName) throws IOException, URISyntaxException {

		URL packageURL = Thread.currentThread().getContextClassLoader().getResource(resourceName);
		StringBuilder lines = new StringBuilder();

		if (Optional.ofNullable(packageURL).isPresent()) {
			if (packageURL.getProtocol().equals("jar")) {
				String jarFileName;
				JarFile jarFile;
				JarEntry jarEntry;

				// build jar file name, then loop through zipped entries
				jarFileName = URLDecoder.decode(packageURL.getFile(), "UTF-8");
				jarFileName = jarFileName.substring(5, jarFileName.indexOf("!"));
				jarFile = new JarFile(jarFileName);

				try {
					jarEntry = jarFile.getJarEntry(resourceName);
					InputStream input = jarFile.getInputStream(jarEntry);
					lines.append(convertInputStreamToString(input));
				} finally {
					jarFile.close();
				}
			} else {
				URI uri = new URI(packageURL.toString());
				File file = new File(uri.getPath());
				lines.append(com.google.common.io.Files.toString(file, Charsets.UTF_8));
			}
			return lines.toString();
		} 
		
		return null;
	}	
	

	/**
	 * 
	 * @param inputStream
	 * @return String
	 * @exception IOException
	 * */
	private static String convertInputStreamToString(InputStream inputStream) throws IOException {
		StringBuilder textBuilder = new StringBuilder();
		try (Reader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
			int c = 0;
			while ((c = reader.read()) != -1) textBuilder.append((char) c);
		}
		return textBuilder.toString();
	}

}
