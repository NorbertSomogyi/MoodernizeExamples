package application;

public class line_number_mapping {
	private int destination_start;
	private int destination_length;
	private int source_start;
	private int source_length;
	
	public line_number_mapping(int destination_start, int destination_length, int source_start, int source_length) {
		setDestination_start(destination_start);
		setDestination_length(destination_length);
		setSource_start(source_start);
		setSource_length(source_length);
	}
	public line_number_mapping() {
	}
	
	public int getDestination_start() {
		return destination_start;
	}
	public void setDestination_start(int newDestination_start) {
		destination_start = newDestination_start;
	}
	public int getDestination_length() {
		return destination_length;
	}
	public void setDestination_length(int newDestination_length) {
		destination_length = newDestination_length;
	}
	public int getSource_start() {
		return source_start;
	}
	public void setSource_start(int newSource_start) {
		source_start = newSource_start;
	}
	public int getSource_length() {
		return source_length;
	}
	public void setSource_length(int newSource_length) {
		source_length = newSource_length;
	}
}
