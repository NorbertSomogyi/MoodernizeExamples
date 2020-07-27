package application;

public class read_data {
	private int index;
	private untracked_cache_dir[][] ucd;
	private ewah_bitmap check_only;
	private ewah_bitmap valid;
	private ewah_bitmap sha1_valid;
	private Object data;
	private Object end;
	
	public read_data(int index, untracked_cache_dir[][] ucd, ewah_bitmap check_only, ewah_bitmap valid, ewah_bitmap sha1_valid, Object data, Object end) {
		setIndex(index);
		setUcd(ucd);
		setCheck_only(check_only);
		setValid(valid);
		setSha1_valid(sha1_valid);
		setData(data);
		setEnd(end);
	}
	public read_data() {
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
	}
	public untracked_cache_dir[][] getUcd() {
		return ucd;
	}
	public void setUcd(untracked_cache_dir[][] newUcd) {
		ucd = newUcd;
	}
	public ewah_bitmap getCheck_only() {
		return check_only;
	}
	public void setCheck_only(ewah_bitmap newCheck_only) {
		check_only = newCheck_only;
	}
	public ewah_bitmap getValid() {
		return valid;
	}
	public void setValid(ewah_bitmap newValid) {
		valid = newValid;
	}
	public ewah_bitmap getSha1_valid() {
		return sha1_valid;
	}
	public void setSha1_valid(ewah_bitmap newSha1_valid) {
		sha1_valid = newSha1_valid;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
}
