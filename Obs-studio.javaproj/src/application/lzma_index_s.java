package application;

public class lzma_index_s {
	private  streams;
	private Object uncompressed_size;
	private Object total_size;
	private Object record_count;
	private Object index_list_size;
	private Object prealloc;
	private Object checks;
	
	public lzma_index_s( streams, Object uncompressed_size, Object total_size, Object record_count, Object index_list_size, Object prealloc, Object checks) {
		setStreams(streams);
		setUncompressed_size(uncompressed_size);
		setTotal_size(total_size);
		setRecord_count(record_count);
		setIndex_list_size(index_list_size);
		setPrealloc(prealloc);
		setChecks(checks);
	}
	public lzma_index_s() {
	}
	
	public Object index_decoder_reset(Object coder, Object allocator, Object memlimit) {
		// to point to the decoded Index only if decoding is successful.// Before that, keep it NULL so that applications can always safely// pass it to lzma_index_end() no matter did decoding succeed or not.// to point to the decoded Index only if decoding is successful.// Before that, keep it NULL so that applications can always safely// pass it to lzma_index_end() no matter did decoding succeed or not.coder.setIndex_ptr(i);
		i = NULL;
		lzma_index_s lzma_index_s = new lzma_index_s();
		// We always allocate a new lzma_index.// We always allocate a new lzma_index.coder.setIndex(lzma_index_s.lzma_index_init(allocator));
		if (coder.getIndex() == NULL) {
			return LZMA_MEM_ERROR;
		} 
		// Initialize the rest.// Initialize the rest.coder.setSequence(.SEQ_INDICATOR);
		coder.setMemlimit(memlimit);
		// Needs to be initialized due to _memconfig().// Needs to be initialized due to _memconfig().coder.setCount(0);
		coder.setPos(0);
		coder.setCrc32(0);
		return LZMA_OK;
	}
	// Remember the pointer given by the application. We will set it
	public Object index_decoder_init(Object next, Object allocator, Object memlimit) {
		.lzma_next_coder_init(index_decoder_init, next, allocator);
		if (i == NULL || memlimit == 0) {
			return LZMA_PROG_ERROR;
		} 
		if (next.getCoder() == NULL) {
			next.setCoder(ModernizedCProgram.lzma_alloc(, allocator));
			if (next.getCoder() == NULL) {
				return LZMA_MEM_ERROR;
			} 
			next.setCode(index_decode);
			next.setEnd(index_decoder_end);
			next.setMemconfig(index_decoder_memconfig);
			next.getCoder().setIndex(NULL);
		} else {
				next.getCoder().getIndex().lzma_index_end(allocator);
		} 
		return i.index_decoder_reset(next.getCoder(), allocator, memlimit);
	}
	public int lzma_index_decoder(Object strm, Object memlimit) {
		.lzma_next_strm_init(index_decoder_init, strm, i, memlimit);
		strm.getInternal().getSupported_actions()[LZMA_RUN] = true;
		strm.getInternal().getSupported_actions()[LZMA_FINISH] = true;
		return LZMA_OK;
	}
	public int lzma_index_buffer_decode(Object memlimit, Object allocator, Object in, Object in_pos, Object in_size) {
		// Sanity checksif (i == NULL || memlimit == NULL || in == NULL || in_pos == NULL || in_pos > in_size) {
			return LZMA_PROG_ERROR;
		} 
		// Initialize the decoder. coder = new ();
		.return_if_error(i.index_decoder_reset(coder, allocator, memlimit))// Store the input start position so that we can restore it in case;// Store the input start position so that we can restore it in case
		// of an error. in_start = in_pos;
		// Do the actual decoding. ret = .index_decode(coder, allocator, in, in_pos, in_size, NULL, NULL, 0, LZMA_RUN);
		if (ret == LZMA_STREAM_END) {
			ret = LZMA_OK;
		} else {
				coder.getIndex().lzma_index_end(allocator);
				in_pos = in_start;
				if (ret == LZMA_OK) {
					ret = LZMA_DATA_ERROR;
				}  else if (ret == LZMA_MEMLIMIT_ERROR) {
					memlimit = ModernizedCProgram.lzma_index_memusage(1, coder.getCount());
				} 
		} 
		return ret;
	}
	public lzma_index_s index_init_plain(Object allocator) {
		lzma_index i = ModernizedCProgram.lzma_alloc(, allocator);
		 generatedStreams = i.getStreams();
		if (i != ((Object)0)) {
			generatedStreams.index_tree_init();
			i.setUncompressed_size(0);
			i.setTotal_size(0);
			i.setRecord_count(0);
			i.setIndex_list_size(0);
			i.setPrealloc(512);
			i.setChecks(0);
		} 
		return i;
	}
	public lzma_index_s lzma_index_init(Object allocator) {
		lzma_index_s lzma_index_s = new lzma_index_s();
		lzma_index i = lzma_index_s.index_init_plain(allocator);
		if (i == ((Object)0)) {
			return ((Object)0);
		} 
		index_stream s = ModernizedCProgram.index_stream_init(0, 0, 1, 0, allocator);
		if (s == ((Object)0)) {
			ModernizedCProgram.lzma_free(i, allocator);
			return ((Object)0);
		} 
		 generatedStreams = i.getStreams();
		Object generatedNode = s.getNode();
		ModernizedCProgram.index_tree_append(generatedStreams, generatedNode);
		return i;
	}
	public void lzma_index_end(Object allocator) {
		 generatedStreams = this.getStreams();
		// NOTE: If you modify this function, check also the bottom// of lzma_index_cat().if (i != ((Object)0)) {
			generatedStreams.index_tree_end(allocator, index_stream_end);
			ModernizedCProgram.lzma_free(i, allocator);
		} 
		return ;
	}
	public void lzma_index_prealloc(Object records) {
		if (records > ((-1024 - ) / )) {
			records = ((-1024 - ) / );
		} 
		this.setPrealloc((size_t)(records));
		return ;
	}
	public Object lzma_index_stream_flags(Object stream_flags) {
		if (i == ((Object)0) || stream_flags == ((Object)0)) {
			return LZMA_PROG_ERROR;
		} 
		// Validate the Stream Flags.do {
			 ret_ = (ModernizedCProgram.lzma_stream_flags_compare(stream_flags, stream_flags));
			if (ret_ != LZMA_OK) {
				return ret_;
			} 
		} while (0);
		 generatedStreams = this.getStreams();
		Object generatedRightmost = generatedStreams.getRightmost();
		index_stream s = (index_stream)(generatedRightmost);
		s.setStream_flags(stream_flags);
		return LZMA_OK;
	}
	public Object lzma_index_stream_padding(Object stream_padding) {
		if (i == ((Object)0) || stream_padding > LZMA_VLI_MAX || (stream_padding & 3) != 0) {
			return LZMA_PROG_ERROR;
		} 
		 generatedStreams = this.getStreams();
		Object generatedRightmost = generatedStreams.getRightmost();
		index_stream s = (index_stream)(generatedRightmost);
		Object generatedStream_padding = s.getStream_padding();
		// Check that the new value won't make the file grow too big. old_stream_padding = generatedStream_padding;
		s.setStream_padding(0);
		if (ModernizedCProgram.lzma_index_file_size(i) + stream_padding > LZMA_VLI_MAX) {
			s.setStream_padding(old_stream_padding);
			return LZMA_DATA_ERROR;
		} 
		s.setStream_padding(stream_padding);
		return LZMA_OK;
	}
	public Object lzma_index_append(Object allocator, Object unpadded_size, Object uncompressed_size) {
		// Validate.if (i == ((Object)0) || unpadded_size < UNPADDED_SIZE_MIN || unpadded_size > UNPADDED_SIZE_MAX || uncompressed_size > LZMA_VLI_MAX) {
			return LZMA_PROG_ERROR;
		} 
		 generatedStreams = this.getStreams();
		Object generatedRightmost = generatedStreams.getRightmost();
		index_stream s = (index_stream)(generatedRightmost);
		index_group g = (index_group)(generatedRightmost);
		Object generatedRecords = g.getRecords();
		Object generatedLast = g.getLast();
		 compressed_base = g == ((Object)0) ? 0 : .vli_ceil4(generatedRecords[generatedLast].getUnpadded_sum());
		 uncompressed_base = g == ((Object)0) ? 0 : generatedRecords[generatedLast].getUncompressed_sum();
		uint32_t index_list_size_add = ModernizedCProgram.lzma_vli_size(unpadded_size) + ModernizedCProgram.lzma_vli_size(uncompressed_size);
		Object generatedNode = s.getNode();
		Object generatedRecord_count = s.getRecord_count();
		Object generatedIndex_list_size = s.getIndex_list_size();
		Object generatedStream_padding = s.getStream_padding();
		// Check that the file size will stay within limits.if (ModernizedCProgram.index_file_size(generatedNode.getCompressed_base(), compressed_base + unpadded_size, generatedRecord_count + 1, generatedIndex_list_size + index_list_size_add, generatedStream_padding) == LZMA_VLI_UNKNOWN) {
			return LZMA_DATA_ERROR;
		} 
		// that can be stored in the Backward Size field.if (.index_size(generatedRecord_count + 1, generatedIndex_list_size + index_list_size_add) > LZMA_BACKWARD_SIZE_MAX) {
			return LZMA_DATA_ERROR;
		} 
		Object generatedAllocated = g.getAllocated();
		Object generatedPrealloc = this.getPrealloc();
		Object generatedGroups = s.getGroups();
		if (g != ((Object)0) && generatedLast + 1 < generatedAllocated) {
			++generatedLast;
		} else {
				g = ModernizedCProgram.lzma_alloc( + generatedPrealloc * , allocator);
				if (g == ((Object)0)) {
					return LZMA_MEM_ERROR;
				} 
				g.setLast(0);
				g.setAllocated(generatedPrealloc);
				this.setPrealloc(512);
				generatedNode.setUncompressed_base(uncompressed_base);
				generatedNode.setCompressed_base(compressed_base);
				g.setNumber_base(generatedRecord_count + 1);
				ModernizedCProgram.index_tree_append(generatedGroups, generatedNode);
		} 
		// There is space in the last group at least for one Record.
		// Add the new Record to the group.// Add the new Record to the group.generatedRecords[generatedLast].setUncompressed_sum(uncompressed_base + uncompressed_size);
		generatedRecords[generatedLast].setUnpadded_sum(compressed_base + unpadded_size);
		// Update the totals.// Update the totals.++generatedRecord_count;
		generatedIndex_list_size += index_list_size_add;
		Object generatedTotal_size = this.getTotal_size();
		generatedTotal_size += .vli_ceil4(unpadded_size);
		Object generatedUncompressed_size = this.getUncompressed_size();
		generatedUncompressed_size += uncompressed_size;
		++generatedRecord_count;
		generatedIndex_list_size += index_list_size_add;
		return LZMA_OK;
	}
	public Object lzma_index_cat(lzma_index_s src, Object allocator) {
		 dest_file_size = ModernizedCProgram.lzma_index_file_size(dest);
		Object generatedUncompressed_size = this.getUncompressed_size();
		// Check that we don't exceed the file size limits.if (dest_file_size + ModernizedCProgram.lzma_index_file_size(src) > LZMA_VLI_MAX || generatedUncompressed_size + generatedUncompressed_size > LZMA_VLI_MAX) {
			return LZMA_DATA_ERROR;
		} 
		Object generatedRecord_count = this.getRecord_count();
		Object generatedIndex_list_size = this.getIndex_list_size();
		{ 
			 dest_size = .index_size_unpadded(generatedRecord_count, generatedIndex_list_size);
			 src_size = .index_size_unpadded(generatedRecord_count, generatedIndex_list_size);
			if (.vli_ceil4(dest_size + src_size) > LZMA_BACKWARD_SIZE_MAX) {
				return LZMA_DATA_ERROR;
			} 
		}
		 generatedStreams = this.getStreams();
		Object generatedRightmost = generatedStreams.getRightmost();
		Object generatedLast = g.getLast();
		Object generatedAllocated = g.getAllocated();
		Object generatedNode = g.getNode();
		Object generatedNumber_base = g.getNumber_base();
		Object generatedRecords = newg.getRecords();
		{ 
			index_stream s = (index_stream)(generatedRightmost);
			index_group g = (index_group)(generatedRightmost);
			if (g != ((Object)0) && generatedLast + 1 < generatedAllocated) {
				((generatedNode.getLeft() == ((Object)0)) ? (Object)0 : ._assert("g->node.left == NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\index.c", 799));
				((generatedNode.getRight() == ((Object)0)) ? (Object)0 : ._assert("g->node.right == NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\index.c", 800));
				index_group newg = ModernizedCProgram.lzma_alloc( + (generatedLast + 1) * , allocator);
				if (newg == ((Object)0)) {
					return LZMA_MEM_ERROR;
				} 
				newg.setNode(generatedNode);
				newg.setAllocated(generatedLast + 1);
				newg.setLast(generatedLast);
				newg.setNumber_base(generatedNumber_base);
				.memcpy(generatedRecords, generatedRecords, generatedAllocated * );
				if (generatedNode.getParent() != ((Object)0)) {
					((generatedNode.getParent().getRight() == generatedNode) ? (Object)0 : ._assert("g->node.parent->right == &g->node", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\index.c", 818));
					generatedNode.getParent().setRight(generatedNode);
				} 
				if (ModernizedCProgram.s.getGroups().getLeftmost() == generatedNode) {
					((ModernizedCProgram.s.getGroups().getRoot() == generatedNode) ? (Object)0 : ._assert("s->groups.root == &g->node", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\index.c", 823));
					ModernizedCProgram.s.getGroups().setLeftmost(generatedNode);
					ModernizedCProgram.s.getGroups().setRoot(generatedNode);
				} 
				if (generatedRightmost == generatedNode) {
					ModernizedCProgram.s.getGroups().setRightmost(generatedNode);
				} 
				ModernizedCProgram.lzma_free(g, allocator);
			} 
		}
		// Add all the Streams from src to dest. Update the base offsets// of each Stream from src.index_cat_info info = new index_cat_info(, , , , );
		Object generatedRoot = generatedStreams.getRoot();
		(index_stream)(generatedRoot).index_cat_helper(info);
		// Update info about all the combined Streams.// Update info about all the combined Streams.generatedUncompressed_size += generatedUncompressed_size;
		Object generatedTotal_size = this.getTotal_size();
		generatedTotal_size += generatedTotal_size;
		generatedRecord_count += generatedRecord_count;
		generatedIndex_list_size += generatedIndex_list_size;
		Object generatedChecks = src.getChecks();
		this.setChecks(ModernizedCProgram.lzma_index_checks(dest) | generatedChecks);
		// There's nothing else left in src than the base structure.// There's nothing else left in src than the base structure.ModernizedCProgram.lzma_free(src, allocator);
		return LZMA_OK;
	}
	public lzma_index_s lzma_index_dup(Object src, Object allocator) {
		lzma_index_s lzma_index_s = new lzma_index_s();
		// Allocate the base structure (no initial Stream).lzma_index dest = lzma_index_s.index_init_plain(allocator);
		if (dest == ((Object)0)) {
			return ((Object)0);
		} 
		// Copy the totals.// Copy the totals.dest.setUncompressed_size(src.getUncompressed_size());
		dest.setTotal_size(src.getTotal_size());
		dest.setRecord_count(src.getRecord_count());
		dest.setIndex_list_size(src.getIndex_list_size());
		// Copy the Streams and the groups in them.index_stream srcstream = (index_stream)(src.getStreams().getLeftmost());
		 generatedStreams = dest.getStreams();
		Object generatedNode = deststream.getNode();
		do {
			index_stream deststream = ModernizedCProgram.index_dup_stream(srcstream, allocator);
			if (deststream == ((Object)0)) {
				dest.lzma_index_end(allocator);
				return ((Object)0);
			} 
			ModernizedCProgram.index_tree_append(generatedStreams, generatedNode);
			srcstream = ModernizedCProgram.index_tree_next(generatedNode);
		} while (srcstream != ((Object)0));
		return dest;/// Indexing for lzma_index_iter.internal[]
	}
	public  getStreams() {
		return streams;
	}
	public void setStreams( newStreams) {
		streams = newStreams;
	}
	public Object getUncompressed_size() {
		return uncompressed_size;
	}
	public void setUncompressed_size(Object newUncompressed_size) {
		uncompressed_size = newUncompressed_size;
	}
	public Object getTotal_size() {
		return total_size;
	}
	public void setTotal_size(Object newTotal_size) {
		total_size = newTotal_size;
	}
	public Object getRecord_count() {
		return record_count;
	}
	public void setRecord_count(Object newRecord_count) {
		record_count = newRecord_count;
	}
	public Object getIndex_list_size() {
		return index_list_size;
	}
	public void setIndex_list_size(Object newIndex_list_size) {
		index_list_size = newIndex_list_size;
	}
	public Object getPrealloc() {
		return prealloc;
	}
	public void setPrealloc(Object newPrealloc) {
		prealloc = newPrealloc;
	}
	public Object getChecks() {
		return checks;
	}
	public void setChecks(Object newChecks) {
		checks = newChecks;
	}
}
/// AVL-tree containing the Stream(s). Often there is just one
/// Stream, but using a tree keeps lookups fast even when there
