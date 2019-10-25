package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution. The terms
 * are also available at https://curl.haxx.se/docs/copyright.html.
 *
 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
 * copies of the Software, and permit persons to whom the Software is
 * furnished to do so, under the terms of the COPYING file.
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied.
 *
 ***************************************************************************/
/* Hash function prototype */
/*
   Comparator function prototype. Compares two keys.
*/
public class curl_hash {
	private Object table;
	private Object hash_func;
	private Object comp_func;
	private Object dtor;
	private int slots;
	private Object size;
	
	public curl_hash(Object table, Object hash_func, Object comp_func, Object dtor, int slots, Object size) {
		setTable(table);
		setHash_func(hash_func);
		setComp_func(comp_func);
		setDtor(dtor);
		setSlots(slots);
		setSize(size);
	}
	public curl_hash() {
	}
	
	public Object getTable() {
		return table;
	}
	public void setTable(Object newTable) {
		table = newTable;
	}
	public Object getHash_func() {
		return hash_func;
	}
	public void setHash_func(Object newHash_func) {
		hash_func = newHash_func;
	}
	public Object getComp_func() {
		return comp_func;
	}
	public void setComp_func(Object newComp_func) {
		comp_func = newComp_func;
	}
	public Object getDtor() {
		return dtor;
	}
	public void setDtor(Object newDtor) {
		dtor = newDtor;
	}
	public int getSlots() {
		return slots;
	}
	public void setSlots(int newSlots) {
		slots = newSlots;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
