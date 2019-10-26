package application;

public class state_t {
	private Object gunzip_bytes_out;
	private Object gunzip_crc;
	private int gunzip_src_fd;
	private int gunzip_outbuf_count;
	private Byte gunzip_window;
	private Object gunzip_crc_table;
	private int gunzip_bb;
	private byte gunzip_bk;
	private Byte bytebuffer;
	private Object to_read;
	private int bytebuffer_offset;
	private int bytebuffer_size;
	private int inflate_codes_ml;
	private int inflate_codes_md;
	private int inflate_codes_bb;
	private int inflate_codes_k;
	private int inflate_codes_w;
	private huft_t inflate_codes_tl;
	private huft_t inflate_codes_td;
	private int inflate_codes_bl;
	private int inflate_codes_bd;
	private int inflate_codes_nn;
	private int inflate_codes_dd;
	private Object resume_copy;
	private Object method;
	private Object need_another_block;
	private Object end_reached;
	private int inflate_stored_n;
	private int inflate_stored_b;
	private int inflate_stored_k;
	private int inflate_stored_w;
	private Object error_msg;
	private Object error_jmp;
	
	public state_t(Object gunzip_bytes_out, Object gunzip_crc, int gunzip_src_fd, int gunzip_outbuf_count, Byte gunzip_window, Object gunzip_crc_table, int gunzip_bb, byte gunzip_bk, Byte bytebuffer, Object to_read, int bytebuffer_offset, int bytebuffer_size, int inflate_codes_ml, int inflate_codes_md, int inflate_codes_bb, int inflate_codes_k, int inflate_codes_w, huft_t inflate_codes_tl, huft_t inflate_codes_td, int inflate_codes_bl, int inflate_codes_bd, int inflate_codes_nn, int inflate_codes_dd, Object resume_copy, Object method, Object need_another_block, Object end_reached, int inflate_stored_n, int inflate_stored_b, int inflate_stored_k, int inflate_stored_w, Object error_msg, Object error_jmp) {
		setGunzip_bytes_out(gunzip_bytes_out);
		setGunzip_crc(gunzip_crc);
		setGunzip_src_fd(gunzip_src_fd);
		setGunzip_outbuf_count(gunzip_outbuf_count);
		setGunzip_window(gunzip_window);
		setGunzip_crc_table(gunzip_crc_table);
		setGunzip_bb(gunzip_bb);
		setGunzip_bk(gunzip_bk);
		setBytebuffer(bytebuffer);
		setTo_read(to_read);
		setBytebuffer_offset(bytebuffer_offset);
		setBytebuffer_size(bytebuffer_size);
		setInflate_codes_ml(inflate_codes_ml);
		setInflate_codes_md(inflate_codes_md);
		setInflate_codes_bb(inflate_codes_bb);
		setInflate_codes_k(inflate_codes_k);
		setInflate_codes_w(inflate_codes_w);
		setInflate_codes_tl(inflate_codes_tl);
		setInflate_codes_td(inflate_codes_td);
		setInflate_codes_bl(inflate_codes_bl);
		setInflate_codes_bd(inflate_codes_bd);
		setInflate_codes_nn(inflate_codes_nn);
		setInflate_codes_dd(inflate_codes_dd);
		setResume_copy(resume_copy);
		setMethod(method);
		setNeed_another_block(need_another_block);
		setEnd_reached(end_reached);
		setInflate_stored_n(inflate_stored_n);
		setInflate_stored_b(inflate_stored_b);
		setInflate_stored_k(inflate_stored_k);
		setInflate_stored_w(inflate_stored_w);
		setError_msg(error_msg);
		setError_jmp(error_jmp);
	}
	public state_t() {
	}
	
