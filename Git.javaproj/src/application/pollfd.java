package application;

/* Header for poll(2) emulation
   Contributed by Paolo Bonzini.

   Copyright 2001, 2002, 2003, 2007, 2009, 2010 Free Software Foundation, Inc.

   This file is part of gnulib.

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2, or (at your option)
   any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License along
   with this program; if not, see <http://www.gnu.org/licenses/>.  */
/* Vista has its own, socket-only poll() */
/* fake a poll(2) environment */
/* any readable data available   */
/* OOB/Urgent readable data      */
/* file descriptor is writeable  */
/* some poll error occurred      */
/* file descriptor was "hung up" */
/* requested events "invalid"    */
public class pollfd {
	private int fd;
	private int events;
	private int revents;
	
	public pollfd(int fd, int events, int revents) {
		setFd(fd);
		setEvents(events);
		setRevents(revents);
	}
	public pollfd() {
	}
	
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
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
