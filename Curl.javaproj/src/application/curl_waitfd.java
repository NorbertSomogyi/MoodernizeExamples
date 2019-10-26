package application;

public class curl_waitfd {
	private Object fd;
	private int events;
	private int revents;
	
	public curl_waitfd(Object fd, int events, int revents) {
		setFd(fd);
		setEvents(events);
		setRevents(revents);
	}
	public curl_waitfd() {
	}
	
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
/*
 * Name:     curl_multi_poll()
 *
 * Desc:     Poll on all fds within a CURLM set as well as any
 *           additional fds passed to the function.
 *
 * Returns:  CURLMcode type, general multi error code.
 */
/*
  * Name:    curl_multi_perform()
  *
  * Desc:    When the app thinks there's data available for curl it calls this
  *          function to read/write whatever there is right now. This returns
  *          as soon as the reads and writes are done. This function does not
  *          require that there actually is data available for reading or that
  *          data can be written, it can be called just in case. It returns
  *          the number of handles that still transfer data in the second
  *          argument's integer-pointer.
  *
  * Returns: CURLMcode type, general multi error code. *NOTE* that this only
  *          returns errors etc regarding the whole multi stack. There might
  *          still have occurred problems on individual transfers even when
  *          this returns OK.
  */
