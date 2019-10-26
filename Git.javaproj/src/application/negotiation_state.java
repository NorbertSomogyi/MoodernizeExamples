package application;

/* Remember to update object flag allocation in object.h */
public class negotiation_state {
	private prio_queue rev_list;
	private int non_common_revs;
	
	public negotiation_state(prio_queue rev_list, int non_common_revs) {
		setRev_list(rev_list);
		setNon_common_revs(non_common_revs);
	}
	public negotiation_state() {
	}
	
	public Object get_rev() {
		commit commit = ((Object)0);
		prio_queue generatedRev_list = this.getRev_list();
		int generatedNr = generatedRev_list.getNr();
		int generatedNon_common_revs = this.getNon_common_revs();
		commit_list generatedParents = commit.getParents();
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		commit generatedItem = parents.getItem();
		commit_list generatedNext = parents.getNext();
		while (commit == ((Object)0)) {
			int mark;
			commit_list parents = new commit_list();
			if (generatedNr == 0 || generatedNon_common_revs == 0) {
				return ((Object)0);
			} 
			commit = generatedRev_list.prio_queue_get();
			ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, commit);
			parents = generatedParents;
			generatedFlags |=  (-1024 << 5);
			if (!(generatedFlags & (-1024 << 2))) {
				generatedNon_common_revs--;
			} 
			if (generatedFlags & (-1024 << 2)) {
				commit = ((Object)/* do not send "have", and ignore ancestors */0);
				mark = (-1024 << 2) | (-1024 << 4);
			}  else if (generatedFlags & (-1024 << 3)) {
				mark = (-1024 << 2) | (-1024 << /* send "have", and ignore ancestors */4);
			} else {
					mark = (-1024 << /* send "have", also for its ancestors */4);
			} 
			while (parents) {
				if (!(generatedFlags & (-1024 << 4))) {
					ModernizedCProgram.rev_list_push(ns, generatedItem, mark);
				} 
				if (mark & (-1024 << 2)) {
					ModernizedCProgram.mark_common(ns, generatedItem, 1, 0);
				} 
				parents = generatedNext;
			}
		}
		object_id generatedOid = generatedObject.getOid();
		return generatedOid;
		commit to_send = ((Object)0);
		prio_queue generatedRev_list = data.getRev_list();
		int generatedNr = generatedRev_list.getNr();
		int generatedNon_common_revs = data.getNon_common_revs();
		commit generatedCommit = entry.getCommit();
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		Object generatedTtl = entry.getTtl();
		commit generatedItem = p.getItem();
		commit_list generatedNext = p.getNext();
		commit_list generatedParents = commit.getParents();
		while (to_send == ((Object)0)) {
			entry entry = new entry();
			commit commit = new commit();
			commit_list p = new commit_list();
			int parent_pushed = 0;
			if (generatedNr == 0 || generatedNon_common_revs == 0) {
				return ((Object)0);
			} 
			entry = generatedRev_list.prio_queue_get();
			commit = generatedCommit;
			generatedFlags |=  (-1024 << 5);
			if (!(generatedFlags & (-1024 << 2))) {
				generatedNon_common_revs--;
			} 
			if (!(generatedFlags & (-1024 << 2)) && !generatedTtl) {
				to_send = commit;
			} 
			ModernizedCProgram.repo_parse_commit(ModernizedCProgram.the_repository, commit);
			for (p = generatedParents; p; p = generatedNext) {
				parent_pushed |=  ModernizedCProgram.push_parent(data, entry, generatedItem);
			}
			if (!(generatedFlags & (-1024 << 2)) && !parent_pushed/*
						 * This commit has no parents, or all of its parents
						 * have already been popped (due to clock skew), so send
						 * it anyway.
						 */) {
				to_send = commit;
			} 
			ModernizedCProgram.free(entry);
		}
		object_id generatedOid = generatedObject.getOid();
		return generatedOid;
	}
	public prio_queue getRev_list() {
		return rev_list;
	}
	public void setRev_list(prio_queue newRev_list) {
		rev_list = newRev_list;
	}
	public int getNon_common_revs() {
		return non_common_revs;
	}
	public void setNon_common_revs(int newNon_common_revs) {
		non_common_revs = newNon_common_revs;
	}
}
