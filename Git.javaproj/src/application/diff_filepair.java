package application;

public class diff_filepair {
	private diff_filespec[] one;
	private diff_filespec two;
	private int score;
	private byte status;
	private int broken_pair;
	private int renamed_pair;
	private int is_unmerged;
	private int done_skip_stat_unmatch;
	private int skip_stat_unmatch_result;
	
	public diff_filepair(diff_filespec[] one, diff_filespec two, int score, byte status, int broken_pair, int renamed_pair, int is_unmerged, int done_skip_stat_unmatch, int skip_stat_unmatch_result) {
		setOne(one);
		setTwo(two);
		setScore(score);
		setStatus(status);
		setBroken_pair(broken_pair);
		setRenamed_pair(renamed_pair);
		setIs_unmerged(is_unmerged);
		setDone_skip_stat_unmatch(done_skip_stat_unmatch);
		setSkip_stat_unmatch_result(skip_stat_unmatch_result);
	}
	public diff_filepair() {
	}
	
	public diff_filepair diff_filepair_dup() {
		diff_filepair new_filepair = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
		diff_filespec[] generatedOne = this.getOne();
		new_filepair.setOne(generatedOne);
		diff_filespec generatedTwo = this.getTwo();
		new_filepair.setTwo(generatedTwo);
		int generatedCount = generatedOne.getCount();
		generatedCount++;
		generatedCount++;
		return new_filepair;
	}
	public void free_combined_pair() {
		diff_filespec generatedTwo = this.getTwo();
		ModernizedCProgram.free(generatedTwo);
		ModernizedCProgram.free(pair/*
		 * A combine_diff_path expresses N parents on the LHS against 1 merge
		 * result. Synthesize a diff_filepair that has N entries on the "one"
		 * side and 1 entry on the "two" side.
		 *
		 * In the future, we might want to add more data to combine_diff_path
		 * so that we can fill fields we are ignoring (most notably, size) here,
		 * but currently nobody uses it, so this should suffice for now.
		 */);
	}
	public diff_filepair combined_pair(combine_diff_path p, int num_parent) {
		int i;
		diff_filepair pair = new diff_filepair();
		diff_filespec pool = new diff_filespec();
		pair = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		pool = ModernizedCProgram.xcalloc(ModernizedCProgram.st_add(num_parent, 1), /*Error: Unsupported expression*/);
		pair.setOne(pool + 1);
		pair.setTwo(pool);
		byte[] generatedPath = p.getPath();
		diff_filespec[] generatedOne = pair.getOne();
		Object generatedParent = p.getParent();
		for (i = 0; i < num_parent; i++) {
			generatedOne[i].setPath(generatedPath);
			generatedOne[i].setMode(generatedParent[i].getMode());
			generatedOne[i].getOid().oidcpy(generatedParent[i].getOid());
			generatedOne[i].setOid_valid(!ModernizedCProgram.is_null_oid(generatedParent[i].getOid()));
			generatedOne[i].setHas_more_entries(1);
		}
		generatedOne[num_parent - 1].setHas_more_entries(0);
		diff_filespec generatedTwo = pair.getTwo();
		generatedTwo.setPath(generatedPath);
		int generatedMode = p.getMode();
		generatedTwo.setMode(generatedMode);
		object_id generatedOid = generatedTwo.getOid();
		generatedOid.oidcpy(generatedOid);
		generatedTwo.setOid_valid(!ModernizedCProgram.is_null_oid(generatedOid));
		return pair;
	}
	public diff_filespec[] getOne() {
		return one;
	}
	public void setOne(diff_filespec[] newOne) {
		one = newOne;
	}
	public diff_filespec getTwo() {
		return two;
	}
	public void setTwo(diff_filespec newTwo) {
		two = newTwo;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int newScore) {
		score = newScore;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte newStatus) {
		status = newStatus;
	}
	public int getBroken_pair() {
		return broken_pair;
	}
	public void setBroken_pair(int newBroken_pair) {
		broken_pair = newBroken_pair;
	}
	public int getRenamed_pair() {
		return renamed_pair;
	}
	public void setRenamed_pair(int newRenamed_pair) {
		renamed_pair = newRenamed_pair;
	}
	public int getIs_unmerged() {
		return is_unmerged;
	}
	public void setIs_unmerged(int newIs_unmerged) {
		is_unmerged = newIs_unmerged;
	}
	public int getDone_skip_stat_unmatch() {
		return done_skip_stat_unmatch;
	}
	public void setDone_skip_stat_unmatch(int newDone_skip_stat_unmatch) {
		done_skip_stat_unmatch = newDone_skip_stat_unmatch;
	}
	public int getSkip_stat_unmatch_result() {
		return skip_stat_unmatch_result;
	}
	public void setSkip_stat_unmatch_result(int newSkip_stat_unmatch_result) {
		skip_stat_unmatch_result = newSkip_stat_unmatch_result;
	}
}
