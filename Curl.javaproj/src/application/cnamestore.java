package application;

public class cnamestore {
	private Object len;
	private Byte alloc;
	private Object allocsize;
	
	public cnamestore(Object len, Byte alloc, Object allocsize) {
		setLen(len);
		setAlloc(alloc);
		setAllocsize(allocsize);
	}
	public cnamestore() {
	}
	
	public  cnameappend(Byte src, Object len) {
		Byte generatedAlloc = this.getAlloc();
		Object generatedAllocsize = this.getAllocsize();
		if (!generatedAlloc) {
			this.setAllocsize(len + 1);
			this.setAlloc(.Curl_cmalloc(generatedAllocsize));
			if (!generatedAlloc) {
				return .DOH_OUT_OF_MEM;
			} 
		}  else if (generatedAllocsize < (generatedAllocsize + len + 1)) {
			byte ptr;
			generatedAllocsize += len + 1;
			ptr = .Curl_crealloc(generatedAlloc, generatedAllocsize);
			if (!ptr) {
				.Curl_cfree(generatedAlloc);
				return .DOH_OUT_OF_MEM;
			} 
			this.setAlloc(ptr);
		} 
		Object generatedLen = this.getLen();
		.memcpy(generatedAlloc[generatedLen], src, len);
		generatedLen += len;
		generatedAlloc[generatedLen] = /* keep it zero terminated */0;
		return .DOH_OK;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public Byte getAlloc() {
		return alloc;
	}
	public void setAlloc(Byte newAlloc) {
		alloc = newAlloc;
	}
	public Object getAllocsize() {
		return allocsize;
	}
	public void setAllocsize(Object newAllocsize) {
		allocsize = newAllocsize;
	}
}
