package application;

//(16384)
// NOT sure that this work on ALL platform
/* 46 */
public class linkedlist_datablock_internal_s {
	private linkedlist_datablock_internal_s next_datablock;
	private Object avail_in_this_block;
	private Object filled_in_this_block;
	private Object unused;
	private Object data;
	
	public linkedlist_datablock_internal_s(linkedlist_datablock_internal_s next_datablock, Object avail_in_this_block, Object filled_in_this_block, Object unused, Object data) {
		setNext_datablock(next_datablock);
		setAvail_in_this_block(avail_in_this_block);
		setFilled_in_this_block(filled_in_this_block);
		setUnused(unused);
		setData(data);
	}
	public linkedlist_datablock_internal_s() {
	}
	
	public linkedlist_datablock_internal_s allocate_new_datablock() {
		linkedlist_datablock_internal ldi = new linkedlist_datablock_internal();
		ldi = (linkedlist_datablock_internal)(/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/));
		if (ldi != ((Object)0)) {
			ldi.setNext_datablock(((Object)0));
			ldi.setFilled_in_this_block(0);
			ldi.setAvail_in_this_block((4096 - (4 * 4)));
		} 
		return ldi;
	}
	public void free_datablock() {
		linkedlist_datablock_internal_s generatedNext_datablock = this.getNext_datablock();
		while (ldi != ((Object)0)) {
			linkedlist_datablock_internal ldinext = generatedNext_datablock;
			{ 
				if (ldi) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ldi);
				} 
			}
			;
			ldi = ldinext;
		}
	}
	public linkedlist_datablock_internal_s getNext_datablock() {
		return next_datablock;
	}
	public void setNext_datablock(linkedlist_datablock_internal_s newNext_datablock) {
		next_datablock = newNext_datablock;
	}
	public Object getAvail_in_this_block() {
		return avail_in_this_block;
	}
	public void setAvail_in_this_block(Object newAvail_in_this_block) {
		avail_in_this_block = newAvail_in_this_block;
	}
	public Object getFilled_in_this_block() {
		return filled_in_this_block;
	}
	public void setFilled_in_this_block(Object newFilled_in_this_block) {
		filled_in_this_block = newFilled_in_this_block;
	}
	public Object getUnused() {
		return unused;
	}
	public void setUnused(Object newUnused) {
		unused = newUnused;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
