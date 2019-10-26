package application;

/* __cplusplus */
public enum strncpy_pad_check {
	ISO9660_NOCHECK, 
	ISO9660_7BIT, 
	ISO9660_ACHARS, 
	ISO9660_DCHARS
}
/*=====================================================================
    File and Directory Names
    ======================================================================*/
/*!
    Check that psz_path is a valid ISO-9660 directory name.

    A valid directory name should not start out with a slash (/),
    dot (.) or null byte, should be less than 37 characters long,
    have no more than 8 characters in a directory component
    which is separated by a /, and consist of only DCHARs.

    True is returned if psz_path is valid.
  */
