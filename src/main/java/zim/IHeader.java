package zim;

import annotations.Discontinued;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Discontinued
public interface IHeader
	{
	/*
	magicNumber 	integer 	0 	4 	Magic number to recognise the file format, must be 72173914 (0x44D495A)
	majorVersion 	integer 	4 	2 	Major version of the ZIM archive format (6)
	minorVersion 	integer 	6 	2 	Minor version of the ZIM archive format (1 for new namespace usage, 0 for old namespace usage)
	uuid 	integer 	8 	16 	unique id of this zim archive
	entryCount 	integer 	24 	4 	total number of entries
	clusterCount 	integer 	28 	4 	total number of clusters
	urlPtrPos 	integer 	32 	8 	position of the directory pointerlist ordered by URL
	titlePtrPos 	integer 	40 	8 	position of the directory pointerlist ordered by Title
		This is considered as obsolete, readers should use X/listing/titleordered/v0 instead and fallback to titlePtrPos if entry is not present.
	clusterPtrPos 	integer 	48 	8 	position of the cluster pointer list
	mimeListPos 	integer 	56 	8 	position of the MIME type list (also header size)
	mainPage 	integer 	64 	4 	main page or 0xffffffff if no main page
	layoutPage 	integer 	68 	4 	layout page or 0xffffffffff if no layout page (deprecated, always 0xffffffffff)
	checksumPos 	integer 	72 	8 	pointer to the md5checksum of this archive without the checksum itself. This points always 16 bytes before the end of the archive.
	*/

	// Magic number to recognise the file format, must be 72173914 (0x44D495A)
	public static final int MAGIC_NUMBER = 0x44D495A;

	/**
	 * @since 0.1.0
	 */
	public int getMagicNumber();

	/**
	 * @since 0.1.0
	 */
	public int getMajorVersion();

	/**
	 * @since 0.1.0
	 */
	public int getMinorVersion();

	/**
	 * @since 0.1.0
	 */
	public int getUUID();

	/**
	 * @since 0.1.0
	 */
	public int getEntryCount();

	/**
	 * @since 0.1.0
	 */
	public int getClusterCount();
	}
