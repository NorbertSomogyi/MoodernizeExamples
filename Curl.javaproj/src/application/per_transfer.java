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
/* first node */
public class per_transfer {
	private per_transfer next;
	private per_transfer prev;
	private OperationConfig config;
	private Object curl;
	private long retry_numretries;
	private long retry_sleep_default;
	private long retry_sleep;
	private timeval retrystart;
	private  metalink;
	private  metalink_next_res;
	private metalinkfile mlfile;
	private metalink_resource mlres;
	private Byte this_url;
	private Byte outfile;
	private  infdopen;
	private int infd;
	private ProgressData progressbar;
	private OutStruct outs;
	private OutStruct heads;
	private InStruct input;
	private HdrCbData hdrcbdata;
	private Object errorbuffer;
	private  added;
	private Object dltotal;
	private Object dlnow;
	private Object ultotal;
	private Object ulnow;
	private  dltotal_added;
	private  ultotal_added;
	private Byte separator_err;
	private Byte separator;
	private Byte uploadfile;
	
	public per_transfer(per_transfer next, per_transfer prev, OperationConfig config, Object curl, long retry_numretries, long retry_sleep_default, long retry_sleep, timeval retrystart,  metalink,  metalink_next_res, metalinkfile mlfile, metalink_resource mlres, Byte this_url, Byte outfile,  infdopen, int infd, ProgressData progressbar, OutStruct outs, OutStruct heads, InStruct input, HdrCbData hdrcbdata, Object errorbuffer,  added, Object dltotal, Object dlnow, Object ultotal, Object ulnow,  dltotal_added,  ultotal_added, Byte separator_err, Byte separator, Byte uploadfile) {
		setNext(next);
		setPrev(prev);
		setConfig(config);
		setCurl(curl);
		setRetry_numretries(retry_numretries);
		setRetry_sleep_default(retry_sleep_default);
		setRetry_sleep(retry_sleep);
		setRetrystart(retrystart);
		setMetalink(metalink);
		setMetalink_next_res(metalink_next_res);
		setMlfile(mlfile);
		setMlres(mlres);
		setThis_url(this_url);
		setOutfile(outfile);
		setInfdopen(infdopen);
		setInfd(infd);
		setProgressbar(progressbar);
		setOuts(outs);
		setHeads(heads);
		setInput(input);
		setHdrcbdata(hdrcbdata);
		setErrorbuffer(errorbuffer);
		setAdded(added);
		setDltotal(dltotal);
		setDlnow(dlnow);
		setUltotal(ultotal);
		setUlnow(ulnow);
		setDltotal_added(dltotal_added);
		setUltotal_added(ultotal_added);
		setSeparator_err(separator_err);
		setSeparator(separator);
		setUploadfile(uploadfile);
	}
	public per_transfer() {
	}
	
