package application;

public class fingerprint_entry {
	private hashmap_entry entry;
	private int count;
	
	public fingerprint_entry(hashmap_entry entry, int count) {
		setEntry(entry);
		setCount(count);
	}
	public fingerprint_entry() {
	}
	
	public hashmap_entry getEntry() {
		return entry;
	}
	public void setEntry(hashmap_entry newEntry) {
		entry = newEntry;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
}
/* A fingerprint is intended to loosely represent a string, such that two
 * fingerprints can be quickly compared to give an indication of the similarity
 * of the strings that they represent.
 *
 * A fingerprint is represented as a multiset of the lower-cased byte pairs in
 * the string that it represents. Whitespace is added at each end of the
 * string. Whitespace pairs are ignored. Whitespace is converted to '\0'.
 * For example, the string "Darth   Radar" will be converted to the following
 * fingerprint:
 * {"\0d", "da", "da", "ar", "ar", "rt", "th", "h\0", "\0r", "ra", "ad", "r\0"}
 *
 * The similarity between two fingerprints is the size of the intersection of
 * their multisets, including repeated elements. See fingerprint_similarity for
 * examples.
 *
 * For ease of implementation, the fingerprint is implemented as a map
 * of byte pairs to the count of that byte pair in the string, instead of
 * allowing repeated elements in a set.
 */
/* A byte pair in a fingerprint. Stores the number of times the byte pair
 * occurs in the string that the fingerprint represents.
 */
/* The hashmap entry - the hash represents the byte pair in its
	 * entirety so we don't need to store the byte pair separately.
	 */
