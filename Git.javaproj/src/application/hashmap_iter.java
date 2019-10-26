package application;

public class hashmap_iter {
	private hashmap map;
	private hashmap_entry next;
	private int tablepos;
	
	public hashmap_iter(hashmap map, hashmap_entry next, int tablepos) {
		setMap(map);
		setNext(next);
		setTablepos(tablepos);
	}
	public hashmap_iter() {
	}
	
	public hashmap getMap() {
		return map;
	}
	public void setMap(hashmap newMap) {
		map = newMap;
	}
	public hashmap_entry getNext() {
		return next;
	}
	public void setNext(hashmap_entry newNext) {
		next = newNext;
	}
	public int getTablepos() {
		return tablepos;
	}
	public void setTablepos(int newTablepos) {
		tablepos = newTablepos;
	}
}
/* internal macro for hashmap_for_each_entry */
/* internal macro for hashmap_for_each_entry */
/*
 * iterate through @map using @iter, @var is a pointer to a type
 * containing a @member which is a "struct hashmap_entry"
 */
/*
 * returns a pointer of type matching @keyvar, or NULL if nothing found.
 * @keyvar is a pointer to a struct containing a
 * "struct hashmap_entry" @member.
 */