	public Object add_per_transfer() {
		per_transfer p = new per_transfer();
		p = .calloc(, 1);
		if (!p) {
			return CURLE_OUT_OF_MEMORY;
		} 
		if (!ModernizedCProgram.transfers) {
			ModernizedCProgram.transfersl = ModernizedCProgram.transfers = /* first entry */p;
		} else {
				ModernizedCProgram.transfersl.setNext(/* make the last node point to the new node */p);
				p.setPrev(/* make the new node point back to the formerly last node */ModernizedCProgram.transfersl);
				ModernizedCProgram.transfersl = /* move the last node pointer to the new entry */p;
		} 
		per = p;
		/* count total number of transfers added */ModernizedCProgram.all_xfers++;
		return CURLE_OK;
	}
	public per_transfer del_per_transfer() {
		per_transfer n = new per_transfer();
		per_transfer p = new per_transfer();
		do {
		} while (0);
		do {
		} while (0);
		do {
		} while (0);
		per_transfer generatedNext = this.getNext();
		n = generatedNext;
		per_transfer generatedPrev = this.getPrev();
		p = generatedPrev;
		if (p) {
			p.setNext(n);
		} else {
				ModernizedCProgram.transfers = n;
		} 
		if (n) {
			n.setPrev(p);
		} else {
				ModernizedCProgram.transfersl = p;
		} 
		.free(per);
		return n;
	}
	public void progress_finalize() {
		Object generatedDlnow = this.getDlnow();
		ModernizedCProgram.all_dlalready += generatedDlnow;
		Object generatedUlnow = this.getUlnow();
		ModernizedCProgram.all_ulalready += generatedUlnow;
	}
	public per_transfer getNext() {
		return next;
	}
	public void setNext(per_transfer newNext) {
		next = newNext;
	}
	public per_transfer getPrev() {
		return prev;
	}
	public void setPrev(per_transfer newPrev) {
		prev = newPrev;
	}
	public OperationConfig getConfig() {
		return config;
	}
	public void setConfig(OperationConfig newConfig) {
		config = newConfig;
	}
	public Object getCurl() {
		return curl;
	}
	public void setCurl(Object newCurl) {
		curl = newCurl;
	}
	public long getRetry_numretries() {
		return retry_numretries;
	}
	public void setRetry_numretries(long newRetry_numretries) {
		retry_numretries = newRetry_numretries;
	}
	public long getRetry_sleep_default() {
		return retry_sleep_default;
	}
	public void setRetry_sleep_default(long newRetry_sleep_default) {
		retry_sleep_default = newRetry_sleep_default;
	}
	public long getRetry_sleep() {
		return retry_sleep;
	}
	public void setRetry_sleep(long newRetry_sleep) {
		retry_sleep = newRetry_sleep;
	}
	public timeval getRetrystart() {
		return retrystart;
	}
	public void setRetrystart(timeval newRetrystart) {
		retrystart = newRetrystart;
	}
	public  getMetalink() {
		return metalink;
	}
	public void setMetalink( newMetalink) {
		metalink = newMetalink;
	}
	public  getMetalink_next_res() {
		return metalink_next_res;
	}
	public void setMetalink_next_res( newMetalink_next_res) {
		metalink_next_res = newMetalink_next_res;
	}
	public metalinkfile getMlfile() {
		return mlfile;
	}
	public void setMlfile(metalinkfile newMlfile) {
		mlfile = newMlfile;
	}
	public metalink_resource getMlres() {
		return mlres;
	}
	public void setMlres(metalink_resource newMlres) {
		mlres = newMlres;
	}
	public Byte getThis_url() {
		return this_url;
	}
	public void setThis_url(Byte newThis_url) {
		this_url = newThis_url;
	}
	public Byte getOutfile() {
		return outfile;
	}
	public void setOutfile(Byte newOutfile) {
		outfile = newOutfile;
	}
	public  getInfdopen() {
		return infdopen;
	}
	public void setInfdopen( newInfdopen) {
		infdopen = newInfdopen;
	}
	public int getInfd() {
		return infd;
	}
	public void setInfd(int newInfd) {
		infd = newInfd;
	}
	public ProgressData getProgressbar() {
		return progressbar;
	}
	public void setProgressbar(ProgressData newProgressbar) {
		progressbar = newProgressbar;
	}
	public OutStruct getOuts() {
		return outs;
	}
	public void setOuts(OutStruct newOuts) {
		outs = newOuts;
	}
	public OutStruct getHeads() {
		return heads;
	}
	public void setHeads(OutStruct newHeads) {
		heads = newHeads;
	}
	public InStruct getInput() {
		return input;
	}
	public void setInput(InStruct newInput) {
		input = newInput;
	}
	public HdrCbData getHdrcbdata() {
		return hdrcbdata;
	}
	public void setHdrcbdata(HdrCbData newHdrcbdata) {
		hdrcbdata = newHdrcbdata;
	}
	public Object getErrorbuffer() {
		return errorbuffer;
	}
	public void setErrorbuffer(Object newErrorbuffer) {
		errorbuffer = newErrorbuffer;
	}
	public  getAdded() {
		return added;
	}
	public void setAdded( newAdded) {
		added = newAdded;
	}
	public Object getDltotal() {
		return dltotal;
	}
	public void setDltotal(Object newDltotal) {
		dltotal = newDltotal;
	}
	public Object getDlnow() {
		return dlnow;
	}
	public void setDlnow(Object newDlnow) {
		dlnow = newDlnow;
	}
	public Object getUltotal() {
		return ultotal;
	}
	public void setUltotal(Object newUltotal) {
		ultotal = newUltotal;
	}
	public Object getUlnow() {
		return ulnow;
	}
	public void setUlnow(Object newUlnow) {
		ulnow = newUlnow;
	}
	public  getDltotal_added() {
		return dltotal_added;
	}
	public void setDltotal_added( newDltotal_added) {
		dltotal_added = newDltotal_added;
	}
	public  getUltotal_added() {
		return ultotal_added;
	}
	public void setUltotal_added( newUltotal_added) {
		ultotal_added = newUltotal_added;
	}
	public Byte getSeparator_err() {
		return separator_err;
	}
	public void setSeparator_err(Byte newSeparator_err) {
		separator_err = newSeparator_err;
	}
	public Byte getSeparator() {
		return separator;
	}
	public void setSeparator(Byte newSeparator) {
		separator = newSeparator;
	}
	public Byte getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(Byte newUploadfile) {
		uploadfile = newUploadfile;
	}
}
/* double linked */
/* HEADER_CURL_TOOL_OPERATE_H */
