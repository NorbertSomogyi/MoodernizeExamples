package application;

public class pdf {
	private int V;
	private int R;
	private int P;
	private int enc_md;
	private Object id_buf;
	private Object u_buf;
	private Object o_buf;
	private int id_len;
	private int o_len;
	private int u_len;
	private Object rc4key;
	private Object rc4data;
	
	public pdf(int V, int R, int P, int enc_md, Object id_buf, Object u_buf, Object o_buf, int id_len, int o_len, int u_len, Object rc4key, Object rc4data) {
		setV(V);
		setR(R);
		setP(P);
		setEnc_md(enc_md);
		setId_buf(id_buf);
		setU_buf(u_buf);
		setO_buf(o_buf);
		setId_len(id_len);
		setO_len(o_len);
		setU_len(u_len);
		setRc4key(rc4key);
		setRc4data(rc4data);
	}
	public pdf() {
	}
	
	public int getV() {
		return V;
	}
	public void setV(int newV) {
		V = newV;
	}
	public int getR() {
		return R;
	}
	public void setR(int newR) {
		R = newR;
	}
	public int getP() {
		return P;
	}
	public void setP(int newP) {
		P = newP;
	}
	public int getEnc_md() {
		return enc_md;
	}
	public void setEnc_md(int newEnc_md) {
		enc_md = newEnc_md;
	}
	public Object getId_buf() {
		return id_buf;
	}
	public void setId_buf(Object newId_buf) {
		id_buf = newId_buf;
	}
	public Object getU_buf() {
		return u_buf;
	}
	public void setU_buf(Object newU_buf) {
		u_buf = newU_buf;
	}
	public Object getO_buf() {
		return o_buf;
	}
	public void setO_buf(Object newO_buf) {
		o_buf = newO_buf;
	}
	public int getId_len() {
		return id_len;
	}
	public void setId_len(int newId_len) {
		id_len = newId_len;
	}
	public int getO_len() {
		return o_len;
	}
	public void setO_len(int newO_len) {
		o_len = newO_len;
	}
	public int getU_len() {
		return u_len;
	}
	public void setU_len(int newU_len) {
		u_len = newU_len;
	}
	public Object getRc4key() {
		return rc4key;
	}
	public void setRc4key(Object newRc4key) {
		rc4key = newRc4key;
	}
	public Object getRc4data() {
		return rc4data;
	}
	public void setRc4data(Object newRc4data) {
		rc4data = newRc4data;
	}
}
