package application;

public class lzma_mf_s {
	private Object[] buffer;
	private Object size;
	private Object keep_size_before;
	private Object keep_size_after;
	private Object offset;
	private Object read_pos;
	private Object read_ahead;
	private Object read_limit;
	private Object write_pos;
	private Object pending;
	private Object find;
	private Object skip;
	private Object hash;
	private Object son;
	private Object cyclic_pos;
	private Object cyclic_size;
	private Object hash_mask;
	private Object depth;
	private Object nice_len;
	private Object match_len_max;
	private Object action;
	private Object hash_size_sum;
	private Object sons_count;
	
	public lzma_mf_s(Object[] buffer, Object size, Object keep_size_before, Object keep_size_after, Object offset, Object read_pos, Object read_ahead, Object read_limit, Object write_pos, Object pending, Object find, Object skip, Object hash, Object son, Object cyclic_pos, Object cyclic_size, Object hash_mask, Object depth, Object nice_len, Object match_len_max, Object action, Object hash_size_sum, Object sons_count) {
		setBuffer(buffer);
		setSize(size);
		setKeep_size_before(keep_size_before);
		setKeep_size_after(keep_size_after);
		setOffset(offset);
		setRead_pos(read_pos);
		setRead_ahead(read_ahead);
		setRead_limit(read_limit);
		setWrite_pos(write_pos);
		setPending(pending);
		setFind(find);
		setSkip(skip);
		setHash(hash);
		setSon(son);
		setCyclic_pos(cyclic_pos);
		setCyclic_size(cyclic_size);
		setHash_mask(hash_mask);
		setDepth(depth);
		setNice_len(nice_len);
		setMatch_len_max(match_len_max);
		setAction(action);
		setHash_size_sum(hash_size_sum);
		setSons_count(sons_count);
	}
	public lzma_mf_s() {
	}
	
