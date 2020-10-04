package application;

public class Check_hashToBuild_debugdata {
	
	
	private static void check_hash(hashcat_ctx hashcat_ctx, hc_device_param device_param, plain plain) {
		debugfile_ctx generatedDebugfile_ctx = hashcat_ctx.getDebugfile_ctx();
		debugfile_ctx_t debugfile_ctx = generatedDebugfile_ctx;
		hashes generatedHashes = hashcat_ctx.getHashes();
		hashes_t hashes = generatedHashes;
		hashconfig generatedHashconfig = hashcat_ctx.getHashconfig();
		hashconfig_t hashconfig = generatedHashconfig;
		loopback_ctx generatedLoopback_ctx = hashcat_ctx.getLoopback_ctx();
		loopback_ctx_t loopback_ctx = generatedLoopback_ctx;
		module_ctx generatedModule_ctx = hashcat_ctx.getModule_ctx();
		module_ctx_t module_ctx = generatedModule_ctx;
		Object generatedSalt_pos = plain.getSalt_pos();
		u32 salt_pos = generatedSalt_pos;
		Object generatedDigest_pos = plain.getDigest_pos();
		// relativeu32 digest_pos = generatedDigest_pos;
		Object tmps = (null);
		boolean generatedIs_cuda = device_param.getIs_cuda();
		Object generatedCuda_d_tmps = device_param.getCuda_d_tmps();
		Object generatedGidvid = plain.getGidvid();
		boolean generatedIs_opencl = device_param.getIs_opencl();
		Object generatedOpencl_command_queue = device_param.getOpencl_command_queue();
		Object generatedOpencl_d_tmps = device_param.getOpencl_d_tmps();
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_COPY_TMPS) {
			tmps = ModernizedCProgram.hcmalloc(hashconfig.getTmp_size());
			if (generatedIs_cuda == true) {
				hashcat_ctx.hc_cuMemcpyDtoH(tmps, generatedCuda_d_tmps + (generatedGidvid * hashconfig.getTmp_size()), hashconfig.getTmp_size());
			} 
			if (generatedIs_opencl == true) {
				hashcat_ctx.hc_clEnqueueReadBuffer(generatedOpencl_command_queue, generatedOpencl_d_tmps, CL_TRUE, generatedGidvid * hashconfig.getTmp_size(), hashconfig.getTmp_size(), tmps, 0, (null), (null));
			} 
		} 
		// hashu8[] out_buf = hashes.getOut_buf();
		int out_len = ModernizedCProgram.hash_encode(generatedHashconfig, generatedHashes, generatedModule_ctx, (byte)out_buf, -1024, salt_pos, digest_pos);
		out_buf[out_len] = 0// plain;// plain
		u8[] plain_buf = new u8();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(plain_buf, 0, /*Error: sizeof expression not supported yet*/);
		u8 plain_ptr = plain_buf;
		int plain_len = 0;
		ModernizedCProgram.build_plain(hashcat_ctx, device_param, plain, (u32)plain_buf, plain_len);
		if (module_ctx.getModule_build_plain_postprocess() != (Object)-1) {
			u8[] temp_buf = new u8[]{0};
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(temp_buf, 0, /*Error: sizeof expression not supported yet*/);
			int temp_len = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedHashconfig, generatedHashes, tmps, (u32)plain_buf, /*Error: sizeof expression not supported yet*/, plain_len, (u32)temp_buf, /*Error: sizeof expression not supported yet*/);
			if (temp_len < (int)/*Error: sizeof expression not supported yet*/) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(plain_buf, temp_buf, temp_len);
				plain_len = temp_len;
			} 
		} 
		// crackposu64 crackpos = 0;
		ModernizedCProgram.build_crackpos(hashcat_ctx, device_param, plain, crackpos)// debug;// debug
		u8[] debug_rule_buf = new u8[]{0};
		// -1 errorint debug_rule_len = 0;
		u8[] debug_plain_ptr = new u8[]{0};
		int debug_plain_len = 0;
		ModernizedCProgram.build_debugdata(hashcat_ctx, device_param, plain, debug_rule_buf, debug_rule_len, debug_plain_ptr, debug_plain_len)// outfile, can be either to file or stdout// if an error occurs opening the file, send to stdout as fallback;// outfile, can be either to file or stdout// if an error occurs opening the file, send to stdout as fallback
		// the fp gets opened for each cracked hash so that the user can modify (move) the outfile while hashcat runs// the fp gets opened for each cracked hash so that the user can modify (move) the outfile while hashcat runshashcat_ctx.outfile_write_open();
		u8[] tmp_buf = hashes.getTmp_buf();
		tmp_buf[0] = 0;
		int tmp_len = hashcat_ctx.outfile_write((byte)out_buf, out_len, plain_ptr, plain_len, crackpos, (null), 0, (byte)tmp_buf);
		hashcat_ctx.event_call((event_identifier.EVENT_CRACKER_HASH_CRACKED), (tmp_buf), (tmp_len));
		hashcat_ctx.outfile_write_close()// potfile// we can have either used-defined hooks or reuse the same format as input format;// potfile// we can have either used-defined hooks or reuse the same format as input format
		Object generatedDigests_offset = salts_buf.getDigests_offset();
		// no need for locking, we're in a mutex protected functionif (module_ctx.getModule_hash_encode_potfile() != (Object)-1) {
			salt_t salts_buf = hashes.getSalts_buf();
			salts_buf += salt_pos;
			u32 digest_cur = generatedDigests_offset + digest_pos;
			Object digests_buf = hashes.getDigests_buf();
			Object esalts_buf = hashes.getEsalts_buf();
			Object hook_salts_buf = hashes.getHook_salts_buf();
			hashinfo_t hash_info = hashes.getHash_info();
			Byte digests_buf_ptr = (byte)digests_buf;
			Byte esalts_buf_ptr = (byte)esalts_buf;
			Byte hook_salts_buf_ptr = (byte)hook_salts_buf;
			hashinfo_t hash_info_ptr = (null);
			digests_buf_ptr += digest_cur * hashconfig.getDgst_size();
			esalts_buf_ptr += digest_cur * hashconfig.getEsalt_size();
			hook_salts_buf_ptr += digest_cur * hashconfig.getHook_salt_size();
			if (hash_info) {
				hash_info_ptr = hash_info[digest_cur];
			} 
			out_len = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(hashconfig, digests_buf_ptr, salts_buf, esalts_buf_ptr, hook_salts_buf_ptr, hash_info_ptr, (byte)out_buf, -1024, tmps);
			out_buf[out_len] = 0;
		} 
		hashcat_ctx.potfile_write_append((byte)out_buf, out_len, plain_ptr, plain_len)// if enabled, update also the loopback file;// if enabled, update also the loopback file
		if (loopback_ctx.getFp().getPfp() != (null)) {
			hashcat_ctx.loopback_write_append(plain_ptr, plain_len);
		} 
		// if enabled, update also the (rule) debug fileif (debugfile_ctx.getFp().getPfp() != (null)) {
			if ((debug_plain_len > 0) || (debug_rule_len > 0)) {
				hashcat_ctx.debugfile_write_append(debug_rule_buf, debug_rule_len, plain_ptr, plain_len, debug_plain_ptr, debug_plain_len);
			} 
		} 
		// the next check implies that:// - (user_options->attack_mode == ATTACK_MODE_STRAIGHT)
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_COPY_TMPS) {
			ModernizedCProgram.hcfree(tmps);
		} 
	}
	/**
	 * Author......: See docs/credits.txt
	 * License.....: MIT
	 */
	public static int build_plain(hashcat_ctx hashcat_ctx, hc_device_param device_param, plain plain, Object[] plain_buf, Integer out_len) {
		combinator_ctx generatedCombinator_ctx = hashcat_ctx.getCombinator_ctx();
		combinator_ctx_t combinator_ctx = generatedCombinator_ctx;
		hashconfig generatedHashconfig = hashcat_ctx.getHashconfig();
		hashconfig_t hashconfig = generatedHashconfig;
		hashes generatedHashes = hashcat_ctx.getHashes();
		hashes_t hashes = generatedHashes;
		mask_ctx generatedMask_ctx = hashcat_ctx.getMask_ctx();
		mask_ctx_t mask_ctx = generatedMask_ctx;
		straight_ctx generatedStraight_ctx = hashcat_ctx.getStraight_ctx();
		straight_ctx_t straight_ctx = generatedStraight_ctx;
		user_options generatedUser_options = hashcat_ctx.getUser_options();
		user_options_t user_options = generatedUser_options;
		user_options_extra generatedUser_options_extra = hashcat_ctx.getUser_options_extra();
		user_options_extra_t user_options_extra = generatedUser_options_extra;
		Object generatedGidvid = plain.getGidvid();
		u64 gidvid = generatedGidvid;
		Object generatedIl_pos = plain.getIl_pos();
		u32 il_pos = generatedIl_pos;
		int plain_len = 0;
		u8[] plain_ptr = (u8)plain_buf;
		Object[] generatedI = pw.getI();
		Object generatedPw_len = pw.getPw_len();
		Object generatedInnerloop_pos = device_param.getInnerloop_pos();
		Object[] generatedKernel_params_mp_l_buf64 = device_param.getKernel_params_mp_l_buf64();
		Object[] generatedKernel_params_mp_r_buf64 = device_param.getKernel_params_mp_r_buf64();
		Object[] generatedKernel_params_mp_l_buf32 = device_param.getKernel_params_mp_l_buf32();
		Object[] generatedKernel_params_mp_r_buf32 = device_param.getKernel_params_mp_r_buf32();
		Object[] generatedKernel_params_mp_buf64 = device_param.getKernel_params_mp_buf64();
		Object[] generatedKernel_params_mp_buf32 = device_param.getKernel_params_mp_buf32();
		if (user_options.getSlow_candidates() == 1) {
			pw_t pw = new pw_t();
			int rc = ModernizedCProgram.gidd_to_pw_t(hashcat_ctx, device_param, gidvid, pw);
			if (rc == -1) {
				return -1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(plain_buf, generatedI, generatedPw_len);
			plain_len = generatedPw_len;
		} else {
				if (user_options.getAttack_mode() == attack_mode.ATTACK_MODE_STRAIGHT) {
					pw_t pw = new pw_t();
					int rc = ModernizedCProgram.gidd_to_pw_t(hashcat_ctx, device_param, gidvid, pw);
					if (rc == -1) {
						return -1;
					} 
					u64 off = generatedInnerloop_pos + il_pos;
					if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
						for (int i = 0;
						 i < 8; i++) {
							plain_buf[i] = generatedI[i];
						}
						plain_len = /*Error: Function owner not recognized*/apply_rules_optimized(straight_ctx.getKernel_rules_buf()[off].getCmds(), plain_buf[0], plain_buf[4], generatedPw_len);
					} else {
							for (int i = 0;
							 i < 64; i++) {
								plain_buf[i] = generatedI[i];
							}
							plain_len = /*Error: Function owner not recognized*/apply_rules(straight_ctx.getKernel_rules_buf()[off].getCmds(), plain_buf, generatedPw_len);
					} 
				}  else if (user_options.getAttack_mode() == attack_mode.ATTACK_MODE_COMBI) {
					pw_t pw = new pw_t();
					int rc = ModernizedCProgram.gidd_to_pw_t(hashcat_ctx, device_param, gidvid, pw);
					if (rc == -1) {
						return -1;
					} 
					for (int i = 0;
					 i < 64; i++) {
						plain_buf[i] = generatedI[i];
					}
					plain_len = (int)generatedPw_len;
					Byte comb_buf = (byte)generatedI;
					u32 comb_len = generatedPw_len;
					if (combinator_ctx.getCombs_mode() == combinator_mode.COMBINATOR_MODE_BASE_LEFT) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(plain_ptr + plain_len, comb_buf, (size_t)comb_len);
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(plain_ptr + comb_len, plain_ptr, (size_t)plain_len);
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(plain_ptr, comb_buf, comb_len);
					} 
					plain_len += comb_len;
				}  else if (user_options.getAttack_mode() == attack_mode.ATTACK_MODE_BF) {
					u64 l_off = generatedKernel_params_mp_l_buf64[3] + gidvid;
					u64 r_off = generatedKernel_params_mp_r_buf64[3] + il_pos;
					u32 l_start = generatedKernel_params_mp_l_buf32[5];
					u32 r_start = generatedKernel_params_mp_r_buf32[5];
					u32 l_stop = generatedKernel_params_mp_l_buf32[4];
					u32 r_stop = generatedKernel_params_mp_r_buf32[4];
					mask_ctx.getRoot_css_buf().sp_exec(l_off, (byte)plain_ptr + l_start, mask_ctx.getMarkov_css_buf(), l_start, l_start + l_stop);
					mask_ctx.getRoot_css_buf().sp_exec(r_off, (byte)plain_ptr + r_start, mask_ctx.getMarkov_css_buf(), r_start, r_start + r_stop);
					plain_len = (int)mask_ctx.getCss_cnt();
				}  else if (user_options.getAttack_mode() == attack_mode.ATTACK_MODE_HYBRID1) {
					pw_t pw = new pw_t();
					int rc = ModernizedCProgram.gidd_to_pw_t(hashcat_ctx, device_param, gidvid, pw);
					if (rc == -1) {
						return -1;
					} 
					for (int i = 0;
					 i < 64; i++) {
						plain_buf[i] = generatedI[i];
					}
					plain_len = (int)generatedPw_len;
					u64 off = generatedKernel_params_mp_buf64[3] + il_pos;
					u32 start = 0;
					u32 stop = generatedKernel_params_mp_buf32[4];
					mask_ctx.getRoot_css_buf().sp_exec(off, (byte)plain_ptr + plain_len, mask_ctx.getMarkov_css_buf(), start, start + stop);
					plain_len += start + stop;
				}  else if (user_options.getAttack_mode() == attack_mode.ATTACK_MODE_HYBRID2) {
					if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
						pw_t pw = new pw_t();
						int rc = ModernizedCProgram.gidd_to_pw_t(hashcat_ctx, device_param, gidvid, pw);
						if (rc == -1) {
							return -1;
						} 
						for (int i = 0;
						 i < 64; i++) {
							plain_buf[i] = generatedI[i];
						}
						plain_len = (int)generatedPw_len;
						u64 off = generatedKernel_params_mp_buf64[3] + il_pos;
						u32 start = 0;
						u32 stop = generatedKernel_params_mp_buf32[4];
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(plain_ptr + stop, plain_ptr, plain_len);
						mask_ctx.getRoot_css_buf().sp_exec(off, (byte)plain_ptr, mask_ctx.getMarkov_css_buf(), start, start + stop);
						plain_len += start + stop;
					} else {
							pw_t pw = new pw_t();
							int rc = ModernizedCProgram.gidd_to_pw_t(hashcat_ctx, device_param, gidvid, pw);
							if (rc == -1) {
								return -1;
							} 
							u64 off = generatedKernel_params_mp_buf64[3] + gidvid;
							u32 start = 0;
							u32 stop = generatedKernel_params_mp_buf32[4];
							mask_ctx.getRoot_css_buf().sp_exec(off, (byte)plain_ptr, mask_ctx.getMarkov_css_buf(), start, start + stop);
							plain_len = stop;
							Byte comb_buf = (byte)generatedI;
							u32 comb_len = generatedPw_len;
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(plain_ptr + plain_len, comb_buf, comb_len);
							plain_len += comb_len;
					} 
				} 
				if (user_options.getAttack_mode() == attack_mode.ATTACK_MODE_BF) {
					if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_BRUTE_FORCE) {
						if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_SINGLE_HASH) {
							if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_APPENDED_SALT) {
								plain_len = plain_len - hashes.getSalts_buf()[0].getSalt_len();
							} 
						} 
						if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_PT_UTF16LE) {
							for (int i = 0;
							int j = 0;
							 i < plain_len; ) {
								plain_ptr[j] = plain_ptr[i];
							}
							plain_len = plain_len / 2;
						}  else if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_PT_UTF16BE) {
							for (int i = 1;
							int j = 0;
							 i < plain_len; ) {
								plain_ptr[j] = plain_ptr[i];
							}
							plain_len = plain_len / 2;
						} 
					} 
				} 
		} 
		int pw_max = (int)hashconfig.getPw_max();
		// pw_max is per pw_t element but in combinator we have two pw_t elements.// therefore we can support up to 64 in combinator in optimized mode (but limited by general hash limit 55)// or full 512 in pure mode (but limited by hashcat buffer size limit 256).
		// some algorithms do not support general default pw_max = 31,// therefore we need to use pw_max as a base and not hardcode it.if (plain_len > pw_max) {
			if (user_options_extra.getAttack_kern() == attack_kern.ATTACK_KERN_COMBI) {
				if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
					pw_max = ((((pw_max * 2)) < (true)) ? ((pw_max * 2)) : (true));
				} else {
						pw_max = ((((pw_max * 2)) < (true)) ? ((pw_max * 2)) : (true));
				} 
			} 
		} 
		if (plain_len > pw_max) {
			plain_len = (((plain_len) < (pw_max)) ? (plain_len) : (pw_max));
		} 
		plain_ptr[plain_len] = 0;
		out_len = plain_len;
		return 0;
	}
	private static int build_crackpos(hashcat_ctx hashcat_ctx, hc_device_param device_param, plain plain, Object out_pos) {
		combinator_ctx generatedCombinator_ctx = hashcat_ctx.getCombinator_ctx();
		combinator_ctx_t combinator_ctx = generatedCombinator_ctx;
		mask_ctx generatedMask_ctx = hashcat_ctx.getMask_ctx();
		mask_ctx_t mask_ctx = generatedMask_ctx;
		straight_ctx generatedStraight_ctx = hashcat_ctx.getStraight_ctx();
		straight_ctx_t straight_ctx = generatedStraight_ctx;
		user_options generatedUser_options = hashcat_ctx.getUser_options();
		user_options_t user_options = generatedUser_options;
		user_options_extra generatedUser_options_extra = hashcat_ctx.getUser_options_extra();
		user_options_extra_t user_options_extra = generatedUser_options_extra;
		Object generatedGidvid = plain.getGidvid();
		u64 gidvid = generatedGidvid;
		Object generatedIl_pos = plain.getIl_pos();
		u32 il_pos = generatedIl_pos;
		Object generatedWords_off = device_param.getWords_off();
		u64 crackpos = generatedWords_off;
		Object generatedInnerloop_pos = device_param.getInnerloop_pos();
		if (user_options.getSlow_candidates() == 1) {
			crackpos = gidvid;
		} else {
				if (user_options_extra.getAttack_kern() == attack_kern.ATTACK_KERN_STRAIGHT) {
					crackpos += gidvid;
					crackpos *= straight_ctx.getKernel_rules_cnt();
					crackpos += generatedInnerloop_pos + il_pos;
				}  else if (user_options_extra.getAttack_kern() == attack_kern.ATTACK_KERN_COMBI) {
					crackpos += gidvid;
					crackpos *= combinator_ctx.getCombs_cnt();
					crackpos += generatedInnerloop_pos + il_pos;
				}  else if (user_options_extra.getAttack_kern() == attack_mode.ATTACK_MODE_BF) {
					crackpos += gidvid;
					crackpos *= mask_ctx.getBfs_cnt();
					crackpos += generatedInnerloop_pos + il_pos;
				} 
		} 
		out_pos = crackpos;
		return 0;
	}
	private static int build_debugdata(hashcat_ctx hashcat_ctx, hc_device_param device_param, plain plain, Object[] debug_rule_buf, Integer debug_rule_len, Object[] debug_plain_ptr, Integer debug_plain_len) {
		debugfile_ctx generatedDebugfile_ctx = hashcat_ctx.getDebugfile_ctx();
		debugfile_ctx_t debugfile_ctx = generatedDebugfile_ctx;
		straight_ctx generatedStraight_ctx = hashcat_ctx.getStraight_ctx();
		straight_ctx_t straight_ctx = generatedStraight_ctx;
		user_options generatedUser_options = hashcat_ctx.getUser_options();
		user_options_t user_options = generatedUser_options;
		Object generatedGidvid = plain.getGidvid();
		u64 gidvid = generatedGidvid;
		Object generatedIl_pos = plain.getIl_pos();
		u32 il_pos = generatedIl_pos;
		if (user_options.getAttack_mode() != attack_mode.ATTACK_MODE_STRAIGHT) {
			return 0;
		} 
		u32 debug_mode = debugfile_ctx.getMode();
		if (debug_mode == 0) {
			return 0;
		} 
		pw_pre generatedPws_base_buf = device_param.getPws_base_buf();
		Object generatedRule_idx = pw_base.getRule_idx();
		Object[] generatedBase_buf = pw_base.getBase_buf();
		Object generatedBase_len = pw_base.getBase_len();
		Object generatedPw_len = pw.getPw_len();
		Object generatedInnerloop_pos = device_param.getInnerloop_pos();
		Object[] generatedI = pw.getI();
		if (user_options.getSlow_candidates() == 1) {
			pw_pre_t pw_base = generatedPws_base_buf + gidvid;
			if ((debug_mode == 1) || (debug_mode == 3) || (debug_mode == 4)) {
				int len = straight_ctx.getKernel_rules_buf()[generatedRule_idx].kernel_rule_to_cpu_rule((byte)debug_rule_buf);
				debug_rule_buf[len] = 0;
				debug_rule_len = len;
			} 
			if ((debug_mode == 2) || (debug_mode == 3) || (debug_mode == 4)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(debug_plain_ptr, generatedBase_buf, generatedBase_len);
				debug_plain_ptr[generatedBase_len] = 0;
				debug_plain_len = generatedBase_len;
			} 
		} else {
				pw_t pw = new pw_t();
				int rc = ModernizedCProgram.gidd_to_pw_t(hashcat_ctx, device_param, gidvid, pw);
				if (rc == -1) {
					return -1;
				} 
				int plain_len = (int)generatedPw_len;
				u64 off = generatedInnerloop_pos + il_pos;
				if ((debug_mode == 1) || (debug_mode == 3) || (debug_mode == 4)) {
					int len = straight_ctx.getKernel_rules_buf()[off].kernel_rule_to_cpu_rule((byte)debug_rule_buf);
					debug_rule_buf[len] = 0;
					debug_rule_len = len;
				} 
				if ((debug_mode == 2) || (debug_mode == 3) || (debug_mode == 4)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(debug_plain_ptr, (byte)generatedI, (size_t)plain_len);
					debug_plain_ptr[plain_len] = 0;
					debug_plain_len = plain_len;
				} 
		} 
		return 0;
	}
}
