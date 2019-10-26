package application;

/* ------------------------------------------------------------------------- */
/* Texture Resource                                                          */
public class nv_texture {
	private Object res;
	private Object tex;
	private Object mapped_res;
	
	public nv_texture(Object res, Object tex, Object mapped_res) {
		setRes(res);
		setTex(tex);
		setMapped_res(mapped_res);
	}
	public nv_texture() {
	}
	
	public Object getRes() {
		return res;
	}
	public void setRes(Object newRes) {
		res = newRes;
	}
	public Object getTex() {
		return tex;
	}
	public void setTex(Object newTex) {
		tex = newTex;
	}
	public Object getMapped_res() {
		return mapped_res;
	}
	public void setMapped_res(Object newMapped_res) {
		mapped_res = newMapped_res;
	}
}
