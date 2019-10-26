package application;

// This event is triggered a few frames before reaching the in-point. The serial timecode attached to IDeckLinkVideoInputFrames is now valid.
// This event is triggered a few frames after reaching the out-point.
public enum _BMDDeckControlVTRControlState {
	bmdDeckControlNotInVTRControlMode, 
	bmdDeckControlVTRControlPlaying, 
	bmdDeckControlVTRControlRecording, 
	bmdDeckControlVTRControlStill, 
	bmdDeckControlVTRControlShuttleForward, 
	bmdDeckControlVTRControlShuttleReverse, 
	bmdDeckControlVTRControlJogForward, 
	bmdDeckControlVTRControlJogReverse, 
	bmdDeckControlVTRControlStopped
}
