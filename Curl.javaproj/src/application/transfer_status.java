package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2017, Daniel Stenberg, <daniel@haxx.se>, et al.
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
public class transfer_status {
	private Object easy;
	private int halted;
	private int counter;
	private int please;
	
	public transfer_status(Object easy, int halted, int counter, int please) {
		setEasy(easy);
		setHalted(halted);
		setCounter(counter);
		setPlease(please);
	}
	public transfer_status() {
	}
	
	public Object getEasy() {
		return easy;
	}
	public void setEasy(Object newEasy) {
		easy = newEasy;
	}
	public int getHalted() {
		return halted;
	}
	public void setHalted(int newHalted) {
		halted = newHalted;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int newCounter) {
		counter = newCounter;
	}
	public int getPlease() {
		return please;
	}
	public void setPlease(int newPlease) {
		please = newPlease;
	}
}
