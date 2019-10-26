package application;

/*
 * Rufus: The Reliable USB Formatting Utility
 * Virtual Disk Handling functions
 * Copyright © 2013-2016 Pete Batard <pete@akeo.ie>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * VHD Fixed HD footer (Big Endian)
 * http://download.microsoft.com/download/f/f/e/ffef50a5-07dd-4cf8-aaa3-442c0673a029/Virtual%20Hard%20Disk%20Format%20Spec_10_18_06.doc
 * NB: If a dymamic implementation is needed, check the GPL v3 compatible C++ implementation from:
 * https://sourceforge.net/p/urbackup/backend/ci/master/tree/fsimageplugin/
 */
public class vhd_footer {
	private Object cookie;
	private Object features;
	private Object file_format_version;
	private Object data_offset;
	private Object timestamp;
	private Object creator_app;
	private Object creator_version;
	private Object creator_host_os;
	private Object original_size;
	private Object current_size;
	private  disk_geometry;
	private Object disk_type;
	private Object checksum;
	private Object unique_id;
	private Object saved_state;
	private Object reserved;
	
	public vhd_footer(Object cookie, Object features, Object file_format_version, Object data_offset, Object timestamp, Object creator_app, Object creator_version, Object creator_host_os, Object original_size, Object current_size,  disk_geometry, Object disk_type, Object checksum, Object unique_id, Object saved_state, Object reserved) {
		setCookie(cookie);
		setFeatures(features);
		setFile_format_version(file_format_version);
		setData_offset(data_offset);
		setTimestamp(timestamp);
		setCreator_app(creator_app);
		setCreator_version(creator_version);
		setCreator_host_os(creator_host_os);
		setOriginal_size(original_size);
		setCurrent_size(current_size);
		setDisk_geometry(disk_geometry);
		setDisk_type(disk_type);
		setChecksum(checksum);
		setUnique_id(unique_id);
		setSaved_state(saved_state);
		setReserved(reserved);
	}
	public vhd_footer() {
	}
	
	public Object getCookie() {
		return cookie;
	}
	public void setCookie(Object newCookie) {
		cookie = newCookie;
	}
	public Object getFeatures() {
		return features;
	}
	public void setFeatures(Object newFeatures) {
		features = newFeatures;
	}
	public Object getFile_format_version() {
		return file_format_version;
	}
	public void setFile_format_version(Object newFile_format_version) {
		file_format_version = newFile_format_version;
	}
	public Object getData_offset() {
		return data_offset;
	}
	public void setData_offset(Object newData_offset) {
		data_offset = newData_offset;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public Object getCreator_app() {
		return creator_app;
	}
	public void setCreator_app(Object newCreator_app) {
		creator_app = newCreator_app;
	}
	public Object getCreator_version() {
		return creator_version;
	}
	public void setCreator_version(Object newCreator_version) {
		creator_version = newCreator_version;
	}
	public Object getCreator_host_os() {
		return creator_host_os;
	}
	public void setCreator_host_os(Object newCreator_host_os) {
		creator_host_os = newCreator_host_os;
	}
	public Object getOriginal_size() {
		return original_size;
	}
	public void setOriginal_size(Object newOriginal_size) {
		original_size = newOriginal_size;
	}
	public Object getCurrent_size() {
		return current_size;
	}
	public void setCurrent_size(Object newCurrent_size) {
		current_size = newCurrent_size;
	}
	public  getDisk_geometry() {
		return disk_geometry;
	}
	public void setDisk_geometry( newDisk_geometry) {
		disk_geometry = newDisk_geometry;
	}
	public Object getDisk_type() {
		return disk_type;
	}
	public void setDisk_type(Object newDisk_type) {
		disk_type = newDisk_type;
	}
	public Object getChecksum() {
		return checksum;
	}
	public void setChecksum(Object newChecksum) {
		checksum = newChecksum;
	}
	public Object getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(Object newUnique_id) {
		unique_id = newUnique_id;
	}
	public Object getSaved_state() {
		return saved_state;
	}
	public void setSaved_state(Object newSaved_state) {
		saved_state = newSaved_state;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
