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
/* <DESC>
 * multi socket interface together with libev
 * </DESC>
 */
/* Example application source code using the multi socket interface to
 * download many files at once.
 *
 * This example features the same basic functionality as hiperfifo.c does,
 * but this uses libev instead of libevent.
 *
 * Written by Jeff Pohlmeyer, converted to use libev by Markus Koetter

Requires libev and a (POSIX?) system that has mkfifo().

This is an adaptation of libcurl's "hipev.c" and libevent's "event-test.c"
sample programs.

When running, the program creates the named pipe "hiper.fifo"

Whenever there is input into the fifo, the program reads the input as a list
of URL's and creates some new easy handles to fetch each URL via the
curl_multi "hiper" API.


Thus, you can try a single URL:
  % echo http://www.yahoo.com > hiper.fifo

Or a whole bunch of them:
  % cat my-url-list > hiper.fifo

The fifo buffer is handled almost instantly, so you can even add more URL's
while the previous requests are still being downloaded.

Note:
  For the sake of simplicity, URL length is limited to 1023 char's !

This is purely a demo app, all retrieved data is simply discarded by the write
callback.

*/
/* Send info to stdout, change to stderr if you want */
/* Global information, common to all connections */
public class _GlobalInfo {
	private ev_loop loop;
	private ev_io fifo_event;
	private ev_timer timer_event;
	private Object multi;
	private int still_running;
	private _iobuf input;
	
	public _GlobalInfo(ev_loop loop, ev_io fifo_event, ev_timer timer_event, Object multi, int still_running, _iobuf input) {
		setLoop(loop);
		setFifo_event(fifo_event);
		setTimer_event(timer_event);
		setMulti(multi);
		setStill_running(still_running);
		setInput(input);
	}
	public _GlobalInfo() {
	}
	
