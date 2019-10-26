package application;

/* Range decoder */
public class rc_dec {
	private Object range;
	private Object code;
	private Object init_bytes_left;
	private Object in;
	private Object in_pos;
	private Object in_limit;
	
	public rc_dec(Object range, Object code, Object init_bytes_left, Object in, Object in_pos, Object in_limit) {
		setRange(range);
		setCode(code);
		setInit_bytes_left(init_bytes_left);
		setIn(in);
		setIn_pos(in_pos);
		setIn_limit(in_limit);
	}
	public rc_dec() {
	}
	
	/* Reset the range decoder. */
	public void rc_reset() {
		this.setRange((uint32_t)-1);
		this.setCode(0);
		this.setInit_bytes_left(5/*
		 * Read the first five initial bytes into rc->code if they haven't been
		 * read already. (Yes, the first byte gets completely ignored.)
		 */);
	}
	public int rc_bit(Object prob) {
		uint32_t bound = new uint32_t();
		int bit;
		rc.rc_normalize();
		Object generatedRange = this.getRange();
		bound = (generatedRange >> 11) * prob;
		Object generatedCode = this.getCode();
		if (generatedCode < bound) {
			this.setRange(bound);
			prob += ((1 << 11) - prob) >> 5;
			bit = 0;
		} else {
				generatedRange -= bound;
				generatedCode -= bound;
				prob -= prob >> 5;
				bit = 1;
		} 
		return bit;
	}
	/* Decode a bittree starting from the most significant bit. */
	public Object rc_bittree(Object probs, Object limit) {
		uint32_t symbol = 1;
		do {
			if (rc.rc_bit(probs[symbol])) {
				symbol = (symbol << 1) + 1;
			} else {
					symbol <<=  1;
			} 
		} while (symbol < limit);
		return symbol;
	}
	/* Decode a bittree starting from the least significant bit. */
	public void rc_bittree_reverse(Object probs, Object dest, Object limit) {
		uint32_t symbol = 1;
		uint32_t i = 0;
		do {
			if (rc.rc_bit(probs[symbol])) {
				symbol = (symbol << 1) + 1;
				dest += 1 << i;
			} else {
					symbol <<=  1;
			} 
		} while (++i < limit);
	}
	/* Decode direct bits (fixed fifty-fifty probability) */
	public void rc_direct(Object dest, Object limit) {
		uint32_t mask = new uint32_t();
		Object generatedRange = this.getRange();
		Object generatedCode = this.getCode();
		do {
			rc.rc_normalize();
			generatedRange >>=  1;
			generatedCode -= generatedRange;
			mask = (uint32_t)0 - (generatedCode >> 31);
			generatedCode += generatedRange & mask;
			dest = (dest << 1) + (mask + 1);
		} while (--limit > 0/********
		 * LZMA *
		 ********/);
	}
	public Object getRange() {
		return range;
	}
	public void setRange(Object newRange) {
		range = newRange;
	}
	public Object getCode() {
		return code;
	}
	public void setCode(Object newCode) {
		code = newCode;
	}
	public Object getInit_bytes_left() {
		return init_bytes_left;
	}
	public void setInit_bytes_left(Object newInit_bytes_left) {
		init_bytes_left = newInit_bytes_left;
	}
	public Object getIn() {
		return in;
	}
	public void setIn(Object newIn) {
		in = newIn;
	}
	public Object getIn_pos() {
		return in_pos;
	}
	public void setIn_pos(Object newIn_pos) {
		in_pos = newIn_pos;
	}
	public Object getIn_limit() {
		return in_limit;
	}
	public void setIn_limit(Object newIn_limit) {
		in_limit = newIn_limit;
	}
}
