package application;

/* Tag data */
public class tag {
	private tag next_tag;
	private Object name;
	private int pack_id;
	private object_id oid;
	
	public tag(tag next_tag, Object name, int pack_id, object_id oid) {
		setNext_tag(next_tag);
		setName(name);
		setPack_id(pack_id);
		setOid(oid);
	}
	public tag() {
	}
	
	public void handle_tag(Object name) {
		long size;
		object_type type;
		byte buf;
		byte tagger;
		byte tagger_end;
		byte message;
		size_t message_size = 0;
		object tagged = new object();
		int tagged_mark;
		commit p = new commit();
		/* Trees have no identifier in fast-export output, thus we have no way
			 * to output tags of trees, tags of tags of trees, etc.  Simply omit
			 * such tags.
			 */
		Object generatedTagged = this.getTagged();
		tagged = generatedTagged;
		int generatedType = tagged.getType();
		while (generatedType == object_type.OBJ_TAG) {
			tagged = generatedTagged;
		}
		Object generatedObject = this.getObject();
		if (generatedType == object_type.OBJ_TREE) {
			ModernizedCProgram.warning("Omitting tag %s,\nsince tags of trees (or tags of tags of trees, etc.) are not supported.", ModernizedCProgram.oid_to_hex(generatedObject.getOid()));
			return /*Error: Unsupported expression*/;
		} 
		buf = ModernizedCProgram.the_repository.repo_read_object_file(generatedObject.getOid(), object_type.type, size);
		if (!buf) {
			ModernizedCProgram.die("could not read tag %s", ModernizedCProgram.oid_to_hex(generatedObject.getOid()));
		} 
		message = /*Error: Function owner not recognized*/memmem(buf, size, "\n\n", 2);
		if (message) {
			message += 2;
			message_size = /*Error: Function owner not recognized*/strlen(message);
		} 
		tagger = /*Error: Function owner not recognized*/memmem(buf, message ? message - buf : size, "\ntagger ", 8);
		if (!tagger) {
			if (ModernizedCProgram.fake_missing_tagger) {
				tagger = "tagger Unspecified Tagger <unspecified-tagger> 0 +0000";
			} else {
					tagger = "";
			} 
			tagger_end = tagger + /*Error: Function owner not recognized*/strlen(tagger);
		} else {
				tagger++;
				tagger_end = ModernizedCProgram.gitstrchrnul(tagger, (byte)'\n');
				if (ModernizedCProgram.anonymize) {
					ModernizedCProgram.anonymize_ident_line(tagger, tagger_end);
				} 
		} 
		if (ModernizedCProgram.anonymize) {
			name = ModernizedCProgram.anonymize_refname(name);
			if (message) {
				hashmap tags = new hashmap();
				message = ModernizedCProgram.tags.anonymize_mem(anonymize_tag, message, message_size);
			} 
		} 
		if (/* handle signed tags */message) {
			byte signature = /*Error: Function owner not recognized*/strstr(message, "\n-----BEGIN PGP SIGNATURE-----\n");
			if (ModernizedCProgram.signature) {
				switch (.signed_tag_mode) {
				case /* fallthru */.STRIP:
						message_size = ModernizedCProgram.signature + 1 - message;
						break;
				case .SIGNED_TAG_ABORT:
						ModernizedCProgram.die("encountered signed tag %s; use --signed-tags=<mode> to handle it", ModernizedCProgram.oid_to_hex(generatedObject.getOid()));
				case /* fallthru */.VERBATIM:
						break;
				case .WARN_STRIP:
						ModernizedCProgram.warning("stripping signature from tag %s", ModernizedCProgram.oid_to_hex(generatedObject.getOid()));
				case .WARN:
						ModernizedCProgram.warning("exporting signed tag %s", ModernizedCProgram.oid_to_hex(generatedObject.getOid()));
				}
			} 
		} 
		tagged = generatedTagged;
		tagged_mark = tagged.get_object_mark();
		if (!tagged_mark) {
			switch (.tag_of_filtered_mode) {
			case .DROP:
					ModernizedCProgram.free(/* Ignore this tag altogether */buf);
					return /*Error: Unsupported expression*/;
			case .TAG_FILTERING_ABORT:
					ModernizedCProgram.die("tag %s tags unexported object; use --tag-of-filtered-object=<mode> to handle it", ModernizedCProgram.oid_to_hex(generatedObject.getOid()));
			case .REWRITE:
					if (generatedType == object_type.OBJ_TAG && !ModernizedCProgram.mark_tags) {
						ModernizedCProgram.die(ModernizedCProgram._("Error: Cannot export nested tags unless --mark-tags is specified."));
					}  else if (generatedType == object_type.OBJ_COMMIT) {
						p = (commit)tagged.rewrite_commit();
						if (!p) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("reset %s\nfrom %s\n\n", name, ModernizedCProgram.oid_to_hex(ModernizedCProgram.null_oid));
							ModernizedCProgram.free(buf);
							return /*Error: Unsupported expression*/;
						} 
						tagged_mark = generatedObject.get_object_mark();
					} else {
							tagged_mark = /* tagged->type is either OBJ_BLOB or OBJ_TAG */tagged.get_object_mark();
					} 
			}
		} 
		if (generatedType == object_type.OBJ_TAG) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("reset %s\nfrom %s\n\n", name, ModernizedCProgram.oid_to_hex(ModernizedCProgram.null_oid));
		} 
		if (ModernizedCProgram.starts_with(name, "refs/tags/")) {
			name += 10;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("tag %s\n", name);
		if (ModernizedCProgram.mark_tags) {
			generatedObject.mark_next_object();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("mark :%u\n", ModernizedCProgram.last_idnum);
		} 
		object_id generatedOid = tagged.getOid();
		if (tagged_mark) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("from :%d\n", tagged_mark);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("from %s\n", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		if (ModernizedCProgram.show_original_ids) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("original-oid %s\n", ModernizedCProgram.oid_to_hex(generatedOid));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%.*s%sdata %d\n%.*s\n", (int)(tagger_end - tagger), tagger, tagger == tagger_end ? "" : "\n", (int)message_size, (int)message_size, message ? message : "");
		ModernizedCProgram.free(buf);
	}
	public tag getNext_tag() {
		return next_tag;
	}
	public void setNext_tag(tag newNext_tag) {
		next_tag = newNext_tag;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public int getPack_id() {
		return pack_id;
	}
	public void setPack_id(int newPack_id) {
		pack_id = newPack_id;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
}
