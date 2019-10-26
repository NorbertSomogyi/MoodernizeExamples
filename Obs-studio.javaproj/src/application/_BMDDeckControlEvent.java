package application;

public enum _BMDDeckControlEvent {
	bmdDeckControlAbortedEvent, 
	bmdDeckControlPrepareForExportEvent, 
	bmdDeckControlExportCompleteEvent, 
	bmdDeckControlPrepareForCaptureEvent, 
	bmdDeckControlCaptureCompleteEvent
}
// This event is triggered when a capture or edit-to-tape operation is aborted.
// This event is triggered a few frames before reaching the in-point. IDeckLinkInput::StartScheduledPlayback() should be called at this point.
// This event is triggered a few frames after reaching the out-point. At this point, it is safe to stop playback.
