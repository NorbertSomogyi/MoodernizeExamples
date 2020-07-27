package application;

public class hashes {
	private Object hashfile;
	private Object hashlist_mode;
	private Object hashlist_format;
	private Object digests_cnt;
	private Object digests_done;
	private Object digests_saved;
	private Object digests_buf;
	private Object[] digests_shown;
	private Object[] digests_shown_tmp;
	private Object salts_cnt;
	private Object salts_done;
	private salt[] salts_buf;
	private Object[] salts_shown;
	private Object esalts_buf;
	private Object hook_salts_buf;
	private Object hashes_cnt_orig;
	private Object hashes_cnt;
	private hash hashes_buf;
	private hashinfo[][] hash_info;
	private Object out_buf;
	private Object tmp_buf;
	private Object st_digests_buf;
	private salt[] st_salts_buf;
	private Object st_esalts_buf;
	private Object st_hook_salts_buf;
	
	public hashes(Object hashfile, Object hashlist_mode, Object hashlist_format, Object digests_cnt, Object digests_done, Object digests_saved, Object digests_buf, Object[] digests_shown, Object[] digests_shown_tmp, Object salts_cnt, Object salts_done, salt[] salts_buf, Object[] salts_shown, Object esalts_buf, Object hook_salts_buf, Object hashes_cnt_orig, Object hashes_cnt, hash hashes_buf, hashinfo[][] hash_info, Object out_buf, Object tmp_buf, Object st_digests_buf, salt[] st_salts_buf, Object st_esalts_buf, Object st_hook_salts_buf) {
		setHashfile(hashfile);
		setHashlist_mode(hashlist_mode);
		setHashlist_format(hashlist_format);
		setDigests_cnt(digests_cnt);
		setDigests_done(digests_done);
		setDigests_saved(digests_saved);
		setDigests_buf(digests_buf);
		setDigests_shown(digests_shown);
		setDigests_shown_tmp(digests_shown_tmp);
		setSalts_cnt(salts_cnt);
		setSalts_done(salts_done);
		setSalts_buf(salts_buf);
		setSalts_shown(salts_shown);
		setEsalts_buf(esalts_buf);
		setHook_salts_buf(hook_salts_buf);
		setHashes_cnt_orig(hashes_cnt_orig);
		setHashes_cnt(hashes_cnt);
		setHashes_buf(hashes_buf);
		setHash_info(hash_info);
		setOut_buf(out_buf);
		setTmp_buf(tmp_buf);
		setSt_digests_buf(st_digests_buf);
		setSt_salts_buf(st_salts_buf);
		setSt_esalts_buf(st_esalts_buf);
		setSt_hook_salts_buf(st_hook_salts_buf);
	}
	public hashes() {
	}
	
