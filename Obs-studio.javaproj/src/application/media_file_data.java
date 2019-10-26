package application;

/* clang-format off */
/* clang-format on */
/* ------------------------------------------------------------------------- */
public class media_file_data {
	private Byte path;
	private Object media;
	
	public media_file_data(Byte path, Object media) {
		setPath(path);
		setMedia(media);
	}
	public media_file_data() {
	}
	
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Object getMedia() {
		return media;
	}
	public void setMedia(Object newMedia) {
		media = newMedia;
	}
}
