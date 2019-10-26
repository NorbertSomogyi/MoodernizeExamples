package application;

public class ls_refs_data {
	private int peel;
	private int symrefs;
	private argv_array prefixes;
	
	public ls_refs_data(int peel, int symrefs, argv_array prefixes) {
		setPeel(peel);
		setSymrefs(symrefs);
		setPrefixes(prefixes);
	}
	public ls_refs_data() {
	}
	
	public int getPeel() {
		return peel;
	}
	public void setPeel(int newPeel) {
		peel = newPeel;
	}
	public int getSymrefs() {
		return symrefs;
	}
	public void setSymrefs(int newSymrefs) {
		symrefs = newSymrefs;
	}
	public argv_array getPrefixes() {
		return prefixes;
	}
	public void setPrefixes(argv_array newPrefixes) {
		prefixes = newPrefixes;
	}
}
