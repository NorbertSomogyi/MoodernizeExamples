package application;

public enum _BMDTimecodeFormat {
	bmdTimecodeRP188VITC1, 
	bmdTimecodeRP188VITC2, 
	bmdTimecodeRP188LTC, 
	bmdTimecodeRP188Any, 
	bmdTimecodeVITC, 
	bmdTimecodeVITCField2, 
	bmdTimecodeSerial
}
// RP188 timecode where DBB1 equals VITC1 (line 9)
// RP188 timecode where DBB1 equals VITC2 (line 9 for progressive or line 571 for interlaced/PsF)
// RP188 timecode where DBB1 equals LTC (line 10)
// For capture: return the first valid timecode in {VITC1, LTC ,VITC2} - For playback: set the timecode as VITC1
