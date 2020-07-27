package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 2009 - 2015, Daniel Stenberg, <daniel@haxx.se>, et al.
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
/****************************************************************************
 * POP3 unique setup
 ***************************************************************************/
/* do nothing state, stops the state machine */
/* waiting for the initial greeting immediately after
                        a connect */
/* asynchronously upgrade the connection to SSL/TLS
                       (multi mode only) */
/* never used */
/* This POP3 struct is used in the Curl_easy. All POP3 data that is
   connection-oriented must be in pop3_conn to properly deal with the fact that
   perhaps the Curl_easy is changed between the times the connection is
   used. */
public class POP3 {
	private  transfer;
	private byte[] id;
	private byte[] custom;
	
	public POP3( transfer, byte[] id, byte[] custom) {
		setTransfer(transfer);
		setId(id);
		setCustom(custom);
	}
	public POP3() {
	}
	
	public  getTransfer() {
		return transfer;
	}
	public void setTransfer( newTransfer) {
		transfer = newTransfer;
	}
	public byte[] getId() {
		return id;
	}
	public void setId(byte[] newId) {
		id = newId;
	}
	public byte[] getCustom() {
		return custom;
	}
	public void setCustom(byte[] newCustom) {
		custom = newCustom;
	}
}
