package application;

/*
 * Structure defining a property type.
 */
public class proptype_S {
	private int pt_id;
	private int pt_type;
	private int pt_hl_id;
	private int pt_priority;
	private int pt_flags;
	private Object pt_name;
	
	public proptype_S(int pt_id, int pt_type, int pt_hl_id, int pt_priority, int pt_flags, Object pt_name) {
		setPt_id(pt_id);
		setPt_type(pt_type);
		setPt_hl_id(pt_hl_id);
		setPt_priority(pt_priority);
		setPt_flags(pt_flags);
		setPt_name(pt_name);
	}
	public proptype_S() {
	}
	
	public proptype_S find_prop(Object name, file_buffer buf) {
		hashitem_S hashitem_S = new hashitem_S();
		hashitem_T hi = hashitem_S.find_prop_hi(name, buf);
		if (hi == ((Object)0)) {
			return ((Object)0);
		} 
		Object generatedHi_key = (hi).getHi_key();
		return ((proptype_T)((generatedHi_key) - ((size_t)((proptype_T)0).getPt_name())));
	}
	public proptype_S lookup_prop_type(Object name, file_buffer buf) {
		proptype_S proptype_S = new proptype_S();
		proptype_T type = proptype_S.find_prop(name, buf);
		if (type == ((Object)0)) {
			type = proptype_S.find_prop(name, ((Object)0));
		} 
		if (type == ((Object)0)) {
			ModernizedCProgram.semsg(((byte)(ModernizedCProgram.e_type_not_exist)), name);
		} 
		return type/*
		 * Get an optional "bufnr" item from the dict in "arg".
		 * When the argument is not used or "bufnr" is not present then "buf" is
		 * unchanged.
		 * If "bufnr" is valid or not present return OK.
		 * When "arg" is not a dict or "bufnr" is invalide return FAIL.
		 */;
	}
	public proptype_S find_type_by_id(hashtable_S ht, int id) {
		long todo;
		hashitem_T hi = new hashitem_T();
		if (ht == ((Object)0)) {
			return ((Object)0);
		} 
		Object generatedHt_used = ht.getHt_used();
		// a binary search.// a binary search.todo = (long)generatedHt_used;
		Object generatedHi_key = (hi).getHi_key();
		int generatedPt_id = prop.getPt_id();
		hashitem_S[] generatedHt_array = ht.getHt_array();
		for (hi = generatedHt_array; todo > 0; ++hi) {
			if (!(generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
				proptype_T prop = ((proptype_T)((generatedHi_key) - ((size_t)((proptype_T)0).getPt_name())));
				if (generatedPt_id == id) {
					return prop;
				} 
				--todo;
			} 
		}
		return ((Object)0/*
		 * Find a property type by ID in "buf" or globally.
		 * Returns NULL if not found.
		 */);
	}
	public proptype_S text_prop_type_by_id(file_buffer buf, int id) {
		proptype_T type = new proptype_T();
		Object generatedB_proptypes = buf.getB_proptypes();
		proptype_S proptype_S = new proptype_S();
		type = proptype_S.find_type_by_id(generatedB_proptypes, id);
		if (type == ((Object)0)) {
			type = proptype_S.find_type_by_id(ModernizedCProgram.global_proptypes, id);
		} 
		return type/*
		 * prop_clear({lnum} [, {lnum_end} [, {bufnr}]])
		 */;
	}
	public int getPt_id() {
		return pt_id;
	}
	public void setPt_id(int newPt_id) {
		pt_id = newPt_id;
	}
	public int getPt_type() {
		return pt_type;
	}
	public void setPt_type(int newPt_type) {
		pt_type = newPt_type;
	}
	public int getPt_hl_id() {
		return pt_hl_id;
	}
	public void setPt_hl_id(int newPt_hl_id) {
		pt_hl_id = newPt_hl_id;
	}
	public int getPt_priority() {
		return pt_priority;
	}
	public void setPt_priority(int newPt_priority) {
		pt_priority = newPt_priority;
	}
	public int getPt_flags() {
		return pt_flags;
	}
	public void setPt_flags(int newPt_flags) {
		pt_flags = newPt_flags;
	}
	public Object getPt_name() {
		return pt_name;
	}
	public void setPt_name(Object newPt_name) {
		pt_name = newPt_name;
	}
}
