package application;

public class cleanup_stuff {
	private int pending;
	private vim_exception exception;
	
	public cleanup_stuff(int pending, vim_exception exception) {
		setPending(pending);
		setException(exception);
	}
	public cleanup_stuff() {
	}
	
	/*
	 * This function works a bit like ex_finally() except that there was not
	 * actually an extra try block around the part that failed and an error or
	 * interrupt has not (yet) been converted to an exception.  This function
	 * saves the error/interrupt/ exception state and prepares for the call to
	 * do_cmdline() that is going to be made for the cleanup autocommand
	 * execution.
	 */
	public void enter_cleanup() {
		int pending = 0/*
		     * Postpone did_emsg, got_int, did_throw.  The pending values will be
		     * restored by leave_cleanup() except if there was an aborting error,
		     * interrupt, or uncaught exception after this function ends.
		     */;
		vim_exception generatedException = this.getException();
		if (ModernizedCProgram.did_emsg || got_int || did_throw || need_rethrow) {
			this.setPending((ModernizedCProgram.did_emsg ? 1 : 0) | (got_int ? 2 : 0) | (did_throw ? 4 : 0) | (need_rethrow ? 4 : 0/* If we are currently throwing an exception (did_throw), save it as
				 * well.  On an error not yet converted to an exception, update
				 * "force_abort" and reset "cause_abort" (as do_errthrow() would do).
				 * This is needed for the do_cmdline() call that is going to be made
				 * for autocommand execution.  We need not save *msg_list because
				 * there is an extra instance for every call of do_cmdline(), anyway.
				 */));
			if (did_throw || need_rethrow) {
				this.setException(current_exception);
				current_exception = ((Object)0);
			} else {
					this.setException(((Object)0));
					if (ModernizedCProgram.did_emsg) {
						force_abort |=  ModernizedCProgram.cause_abort;
						ModernizedCProgram.cause_abort = 0;
					} 
			} 
			ModernizedCProgram.did_emsg = got_int = did_throw = need_rethrow = 0;
			ModernizedCProgram.report_make_pending(pending, generatedException);
		} else {
				this.setPending(0);
				this.setException(((Object)0/*
				 * See comment above enter_cleanup() for how this function is used.
				 *
				 * This function is a bit like ex_endtry() except that there was not actually
				 * an extra try block around the part that failed and an error or interrupt
				 * had not (yet) been converted to an exception when the cleanup autocommand
				 * sequence was invoked.
				 *
				 * This function has to be called with the address of the cleanup_T structure
				 * filled by enter_cleanup() as an argument; it restores the error/interrupt/
				 * exception state saved by that function - except there was an aborting
				 * error, an interrupt or an uncaught exception during execution of the
				 * cleanup autocommands.  In the latter case, the saved error/interrupt/
				 * exception state is discarded.
				 */));
		} 
	}
	public void leave_cleanup() {
		int generatedPending = this.getPending();
		int pending = generatedPending;
		if (pending == /* nothing to do */0) {
			return /*Error: Unsupported expression*/;
		} 
		vim_exception generatedException = this.getException();
		if (ModernizedCProgram.aborting() || need_rethrow) {
			if (pending & 4) {
				(except_T)generatedException.discard_exception(/* Cancel the pending exception (includes report). */0);
			} else {
					ModernizedCProgram.report_discard_pending(pending, ((Object)0));
			} 
			if (msg_list != ((Object)/* If an error was about to be converted to an exception when
				 * enter_cleanup() was called, free the message list. */0)) {
				ModernizedCProgram.free_global_msglist();
			} 
		} else {
				if (pending & /*
					 * If there was an exception being thrown when enter_cleanup() was
					 * called, we need to rethrow it.  Make it the exception currently
					 * being thrown.
					 */4) {
					current_exception = generatedException;
				}  else if (pending & 1) {
					ModernizedCProgram.cause_abort = force_abort;
					force_abort = 0;
				} 
				if (pending & /*
					 * Restore the pending values of did_emsg, got_int, and did_throw.
					 */1) {
					ModernizedCProgram.did_emsg = 1;
				} 
				if (pending & 2) {
					got_int = 1;
				} 
				if (pending & 4) {
					need_rethrow = /* did_throw will be set by do_one_cmd() */1;
				} 
				ModernizedCProgram.report_resume_pending(/* Report if required by the 'verbose' option or when debugging. */pending, (pending & 4) ? (Object)current_exception : ((Object)0/*
				 * Make conditionals inactive and discard what's pending in finally clauses
				 * until the conditional type searched for or a try conditional not in its
				 * finally clause is reached.  If this is in an active catch clause, finish
				 * the caught exception.
				 * Return the cstack index where the search stopped.
				 * Values used for "searched_cond" are (CSF_WHILE | CSF_FOR) or CSF_TRY or 0,
				 * the latter meaning the innermost try conditional not in its finally clause.
				 * "inclusive" tells whether the conditional searched for should be made
				 * inactive itself (a try conditional not in its finally clause possibly find
				 * before is always made inactive).  If "inclusive" is TRUE and
				 * "searched_cond" is CSF_TRY|CSF_SILENT, the saved former value of
				 * "emsg_silent", if reset when the try conditional finally reached was
				 * entered, is restored (used by ex_endtry()).  This is normally done only
				 * when such a try conditional is left.
				 */));
		} 
	}
	public int getPending() {
		return pending;
	}
	public void setPending(int newPending) {
		pending = newPending;
	}
	public vim_exception getException() {
		return exception;
	}
	public void setException(vim_exception newException) {
		exception = newException;
	}
}
