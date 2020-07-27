package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2018, Daniel Stenberg, <daniel@haxx.se>, et al.
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
/* <DESC>
 * HTTP/2 server push. Receive all data in memory.
 * </DESC>
 */
/* somewhat unix-specific */
/* curl stuff */
public class Memory {
	private byte[] memory;
	private Object size;
	
	public Memory(byte[] memory, Object size) {
		setMemory(memory);
		setSize(size);
	}
	public Memory() {
	}
	
	public void init_memory() {
		this.setMemory(/*Error: Function owner not recognized*/malloc(/* grown as needed with realloc */1));
		this.setSize(/* no data at this point */0);
	}
	public byte[] getMemory() {
		return memory;
	}
	public void setMemory(byte[] newMemory) {
		memory = newMemory;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}
