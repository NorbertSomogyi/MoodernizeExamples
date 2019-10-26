package application;

/* ------------------------------------------------------------------------- */
public class main_params {
	private Byte file;
	private int has_video;
	private int tracks;
	private Byte vcodec;
	private int vbitrate;
	private int gop;
	private int width;
	private int height;
	private int fps_num;
	private int fps_den;
	private Byte acodec;
	private Byte muxer_settings;
	
	public main_params(Byte file, int has_video, int tracks, Byte vcodec, int vbitrate, int gop, int width, int height, int fps_num, int fps_den, Byte acodec, Byte muxer_settings) {
		setFile(file);
		setHas_video(has_video);
		setTracks(tracks);
		setVcodec(vcodec);
		setVbitrate(vbitrate);
		setGop(gop);
		setWidth(width);
		setHeight(height);
		setFps_num(fps_num);
		setFps_den(fps_den);
		setAcodec(acodec);
		setMuxer_settings(muxer_settings);
	}
	public main_params() {
	}
	
	public Byte getFile() {
		return file;
	}
	public void setFile(Byte newFile) {
		file = newFile;
	}
	public int getHas_video() {
		return has_video;
	}
	public void setHas_video(int newHas_video) {
		has_video = newHas_video;
	}
	public int getTracks() {
		return tracks;
	}
	public void setTracks(int newTracks) {
		tracks = newTracks;
	}
	public Byte getVcodec() {
		return vcodec;
	}
	public void setVcodec(Byte newVcodec) {
		vcodec = newVcodec;
	}
	public int getVbitrate() {
		return vbitrate;
	}
	public void setVbitrate(int newVbitrate) {
		vbitrate = newVbitrate;
	}
	public int getGop() {
		return gop;
	}
	public void setGop(int newGop) {
		gop = newGop;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public int getFps_num() {
		return fps_num;
	}
	public void setFps_num(int newFps_num) {
		fps_num = newFps_num;
	}
	public int getFps_den() {
		return fps_den;
	}
	public void setFps_den(int newFps_den) {
		fps_den = newFps_den;
	}
	public Byte getAcodec() {
		return acodec;
	}
	public void setAcodec(Byte newAcodec) {
		acodec = newAcodec;
	}
	public Byte getMuxer_settings() {
		return muxer_settings;
	}
	public void setMuxer_settings(Byte newMuxer_settings) {
		muxer_settings = newMuxer_settings;
	}
}
