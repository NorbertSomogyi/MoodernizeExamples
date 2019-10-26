package application;

public class plain {
	private Object gidvid;
	private Object il_pos;
	private Object salt_pos;
	private Object digest_pos;
	private Object hash_pos;
	private Object extra1;
	private Object extra2;
	
	public plain(Object gidvid, Object il_pos, Object salt_pos, Object digest_pos, Object hash_pos, Object extra1, Object extra2) {
		setGidvid(gidvid);
		setIl_pos(il_pos);
		setSalt_pos(salt_pos);
		setDigest_pos(digest_pos);
		setHash_pos(hash_pos);
		setExtra1(extra1);
		setExtra2(extra2);
	}
	public plain() {
	}
	
	public Object getGidvid() {
		return gidvid;
	}
	public void setGidvid(Object newGidvid) {
		gidvid = newGidvid;
	}
	public Object getIl_pos() {
		return il_pos;
	}
	public void setIl_pos(Object newIl_pos) {
		il_pos = newIl_pos;
	}
	public Object getSalt_pos() {
		return salt_pos;
	}
	public void setSalt_pos(Object newSalt_pos) {
		salt_pos = newSalt_pos;
	}
	public Object getDigest_pos() {
		return digest_pos;
	}
	public void setDigest_pos(Object newDigest_pos) {
		digest_pos = newDigest_pos;
	}
	public Object getHash_pos() {
		return hash_pos;
	}
	public void setHash_pos(Object newHash_pos) {
		hash_pos = newHash_pos;
	}
	public Object getExtra1() {
		return extra1;
	}
	public void setExtra1(Object newExtra1) {
		extra1 = newExtra1;
	}
	public Object getExtra2() {
		return extra2;
	}
	public void setExtra2(Object newExtra2) {
		extra2 = newExtra2;
	}
}
