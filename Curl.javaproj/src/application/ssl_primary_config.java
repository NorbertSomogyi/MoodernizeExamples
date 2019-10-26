package application;

/* setup for this session */
public class ssl_primary_config {
	private long version;
	private long version_max;
	private Byte CApath;
	private Byte CAfile;
	private Byte clientcert;
	private Byte random_file;
	private Byte egdsocket;
	private Byte cipher_list;
	private Byte cipher_list13;
	private Byte pinned_key;
	private Object verifypeer;
	private Object verifyhost;
	private Object verifystatus;
	private Object sessionid;
	
	public ssl_primary_config(long version, long version_max, Byte CApath, Byte CAfile, Byte clientcert, Byte random_file, Byte egdsocket, Byte cipher_list, Byte cipher_list13, Byte pinned_key, Object verifypeer, Object verifyhost, Object verifystatus, Object sessionid) {
		setVersion(version);
		setVersion_max(version_max);
		setCApath(CApath);
		setCAfile(CAfile);
		setClientcert(clientcert);
		setRandom_file(random_file);
		setEgdsocket(egdsocket);
		setCipher_list(cipher_list);
		setCipher_list13(cipher_list13);
		setPinned_key(pinned_key);
		setVerifypeer(verifypeer);
		setVerifyhost(verifyhost);
		setVerifystatus(verifystatus);
		setSessionid(sessionid);
	}
	public ssl_primary_config() {
	}
	
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
	/* This file is for implementing all "generic" SSL functions that all libcurl
	   internals should use. It is then responsible for calling the proper
	   "backend" function.
	
	   SSL-functions in libcurl should call functions in this source file, and not
	   to any specific SSL-layer.
	
	   Curl_ssl_ - prefix for generic ones
	
	   Note that this source code uses the functions of the configured SSL
	   backend via the global Curl_ssl instance.
	
	   "SSL/TLS Strong Encryption: An Introduction"
	   https://httpd.apache.org/docs/2.0/ssl/ssl_intro.html
	*/
	/* generic SSL protos etc */
	/* The last #include files should be: */
	/* convenience macro to check if this handle is using a shared SSL session */
	public  Curl_ssl_config_matches(ssl_primary_config needle) {
		long generatedVersion = needle.getVersion();
		long generatedVersion_max = needle.getVersion_max();
		Object generatedVerifypeer = needle.getVerifypeer();
		Object generatedVerifyhost = needle.getVerifyhost();
		Object generatedVerifystatus = needle.getVerifystatus();
		Byte generatedCApath = needle.getCApath();
		Byte generatedCAfile = needle.getCAfile();
		Byte generatedClientcert = needle.getClientcert();
		Byte generatedRandom_file = needle.getRandom_file();
		Byte generatedEgdsocket = needle.getEgdsocket();
		Byte generatedCipher_list = needle.getCipher_list();
		Byte generatedCipher_list13 = needle.getCipher_list13();
		Byte generatedPinned_key = needle.getPinned_key();
		if ((ModernizedCProgram.data.getVersion() == generatedVersion) && (ModernizedCProgram.data.getVersion_max() == generatedVersion_max) && (ModernizedCProgram.data.getVerifypeer() == generatedVerifypeer) && (ModernizedCProgram.data.getVerifyhost() == generatedVerifyhost) && (ModernizedCProgram.data.getVerifystatus() == generatedVerifystatus) && ModernizedCProgram.Curl_safe_strcasecompare(ModernizedCProgram.data.getCApath(), generatedCApath) && ModernizedCProgram.Curl_safe_strcasecompare(ModernizedCProgram.data.getCAfile(), generatedCAfile) && ModernizedCProgram.Curl_safe_strcasecompare(ModernizedCProgram.data.getClientcert(), generatedClientcert) && ModernizedCProgram.Curl_safe_strcasecompare(ModernizedCProgram.data.getRandom_file(), generatedRandom_file) && ModernizedCProgram.Curl_safe_strcasecompare(ModernizedCProgram.data.getEgdsocket(), generatedEgdsocket) && ModernizedCProgram.Curl_safe_strcasecompare(ModernizedCProgram.data.getCipher_list(), generatedCipher_list) && ModernizedCProgram.Curl_safe_strcasecompare(ModernizedCProgram.data.getCipher_list13(), generatedCipher_list13) && ModernizedCProgram.Curl_safe_strcasecompare(ModernizedCProgram.data.getPinned_key(), generatedPinned_key)) {
			return 1;
		} 
		return 0;
	}
	public  Curl_clone_primary_ssl_config(ssl_primary_config dest) {
		long generatedVersion = this.getVersion();
		dest.setVersion(generatedVersion);
		long generatedVersion_max = this.getVersion_max();
		dest.setVersion_max(generatedVersion_max);
		Object generatedVerifypeer = this.getVerifypeer();
		dest.setVerifypeer(generatedVerifypeer);
		Object generatedVerifyhost = this.getVerifyhost();
		dest.setVerifyhost(generatedVerifyhost);
		Object generatedVerifystatus = this.getVerifystatus();
		dest.setVerifystatus(generatedVerifystatus);
		Object generatedSessionid = this.getSessionid();
		dest.setSessionid(generatedSessionid);
		Byte generatedCApath = this.getCApath();
		if (generatedCApath) {
			dest.setCApath(.Curl_cstrdup(generatedCApath));
			if (!generatedCApath) {
				return 0;
			} 
		} else {
				dest.setCApath(((Object)0));
		} 
		;
		Byte generatedCAfile = this.getCAfile();
		if (generatedCAfile) {
			dest.setCAfile(.Curl_cstrdup(generatedCAfile));
			if (!generatedCAfile) {
				return 0;
			} 
		} else {
				dest.setCAfile(((Object)0));
		} 
		;
		Byte generatedClientcert = this.getClientcert();
		if (generatedClientcert) {
			dest.setClientcert(.Curl_cstrdup(generatedClientcert));
			if (!generatedClientcert) {
				return 0;
			} 
		} else {
				dest.setClientcert(((Object)0));
		} 
		;
		Byte generatedRandom_file = this.getRandom_file();
		if (generatedRandom_file) {
			dest.setRandom_file(.Curl_cstrdup(generatedRandom_file));
			if (!generatedRandom_file) {
				return 0;
			} 
		} else {
				dest.setRandom_file(((Object)0));
		} 
		;
		Byte generatedEgdsocket = this.getEgdsocket();
		if (generatedEgdsocket) {
			dest.setEgdsocket(.Curl_cstrdup(generatedEgdsocket));
			if (!generatedEgdsocket) {
				return 0;
			} 
		} else {
				dest.setEgdsocket(((Object)0));
		} 
		;
		Byte generatedCipher_list = this.getCipher_list();
		if (generatedCipher_list) {
			dest.setCipher_list(.Curl_cstrdup(generatedCipher_list));
			if (!generatedCipher_list) {
				return 0;
			} 
		} else {
				dest.setCipher_list(((Object)0));
		} 
		;
		Byte generatedCipher_list13 = this.getCipher_list13();
		if (generatedCipher_list13) {
			dest.setCipher_list13(.Curl_cstrdup(generatedCipher_list13));
			if (!generatedCipher_list13) {
				return 0;
			} 
		} else {
				dest.setCipher_list13(((Object)0));
		} 
		;
		Byte generatedPinned_key = this.getPinned_key();
		if (generatedPinned_key) {
			dest.setPinned_key(.Curl_cstrdup(generatedPinned_key));
			if (!generatedPinned_key) {
				return 0;
			} 
		} else {
				dest.setPinned_key(((Object)0));
		} 
		;
		return 1;
	}
	public void Curl_free_primary_ssl_config() {
		Byte generatedCApath = this.getCApath();
		do {
			.Curl_cfree((generatedCApath));
			(generatedCApath) = ((Object)0);
		} while (0);
		Byte generatedCAfile = this.getCAfile();
		do {
			.Curl_cfree((generatedCAfile));
			(generatedCAfile) = ((Object)0);
		} while (0);
		Byte generatedClientcert = this.getClientcert();
		do {
			.Curl_cfree((generatedClientcert));
			(generatedClientcert) = ((Object)0);
		} while (0);
		Byte generatedRandom_file = this.getRandom_file();
		do {
			.Curl_cfree((generatedRandom_file));
			(generatedRandom_file) = ((Object)0);
		} while (0);
		Byte generatedEgdsocket = this.getEgdsocket();
		do {
			.Curl_cfree((generatedEgdsocket));
			(generatedEgdsocket) = ((Object)0);
		} while (0);
		Byte generatedCipher_list = this.getCipher_list();
		do {
			.Curl_cfree((generatedCipher_list));
			(generatedCipher_list) = ((Object)0);
		} while (0);
		Byte generatedCipher_list13 = this.getCipher_list13();
		do {
			.Curl_cfree((generatedCipher_list13));
			(generatedCipher_list13) = ((Object)0);
		} while (0);
		Byte generatedPinned_key = this.getPinned_key();
		do {
			.Curl_cfree((generatedPinned_key));
			(generatedPinned_key) = ((Object)0);
		} while (0);
	}
	public long getVersion() {
		return version;
	}
	public void setVersion(long newVersion) {
		version = newVersion;
	}
	public long getVersion_max() {
		return version_max;
	}
	public void setVersion_max(long newVersion_max) {
		version_max = newVersion_max;
	}
	public Byte getCApath() {
		return CApath;
	}
	public void setCApath(Byte newCApath) {
		CApath = newCApath;
	}
	public Byte getCAfile() {
		return CAfile;
	}
	public void setCAfile(Byte newCAfile) {
		CAfile = newCAfile;
	}
	public Byte getClientcert() {
		return clientcert;
	}
	public void setClientcert(Byte newClientcert) {
		clientcert = newClientcert;
	}
	public Byte getRandom_file() {
		return random_file;
	}
	public void setRandom_file(Byte newRandom_file) {
		random_file = newRandom_file;
	}
	public Byte getEgdsocket() {
		return egdsocket;
	}
	public void setEgdsocket(Byte newEgdsocket) {
		egdsocket = newEgdsocket;
	}
	public Byte getCipher_list() {
		return cipher_list;
	}
	public void setCipher_list(Byte newCipher_list) {
		cipher_list = newCipher_list;
	}
	public Byte getCipher_list13() {
		return cipher_list13;
	}
	public void setCipher_list13(Byte newCipher_list13) {
		cipher_list13 = newCipher_list13;
	}
	public Byte getPinned_key() {
		return pinned_key;
	}
	public void setPinned_key(Byte newPinned_key) {
		pinned_key = newPinned_key;
	}
	public Object getVerifypeer() {
		return verifypeer;
	}
	public void setVerifypeer(Object newVerifypeer) {
		verifypeer = newVerifypeer;
	}
	public Object getVerifyhost() {
		return verifyhost;
	}
	public void setVerifyhost(Object newVerifyhost) {
		verifyhost = newVerifyhost;
	}
	public Object getVerifystatus() {
		return verifystatus;
	}
	public void setVerifystatus(Object newVerifystatus) {
		verifystatus = newVerifystatus;
	}
	public Object getSessionid() {
		return sessionid;
	}
	public void setSessionid(Object newSessionid) {
		sessionid = newSessionid;
	}
}
