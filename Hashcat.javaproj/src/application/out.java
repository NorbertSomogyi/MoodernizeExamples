package application;

public class out {
	private hc_fp fp;
	private Object buf;
	private int len;
	
	public out(hc_fp fp, Object buf, int len) {
		setFp(fp);
		setBuf(buf);
		setLen(len);
	}
	public out() {
	}
	
	/**
	 * Author......: See docs/credits.txt
	 * License.....: MIT
	 */
	public void out_flush() {
		int generatedLen = this.getLen();
		if (generatedLen == 0) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedBuf = this.getBuf();
		hc_fp generatedFp = this.getFp();
		generatedFp.hc_fwrite(generatedBuf, 1, generatedLen);
		this.setLen(0);
	}
	public void out_push(Object pw_buf, Object pw_len) {
		Object generatedBuf = this.getBuf();
		int generatedLen = this.getLen();
		byte ptr = generatedBuf + generatedLen;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ptr, pw_buf, pw_len);
		ptr[pw_len + 0] = (byte)'\r';
		ptr[pw_len + 1] = (byte)'\n';
		generatedLen += pw_len + 2;
		if (generatedLen >= -1024 - 300) {
			out.out_flush();
		} 
	}
	public hc_fp getFp() {
		return fp;
	}
	public void setFp(hc_fp newFp) {
		fp = newFp;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
}
