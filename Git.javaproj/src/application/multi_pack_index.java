package application;

public class multi_pack_index {
	private multi_pack_index next;
	private int fd;
	private Object[] data;
	private Object data_len;
	private Object signature;
	private byte version;
	private byte hash_len;
	private byte num_chunks;
	private Object num_packs;
	private Object num_objects;
	private int local;
	private Object chunk_pack_names;
	private Object[] chunk_oid_fanout;
	private Object chunk_oid_lookup;
	private Object chunk_object_offsets;
	private Object chunk_large_offsets;
	private Object[][] pack_names;
	private packed_git[][] packs;
	private Object object_dir;
	
	public multi_pack_index(multi_pack_index next, int fd, Object[] data, Object data_len, Object signature, byte version, byte hash_len, byte num_chunks, Object num_packs, Object num_objects, int local, Object chunk_pack_names, Object[] chunk_oid_fanout, Object chunk_oid_lookup, Object chunk_object_offsets, Object chunk_large_offsets, Object[][] pack_names, packed_git[][] packs, Object object_dir) {
		setNext(next);
		setFd(fd);
		setData(data);
		setData_len(data_len);
		setSignature(signature);
		setVersion(version);
		setHash_len(hash_len);
		setNum_chunks(num_chunks);
		setNum_packs(num_packs);
		setNum_objects(num_objects);
		setLocal(local);
		setChunk_pack_names(chunk_pack_names);
		setChunk_oid_fanout(chunk_oid_fanout);
		setChunk_oid_lookup(chunk_oid_lookup);
		setChunk_object_offsets(chunk_object_offsets);
		setChunk_large_offsets(chunk_large_offsets);
		setPack_names(pack_names);
		setPacks(packs);
		setObject_dir(object_dir);
	}
	public multi_pack_index() {
	}
	
