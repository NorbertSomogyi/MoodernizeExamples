package application;

public class dictIterator {
	private dict d;
	private int table;
	private int index;
	private int safe;
	private dictEntry entry;
	private dictEntry nextEntry;
	
	public dictIterator(dict d, int table, int index, int safe, dictEntry entry, dictEntry nextEntry) {
		setD(d);
		setTable(table);
		setIndex(index);
		setSafe(safe);
		setEntry(entry);
		setNextEntry(nextEntry);
	}
	public dictIterator() {
	}
	
	public dictIterator dictGetIterator(dict d) {
		dictIterator iter = /*Error: Function owner not recognized*/malloc(/*Error: sizeof expression not supported yet*/);
		iter.setD(d);
		iter.setTable(0);
		iter.setIndex(-1);
		iter.setSafe(0);
		iter.setEntry(((Object)0));
		iter.setNextEntry(((Object)0));
		return iter;
	}
	public dictIterator dictGetSafeIterator(dict d) {
		dictIterator dictIterator = new dictIterator();
		dictIterator i = dictIterator.dictGetIterator(d);
		i.setSafe(1);
		return i;
	}
	public void dictReleaseIterator() {
		int generatedSafe = this.getSafe();
		int generatedIndex = this.getIndex();
		int generatedTable = this.getTable();
		dict generatedD = this.getD();
		int generatedIterators = generatedD.getIterators();
		if (generatedSafe && !(generatedIndex == -1 && generatedTable == 0)) {
			generatedIterators--;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(iter);
	}
	public dict getD() {
		return d;
	}
	public void setD(dict newD) {
		d = newD;
	}
	public int getTable() {
		return table;
	}
	public void setTable(int newTable) {
		table = newTable;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
	}
	public int getSafe() {
		return safe;
	}
	public void setSafe(int newSafe) {
		safe = newSafe;
	}
	public dictEntry getEntry() {
		return entry;
	}
	public void setEntry(dictEntry newEntry) {
		entry = newEntry;
	}
	public dictEntry getNextEntry() {
		return nextEntry;
	}
	public void setNextEntry(dictEntry newNextEntry) {
		nextEntry = newNextEntry;
	}
}
