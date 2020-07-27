package application;

/* State of bidirectional transfer loop. */
public class bidirectional_transfer_state {
	private unidirectional_transfer ptg;
	private unidirectional_transfer gtp;
	
	public bidirectional_transfer_state(unidirectional_transfer ptg, unidirectional_transfer gtp) {
		setPtg(ptg);
		setGtp(gtp);
	}
	public bidirectional_transfer_state() {
	}
	
	public int tloop_spawnwait_tasks() {
		pthread_t gtp_thread = new pthread_t();
		pthread_t ptg_thread = new pthread_t();
		int err;
		int ret = 0;
		unidirectional_transfer generatedGtp = this.getGtp();
		err = gtp_thread.pthread_create(((Object)0), udt_copy_task_routine, generatedGtp);
		if (err) {
			ModernizedCProgram.die(ModernizedCProgram._("can't start thread for copying data: %s"), /*Error: Function owner not recognized*/strerror(err));
		} 
		unidirectional_transfer generatedPtg = this.getPtg();
		err = ptg_thread.pthread_create(((Object)0), udt_copy_task_routine, generatedPtg);
		if (err) {
			ModernizedCProgram.die(ModernizedCProgram._("can't start thread for copying data: %s"), /*Error: Function owner not recognized*/strerror(err));
		} 
		ret |=  ModernizedCProgram.tloop_join(gtp_thread, "Git to program copy");
		ret |=  ModernizedCProgram.tloop_join(ptg_thread, "Program to git copy");
		return ret/* Close the source and target (for writing) for transfer. */;
	}
	/*
		 * Socket read end left open isn't a disaster if nobody
		 * attempts to read from it (mingw compat headers do not
		 * have SHUT_RD)...
		 *
		 * We can't fully close the socket since otherwise gtp
		 * task would first close the socket it sends data to
		 * while closing the ptg file descriptors.
		 */
	/*
	 * Join process, with appropriate errors on failure. Name is name for the
	 * process (for error messages). Returns 0 on success, 1 on failure.
	 */
	public unidirectional_transfer getPtg() {
		return ptg;
	}
	public void setPtg(unidirectional_transfer newPtg) {
		ptg = newPtg;
	}
	public unidirectional_transfer getGtp() {
		return gtp;
	}
	public void setGtp(unidirectional_transfer newGtp) {
		gtp = newGtp;
	}
}
/* Direction from program to git. */
