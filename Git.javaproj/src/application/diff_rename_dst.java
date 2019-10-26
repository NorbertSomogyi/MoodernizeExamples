package application;

/*
 * Copyright (C) 2005 Junio C Hamano
 */
/* Table of rename/copy destinations */
public class diff_rename_dst {
	private diff_filespec two;
	private diff_filepair pair;
	
	public diff_rename_dst(diff_filespec two, diff_filepair pair) {
		setTwo(two);
		setPair(pair);
	}
	public diff_rename_dst() {
	}
	
	public diff_rename_dst locate_rename_dst(diff_filespec two) {
		int ofs = two.find_rename_dst();
		return ofs < 0 ? ((Object)0) : rename_dst[ofs/*
		 * Returns 0 on success, -1 if we found a duplicate.
		 */];
	}
	public diff_filespec getTwo() {
		return two;
	}
	public void setTwo(diff_filespec newTwo) {
		two = newTwo;
	}
	public diff_filepair getPair() {
		return pair;
	}
	public void setPair(diff_filepair newPair) {
		pair = newPair;
	}
}
