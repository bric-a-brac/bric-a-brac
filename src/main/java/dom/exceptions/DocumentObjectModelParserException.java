package dom.exceptions;

import javax.xml.parsers.ParserConfigurationException;

/**
 * N'hérite pas de DocumentObjectModelParseException car ce n'est pas
 * une erreur d'analyse mais une erreur de création du parser.
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public final class DocumentObjectModelParserException extends DocumentObjectModelException
	{
	/**
	 * @since 0.1.0
	 */
	public DocumentObjectModelParserException(final ParserConfigurationException exception)
		{
		super(exception);
		}
	}
