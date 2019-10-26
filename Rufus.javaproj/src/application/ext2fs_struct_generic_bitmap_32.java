package application;

/*
 * gen_bitmap.c --- Generic (32-bit) bitmap routines
 *
 * Copyright (C) 2001 Theodore Ts'o.
 *
 * %Begin-Header%
 * This file may be redistributed under the terms of the GNU Library
 * General Public License, version 2.
 * %End-Header%
 */
public class ext2fs_struct_generic_bitmap_32 {
	private Object magic;
	private Object fs;
	private Object start;
	private Object end;
	private Object real_end;
	private Byte description;
	private Byte bitmap;
	private Object base_error_code;
	private Object reserved;
	
	public ext2fs_struct_generic_bitmap_32(Object magic, Object fs, Object start, Object end, Object real_end, Byte description, Byte bitmap, Object base_error_code, Object reserved) {
		setMagic(magic);
		setFs(fs);
		setStart(start);
		setEnd(end);
		setReal_end(real_end);
		setDescription(description);
		setBitmap(bitmap);
		setBase_error_code(base_error_code);
		setReserved(reserved);
	}
	public ext2fs_struct_generic_bitmap_32() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getFs() {
		return fs;
	}
	public void setFs(Object newFs) {
		fs = newFs;
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
	public Object getReal_end() {
		return real_end;
	}
	public void setReal_end(Object newReal_end) {
		real_end = newReal_end;
	}
	public Byte getDescription() {
		return description;
	}
	public void setDescription(Byte newDescription) {
		description = newDescription;
	}
	public Byte getBitmap() {
		return bitmap;
	}
	public void setBitmap(Byte newBitmap) {
		bitmap = newBitmap;
	}
	public Object getBase_error_code() {
		return base_error_code;
	}
	public void setBase_error_code(Object newBase_error_code) {
		base_error_code = newBase_error_code;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
