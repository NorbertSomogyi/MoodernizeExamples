package application;

/* Checkpoint */
public class hashfile_checkpoint {
	private Object offset;
	private git_hash_ctx ctx;
	
	public hashfile_checkpoint(Object offset, git_hash_ctx ctx) {
		setOffset(offset);
		setCtx(ctx);
	}
	public hashfile_checkpoint() {
	}
	
	public void truncate_pack() {
		if (ModernizedCProgram.hashfile_truncate(ModernizedCProgram.pack_file, checkpoint)) {
			ModernizedCProgram.die_errno("cannot truncate pack to skip duplicate");
		} 
		Object generatedOffset = this.getOffset();
		ModernizedCProgram.pack_size = generatedOffset;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public git_hash_ctx getCtx() {
		return ctx;
	}
	public void setCtx(git_hash_ctx newCtx) {
		ctx = newCtx;
	}
}
