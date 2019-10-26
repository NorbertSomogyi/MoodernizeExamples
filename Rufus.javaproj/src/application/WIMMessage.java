package application;

// From http://msdn.microsoft.com/en-us/library/windows/desktop/dd834960.aspx
// as well as http://www.msfn.org/board/topic/150700-wimgapi-wimmountimage-progressbar/
public enum WIMMessage {
	WIM_MSG, 
	WIM_MSG_TEXT, 
	WIM_MSG_PROGRESS, 
	WIM_MSG_PROCESS, 
	WIM_MSG_SCANNING, 
	WIM_MSG_SETRANGE, 
	WIM_MSG_SETPOS, 
	WIM_MSG_STEPIT, 
	WIM_MSG_COMPRESS, 
	WIM_MSG_ERROR, 
	WIM_MSG_ALIGNMENT, 
	WIM_MSG_RETRY, 
	WIM_MSG_SPLIT, 
	WIM_MSG_FILEINFO, 
	WIM_MSG_INFO, 
	WIM_MSG_WARNING, 
	WIM_MSG_CHK_PROCESS, 
	WIM_MSG_SUCCESS, 
	WIM_MSG_ABORT_IMAGE
}
// Indicates an update in the progress of an image application.
// Enables the caller to prevent a file or a directory from being captured or applied.
// Indicates that volume information is being gathered during an image capture.
// Indicates the number of files that will be captured or applied.
// Indicates the number of files that have been captured or applied.
// Indicates that a file has been either captured or applied.
// Enables the caller to prevent a file resource from being compressed during a capture.
// Alerts the caller that an error has occurred while capturing or applying an image.
// Enables the caller to align a file resource on a particular alignment boundary.
// Sent when the file is being reapplied because of a network timeout.
// Enables the caller to align a file resource on a particular alignment boundary.
// Used in conjunction with WimApplyImages()'s WIM_FLAG_FILEINFO flag to provide detailed file info.
// Sent when an info message is available.
// Sent when a warning message is available.
