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
