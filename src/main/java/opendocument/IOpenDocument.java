package opendocument;

import java.io.IOException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IOpenDocument extends AutoCloseable
	{
	public static final String DC_1_1 = "http://purl.org/dc/elements/1.1/";
	public static final String MANIFEST_1_0 = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0";
	public static final String META_1_0 = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0";
	public static final String OFFICE_1_0 = "urn:oasis:names:tc:opendocument:xmlns:office:1.0";
	public static final String OOO = "http://openoffice.org/2004/office";
	public static final String STYLE_1_0 = "urn:oasis:names:tc:opendocument:xmlns:style:1.0";
	public static final String TEXT_1_0 = "urn:oasis:names:tc:opendocument:xmlns:text:1.0";
	public static final String XLINK = "http://www.w3.org/1999/xlink";

	/**
	 * @since 0.1.0
	 */
	public String getEntry(String path) throws IOException;

	/**
	 * @since 0.1.0
	 */
	//public Manifest getManifest() throws IOException;

	/**
	 * @since 0.1.0
	 */
	//public Meta getMeta() throws IOException;

	/**
	 * @since 0.1.0
	 */
	@Override
	public void close() throws IOException;
	}
