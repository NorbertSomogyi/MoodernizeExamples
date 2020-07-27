package application;

/* List of all attr_check structs; access should be surrounded by mutex */
public class check_vector {
	private Object nr;
	private Object alloc;
	private attr_check[][] checks;
	private Object mutex;
	
	public check_vector(Object nr, Object alloc, attr_check[][] checks, Object mutex) {
		setNr(nr);
		setAlloc(alloc);
		setChecks(checks);
		setMutex(mutex);
	}
	public check_vector() {
	}
	
	public Object getNr() {
		return nr;
	}
	public void setNr(Object newNr) {
		nr = newNr;
	}
	public Object getAlloc() {
		return alloc;
	}
	public void setAlloc(Object newAlloc) {
		alloc = newAlloc;
	}
	public attr_check[][] getChecks() {
		return checks;
	}
	public void setChecks(attr_check[][] newChecks) {
		checks = newChecks;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
}
