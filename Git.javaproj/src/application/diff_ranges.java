package application;

/* A diff, encoded as the set of pre- and post-image ranges where the
 * files differ. A pair of ranges corresponds to a hunk. */
public class diff_ranges {
	private range_set parent;
	private range_set target;
	
	public diff_ranges(range_set parent, range_set target) {
		setParent(parent);
		setTarget(target);
	}
	public diff_ranges() {
	}
	
	public void diff_ranges_init() {
		range_set generatedParent = this.getParent();
		generatedParent.range_set_init(0);
		range_set generatedTarget = this.getTarget();
		generatedTarget.range_set_init(0);
	}
	public void diff_ranges_release() {
		range_set generatedParent = this.getParent();
		generatedParent.range_set_release();
		range_set generatedTarget = this.getTarget();
		generatedTarget.range_set_release();
	}
	public int collect_diff(Object parent, Object target) {
		collect_diff_cbdata cbdata = new collect_diff_cbdata(((Object)0));
		 xpp = new ();
		 xecfg = new ();
		 ecb = new ();
		.memset(xpp, 0, );
		.memset(xecfg, 0, );
		xecfg.setCtxlen(xecfg.setInterhunkctxlen(0));
		cbdata.setDiff(out);
		xecfg.setHunk_func(collect_diff_cb);
		.memset(ecb, 0, );
		ecb.setPriv(cbdata);
		return ModernizedCProgram.xdi_diff(parent, target, xpp, xecfg, ecb/*
		 * These are handy for debugging.  Removing them with #if 0 silences
		 * the "unused function" warning.
		 */);
	}
	public range_set getParent() {
		return parent;
	}
	public void setParent(range_set newParent) {
		parent = newParent;
	}
	public range_set getTarget() {
		return target;
	}
	public void setTarget(range_set newTarget) {
		target = newTarget;
	}
}
