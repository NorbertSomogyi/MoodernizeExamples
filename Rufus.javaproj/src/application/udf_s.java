package application;

/*
  Copyright (C) 2005, 2006, 2008, 2011, 2012 Rocky Bernstein <rocky@gnu.org>

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
/* Implementation of opaque types */
public class udf_s {
	private Object b_stream;
	private Object i_position;
	private _CdioDataSource stream;
	private Object cdio;
	private Object anchor_vol_desc_ptr;
	private Object pvd_lba;
	private Object i_partition;
	private Object i_part_start;
	private Object lvd_lba;
	private Object fsd_offset;
	
	public udf_s(Object b_stream, Object i_position, _CdioDataSource stream, Object cdio, Object anchor_vol_desc_ptr, Object pvd_lba, Object i_partition, Object i_part_start, Object lvd_lba, Object fsd_offset) {
		setB_stream(b_stream);
		setI_position(i_position);
		setStream(stream);
		setCdio(cdio);
		setAnchor_vol_desc_ptr(anchor_vol_desc_ptr);
		setPvd_lba(pvd_lba);
		setI_partition(i_partition);
		setI_part_start(i_part_start);
		setLvd_lba(lvd_lba);
		setFsd_offset(fsd_offset);
	}
	public udf_s() {
	}
	
	public Object getB_stream() {
		return b_stream;
	}
	public void setB_stream(Object newB_stream) {
		b_stream = newB_stream;
	}
	public Object getI_position() {
		return i_position;
	}
	public void setI_position(Object newI_position) {
		i_position = newI_position;
	}
	public _CdioDataSource getStream() {
		return stream;
	}
	public void setStream(_CdioDataSource newStream) {
		stream = newStream;
	}
	public Object getCdio() {
		return cdio;
	}
	public void setCdio(Object newCdio) {
		cdio = newCdio;
	}
	public Object getAnchor_vol_desc_ptr() {
		return anchor_vol_desc_ptr;
	}
	public void setAnchor_vol_desc_ptr(Object newAnchor_vol_desc_ptr) {
		anchor_vol_desc_ptr = newAnchor_vol_desc_ptr;
	}
	public Object getPvd_lba() {
		return pvd_lba;
	}
	public void setPvd_lba(Object newPvd_lba) {
		pvd_lba = newPvd_lba;
	}
	public Object getI_partition() {
		return i_partition;
	}
	public void setI_partition(Object newI_partition) {
		i_partition = newI_partition;
	}
	public Object getI_part_start() {
		return i_part_start;
	}
	public void setI_part_start(Object newI_part_start) {
		i_part_start = newI_part_start;
	}
	public Object getLvd_lba() {
		return lvd_lba;
	}
	public void setLvd_lba(Object newLvd_lba) {
		lvd_lba = newLvd_lba;
	}
	public Object getFsd_offset() {
		return fsd_offset;
	}
	public void setFsd_offset(Object newFsd_offset) {
		fsd_offset = newFsd_offset;
	}
}
