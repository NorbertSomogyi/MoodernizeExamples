package application;

public class split {
	private int split_group;
	private int split_neighbor;
	private int split_origin;
	
	public split(int split_group, int split_neighbor, int split_origin) {
		setSplit_group(split_group);
		setSplit_neighbor(split_neighbor);
		setSplit_origin(split_origin);
	}
	public split() {
	}
	
	public int getSplit_group() {
		return split_group;
	}
	public void setSplit_group(int newSplit_group) {
		split_group = newSplit_group;
	}
	public int getSplit_neighbor() {
		return split_neighbor;
	}
	public void setSplit_neighbor(int newSplit_neighbor) {
		split_neighbor = newSplit_neighbor;
	}
	public int getSplit_origin() {
		return split_origin;
	}
	public void setSplit_origin(int newSplit_origin) {
		split_origin = newSplit_origin;
	}
}
// some hashes, like lm, are split. this id point to the other hash of the group
