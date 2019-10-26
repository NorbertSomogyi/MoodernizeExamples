package application;

/*
 * The parser event function (if not NULL) is called with the event type and
 * the begin/end offsets of the parsed elements.
 *
 * Note: for CONFIG_EVENT_ENTRY (i.e. config variables), the trailing newline
 * character is considered part of the element.
 */
public enum config_event_t {
	CONFIG_EVENT_SECTION, 
	CONFIG_EVENT_ENTRY, 
	CONFIG_EVENT_WHITESPACE, 
	CONFIG_EVENT_COMMENT, 
	CONFIG_EVENT_EOF, 
	CONFIG_EVENT_ERROR
}