	public void huft_free_all() {
		huft_t generatedInflate_codes_tl = this.getInflate_codes_tl();
		(generatedInflate_codes_tl).huft_free();
		huft_t generatedInflate_codes_td = this.getInflate_codes_td();
		(generatedInflate_codes_td).huft_free();
		(generatedInflate_codes_tl) = ((Object)0);
		(generatedInflate_codes_td) = ((Object)0);
	}
	public void abort_unzip() {
		state.huft_free_all();
		Object generatedError_jmp = this.getError_jmp();
		.longjmp((generatedError_jmp), 1);
	}
	public int fill_bitbuffer(int bitbuffer, int current, Object required) {
		int generatedBytebuffer_offset = this.getBytebuffer_offset();
		int generatedBytebuffer_size = this.getBytebuffer_size();
		Object generatedTo_read = this.getTo_read();
		int generatedGunzip_src_fd = this.getGunzip_src_fd();
		Byte generatedBytebuffer = this.getBytebuffer();
		Object generatedError_msg = this.getError_msg();
		while (current < required) {
			if ((generatedBytebuffer_offset) >= (generatedBytebuffer_size)) {
				int sz = -1024 - 4;
				if ((generatedTo_read) >= 0 && (generatedTo_read) < /* unzip only */sz) {
					sz = (int)(generatedTo_read);
				} 
				(generatedBytebuffer_size) = ModernizedCProgram.full_read((generatedGunzip_src_fd), (generatedBytebuffer)[4], sz);
				if ((int)(generatedBytebuffer_size) < 1) {
					(generatedError_msg) = "unexpected end of file";
					state.abort_unzip();
				} 
				if ((generatedTo_read) >= /* unzip only */0) {
					(generatedTo_read) -= (generatedBytebuffer_size);
				} 
				(generatedBytebuffer_size) += 4;
				(generatedBytebuffer_offset) = 4;
			} 
			bitbuffer |=  ((int)(generatedBytebuffer)[(generatedBytebuffer_offset)]) << current;
			(generatedBytebuffer_offset)++;
			current += 8;
		}
		return bitbuffer/* Given a list of code lengths and a maximum table size, make a set of
		 * tables to decode that set of codes.  Return zero on success, one if
		 * the given code set is incomplete (the tables are still built in this
		 * case), two if the input is invalid (all zero length codes or an
		 * oversubscribed set of lengths) - in this case stores NULL in *t.
		 *
		 * b:	code lengths in bits (all assumed <= BMAX)
		 * n:	number of codes (assumed <= N_MAX)
		 * s:	number of simple-valued codes (0..s-1)
		 * d:	list of base values for non-simple codes
		 * e:	list of extra bits for non-simple codes
		 * t:	result: starting table
		 * m:	maximum lookup bits, returns actual
		 */;
	}
	/* map formerly local static variables to globals */
	public void inflate_codes_setup(int my_bl, int my_bd) {
		int generatedInflate_codes_bl = this.getInflate_codes_bl();
		(generatedInflate_codes_bl) = my_bl;
		int generatedInflate_codes_bd = this.getInflate_codes_bd();
		(generatedInflate_codes_bd) = my_bd;
		int generatedInflate_codes_bb = this.getInflate_codes_bb();
		int generatedGunzip_bb = this.getGunzip_bb();
		(generatedInflate_codes_bb) = (generatedGunzip_bb);
		int generatedInflate_codes_k = this.getInflate_codes_k();
		byte generatedGunzip_bk = this.getGunzip_bk();
		(generatedInflate_codes_k) = (generatedGunzip_bk);
		int generatedInflate_codes_w = this.getInflate_codes_w();
		int generatedGunzip_outbuf_count = this.getGunzip_outbuf_count();
		(generatedInflate_codes_w) = (generatedGunzip_outbuf_count);
		int generatedInflate_codes_ml = this.getInflate_codes_ml();
		(generatedInflate_codes_ml) = ModernizedCProgram.mask_bits[(generatedInflate_codes_bl)];
		int generatedInflate_codes_md = this.getInflate_codes_md();
		(generatedInflate_codes_md) = ModernizedCProgram.mask_bits[(generatedInflate_codes_bd)];
	}
	/* called once from inflate_get_next_window */
	public int inflate_codes() {
		/* table entry flag/number of extra bits */int e;
		/* pointer to table entry */huft_t t = new huft_t();
		Object generatedResume_copy = this.getResume_copy();
		if ((generatedResume_copy)) {
			;
		} 
		int generatedInflate_codes_bb = this.getInflate_codes_bb();
		int generatedInflate_codes_k = this.getInflate_codes_k();
		int generatedInflate_codes_bl = this.getInflate_codes_bl();
		huft_t generatedInflate_codes_tl = this.getInflate_codes_tl();
		int generatedInflate_codes_ml = this.getInflate_codes_ml();
		byte generatedE = t.getE();
		byte generatedB = t.getB();
		 generatedV = t.getV();
		Object generatedT = generatedV.getT();
		Byte generatedGunzip_window = this.getGunzip_window();
		int generatedInflate_codes_w = this.getInflate_codes_w();
		Object generatedN = generatedV.getN();
		int generatedGunzip_outbuf_count = this.getGunzip_outbuf_count();
		int generatedInflate_codes_nn = this.getInflate_codes_nn();
		int generatedInflate_codes_bd = this.getInflate_codes_bd();
		huft_t generatedInflate_codes_td = this.getInflate_codes_td();
		int generatedInflate_codes_md = this.getInflate_codes_md();
		int generatedInflate_codes_dd = this.getInflate_codes_dd();
		(generatedGunzip_outbuf_count) = (generatedInflate_codes_w);
		int generatedGunzip_bb = this.getGunzip_bb();
		(generatedGunzip_bb) = (generatedInflate_codes_bb);
		byte generatedGunzip_bk = this.getGunzip_bk();
		(generatedGunzip_bk) = (generatedInflate_codes_k);
		/* normally just after call to inflate_codes, but save code by putting it here *//* free the decoding tables (tl and td), return */state.huft_free_all();
		return /* done */0;
	}
	/* called once from inflate_block */
	public void inflate_stored_setup(int my_n, int my_b, int my_k) {
		int generatedInflate_stored_n = this.getInflate_stored_n();
		(generatedInflate_stored_n) = my_n;
		int generatedInflate_stored_b = this.getInflate_stored_b();
		(generatedInflate_stored_b) = my_b;
		int generatedInflate_stored_k = this.getInflate_stored_k();
		(generatedInflate_stored_k) = my_k;
		int generatedInflate_stored_w = this.getInflate_stored_w();
		int generatedGunzip_outbuf_count = this.getGunzip_outbuf_count();
		(generatedInflate_stored_w) = (generatedGunzip_outbuf_count);
	}
	/* called once from inflate_get_next_window */
	public int inflate_stored() {
		int generatedInflate_stored_n = this.getInflate_stored_n();
		int generatedInflate_stored_b = this.getInflate_stored_b();
		int generatedInflate_stored_k = this.getInflate_stored_k();
		Byte generatedGunzip_window = this.getGunzip_window();
		int generatedInflate_stored_w = this.getInflate_stored_w();
		int generatedGunzip_outbuf_count = this.getGunzip_outbuf_count();
		while ((generatedInflate_stored_n)--) {
			(generatedInflate_stored_b) = state.fill_bitbuffer((generatedInflate_stored_b), (generatedInflate_stored_k), 8);
			(generatedGunzip_window)[(generatedInflate_stored_w)++] = (byte)(generatedInflate_stored_b);
			if ((generatedInflate_stored_w) == .GUNZIP_WSIZE) {
				(generatedGunzip_outbuf_count) = (generatedInflate_stored_w);
				(generatedInflate_stored_w) = 0;
				(generatedInflate_stored_b) >>=  8;
				(generatedInflate_stored_k) -= 8;
				return /* We have a block */1;
			} 
			(generatedInflate_stored_b) >>=  8;
			(generatedInflate_stored_k) -= 8;
		}
		(generatedGunzip_outbuf_count) = (generatedInflate_stored_w);
		int generatedGunzip_bb = this.getGunzip_bb();
		(generatedGunzip_bb) = (generatedInflate_stored_b);
		byte generatedGunzip_bk = this.getGunzip_bk();
		(generatedGunzip_bk) = (generatedInflate_stored_k);
		return /* Finished */0/*
		 * decompress an inflated block
		 * e: last block flag
		 *
		 * GLOBAL VARIABLES: bb, kk,
		 */;
	}
	/* Return values: -1 = inflate_stored, -2 = inflate_codes */
	/* One callsite in inflate_get_next_window */
	public int inflate_block(Object e) {
		int[] ll = new int[286 + /* literal/length and distance code lengths */30];
		/* block type */int t;
		/* bit buffer */int b;
		/* number of bits in bit buffer */int k;
		int generatedGunzip_bb = this.getGunzip_bb();
		b = (generatedGunzip_bb);
		byte generatedGunzip_bk = this.getGunzip_bk();
		k = (generatedGunzip_bk);
		b = state.fill_bitbuffer(b, k, /* read in last block bit */1);
		e = b & 1;
		b >>=  1;
		k -= 1;
		b = state.fill_bitbuffer(b, k, /* read in block type */2);
		t = (int)b & 3;
		b >>=  2;
		k -= 2;
		(generatedGunzip_bb) = /* restore the global bit buffer */b;
		(generatedGunzip_bk) = k/* Do we see block type 1 often? Yes!
			 * TODO: fix performance problem (see below) */;
		huft_t generatedInflate_codes_tl = this.getInflate_codes_tl();
		huft_t generatedInflate_codes_td = this.getInflate_codes_td();
		byte generatedB = td.getB();
		 generatedV = td.getV();
		Object generatedN = generatedV.getN();
		//bb_error_msg("blktype %d", t);switch (/* inflate that block type */t) {
		case 1/* Inflate fixed
			 * decompress an inflated type 1 (fixed Huffman codes) block. We should
			 * either replace this with a custom decoder, or at least precompute the
			 * Huffman tables. TODO */:
				{ 
					int i;
					int bl;
					int bd;
					for (i = 0; i < 144; /* set up literal table */i++) {
						ll[i] = 8;
					}
					for (; i < 256; i++) {
						ll[i] = 9;
					}
					for (; i < 280; i++) {
						ll[i] = 7;
					}
					for (; i < 288; /* make a complete, but wrong code set */i++) {
						ll[i] = 8;
					}
					bl = 7;
					(generatedInflate_codes_tl).huft_build(ll, 288, 257, ModernizedCProgram.cplens, ModernizedCProgram.cplext, bl/* huft_build() never return nonzero - we use known data */);
					for (i = 0; i < 30; /* set up distance table *//* make an incomplete code set */i++) {
						ll[i] = 5;
					}
					bd = 5;
					(generatedInflate_codes_td).huft_build(ll, 30, 0, ModernizedCProgram.cpdist, ModernizedCProgram.cpdext, bd);
					state.inflate_codes_setup(bl, /* set up data for inflate_codes() */bd);
					return -/* huft_free code moved into inflate_codes */2;
				}
		case /* Inflate dynamic */2:
				{ 
					huft_t td = new huft_t();
					int i;
					int j;
					int l;
					int m;
					int n;
					int bl;
					int bd;
					int nb;
					int nl;
					int nd;
					int b_dynamic;
					int k_dynamic;
					b_dynamic = (generatedGunzip_bb);
					k_dynamic = (generatedGunzip_bk);
					b_dynamic = state.fill_bitbuffer(b_dynamic, k_dynamic, /* read in table lengths */5);
					nl = 257 + ((int)b_dynamic & /* number of literal/length codes */-1024);
					b_dynamic >>=  5;
					k_dynamic -= 5;
					b_dynamic = state.fill_bitbuffer(b_dynamic, k_dynamic, 5);
					nd = 1 + ((int)b_dynamic & /* number of distance codes */-1024);
					b_dynamic >>=  5;
					k_dynamic -= 5;
					b_dynamic = state.fill_bitbuffer(b_dynamic, k_dynamic, 4);
					nb = 4 + ((int)b_dynamic & /* number of bit length codes */-1024);
					b_dynamic >>=  4;
					k_dynamic -= 4;
					if (nl > 286 || nd > 30) {
						/* bad lengths */state.abort_unzip();
					} 
					for (j = 0; j < nb; /* read in bit-length-code lengths */j++) {
						b_dynamic = state.fill_bitbuffer(b_dynamic, k_dynamic, 3);
						ll[ModernizedCProgram.border[j]] = (int)b_dynamic & 7;
						b_dynamic >>=  3;
						k_dynamic -= 3;
					}
					for (; j < 19; j++) {
						ll[ModernizedCProgram.border[j]] = 0;
					}
					bl = /* build decoding table for trees - single level, 7 bit lookup */7;
					i = (generatedInflate_codes_tl).huft_build(ll, 19, 19, ((Object)0), ((Object)0), bl);
					if (i != 0) {
						state.abort_unzip();
					} 
					n = nl + /* read in literal and distance code lengths */nd;
					m = ModernizedCProgram.mask_bits[bl];
					i = l = 0;
					while ((int)i < n) {
						b_dynamic = state.fill_bitbuffer(b_dynamic, k_dynamic, (int)bl);
						td = (generatedInflate_codes_tl) + ((int)b_dynamic & m);
						j = generatedB;
						b_dynamic >>=  j;
						k_dynamic -= j;
						j = generatedN;
						if (j < /* length of code in bits (0..15) */16) {
							ll[i++] = l = /* save last length in l */j;
						}  else if (j == /* repeat last length 3 to 6 times */16) {
							b_dynamic = state.fill_bitbuffer(b_dynamic, k_dynamic, 2);
							j = 3 + ((int)b_dynamic & 3);
							b_dynamic >>=  2;
							k_dynamic -= 2;
							if ((int)i + j > n) {
								state.abort_unzip();
							} 
							while (j--) {
								ll[i++] = l;
							}
						}  else if (j == /* 3 to 10 zero length codes */17) {
							b_dynamic = state.fill_bitbuffer(b_dynamic, k_dynamic, 3);
							j = 3 + ((int)b_dynamic & 7);
							b_dynamic >>=  3;
							k_dynamic -= 3;
							if ((int)i + j > n) {
								state.abort_unzip();
							} 
							while (j--) {
								ll[i++] = 0;
							}
							l = 0;
						} else {
								b_dynamic = state.fill_bitbuffer(b_dynamic, k_dynamic, /* j == 18: 11 to 138 zero length codes */7);
								j = 11 + ((int)b_dynamic & -1024);
								b_dynamic >>=  7;
								k_dynamic -= 7;
								if ((int)i + j > n) {
									state.abort_unzip();
								} 
								while (j--) {
									ll[i++] = 0;
								}
								l = 0;
						} 
					}
					(generatedInflate_codes_tl).huft_free();
					(generatedGunzip_bb) = /* restore the global bit buffer */b_dynamic;
					(generatedGunzip_bk) = k_dynamic;
					bl = /* build the decoding tables for literal/length and distance codes */.lbits;
					i = (generatedInflate_codes_tl).huft_build(ll, nl, 257, ModernizedCProgram.cplens, ModernizedCProgram.cplext, bl);
					if (i != 0) {
						state.abort_unzip();
					} 
					bd = .dbits;
					i = (generatedInflate_codes_td).huft_build(ll + nl, nd, 0, ModernizedCProgram.cpdist, ModernizedCProgram.cpdext, bd);
					if (i != 0) {
						state.abort_unzip();
					} 
					state.inflate_codes_setup(bl, /* set up data for inflate_codes() */bd);
					return -/* huft_free code moved into inflate_codes */2;
				}
		case /* Inflate stored */0:
				{ 
					int n;
					int b_stored;
					int k_stored;
					b_stored = (generatedGunzip_bb);
					k_stored = (generatedGunzip_bk);
					n = k_stored & /* go to byte boundary */7;
					b_stored >>=  n;
					k_stored -= n;
					b_stored = state.fill_bitbuffer(b_stored, k_stored, /* get the length and its complement */16);
					n = ((int)b_stored & -1024);
					b_stored >>=  16;
					k_stored -= 16;
					b_stored = state.fill_bitbuffer(b_stored, k_stored, 16);
					if (n != (int)((~b_stored) & -1024)) {
						/* error in compressed data */state.abort_unzip();
					} 
					b_stored >>=  16;
					k_stored -= 16;
					state.inflate_stored_setup(n, b_stored, k_stored);
					return -1;
				}
		default:
				state.abort_unzip();
				return 0;
		}
	}
	/* Two callsites, both in inflate_get_next_window */
	public void calculate_gunzip_crc() {
		Object generatedGunzip_crc = this.getGunzip_crc();
		Byte generatedGunzip_window = this.getGunzip_window();
		int generatedGunzip_outbuf_count = this.getGunzip_outbuf_count();
		Object generatedGunzip_crc_table = this.getGunzip_crc_table();
		(generatedGunzip_crc) = ModernizedCProgram.crc32_le((generatedGunzip_crc), (generatedGunzip_window), (generatedGunzip_outbuf_count), (generatedGunzip_crc_table));
		Object generatedGunzip_bytes_out = this.getGunzip_bytes_out();
		(generatedGunzip_bytes_out) += (generatedGunzip_outbuf_count);
	}
	/* One callsite in inflate_unzip_internal */
	public int inflate_get_next_window() {
		int generatedGunzip_outbuf_count = this.getGunzip_outbuf_count();
		(generatedGunzip_outbuf_count) = 0;
		Object generatedNeed_another_block = this.getNeed_another_block();
		Object generatedEnd_reached = this.getEnd_reached();
		Object generatedMethod = this.getMethod();
		while (1) {
			int ret = 0;
			if ((generatedNeed_another_block)) {
				if ((generatedEnd_reached)) {
					state.calculate_gunzip_crc();
					(generatedEnd_reached) = 0;
					return /* NB: need_another_block is still set *//* Last block */0;
				} 
				(generatedMethod) = state.inflate_block((generatedEnd_reached));
				(generatedNeed_another_block) = 0;
			} 
			switch ((generatedMethod)) {
			case -1:
					ret = state.inflate_stored();
					break;
			case -2:
					ret = state.inflate_codes();
					break;
			default:
					state.abort_unzip();
			}
			if (ret == 1) {
				state.calculate_gunzip_crc();
				return /* more data left */1;
			} 
			(generatedNeed_another_block) = /* end of that block */1/* Doesnt get here */;
		}
	}
	/* helpers first */
	/* Top up the input buffer with at least n bytes. */
	public int top_up(int n) {
		int generatedBytebuffer_size = this.getBytebuffer_size();
		int generatedBytebuffer_offset = this.getBytebuffer_offset();
		int count = (generatedBytebuffer_size) - (generatedBytebuffer_offset);
		Byte generatedBytebuffer = this.getBytebuffer();
		int generatedGunzip_src_fd = this.getGunzip_src_fd();
		if (count < (int)n) {
			.memmove((generatedBytebuffer), (generatedBytebuffer)[(generatedBytebuffer_offset)], count);
			(generatedBytebuffer_offset) = 0;
			(generatedBytebuffer_size) = ModernizedCProgram.full_read((generatedGunzip_src_fd), (generatedBytebuffer)[count], -1024 - count);
			if ((int)(generatedBytebuffer_size) < 0) {
				do {
					if (ModernizedCProgram.bled_printf != ((Object)0)) {
						.bled_printf("Error: read error");
					} else {
							.printf("Error: read error");
							.putchar((byte)'\n');
					} 
				} while (0);
				return 0;
			} 
			(generatedBytebuffer_size) += count;
			if ((generatedBytebuffer_size) < n) {
				return 0;
			} 
		} 
		return 1;
	}
	public Object buffer_read_le_u16() {
		uint16_t res = new uint16_t();
		Byte generatedBytebuffer = this.getBytebuffer();
		int generatedBytebuffer_offset = this.getBytebuffer_offset();
		((res) = (bb__aliased_uint16_t)((generatedBytebuffer)[(generatedBytebuffer_offset)]));
		(generatedBytebuffer_offset) += 2;
		return res;
	}
	public Object buffer_read_le_u32() {
		uint32_t res = new uint32_t();
		Byte generatedBytebuffer = this.getBytebuffer();
		int generatedBytebuffer_offset = this.getBytebuffer_offset();
		((res) = (bb__aliased_uint32_t)((generatedBytebuffer)[(generatedBytebuffer_offset)]));
		(generatedBytebuffer_offset) += 4;
		return res;
	}
	public Object getGunzip_bytes_out() {
		return gunzip_bytes_out;
	}
	public void setGunzip_bytes_out(Object newGunzip_bytes_out) {
		gunzip_bytes_out = newGunzip_bytes_out;
	}
	public Object getGunzip_crc() {
		return gunzip_crc;
	}
	public void setGunzip_crc(Object newGunzip_crc) {
		gunzip_crc = newGunzip_crc;
	}
	public int getGunzip_src_fd() {
		return gunzip_src_fd;
	}
	public void setGunzip_src_fd(int newGunzip_src_fd) {
		gunzip_src_fd = newGunzip_src_fd;
	}
	public int getGunzip_outbuf_count() {
		return gunzip_outbuf_count;
	}
	public void setGunzip_outbuf_count(int newGunzip_outbuf_count) {
		gunzip_outbuf_count = newGunzip_outbuf_count;
	}
	public Byte getGunzip_window() {
		return gunzip_window;
	}
	public void setGunzip_window(Byte newGunzip_window) {
		gunzip_window = newGunzip_window;
	}
	public Object getGunzip_crc_table() {
		return gunzip_crc_table;
	}
	public void setGunzip_crc_table(Object newGunzip_crc_table) {
		gunzip_crc_table = newGunzip_crc_table;
	}
	public int getGunzip_bb() {
		return gunzip_bb;
	}
	public void setGunzip_bb(int newGunzip_bb) {
		gunzip_bb = newGunzip_bb;
	}
	public byte getGunzip_bk() {
		return gunzip_bk;
	}
	public void setGunzip_bk(byte newGunzip_bk) {
		gunzip_bk = newGunzip_bk;
	}
	public Byte getBytebuffer() {
		return bytebuffer;
	}
	public void setBytebuffer(Byte newBytebuffer) {
		bytebuffer = newBytebuffer;
	}
	public Object getTo_read() {
		return to_read;
	}
	public void setTo_read(Object newTo_read) {
		to_read = newTo_read;
	}
	public int getBytebuffer_offset() {
		return bytebuffer_offset;
	}
	public void setBytebuffer_offset(int newBytebuffer_offset) {
		bytebuffer_offset = newBytebuffer_offset;
	}
	public int getBytebuffer_size() {
		return bytebuffer_size;
	}
	public void setBytebuffer_size(int newBytebuffer_size) {
		bytebuffer_size = newBytebuffer_size;
	}
	public int getInflate_codes_ml() {
		return inflate_codes_ml;
	}
	public void setInflate_codes_ml(int newInflate_codes_ml) {
		inflate_codes_ml = newInflate_codes_ml;
	}
	public int getInflate_codes_md() {
		return inflate_codes_md;
	}
	public void setInflate_codes_md(int newInflate_codes_md) {
		inflate_codes_md = newInflate_codes_md;
	}
	public int getInflate_codes_bb() {
		return inflate_codes_bb;
	}
	public void setInflate_codes_bb(int newInflate_codes_bb) {
		inflate_codes_bb = newInflate_codes_bb;
	}
	public int getInflate_codes_k() {
		return inflate_codes_k;
	}
	public void setInflate_codes_k(int newInflate_codes_k) {
		inflate_codes_k = newInflate_codes_k;
	}
	public int getInflate_codes_w() {
		return inflate_codes_w;
	}
	public void setInflate_codes_w(int newInflate_codes_w) {
		inflate_codes_w = newInflate_codes_w;
	}
	public huft_t getInflate_codes_tl() {
		return inflate_codes_tl;
	}
	public void setInflate_codes_tl(huft_t newInflate_codes_tl) {
		inflate_codes_tl = newInflate_codes_tl;
	}
	public huft_t getInflate_codes_td() {
		return inflate_codes_td;
	}
	public void setInflate_codes_td(huft_t newInflate_codes_td) {
		inflate_codes_td = newInflate_codes_td;
	}
	public int getInflate_codes_bl() {
		return inflate_codes_bl;
	}
	public void setInflate_codes_bl(int newInflate_codes_bl) {
		inflate_codes_bl = newInflate_codes_bl;
	}
	public int getInflate_codes_bd() {
		return inflate_codes_bd;
	}
	public void setInflate_codes_bd(int newInflate_codes_bd) {
		inflate_codes_bd = newInflate_codes_bd;
	}
	public int getInflate_codes_nn() {
		return inflate_codes_nn;
	}
	public void setInflate_codes_nn(int newInflate_codes_nn) {
		inflate_codes_nn = newInflate_codes_nn;
	}
	public int getInflate_codes_dd() {
		return inflate_codes_dd;
	}
	public void setInflate_codes_dd(int newInflate_codes_dd) {
		inflate_codes_dd = newInflate_codes_dd;
	}
	public Object getResume_copy() {
		return resume_copy;
	}
	public void setResume_copy(Object newResume_copy) {
		resume_copy = newResume_copy;
	}
	public Object getMethod() {
		return method;
	}
	public void setMethod(Object newMethod) {
		method = newMethod;
	}
	public Object getNeed_another_block() {
		return need_another_block;
	}
	public void setNeed_another_block(Object newNeed_another_block) {
		need_another_block = newNeed_another_block;
	}
	public Object getEnd_reached() {
		return end_reached;
	}
	public void setEnd_reached(Object newEnd_reached) {
		end_reached = newEnd_reached;
	}
	public int getInflate_stored_n() {
		return inflate_stored_n;
	}
	public void setInflate_stored_n(int newInflate_stored_n) {
		inflate_stored_n = newInflate_stored_n;
	}
	public int getInflate_stored_b() {
		return inflate_stored_b;
	}
	public void setInflate_stored_b(int newInflate_stored_b) {
		inflate_stored_b = newInflate_stored_b;
	}
	public int getInflate_stored_k() {
		return inflate_stored_k;
	}
	public void setInflate_stored_k(int newInflate_stored_k) {
		inflate_stored_k = newInflate_stored_k;
	}
	public int getInflate_stored_w() {
		return inflate_stored_w;
	}
	public void setInflate_stored_w(int newInflate_stored_w) {
		inflate_stored_w = newInflate_stored_w;
	}
	public Object getError_msg() {
		return error_msg;
	}
	public void setError_msg(Object newError_msg) {
		error_msg = newError_msg;
	}
	public Object getError_jmp() {
		return error_jmp;
	}
	public void setError_jmp(Object newError_jmp) {
		error_jmp = newError_jmp;
	}
}
