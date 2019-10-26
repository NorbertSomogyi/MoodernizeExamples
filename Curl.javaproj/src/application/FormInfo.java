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
	private Byte name;
	private  name_alloc;
	private Object namelength;
	private Byte value;
	private  value_alloc;
	private Object contentslength;
	private Byte contenttype;
	private  contenttype_alloc;
	private long flags;
	private Byte buffer;
	private Object bufferlength;
	private Byte showfilename;
	private  showfilename_alloc;
	private Byte userp;
	private curl_slist contentheader;
	private FormInfo more;
	
	public FormInfo(Byte name,  name_alloc, Object namelength, Byte value,  value_alloc, Object contentslength, Byte contenttype,  contenttype_alloc, long flags, Byte buffer, Object bufferlength, Byte showfilename,  showfilename_alloc, Byte userp, curl_slist contentheader, FormInfo more) {
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
	
	public FormInfo AddFormInfo(Byte value, Byte contenttype) {
		FormInfo form_info = new FormInfo();
		form_info = .Curl_ccalloc(1, );
		if (form_info) {
			if (value) {
				form_info.setValue(value);
			} 
			if (contenttype) {
				form_info.setContenttype(contenttype);
			} 
			form_info.setFlags(CURL_HTTPPOST_FILENAME);
		} else {
				return ((Object)0);
		} 
		FormInfo generatedMore = this.getMore();
		if (parent_form_info) {
			form_info.setMore(generatedMore);
			this.setMore(/* then move the original 'more' to point to ourselves */form_info);
		} 
		return form_info/***************************************************************************
		 *
		 * FormAdd()
		 *
		 * Stores a formpost parameter and builds the appropriate linked list.
		 *
		 * Has two principal functionalities: using files and byte arrays as
		 * post parts. Byte arrays are either copied or just the pointer is stored
		 * (as the user requests) while for files only the filename and not the
		 * content is stored.
		 *
		 * While you may have only one byte array for each name, multiple filenames
		 * are allowed (and because of this feature CURLFORM_END is needed after
		 * using CURLFORM_FILE).
		 *
		 * Examples:
		 *
		 * Simple name/value pair with copied contents:
		 * curl_formadd (&post, &last, CURLFORM_COPYNAME, "name",
		 * CURLFORM_COPYCONTENTS, "value", CURLFORM_END);
		 *
		 * name/value pair where only the content pointer is remembered:
		 * curl_formadd (&post, &last, CURLFORM_COPYNAME, "name",
		 * CURLFORM_PTRCONTENTS, ptr, CURLFORM_CONTENTSLENGTH, 10, CURLFORM_END);
		 * (if CURLFORM_CONTENTSLENGTH is missing strlen () is used)
		 *
		 * storing a filename (CONTENTTYPE is optional!):
		 * curl_formadd (&post, &last, CURLFORM_COPYNAME, "name",
		 * CURLFORM_FILE, "filename1", CURLFORM_CONTENTTYPE, "plain/text",
		 * CURLFORM_END);
		 *
		 * storing multiple filenames:
		 * curl_formadd (&post, &last, CURLFORM_COPYNAME, "name",
		 * CURLFORM_FILE, "filename1", CURLFORM_FILE, "filename2", CURLFORM_END);
		 *
		 * Returns:
		 * CURL_FORMADD_OK             on success
		 * CURL_FORMADD_MEMORY         if the FormInfo allocation fails
		 * CURL_FORMADD_OPTION_TWICE   if one option is given twice for one Form
		 * CURL_FORMADD_NULL           if a null pointer was given for a char
		 * CURL_FORMADD_MEMORY         if the allocation of a FormInfo struct failed
		 * CURL_FORMADD_UNKNOWN_OPTION if an unknown option was used
		 * CURL_FORMADD_INCOMPLETE     if the some FormInfo is not complete (or error)
		 * CURL_FORMADD_MEMORY         if a HttpPost struct cannot be allocated
		 * CURL_FORMADD_MEMORY         if some allocation for string copying failed.
		 * CURL_FORMADD_ILLEGAL_ARRAY  if an illegal option is used in an array
		 *
		 ***************************************************************************/;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
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
	public Byte getValue() {
		return value;
	}
	public void setValue(Byte newValue) {
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
	public Byte getContenttype() {
		return contenttype;
	}
	public void setContenttype(Byte newContenttype) {
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
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
		buffer = newBuffer;
	}
	public Object getBufferlength() {
		return bufferlength;
	}
	public void setBufferlength(Object newBufferlength) {
		bufferlength = newBufferlength;
	}
	public Byte getShowfilename() {
		return showfilename;
	}
	public void setShowfilename(Byte newShowfilename) {
		showfilename = newShowfilename;
	}
	public  getShowfilename_alloc() {
		return showfilename_alloc;
	}
	public void setShowfilename_alloc( newShowfilename_alloc) {
		showfilename_alloc = newShowfilename_alloc;
	}
	public Byte getUserp() {
		return userp;
	}
	public void setUserp(Byte newUserp) {
		userp = newUserp;
	}
	public curl_slist getContentheader() {
		return contentheader;
	}
	public void setContentheader(curl_slist newContentheader) {
		contentheader = newContentheader;
	}
	public FormInfo getMore() {
		return more;
	}
	public void setMore(FormInfo newMore) {
		more = newMore;
	}
}
