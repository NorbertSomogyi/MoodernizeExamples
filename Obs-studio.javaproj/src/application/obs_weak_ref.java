package application;

/* ref-counting  */
public class obs_weak_ref {
	private Object refs;
	private Object weak_refs;
	
	public obs_weak_ref(Object refs, Object weak_refs) {
		setRefs(refs);
		setWeak_refs(weak_refs);
	}
	public obs_weak_ref() {
	}
	
	public void obs_ref_addref() {
		Object generatedRefs = this.getRefs();
		ModernizedCProgram.os_atomic_inc_long(generatedRefs);
	}
	public Object obs_ref_release() {
		Object generatedRefs = this.getRefs();
		return ModernizedCProgram.os_atomic_dec_long(generatedRefs) == -1;
	}
	public void obs_weak_ref_addref() {
		Object generatedWeak_refs = this.getWeak_refs();
		ModernizedCProgram.os_atomic_inc_long(generatedWeak_refs);
	}
	public Object obs_weak_ref_release() {
		Object generatedWeak_refs = this.getWeak_refs();
		return ModernizedCProgram.os_atomic_dec_long(generatedWeak_refs) == -1;
	}
	public Object obs_weak_ref_get_ref() {
		Object generatedRefs = this.getRefs();
		long owners = generatedRefs;
		while (owners > -1) {
			if (ModernizedCProgram.os_atomic_compare_swap_long(generatedRefs, owners, owners + 1)) {
				return true;
			} 
			owners = generatedRefs;
		}
		return false/* ------------------------------------------------------------------------- */;
	}
	public Object getRefs() {
		return refs;
	}
	public void setRefs(Object newRefs) {
		refs = newRefs;
	}
	public Object getWeak_refs() {
		return weak_refs;
	}
	public void setWeak_refs(Object newWeak_refs) {
		weak_refs = newWeak_refs;
	}
}
