package application;

/* Struct to save a few things while debugging.  Used in do_cmdline() only. */
public class dbg_stuff {
	private int trylevel;
	private int force_abort;
	private vim_exception caught_stack;
	private Object vv_exception;
	private Object vv_throwpoint;
	private int did_emsg;
	private int got_int;
	private int did_throw;
	private int need_rethrow;
	private int check_cstack;
	private vim_exception current_exception;
	
	public dbg_stuff(int trylevel, int force_abort, vim_exception caught_stack, Object vv_exception, Object vv_throwpoint, int did_emsg, int got_int, int did_throw, int need_rethrow, int check_cstack, vim_exception current_exception) {
		setTrylevel(trylevel);
		setForce_abort(force_abort);
		setCaught_stack(caught_stack);
		setVv_exception(vv_exception);
		setVv_throwpoint(vv_throwpoint);
		setDid_emsg(did_emsg);
		setGot_int(got_int);
		setDid_throw(did_throw);
		setNeed_rethrow(need_rethrow);
		setCheck_cstack(check_cstack);
		setCurrent_exception(current_exception);
	}
	public dbg_stuff() {
	}
	
	public void save_dbg_stuff() {
		this.setTrylevel(trylevel);
		trylevel = 0;
		this.setForce_abort(force_abort);
		force_abort = 0;
		this.setCaught_stack(caught_stack);
		caught_stack = ((Object)0);
		this.setVv_exception(ModernizedCProgram.v_exception(((Object)0)));
		this.setVv_throwpoint(ModernizedCProgram.v_throwpoint(((Object)0)));
		this.setDid_emsg(ModernizedCProgram.did_emsg);
		ModernizedCProgram.did_emsg = /* Necessary for debugging an inactive ":catch", ":finally", ":endtry" */0;
		this.setGot_int(got_int);
		got_int = 0;
		this.setDid_throw(did_throw);
		did_throw = 0;
		this.setNeed_rethrow(need_rethrow);
		need_rethrow = 0;
		this.setCheck_cstack(check_cstack);
		check_cstack = 0;
		this.setCurrent_exception(current_exception);
		current_exception = ((Object)0);
	}
	public void restore_dbg_stuff() {
		suppress_errthrow = 0;
		int generatedTrylevel = this.getTrylevel();
		trylevel = generatedTrylevel;
		int generatedForce_abort = this.getForce_abort();
		force_abort = generatedForce_abort;
		vim_exception generatedCaught_stack = this.getCaught_stack();
		caught_stack = generatedCaught_stack;
		Object generatedVv_exception = this.getVv_exception();
		(Object)ModernizedCProgram.v_exception(generatedVv_exception);
		Object generatedVv_throwpoint = this.getVv_throwpoint();
		(Object)ModernizedCProgram.v_throwpoint(generatedVv_throwpoint);
		int generatedDid_emsg = this.getDid_emsg();
		ModernizedCProgram.did_emsg = generatedDid_emsg;
		int generatedGot_int = this.getGot_int();
		got_int = generatedGot_int;
		int generatedDid_throw = this.getDid_throw();
		did_throw = generatedDid_throw;
		int generatedNeed_rethrow = this.getNeed_rethrow();
		need_rethrow = generatedNeed_rethrow;
		int generatedCheck_cstack = this.getCheck_cstack();
		check_cstack = generatedCheck_cstack;
		vim_exception generatedCurrent_exception = this.getCurrent_exception();
		current_exception = generatedCurrent_exception;
	}
	public int getTrylevel() {
		return trylevel;
	}
	public void setTrylevel(int newTrylevel) {
		trylevel = newTrylevel;
	}
	public int getForce_abort() {
		return force_abort;
	}
	public void setForce_abort(int newForce_abort) {
		force_abort = newForce_abort;
	}
	public vim_exception getCaught_stack() {
		return caught_stack;
	}
	public void setCaught_stack(vim_exception newCaught_stack) {
		caught_stack = newCaught_stack;
	}
	public Object getVv_exception() {
		return vv_exception;
	}
	public void setVv_exception(Object newVv_exception) {
		vv_exception = newVv_exception;
	}
	public Object getVv_throwpoint() {
		return vv_throwpoint;
	}
	public void setVv_throwpoint(Object newVv_throwpoint) {
		vv_throwpoint = newVv_throwpoint;
	}
	public int getDid_emsg() {
		return did_emsg;
	}
	public void setDid_emsg(int newDid_emsg) {
		did_emsg = newDid_emsg;
	}
	public int getGot_int() {
		return got_int;
	}
	public void setGot_int(int newGot_int) {
		got_int = newGot_int;
	}
	public int getDid_throw() {
		return did_throw;
	}
	public void setDid_throw(int newDid_throw) {
		did_throw = newDid_throw;
	}
	public int getNeed_rethrow() {
		return need_rethrow;
	}
	public void setNeed_rethrow(int newNeed_rethrow) {
		need_rethrow = newNeed_rethrow;
	}
	public int getCheck_cstack() {
		return check_cstack;
	}
	public void setCheck_cstack(int newCheck_cstack) {
		check_cstack = newCheck_cstack;
	}
	public vim_exception getCurrent_exception() {
		return current_exception;
	}
	public void setCurrent_exception(vim_exception newCurrent_exception) {
		current_exception = newCurrent_exception;
	}
}
