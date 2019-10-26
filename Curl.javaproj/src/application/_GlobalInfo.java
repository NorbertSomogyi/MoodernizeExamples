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
 * multi socket API usage with libevent 2
 * </DESC>
 */
/* Example application source code using the multi socket interface to
   download many files at once.

Written by Jeff Pohlmeyer

Requires libevent version 2 and a (POSIX?) system that has mkfifo().

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
	private event_base evbase;
	private event fifo_event;
	private event timer_event;
	private Object multi;
	private int still_running;
	private _iobuf input;
	private int stopped;
	
	public _GlobalInfo(event_base evbase, event fifo_event, event timer_event, Object multi, int still_running, _iobuf input, int stopped) {
		setEvbase(evbase);
		setFifo_event(fifo_event);
		setTimer_event(timer_event);
		setMulti(multi);
		setStill_running(still_running);
		setInput(input);
		setStopped(stopped);
	}
	public _GlobalInfo() {
	}
	
	/* Update the event timer after curl_multi library calls */
	public int multi_timer_cb(Object multi, long timeout_ms) {
		timeval timeout = new timeval();
		(Object)multi;
		timeout.setTv_sec(timeout_ms / 1000);
		timeout.setTv_usec((timeout_ms % 1000) * 1000);
		.fprintf((_iob[1]), "multi_timer_cb: Setting timeout to %ld ms\n", timeout_ms/*
		   * if timeout_ms is -1, just delete the timer
		   *
		   * For all other values of timeout_ms, this should set or *update* the timer
		   * to the new value
		   */);
		event generatedTimer_event = this.getTimer_event();
		if (timeout_ms == -1) {
			.evtimer_del(generatedTimer_event);
		} else {
				.evtimer_add(generatedTimer_event, /* includes timeout zero */timeout);
		} 
		return 0;
		.printf("%s %li\n", __PRETTY_FUNCTION__, timeout_ms);
		Object generatedLoop = this.getLoop();
		event generatedTimer_event = this.getTimer_event();
		.ev_timer_stop(generatedLoop, generatedTimer_event);
		if (timeout_ms >= 0) {
			double t = timeout_ms / /* -1 means delete, other values are timeout times in milliseconds */1000;
			.ev_timer_init(generatedTimer_event, ModernizedCProgram.timer_cb, t, 0.0);
			.ev_timer_start(generatedLoop, generatedTimer_event);
		} 
		return 0;
		itimerspec its = new itimerspec();
		.fprintf((_iob[1]), "multi_timer_cb: Setting timeout to %ld ms\n", timeout_ms);
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
				.memset(its, 0, );
		} 
		Object generatedTfd = this.getTfd();
		.timerfd_settime(generatedTfd, 0, its, ((Object)/*flags=*/0));
		return 0;
		.fprintf(stdout, "\nmulti_timer_cb: timeout_ms %ld", timeout_ms);
		.UNRECOGNIZEDFUNCTIONNAME();
		if (timeout_ms > 0) {
			.UNRECOGNIZEDFUNCTIONNAME(.millisec(/* update timer */timeout_ms));
			.UNRECOGNIZEDFUNCTIONNAME(.bind(ModernizedCProgram.timer_cb, _1, g));
		}  else if (timeout_ms == 0/* call timeout function immediately */) {
			error_code error = new error_code();
			ModernizedCProgram.timer_cb(error, g);
		} 
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
		.fprintf((_iob[1]), "REMAINING: %d\n", generatedStill_running);
		Object generatedMulti = this.getMulti();
		Object generatedError = conn.getError();
		Byte generatedUrl = conn.getUrl();
		while ((msg = generatedMulti.curl_multi_info_read(msgs_left))) {
			if (msg.getMsg() == CURLMSG_DONE) {
				easy = msg.getEasy_handle();
				res = msg.getData().getResult();
				easy.curl_easy_getinfo(CURLINFO_PRIVATE, conn);
				easy.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, eff_url);
				.fprintf((_iob[1]), "DONE: %s => (%d) %s\n", eff_url, res, generatedError);
				ModernizedCProgram.curl_multi_remove_handle(generatedMulti, easy);
				.free(generatedUrl);
				easy.curl_easy_cleanup();
				.free(conn);
			} 
		}
		int generatedStopped = this.getStopped();
		event_base generatedEvbase = this.getEvbase();
		if (generatedStill_running == 0 && generatedStopped) {
			.event_base_loopbreak(generatedEvbase);
		} 
		byte eff_url;
		 msg = new ();
		int msgs_left;
		ConnInfo conn = new ConnInfo();
		 easy = new ();
		 res = new ();
		int generatedStill_running = this.getStill_running();
		.g_print("REMAINING: %d\n", generatedStill_running);
		Object generatedMulti = this.getMulti();
		Object generatedError = conn.getError();
		Byte generatedUrl = conn.getUrl();
		while ((msg = generatedMulti.curl_multi_info_read(msgs_left))) {
			if (msg.getMsg() == CURLMSG_DONE) {
				easy = msg.getEasy_handle();
				res = msg.getData().getResult();
				easy.curl_easy_getinfo(CURLINFO_PRIVATE, conn);
				easy.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, eff_url);
				.g_print("DONE: %s => (%d) %s\n", eff_url, res, generatedError);
				ModernizedCProgram.curl_multi_remove_handle(generatedMulti, easy);
				.free(generatedUrl);
				easy.curl_easy_cleanup();
				.free(conn);
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
					.printf("%s DONE\n", done_url);
					ModernizedCProgram.curl_multi_remove_handle(ModernizedCProgram.curl_handle, easy_handle);
					easy_handle.curl_easy_cleanup();
					if (file) {
						.fclose(file);
					} 
					break;
			default:
					.fprintf((_iob[2]), "CURLMSG default\n");
					break;
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
					.printf("%s DONE\n", done_url);
					ModernizedCProgram.curl_multi_remove_handle(ModernizedCProgram.curl_handle, easy_handle);
					easy_handle.curl_easy_cleanup();
					if (file) {
						.fclose(file);
					} 
					break;
			default:
					.fprintf((_iob[2]), "CURLMSG default\n");
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
		.fprintf((_iob[1]), "REMAINING: %d\n", generatedStill_running);
		Object generatedMulti = this.getMulti();
		Object generatedError = conn.getError();
		Byte generatedUrl = conn.getUrl();
		while ((msg = generatedMulti.curl_multi_info_read(msgs_left))) {
			if (msg.getMsg() == CURLMSG_DONE) {
				easy = msg.getEasy_handle();
				res = msg.getData().getResult();
				easy.curl_easy_getinfo(CURLINFO_PRIVATE, conn);
				easy.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, eff_url);
				.fprintf((_iob[1]), "DONE: %s => (%d) %s\n", eff_url, res, generatedError);
				ModernizedCProgram.curl_multi_remove_handle(generatedMulti, easy);
				.free(generatedUrl);
				easy.curl_easy_cleanup();
				.free(conn/* Called by libevent when we get action on a multi socket */);
			} 
		}
		byte eff_url;
		 msg = new ();
		int msgs_left;
		ConnInfo conn = new ConnInfo();
		 easy = new ();
		 res = new ();
		int generatedStill_running = this.getStill_running();
		.fprintf((_iob[1]), "REMAINING: %d\n", generatedStill_running);
		Object generatedMulti = this.getMulti();
		Object generatedError = conn.getError();
		Byte generatedUrl = conn.getUrl();
		while ((msg = generatedMulti.curl_multi_info_read(msgs_left))) {
			if (msg.getMsg() == CURLMSG_DONE) {
				easy = msg.getEasy_handle();
				res = msg.getData().getResult();
				easy.curl_easy_getinfo(CURLINFO_PRIVATE, conn);
				easy.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, eff_url);
				.fprintf((_iob[1]), "DONE: %s => (%d) %s\n", eff_url, res, generatedError);
				ModernizedCProgram.curl_multi_remove_handle(generatedMulti, easy);
				.free(generatedUrl);
				easy.curl_easy_cleanup();
				.free(conn);
			} 
		}
		byte eff_url;
		CURLMsg msg = new CURLMsg();
		int msgs_left;
		ConnInfo conn = new ConnInfo();
		CURL easy = new CURL();
		CURLcode res = new CURLcode();
		int generatedStill_running = this.getStill_running();
		.fprintf(stdout, "\nREMAINING: %d", generatedStill_running);
		Object generatedMulti = this.getMulti();
		Object generatedError = conn.getError();
		Byte generatedUrl = conn.getUrl();
		while ((msg = generatedMulti.curl_multi_info_read(msgs_left))) {
			if (msg.getMsg() == CURLMSG_DONE) {
				easy = msg.getEasy_handle();
				res = msg.getData().getResult();
				easy.curl_easy_getinfo(CURLINFO_PRIVATE, conn);
				easy.curl_easy_getinfo(CURLINFO_EFFECTIVE_URL, eff_url);
				.fprintf(stdout, "\nDONE: %s => (%d) %s", eff_url, res, generatedError);
				ModernizedCProgram.curl_multi_remove_handle(generatedMulti, easy);
				.free(generatedUrl);
				easy.curl_easy_cleanup();
				.free(conn);
			} 
		}
	}
	/* Initialize a new SockInfo structure */
	public void addsock(Object s, Object easy, int action) {
		SockInfo fdp = .calloc(, 1);
		fdp.setGlobal(g);
		ModernizedCProgram.setsock(fdp, s, easy, action, g);
		Object generatedMulti = this.getMulti();
		generatedMulti.curl_multi_assign(s, fdp);
		SockInfo fdp = .g_malloc0();
		fdp.setGlobal(g);
		fdp.setCh(.g_io_channel_unix_new(s));
		ModernizedCProgram.setsock(fdp, s, easy, action, g);
		Object generatedMulti = this.getMulti();
		generatedMulti.curl_multi_assign(s, fdp);
		SockInfo fdp = .calloc(, 1);
		fdp.setGlobal(g);
		ModernizedCProgram.setsock(fdp, s, easy, action, g);
		Object generatedMulti = this.getMulti();
		generatedMulti.curl_multi_assign(s, fdp);
		SockInfo fdp = (SockInfo).calloc(, 1);
		fdp.setGlobal(g);
		ModernizedCProgram.setsock(fdp, s, easy, action, g);
		Object generatedMulti = this.getMulti();
		generatedMulti.curl_multi_assign(s, fdp);
		int fdp = (int).calloc(, /* fdp is used to store current action */1);
		ModernizedCProgram.setsock(fdp, s, easy, action, 0, g);
		Object generatedMulti = this.getMulti();
		generatedMulti.curl_multi_assign(s, fdp);
	}
	/* Create a new easy handle, and add it to the global curl_multi */
	public void new_conn(Byte url) {
		ConnInfo conn = new ConnInfo();
		 rc = new ();
		conn = .calloc(1, );
		Object generatedError = conn.getError();
		generatedError[0] = (byte)'\0';
		Curl_easy curl_easy = new Curl_easy();
		conn.setEasy(curl_easy.curl_easy_init());
		Object generatedEasy = conn.getEasy();
		if (!generatedEasy) {
			.fprintf((_iob[1]), "curl_easy_init() failed, exiting!\n");
			.exit(2);
		} 
		conn.setGlobal(g);
		conn.setUrl(.strdup(url));
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
		.fprintf((_iob[1]), "Adding easy %p to multi %p (%s)\n", generatedEasy, generatedMulti, url);
		rc = ModernizedCProgram.curl_multi_add_handle(generatedMulti, generatedEasy);
		ModernizedCProgram.mcode_or_die("new_conn: curl_multi_add_handle", rc/* note that the add_handle() will set a time-out to trigger very soon so
		     that the necessary socket_action() call will be called by this app */);
		ConnInfo conn = new ConnInfo();
		 rc = new ();
		conn = .g_malloc0();
		Object generatedError = conn.getError();
		generatedError[0] = (byte)'\0';
		Curl_easy curl_easy = new Curl_easy();
		conn.setEasy(curl_easy.curl_easy_init());
		Object generatedEasy = conn.getEasy();
		if (!generatedEasy) {
			.g_print("curl_easy_init() failed, exiting!\n");
			.exit(2);
		} 
		conn.setGlobal(g);
		conn.setUrl(.g_strdup(url));
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
		.g_print("Adding easy %p to multi %p (%s)\n", generatedEasy, generatedMulti, url);
		rc = ModernizedCProgram.curl_multi_add_handle(generatedMulti, generatedEasy);
		ModernizedCProgram.mcode_or_die("new_conn: curl_multi_add_handle", rc/* note that the add_handle() will set a time-out to trigger very soon so
		     that the necessary socket_action() call will be called by this app */);
		ConnInfo conn = new ConnInfo();
		 rc = new ();
		conn = .calloc(1, );
		Object generatedError = conn.getError();
		generatedError[0] = (byte)'\0';
		Curl_easy curl_easy = new Curl_easy();
		conn.setEasy(curl_easy.curl_easy_init());
		Object generatedEasy = conn.getEasy();
		if (!generatedEasy) {
			.fprintf((_iob[1]), "curl_easy_init() failed, exiting!\n");
			.exit(2);
		} 
		conn.setGlobal(g);
		conn.setUrl(.strdup(url));
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
		.fprintf((_iob[1]), "Adding easy %p to multi %p (%s)\n", generatedEasy, generatedMulti, url);
		rc = ModernizedCProgram.curl_multi_add_handle(generatedMulti, generatedEasy);
		ModernizedCProgram.mcode_or_die("new_conn: curl_multi_add_handle", rc/* note that the add_handle() will set a time-out to trigger very soon so
		     that the necessary socket_action() call will be called by this app *//* This gets called whenever data is received from the fifo */);
		ConnInfo conn = new ConnInfo();
		 rc = new ();
		conn = (ConnInfo).calloc(1, );
		Object generatedError = conn.getError();
		generatedError[0] = (byte)'\0';
		Curl_easy curl_easy = new Curl_easy();
		conn.setEasy(curl_easy.curl_easy_init());
		Object generatedEasy = conn.getEasy();
		if (!generatedEasy) {
			.fprintf((_iob[1]), "curl_easy_init() failed, exiting!\n");
			.exit(2);
		} 
		conn.setGlobal(g);
		conn.setUrl(.strdup(url));
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
		.fprintf((_iob[1]), "Adding easy %p to multi %p (%s)\n", generatedEasy, generatedMulti, url);
		rc = ModernizedCProgram.curl_multi_add_handle(generatedMulti, generatedEasy);
		ModernizedCProgram.mcode_or_die("new_conn: curl_multi_add_handle", rc/* note that the add_handle() will set a time-out to trigger very soon so
		     that the necessary socket_action() call will be called by this app */);
		ConnInfo conn = new ConnInfo();
		CURLMcode rc = new CURLMcode();
		conn = (ConnInfo).calloc(1, );
		Curl_easy curl_easy = new Curl_easy();
		conn.setEasy(curl_easy.curl_easy_init());
		Object generatedEasy = conn.getEasy();
		if (!generatedEasy) {
			.fprintf(stdout, "\ncurl_easy_init() failed, exiting!");
			.exit(2);
		} 
		conn.setGlobal(g);
		conn.setUrl(.strdup(url));
		Byte generatedUrl = conn.getUrl();
		generatedEasy.curl_easy_setopt(CURLOPT_URL, generatedUrl);
		generatedEasy.curl_easy_setopt(CURLOPT_WRITEFUNCTION, write_cb);
		generatedEasy.curl_easy_setopt(CURLOPT_WRITEDATA, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_VERBOSE, -1024);
		Object generatedError = conn.getError();
		generatedEasy.curl_easy_setopt(CURLOPT_ERRORBUFFER, generatedError);
		generatedEasy.curl_easy_setopt(CURLOPT_PRIVATE, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_NOPROGRESS, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_PROGRESSFUNCTION, prog_cb);
		generatedEasy.curl_easy_setopt(CURLOPT_PROGRESSDATA, conn);
		generatedEasy.curl_easy_setopt(CURLOPT_LOW_SPEED_TIME, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_LOW_SPEED_LIMIT, -1024);
		generatedEasy.curl_easy_setopt(CURLOPT_OPENSOCKETFUNCTION, /* call this function to get a socket */opensocket);
		generatedEasy.curl_easy_setopt(CURLOPT_CLOSESOCKETFUNCTION, /* call this function to close a socket */close_socket);
		Object generatedMulti = this.getMulti();
		.fprintf(stdout, "\nAdding easy %p to multi %p (%s)", generatedEasy, generatedMulti, url);
		rc = ModernizedCProgram.curl_multi_add_handle(generatedMulti, generatedEasy);
		ModernizedCProgram.mcode_or_die("new_conn: curl_multi_add_handle", rc/* note that the add_handle() will set a time-out to trigger very soon so
		     that the necessary socket_action() call will be called by this app */);
	}
	public int init_fifo() {
		stat st = new stat();
		 sockfd = new ();
		.fprintf((_iob[1]), "Creating named pipe \"%s\"\n", ModernizedCProgram.fifo);
		Object generatedSt_mode = st.getSt_mode();
		if (.lstat(ModernizedCProgram.fifo, st) == 0) {
			if ((generatedSt_mode & -1024) == -1024) {
				(._errno()) = 17;
				.perror("lstat");
				.exit(1);
			} 
		} 
		.unlink(ModernizedCProgram.fifo);
		if (.mkfifo(ModernizedCProgram.fifo, 600) == -1) {
			.perror("mkfifo");
			.exit(1);
		} 
		sockfd = .open(ModernizedCProgram.fifo, 2 | O_NONBLOCK, 0);
		if (sockfd == -1) {
			.perror("open");
			.exit(1);
		} 
		this.setInput(.fdopen(sockfd, "r"));
		.fprintf((_iob[1]), "Now, pipe some URL's into > %s\n", ModernizedCProgram.fifo);
		event generatedFifo_event = this.getFifo_event();
		event_base generatedEvbase = this.getEvbase();
		.event_assign(generatedFifo_event, generatedEvbase, sockfd, EV_READ | EV_PERSIST, fifo_cb, g);
		.event_add(generatedFifo_event, ((Object)0));
		return (false);
		stat st = new stat();
		byte fifo = "hiper.fifo";
		int socket;
		Object generatedSt_mode = st.getSt_mode();
		if (.lstat(fifo, st) == 0) {
			if ((generatedSt_mode & -1024) == -1024) {
				(._errno()) = 17;
				.perror("lstat");
				.exit(1);
			} 
		} 
		.unlink(fifo);
		if (.mkfifo(fifo, 600) == -1) {
			.perror("mkfifo");
			.exit(1);
		} 
		socket = .open(fifo, 2 | O_NONBLOCK, 0);
		if (socket == -1) {
			.perror("open");
			.exit(1);
		} 
		.g_print("Now, pipe some URL's into > %s\n", fifo);
		return socket;
		stat st = new stat();
		byte fifo = "hiper.fifo";
		 sockfd = new ();
		.fprintf((_iob[1]), "Creating named pipe \"%s\"\n", fifo);
		Object generatedSt_mode = st.getSt_mode();
		if (.lstat(fifo, st) == 0) {
			if ((generatedSt_mode & -1024) == -1024) {
				(._errno()) = 17;
				.perror("lstat");
				.exit(1);
			} 
		} 
		.unlink(fifo);
		if (.mkfifo(fifo, 600) == -1) {
			.perror("mkfifo");
			.exit(1);
		} 
		sockfd = .open(fifo, 2 | O_NONBLOCK, 0);
		if (sockfd == -1) {
			.perror("open");
			.exit(1);
		} 
		this.setInput(.fdopen(sockfd, "r"));
		.fprintf((_iob[1]), "Now, pipe some URL's into > %s\n", fifo);
		event generatedFifo_event = this.getFifo_event();
		.ev_io_init(generatedFifo_event, fifo_cb, sockfd, EV_READ);
		Object generatedLoop = this.getLoop();
		.ev_io_start(generatedLoop, generatedFifo_event);
		return (false);
		stat st = new stat();
		 sockfd = new ();
		epoll_event epev = new epoll_event();
		.fprintf((_iob[1]), "Creating named pipe \"%s\"\n", ModernizedCProgram.fifo);
		Object generatedSt_mode = st.getSt_mode();
		if (.lstat(ModernizedCProgram.fifo, st) == 0) {
			if ((generatedSt_mode & -1024) == -1024) {
				(._errno()) = 17;
				.perror("lstat");
				.exit(1);
			} 
		} 
		.unlink(ModernizedCProgram.fifo);
		if (.mkfifo(ModernizedCProgram.fifo, 600) == -1) {
			.perror("mkfifo");
			.exit(1);
		} 
		sockfd = .open(ModernizedCProgram.fifo, 2 | O_NONBLOCK, 0);
		if (sockfd == -1) {
			.perror("open");
			.exit(1);
		} 
		this.setFifofd(sockfd);
		this.setInput(.fdopen(sockfd, "r"));
		epev.setEpoll_event(EPOLLIN);
		Object generatedEpoll_event = epev.getEpoll_event();
		generatedEpoll_event.setFd(sockfd);
		Object generatedEpfd = this.getEpfd();
		.epoll_ctl(generatedEpfd, EPOLL_CTL_ADD, sockfd, epev);
		.fprintf((_iob[1]), "Now, pipe some URL's into > %s\n", ModernizedCProgram.fifo);
		return 0;
	}
	public void clean_fifo() {
		event generatedFifo_event = this.getFifo_event();
		.event_del(generatedFifo_event);
		_iobuf generatedInput = this.getInput();
		.fclose(generatedInput);
		.unlink(ModernizedCProgram.fifo);
		Object generatedEpfd = this.getEpfd();
		Object generatedFifofd = this.getFifofd();
		.epoll_ctl(generatedEpfd, EPOLL_CTL_DEL, generatedFifofd, ((Object)0));
		_iobuf generatedInput = this.getInput();
		.fclose(generatedInput);
		.unlink(ModernizedCProgram.fifo);
	}
	public event_base getEvbase() {
		return evbase;
	}
	public void setEvbase(event_base newEvbase) {
		evbase = newEvbase;
	}
	public event getFifo_event() {
		return fifo_event;
	}
	public void setFifo_event(event newFifo_event) {
		fifo_event = newFifo_event;
	}
	public event getTimer_event() {
		return timer_event;
	}
	public void setTimer_event(event newTimer_event) {
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
	public int getStopped() {
		return stopped;
	}
	public void setStopped(int newStopped) {
		stopped = newStopped;
	}
}
