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
	private contenc_writer_s downstream;
	private Object params;
	
	public contenc_writer_s(Object handler, contenc_writer_s downstream, Object params) {
		setHandler(handler);
		setDownstream(downstream);
		setParams(params);
	}
	public contenc_writer_s() {
	}
	
	/* Create an unencoding writer stage using the given handler. */
	public contenc_writer_s new_unencoding_writer(connectdata conn, Object handler) {
		size_t sz = ((size_t)((contenc_writer)0).getParams()) + handler.getParamsize();
		contenc_writer writer = (contenc_writer)/*Error: Function owner not recognized*/Curl_ccalloc(1, sz);
		if (writer) {
			writer.setHandler(handler);
			writer.setDownstream(downstream);
			if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(conn, writer)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(writer);
				writer = ((Object)0);
			} 
		} 
		return writer;
	}
	public Object getHandler() {
		return handler;
	}
	public void setHandler(Object newHandler) {
		handler = newHandler;
	}
	public contenc_writer_s getDownstream() {
		return downstream;
	}
	public void setDownstream(contenc_writer_s newDownstream) {
		downstream = newDownstream;
	}
	public Object getParams() {
		return params;
	}
	public void setParams(Object newParams) {
		params = newParams;
	}
}
