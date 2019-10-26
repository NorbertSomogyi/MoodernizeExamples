package application;

/* other stages for this object */
public class merge_list {
	private merge_list next;
	private merge_list link;
	private int stage;
	private int mode;
	private Object path;
	private blob blob;
	
	public merge_list(merge_list next, merge_list link, int stage, int mode, Object path, blob blob) {
		setNext(next);
		setLink(link);
		setStage(stage);
		setMode(mode);
		setPath(path);
		setBlob(blob);
	}
	public merge_list() {
	}
	
	public void add_merge_entry() {
		ModernizedCProgram.merge_result_end = entry;
		merge_list generatedNext = this.getNext();
		ModernizedCProgram.merge_result_end = generatedNext;
	}
	public Object explanation() {
		merge_list generatedLink = this.getLink();
		int generatedStage = this.getStage();
		switch (generatedStage) {
		case 2:
				if (generatedLink) {
					return "added in both";
				} 
				return "added in local";
		case 3:
				return "added in remote";
		case 0:
				return "merged";
		}
		entry = generatedLink;
		if (!entry) {
			return "removed in both";
		} 
		if (generatedLink) {
			return "changed in both";
		} 
		if (generatedStage == 3) {
			return "removed in local";
		} 
		return "removed in remote";
	}
	public Object result(Long size) {
		object_type type;
		blob base = new blob();
		blob our = new blob();
		blob their = new blob();
		Object generatedPath = this.getPath();
		byte path = generatedPath;
		int generatedStage = this.getStage();
		blob generatedBlob = this.getBlob();
		object generatedObject = generatedBlob.getObject();
		object_id generatedOid = generatedObject.getOid();
		if (!generatedStage) {
			return ModernizedCProgram.the_repository.repo_read_object_file(generatedOid, object_type.type, size);
		} 
		base = ((Object)0);
		merge_list generatedLink = this.getLink();
		if (generatedStage == 1) {
			base = generatedBlob;
			entry = generatedLink;
		} 
		our = ((Object)0);
		if (entry && generatedStage == 2) {
			our = generatedBlob;
			entry = generatedLink;
		} 
		their = ((Object)0);
		if (entry) {
			their = generatedBlob;
		} 
		return ModernizedCProgram.merge_blobs(ModernizedCProgram.the_repository.getIndex(), path, base, our, their, size);
	}
	public Object origin(Long size) {
		object_type type;
		int generatedStage = this.getStage();
		blob generatedBlob = this.getBlob();
		object generatedObject = generatedBlob.getObject();
		object_id generatedOid = generatedObject.getOid();
		merge_list generatedLink = this.getLink();
		while (entry) {
			if (generatedStage == 2) {
				return ModernizedCProgram.the_repository.repo_read_object_file(generatedOid, object_type.type, size);
			} 
			entry = generatedLink;
		}
		return ((Object)0);
	}
	public void show_diff() {
		long size;
		 src = new ();
		 dst = new ();
		 xpp = new ();
		 xecfg = new ();
		 ecb = new ();
		xpp.setFlags(0);
		.memset(xecfg, 0, );
		xecfg.setCtxlen(3);
		ecb.setOut_hunk(((Object)0));
		ecb.setOut_line(show_outf);
		ecb.setPriv(((Object)0));
		src.setPtr(entry.origin(size));
		if (!src.getPtr()) {
			size = 0;
		} 
		src.setSize(size);
		dst.setPtr(entry.result(size));
		if (!dst.getPtr()) {
			size = 0;
		} 
		dst.setSize(size);
		if (ModernizedCProgram.xdi_diff(src, dst, xpp, xecfg, ecb)) {
			ModernizedCProgram.die("unable to generate diff");
		} 
		ModernizedCProgram.free(src.getPtr());
		ModernizedCProgram.free(dst.getPtr());
	}
	public void show_result_list() {
		.printf("%s\n", entry.explanation());
		merge_list generatedLink = this.getLink();
		int generatedStage = this.getStage();
		int generatedMode = this.getMode();
		blob generatedBlob = this.getBlob();
		object generatedObject = generatedBlob.getObject();
		object_id generatedOid = generatedObject.getOid();
		Object generatedPath = this.getPath();
		do {
			merge_list link = generatedLink;
			byte[] desc = new byte[]{"result", "base", "our", "their"};
			.printf("  %-6s %o %s %s\n", desc[generatedStage], generatedMode, ModernizedCProgram.oid_to_hex(generatedOid), generatedPath);
			entry = ModernizedCProgram.link;
		} while (entry);
	}
	public merge_list create_entry(int stage, int mode, Object oid, Object path) {
		merge_list res = ModernizedCProgram.xcalloc(1, );
		res.setStage(stage);
		res.setPath(path);
		res.setMode(mode);
		blob blob = new blob();
		res.setBlob(blob.lookup_blob(ModernizedCProgram.the_repository, oid));
		return res;
	}
	public merge_list link_entry(int stage, Object info, name_entry n) {
		byte path;
		merge_list link = new merge_list();
		int generatedMode = n.getMode();
		if (!generatedMode) {
			return entry;
		} 
		Object generatedPath = this.getPath();
		if (entry) {
			path = generatedPath;
		} else {
				path = ModernizedCProgram.traverse_path(info, n);
		} 
		object_id generatedOid = n.getOid();
		merge_list merge_list = new merge_list();
		link = merge_list.create_entry(stage, generatedMode, generatedOid, path);
		link.setLink(entry);
		return link;
	}
	public merge_list getNext() {
		return next;
	}
	public void setNext(merge_list newNext) {
		next = newNext;
	}
	public merge_list getLink() {
		return link;
	}
	public void setLink(merge_list newLink) {
		link = newLink;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int newStage) {
		stage = newStage;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public blob getBlob() {
		return blob;
	}
	public void setBlob(blob newBlob) {
		blob = newBlob;
	}
}
