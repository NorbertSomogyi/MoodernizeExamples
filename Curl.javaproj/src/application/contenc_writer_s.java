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
/* Decoding writer. */
public class contenc_writer_s {
	private Object handler;
	private Object downstream;
	private Object params;
	
	public contenc_writer_s(Object handler, Object downstream, Object params) {
		setHandler(handler);
		setDownstream(downstream);
		setParams(params);
	}
	public contenc_writer_s() {
	}
	
	public Object getHandler() {
		return handler;
	}
	public void setHandler(Object newHandler) {
		handler = newHandler;
	}
	public Object getDownstream() {
		return downstream;
	}
	public void setDownstream(Object newDownstream) {
		downstream = newDownstream;
	}
	public Object getParams() {
		return params;
	}
	public void setParams(Object newParams) {
		params = newParams;
	}
}
