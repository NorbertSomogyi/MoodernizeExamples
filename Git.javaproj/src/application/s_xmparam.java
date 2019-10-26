package application;

public class s_xmparam {
	private s_xpparam xpp;
	private int marker_size;
	private int level;
	private int favor;
	private int style;
	private Object ancestor;
	private Object file1;
	private Object file2;
	
	public s_xmparam(s_xpparam xpp, int marker_size, int level, int favor, int style, Object ancestor, Object file1, Object file2) {
		setXpp(xpp);
		setMarker_size(marker_size);
		setLevel(level);
		setFavor(favor);
		setStyle(style);
		setAncestor(ancestor);
		setFile1(file1);
		setFile2(file2);
	}
	public s_xmparam() {
	}
	
	public s_xpparam getXpp() {
		return xpp;
	}
	public void setXpp(s_xpparam newXpp) {
		xpp = newXpp;
	}
	public int getMarker_size() {
		return marker_size;
	}
	public void setMarker_size(int newMarker_size) {
		marker_size = newMarker_size;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int newLevel) {
		level = newLevel;
	}
	public int getFavor() {
		return favor;
	}
	public void setFavor(int newFavor) {
		favor = newFavor;
	}
	public int getStyle() {
		return style;
	}
	public void setStyle(int newStyle) {
		style = newStyle;
	}
	public Object getAncestor() {
		return ancestor;
	}
	public void setAncestor(Object newAncestor) {
		ancestor = newAncestor;
	}
	public Object getFile1() {
		return file1;
	}
	public void setFile1(Object newFile1) {
		file1 = newFile1;
	}
	public Object getFile2() {
		return file2;
	}
	public void setFile2(Object newFile2) {
		file2 = newFile2;
	}
}
