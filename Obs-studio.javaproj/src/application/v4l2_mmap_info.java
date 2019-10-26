package application;

/*
Copyright (C) 2014 by Leonhard Oelke <leonhard@in-verted.de>

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
*/
/**
 * Data structure for mapped buffers
 */
public class v4l2_mmap_info {
	private Object length;
	private Object start;
	
	public v4l2_mmap_info(Object length, Object start) {
		setLength(length);
		setStart(start);
	}
	public v4l2_mmap_info() {
	}
	
	public Object getLength() {
		return length;
	}
	public void setLength(Object newLength) {
		length = newLength;
	}
	public Object getStart() {
		return start;
	}
	public void setStart(Object newStart) {
		start = newStart;
	}
}
/** length of the mapped buffer */
/**
 * Convert v4l2 pixel format to obs video format
 *
 * @param format v4l2 format id
 *
 * @return obs video_format id
 */
