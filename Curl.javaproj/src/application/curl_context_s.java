package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2018, Daniel Stenberg, <daniel@haxx.se>, et al.
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
 * multi_socket API using libuv
 * </DESC>
 */
/* Example application using the multi socket interface to download multiple
   files in parallel, powered by libuv.

   Requires libuv and (of course) libcurl.

   See https://nikhilm.github.io/uvbook/ for more information on libuv.
*/
public class curl_context_s {
	private Object poll_handle;
	private Object sockfd;
	
	public curl_context_s(Object poll_handle, Object sockfd) {
		setPoll_handle(poll_handle);
		setSockfd(sockfd);
	}
	public curl_context_s() {
	}
	
	public curl_context_s create_curl_context(Object sockfd) {
		curl_context_t context = new curl_context_t();
		context = (curl_context_t).malloc();
		context.setSockfd(sockfd);
		Object generatedPoll_handle = context.getPoll_handle();
		.uv_poll_init_socket(ModernizedCProgram.loop, generatedPoll_handle, sockfd);
		generatedPoll_handle.setData(context);
		return context;
		curl_context_t context = new curl_context_t();
		context = (curl_context_t).malloc();
		context.setSockfd(sockfd);
		context.setEvent(.event_new(ModernizedCProgram.base, sockfd, 0, ModernizedCProgram.curl_perform, context));
		return context;
	}
	public void destroy_curl_context() {
		Object generatedPoll_handle = this.getPoll_handle();
		.uv_close(()generatedPoll_handle, curl_close_cb);
		Object generatedEvent = this.getEvent();
		.event_del(generatedEvent);
		.event_free(generatedEvent);
		.free(context);
	}
	public Object getPoll_handle() {
		return poll_handle;
	}
	public void setPoll_handle(Object newPoll_handle) {
		poll_handle = newPoll_handle;
	}
	public Object getSockfd() {
		return sockfd;
	}
	public void setSockfd(Object newSockfd) {
		sockfd = newSockfd;
	}
}
