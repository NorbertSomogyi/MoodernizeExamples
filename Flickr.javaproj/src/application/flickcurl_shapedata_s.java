package application;

public class flickcurl_shapedata_s {
	private int created;
	private double alpha;
	private int points;
	private int edges;
	private Object data;
	private Object data_length;
	private Object file_urls;
	private int file_urls_count;
	private int is_donuthole;
	private int has_donuthole;
	
	public flickcurl_shapedata_s(int created, double alpha, int points, int edges, Object data, Object data_length, Object file_urls, int file_urls_count, int is_donuthole, int has_donuthole) {
		setCreated(created);
		setAlpha(alpha);
		setPoints(points);
		setEdges(edges);
		setData(data);
		setData_length(data_length);
		setFile_urls(file_urls);
		setFile_urls_count(file_urls_count);
		setIs_donuthole(is_donuthole);
		setHas_donuthole(has_donuthole);
	}
	public flickcurl_shapedata_s() {
	}
	
	public int getCreated() {
		return created;
	}
	public void setCreated(int newCreated) {
		created = newCreated;
	}
	public double getAlpha() {
		return alpha;
	}
	public void setAlpha(double newAlpha) {
		alpha = newAlpha;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int newPoints) {
		points = newPoints;
	}
	public int getEdges() {
		return edges;
	}
	public void setEdges(int newEdges) {
		edges = newEdges;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getData_length() {
		return data_length;
	}
	public void setData_length(Object newData_length) {
		data_length = newData_length;
	}
	public Object getFile_urls() {
		return file_urls;
	}
	public void setFile_urls(Object newFile_urls) {
		file_urls = newFile_urls;
	}
	public int getFile_urls_count() {
		return file_urls_count;
	}
	public void setFile_urls_count(int newFile_urls_count) {
		file_urls_count = newFile_urls_count;
	}
	public int getIs_donuthole() {
		return is_donuthole;
	}
	public void setIs_donuthole(int newIs_donuthole) {
		is_donuthole = newIs_donuthole;
	}
	public int getHas_donuthole() {
		return has_donuthole;
	}
	public void setHas_donuthole(int newHas_donuthole) {
		has_donuthole = newHas_donuthole;
	}
}
/**
 * flickcurl_arg:
 * @name: Argument name
 * @optional: boolean flag (non-0 true) if argument is optional
 * @description: description of argument (HTML)
 *
 * An API method argument.
 */
