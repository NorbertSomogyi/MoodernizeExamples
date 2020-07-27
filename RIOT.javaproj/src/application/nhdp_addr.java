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
 * @brief       Centralized address storage interface for NHDP
 *
 * @author      Fabian Nack <nack@inf.fu-berlin.de>
 */
/**
 * @brief   NHDP address representation
 */
/**< Pointer to next address (used in central storage) */
/**< Pointer to NHDP address storage entry */
public class nhdp_addr {
	private Object addr;
	private Object addr_size;
	private Object addr_type;
	private Object usg_count;
	private Object in_tmp_table;
	private Object tmp_metric_val;
	private nhdp_addr next;
	
	public nhdp_addr(Object addr, Object addr_size, Object addr_type, Object usg_count, Object in_tmp_table, Object tmp_metric_val, nhdp_addr next) {
		setAddr(addr);
		setAddr_size(addr_size);
		setAddr_type(addr_type);
		setUsg_count(usg_count);
		setIn_tmp_table(in_tmp_table);
		setTmp_metric_val(tmp_metric_val);
		setNext(next);
	}
	public nhdp_addr() {
	}
	
	public nhdp_addr nhdp_addr_db_get_address(Object addr, Object addr_size, Object addr_type) {
		nhdp_addr_t addr_elt = new nhdp_addr_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_addr_access);
		Object generatedAddr_size = addr_elt.getAddr_size();
		Object generatedAddr_type = addr_elt.getAddr_type();
		Object generatedAddr = addr_elt.getAddr();
		nhdp_addr generatedNext = (addr_elt).getNext();
		for (addr_elt = ModernizedCProgram.nhdp_addr_db_head; addr_elt; addr_elt = generatedNext) {
			if ((generatedAddr_size == addr_size) && (generatedAddr_type == addr_type)) {
				if (/*Error: Function owner not recognized*/memcmp(generatedAddr, addr, addr_size) == 0/* Found a matching entry */) {
					break;
				} 
			} 
		}
		if (!addr_elt) {
			addr_elt = (nhdp_addr_t)ModernizedCProgram.malloc(/*Error: Unsupported expression*//* No matching entry, create a new one */);
			if (!addr_elt) {
				return /* Insufficient memory */NULL;
			} 
			addr_elt.setAddr((uint8_t)ModernizedCProgram.malloc(addr_size * /*Error: Unsupported expression*//* Allocate space for the address */));
			if (!generatedAddr) {
				ModernizedCProgram.free(/* Insufficient memory */addr_elt);
				return NULL;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedAddr, addr, addr_size);
			addr_elt.setAddr_size(addr_size);
			addr_elt.setAddr_type(addr_type);
			addr_elt.setUsg_count(0);
			addr_elt.setIn_tmp_table((true));
			addr_elt.setTmp_metric_val((false));
			do {
				(addr_elt).setNext(ModernizedCProgram.nhdp_addr_db_head);
				ModernizedCProgram.nhdp_addr_db_head = addr_elt;
			} while (0);
		} 
		Object generatedUsg_count = addr_elt.getUsg_count();
		generatedUsg_count++;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_addr_access);
		return addr_elt;
	}
	public void nhdp_decrement_addr_usage() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_addr_access);
		Object generatedUsg_count = this.getUsg_count();
		nhdp_addr generatedNext = _tmp.getNext();
		Object generatedAddr = this.getAddr();
		if (/* Decrement usage count and delete address if no longer used */addr) {
			generatedUsg_count--;
			if (generatedUsg_count == 0) {
				do {
					int _tmp;
					if ((ModernizedCProgram.nhdp_addr_db_head) == (addr)) {
						(ModernizedCProgram.nhdp_addr_db_head) = (ModernizedCProgram.nhdp_addr_db_head).getNext();
					} else {
							_tmp = ModernizedCProgram.nhdp_addr_db_head;
							while (generatedNext && (generatedNext != (addr))) {
								_tmp = generatedNext;
							}
							if (generatedNext) {
								_tmp.setNext((generatedNext));
							} 
					} 
				} while (/* Free address space if address is no longer used */0);
				ModernizedCProgram.free(generatedAddr);
				ModernizedCProgram.free(addr);
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_addr_access);
	}
	public nhdp_addr nhdp_get_addr_db_head() {
		return ModernizedCProgram.nhdp_addr_db_head;
	}
	public int lib_add_if_addr(Object if_pid) {
		lib_entry_t lib_elt = new lib_entry_t();
		nhdp_addr_entry_t addr_elt = new nhdp_addr_entry_t();
		int result = -1;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_lib_access);
		Object generatedIf_pid = lib_elt.getIf_pid();
		nhdp_addr generatedAddress = addr_elt.getAddress();
		nhdp_addr_entry generatedNext = (addr_elt).getNext();
		for (lib_elt = ModernizedCProgram.lib_entry_head; lib_elt; lib_elt = generatedNext) {
			if (generatedIf_pid == if_pid) {
				for (addr_elt = ModernizedCProgram.lib_entry_head.getIf_addr_list_head(); addr_elt; addr_elt = generatedNext) {
					if (generatedAddress == addr) {
						result = /* Address already known for the interface */0;
						break;
					} 
				}
				if (result) {
					result = ModernizedCProgram.add_address_to_if(lib_elt, /* Existing interface entry, but new address */addr);
					break;
				} 
			} 
		}
		if (result) {
			result = /* New interface, create a lib entry */addr.create_if_entry(if_pid);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_lib_access);
		return result;
	}
	public Object lib_is_reg_addr(Object if_pid) {
		lib_entry_t lib_elt = new lib_entry_t();
		nhdp_addr_entry_t addr_elt = new nhdp_addr_entry_t();
		nhdp_addr generatedAddress = addr_elt.getAddress();
		Object generatedIf_pid = lib_elt.getIf_pid();
		nhdp_addr_entry generatedNext = (addr_elt).getNext();
		nhdp_addr_entry generatedIf_addr_list_head = lib_elt.getIf_addr_list_head();
		for (lib_elt = ModernizedCProgram.lib_entry_head; lib_elt; lib_elt = generatedNext) {
			for (addr_elt = generatedIf_addr_list_head; addr_elt; addr_elt = generatedNext) {
				if (generatedAddress == addr) {
					if (generatedIf_pid == if_pid) {
						return /* Given address is assigned to the given IF */1;
					} 
					return /* Given address is assigned to any other IF */2;
				} 
			}
		}
		return 0/*------------------------------------------------------------------------------------*//*                                Internal functions                                  */;
	}
	/* Internal function prototypes */
	/*------------------------------------------------------------------------------------*/
	/**
	 * Create an entry for a newly registered interface
	 */
	public int create_if_entry(Object if_pid) {
		lib_entry_t new_entry = new lib_entry_t();
		new_entry = (lib_entry_t)ModernizedCProgram.malloc(/*Error: Unsupported expression*/);
		if (!new_entry) {
			return -/* Insufficient memory */1;
		} 
		new_entry.setIf_addr_list_head(NULL);
		new_entry.setIf_pid(if_pid);
		if (ModernizedCProgram.add_address_to_if(new_entry, addr)) {
			ModernizedCProgram.free(/* Insufficient memory */new_entry);
			return -1;
		} 
		do {
			(new_entry).setNext(ModernizedCProgram.lib_entry_head);
			ModernizedCProgram.lib_entry_head = new_entry;
		} while (0);
		return 0/**
		 * Add another address to an interface entry
		 */;
	}
	public rfc5444_result check_addr_validity() {
		if (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LOCAL_IF].getRfc5444_reader_tlvblock_consumer_entry()) {
			if (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_STATUS].getRfc5444_reader_tlvblock_consumer_entry() || ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_OTHER_NEIGHB].getRfc5444_reader_tlvblock_consumer_entry()) {
				return /* Conflicting tlv types for the address */RFC5444_DROP_MESSAGE;
			}  else if (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LOCAL_IF].getRfc5444_reader_tlvblock_consumer_entry().getNext_entry()) {
				return /* Multiple tlvs of the same type are not allowed */RFC5444_DROP_MESSAGE;
			}  else if (addr.lib_is_reg_addr(ModernizedCProgram.if_pid)) {
				return /* Address of one of neighbor's IFs equals one of ours */RFC5444_DROP_MESSAGE;
			} 
		}  else if (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_STATUS].getRfc5444_reader_tlvblock_consumer_entry() && ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_STATUS].getRfc5444_reader_tlvblock_consumer_entry().getNext_entry()) {
			return /* Multiple tlvs of the same type are not allowed */RFC5444_DROP_MESSAGE;
		}  else if (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_OTHER_NEIGHB].getRfc5444_reader_tlvblock_consumer_entry() && ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_OTHER_NEIGHB].getRfc5444_reader_tlvblock_consumer_entry().getNext_entry()) {
			return /* Multiple tlvs of the same type are not allowed */RFC5444_DROP_MESSAGE;
		} 
		return RFC5444_OKAY/**
		 * Get a new or existing NHDP address entry from the centralized address storage
		 * for the given address data
		 */;
	}
	public nhdp_addr get_nhdp_db_addr(Object addr, Object prefix) {
		nhdp_addr nhdp_addr = new nhdp_addr();
		switch (prefix) {
		case 8:
				return nhdp_addr.nhdp_addr_db_get_address(addr, 1, nhdp_address_type_t.AF_CC110X);
		case 32:
				return nhdp_addr.nhdp_addr_db_get_address(addr, 4, AF_INET);
		default:
				if (prefix < 32) {
					return nhdp_addr.nhdp_addr_db_get_address(addr, 4, AF_INET);
				} else {
						return nhdp_addr.nhdp_addr_db_get_address(addr, 16, AF_INET6);
				} 
		}
	}
	/**
	 * Add a metric value to the address if a corresponding TLV exists in the message
	 */
	public void add_temp_metric_value() {
		if (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_METRIC].getRfc5444_reader_tlvblock_consumer_entry()) {
			uint16_t metric_enc = ((uint16_t)ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_METRIC].getRfc5444_reader_tlvblock_consumer_entry().getSingle_value());
			if (metric_enc & ((true) | (true))) {
				this.setTmp_metric_val(metric_enc);
			} 
		} 
	}
	public void netaddr_from_nhdp_address(Object target) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(target.get_addr(), 0, NETADDR_MAX_LENGTH);
		Object generatedAddr = this.getAddr();
		Object generatedAddr_size = this.getAddr_size();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(target.get_addr(), generatedAddr, generatedAddr_size);
		Object generatedAddr_type = this.getAddr_type();
		switch (generatedAddr_type) {
		case AF_INET6/* Fall-through */:
		case AF_INET:
				target.set_prefix_len(-1024);
				target.set_type(AF_INET);
				break;
		case nhdp_address_type_t.AF_CC110X:
				target.set_prefix_len(-1024);
				target.set_type(nhdp_address_type_t.AF_CC110X);
				break;
		default:
				target.set_prefix_len(-1024);
				target.set_type(AF_INET6);
				break;
		}
	}
	public Object getAddr() {
		return addr;
	}
	public void setAddr(Object newAddr) {
		addr = newAddr;
	}
	public Object getAddr_size() {
		return addr_size;
	}
	public void setAddr_size(Object newAddr_size) {
		addr_size = newAddr_size;
	}
	public Object getAddr_type() {
		return addr_type;
	}
	public void setAddr_type(Object newAddr_type) {
		addr_type = newAddr_type;
	}
	public Object getUsg_count() {
		return usg_count;
	}
	public void setUsg_count(Object newUsg_count) {
		usg_count = newUsg_count;
	}
	public Object getIn_tmp_table() {
		return in_tmp_table;
	}
	public void setIn_tmp_table(Object newIn_tmp_table) {
		in_tmp_table = newIn_tmp_table;
	}
	public Object getTmp_metric_val() {
		return tmp_metric_val;
	}
	public void setTmp_metric_val(Object newTmp_metric_val) {
		tmp_metric_val = newTmp_metric_val;
	}
	public nhdp_addr getNext() {
		return next;
	}
	public void setNext(nhdp_addr newNext) {
		next = newNext;
	}
}
/**
 * @brief   Container for NHDP address storage in a list
 */