	/* Update the event timer after curl_multi library calls */
	public int multi_timer_cb(Object multi, long timeout_ms) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s %li\n", __PRETTY_FUNCTION__, timeout_ms);
		ev_loop generatedLoop = this.getLoop();
		ev_timer generatedTimer_event = this.getTimer_event();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ev_timer_stop(generatedLoop, generatedTimer_event);
		if (timeout_ms >= 0) {
			double t = timeout_ms / /* -1 means delete, other values are timeout times in milliseconds */1000;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ev_timer_init(generatedTimer_event, ModernizedCProgram.timer_cb, t, 0.0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ev_timer_start(generatedLoop, generatedTimer_event);
		} 
		return 0;
		timeval timeout = new timeval();
		(Object)multi;
		timeout.setTv_sec(timeout_ms / 1000);
		timeout.setTv_usec((timeout_ms % 1000) * 1000);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "multi_timer_cb: Setting timeout to %ld ms\n", timeout_ms/*
		   * if timeout_ms is -1, just delete the timer
		   *
		   * For all other values of timeout_ms, this should set or *update* the timer
		   * to the new value
		   */);
		ev_timer generatedTimer_event = this.getTimer_event();
		if (timeout_ms == -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/evtimer_del(generatedTimer_event);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/evtimer_add(generatedTimer_event, /* includes timeout zero */timeout);
		} 
		return 0;
		itimerspec its = new itimerspec();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "multi_timer_cb: Setting timeout to %ld ms\n", timeout_ms);
		Object generatedItimerspec = its.getItimerspec();
		if (timeout_ms > 0) {
			generatedItimerspec.setTv_sec(1);
			generatedItimerspec.setTv_nsec(0);
			generatedItimerspec.setTv_sec(timeout_ms / 1000);
			generatedItimerspec.setTv_nsec((timeout_ms % 1000) * 1000 * 1000);
		}  else if (timeout_ms == 0/* libcurl wants us to timeout now, however setting both fields of
		     * new_value.it_value to zero disarms the timer. The closest we can
		     * do is to schedule the timer to fire in 1 ns. */) {
			generatedItimerspec.setTv_sec(1);
			generatedItimerspec.setTv_nsec(0);
			generatedItimerspec.setTv_sec(0);
			generatedItimerspec.setTv_nsec(1);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(its, 0, /*Error: Unsupported expression*/);
		} 
		Object generatedTfd = this.getTfd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/timerfd_settime(generatedTfd, 0, its, ((Object)/*flags=*/0));
		return 0;
	}
	/* Check for completed transfers, and remove their easy handles */
	public void check_multi_info() {
		byte eff_url;
		 msg = new ();
		int msgs_left;
		ConnInfo conn = new ConnInfo();
		 easy = new ();
		 res = new ();
		int generatedStill_running = this.getStill_running();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "REMAINING: %d\n", generatedStill_running);
		Object generatedMulti = this.getMulti();
		Object generatedError = conn.getError();
		Byte generatedUrl = conn.getUrl();
		while ((msg = generatedMulti.curl_multi_info_read(msgs_left))) {
			if (msg.getMsg() == CURLMSG_DONE) {
				easy = msg.getEasy_handle();
				res = msg.getData().getResult();
				easy.curl_easy_getinfo(CURLINFO_PRIVATE, conn);
				easy.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, eff_url);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "DONE: %s => (%d) %s\n", eff_url, res, generatedError);
				ModernizedCProgram.curl_multi_remove_handle(generatedMulti, easy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrl);
				easy.curl_easy_cleanup();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(conn);
			} 
		}
		byte done_url;
		 message = new ();
		int pending;
		 easy_handle = new ();
		FILE file = new FILE();
		while ((message = ModernizedCProgram.curl_handle.curl_multi_info_read(pending))) {
			switch (message.getMsg()) {
			case CURLMSG_DONE/* Do not use message data after calling curl_multi_remove_handle() and
			         curl_easy_cleanup(). As per curl_multi_info_read() docs:
			         "WARNING: The data the returned pointer points to will not survive
			         calling curl_multi_cleanup, curl_multi_remove_handle or
			         curl_easy_cleanup." */:
					easy_handle = message.getEasy_handle();
					easy_handle.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, done_url);
					easy_handle.curl_easy_getinfo(CURLINFO_PRIVATE, file);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s DONE\n", done_url);
					ModernizedCProgram.curl_multi_remove_handle(ModernizedCProgram.curl_handle, easy_handle);
					easy_handle.curl_easy_cleanup();
					if (file) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(file);
					} 
					break;
			default:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "CURLMSG default\n");
					break;
			}
		}
		byte eff_url;
		 msg = new ();
		int msgs_left;
		ConnInfo conn = new ConnInfo();
		 easy = new ();
		 res = new ();
		int generatedStill_running = this.getStill_running();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "REMAINING: %d\n", generatedStill_running);
		Object generatedMulti = this.getMulti();
		Object generatedError = conn.getError();
		Byte generatedUrl = conn.getUrl();
		while ((msg = generatedMulti.curl_multi_info_read(msgs_left))) {
			if (msg.getMsg() == CURLMSG_DONE) {
				easy = msg.getEasy_handle();
				res = msg.getData().getResult();
				easy.curl_easy_getinfo(CURLINFO_PRIVATE, conn);
				easy.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, eff_url);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "DONE: %s => (%d) %s\n", eff_url, res, generatedError);
				ModernizedCProgram.curl_multi_remove_handle(generatedMulti, easy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrl);
				easy.curl_easy_cleanup();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(conn);
			} 
		}
		Object generatedStopped = this.getStopped();
		Object generatedEvbase = this.getEvbase();
		if (generatedStill_running == 0 && generatedStopped) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/event_base_loopbreak(generatedEvbase);
		} 
		byte done_url;
		 message = new ();
		int pending;
		 easy_handle = new ();
		FILE file = new FILE();
		while ((message = ModernizedCProgram.curl_handle.curl_multi_info_read(pending))) {
			switch (message.getMsg()) {
			case CURLMSG_DONE/* Do not use message data after calling curl_multi_remove_handle() and
			         curl_easy_cleanup(). As per curl_multi_info_read() docs:
			         "WARNING: The data the returned pointer points to will not survive
			         calling curl_multi_cleanup, curl_multi_remove_handle or
			         curl_easy_cleanup." */:
					easy_handle = message.getEasy_handle();
					easy_handle.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, done_url);
					easy_handle.curl_easy_getinfo(CURLINFO_PRIVATE, file);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s DONE\n", done_url);
					ModernizedCProgram.curl_multi_remove_handle(ModernizedCProgram.curl_handle, easy_handle);
					easy_handle.curl_easy_cleanup();
					if (file) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(file);
					} 
					break;
			default:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "CURLMSG default\n");
					break;
			}
		}
		byte eff_url;
		 msg = new ();
		int msgs_left;
		ConnInfo conn = new ConnInfo();
		 easy = new ();
		 res = new ();
		int generatedStill_running = this.getStill_running();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "REMAINING: %d\n", generatedStill_running);
		Object generatedMulti = this.getMulti();
		Object generatedError = conn.getError();
		Byte generatedUrl = conn.getUrl();
		while ((msg = generatedMulti.curl_multi_info_read(msgs_left))) {
			if (msg.getMsg() == CURLMSG_DONE) {
				easy = msg.getEasy_handle();
				res = msg.getData().getResult();
				easy.curl_easy_getinfo(CURLINFO_PRIVATE, conn);
				easy.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, eff_url);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "DONE: %s => (%d) %s\n", eff_url, res, generatedError);
				ModernizedCProgram.curl_multi_remove_handle(generatedMulti, easy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrl);
				easy.curl_easy_cleanup();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(conn);
			} 
		}
		byte eff_url;
		 msg = new ();
		int msgs_left;
		ConnInfo conn = new ConnInfo();
		 easy = new ();
		 res = new ();
		int generatedStill_running = this.getStill_running();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/g_print("REMAINING: %d\n", generatedStill_running);
		Object generatedMulti = this.getMulti();
		Object generatedError = conn.getError();
		Byte generatedUrl = conn.getUrl();
		while ((msg = generatedMulti.curl_multi_info_read(msgs_left))) {
			if (msg.getMsg() == CURLMSG_DONE) {
				easy = msg.getEasy_handle();
				res = msg.getData().getResult();
				easy.curl_easy_getinfo(CURLINFO_PRIVATE, conn);
				easy.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, eff_url);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/g_print("DONE: %s => (%d) %s\n", eff_url, res, generatedError);
				ModernizedCProgram.curl_multi_remove_handle(generatedMulti, easy);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedUrl);
				easy.curl_easy_cleanup();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(conn);
			} 
		}
	}
	/* Initialize a new SockInfo structure */
	public void addsock(Object s, Object easy, int action) {
		SockInfo fdp = /*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, 1);
		fdp.setGlobal(g);
		ModernizedCProgram.setsock(fdp, s, easy, action, g);
		Object generatedMulti = this.getMulti();
		generatedMulti.curl_multi_assign(s, fdp);
		SockInfo fdp = /*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, 1);
		fdp.setGlobal(g);
		ModernizedCProgram.setsock(fdp, s, easy, action, g);
		Object generatedMulti = this.getMulti();
		generatedMulti.curl_multi_assign(s, fdp);
		SockInfo fdp = (SockInfo)/*Error: Function owner not recognized*/calloc(/*Error: Unsupported expression*/, 1);
		fdp.setGlobal(g);
		ModernizedCProgram.setsock(fdp, s, easy, action, g);
		Object generatedMulti = this.getMulti();
		generatedMulti.curl_multi_assign(s, fdp);
		SockInfo fdp = /*Error: Function owner not recognized*/g_malloc0(/*Error: Unsupported expression*/);
		fdp.setGlobal(g);
		fdp.setCh(/*Error: Function owner not recognized*/g_io_channel_unix_new(s));
		ModernizedCProgram.setsock(fdp, s, easy, action, g);
		Object generatedMulti = this.getMulti();
		generatedMulti.curl_multi_assign(s, fdp);
	}
	/* Create a new easy handle, and add it to the global curl_multi */
	public void new_conn(Byte url) {
		ConnInfo conn = new ConnInfo();
		 rc = new ();
		conn = /*Error: Function owner not recognized*/calloc(1, /*Error: Unsupported expression*/);
		Object generatedError = conn.getError();
		generatedError[0] = (byte)'\0';
		Curl_easy curl_easy = new Curl_easy();
		conn.setEasy(curl_easy.curl_easy_init());
		Object generatedEasy = conn.getEasy();
		if (!generatedEasy) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "curl_easy_init() failed, exiting!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(2);
		} 
		conn.setGlobal(g);
		conn.setUrl(/*Error: Function owner not recognized*/strdup(url));
		Byte generatedUrl = conn.getUrl();
		generatedEasy.curl_easy_setopt(CURLOPT_URL, generatedUrl);
		generatedEasy.curl_easy_setopt(CURLOPT_WRITEFUNCTION, write_cb);
		generatedEasy.curl_easy_setopt(CURLOPT_WRITEDATA, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_VERBOSE, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_ERRORBUFFER, generatedError);
		generatedEasy.curl_easy_setopt(CURLOPT_PRIVATE, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_NOPROGRESS, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_PROGRESSFUNCTION, prog_cb);
		generatedEasy.curl_easy_setopt(CURLOPT_PROGRESSDATA, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_LOW_SPEED_TIME, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_LOW_SPEED_LIMIT, -1024);
		Object generatedMulti = this.getMulti();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Adding easy %p to multi %p (%s)\n", generatedEasy, generatedMulti, url);
		rc = ModernizedCProgram.curl_multi_add_handle(generatedMulti, generatedEasy);
		ModernizedCProgram.mcode_or_die("new_conn: curl_multi_add_handle", rc/* note that the add_handle() will set a time-out to trigger very soon so
		     that the necessary socket_action() call will be called by this app */)/* This gets called whenever data is received from the fifo */;/* This gets called whenever data is received from the fifo */
		ConnInfo conn = new ConnInfo();
		 rc = new ();
		conn = /*Error: Function owner not recognized*/calloc(1, /*Error: Unsupported expression*/);
		Object generatedError = conn.getError();
		generatedError[0] = (byte)'\0';
		Curl_easy curl_easy = new Curl_easy();
		conn.setEasy(curl_easy.curl_easy_init());
		Object generatedEasy = conn.getEasy();
		if (!generatedEasy) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "curl_easy_init() failed, exiting!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(2);
		} 
		conn.setGlobal(g);
		conn.setUrl(/*Error: Function owner not recognized*/strdup(url));
		Byte generatedUrl = conn.getUrl();
		generatedEasy.curl_easy_setopt(CURLOPT_URL, generatedUrl);
		generatedEasy.curl_easy_setopt(CURLOPT_WRITEFUNCTION, write_cb);
		generatedEasy.curl_easy_setopt(CURLOPT_WRITEDATA, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_VERBOSE, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_ERRORBUFFER, generatedError);
		generatedEasy.curl_easy_setopt(CURLOPT_PRIVATE, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_NOPROGRESS, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_PROGRESSFUNCTION, prog_cb);
		generatedEasy.curl_easy_setopt(CURLOPT_PROGRESSDATA, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_FOLLOWLOCATION, -1024);
		Object generatedMulti = this.getMulti();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Adding easy %p to multi %p (%s)\n", generatedEasy, generatedMulti, url);
		rc = ModernizedCProgram.curl_multi_add_handle(generatedMulti, generatedEasy);
		ModernizedCProgram.mcode_or_die("new_conn: curl_multi_add_handle", rc/* note that the add_handle() will set a time-out to trigger very soon so
		     that the necessary socket_action() call will be called by this app */);
		ConnInfo conn = new ConnInfo();
		 rc = new ();
		conn = (ConnInfo)/*Error: Function owner not recognized*/calloc(1, /*Error: Unsupported expression*/);
		Object generatedError = conn.getError();
		generatedError[0] = (byte)'\0';
		Curl_easy curl_easy = new Curl_easy();
		conn.setEasy(curl_easy.curl_easy_init());
		Object generatedEasy = conn.getEasy();
		if (!generatedEasy) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "curl_easy_init() failed, exiting!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(2);
		} 
		conn.setGlobal(g);
		conn.setUrl(/*Error: Function owner not recognized*/strdup(url));
		Byte generatedUrl = conn.getUrl();
		generatedEasy.curl_easy_setopt(CURLOPT_URL, generatedUrl);
		generatedEasy.curl_easy_setopt(CURLOPT_WRITEFUNCTION, write_cb);
		generatedEasy.curl_easy_setopt(CURLOPT_WRITEDATA, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_VERBOSE, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_ERRORBUFFER, generatedError);
		generatedEasy.curl_easy_setopt(CURLOPT_PRIVATE, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_NOPROGRESS, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_PROGRESSFUNCTION, prog_cb);
		generatedEasy.curl_easy_setopt(CURLOPT_PROGRESSDATA, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_FOLLOWLOCATION, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_LOW_SPEED_TIME, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_LOW_SPEED_LIMIT, -1024);
		Object generatedMulti = this.getMulti();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Adding easy %p to multi %p (%s)\n", generatedEasy, generatedMulti, url);
		rc = ModernizedCProgram.curl_multi_add_handle(generatedMulti, generatedEasy);
		ModernizedCProgram.mcode_or_die("new_conn: curl_multi_add_handle", rc/* note that the add_handle() will set a time-out to trigger very soon so
		     that the necessary socket_action() call will be called by this app */);
		ConnInfo conn = new ConnInfo();
		 rc = new ();
		conn = /*Error: Function owner not recognized*/g_malloc0(/*Error: Unsupported expression*/);
		Object generatedError = conn.getError();
		generatedError[0] = (byte)'\0';
		Curl_easy curl_easy = new Curl_easy();
		conn.setEasy(curl_easy.curl_easy_init());
		Object generatedEasy = conn.getEasy();
		if (!generatedEasy) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/g_print("curl_easy_init() failed, exiting!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(2);
		} 
		conn.setGlobal(g);
		conn.setUrl(/*Error: Function owner not recognized*/g_strdup(url));
		Byte generatedUrl = conn.getUrl();
		generatedEasy.curl_easy_setopt(CURLOPT_URL, generatedUrl);
		generatedEasy.curl_easy_setopt(CURLOPT_WRITEFUNCTION, write_cb);
		generatedEasy.curl_easy_setopt(CURLOPT_WRITEDATA, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_VERBOSE, (long)0);
		generatedEasy.curl_easy_setopt(CURLOPT_ERRORBUFFER, generatedError);
		generatedEasy.curl_easy_setopt(CURLOPT_PRIVATE, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_NOPROGRESS, false ? -1024 : -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_PROGRESSFUNCTION, prog_cb);
		generatedEasy.curl_easy_setopt(CURLOPT_PROGRESSDATA, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_FOLLOWLOCATION, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_CONNECTTIMEOUT, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_LOW_SPEED_LIMIT, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_LOW_SPEED_TIME, -1024);
		Object generatedMulti = this.getMulti();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/g_print("Adding easy %p to multi %p (%s)\n", generatedEasy, generatedMulti, url);
		rc = ModernizedCProgram.curl_multi_add_handle(generatedMulti, generatedEasy);
		ModernizedCProgram.mcode_or_die("new_conn: curl_multi_add_handle", rc/* note that the add_handle() will set a time-out to trigger very soon so
		     that the necessary socket_action() call will be called by this app */);
	}
	/* if we read a URL, go get it! */
	/* Create a named pipe and tell libevent to monitor it */
	public int init_fifo() {
		stat st = new stat();
		byte fifo = "hiper.fifo";
		 sockfd = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Creating named pipe \"%s\"\n", fifo);
		Object generatedSt_mode = st.getSt_mode();
		if (/*Error: Function owner not recognized*/lstat(fifo, st) == 0) {
			if ((generatedSt_mode & -1024) == -1024) {
				(/*Error: Function owner not recognized*/_errno()) = 17;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("lstat");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(fifo);
		if (/*Error: Function owner not recognized*/mkfifo(fifo, 600) == -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("mkfifo");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		sockfd = /*Error: Function owner not recognized*/open(fifo, 2 | O_NONBLOCK, 0);
		if (sockfd == -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("open");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		this.setInput(/*Error: Function owner not recognized*/fdopen(sockfd, "r"));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Now, pipe some URL's into > %s\n", fifo);
		ev_io generatedFifo_event = this.getFifo_event();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ev_io_init(generatedFifo_event, fifo_cb, sockfd, EV_READ);
		ev_loop generatedLoop = this.getLoop();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ev_io_start(generatedLoop, generatedFifo_event);
		return (false);
		stat st = new stat();
		 sockfd = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Creating named pipe \"%s\"\n", ModernizedCProgram.fifo);
		Object generatedSt_mode = st.getSt_mode();
		if (/*Error: Function owner not recognized*/lstat(ModernizedCProgram.fifo, st) == 0) {
			if ((generatedSt_mode & -1024) == -1024) {
				(/*Error: Function owner not recognized*/_errno()) = 17;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("lstat");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(ModernizedCProgram.fifo);
		if (/*Error: Function owner not recognized*/mkfifo(ModernizedCProgram.fifo, 600) == -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("mkfifo");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		sockfd = /*Error: Function owner not recognized*/open(ModernizedCProgram.fifo, 2 | O_NONBLOCK, 0);
		if (sockfd == -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("open");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		this.setInput(/*Error: Function owner not recognized*/fdopen(sockfd, "r"));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Now, pipe some URL's into > %s\n", ModernizedCProgram.fifo);
		ev_io generatedFifo_event = this.getFifo_event();
		Object generatedEvbase = this.getEvbase();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/event_assign(generatedFifo_event, generatedEvbase, sockfd, EV_READ | EV_PERSIST, fifo_cb, g);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/event_add(generatedFifo_event, ((Object)0));
		return (false);
		stat st = new stat();
		 sockfd = new ();
		epoll_event epev = new epoll_event();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Creating named pipe \"%s\"\n", ModernizedCProgram.fifo);
		Object generatedSt_mode = st.getSt_mode();
		if (/*Error: Function owner not recognized*/lstat(ModernizedCProgram.fifo, st) == 0) {
			if ((generatedSt_mode & -1024) == -1024) {
				(/*Error: Function owner not recognized*/_errno()) = 17;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("lstat");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(ModernizedCProgram.fifo);
		if (/*Error: Function owner not recognized*/mkfifo(ModernizedCProgram.fifo, 600) == -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("mkfifo");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		sockfd = /*Error: Function owner not recognized*/open(ModernizedCProgram.fifo, 2 | O_NONBLOCK, 0);
		if (sockfd == -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("open");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		this.setFifofd(sockfd);
		this.setInput(/*Error: Function owner not recognized*/fdopen(sockfd, "r"));
		epev.setEpoll_event(EPOLLIN);
		Object generatedEpoll_event = epev.getEpoll_event();
		generatedEpoll_event.setFd(sockfd);
		Object generatedEpfd = this.getEpfd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/epoll_ctl(generatedEpfd, EPOLL_CTL_ADD, sockfd, epev);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "Now, pipe some URL's into > %s\n", ModernizedCProgram.fifo);
		return 0;
		stat st = new stat();
		byte fifo = "hiper.fifo";
		int socket;
		Object generatedSt_mode = st.getSt_mode();
		if (/*Error: Function owner not recognized*/lstat(fifo, st) == 0) {
			if ((generatedSt_mode & -1024) == -1024) {
				(/*Error: Function owner not recognized*/_errno()) = 17;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("lstat");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(fifo);
		if (/*Error: Function owner not recognized*/mkfifo(fifo, 600) == -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("mkfifo");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		socket = /*Error: Function owner not recognized*/open(fifo, 2 | O_NONBLOCK, 0);
		if (socket == -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/perror("open");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/exit(1);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/g_print("Now, pipe some URL's into > %s\n", fifo);
		return socket;
	}
	public void clean_fifo() {
		ev_io generatedFifo_event = this.getFifo_event();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/event_del(generatedFifo_event);
		_iobuf generatedInput = this.getInput();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(generatedInput);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(ModernizedCProgram.fifo);
		Object generatedEpfd = this.getEpfd();
		Object generatedFifofd = this.getFifofd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/epoll_ctl(generatedEpfd, EPOLL_CTL_DEL, generatedFifofd, ((Object)0));
		_iobuf generatedInput = this.getInput();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(generatedInput);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/unlink(ModernizedCProgram.fifo);
	}
	public ev_loop getLoop() {
		return loop;
	}
	public void setLoop(ev_loop newLoop) {
		loop = newLoop;
	}
	public ev_io getFifo_event() {
		return fifo_event;
	}
	public void setFifo_event(ev_io newFifo_event) {
		fifo_event = newFifo_event;
	}
	public ev_timer getTimer_event() {
		return timer_event;
	}
	public void setTimer_event(ev_timer newTimer_event) {
		timer_event = newTimer_event;
	}
	public Object getMulti() {
		return multi;
	}
	public void setMulti(Object newMulti) {
		multi = newMulti;
	}
	public int getStill_running() {
		return still_running;
	}
	public void setStill_running(int newStill_running) {
		still_running = newStill_running;
	}
	public _iobuf getInput() {
		return input;
	}
	public void setInput(_iobuf newInput) {
		input = newInput;
	}
}
