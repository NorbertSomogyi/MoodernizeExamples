package application;

/*
 *  LibXDiff by Davide Libenzi ( File Differential Library )
 *  Copyright (C) 2003  Davide Libenzi
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, see
 *  <http://www.gnu.org/licenses/>.
 *
 *  Davide Libenzi <davidel@xmailserver.org>
 *
 */
/* #ifdef __cplusplus */
/* xpparm_t.flags */
/* xdemitconf_t.flags */
/* merge simplification levels */
/* merge favor modes */
/* merge output styles */
public class s_mmfile {
	private Byte ptr;
	private long size;
	
	public s_mmfile(Byte ptr, long size) {
		setPtr(ptr);
		setSize(size);
	}
	public s_mmfile() {
	}
	
	public Object xdl_mmfile_first(Long size) {
		long generatedSize = this.getSize();
		size = generatedSize;
		Byte generatedPtr = this.getPtr();
		return generatedPtr;
	}
	public long xdl_mmfile_size() {
		long generatedSize = this.getSize();
		return generatedSize;
	}
	public long xdl_guess_lines(long sample) {
		long nl = 0;
		long size;
		long tsize = 0;
		byte data;
		byte cur;
		byte top;
		if ((cur = data = mf.xdl_mmfile_first(size)) != ((Object)0)) {
			for (top = data + size; nl < sample && cur < top; /*Error: Unsupported expression*/) {
				nl++;
				if (!(cur = /*Error: Function owner not recognized*/memchr(cur, (byte)'\n', top - cur))) {
					cur = top;
				} else {
						cur++;
				} 
			}
			tsize += (long)(cur - data);
		} 
		if (nl && tsize) {
			nl = mf.xdl_mmfile_size() / (tsize / nl);
		} 
		return nl + 1;
	}
	public Byte getPtr() {
		return ptr;
	}
	public void setPtr(Byte newPtr) {
		ptr = newPtr;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
}
