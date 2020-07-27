package application;

public class split_index {
	private object_id base_oid;
	private index_state base;
	private ewah_bitmap delete_bitmap;
	private ewah_bitmap replace_bitmap;
	private cache_entry[][] saved_cache;
	private int saved_cache_nr;
	private int nr_deletions;
	private int nr_replacements;
	private int refcount;
	
	public split_index(object_id base_oid, index_state base, ewah_bitmap delete_bitmap, ewah_bitmap replace_bitmap, cache_entry[][] saved_cache, int saved_cache_nr, int nr_deletions, int nr_replacements, int refcount) {
		setBase_oid(base_oid);
		setBase(base);
		setDelete_bitmap(delete_bitmap);
		setReplace_bitmap(replace_bitmap);
		setSaved_cache(saved_cache);
		setSaved_cache_nr(saved_cache_nr);
		setNr_deletions(nr_deletions);
		setNr_replacements(nr_replacements);
		setRefcount(refcount);
	}
	public split_index() {
	}
	
	public split_index init_split_index(index_state istate) {
		split_index generatedSplit_index = istate.getSplit_index();
		if (!generatedSplit_index) {
			istate.setSplit_index(ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/));
			generatedSplit_index.setRefcount(1);
		} 
		return generatedSplit_index;
	}
	public object_id getBase_oid() {
		return base_oid;
	}
	public void setBase_oid(object_id newBase_oid) {
		base_oid = newBase_oid;
	}
	public index_state getBase() {
		return base;
	}
	public void setBase(index_state newBase) {
		base = newBase;
	}
	public ewah_bitmap getDelete_bitmap() {
		return delete_bitmap;
	}
	public void setDelete_bitmap(ewah_bitmap newDelete_bitmap) {
		delete_bitmap = newDelete_bitmap;
	}
	public ewah_bitmap getReplace_bitmap() {
		return replace_bitmap;
	}
	public void setReplace_bitmap(ewah_bitmap newReplace_bitmap) {
		replace_bitmap = newReplace_bitmap;
	}
	public cache_entry[][] getSaved_cache() {
		return saved_cache;
	}
	public void setSaved_cache(cache_entry[][] newSaved_cache) {
		saved_cache = newSaved_cache;
	}
	public int getSaved_cache_nr() {
		return saved_cache_nr;
	}
	public void setSaved_cache_nr(int newSaved_cache_nr) {
		saved_cache_nr = newSaved_cache_nr;
	}
	public int getNr_deletions() {
		return nr_deletions;
	}
	public void setNr_deletions(int newNr_deletions) {
		nr_deletions = newNr_deletions;
	}
	public int getNr_replacements() {
		return nr_replacements;
	}
	public void setNr_replacements(int newNr_replacements) {
		nr_replacements = newNr_replacements;
	}
	public int getRefcount() {
		return refcount;
	}
	public void setRefcount(int newRefcount) {
		refcount = newRefcount;
	}
}
