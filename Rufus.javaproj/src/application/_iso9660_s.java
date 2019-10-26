package application;

/*
  Copyright (C) 2003-2008, 2011-2015, 2017 Rocky Bernstein <rocky@gnu.org>
  Copyright (C) 2001 Herbert Valerio Riedel <hvr@gnu.org>

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
/* iso9660 filesystem-based routines */
/* FIXME: _cdio_list_free for iso9660 statbuf is insufficient because it doesn't
   free bits that are allocated inside the data. */
/* Private headers */
/** Implementation of iso9660_t type */
public class _iso9660_s {
	private _CdioDataSource stream;
	private Object b_xa;
	private Object b_mode2;
	private Object u_joliet_level;
	private Object pvd;
	private Object svd;
	private Object iso_extension_mask;
	private Object i_datastart;
	private Object i_framesize;
	private int i_fuzzy_offset;
	private Object b_have_superblock;
	
	public _iso9660_s(_CdioDataSource stream, Object b_xa, Object b_mode2, Object u_joliet_level, Object pvd, Object svd, Object iso_extension_mask, Object i_datastart, Object i_framesize, int i_fuzzy_offset, Object b_have_superblock) {
		setStream(stream);
		setB_xa(b_xa);
		setB_mode2(b_mode2);
		setU_joliet_level(u_joliet_level);
		setPvd(pvd);
		setSvd(svd);
		setIso_extension_mask(iso_extension_mask);
		setI_datastart(i_datastart);
		setI_framesize(i_framesize);
		setI_fuzzy_offset(i_fuzzy_offset);
		setB_have_superblock(b_have_superblock);
	}
	public _iso9660_s() {
	}
	
	public _CdioDataSource getStream() {
		return stream;
	}
	public void setStream(_CdioDataSource newStream) {
		stream = newStream;
	}
	public Object getB_xa() {
		return b_xa;
	}
	public void setB_xa(Object newB_xa) {
		b_xa = newB_xa;
	}
	public Object getB_mode2() {
		return b_mode2;
	}
	public void setB_mode2(Object newB_mode2) {
		b_mode2 = newB_mode2;
	}
	public Object getU_joliet_level() {
		return u_joliet_level;
	}
	public void setU_joliet_level(Object newU_joliet_level) {
		u_joliet_level = newU_joliet_level;
	}
	public Object getPvd() {
		return pvd;
	}
	public void setPvd(Object newPvd) {
		pvd = newPvd;
	}
	public Object getSvd() {
		return svd;
	}
	public void setSvd(Object newSvd) {
		svd = newSvd;
	}
	public Object getIso_extension_mask() {
		return iso_extension_mask;
	}
	public void setIso_extension_mask(Object newIso_extension_mask) {
		iso_extension_mask = newIso_extension_mask;
	}
	public Object getI_datastart() {
		return i_datastart;
	}
	public void setI_datastart(Object newI_datastart) {
		i_datastart = newI_datastart;
	}
	public Object getI_framesize() {
		return i_framesize;
	}
	public void setI_framesize(Object newI_framesize) {
		i_framesize = newI_framesize;
	}
	public int getI_fuzzy_offset() {
		return i_fuzzy_offset;
	}
	public void setI_fuzzy_offset(int newI_fuzzy_offset) {
		i_fuzzy_offset = newI_fuzzy_offset;
	}
	public Object getB_have_superblock() {
		return b_have_superblock;
	}
	public void setB_have_superblock(Object newB_have_superblock) {
		b_have_superblock = newB_have_superblock;
	}
}
