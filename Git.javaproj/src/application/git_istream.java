package application;

public class git_istream {
	private Object vtbl;
	private long size;
	private git_zstream z;
	private  z_state;
	private  u;
	
	public git_istream(Object vtbl, long size, git_zstream z,  z_state,  u) {
		setVtbl(vtbl);
		setSize(size);
		setZ(z);
		setZ_state(z_state);
		setU(u);
	}
	public git_istream() {
	}
	
	public int close_istream() {
		int r = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(st);
		ModernizedCProgram.free(st);
		return r;
	}
	public Object read_istream(Object buf, Object sz) {
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(st, buf, sz);
	}
	public git_istream open_istream(Object oid, object_type type, Long size, stream_filter filter) {
		git_istream st = new git_istream();
		object_info oi = new object_info(((Object)0));
		object_id real = ModernizedCProgram.the_repository.lookup_replace_object(oid);
		input_source src = oi.istream_source(real, type);
		if (input_source.src < 0) {
			return ((Object)0);
		} 
		st = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(st, oi, real, type)) {
			if (ModernizedCProgram.open_istream_incore(st, oi, real, type)) {
				ModernizedCProgram.free(st);
				return ((Object)0);
			} 
		} 
		if (filter) {
			git_istream nst = st.attach_stream_filter(/* Add "&& !is_null_stream_filter(filter)" for performance */filter);
			if (!nst) {
				st.close_istream();
				return ((Object)0);
			} 
			st = nst;
		} 
		long generatedSize = st.getSize();
		size = generatedSize;
		return st/*****************************************************************
		 *
		 * Common helpers
		 *
		 *****************************************************************/;
	}
	public void close_deflated_stream() {
		 generatedZ_state = this.getZ_state();
		git_zstream generatedZ = this.getZ();
		if (generatedZ_state == .z_used) {
			generatedZ.git_inflate_end();
		} 
	}
	public int close_istream_filtered() {
		 generatedU = this.getU();
		Object generatedFiltered = generatedU.getFiltered();
		generatedFiltered.getFilter().free_stream_filter();
		return generatedFiltered.getUpstream().close_istream();
	}
	public Object read_istream_filtered(Byte buf, Object sz) {
		 generatedU = this.getU();
		Object generatedFiltered = generatedU.getFiltered();
		filtered_istream fs = (generatedFiltered);
		size_t filled = 0;
		int generatedO_ptr = fs.getO_ptr();
		int generatedO_end = fs.getO_end();
		Object generatedObuf = fs.getObuf();
		int generatedI_ptr = fs.getI_ptr();
		int generatedI_end = fs.getI_end();
		stream_filter generatedFilter = fs.getFilter();
		Object generatedIbuf = fs.getIbuf();
		int generatedInput_finished = fs.getInput_finished();
		git_istream generatedUpstream = fs.getUpstream();
		while (sz) {
			if (generatedO_ptr < generatedO_end) {
				size_t to_move = generatedO_end - generatedO_ptr;
				if (sz < to_move) {
					to_move = sz;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + filled, generatedObuf + generatedO_ptr, to_move);
				generatedO_ptr += to_move;
				sz -= to_move;
				filled += to_move;
				continue;
			} 
			fs.setO_end(fs.setO_ptr(0));
			if (generatedI_ptr < generatedI_end) {
				size_t to_feed = generatedI_end - generatedI_ptr;
				size_t to_receive = (1024 * 16);
				if (generatedFilter.stream_filter(generatedIbuf + generatedI_ptr, to_feed, generatedObuf, to_receive)) {
					return -1;
				} 
				fs.setI_ptr(generatedI_end - to_feed);
				fs.setO_end((1024 * 16) - to_receive);
				continue;
			} 
			if (generatedInput_finished) {
				size_t to_receive = (1024 * 16);
				if (generatedFilter.stream_filter(((Object)0), ((Object)0), generatedObuf, to_receive)) {
					return -1;
				} 
				fs.setO_end((1024 * 16) - to_receive);
				if (!generatedO_end) {
					break;
				} 
				continue;
			} 
			fs.setI_end(fs.setI_ptr(0));
			if (!generatedInput_finished) {
				fs.setI_end(generatedUpstream.read_istream(generatedIbuf, (1024 * 16)));
				if (generatedI_end < 0) {
					return -1;
				} 
				if (generatedI_end) {
					continue;
				} 
			} 
			fs.setInput_finished(1);
		}
		return filled;
	}
	public git_istream attach_stream_filter(stream_filter filter) {
		git_istream ifs = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		 generatedU = ifs.getU();
		Object generatedFiltered = generatedU.getFiltered();
		filtered_istream fs = (generatedFiltered);
		ifs.setVtbl(ModernizedCProgram.filtered_vtbl);
		fs.setUpstream(st);
		fs.setFilter(filter);
		fs.setI_end(fs.setI_ptr(0));
		fs.setO_end(fs.setO_ptr(0));
		fs.setInput_finished(0);
		ifs.setSize(-/* unknown */1);
		return ifs/*****************************************************************
		 *
		 * Loose object stream
		 *
		 *****************************************************************/;
	}
	public Object read_istream_loose(Byte buf, Object sz) {
		size_t total_read = 0;
		 generatedZ_state = this.getZ_state();
		switch (generatedZ_state) {
		case .z_error:
				return -1;
		case .z_done:
				return 0;
		default:
				break;
		}
		 generatedU = this.getU();
		Object generatedLoose = generatedU.getLoose();
		if (generatedLoose.getHdr_used() < generatedLoose.getHdr_avail()) {
			size_t to_copy = generatedLoose.getHdr_avail() - generatedLoose.getHdr_used();
			if (sz < to_copy) {
				to_copy = sz;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf, generatedLoose.getHdr() + generatedLoose.getHdr_used(), to_copy);
			generatedLoose.getHdr_used() += to_copy;
			total_read += to_copy;
		} 
		git_zstream generatedZ = this.getZ();
		Byte generatedNext_out = generatedZ.getNext_out();
		while (total_read < sz) {
			int status;
			generatedZ.setNext_out((byte)buf + total_read);
			generatedZ.setAvail_out(sz - total_read);
			status = generatedZ.git_inflate(Z_FINISH);
			total_read = generatedNext_out - (byte)buf;
			if (status == Z_STREAM_END) {
				generatedZ.git_inflate_end();
				this.setZ_state(.z_done);
				break;
			} 
			if (status != Z_OK && (status != Z_BUF_ERROR || total_read < sz)) {
				generatedZ.git_inflate_end();
				this.setZ_state(.z_error);
				return -1;
			} 
		}
		return total_read;
	}
	public int close_istream_loose() {
		st.close_deflated_stream();
		 generatedU = this.getU();
		Object generatedLoose = generatedU.getLoose();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/munmap(generatedLoose.getMapped(), generatedLoose.getMapsize());
		return 0;
	}
	public Object read_istream_pack_non_delta(Byte buf, Object sz) {
		size_t total_read = 0;
		git_zstream generatedZ = this.getZ();
		 generatedZ_state = this.getZ_state();
		switch (generatedZ_state) {
		case .z_done:
				return 0;
		case .z_used:
				break;
		case .z_unused:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedZ, 0, /*Error: sizeof expression not supported yet*/);
				generatedZ.git_inflate_init();
				this.setZ_state(.z_used);
				break;
		case .z_error:
				return -1;
		}
		 generatedU = this.getU();
		Object generatedIn_pack = generatedU.getIn_pack();
		long generatedAvail_in = generatedZ.getAvail_in();
		Byte generatedNext_in = generatedZ.getNext_in();
		Byte generatedNext_out = generatedZ.getNext_out();
		while (total_read < sz) {
			int status;
			pack_window window = ((Object)0);
			byte mapped;
			mapped = ModernizedCProgram.use_pack(generatedIn_pack.getPack(), ModernizedCProgram.window, generatedIn_pack.getPos(), generatedAvail_in);
			generatedZ.setNext_out((byte)buf + total_read);
			generatedZ.setAvail_out(sz - total_read);
			generatedZ.setNext_in(mapped);
			status = generatedZ.git_inflate(Z_FINISH);
			generatedIn_pack.getPos() += generatedNext_in - mapped;
			total_read = generatedNext_out - (byte)buf;
			ModernizedCProgram.window.unuse_pack();
			if (status == Z_STREAM_END) {
				generatedZ.git_inflate_end();
				this.setZ_state(.z_done);
				break;
			} 
			if (status != Z_OK && status != Z_BUF_ERROR) {
				generatedZ.git_inflate_end();
				this.setZ_state(.z_error);
				return -1;
			} 
		}
		return total_read;
	}
	public int close_istream_pack_non_delta() {
		st.close_deflated_stream();
		return 0;
	}
	public int close_istream_incore() {
		 generatedU = this.getU();
		Object generatedIncore = generatedU.getIncore();
		ModernizedCProgram.free(generatedIncore.getBuf());
		return 0;
	}
	public Object read_istream_incore(Byte buf, Object sz) {
		size_t read_size = sz;
		long generatedSize = this.getSize();
		 generatedU = this.getU();
		Object generatedIncore = generatedU.getIncore();
		size_t remainder = generatedSize - generatedIncore.getRead_ptr();
		if (remainder <= read_size) {
			read_size = remainder;
		} 
		if (read_size) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf, generatedIncore.getBuf() + generatedIncore.getRead_ptr(), read_size);
			generatedIncore.getRead_ptr() += read_size;
		} 
		return read_size;
	}
	public Object getVtbl() {
		return vtbl;
	}
	public void setVtbl(Object newVtbl) {
		vtbl = newVtbl;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public git_zstream getZ() {
		return z;
	}
	public void setZ(git_zstream newZ) {
		z = newZ;
	}
	public  getZ_state() {
		return z_state;
	}
	public void setZ_state( newZ_state) {
		z_state = newZ_state;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
}
