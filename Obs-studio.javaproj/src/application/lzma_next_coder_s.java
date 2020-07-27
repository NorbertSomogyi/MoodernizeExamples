package application;

/// Hold data and function pointers of the next filter in the chain.
public class lzma_next_coder_s {
	private lzma_coder_s coder;
	private Object id;
	private Object init;
	private Object code;
	private Object end;
	private Object get_check;
	private Object memconfig;
	private Object update;
	
	public lzma_next_coder_s(lzma_coder_s coder, Object id, Object init, Object code, Object end, Object get_check, Object memconfig, Object update) {
		setCoder(coder);
		setId(id);
		setInit(init);
		setCode(code);
		setEnd(end);
		setGet_check(get_check);
		setMemconfig(memconfig);
		setUpdate(update);
	}
	public lzma_next_coder_s() {
	}
	
	public Object lzma_lz_decoder_init(Object allocator, Object[] filters, Object lz_init) {
		lzma_coder_s generatedCoder = this.getCoder();
		 generatedDict = generatedCoder.getDict();
		// Allocate the base structure if it isn't already allocated.if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(lz_decode);
			this.setEnd(lz_decoder_end);
			generatedDict.setBuf(((Object)0));
			generatedDict.setSize(0);
			generatedCoder.setLz(/*Error: Unsupported expression*/);
			generatedCoder.setNext(/*Error: Unsupported expression*/);
		} 
		// Allocate and initialize the LZ-based decoder. It will also give// us the dictionary size.lzma_lz_options lz_options = new lzma_lz_options();
		 generatedLz = generatedCoder.getLz();
		do {
			 ret_ = (/*Error: Function owner not recognized*/lz_init(generatedLz, allocator, filters[0].getOptions(), lz_options));
			if (ret_ != LZMA_OK) {
				return ret_;
			} 
		} while (0);// If the dictionary size is very small, increase it to 4096 bytes.// This is to prevent constant wrapping of the dictionary, which
		Object generatedDict_size = lz_options.getDict_size();
		// would slow things down. The downside is that since we don't check// separately for the real dictionary size, we may happily accept// corrupt files.if (generatedDict_size < 4096) {
			lz_options.setDict_size(4096);
		} 
		// dictionary to the output buffer, since applications are// recommended to give aligned buffers to liblzma.//// Avoid integer overflow.if (generatedDict_size > -1024 - 15) {
			return LZMA_MEM_ERROR;
		} 
		lz_options.setDict_size((generatedDict_size + 15) & ~((size_t)(true)));
		Object generatedSize = generatedDict.getSize();
		Object generatedBuf = generatedDict.getBuf();
		// Allocate and initialize the dictionary.if (generatedSize != generatedDict_size) {
			ModernizedCProgram.lzma_free(generatedBuf, allocator);
			generatedDict.setBuf(ModernizedCProgram.lzma_alloc(generatedDict_size, allocator));
			if (generatedBuf == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			generatedDict.setSize(generatedDict_size);
		} 
		generatedCoder.lz_decoder_reset();
		Object generatedPreset_dict = lz_options.getPreset_dict();
		Object generatedPreset_dict_size = lz_options.getPreset_dict_size();
		// Use the preset dictionary if it was given to us.if (generatedPreset_dict != ((Object)0) && generatedPreset_dict_size > 0) {
			size_t copy_size = ((generatedPreset_dict_size) < (generatedDict_size) ? (generatedPreset_dict_size) : (generatedDict_size));
			size_t offset = generatedPreset_dict_size - copy_size;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBuf, generatedPreset_dict + offset, copy_size);
			generatedDict.setPos(copy_size);
			generatedDict.setFull(copy_size);
		} 
		// Miscellaneous initializations// Miscellaneous initializationsgeneratedCoder.setNext_finished(0);
		generatedCoder.setThis_finished(0);
		 generatedTemp = generatedCoder.getTemp();
		generatedTemp.setPos(0);
		generatedTemp.setSize(0);
		lzma_next_coder_s generatedNext = generatedCoder.getNext();
		// Initialize the next filter in the chain, if any.return generatedNext.lzma_next_filter_init(allocator, filters + 1);
	}
	public Object arm_coder_init(Object allocator, Object filters, boolean is_encoder) {
		return next.lzma_simple_coder_init(allocator, filters, arm_code, 0, 4, 4, is_encoder);
	}
	public Object lzma_simple_arm_encoder_init(Object allocator, Object filters) {
		return next.arm_coder_init(allocator, filters, 1);
	}
	public Object lzma_simple_arm_decoder_init(Object allocator, Object filters) {
		return next.arm_coder_init(allocator, filters, 0);
	}
	public Object lzma_delta_decoder_init(Object allocator, Object filters) {
		this.setCode(delta_decode);
		return next.lzma_delta_coder_init(allocator, filters);
	}
	public Object lzma_delta_encoder_init(Object allocator, Object filters) {
		this.setCode(delta_encode);
		this.setUpdate(delta_encoder_update);
		return next.lzma_delta_coder_init(allocator, filters);
	}
	public Object auto_decoder_init(Object allocator, Object memlimit, Object flags) {
		Object generatedInit = (next).getInit();
		do {
			if ((uintptr_t)(auto_decoder_init) != generatedInit) {
				next.lzma_next_end(allocator);
			} 
			(next).setInit((uintptr_t)(auto_decoder_init));
		} while (0);
		if (memlimit == 0) {
			return LZMA_PROG_ERROR;
		} 
		if (flags & ~(LZMA_TELL_NO_CHECK | LZMA_TELL_UNSUPPORTED_CHECK | LZMA_TELL_ANY_CHECK | LZMA_CONCATENATED)) {
			return LZMA_OPTIONS_ERROR;
		} 
		lzma_coder_s generatedCoder = this.getCoder();
		if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(auto_decode);
			this.setEnd(auto_decoder_end);
			this.setGet_check(auto_decoder_get_check);
			this.setMemconfig(auto_decoder_memconfig);
			generatedCoder.setNext(/*Error: Unsupported expression*/);
		} 
		generatedCoder.setMemlimit(memlimit);
		generatedCoder.setFlags(flags);
		generatedCoder.setSequence(.SEQ_INIT);
		return LZMA_OK;
	}
	public Object lzma_delta_coder_init(Object allocator, Object[] filters) {
		lzma_coder_s generatedCoder = this.getCoder();
		// Allocate memory for the decoder if needed.if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setEnd(delta_coder_end);
			generatedCoder.setNext(/*Error: Unsupported expression*/);
		} 
		// Validate the options.if (ModernizedCProgram.lzma_delta_coder_memusage(filters[0].getOptions()) == -1024) {
			return LZMA_OPTIONS_ERROR;
		} 
		// Set the delta distance. opt = filters[0].getOptions();
		generatedCoder.setDistance(opt.getDist());
		// Initialize the rest of the variables.// Initialize the rest of the variables.generatedCoder.setPos(0);
		Object generatedHistory = generatedCoder.getHistory();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedHistory, 0, LZMA_DELTA_DIST_MAX);
		lzma_next_coder_s generatedNext = generatedCoder.getNext();
		// Initialize the next decoder in the chain, if any.return generatedNext.lzma_next_filter_init(allocator, filters + 1);
	}
	public Object lzma_raw_decoder_init(Object allocator, Object options) {
		return next.lzma_raw_coder_init(allocator, options, (lzma_filter_find)(decoder_find), 0);
	}
	public Object lzma_next_filter_init(Object allocator, Object[] filters) {
		Object generatedInit = (next).getInit();
		do {
			if ((uintptr_t)(filters[0].getInit()) != generatedInit) {
				next.lzma_next_end(allocator);
			} 
			(next).setInit((uintptr_t)(generatedInit));
		} while (0);
		this.setId(filters[0].getId());
		return generatedInit == ((Object)0) ? LZMA_OK : /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(next, allocator, filters);
	}
	public Object lzma_next_filter_update(Object allocator, Object[] reversed_filters) {
		Object generatedId = this.getId();
		// Check that the application isn't trying to change the Filter ID.// End of filters is indicated with LZMA_VLI_UNKNOWN in both// reversed_filters[0].id and next->id.if (reversed_filters[0].getId() != generatedId) {
			return LZMA_PROG_ERROR;
		} 
		if (generatedId == LZMA_VLI_UNKNOWN) {
			return LZMA_OK;
		} 
		Object generatedUpdate = this.getUpdate();
		((generatedUpdate != ((Object)0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("next->update != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\common.c", 114));
		lzma_coder_s generatedCoder = this.getCoder();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator, ((Object)0), reversed_filters);
	}
	public void lzma_next_end(Object allocator) {
		Object generatedInit = this.getInit();
		Object generatedEnd = this.getEnd();
		lzma_coder_s generatedCoder = this.getCoder();
		if (generatedInit != (uintptr_t)(((Object)0))) {
			if (generatedEnd != ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCoder, allocator);
			} else {
					ModernizedCProgram.lzma_free(generatedCoder, allocator);
			} 
			next = /*Error: Unsupported expression*/;
		} 
		// To avoid tiny end functions that simply call// lzma_free(coder, allocator), we allow leaving next->end
		return /*Error: Unsupported expression*/;//////////////////////////////////////
	}
	public Object lzma_raw_coder_init(Object allocator, Object[] options, Object coder_find, boolean is_encoder) {
		// Do some basic validation and get the number of filters.size_t count = new size_t();
		do {
			 ret_ = (ModernizedCProgram.validate_chain(options, count));
			if (ret_ != LZMA_OK) {
				return ret_;
			} 
		} while (0);
		// Set the filter functions and copy the options pointer.lzma_filter_info[] filters = new lzma_filter_info();
		if (is_encoder) {
			for (size_t i = 0;
			 i < count; ++i) {
				size_t j = count - i - 1;
				lzma_filter_coder fc = /*Error: Function owner not recognized*/coder_find(options[i].getId());
				if (fc == ((Object)0) || fc.getInit() == ((Object)0)) {
					return LZMA_OPTIONS_ERROR;
				} 
				filters[j].setId(options[i].getId());
				filters[j].setInit(fc.getInit());
				filters[j].setOptions(options[i].getOptions());
			}
		} else {
				for (size_t i = 0;
				 i < count; ++i) {
					lzma_filter_coder fc = /*Error: Function owner not recognized*/coder_find(options[i].getId());
					if (fc == ((Object)0) || fc.getInit() == ((Object)0)) {
						return LZMA_OPTIONS_ERROR;
					} 
					filters[i].setId(options[i].getId());
					filters[i].setInit(fc.getInit());
					filters[i].setOptions(options[i].getOptions());
				}
		} 
		// Terminate the array.// Terminate the array.filters[count].setId(LZMA_VLI_UNKNOWN);
		filters[count].setInit(((Object)0));
		// Initialize the filters. ret = next.lzma_next_filter_init(allocator, filters);
		if (ret != LZMA_OK) {
			next.lzma_next_end(allocator);
		} 
		return ret;
	}
	// At least for now, this is not used by any internal function.
	public Object alone_encoder_init(Object allocator, Object options) {
		Object generatedInit = (next).getInit();
		do {
			if ((uintptr_t)(alone_encoder_init) != generatedInit) {
				next.lzma_next_end(allocator);
			} 
			(next).setInit((uintptr_t)(alone_encoder_init));
		} while (0);
		lzma_coder_s generatedCoder = this.getCoder();
		if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(alone_encode);
			this.setEnd(alone_encoder_end);
			generatedCoder.setNext(/*Error: Unsupported expression*/);
		} 
		// Basic initializations// Basic initializationsgeneratedCoder.setSequence(.SEQ_HEADER);
		generatedCoder.setHeader_pos(0)// Encode the header:;// Encode the header:
		Object generatedHeader = generatedCoder.getHeader();
		// - Properties (1 byte)if (ModernizedCProgram.lzma_lzma_lclppb_encode(options, generatedHeader)) {
			return LZMA_OPTIONS_ERROR;
		} 
		// - Dictionary size (4 bytes)if (options.getDict_size() < LZMA_DICT_SIZE_MIN) {
			return LZMA_OPTIONS_ERROR;
		} 
		// allow any 32-bit integer, we do this to keep the decoder of liblzma// accepting the resulting files.uint32_t d = options.getDict_size() - 1;
		d |=  d >> 2;
		d |=  d >> 3;
		d |=  d >> 4;
		d |=  d >> 8;
		d |=  d >> 16;
		if (d != -1024) {
			++d;
		} 
		ModernizedCProgram.unaligned_write32le(generatedHeader + 1, d);
		/*Error: Function owner not recognized*/// - Uncompressed size (always unknown and using EOPM)/*Error: Function owner not recognized*/// - Uncompressed size (always unknown and using EOPM)memset(generatedHeader + 1 + 4, -1024, 8);
		// Initialize the LZMA encoder.lzma_filter_info[] filters = new lzma_filter_info[]{new lzma_filter_info(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/), new lzma_filter_info(/*Error: Invalid initializer*/)};
		lzma_next_coder_s generatedNext = generatedCoder.getNext();
		return generatedNext.lzma_next_filter_init(allocator, filters/*
		extern lzma_ret
		lzma_alone_encoder_init(lzma_next_coder *next, lzma_allocator *allocator,
				const lzma_options_alone *options)
		{
			lzma_next_coder_init(&alone_encoder_init, next, allocator, options);
		}
		*/);
	}
	public Object ia64_coder_init(Object allocator, Object filters, boolean is_encoder) {
		return next.lzma_simple_coder_init(allocator, filters, ia64_code, 0, 16, 16, is_encoder);
	}
	public Object lzma_simple_ia64_encoder_init(Object allocator, Object filters) {
		return next.ia64_coder_init(allocator, filters, 1);
	}
	public Object lzma_simple_ia64_decoder_init(Object allocator, Object filters) {
		return next.ia64_coder_init(allocator, filters, 0);
	}
	public Object lzma_stream_decoder_init(Object allocator, Object memlimit, Object flags) {
		Object generatedInit = (next).getInit();
		do {
			if ((uintptr_t)(ModernizedCProgram.lzma_stream_decoder_init) != generatedInit) {
				next.lzma_next_end(allocator);
			} 
			(next).setInit((uintptr_t)(ModernizedCProgram.lzma_stream_decoder_init));
		} while (0);
		if (memlimit == 0) {
			return LZMA_PROG_ERROR;
		} 
		if (flags & ~(LZMA_TELL_NO_CHECK | LZMA_TELL_UNSUPPORTED_CHECK | LZMA_TELL_ANY_CHECK | LZMA_CONCATENATED)) {
			return LZMA_OPTIONS_ERROR;
		} 
		lzma_coder_s generatedCoder = this.getCoder();
		if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(stream_decode);
			this.setEnd(stream_decoder_end);
			this.setGet_check(stream_decoder_get_check);
			this.setMemconfig(stream_decoder_memconfig);
			generatedCoder.setBlock_decoder(/*Error: Unsupported expression*/);
			generatedCoder.setIndex_hash(((Object)0));
		} 
		generatedCoder.setMemlimit(memlimit);
		generatedCoder.setMemusage((-1024 << 15));
		generatedCoder.setTell_no_check((flags & LZMA_TELL_NO_CHECK) != 0);
		generatedCoder.setTell_unsupported_check((flags & LZMA_TELL_UNSUPPORTED_CHECK) != 0);
		generatedCoder.setTell_any_check((flags & LZMA_TELL_ANY_CHECK) != 0);
		generatedCoder.setConcatenated((flags & LZMA_CONCATENATED) != 0);
		generatedCoder.setFirst_stream(1);
		return generatedCoder.stream_decoder_reset(allocator);
	}
	public Object lzma_index_encoder_init(Object allocator, Object i) {
		Object generatedInit = (next).getInit();
		do {
			if ((uintptr_t)(ModernizedCProgram.lzma_index_encoder_init) != generatedInit) {
				next.lzma_next_end(allocator);
			} 
			(next).setInit((uintptr_t)(ModernizedCProgram.lzma_index_encoder_init));
		} while (0);
		if (i == ((Object)0)) {
			return LZMA_PROG_ERROR;
		} 
		lzma_coder_s generatedCoder = this.getCoder();
		if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(index_encode);
			this.setEnd(index_encoder_end);
		} 
		generatedCoder.index_encoder_reset(i);
		return LZMA_OK;
	}
	public Object lzma_lzma_encoder_init(Object allocator, Object filters) {
		return next.lzma_lz_encoder_init(allocator, filters, lzma_encoder_init);
	}
	public Object lzma_lzma2_decoder_init(Object allocator, Object[] filters) {
		// LZMA2 can only be the last filter in the chain. This is enforced// by the raw_decoder initialization.// LZMA2 can only be the last filter in the chain. This is enforced// by the raw_decoder initialization.((filters[1].getInit() == ((Object)0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("filters[1].init == NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lzma2_decoder.c", 256));
		return next.lzma_lz_decoder_init(allocator, filters, lzma2_decoder_init);
	}
	public Object powerpc_coder_init(Object allocator, Object filters, boolean is_encoder) {
		return next.lzma_simple_coder_init(allocator, filters, powerpc_code, 0, 4, 4, is_encoder);
	}
	public Object lzma_simple_powerpc_encoder_init(Object allocator, Object filters) {
		return next.powerpc_coder_init(allocator, filters, 1);
	}
	public Object lzma_simple_powerpc_decoder_init(Object allocator, Object filters) {
		return next.powerpc_coder_init(allocator, filters, 0);
	}
	public Object lzma_lzma_decoder_init(Object allocator, Object[] filters) {
		// LZMA can only be the last filter in the chain. This is enforced// by the raw_decoder initialization.// LZMA can only be the last filter in the chain. This is enforced// by the raw_decoder initialization.((filters[1].getInit() == ((Object)0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("filters[1].init == NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\lzma_decoder.c", 986));
		return next.lzma_lz_decoder_init(allocator, filters, lzma_decoder_init);
	}
	public Object lzma_alone_decoder_init(Object allocator, Object memlimit, boolean picky) {
		Object generatedInit = (next).getInit();
		do {
			if ((uintptr_t)(ModernizedCProgram.lzma_alone_decoder_init) != generatedInit) {
				next.lzma_next_end(allocator);
			} 
			(next).setInit((uintptr_t)(ModernizedCProgram.lzma_alone_decoder_init));
		} while (0);
		if (memlimit == 0) {
			return LZMA_PROG_ERROR;
		} 
		lzma_coder_s generatedCoder = this.getCoder();
		if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(alone_decode);
			this.setEnd(alone_decoder_end);
			this.setMemconfig(alone_decoder_memconfig);
			generatedCoder.setNext(/*Error: Unsupported expression*/);
		} 
		generatedCoder.setSequence(.SEQ_PROPERTIES);
		generatedCoder.setPicky(picky);
		generatedCoder.setPos(0);
		Object generatedOptions = generatedCoder.getOptions();
		generatedOptions.setDict_size(0);
		generatedOptions.setPreset_dict(((Object)0));
		generatedOptions.setPreset_dict_size(0);
		generatedCoder.setUncompressed_size(0);
		generatedCoder.setMemlimit(memlimit);
		generatedCoder.setMemusage((-1024 << 15));
		return LZMA_OK;
	}
	public Object sparc_coder_init(Object allocator, Object filters, boolean is_encoder) {
		return next.lzma_simple_coder_init(allocator, filters, sparc_code, 0, 4, 4, is_encoder);
	}
	public Object lzma_simple_sparc_encoder_init(Object allocator, Object filters) {
		return next.sparc_coder_init(allocator, filters, 1);
	}
	public Object lzma_simple_sparc_decoder_init(Object allocator, Object filters) {
		return next.sparc_coder_init(allocator, filters, 0);
	}
	public Object armthumb_coder_init(Object allocator, Object filters, boolean is_encoder) {
		return next.lzma_simple_coder_init(allocator, filters, armthumb_code, 0, 4, 2, is_encoder);
	}
	public Object lzma_simple_armthumb_encoder_init(Object allocator, Object filters) {
		return next.armthumb_coder_init(allocator, filters, 1);
	}
	public Object lzma_simple_armthumb_decoder_init(Object allocator, Object filters) {
		return next.armthumb_coder_init(allocator, filters, 0);
	}
	public Object x86_coder_init(Object allocator, Object filters, boolean is_encoder) {
		 ret = next.lzma_simple_coder_init(allocator, filters, x86_code, /*Error: Unsupported expression*/, 5, 1, is_encoder);
		lzma_coder_s generatedCoder = this.getCoder();
		Object generatedSimple = generatedCoder.getSimple();
		if (ret == LZMA_OK) {
			generatedSimple.setPrev_mask(0);
			generatedSimple.setPrev_pos((uint32_t)(true));
		} 
		return ret;
	}
	public Object lzma_simple_x86_encoder_init(Object allocator, Object filters) {
		return next.x86_coder_init(allocator, filters, 1);
	}
	public Object lzma_simple_x86_decoder_init(Object allocator, Object filters) {
		return next.x86_coder_init(allocator, filters, 0);
	}
	public Object lzma_simple_coder_init(Object allocator, Object[] filters, Object filter, Object simple_size, Object unfiltered_max, Object alignment, boolean is_encoder) {
		lzma_coder_s generatedCoder = this.getCoder();
		Object generatedSimple = generatedCoder.getSimple();
		// Allocate memory for the lzma_coder structure if needed.if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/ + 2 * unfiltered_max, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(simple_code);
			this.setEnd(simple_coder_end);
			this.setUpdate(simple_coder_update);
			generatedCoder.setNext(/*Error: Unsupported expression*/);
			generatedCoder.setFilter(filter);
			generatedCoder.setAllocated(2 * unfiltered_max);
			if (simple_size > 0) {
				generatedCoder.setSimple(ModernizedCProgram.lzma_alloc(simple_size, allocator));
				if (generatedSimple == ((Object)0)) {
					return LZMA_MEM_ERROR;
				} 
			} else {
					generatedCoder.setSimple(((Object)0));
			} 
		} 
		// Here we allocate space also for the temporary buffer. We// need twice the size of unfiltered_max, because then it
		Object generatedNow_pos = generatedCoder.getNow_pos();
		if (filters[0].getOptions() != ((Object)0)) {
			 simple = filters[0].getOptions();
			generatedCoder.setNow_pos(simple.getStart_offset());
			if (generatedNow_pos & (alignment - 1)) {
				return LZMA_OPTIONS_ERROR;
			} 
		} else {
				generatedCoder.setNow_pos(0);
		} 
		// Reset variables.// Reset variables.generatedCoder.setIs_encoder(is_encoder);
		generatedCoder.setEnd_was_reached(0);
		generatedCoder.setPos(0);
		generatedCoder.setFiltered(0);
		generatedCoder.setSize(0);
		lzma_next_coder_s generatedNext = generatedCoder.getNext();
		return generatedNext.lzma_next_filter_init(allocator, filters + 1);
	}
	public Object lzma_stream_encoder_init(Object allocator, Object filters, Object check) {
		Object generatedInit = (next).getInit();
		do {
			if ((uintptr_t)(ModernizedCProgram.lzma_stream_encoder_init) != generatedInit) {
				next.lzma_next_end(allocator);
			} 
			(next).setInit((uintptr_t)(ModernizedCProgram.lzma_stream_encoder_init));
		} while (0);
		if (filters == ((Object)0)) {
			return LZMA_PROG_ERROR;
		} 
		lzma_coder_s generatedCoder = this.getCoder();
		Object generatedFilters = generatedCoder.getFilters();
		if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(stream_encode);
			this.setEnd(stream_encoder_end);
			this.setUpdate(stream_encoder_update);
			generatedFilters[0].setId(LZMA_VLI_UNKNOWN);
			generatedCoder.setBlock_encoder(/*Error: Unsupported expression*/);
			generatedCoder.setIndex_encoder(/*Error: Unsupported expression*/);
			generatedCoder.setIndex(((Object)0));
		} 
		// Basic initializations// Basic initializationsgeneratedCoder.setSequence(.SEQ_STREAM_HEADER);
		Object generatedBlock_options = generatedCoder.getBlock_options();
		generatedBlock_options.setVersion(0);
		generatedBlock_options.setCheck(check);
		Object generatedIndex = generatedCoder.getIndex();
		// Initialize the Index// Initialize the IndexgeneratedIndex.lzma_index_end(allocator);
		lzma_index_s lzma_index_s = new lzma_index_s();
		generatedCoder.setIndex(lzma_index_s.lzma_index_init(allocator));
		if (generatedIndex == ((Object)0)) {
			return LZMA_MEM_ERROR;
		} 
		// Encode the Stream Header stream_flags = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		Object generatedBuffer = generatedCoder.getBuffer();
		do {
			 ret_ = (ModernizedCProgram.lzma_stream_header_encode(stream_flags, generatedBuffer));
			if (ret_ != LZMA_OK) {
				return ret_;
			} 
		} while (0);
		generatedCoder.setBuffer_pos(0);
		generatedCoder.setBuffer_size(LZMA_STREAM_HEADER_SIZE)// Initialize the Block encoder. This way we detect unsupported;// Initialize the Block encoder. This way we detect unsupported
		// filter chains when initializing the Stream encoder instead of// giving an error after Stream Header has already written out.return generatedCoder.stream_encoder_update(allocator, filters, ((Object)0));
	}
	public Object lzma_lzma2_encoder_init(Object allocator, Object filters) {
		return next.lzma_lz_encoder_init(allocator, filters, lzma2_encoder_init);
	}
	public Object lzma_raw_encoder_init(Object allocator, Object options) {
		return next.lzma_raw_coder_init(allocator, options, (lzma_filter_find)(encoder_find), 1);
	}
	public Object lzma_block_decoder_init(Object allocator, Object block) {
		Object generatedInit = (next).getInit();
		do {
			if ((uintptr_t)(ModernizedCProgram.lzma_block_decoder_init) != generatedInit) {
				next.lzma_next_end(allocator);
			} 
			(next).setInit((uintptr_t)(ModernizedCProgram.lzma_block_decoder_init));
		} while (0);// Validate the options. lzma_block_unpadded_size() does that for us
		// except for Uncompressed Size and filters. Filters are validated// by the raw decoder.if (ModernizedCProgram.lzma_block_unpadded_size(block) == 0 || !/*Error: Function owner not recognized*/lzma_vli_is_valid(block.getUncompressed_size())) {
			return LZMA_PROG_ERROR;
		} 
		lzma_coder_s generatedCoder = this.getCoder();
		// Allocate and initialize *next->coder if needed.if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(block_decode);
			this.setEnd(block_decoder_end);
			generatedCoder.setNext(/*Error: Unsupported expression*/);
		} 
		// Basic initializations// Basic initializationsgeneratedCoder.setSequence(.SEQ_CODE);
		generatedCoder.setBlock(block);
		generatedCoder.setCompressed_size(0);
		generatedCoder.setUncompressed_size(0)// If Compressed Size is not known, we calculate the maximum allowed;// If Compressed Size is not known, we calculate the maximum allowed
		// value so that encoded size of the Block (including Block Padding)// is still a valid VLI and a multiple of four.// value so that encoded size of the Block (including Block Padding)// is still a valid VLI and a multiple of four.generatedCoder.setCompressed_limit(block.getCompressed_size() == LZMA_VLI_UNKNOWN ? (LZMA_VLI_MAX & ~/*Error: Function owner not recognized*/LZMA_VLI_C(3)) - block.getHeader_size() - ModernizedCProgram.lzma_check_size(block.getCheck()) : block.getCompressed_size());
		// Initialize the check. It's caller's problem if the Check ID is not// supported, and the Block decoder cannot verify the Check field.// Caller can test lzma_check_is_supported(block->check).// Initialize the check. It's caller's problem if the Check ID is not// supported, and the Block decoder cannot verify the Check field.// Caller can test lzma_check_is_supported(block->check).generatedCoder.setCheck_pos(0);
		Object generatedCheck = generatedCoder.getCheck();
		ModernizedCProgram.lzma_check_init(generatedCheck, generatedCheck);
		lzma_next_coder_s generatedNext = generatedCoder.getNext();
		// Initialize the filter chain.return generatedNext.lzma_raw_decoder_init(allocator, block.getFilters());
	}
	public Object lzma_block_encoder_init(Object allocator, Object block) {
		Object generatedInit = (next).getInit();
		do {
			if ((uintptr_t)(ModernizedCProgram.lzma_block_encoder_init) != generatedInit) {
				next.lzma_next_end(allocator);
			} 
			(next).setInit((uintptr_t)(ModernizedCProgram.lzma_block_encoder_init));
		} while (0);
		if (block == ((Object)0)) {
			return LZMA_PROG_ERROR;
		} 
		// check the version first.if (block.getVersion() != 0) {
			return LZMA_OPTIONS_ERROR;
		} 
		// thus not create a proper Block.if ((int)(block.getCheck()) > 15) {
			return LZMA_PROG_ERROR;
		} 
		if (!ModernizedCProgram.lzma_check_is_supported(block.getCheck())) {
			return LZMA_UNSUPPORTED_CHECK;
		} 
		lzma_coder_s generatedCoder = this.getCoder();
		// Allocate and initialize *next->coder if needed.if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(block_encode);
			this.setEnd(block_encoder_end);
			this.setUpdate(block_encoder_update);
			generatedCoder.setNext(/*Error: Unsupported expression*/);
		} 
		// Basic initializations// Basic initializationsgeneratedCoder.setSequence(.SEQ_CODE);
		generatedCoder.setBlock(block);
		generatedCoder.setCompressed_size(0);
		generatedCoder.setUncompressed_size(0);
		generatedCoder.setPos(0);
		Object generatedCheck = generatedCoder.getCheck();
		// Initialize the check// Initialize the checkModernizedCProgram.lzma_check_init(generatedCheck, generatedCheck);
		lzma_next_coder_s generatedNext = generatedCoder.getNext();
		// Initialize the requested filters.return generatedNext.lzma_raw_encoder_init(allocator, block.getFilters());
	}
	public Object lzma_lz_encoder_init(Object allocator, Object[] filters, Object lz_init) {
		lzma_coder_s generatedCoder = this.getCoder();
		 generatedLz = generatedCoder.getLz();
		Object generatedMf = generatedCoder.getMf();
		// We need that the CRC32 table has been initialized.// Allocate and initialize the base data structure.if (generatedCoder == ((Object)0)) {
			this.setCoder(ModernizedCProgram.lzma_alloc(/*Error: Unsupported expression*/, allocator));
			if (generatedCoder == ((Object)0)) {
				return LZMA_MEM_ERROR;
			} 
			this.setCode(lz_encode);
			this.setEnd(lz_encoder_end);
			this.setUpdate(lz_encoder_update);
			generatedLz.setCoder(((Object)0));
			generatedLz.setCode(((Object)0));
			generatedLz.setEnd(((Object)0));
			generatedMf.setBuffer(((Object)0));
			generatedMf.setHash(((Object)0));
			generatedMf.setHash_size_sum(0);
			generatedMf.setSons_count(0);
			generatedCoder.setNext(/*Error: Unsupported expression*/);
		} 
		// Initialize the LZ-based encoder.lzma_lz_options lz_options = new lzma_lz_options();
		do {
			 ret_ = (/*Error: Function owner not recognized*/lz_init(generatedLz, allocator, filters[0].getOptions(), lz_options));
			if (ret_ != LZMA_OK) {
				return ret_;
			} 
		} while (0);
		// Setup the size information into next->coder->mf and deallocate// old buffers if they have wrong size.if (generatedMf.lz_encoder_prepare(allocator, lz_options)) {
			return LZMA_OPTIONS_ERROR;
		} 
		// the initialization.if (generatedMf.lz_encoder_init(allocator, lz_options)) {
			return LZMA_MEM_ERROR;
		} 
		lzma_next_coder_s generatedNext = generatedCoder.getNext();
		// Initialize the next filter in the chain, if any.return generatedNext.lzma_next_filter_init(allocator, filters + 1);
	}
	public lzma_coder_s getCoder() {
		return coder;
	}
	public void setCoder(lzma_coder_s newCoder) {
		coder = newCoder;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getInit() {
		return init;
	}
	public void setInit(Object newInit) {
		init = newInit;
	}
	public Object getCode() {
		return code;
	}
	public void setCode(Object newCode) {
		code = newCode;
	}
	public Object getEnd() {
		return end;
	}
	public void setEnd(Object newEnd) {
		end = newEnd;
	}
	public Object getGet_check() {
		return get_check;
	}
	public void setGet_check(Object newGet_check) {
		get_check = newGet_check;
	}
	public Object getMemconfig() {
		return memconfig;
	}
	public void setMemconfig(Object newMemconfig) {
		memconfig = newMemconfig;
	}
	public Object getUpdate() {
		return update;
	}
	public void setUpdate(Object newUpdate) {
		update = newUpdate;
	}
}
/// Pointer to coder-specific data
