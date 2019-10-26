package application;

/* Distance codes. The first 256 values correspond to the distances
 * 3 .. 258, the last 256 values correspond to the top 8 bits of
 * the 15 bit distances.
 */
/* length code for each normalized match length (0 == MIN_MATCH) */
/* First normalized length for each code (0 = MIN_MATCH) */
/* First normalized distance for each code (0 = distance of 1) */
/* GEN_TREES_H */
public class static_tree_desc_s {
	private Object static_tree;
	private Object extra_bits;
	private int extra_base;
	private int elems;
	private int max_length;
	
	public static_tree_desc_s(Object static_tree, Object extra_bits, int extra_base, int elems, int max_length) {
		setStatic_tree(static_tree);
		setExtra_bits(extra_bits);
		setExtra_base(extra_base);
		setElems(elems);
		setMax_length(max_length);
	}
	public static_tree_desc_s() {
	}
	
	public Object getStatic_tree() {
		return static_tree;
	}
	public void setStatic_tree(Object newStatic_tree) {
		static_tree = newStatic_tree;
	}
	public Object getExtra_bits() {
		return extra_bits;
	}
	public void setExtra_bits(Object newExtra_bits) {
		extra_bits = newExtra_bits;
	}
	public int getExtra_base() {
		return extra_base;
	}
	public void setExtra_base(int newExtra_base) {
		extra_base = newExtra_base;
	}
	public int getElems() {
		return elems;
	}
	public void setElems(int newElems) {
		elems = newElems;
	}
	public int getMax_length() {
		return max_length;
	}
	public void setMax_length(int newMax_length) {
		max_length = newMax_length;
	}
}
