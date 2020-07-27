package application;

public class recent_data {
	private rev_info revs;
	private Object timestamp;
	
	public recent_data(rev_info revs, Object timestamp) {
		setRevs(revs);
		setTimestamp(timestamp);
	}
	public recent_data() {
	}
	
	public void add_recent_object(Object oid, Object mtime) {
		object obj = new object();
		object_type type;
		Object generatedTimestamp = this.getTimestamp();
		if (mtime <= generatedTimestamp) {
			return /*Error: Unsupported expression*/;
		} 
		object_type.type = ModernizedCProgram.the_repository.oid_object_info(oid, ((Object)0));
		if (object_type.type < 0) {
			ModernizedCProgram.die("unable to get object info for %s", ModernizedCProgram.oid_to_hex(oid));
		} 
		object object = new object();
		tree tree = new tree();
		blob blob = new blob();
		switch (object_type.type) {
		case object_type.OBJ_COMMIT:
				obj = object.parse_object_or_die(oid, ((Object)0));
				break;
		case object_type.OBJ_TREE:
				obj = (object)tree.lookup_tree(ModernizedCProgram.the_repository, oid);
				break;
		case object_type.OBJ_TAG:
		case object_type.OBJ_BLOB:
				obj = (object)blob.lookup_blob(ModernizedCProgram.the_repository, oid);
				break;
		default:
				ModernizedCProgram.die("unknown object type for %s: %s", ModernizedCProgram.oid_to_hex(oid), ModernizedCProgram.type_name(object_type.type));
		}
		if (!obj) {
			ModernizedCProgram.die("unable to lookup %s", ModernizedCProgram.oid_to_hex(oid));
		} 
		rev_info generatedRevs = this.getRevs();
		ModernizedCProgram.add_pending_object(generatedRevs, obj, "");
	}
	public rev_info getRevs() {
		return revs;
	}
	public void setRevs(rev_info newRevs) {
		revs = newRevs;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
}
