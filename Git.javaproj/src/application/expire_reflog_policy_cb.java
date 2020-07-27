package application;

public class expire_reflog_policy_cb {
	private  unreachable_expire_kind;
	private commit_list mark_list;
	private long mark_limit;
	private cmd_reflog_expire_cb cmd;
	private commit tip_commit;
	private commit_list tips;
	
	public expire_reflog_policy_cb( unreachable_expire_kind, commit_list mark_list, long mark_limit, cmd_reflog_expire_cb cmd, commit tip_commit, commit_list tips) {
		setUnreachable_expire_kind(unreachable_expire_kind);
		setMark_list(mark_list);
		setMark_limit(mark_limit);
		setCmd(cmd);
		setTip_commit(tip_commit);
		setTips(tips);
	}
	public expire_reflog_policy_cb() {
	}
	
	public void mark_reachable() {
		commit_list pending = new commit_list();
		long generatedMark_limit = this.getMark_limit();
		timestamp_t expire_limit = generatedMark_limit;
		commit_list leftover = ((Object)0);
		commit generatedItem = pending.getItem();
		object generatedObject = generatedItem.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit_list generatedNext = pending.getNext();
		commit_list generatedMark_list = this.getMark_list();
		for (pending = generatedMark_list; pending; pending = generatedNext) {
			generatedFlags &=  ~(-1024 << 12);
		}
		pending = generatedMark_list;
		Object generatedDate = commit.getDate();
		commit_list generatedParents = commit.getParents();
		while (pending) {
			commit_list parent = new commit_list();
			commit commit = /*Error: Function owner not recognized*/pop_commit(pending);
			if (generatedFlags & (-1024 << 12)) {
				continue;
			} 
			if (ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, commit)) {
				continue;
			} 
			generatedFlags |=  (-1024 << 12);
			if (generatedDate < expire_limit) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(commit, leftover);
				continue;
			} 
			generatedFlags |=  (-1024 << 12);
			parent = generatedParents;
			while (parent) {
				commit = generatedItem;
				parent = generatedNext;
				if (generatedFlags & (-1024 << 12)) {
					continue;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/commit_list_insert(commit, pending);
			}
		}
		this.setMark_list(leftover);
	}
	public  getUnreachable_expire_kind() {
		return unreachable_expire_kind;
	}
	public void setUnreachable_expire_kind( newUnreachable_expire_kind) {
		unreachable_expire_kind = newUnreachable_expire_kind;
	}
	public commit_list getMark_list() {
		return mark_list;
	}
	public void setMark_list(commit_list newMark_list) {
		mark_list = newMark_list;
	}
	public long getMark_limit() {
		return mark_limit;
	}
	public void setMark_limit(long newMark_limit) {
		mark_limit = newMark_limit;
	}
	public cmd_reflog_expire_cb getCmd() {
		return cmd;
	}
	public void setCmd(cmd_reflog_expire_cb newCmd) {
		cmd = newCmd;
	}
	public commit getTip_commit() {
		return tip_commit;
	}
	public void setTip_commit(commit newTip_commit) {
		tip_commit = newTip_commit;
	}
	public commit_list getTips() {
		return tips;
	}
	public void setTips(commit_list newTips) {
		tips = newTips;
	}
}
