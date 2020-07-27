package application;

public class cnamestore {
	private Object len;
	private byte[] alloc;
	private Object allocsize;
	
	public cnamestore(Object len, byte[] alloc, Object allocsize) {
		setLen(len);
		setAlloc(alloc);
		setAllocsize(allocsize);
	}
	public cnamestore() {
	}
	
	public  cnameappend(Byte src, Object len) {
		byte[] generatedAlloc = this.getAlloc();
		Object generatedAllocsize = this.getAllocsize();
		if (!generatedAlloc) {
			this.setAllocsize(len + 1);
			this.setAlloc(/*Error: Function owner not recognized*/Curl_cmalloc(generatedAllocsize));
			if (!generatedAlloc) {
				return .DOH_OUT_OF_MEM;
			} 
		}  else if (generatedAllocsize < (generatedAllocsize + len + 1)) {
			byte ptr;
			generatedAllocsize += len + 1;
			ptr = /*Error: Function owner not recognized*/Curl_crealloc(generatedAlloc, generatedAllocsize);
			if (!ptr) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedAlloc);
				return .DOH_OUT_OF_MEM;
			} 
			this.setAlloc(ptr);
		} 
		Object generatedLen = this.getLen();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedAlloc[generatedLen], src, len);
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
	public byte[] getAlloc() {
		return alloc;
	}
	public void setAlloc(byte[] newAlloc) {
		alloc = newAlloc;
	}
	public Object getAllocsize() {
		return allocsize;
	}
	public void setAllocsize(Object newAllocsize) {
		allocsize = newAllocsize;
	}
}
