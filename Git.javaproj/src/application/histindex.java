package application;

/*
 * Copyright (C) 2010, Google Inc.
 * and other copyright owners as documented in JGit's IP log.
 *
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Distribution License v1.0 which
 * accompanies this distribution, is reproduced below, and is
 * available at http://www.eclipse.org/org/documents/edl-v10.php
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or
 * without modification, are permitted provided that the following
 * conditions are met:
 *
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above
 *   copyright notice, this list of conditions and the following
 *   disclaimer in the documentation and/or other materials provided
 *   with the distribution.
 *
 * - Neither the name of the Eclipse Foundation, Inc. nor the
 *   names of its contributors may be used to endorse or promote
 *   products derived from this software without specific prior
 *   written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
public class histindex {
	private record[][] records;
	private record[][] line_map;
	private s_chastore rcha;
	private int[] next_ptrs;
	private int table_bits;
	private int records_size;
	private int line_map_size;
	private int max_chain_length;
	private int key_shift;
	private int ptr_shift;
	private int cnt;
	private int has_common;
	private s_xdfenv env;
	private Object xpp;
	
	public histindex(record[][] records, record[][] line_map, s_chastore rcha, int[] next_ptrs, int table_bits, int records_size, int line_map_size, int max_chain_length, int key_shift, int ptr_shift, int cnt, int has_common, s_xdfenv env, Object xpp) {
		setRecords(records);
		setLine_map(line_map);
		setRcha(rcha);
		setNext_ptrs(next_ptrs);
		setTable_bits(table_bits);
		setRecords_size(records_size);
		setLine_map_size(line_map_size);
		setMax_chain_length(max_chain_length);
		setKey_shift(key_shift);
		setPtr_shift(ptr_shift);
		setCnt(cnt);
		setHas_common(has_common);
		setEnv(env);
		setXpp(xpp);
	}
	public histindex() {
	}
	
	public int scanA(int line1, int count1) {
		int ptr;
		int tbl_idx;
		int chain_len;
		record rec_chain = new record();
		record rec = new record();
		s_xdfenv generatedEnv = this.getEnv();
		s_xdfile generatedXdf1 = generatedEnv.getXdf1();
		s_xrecord[][] generatedRecs = generatedXdf1.getRecs();
		int generatedTable_bits = this.getTable_bits();
		record[][] generatedRecords = this.getRecords();
		Object generatedXpp = this.getXpp();
		int generatedPtr = rec.getPtr();
		int[] generatedNext_ptrs = this.getNext_ptrs();
		int generatedPtr_shift = this.getPtr_shift();
		int generatedCnt = rec.getCnt();
		record[][] generatedLine_map = this.getLine_map();
		record generatedNext = rec.getNext();
		int generatedMax_chain_length = this.getMax_chain_length();
		s_chastore generatedRcha = this.getRcha();
		return 0;
	}
	public void free_index() {
		record[][] generatedRecords = this.getRecords();
		ModernizedCProgram.free(generatedRecords);
		record[][] generatedLine_map = this.getLine_map();
		ModernizedCProgram.free(generatedLine_map);
		int[] generatedNext_ptrs = this.getNext_ptrs();
		ModernizedCProgram.free(generatedNext_ptrs);
		s_chastore generatedRcha = this.getRcha();
		generatedRcha.xdl_cha_free();
	}
	public record[][] getRecords() {
		return records;
	}
	public void setRecords(record[][] newRecords) {
		records = newRecords;
	}
	public record[][] getLine_map() {
		return line_map;
	}
	public void setLine_map(record[][] newLine_map) {
		line_map = newLine_map;
	}
	public s_chastore getRcha() {
		return rcha;
	}
	public void setRcha(s_chastore newRcha) {
		rcha = newRcha;
	}
	public int[] getNext_ptrs() {
		return next_ptrs;
	}
	public void setNext_ptrs(int[] newNext_ptrs) {
		next_ptrs = newNext_ptrs;
	}
	public int getTable_bits() {
		return table_bits;
	}
	public void setTable_bits(int newTable_bits) {
		table_bits = newTable_bits;
	}
	public int getRecords_size() {
		return records_size;
	}
	public void setRecords_size(int newRecords_size) {
		records_size = newRecords_size;
	}
	public int getLine_map_size() {
		return line_map_size;
	}
	public void setLine_map_size(int newLine_map_size) {
		line_map_size = newLine_map_size;
	}
	public int getMax_chain_length() {
		return max_chain_length;
	}
	public void setMax_chain_length(int newMax_chain_length) {
		max_chain_length = newMax_chain_length;
	}
	public int getKey_shift() {
		return key_shift;
	}
	public void setKey_shift(int newKey_shift) {
		key_shift = newKey_shift;
	}
	public int getPtr_shift() {
		return ptr_shift;
	}
	public void setPtr_shift(int newPtr_shift) {
		ptr_shift = newPtr_shift;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int newCnt) {
		cnt = newCnt;
	}
	public int getHas_common() {
		return has_common;
	}
	public void setHas_common(int newHas_common) {
		has_common = newHas_common;
	}
	public s_xdfenv getEnv() {
		return env;
	}
	public void setEnv(s_xdfenv newEnv) {
		env = newEnv;
	}
	public Object getXpp() {
		return xpp;
	}
	public void setXpp(Object newXpp) {
		xpp = newXpp;
	}
}
