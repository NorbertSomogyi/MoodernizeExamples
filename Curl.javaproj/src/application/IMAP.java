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
	private Byte mailbox;
	private Byte uidvalidity;
	private Byte uid;
	private Byte mindex;
	private Byte section;
	private Byte partial;
	private Byte query;
	private Byte custom;
	private Byte custom_params;
	
	public IMAP( transfer, Byte mailbox, Byte uidvalidity, Byte uid, Byte mindex, Byte section, Byte partial, Byte query, Byte custom, Byte custom_params) {
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
	public Byte getMailbox() {
		return mailbox;
	}
	public void setMailbox(Byte newMailbox) {
		mailbox = newMailbox;
	}
	public Byte getUidvalidity() {
		return uidvalidity;
	}
	public void setUidvalidity(Byte newUidvalidity) {
		uidvalidity = newUidvalidity;
	}
	public Byte getUid() {
		return uid;
	}
	public void setUid(Byte newUid) {
		uid = newUid;
	}
	public Byte getMindex() {
		return mindex;
	}
	public void setMindex(Byte newMindex) {
		mindex = newMindex;
	}
	public Byte getSection() {
		return section;
	}
	public void setSection(Byte newSection) {
		section = newSection;
	}
	public Byte getPartial() {
		return partial;
	}
	public void setPartial(Byte newPartial) {
		partial = newPartial;
	}
	public Byte getQuery() {
		return query;
	}
	public void setQuery(Byte newQuery) {
		query = newQuery;
	}
	public Byte getCustom() {
		return custom;
	}
	public void setCustom(Byte newCustom) {
		custom = newCustom;
	}
	public Byte getCustom_params() {
		return custom_params;
	}
	public void setCustom_params(Byte newCustom_params) {
		custom_params = newCustom_params;
	}
}
