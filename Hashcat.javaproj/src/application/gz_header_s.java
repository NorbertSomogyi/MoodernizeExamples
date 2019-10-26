package application;

/*
     gzip header information passed to and from zlib routines.  See RFC 1952
  for more details on the meanings of these fields.
*/
public class gz_header_s {
	private int text;
	private Object time;
	private int xflags;
	private int os;
	private Object extra;
	private Object extra_len;
	private Object extra_max;
	private Object name;
	private Object name_max;
	private Object comment;
	private Object comm_max;
	private int hcrc;
	private int done;
	
	public gz_header_s(int text, Object time, int xflags, int os, Object extra, Object extra_len, Object extra_max, Object name, Object name_max, Object comment, Object comm_max, int hcrc, int done) {
		setText(text);
		setTime(time);
		setXflags(xflags);
		setOs(os);
		setExtra(extra);
		setExtra_len(extra_len);
		setExtra_max(extra_max);
		setName(name);
		setName_max(name_max);
		setComment(comment);
		setComm_max(comm_max);
		setHcrc(hcrc);
		setDone(done);
	}
	public gz_header_s() {
	}
	
	public int getText() {
		return text;
	}
	public void setText(int newText) {
		text = newText;
	}
	public Object getTime() {
		return time;
	}
	public void setTime(Object newTime) {
		time = newTime;
	}
	public int getXflags() {
		return xflags;
	}
	public void setXflags(int newXflags) {
		xflags = newXflags;
	}
	public int getOs() {
		return os;
	}
	public void setOs(int newOs) {
		os = newOs;
	}
	public Object getExtra() {
		return extra;
	}
	public void setExtra(Object newExtra) {
		extra = newExtra;
	}
	public Object getExtra_len() {
		return extra_len;
	}
	public void setExtra_len(Object newExtra_len) {
		extra_len = newExtra_len;
	}
	public Object getExtra_max() {
		return extra_max;
	}
	public void setExtra_max(Object newExtra_max) {
		extra_max = newExtra_max;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getName_max() {
		return name_max;
	}
	public void setName_max(Object newName_max) {
		name_max = newName_max;
	}
	public Object getComment() {
		return comment;
	}
	public void setComment(Object newComment) {
		comment = newComment;
	}
	public Object getComm_max() {
		return comm_max;
	}
	public void setComm_max(Object newComm_max) {
		comm_max = newComm_max;
	}
	public int getHcrc() {
		return hcrc;
	}
	public void setHcrc(int newHcrc) {
		hcrc = newHcrc;
	}
	public int getDone() {
		return done;
	}
	public void setDone(int newDone) {
		done = newDone;
	}
}
