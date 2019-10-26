package application;

/* 7zArcIn.c -- 7z Input functions
2018-12-31 : Igor Pavlov : Public domain */
public enum EIdEnum {
	k7zIdEnd, 
	k7zIdHeader, 
	k7zIdArchiveProperties, 
	k7zIdAdditionalStreamsInfo, 
	k7zIdMainStreamsInfo, 
	k7zIdFilesInfo, 
	k7zIdPackInfo, 
	k7zIdUnpackInfo, 
	k7zIdSubStreamsInfo, 
	k7zIdSize, 
	k7zIdCRC, 
	k7zIdFolder, 
	k7zIdCodersUnpackSize, 
	k7zIdNumUnpackStream, 
	k7zIdEmptyStream, 
	k7zIdEmptyFile, 
	k7zIdAnti, 
	k7zIdName, 
	k7zIdCTime, 
	k7zIdATime, 
	k7zIdMTime, 
	k7zIdWinAttrib, 
	k7zIdComment, 
	k7zIdEncodedHeader, 
	k7zIdStartPos, 
	k7zIdDummy
}
