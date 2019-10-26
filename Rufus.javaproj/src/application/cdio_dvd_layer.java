package application;

public class cdio_dvd_layer {
	private int book_version;
	private int book_type;
	private int min_rate;
	private int disc_size;
	private int layer_type;
	private int track_path;
	private int nlayers;
	private int track_density;
	private int linear_density;
	private int bca;
	private Object start_sector;
	private Object end_sector;
	private Object end_sector_l0;
	
	public cdio_dvd_layer(int book_version, int book_type, int min_rate, int disc_size, int layer_type, int track_path, int nlayers, int track_density, int linear_density, int bca, Object start_sector, Object end_sector, Object end_sector_l0) {
		setBook_version(book_version);
		setBook_type(book_type);
		setMin_rate(min_rate);
		setDisc_size(disc_size);
		setLayer_type(layer_type);
		setTrack_path(track_path);
		setNlayers(nlayers);
		setTrack_density(track_density);
		setLinear_density(linear_density);
		setBca(bca);
		setStart_sector(start_sector);
		setEnd_sector(end_sector);
		setEnd_sector_l0(end_sector_l0);
	}
	public cdio_dvd_layer() {
	}
	
	public int getBook_version() {
		return book_version;
	}
	public void setBook_version(int newBook_version) {
		book_version = newBook_version;
	}
	public int getBook_type() {
		return book_type;
	}
	public void setBook_type(int newBook_type) {
		book_type = newBook_type;
	}
	public int getMin_rate() {
		return min_rate;
	}
	public void setMin_rate(int newMin_rate) {
		min_rate = newMin_rate;
	}
	public int getDisc_size() {
		return disc_size;
	}
	public void setDisc_size(int newDisc_size) {
		disc_size = newDisc_size;
	}
	public int getLayer_type() {
		return layer_type;
	}
	public void setLayer_type(int newLayer_type) {
		layer_type = newLayer_type;
	}
	public int getTrack_path() {
		return track_path;
	}
	public void setTrack_path(int newTrack_path) {
		track_path = newTrack_path;
	}
	public int getNlayers() {
		return nlayers;
	}
	public void setNlayers(int newNlayers) {
		nlayers = newNlayers;
	}
	public int getTrack_density() {
		return track_density;
	}
	public void setTrack_density(int newTrack_density) {
		track_density = newTrack_density;
	}
	public int getLinear_density() {
		return linear_density;
	}
	public void setLinear_density(int newLinear_density) {
		linear_density = newLinear_density;
	}
	public int getBca() {
		return bca;
	}
	public void setBca(int newBca) {
		bca = newBca;
	}
	public Object getStart_sector() {
		return start_sector;
	}
	public void setStart_sector(Object newStart_sector) {
		start_sector = newStart_sector;
	}
	public Object getEnd_sector() {
		return end_sector;
	}
	public void setEnd_sector(Object newEnd_sector) {
		end_sector = newEnd_sector;
	}
	public Object getEnd_sector_l0() {
		return end_sector_l0;
	}
	public void setEnd_sector_l0(Object newEnd_sector_l0) {
		end_sector_l0 = newEnd_sector_l0;
	}
}
