package debug;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Debug
	{
	/**
	 * @since 0.1.0
	 */
	public static long getMemoryUsage()
		{
		final var runtime = Runtime.getRuntime();

		// TODO: GC
		//runtime.gc();

		return runtime.totalMemory() - runtime.freeMemory();
		}

	/**
	 * @since 0.1.0
	 */
	public static final Optional<StackTraceElement> getCaller(final long skipCount)
		{
		return getStackTrace().stream().skip(skipCount).findFirst();
		}

	/**
	 * @since 0.1.0
	 */
	public static final List<StackTraceElement> getStackTrace()
		{
		return Arrays.asList(Thread.currentThread().getStackTrace());
		}

	/*
	public static final String method(final StackTraceElement trace)
		{
		return trace.getClassName() + Constant.DOT + trace.getMethodName();
		}

	public static final String toString(final StackTraceElement element)
		{
		return element.getMethodName();
		}
	*/

	/**
	 * @since 0.1.0
	 */
	@Deprecated
	public static final void log(final String message)
		{
		//System.out.println(LocalDateTime.now().toString() + Constant.SPACE + message + Constant.SPACE + getCaller());
		System.out.println(LocalDateTime.now().toString() + getCaller(4L));
		}

	/*
	private static final long MEGABYTE = 1024L * 1024L;

	private static final LongFunction<Long> BYTES_TO_MEGABYTES = bytes -> Long.valueOf(bytes / MEGABYTE);

	public static final void memoryUsage()
		{
		

		//System.out.println("Used memory is bytes: " + memory);
		//System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
		log(String.format("Memory usage: %s Mo", BYTES_TO_MEGABYTES.apply(memory)));
		System.out.println(BYTES_TO_MEGABYTES.apply(memory));
		}
	*/
	}
