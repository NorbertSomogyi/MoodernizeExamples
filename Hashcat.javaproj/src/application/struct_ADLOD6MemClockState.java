package application;

/*
 * End of declarations from adl_sdk.h and subheaders
 **/
public class struct_ADLOD6MemClockState {
	private ADLOD6StateInfo state;
	private ADLOD6PerformanceLevel level;
	
	public struct_ADLOD6MemClockState(ADLOD6StateInfo state, ADLOD6PerformanceLevel level) {
		setState(state);
		setLevel(level);
	}
	public struct_ADLOD6MemClockState() {
	}
	
	public ADLOD6StateInfo getState() {
		return state;
	}
	public void setState(ADLOD6StateInfo newState) {
		state = newState;
	}
	public ADLOD6PerformanceLevel getLevel() {
		return level;
	}
	public void setLevel(ADLOD6PerformanceLevel newLevel) {
		level = newLevel;
	}
}
