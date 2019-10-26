package application;

/* Next position after decoding the compressed size of the chunk. */
public enum lzma2_seq {
	SEQ_CONTROL, 
	SEQ_UNCOMPRESSED_1, 
	SEQ_UNCOMPRESSED_2, 
	SEQ_COMPRESSED_0, 
	SEQ_COMPRESSED_1, 
	SEQ_PROPERTIES, 
	SEQ_LZMA_PREPARE, 
	SEQ_LZMA_RUN, 
	SEQ_COPY
}
