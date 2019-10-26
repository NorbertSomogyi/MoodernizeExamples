package application;

/*
  Copyright (C) 2005, 2008, 2011, 2016 Rocky Bernstein <rocky@gnu.org>
  Copyright (C) 2000 Herbert Valerio Riedel <hvr@gnu.org>

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
public class _CdioList {
	private int length;
	private Object begin;
	private Object end;
	
	public _CdioList(int length, Object begin, Object end) {
		setLength(length);
		setBegin(begin);
		setEnd(end);
	}
	public _CdioList() {
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int newLength) {
		length = newLength;
	}
	public Object getBegin() {
		return begin;
	}
	public void setBegin(Object newBegin) {
		begin = newBegin;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
}
