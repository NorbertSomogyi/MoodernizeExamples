package application;

public class push_cas_option {
	private int use_tracking_for_rest;
	private push_cas entry;
	private int nr;
	private int alloc;
	
	public push_cas_option(int use_tracking_for_rest, push_cas entry, int nr, int alloc) {
		setUse_tracking_for_rest(use_tracking_for_rest);
		setEntry(entry);
		setNr(nr);
		setAlloc(alloc);
	}
	public push_cas_option() {
	}
	
	public int getUse_tracking_for_rest() {
		return use_tracking_for_rest;
	}
	public void setUse_tracking_for_rest(int newUse_tracking_for_rest) {
		use_tracking_for_rest = newUse_tracking_for_rest;
	}
	public push_cas getEntry() {
		return entry;
	}
	public void setEntry(push_cas newEntry) {
		entry = newEntry;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
}
