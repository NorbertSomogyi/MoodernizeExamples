package application;

/*
 * Copyright (C) 2014 Freie Universität Berlin
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @ingroup     nhdp
 * @{
 *
 * @file
 * @brief       Interface Information Base interface for NHDP
 *
 * @author      Fabian Nack <nack@inf.fu-berlin.de>
 */
/**
 * @brief   Possible L_STATUS values of a link tuple
 */
/**
 * @brief   Link Set entry (link tuple)
 */
/**< Lost HELLO count after last received HELLO */
/**< Incoming Bitrate for this link in Bit/s */
/**< The last received packet sequence number */
/**< Pointer to next list entry */
public class iib_link_set_entry {
	private nhdp_addr_entry address_list_head;
	private  heard_time;
	private  sym_time;
	private Object pending;
	private Object lost;
	private  exp_time;
	private nib_entry nb_elt;
	private  last_status;
	private Object metric_in;
	private Object metric_out;
	private iib_link_set_entry next;
	
	public iib_link_set_entry(nhdp_addr_entry address_list_head,  heard_time,  sym_time, Object pending, Object lost,  exp_time, nib_entry nb_elt,  last_status, Object metric_in, Object metric_out, iib_link_set_entry next) {
		setAddress_list_head(address_list_head);
		setHeard_time(heard_time);
		setSym_time(sym_time);
		setPending(pending);
		setLost(lost);
		setExp_time(exp_time);
		setNb_elt(nb_elt);
		setLast_status(last_status);
		setMetric_in(metric_in);
		setMetric_out(metric_out);
		setNext(next);
	}
	public iib_link_set_entry() {
	}
	
