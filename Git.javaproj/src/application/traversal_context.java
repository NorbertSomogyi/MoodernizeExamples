package application;

public class traversal_context {
	private rev_info revs;
	private Object show_object;
	private Object show_commit;
	private Object show_data;
	private filter filter;
	
	public traversal_context(rev_info revs, Object show_object, Object show_commit, Object show_data, filter filter) {
		setRevs(revs);
		setShow_object(show_object);
		setShow_commit(show_commit);
		setShow_data(show_data);
		setFilter(filter);
	}
	public traversal_context() {
	}
	
	public void do_traverse() {
		commit commit = new commit();
		/* callee's scratch pad */strbuf csp = new strbuf();
		csp.strbuf_init(260);
		commit commit = new commit();
		Object generatedObject = tree.getObject();
		while ((commit = commit.get_revision(ModernizedCProgram.ctx.getRevs())) != ((Object)0/*
				 * an uninteresting boundary commit may not have its tree
				 * parsed yet, but we are not going to show them anyway
				 */)) {
			if (!ModernizedCProgram.ctx.getRevs().getTree_objects()) {
				;
			}  else if (.repo_get_commit_tree(ModernizedCProgram.the_repository, commit)) {
				tree tree = .repo_get_commit_tree(ModernizedCProgram.the_repository, commit);
				generatedObject.getFlags() |=  (-1024 << 25);
				ModernizedCProgram.add_pending_tree(ModernizedCProgram.ctx.getRevs(), tree);
			}  else if (generatedObject.getParsed()) {
				ModernizedCProgram.die(ModernizedCProgram._("unable to load root tree for commit %s"), ModernizedCProgram.oid_to_hex(generatedObject.getOid()));
			} 
			.UNRECOGNIZEDFUNCTIONNAME(commit, ModernizedCProgram.ctx.getShow_data());
			if (ModernizedCProgram.ctx.getRevs().getTree_blobs_in_commit_order()) {
				ModernizedCProgram.traverse_trees_and_blobs(ModernizedCProgram.ctx, csp);
			} 
		}
		ModernizedCProgram.traverse_trees_and_blobs(ModernizedCProgram.ctx, csp);
		csp.strbuf_release();
	}
	public rev_info getRevs() {
		return revs;
	}
	public void setRevs(rev_info newRevs) {
		revs = newRevs;
	}
	public Object getShow_object() {
		return show_object;
	}
	public void setShow_object(Object newShow_object) {
		show_object = newShow_object;
	}
	public Object getShow_commit() {
		return show_commit;
	}
	public void setShow_commit(Object newShow_commit) {
		show_commit = newShow_commit;
	}
	public Object getShow_data() {
		return show_data;
	}
	public void setShow_data(Object newShow_data) {
		show_data = newShow_data;
	}
	public filter getFilter() {
		return filter;
	}
	public void setFilter(filter newFilter) {
		filter = newFilter;
	}
}
