package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 2015 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
 * Copyright (C) 2012 - 2014, Linus Nielsen Feltzing, <linus@haxx.se>
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
/*
 * All accesses to struct fields and changing of data in the connection cache
 * and connectbundles must be done with the conncache LOCKED. The cache might
 * be shared.
 */
public class conncache {
	private curl_hash hash;
	private Object num_conn;
	private long next_connection_id;
	private curltime last_cleanup;
	private Object closure_handle;
	
	public conncache(curl_hash hash, Object num_conn, long next_connection_id, curltime last_cleanup, Object closure_handle) {
		setHash(hash);
		setNum_conn(num_conn);
		setNext_connection_id(next_connection_id);
		setLast_cleanup(last_cleanup);
		setClosure_handle(closure_handle);
	}
	public conncache() {
	}
	
	public curl_hash getHash() {
		return hash;
	}
	public void setHash(curl_hash newHash) {
		hash = newHash;
	}
	public Object getNum_conn() {
		return num_conn;
	}
	public void setNum_conn(Object newNum_conn) {
		num_conn = newNum_conn;
	}
	public long getNext_connection_id() {
		return next_connection_id;
	}
	public void setNext_connection_id(long newNext_connection_id) {
		next_connection_id = newNext_connection_id;
	}
	public curltime getLast_cleanup() {
		return last_cleanup;
	}
	public void setLast_cleanup(curltime newLast_cleanup) {
		last_cleanup = newLast_cleanup;
	}
	public Object getClosure_handle() {
		return closure_handle;
	}
	public void setClosure_handle(Object newClosure_handle) {
		closure_handle = newClosure_handle;
	}
}
