package application;

public class curl_context_s {
	private event event;
	private Object sockfd;
	
	public curl_context_s(event event, Object sockfd) {
		setEvent(event);
		setSockfd(sockfd);
	}
	public curl_context_s() {
	}
	
	public curl_context_s create_curl_context(Object sockfd) {
		curl_context_t context = new curl_context_t();
		context = (curl_context_t)/*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
		context.setSockfd(sockfd);
		context.setEvent(/*Error: Function owner not recognized*/event_new(ModernizedCProgram.base, sockfd, 0, ModernizedCProgram.curl_perform, context));
		return context;
		curl_context_t context = new curl_context_t();
		context = (curl_context_t)/*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
		context.setSockfd(sockfd);
		Object generatedPoll_handle = context.getPoll_handle();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/uv_poll_init_socket(ModernizedCProgram.loop, generatedPoll_handle, sockfd);
		generatedPoll_handle.setData(context);
		return context;
	}
	public void destroy_curl_context() {
		event generatedEvent = this.getEvent();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/event_del(generatedEvent);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/event_free(generatedEvent);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(context);
		Object generatedPoll_handle = this.getPoll_handle();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/uv_close(()generatedPoll_handle, curl_close_cb);
	}
	public event getEvent() {
		return event;
	}
	public void setEvent(event newEvent) {
		event = newEvent;
	}
	public Object getSockfd() {
		return sockfd;
	}
	public void setSockfd(Object newSockfd) {
		sockfd = newSockfd;
	}
}
