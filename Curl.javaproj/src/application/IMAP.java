package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 2009 - 2017, Daniel Stenberg, <daniel@haxx.se>, et al.
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
 * IMAP unique setup
 ***************************************************************************/
/* do nothing state, stops the state machine */
/* waiting for the initial greeting immediately after
                        a connect */
/* asynchronously upgrade the connection to SSL/TLS
                       (multi mode only) */
/* never used */
/* This IMAP struct is used in the Curl_easy. All IMAP data that is
   connection-oriented must be in imap_conn to properly deal with the fact that
   perhaps the Curl_easy is changed between the times the connection is
   used. */
public class IMAP {
	private  transfer;
	private Object mailbox;
	private Object uidvalidity;
	private Object uid;
	private Object mindex;
	private Object section;
	private Object partial;
	private Object query;
	private Object custom;
	private Object custom_params;
	
	public IMAP( transfer, Object mailbox, Object uidvalidity, Object uid, Object mindex, Object section, Object partial, Object query, Object custom, Object custom_params) {
		setTransfer(transfer);
		setMailbox(mailbox);
		setUidvalidity(uidvalidity);
		setUid(uid);
		setMindex(mindex);
		setSection(section);
		setPartial(partial);
		setQuery(query);
		setCustom(custom);
		setCustom_params(custom_params);
	}
	public IMAP() {
	}
	
	public  getTransfer() {
		return transfer;
	}
	public void setTransfer( newTransfer) {
		transfer = newTransfer;
	}
	public Object getMailbox() {
		return mailbox;
	}
	public void setMailbox(Object newMailbox) {
		mailbox = newMailbox;
	}
	public Object getUidvalidity() {
		return uidvalidity;
	}
	public void setUidvalidity(Object newUidvalidity) {
		uidvalidity = newUidvalidity;
	}
	public Object getUid() {
		return uid;
	}
	public void setUid(Object newUid) {
		uid = newUid;
	}
	public Object getMindex() {
		return mindex;
	}
	public void setMindex(Object newMindex) {
		mindex = newMindex;
	}
	public Object getSection() {
		return section;
	}
	public void setSection(Object newSection) {
		section = newSection;
	}
	public Object getPartial() {
		return partial;
	}
	public void setPartial(Object newPartial) {
		partial = newPartial;
	}
	public Object getQuery() {
		return query;
	}
	public void setQuery(Object newQuery) {
		query = newQuery;
	}
	public Object getCustom() {
		return custom;
	}
	public void setCustom(Object newCustom) {
		custom = newCustom;
	}
	public Object getCustom_params() {
		return custom_params;
	}
	public void setCustom_params(Object newCustom_params) {
		custom_params = newCustom_params;
	}
}
