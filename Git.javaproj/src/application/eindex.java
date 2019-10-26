package application;

public class eindex {
	private object objects;
	private Object hashes;
	private Object count;
	private Object alloc;
	private  positions;
	
	public eindex(object objects, Object hashes, Object count, Object alloc,  positions) {
		setObjects(objects);
		setHashes(hashes);
		setCount(count);
		setAlloc(alloc);
		setPositions(positions);
	}
	public eindex() {
	}
	
	public object getObjects() {
		return objects;
	}
	public void setObjects(object newObjects) {
		objects = newObjects;
	}
	public Object getHashes() {
		return hashes;
	}
	public void setHashes(Object newHashes) {
		hashes = newHashes;
	}
	public Object getCount() {
		return count;
	}
	public void setCount(Object newCount) {
		count = newCount;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
	public  getPositions() {
		return positions;
	}
	public void setPositions( newPositions) {
		positions = newPositions;
	}
}
