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
/*
 * Definition of pollfd struct and constants for platforms lacking them.
 */
public class pollfd {
	private Object fd;
	private int events;
	private int revents;
	
	public pollfd(Object fd, int events, int revents) {
		setFd(fd);
		setEvents(events);
		setRevents(revents);
	}
	public pollfd() {
	}
	
	public int Curl_poll(int nfds, int timeout_ms) {
		timeval pending_tv = new timeval();
		timeval ptimeout = new timeval();
		fd_set fds_read = new fd_set();
		fd_set fds_write = new fd_set();
		fd_set fds_err = new fd_set();
		 maxfd = new ();
		curltime initial_tv = new curltime(0, 0);
		bool fds_none = 1;
		int i;
		int pending_ms = 0;
		int r;
		if (ufds) {
			for (i = 0; i < nfds; i++) {
				if (ufds[i].getFd() != CURL_SOCKET_BAD) {
					fds_none = 0;
					break;
				} 
			}
		} 
		if (fds_none) {
			r = ModernizedCProgram.Curl_wait_ms(timeout_ms);
			return r/* Avoid initial timestamp, avoid Curl_now() call, when elapsed
			     time in this function does not need to be measured. This happens
			     when function is called with a zero timeout or a negative timeout
			     value indicating a blocking call should be performed. */;
		} 
		curltime curltime = new curltime();
		if (timeout_ms > 0) {
			pending_ms = timeout_ms;
			initial_tv = curltime.Curl_now();
		} 
		/* Simulate a "call timed out" case */
		(((fd_set)(fds_read)).setFd_count(/* HAVE_POLL_FINE */0));
		(((fd_set)(fds_write)).setFd_count(0));
		(((fd_set)(fds_err)).setFd_count(0));
		maxfd = (ModernizedCProgram.curl_socket_t) - 1;
		for (i = 0; i < nfds; i++) {
			ufds[i].setRevents(0);
			if (ufds[i].getFd() == CURL_SOCKET_BAD) {
				continue;
			} 
			do {
			} while (0);
			if (ufds[i].getEvents() & (-1024 | -1024 | -1024 | -1024 | -1024 | -1024)) {
				if (ufds[i].getFd() > maxfd) {
					maxfd = ufds[i].getFd();
				} 
				if (ufds[i].getEvents() & (-1024 | -1024)) {
					do {
						u_int __i = new u_int();
						for (__i = 0; __i < ((fd_set)(fds_read)).getFd_count(); __i++) {
							if (((fd_set)(fds_read)).getFd_array()[__i] == (ufds[i].getFd())) {
								break;
							} 
						}
						if (__i == ((fd_set)(fds_read)).getFd_count()) {
							if (((fd_set)(fds_read)).getFd_count() < 64) {
								((fd_set)(fds_read)).getFd_array()[__i] = (ufds[i].getFd());
								((fd_set)(fds_read)).getFd_count()++;
							} 
						} 
					} while (0);
				} 
				if (ufds[i].getEvents() & (-1024 | -1024)) {
					do {
						u_int __i = new u_int();
						for (__i = 0; __i < ((fd_set)(fds_write)).getFd_count(); __i++) {
							if (((fd_set)(fds_write)).getFd_array()[__i] == (ufds[i].getFd())) {
								break;
							} 
						}
						if (__i == ((fd_set)(fds_write)).getFd_count()) {
							if (((fd_set)(fds_write)).getFd_count() < 64) {
								((fd_set)(fds_write)).getFd_array()[__i] = (ufds[i].getFd());
								((fd_set)(fds_write)).getFd_count()++;
							} 
						} 
					} while (0);
				} 
				if (ufds[i].getEvents() & (-1024 | -1024)) {
					do {
						u_int __i = new u_int();
						for (__i = 0; __i < ((fd_set)(fds_err)).getFd_count(); __i++) {
							if (((fd_set)(fds_err)).getFd_array()[__i] == (ufds[i].getFd())) {
								break;
							} 
						}
						if (__i == ((fd_set)(fds_err)).getFd_count()) {
							if (((fd_set)(fds_err)).getFd_count() < 64) {
								((fd_set)(fds_err)).getFd_array()[__i] = (ufds[i].getFd());
								((fd_set)(fds_err)).getFd_count()++;
							} 
						} 
					} while (0);
				} 
			} 
		}
		Object generatedFd_count = fds_read.getFd_count();
		if (generatedFd_count == 0 && generatedFd_count == /* WinSock select() can't handle zero events.  See the comment about this in
		     Curl_check_socket(). */0 && generatedFd_count == 0) {
			r = ModernizedCProgram.Curl_wait_ms(timeout_ms);
			return r;
		} 
		ptimeout = (timeout_ms < 0) ? ((Object)0) : pending_tv;
		do {
			int error;
			if (timeout_ms > 0) {
				pending_tv.setTv_sec(pending_ms / 1000);
				pending_tv.setTv_usec((pending_ms % 1000) * 1000);
			}  else if (!timeout_ms) {
				pending_tv.setTv_sec(0);
				pending_tv.setTv_usec(0);
			} 
			r = .select((int)maxfd + 1/* WinSock select() can't handle fd_sets with zero bits set, so
			                  don't give it such arguments.  See the comment about this in
			                  Curl_check_socket().
			               */, generatedFd_count ? fds_read : ((Object)0), generatedFd_count ? fds_write : ((Object)0), generatedFd_count ? fds_err : ((Object)0), ptimeout);
			if (r != -1) {
				break;
			} 
			error = ((int).WSAGetLastError());
			if (error && (ModernizedCProgram.Curl_ack_eintr || error != -1024)) {
				break;
			} 
			if (timeout_ms > 0) {
				pending_ms = timeout_ms - (int)curltime.Curl_now().Curl_timediff(initial_tv);
				if (pending_ms <= 0) {
					r = /* Simulate a "call timed out" case */0;
					break;
				} 
			} 
		} while (r == -1);
		if (r < 0) {
			return -1;
		} 
		if (r == 0) {
			return 0;
		} 
		r = 0;
		for (i = 0; i < nfds; i++) {
			ufds[i].setRevents(0);
			if (ufds[i].getFd() == CURL_SOCKET_BAD) {
				continue;
			} 
			if (.__WSAFDIsSet((SOCKET)(ufds[i].getFd()), (fd_set)(fds_read))) {
				ufds[i].getRevents() |=  -1024;
			} 
			if (.__WSAFDIsSet((SOCKET)(ufds[i].getFd()), (fd_set)(fds_write))) {
				ufds[i].getRevents() |=  -1024;
			} 
			if (.__WSAFDIsSet((SOCKET)(ufds[i].getFd()), (fd_set)(fds_err))) {
				ufds[i].getRevents() |=  -1024;
			} 
			if (ufds[i].getRevents() != 0) {
				r++;
			} 
		}
		return /* HAVE_POLL_FINE */r/*
		 * This is a replacement for select() on the TPF platform.
		 * It is used whenever libcurl calls select().
		 * The call below to tpf_process_signals() is required because
		 * TPF's select calls are not signal interruptible.
		 *
		 * Return values are the same as select's.
		 */;
	}
	/* TPF */
	public Object getFd() {
		return fd;
	}
	public void setFd(Object newFd) {
		fd = newFd;
	}
	public int getEvents() {
		return events;
	}
	public void setEvents(int newEvents) {
		events = newEvents;
	}
	public int getRevents() {
		return revents;
	}
	public void setRevents(int newRevents) {
		revents = newRevents;
	}
}
