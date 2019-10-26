package application;

/*
 * Copyright (c) 2011, Google Inc.
 */
public class bulk_checkin_state {
	private int plugged;
	private Byte pack_tmp_name;
	private hashfile f;
	private Object offset;
	private pack_idx_option pack_idx_opts;
	private pack_idx_entry written;
	private Object alloc_written;
	private Object nr_written;
	
	public bulk_checkin_state(int plugged, Byte pack_tmp_name, hashfile f, Object offset, pack_idx_option pack_idx_opts, pack_idx_entry written, Object alloc_written, Object nr_written) {
		setPlugged(plugged);
		setPack_tmp_name(pack_tmp_name);
		setF(f);
		setOffset(offset);
		setPack_idx_opts(pack_idx_opts);
		setWritten(written);
		setAlloc_written(alloc_written);
		setNr_written(nr_written);
	}
	public bulk_checkin_state() {
	}
	
	public void finish_bulk_checkin() {
		object_id oid = new object_id();
		strbuf packname = new strbuf(, , );
		int i;
		if (!ModernizedCProgram.state.getF()) {
			return ;
		} 
		Object generatedHash = oid.getHash();
		if (ModernizedCProgram.state.getNr_written() == 0) {
			.close(ModernizedCProgram.state.getF().getFd());
			.unlink(ModernizedCProgram.state.getPack_tmp_name());
			;
		}  else if (ModernizedCProgram.state.getNr_written() == 1) {
			ModernizedCProgram.state.getF().finalize_hashfile(generatedHash, 4 | 2 | 1);
		} else {
				int fd = ModernizedCProgram.state.getF().finalize_hashfile(generatedHash, 0);
				ModernizedCProgram.fixup_pack_header_footer(fd, generatedHash, ModernizedCProgram.state.getPack_tmp_name(), ModernizedCProgram.state.getNr_written(), generatedHash, ModernizedCProgram.state.getOffset());
				.close(fd);
		} 
		packname.strbuf_addf("%s/pack/pack-", ModernizedCProgram.get_object_directory());
		ModernizedCProgram.finish_tmp_packfile(packname, ModernizedCProgram.state.getPack_tmp_name(), ModernizedCProgram.state.getWritten(), ModernizedCProgram.state.getNr_written(), ModernizedCProgram.state.getPack_idx_opts(), generatedHash);
		for (i = 0; i < ModernizedCProgram.state.getNr_written(); i++) {
			ModernizedCProgram.free(ModernizedCProgram.state.getWritten()[i]);
		}
		.memset(ModernizedCProgram.state, 0, );
		packname.strbuf_release();
		/* Make objects we just wrote available to ourselves */ModernizedCProgram.the_repository.reprepare_packed_git();
	}
	/* Lazily create backing packfile for the state */
	public void prepare_to_stream(int flags) {
		if (!(flags & 1) || ModernizedCProgram.state.getF()) {
			return ;
		} 
		hashfile hashfile = new hashfile();
		ModernizedCProgram.state.setF(hashfile.create_tmp_packfile(ModernizedCProgram.state.getPack_tmp_name()));
		ModernizedCProgram.state.getPack_idx_opts().reset_pack_idx_option();
		ModernizedCProgram.state.setOffset(ModernizedCProgram.state.getF().write_pack_header(/* Pretend we are going to write only one object */1));
		if (!ModernizedCProgram.state.getOffset()) {
			ModernizedCProgram.die_errno("unable to write pack header");
		} 
	}
	public int getPlugged() {
		return plugged;
	}
	public void setPlugged(int newPlugged) {
		plugged = newPlugged;
	}
	public Byte getPack_tmp_name() {
		return pack_tmp_name;
	}
	public void setPack_tmp_name(Byte newPack_tmp_name) {
		pack_tmp_name = newPack_tmp_name;
	}
	public hashfile getF() {
		return f;
	}
	public void setF(hashfile newF) {
		f = newF;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public pack_idx_option getPack_idx_opts() {
		return pack_idx_opts;
	}
	public void setPack_idx_opts(pack_idx_option newPack_idx_opts) {
		pack_idx_opts = newPack_idx_opts;
	}
	public pack_idx_entry getWritten() {
		return written;
	}
	public void setWritten(pack_idx_entry newWritten) {
		written = newWritten;
	}
	public Object getAlloc_written() {
		return alloc_written;
	}
	public void setAlloc_written(Object newAlloc_written) {
		alloc_written = newAlloc_written;
	}
	public Object getNr_written() {
		return nr_written;
	}
	public void setNr_written(Object newNr_written) {
		nr_written = newNr_written;
	}
}