	/// Normalization must be done when lzma_mf.offset + lzma_mf.read_pos
	/// reaches MUST_NORMALIZE_POS.
	/// \brief      Normalizes hash values
	///
	/// The hash arrays store positions of match candidates. The positions are
	/// relative to an arbitrary offset that is not the same as the absolute
	/// offset in the input stream. The relative position of the current byte
	/// is lzma_mf.offset + lzma_mf.read_pos. The distances of the matches are
	/// the differences of the current read position and the position found from
	/// the hash.
	///
	/// To prevent integer overflows of the offsets stored in the hash arrays,
	/// we need to "normalize" the stored values now and then. During the
	/// normalization, we drop values that indicate distance greater than the
	/// dictionary size, thus making space for new values.
	public void normalize() {
		Object generatedRead_pos = this.getRead_pos();
		Object generatedOffset = this.getOffset();
		((generatedRead_pos + generatedOffset == -1024) ? (Object)0 : /*Error: Function owner not recognized*/_assert("mf->read_pos + mf->offset == MUST_NORMALIZE_POS", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder_mf.c", 111))// In future we may not want to touch the lowest bits, because there;// In future we may not want to touch the lowest bits, because there
		Object generatedCyclic_size = this.getCyclic_size();
		// may be match finders that use larger resolution than one byte.uint32_t subvalue = (-1024 - generatedCyclic_size);
		Object generatedHash_size_sum = this.getHash_size_sum();
		Object generatedSons_count = this.getSons_count();
		uint32_t count = generatedHash_size_sum + generatedSons_count;
		Object generatedHash = this.getHash();
		uint32_t hash = generatedHash;
		for (uint32_t i = 0;
		 i < count; ++i) {
			if (hash[i] <= subvalue) {
				hash[i] = 0;
			} else {
					hash[i] -= subvalue;
			} 
		}// If the distance is greater than the dictionary size,// we can simply mark the hash element as empty.//// NOTE: Only the first mf->hash_size_sum elements are// initialized for sure. There may be uninitialized elements
		// Update offset to match the new locations.// Update offset to match the new locations.generatedOffset -= subvalue;
		return /*Error: Unsupported expression*/;
	}
	/// Mark the current byte as processed from point of view of the match finder.
	public void move_pos() {
		Object generatedCyclic_pos = this.getCyclic_pos();
		Object generatedCyclic_size = this.getCyclic_size();
		if (++generatedCyclic_pos == generatedCyclic_size) {
			this.setCyclic_pos(0);
		} 
		Object generatedRead_pos = this.getRead_pos();
		++generatedRead_pos;
		Object generatedWrite_pos = this.getWrite_pos();
		((generatedRead_pos <= generatedWrite_pos) ? (Object)0 : /*Error: Function owner not recognized*/_assert("mf->read_pos <= mf->write_pos", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder_mf.c", 154));
		Object generatedOffset = this.getOffset();
		if (/*Error: Function owner not recognized*/__builtin_expect(generatedRead_pos + generatedOffset == -1024, 0)) {
			mf.normalize();
		} 
		/// finder (indicating that no match was found), and count how many bytes we
	}
	/// have ignored this way.
	///
	/// When new data is given after the flushing was completed, the match finder
	/// is restarted by rewinding mf->read_pos backwards by mf->pending. Then
	/// the missed bytes are added to the hash using the match finder's skip
	/// function (with small amount of input, it may start using mf->pending
	/// again if flushing).
	///
	/// Due to this rewinding, we don't touch cyclic_pos or test for
	/// normalization. It will be done when the match finder's skip function
	/// catches up after a flush.
	public void move_pending() {
		Object generatedRead_pos = this.getRead_pos();
		++generatedRead_pos;
		Object generatedWrite_pos = this.getWrite_pos();
		((generatedRead_pos <= generatedWrite_pos) ? (Object)0 : /*Error: Function owner not recognized*/_assert("mf->read_pos <= mf->write_pos", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder_mf.c", 179));
		Object generatedPending = this.getPending();
		++generatedPending/// Calculate len_limit and determine if there is enough input to run/// the actual match finder code. Sets up "cur" and "pos". This macro/// is used by all find functions and binary tree skip functions. Hash;/// Calculate len_limit and determine if there is enough input to run/// the actual match finder code. Sets up "cur" and "pos". This macro/// is used by all find functions and binary tree skip functions. Hash
	}
	/// chain skip function doesn't need len_limit so a simpler code is used
	/// in them.
	/// Header for find functions. "return 0" indicates that zero matches
	/// were found.
	/// Header for a loop in a skip function. "continue" tells to skip the rest
	/// of the code in the loop.
	/// Calls hc_find_func() or bt_find_func() and calculates the total number
	/// of matches found. Updates the dictionary position and returns the number
	/// of matches found.
	////////////////
	// Hash Chain //
	////////////////
	///
	///
	/// \param      len_limit       Don't look for matches longer than len_limit.
	/// \param      pos             lzma_mf.read_pos + lzma_mf.offset
	/// \param      cur             Pointer to current byte (mf_ptr(mf))
	/// \param      cur_match       Start position of the current match candidate
	/// \param      depth           Maximum length of the hash chain
	/// \param      son             lzma_mf.son (contains the hash chain)
	/// \param      cyclic_pos
	/// \param      cyclic_size
	/// \param      matches         Array to hold the matches.
	/// \param      len_best        The length of the longest match found so far.
	// matches_count
	/////////////////
	// Binary Tree //
	/////////////////
	// matches_count
	/// Skip the given number of bytes. This is used when a good match was found.
	/// For example, if mf_find() finds a match of 200 bytes long, the first byte
	/// of that match was already consumed by mf_find(), and the rest 199 bytes
	/// have to be skipped with mf_skip(mf, 199).
	public void mf_skip(Object amount) {
		Object generatedRead_ahead = this.getRead_ahead();
		if (amount != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mf, amount);
			generatedRead_ahead += amount;
		} 
	}
	/// Copies at most *left number of bytes from the history buffer
	/// to out[]. This is needed by LZMA2 to encode uncompressed chunks.
	public void mf_read(Object out, Object out_pos, Object out_size, Object left) {
		size_t out_avail = out_size - out_pos;
		size_t copy_size = ((out_avail) < (left) ? (out_avail) : (left));
		Object generatedRead_ahead = this.getRead_ahead();
		((generatedRead_ahead == 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("mf->read_ahead == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder.h", 286));
		Object generatedRead_pos = this.getRead_pos();
		((generatedRead_pos >= left) ? (Object)0 : /*Error: Function owner not recognized*/_assert("mf->read_pos >= *left", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder.h", 287));
		Object[] generatedBuffer = this.getBuffer();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out + out_pos, generatedBuffer + generatedRead_pos - left, copy_size);
		out_pos += copy_size;
		left -= copy_size;
		return /*Error: Unsupported expression*/;
	}
	/// bytes of input history available all the time. Now and then we need to
	/// "slide" the buffer to make space for the new data to the end of the
	/// buffer. At the same time, data older than keep_size_before is dropped.
	///
	public void move_window() {
		Object generatedRead_pos = this.getRead_pos();
		Object generatedKeep_size_before = this.getKeep_size_before();
		// like LZMA use the lowest bits of mf->read_pos to know the// alignment of the uncompressed data. We also get better speed// for memmove() with aligned buffers.// like LZMA use the lowest bits of mf->read_pos to know the// alignment of the uncompressed data. We also get better speed// for memmove() with aligned buffers.((generatedRead_pos > generatedKeep_size_before) ? (Object)0 : /*Error: Function owner not recognized*/_assert("mf->read_pos > mf->keep_size_before", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder.c", 50));
		uint32_t move_offset = (generatedRead_pos - generatedKeep_size_before) & ~-1024;
		Object generatedWrite_pos = this.getWrite_pos();
		((generatedWrite_pos > move_offset) ? (Object)0 : /*Error: Function owner not recognized*/_assert("mf->write_pos > move_offset", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder.c", 54));
		size_t move_size = generatedWrite_pos - move_offset;
		Object generatedSize = this.getSize();
		((move_offset + move_size <= generatedSize) ? (Object)0 : /*Error: Function owner not recognized*/_assert("move_offset + move_size <= mf->size", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder.c", 57));
		Object[] generatedBuffer = this.getBuffer();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedBuffer, generatedBuffer + move_offset, move_size);
		Object generatedOffset = this.getOffset();
		generatedOffset += move_offset;
		generatedRead_pos -= move_offset;
		Object generatedRead_limit = this.getRead_limit();
		generatedRead_limit -= move_offset;
		generatedWrite_pos -= move_offset;
		return /*Error: Unsupported expression*/;/// \brief      Tries to fill the input window (mf->buffer)////// If we are the last encoder in the chain, our input data is in in[].
	}
	// Align the move to a multiple of 16 bytes. Some LZ-based encoders
	public boolean lz_encoder_prepare(Object allocator, Object lz_options) {
		// For now, the dictionary size is limited to 1.5 GiB. This may grow// in the future if needed, but it needs a little more work than just// changing this check.if (lz_options.getDict_size() < LZMA_DICT_SIZE_MIN || lz_options.getDict_size() > (-1024 << 30) + (-1024 << 29) || lz_options.getNice_len() > lz_options.getMatch_len_max()) {
			return 1;
		} 
		this.setKeep_size_before(lz_options.getBefore_size() + lz_options.getDict_size());
		this.setKeep_size_after(lz_options.getAfter_size() + lz_options.getMatch_len_max())//;//
		// This works with dictionaries up to about 3 GiB. If bigger// dictionary is wanted, some extra work is needed://   - Several variables in lzma_mf have to be changed from uint32_t//     to size_t.//   - Memory usage calculation needs something too, e.g. use uint64_t//     for mf->size.uint32_t reserve = lz_options.getDict_size() / 2;
		if (reserve > (-1024 << 30)) {
			reserve /= 2;
		} 
		reserve += (lz_options.getBefore_size() + lz_options.getMatch_len_max() + lz_options.getAfter_size()) / 2 + (-1024 << 19);
		Object generatedSize = this.getSize();
		uint32_t old_size = generatedSize;
		Object generatedKeep_size_before = this.getKeep_size_before();
		Object generatedKeep_size_after = this.getKeep_size_after();
		this.setSize(generatedKeep_size_before + reserve + generatedKeep_size_after)// Deallocate the old history buffer if it exists but has different;// Deallocate the old history buffer if it exists but has different
		Object[] generatedBuffer = this.getBuffer();
		// size than what is needed now.if (generatedBuffer != ((Object)0) && old_size != generatedSize) {
			ModernizedCProgram.lzma_free(generatedBuffer, allocator);
			this.setBuffer(((Object)0));
		} 
		// Match finder options// Match finder optionsthis.setMatch_len_max(lz_options.getMatch_len_max());
		this.setNice_len(lz_options.getNice_len())// cyclic_size has to stay smaller than 2 Gi. Note that this doesn't// mean limiting dictionary size to less than 2 GiB. With a match// finder that uses multibyte resolution (hashes start at e.g. every// fourth byte), cyclic_size would stay below 2 Gi even when// dictionary size is greater than 2 GiB.//// It would be possible to allow cyclic_size >= 2 Gi, but then we;// cyclic_size has to stay smaller than 2 Gi. Note that this doesn't// mean limiting dictionary size to less than 2 GiB. With a match// finder that uses multibyte resolution (hashes start at e.g. every// fourth byte), cyclic_size would stay below 2 Gi even when// dictionary size is greater than 2 GiB.//// It would be possible to allow cyclic_size >= 2 Gi, but then we
		// would need to be careful to use 64-bit types in various places// (size_t could do since we would need bigger than 32-bit address// space anyway). It would also require either zeroing a multigigabyte// buffer at initialization (waste of time and RAM) or allow// normalization in lz_encoder_mf.c to access uninitialized// memory to keep the code simpler. The current way is simple and// still allows pretty big dictionaries, so I don't expect these// limits to change.// would need to be careful to use 64-bit types in various places// (size_t could do since we would need bigger than 32-bit address// space anyway). It would also require either zeroing a multigigabyte// buffer at initialization (waste of time and RAM) or allow// normalization in lz_encoder_mf.c to access uninitialized// memory to keep the code simpler. The current way is simple and// still allows pretty big dictionaries, so I don't expect these// limits to change.this.setCyclic_size(lz_options.getDict_size() + 1);
		// Validate the match finder ID and setup the function pointers.switch (lz_options.getMatch_finder()) {
		default:
				return 1;
		}
		// Calculate the sizes of mf->hash and mf->son and check that// nice_len is big enough for the selected match finder.uint32_t hash_bytes = lz_options.getMatch_finder() & -1024;
		Object generatedNice_len = this.getNice_len();
		if (hash_bytes > generatedNice_len) {
			return 1;
		} 
		boolean is_bt = (lz_options.getMatch_finder() & -1024) != 0;
		uint32_t hs = new uint32_t();
		if (hash_bytes == 2) {
			hs = -1024;
		} else {
				hs = lz_options.getDict_size() - 1;
				hs |=  hs >> 1;
				hs |=  hs >> 2;
				hs |=  hs >> 4;
				hs |=  hs >> 8;
				hs >>=  1;
				hs |=  -1024;
				if (hs > (-1024 << 24)) {
					if (hash_bytes == 3) {
						hs = (-1024 << 24) - 1;
					} else {
							hs >>=  1;
					} 
				} 
		} 
		this.setHash_mask(hs);
		++hs;
		if (hash_bytes > 2) {
			hs += (-1024 << 10);
		} 
		if (hash_bytes > 3) {
			hs += (-1024 << 16/*
				No match finder uses this at the moment.
				if (mf->hash_bytes > 4)
					hs += HASH_4_SIZE;
			*/);
		} 
		// If the above code calculating hs is modified, make sure that// this assertion stays valid (UINT32_MAX / 5 is not strictly the// exact limit). If it doesn't, you need to calculate that// hash_size_sum + sons_count cannot overflow.// If the above code calculating hs is modified, make sure that// this assertion stays valid (UINT32_MAX / 5 is not strictly the// exact limit). If it doesn't, you need to calculate that// hash_size_sum + sons_count cannot overflow.((hs < -1024 / 5) ? (Object)0 : /*Error: Function owner not recognized*/_assert("hs < UINT32_MAX / 5", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lz_encoder.c", 332));
		Object generatedHash_size_sum = this.getHash_size_sum();
		Object generatedSons_count = this.getSons_count();
		uint32_t old_count = generatedHash_size_sum + generatedSons_count;
		this.setHash_size_sum(hs);
		Object generatedCyclic_size = this.getCyclic_size();
		this.setSons_count(generatedCyclic_size);
		if (is_bt) {
			generatedSons_count *= 2;
		} 
		uint32_t new_count = generatedHash_size_sum + generatedSons_count;
		// Deallocate the old hash array if it exists and has different size
		Object generatedHash = this.getHash();
		// than what is needed now.if (old_count != new_count) {
			ModernizedCProgram.lzma_free(generatedHash, allocator);
			this.setHash(((Object)0));
		} 
		// Maximum number of match finder cycles// Maximum number of match finder cyclesthis.setDepth(lz_options.getDepth());
		Object generatedDepth = this.getDepth();
		if (generatedDepth == 0) {
			if (is_bt) {
				this.setDepth(16 + generatedNice_len / 2);
			} else {
					this.setDepth(4 + generatedNice_len / 4);
			} 
		} 
		return 0;
	}
	public boolean lz_encoder_init(Object allocator, Object lz_options) {
		Object[] generatedBuffer = this.getBuffer();
		Object generatedSize = this.getSize();
		// Allocate the history buffer.if (generatedBuffer == ((Object)0)) {
			this.setBuffer(ModernizedCProgram.lzma_alloc(generatedSize, allocator));
			if (generatedBuffer == ((Object)0)) {
				return 1;
			} 
		} 
		Object generatedCyclic_size = this.getCyclic_size();
		// avoiding a few branches in the match finders. The downside is// that match finder needs to be normalized more often, which may// hurt performance with huge dictionaries.// avoiding a few branches in the match finders. The downside is// that match finder needs to be normalized more often, which may// hurt performance with huge dictionaries.this.setOffset(generatedCyclic_size);
		this.setRead_pos(0);
		this.setRead_ahead(0);
		this.setRead_limit(0);
		this.setWrite_pos(0);
		this.setPending(0);
		Object generatedHash_size_sum = this.getHash_size_sum();
		Object generatedSons_count = this.getSons_count();
		// Allocate match finder's hash array.size_t alloc_count = generatedHash_size_sum + generatedSons_count;
		// Check for integer overflow. (Huge dictionaries are not// possible on 32-bit CPU.)if (alloc_count > -1024 / /*Error: Unsupported expression*/) {
			return 1;
		} 
		Object generatedHash = this.getHash();
		if (generatedHash == ((Object)0)) {
			this.setHash(ModernizedCProgram.lzma_alloc(alloc_count * /*Error: Unsupported expression*/, allocator));
			if (generatedHash == ((Object)0)) {
				return 1;
			} 
		} 
		this.setSon(generatedHash + generatedHash_size_sum);
		this.setCyclic_pos(0)// Initialize the hash table. Since EMPTY_HASH_VALUE is zero, we// can use memset().;// Initialize the hash table. Since EMPTY_HASH_VALUE is zero, we// can use memset().
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedHash, 0, (size_t)(generatedHash_size_sum) * /*Error: Unsupported expression*//*
			for (uint32_t i = 0; i < hash_size_sum; ++i)
				mf->hash[i] = EMPTY_HASH_VALUE;
		*/)// We don't need to initialize mf->son, but not doing that will// make Valgrind complain in normalization (see normalize() in// lz_encoder_mf.c).//// Skipping this initialization is *very* good when big dictionary is;// We don't need to initialize mf->son, but not doing that will// make Valgrind complain in normalization (see normalize() in// lz_encoder_mf.c).//// Skipping this initialization is *very* good when big dictionary is
		Object generatedWrite_pos = this.getWrite_pos();
		// used but only small amount of data gets actually compressed: most// of the mf->hash won't get actually allocated by the kernel, so// we avoid wasting RAM and improve initialization speed a lot.//memzero(mf->son, (size_t)(mf->sons_count) * sizeof(uint32_t));// Handle preset dictionary.if (lz_options.getPreset_dict() != ((Object)0) && lz_options.getPreset_dict_size() > 0) {
			this.setWrite_pos(((lz_options.getPreset_dict_size()) < (generatedSize) ? (lz_options.getPreset_dict_size()) : (generatedSize)));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuffer, lz_options.getPreset_dict() + lz_options.getPreset_dict_size() - generatedWrite_pos, generatedWrite_pos);
			this.setAction(LZMA_SYNC_FLUSH);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mf, generatedWrite_pos);
		} 
		this.setAction(LZMA_RUN);
		return 0;
	}
	public Object[] getBuffer() {
		return buffer;
	}
	public void setBuffer(Object[] newBuffer) {
		buffer = newBuffer;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getKeep_size_before() {
		return keep_size_before;
	}
	public void setKeep_size_before(Object newKeep_size_before) {
		keep_size_before = newKeep_size_before;
	}
	public Object getKeep_size_after() {
		return keep_size_after;
	}
	public void setKeep_size_after(Object newKeep_size_after) {
		keep_size_after = newKeep_size_after;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getRead_pos() {
		return read_pos;
	}
	public void setRead_pos(Object newRead_pos) {
		read_pos = newRead_pos;
	}
	public Object getRead_ahead() {
		return read_ahead;
	}
	public void setRead_ahead(Object newRead_ahead) {
		read_ahead = newRead_ahead;
	}
	public Object getRead_limit() {
		return read_limit;
	}
	public void setRead_limit(Object newRead_limit) {
		read_limit = newRead_limit;
	}
	public Object getWrite_pos() {
		return write_pos;
	}
	public void setWrite_pos(Object newWrite_pos) {
		write_pos = newWrite_pos;
	}
	public Object getPending() {
		return pending;
	}
	public void setPending(Object newPending) {
		pending = newPending;
	}
	public Object getFind() {
		return find;
	}
	public void setFind(Object newFind) {
		find = newFind;
	}
	public Object getSkip() {
		return skip;
	}
	public void setSkip(Object newSkip) {
		skip = newSkip;
	}
	public Object getHash() {
		return hash;
	}
	public void setHash(Object newHash) {
		hash = newHash;
	}
	public Object getSon() {
		return son;
	}
	public void setSon(Object newSon) {
		son = newSon;
	}
	public Object getCyclic_pos() {
		return cyclic_pos;
	}
	public void setCyclic_pos(Object newCyclic_pos) {
		cyclic_pos = newCyclic_pos;
	}
	public Object getCyclic_size() {
		return cyclic_size;
	}
	public void setCyclic_size(Object newCyclic_size) {
		cyclic_size = newCyclic_size;
	}
	public Object getHash_mask() {
		return hash_mask;
	}
	public void setHash_mask(Object newHash_mask) {
		hash_mask = newHash_mask;
	}
	public Object getDepth() {
		return depth;
	}
	public void setDepth(Object newDepth) {
		depth = newDepth;
	}
	public Object getNice_len() {
		return nice_len;
	}
	public void setNice_len(Object newNice_len) {
		nice_len = newNice_len;
	}
	public Object getMatch_len_max() {
		return match_len_max;
	}
	public void setMatch_len_max(Object newMatch_len_max) {
		match_len_max = newMatch_len_max;
	}
	public Object getAction() {
		return action;
	}
	public void setAction(Object newAction) {
		action = newAction;
	}
	public Object getHash_size_sum() {
		return hash_size_sum;
	}
	public void setHash_size_sum(Object newHash_size_sum) {
		hash_size_sum = newHash_size_sum;
	}
	public Object getSons_count() {
		return sons_count;
	}
	public void setSons_count(Object newSons_count) {
		sons_count = newSons_count;
	}
}
///////////////
// In Window //
///////////////
