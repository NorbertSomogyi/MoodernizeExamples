package application;

/**
 * Author......: See docs/credits.txt
 * License.....: MIT
 */
// workaround to get the rid of "redefinition of typedef 'Byte'" build warning
// end of workaround
// _WIN
// there's no such thing in plain C, therefore all vector operation cannot work in this emu
// which is why VECT_SIZE is set to 1
// timer
// thread
// enums
public enum loglevel {
	LOGLEVEL_INFO, 
	LOGLEVEL_WARNING, 
	LOGLEVEL_ERROR, 
	LOGLEVEL_ADVICE
}
