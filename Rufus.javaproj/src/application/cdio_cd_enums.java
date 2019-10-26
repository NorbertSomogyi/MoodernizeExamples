package application;

/*! An enumeration for some of the CDIO_CD \#defines below. This isn't
        really an enumeration one would really use in a program it is to
        be helpful in debuggers where wants just to refer to the CDIO_CD_
        names and get something.
      */
public enum cdio_cd_enums {
	CDIO_CD_MINS, 
	CDIO_CD_SECS_PER_MIN, 
	CDIO_CD_FRAMES_PER_SEC, 
	CDIO_CD_SYNC_SIZE, 
	CDIO_CD_CHUNK_SIZE, 
	CDIO_CD_NUM_OF_CHUNKS, 
	CDIO_CD_FRAMESIZE_SUB, 
	CDIO_CD_HEADER_SIZE, 
	CDIO_CD_SUBHEADER_SIZE, 
	CDIO_CD_ECC_SIZE, 
	CDIO_CD_FRAMESIZE, 
	CDIO_CD_FRAMESIZE_RAW, 
	CDIO_CD_FRAMESIZE_RAWER, 
	CDIO_CD_FRAMESIZE_RAW1, 
	CDIO_CD_FRAMESIZE_RAW0, 
	CDIO_CD_MAX_SESSIONS, 
	CDIO_CD_MIN_SESSION_NO, 
	CDIO_CD_MAX_LSN, 
	CDIO_CD_MIN_LSN
}
