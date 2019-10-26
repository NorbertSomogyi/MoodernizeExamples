package application;

public class name_ref_data {
	private int tags_only;
	private int name_only;
	private string_list ref_filters;
	private string_list exclude_filters;
	
	public name_ref_data(int tags_only, int name_only, string_list ref_filters, string_list exclude_filters) {
		setTags_only(tags_only);
		setName_only(name_only);
		setRef_filters(ref_filters);
		setExclude_filters(exclude_filters);
	}
	public name_ref_data() {
	}
	
	public void name_rev_line(byte p) {
		strbuf buf = new strbuf(, , );
		int counter = 0;
		byte p_start;
		int hexsz = ModernizedCProgram.the_repository.getHash_algo().getHexsz();
		object object = new object();
		int generatedName_only = this.getName_only();
		for (p_start = p; p; p++) {
			if (!(((ModernizedCProgram.sane_ctype[(byte)((p))] & (true)) != 0) || ((p) >= (byte)'a' && (p) <= (byte)'f'))) {
				counter = 0;
			}  else if (++counter == hexsz && !(((ModernizedCProgram.sane_ctype[(byte)(((p + 1)))] & (true)) != 0) || (((p + 1)) >= (byte)'a' && ((p + 1)) <= (byte)'f'))) {
				object_id oid = new object_id();
				byte name = ((Object)0);
				byte c = (p + 1);
				int p_len = p - p_start + 1;
				counter = 0;
				(p + 1) = 0;
				if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, p - (hexsz - 1), oid)) {
					object o = object.lookup_object(ModernizedCProgram.the_repository, oid);
					if (o) {
						name = buf.get_rev_name(o);
					} 
				} 
				(p + 1) = c;
				if (!name) {
					continue;
				} 
				if (generatedName_only) {
					.printf("%.*s%s", p_len - hexsz, p_start, name);
				} else {
						.printf("%.*s (%s)", p_len, p_start, name);
				} 
				p_start = p + 1;
			} 
		}
		if (p_start != /* flush */p) {
			.fwrite(p_start, p - p_start, 1, (_iob[1]));
		} 
		buf.strbuf_release();
	}
	public int getTags_only() {
		return tags_only;
	}
	public void setTags_only(int newTags_only) {
		tags_only = newTags_only;
	}
	public int getName_only() {
		return name_only;
	}
	public void setName_only(int newName_only) {
		name_only = newName_only;
	}
	public string_list getRef_filters() {
		return ref_filters;
	}
	public void setRef_filters(string_list newRef_filters) {
		ref_filters = newRef_filters;
	}
	public string_list getExclude_filters() {
		return exclude_filters;
	}
	public void setExclude_filters(string_list newExclude_filters) {
		exclude_filters = newExclude_filters;
	}
}
