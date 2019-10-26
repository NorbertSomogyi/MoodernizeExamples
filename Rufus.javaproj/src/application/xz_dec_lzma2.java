package application;

public class xz_dec_lzma2 {
	private rc_dec rc;
	private dictionary dict;
	private lzma2_dec lzma2;
	private lzma_dec lzma;
	private  temp;
	
	public xz_dec_lzma2(rc_dec rc, dictionary dict, lzma2_dec lzma2, lzma_dec lzma,  temp) {
		setRc(rc);
		setDict(dict);
		setLzma2(lzma2);
		setLzma(lzma);
		setTemp(temp);
	}
	public xz_dec_lzma2() {
	}
	
	/* Get pointer to literal coder probability array. */
	public Object lzma_literal_probs() {
		dictionary generatedDict = this.getDict();
		uint32_t prev_byte = ModernizedCProgram.dict_get(generatedDict, 0);
		lzma_dec generatedLzma = this.getLzma();
		Object generatedLc = generatedLzma.getLc();
		uint32_t low = prev_byte >> (8 - generatedLc);
		Object generatedPos = generatedDict.getPos();
		Object generatedLiteral_pos_mask = generatedLzma.getLiteral_pos_mask();
		uint32_t high = (generatedPos & generatedLiteral_pos_mask) << generatedLc;
		Object generatedLiteral = generatedLzma.getLiteral();
		return generatedLiteral[low + high];
	}
	/* Decode a literal (one 8-bit byte) */
	public void lzma_literal() {
		uint16_t probs = new uint16_t();
		uint32_t symbol = new uint32_t();
		uint32_t match_byte = new uint32_t();
		uint32_t match_bit = new uint32_t();
		uint32_t offset = new uint32_t();
		uint32_t i = new uint32_t();
		probs = s.lzma_literal_probs();
		lzma_dec generatedLzma = this.getLzma();
		lzma_state generatedState = generatedLzma.getState();
		rc_dec generatedRc = this.getRc();
		dictionary generatedDict = this.getDict();
		Object generatedRep0 = generatedLzma.getRep0();
		if (.lzma_state_is_literal(generatedState)) {
			symbol = generatedRc.rc_bittree(probs, -1024);
		} else {
				symbol = 1;
				match_byte = ModernizedCProgram.dict_get(generatedDict, generatedRep0) << 1;
				offset = -1024;
				do {
					match_bit = match_byte & offset;
					match_byte <<=  1;
					i = offset + match_bit + symbol;
					if (generatedRc.rc_bit(probs[i])) {
						symbol = (symbol << 1) + 1;
						offset &=  match_bit;
					} else {
							symbol <<=  1;
							offset &=  ~match_bit;
					} 
				} while (symbol < -1024);
		} 
		generatedDict.dict_put((uint8_t)symbol);
		.lzma_state_literal(generatedState);
	}
	/* Decode a match. The distance will be stored in s->lzma.rep0. */
	public void lzma_match(Object pos_state) {
		uint16_t probs = new uint16_t();
		uint32_t dist_slot = new uint32_t();
		uint32_t limit = new uint32_t();
		lzma_dec generatedLzma = this.getLzma();
		lzma_state generatedState = generatedLzma.getState();
		.lzma_state_match(generatedState);
		Object generatedRep2 = generatedLzma.getRep2();
		generatedLzma.setRep3(generatedRep2);
		Object generatedRep1 = generatedLzma.getRep1();
		generatedLzma.setRep2(generatedRep1);
		Object generatedRep0 = generatedLzma.getRep0();
		generatedLzma.setRep1(generatedRep0);
		lzma_len_dec generatedMatch_len_dec = generatedLzma.getMatch_len_dec();
		ModernizedCProgram.lzma_len(s, generatedMatch_len_dec, pos_state);
		Object generatedDist_slot = generatedLzma.getDist_slot();
		Object generatedLen = generatedLzma.getLen();
		probs = generatedDist_slot[.lzma_get_dist_state(generatedLen)];
		rc_dec generatedRc = this.getRc();
		dist_slot = generatedRc.rc_bittree(probs, (1 << 6)) - (1 << 6);
		Object generatedDist_special = generatedLzma.getDist_special();
		Object generatedDist_align = generatedLzma.getDist_align();
		if (dist_slot < 4) {
			generatedLzma.setRep0(dist_slot);
		} else {
				limit = (dist_slot >> 1) - 1;
				generatedLzma.setRep0(2 + (dist_slot & 1));
				if (dist_slot < 14) {
					generatedRep0 <<=  limit;
					probs = generatedDist_special + generatedRep0 - dist_slot - 1;
					generatedRc.rc_bittree_reverse(probs, generatedRep0, limit);
				} else {
						generatedRc.rc_direct(generatedRep0, limit - 4);
						generatedRep0 <<=  4;
						generatedRc.rc_bittree_reverse(generatedDist_align, generatedRep0, 4);
				} 
		} 
	}
	/*
	 * Decode a repeated match. The distance is one of the four most recently
	 * seen matches. The distance will be stored in s->lzma.rep0.
	 */
	public void lzma_rep_match(Object pos_state) {
		uint32_t tmp = new uint32_t();
		rc_dec generatedRc = this.getRc();
		lzma_dec generatedLzma = this.getLzma();
		Object generatedIs_rep0 = generatedLzma.getIs_rep0();
		lzma_state generatedState = generatedLzma.getState();
		Object generatedIs_rep0_long = generatedLzma.getIs_rep0_long();
		Object generatedIs_rep1 = generatedLzma.getIs_rep1();
		Object generatedRep1 = generatedLzma.getRep1();
		Object generatedIs_rep2 = generatedLzma.getIs_rep2();
		Object generatedRep2 = generatedLzma.getRep2();
		Object generatedRep3 = generatedLzma.getRep3();
		Object generatedRep0 = generatedLzma.getRep0();
		if (!generatedRc.rc_bit(generatedIs_rep0[generatedState])) {
			if (!generatedRc.rc_bit(generatedIs_rep0_long[generatedState][pos_state])) {
				.lzma_state_short_rep(generatedState);
				generatedLzma.setLen(1);
				return ;
			} 
		} else {
				if (!generatedRc.rc_bit(generatedIs_rep1[generatedState])) {
					tmp = generatedRep1;
				} else {
						if (!generatedRc.rc_bit(generatedIs_rep2[generatedState])) {
							tmp = generatedRep2;
						} else {
								tmp = generatedRep3;
								generatedLzma.setRep3(generatedRep2);
						} 
						generatedLzma.setRep2(generatedRep1);
				} 
				generatedLzma.setRep1(generatedRep0);
				generatedLzma.setRep0(tmp);
		} 
		.lzma_state_long_rep(generatedState);
		lzma_len_dec generatedRep_len_dec = generatedLzma.getRep_len_dec();
		ModernizedCProgram.lzma_len(s, generatedRep_len_dec, pos_state);
	}
	/* LZMA decoder core */
	public boolean lzma_main() {
		uint32_t pos_state = new uint32_t();
		/*
			 * If the dictionary was reached during the previous call, try to
			 * finish the possibly pending repeat in the dictionary.
			 */
		dictionary generatedDict = this.getDict();
		lzma_dec generatedLzma = this.getLzma();
		Object generatedLen = generatedLzma.getLen();
		Object generatedRep0 = generatedLzma.getRep0();
		if (ModernizedCProgram.dict_has_space(generatedDict) && generatedLen > 0) {
			generatedDict.dict_repeat(generatedLen, generatedRep0);
		} 
		rc_dec generatedRc = this.getRc();
		Object generatedPos = generatedDict.getPos();
		Object generatedPos_mask = generatedLzma.getPos_mask();
		Object generatedIs_match = generatedLzma.getIs_match();
		lzma_state generatedState = generatedLzma.getState();
		Object generatedIs_rep = generatedLzma.getIs_rep();
		while (ModernizedCProgram.dict_has_space(generatedDict) && !ModernizedCProgram.rc_limit_exceeded(generatedRc)) {
			pos_state = generatedPos & generatedPos_mask;
			if (!generatedRc.rc_bit(generatedIs_match[generatedState][pos_state])) {
				s.lzma_literal();
			} else {
					if (generatedRc.rc_bit(generatedIs_rep[generatedState])) {
						s.lzma_rep_match(pos_state);
					} else {
							s.lzma_match(pos_state);
					} 
					if (!generatedDict.dict_repeat(generatedLen, generatedRep0)) {
						return 0;
					} 
			} 
		}
		generatedRc.rc_normalize();
		return 1/*
		 * Reset the LZMA decoder and range decoder state. Dictionary is nore reset
		 * here, because LZMA state may be reset without resetting the dictionary.
		 */;
	}
	public void lzma_reset() {
		uint16_t probs = new uint16_t();
		size_t i = new size_t();
		lzma_dec generatedLzma = this.getLzma();
		generatedLzma.setState(lzma_state.STATE_LIT_LIT);
		generatedLzma.setRep0(0);
		generatedLzma.setRep1(0);
		generatedLzma.setRep2(0);
		generatedLzma.setRep3(0/*
			 * All probabilities are initialized to the same value. This hack
			 * makes the code smaller by avoiding a separate loop for each
			 * probability array.
			 *
			 * This could be optimized so that only that part of literal
			 * probabilities that are actually required. In the common case
			 * we would write 12 KiB less.
			 */);
		Object generatedIs_match = generatedLzma.getIs_match();
		probs = generatedIs_match[0];
		for (i = 0; i < (1846 + (1 << 4) * -1024); ++i) {
			probs[i] = (1 << 11) / 2;
		}
		rc_dec generatedRc = this.getRc();
		generatedRc.rc_reset();
	}
	public boolean lzma_props(Object props) {
		if (props > (4 * 5 + 4) * 9 + 8) {
			return 0;
		} 
		lzma_dec generatedLzma = this.getLzma();
		generatedLzma.setPos_mask(0);
		Object generatedPos_mask = generatedLzma.getPos_mask();
		while (props >= 9 * 5) {
			props -= 9 * 5;
			++generatedPos_mask;
		}
		generatedLzma.setPos_mask((1 << generatedPos_mask) - 1);
		generatedLzma.setLiteral_pos_mask(0);
		Object generatedLiteral_pos_mask = generatedLzma.getLiteral_pos_mask();
		while (props >= 9) {
			props -= 9;
			++generatedLiteral_pos_mask;
		}
		generatedLzma.setLc(props);
		Object generatedLc = generatedLzma.getLc();
		if (generatedLc + generatedLiteral_pos_mask > 4) {
			return 0;
		} 
		generatedLzma.setLiteral_pos_mask((1 << generatedLiteral_pos_mask) - 1);
		s.lzma_reset();
		return 1/*********
		 * LZMA2 *
		 *********//*
		 * The LZMA decoder assumes that if the input limit (s->rc.in_limit) hasn't
		 * been exceeded, it is safe to read up to LZMA_IN_REQUIRED bytes. This
		 * wrapper function takes care of making the LZMA decoder's assumption safe.
		 *
		 * As long as there is plenty of input left to be decoded in the current LZMA
		 * chunk, we decode directly from the caller-supplied input buffer until
		 * there's LZMA_IN_REQUIRED bytes left. Those remaining bytes are copied into
		 * s->temp.buf, which (hopefully) gets filled on the next call to this
		 * function. We decode a few bytes from the temporary buffer so that we can
		 * continue decoding from the caller-supplied input buffer again.
		 */;
	}
	public xz_dec_lzma2 xz_dec_lzma2_create(xz_mode mode, Object dict_max) {
		xz_dec_lzma2 s = .malloc();
		if (s == ((Object)0)) {
			return ((Object)0);
		} 
		dictionary generatedDict = s.getDict();
		generatedDict.setMode(xz_mode.mode);
		generatedDict.setSize_max(dict_max);
		Object generatedBuf = generatedDict.getBuf();
		if (((xz_mode.mode) == xz_mode.XZ_PREALLOC)) {
			generatedDict.setBuf(.malloc(dict_max));
			if (generatedBuf == ((Object)0)) {
				.free(s);
				return ((Object)0);
			} 
		}  else if (((xz_mode.mode) == xz_mode.XZ_DYNALLOC)) {
			generatedDict.setBuf(((Object)0));
			generatedDict.setAllocated(0);
		} 
		return s;
	}
	public xz_ret xz_dec_lzma2_reset(Object props) {
		if (props > /* This limits dictionary size to 3 GiB to keep parsing simpler. */39) {
			return xz_ret.XZ_OPTIONS_ERROR;
		} 
		dictionary generatedDict = this.getDict();
		generatedDict.setSize(2 + (props & 1));
		Object generatedSize = generatedDict.getSize();
		generatedSize <<=  (props >> 1) + 11;
		xz_mode generatedMode = generatedDict.getMode();
		Object generatedSize_max = generatedDict.getSize_max();
		Object generatedAllocated = generatedDict.getAllocated();
		Object generatedBuf = generatedDict.getBuf();
		if (((generatedMode) != xz_mode.XZ_SINGLE)) {
			if (generatedSize > generatedSize_max) {
				return xz_ret.XZ_MEMLIMIT_ERROR;
			} 
			generatedDict.setEnd(generatedSize);
			if (((generatedMode) == xz_mode.XZ_DYNALLOC)) {
				if (generatedAllocated < generatedSize) {
					.free(generatedBuf);
					generatedDict.setBuf(.malloc(generatedSize));
					if (generatedBuf == ((Object)0)) {
						generatedDict.setAllocated(0);
						return xz_ret.XZ_MEM_ERROR;
					} 
				} 
			} 
		} 
		lzma_dec generatedLzma = this.getLzma();
		generatedLzma.setLen(0);
		lzma2_dec generatedLzma2 = this.getLzma2();
		generatedLzma2.setSequence(lzma2_seq.SEQ_CONTROL);
		generatedLzma2.setNeed_dict_reset(1);
		 generatedTemp = this.getTemp();
		generatedTemp.setSize(0);
		return xz_ret.XZ_OK;
	}
	public void xz_dec_lzma2_end() {
		dictionary generatedDict = this.getDict();
		xz_mode generatedMode = generatedDict.getMode();
		Object generatedBuf = generatedDict.getBuf();
		if (((generatedMode) != xz_mode.XZ_SINGLE)) {
			.free(generatedBuf);
		} 
		.free(s);
	}
	public rc_dec getRc() {
		return rc;
	}
	public void setRc(rc_dec newRc) {
		rc = newRc;
	}
	public dictionary getDict() {
		return dict;
	}
	public void setDict(dictionary newDict) {
		dict = newDict;
	}
	public lzma2_dec getLzma2() {
		return lzma2;
	}
	public void setLzma2(lzma2_dec newLzma2) {
		lzma2 = newLzma2;
	}
	public lzma_dec getLzma() {
		return lzma;
	}
	public void setLzma(lzma_dec newLzma) {
		lzma = newLzma;
	}
	public  getTemp() {
		return temp;
	}
	public void setTemp( newTemp) {
		temp = newTemp;
	}
}
/*
	 * The order below is important on x86 to reduce code size and
	 * it shouldn't hurt on other platforms. Everything up to and
	 * including lzma.pos_mask are in the first 128 bytes on x86-32,
	 * which allows using smaller instructions to access those
	 * variables. On x86-64, fewer variables fit into the first 128
	 * bytes, but this is still the best order without sacrificing
	 * the readability by splitting the structures.
	 */
