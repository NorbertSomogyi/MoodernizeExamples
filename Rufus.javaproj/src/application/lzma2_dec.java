package application;

public class lzma2_dec {
	private lzma2_seq sequence;
	private lzma2_seq next_sequence;
	private Object uncompressed;
	private Object compressed;
	private boolean need_dict_reset;
	private boolean need_props;
	
	public lzma2_dec(lzma2_seq sequence, lzma2_seq next_sequence, Object uncompressed, Object compressed, boolean need_dict_reset, boolean need_props) {
		setSequence(sequence);
		setNext_sequence(next_sequence);
		setUncompressed(uncompressed);
		setCompressed(compressed);
		setNeed_dict_reset(need_dict_reset);
		setNeed_props(need_props);
	}
	public lzma2_dec() {
	}
	
	public lzma2_seq getSequence() {
		return sequence;
	}
	public void setSequence(lzma2_seq newSequence) {
		sequence = newSequence;
	}
	public lzma2_seq getNext_sequence() {
		return next_sequence;
	}
	public void setNext_sequence(lzma2_seq newNext_sequence) {
		next_sequence = newNext_sequence;
	}
	public Object getUncompressed() {
		return uncompressed;
	}
	public void setUncompressed(Object newUncompressed) {
		uncompressed = newUncompressed;
	}
	public Object getCompressed() {
		return compressed;
	}
	public void setCompressed(Object newCompressed) {
		compressed = newCompressed;
	}
	public boolean getNeed_dict_reset() {
		return need_dict_reset;
	}
	public void setNeed_dict_reset(boolean newNeed_dict_reset) {
		need_dict_reset = newNeed_dict_reset;
	}
	public boolean getNeed_props() {
		return need_props;
	}
	public void setNeed_props(boolean newNeed_props) {
		need_props = newNeed_props;
	}
}
/* Position in xz_dec_lzma2_run(). */
