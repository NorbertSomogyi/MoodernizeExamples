package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 2009 - 2014, Daniel Stenberg, <daniel@haxx.se>, et al.
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
 * SMTP unique setup
 ***************************************************************************/
/* do nothing state, stops the state machine */
/* waiting for the initial greeting immediately after
                       a connect */
/* asynchronously upgrade the connection to SSL/TLS
                       (multi mode only) */
/* VRFY, EXPN, NOOP, RSET and HELP */
/* MAIL FROM */
/* RCPT TO */
/* never used */
/* This SMTP struct is used in the Curl_easy. All SMTP data that is
   connection-oriented must be in smtp_conn to properly deal with the fact that
   perhaps the Curl_easy is changed between the times the connection is
   used. */
public class SMTP {
	private  transfer;
	private Byte custom;
	private curl_slist rcpt;
	private Object eob;
	private  trailing_crlf;
	
	public SMTP( transfer, Byte custom, curl_slist rcpt, Object eob,  trailing_crlf) {
		setTransfer(transfer);
		setCustom(custom);
		setRcpt(rcpt);
		setEob(eob);
		setTrailing_crlf(trailing_crlf);
	}
	public SMTP() {
	}
	
	public  getTransfer() {
		return transfer;
	}
	public void setTransfer( newTransfer) {
		transfer = newTransfer;
	}
	public Byte getCustom() {
		return custom;
	}
	public void setCustom(Byte newCustom) {
		custom = newCustom;
	}
	public curl_slist getRcpt() {
		return rcpt;
	}
	public void setRcpt(curl_slist newRcpt) {
		rcpt = newRcpt;
	}
	public Object getEob() {
		return eob;
	}
	public void setEob(Object newEob) {
		eob = newEob;
	}
	public  getTrailing_crlf() {
		return trailing_crlf;
	}
	public void setTrailing_crlf( newTrailing_crlf) {
		trailing_crlf = newTrailing_crlf;
	}
}
