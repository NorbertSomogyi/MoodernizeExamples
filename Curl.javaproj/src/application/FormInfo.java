package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution. The terms
 * are also available at https://curl.haxx.se/docs/copyright.html.
 *
 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
 * copies of the Software, and permit persons to whom the Software is
 * furnished to do so, under the terms of the COPYING file.
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied.
 *
 ***************************************************************************/
/* used by FormAdd for temporary storage */
/* used by FormAdd for temporary storage */
public class FormInfo {
	private Object name;
	private  name_alloc;
	private Object namelength;
	private Object value;
	private  value_alloc;
	private Object contentslength;
	private Object contenttype;
	private  contenttype_alloc;
	private long flags;
	private Object buffer;
	private Object bufferlength;
	private Object showfilename;
	private  showfilename_alloc;
	private Object userp;
	private Object contentheader;
	private Object more;
	
	public FormInfo(Object name,  name_alloc, Object namelength, Object value,  value_alloc, Object contentslength, Object contenttype,  contenttype_alloc, long flags, Object buffer, Object bufferlength, Object showfilename,  showfilename_alloc, Object userp, Object contentheader, Object more) {
		setName(name);
		setName_alloc(name_alloc);
		setNamelength(namelength);
		setValue(value);
		setValue_alloc(value_alloc);
		setContentslength(contentslength);
		setContenttype(contenttype);
		setContenttype_alloc(contenttype_alloc);
		setFlags(flags);
		setBuffer(buffer);
		setBufferlength(bufferlength);
		setShowfilename(showfilename);
		setShowfilename_alloc(showfilename_alloc);
		setUserp(userp);
		setContentheader(contentheader);
		setMore(more);
	}
	public FormInfo() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public  getName_alloc() {
		return name_alloc;
	}
	public void setName_alloc( newName_alloc) {
		name_alloc = newName_alloc;
	}
	public Object getNamelength() {
		return namelength;
	}
	public void setNamelength(Object newNamelength) {
		namelength = newNamelength;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
	public  getValue_alloc() {
		return value_alloc;
	}
	public void setValue_alloc( newValue_alloc) {
		value_alloc = newValue_alloc;
	}
	public Object getContentslength() {
		return contentslength;
	}
	public void setContentslength(Object newContentslength) {
		contentslength = newContentslength;
	}
	public Object getContenttype() {
		return contenttype;
	}
	public void setContenttype(Object newContenttype) {
		contenttype = newContenttype;
	}
	public  getContenttype_alloc() {
		return contenttype_alloc;
	}
	public void setContenttype_alloc( newContenttype_alloc) {
		contenttype_alloc = newContenttype_alloc;
	}
	public long getFlags() {
		return flags;
	}
	public void setFlags(long newFlags) {
		flags = newFlags;
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
	public Object getBufferlength() {
		return bufferlength;
	}
	public void setBufferlength(Object newBufferlength) {
		bufferlength = newBufferlength;
	}
	public Object getShowfilename() {
		return showfilename;
	}
	public void setShowfilename(Object newShowfilename) {
		showfilename = newShowfilename;
	}
	public  getShowfilename_alloc() {
		return showfilename_alloc;
	}
	public void setShowfilename_alloc( newShowfilename_alloc) {
		showfilename_alloc = newShowfilename_alloc;
	}
	public Object getUserp() {
		return userp;
	}
	public void setUserp(Object newUserp) {
		userp = newUserp;
	}
	public Object getContentheader() {
		return contentheader;
	}
	public void setContentheader(Object newContentheader) {
		contentheader = newContentheader;
	}
	public Object getMore() {
		return more;
	}
	public void setMore(Object newMore) {
		more = newMore;
	}
}
