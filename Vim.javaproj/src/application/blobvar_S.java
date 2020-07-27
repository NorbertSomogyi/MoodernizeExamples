package application;

public class blobvar_S {
	private growarray bv_ga;
	private int bv_refcount;
	private byte bv_lock;
	
	public blobvar_S(growarray bv_ga, int bv_refcount, byte bv_lock) {
		setBv_ga(bv_ga);
		setBv_refcount(bv_refcount);
		setBv_lock(bv_lock);
	}
	public blobvar_S() {
	}
	
	/* vi:set ts=8 sts=4 sw=4 noet:
	 *
	 * VIM - Vi IMproved	by Bram Moolenaar
	 *
	 * Do ":help uganda"  in Vim to read copying and usage conditions.
	 * Do ":help credits" in Vim to see a list of people who contributed.
	 * See README.txt for an overview of the Vim source code.
	 */
	/*
	 * blob.c: Blob support by Yasuhiro Matsumoto
	 */
	/*
	 * Allocate an empty blob.
	 * Caller should take care of the reference count.
	 */
	public blobvar_S blob_alloc() {
		blob_T blob = (blob_T)ModernizedCProgram.alloc_clear(/*Error: Unsupported expression*/);
		growarray generatedBv_ga = blob.getBv_ga();
		if (blob != ((Object)0)) {
			generatedBv_ga.ga_init2(1, 100);
		} 
		return blob/*
		 * Allocate an empty blob for a return value, with reference count set.
		 * Returns OK or FAIL.
		 */;
	}
	public void blob_free() {
		growarray generatedBv_ga = this.getBv_ga();
		generatedBv_ga.ga_clear();
		ModernizedCProgram.vim_free(b/*
		 * Unreference a blob: decrement the reference count and free it when it
		 * becomes zero.
		 */);
	}
	public void blob_unref() {
		int generatedBv_refcount = this.getBv_refcount();
		if (b != ((Object)0) && --generatedBv_refcount <= 0) {
			b/*
			 * Get the length of data.
			 */.blob_free();
		} 
	}
	public long blob_len() {
		if (b == ((Object)0)) {
			return -1024;
		} 
		growarray generatedBv_ga = this.getBv_ga();
		int generatedGa_len = generatedBv_ga.getGa_len();
		return generatedGa_len;
	}
	public int blob_get(int idx) {
		growarray generatedBv_ga = this.getBv_ga();
		Object generatedGa_data = generatedBv_ga.getGa_data();
		return ((char_u)generatedGa_data)[idx/*
		 * Store one byte "c" in blob "b" at "idx".
		 * Caller must make sure that "idx" is valid.
		 */];
	}
	public void blob_set(int idx, Object c) {
		growarray generatedBv_ga = this.getBv_ga();
		Object generatedGa_data = generatedBv_ga.getGa_data();
		((char_u)generatedGa_data)[idx] = c/*
		 * Return TRUE when two blobs have exactly the same values.
		 */;
	}
	public int blob_equal(blobvar_S b2) {
		int i;
		int len1 = b1.blob_len();
		int len2 = b2.blob_len();
		// empty and NULL are considered the sameif (len1 == 0 && len2 == 0) {
			return 1;
		} 
		if (b1 == b2) {
			return 1;
		} 
		if (len1 != len2) {
			return 0;
		} 
		growarray generatedBv_ga = this.getBv_ga();
		int generatedGa_len = generatedBv_ga.getGa_len();
		for (i = 0; i < generatedGa_len; i++) {
			if (b1.blob_get(i) != b2.blob_get(i)) {
				return 0;
			} 
		}
		return 1/*
		 * Read "blob" from file "fd".
		 * Return OK or FAIL.
		 */;
	}
	public Object blob2string(Object tofree, Object numbuf) {
		int i;
		garray_T ga = new garray_T();
		if (blob == ((Object)0)) {
			tofree = ((Object)0);
			return (char_u)"0z";
		} 
		// Store bytes in the growarray.// Store bytes in the growarray.ga.ga_init2(1, 4000);
		ga.ga_concat((char_u)"0z");
		for (i = 0; i < blob.blob_len(); i++) {
			if (i > 0 && (i & 3) == 0) {
				ga.ga_concat((char_u)".");
			} 
			ModernizedCProgram.vim_snprintf((byte)numbuf, 65, "%02X", (int)blob.blob_get(i));
			ga.ga_concat(numbuf);
		}
		Object generatedGa_data = ga.getGa_data();
		tofree = generatedGa_data;
		return tofree/*
		 * Convert a string variable, in the format of blob2string(), to a blob.
		 * Return NULL when conversion failed.
		 */;
	}
	public blobvar_S string2blob(Object str) {
		blobvar_S blobvar_S = new blobvar_S();
		blob_T blob = blobvar_S.blob_alloc();
		char_u s = str;
		if (blob == ((Object)0)) {
			return ((Object)0);
		} 
		if (s[0] != (byte)'0' || (s[1] != (byte)'z' && s[1] != (byte)'Z')) {
			;
		} 
		s += 2;
		growarray generatedBv_ga = blob.getBv_ga();
		while (ModernizedCProgram.vim_isxdigit(s)) {
			if (!ModernizedCProgram.vim_isxdigit(s[1])) {
				;
			} 
			generatedBv_ga.ga_append((ModernizedCProgram.hex2nr(s[0]) << 4) + ModernizedCProgram.hex2nr(s[1]));
			s += 2;
			if (s == (byte)'.' && ModernizedCProgram.vim_isxdigit(s[1])) {
				++s;
			} 
		}
		if (ModernizedCProgram.skipwhite(s) != (byte)'\000') {
			;
		} 
		int generatedBv_refcount = blob.getBv_refcount();
		++generatedBv_refcount;
		return blob;
		return ((Object)0/*
		 * "remove({blob})" function
		 */);
	}
	public growarray getBv_ga() {
		return bv_ga;
	}
	public void setBv_ga(growarray newBv_ga) {
		bv_ga = newBv_ga;
	}
	public int getBv_refcount() {
		return bv_refcount;
	}
	public void setBv_refcount(int newBv_refcount) {
		bv_refcount = newBv_refcount;
	}
	public byte getBv_lock() {
		return bv_lock;
	}
	public void setBv_lock(byte newBv_lock) {
		bv_lock = newBv_lock;
	}
}
// Struct that holds both a normal function name and a partial_T, as used for a
// callback argument.
// When used temporarily "cb_name" is not allocated.  The refcounts to either
