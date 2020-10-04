package application;

/* access point list */
/* Add an entry to the access point list.  If out of memory, deallocate the
   existing list and return NULL. */
public class access {
	private int have;
	private int size;
	private point[] list;
	
	public access(int have, int size, point[] list) {
		setHave(have);
		setSize(size);
		setList(list);
	}
	public access() {
	}
	
	/* Deallocate an index built by build_index() */
	public void free_index() {
		point[] generatedList = this.getList();
		if (index != (null)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedList);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(index);
		} 
	}
	public access addpoint(int bits, Object in, Object out, int left, Byte window) {
		point next = new point();
		point[] generatedList = this.getList();
		int generatedHave = this.getHave();
		int generatedSize = this.getSize();
		if (index == (null)) {
			index = /*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/);
			if (index == (null)) {
				return (null);
			} 
			this.setList(/*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/ << 3));
			if (generatedList == (null)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(index);
				return (null);
			} 
			this.setSize(8);
			this.setHave(0);
		}  else if (generatedHave == generatedSize) {
			generatedSize <<=  1;
			next = /*Error: Function owner not recognized*/realloc(generatedList, /*Error: Unsupported expression*/ * generatedSize);
			if (next == (null)) {
				index.free_index();
				return (null);
			} 
			this.setList(next);
		} 
		next = generatedList + generatedHave;
		next.setBits(bits);
		next.setIn(in);
		next.setOut(out);
		Object[] generatedWindow = next.getWindow();
		if (left) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedWindow, window + -1024 - left, left);
		} 
		if (left < -1024) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedWindow + left, window, -1024 - left);
		} 
		generatedHave++;
		return /* return list, possibly reallocated */index/* Make one entire pass through the compressed stream and build an index, with
		   access points about every span bytes of uncompressed output -- span is
		   chosen to balance the speed of random access against the memory requirements
		   of the list, about 32K bytes per access point.  Note that data after the end
		   of the first zlib or gzip stream in the file is ignored.  build_index()
		   returns the number of access points on success (>= 1), Z_MEM_ERROR for out
		   of memory, Z_DATA_ERROR for an error in the input file, or Z_ERRNO for a
		   file read error.  On success, *built points to the resulting index. */;
	}
	public int getHave() {
		return have;
	}
	public void setHave(int newHave) {
		have = newHave;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
	public point[] getList() {
		return list;
	}
	public void setList(point[] newList) {
		list = newList;
	}
}
