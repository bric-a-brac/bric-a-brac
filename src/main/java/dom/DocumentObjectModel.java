package dom;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.function.FailableSupplier;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import dom.exceptions.DocumentObjectModelParserException;
//import parser.IParser;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class DocumentObjectModel
	{
	protected final Document document;

	//public static final IParser<String, Document, IOException> PARSER = DocumentObjectModel.Parser::parse;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public DocumentObjectModel(final Document document)
		{
		super();

		this.document = notNull(document);
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public DocumentObjectModel(final String xml) throws IOException
		{
		this(Parser.parse(xml));
		}

	/**
	 * @since 0.1.0
	 */
	public final Document getDocument()
		{
		return document;
		}

	/**
	 * @since 0.1.0
	 */
	public final ElementHelper getDocumentElement()
		{
		return new ElementHelper(document.getDocumentElement());
		}

	/*
	public final Optional<Element> getElement(final String id)
		{
		// FIXME: Bug avec id sur root ??????!!
		//return Optional.ofNullable(document.getElementById(notNull(id)));
		throw new UnsupportedOperationException();
		}
	*/

	/**
	 * @version 0.1.0
	 * @since 0.1.0
	 */
	public static final class Builder
		{
		/**
		 * @since 0.1.0
		 */
		public static final Document newDocument()
			{
			return newDocument(true);
			}

		/**
		 * @since 0.1.0
		 */
		public static final Document newDocument(final boolean withNamespaceSupport)
			{
			return getDocumentBuilder(withNamespaceSupport).newDocument();
			}

		/**
		 * @since 0.1.0
		 */
		public static final DocumentBuilder getDocumentBuilder(final boolean withNamespaceSupport)
			{
			try
				{
				return builder(withNamespaceSupport).get();
				}
			catch (final ParserConfigurationException ex)
				{
				throw new DocumentObjectModelParserException(ex);
				}
			}

		/**
		 * @since 0.1.0
		 */
		private static final FailableSupplier<DocumentBuilder, ParserConfigurationException> builder(final boolean withNamespaceSupport)
			{
			return () ->
				{
				final var factory = DocumentBuilderFactory.newDefaultInstance();

				factory.setNamespaceAware(withNamespaceSupport);

				return factory.newDocumentBuilder();
				};
			}
		}

	/**
	 * @version 0.1.0
	 * @since 0.1.0
	 */
	public static final class Parser
		{
		/**
		 * @throws NullArgumentException
		 * @throws IOException
		 * 
		 * @since 0.1.0
		 */
		public static Document parse(final String xml) throws IOException
			{
			return parse(xml, true);
			}

		/**
		 * @throws NullArgumentException
		 * @throws IOException
		 * 
		 * @since 0.1.0
		 */
		public static final Document parse(final String xml, final boolean withNamespaceSupport) throws IOException
			{
			try (final var reader = new StringReader(notNull(xml)))
				{
				return parse(reader, withNamespaceSupport);
				}
			}

		/**
		 * @throws NullArgumentException
		 * @throws IOException
		 * 
		 * @since 0.1.0
		 */
		public static final Document parse(final Reader reader) throws IOException
			{
			return parse(reader, true);
			}

		/**
		 * @throws NullArgumentException
		 * @throws IOException
		 * 
		 * @since 0.1.0
		 */
		public static final Document parse(final Reader reader, final boolean withNamespaceSupport) throws IOException
			{
			try
				{
				// TODO: normalize et normalizeDocument ???
				return Builder.getDocumentBuilder(withNamespaceSupport).parse(new InputSource(notNull(reader)));
				}
			catch (final SAXException ex)
				{
				//throw new DocumentObjectModelSAXException(ex);
				// TODO: Error
				throw new IOException(ex);
				}
			}
		}
	}
