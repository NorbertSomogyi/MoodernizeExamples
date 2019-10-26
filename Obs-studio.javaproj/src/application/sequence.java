package application;

/// Sequence after the size fields have been decoded.
public enum sequence {
	SEQ_CONTROL, 
	SEQ_UNCOMPRESSED_1, 
	SEQ_UNCOMPRESSED_2, 
	SEQ_COMPRESSED_0, 
	SEQ_COMPRESSED_1, 
	SEQ_PROPERTIES, 
	SEQ_LZMA, 
	SEQ_COPY
}
