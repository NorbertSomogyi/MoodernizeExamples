package application;

// combine with syntax highlight
// Sign group
public class signgroup_S {
	private int next_sign_id;
	private Object refcount;
	private Object sg_name;
	
	public signgroup_S(int next_sign_id, Object refcount, Object sg_name) {
		setNext_sign_id(next_sign_id);
		setRefcount(refcount);
		setSg_name(sg_name);
	}
	public signgroup_S() {
	}
	
	public signgroup_S sign_group_ref(Object groupname) {
		hash_T hash = new hash_T();
		hashitem_T hi = new hashitem_T();
		signgroup_T group = new signgroup_T();
		hash = ModernizedCProgram.hash_hash(groupname);
		hashitem_S hashitem_S = new hashitem_S();
		hi = hashitem_S.hash_lookup(ModernizedCProgram.sg_table, groupname, hash);
		Object generatedHi_key = (hi).getHi_key();
		Object generatedSg_name = group.getSg_name();
		Object generatedRefcount = group.getRefcount();
		if ((generatedHi_key == ((Object)0) || generatedHi_key == ModernizedCProgram.hash_removed)) {
			group = ModernizedCProgram.alloc(((size_t)((signgroup_T)0).getSg_name()) + /*Error: Function owner not recognized*/strlen((byte)(groupname)) + 1);
			if (group == ((Object)0)) {
				return ((Object)0);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy((byte)(generatedSg_name), (byte)(groupname));
			group.setRefcount(1);
			group.setNext_sign_id(1);
			ModernizedCProgram.hash_add_item(ModernizedCProgram.sg_table, hi, generatedSg_name, hash);
		} else {
				group = ((signgroup_T)(generatedHi_key - ((size_t)generatedSg_name)));
				generatedRefcount++;
		} 
		return group/*
		 * A sign in group 'groupname' is removed. If all the signs in this group are
		 * removed, then remove the group.
		 */;
	}
	public int getNext_sign_id() {
		return next_sign_id;
	}
	public void setNext_sign_id(int newNext_sign_id) {
		next_sign_id = newNext_sign_id;
	}
	public Object getRefcount() {
		return refcount;
	}
	public void setRefcount(Object newRefcount) {
		refcount = newRefcount;
	}
	public Object getSg_name() {
		return sg_name;
	}
	public void setSg_name(Object newSg_name) {
		sg_name = newSg_name;
	}
}
