package application;

/* Flags that remote_ls passes to callback functions */
public class remote_ls_ctx {
	private Byte path;
	private Object userFunc;
	private Object userData;
	private int flags;
	private Byte dentry_name;
	private int dentry_flags;
	private remote_ls_ctx parent;
	
	public remote_ls_ctx(Byte path, Object userFunc, Object userData, int flags, Byte dentry_name, int dentry_flags, remote_ls_ctx parent) {
		setPath(path);
		setUserFunc(userFunc);
		setUserData(userData);
		setFlags(flags);
		setDentry_name(dentry_name);
		setDentry_flags(dentry_flags);
		setParent(parent);
	}
	public remote_ls_ctx() {
	}
	
	public void process_ls_object() {
		Object generatedUserData = this.getUserData();
		int parent = (int)generatedUserData;
		Byte generatedDentry_name = this.getDentry_name();
		byte path = generatedDentry_name;
		object_id oid = new object_id();
		Byte generatedPath = this.getPath();
		int generatedFlags = this.getFlags();
		if (!/*Error: Function owner not recognized*/strcmp(generatedPath, generatedDentry_name) && (generatedFlags & (-1024 << 0))) {
			ModernizedCProgram.remote_dir_exists[parent] = 1;
			return /*Error: Unsupported expression*/;
		} 
		if (!ModernizedCProgram.skip_prefix(path, "objects/", path) || oid.get_oid_hex_from_objpath(path)) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.one_remote_object(oid);
	}
	public void process_ls_ref() {
		Byte generatedPath = this.getPath();
		Byte generatedDentry_name = this.getDentry_name();
		int generatedDentry_flags = this.getDentry_flags();
		if (!/*Error: Function owner not recognized*/strcmp(generatedPath, generatedDentry_name) && (generatedDentry_flags & (-1024 << 0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "  %s\n", generatedDentry_name);
			return /*Error: Unsupported expression*/;
		} 
		if (!(generatedDentry_flags & (-1024 << 0))) {
			ModernizedCProgram.one_remote_ref(generatedDentry_name);
		} 
	}
	public void add_remote_info_ref() {
		Object generatedUserData = this.getUserData();
		strbuf buf = (strbuf)generatedUserData;
		object o = new object();
		ref ref = new ref();
		Byte generatedDentry_name = this.getDentry_name();
		ref = /*Error: Function owner not recognized*/alloc_ref(generatedDentry_name);
		if (ref.http_fetch_ref(ModernizedCProgram.repo.getUrl()) != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Unable to fetch ref %s from %s\n", generatedDentry_name, ModernizedCProgram.repo.getUrl());
			ModernizedCProgram.aborted = 1;
			ModernizedCProgram.free(ref);
			return /*Error: Unsupported expression*/;
		} 
		object_id generatedOld_oid = ref.getOld_oid();
		object object = new object();
		o = object.parse_object(ModernizedCProgram.the_repository, generatedOld_oid);
		if (!o) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Unable to parse object %s for remote ref %s\n", ModernizedCProgram.oid_to_hex(generatedOld_oid), generatedDentry_name);
			ModernizedCProgram.aborted = 1;
			ModernizedCProgram.free(ref);
			return /*Error: Unsupported expression*/;
		} 
		buf.strbuf_addf("%s\t%s\n", ModernizedCProgram.oid_to_hex(generatedOld_oid), generatedDentry_name);
		int generatedType = o.getType();
		object_id generatedOid = o.getOid();
		if (generatedType == object_type.OBJ_TAG) {
			o = /*Error: Function owner not recognized*/deref_tag(ModernizedCProgram.the_repository, o, generatedDentry_name, 0);
			if (o) {
				buf.strbuf_addf("%s\t%s^{}\n", ModernizedCProgram.oid_to_hex(generatedOid), generatedDentry_name);
			} 
		} 
		ModernizedCProgram.free(ref);
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Object getUserFunc() {
		return userFunc;
	}
	public void setUserFunc(Object newUserFunc) {
		userFunc = newUserFunc;
	}
	public Object getUserData() {
		return userData;
	}
	public void setUserData(Object newUserData) {
		userData = newUserData;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Byte getDentry_name() {
		return dentry_name;
	}
	public void setDentry_name(Byte newDentry_name) {
		dentry_name = newDentry_name;
	}
	public int getDentry_flags() {
		return dentry_flags;
	}
	public void setDentry_flags(int newDentry_flags) {
		dentry_flags = newDentry_flags;
	}
	public remote_ls_ctx getParent() {
		return parent;
	}
	public void setParent(remote_ls_ctx newParent) {
		parent = newParent;
	}
}
