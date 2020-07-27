package application;

public class audio_repack {
	private Object packet_buffer;
	private Object packet_size;
	private Object base_src_size;
	private Object base_dst_size;
	private Object extra_dst_size;
	private Object repack_func;
	
	public audio_repack(Object packet_buffer, Object packet_size, Object base_src_size, Object base_dst_size, Object extra_dst_size, Object repack_func) {
		setPacket_buffer(packet_buffer);
		setPacket_size(packet_size);
		setBase_src_size(base_src_size);
		setBase_dst_size(base_dst_size);
		setExtra_dst_size(extra_dst_size);
		setRepack_func(repack_func);
	}
	public audio_repack() {
	}
	
	public int check_buffer(Object frame_count) {
		Object generatedBase_dst_size = this.getBase_dst_size();
		Object generatedExtra_dst_size = this.getExtra_dst_size();
		uint32_t new_size = frame_count * generatedBase_dst_size + generatedExtra_dst_size;
		Object generatedPacket_size = this.getPacket_size();
		Object generatedPacket_buffer = this.getPacket_buffer();
		if (generatedPacket_size < new_size) {
			this.setPacket_buffer(ModernizedCProgram.brealloc(generatedPacket_buffer, new_size));
			if (!generatedPacket_buffer) {
				return -1;
			} 
			this.setPacket_size(new_size);
		} 
		return 0/*
		 * Squash arrays.
		 * For instance:
		 * 2.1:
		 *
		 * | FL | FR | LFE | emp | emp | emp |emp |emp |
		 * |    |    |
		 * | FL | FR | LFE |
		*/;
	}
	public int repack_squash(Object bsrc, Object frame_count) {
		if (repack.check_buffer(frame_count) < 0) {
			return -1;
		} 
		Object generatedExtra_dst_size = this.getExtra_dst_size();
		int squash = generatedExtra_dst_size;
		__m128i src = (__m128i)bsrc;
		__m128i esrc = src + frame_count;
		Object generatedPacket_buffer = this.getPacket_buffer();
		uint16_t dst = (uint16_t)generatedPacket_buffer;
		if (squash > 0) {
			while (src != esrc) {
				__m128i target = /*Error: Function owner not recognized*/_mm_load_si128(src++);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_mm_storeu_si128((__m128i)dst, target);
				dst += 8 - squash;
			}
		} 
		return 0;
	}
	public int repack_squash_swap(Object bsrc, Object frame_count) {
		if (repack.check_buffer(frame_count) < 0) {
			return -1;
		} 
		Object generatedExtra_dst_size = this.getExtra_dst_size();
		int squash = generatedExtra_dst_size;
		__m128i src = (__m128i)bsrc;
		__m128i esrc = src + frame_count;
		Object generatedPacket_buffer = this.getPacket_buffer();
		uint16_t dst = (uint16_t)generatedPacket_buffer;
		while (src != esrc) {
			__m128i target = /*Error: Function owner not recognized*/_mm_load_si128(src++);
			__m128i buf = ((__m128i)/*Error: Function owner not recognized*/__builtin_ia32_pshuflw((__v8hi)(__m128i)(target), (int)((((true) << 6) | ((true) << 4) | ((true) << 2) | (false)))));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_mm_storeu_si128((__m128i)dst, buf);
			dst += 8 - squash;
		}
		return 0;
	}
	public int audio_repack_init(_audio_repack_mode repack_mode, Object sample_bit) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(repack, 0, /*Error: sizeof expression not supported yet*/);
		if (sample_bit != 16) {
			return -1;
		} 
		int[] _audio_repack_ch = new int[]{3, 4, 5, 6, 5, 6, 8, 8};
		this.setBase_src_size(8 * (16 / 8));
		this.setBase_dst_size(_audio_repack_ch[repack_mode] * (16 / 8));
		this.setExtra_dst_size(8 - _audio_repack_ch[repack_mode]);
		this.setRepack_func(repack_squash);
		if (repack_mode == _audio_repack_mode.repack_mode_8to5ch_swap || repack_mode == _audio_repack_mode.repack_mode_8to6ch_swap || repack_mode == _audio_repack_mode.repack_mode_8ch_swap) {
			this.setRepack_func(repack_squash_swap);
		} 
		return 0;
	}
	public void audio_repack_free() {
		Object generatedPacket_buffer = this.getPacket_buffer();
		if (generatedPacket_buffer) {
			ModernizedCProgram.bfree(generatedPacket_buffer);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(repack, 0, /*Error: sizeof expression not supported yet*/);
	}
	public Object getPacket_buffer() {
		return packet_buffer;
	}
	public void setPacket_buffer(Object newPacket_buffer) {
		packet_buffer = newPacket_buffer;
	}
	public Object getPacket_size() {
		return packet_size;
	}
	public void setPacket_size(Object newPacket_size) {
		packet_size = newPacket_size;
	}
	public Object getBase_src_size() {
		return base_src_size;
	}
	public void setBase_src_size(Object newBase_src_size) {
		base_src_size = newBase_src_size;
	}
	public Object getBase_dst_size() {
		return base_dst_size;
	}
	public void setBase_dst_size(Object newBase_dst_size) {
		base_dst_size = newBase_dst_size;
	}
	public Object getExtra_dst_size() {
		return extra_dst_size;
	}
	public void setExtra_dst_size(Object newExtra_dst_size) {
		extra_dst_size = newExtra_dst_size;
	}
	public Object getRepack_func() {
		return repack_func;
	}
	public void setRepack_func(Object newRepack_func) {
		repack_func = newRepack_func;
	}
}
