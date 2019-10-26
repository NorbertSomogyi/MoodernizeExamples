package application;

/*! An enumeration for some of the CDIO_CDROM_* \#defines below. This
    isn't really an enumeration one would really use in a program; it
    is to be helpful in debuggers where wants just to refer to the
    CDIO_CDROM_* names and get something.
  */
public enum cdio_track_enums {
	CDIO_CDROM_LBA, 
	CDIO_CDROM_MSF, 
	CDIO_CDROM_DATA_TRACK, 
	CDIO_CDROM_CDI_TRACK, 
	CDIO_CDROM_XA_TRACK, 
	CDIO_CD_MAX_TRACKS, 
	CDIO_CDROM_LEADOUT_TRACK, 
	CDIO_INVALID_TRACK
}
