package application;

public class prio_queue {
	private Object compare;
	private int insertion_ctr;
	private Object cb_data;
	private int alloc;
	private int nr;
	private prio_queue_entry[] array;
	
	public prio_queue(Object compare, int insertion_ctr, Object cb_data, int alloc, int nr, prio_queue_entry[] array) {
		setCompare(compare);
		setInsertion_ctr(insertion_ctr);
		setCb_data(cb_data);
		setAlloc(alloc);
		setNr(nr);
		setArray(array);
	}
	public prio_queue() {
	}
	
	public int queue_has_nonstale() {
		int i;
		int generatedNr = this.getNr();
		prio_queue_entry[] generatedArray = this.getArray();
		object generatedObject = commit.getObject();
		int generatedFlags = generatedObject.getFlags();
		for (i = 0; i < generatedNr; i++) {
			commit commit = generatedArray[i].getData();
			if (!(generatedFlags & (-1024 << 18))) {
				return 1;
			} 
		}
		return 0;
	}
	public int compare(int i, int j) {
		prio_queue_entry[] generatedArray = this.getArray();
		Object generatedCb_data = this.getCb_data();
		int cmp = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedArray[i].getData(), generatedArray[j].getData(), generatedCb_data);
		if (!cmp) {
			cmp = generatedArray[i].getCtr() - generatedArray[j].getCtr();
		} 
		return cmp;
		entry a = a_;
		entry b = b_;
		return /*Error: Function owner not recognized*/compare_commits_by_commit_date(a.getCommit(), b.getCommit(), ((Object)0));
	}
	public void swap(int i, int j) {
		prio_queue_entry[] generatedArray = this.getArray();
		do {
			Object _swap_a_ptr = (generatedArray[i]);
			Object _swap_b_ptr = (generatedArray[j]);
			byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
		} while (0);
	}
	public void prio_queue_reverse() {
		int i;
		int j;
		Object generatedCompare = this.getCompare();
		if (generatedCompare != ((Object)0)) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\prio-queue.c", 23, "prio_queue_reverse() on non-LIFO queue");
		} 
		int generatedNr = this.getNr();
		for (i = 0; i < (j = (generatedNr - 1) - i); i++) {
			queue.swap(i, j);
		}
	}
	public void clear_prio_queue() {
		prio_queue_entry[] generatedArray = this.getArray();
		do {
			ModernizedCProgram.free(generatedArray);
			(generatedArray) = ((Object)0);
		} while (0);
		this.setNr(0);
		this.setAlloc(0);
		this.setInsertion_ctr(0);
	}
	public void prio_queue_put(Object thing) {
		int ix;
		int parent;
		int generatedNr = this.getNr();
		int generatedAlloc = this.getAlloc();
		prio_queue_entry[] generatedArray = this.getArray();
		do {
			if ((generatedNr + 1) > generatedAlloc) {
				if ((((generatedAlloc) + 16) * 3 / 2) < (generatedNr + 1)) {
					this.setAlloc((generatedNr + 1));
				} else {
						this.setAlloc((((generatedAlloc) + 16) * 3 / 2));
				} 
				(generatedArray) = ModernizedCProgram.xrealloc((generatedArray), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedAlloc)));
			} 
		} while (/* Append at the end */0);
		int generatedInsertion_ctr = this.getInsertion_ctr();
		generatedArray[generatedNr].setCtr(generatedInsertion_ctr++);
		generatedArray[generatedNr].setData(thing);
		generatedNr++;
		Object generatedCompare = this.getCompare();
		if (!generatedCompare) {
			return /*Error: Unsupported expression*/;
		} 
		for (ix = generatedNr - 1; ix; ix = /* Bubble up the new one */parent) {
			parent = (ix - 1) / 2;
			if (queue.compare(parent, ix) <= 0) {
				break;
			} 
			queue.swap(parent, ix);
		}
	}
	public Object prio_queue_get() {
		Object result;
		int ix;
		int child;
		int generatedNr = this.getNr();
		if (!generatedNr) {
			return ((Object)0);
		} 
		Object generatedCompare = this.getCompare();
		prio_queue_entry[] generatedArray = this.getArray();
		if (!generatedCompare) {
			return generatedArray[--generatedNr].getData();
		} 
		result = generatedArray[0].getData();
		if (!--generatedNr) {
			return result;
		} 
		generatedArray[0] = generatedArray[generatedNr];
		for (ix = 0; ix * 2 + 1 < generatedNr; ix = /* Push down the one at the root */child) {
			child = ix * 2 + /* left */1;
			if (child + 1 < generatedNr && queue.compare(child, child + 1) >= 0) {
				/* use right child */child++;
			} 
			if (queue.compare(ix, child) <= 0) {
				break;
			} 
			queue.swap(child, ix);
		}
		return result;
	}
	public Object prio_queue_peek() {
		int generatedNr = this.getNr();
		if (!generatedNr) {
			return ((Object)0);
		} 
		Object generatedCompare = this.getCompare();
		prio_queue_entry[] generatedArray = this.getArray();
		if (!generatedCompare) {
			return generatedArray[generatedNr - 1].getData();
		} 
		return generatedArray[0].getData();
	}
	public Object getCompare() {
		return compare;
	}
	public void setCompare(Object newCompare) {
		compare = newCompare;
	}
	public int getInsertion_ctr() {
		return insertion_ctr;
	}
	public void setInsertion_ctr(int newInsertion_ctr) {
		insertion_ctr = newInsertion_ctr;
	}
	public Object getCb_data() {
		return cb_data;
	}
	public void setCb_data(Object newCb_data) {
		cb_data = newCb_data;
	}
	public int getAlloc() {
		return alloc;
	}
	public void setAlloc(int newAlloc) {
		alloc = newAlloc;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int newNr) {
		nr = newNr;
	}
	public prio_queue_entry[] getArray() {
		return array;
	}
	public void setArray(prio_queue_entry[] newArray) {
		array = newArray;
	}
}
