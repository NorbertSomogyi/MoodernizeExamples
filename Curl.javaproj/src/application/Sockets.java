package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2016, Daniel Stenberg, <daniel@haxx.se>, et al.
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
public class Sockets {
	private Object[] sockets;
	private int count;
	private int max_count;
	
	public Sockets(Object[] sockets, int count, int max_count) {
		setSockets(sockets);
		setCount(count);
		setMax_count(max_count);
	}
	public Sockets() {
	}
	
	public void removeFd(Object fd, int mention) {
		int i;
		if (mention) {
			(_iob[2]).curl_mfprintf("Remove socket fd %d\n", (int)fd);
		} 
		for (i = 0; i < ModernizedCProgram.sockets.getCount(); ++i) {
			if (ModernizedCProgram.sockets.getSockets()[i] == fd) {
				if (i < ModernizedCProgram.sockets.getCount() - 1) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(ModernizedCProgram.sockets.getSockets()[i], ModernizedCProgram.sockets.getSockets()[i + 1], /*Error: Unsupported expression*/ * (ModernizedCProgram.sockets.getCount() - (i + 1)));
				} 
				--ModernizedCProgram.sockets.getCount();
			} 
		}
	}
	/**
	 * Add a file descriptor to a sockets array.
	 */
	public void addFd(Object fd, Object what) {
		(_iob[2]).curl_mfprintf("Add socket fd %d for %s\n", (int)fd, what);
		ModernizedCProgram.sockets.removeFd(fd, 0/*
		   * Allocate array storage when required.
		   */);
		if (!ModernizedCProgram.sockets.getSockets()) {
			ModernizedCProgram.sockets.setSockets(/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/ * -1024));
			if (!ModernizedCProgram.sockets.getSockets()) {
				return /*Error: Unsupported expression*/;
			} 
			ModernizedCProgram.sockets.setMax_count(20);
		}  else if (ModernizedCProgram.sockets.getCount() + 1 > ModernizedCProgram.sockets.getMax_count()) {
			 oldptr = ModernizedCProgram.sockets.getSockets();
			ModernizedCProgram.sockets.setSockets(/*Error: Function owner not recognized*/realloc(oldptr, /*Error: Unsupported expression*/ * (ModernizedCProgram.sockets.getMax_count() + 20)));
			if (!ModernizedCProgram.sockets.getSockets()) {
				ModernizedCProgram.sockets.setSockets(/* cleanup in test_cleanup */oldptr);
				return /*Error: Unsupported expression*/;
			} 
			ModernizedCProgram.sockets.getMax_count() += 20/*
			   * Add file descriptor to array.
			   */;
		} 
		ModernizedCProgram.sockets.getSockets()[ModernizedCProgram.sockets.getCount()] = fd;
		++ModernizedCProgram.sockets.getCount();
	}
	/**
	   * To ensure we only have each file descriptor once, we remove it then add
	   * it again.
	   */
	public Object[] getSockets() {
		return sockets;
	}
	public void setSockets(Object[] newSockets) {
		sockets = newSockets;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public int getMax_count() {
		return max_count;
	}
	public void setMax_count(int newMax_count) {
		max_count = newMax_count;
	}
}
/**
 * Remove a file descriptor from a sockets array.
 */
