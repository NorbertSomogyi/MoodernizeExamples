package application;

public class vertex {
	private  pos;
	private  tex;
	
	public vertex( pos,  tex) {
		setPos(pos);
		setTex(tex);
	}
	public vertex() {
	}
	
	public  getPos() {
		return pos;
	}
	public void setPos( newPos) {
		pos = newPos;
	}
	public  getTex() {
		return tex;
	}
	public void setTex( newTex) {
		tex = newTex;
	}
}
