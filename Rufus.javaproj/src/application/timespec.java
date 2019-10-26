package application;

/*
    Copyright (C) 2005, 2008, 2012 Rocky Bernstein <rocky@gnu.org>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
/*!
 * \file udf_time.h
 *
 * \brief UDF time conversion and access files.
 *
*/
public class timespec {
	private Object tv_sec;
	private long tv_nsec;
	
	public timespec(Object tv_sec, long tv_nsec) {
		setTv_sec(tv_sec);
		setTv_nsec(tv_nsec);
	}
	public timespec() {
	}
	
	public Object getTv_sec() {
		return tv_sec;
	}
	public void setTv_sec(Object newTv_sec) {
		tv_sec = newTv_sec;
	}
	public long getTv_nsec() {
		return tv_nsec;
	}
	public void setTv_nsec(long newTv_nsec) {
		tv_nsec = newTv_nsec;
	}
}
