package application;

/* status of the last read */
public enum packet_read_status {
	PACKET_READ_EOF, 
	PACKET_READ_NORMAL, 
	PACKET_READ_FLUSH, 
	PACKET_READ_DELIM
}
/*
 * Convenience wrapper for packet_read that is not gentle, and sets the
 * CHOMP_NEWLINE option. The return value is NULL for a flush packet,
 * and otherwise points to a static buffer (that may be overwritten by
 * subsequent calls). If the size parameter is not NULL, the length of the
 * packet is written to it.
 */
/*
 * Peek the next packet line without consuming it and return the status.
 * The next call to 'packet_reader_read()' will perform a read of the same line
 * that was peeked, consuming the line.
 *
 * Peeking multiple times without calling 'packet_reader_read()' will return
 * the same result.
 */
