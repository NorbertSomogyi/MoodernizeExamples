package application;

public class ewah_bitmap {
	private Object[] buffer;
	private Object buffer_size;
	private Object alloc_size;
	private Object bit_size;
	private Object rlw;
	
	public ewah_bitmap(Object[] buffer, Object buffer_size, Object alloc_size, Object bit_size, Object rlw) {
		setBuffer(buffer);
		setBuffer_size(buffer_size);
		setAlloc_size(alloc_size);
		setBit_size(bit_size);
		setRlw(rlw);
	}
	public ewah_bitmap() {
	}
	
	public void buffer_grow(Object new_size) {
		Object generatedRlw = this.getRlw();
		Object[] generatedBuffer = this.getBuffer();
		size_t rlw_offset = (uint8_t)generatedRlw - (uint8_t)generatedBuffer;
		Object generatedAlloc_size = this.getAlloc_size();
		if (generatedAlloc_size >= new_size) {
			return /*Error: Unsupported expression*/;
		} 
		this.setAlloc_size(new_size);
		(generatedBuffer) = ModernizedCProgram.xrealloc((generatedBuffer), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAlloc_size)));
		this.setRlw(generatedBuffer + (rlw_offset / /*Error: Unsupported expression*/));
	}
	public void buffer_push(Object value) {
		Object generatedBuffer_size = this.getBuffer_size();
		Object generatedAlloc_size = this.getAlloc_size();
		if (generatedBuffer_size + 1 >= generatedAlloc_size) {
			self.buffer_grow(generatedBuffer_size * 3 / 2);
		} 
		Object[] generatedBuffer = this.getBuffer();
		generatedBuffer[generatedBuffer_size++] = value;
	}
	public void buffer_push_rlw(Object value) {
		self.buffer_push(value);
		Object[] generatedBuffer = this.getBuffer();
		Object generatedBuffer_size = this.getBuffer_size();
		this.setRlw(generatedBuffer + generatedBuffer_size - 1);
	}
	public Object add_empty_words(int v, Object number) {
		size_t added = 0;
		eword_t runlen = new eword_t();
		eword_t can_add = new eword_t();
		Object generatedRlw = this.getRlw();
		if (ModernizedCProgram.rlw_get_run_bit(generatedRlw) != v && ModernizedCProgram.rlw_size(generatedRlw) == 0) {
			ModernizedCProgram.rlw_set_run_bit(generatedRlw, v);
		}  else if (ModernizedCProgram.rlw_get_literal_words(generatedRlw) != 0 || ModernizedCProgram.rlw_get_run_bit(generatedRlw) != v) {
			self.buffer_push_rlw(0);
			if (v) {
				ModernizedCProgram.rlw_set_run_bit(generatedRlw, v);
			} 
			added++;
		} 
		runlen = ModernizedCProgram.rlw_get_running_len(generatedRlw);
		can_add = ModernizedCProgram.min_size(number, (((eword_t)1 << (/*Error: Unsupported expression*/ * 4)) - 1) - runlen);
		ModernizedCProgram.rlw_set_running_len(generatedRlw, runlen + can_add);
		number -= can_add;
		while (number >= (((eword_t)1 << (/*Error: Unsupported expression*/ * 4)) - 1)) {
			self.buffer_push_rlw(0);
			added++;
			if (v) {
				ModernizedCProgram.rlw_set_run_bit(generatedRlw, v);
			} 
			ModernizedCProgram.rlw_set_running_len(generatedRlw, (((eword_t)1 << (/*Error: Unsupported expression*/ * 4)) - 1));
			number -= (((eword_t)1 << (/*Error: Unsupported expression*/ * 4)) - 1);
		}
		if (number > 0) {
			self.buffer_push_rlw(0);
			added++;
			if (v) {
				ModernizedCProgram.rlw_set_run_bit(generatedRlw, v);
			} 
			ModernizedCProgram.rlw_set_running_len(generatedRlw, number);
		} 
		return added;
	}
	public Object ewah_add_empty_words(int v, Object number) {
		if (number == 0) {
			return 0;
		} 
		Object generatedBit_size = this.getBit_size();
		generatedBit_size += number * (/*Error: Unsupported expression*/ * 8);
		return self.add_empty_words(v, number);
	}
	public Object add_literal(Object new_data) {
		Object generatedRlw = this.getRlw();
		eword_t current_num = ModernizedCProgram.rlw_get_literal_words(generatedRlw);
		if (current_num >= (((eword_t)1 << (/*Error: Unsupported expression*/ * 8 - 1 - (/*Error: Unsupported expression*/ * 4))) - 1)) {
			self.buffer_push_rlw(0);
			ModernizedCProgram.rlw_set_literal_words(generatedRlw, 1);
			self.buffer_push(new_data);
			return 2;
		} 
		ModernizedCProgram.rlw_set_literal_words(generatedRlw, current_num + 1);
		((ModernizedCProgram.rlw_get_literal_words(generatedRlw) == current_num + 1) ? (Object)0 : /*Error: Function owner not recognized*/_assert("rlw_get_literal_words(self->rlw) == current_num + 1", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", /* sanity check */122));
		self.buffer_push(new_data);
		return 1;
	}
	public void ewah_add_dirty_words(Object[] buffer, Object number, int negate) {
		size_t literals = new size_t();
		size_t can_add = new size_t();
		Object generatedRlw = this.getRlw();
		Object generatedBuffer_size = this.getBuffer_size();
		Object generatedAlloc_size = this.getAlloc_size();
		Object[] generatedBuffer = this.getBuffer();
		Object generatedBit_size = this.getBit_size();
		while (1) {
			literals = ModernizedCProgram.rlw_get_literal_words(generatedRlw);
			can_add = ModernizedCProgram.min_size(number, (((eword_t)1 << (/*Error: Unsupported expression*/ * 8 - 1 - (/*Error: Unsupported expression*/ * 4))) - 1) - literals);
			ModernizedCProgram.rlw_set_literal_words(generatedRlw, literals + can_add);
			if (generatedBuffer_size + can_add >= generatedAlloc_size) {
				self.buffer_grow((generatedBuffer_size + can_add) * 3 / 2);
			} 
			if (negate) {
				size_t i = new size_t();
				for (i = 0; i < can_add; ++i) {
					generatedBuffer[generatedBuffer_size++] = ~buffer[i];
				}
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuffer + generatedBuffer_size, buffer, can_add * /*Error: Unsupported expression*/);
					generatedBuffer_size += can_add;
			} 
			generatedBit_size += can_add * (/*Error: Unsupported expression*/ * 8);
			if (number - can_add == 0) {
				break;
			} 
			self.buffer_push_rlw(0);
			buffer += can_add;
			number -= can_add;
		}
	}
	public Object add_empty_word(int v) {
		Object generatedRlw = this.getRlw();
		int no_literal = (ModernizedCProgram.rlw_get_literal_words(generatedRlw) == 0);
		eword_t run_len = ModernizedCProgram.rlw_get_running_len(generatedRlw);
		if (no_literal && run_len == 0) {
			ModernizedCProgram.rlw_set_run_bit(generatedRlw, v);
			((ModernizedCProgram.rlw_get_run_bit(generatedRlw) == v) ? (Object)0 : /*Error: Function owner not recognized*/_assert("rlw_get_run_bit(self->rlw) == v", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 171));
		} 
		if (no_literal && ModernizedCProgram.rlw_get_run_bit(generatedRlw) == v && run_len < (((eword_t)1 << (/*Error: Unsupported expression*/ * 4)) - 1)) {
			ModernizedCProgram.rlw_set_running_len(generatedRlw, run_len + 1);
			((ModernizedCProgram.rlw_get_running_len(generatedRlw) == run_len + 1) ? (Object)0 : /*Error: Function owner not recognized*/_assert("rlw_get_running_len(self->rlw) == run_len + 1", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 177));
			return 0;
		} else {
				self.buffer_push_rlw(0);
				((ModernizedCProgram.rlw_get_running_len(generatedRlw) == 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("rlw_get_running_len(self->rlw) == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 182));
				((ModernizedCProgram.rlw_get_run_bit(generatedRlw) == 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("rlw_get_run_bit(self->rlw) == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 183));
				((ModernizedCProgram.rlw_get_literal_words(generatedRlw) == 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("rlw_get_literal_words(self->rlw) == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 184));
				ModernizedCProgram.rlw_set_run_bit(generatedRlw, v);
				((ModernizedCProgram.rlw_get_run_bit(generatedRlw) == v) ? (Object)0 : /*Error: Function owner not recognized*/_assert("rlw_get_run_bit(self->rlw) == v", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 187));
				ModernizedCProgram.rlw_set_running_len(generatedRlw, 1);
				((ModernizedCProgram.rlw_get_running_len(generatedRlw) == 1) ? (Object)0 : /*Error: Function owner not recognized*/_assert("rlw_get_running_len(self->rlw) == 1", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 190));
				((ModernizedCProgram.rlw_get_literal_words(generatedRlw) == 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("rlw_get_literal_words(self->rlw) == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 191));
				return 1;
		} 
	}
	public Object ewah_add(Object word) {
		Object generatedBit_size = this.getBit_size();
		generatedBit_size += (/*Error: Unsupported expression*/ * 8);
		if (word == 0) {
			return self.add_empty_word(0);
		} 
		if (word == (eword_t)(~0)) {
			return self.add_empty_word(1);
		} 
		return self.add_literal(word);
	}
	public void ewah_set(Object i) {
		Object generatedBit_size = this.getBit_size();
		size_t dist = (((i + 1) + ((/*Error: Unsupported expression*/ * 8)) - 1) / ((/*Error: Unsupported expression*/ * 8))) - (((generatedBit_size) + ((/*Error: Unsupported expression*/ * 8)) - 1) / ((/*Error: Unsupported expression*/ * 8)));
		((i >= generatedBit_size) ? (Object)0 : /*Error: Function owner not recognized*/_assert("i >= self->bit_size", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\ewah_bitmap.c", 215));
		this.setBit_size(i + 1);
		if (dist > 0) {
			if (dist > 1) {
				self.add_empty_words(0, dist - 1);
			} 
			self.add_literal((eword_t)1 << (i % (/*Error: Unsupported expression*/ * 8)));
			return /*Error: Unsupported expression*/;
		} 
		Object generatedRlw = this.getRlw();
		if (ModernizedCProgram.rlw_get_literal_words(generatedRlw) == 0) {
			ModernizedCProgram.rlw_set_running_len(generatedRlw, ModernizedCProgram.rlw_get_running_len(generatedRlw) - 1);
			self.add_literal((eword_t)1 << (i % (/*Error: Unsupported expression*/ * 8)));
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedBuffer = this.getBuffer();
		Object generatedBuffer_size = this.getBuffer_size();
		generatedBuffer[generatedBuffer_size - 1] |=  ((eword_t)1 << (i % (/*Error: Unsupported expression*/ * 8)));
		if (generatedBuffer[generatedBuffer_size - 1] == (eword_t)(~/* check if we just completed a stream of 1s */0)) {
			generatedBuffer[--generatedBuffer_size] = 0;
			ModernizedCProgram.rlw_set_literal_words(generatedRlw, ModernizedCProgram.rlw_get_literal_words(generatedRlw) - 1);
			self.add_empty_word(1);
		} 
	}
	public void ewah_each_bit(Object callback, Object payload) {
		size_t pos = 0;
		size_t pointer = 0;
		size_t k = new size_t();
		Object generatedBuffer_size = this.getBuffer_size();
		Object[] generatedBuffer = this.getBuffer();
		while (pointer < generatedBuffer_size) {
			eword_t word = generatedBuffer[pointer];
			if (ModernizedCProgram.rlw_get_run_bit(word)) {
				size_t len = ModernizedCProgram.rlw_get_running_len(word) * (/*Error: Unsupported expression*/ * 8);
				for (k = 0; k < ModernizedCProgram.len; ) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/callback(pos, payload);
				}
			} else {
					pos += ModernizedCProgram.rlw_get_running_len(word) * (/*Error: Unsupported expression*/ * 8);
			} 
			++pointer;
			for (k = 0; k < ModernizedCProgram.rlw_get_literal_words(word); ++k) {
				int c;
				for (c = 0; c < (/*Error: Unsupported expression*/ * 8); ) {
					if ((generatedBuffer[pointer] & ((eword_t)1 << c)) != 0) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/callback(pos, payload);
					} 
				}
				++pointer;
			}
		}
	}
	/**
	 * Clear all the bits in the bitmap. Does not free or resize
	 * memory.
	 */
	public void ewah_clear() {
		this.setBuffer_size(1);
		Object[] generatedBuffer = this.getBuffer();
		generatedBuffer[0] = 0;
		this.setBit_size(0);
		this.setRlw(generatedBuffer);
	}
	public ewah_bitmap ewah_new() {
		ewah_bitmap self = new ewah_bitmap();
		self = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
		self.setAlloc_size(32);
		Object[] generatedBuffer = self.getBuffer();
		Object generatedAlloc_size = self.getAlloc_size();
		(generatedBuffer) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAlloc_size)));
		self.ewah_clear();
		return self;
	}
	public void ewah_free() {
		if (!self) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedAlloc_size = this.getAlloc_size();
		Object[] generatedBuffer = this.getBuffer();
		if (generatedAlloc_size) {
			ModernizedCProgram.free(generatedBuffer);
		} 
		ModernizedCProgram.free(self);
	}
	public void ewah_xor(ewah_bitmap ewah_j, ewah_bitmap out) {
		rlw_iterator rlw_i = new rlw_iterator();
		rlw_iterator rlw_j = new rlw_iterator();
		size_t literals = new size_t();
		ModernizedCProgram.rlwit_init(rlw_i, ewah_i);
		ModernizedCProgram.rlwit_init(rlw_j, ewah_j);
		 generatedRlw = rlw_i.getRlw();
		Object generatedRunning_len = generatedRlw.getRunning_len();
		Object generatedRunning_bit = generatedRlw.getRunning_bit();
		Object generatedLiteral_words = generatedRlw.getLiteral_words();
		Object[] generatedBuffer = rlw_i.getBuffer();
		Object generatedLiteral_word_start = rlw_i.getLiteral_word_start();
		while (rlw_i.rlwit_word_size() > 0 && rlw_j.rlwit_word_size() > 0) {
			while (generatedRunning_len > 0 || generatedRunning_len > 0) {
				rlw_iterator prey = new rlw_iterator();
				rlw_iterator predator = new rlw_iterator();
				size_t index = new size_t();
				int negate_words;
				if (generatedRunning_len < generatedRunning_len) {
					prey = rlw_i;
					predator = rlw_j;
				} else {
						prey = rlw_j;
						predator = rlw_i;
				} 
				negate_words = !!generatedRunning_bit;
				index = ModernizedCProgram.rlwit_discharge(prey, out, generatedRunning_len, negate_words);
				out.ewah_add_empty_words(negate_words, generatedRunning_len - index);
				predator.rlwit_discard_first_words(generatedRunning_len);
			}
			literals = ModernizedCProgram.min_size(generatedLiteral_words, generatedLiteral_words);
			if (literals) {
				size_t k = new size_t();
				for (k = 0; k < literals; ++k) {
					out.ewah_add(generatedBuffer[generatedLiteral_word_start + k] ^ generatedBuffer[generatedLiteral_word_start + k]);
				}
				rlw_i.rlwit_discard_first_words(literals);
				rlw_j.rlwit_discard_first_words(literals);
			} 
		}
		if (rlw_i.rlwit_word_size() > 0) {
			ModernizedCProgram.rlwit_discharge(rlw_i, out, ~0, 0);
		} else {
				ModernizedCProgram.rlwit_discharge(rlw_j, out, ~0, 0);
		} 
		Object generatedBit_size = this.getBit_size();
		out.setBit_size(ModernizedCProgram.max_size(generatedBit_size, generatedBit_size));
	}
	public ewah_bitmap ewah_pool_new() {
		if (ModernizedCProgram.bitmap_pool_size) {
			return ModernizedCProgram.bitmap_pool[--ModernizedCProgram.bitmap_pool_size];
		} 
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		return ewah_bitmap.ewah_new();
	}
	public void ewah_pool_free() {
		if (self == ((Object)0)) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedAlloc_size = this.getAlloc_size();
		if (ModernizedCProgram.bitmap_pool_size == 16 || generatedAlloc_size == 0) {
			self.ewah_free();
			return /*Error: Unsupported expression*/;
		} 
		self.ewah_clear();
		ModernizedCProgram.bitmap_pool[ModernizedCProgram.bitmap_pool_size++] = self;
	}
	public Object ewah_checksum() {
		Object[] generatedBuffer = this.getBuffer();
		uint8_t p = (uint8_t)generatedBuffer;
		Object generatedBit_size = this.getBit_size();
		uint32_t crc = (uint32_t)generatedBit_size;
		Object generatedBuffer_size = this.getBuffer_size();
		size_t size = generatedBuffer_size * /*Error: Unsupported expression*/;
		while (size--) {
			crc = (crc << 5) - crc + (uint32_t)p++;
		}
		return crc;
	}
	public ewah_bitmap bitmap_to_ewah(bitmap bitmap) {
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		ewah_bitmap ewah = ewah_bitmap.ewah_new();
		size_t i = new size_t();
		size_t running_empty_words = 0;
		eword_t last_word = 0;
		Object generatedWord_alloc = bitmap.getWord_alloc();
		Object[] generatedWords = bitmap.getWords();
		for (i = 0; i < generatedWord_alloc; ++i) {
			if (generatedWords[i] == 0) {
				running_empty_words++;
				continue;
			} 
			if (last_word != 0) {
				ewah.ewah_add(last_word);
			} 
			if (running_empty_words > 0) {
				ewah.ewah_add_empty_words(0, running_empty_words);
				running_empty_words = 0;
			} 
			last_word = generatedWords[i];
		}
		ewah.ewah_add(last_word);
		return ewah;
	}
	public ewah_bitmap lookup_stored_bitmap(stored_bitmap st) {
		ewah_bitmap parent = new ewah_bitmap();
		ewah_bitmap composed = new ewah_bitmap();
		stored_bitmap generatedXor = st.getXor();
		ewah_bitmap generatedRoot = st.getRoot();
		if (generatedXor == ((Object)0)) {
			return generatedRoot;
		} 
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		composed = ewah_bitmap.ewah_pool_new();
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		parent = ewah_bitmap.lookup_stored_bitmap(generatedXor);
		generatedRoot.ewah_xor(parent, composed);
		generatedRoot.ewah_pool_free();
		st.setRoot(composed);
		st.setXor(((Object)0));
		return composed/*
		 * Read a bitmap from the current read position on the mmaped
		 * index, and increase the read position accordingly
		 */;
	}
	public ewah_bitmap read_bitmap_1(bitmap_index index) {
		ewah_bitmap ewah_bitmap = new ewah_bitmap();
		ewah_bitmap b = ewah_bitmap.ewah_pool_new();
		Byte generatedMap = index.getMap();
		Object generatedMap_pos = index.getMap_pos();
		Object generatedMap_size = index.getMap_size();
		ssize_t bitmap_size = b.ewah_read_mmap(generatedMap + generatedMap_pos, generatedMap_size - generatedMap_pos);
		if (bitmap_size < 0) {
			();
			b.ewah_pool_free();
			return ((Object)0);
		} 
		generatedMap_pos += bitmap_size;
		return b;
	}
	/**
	 * Copyright 2013, GitHub, Inc
	 * Copyright 2009-2013, Daniel Lemire, Cliff Moon,
	 *	David McIntosh, Robert Becho, Google Inc. and Veronika Zenz
	 *
	 * This program is free software; you can redistribute it and/or
	 * modify it under the terms of the GNU General Public License
	 * as published by the Free Software Foundation; either version 2
	 * of the License, or (at your option) any later version.
	 *
	 * This program is distributed in the hope that it will be useful,
	 * but WITHOUT ANY WARRANTY; without even the implied warranty of
	 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	 * GNU General Public License for more details.
	 *
	 * You should have received a copy of the GNU General Public License
	 * along with this program; if not, see <http://www.gnu.org/licenses/>.
	 */
	public int ewah_serialize_to(Object write_fun, Object data) {
		size_t i = new size_t();
		eword_t[] dump = new eword_t();
		size_t words_per_dump = /*Error: sizeof expression not supported yet*/ / /*Error: Unsupported expression*/;
		uint32_t bitsize = new uint32_t();
		uint32_t word_count = new uint32_t();
		uint32_t rlw_pos = new uint32_t();
		eword_t buffer = new eword_t();
		size_t words_left = new size_t();
		Object generatedBit_size = this.getBit_size();
		bitsize = /*Error: Function owner not recognized*/htonl((uint32_t)generatedBit_size);
		if (/*Error: Function owner not recognized*/write_fun(data, bitsize, 4) != 4) {
			return -1;
		} 
		Object generatedBuffer_size = this.getBuffer_size();
		word_count = /*Error: Function owner not recognized*/htonl((uint32_t)generatedBuffer_size);
		if (/*Error: Function owner not recognized*/write_fun(data, word_count, 4) != 4) {
			return -1;
		} 
		Object[] generatedBuffer = this.getBuffer();
		buffer = generatedBuffer;
		words_left = generatedBuffer_size;
		while (words_left >= words_per_dump) {
			for (i = 0; i < words_per_dump; ) {
				dump[i] = /*Error: Function owner not recognized*/htonll(buffer);
			}
			if (/*Error: Function owner not recognized*/write_fun(data, dump, /*Error: sizeof expression not supported yet*/) != /*Error: sizeof expression not supported yet*/) {
				return -1;
			} 
			words_left -= words_per_dump;
		}
		if (words_left) {
			for (i = 0; i < words_left; ) {
				dump[i] = /*Error: Function owner not recognized*/htonll(buffer);
			}
			if (/*Error: Function owner not recognized*/write_fun(data, dump, words_left * 8) != words_left * 8) {
				return -1;
			} 
		} 
		Object generatedRlw = this.getRlw();
		rlw_pos = (uint8_t)generatedRlw - (uint8_t)generatedBuffer;
		rlw_pos = /*Error: Function owner not recognized*/htonl(rlw_pos / /*Error: Unsupported expression*/);
		if (/*Error: Function owner not recognized*/write_fun(data, rlw_pos, 4) != 4) {
			return -1;
		} 
		return (3 * 4) + (generatedBuffer_size * 8);
	}
	public Object ewah_read_mmap(Object map, Object len) {
		uint8_t ptr = map;
		size_t data_len = new size_t();
		size_t i = new size_t();
		if (len < /*Error: Unsupported expression*/) {
			return ();
		} 
		this.setBit_size(/*Error: Function owner not recognized*/get_be32(ptr));
		ptr += /*Error: Unsupported expression*/;
		len -= /*Error: Unsupported expression*/;
		if (len < /*Error: Unsupported expression*/) {
			return ();
		} 
		this.setBuffer_size(this.setAlloc_size(/*Error: Function owner not recognized*/get_be32(ptr)));
		ptr += /*Error: Unsupported expression*/;
		len -= /*Error: Unsupported expression*/;
		Object[] generatedBuffer = this.getBuffer();
		Object generatedAlloc_size = this.getAlloc_size();
		(generatedBuffer) = ModernizedCProgram.xrealloc((generatedBuffer), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAlloc_size)));
		Object generatedBuffer_size = this.getBuffer_size();
		data_len = ModernizedCProgram.st_mult(generatedBuffer_size, /*Error: Unsupported expression*/);
		if (len < data_len) {
			return ();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuffer, ptr, data_len);
		ptr += data_len;
		len -= data_len;
		for (i = 0; i < generatedBuffer_size; ++i) {
			generatedBuffer[i] = /*Error: Function owner not recognized*/ntohll(generatedBuffer[i]);
		}
		if (len < /*Error: Unsupported expression*/) {
			return ();
		} 
		this.setRlw(generatedBuffer + /*Error: Function owner not recognized*/get_be32(ptr));
		ptr += /*Error: Unsupported expression*/;
		len -= /*Error: Unsupported expression*/;
		return ptr - (uint8_t)map;
	}
	public ewah_bitmap find_reused_bitmap(Object oid) {
		khiter_t hash_pos = new khiter_t();
		if (!ModernizedCProgram.writer.getReused()) {
			return ((Object)0);
		} 
		hash_pos = oid.kh_get_oid_map(ModernizedCProgram.writer.getReused());
		if (hash_pos >= ((ModernizedCProgram.writer.getReused()).getN_buckets())) {
			return ((Object)0);
		} 
		return ((ModernizedCProgram.writer.getReused()).getVals()[hash_pos]);
	}
	public Object[] getBuffer() {
		return buffer;
	}
	public void setBuffer(Object[] newBuffer) {
		buffer = newBuffer;
	}
	public Object getBuffer_size() {
		return buffer_size;
	}
	public void setBuffer_size(Object newBuffer_size) {
		buffer_size = newBuffer_size;
	}
	public Object getAlloc_size() {
		return alloc_size;
	}
	public void setAlloc_size(Object newAlloc_size) {
		alloc_size = newAlloc_size;
	}
	public Object getBit_size() {
		return bit_size;
	}
	public void setBit_size(Object newBit_size) {
		bit_size = newBit_size;
	}
	public Object getRlw() {
		return rlw;
	}
	public void setRlw(Object newRlw) {
		rlw = newRlw;
	}
}
/**
 * Free all the memory of the bitmap
 */
/**
 * Direct word access
 */
