package application;

public class sync_pair_vid {
	private obs_source source;
	private Object tex;
	private Object white;
	private Object black;
	
	public sync_pair_vid(obs_source source, Object tex, Object white, Object black) {
		setSource(source);
		setTex(tex);
		setWhite(white);
		setBlack(black);
	}
	public sync_pair_vid() {
	}
	
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getTex() {
		return tex;
	}
	public void setTex(Object newTex) {
		tex = newTex;
	}
	public Object getWhite() {
		return white;
	}
	public void setWhite(Object newWhite) {
		white = newWhite;
	}
	public Object getBlack() {
		return black;
	}
	public void setBlack(Object newBlack) {
		black = newBlack;
	}
}
