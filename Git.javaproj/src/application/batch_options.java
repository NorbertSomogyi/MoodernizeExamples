package application;

/*
 * GIT - The information manager from hell
 *
 * Copyright (C) Linus Torvalds, 2005
 */
public class batch_options {
	private int enabled;
	private int follow_symlinks;
	private int print_contents;
	private int buffer_output;
	private int all_objects;
	private int unordered;
	private int cmdmode;
	private Object format;
	
	public batch_options(int enabled, int follow_symlinks, int print_contents, int buffer_output, int all_objects, int unordered, int cmdmode, Object format) {
		setEnabled(enabled);
		setFollow_symlinks(follow_symlinks);
		setPrint_contents(print_contents);
		setBuffer_output(buffer_output);
		setAll_objects(all_objects);
		setUnordered(unordered);
		setCmdmode(cmdmode);
		setFormat(format);
	}
	public batch_options() {
	}
	
	public void batch_write(Object data, int len) {
		int generatedBuffer_output = this.getBuffer_output();
		if (generatedBuffer_output) {
			if (.fwrite(data, 1, len, (_iob[1])) != len) {
				ModernizedCProgram.die_errno("unable to write to stdout");
			} 
		} else {
				ModernizedCProgram.write_or_die(1, data, len);
		} 
	}
	public int batch_objects() {
		strbuf input = new strbuf(, , );
		strbuf output = new strbuf(, , );
		expand_data data = new expand_data();
		int save_warning;
		int retval = 0;
		Object generatedFormat = this.getFormat();
		if (!generatedFormat) {
			this.setFormat("%(objectname) %(objecttype) %(objectsize)"/*
				 * Expand once with our special mark_query flag, which will prime the
				 * object_info to be handed to oid_object_info_extended for each
				 * object.
				 */);
		} 
		.memset(data, 0, );
		data.setMark_query(1);
		output.strbuf_expand(generatedFormat, expand_format, data);
		data.setMark_query(0);
		output.strbuf_release();
		int generatedCmdmode = this.getCmdmode();
		if (generatedCmdmode) {
			data.setSplit_on_whitespace(1);
		} 
		int generatedAll_objects = this.getAll_objects();
		object_info generatedInfo = data.getInfo();
		if (generatedAll_objects) {
			object_info empty = new object_info(((Object)0));
			if (!.memcmp(generatedInfo, empty, )) {
				data.setSkip_object_info(1/*
					 * If we are printing out the object, then always fill in the type,
					 * since we will want to decide whether or not to stream.
					 */);
			} 
		} 
		int generatedPrint_contents = this.getPrint_contents();
		object_type generatedType = data.getType();
		if (generatedPrint_contents) {
			generatedInfo.setTypep(generatedType);
		} 
		int generatedUnordered = this.getUnordered();
		if (generatedAll_objects) {
			object_cb_data cb = new object_cb_data();
			if (ModernizedCProgram.has_promisor_remote()) {
				ModernizedCProgram.warning("This repository uses promisor remotes. Some objects may not be loaded.");
			} 
			cb.setOpt(opt);
			cb.setExpand(data);
			cb.setScratch(output);
			if (generatedUnordered) {
				oidset seen = new oidset(new oidset(0));
				cb.setSeen(seen);
				ModernizedCProgram.for_each_loose_object(batch_unordered_loose, cb, 0);
				ModernizedCProgram.for_each_packed_object(batch_unordered_packed, cb, for_each_object_flags.FOR_EACH_OBJECT_PACK_ORDER);
				seen.oidset_clear();
			} else {
					oid_array sa = new oid_array(((Object)0), 0, 0, 0);
					ModernizedCProgram.for_each_loose_object(collect_loose_object, sa, 0);
					ModernizedCProgram.for_each_packed_object(collect_packed_object, sa, 0);
					sa.oid_array_for_each_unique(batch_object_cb, cb);
					sa.oid_array_clear();
			} 
			output.strbuf_release();
			return 0/*
				 * We are going to call get_sha1 on a potentially very large number of
				 * objects. In most large cases, these will be actual object sha1s. The
				 * cost to double-check that each one is not also a ref (just so we can
				 * warn) ends up dwarfing the actual cost of the object lookups
				 * themselves. We can work around it by just turning off the warning.
				 */;
		} 
		save_warning = ModernizedCProgram.warn_on_object_refname_ambiguity;
		ModernizedCProgram.warn_on_object_refname_ambiguity = 0;
		int generatedSplit_on_whitespace = data.getSplit_on_whitespace();
		byte generatedBuf = input.getBuf();
		while (ModernizedCProgram.strbuf_getline(input, (_iob[0])) != (true)) {
			if (generatedSplit_on_whitespace) {
				byte p = .strpbrk(generatedBuf, " \t");
				if (p) {
					while (p && .strchr(" \t", p)) {
						p++ = (byte)'\0';
					}
				} 
				data.setRest(p);
			} 
			ModernizedCProgram.batch_one_object(generatedBuf, output, opt, data);
		}
		input.strbuf_release();
		output.strbuf_release();
		ModernizedCProgram.warn_on_object_refname_ambiguity = save_warning;
		return retval;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int newEnabled) {
		enabled = newEnabled;
	}
	public int getFollow_symlinks() {
		return follow_symlinks;
	}
	public void setFollow_symlinks(int newFollow_symlinks) {
		follow_symlinks = newFollow_symlinks;
	}
	public int getPrint_contents() {
		return print_contents;
	}
	public void setPrint_contents(int newPrint_contents) {
		print_contents = newPrint_contents;
	}
	public int getBuffer_output() {
		return buffer_output;
	}
	public void setBuffer_output(int newBuffer_output) {
		buffer_output = newBuffer_output;
	}
	public int getAll_objects() {
		return all_objects;
	}
	public void setAll_objects(int newAll_objects) {
		all_objects = newAll_objects;
	}
	public int getUnordered() {
		return unordered;
	}
	public void setUnordered(int newUnordered) {
		unordered = newUnordered;
	}
	public int getCmdmode() {
		return cmdmode;
	}
	public void setCmdmode(int newCmdmode) {
		cmdmode = newCmdmode;
	}
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
}