	public iib_link_set_entry iib_process_hello(Object if_pid, nib_entry nb_elt, Object validity_time, Object is_sym_nb, Object is_lost) {
		iib_base_entry_t base_elt = new iib_base_entry_t();
		iib_link_set_entry_t ls_entry = ((Object)0);
		timex_t now = new timex_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_iib_access);
		ModernizedCProgram.cleanup_link_sets();
		Object generatedIf_pid = base_elt.getIf_pid();
		iib_base_entry generatedNext = (base_elt).getNext();
		for (base_elt = ModernizedCProgram.iib_base_entry_head; base_elt; base_elt = generatedNext) {
			if (generatedIf_pid == /* Find the link set and two hop set for the interface */if_pid) {
				break;
			} 
		}
		iib_link_set_entry iib_link_set_entry = new iib_link_set_entry();
		if (base_elt) {
			now.xtimer_now_timex();
			ls_entry = iib_link_set_entry.update_link_set(base_elt, nb_elt, now, validity_time, is_sym_nb, /* Create a new link tuple for the neighbor that originated the hello */is_lost);
			if (/* Create new two hop tuples for signaled symmetric neighbors */ls_entry) {
				ModernizedCProgram.update_two_hop_set(base_elt, ls_entry, now, validity_time);
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_iib_access);
		return ls_entry;
	}
	public void iib_process_metric_msg(Object int_time) {
		(Object)/* Hop metric value for an existing direct link is always 1 */int_time;
		this.setMetric_in(1);
		this.setMetric_out(1);
		nib_entry generatedNb_elt = this.getNb_elt();
		if (generatedNb_elt) {
			generatedNb_elt.setMetric_in(1);
			generatedNb_elt.setMetric_out(1/* Process required DAT metric steps */);
		} 
	}
	/* NHDP_METRIC is not set properly */
	public void iib_process_metric_pckt(Object metric_out, Object seq_no) {
		(Object)/* Nothing to do here */ls_entry;
		(Object)metric_out;
		(Object)seq_no/* Metric packet processing *//* Don't add values to the queue for duplicate packets *//* Refresh metric value for link tuple and corresponding neighbor tuple */;/* Don't add values to the queue for duplicate packets *//* Refresh metric value for link tuple and corresponding neighbor tuple */
	}
	/**
	 * Update the Link Set for the receiving interface during HELLO message processing
	 */
	public iib_link_set_entry update_link_set(iib_base_entry base_entry, nib_entry nb_elt,  now, Object val_time, Object sym, Object lost) {
		iib_link_set_entry_t ls_elt = new iib_link_set_entry_t();
		iib_link_set_entry_t ls_tmp = new iib_link_set_entry_t();
		iib_link_set_entry_t matching_lt = ((Object)0);
		nhdp_addr_entry_t lt_elt = new nhdp_addr_entry_t();
		timex_t v_time = new timex_t();
		timex_t l_hold = new timex_t();
		uint8_t matches = 0;
		nhdp_addr generatedAddress = lt_elt.getAddress();
		Object generatedIn_tmp_table = generatedAddress.getIn_tmp_table();
		 generatedLast_status = matching_lt.getLast_status();
		nhdp_addr_entry generatedNext = (lt_elt).getNext();
		nhdp_addr_entry generatedAddress_list_head = ls_elt.getAddress_list_head();
		iib_link_set_entry generatedLink_set_head = base_entry.getLink_set_head();
		for ((ls_elt) = (generatedLink_set_head); (ls_elt) && (); (ls_elt) = /* Loop through every link tuple of the interface to update the link set */ls_tmp) {
			for (lt_elt = generatedAddress_list_head; lt_elt; lt_elt = generatedNext) {
				if (((generatedIn_tmp_table & -1024) >> 6)) {
					/* If link tuple address matches a sending addr we found a fitting tuple */matches++;
					if (matches > 1) {
						if (generatedLast_status == /* Multiple matching link tuples, delete the previous one */.IIB_LT_STATUS_SYM) {
							ModernizedCProgram.update_nb_tuple_symmetry(base_entry, matching_lt, now);
						} 
						ModernizedCProgram.rem_link_set_entry(base_entry, matching_lt);
					} 
					matching_lt = ls_elt;
					break;
				} 
			}
		}
		iib_link_set_entry iib_link_set_entry = new iib_link_set_entry();
		if (matches > 1) {
			if (generatedLast_status == /* Multiple matching link tuples, reset the last one for reuse */.IIB_LT_STATUS_SYM) {
				ModernizedCProgram.update_nb_tuple_symmetry(base_entry, matching_lt, now);
			} 
			ModernizedCProgram.reset_link_set_entry(matching_lt, now, val_time);
		}  else if (matches == 1) {
			/* A single matching link tuple, only release the address list */matching_lt.release_link_tuple_addresses();
		} else {
				matching_lt = iib_link_set_entry.add_default_link_set_entry(base_entry, now, /* No single matching link tuple existant, create a new one */val_time);
				if (!matching_lt) {
					return ((Object)/* Insufficient memory */0);
				} 
		} 
		v_time = ModernizedCProgram.timex_from_uint64(val_time * (true));
		l_hold = ModernizedCProgram.timex_from_uint64(((uint64_t)((3 * (true)))) * (true));
		nhdp_addr_entry nhdp_addr_entry = new nhdp_addr_entry();
		matching_lt.setAddress_list_head(nhdp_addr_entry.nhdp_generate_addr_list_from_tmp((/* Set Sending Address List as this tuples address list */true)));
		if (!generatedAddress_list_head) {
			ModernizedCProgram.rem_link_set_entry(base_entry, /* Insufficient memory */matching_lt);
			return ((Object)0);
		} 
		matching_lt.setNb_elt(nb_elt);
		nib_entry generatedNb_elt = matching_lt.getNb_elt();
		 generatedSym_time = matching_lt.getSym_time();
		if (/* Set values dependent on link status */sym) {
			if (generatedLast_status != .IIB_LT_STATUS_SYM) {
				if (generatedNb_elt) {
					generatedNb_elt.nib_set_nb_entry_sym();
				} 
			} 
			matching_lt.setSym_time(ModernizedCProgram.timex_add(now, v_time));
			matching_lt.setLast_status(.IIB_LT_STATUS_SYM);
		}  else if (lost) {
			generatedSym_time.setMicroseconds(0);
			generatedSym_time.setSeconds(0);
			if (generatedLast_status == .IIB_LT_STATUS_SYM) {
				ModernizedCProgram.update_nb_tuple_symmetry(base_entry, matching_lt, now);
			} 
			if (ModernizedCProgram.get_tuple_status(matching_lt, now) == .IIB_LT_STATUS_HEARD) {
				matching_lt.setLast_status(.IIB_LT_STATUS_HEARD);
				matching_lt.setExp_time(ModernizedCProgram.timex_add(now, l_hold));
			} else {
					matching_lt.setLast_status(.IIB_LT_STATUS_UNKNOWN);
			} 
		} 
		matching_lt.setHeard_time(ModernizedCProgram.timex_add(now, v_time).get_max_timex(generatedSym_time));
		Object generatedPending = matching_lt.getPending();
		 generatedExp_time = matching_lt.getExp_time();
		 generatedHeard_time = matching_lt.getHeard_time();
		Object generatedLost = matching_lt.getLost();
		if (generatedPending) {
			matching_lt.setExp_time(generatedExp_time.get_max_timex(generatedHeard_time));
		}  else if (!generatedLost) {
			if ((ModernizedCProgram.timex_cmp(generatedSym_time, now) == 1) || (ModernizedCProgram.timex_cmp(generatedHeard_time, now) == 1)) {
				matching_lt.setExp_time(generatedExp_time.get_max_timex(ModernizedCProgram.timex_add(generatedHeard_time, l_hold)));
			} 
		} 
		return matching_lt/**
		 * Update the status of a link tuple and process necessary changes and execute
		 * necessary changes in the 2-Hop Set and in the Neighbor Information Base
		 * Implements logic of Section 13 of RFC 6130
		 */;
	}
	/**
	 * Add a new Link Tuple with default values to the given Link Set
	 */
	public iib_link_set_entry add_default_link_set_entry(iib_base_entry base_entry,  now, Object val_time) {
		iib_link_set_entry_t new_entry = new iib_link_set_entry_t();
		new_entry = (iib_link_set_entry_t)ModernizedCProgram.malloc(/*Error: Unsupported expression*/);
		if (!new_entry) {
			return ((Object)/* Insufficient memory */0);
		} 
		new_entry.setAddress_list_head(((Object)0));
		ModernizedCProgram.reset_link_set_entry(new_entry, now, val_time);
		iib_link_set_entry generatedLink_set_head = base_entry.getLink_set_head();
		do {
			(new_entry).setNext(generatedLink_set_head);
			base_entry.setLink_set_head(new_entry);
		} while (0);
		return new_entry/**
		 * Reset a given Link Tuple for reusage
		 */;
	}
	public void release_link_tuple_addresses() {
		nhdp_addr_entry generatedAddress_list_head = this.getAddress_list_head();
		generatedAddress_list_head.nhdp_free_addr_list();
		this.setAddress_list_head(((Object)0/**
		 * Update the 2-Hop Set during HELLO message processing
		 */));
	}
	public nhdp_addr_entry getAddress_list_head() {
		return address_list_head;
	}
	public void setAddress_list_head(nhdp_addr_entry newAddress_list_head) {
		address_list_head = newAddress_list_head;
	}
	public  getHeard_time() {
		return heard_time;
	}
	public void setHeard_time( newHeard_time) {
		heard_time = newHeard_time;
	}
	public  getSym_time() {
		return sym_time;
	}
	public void setSym_time( newSym_time) {
		sym_time = newSym_time;
	}
	public Object getPending() {
		return pending;
	}
	public void setPending(Object newPending) {
		pending = newPending;
	}
	public Object getLost() {
		return lost;
	}
	public void setLost(Object newLost) {
		lost = newLost;
	}
	public  getExp_time() {
		return exp_time;
	}
	public void setExp_time( newExp_time) {
		exp_time = newExp_time;
	}
	public nib_entry getNb_elt() {
		return nb_elt;
	}
	public void setNb_elt(nib_entry newNb_elt) {
		nb_elt = newNb_elt;
	}
	public  getLast_status() {
		return last_status;
	}
	public void setLast_status( newLast_status) {
		last_status = newLast_status;
	}
	public Object getMetric_in() {
		return metric_in;
	}
	public void setMetric_in(Object newMetric_in) {
		metric_in = newMetric_in;
	}
	public Object getMetric_out() {
		return metric_out;
	}
	public void setMetric_out(Object newMetric_out) {
		metric_out = newMetric_out;
	}
	public iib_link_set_entry getNext() {
		return next;
	}
	public void setNext(iib_link_set_entry newNext) {
		next = newNext;
	}
}
/**
 * @brief   2-Hop Set entry (2-Hop tuple)
 */
