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
/* The last 3 #include files should be in this order */
/* MSDOS/Windows style drive prefix, eg c: in c:foo */
/* MSDOS/Windows style drive prefix, optionally with
   * a '|' instead of ':', followed by a slash or NUL */
/* Internal representation of CURLU. Point to URL-encoded strings. */
public class Curl_URL {
	private Object scheme;
	private Object user;
	private Object password;
	private Object options;
	private Object host;
	private Object zoneid;
	private Object port;
	private Object path;
	private Object query;
	private Object fragment;
	private Object scratch;
	private Object temppath;
	private long portnum;
	
	public Curl_URL(Object scheme, Object user, Object password, Object options, Object host, Object zoneid, Object port, Object path, Object query, Object fragment, Object scratch, Object temppath, long portnum) {
		setScheme(scheme);
		setUser(user);
		setPassword(password);
		setOptions(options);
		setHost(host);
		setZoneid(zoneid);
		setPort(port);
		setPath(path);
		setQuery(query);
		setFragment(fragment);
		setScratch(scratch);
		setTemppath(temppath);
		setPortnum(portnum);
	}
	public Curl_URL() {
	}
	
	public Object getScheme() {
		return scheme;
	}
	public void setScheme(Object newScheme) {
		scheme = newScheme;
	}
	public Object getUser() {
		return user;
	}
	public void setUser(Object newUser) {
		user = newUser;
	}
	public Object getPassword() {
		return password;
	}
	public void setPassword(Object newPassword) {
		password = newPassword;
	}
	public Object getOptions() {
		return options;
	}
	public void setOptions(Object newOptions) {
		options = newOptions;
	}
	public Object getHost() {
		return host;
	}
	public void setHost(Object newHost) {
		host = newHost;
	}
	public Object getZoneid() {
		return zoneid;
	}
	public void setZoneid(Object newZoneid) {
		zoneid = newZoneid;
	}
	public Object getPort() {
		return port;
	}
	public void setPort(Object newPort) {
		port = newPort;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public Object getQuery() {
		return query;
	}
	public void setQuery(Object newQuery) {
		query = newQuery;
	}
	public Object getFragment() {
		return fragment;
	}
	public void setFragment(Object newFragment) {
		fragment = newFragment;
	}
	public Object getScratch() {
		return scratch;
	}
	public void setScratch(Object newScratch) {
		scratch = newScratch;
	}
	public Object getTemppath() {
		return temppath;
	}
	public void setTemppath(Object newTemppath) {
		temppath = newTemppath;
	}
	public long getPortnum() {
		return portnum;
	}
	public void setPortnum(long newPortnum) {
		portnum = newPortnum;
	}
}
