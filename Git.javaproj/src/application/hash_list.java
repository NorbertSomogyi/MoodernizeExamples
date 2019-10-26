package application;

public class hash_list {
	private hash_list next;
	private object_id oid;
	
	public hash_list(hash_list next, object_id oid) {
		setNext(next);
		setOid(oid);
	}
	public hash_list() {
	}
	
	public hash_list parse_merge(int count) {
		hash_list list = ((Object)0);
		hash_list tail = ModernizedCProgram.list;
		hash_list n = new hash_list();
		byte from;
		branch s = new branch();
		count = 0;
		branch branch = new branch();
		object_id generatedOid = n.getOid();
		object_entry object_entry = new object_entry();
		Object generatedType = oe.getType();
		hash_list generatedNext = n.getNext();
		while (ModernizedCProgram.skip_prefix(ModernizedCProgram.command_buf.getBuf(), "merge ", from)) {
			n = ModernizedCProgram.xmalloc();
			s = branch.lookup_branch(from);
			if (s) {
				generatedOid.oidcpy(generatedOid);
			}  else if (from == (byte)':') {
				uintmax_t idnum = ModernizedCProgram.parse_mark_ref_eol(from);
				object_entry oe = object_entry.find_mark(idnum);
				if (generatedType != object_type.OBJ_COMMIT) {
					ModernizedCProgram.die("Mark :%llu not a commit", idnum);
				} 
				generatedOid.oidcpy(generatedOid);
			}  else if (!ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, from, generatedOid)) {
				long size;
				byte buf = ModernizedCProgram.read_object_with_reference(ModernizedCProgram.the_repository, generatedOid, ModernizedCProgram.commit_type, size, generatedOid);
				if (!ModernizedCProgram.buf || size < ModernizedCProgram.the_repository.getHash_algo().getHexsz() + 6) {
					ModernizedCProgram.die("Not a valid commit: %s", from);
				} 
				ModernizedCProgram.free(ModernizedCProgram.buf);
			} else {
					ModernizedCProgram.die("Invalid ref name or SHA1 expression: %s", from);
			} 
			n.setNext(((Object)0));
			tail = n;
			tail = generatedNext;
			(count)++;
			ModernizedCProgram.read_next_command();
		}
		return list;
	}
	public hash_list getNext() {
		return next;
	}
	public void setNext(hash_list newNext) {
		next = newNext;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
}