	public int module_hash_binary_parse(Object hashconfig, Object user_options, Object user_options_extra) {
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(user_options.getVeracrypt_pim_start());
			vc.setPim_stop(user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 2048);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(user_options.getVeracrypt_pim_start());
			vc.setPim_stop(user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 2048);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(user_options.getVeracrypt_pim_start());
			vc.setPim_stop(user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 2048);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(user_options.getVeracrypt_pim_start());
			vc.setPim_stop(user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 2048);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(user_options.getVeracrypt_pim_start());
			vc.setPim_stop(user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 2048);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(user_options.getVeracrypt_pim_start());
			vc.setPim_stop(user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 2048);
			generatedSalt_iter--;
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
		hash generatedHashes_buf = this.getHashes_buf();
		//  hashes->hashlist_mode = HL_MODE_FILE; ???hash_t hashes_buf = generatedHashes_buf;
		int hashes_cnt = 0;
		HCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return -1;
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(/*Error: Unsupported expression*/);
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		while (!fp.hc_feof()) {
			size_t nread = fp.hc_fread(in, /*Error: Unsupported expression*/, 1);
			if (nread == 0) {
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hashes_buf[hashes_cnt].getSalt(), 0, /*Error: Unsupported expression*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hashes_buf[hashes_cnt].getEsalt(), 0, /*Error: Unsupported expression*/);
			 wpa_eapol = ()hashes_buf[hashes_cnt].getEsalt();
			if (user_options.getHccapx_message_pair_chgd() == 1) {
				wpa_eapol.setMessage_pair_chgd((int)user_options.getHccapx_message_pair_chgd());
				wpa_eapol.setMessage_pair((u8)user_options.getHccapx_message_pair());
			} 
			if (wpa_eapol.getMessage_pair() & (1 << 4)) {
				wpa_eapol.setNonce_error_corrections(0);
			} else {
					if (wpa_eapol.getMessage_pair() & (1 << 7)) {
						wpa_eapol.setNonce_error_corrections(user_options.getNonce_error_corrections());
					} else {
							if (user_options.getNonce_error_corrections_chgd() == 1) {
								wpa_eapol.setNonce_error_corrections(user_options.getNonce_error_corrections());
							} else {
									wpa_eapol.setNonce_error_corrections(0);
							} 
					} 
			} 
			wpa_eapol.setDetected_le(1);
			wpa_eapol.setDetected_be(1);
			if (wpa_eapol.getMessage_pair() & (1 << 5)) {
				wpa_eapol.setDetected_le(1);
				wpa_eapol.setDetected_be(0);
			}  else if (wpa_eapol.getMessage_pair() & (1 << 6)) {
				wpa_eapol.setDetected_le(0);
				wpa_eapol.setDetected_be(1);
			} 
			hash_t hash = hashes_buf[hashes_cnt];
			int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, /*Error: Unsupported expression*/);
			if (parser_status != parser_rc.PARSER_OK) {
				continue;
			} 
			hashes_cnt++;
		}
		ModernizedCProgram.hcfree(in);
		fp.hc_fclose();
		return hashes_cnt;
		hash generatedHashes_buf = this.getHashes_buf();
		//  hashes->hashlist_mode = HL_MODE_FILE; ???hash_t hashes_buf = generatedHashes_buf;
		int hashes_cnt = 0;
		HCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return -1;
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(/*Error: Unsupported expression*/);
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		while (!fp.hc_feof()) {
			size_t nread = fp.hc_fread(in, /*Error: Unsupported expression*/, 1);
			if (nread == 0) {
				break;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hashes_buf[hashes_cnt].getSalt(), 0, /*Error: Unsupported expression*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hashes_buf[hashes_cnt].getEsalt(), 0, /*Error: Unsupported expression*/);
			 wpa_eapol = ()hashes_buf[hashes_cnt].getEsalt();
			if (user_options.getHccapx_message_pair_chgd() == 1) {
				wpa_eapol.setMessage_pair_chgd((int)user_options.getHccapx_message_pair_chgd());
				wpa_eapol.setMessage_pair((u8)user_options.getHccapx_message_pair());
			} 
			if (wpa_eapol.getMessage_pair() & (1 << 4)) {
				wpa_eapol.setNonce_error_corrections(0);
			} else {
					if (wpa_eapol.getMessage_pair() & (1 << 7)) {
						wpa_eapol.setNonce_error_corrections(user_options.getNonce_error_corrections());
					} else {
							if (user_options.getNonce_error_corrections_chgd() == 1) {
								wpa_eapol.setNonce_error_corrections(user_options.getNonce_error_corrections());
							} else {
									wpa_eapol.setNonce_error_corrections(0);
							} 
					} 
			} 
			wpa_eapol.setDetected_le(1);
			wpa_eapol.setDetected_be(1);
			if (wpa_eapol.getMessage_pair() & (1 << 5)) {
				wpa_eapol.setDetected_le(1);
				wpa_eapol.setDetected_be(0);
			}  else if (wpa_eapol.getMessage_pair() & (1 << 6)) {
				wpa_eapol.setDetected_le(0);
				wpa_eapol.setDetected_be(1);
			} 
			hash_t hash = hashes_buf[hashes_cnt];
			int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, /*Error: Unsupported expression*/);
			if (parser_status != parser_rc.PARSER_OK) {
				continue;
			} 
			hashes_cnt++;
		}
		ModernizedCProgram.hcfree(in);
		fp.hc_fclose();
		return hashes_cnt;
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		int hashes_cnt = 0;
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedDigest = hash.getDigest();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		Object generatedHashfile = this.getHashfile();
		for (int keyslot_idx = 0;
		 keyslot_idx < 8; keyslot_idx++) {
			hash_t hash = hashes_buf[hashes_cnt];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedSalt, 0, /*Error: Unsupported expression*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedEsalt, 0, /*Error: Unsupported expression*/);
			int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, generatedHashfile, /*Error: Function owner not recognized*/strlen(generatedHashfile));
			if (parser_status != parser_rc.PARSER_OK) {
				continue;
			} 
			hashes_cnt++;
		}
		return hashes_cnt;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_TC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		tc_t tc = (tc_t)generatedEsalt;
		Object generatedKeyfile_buf = tc.getKeyfile_buf();
		if (user_options.getTruecrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getTruecrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = tc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = tc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		return 1;
		// note: if module_hash_binary_parse exists, then module_hash_decode is not calledHCFILE fp = new HCFILE();
		Object generatedHashfile = this.getHashfile();
		if (fp.hc_fopen(generatedHashfile, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		byte in = (byte)ModernizedCProgram.hcmalloc(512);
		size_t n = fp.hc_fread(in, 1, 512);
		fp.hc_fclose();
		if (n != 512) {
			return (parser_rc.PARSER_VC_FILE_SIZE);
		} 
		hash generatedHashes_buf = this.getHashes_buf();
		hash_t hashes_buf = generatedHashes_buf;
		hash_t hash = hashes_buf[0];
		Object generatedDigest = hash.getDigest();
		salt generatedSalt = hash.getSalt();
		Object generatedEsalt = hash.getEsalt();
		Object generatedHook_salt = hash.getHook_salt();
		hashinfo generatedHash_info = hash.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, in, 512);
		if (parser_status != parser_rc.PARSER_OK) {
			return 0;
		} 
		ModernizedCProgram.hcfree(in)// keyfiles;// keyfiles
		vc_t vc = (vc_t)generatedEsalt;
		Object generatedKeyfile_buf = vc.getKeyfile_buf();
		if (user_options.getVeracrypt_keyfiles()) {
			byte keyfiles = ModernizedCProgram.hcstrdup(user_options.getVeracrypt_keyfiles());
			byte saveptr = ((Object)0);
			byte keyfile = /*Error: Function owner not recognized*/strtok_r(keyfiles, ",", saveptr);
			while (keyfile) {
				if (ModernizedCProgram.hc_path_read(keyfile)) {
					ModernizedCProgram.cpu_crc32(keyfile, (u8)generatedKeyfile_buf);
				} 
				keyfile = /*Error: Function owner not recognized*/strtok_r((byte)((Object)0), ",", saveptr);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(keyfiles);
		} 
		Object generatedKeyboard_layout_mapping_buf = vc.getKeyboard_layout_mapping_buf();
		int generatedKeyboard_layout_mapping_cnt = vc.getKeyboard_layout_mapping_cnt();
		// keyboard layout mappingif (user_options.getKeyboard_layout_mapping()) {
			if (ModernizedCProgram.hc_path_read(user_options.getKeyboard_layout_mapping())) {
				generatedKeyboard_layout_mapping_buf.initialize_keyboard_layout_mapping(user_options.getKeyboard_layout_mapping(), generatedKeyboard_layout_mapping_cnt);
			} 
		} 
		// veracrypt PIMsalt_t salt = generatedSalt;
		int generatedPim_stop = vc.getPim_stop();
		Object generatedSalt_iter = salt.getSalt_iter();
		if ((user_options.getVeracrypt_pim_start()) && (user_options.getVeracrypt_pim_stop())) {
			vc.setPim_start(15 + user_options.getVeracrypt_pim_start());
			vc.setPim_stop(15 + user_options.getVeracrypt_pim_stop());
			salt.setSalt_iter(generatedPim_stop * 1000);
			generatedSalt_iter--;
		} 
		return 1;
	}
	public Object getHashfile() {
		return hashfile;
	}
	public void setHashfile(Object newHashfile) {
		hashfile = newHashfile;
	}
	public Object getHashlist_mode() {
		return hashlist_mode;
	}
	public void setHashlist_mode(Object newHashlist_mode) {
		hashlist_mode = newHashlist_mode;
	}
	public Object getHashlist_format() {
		return hashlist_format;
	}
	public void setHashlist_format(Object newHashlist_format) {
		hashlist_format = newHashlist_format;
	}
	public Object getDigests_cnt() {
		return digests_cnt;
	}
	public void setDigests_cnt(Object newDigests_cnt) {
		digests_cnt = newDigests_cnt;
	}
	public Object getDigests_done() {
		return digests_done;
	}
	public void setDigests_done(Object newDigests_done) {
		digests_done = newDigests_done;
	}
	public Object getDigests_saved() {
		return digests_saved;
	}
	public void setDigests_saved(Object newDigests_saved) {
		digests_saved = newDigests_saved;
	}
	public Object getDigests_buf() {
		return digests_buf;
	}
	public void setDigests_buf(Object newDigests_buf) {
		digests_buf = newDigests_buf;
	}
	public Object[] getDigests_shown() {
		return digests_shown;
	}
	public void setDigests_shown(Object[] newDigests_shown) {
		digests_shown = newDigests_shown;
	}
	public Object[] getDigests_shown_tmp() {
		return digests_shown_tmp;
	}
	public void setDigests_shown_tmp(Object[] newDigests_shown_tmp) {
		digests_shown_tmp = newDigests_shown_tmp;
	}
	public Object getSalts_cnt() {
		return salts_cnt;
	}
	public void setSalts_cnt(Object newSalts_cnt) {
		salts_cnt = newSalts_cnt;
	}
	public Object getSalts_done() {
		return salts_done;
	}
	public void setSalts_done(Object newSalts_done) {
		salts_done = newSalts_done;
	}
	public salt[] getSalts_buf() {
		return salts_buf;
	}
	public void setSalts_buf(salt[] newSalts_buf) {
		salts_buf = newSalts_buf;
	}
	public Object[] getSalts_shown() {
		return salts_shown;
	}
	public void setSalts_shown(Object[] newSalts_shown) {
		salts_shown = newSalts_shown;
	}
	public Object getEsalts_buf() {
		return esalts_buf;
	}
	public void setEsalts_buf(Object newEsalts_buf) {
		esalts_buf = newEsalts_buf;
	}
	public Object getHook_salts_buf() {
		return hook_salts_buf;
	}
	public void setHook_salts_buf(Object newHook_salts_buf) {
		hook_salts_buf = newHook_salts_buf;
	}
	public Object getHashes_cnt_orig() {
		return hashes_cnt_orig;
	}
	public void setHashes_cnt_orig(Object newHashes_cnt_orig) {
		hashes_cnt_orig = newHashes_cnt_orig;
	}
	public Object getHashes_cnt() {
		return hashes_cnt;
	}
	public void setHashes_cnt(Object newHashes_cnt) {
		hashes_cnt = newHashes_cnt;
	}
	public hash getHashes_buf() {
		return hashes_buf;
	}
	public void setHashes_buf(hash newHashes_buf) {
		hashes_buf = newHashes_buf;
	}
	public hashinfo[][] getHash_info() {
		return hash_info;
	}
	public void setHash_info(hashinfo[][] newHash_info) {
		hash_info = newHash_info;
	}
	public Object getOut_buf() {
		return out_buf;
	}
	public void setOut_buf(Object newOut_buf) {
		out_buf = newOut_buf;
	}
	public Object getTmp_buf() {
		return tmp_buf;
	}
	public void setTmp_buf(Object newTmp_buf) {
		tmp_buf = newTmp_buf;
	}
	public Object getSt_digests_buf() {
		return st_digests_buf;
	}
	public void setSt_digests_buf(Object newSt_digests_buf) {
		st_digests_buf = newSt_digests_buf;
	}
	public salt[] getSt_salts_buf() {
		return st_salts_buf;
	}
	public void setSt_salts_buf(salt[] newSt_salts_buf) {
		st_salts_buf = newSt_salts_buf;
	}
	public Object getSt_esalts_buf() {
		return st_esalts_buf;
	}
	public void setSt_esalts_buf(Object newSt_esalts_buf) {
		st_esalts_buf = newSt_esalts_buf;
	}
	public Object getSt_hook_salts_buf() {
		return st_hook_salts_buf;
	}
	public void setSt_hook_salts_buf(Object newSt_hook_salts_buf) {
		st_hook_salts_buf = newSt_hook_salts_buf;
	}
}
