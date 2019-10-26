package application;

public class prunedead {
	private Curl_easy data;
	private connectdata extracted;
	
	public prunedead(Curl_easy data, connectdata extracted) {
		setData(data);
		setExtracted(extracted);
	}
	public prunedead() {
	}
	
	public Curl_easy getData() {
		return data;
	}
	public void setData(Curl_easy newData) {
		data = newData;
	}
	public connectdata getExtracted() {
		return extracted;
	}
	public void setExtracted(connectdata newExtracted) {
		extracted = newExtracted;
	}
}
