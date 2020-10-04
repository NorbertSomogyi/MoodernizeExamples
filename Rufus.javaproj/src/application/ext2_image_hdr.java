package application;

/*
 * e2image.h --- header file describing the ext2 image format
 *
 * Copyright (C) 2000 Theodore Ts'o.
 *
 * Note: this uses the POSIX IO interfaces, unlike most of the other
 * functions in this library.  So sue me.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
public class ext2_image_hdr {
	private Object magic_number;
	private Object[] magic_descriptor;
	private Object[] fs_hostname;
	private Object[] fs_netaddr;
	private Object fs_netaddr_type;
	private Object fs_device;
	private Object[] fs_device_name;
	private Object[] fs_uuid;
	private Object fs_blocksize;
	private Object[] fs_reserved;
	private Object image_device;
	private Object image_inode;
	private Object image_time;
	private Object[] image_reserved;
	private Object offset_super;
	private Object offset_inode;
	private Object offset_inodemap;
	private Object offset_blockmap;
	private Object[] offset_reserved;
	
	public ext2_image_hdr(Object magic_number, Object[] magic_descriptor, Object[] fs_hostname, Object[] fs_netaddr, Object fs_netaddr_type, Object fs_device, Object[] fs_device_name, Object[] fs_uuid, Object fs_blocksize, Object[] fs_reserved, Object image_device, Object image_inode, Object image_time, Object[] image_reserved, Object offset_super, Object offset_inode, Object offset_inodemap, Object offset_blockmap, Object[] offset_reserved) {
		setMagic_number(magic_number);
		setMagic_descriptor(magic_descriptor);
		setFs_hostname(fs_hostname);
		setFs_netaddr(fs_netaddr);
		setFs_netaddr_type(fs_netaddr_type);
		setFs_device(fs_device);
		setFs_device_name(fs_device_name);
		setFs_uuid(fs_uuid);
		setFs_blocksize(fs_blocksize);
		setFs_reserved(fs_reserved);
		setImage_device(image_device);
		setImage_inode(image_inode);
		setImage_time(image_time);
		setImage_reserved(image_reserved);
		setOffset_super(offset_super);
		setOffset_inode(offset_inode);
		setOffset_inodemap(offset_inodemap);
		setOffset_blockmap(offset_blockmap);
		setOffset_reserved(offset_reserved);
	}
	public ext2_image_hdr() {
	}
	
	public Object getMagic_number() {
		return magic_number;
	}
	public void setMagic_number(Object newMagic_number) {
		magic_number = newMagic_number;
	}
	public Object[] getMagic_descriptor() {
		return magic_descriptor;
	}
	public void setMagic_descriptor(Object[] newMagic_descriptor) {
		magic_descriptor = newMagic_descriptor;
	}
	public Object[] getFs_hostname() {
		return fs_hostname;
	}
	public void setFs_hostname(Object[] newFs_hostname) {
		fs_hostname = newFs_hostname;
	}
	public Object[] getFs_netaddr() {
		return fs_netaddr;
	}
	public void setFs_netaddr(Object[] newFs_netaddr) {
		fs_netaddr = newFs_netaddr;
	}
	public Object getFs_netaddr_type() {
		return fs_netaddr_type;
	}
	public void setFs_netaddr_type(Object newFs_netaddr_type) {
		fs_netaddr_type = newFs_netaddr_type;
	}
	public Object getFs_device() {
		return fs_device;
	}
	public void setFs_device(Object newFs_device) {
		fs_device = newFs_device;
	}
	public Object[] getFs_device_name() {
		return fs_device_name;
	}
	public void setFs_device_name(Object[] newFs_device_name) {
		fs_device_name = newFs_device_name;
	}
	public Object[] getFs_uuid() {
		return fs_uuid;
	}
	public void setFs_uuid(Object[] newFs_uuid) {
		fs_uuid = newFs_uuid;
	}
	public Object getFs_blocksize() {
		return fs_blocksize;
	}
	public void setFs_blocksize(Object newFs_blocksize) {
		fs_blocksize = newFs_blocksize;
	}
	public Object[] getFs_reserved() {
		return fs_reserved;
	}
	public void setFs_reserved(Object[] newFs_reserved) {
		fs_reserved = newFs_reserved;
	}
	public Object getImage_device() {
		return image_device;
	}
	public void setImage_device(Object newImage_device) {
		image_device = newImage_device;
	}
	public Object getImage_inode() {
		return image_inode;
	}
	public void setImage_inode(Object newImage_inode) {
		image_inode = newImage_inode;
	}
	public Object getImage_time() {
		return image_time;
	}
	public void setImage_time(Object newImage_time) {
		image_time = newImage_time;
	}
	public Object[] getImage_reserved() {
		return image_reserved;
	}
	public void setImage_reserved(Object[] newImage_reserved) {
		image_reserved = newImage_reserved;
	}
	public Object getOffset_super() {
		return offset_super;
	}
	public void setOffset_super(Object newOffset_super) {
		offset_super = newOffset_super;
	}
	public Object getOffset_inode() {
		return offset_inode;
	}
	public void setOffset_inode(Object newOffset_inode) {
		offset_inode = newOffset_inode;
	}
	public Object getOffset_inodemap() {
		return offset_inodemap;
	}
	public void setOffset_inodemap(Object newOffset_inodemap) {
		offset_inodemap = newOffset_inodemap;
	}
	public Object getOffset_blockmap() {
		return offset_blockmap;
	}
	public void setOffset_blockmap(Object newOffset_blockmap) {
		offset_blockmap = newOffset_blockmap;
	}
	public Object[] getOffset_reserved() {
		return offset_reserved;
	}
	public void setOffset_reserved(Object[] newOffset_reserved) {
		offset_reserved = newOffset_reserved;
	}
}
