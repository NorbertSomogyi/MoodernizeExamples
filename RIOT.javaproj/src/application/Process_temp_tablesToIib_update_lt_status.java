package application;

public class Process_temp_tablesToIib_update_lt_status {
	
	
	/**
	 * Process address lists from the HELLO msg in the information bases
	 */
	private static void process_temp_tables() {
		nib_entry_t nib_elt = new nib_entry_t();
		timex_t now = new timex_t();
		now.xtimer_now_timex();
		now.iib_update_lt_status();
		nib_entry nib_entry = new nib_entry();
		nib_elt = nib_entry.nib_process_hello();
		iib_link_set_entry iib_link_set_entry = new iib_link_set_entry();
		if (nib_elt) {
			ModernizedCProgram.originator_link_tuple = iib_link_set_entry.iib_process_hello(ModernizedCProgram.if_pid, nib_elt, ModernizedCProgram.val_time, ModernizedCProgram.sym, ModernizedCProgram.lost);
			if (ModernizedCProgram.originator_link_tuple) {
				ModernizedCProgram.originator_link_tuple.iib_process_metric_msg(ModernizedCProgram.int_time != 0 ? ModernizedCProgram.int_time : ModernizedCProgram.val_time);
			} 
		} 
	}
	public static void xtimer_now_timex() {
		uint64_t now = ModernizedCProgram.xtimer_usec_from_ticks64(ModernizedCProgram.xtimer_now64());
		this.setSeconds(/*Error: Function owner not recognized*/div_u64_by_1000000(now));
		Object generatedSeconds = this.getSeconds();
		this.setMicroseconds(now - (generatedSeconds * (true/* Prepares the message to trigger the timeout.
		 * Additionally, the xtimer_t struct gets initialized.
		 */)));
	}
	public static void iib_update_lt_status() {
		iib_base_entry_t base_elt = new iib_base_entry_t();
		iib_link_set_entry_t ls_elt = new iib_link_set_entry_t();
		iib_link_set_entry_t ls_tmp = new iib_link_set_entry_t();
		iib_link_set_entry generatedLink_set_head = base_elt.getLink_set_head();
		iib_base_entry generatedNext = (base_elt).getNext();
		for (base_elt = ModernizedCProgram.iib_base_entry_head; base_elt; base_elt = generatedNext) {
			for ((ls_elt) = (generatedLink_set_head); (ls_elt) && (); (ls_elt) = ls_tmp) {
				ModernizedCProgram.wr_update_ls_status(base_elt, ls_elt, now);
			}
		}
	}
}
