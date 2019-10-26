package application;

public enum VTermParserState {
	NORMAL, 
	CSI_LEADER, 
	CSI_ARGS, 
	CSI_INTERMED, 
	ESC, 
	STRING, 
	ESC_IN_STRING
}
