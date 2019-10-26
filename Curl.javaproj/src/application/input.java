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
 * Multiplexed HTTP/2 uploads over a single connection
 * </DESC>
 */
/* somewhat unix-specific */
/* curl stuff */
/* This little trick will just make sure that we don't enable pipelining for
   libcurls old enough to not have this symbol. It is _not_ defined to zero in
   a recent libcurl header. */
/* This little trick will just make sure that we don't enable pipelining for
   libcurls old enough to not have this symbol. It is _not_ defined to zero in
   a recent libcurl header. */
public class input {
	private _iobuf in;
	private Object bytes_read;
	private Object hnd;
	private int num;
	
	public input(_iobuf in, Object bytes_read, Object hnd, int num) {
		setIn(in);
		setBytes_read(bytes_read);
		setHnd(hnd);
		setNum(num);
	}
	public input() {
	}
	
	public _iobuf getIn() {
		return in;
	}
	public void setIn(_iobuf newIn) {
		in = newIn;
	}
	public Object getBytes_read() {
		return bytes_read;
	}
	public void setBytes_read(Object newBytes_read) {
		bytes_read = newBytes_read;
	}
	public Object getHnd() {
		return hnd;
	}
	public void setHnd(Object newHnd) {
		hnd = newHnd;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int newNum) {
		num = newNum;
	}
}
