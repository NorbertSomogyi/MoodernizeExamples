package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2016, Daniel Stenberg, <daniel@haxx.se>, et al.
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
 * This test sends data with CURLOPT_KEEP_SENDING_ON_ERROR.
 * The server responds with an early error response.
 * The test is successful if the connection can be reused for the next request,
 * because this implies that the data has been sent completely to the server.
 */
public class cb_data {
	private Object easy_handle;
	private int response_received;
	private int paused;
	private Object remaining_bytes;
	
	public cb_data(Object easy_handle, int response_received, int paused, Object remaining_bytes) {
		setEasy_handle(easy_handle);
		setResponse_received(response_received);
		setPaused(paused);
		setRemaining_bytes(remaining_bytes);
	}
	public cb_data() {
	}
	
	public void reset_data(Object curl) {
		ModernizedCProgram.data.setEasy_handle(curl);
		ModernizedCProgram.data.setResponse_received(0);
		ModernizedCProgram.data.setPaused(0);
		ModernizedCProgram.data.setRemaining_bytes(3);
	}
	public Object getEasy_handle() {
		return easy_handle;
	}
	public void setEasy_handle(Object newEasy_handle) {
		easy_handle = newEasy_handle;
	}
	public int getResponse_received() {
		return response_received;
	}
	public void setResponse_received(int newResponse_received) {
		response_received = newResponse_received;
	}
	public int getPaused() {
		return paused;
	}
	public void setPaused(int newPaused) {
		paused = newPaused;
	}
	public Object getRemaining_bytes() {
		return remaining_bytes;
	}
	public void setRemaining_bytes(Object newRemaining_bytes) {
		remaining_bytes = newRemaining_bytes;
	}
}
