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
	private Curl_easy closure_handle;
	
	public conncache(curl_hash hash, Object num_conn, long next_connection_id, curltime last_cleanup, Curl_easy closure_handle) {
		setHash(hash);
		setNum_conn(num_conn);
		setNext_connection_id(next_connection_id);
		setLast_cleanup(last_cleanup);
		setClosure_handle(closure_handle);
	}
	public conncache() {
	}
	
	public Object upkeep(Object data) {
		ModernizedCProgram.Curl_conncache_foreach(/* Loop over every connection and make connection alive. */data, conn_cache, data, conn_upkeep);
		return CURLE_OK/*
		 * Performs connection upkeep for the given session handle.
		 */;
	}
	public int Curl_conncache_init(int size) {
		int rc;
		Curl_easy curl_easy = new Curl_easy();
		this.setClosure_handle(curl_easy.curl_easy_init());
		Curl_easy generatedClosure_handle = this.getClosure_handle();
		if (!generatedClosure_handle) {
			return /* bad */1;
		} 
		curl_hash generatedHash = this.getHash();
		rc = generatedHash.Curl_hash_init(size, ModernizedCProgram.Curl_hash_str, ModernizedCProgram.Curl_str_key_compare, free_bundle_hash_entry);
		Object generatedState = generatedClosure_handle.getState();
		if (rc) {
			generatedClosure_handle.Curl_close();
			this.setClosure_handle(((Object)0));
		} else {
				generatedState.setConn_cache(connc);
		} 
		return rc;
	}
	public void Curl_conncache_destroy() {
		curl_hash generatedHash = this.getHash();
		if (connc) {
			generatedHash.Curl_hash_destroy();
		} 
	}
	public void Curl_conncache_close_all_connections() {
		connectdata conn = new connectdata();
		connectdata connectdata = new connectdata();
		conn = connectdata.conncache_find_first_connection(connc);
		Curl_easy generatedClosure_handle = this.getClosure_handle();
		while (conn) {
			;
			conn.setData(generatedClosure_handle);
			do {
			} while (0);
			conn.Curl_conncontrol(/* This will remove the connection from the cache */1);
			(Object)ModernizedCProgram.Curl_disconnect(generatedClosure_handle, conn, 0);
			do {
			} while (0);
			conn = connectdata.conncache_find_first_connection(connc);
		}
		Object generatedDns = generatedClosure_handle.getDns();
		if (generatedClosure_handle) {
			;
			do {
			} while (0);
			ModernizedCProgram.Curl_hostcache_clean(generatedClosure_handle, generatedDns.getHostcache());
			generatedClosure_handle.Curl_close();
			do {
			} while (0/* Useful for debugging the connection cache */);
		} 
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
	public Curl_easy getClosure_handle() {
		return closure_handle;
	}
	public void setClosure_handle(Curl_easy newClosure_handle) {
		closure_handle = newClosure_handle;
	}
}
