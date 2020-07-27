package application;

/**< Pointer to the next address list element */
public class nhdp_addr_entry {
	private nhdp_addr address;
	private nhdp_addr_entry next;
	
	public nhdp_addr_entry(nhdp_addr address, nhdp_addr_entry next) {
		setAddress(address);
		setNext(next);
	}
	public nhdp_addr_entry() {
	}
	
	public void nhdp_free_addr_list() {
		nhdp_addr_entry_t list_elt = new nhdp_addr_entry_t();
		nhdp_addr_entry_t list_tmp = new nhdp_addr_entry_t();
		for ((list_elt) = (list_head); (list_elt) && (); (list_elt) = list_tmp) {
			list_elt.nhdp_free_addr_entry();
		}
	}
	public void nhdp_free_addr_entry() {
		nhdp_addr generatedAddress = this.getAddress();
		generatedAddress.nhdp_decrement_addr_usage();
		ModernizedCProgram.free(addr_entry);
	}
	public nhdp_addr_entry nhdp_generate_addr_list_from_tmp(Object tmp_type) {
		nhdp_addr_entry_t new_list_head = new nhdp_addr_entry_t();
		nhdp_addr_t addr_elt = new nhdp_addr_t();
		new_list_head = NULL;
		Object generatedIn_tmp_table = addr_elt.getIn_tmp_table();
		Object generatedUsg_count = addr_elt.getUsg_count();
		nhdp_addr generatedNext = (addr_elt).getNext();
		for (addr_elt = ModernizedCProgram.nhdp_addr_db_head; addr_elt; addr_elt = generatedNext) {
			if (generatedIn_tmp_table & tmp_type) {
				nhdp_addr_entry_t new_entry = (nhdp_addr_entry_t)ModernizedCProgram.malloc(/*Error: Unsupported expression*/);
				if (!new_entry) {
					/* Insufficient memory, free all previously allocated memory */new_list_head.nhdp_free_addr_list();
					return NULL;
				} 
				new_entry.setAddress(addr_elt);
				generatedUsg_count++;
				do {
					(new_entry).setNext(new_list_head);
					new_list_head = new_entry;
				} while (0);
			} 
		}
		return new_list_head;
	}
	public nhdp_addr getAddress() {
		return address;
	}
	public void setAddress(nhdp_addr newAddress) {
		address = newAddress;
	}
	public nhdp_addr_entry getNext() {
		return next;
	}
	public void setNext(nhdp_addr_entry newNext) {
		next = newNext;
	}
}
/**
 * @name    NHDP address temp usage helper macros
 *
 * @{
 */
