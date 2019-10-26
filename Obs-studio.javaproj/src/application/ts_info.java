package application;

/******************************************************************************
    Copyright (C) 2015 by Hugh Bailey <obs.jim@gmail.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
******************************************************************************/
public class ts_info {
	private Object start;
	private Object end;
	
	public ts_info(Object start, Object end) {
		setStart(start);
		setEnd(end);
	}
	public ts_info() {
	}
	
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
}
