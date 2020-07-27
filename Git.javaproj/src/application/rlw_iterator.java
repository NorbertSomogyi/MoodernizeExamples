package application;

public class rlw_iterator {
	private Object[] buffer;
	private Object size;
	private Object pointer;
	private Object literal_word_start;
	private  rlw;
	
	public rlw_iterator(Object[] buffer, Object size, Object pointer, Object literal_word_start,  rlw) {
		setBuffer(buffer);
		setSize(size);
		setPointer(pointer);
		setLiteral_word_start(literal_word_start);
		setRlw(rlw);
	}
	public rlw_iterator() {
	}
	
	public Object rlwit_word_size() {
		 generatedRlw = this.getRlw();
		Object generatedRunning_len = generatedRlw.getRunning_len();
		Object generatedLiteral_words = generatedRlw.getLiteral_words();
		return generatedRunning_len + generatedLiteral_words;
	}
	public Object rlwit_literal_words() {
		Object generatedPointer = this.getPointer();
		 generatedRlw = this.getRlw();
		Object generatedLiteral_words = generatedRlw.getLiteral_words();
		return generatedPointer - generatedLiteral_words;
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
	public int next_word() {
		Object generatedPointer = this.getPointer();
		Object generatedSize = this.getSize();
		if (generatedPointer >= generatedSize) {
			return 0;
		} 
		Object[] generatedBuffer = this.getBuffer();
		 generatedRlw = this.getRlw();
		generatedRlw.setWord(generatedBuffer[generatedPointer]);
		Object generatedWord = generatedRlw.getWord();
		generatedPointer += ModernizedCProgram.rlw_get_literal_words(generatedWord) + 1;
		generatedRlw.setLiteral_words(ModernizedCProgram.rlw_get_literal_words(generatedWord));
		generatedRlw.setRunning_len(ModernizedCProgram.rlw_get_running_len(generatedWord));
		generatedRlw.setRunning_bit(ModernizedCProgram.rlw_get_run_bit(generatedWord));
		generatedRlw.setLiteral_word_offset(0);
		return 1;
	}
	public void rlwit_discard_first_words(Object x) {
		 generatedRlw = this.getRlw();
		Object generatedRunning_len = generatedRlw.getRunning_len();
		Object generatedLiteral_words = generatedRlw.getLiteral_words();
		Object generatedLiteral_word_start = this.getLiteral_word_start();
		Object generatedLiteral_word_offset = generatedRlw.getLiteral_word_offset();
		while (x > 0) {
			size_t discard = new size_t();
			if (generatedRunning_len > x) {
				generatedRunning_len -= x;
				return /*Error: Unsupported expression*/;
			} 
			x -= generatedRunning_len;
			generatedRlw.setRunning_len(0);
			discard = (x > generatedLiteral_words) ? generatedLiteral_words : x;
			generatedLiteral_word_start += discard;
			generatedLiteral_words -= discard;
			x -= discard;
			if (x > 0 || it.rlwit_word_size() == 0) {
				if (!it.next_word()) {
					break;
				} 
				this.setLiteral_word_start(it.rlwit_literal_words() + generatedLiteral_word_offset);
			} 
		}
	}
	public Object[] getBuffer() {
		return buffer;
	}
	public void setBuffer(Object[] newBuffer) {
		buffer = newBuffer;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getPointer() {
		return pointer;
	}
	public void setPointer(Object newPointer) {
		pointer = newPointer;
	}
	public Object getLiteral_word_start() {
		return literal_word_start;
	}
	public void setLiteral_word_start(Object newLiteral_word_start) {
		literal_word_start = newLiteral_word_start;
	}
	public  getRlw() {
		return rlw;
	}
	public void setRlw( newRlw) {
		rlw = newRlw;
	}
}
