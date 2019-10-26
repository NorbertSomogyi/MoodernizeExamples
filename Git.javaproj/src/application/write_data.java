package application;

public class write_data {
	private int index;
	private ewah_bitmap check_only;
	private ewah_bitmap valid;
	private ewah_bitmap sha1_valid;
	private strbuf out;
	private strbuf sb_stat;
	private strbuf sb_sha1;
	
	public write_data(int index, ewah_bitmap check_only, ewah_bitmap valid, ewah_bitmap sha1_valid, strbuf out, strbuf sb_stat, strbuf sb_sha1) {
		setIndex(index);
		setCheck_only(check_only);
		setValid(valid);
		setSha1_valid(sha1_valid);
		setOut(out);
		setSb_stat(sb_stat);
		setSb_sha1(sb_sha1);
	}
	public write_data() {
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
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
	public strbuf getOut() {
		return out;
	}
	public void setOut(strbuf newOut) {
		out = newOut;
	}
	public strbuf getSb_stat() {
		return sb_stat;
	}
	public void setSb_stat(strbuf newSb_stat) {
		sb_stat = newSb_stat;
	}
	public strbuf getSb_sha1() {
		return sb_sha1;
	}
	public void setSb_sha1(strbuf newSb_sha1) {
		sb_sha1 = newSb_sha1;
	}
}
