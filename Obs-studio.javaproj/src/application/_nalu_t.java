package application;

/******************************************************************************
    Copyright (C) 2017 by Quinn Damerell <qdamere@microsoft.com>

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
public class _nalu_t {
	private int len;
	private int dts_usec;
	private int send_marker_bit;
	private Object data;
	
	public _nalu_t(int len, int dts_usec, int send_marker_bit, Object data) {
		setLen(len);
		setDts_usec(dts_usec);
		setSend_marker_bit(send_marker_bit);
		setData(data);
	}
	public _nalu_t() {
	}
	
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public int getDts_usec() {
		return dts_usec;
	}
	public void setDts_usec(int newDts_usec) {
		dts_usec = newDts_usec;
	}
	public int getSend_marker_bit() {
		return send_marker_bit;
	}
	public void setSend_marker_bit(int newSend_marker_bit) {
		send_marker_bit = newSend_marker_bit;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
