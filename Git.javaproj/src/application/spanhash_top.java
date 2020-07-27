package application;

public class spanhash_top {
	private int alloc_log2;
	private int free;
	private Object data;
	
	public spanhash_top(int alloc_log2, int free, Object data) {
		setAlloc_log2(alloc_log2);
		setFree(free);
		setData(data);
	}
	public spanhash_top() {
	}
	
	public spanhash_top spanhash_rehash() {
		spanhash_top new_spanhash = new spanhash_top();
		int i;
		int generatedAlloc_log2 = this.getAlloc_log2();
		int osz = 1 << generatedAlloc_log2;
		int sz = osz << 1;
		new_spanhash = ModernizedCProgram.xmalloc(ModernizedCProgram.st_add(/*Error: sizeof expression not supported yet*/, ModernizedCProgram.st_mult(/*Error: Unsupported expression*/, sz)));
		new_spanhash.setAlloc_log2(generatedAlloc_log2 + 1);
		new_spanhash.setFree(((1 << (generatedAlloc_log2)) * (generatedAlloc_log2 - 3) / (generatedAlloc_log2)));
		Object generatedData = new_spanhash.getData();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedData, 0, /*Error: Unsupported expression*/ * sz);
		int generatedCnt = o.getCnt();
		int generatedHashval = o.getHashval();
		int generatedFree = new_spanhash.getFree();
		for (i = 0; i < osz; i++) {
			spanhash o = (generatedData[i]);
			int bucket;
			if (!generatedCnt) {
				continue;
			} 
			bucket = generatedHashval & (sz - 1);
			while (1) {
				spanhash h = (generatedData[bucket++]);
				if (!generatedCnt) {
					h.setHashval(generatedHashval);
					h.setCnt(generatedCnt);
					generatedFree--;
					break;
				} 
				if (sz <= bucket) {
					bucket = 0;
				} 
			}
		}
		ModernizedCProgram.free(orig);
		return new_spanhash;
	}
	public spanhash_top add_spanhash(int hashval, int cnt) {
		int bucket;
		int lim;
		spanhash h = new spanhash();
		int generatedAlloc_log2 = this.getAlloc_log2();
		lim = (1 << generatedAlloc_log2);
		bucket = hashval & (lim - 1);
		Object generatedData = this.getData();
		int generatedCnt = h.getCnt();
		int generatedFree = this.getFree();
		int generatedHashval = h.getHashval();
		while (1) {
			h = (generatedData[bucket++]);
			if (!generatedCnt) {
				h.setHashval(hashval);
				h.setCnt(cnt);
				generatedFree--;
				if (generatedFree < 0) {
					return top.spanhash_rehash();
				} 
				return top;
			} 
			if (generatedHashval == hashval) {
				generatedCnt += cnt;
				return top;
			} 
			if (lim <= bucket) {
				bucket = 0;
			} 
		}
	}
	public spanhash_top hash_chars(repository r, diff_filespec one) {
		int i;
		int n;
		int accum1;
		int accum2;
		int hashval;
		spanhash_top hash = new spanhash_top();
		Object generatedData = one.getData();
		byte buf = generatedData;
		long generatedSize = one.getSize();
		int sz = generatedSize;
		int is_text = !/*Error: Function owner not recognized*/diff_filespec_is_binary(r, one);
		i = 9;
		hash = ModernizedCProgram.xmalloc(ModernizedCProgram.st_add(/*Error: sizeof expression not supported yet*/, ModernizedCProgram.st_mult(/*Error: Unsupported expression*/, 1 << i)));
		hash.setAlloc_log2(i);
		hash.setFree(((1 << (i)) * (i - 3) / (i)));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedData, 0, /*Error: Unsupported expression*/ * (1 << i));
		n = 0;
		accum1 = accum2 = 0;
		while (sz) {
			int c = buf++;
			int old_1 = accum1;
			sz--;
			if (is_text && c == (byte)'\r' && sz && buf == /* Ignore CR in CRLF sequence if text */(byte)'\n') {
				continue;
			} 
			accum1 = (accum1 << 7) ^ (accum2 >> 25);
			accum2 = (accum2 << 7) ^ (old_1 >> 25);
			accum1 += c;
			if (++n < 64 && c != (byte)'\n') {
				continue;
			} 
			hashval = (accum1 + accum2 * -1024) % 107927;
			hash = hash.add_spanhash(hashval, n);
			n = 0;
			accum1 = accum2 = 0;
		}
		int generatedAlloc_log2 = hash.getAlloc_log2();
		ModernizedCProgram.sane_qsort((generatedData), (-1024 << generatedAlloc_log2), /*Error: sizeof expression not supported yet*/, spanhash_cmp);
		return hash;
	}
	public int getAlloc_log2() {
		return alloc_log2;
	}
	public void setAlloc_log2(int newAlloc_log2) {
		alloc_log2 = newAlloc_log2;
	}
	public int getFree() {
		return free;
	}
	public void setFree(int newFree) {
		free = newFree;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
