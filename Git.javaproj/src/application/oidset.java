package application;

/**
 * This API is similar to sha1-array, in that it maintains a set of object ids
 * in a memory-efficient way. The major differences are:
 *
 *   1. It uses a hash, so we can do online duplicate removal, rather than
 *      sort-and-uniq at the end. This can reduce memory footprint if you have
 *      a large list of oids with many duplicates.
 *
 *   2. The per-unique-oid memory footprint is slightly higher due to hash
 *      table overhead.
 */
/**
 * A single oidset; should be zero-initialized (or use OIDSET_INIT).
 */
public class oidset {
	private  set;
	
	public oidset( set) {
		setSet(set);
	}
	public oidset() {
	}
	
	public void oidset_init(Object initial_size) {
		 generatedSet = this.getSet();
		.memset(generatedSet, 0, );
		if (initial_size) {
			generatedSet.kh_resize_oid_set(initial_size);
		} 
	}
	public int oidset_insert(Object oid) {
		int added;
		 generatedSet = this.getSet();
		ModernizedCProgram.kh_put_oid_set(generatedSet, oid, added);
		return !added;
	}
	public int oidset_remove(Object oid) {
		 generatedSet = this.getSet();
		khiter_t pos = oid.kh_get_oid_set(generatedSet);
		Object generatedN_buckets = (generatedSet).getN_buckets();
		if (pos == (generatedN_buckets)) {
			return 0;
		} 
		generatedSet.kh_del_oid_set(pos);
		return 1;
	}
	public void oidset_clear() {
		 generatedSet = this.getSet();
		generatedSet.kh_release_oid_set();
		set.oidset_init(0);
	}
	public void oidset_parse_file(Object path) {
		FILE fp = new FILE();
		strbuf sb = new strbuf(, , );
		object_id oid = new object_id();
		fp = .fopen(path, "r");
		if (!fp) {
			ModernizedCProgram.die("could not open object name list: %s", path);
		} 
		byte generatedBuf = sb.getBuf();
		Object generatedLen = sb.getLen();
		while (!ModernizedCProgram.strbuf_getline(sb, fp)) {
			byte p;
			byte name;
			name = .strchr(generatedBuf, (byte)'#');
			if (name) {
				sb.strbuf_setlen(name - generatedBuf);
			} 
			sb.strbuf_trim();
			if (!generatedLen) {
				continue;
			} 
			if (oid.parse_oid_hex(generatedBuf, p) || p != (byte)'\0') {
				ModernizedCProgram.die("invalid object name: %s", generatedBuf);
			} 
			set.oidset_insert(oid);
		}
		Object generated_flag = (fp).get_flag();
		if ((generated_flag & -1024)) {
			ModernizedCProgram.die_errno("Could not read '%s'", path);
		} 
		.fclose(fp);
		sb.strbuf_release();
	}
	public void add_all(oidset src) {
		oidset_iter iter = new oidset_iter();
		object_id src_oid = new object_id();
		ModernizedCProgram.oidset_iter_init(src, iter);
		object_id object_id = new object_id();
		while ((src_oid = object_id.oidset_iter_next(iter)) != ((Object)0)) {
			dest.oidset_insert(src_oid);
		}
	}
	public void filter_combine__finalize_omits(Object filter_data) {
		combine_filter_data d = filter_data;
		size_t sub = new size_t();
		Object generatedNr = d.getNr();
		subfilter generatedSub = d.getSub();
		for (sub = 0; sub < generatedNr; sub++) {
			omits.add_all(generatedSub[sub].getOmits());
			generatedSub[sub].getOmits().oidset_clear();
		}
	}
	public  getSet() {
		return set;
	}
	public void setSet( newSet) {
		set = newSet;
	}
}
