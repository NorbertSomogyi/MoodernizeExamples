package application;

public class promisor_remote {
	private promisor_remote next;
	private Object partial_clone_filter;
	private Object name;
	
	public promisor_remote(promisor_remote next, Object partial_clone_filter, Object name) {
		setNext(next);
		setPartial_clone_filter(partial_clone_filter);
		setName(name);
	}
	public promisor_remote() {
	}
	
	public promisor_remote promisor_remote_new(Object remote_name) {
		promisor_remote r = new promisor_remote();
		if (remote_name == (byte)'/') {
			ModernizedCProgram.warning(ModernizedCProgram._("promisor remote name cannot begin with '/': %s"), remote_name);
			return ((Object)0);
		} 
		Object generatedName = ((r)).getName();
		do {
			size_t flex_array_len_ = (.strlen(remote_name));
			((r)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((), (flex_array_len_)), (true)));
			.memcpy((Object)generatedName, ((remote_name)), flex_array_len_);
		} while (0);
		ModernizedCProgram.promisors_tail = r;
		promisor_remote generatedNext = r.getNext();
		ModernizedCProgram.promisors_tail = generatedNext;
		return r;
	}
	public promisor_remote promisor_remote_lookup(Object remote_name) {
		promisor_remote r = new promisor_remote();
		promisor_remote p = new promisor_remote();
		Object generatedName = r.getName();
		for (; r; ) {
			if (!.strcmp(generatedName, remote_name)) {
				if (previous) {
					previous = p;
				} 
				return r;
			} 
		}
		return ((Object)0);
	}
	public void promisor_remote_move_to_tail(promisor_remote previous) {
		promisor_remote generatedNext = this.getNext();
		if (generatedNext == ((Object)0)) {
			return ;
		} 
		if (previous) {
			previous.setNext(generatedNext);
		} else {
				ModernizedCProgram.promisors = generatedNext ? generatedNext : r;
		} 
		this.setNext(((Object)0));
		ModernizedCProgram.promisors_tail = r;
		ModernizedCProgram.promisors_tail = generatedNext;
	}
	public promisor_remote promisor_remote_find(Object remote_name) {
		ModernizedCProgram.promisor_remote_init();
		if (!remote_name) {
			return ModernizedCProgram.promisors;
		} 
		return ((Object)0).promisor_remote_lookup(remote_name);
	}
	public promisor_remote getNext() {
		return next;
	}
	public void setNext(promisor_remote newNext) {
		next = newNext;
	}
	public Object getPartial_clone_filter() {
		return partial_clone_filter;
	}
	public void setPartial_clone_filter(Object newPartial_clone_filter) {
		partial_clone_filter = newPartial_clone_filter;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
