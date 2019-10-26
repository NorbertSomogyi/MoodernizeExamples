package application;

public class merge_parents {
	private int alloc;
	private int nr;
	private merge_parent item;
	
	public merge_parents(int alloc, int nr, merge_parent item) {
		setAlloc(alloc);
		setNr(nr);
		setItem(item);
	}
	public merge_parents() {
	}
	
	public int handle_line(Byte line) {
		int i;
		int len = .strlen(line);
		origin_data origin_data = new origin_data();
		byte src;
		byte origin;
		src_data src_data = new src_data();
		string_list_item item = new string_list_item();
		int pulling_head = 0;
		object_id oid = new object_id();
		int hexsz = ModernizedCProgram.the_repository.getHash_algo().getHexsz();
		if (len < hexsz + 3 || line[hexsz] != (byte)'\t') {
			return 1;
		} 
		if (ModernizedCProgram.starts_with(line + hexsz + 1, "not-for-merge")) {
			return 0;
		} 
		if (line[hexsz + 1] != (byte)'\t') {
			return 2;
		} 
		i = oid.get_oid_hex(line);
		if (i) {
			return 3;
		} 
		merge_parent merge_parent = new merge_parent();
		if (!merge_parent.find_merge_parent(merge_parents, oid, ((Object)0))) {
			return /* subsumed by other parents */0;
		} 
		origin_data = ModernizedCProgram.xcalloc(1, );
		object_id generatedOid = origin_data.getOid();
		generatedOid.oidcpy(oid);
		if (line[len - 1] == (byte)'\n') {
			line[len - 1] = 0;
		} 
		line += hexsz + 2/*
			 * At this point, line points at the beginning of comment e.g.
			 * "branch 'frotz' of git://that/repository.git".
			 * Find the repository name and point it with src.
			 */;
		src = .strstr(line, " of ");
		if (src) {
			src = 0;
			src += 4;
			pulling_head = 0;
		} else {
				src = line;
				pulling_head = 1;
		} 
		string_list_item string_list_item = new string_list_item();
		item = string_list_item.unsorted_string_list_lookup(ModernizedCProgram.srcs, src);
		Object generatedUtil = item.getUtil();
		if (!item) {
			item = ModernizedCProgram.srcs.string_list_append(src);
			item.setUtil(ModernizedCProgram.xcalloc(1, ));
			generatedUtil.init_src_data();
		} 
		src_data = generatedUtil;
		int generatedHead_status = src_data.getHead_status();
		string_list generatedBranch = src_data.getBranch();
		string_list generatedTag = src_data.getTag();
		string_list generatedR_branch = src_data.getR_branch();
		string_list generatedGeneric = src_data.getGeneric();
		if (pulling_head) {
			origin = src;
			generatedHead_status |=  1;
		}  else if (ModernizedCProgram.starts_with(line, "branch ")) {
			origin_data.setIs_local_branch(1);
			origin = line + 7;
			generatedBranch.string_list_append(origin);
			generatedHead_status |=  2;
		}  else if (ModernizedCProgram.starts_with(line, "tag ")) {
			origin = line;
			generatedTag.string_list_append(origin + 4);
			generatedHead_status |=  2;
		}  else if (ModernizedCProgram.skip_prefix(line, "remote-tracking branch ", origin)) {
			generatedR_branch.string_list_append(origin);
			generatedHead_status |=  2;
		} else {
				origin = src;
				generatedGeneric.string_list_append(line);
				generatedHead_status |=  2;
		} 
		if (!.strcmp(".", src) || !.strcmp(src, origin)) {
			int len = .strlen(origin);
			if (origin[0] == (byte)'\'' && origin[len - 1] == (byte)'\'') {
				origin = ModernizedCProgram.xmemdupz(origin + 1, len - 2);
			} 
		} else {
				origin = ModernizedCProgram.xstrfmt("%s of %s", origin, src);
		} 
		if (.strcmp(".", src)) {
			origin_data.setIs_local_branch(0);
		} 
		ModernizedCProgram.origins.string_list_append(origin).setUtil(origin_data);
		return 0;
		byte arg = .strchr(line, (byte)' ');
		if (!arg) {
			ModernizedCProgram.die("no argument in line: %s", line);
		} 
		ModernizedCProgram.handle_command(line, arg + 1, stdin_buf);
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public merge_parent getItem() {
		return item;
	}
	public void setItem(merge_parent newItem) {
		item = newItem;
	}
}
