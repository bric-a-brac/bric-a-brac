package program;

import annotations.WorkInProgress;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public interface IScanner extends IExternalProgram //, FailableSupplier<Path, IOException>
	{
	/**
	 * @version 0.1.0
	 * @since 0.1.0
	 */
	public enum Format
		{
		PNG
		}

	/**
	 * @version 0.1.0
	 * @since 0.1.0
	 */
	public enum Mode
		{
		COLOR
		}
	}

