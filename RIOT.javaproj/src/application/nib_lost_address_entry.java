package application;

/**< Pointer to next list entry */
public class nib_lost_address_entry {
	private nhdp_addr address;
	private  expiration_time;
	private nib_lost_address_entry next;
	
	public nib_lost_address_entry(nhdp_addr address,  expiration_time, nib_lost_address_entry next) {
		setAddress(address);
		setExpiration_time(expiration_time);
		setNext(next);
	}
	public nib_lost_address_entry() {
	}
	
	public void rem_ln_entry() {
		nhdp_addr generatedAddress = this.getAddress();
		generatedAddress.nhdp_decrement_addr_usage();
		nib_lost_address_entry generatedNext = _tmp.getNext();
		do {
			int _tmp;
			if ((ModernizedCProgram.nib_lost_address_entry_head) == (ln_entry)) {
				(ModernizedCProgram.nib_lost_address_entry_head) = (ModernizedCProgram.nib_lost_address_entry_head).getNext();
			} else {
					_tmp = ModernizedCProgram.nib_lost_address_entry_head;
					while (generatedNext && (generatedNext != (ln_entry))) {
						_tmp = generatedNext;
					}
					if (generatedNext) {
						_tmp.setNext((generatedNext));
					} 
			} 
		} while (0);
		ModernizedCProgram.free(ln_entry);
	}
	/*---------------------------------------------------------------------------*
	 *                       Neighbor Information Base API                       *
	 *---------------------------------------------------------------------------*/
	public nhdp_addr getAddress() {
		return address;
	}
	public void setAddress(nhdp_addr newAddress) {
		address = newAddress;
	}
	public  getExpiration_time() {
		return expiration_time;
	}
	public void setExpiration_time( newExpiration_time) {
		expiration_time = newExpiration_time;
	}
	public nib_lost_address_entry getNext() {
		return next;
	}
	public void setNext(nib_lost_address_entry newNext) {
		next = newNext;
	}
}
/**
 * @brief                   Process a received HELLO message in the NIB
 *
 * @note
 * Must not be called from outside the NHDP reader's message processing.
 *
 * @return                  Pointer to the new Neighbor Tuple
 * @return                  NULL on error
 */