	public multi_pack_index load_multi_pack_index(Object object_dir, int local) {
		multi_pack_index m = ((Object)0);
		int fd;
		stat st = new stat();
		size_t midx_size = new size_t();
		Object midx_map = ((Object)0);
		uint32_t hash_version = new uint32_t();
		byte midx_name = ModernizedCProgram.get_midx_filename(object_dir);
		uint32_t i = new uint32_t();
		byte cur_pack_name;
		fd = ModernizedCProgram.git_open_cloexec(midx_name, 0);
		if (fd < 0) {
			;
		} 
		if (/*Error: Function owner not recognized*/fstat(fd, st)) {
			();
			;
		} 
		Object generatedSt_size = st.getSt_size();
		midx_size = ModernizedCProgram.xsize_t(generatedSt_size);
		if (midx_size < (12 + ModernizedCProgram.the_repository.getHash_algo().getRawsz())) {
			();
			;
		} 
		do {
			ModernizedCProgram.free(midx_name);
			(midx_name) = ((Object)0);
		} while (0);
		midx_map = ModernizedCProgram.xmmap(((Object)0), midx_size, PROT_READ, MAP_PRIVATE, fd, 0);
		Object generatedObject_dir = ((m)).getObject_dir();
		do {
			size_t flex_array_len_ = (/*Error: Function owner not recognized*/strlen(object_dir));
			((m)) = ModernizedCProgram.xcalloc(1, ModernizedCProgram.st_add(ModernizedCProgram.st_add((/*Error: sizeof expression not supported yet*/), (flex_array_len_)), (true)));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((Object)generatedObject_dir, ((object_dir)), flex_array_len_);
		} while (0);
		m.setFd(fd);
		m.setData(midx_map);
		m.setData_len(midx_size);
		m.setLocal(local);
		Object[] generatedData = m.getData();
		m.setSignature(/*Error: Function owner not recognized*/get_be32(generatedData));
		Object generatedSignature = m.getSignature();
		if (generatedSignature != -1024) {
			ModernizedCProgram.die(ModernizedCProgram._("multi-pack-index signature 0x%08x does not match signature 0x%08x"), generatedSignature, -1024);
		} 
		m.setVersion(generatedData[4]);
		byte generatedVersion = m.getVersion();
		if (generatedVersion != 1) {
			ModernizedCProgram.die(ModernizedCProgram._("multi-pack-index version %d not recognized"), generatedVersion);
		} 
		hash_version = generatedData[5];
		if (hash_version != 1) {
			ModernizedCProgram.die(ModernizedCProgram._("hash version %u does not match"), hash_version);
		} 
		m.setHash_len(ModernizedCProgram.the_repository.getHash_algo().getRawsz());
		m.setNum_chunks(generatedData[6]);
		m.setNum_packs(/*Error: Function owner not recognized*/get_be32(generatedData + 8));
		byte generatedNum_chunks = m.getNum_chunks();
		Object generatedData_len = m.getData_len();
		for (i = 0; i < generatedNum_chunks; i++) {
			uint32_t chunk_id = /*Error: Function owner not recognized*/get_be32(generatedData + 12 + (/*Error: Unsupported expression*/ + /*Error: Unsupported expression*/) * i);
			uint64_t chunk_offset = /*Error: Function owner not recognized*/get_be64(generatedData + 12 + 4 + (/*Error: Unsupported expression*/ + /*Error: Unsupported expression*/) * i);
			if (chunk_offset >= generatedData_len) {
				ModernizedCProgram.die(ModernizedCProgram._("invalid chunk offset (too large)"));
			} 
			switch (chunk_id) {
			case -1024:
					m.setChunk_pack_names(generatedData + chunk_offset);
					break;
			case -1024:
					m.setChunk_oid_lookup(generatedData + chunk_offset);
					break;
			case 0:
					ModernizedCProgram.die(ModernizedCProgram._("terminating multi-pack-index chunk id appears earlier than expected"));
					break;
			case -1024:
					m.setChunk_large_offsets(generatedData + chunk_offset);
					break;
			case -1024:
					m.setChunk_object_offsets(generatedData + chunk_offset);
					break;
			case -1024:
					m.setChunk_oid_fanout((uint32_t)(generatedData + chunk_offset));
					break;
			default:
					break;
			}
		}
		Object generatedChunk_pack_names = m.getChunk_pack_names();
		if (!generatedChunk_pack_names) {
			ModernizedCProgram.die(ModernizedCProgram._("multi-pack-index missing required pack-name chunk"));
		} 
		Object[] generatedChunk_oid_fanout = m.getChunk_oid_fanout();
		if (!generatedChunk_oid_fanout) {
			ModernizedCProgram.die(ModernizedCProgram._("multi-pack-index missing required OID fanout chunk"));
		} 
		Object generatedChunk_oid_lookup = m.getChunk_oid_lookup();
		if (!generatedChunk_oid_lookup) {
			ModernizedCProgram.die(ModernizedCProgram._("multi-pack-index missing required OID lookup chunk"));
		} 
		Object generatedChunk_object_offsets = m.getChunk_object_offsets();
		if (!generatedChunk_object_offsets) {
			ModernizedCProgram.die(ModernizedCProgram._("multi-pack-index missing required object offsets chunk"));
		} 
		m.setNum_objects(/*Error: Function owner not recognized*/ntohl(generatedChunk_oid_fanout[255]));
		Object generatedNum_packs = m.getNum_packs();
		Object[][] generatedPack_names = m.getPack_names();
		m.setPack_names(ModernizedCProgram.xcalloc(generatedNum_packs, /*Error: sizeof expression not supported yet*/));
		packed_git[][] generatedPacks = m.getPacks();
		m.setPacks(ModernizedCProgram.xcalloc(generatedNum_packs, /*Error: sizeof expression not supported yet*/));
		cur_pack_name = (byte)generatedChunk_pack_names;
		for (i = 0; i < generatedNum_packs; i++) {
			generatedPack_names[i] = cur_pack_name;
			cur_pack_name += /*Error: Function owner not recognized*/strlen(cur_pack_name) + 1;
			if (i && /*Error: Function owner not recognized*/strcmp(generatedPack_names[i], generatedPack_names[i - 1]) <= 0) {
				ModernizedCProgram.die(ModernizedCProgram._("multi-pack-index pack names out of order: '%s' before '%s'"), generatedPack_names[i - 1], generatedPack_names[i]);
			} 
		}
		ModernizedCProgram.trace2_data_intmax_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\midx.c", 170, ("midx"), (ModernizedCProgram.the_repository), ("load/num_packs"), (generatedNum_packs));
		Object generatedNum_objects = m.getNum_objects();
		ModernizedCProgram.trace2_data_intmax_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\midx.c", 171, ("midx"), (ModernizedCProgram.the_repository), ("load/num_objects"), (generatedNum_objects));
		return m;
		ModernizedCProgram.free(midx_name);
		if (midx_map) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/munmap(midx_map, midx_size);
		} 
		if (0 <= fd) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(fd);
		} 
		return ((Object)0);
	}
	public void close_midx() {
		uint32_t i = new uint32_t();
		if (!m) {
			return /*Error: Unsupported expression*/;
		} 
		Object[] generatedData = this.getData();
		Object generatedData_len = this.getData_len();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/munmap((byte)generatedData, generatedData_len);
		int generatedFd = this.getFd();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedFd);
		this.setFd(-1);
		Object generatedNum_packs = this.getNum_packs();
		packed_git[][] generatedPacks = this.getPacks();
		for (i = 0; i < generatedNum_packs; i++) {
			if (generatedPacks[i]) {
				generatedPacks[i].setMulti_pack_index(0);
			} 
		}
		do {
			ModernizedCProgram.free(generatedPacks);
			(generatedPacks) = ((Object)0);
		} while (0);
		Object[][] generatedPack_names = this.getPack_names();
		do {
			ModernizedCProgram.free(generatedPack_names);
			(generatedPack_names) = ((Object)0);
		} while (0);
	}
	public int bsearch_midx(Object oid, Object result) {
		Object[] generatedChunk_oid_fanout = this.getChunk_oid_fanout();
		Object generatedChunk_oid_lookup = this.getChunk_oid_lookup();
		return ModernizedCProgram.bsearch_hash(oid.getHash(), generatedChunk_oid_fanout, generatedChunk_oid_lookup, ModernizedCProgram.the_repository.getHash_algo().getRawsz(), result);
	}
	public Object nth_midxed_offset(Object pos) {
		byte offset_data;
		uint32_t offset32 = new uint32_t();
		Object generatedChunk_object_offsets = this.getChunk_object_offsets();
		offset_data = generatedChunk_object_offsets + pos * (2 * /*Error: Unsupported expression*/);
		offset32 = /*Error: Function owner not recognized*/get_be32(offset_data + /*Error: Unsupported expression*/);
		Object generatedChunk_large_offsets = this.getChunk_large_offsets();
		if (generatedChunk_large_offsets && offset32 & -1024) {
			if (/*Error: Unsupported expression*/ < /*Error: Unsupported expression*/) {
				ModernizedCProgram.die(ModernizedCProgram._("multi-pack-index stores a 64-bit offset, but off_t is too small"));
			} 
			offset32 ^=  -1024;
			return /*Error: Function owner not recognized*/get_be64(generatedChunk_large_offsets + /*Error: Unsupported expression*/ * offset32);
		} 
		return offset32;
	}
	public Object nth_midxed_pack_int_id(Object pos) {
		Object generatedChunk_object_offsets = this.getChunk_object_offsets();
		return /*Error: Function owner not recognized*/get_be32(generatedChunk_object_offsets + pos * (2 * /*Error: Unsupported expression*/));
	}
	public int midx_contains_pack(Object idx_or_pack_name) {
		Object generatedNum_packs = this.getNum_packs();
		uint32_t first = 0;
		uint32_t last = generatedNum_packs;
		Object[][] generatedPack_names = this.getPack_names();
		while (first < last) {
			uint32_t mid = first + (last - first) / 2;
			byte current;
			int cmp;
			current = generatedPack_names[mid];
			cmp = ModernizedCProgram.cmp_idx_or_pack_name(idx_or_pack_name, current);
			if (!cmp) {
				return 1;
			} 
			if (cmp > 0) {
				first = mid + 1;
				continue;
			} 
			last = mid;
		}
		return 0;
	}
	public int fill_included_packs_all(byte[] include_pack) {
		uint32_t i = new uint32_t();
		Object generatedNum_packs = this.getNum_packs();
		for (i = 0; i < generatedNum_packs; i++) {
			include_pack[i] = 1;
		}
		return generatedNum_packs < 2;
	}
	public multi_pack_index get_multi_pack_index(repository r) {
		r.prepare_packed_git();
		raw_object_store generatedObjects = r.getObjects();
		multi_pack_index generatedMulti_pack_index = generatedObjects.getMulti_pack_index();
		return generatedMulti_pack_index;
	}
	public multi_pack_index getNext() {
		return next;
	}
	public void setNext(multi_pack_index newNext) {
		next = newNext;
	}
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public Object[] getData() {
		return data;
	}
	public void setData(Object[] newData) {
		data = newData;
	}
	public Object getData_len() {
		return data_len;
	}
	public void setData_len(Object newData_len) {
		data_len = newData_len;
	}
	public Object getSignature() {
		return signature;
	}
	public void setSignature(Object newSignature) {
		signature = newSignature;
	}
	public byte getVersion() {
		return version;
	}
	public void setVersion(byte newVersion) {
		version = newVersion;
	}
	public byte getHash_len() {
		return hash_len;
	}
	public void setHash_len(byte newHash_len) {
		hash_len = newHash_len;
	}
	public byte getNum_chunks() {
		return num_chunks;
	}
	public void setNum_chunks(byte newNum_chunks) {
		num_chunks = newNum_chunks;
	}
	public Object getNum_packs() {
		return num_packs;
	}
	public void setNum_packs(Object newNum_packs) {
		num_packs = newNum_packs;
	}
	public Object getNum_objects() {
		return num_objects;
	}
	public void setNum_objects(Object newNum_objects) {
		num_objects = newNum_objects;
	}
	public int getLocal() {
		return local;
	}
	public void setLocal(int newLocal) {
		local = newLocal;
	}
	public Object getChunk_pack_names() {
		return chunk_pack_names;
	}
	public void setChunk_pack_names(Object newChunk_pack_names) {
		chunk_pack_names = newChunk_pack_names;
	}
	public Object[] getChunk_oid_fanout() {
		return chunk_oid_fanout;
	}
	public void setChunk_oid_fanout(Object[] newChunk_oid_fanout) {
		chunk_oid_fanout = newChunk_oid_fanout;
	}
	public Object getChunk_oid_lookup() {
		return chunk_oid_lookup;
	}
	public void setChunk_oid_lookup(Object newChunk_oid_lookup) {
		chunk_oid_lookup = newChunk_oid_lookup;
	}
	public Object getChunk_object_offsets() {
		return chunk_object_offsets;
	}
	public void setChunk_object_offsets(Object newChunk_object_offsets) {
		chunk_object_offsets = newChunk_object_offsets;
	}
	public Object getChunk_large_offsets() {
		return chunk_large_offsets;
	}
	public void setChunk_large_offsets(Object newChunk_large_offsets) {
		chunk_large_offsets = newChunk_large_offsets;
	}
	public Object[][] getPack_names() {
		return pack_names;
	}
	public void setPack_names(Object[][] newPack_names) {
		pack_names = newPack_names;
	}
	public packed_git[][] getPacks() {
		return packs;
	}
	public void setPacks(packed_git[][] newPacks) {
		packs = newPacks;
	}
	public Object getObject_dir() {
		return object_dir;
	}
	public void setObject_dir(Object newObject_dir) {
		object_dir = newObject_dir;
	}
}
