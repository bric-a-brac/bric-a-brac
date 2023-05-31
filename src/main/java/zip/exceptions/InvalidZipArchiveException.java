package zip.exceptions;

import java.nio.file.ProviderNotFoundException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Deprecated
public final class InvalidZipArchiveException extends ZipArchiveException
	{
	/**
	 * @since 0.1.0
	 */
	public InvalidZipArchiveException(final ProviderNotFoundException exception)
		{
		super(exception);
		}
	}
