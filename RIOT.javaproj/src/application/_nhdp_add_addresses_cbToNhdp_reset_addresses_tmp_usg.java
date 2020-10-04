package application;

public class _nhdp_add_addresses_cbToNhdp_reset_addresses_tmp_usg {
	
	
	private static void _nhdp_add_addresses_cb() {
		ModernizedCProgram.lib_fill_wr_addresses(ModernizedCProgram.nhdp_wr_curr_if_entry.getIf_pid(), wr);
		ModernizedCProgram.iib_fill_wr_addresses(ModernizedCProgram.nhdp_wr_curr_if_entry.getIf_pid(), wr);
		ModernizedCProgram.nib_fill_wr_addresses(wr);
		ModernizedCProgram.nhdp_reset_addresses_tmp_usg(0/**
		 * Add packet header with sequence number to current packet
		 * Called by oonf_api during packet creation
		 */);
	}
	private static void lib_fill_wr_addresses(Object if_pid, Object wr) {
		lib_entry_t lib_elt = new lib_entry_t();
		nhdp_addr_entry_t add_tmp = new nhdp_addr_entry_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_lib_access);
		Object generatedIf_pid = lib_elt.getIf_pid();
		nhdp_addr generatedAddress = add_tmp.getAddress();
		nhdp_addr_entry generatedNext = (add_tmp).getNext();
		nhdp_addr_entry generatedIf_addr_list_head = lib_elt.getIf_addr_list_head();
		for (lib_elt = ModernizedCProgram.lib_entry_head; lib_elt; lib_elt = generatedNext) {
			if (generatedIf_pid == if_pid) {
				for (add_tmp = generatedIf_addr_list_head; add_tmp; add_tmp = generatedNext) {
					ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_LOCAL_IF, RFC5444_LOCALIF_THIS_IF, (false), (false));
					generatedAddress.setIn_tmp_table((true));
				}
				break;
			} 
		}
		Object generatedIn_tmp_table = generatedAddress.getIn_tmp_table();
		for (lib_elt = ModernizedCProgram.lib_entry_head; lib_elt; lib_elt = generatedNext) {
			if (generatedIf_pid != if_pid) {
				for (add_tmp = generatedIf_addr_list_head; add_tmp; add_tmp = generatedNext) {
					if (!((generatedIn_tmp_table & /* Check if this address is not already included in a list */-1024))) {
						ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_LOCAL_IF, RFC5444_LOCALIF_OTHER_IF, (false), (false));
						generatedAddress.setIn_tmp_table((true));
					} 
				}
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_lib_access);
	}
	private static void iib_fill_wr_addresses(Object if_pid, Object wr) {
		iib_base_entry_t base_elt = new iib_base_entry_t();
		iib_link_set_entry_t ls_elt = new iib_link_set_entry_t();
		nhdp_addr_entry_t addr_elt = new nhdp_addr_entry_t();
		timex_t now = new timex_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_iib_access);
		now.xtimer_now_timex();
		/* Before adding addresses first update the status of all link tuples */now.iib_update_lt_status();
		Object generatedIf_pid = base_elt.getIf_pid();
		 generatedLast_status = ls_elt.getLast_status();
		nhdp_addr generatedAddress = addr_elt.getAddress();
		Object generatedIn_tmp_table = generatedAddress.getIn_tmp_table();
		Object generatedMetric_in = ls_elt.getMetric_in();
		Object generatedMetric_out = ls_elt.getMetric_out();
		nhdp_addr_entry generatedNext = (addr_elt).getNext();
		nhdp_addr_entry generatedAddress_list_head = ls_elt.getAddress_list_head();
		iib_link_set_entry generatedLink_set_head = base_elt.getLink_set_head();
		for (base_elt = ModernizedCProgram.iib_base_entry_head; base_elt; base_elt = generatedNext) {
			if (generatedIf_pid == if_pid) {
				for (ls_elt = generatedLink_set_head; ls_elt; ls_elt = generatedNext) {
					if (generatedLast_status != .IIB_LT_STATUS_PENDING) {
						for (addr_elt = generatedAddress_list_head; addr_elt; addr_elt = generatedNext) {
							if (!((generatedIn_tmp_table & -1024))) {
								switch (generatedLast_status) {
								case .IIB_LT_STATUS_SYM:
										ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_LINK_STATUS, RFC5444_LINKSTATUS_SYMMETRIC, /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_in), /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_out));
										generatedAddress.setIn_tmp_table((true));
										break;
								case .IIB_LT_STATUS_PENDING/* Pending link tuples are not included */:
										break;
								case .IIB_LT_STATUS_UNKNOWN/* Fall through */:
								case .IIB_LT_STATUS_HEARD:
										ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_LINK_STATUS, RFC5444_LINKSTATUS_HEARD, /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_in), /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_out));
										generatedAddress.setIn_tmp_table((true));
										break;
								case .IIB_LT_STATUS_LOST:
										ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_LINK_STATUS, RFC5444_LINKSTATUS_LOST, /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_in), /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_out));
										generatedAddress.setIn_tmp_table((true));
										break;
								default:
										/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* Should not happen */"%s:%d in %s: [WARNING] Unknown link tuple status\n", RIOT_FILE_RELATIVE, 200, DEBUG_FUNC);
										break;
								}
							} 
						}
					} 
				}
				break;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_iib_access);
	}
	private static void nib_fill_wr_addresses(Object wr) {
		nib_entry_t nib_elt = new nib_entry_t();
		nhdp_addr_entry_t addr_elt = new nhdp_addr_entry_t();
		nib_lost_address_entry_t lost_elt = new nib_lost_address_entry_t();
		nib_lost_address_entry_t lost_tmp = new nib_lost_address_entry_t();
		timex_t now = new timex_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_nib_access);
		now.xtimer_now_timex();
		Object generatedSymmetric = nib_elt.getSymmetric();
		nhdp_addr generatedAddress = addr_elt.getAddress();
		Object generatedIn_tmp_table = generatedAddress.getIn_tmp_table();
		Object generatedMetric_in = nib_elt.getMetric_in();
		Object generatedMetric_out = nib_elt.getMetric_out();
		nhdp_addr_entry generatedNext = (addr_elt).getNext();
		nhdp_addr_entry generatedAddress_list_head = nib_elt.getAddress_list_head();
		for (nib_elt = ModernizedCProgram.nib_entry_head; nib_elt; nib_elt = generatedNext) {
			if (generatedSymmetric) {
				for (addr_elt = generatedAddress_list_head; addr_elt; addr_elt = generatedNext) {
					if (!((generatedIn_tmp_table & -1024) >> /* Check whether address is not already included with link status symmetric */1)) {
						ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_OTHER_NEIGHB, RFC5444_OTHERNEIGHB_SYMMETRIC, /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_in), /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_out));
						generatedAddress.setIn_tmp_table((true));
					} 
				}
			} 
		}
		 generatedExpiration_time = lost_elt.getExpiration_time();
		for ((lost_elt) = (ModernizedCProgram.nib_lost_address_entry_head); (lost_elt) && (); (lost_elt) = /* Add lost addresses of neighbors to HELLO msg */lost_tmp) {
			if (ModernizedCProgram.timex_cmp(generatedExpiration_time, now) != 1) {
				/* Entry expired, remove it */lost_elt.rem_ln_entry();
			} else {
					if (!((generatedIn_tmp_table & /* Check if address is not already present in one of the temporary lists */-1024))) {
						ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, /* Address is not present in one of the lists, add it */RFC5444_ADDRTLV_OTHER_NEIGHB, RFC5444_OTHERNEIGHB_LOST, (false), (false));
					} 
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_nib_access);
	}
	public static void nhdp_reset_addresses_tmp_usg(Object decr_usg) {
		nhdp_addr_t addr_elt = new nhdp_addr_t();
		nhdp_addr_t addr_tmp = new nhdp_addr_t();
		Object generatedIn_tmp_table = addr_elt.getIn_tmp_table();
		for ((addr_elt) = (ModernizedCProgram.nhdp_addr_db_head); (addr_elt) && (); (addr_elt) = addr_tmp) {
			addr_elt.setTmp_metric_val((false));
			if (generatedIn_tmp_table) {
				addr_elt.setIn_tmp_table((true));
				if (decr_usg) {
					addr_elt.nhdp_decrement_addr_usage();
				} 
			} 
		}
	}
}
