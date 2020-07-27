package application;

public class font_path_info {
	private Byte face_and_style;
	private Object full_len;
	private Object face_len;
	private Object is_bitmap;
	private Object num_sizes;
	private int[] sizes;
	private Object bold;
	private Object italic;
	private Byte path;
	private Object index;
	
	public font_path_info(Byte face_and_style, Object full_len, Object face_len, Object is_bitmap, Object num_sizes, int[] sizes, Object bold, Object italic, Byte path, Object index) {
		setFace_and_style(face_and_style);
		setFull_len(full_len);
		setFace_len(face_len);
		setIs_bitmap(is_bitmap);
		setNum_sizes(num_sizes);
		setSizes(sizes);
		setBold(bold);
		setItalic(italic);
		setPath(path);
		setIndex(index);
	}
	public font_path_info() {
	}
	
	public void create_bitmap_sizes(Object face) {
		Object generatedIs_bitmap = this.getIs_bitmap();
		if (!generatedIs_bitmap) {
			this.setNum_sizes(0);
			this.setSizes(((Object)0));
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(sizes);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_reserve(sizes, face.getNum_fixed_sizes());
		for (int i = 0;
		 i < face.getNum_fixed_sizes(); i++) {
			int val = face.getAvailable_sizes()[i].getSize() >> 6;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(sizes, val);
		}
		this.setSizes(sizes.getArray());
		this.setNum_sizes(()face.getNum_fixed_sizes());
	}
	public void font_path_info_free() {
		int[] generatedSizes = this.getSizes();
		ModernizedCProgram.bfree(generatedSizes);
		Byte generatedFace_and_style = this.getFace_and_style();
		ModernizedCProgram.bfree(generatedFace_and_style);
		Byte generatedPath = this.getPath();
		ModernizedCProgram.bfree(generatedPath);
	}
	public Byte getFace_and_style() {
		return face_and_style;
	}
	public void setFace_and_style(Byte newFace_and_style) {
		face_and_style = newFace_and_style;
	}
	public Object getFull_len() {
		return full_len;
	}
	public void setFull_len(Object newFull_len) {
		full_len = newFull_len;
	}
	public Object getFace_len() {
		return face_len;
	}
	public void setFace_len(Object newFace_len) {
		face_len = newFace_len;
	}
	public Object getIs_bitmap() {
		return is_bitmap;
	}
	public void setIs_bitmap(Object newIs_bitmap) {
		is_bitmap = newIs_bitmap;
	}
	public Object getNum_sizes() {
		return num_sizes;
	}
	public void setNum_sizes(Object newNum_sizes) {
		num_sizes = newNum_sizes;
	}
	public int[] getSizes() {
		return sizes;
	}
	public void setSizes(int[] newSizes) {
		sizes = newSizes;
	}
	public Object getBold() {
		return bold;
	}
	public void setBold(Object newBold) {
		bold = newBold;
	}
	public Object getItalic() {
		return italic;
	}
	public void setItalic(Object newItalic) {
		italic = newItalic;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Object getIndex() {
		return index;
	}
	public void setIndex(Object newIndex) {
		index = newIndex;
	}
}
