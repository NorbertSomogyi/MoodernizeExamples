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
 * @brief       Neighbor Information Base interface for NHDP
 *
 * @author      Fabian Nack <nack@inf.fu-berlin.de>
 */
/**
 * @brief   Neighbor Set entry (neighbor tuple)
 */
/**< Pointer to next list entry */
public class nib_entry {
	private nhdp_addr_entry address_list_head;
	private Object symmetric;
	private Object metric_in;
	private Object metric_out;
	private nib_entry next;
	
	public nib_entry(nhdp_addr_entry address_list_head, Object symmetric, Object metric_in, Object metric_out, nib_entry next) {
		setAddress_list_head(address_list_head);
		setSymmetric(symmetric);
		setMetric_in(metric_in);
		setMetric_out(metric_out);
		setNext(next);
	}
	public nib_entry() {
	}
	
	public void iib_propagate_nb_entry_change(nib_entry new_entry) {
		iib_base_entry_t base_elt = new iib_base_entry_t();
		iib_link_set_entry_t ls_elt = new iib_link_set_entry_t();
		nib_entry generatedNb_elt = ls_elt.getNb_elt();
		iib_link_set_entry generatedNext = (ls_elt).getNext();
		iib_link_set_entry generatedLink_set_head = base_elt.getLink_set_head();
		for (base_elt = ModernizedCProgram.iib_base_entry_head; base_elt; base_elt = generatedNext) {
			for (ls_elt = generatedLink_set_head; ls_elt; ls_elt = generatedNext) {
				if (generatedNb_elt == old_entry) {
					ls_elt.setNb_elt(new_entry);
				} 
			}
		}
	}
	public nib_entry nib_process_hello() {
		nib_entry_t nb_match = NULL;
		nib_entry_t nib_elt = new nib_entry_t();
		nib_entry_t nib_tmp = new nib_entry_t();
		timex_t now = new timex_t();
		uint8_t matches = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_nib_access);
		now.xtimer_now_timex();
		nhdp_addr generatedAddress = list_elt.getAddress();
		Object generatedIn_tmp_table = generatedAddress.getIn_tmp_table();
		nhdp_addr_entry generatedNext = (list_elt).getNext();
		nhdp_addr_entry generatedAddress_list_head = nib_elt.getAddress_list_head();
		for ((nib_elt) = (ModernizedCProgram.nib_entry_head); (nib_elt) && (); (nib_elt) = nib_tmp) {
			nhdp_addr_entry_t list_elt = new nhdp_addr_entry_t();
			for (list_elt = generatedAddress_list_head; list_elt; list_elt = generatedNext) {
				if (((generatedIn_tmp_table & -1024) >> 5)) {
					/* Matching neighbor tuple */matches++;
					if (matches > 1) {
						nb_match.iib_propagate_nb_entry_change(/* Multiple matching nb tuples, delete the previous one */nib_elt);
						ModernizedCProgram.rem_nib_entry(nb_match, now);
					} 
					nb_match = nib_elt;
					break;
				} 
			}
		}
		nhdp_addr_entry nhdp_addr_entry = new nhdp_addr_entry();
		nib_entry nib_entry = new nib_entry();
		if (matches > /* Add or update nb tuple */0) {
			ModernizedCProgram.clear_nb_addresses(nb_match, /* We found matching nb tuples, reuse the last one */now);
			if (matches > 1) {
				nb_match.setSymmetric(0);
			} 
			nb_match.setAddress_list_head(nhdp_addr_entry.nhdp_generate_addr_list_from_tmp((true)));
			if (!generatedAddress_list_head) {
				do {
					int _tmp;
					if ((ModernizedCProgram.nib_entry_head) == (nb_match)) {
						(ModernizedCProgram.nib_entry_head) = generatedNext;
					} else {
							_tmp = ModernizedCProgram.nib_entry_head;
							while (generatedNext && (generatedNext != (nb_match))) {
								_tmp = generatedNext;
							}
							if (generatedNext) {
								_tmp.setNext((generatedNext));
							} 
					} 
				} while (/* Insufficient memory */0);
				ModernizedCProgram.free(nb_match);
				nb_match = NULL;
			} 
		} else {
				nb_match = nib_entry.add_nib_entry_for_nb_addr_list();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_nib_access);
		return nb_match;
	}
	public void nib_rem_nb_entry() {
		nhdp_addr_entry generatedAddress_list_head = this.getAddress_list_head();
		generatedAddress_list_head.nhdp_free_addr_list();
		nib_entry generatedNext = _tmp.getNext();
		do {
			int _tmp;
			if ((ModernizedCProgram.nib_entry_head) == (nib_entry)) {
				(ModernizedCProgram.nib_entry_head) = (ModernizedCProgram.nib_entry_head).getNext();
			} else {
					_tmp = ModernizedCProgram.nib_entry_head;
					while (generatedNext && (generatedNext != (nib_entry))) {
						_tmp = generatedNext;
					}
					if (generatedNext) {
						_tmp.setNext((generatedNext));
					} 
			} 
		} while (0);
		ModernizedCProgram.free(nib_entry);
	}
	public void nib_set_nb_entry_sym() {
		nib_lost_address_entry_t ln_elt = new nib_lost_address_entry_t();
		nib_lost_address_entry_t ln_tmp = new nib_lost_address_entry_t();
		nhdp_addr_entry_t nb_elt = new nhdp_addr_entry_t();
		this.setSymmetric(1);
		nhdp_addr generatedAddress = ln_elt.getAddress();
		nhdp_addr_entry generatedNext = (nb_elt).getNext();
		nhdp_addr_entry generatedAddress_list_head = this.getAddress_list_head();
		for (nb_elt = generatedAddress_list_head; nb_elt; nb_elt = generatedNext) {
			for ((ln_elt) = (ModernizedCProgram.nib_lost_address_entry_head); (ln_elt) && (); (ln_elt) = ln_tmp) {
				if (generatedAddress == generatedAddress) {
					ln_elt.rem_ln_entry();
					break;
				} 
			}
		}
	}
	/* Internal function prototypes */
	/*                                Internal functions                                  */
	/*------------------------------------------------------------------------------------*/
	/**
	 * Add a Neighbor Tuple for the neighbor address list
	 */
	public nib_entry add_nib_entry_for_nb_addr_list() {
		nib_entry_t new_elem = new nib_entry_t();
		new_elem = ModernizedCProgram.malloc(/*Error: Unsupported expression*/);
		if (!new_elem) {
			return /* Insufficient memory */NULL;
		} 
		nhdp_addr_entry nhdp_addr_entry = new nhdp_addr_entry();
		new_elem.setAddress_list_head(nhdp_addr_entry.nhdp_generate_addr_list_from_tmp((/* Copy neighbor address list to new neighbor tuple */true)));
		nhdp_addr_entry generatedAddress_list_head = new_elem.getAddress_list_head();
		if (!generatedAddress_list_head) {
			ModernizedCProgram.free(/* Insufficient memory */new_elem);
			return NULL;
		} 
		new_elem.setSymmetric(0);
		new_elem.setMetric_in((false));
		new_elem.setMetric_out((false));
		do {
			(new_elem).setNext(ModernizedCProgram.nib_entry_head);
			ModernizedCProgram.nib_entry_head = new_elem;
		} while (0);
		return new_elem/**
		 * Remove a given Neighbor Tuple
		 */;
	}
	public nhdp_addr_entry getAddress_list_head() {
		return address_list_head;
	}
	public void setAddress_list_head(nhdp_addr_entry newAddress_list_head) {
		address_list_head = newAddress_list_head;
	}
	public Object getSymmetric() {
		return symmetric;
	}
	public void setSymmetric(Object newSymmetric) {
		symmetric = newSymmetric;
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
	public nib_entry getNext() {
		return next;
	}
	public void setNext(nib_entry newNext) {
		next = newNext;
	}
}
/**
 * @brief   Lost Neighbor Set entry (lost neighbor tuple, lnt)
 */
