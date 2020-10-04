package application;

public class linkedlist_data_s {
	private linkedlist_datablock_internal_s first_block;
	private linkedlist_datablock_internal_s last_block;
	
	public linkedlist_data_s(linkedlist_datablock_internal_s first_block, linkedlist_datablock_internal_s last_block) {
		setFirst_block(first_block);
		setLast_block(last_block);
	}
	public linkedlist_data_s() {
	}
	
	public void init_linkedlist() {
		this.setFirst_block(this.setLast_block((null)));
	}
	public void free_linkedlist() {
		linkedlist_datablock_internal_s generatedFirst_block = this.getFirst_block();
		generatedFirst_block.free_datablock();
		this.setFirst_block(this.setLast_block((null)));
	}
	public int add_data_in_datablock(Object buf, Object len) {
		linkedlist_datablock_internal ldi = new linkedlist_datablock_internal();
		Byte from_copy;
		if (ll == (null)) {
			return (true);
		} 
		linkedlist_datablock_internal_s generatedLast_block = this.getLast_block();
		linkedlist_datablock_internal_s linkedlist_datablock_internal_s = new linkedlist_datablock_internal_s();
		linkedlist_datablock_internal_s generatedFirst_block = this.getFirst_block();
		if (generatedLast_block == (null)) {
			this.setFirst_block(this.setLast_block(linkedlist_datablock_internal_s.allocate_new_datablock()));
			if (generatedFirst_block == (null)) {
				return (true);
			} 
		} 
		ldi = generatedLast_block;
		from_copy = (byte)buf;
		Object generatedAvail_in_this_block = ldi.getAvail_in_this_block();
		linkedlist_datablock_internal_s generatedNext_datablock = ldi.getNext_datablock();
		Object[] generatedData = ldi.getData();
		Object generatedFilled_in_this_block = ldi.getFilled_in_this_block();
		while (len > 0) {
			uInt copy_this = new uInt();
			uInt i = new uInt();
			Byte to_copy;
			if (generatedAvail_in_this_block == 0) {
				ldi.setNext_datablock(linkedlist_datablock_internal_s.allocate_new_datablock());
				if (generatedNext_datablock == (null)) {
					return (true);
				} 
				ldi = generatedNext_datablock;
				this.setLast_block(ldi);
			} 
			if (generatedAvail_in_this_block < len) {
				copy_this = (uInt)generatedAvail_in_this_block;
			} else {
					copy_this = (uInt)len;
			} 
			to_copy = (generatedData[generatedFilled_in_this_block]);
			for (i = 0; i < copy_this; i++) {
				(to_copy + i) = (from_copy + i);
			}
			generatedFilled_in_this_block += copy_this;
			generatedAvail_in_this_block -= copy_this;
			from_copy += copy_this;
			len -= copy_this;
		}
		return (false/****************************************************************************/);
	}
	public linkedlist_datablock_internal_s getFirst_block() {
		return first_block;
	}
	public void setFirst_block(linkedlist_datablock_internal_s newFirst_block) {
		first_block = newFirst_block;
	}
	public linkedlist_datablock_internal_s getLast_block() {
		return last_block;
	}
	public void setLast_block(linkedlist_datablock_internal_s newLast_block) {
		last_block = newLast_block;
	}
}
