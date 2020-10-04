package application;

public class Module_hash_decodeToSha512crypt_decode {
	
	
	private static int module_hash_decode(Object hashconfig, Object digest_buf, salt salt, Object esalt_buf, Object hook_salt_buf, hashinfo hash_info, Object[] line_buf, Object line_len) {
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 43;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		int hash_len = generatedLen[0];
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.itoa64_to_int, (u8)hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		odf12_t odf12 = (odf12_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(12);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ODF;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 5;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 5;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 1;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 4;
		generatedLen_max[3] = 6;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 2;
		generatedLen_max[4] = 2;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[5] = 64;
		generatedLen_max[5] = 64;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[6] = 2;
		generatedLen_max[6] = 2;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[7] = 32;
		generatedLen_max[7] = 32;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[8] = 2;
		generatedLen_max[8] = 2;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[9] = 32;
		generatedLen_max[9] = 32;
		generatedSep[9] = (byte)'*';
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[10] = 1;
		generatedLen_max[10] = 1;
		generatedSep[10] = (byte)'*';
		generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		Object[] generatedLen = token.getLen();
		generatedLen[11] = 2048;
		generatedAttr[11] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] checksum = generatedBuf[5];
		u8[] iv = generatedBuf[7];
		u8[] salt_buf = generatedBuf[9];
		u8[] encrypted_data = generatedBuf[11];
		u32 cipher_type = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[1], (null), 10);
		u32 checksum_type = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[2], (null), 10);
		u32 iterations = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[3], (null), 10);
		u32 key_size = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[4], (null), 10);
		u32 iv_len = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[6], (null), 10);
		u32 salt_len = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[8], (null), 10);
		u32 unused = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[10], (null), 10);
		if (cipher_type != 1) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (checksum_type != 1) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (key_size != 32) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (iv_len != 16) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (salt_len != 16) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (unused != 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		// esalt
		odf12.setIterations(iterations);
		Object[] generatedChecksum = odf12.getChecksum();
		generatedChecksum[0] = ModernizedCProgram.hex_to_u32(checksum[0]);
		generatedChecksum[1] = ModernizedCProgram.hex_to_u32(checksum[8]);
		generatedChecksum[2] = ModernizedCProgram.hex_to_u32(checksum[16]);
		generatedChecksum[3] = ModernizedCProgram.hex_to_u32(checksum[24]);
		generatedChecksum[4] = ModernizedCProgram.hex_to_u32(checksum[32]);
		generatedChecksum[5] = ModernizedCProgram.hex_to_u32(checksum[40]);
		generatedChecksum[6] = ModernizedCProgram.hex_to_u32(checksum[48]);
		generatedChecksum[7] = ModernizedCProgram.hex_to_u32(checksum[56]);
		Object[] generatedIv = odf12.getIv();
		generatedIv[0] = ModernizedCProgram.hex_to_u32(iv[0]);
		generatedIv[1] = ModernizedCProgram.hex_to_u32(iv[8]);
		generatedIv[2] = ModernizedCProgram.hex_to_u32(iv[16]);
		generatedIv[3] = ModernizedCProgram.hex_to_u32(iv[24]);
		Object[] generatedEncrypted_data = odf12.getEncrypted_data();
		for (int i = 0;
		int j = 0;
		 i < 256; ) {
			generatedEncrypted_data[i] = ModernizedCProgram.hex_to_u32(encrypted_data[j]);
		}
		// salt// saltsalt.setSalt_len(salt_len);
		salt.setSalt_iter(iterations - 1);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_buf[8]);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_buf[16]);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt_buf[24/**
		   * digest
		   */]);
		digest[0] = generatedChecksum[0];
		digest[1] = generatedChecksum[1];
		digest[2] = generatedChecksum[2];
		digest[3] = generatedChecksum[3];
		digest[4] = generatedChecksum[4];
		digest[5] = generatedChecksum[5];
		digest[6] = generatedChecksum[6];
		digest[7] = generatedChecksum[7];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		ModernizedCProgram.precompute_salt_md5(generatedSalt_buf, generatedSalt_len, (u8)generatedSalt_buf_pc);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		u8[] ascii_to_ebcdic = new u8[]{-1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024};
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_RACF;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 6;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 6;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 8;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[2] = 2;
		generatedLen_max[2] = 16;
		generatedSep[2] = (byte)'$';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// salt pc
		u8[] salt_buf_ptr = (u8)generatedSalt_buf;
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		u8[] salt_buf_pc_ptr = (u8)generatedSalt_buf_pc;
		for (u32 i = 0;
		 i < generatedSalt_len; i++) {
			salt_buf_pc_ptr[i] = ascii_to_ebcdic[(int)salt_buf_ptr[i]];
		}
		for (u32 i = salt_len;
		 i < 8; i++) {
			salt_buf_pc_ptr[i] = -1024;
		}
		{ 
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[1] >> 4;
				t = t ^ generatedSalt_buf_pc[0];
				t = t & -1024;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
				t = t << 4;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[0] >> 16;
				t = t ^ generatedSalt_buf_pc[1];
				t = t & -1024;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
				t = t << 16;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[1] >> 2;
				t = t ^ generatedSalt_buf_pc[0];
				t = t & -1024;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
				t = t << 2;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[0] >> 8;
				t = t ^ generatedSalt_buf_pc[1];
				t = t & -1024;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
				t = t << 8;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[1] >> 1;
				t = t ^ generatedSalt_buf_pc[0];
				t = t & -1024;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
				t = t << 1;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
			}
			;
		}
		;
		generatedSalt_buf_pc[0] = ModernizedCProgram.rotl32(generatedSalt_buf_pc[0], -1024);
		generatedSalt_buf_pc[1] = ModernizedCProgram.rotl32(generatedSalt_buf_pc[1], -1024)// hash;// hash
		u8 hash_pos = generatedBuf[2];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		{ 
			{ 
				u32x t = new u32x();
				t = digest[1] >> 4;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 4;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 16;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 16;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 2;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 2;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 8;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 8;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 1;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 1;
				digest[1] = digest[1] ^ t;
			}
			;
		}
		;
		digest[0] = ModernizedCProgram.rotr32(digest[0], 29);
		digest[1] = ModernizedCProgram.rotr32(digest[1], 29);
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 24;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 24;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(hash_pos + 0));
		digest[1] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(hash_pos + 8));
		digest[2] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(hash_pos + 16));
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 16;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 16;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 16;
		generatedLen_max[1] = 16;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = 0;
		generatedSalt_buf[3] = 0;
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		generatedSalt_buf_pc[0] = generatedSalt_buf[0];
		generatedSalt_buf_pc[1] = generatedSalt_buf[1];
		{ 
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[1] >> 4;
				t = t ^ generatedSalt_buf_pc[0];
				t = t & -1024;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
				t = t << 4;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[0] >> 16;
				t = t ^ generatedSalt_buf_pc[1];
				t = t & -1024;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
				t = t << 16;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[1] >> 2;
				t = t ^ generatedSalt_buf_pc[0];
				t = t & -1024;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
				t = t << 2;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[0] >> 8;
				t = t ^ generatedSalt_buf_pc[1];
				t = t & -1024;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
				t = t << 8;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[1] >> 1;
				t = t ^ generatedSalt_buf_pc[0];
				t = t & -1024;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
				t = t << 1;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
			}
			;
		}
		;
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = 0;
		digest[3] = 0;
		{ 
			{ 
				u32x t = new u32x();
				t = digest[1] >> 4;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 4;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 16;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 16;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 2;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 2;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 8;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 8;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 1;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 1;
				digest[1] = digest[1] ^ t;
			}
			;
		}
		;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pdf_t pdf = (pdf_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(12);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PDF;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 2;
		generatedLen_max[3] = 2;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 1;
		generatedLen_max[4] = 6;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[5] = 1;
		generatedLen_max[5] = 1;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[6] = 2;
		generatedLen_max[6] = 2;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[7] = 32;
		generatedLen_max[7] = 32;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[8] = 2;
		generatedLen_max[8] = 2;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[9] = 64;
		generatedLen_max[9] = 64;
		generatedSep[9] = (byte)'*';
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[10] = 2;
		generatedLen_max[10] = 2;
		generatedSep[10] = (byte)'*';
		generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[11] = 64;
		generatedLen_max[11] = 64;
		generatedSep[11] = (byte)'*';
		generatedAttr[11] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 V_pos = generatedBuf[1];
		u8 R_pos = generatedBuf[2];
		u8 bits_pos = generatedBuf[3];
		u8 P_pos = generatedBuf[4];
		u8 enc_md_pos = generatedBuf[5];
		u8 id_len_pos = generatedBuf[6];
		u8 id_buf_pos = generatedBuf[7];
		u8 u_len_pos = generatedBuf[8];
		u8 u_buf_pos = generatedBuf[9];
		u8 o_len_pos = generatedBuf[10];
		u8 o_buf_pos = generatedBuf[11];
		// validate data
		int V = /*Error: Function owner not recognized*/strtol((byte)V_pos, (null), 10);
		int R = /*Error: Function owner not recognized*/strtol((byte)R_pos, (null), 10);
		int P = /*Error: Function owner not recognized*/strtol((byte)P_pos, (null), 10);
		if (V != 1) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (R != 2) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int enc_md = /*Error: Function owner not recognized*/strtol((byte)enc_md_pos, (null), 10);
		if ((enc_md != 0) && (enc_md != 1)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int id_len = /*Error: Function owner not recognized*/strtol((byte)id_len_pos, (null), 10);
		int u_len = /*Error: Function owner not recognized*/strtol((byte)u_len_pos, (null), 10);
		int o_len = /*Error: Function owner not recognized*/strtol((byte)o_len_pos, (null), 10);
		if (id_len != 16) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (u_len != 32) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (o_len != 32) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int bits = /*Error: Function owner not recognized*/strtol((byte)bits_pos, (null), 10);
		if (bits != 40) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		// copy data to esalt
		pdf.setV(V);
		pdf.setR(R);
		pdf.setP(P);
		pdf.setEnc_md(enc_md);
		Object[] generatedId_buf = pdf.getId_buf();
		generatedId_buf[0] = ModernizedCProgram.hex_to_u32(id_buf_pos + 0);
		generatedId_buf[1] = ModernizedCProgram.hex_to_u32(id_buf_pos + 8);
		generatedId_buf[2] = ModernizedCProgram.hex_to_u32(id_buf_pos + 16);
		generatedId_buf[3] = ModernizedCProgram.hex_to_u32(id_buf_pos + 24);
		pdf.setId_len(id_len);
		Object[] generatedU_buf = pdf.getU_buf();
		generatedU_buf[0] = ModernizedCProgram.hex_to_u32(u_buf_pos + 0);
		generatedU_buf[1] = ModernizedCProgram.hex_to_u32(u_buf_pos + 8);
		generatedU_buf[2] = ModernizedCProgram.hex_to_u32(u_buf_pos + 16);
		generatedU_buf[3] = ModernizedCProgram.hex_to_u32(u_buf_pos + 24);
		generatedU_buf[4] = ModernizedCProgram.hex_to_u32(u_buf_pos + 32);
		generatedU_buf[5] = ModernizedCProgram.hex_to_u32(u_buf_pos + 40);
		generatedU_buf[6] = ModernizedCProgram.hex_to_u32(u_buf_pos + 48);
		generatedU_buf[7] = ModernizedCProgram.hex_to_u32(u_buf_pos + 56);
		pdf.setU_len(u_len);
		Object[] generatedO_buf = pdf.getO_buf();
		generatedO_buf[0] = ModernizedCProgram.hex_to_u32(o_buf_pos + 0);
		generatedO_buf[1] = ModernizedCProgram.hex_to_u32(o_buf_pos + 8);
		generatedO_buf[2] = ModernizedCProgram.hex_to_u32(o_buf_pos + 16);
		generatedO_buf[3] = ModernizedCProgram.hex_to_u32(o_buf_pos + 24);
		generatedO_buf[4] = ModernizedCProgram.hex_to_u32(o_buf_pos + 32);
		generatedO_buf[5] = ModernizedCProgram.hex_to_u32(o_buf_pos + 40);
		generatedO_buf[6] = ModernizedCProgram.hex_to_u32(o_buf_pos + 48);
		generatedO_buf[7] = ModernizedCProgram.hex_to_u32(o_buf_pos + 56);
		pdf.setO_len(o_len)// we use ID for salt, maybe needs to change, we will see...;// we use ID for salt, maybe needs to change, we will see...
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedId_buf[0];
		generatedSalt_buf[1] = generatedId_buf[1];
		generatedSalt_buf[2] = generatedId_buf[2];
		generatedSalt_buf[3] = generatedId_buf[3];
		int generatedId_len = pdf.getId_len();
		salt.setSalt_len(generatedId_len);
		digest[0] = generatedU_buf[0];
		digest[1] = generatedU_buf[1];
		digest[2] = generatedU_buf[2];
		digest[3] = generatedU_buf[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		office2007_t office2007 = (office2007_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(8);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_OFFICE2007;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 8;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 8;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 4;
		generatedLen_max[1] = 4;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 2;
		generatedLen_max[2] = 2;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 3;
		generatedLen_max[3] = 3;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 2;
		generatedLen_max[4] = 2;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[5] = 32;
		generatedLen_max[5] = 32;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[6] = 32;
		generatedLen_max[6] = 32;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[7] = 40;
		generatedLen_max[7] = 40;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 verifierHashSize_pos = generatedBuf[2];
		u8 keySize_pos = generatedBuf[3];
		u8 saltSize_pos = generatedBuf[4];
		u8 osalt_pos = generatedBuf[5];
		u8 encryptedVerifier_pos = generatedBuf[6];
		u8 encryptedVerifierHash_pos = generatedBuf[7];
		u32 version = ModernizedCProgram.hc_strtoul((byte)version_pos, (null), 10);
		u32 verifierHashSize = ModernizedCProgram.hc_strtoul((byte)verifierHashSize_pos, (null), 10);
		u32 keySize = ModernizedCProgram.hc_strtoul((byte)keySize_pos, (null), 10);
		u32 saltSize = ModernizedCProgram.hc_strtoul((byte)saltSize_pos, (null), 10);
		if (version != 2007) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (verifierHashSize != 20) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (saltSize != 16) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if ((keySize != 128) && (keySize != 256)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		office2007.setKeySize(keySize/**
		   * salt
		   */);
		salt.setSalt_len(16);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_OFFICE2007);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(osalt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(osalt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(osalt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(osalt_pos + 24);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3/**
		   * esalt
		   */]);
		Object[] generatedEncryptedVerifier = office2007.getEncryptedVerifier();
		generatedEncryptedVerifier[0] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 0);
		generatedEncryptedVerifier[1] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 8);
		generatedEncryptedVerifier[2] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 16);
		generatedEncryptedVerifier[3] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 24);
		generatedEncryptedVerifier[0] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[0]);
		generatedEncryptedVerifier[1] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[1]);
		generatedEncryptedVerifier[2] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[2]);
		generatedEncryptedVerifier[3] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[3]);
		Object[] generatedEncryptedVerifierHash = office2007.getEncryptedVerifierHash();
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 0);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 8);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 16);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 24);
		generatedEncryptedVerifierHash[4] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 32);
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[0]);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[1]);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[2]);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[3]);
		generatedEncryptedVerifierHash[4] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[4/**
		   * digest
		   */]);
		digest[0] = generatedEncryptedVerifierHash[0];
		digest[1] = generatedEncryptedVerifierHash[1];
		digest[2] = generatedEncryptedVerifierHash[2];
		digest[3] = generatedEncryptedVerifierHash[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_327661);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(2048);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		krb5pa_17_t krb5pa = (krb5pa_17_t)esalt_buf;
		token_t token = new token_t();
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_KRB5PA;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE/**
		   * $krb5pa$17$*user*realm*$enc_timestamp+checksum
		   */;
		// assume no signature foundif (line_len < 11) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// assume $krb5pa$17$user$realm$enc_timestamp+checksum// assume $krb5pa$17$user$realm$enc_timestamp+checksumtoken.setToken_cnt(4);
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 512;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 512;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 104;
		generatedLen_max[3] = 112;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		u8 user_pos = new u8();
		u8 domain_pos = new u8();
		u8[] data_pos = new u8();
		u8 checksum_pos = new u8();
		int user_len;
		int domain_len;
		int data_len;
		int account_info_len;
		Object[] generatedBuf = token.getBuf();
		user_pos = generatedBuf[1];
		user_len = generatedLen[1];
		Object[] generatedUser = krb5pa.getUser();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedUser, user_pos, user_len);
		domain_pos = generatedBuf[2];
		domain_len = generatedLen[2];
		Object[] generatedDomain = krb5pa.getDomain();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedDomain, domain_pos, domain_len);
		data_pos = generatedBuf[3];
		data_len = generatedLen[3];
		account_info_len = generatedLen[2] + generatedLen[1];
		Object[] generatedAccount_info = krb5pa.getAccount_info();
		u8 account_info_ptr = (u8)generatedAccount_info;
		// domain must be uppercaseu8[] domain = new u8();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(domain, domain_pos, domain_len);
		ModernizedCProgram.uppercase(domain, domain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(account_info_ptr, domain, domain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(account_info_ptr + domain_len, user_pos, user_len);
		krb5pa.setAccount_info_len(account_info_len);
		// Split checksum// Split checksumchecksum_pos = data_pos + data_len - 24;
		data_len = data_len - 24;
		Object[] generatedChecksum = krb5pa.getChecksum();
		// hmac-sha1 is reduced to 12 bytes// hmac-sha1 is reduced to 12 bytesgeneratedChecksum[0] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 0));
		generatedChecksum[1] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 8));
		generatedChecksum[2] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 16));
		Object[] generatedEnc_timestamp = krb5pa.getEnc_timestamp();
		u8 edata_ptr = (u8)generatedEnc_timestamp;
		for (int i = 0;
		 i < data_len; i += 2) {
			u8 p0 = data_pos[i + 0];
			u8 p1 = data_pos[i + 1];
			edata_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		krb5pa.setEnc_timestamp_len(data_len / 2);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedChecksum[0];
		generatedSalt_buf[1] = generatedChecksum[1];
		generatedSalt_buf[2] = generatedChecksum[2];
		salt.setSalt_iter(4096 - 1);
		digest[0] = generatedChecksum[0];
		digest[1] = generatedChecksum[1];
		digest[2] = generatedChecksum[2];
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		apple_secure_notes_t apple_secure_notes = (apple_secure_notes_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_APPLE_SECURE_NOTES;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 5;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'*';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 10;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)'*';
		generatedLen_min[4] = 48;
		generatedLen_max[4] = 48;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer/**
			   * parse line
			   */);
		} 
		Object[] generatedBuf = token.getBuf();
		// Z_PKu8 Z_PK_pos = generatedBuf[1];
		u32 Z_PK = ModernizedCProgram.hc_strtoul((byte)Z_PK_pos, (null), 10);
		apple_secure_notes.setZ_PK(Z_PK)// ZCRYPTOITERATIONCOUNT;// ZCRYPTOITERATIONCOUNT
		u8 ZCRYPTOITERATIONCOUNT_pos = generatedBuf[2];
		u32 ZCRYPTOITERATIONCOUNT = ModernizedCProgram.hc_strtoul((byte)ZCRYPTOITERATIONCOUNT_pos, (null), 10);
		apple_secure_notes.setZCRYPTOITERATIONCOUNT(ZCRYPTOITERATIONCOUNT)// ZCRYPTOSALT;// ZCRYPTOSALT
		u8[] ZCRYPTOSALT_pos = generatedBuf[3];
		Object[] generatedZCRYPTOSALT = apple_secure_notes.getZCRYPTOSALT();
		generatedZCRYPTOSALT[0] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[0]);
		generatedZCRYPTOSALT[1] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[8]);
		generatedZCRYPTOSALT[2] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[16]);
		generatedZCRYPTOSALT[3] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[24]);
		generatedZCRYPTOSALT[4] = 0;
		generatedZCRYPTOSALT[5] = 0;
		generatedZCRYPTOSALT[6] = 0;
		generatedZCRYPTOSALT[7] = 0;
		generatedZCRYPTOSALT[8] = 0;
		generatedZCRYPTOSALT[9] = 0;
		generatedZCRYPTOSALT[10] = 0;
		generatedZCRYPTOSALT[11] = 0;
		generatedZCRYPTOSALT[12] = 0;
		generatedZCRYPTOSALT[13] = 0;
		generatedZCRYPTOSALT[14] = 0;
		generatedZCRYPTOSALT[15] = 0// ZCRYPTOWRAPPEDKEY;// ZCRYPTOWRAPPEDKEY
		u8[] ZCRYPTOWRAPPEDKEY_pos = generatedBuf[4];
		Object[] generatedZCRYPTOWRAPPEDKEY = apple_secure_notes.getZCRYPTOWRAPPEDKEY();
		generatedZCRYPTOWRAPPEDKEY[0] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[0]);
		generatedZCRYPTOWRAPPEDKEY[1] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[8]);
		generatedZCRYPTOWRAPPEDKEY[2] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[16]);
		generatedZCRYPTOWRAPPEDKEY[3] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[24]);
		generatedZCRYPTOWRAPPEDKEY[4] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[32]);
		generatedZCRYPTOWRAPPEDKEY[5] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[40])// fake salt;// fake salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedZCRYPTOSALT[0];
		generatedSalt_buf[1] = generatedZCRYPTOSALT[1];
		generatedSalt_buf[2] = generatedZCRYPTOSALT[2];
		generatedSalt_buf[3] = generatedZCRYPTOSALT[3];
		Object generatedZ_PK = apple_secure_notes.getZ_PK();
		generatedSalt_buf[4] = generatedZ_PK;
		Object generatedZCRYPTOITERATIONCOUNT = apple_secure_notes.getZCRYPTOITERATIONCOUNT();
		salt.setSalt_iter(generatedZCRYPTOITERATIONCOUNT - 1);
		salt.setSalt_len(20)// fake hash;// fake hash
		digest[0] = generatedZCRYPTOWRAPPEDKEY[0];
		digest[1] = generatedZCRYPTOWRAPPEDKEY[1];
		digest[2] = generatedZCRYPTOWRAPPEDKEY[2];
		digest[3] = generatedZCRYPTOWRAPPEDKEY[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ECRYPTFS;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 16;
		generatedLen_max[3] = 16;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)'$';
		generatedLen_min[4] = 16;
		generatedLen_max[4] = 16;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// hash
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[4];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = 0;
		digest[3] = 0;
		digest[4] = 0;
		digest[5] = 0;
		digest[6] = 0;
		digest[7] = 0;
		digest[8] = 0;
		digest[9] = 0;
		digest[10] = 0;
		digest[11] = 0;
		digest[12] = 0;
		digest[13] = 0;
		digest[14] = 0;
		digest[15] = 0;
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1])// salt;// salt
		u8 salt_pos = generatedBuf[3];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_ECRYPTFS);
		salt.setSalt_len(8);
		return (parser_rc.PARSER_OK);
		pkzip_t pkzip = (pkzip_t)esalt_buf;
		u32[] digest = (u32)digest_buf;
		byte[] input = new byte[line_len + 1];
		input[line_len] = (byte)'\0';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(input, line_buf, line_len);
		Byte saveptr = (null);
		byte[] p = /*Error: Function owner not recognized*/strtok_r(input, "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		if (/*Error: Function owner not recognized*/strncmp(p, ModernizedCProgram.SIGNATURE_PKZIP_V1, 7) != 0 && /*Error: Function owner not recognized*/strncmp(p, ModernizedCProgram.SIGNATURE_PKZIP_V2, 8) != 0) {
			return parser_rc.PARSER_SIGNATURE_UNMATCHED;
		} 
		pkzip.setVersion(1);
		if (/*Error: Function owner not recognized*/strlen(p) == 9) {
			pkzip.setVersion(2);
		} 
		byte[] sub = new byte[2];
		sub[0] = p[/*Error: Function owner not recognized*/strlen(p) - 1];
		sub[1] = (byte)'\0';
		pkzip.setHash_count(/*Error: Function owner not recognized*/atoi(sub));
		Object generatedHash_count = pkzip.getHash_count();
		// check here that the hash_count is valid for the attack typeif (generatedHash_count != 1) {
			return parser_rc.PARSER_HASH_VALUE;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		pkzip.setChecksum_size(/*Error: Function owner not recognized*/atoi(p));
		Object generatedChecksum_size = pkzip.getChecksum_size();
		if (generatedChecksum_size != 1 && generatedChecksum_size != 2) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		pkzip_hash generatedHash = pkzip.getHash();
		generatedHash.setData_type_enum(/*Error: Function owner not recognized*/atoi(p));
		Object generatedData_type_enum = generatedHash.getData_type_enum();
		if (generatedData_type_enum > 3) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		generatedHash.setMagic_type_enum(/*Error: Function owner not recognized*/atoi(p));
		Object generatedCompressed_length = generatedHash.getCompressed_length();
		if (generatedData_type_enum > 1) {
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHash.setCompressed_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHash.setUncompressed_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			if (generatedCompressed_length > (320 * 1024)) {
				return parser_rc.PARSER_TOKEN_LENGTH;
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			u32 crc32 = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%x", ModernizedCProgram.crc32);
			generatedHash.setCrc32(ModernizedCProgram.crc32);
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHash.setOffset(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHash.setAdditional_offset(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		generatedHash.setCompression_type(/*Error: Function owner not recognized*/atoi(p));
		Object generatedCompression_type = generatedHash.getCompression_type();
		if (generatedCompression_type != 0) {
			return parser_rc.PARSER_PKZIP_CT_UNMATCHED;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		generatedHash.setData_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		u16 checksum_from_crc = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%hx", checksum_from_crc);
		generatedHash.setChecksum_from_crc(checksum_from_crc);
		Object generatedVersion = pkzip.getVersion();
		Object generatedChecksum_from_crc = generatedHash.getChecksum_from_crc();
		if (generatedVersion == 2) {
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			u16 checksum_from_timestamp = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%hx", checksum_from_timestamp);
			generatedHash.setChecksum_from_timestamp(checksum_from_timestamp);
		} else {
				generatedHash.setChecksum_from_timestamp(generatedChecksum_from_crc);
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		Object[] generatedData = generatedHash.getData();
		ModernizedCProgram.hex_to_binary(p, /*Error: Function owner not recognized*/strlen(p), (byte)(generatedData));
		Object[] generatedSalt_buf = salt.getSalt_buf();
		// fake salt// fake saltgeneratedSalt_buf[0] = generatedData[0];
		generatedSalt_buf[1] = generatedData[1];
		generatedSalt_buf[2] = generatedData[2];
		generatedSalt_buf[3] = generatedData[3];
		salt.setSalt_len(16);
		Object generatedCrc32 = generatedHash.getCrc32();
		digest[0] = generatedCrc32;
		digest[1] = 0;
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_DRUPAL7;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 3;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		generatedLen[2] = 8;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		generatedLen[3] = 43;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		Object[] generatedBuf = token.getBuf();
		u8[] iter_pos = generatedBuf[1];
		u32 salt_iter = -1024 << ModernizedCProgram.itoa64_to_int(iter_pos[0]);
		if (salt_iter > -1024) {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		Object[] generatedSalt_sign = salt.getSalt_sign();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((u8)generatedSalt_sign, line_buf, 4);
		salt.setSalt_iter(salt_iter)// salt;// salt
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((u8)generatedSalt_buf, salt_pos, salt_len);
		salt.setSalt_len(salt_len)// hash;// hash
		u8[] hash_pos = generatedBuf[3];
		ModernizedCProgram.drupal7_decode((u8)digest, hash_pos)// ugly hack start;// ugly hack start
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		u8[] tmp = (u8)generatedSalt_buf_pc;
		tmp[0] = hash_pos[42]// ugly hack end;// ugly hack end
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = 0;
		digest[5] = 0;
		digest[6] = 0;
		digest[7] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_BSDICRYPT;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 1;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 4;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		generatedLen[2] = 4;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		generatedLen[3] = 11;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iteration count
		Object[] generatedBuf = token.getBuf();
		u8[] iter_pos = generatedBuf[1];
		salt.setSalt_iter(ModernizedCProgram.itoa64_to_int(iter_pos[0]) | ModernizedCProgram.itoa64_to_int(iter_pos[1]) << 6 | ModernizedCProgram.itoa64_to_int(iter_pos[2]) << 12 | ModernizedCProgram.itoa64_to_int(iter_pos[3]) << 18);
		// set saltu8[] salt_pos = generatedBuf[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.itoa64_to_int(salt_pos[0]) | ModernizedCProgram.itoa64_to_int(salt_pos[1]) << 6 | ModernizedCProgram.itoa64_to_int(salt_pos[2]) << 12 | ModernizedCProgram.itoa64_to_int(salt_pos[3]) << 18;
		salt.setSalt_len(4)// hash;// hash
		u8[] hash_pos = generatedBuf[3];
		int hash_len = generatedLen[3];
		byte c19 = ModernizedCProgram.itoa64_to_int(hash_pos[10]);
		if (c19 & 3) {
			return (parser_rc.PARSER_HASH_VALUE);
		} 
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.itoa64_to_int, hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 8);
		{ 
			{ 
				u32x t = new u32x();
				t = digest[1] >> 4;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 4;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 16;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 16;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 2;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 2;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 8;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 8;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 1;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 1;
				digest[1] = digest[1] ^ t;
			}
			;
		}
		;
		digest[0] = ModernizedCProgram.rotr32(digest[0], 31);
		digest[1] = ModernizedCProgram.rotr32(digest[1], 31);
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32 digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 104;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 104;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iv + hashu8[] decrypted = new u8[]{0};
		Object[] generatedBuf = token.getBuf();
		Object[] generatedLen = token.getLen();
		ModernizedCProgram.juniper_decrypt_hash(generatedBuf[0], generatedLen[0], decrypted)// from here we are parsing a normal md5crypt hash;// from here we are parsing a normal md5crypt hash
		u8 md5crypt_hash = decrypted + 12;
		token_t token2 = new token_t();
		token2.setToken_cnt(3);
		token2.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token2.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MD5CRYPT;
		generatedLen[0] = 3;
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 8;
		generatedLen_max[1] = 8;
		Object[] generatedSep = token2.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen[2] = 22;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer2 = token2.input_tokenizer(md5crypt_hash, 34);
		if (rc_tokenizer2 != parser_rc.PARSER_OK) {
			return (rc_tokenizer2);
		} 
		Byte danastre = "danastre";
		if (/*Error: Function owner not recognized*/memcmp(generatedBuf[1], danastre, 8) != 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_MD5CRYPT);
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 hash_pos = generatedBuf[2];
		ModernizedCProgram.md5crypt_decode((u8)digest, hash_pos);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_327661);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(2048);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		 wpa_pmkid = ()esalt_buf;
		// detect old/new format
		int old_sep = 0;
		int new_sep = 0;
		for (int i = 0;
		 i < line_len; i++) {
			byte c = line_buf[i];
			if (c == (byte)'*') {
				old_sep++;
			} 
			if (c == (byte)':') {
				new_sep++;
			} 
		}
		u8 sep = (new_sep > old_sep) ? (byte)':' : (byte)'*';
		// start normal parsing
		token_t token = new token_t();
		token.setToken_cnt(4);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = sep;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[1] = sep;
		generatedLen_min[1] = 12;
		generatedLen_max[1] = 12;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[2] = sep;
		generatedLen_min[2] = 12;
		generatedLen_max[2] = 12;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = sep;
		generatedLen_min[3] = 0;
		generatedLen_max[3] = 64;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// pmkid
		Object[] generatedBuf = token.getBuf();
		u8 pmkid_buf = generatedBuf[0];
		wpa_pmkid.getPmkid()[0] = ModernizedCProgram.hex_to_u32(pmkid_buf + 0);
		wpa_pmkid.getPmkid()[1] = ModernizedCProgram.hex_to_u32(pmkid_buf + 8);
		wpa_pmkid.getPmkid()[2] = ModernizedCProgram.hex_to_u32(pmkid_buf + 16);
		wpa_pmkid.getPmkid()[3] = ModernizedCProgram.hex_to_u32(pmkid_buf + 24)// mac_ap;// mac_ap
		u8 macap_buf = generatedBuf[1];
		wpa_pmkid.getOrig_mac_ap()[0] = ModernizedCProgram.hex_to_u8(macap_buf + 0);
		wpa_pmkid.getOrig_mac_ap()[1] = ModernizedCProgram.hex_to_u8(macap_buf + 2);
		wpa_pmkid.getOrig_mac_ap()[2] = ModernizedCProgram.hex_to_u8(macap_buf + 4);
		wpa_pmkid.getOrig_mac_ap()[3] = ModernizedCProgram.hex_to_u8(macap_buf + 6);
		wpa_pmkid.getOrig_mac_ap()[4] = ModernizedCProgram.hex_to_u8(macap_buf + 8);
		wpa_pmkid.getOrig_mac_ap()[5] = ModernizedCProgram.hex_to_u8(macap_buf + 10)// mac_sta;// mac_sta
		u8 macsta_buf = generatedBuf[2];
		wpa_pmkid.getOrig_mac_sta()[0] = ModernizedCProgram.hex_to_u8(macsta_buf + 0);
		wpa_pmkid.getOrig_mac_sta()[1] = ModernizedCProgram.hex_to_u8(macsta_buf + 2);
		wpa_pmkid.getOrig_mac_sta()[2] = ModernizedCProgram.hex_to_u8(macsta_buf + 4);
		wpa_pmkid.getOrig_mac_sta()[3] = ModernizedCProgram.hex_to_u8(macsta_buf + 6);
		wpa_pmkid.getOrig_mac_sta()[4] = ModernizedCProgram.hex_to_u8(macsta_buf + 8);
		wpa_pmkid.getOrig_mac_sta()[5] = ModernizedCProgram.hex_to_u8(macsta_buf + 10)// essid;// essid
		u8 essid_buf = generatedBuf[3];
		Object[] generatedLen = token.getLen();
		int essid_len = generatedLen[3];
		if (essid_len & 1) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		wpa_pmkid.setEssid_len(ModernizedCProgram.hex_decode(essid_buf, essid_len, (u8)wpa_pmkid.getEssid_buf()))// pmkid_data;// pmkid_data
		// "PMK "// "PMK "wpa_pmkid.getPmkid_data()[0] = -1024;
		// "Name"// "Name"wpa_pmkid.getPmkid_data()[1] = -1024;
		wpa_pmkid.getPmkid_data()[2] = (wpa_pmkid.getOrig_mac_ap()[0] << 0) | (wpa_pmkid.getOrig_mac_ap()[1] << 8) | (wpa_pmkid.getOrig_mac_ap()[2] << 16) | (wpa_pmkid.getOrig_mac_ap()[3] << 24);
		wpa_pmkid.getPmkid_data()[3] = (wpa_pmkid.getOrig_mac_ap()[4] << 0) | (wpa_pmkid.getOrig_mac_ap()[5] << 8) | (wpa_pmkid.getOrig_mac_sta()[0] << 16) | (wpa_pmkid.getOrig_mac_sta()[1] << 24);
		wpa_pmkid.getPmkid_data()[4] = (wpa_pmkid.getOrig_mac_sta()[2] << 0) | (wpa_pmkid.getOrig_mac_sta()[3] << 8) | (wpa_pmkid.getOrig_mac_sta()[4] << 16) | (wpa_pmkid.getOrig_mac_sta()[5] << 24);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*/// salt/*Error: Function owner not recognized*/// saltmemcpy(generatedSalt_buf, wpa_pmkid.getEssid_buf(), wpa_pmkid.getEssid_len());
		salt.setSalt_len(wpa_pmkid.getEssid_len());
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_WPA_PBKDF2 - 1)// hash;// hash
		digest[0] = wpa_pmkid.getPmkid()[0];
		digest[1] = wpa_pmkid.getPmkid()[1];
		digest[2] = wpa_pmkid.getPmkid()[2];
		digest[3] = wpa_pmkid.getPmkid()[3];
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 96;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 96;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = 0;
		digest[7] = 0;
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = 0;
		digest[7] = 0;
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA384M_A;
			digest[1] -= sha2_64_constants.SHA384M_B;
			digest[2] -= sha2_64_constants.SHA384M_C;
			digest[3] -= sha2_64_constants.SHA384M_D;
			digest[4] -= sha2_64_constants.SHA384M_E;
			digest[5] -= sha2_64_constants.SHA384M_F;
			digest[6] -= 0;
			digest[7] -= 0;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_POSTGRESQL_AUTH;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 32;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 8;
		generatedLen_max[2] = 8;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// hash
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[3];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D/*
			   * store salt
			   */;
		} 
		u8 salt_pos = generatedBuf[2];
		// first 4 bytes are the "challenge"
		Object[] generatedSalt_buf = salt.getSalt_buf();
		u8[] salt_buf_ptr = (u8)generatedSalt_buf;
		salt_buf_ptr[0] = ModernizedCProgram.hex_to_u8(salt_pos + 0);
		salt_buf_ptr[1] = ModernizedCProgram.hex_to_u8(salt_pos + 2);
		salt_buf_ptr[2] = ModernizedCProgram.hex_to_u8(salt_pos + 4);
		salt_buf_ptr[3] = ModernizedCProgram.hex_to_u8(salt_pos + 6)// append the user name;// append the user name
		u8 user_pos = generatedBuf[1];
		int user_len = generatedLen[1];
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, user_pos, user_len, salt_buf_ptr + 4, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		generatedSalt_len += 4;
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		pbkdf2_sha512_t pbkdf2_sha512 = (pbkdf2_sha512_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PASSLIB_PBKDF2_SHA512;
		Object[] generatedSep = token.getSep();
		// the hash starts with a $// the hash starts with a $generatedSep[0] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 0;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[1] = (byte)'$';
		generatedLen_min[1] = 13;
		generatedLen_max[1] = 13;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		// iterations in decimal representation// iterations in decimal representationgeneratedSep[2] = (byte)'$';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// salt in alternate base64 repretentation// salt in alternate base64 repretentationgeneratedSep[3] = (byte)'$';
		generatedLen_min[3] = 0;
		generatedLen_max[3] = 256;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		// payload in alternate base64 representanion// payload in alternate base64 representaniongeneratedSep[4] = (byte)'$';
		generatedLen_min[4] = ModernizedCProgram.HASH_LEN_B64;
		generatedLen_max[4] = ModernizedCProgram.HASH_LEN_B64;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		// iteru8 iter_pos = generatedBuf[2];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10) - 1);
		// base64 decode saltu8 salt_pos = generatedBuf[3];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[3];
		u8[] tmp_buf = new u8[]{0};
		size_t salt_len_decoded = ModernizedCProgram.base64_decode(ModernizedCProgram.ab64_to_int, (u8)salt_pos, salt_len, tmp_buf);
		Object[] generatedSalt_buf = pbkdf2_sha512.getSalt_buf();
		u8 salt_buf_ptr = (u8)generatedSalt_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr, tmp_buf, salt_len_decoded);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, salt_buf_ptr, salt_len_decoded);
		salt.setSalt_len(salt_len_decoded);
		// base64 decode hashu8 hash_pos = generatedBuf[4];
		int hash_len = generatedLen[4];
		ModernizedCProgram.base64_decode(ModernizedCProgram.ab64_to_int, (u8)hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, ModernizedCProgram.HASH_LEN_RAW);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_1K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[1] = 64;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[2] = 32;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer/**
			   * salt
			   */);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 salt1_pos = generatedBuf[2];
		u8 salt2_pos = generatedBuf[0];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt1_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt1_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt1_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt1_pos + 24);
		generatedSalt_buf[4] = ModernizedCProgram.hex_to_u32(salt2_pos + 0);
		generatedSalt_buf[5] = ModernizedCProgram.hex_to_u32(salt2_pos + 8);
		generatedSalt_buf[6] = ModernizedCProgram.hex_to_u32(salt2_pos + 16);
		generatedSalt_buf[7] = ModernizedCProgram.hex_to_u32(salt2_pos + 24);
		generatedSalt_buf[8] = ModernizedCProgram.hex_to_u32(salt2_pos + 32);
		generatedSalt_buf[9] = ModernizedCProgram.hex_to_u32(salt2_pos + 40);
		generatedSalt_buf[10] = ModernizedCProgram.hex_to_u32(salt2_pos + 48);
		generatedSalt_buf[11] = ModernizedCProgram.hex_to_u32(salt2_pos + 56);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3]);
		generatedSalt_buf[4] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[4]);
		generatedSalt_buf[5] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[5]);
		generatedSalt_buf[6] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[6]);
		generatedSalt_buf[7] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[7]);
		generatedSalt_buf[8] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[8]);
		generatedSalt_buf[9] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[9]);
		generatedSalt_buf[10] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[10]);
		generatedSalt_buf[11] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[11]);
		salt.setSalt_len(48);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_ANDROIDFDE_SAMSUNG - 1/**
		   * digest buf
		   */);
		u8 hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'$';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[1] = 16;
		generatedLen_max[1] = 16;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer/**
			   * salt
			   */);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] salt_pos = generatedBuf[0];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[0];
		int user_len = 0;
		for (int i = 0;
		 i < salt_len; i++) {
			if (salt_pos[i] == (byte)' ') {
				continue;
			} 
			user_len++;
		}
		// SAP user names cannot be longer than 12 charactersif (user_len > 12) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// SAP user name cannot start with ! or ?if (salt_pos[0] == (byte)'!' || salt_pos[0] == (byte)'?') {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH/**
			   * hash
			   */);
		} 
		u8 hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 8;
		generatedLen_max[1] = 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SHA512AIX;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 2;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 2;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[2] = 16;
		generatedLen_max[2] = 48;
		generatedSep[2] = (byte)'$';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen[3] = 86;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] iter_pos = generatedBuf[1];
		byte[] salt_iter = new byte[]{iter_pos[0], iter_pos[1], 0};
		Object[] generatedSalt_sign = salt.getSalt_sign();
		generatedSalt_sign[0] = ModernizedCProgram.hc_strtoul((byte)salt_iter, (null), 10);
		salt.setSalt_iter((-1024 << ModernizedCProgram.hc_strtoul((byte)salt_iter, (null), 10)) - 1);
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 hash_pos = generatedBuf[3];
		ModernizedCProgram.sha512aix_decode((u8)digest, hash_pos);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'@';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 0;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[1] = (byte)'@';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = (byte)'@';
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 128;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'@';
		generatedLen_min[3] = 8;
		generatedLen_max[3] = 16;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// check hash type
		Object[] generatedBuf = token.getBuf();
		if (generatedBuf[1][0] != (byte)'m') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		// check iter
		u32 iter = ModernizedCProgram.ROUNDS_QNX;
		Object[] generatedLen = token.getLen();
		if (generatedLen[1] > 1) {
			if (generatedBuf[1][1] != (byte)',') {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
			iter = ModernizedCProgram.hc_strtoul((byte)generatedBuf[1] + 2, (null), 10);
		} 
		// iter++; the additinal round is added in the init kernel// iter++; the additinal round is added in the init kernelsalt.setSalt_iter(iter)// digest;// digest
		if (generatedLen[2] != 32) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 0);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 8);
		digest[2] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 16);
		digest[3] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 24)// salt;// salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		if ((generatedLen[3] == 8) || (generatedLen[3] == 16)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, generatedBuf[3], generatedLen[3]);
			salt.setSalt_len(generatedLen[3]);
		} else {
				return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[8] = ModernizedCProgram.hex_to_u32(hash_pos + 64);
		digest[9] = ModernizedCProgram.hex_to_u32(hash_pos + 72);
		digest[10] = ModernizedCProgram.hex_to_u32(hash_pos + 80);
		digest[11] = ModernizedCProgram.hex_to_u32(hash_pos + 88);
		digest[12] = ModernizedCProgram.hex_to_u32(hash_pos + 96);
		digest[13] = ModernizedCProgram.hex_to_u32(hash_pos + 104);
		digest[14] = ModernizedCProgram.hex_to_u32(hash_pos + 112);
		digest[15] = ModernizedCProgram.hex_to_u32(hash_pos + 120);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		ikepsk_t ikepsk = (ikepsk_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(9);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 1024;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[1] = (byte)':';
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 1024;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[2] = (byte)':';
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 1024;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)':';
		generatedLen_min[3] = 0;
		generatedLen_max[3] = 1024;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)':';
		generatedLen_min[4] = 0;
		generatedLen_max[4] = 1024;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[5] = (byte)':';
		generatedLen_min[5] = 0;
		generatedLen_max[5] = 1024;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[6] = (byte)':';
		generatedLen_min[6] = 0;
		generatedLen_max[6] = 128;
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[7] = (byte)':';
		generatedLen_min[7] = 0;
		generatedLen_max[7] = 128;
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[8] = (byte)':';
		generatedLen_min[8] = 40;
		generatedLen_max[8] = 40;
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedMsg_len = ikepsk.getMsg_len();
		Object[] generatedLen = token.getLen();
		generatedMsg_len[0] = generatedLen[0] / 2;
		generatedMsg_len[1] = generatedMsg_len[0] + generatedLen[1] / 2;
		generatedMsg_len[2] = generatedMsg_len[1] + generatedLen[2] / 2;
		generatedMsg_len[3] = generatedMsg_len[2] + generatedLen[3] / 2;
		generatedMsg_len[4] = generatedMsg_len[3] + generatedLen[4] / 2;
		generatedMsg_len[5] = generatedMsg_len[4] + generatedLen[5] / 2;
		ikepsk.setNr_len((generatedLen[6] + generatedLen[7]) / 2);
		if (generatedMsg_len[5] > 512) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object generatedNr_len = ikepsk.getNr_len();
		if (generatedNr_len > 64) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedMsg_buf = ikepsk.getMsg_buf();
		u8 ptr1 = (u8)generatedMsg_buf;
		Object[] generatedNr_buf = ikepsk.getNr_buf();
		u8 ptr2 = (u8)generatedNr_buf;
		Object[] generatedBuf = token.getBuf();
		for (int i = 0;
		 i < generatedLen[0]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[0] + i);
		}
		for (int i = 0;
		 i < generatedLen[1]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[1] + i);
		}
		for (int i = 0;
		 i < generatedLen[2]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[2] + i);
		}
		for (int i = 0;
		 i < generatedLen[3]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[3] + i);
		}
		for (int i = 0;
		 i < generatedLen[4]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[4] + i);
		}
		for (int i = 0;
		 i < generatedLen[5]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[5] + i);
		}
		for (int i = 0;
		 i < generatedLen[6]; i += 2) {
			ptr2++ = ModernizedCProgram.hex_to_u8(generatedBuf[6] + i);
		}
		for (int i = 0;
		 i < generatedLen[7]; i += 2) {
			ptr2++ = ModernizedCProgram.hex_to_u8(generatedBuf[7] + i);
		}
		ptr1++ = -1024;
		ptr2++ = -1024/**
		   * Store to database
		   */;
		u8 hash_pos = generatedBuf[8];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		salt.setSalt_len(32);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedNr_buf[0];
		generatedSalt_buf[1] = generatedNr_buf[1];
		generatedSalt_buf[2] = generatedNr_buf[2];
		generatedSalt_buf[3] = generatedNr_buf[3];
		generatedSalt_buf[4] = generatedNr_buf[4];
		generatedSalt_buf[5] = generatedNr_buf[5];
		generatedSalt_buf[6] = generatedNr_buf[6];
		generatedSalt_buf[7] = generatedNr_buf[7];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		android_backup_t android_backup = (android_backup_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(8);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ANDROID_BACKUP;
		Object[] generatedLen = token.getLen();
		// signature// signaturegeneratedLen[0] = 4;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		// version// versiongeneratedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// cipher// ciphergeneratedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// iter// itergeneratedLen_min[3] = 1;
		generatedLen_max[3] = 6;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// user_salt// user_saltgeneratedLen_min[4] = 128;
		generatedLen_max[4] = 128;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		// ck_salt// ck_saltgeneratedLen_min[5] = 128;
		generatedLen_max[5] = 128;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		// user_iv// user_ivgeneratedLen_min[6] = 32;
		generatedLen_max[6] = 32;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		// masterkey_blob// masterkey_blobgeneratedLen_min[7] = 192;
		generatedLen_max[7] = 192;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 cipher_pos = generatedBuf[2];
		u8 iter_pos = generatedBuf[3];
		u8 user_salt_pos = generatedBuf[4];
		u8 ck_salt_pos = generatedBuf[5];
		u8 user_iv_pos = generatedBuf[6];
		u8 masterkey_blob_pos = generatedBuf[7];
		// version
		int version = ModernizedCProgram.hc_strtoul((byte)version_pos, (null), 10);
		android_backup.setVersion(version)// cipher;// cipher
		int cipher = ModernizedCProgram.hc_strtoul((byte)cipher_pos, (null), 10);
		android_backup.setCipher(cipher)// iter;// iter
		int iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		android_backup.setIter(iter)// user_salt;// user_salt
		Object[] generatedUser_salt = android_backup.getUser_salt();
		for (int i = 0;
		int j = 0;
		 j < 128; ) {
			generatedUser_salt[i] = ModernizedCProgram.hex_to_u32((u8)user_salt_pos + j);
		}
		Object[] generatedCk_salt = android_backup.getCk_salt();
		// ck_saltfor (int i = 0;
		int j = 0;
		 j < 128; ) {
			generatedCk_salt[i] = ModernizedCProgram.hex_to_u32((u8)ck_salt_pos + j);
		}
		Object[] generatedUser_iv = android_backup.getUser_iv();
		// user_ivfor (int i = 0;
		int j = 0;
		 j < 32; ) {
			generatedUser_iv[i] = ModernizedCProgram.hex_to_u32((u8)user_iv_pos + j);
		}
		Object[] generatedMasterkey_blob = android_backup.getMasterkey_blob();
		// masterkey_blobfor (int i = 0;
		int j = 0;
		 j < 192; ) {
			generatedMasterkey_blob[i] = ModernizedCProgram.hex_to_u32((u8)masterkey_blob_pos + j);
		}
		Object[] generatedSalt_buf = salt.getSalt_buf();
		// make the entry unique in our databases// make the entry unique in our databasesgeneratedSalt_buf[0] = generatedUser_salt[0];
		generatedSalt_buf[1] = generatedUser_salt[1];
		generatedSalt_buf[2] = generatedUser_salt[2];
		generatedSalt_buf[3] = generatedUser_salt[3];
		generatedSalt_buf[4] = generatedUser_salt[4];
		generatedSalt_buf[5] = generatedUser_salt[5];
		generatedSalt_buf[6] = generatedUser_salt[6];
		generatedSalt_buf[7] = generatedUser_salt[7];
		generatedSalt_buf[8] = generatedUser_salt[8];
		generatedSalt_buf[9] = generatedUser_salt[9];
		generatedSalt_buf[10] = generatedUser_salt[10];
		generatedSalt_buf[11] = generatedUser_salt[11];
		generatedSalt_buf[12] = generatedUser_salt[12];
		generatedSalt_buf[13] = generatedUser_salt[13];
		generatedSalt_buf[14] = generatedUser_salt[14];
		generatedSalt_buf[15] = generatedUser_salt[15];
		salt.setSalt_len(64);
		Object generatedIter = android_backup.getIter();
		salt.setSalt_iter(generatedIter - 1);
		digest[0] = generatedMasterkey_blob[0];
		digest[1] = generatedMasterkey_blob[1];
		digest[2] = generatedMasterkey_blob[2];
		digest[3] = generatedMasterkey_blob[3];
		return (parser_rc.PARSER_OK);
		u32 digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SHA256CRYPT;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 3;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 16;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_OPTIONAL_ROUNDS;
		generatedLen[2] = 43;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_SHA256CRYPT);
		int generatedOpt_len = token.getOpt_len();
		Object generatedOpt_buf = token.getOpt_buf();
		if (generatedOpt_len != -1) {
			salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)generatedOpt_buf + 7, (null), 10));
		} 
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 hash_pos = generatedBuf[2];
		ModernizedCProgram.sha256crypt_decode((u8)digest, hash_pos);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_1K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_1K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		solarwinds_t solarwinds = (solarwinds_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SOLARWINDS_ORION;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 14;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 88;
		generatedLen_max[2] = 88;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_SOLARWINDS_ORION - 1)// save original salt for encode function;// save original salt for encode function
		Object[] generatedBuf = token.getBuf();
		// this is the only reason why we have an esalt in this hash-modeByte salt_pos = (byte)generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = solarwinds.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, salt_pos, salt_len)// for pbkdf2 salt we need to do hash-mode specific modifications;// for pbkdf2 salt we need to do hash-mode specific modifications
		byte[] custom_salt = new byte[8];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(custom_salt, salt_pos, (((true) < (salt_len)) ? (true) : (salt_len)));
		if (salt_len < 8) {
			Byte SALT_PADDING = "1244352345234";
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(custom_salt + salt_len, SALT_PADDING, 8 - salt_len);
		} 
		ModernizedCProgram.lowercase((u8)custom_salt, 8);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, custom_salt, 8);
		salt.setSalt_len(8)// hash;// hash
		u8 hash_pos = generatedBuf[2];
		int hash_len = generatedLen[2];
		u8[] tmp_buf = new u8();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		int tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		if (tmp_len < 64) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, tmp_len);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha256_t pbkdf2_sha256 = (pbkdf2_sha256_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_CISCO8;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 3;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 14;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 14;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen[2] = 43;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt is not encoded
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = pbkdf2_sha256.getSalt_buf();
		u8[] salt_buf_ptr = (u8)generatedSalt_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr, salt_pos, salt_len);
		salt_buf_ptr[17] = -1024;
		salt_buf_ptr[18] = -1024// add some stuff to normal salt to make sorted happy;// add some stuff to normal salt to make sorted happy
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		salt.setSalt_len(salt_len);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_CISCO8 - 1)// base64 decode hash;// base64 decode hash
		u8 hash_pos = generatedBuf[2];
		int hash_len = generatedLen[2];
		u8[] tmp_buf = new u8[]{0};
		int tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.itoa64_to_int, hash_pos, hash_len, tmp_buf);
		if (tmp_len != 32) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		 wpa_eapol = ()esalt_buf;
		// the *wpa was partially initialized beforehand, we can not simply memset it to zero
		hccapx_t in = new hccapx_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(in, line_buf, /*Error: Unsupported expression*/);
		Object generatedSignature = in.getSignature();
		if (generatedSignature != -1024) {
			return (parser_rc.PARSER_HCCAPX_SIGNATURE);
		} 
		Object generatedVersion = in.getVersion();
		if (generatedVersion != 4) {
			return (parser_rc.PARSER_HCCAPX_VERSION);
		} 
		Object generatedEapol_len = in.getEapol_len();
		if (generatedEapol_len < 1 || generatedEapol_len > 255) {
			return (parser_rc.PARSER_HCCAPX_EAPOL_LEN);
		} 
		Object[] generatedKeymic = in.getKeymic();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedKeymic, generatedKeymic, 16/*
		    http://www.one-net.eu/jsw/j_sec/m_ptype.html
		    The phrase "Pairwise key expansion"
		    Access Point Address (referred to as Authenticator Address AA)
		    Supplicant Address (referred to as Supplicant Address SA)
		    Access Point Nonce (referred to as Authenticator Anonce)
		    Wireless Device Nonce (referred to as Supplicant Nonce Snonce)
		  */);
		Object generatedEssid_len = in.getEssid_len();
		u32 salt_len = generatedEssid_len;
		if (salt_len > 32) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object[] generatedEssid = in.getEssid();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, generatedEssid, generatedEssid_len);
		salt.setSalt_len(salt_len);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_WPA_PBKDF2 - 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedEssid, generatedEssid, generatedEssid_len);
		wpa_eapol.setEssid_len(generatedEssid_len);
		Object generatedKeyver = in.getKeyver();
		wpa_eapol.setKeyver(generatedKeyver);
		if ((generatedKeyver != 1) && (generatedKeyver != 2) && (generatedKeyver != 3)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		u8[] pke_ptr = (u8)wpa_eapol.getPke();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(pke_ptr, 0, 128);
		Object[] generatedMac_ap = in.getMac_ap();
		Object[] generatedMac_sta = in.getMac_sta();
		Object[] generatedNonce_ap = in.getNonce_ap();
		Object[] generatedNonce_sta = in.getNonce_sta();
		if ((generatedKeyver == 1) || (generatedKeyver == 2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr, "Pairwise key expansion", 23);
			if (/*Error: Function owner not recognized*/memcmp(generatedMac_ap, generatedMac_sta, 6) < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 23, generatedMac_ap, 6);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 29, generatedMac_sta, 6);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 23, generatedMac_sta, 6);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 29, generatedMac_ap, 6);
			} 
			wpa_eapol.setNonce_compare(/*Error: Function owner not recognized*/memcmp(generatedNonce_ap, generatedNonce_sta, 32));
			if (wpa_eapol.getNonce_compare() < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 35, generatedNonce_ap, 32);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 67, generatedNonce_sta, 32);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 35, generatedNonce_sta, 32);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 67, generatedNonce_ap, 32);
			} 
		}  else if (generatedKeyver == 3) {
			pke_ptr[0] = 1;
			pke_ptr[1] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 2, "Pairwise key expansion", 22);
			if (/*Error: Function owner not recognized*/memcmp(generatedMac_ap, generatedMac_sta, 6) < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 24, generatedMac_ap, 6);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 30, generatedMac_sta, 6);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 24, generatedMac_sta, 6);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 30, generatedMac_ap, 6);
			} 
			wpa_eapol.setNonce_compare(/*Error: Function owner not recognized*/memcmp(generatedNonce_ap, generatedNonce_sta, 32));
			if (wpa_eapol.getNonce_compare() < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 36, generatedNonce_ap, 32);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 68, generatedNonce_sta, 32);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 36, generatedNonce_sta, 32);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 68, generatedNonce_ap, 32);
			} 
			pke_ptr[100] = -1024;
			pke_ptr[101] = 1;
		} 
		for (int i = 0;
		 i < 32; i++) {
			wpa_eapol.getPke()[i] = ModernizedCProgram.byte_swap_32(wpa_eapol.getPke()[i]);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(wpa_eapol.getOrig_mac_ap(), generatedMac_ap, 6);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(wpa_eapol.getOrig_mac_sta(), generatedMac_sta, 6);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(wpa_eapol.getOrig_nonce_ap(), generatedNonce_ap, 32);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(wpa_eapol.getOrig_nonce_sta(), generatedNonce_sta, 32);
		Object generatedMessage_pair = in.getMessage_pair();
		u8 message_pair_orig = generatedMessage_pair;
		// ignore the highest bit (it is used to indicate if the replay counters did match)// ignore the highest bit (it is used to indicate if the replay counters did match)generatedMessage_pair &=  -1024;
		if (wpa_eapol.getMessage_pair_chgd() == 1) {
			if (generatedMessage_pair != generatedMessage_pair) {
				return (parser_rc.PARSER_HCCAPX_MESSAGE_PAIR);
			} 
		} 
		wpa_eapol.setMessage_pair(message_pair_orig);
		wpa_eapol.setEapol_len(generatedEapol_len);
		u8[] eapol_ptr = (u8)wpa_eapol.getEapol();
		Object[] generatedEapol = in.getEapol();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(eapol_ptr, generatedEapol, generatedEapol_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(eapol_ptr + generatedEapol_len, 0, (256 + 64) - generatedEapol_len);
		eapol_ptr[generatedEapol_len] = -1024;
		if (generatedKeyver == 1) {
		}  else if (generatedKeyver == 2) {
			generatedKeymic[0] = ModernizedCProgram.byte_swap_32(generatedKeymic[0]);
			generatedKeymic[1] = ModernizedCProgram.byte_swap_32(generatedKeymic[1]);
			generatedKeymic[2] = ModernizedCProgram.byte_swap_32(generatedKeymic[2]);
			generatedKeymic[3] = ModernizedCProgram.byte_swap_32(generatedKeymic[3]);
			for (int i = 0;
			 i < 64; i++) {
				generatedEapol[i] = ModernizedCProgram.byte_swap_32(generatedEapol[i]);
			}
		}  else if (generatedKeyver == 3) {
		} 
		// nothing to do
		// Create a hash of the nonce as ESSID is not unique enough// Not a regular MD5 but good enough// We can also ignore cases where we should bzero the work bufferu32[] hash = new u32();
		hash[0] = 0;
		hash[1] = 1;
		hash[2] = 2;
		hash[3] = 3;
		u32[] block = new u32();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(block, 0, /*Error: sizeof expression not supported yet*/);
		u8[] block_ptr = (u8)block;
		for (int i = 0;
		 i < 16; i++) {
			block[i] = generatedSalt_buf[i];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = wpa_eapol.getPke()[i + 0];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = wpa_eapol.getPke()[i + 16];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = generatedEapol[i + 0];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = generatedEapol[i + 16];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = generatedEapol[i + 32];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = generatedEapol[i + 48];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 6; i++) {
			block_ptr[i + 0] = wpa_eapol.getOrig_mac_ap()[i];
		}
		for (int i = 0;
		 i < 6; i++) {
			block_ptr[i + 6] = wpa_eapol.getOrig_mac_sta()[i];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 32; i++) {
			block_ptr[i + 0] = wpa_eapol.getOrig_nonce_ap()[i];
		}
		for (int i = 0;
		 i < 32; i++) {
			block_ptr[i + 32] = wpa_eapol.getOrig_nonce_sta()[i];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		block[0] = generatedKeymic[0];
		block[1] = generatedKeymic[1];
		block[2] = generatedKeymic[2];
		block[3] = generatedKeymic[3];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash)// make all this stuff unique;// make all this stuff unique
		digest[0] = hash[0];
		digest[1] = hash[1];
		digest[2] = hash[2];
		digest[3] = hash[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = "{SHA}";
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 28;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 28;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[1];
		int hash_len = generatedLen[1];
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 20);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		ansible_vault_t ansible_vault = (ansible_vault_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ANSIBLE_VAULT;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 64;
		generatedLen_max[3] = 64;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)'*';
		generatedLen_min[4] = 32;
		generatedLen_max[4] = 32768;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[5] = (byte)'*';
		generatedLen_min[5] = 64;
		generatedLen_max[5] = 64;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// cipher (unused)
		Object[] generatedBuf = token.getBuf();
		u8 cipher_pos = generatedBuf[1];
		ansible_vault.setCipher(ModernizedCProgram.hc_strtoul((byte)cipher_pos, (null), 10))// version (unused);// version (unused)
		u8 version_pos = generatedBuf[2];
		ansible_vault.setVersion(ModernizedCProgram.hc_strtoul((byte)version_pos, (null), 10))// salt;// salt
		u8 salt_pos = generatedBuf[3];
		salt.setSalt_len(32);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_ANSIBLE_VAULT - 1);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt_pos + 24);
		generatedSalt_buf[4] = ModernizedCProgram.hex_to_u32(salt_pos + 32);
		generatedSalt_buf[5] = ModernizedCProgram.hex_to_u32(salt_pos + 40);
		generatedSalt_buf[6] = ModernizedCProgram.hex_to_u32(salt_pos + 48);
		generatedSalt_buf[7] = ModernizedCProgram.hex_to_u32(salt_pos + 56);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3]);
		generatedSalt_buf[4] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[4]);
		generatedSalt_buf[5] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[5]);
		generatedSalt_buf[6] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[6]);
		generatedSalt_buf[7] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[7])// ciphertext;// ciphertext
		u8[] ct_buf_pos = generatedBuf[4];
		int ct_buf_len = generatedLen[4];
		Object[] generatedCt_data_buf = ansible_vault.getCt_data_buf();
		u8[] ct_data_ptr = (u8)generatedCt_data_buf;
		Object generatedCt_data_len = ansible_vault.getCt_data_len();
		for (int i = 0;
		int j = 0;
		 j < ct_buf_len; ) {
			ct_data_ptr[i] = ModernizedCProgram.hex_to_u8((u8)ct_buf_pos[j]);
			generatedCt_data_len++;
		}
		// hashu8[] hash_pos = generatedBuf[5];
		digest[0] = ModernizedCProgram.hex_to_u32((u8)hash_pos[0]);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)hash_pos[8]);
		digest[2] = ModernizedCProgram.hex_to_u32((u8)hash_pos[16]);
		digest[3] = ModernizedCProgram.hex_to_u32((u8)hash_pos[24]);
		digest[4] = ModernizedCProgram.hex_to_u32((u8)hash_pos[32]);
		digest[5] = ModernizedCProgram.hex_to_u32((u8)hash_pos[40]);
		digest[6] = ModernizedCProgram.hex_to_u32((u8)hash_pos[48]);
		digest[7] = ModernizedCProgram.hex_to_u32((u8)hash_pos[56]);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MSSQL2012;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[2] = 128;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[2];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA512M_A;
			digest[1] -= sha2_64_constants.SHA512M_B;
			digest[2] -= sha2_64_constants.SHA512M_C;
			digest[3] -= sha2_64_constants.SHA512M_D;
			digest[4] -= sha2_64_constants.SHA512M_E;
			digest[5] -= sha2_64_constants.SHA512M_F;
			digest[6] -= sha2_64_constants.SHA512M_G;
			digest[7] -= sha2_64_constants.SHA512M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32 digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MD5APR1;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 8;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_OPTIONAL_ROUNDS;
		generatedLen[2] = 22;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_MD5CRYPT);
		int generatedOpt_len = token.getOpt_len();
		Object generatedOpt_buf = token.getOpt_buf();
		if (generatedOpt_len != -1) {
			salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)generatedOpt_buf + 7, (null), 10));
		} 
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 hash_pos = generatedBuf[2];
		ModernizedCProgram.md5crypt_decode((u8)digest, hash_pos);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pdf_t pdf = (pdf_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(12);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PDF;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 2;
		generatedLen_max[3] = 2;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 1;
		generatedLen_max[4] = 6;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[5] = 1;
		generatedLen_max[5] = 1;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[6] = 2;
		generatedLen_max[6] = 2;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[7] = 32;
		generatedLen_max[7] = 32;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[8] = 2;
		generatedLen_max[8] = 2;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[9] = 64;
		generatedLen_max[9] = 64;
		generatedSep[9] = (byte)'*';
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[10] = 2;
		generatedLen_max[10] = 2;
		generatedSep[10] = (byte)'*';
		generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[11] = 64;
		generatedLen_max[11] = 64;
		generatedSep[11] = (byte)'*';
		generatedAttr[11] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 V_pos = generatedBuf[1];
		u8 R_pos = generatedBuf[2];
		u8 bits_pos = generatedBuf[3];
		u8 P_pos = generatedBuf[4];
		u8 enc_md_pos = generatedBuf[5];
		u8 id_len_pos = generatedBuf[6];
		u8 id_buf_pos = generatedBuf[7];
		u8 u_len_pos = generatedBuf[8];
		u8 u_buf_pos = generatedBuf[9];
		u8 o_len_pos = generatedBuf[10];
		u8 o_buf_pos = generatedBuf[11];
		// validate data
		int V = /*Error: Function owner not recognized*/strtol((byte)V_pos, (null), 10);
		int R = /*Error: Function owner not recognized*/strtol((byte)R_pos, (null), 10);
		int P = /*Error: Function owner not recognized*/strtol((byte)P_pos, (null), 10);
		if (V != 1) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (R != 2) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int enc_md = /*Error: Function owner not recognized*/strtol((byte)enc_md_pos, (null), 10);
		if ((enc_md != 0) && (enc_md != 1)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int id_len = /*Error: Function owner not recognized*/strtol((byte)id_len_pos, (null), 10);
		int u_len = /*Error: Function owner not recognized*/strtol((byte)u_len_pos, (null), 10);
		int o_len = /*Error: Function owner not recognized*/strtol((byte)o_len_pos, (null), 10);
		if (id_len != 16) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (u_len != 32) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (o_len != 32) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int bits = /*Error: Function owner not recognized*/strtol((byte)bits_pos, (null), 10);
		if (bits != 40) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		// copy data to esalt
		pdf.setV(V);
		pdf.setR(R);
		pdf.setP(P);
		pdf.setEnc_md(enc_md);
		Object[] generatedId_buf = pdf.getId_buf();
		generatedId_buf[0] = ModernizedCProgram.hex_to_u32(id_buf_pos + 0);
		generatedId_buf[1] = ModernizedCProgram.hex_to_u32(id_buf_pos + 8);
		generatedId_buf[2] = ModernizedCProgram.hex_to_u32(id_buf_pos + 16);
		generatedId_buf[3] = ModernizedCProgram.hex_to_u32(id_buf_pos + 24);
		pdf.setId_len(id_len);
		Object[] generatedU_buf = pdf.getU_buf();
		generatedU_buf[0] = ModernizedCProgram.hex_to_u32(u_buf_pos + 0);
		generatedU_buf[1] = ModernizedCProgram.hex_to_u32(u_buf_pos + 8);
		generatedU_buf[2] = ModernizedCProgram.hex_to_u32(u_buf_pos + 16);
		generatedU_buf[3] = ModernizedCProgram.hex_to_u32(u_buf_pos + 24);
		generatedU_buf[4] = ModernizedCProgram.hex_to_u32(u_buf_pos + 32);
		generatedU_buf[5] = ModernizedCProgram.hex_to_u32(u_buf_pos + 40);
		generatedU_buf[6] = ModernizedCProgram.hex_to_u32(u_buf_pos + 48);
		generatedU_buf[7] = ModernizedCProgram.hex_to_u32(u_buf_pos + 56);
		pdf.setU_len(u_len);
		Object[] generatedO_buf = pdf.getO_buf();
		generatedO_buf[0] = ModernizedCProgram.hex_to_u32(o_buf_pos + 0);
		generatedO_buf[1] = ModernizedCProgram.hex_to_u32(o_buf_pos + 8);
		generatedO_buf[2] = ModernizedCProgram.hex_to_u32(o_buf_pos + 16);
		generatedO_buf[3] = ModernizedCProgram.hex_to_u32(o_buf_pos + 24);
		generatedO_buf[4] = ModernizedCProgram.hex_to_u32(o_buf_pos + 32);
		generatedO_buf[5] = ModernizedCProgram.hex_to_u32(o_buf_pos + 40);
		generatedO_buf[6] = ModernizedCProgram.hex_to_u32(o_buf_pos + 48);
		generatedO_buf[7] = ModernizedCProgram.hex_to_u32(o_buf_pos + 56);
		pdf.setO_len(o_len)// we use ID for salt, maybe needs to change, we will see...;// we use ID for salt, maybe needs to change, we will see...
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedId_buf[0];
		generatedSalt_buf[1] = generatedId_buf[1];
		generatedSalt_buf[2] = generatedId_buf[2];
		generatedSalt_buf[3] = generatedId_buf[3];
		int generatedId_len = pdf.getId_len();
		salt.setSalt_len(generatedId_len);
		digest[0] = generatedU_buf[0];
		digest[1] = generatedU_buf[1];
		digest[2] = generatedU_buf[2];
		digest[3] = generatedU_buf[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		 wpa_pmkid = ()esalt_buf;
		// detect old/new format
		int old_sep = 0;
		int new_sep = 0;
		for (int i = 0;
		 i < line_len; i++) {
			byte c = line_buf[i];
			if (c == (byte)'*') {
				old_sep++;
			} 
			if (c == (byte)':') {
				new_sep++;
			} 
		}
		u8 sep = (new_sep > old_sep) ? (byte)':' : (byte)'*';
		// start normal parsing
		token_t token = new token_t();
		// real 16801 pmkid hash-lines
		token.setToken_cnt(3);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = sep;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[1] = sep;
		generatedLen_min[1] = 12;
		generatedLen_max[1] = 12;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[2] = sep;
		generatedLen_min[2] = 12;
		generatedLen_max[2] = 12;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		Object[] generatedBuf = token.getBuf();
		Object[] generatedLen = token.getLen();
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			token.setToken_cnt(4);
			generatedSep[0] = sep;
			generatedLen_min[0] = 32;
			generatedLen_max[0] = 32;
			generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[1] = sep;
			generatedLen_min[1] = 12;
			generatedLen_max[1] = 12;
			generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[2] = sep;
			generatedLen_min[2] = 12;
			generatedLen_max[2] = 12;
			generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[3] = sep;
			generatedLen_min[3] = 0;
			generatedLen_max[3] = 64;
			generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			int rc_tokenizer2 = token.input_tokenizer((u8)line_buf, line_len);
			if (rc_tokenizer2 != parser_rc.PARSER_OK) {
				return (rc_tokenizer);
			} 
			u8 essid_buf = generatedBuf[3];
			int essid_len = generatedLen[3];
			if (essid_len & 1) {
				return (parser_rc.PARSER_SALT_VALUE);
			} 
			wpa_pmkid.setEssid_len(ModernizedCProgram.hex_decode(essid_buf, essid_len, (u8)wpa_pmkid.getEssid_buf()));
		} 
		// we'll accept normal 16800 pmkid hash-lines, too
		// pmkidu8 pmkid_buf = generatedBuf[0];
		wpa_pmkid.getPmkid()[0] = ModernizedCProgram.hex_to_u32(pmkid_buf + 0);
		wpa_pmkid.getPmkid()[1] = ModernizedCProgram.hex_to_u32(pmkid_buf + 8);
		wpa_pmkid.getPmkid()[2] = ModernizedCProgram.hex_to_u32(pmkid_buf + 16);
		wpa_pmkid.getPmkid()[3] = ModernizedCProgram.hex_to_u32(pmkid_buf + 24)// mac_ap;// mac_ap
		u8 macap_buf = generatedBuf[1];
		wpa_pmkid.getOrig_mac_ap()[0] = ModernizedCProgram.hex_to_u8(macap_buf + 0);
		wpa_pmkid.getOrig_mac_ap()[1] = ModernizedCProgram.hex_to_u8(macap_buf + 2);
		wpa_pmkid.getOrig_mac_ap()[2] = ModernizedCProgram.hex_to_u8(macap_buf + 4);
		wpa_pmkid.getOrig_mac_ap()[3] = ModernizedCProgram.hex_to_u8(macap_buf + 6);
		wpa_pmkid.getOrig_mac_ap()[4] = ModernizedCProgram.hex_to_u8(macap_buf + 8);
		wpa_pmkid.getOrig_mac_ap()[5] = ModernizedCProgram.hex_to_u8(macap_buf + 10)// mac_sta;// mac_sta
		u8 macsta_buf = generatedBuf[2];
		wpa_pmkid.getOrig_mac_sta()[0] = ModernizedCProgram.hex_to_u8(macsta_buf + 0);
		wpa_pmkid.getOrig_mac_sta()[1] = ModernizedCProgram.hex_to_u8(macsta_buf + 2);
		wpa_pmkid.getOrig_mac_sta()[2] = ModernizedCProgram.hex_to_u8(macsta_buf + 4);
		wpa_pmkid.getOrig_mac_sta()[3] = ModernizedCProgram.hex_to_u8(macsta_buf + 6);
		wpa_pmkid.getOrig_mac_sta()[4] = ModernizedCProgram.hex_to_u8(macsta_buf + 8);
		wpa_pmkid.getOrig_mac_sta()[5] = ModernizedCProgram.hex_to_u8(macsta_buf + 10)// pmkid_data;// pmkid_data
		// "PMK "// "PMK "wpa_pmkid.getPmkid_data()[0] = -1024;
		// "Name"// "Name"wpa_pmkid.getPmkid_data()[1] = -1024;
		wpa_pmkid.getPmkid_data()[2] = (wpa_pmkid.getOrig_mac_ap()[0] << 0) | (wpa_pmkid.getOrig_mac_ap()[1] << 8) | (wpa_pmkid.getOrig_mac_ap()[2] << 16) | (wpa_pmkid.getOrig_mac_ap()[3] << 24);
		wpa_pmkid.getPmkid_data()[3] = (wpa_pmkid.getOrig_mac_ap()[4] << 0) | (wpa_pmkid.getOrig_mac_ap()[5] << 8) | (wpa_pmkid.getOrig_mac_sta()[0] << 16) | (wpa_pmkid.getOrig_mac_sta()[1] << 24);
		wpa_pmkid.getPmkid_data()[4] = (wpa_pmkid.getOrig_mac_sta()[2] << 0) | (wpa_pmkid.getOrig_mac_sta()[3] << 8) | (wpa_pmkid.getOrig_mac_sta()[4] << 16) | (wpa_pmkid.getOrig_mac_sta()[5] << 24);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		// salt// saltgeneratedSalt_buf[0] = wpa_pmkid.getPmkid_data()[0];
		generatedSalt_buf[1] = wpa_pmkid.getPmkid_data()[1];
		generatedSalt_buf[2] = wpa_pmkid.getPmkid_data()[2];
		generatedSalt_buf[3] = wpa_pmkid.getPmkid_data()[3];
		generatedSalt_buf[4] = wpa_pmkid.getPmkid_data()[4];
		generatedSalt_buf[5] = wpa_pmkid.getPmkid_data()[5];
		generatedSalt_buf[6] = wpa_pmkid.getPmkid_data()[6];
		generatedSalt_buf[7] = wpa_pmkid.getPmkid_data()[7];
		salt.setSalt_len(32);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_WPA_PMK - 1)// hash;// hash
		digest[0] = wpa_pmkid.getPmkid()[0];
		digest[1] = wpa_pmkid.getPmkid()[1];
		digest[2] = wpa_pmkid.getPmkid()[2];
		digest[3] = wpa_pmkid.getPmkid()[3];
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		bsp_t bsp = (bsp_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 80;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 80;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		u8[] tmp_buf = new u8();
		Object[] generatedBuf = token.getBuf();
		Object[] generatedLen = token.getLen();
		int tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, generatedBuf[0], generatedLen[0], (u8)tmp_buf);
		if (tmp_len != 59) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		Object[] generatedSignature = bsp.getSignature();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((byte)generatedSignature, tmp_buf + 0, 3);
		Object[] generatedDigest = bsp.getDigest();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((byte)generatedDigest, tmp_buf + 3, 32);
		Object[] generatedSalt = bsp.getSalt();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((byte)generatedSalt, tmp_buf + 35, 16);
		Object generatedIter = bsp.getIter();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((byte)generatedIter, tmp_buf + 51, 4);
		Object generatedCrc32 = bsp.getCrc32();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((byte)generatedCrc32, tmp_buf + 55, 4)// version;// version
		if (generatedSignature[0] != (byte)'b') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		if (generatedSignature[1] != (byte)'s') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		if (generatedSignature[2] != (byte)':') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		// digest
		digest[0] = ModernizedCProgram.byte_swap_32(generatedDigest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(generatedDigest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(generatedDigest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(generatedDigest[3])// salt;// salt
		u8[] ptr = (u8)generatedSalt;
		Object[] generatedSalt_buf = salt.getSalt_buf();
		u8[] uuid = (u8)generatedSalt_buf;
		int uuid_len = 0;
		ModernizedCProgram.u8_to_hex(ptr[0], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[1], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[2], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[3], uuid + uuid_len);
		uuid_len += 2;
		uuid[uuid_len] = (byte)'-';
		uuid_len += 1;
		ModernizedCProgram.u8_to_hex(ptr[4], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[5], uuid + uuid_len);
		uuid_len += 2;
		uuid[uuid_len] = (byte)'-';
		uuid_len += 1;
		ModernizedCProgram.u8_to_hex(ptr[6], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[7], uuid + uuid_len);
		uuid_len += 2;
		uuid[uuid_len] = (byte)'-';
		uuid_len += 1;
		ModernizedCProgram.u8_to_hex(ptr[8], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[9], uuid + uuid_len);
		uuid_len += 2;
		uuid[uuid_len] = (byte)'-';
		uuid_len += 1;
		ModernizedCProgram.u8_to_hex(ptr[10], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[11], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[12], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[13], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[14], uuid + uuid_len);
		uuid_len += 2;
		ModernizedCProgram.u8_to_hex(ptr[15], uuid + uuid_len);
		uuid_len += 2;
		uuid[uuid_len] = 0;
		salt.setSalt_len(36);
		salt.setSalt_iter(generatedIter - 1);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 24;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 24;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 8;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 8;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 19;
		generatedLen_max[1] = 19;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 16;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 16;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = 0;
		digest[3] = 0;
		{ 
			{ 
				u32x t = new u32x();
				t = digest[1] >> 4;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 4;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 16;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 16;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 2;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 2;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 8;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 8;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 1;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 1;
				digest[1] = digest[1] ^ t;
			}
			;
		}
		;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_1K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		ikepsk_t ikepsk = (ikepsk_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(9);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 1024;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[1] = (byte)':';
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 1024;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[2] = (byte)':';
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 1024;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)':';
		generatedLen_min[3] = 0;
		generatedLen_max[3] = 1024;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)':';
		generatedLen_min[4] = 0;
		generatedLen_max[4] = 1024;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[5] = (byte)':';
		generatedLen_min[5] = 0;
		generatedLen_max[5] = 1024;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[6] = (byte)':';
		generatedLen_min[6] = 0;
		generatedLen_max[6] = 128;
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[7] = (byte)':';
		generatedLen_min[7] = 0;
		generatedLen_max[7] = 128;
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[8] = (byte)':';
		generatedLen_min[8] = 32;
		generatedLen_max[8] = 32;
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedMsg_len = ikepsk.getMsg_len();
		Object[] generatedLen = token.getLen();
		generatedMsg_len[0] = generatedLen[0] / 2;
		generatedMsg_len[1] = generatedMsg_len[0] + generatedLen[1] / 2;
		generatedMsg_len[2] = generatedMsg_len[1] + generatedLen[2] / 2;
		generatedMsg_len[3] = generatedMsg_len[2] + generatedLen[3] / 2;
		generatedMsg_len[4] = generatedMsg_len[3] + generatedLen[4] / 2;
		generatedMsg_len[5] = generatedMsg_len[4] + generatedLen[5] / 2;
		ikepsk.setNr_len((generatedLen[6] + generatedLen[7]) / 2);
		if (generatedMsg_len[5] > 512) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object generatedNr_len = ikepsk.getNr_len();
		if (generatedNr_len > 64) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedMsg_buf = ikepsk.getMsg_buf();
		u8 ptr1 = (u8)generatedMsg_buf;
		Object[] generatedNr_buf = ikepsk.getNr_buf();
		u8 ptr2 = (u8)generatedNr_buf;
		Object[] generatedBuf = token.getBuf();
		for (int i = 0;
		 i < generatedLen[0]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[0] + i);
		}
		for (int i = 0;
		 i < generatedLen[1]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[1] + i);
		}
		for (int i = 0;
		 i < generatedLen[2]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[2] + i);
		}
		for (int i = 0;
		 i < generatedLen[3]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[3] + i);
		}
		for (int i = 0;
		 i < generatedLen[4]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[4] + i);
		}
		for (int i = 0;
		 i < generatedLen[5]; i += 2) {
			ptr1++ = ModernizedCProgram.hex_to_u8(generatedBuf[5] + i);
		}
		for (int i = 0;
		 i < generatedLen[6]; i += 2) {
			ptr2++ = ModernizedCProgram.hex_to_u8(generatedBuf[6] + i);
		}
		for (int i = 0;
		 i < generatedLen[7]; i += 2) {
			ptr2++ = ModernizedCProgram.hex_to_u8(generatedBuf[7] + i);
		}
		ptr1++ = -1024;
		ptr2++ = -1024/**
		   * Store to database
		   */;
		u8 hash_pos = generatedBuf[8];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		salt.setSalt_len(32);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedNr_buf[0];
		generatedSalt_buf[1] = generatedNr_buf[1];
		generatedSalt_buf[2] = generatedNr_buf[2];
		generatedSalt_buf[3] = generatedNr_buf[3];
		generatedSalt_buf[4] = generatedNr_buf[4];
		generatedSalt_buf[5] = generatedNr_buf[5];
		generatedSalt_buf[6] = generatedNr_buf[6];
		generatedSalt_buf[7] = generatedNr_buf[7];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_DCC2;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 6;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'#';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 256;
		generatedSep[2] = (byte)'#';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[3];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 iter_pos = generatedBuf[1];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		salt.setSalt_iter(iter - 1);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		seven_zip_hook_salt_t seven_zip = (seven_zip_hook_salt_t)hook_salt_buf;
		token_t token = new token_t();
		token.setToken_cnt(11);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SEVEN_ZIP;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 4;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 2;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 1;
		generatedLen_max[3] = 1;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[4] = (byte)'$';
		generatedLen_min[4] = 0;
		generatedLen_max[4] = 64;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[5] = (byte)'$';
		generatedLen_min[5] = 1;
		generatedLen_max[5] = 2;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[6] = (byte)'$';
		generatedLen_min[6] = 32;
		generatedLen_max[6] = 32;
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[7] = (byte)'$';
		generatedLen_min[7] = 1;
		generatedLen_max[7] = 10;
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[8] = (byte)'$';
		generatedLen_min[8] = 1;
		generatedLen_max[8] = 6;
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[9] = (byte)'$';
		generatedLen_min[9] = 1;
		generatedLen_max[9] = 6;
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[10] = (byte)'$';
		generatedLen_min[10] = 2;
		generatedLen_max[10] = 655056;
		generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 data_type_pos = generatedBuf[1];
		u8 NumCyclesPower_pos = generatedBuf[2];
		u8 salt_len_pos = generatedBuf[3];
		u8 salt_buf_pos = generatedBuf[4];
		u8 iv_len_pos = generatedBuf[5];
		u8 iv_buf_pos = generatedBuf[6];
		u8 crc_buf_pos = generatedBuf[7];
		u8 data_len_pos = generatedBuf[8];
		u8 unpack_size_pos = generatedBuf[9];
		u8 data_buf_pos = generatedBuf[10];
		int data_type_len = generatedLen[1];
		int NumCyclesPower_len = generatedLen[2];
		int salt_len_len = generatedLen[3];
		int salt_buf_len = generatedLen[4];
		int iv_len_len = generatedLen[5];
		int iv_buf_len = generatedLen[6];
		int crc_buf_len = generatedLen[7];
		int data_len_len = generatedLen[8];
		int unpack_size_len = generatedLen[9];
		int data_buf_len = generatedLen[10];
		// fields only used when data was compressed:
		u8 crc_len_pos = (u8)/*Error: Function owner not recognized*/strchr((byte)data_buf_pos, (byte)'$');
		u32 crc_len_len = 0;
		u8[] coder_attributes_pos = 0;
		u32 coder_attributes_len = 0;
		if (crc_len_pos != (null)) {
			data_buf_len = crc_len_pos - data_buf_pos;
			crc_len_pos++;
			coder_attributes_pos = (u8)/*Error: Function owner not recognized*/strchr((byte)crc_len_pos, (byte)'$');
			if (coder_attributes_pos == (null)) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
			crc_len_len = coder_attributes_pos - crc_len_pos;
			coder_attributes_pos++;
		} 
		if (ModernizedCProgram.is_valid_hex_string(data_buf_pos, data_buf_len) == 0) {
			return (parser_rc.PARSER_SALT_ENCODING);
		} 
		int iter = ModernizedCProgram.hc_strtoul((byte)NumCyclesPower_pos, (null), 10);
		int crc = ModernizedCProgram.hc_strtoul((byte)crc_buf_pos, (null), 10);
		int data_type = ModernizedCProgram.hc_strtoul((byte)data_type_pos, (null), 10);
		int salt_len = ModernizedCProgram.hc_strtoul((byte)salt_len_pos, (null), 10);
		int iv_len = ModernizedCProgram.hc_strtoul((byte)iv_len_pos, (null), 10);
		int unpack_size = ModernizedCProgram.hc_strtoul((byte)unpack_size_pos, (null), 10);
		int data_len = ModernizedCProgram.hc_strtoul((byte)data_len_pos, (null), 10);
		// if neither uncompressed nor truncated, then we need the length for crc and coder attributes
		int crc_len = 0;
		boolean is_compressed = ((data_type != 0) && (data_type != -1024));
		if (is_compressed == true) {
			if (crc_len_pos == (null)) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
			coder_attributes_len = line_len - 1 - 2 - 1 - data_type_len - 1 - NumCyclesPower_len - 1 - salt_len_len - 1 - salt_buf_len - 1 - iv_len_len - 1 - iv_buf_len - 1 - crc_buf_len - 1 - data_len_len - 1 - unpack_size_len - 1 - data_buf_len - 1 - crc_len_len - 1;
			crc_len = ModernizedCProgram.hc_strtoul((byte)crc_len_pos, (null), 10/**
			   * verify some data
			   */);
		} 
		// this check also returns an error with data_type == 0x80 (special case that means "truncated")if ((data_type != 0) && (data_type != 1) && (data_type != 2) && (data_type != 7)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (salt_len != 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if ((data_len * 2) != data_buf_len) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (data_len > 327528) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (unpack_size > data_len) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (is_compressed == true) {
			if (crc_len_len > 7) {
				return (parser_rc.PARSER_SALT_VALUE);
			} 
			if (coder_attributes_len > 10) {
				return (parser_rc.PARSER_SALT_VALUE);
			} 
			if ((coder_attributes_len % 2) != 0) {
				return (parser_rc.PARSER_SALT_VALUE);
			} 
			if (data_type == 1) {
				if ((coder_attributes_len / 2) != 5) {
					return (parser_rc.PARSER_SALT_VALUE);
				} 
			}  else if (data_type == 2) {
				if ((coder_attributes_len / 2) != 1) {
					return (parser_rc.PARSER_SALT_VALUE);
				} 
			} 
		} 
		seven_zip.setData_type(/**
		   * store data
		   */data_type);
		Object[] generatedIv_buf = seven_zip.getIv_buf();
		generatedIv_buf[0] = ModernizedCProgram.hex_to_u32(iv_buf_pos + 0);
		generatedIv_buf[1] = ModernizedCProgram.hex_to_u32(iv_buf_pos + 8);
		generatedIv_buf[2] = ModernizedCProgram.hex_to_u32(iv_buf_pos + 16);
		generatedIv_buf[3] = ModernizedCProgram.hex_to_u32(iv_buf_pos + 24);
		seven_zip.setIv_len(iv_len);
		Object[] generatedSalt_buf = seven_zip.getSalt_buf();
		/*Error: Function owner not recognized*/// we just need that for later ascii_digest()/*Error: Function owner not recognized*/// we just need that for later ascii_digest()memcpy(generatedSalt_buf, salt_buf_pos, salt_buf_len);
		seven_zip.setSalt_len(0);
		seven_zip.setCrc(crc);
		Object[] generatedData_buf = seven_zip.getData_buf();
		for (int i = 0;
		int j = 0;
		 j < data_buf_len; ) {
			generatedData_buf[i] = ModernizedCProgram.hex_to_u32(data_buf_pos + j);
		}
		seven_zip.setData_len(data_len);
		seven_zip.setUnpack_size(unpack_size);
		seven_zip.setCrc_len(crc_len);
		Object[] generatedCoder_attributes = seven_zip.getCoder_attributes();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedCoder_attributes, 0, /*Error: sizeof expression not supported yet*/);
		seven_zip.setCoder_attributes_len(0);
		Object generatedCoder_attributes_len = seven_zip.getCoder_attributes_len();
		if (is_compressed == true) {
			if (ModernizedCProgram.is_valid_hex_string(coder_attributes_pos, coder_attributes_len) == 0) {
				return (parser_rc.PARSER_SALT_ENCODING);
			} 
			for (u32 i = 0;
			u32 j = 0;
			 j < coder_attributes_len; ) {
				generatedCoder_attributes[i] = ModernizedCProgram.hex_to_u8((u8)coder_attributes_pos[j]);
				generatedCoder_attributes_len++;
			}
		} 
		// normally: crc_len <= unpacksize <= packsize (== data_len)int aes_len = data_len;
		// it is 0 only in case of uncompressed data or truncated dataif (crc_len != 0) {
			if (data_type == 1) {
				aes_len = 32.5 + (double)crc_len * 1.05;
			}  else if (data_type == 2) {
				aes_len = 4.5 + (double)crc_len * 1.01;
			} 
			aes_len = (((aes_len) < (data_len)) ? (aes_len) : (data_len));
		} 
		// in theory we could just use crc_len, but sometimes (very rare) the compressed data// is larger than the original data! (because of some additional bytes from lzma/headers)
		seven_zip.setAes_len(aes_len)// real salt;// real salt
		generatedSalt_buf[0] = generatedData_buf[0];
		generatedSalt_buf[1] = generatedData_buf[1];
		generatedSalt_buf[2] = generatedData_buf[2];
		generatedSalt_buf[3] = generatedData_buf[3];
		salt.setSalt_len(16);
		Object[] generatedSalt_sign = salt.getSalt_sign();
		generatedSalt_sign[0] = data_type;
		salt.setSalt_iter(-1024 << iter/**
		   * digest
		   */);
		digest[0] = crc;
		digest[1] = 0;
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pdf_t pdf = (pdf_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(16);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PDF;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 3;
		generatedLen_max[3] = 3;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 1;
		generatedLen_max[4] = 6;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[5] = 1;
		generatedLen_max[5] = 1;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[6] = 1;
		generatedLen_max[6] = 4;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[7] = 0;
		generatedLen_max[7] = 1024;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[8] = 1;
		generatedLen_max[8] = 4;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[9] = 0;
		generatedLen_max[9] = 1024;
		generatedSep[9] = (byte)'*';
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[10] = 1;
		generatedLen_max[10] = 4;
		generatedSep[10] = (byte)'*';
		generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[11] = 0;
		generatedLen_max[11] = 1024;
		generatedSep[11] = (byte)'*';
		generatedAttr[11] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[12] = 1;
		generatedLen_max[12] = 4;
		generatedSep[12] = (byte)'*';
		generatedAttr[12] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[13] = 0;
		generatedLen_max[13] = 1024;
		generatedSep[13] = (byte)'*';
		generatedAttr[13] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[14] = 1;
		generatedLen_max[14] = 4;
		generatedSep[14] = (byte)'*';
		generatedAttr[14] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[15] = 0;
		generatedLen_max[15] = 1024;
		generatedSep[15] = (byte)'*';
		generatedAttr[15] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 V_pos = generatedBuf[1];
		u8 R_pos = generatedBuf[2];
		u8 bits_pos = generatedBuf[3];
		u8 enc_md_pos = generatedBuf[5];
		u8 u_len_pos = generatedBuf[8];
		u8[] u_buf_pos = generatedBuf[9];
		// validate data
		int V = /*Error: Function owner not recognized*/strtol((byte)V_pos, (null), 10);
		int R = /*Error: Function owner not recognized*/strtol((byte)R_pos, (null), 10);
		int vr_ok = 0;
		if ((V == 5) && (R == 5)) {
			vr_ok = 1;
		} 
		if ((V == 5) && (R == 6)) {
			vr_ok = 1;
		} 
		if (vr_ok == 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int bits = /*Error: Function owner not recognized*/strtol((byte)bits_pos, (null), 10);
		if (bits != 256) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int enc_md = /*Error: Function owner not recognized*/strtol((byte)enc_md_pos, (null), 10);
		if ((enc_md != 0) && (enc_md != 1)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		u32 u_len = ModernizedCProgram.hc_strtoul((byte)u_len_pos, (null), 10);
		// copy data to esalt
		if (u_len < 40) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (ModernizedCProgram.is_valid_hex_string(u_buf_pos, 80) == 0) {
			return (parser_rc.PARSER_SALT_ENCODING);
		} 
		Object[] generatedU_buf = pdf.getU_buf();
		for (int i = 0;
		int j = 0;
		 i < 8 + 2; ) {
			generatedU_buf[i] = ModernizedCProgram.hex_to_u32((u8)u_buf_pos[j]);
		}
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedU_buf[8];
		generatedSalt_buf[1] = generatedU_buf[9];
		salt.setSalt_len(8);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_PDF17L8);
		digest[0] = ModernizedCProgram.byte_swap_32(generatedU_buf[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(generatedU_buf[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(generatedU_buf[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(generatedU_buf[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(generatedU_buf[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(generatedU_buf[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(generatedU_buf[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(generatedU_buf[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 20;
		generatedLen_max[1] = 20;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		dpapimk_t dpapimk = (dpapimk_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(10);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_DPAPIMK;
		Object[] generatedLen = token.getLen();
		// signature// signaturegeneratedLen[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		// version// versiongeneratedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// context// contextgeneratedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// sid// sidgeneratedLen_min[3] = 10;
		generatedLen_max[3] = 60;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// cipher// ciphergeneratedLen_min[4] = 4;
		generatedLen_max[4] = 6;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// hash// hashgeneratedLen_min[5] = 4;
		generatedLen_max[5] = 6;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// iterations// iterationsgeneratedLen_min[6] = 1;
		generatedLen_max[6] = 6;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// iv// ivgeneratedLen_min[7] = 32;
		generatedLen_max[7] = 32;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		// content len// content lengeneratedLen_min[8] = 1;
		generatedLen_max[8] = 6;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// content// contentgeneratedLen_min[9] = 0;
		generatedLen_max[9] = 1024;
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 context_pos = generatedBuf[2];
		u8[] SID_pos = generatedBuf[3];
		u8 rounds_pos = generatedBuf[6];
		u8[] iv_pos = generatedBuf[7];
		u8 contents_len_pos = generatedBuf[8];
		u8[] contents_pos = generatedBuf[9/**
		   * content verification
		   */];
		int version = ModernizedCProgram.hc_strtoul((byte)version_pos, (null), 10);
		int contents_len = ModernizedCProgram.hc_strtoul((byte)contents_len_pos, (null), 10);
		if (version == 1) {
			if (contents_len != 208) {
				return (parser_rc.PARSER_SALT_LENGTH);
			} 
		}  else if (version == 2) {
			if (contents_len != 288) {
				return (parser_rc.PARSER_SALT_LENGTH);
			} 
		} else {
				return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (contents_len != generatedLen[9]) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		dpapimk.setContents_len(contents_len);
		dpapimk.setContext(ModernizedCProgram.hc_strtoul((byte)context_pos, (null), 10))// division by 4 should be fine because contents_len is either 208 or 288;// division by 4 should be fine because contents_len is either 208 or 288
		Object generatedContents_len = dpapimk.getContents_len();
		Object[] generatedContents = dpapimk.getContents();
		for (u32 i = 0;
		 i < generatedContents_len / 4; i++) {
			generatedContents[i] = ModernizedCProgram.hex_to_u32((u8)contents_pos[i * 8]);
			generatedContents[i] = ModernizedCProgram.byte_swap_32(generatedContents[i]);
		}
		// SIDint SID_len = generatedLen[3];
		u8[] SID_utf16le = new u8[]{0};
		for (int i = 0;
		 i < SID_len; i++) {
			SID_utf16le[i * 2] = SID_pos[i];
		}
		dpapimk.setSID_len((SID_len + 1) * /* Specific to DPAPI: needs trailing '\0' while computing hash */2);
		Object generatedSID_len = dpapimk.getSID_len();
		SID_utf16le[generatedSID_len] = -1024;
		Object[] generatedSID = dpapimk.getSID();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((u8)generatedSID, SID_utf16le, /*Error: sizeof expression not supported yet*/);
		for (u32 i = 0;
		 i < 32; i++) {
			generatedSID[i] = ModernizedCProgram.byte_swap_32(generatedSID[i]);
		}
		Object[] generatedIv = dpapimk.getIv();
		// iv// ivgeneratedIv[0] = ModernizedCProgram.hex_to_u32((u8)iv_pos[0]);
		generatedIv[1] = ModernizedCProgram.hex_to_u32((u8)iv_pos[8]);
		generatedIv[2] = ModernizedCProgram.hex_to_u32((u8)iv_pos[16]);
		generatedIv[3] = ModernizedCProgram.hex_to_u32((u8)iv_pos[24]);
		generatedIv[0] = ModernizedCProgram.byte_swap_32(generatedIv[0]);
		generatedIv[1] = ModernizedCProgram.byte_swap_32(generatedIv[1]);
		generatedIv[2] = ModernizedCProgram.byte_swap_32(generatedIv[2]);
		generatedIv[3] = ModernizedCProgram.byte_swap_32(generatedIv[3]);
		digest[0] = generatedIv[0];
		digest[1] = generatedIv[1];
		digest[2] = generatedIv[2];
		digest[3] = generatedIv[3];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedIv[0];
		generatedSalt_buf[1] = generatedIv[1];
		generatedSalt_buf[2] = generatedIv[2];
		generatedSalt_buf[3] = generatedIv[3];
		salt.setSalt_len(16)// iter;// iter
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)rounds_pos, (null), 10) - 1);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha1_t pbkdf2_sha1 = (pbkdf2_sha1_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ATLASSIAN;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 64;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hashsalt_pos = generatedBuf[1];
		int hashsalt_len = generatedLen[1];
		u8[] tmp_buf = new u8[]{0};
		int base64_decode_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hashsalt_pos, hashsalt_len, tmp_buf);
		if (base64_decode_len != (16 + 32)) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		u8 hash_pos = tmp_buf + 16;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, hash_pos, 16);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3])// store salt;// store salt
		u8 salt_pos = tmp_buf;
		int salt_len = 16;
		Object[] generatedSalt_buf = pbkdf2_sha1.getSalt_buf();
		u8 salt_buf_ptr = (u8)generatedSalt_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr, salt_pos, salt_len);
		salt.setSalt_len(salt_len);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_ATLASSIAN - 1)// add some stuff to normal salt to make sorted happy;// add some stuff to normal salt to make sorted happy
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_buf[4] = generatedSalt_iter;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_1K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		 wpa_eapol = ()esalt_buf;
		// the *wpa was partially initialized beforehand, we can not simply memset it to zero
		hccapx_t in = new hccapx_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(in, line_buf, /*Error: Unsupported expression*/);
		Object generatedSignature = in.getSignature();
		if (generatedSignature != -1024) {
			return (parser_rc.PARSER_HCCAPX_SIGNATURE);
		} 
		Object generatedVersion = in.getVersion();
		if (generatedVersion != 4) {
			return (parser_rc.PARSER_HCCAPX_VERSION);
		} 
		Object generatedEapol_len = in.getEapol_len();
		if (generatedEapol_len < 1 || generatedEapol_len > 255) {
			return (parser_rc.PARSER_HCCAPX_EAPOL_LEN);
		} 
		Object[] generatedKeymic = in.getKeymic();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedKeymic, generatedKeymic, 16/*
		    http://www.one-net.eu/jsw/j_sec/m_ptype.html
		    The phrase "Pairwise key expansion"
		    Access Point Address (referred to as Authenticator Address AA)
		    Supplicant Address (referred to as Supplicant Address SA)
		    Access Point Nonce (referred to as Authenticator Anonce)
		    Wireless Device Nonce (referred to as Supplicant Nonce Snonce)
		  */);
		Object generatedEssid_len = in.getEssid_len();
		u32 salt_len = generatedEssid_len;
		if (salt_len > 32) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object[] generatedEssid = in.getEssid();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, generatedEssid, generatedEssid_len);
		salt.setSalt_len(salt_len);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_WPA_PMK - 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedEssid, generatedEssid, generatedEssid_len);
		wpa_eapol.setEssid_len(generatedEssid_len);
		Object generatedKeyver = in.getKeyver();
		wpa_eapol.setKeyver(generatedKeyver);
		if ((generatedKeyver != 0) && (generatedKeyver != 1) && (generatedKeyver != 2) && (generatedKeyver != 3)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		u8[] pke_ptr = (u8)wpa_eapol.getPke();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(pke_ptr, 0, 128);
		Object[] generatedMac_ap = in.getMac_ap();
		Object[] generatedMac_sta = in.getMac_sta();
		Object[] generatedNonce_ap = in.getNonce_ap();
		Object[] generatedNonce_sta = in.getNonce_sta();
		if ((generatedKeyver == 1) || (generatedKeyver == 2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr, "Pairwise key expansion", 23);
			if (/*Error: Function owner not recognized*/memcmp(generatedMac_ap, generatedMac_sta, 6) < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 23, generatedMac_ap, 6);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 29, generatedMac_sta, 6);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 23, generatedMac_sta, 6);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 29, generatedMac_ap, 6);
			} 
			wpa_eapol.setNonce_compare(/*Error: Function owner not recognized*/memcmp(generatedNonce_ap, generatedNonce_sta, 32));
			if (wpa_eapol.getNonce_compare() < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 35, generatedNonce_ap, 32);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 67, generatedNonce_sta, 32);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 35, generatedNonce_sta, 32);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 67, generatedNonce_ap, 32);
			} 
		}  else if ((generatedKeyver == 0) || (generatedKeyver == 3)) {
			pke_ptr[0] = 1;
			pke_ptr[1] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 2, "Pairwise key expansion", 22);
			if (/*Error: Function owner not recognized*/memcmp(generatedMac_ap, generatedMac_sta, 6) < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 24, generatedMac_ap, 6);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 30, generatedMac_sta, 6);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 24, generatedMac_sta, 6);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 30, generatedMac_ap, 6);
			} 
			wpa_eapol.setNonce_compare(/*Error: Function owner not recognized*/memcmp(generatedNonce_ap, generatedNonce_sta, 32));
			if (wpa_eapol.getNonce_compare() < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 36, generatedNonce_ap, 32);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 68, generatedNonce_sta, 32);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 36, generatedNonce_sta, 32);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(pke_ptr + 68, generatedNonce_ap, 32);
			} 
			pke_ptr[100] = -1024;
			pke_ptr[101] = 1;
		} 
		for (int i = 0;
		 i < 32; i++) {
			wpa_eapol.getPke()[i] = ModernizedCProgram.byte_swap_32(wpa_eapol.getPke()[i]);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(wpa_eapol.getOrig_mac_ap(), generatedMac_ap, 6);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(wpa_eapol.getOrig_mac_sta(), generatedMac_sta, 6);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(wpa_eapol.getOrig_nonce_ap(), generatedNonce_ap, 32);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(wpa_eapol.getOrig_nonce_sta(), generatedNonce_sta, 32);
		Object generatedMessage_pair = in.getMessage_pair();
		u8 message_pair_orig = generatedMessage_pair;
		// ignore the highest bit (it is used to indicate if the replay counters did match)// ignore the highest bit (it is used to indicate if the replay counters did match)generatedMessage_pair &=  -1024;
		if (wpa_eapol.getMessage_pair_chgd() == 1) {
			if (generatedMessage_pair != generatedMessage_pair) {
				return (parser_rc.PARSER_HCCAPX_MESSAGE_PAIR);
			} 
		} 
		wpa_eapol.setMessage_pair(message_pair_orig);
		wpa_eapol.setEapol_len(generatedEapol_len);
		u8[] eapol_ptr = (u8)wpa_eapol.getEapol();
		Object[] generatedEapol = in.getEapol();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(eapol_ptr, generatedEapol, generatedEapol_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(eapol_ptr + generatedEapol_len, 0, (256 + 64) - generatedEapol_len);
		eapol_ptr[generatedEapol_len] = -1024;
		if (generatedKeyver == 1) {
		}  else if (generatedKeyver == 2) {
			generatedKeymic[0] = ModernizedCProgram.byte_swap_32(generatedKeymic[0]);
			generatedKeymic[1] = ModernizedCProgram.byte_swap_32(generatedKeymic[1]);
			generatedKeymic[2] = ModernizedCProgram.byte_swap_32(generatedKeymic[2]);
			generatedKeymic[3] = ModernizedCProgram.byte_swap_32(generatedKeymic[3]);
			for (int i = 0;
			 i < 64; i++) {
				generatedEapol[i] = ModernizedCProgram.byte_swap_32(generatedEapol[i]);
			}
		}  else if ((generatedKeyver == 0) || (generatedKeyver == 3)) {
		} 
		// nothing to do
		// Create a hash of the nonce as ESSID is not unique enough// Not a regular MD5 but good enough// We can also ignore cases where we should bzero the work bufferu32[] hash = new u32();
		hash[0] = 0;
		hash[1] = 1;
		hash[2] = 2;
		hash[3] = 3;
		u32[] block = new u32();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(block, 0, /*Error: sizeof expression not supported yet*/);
		u8[] block_ptr = (u8)block;
		for (int i = 0;
		 i < 16; i++) {
			block[i] = generatedSalt_buf[i];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = wpa_eapol.getPke()[i + 0];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = wpa_eapol.getPke()[i + 16];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = generatedEapol[i + 0];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = generatedEapol[i + 16];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = generatedEapol[i + 32];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 16; i++) {
			block[i] = generatedEapol[i + 48];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 6; i++) {
			block_ptr[i + 0] = wpa_eapol.getOrig_mac_ap()[i];
		}
		for (int i = 0;
		 i < 6; i++) {
			block_ptr[i + 6] = wpa_eapol.getOrig_mac_sta()[i];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		for (int i = 0;
		 i < 32; i++) {
			block_ptr[i + 0] = wpa_eapol.getOrig_nonce_ap()[i];
		}
		for (int i = 0;
		 i < 32; i++) {
			block_ptr[i + 32] = wpa_eapol.getOrig_nonce_sta()[i];
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
		block[0] = generatedKeymic[0];
		block[1] = generatedKeymic[1];
		block[2] = generatedKeymic[2];
		block[3] = generatedKeymic[3];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash)// make all this stuff unique;// make all this stuff unique
		digest[0] = hash[0];
		digest[1] = hash[1];
		digest[2] = hash[2];
		digest[3] = hash[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		sip_t sip = (sip_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(15);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SIP_AUTH;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 5;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'*';
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 512;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 512;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 0;
		generatedLen_max[3] = 116;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[4] = (byte)'*';
		generatedLen_min[4] = 0;
		generatedLen_max[4] = 116;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[5] = (byte)'*';
		generatedLen_min[5] = 0;
		generatedLen_max[5] = 246;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[6] = (byte)'*';
		generatedLen_min[6] = 0;
		generatedLen_max[6] = 245;
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[7] = (byte)'*';
		generatedLen_min[7] = 1;
		generatedLen_max[7] = 246;
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[8] = (byte)'*';
		generatedLen_min[8] = 0;
		generatedLen_max[8] = 245;
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[9] = (byte)'*';
		generatedLen_min[9] = 1;
		generatedLen_max[9] = 1024;
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[10] = (byte)'*';
		generatedLen_min[10] = 0;
		generatedLen_max[10] = 1024;
		generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[11] = (byte)'*';
		generatedLen_min[11] = 0;
		generatedLen_max[11] = 1024;
		generatedAttr[11] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[12] = (byte)'*';
		generatedLen_min[12] = 0;
		generatedLen_max[12] = 1024;
		generatedAttr[12] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[13] = (byte)'*';
		generatedLen_min[13] = 3;
		generatedLen_max[13] = 3;
		generatedAttr[13] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[14] = (byte)'*';
		generatedLen_min[14] = 32;
		generatedLen_max[14] = 32;
		generatedAttr[14] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 user_pos = generatedBuf[3];
		u8 realm_pos = generatedBuf[4];
		u8 method_pos = generatedBuf[5];
		u8 URI_prefix_pos = generatedBuf[6];
		u8 URI_resource_pos = generatedBuf[7];
		u8 URI_suffix_pos = generatedBuf[8];
		u8 nonce_pos = generatedBuf[9];
		u8 nonce_client_pos = generatedBuf[10];
		u8 nonce_count_pos = generatedBuf[11];
		u8 qop_pos = generatedBuf[12];
		u8 directive_pos = generatedBuf[13];
		u8[] digest_pos = generatedBuf[14];
		Object[] generatedLen = token.getLen();
		int user_len = generatedLen[3];
		int realm_len = generatedLen[4];
		int method_len = generatedLen[5];
		int URI_prefix_len = generatedLen[6];
		int URI_resource_len = generatedLen[7];
		int URI_suffix_len = generatedLen[8];
		int nonce_len = generatedLen[9];
		int nonce_client_len = generatedLen[10];
		int nonce_count_len = generatedLen[11];
		int qop_len = generatedLen[12];
		// verify
		if (/*Error: Function owner not recognized*/memcmp(directive_pos, "MD5", 3) != 0) {
			return (parser_rc.PARSER_SIP_AUTH_DIRECTIVE/*
			   * first (pre-)compute: HA2 = md5 ($method . ":" . $uri)
			   */);
		} 
		u8 pcsep = (u8)":";
		int md5_len = method_len + 1 + URI_prefix_len + URI_resource_len + URI_suffix_len;
		if (URI_prefix_len) {
			md5_len++;
		} 
		if (URI_suffix_len) {
			md5_len++;
		} 
		int md5_max_len = 4 * 64;
		if (md5_len >= md5_max_len) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u32[] tmp_md5_buf = new u32[]{0};
		u8 tmp_md5_ptr = (u8)tmp_md5_buf;
		// method
		ModernizedCProgram.hc_strncat(tmp_md5_ptr, method_pos, method_len);
		ModernizedCProgram.hc_strncat(tmp_md5_ptr, pcsep, 1)// URI_prefix;// URI_prefix
		if (URI_prefix_len > 0) {
			ModernizedCProgram.hc_strncat(tmp_md5_ptr, URI_prefix_pos, URI_prefix_len);
			ModernizedCProgram.hc_strncat(tmp_md5_ptr, pcsep, 1);
		} 
		// URI_resource// URI_resourceModernizedCProgram.hc_strncat(tmp_md5_ptr, URI_resource_pos, URI_resource_len);
		ModernizedCProgram.hc_strncat(tmp_md5_ptr, pcsep, 1)// URI_suffix;// URI_suffix
		if (URI_suffix_len > 0) {
			ModernizedCProgram.hc_strncat(tmp_md5_ptr, URI_suffix_pos, URI_suffix_len);
			ModernizedCProgram.hc_strncat(tmp_md5_ptr, pcsep, 1);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_md5_ptr + md5_len, 0, /*Error: sizeof expression not supported yet*/ - md5_len);
		u32[] tmp_digest = new u32();
		ModernizedCProgram.md5_complete_no_limit(tmp_digest, tmp_md5_buf, md5_len);
		tmp_digest[0] = ModernizedCProgram.byte_swap_32(tmp_digest[0]);
		tmp_digest[1] = ModernizedCProgram.byte_swap_32(tmp_digest[1]);
		tmp_digest[2] = ModernizedCProgram.byte_swap_32(tmp_digest[2]);
		tmp_digest[3] = ModernizedCProgram.byte_swap_32(tmp_digest[3/*
		   * esalt
		   */]);
		Object[] generatedEsalt_buf = sip.getEsalt_buf();
		u8[] esalt_buf_ptr = (u8)generatedEsalt_buf;
		int esalt_len = 0;
		int max_esalt_len = /*Error: sizeof expression not supported yet*/;
		// there are 2 possibilities for the esalt:
		boolean with_auth = false;
		if (qop_len == 4) {
			if (/*Error: Function owner not recognized*/memcmp((byte)qop_pos, "auth", 4) == 0) {
				with_auth = true;
			} 
		} 
		if (qop_len == 8) {
			if (/*Error: Function owner not recognized*/memcmp((byte)qop_pos, "auth-int", 8) == 0) {
				with_auth = true;
			} 
		} 
		if (with_auth == true) {
			esalt_len = 1 + nonce_len + 1 + nonce_count_len + 1 + nonce_client_len + 1 + qop_len + 1 + 32;
			if (esalt_len > max_esalt_len) {
				return (parser_rc.PARSER_SALT_LENGTH);
			} 
			ModernizedCProgram.hc_strncat(esalt_buf_ptr, pcsep, 1);
			ModernizedCProgram.hc_strncat(esalt_buf_ptr, nonce_pos, nonce_len);
			ModernizedCProgram.hc_strncat(esalt_buf_ptr, pcsep, 1);
			ModernizedCProgram.hc_strncat(esalt_buf_ptr, nonce_count_pos, nonce_count_len);
			ModernizedCProgram.hc_strncat(esalt_buf_ptr, pcsep, 1);
			ModernizedCProgram.hc_strncat(esalt_buf_ptr, nonce_client_pos, nonce_client_len);
			ModernizedCProgram.hc_strncat(esalt_buf_ptr, pcsep, 1);
			ModernizedCProgram.hc_strncat(esalt_buf_ptr, qop_pos, qop_len);
			ModernizedCProgram.hc_strncat(esalt_buf_ptr, pcsep, 1);
		} else {
				esalt_len = 1 + nonce_len + 1 + 32;
				if (esalt_len > max_esalt_len) {
					return (parser_rc.PARSER_SALT_LENGTH);
				} 
				ModernizedCProgram.hc_strncat(esalt_buf_ptr, pcsep, 1);
				ModernizedCProgram.hc_strncat(esalt_buf_ptr, nonce_pos, nonce_len);
				ModernizedCProgram.hc_strncat(esalt_buf_ptr, pcsep, 1);
		} 
		// tmp_digestu8[] tmp = new u8();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf((byte)tmp, /*Error: sizeof expression not supported yet*/, "%08x%08x%08x%08x", tmp_digest[0], tmp_digest[1], tmp_digest[2], tmp_digest[3]);
		ModernizedCProgram.hc_strncat(esalt_buf_ptr, tmp, 32)// add 0x80 to esalt;// add 0x80 to esalt
		esalt_buf_ptr[esalt_len] = -1024;
		sip.setEsalt_len(esalt_len/*
		   * actual salt
		   */);
		Object[] generatedSalt_buf = sip.getSalt_buf();
		u8 sip_salt_ptr = (u8)generatedSalt_buf;
		int salt_len = user_len + 1 + realm_len + 1;
		int max_salt_len = 119;
		if (salt_len > max_salt_len) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// user_pos
		ModernizedCProgram.hc_strncat(sip_salt_ptr, user_pos, user_len);
		ModernizedCProgram.hc_strncat(sip_salt_ptr, pcsep, 1)// realm_pos;// realm_pos
		ModernizedCProgram.hc_strncat(sip_salt_ptr, realm_pos, realm_len);
		ModernizedCProgram.hc_strncat(sip_salt_ptr, pcsep, 1);
		sip.setSalt_len(salt_len/*
		   * fake salt (for sorting)
		   */);
		u8 salt_buf_ptr = (u8)generatedSalt_buf;
		max_salt_len = 55;
		int fake_salt_len = salt_len;
		if (fake_salt_len > max_salt_len) {
			fake_salt_len = max_salt_len;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr, sip_salt_ptr, fake_salt_len);
		salt.setSalt_len(fake_salt_len/*
		   * digest
		   */);
		digest[0] = ModernizedCProgram.hex_to_u32((u8)digest_pos[0]);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)digest_pos[8]);
		digest[2] = ModernizedCProgram.hex_to_u32((u8)digest_pos[16]);
		digest[3] = ModernizedCProgram.hex_to_u32((u8)digest_pos[24]);
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		int hash_len = generatedLen[0];
		if (hash_len != 128) {
			return (parser_rc.PARSER_GLOBAL_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha256_t pbkdf2_sha256 = (pbkdf2_sha256_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PASSLIB_PBKDF2_SHA256;
		Object[] generatedSep = token.getSep();
		// the hash starts with a $// the hash starts with a $generatedSep[0] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 0;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[1] = (byte)'$';
		generatedLen_min[1] = 13;
		generatedLen_max[1] = 13;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		// iterations in decimal representation// iterations in decimal representationgeneratedSep[2] = (byte)'$';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// salt in alternate base64 repretentation// salt in alternate base64 repretentationgeneratedSep[3] = (byte)'$';
		generatedLen_min[3] = 0;
		generatedLen_max[3] = 256;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		// payload in alternate base64 representanion// payload in alternate base64 representaniongeneratedSep[4] = (byte)'$';
		generatedLen_min[4] = ModernizedCProgram.HASH_LEN_B64;
		generatedLen_max[4] = ModernizedCProgram.HASH_LEN_B64;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		// iteru8 iter_pos = generatedBuf[2];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10) - 1);
		// base64 decode saltu8 salt_pos = generatedBuf[3];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[3];
		u8[] tmp_buf = new u8[]{0};
		size_t salt_len_decoded = ModernizedCProgram.base64_decode(ModernizedCProgram.ab64_to_int, (u8)salt_pos, salt_len, tmp_buf);
		Object[] generatedSalt_buf = pbkdf2_sha256.getSalt_buf();
		u8 salt_buf_ptr = (u8)generatedSalt_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr, tmp_buf, salt_len_decoded);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, salt_buf_ptr, salt_len_decoded);
		salt.setSalt_len(salt_len_decoded);
		// base64 decode hashu8 hash_pos = generatedBuf[4];
		int hash_len = generatedLen[4];
		ModernizedCProgram.base64_decode(ModernizedCProgram.ab64_to_int, (u8)hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, ModernizedCProgram.HASH_LEN_RAW);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_FORTIGATE;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 3;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 44;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer/**
			   * verify data
			   */);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[1];
		int hash_len = generatedLen[1];
		// decode salt + SHA1 hash (12 + 20 = 32)
		u8[] tmp_buf = new u8[]{0};
		int decoded_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		if (decoded_len != 32) {
			return (parser_rc.PARSER_HASH_LENGTH/**
			   * store data
			   */);
		} 
		// saltu32 salt_len = 12;
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, tmp_buf, salt_len);
		salt.setSalt_len(salt_len)// digest;// digest
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf + salt_len, 20);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		androidfde_t androidfde = (androidfde_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ANDROIDFDE;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 2;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 2;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedSep[2] = (byte)'$';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[3] = 2;
		generatedLen_max[3] = 2;
		generatedSep[3] = (byte)'$';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[4] = 32;
		generatedLen_max[4] = 32;
		generatedSep[4] = (byte)'$';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[5] = 3072;
		generatedLen_max[5] = 3072;
		generatedSep[5] = (byte)'$';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// hash
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[4];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3])// salt;// salt
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt_pos + 24);
		salt.setSalt_len(salt_len / 2);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_ANDROIDFDE - 1)// data;// data
		u8 data_pos = generatedBuf[5];
		int data_len = generatedLen[5];
		Object[] generatedData = androidfde.getData();
		for (int i = 0;
		int j = 0;
		 i < data_len; ) {
			generatedData[j] = ModernizedCProgram.hex_to_u32(data_pos + i);
			generatedData[j] = ModernizedCProgram.byte_swap_32(generatedData[j]);
		}
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_EPISERVER;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 11;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 11;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = ((0 * 8) / 6) + 0;
		generatedLen_max[2] = ((256 * 8) / 6) + 3;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedLen_min[3] = 27;
		generatedLen_max[3] = 27;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[3];
		Object[] generatedLen = token.getLen();
		int hash_len = generatedLen[3];
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 20);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'@';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 0;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[1] = (byte)'@';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = (byte)'@';
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 128;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'@';
		generatedLen_min[3] = 8;
		generatedLen_max[3] = 16;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// check hash type
		Object[] generatedBuf = token.getBuf();
		if (generatedBuf[1][0] != (byte)'s') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		// check iter
		u32 iter = ModernizedCProgram.ROUNDS_QNX;
		Object[] generatedLen = token.getLen();
		if (generatedLen[1] > 1) {
			if (generatedBuf[1][1] != (byte)',') {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
			iter = ModernizedCProgram.hc_strtoul((byte)generatedBuf[1] + 2, (null), 10);
		} 
		// iter++; the additinal round is added in the init kernel// iter++; the additinal round is added in the init kernelsalt.setSalt_iter(iter)// digest;// digest
		if (generatedLen[2] != 64) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 0);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 8);
		digest[2] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 16);
		digest[3] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 24);
		digest[4] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 32);
		digest[5] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 40);
		digest[6] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 48);
		digest[7] = ModernizedCProgram.hex_to_u32((u8)generatedBuf[2] + 56)// salt;// salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		if ((generatedLen[3] == 8) || (generatedLen[3] == 16)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, generatedBuf[3], generatedLen[3]);
			salt.setSalt_len(generatedLen[3]);
		} else {
				return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		office2010_t office2010 = (office2010_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(8);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_OFFICE2010;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 8;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 8;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 4;
		generatedLen_max[1] = 4;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 6;
		generatedLen_max[2] = 6;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 3;
		generatedLen_max[3] = 3;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 2;
		generatedLen_max[4] = 2;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[5] = 32;
		generatedLen_max[5] = 32;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[6] = 32;
		generatedLen_max[6] = 32;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[7] = 64;
		generatedLen_max[7] = 64;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 spinCount_pos = generatedBuf[2];
		u8 keySize_pos = generatedBuf[3];
		u8 saltSize_pos = generatedBuf[4];
		u8 osalt_pos = generatedBuf[5];
		u8 encryptedVerifier_pos = generatedBuf[6];
		u8 encryptedVerifierHash_pos = generatedBuf[7];
		u32 version = ModernizedCProgram.hc_strtoul((byte)version_pos, (null), 10);
		u32 spinCount = ModernizedCProgram.hc_strtoul((byte)spinCount_pos, (null), 10);
		u32 keySize = ModernizedCProgram.hc_strtoul((byte)keySize_pos, (null), 10);
		u32 saltSize = ModernizedCProgram.hc_strtoul((byte)saltSize_pos, (null), 10);
		if (version != 2010) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (spinCount != 100000) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (keySize != 128) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (saltSize != 16) {
			return (parser_rc.PARSER_SALT_VALUE/**
			   * salt
			   */);
		} 
		salt.setSalt_len(16);
		salt.setSalt_iter(spinCount);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(osalt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(osalt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(osalt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(osalt_pos + 24);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3/**
		   * esalt
		   */]);
		Object[] generatedEncryptedVerifier = office2010.getEncryptedVerifier();
		generatedEncryptedVerifier[0] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 0);
		generatedEncryptedVerifier[1] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 8);
		generatedEncryptedVerifier[2] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 16);
		generatedEncryptedVerifier[3] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 24);
		generatedEncryptedVerifier[0] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[0]);
		generatedEncryptedVerifier[1] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[1]);
		generatedEncryptedVerifier[2] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[2]);
		generatedEncryptedVerifier[3] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[3]);
		Object[] generatedEncryptedVerifierHash = office2010.getEncryptedVerifierHash();
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 0);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 8);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 16);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 24);
		generatedEncryptedVerifierHash[4] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 32);
		generatedEncryptedVerifierHash[5] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 40);
		generatedEncryptedVerifierHash[6] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 48);
		generatedEncryptedVerifierHash[7] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 56);
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[0]);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[1]);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[2]);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[3]);
		generatedEncryptedVerifierHash[4] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[4]);
		generatedEncryptedVerifierHash[5] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[5]);
		generatedEncryptedVerifierHash[6] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[6]);
		generatedEncryptedVerifierHash[7] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[7/**
		   * digest
		   */]);
		digest[0] = generatedEncryptedVerifierHash[0];
		digest[1] = generatedEncryptedVerifierHash[1];
		digest[2] = generatedEncryptedVerifierHash[2];
		digest[3] = generatedEncryptedVerifierHash[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha256_t pbkdf2_sha256 = (pbkdf2_sha256_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_DJANGOPBKDF2;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 13;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 13;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'$';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 256;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 44;
		generatedLen_max[3] = 44;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		int iter = /*Error: Function owner not recognized*/strtol((byte)iter_pos, (null), 10);
		if (iter < 1) {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		salt.setSalt_iter(iter - 1)// salt;// salt
		u8 salt_pos = generatedBuf[2];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = pbkdf2_sha256.getSalt_buf();
		u8 salt_buf_ptr = (u8)generatedSalt_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr, salt_pos, salt_len);
		salt.setSalt_len(salt_len)//leftover from prehistoric times?//salt_buf_ptr[salt_len + 3] = 0x01;//salt_buf_ptr[salt_len + 4] = 0x80;;//leftover from prehistoric times?//salt_buf_ptr[salt_len + 3] = 0x01;//salt_buf_ptr[salt_len + 4] = 0x80;
		// add some stuff to normal salt to make sorted happy// add some stuff to normal salt to make sorted happygeneratedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_buf[4] = generatedSalt_iter// base64 decode hash;// base64 decode hash
		u8 hash_pos = generatedBuf[3];
		int hash_len = generatedLen[3];
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, (u8)hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 56;
		generatedLen_max[1] = 56;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		ethereum_pbkdf2_t ethereum_pbkdf2 = (ethereum_pbkdf2_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ETHEREUM_PBKDF2;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 11;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'*';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 64;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 64;
		generatedLen_max[3] = 64;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)'*';
		generatedLen_min[4] = 64;
		generatedLen_max[4] = 64;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		if (iter < 1) {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		salt.setSalt_iter(iter - 1)// salt;// salt
		u8 salt_pos = generatedBuf[2];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[2];
		if ((salt_len != 32) && (salt_len != 64)) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedSalt_buf[4];
		generatedSalt_buf[5] = generatedSalt_buf[5];
		generatedSalt_buf[6] = generatedSalt_buf[6];
		generatedSalt_buf[7] = generatedSalt_buf[7]// ciphertext;// ciphertext
		u8[] ciphertext_pos = generatedBuf[3];
		Object[] generatedCiphertext = ethereum_pbkdf2.getCiphertext();
		generatedCiphertext[0] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[0]);
		generatedCiphertext[1] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[8]);
		generatedCiphertext[2] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[16]);
		generatedCiphertext[3] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[24]);
		generatedCiphertext[4] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[32]);
		generatedCiphertext[5] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[40]);
		generatedCiphertext[6] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[48]);
		generatedCiphertext[7] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[56])// hash;// hash
		u8[] hash_pos = generatedBuf[4];
		digest[0] = ModernizedCProgram.hex_to_u32((u8)hash_pos[0]);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)hash_pos[8]);
		digest[2] = ModernizedCProgram.hex_to_u32((u8)hash_pos[16]);
		digest[3] = ModernizedCProgram.hex_to_u32((u8)hash_pos[24]);
		digest[4] = ModernizedCProgram.hex_to_u32((u8)hash_pos[32]);
		digest[5] = ModernizedCProgram.hex_to_u32((u8)hash_pos[40]);
		digest[6] = ModernizedCProgram.hex_to_u32((u8)hash_pos[48]);
		digest[7] = ModernizedCProgram.hex_to_u32((u8)hash_pos[56]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		krb5asrep_t krb5asrep = (krb5asrep_t)esalt_buf;
		token_t token = new token_t();
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_KRB5ASREP;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = /*Error: Function owner not recognized*/strlen(ModernizedCProgram.SIGNATURE_KRB5ASREP);
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE/**
		   * $krb5asrep$23$user_principal_name:checksum$edata2
		   */;
		if (line_len < 16) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Byte upn_info_start = (byte)line_buf + /*Error: Function owner not recognized*/strlen(ModernizedCProgram.SIGNATURE_KRB5ASREP);
		Byte upn_info_stop = /*Error: Function owner not recognized*/strchr((byte)upn_info_start, (byte)':');
		if (upn_info_stop == (null)) {
			return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
		} 
		// we want the : char included// we want the : char includedupn_info_stop++;
		int upn_info_len = upn_info_stop - upn_info_start;
		token.setToken_cnt(4);
		generatedLen[1] = upn_info_len;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		Object[] generatedSep = token.getSep();
		generatedSep[2] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[2] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[2] = 32;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 64;
		generatedLen_max[3] = 40960;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 checksum_pos = generatedBuf[2];
		u8[] data_pos = generatedBuf[3];
		int data_len = generatedLen[3];
		Object[] generatedAccount_info = krb5asrep.getAccount_info();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedAccount_info, generatedBuf[1], generatedLen[1]);
		Object[] generatedChecksum = krb5asrep.getChecksum();
		generatedChecksum[0] = ModernizedCProgram.hex_to_u32(checksum_pos + 0);
		generatedChecksum[1] = ModernizedCProgram.hex_to_u32(checksum_pos + 8);
		generatedChecksum[2] = ModernizedCProgram.hex_to_u32(checksum_pos + 16);
		generatedChecksum[3] = ModernizedCProgram.hex_to_u32(checksum_pos + 24);
		Object[] generatedEdata2 = krb5asrep.getEdata2();
		u8 edata_ptr = (u8)generatedEdata2;
		for (int i = 0;
		 i < data_len; i += 2) {
			u8 p0 = data_pos[i + 0];
			u8 p1 = data_pos[i + 1];
			edata_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		krb5asrep.setEdata2_len(data_len / 2);
		edata_ptr++ = /* this is needed for hmac_md5 */-1024;
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedChecksum[0];
		generatedSalt_buf[1] = generatedChecksum[1];
		generatedSalt_buf[2] = generatedChecksum[2];
		generatedSalt_buf[3] = generatedChecksum[3];
		salt.setSalt_len(16);
		digest[0] = generatedChecksum[0];
		digest[1] = generatedChecksum[1];
		digest[2] = generatedChecksum[2];
		digest[3] = generatedChecksum[3];
		return (parser_rc.PARSER_OK);
		u32 digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SCRYPT;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 6;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 6;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedSep[1] = (byte)':';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedSep[2] = (byte)':';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[3] = 1;
		generatedLen_max[3] = 6;
		generatedSep[3] = (byte)':';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[4] = 0;
		generatedLen_max[4] = 45;
		generatedSep[4] = (byte)':';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedLen_min[5] = 44;
		generatedLen_max[5] = 44;
		generatedSep[5] = (byte)':';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// scrypt settings
		Object[] generatedBuf = token.getBuf();
		u8 N_pos = generatedBuf[1];
		u8 r_pos = generatedBuf[2];
		u8 p_pos = generatedBuf[3];
		salt.setScrypt_N(ModernizedCProgram.hc_strtoul((byte)N_pos, (null), 10));
		salt.setScrypt_r(ModernizedCProgram.hc_strtoul((byte)r_pos, (null), 10));
		salt.setScrypt_p(ModernizedCProgram.hc_strtoul((byte)p_pos, (null), 10))// salt;// salt
		u8 salt_pos = generatedBuf[4];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[4];
		u8[] tmp_buf = new u8[]{0};
		int tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, (u8)salt_pos, salt_len, tmp_buf);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, tmp_buf, tmp_len);
		salt.setSalt_len(tmp_len);
		salt.setSalt_iter(1)// digest - base64 decode;// digest - base64 decode
		u8 hash_pos = generatedBuf[5];
		int hash_len = generatedLen[5];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, (u8)hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 32);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_AUTHME;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 16;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 16;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 64;
		generatedLen_max[2] = 64;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((u8)generatedSalt_buf, salt_pos, salt_len);
		salt.setSalt_len(salt_len)// hash;// hash
		u8 hash_pos = generatedBuf[2];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[8] = ModernizedCProgram.hex_to_u32(hash_pos + 64);
		digest[9] = ModernizedCProgram.hex_to_u32(hash_pos + 72);
		digest[10] = ModernizedCProgram.hex_to_u32(hash_pos + 80);
		digest[11] = ModernizedCProgram.hex_to_u32(hash_pos + 88);
		digest[12] = ModernizedCProgram.hex_to_u32(hash_pos + 96);
		digest[13] = ModernizedCProgram.hex_to_u32(hash_pos + 104);
		digest[14] = ModernizedCProgram.hex_to_u32(hash_pos + 112);
		digest[15] = ModernizedCProgram.hex_to_u32(hash_pos + 120);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32 digest = (u32)digest_buf;
		pbkdf2_md5_t pbkdf2_md5 = (pbkdf2_md5_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PBKDF2_MD5;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 3;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 3;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)':';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)':';
		generatedLen_min[2] = ((0 * 8) / 6) + 0;
		generatedLen_max[2] = ((256 * 8) / 6) + 3;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedSep[3] = (byte)':';
		generatedLen_min[3] = 16;
		generatedLen_max[3] = 256;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		u8[] tmp_buf = new u8();
		int tmp_len;
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		salt.setSalt_iter(iter - 1)// salt;// salt
		u8 salt_pos = generatedBuf[2];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[2];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, salt_pos, salt_len, tmp_buf);
		if (tmp_len > 256) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf = pbkdf2_md5.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, tmp_buf, tmp_len);
		salt.setSalt_len(tmp_len);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_buf[4] = generatedSalt_iter// hash;// hash
		u8 hash_pos = generatedBuf[3];
		int hash_len = generatedLen[3];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		if (tmp_len < 16) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 16);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		diskcryptor_esalt_t diskcryptor_esalt = (diskcryptor_esalt_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_DISKCRYPTOR;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 13;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[2] = 4096;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// version
		Object[] generatedBuf = token.getBuf();
		u8[] version = generatedBuf[1];
		if (version[0] != (byte)'0' + ModernizedCProgram.DISKCRYPTOR_VERSION) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		// esalt
		u8[] data_buf = generatedBuf[2];
		Object[] generatedSalt_buf = diskcryptor_esalt.getSalt_buf();
		for (u32 i = 0;
		 i < 512; i++) {
			generatedSalt_buf[i] = ModernizedCProgram.hex_to_u32(data_buf[i * 8]);
		}
		// salt param// salt paramsalt.setSalt_len(64);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_DISKCRYPTOR - 1)// salt;// salt
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedSalt_buf[4];
		generatedSalt_buf[5] = generatedSalt_buf[5];
		generatedSalt_buf[6] = generatedSalt_buf[6];
		generatedSalt_buf[7] = generatedSalt_buf[7];
		generatedSalt_buf[8] = generatedSalt_buf[8];
		generatedSalt_buf[9] = generatedSalt_buf[9];
		generatedSalt_buf[10] = generatedSalt_buf[10];
		generatedSalt_buf[11] = generatedSalt_buf[11];
		generatedSalt_buf[12] = generatedSalt_buf[12];
		generatedSalt_buf[13] = generatedSalt_buf[13];
		generatedSalt_buf[14] = generatedSalt_buf[14];
		generatedSalt_buf[15] = generatedSalt_buf[15]// digest;// digest
		digest[0] = generatedSalt_buf[16];
		digest[1] = generatedSalt_buf[17];
		digest[2] = generatedSalt_buf[18];
		digest[3] = generatedSalt_buf[19];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 8;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[1] = 40;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[0];
		int salt_len = generatedLen[0];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		oldoffice01_t oldoffice01 = (oldoffice01_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(2);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_OLDOFFICE0;
		generatedSignatures_buf[1] = ModernizedCProgram.SIGNATURE_OLDOFFICE1;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[4] = 32;
		generatedLen_max[4] = 32;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 osalt_pos = generatedBuf[2];
		u8 encryptedVerifier_pos = generatedBuf[3];
		u8 encryptedVerifierHash_pos = generatedBuf[4];
		// esalt
		u32 version = version_pos - -1024;
		if (version != 0 && version != 1) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		oldoffice01.setVersion(version);
		Object[] generatedEncryptedVerifier = oldoffice01.getEncryptedVerifier();
		generatedEncryptedVerifier[0] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 0);
		generatedEncryptedVerifier[1] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 8);
		generatedEncryptedVerifier[2] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 16);
		generatedEncryptedVerifier[3] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 24);
		Object[] generatedEncryptedVerifierHash = oldoffice01.getEncryptedVerifierHash();
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 0);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 8);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 16);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 24)// salt;// salt
		salt.setSalt_len(16);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(osalt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(osalt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(osalt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(osalt_pos + 24)// this is a workaround as office produces multiple documents with the same salt;// this is a workaround as office produces multiple documents with the same salt
		generatedSalt_buf[4] = generatedEncryptedVerifier[0];
		generatedSalt_buf[5] = generatedEncryptedVerifier[1];
		generatedSalt_buf[6] = generatedEncryptedVerifier[2];
		generatedSalt_buf[7] = generatedEncryptedVerifier[3];
		generatedSalt_buf[8] = generatedEncryptedVerifierHash[0];
		generatedSalt_buf[9] = generatedEncryptedVerifierHash[1];
		generatedSalt_buf[10] = generatedEncryptedVerifierHash[2];
		generatedSalt_buf[11] = generatedEncryptedVerifierHash[3];
		Object generatedSalt_len = salt.getSalt_len();
		generatedSalt_len += 32/**
		   * digest
		   */;
		digest[0] = generatedEncryptedVerifierHash[0];
		digest[1] = generatedEncryptedVerifierHash[1];
		digest[2] = generatedEncryptedVerifierHash[2];
		digest[3] = generatedEncryptedVerifierHash[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 16;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_ANDROIDPIN - 1);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		oldoffice34_t oldoffice34 = (oldoffice34_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(2);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_OLDOFFICE3;
		generatedSignatures_buf[1] = ModernizedCProgram.SIGNATURE_OLDOFFICE4;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[4] = 40;
		generatedLen_max[4] = 40;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 osalt_pos = generatedBuf[2];
		u8 encryptedVerifier_pos = generatedBuf[3];
		u8 encryptedVerifierHash_pos = generatedBuf[4];
		// esalt
		u32 version = version_pos - -1024;
		if (version != 3 && version != 4) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		oldoffice34.setVersion(version);
		Object[] generatedEncryptedVerifier = oldoffice34.getEncryptedVerifier();
		generatedEncryptedVerifier[0] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 0);
		generatedEncryptedVerifier[1] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 8);
		generatedEncryptedVerifier[2] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 16);
		generatedEncryptedVerifier[3] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 24);
		Object[] generatedEncryptedVerifierHash = oldoffice34.getEncryptedVerifierHash();
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 0);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 8);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 16);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 24);
		generatedEncryptedVerifierHash[4] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 32)// salt;// salt
		salt.setSalt_len(16);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(osalt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(osalt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(osalt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(osalt_pos + 24);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3])// this is a workaround as office produces multiple documents with the same salt;// this is a workaround as office produces multiple documents with the same salt
		generatedSalt_buf[4] = generatedEncryptedVerifier[0];
		generatedSalt_buf[5] = generatedEncryptedVerifier[1];
		generatedSalt_buf[6] = generatedEncryptedVerifier[2];
		generatedSalt_buf[7] = generatedEncryptedVerifier[3];
		generatedSalt_buf[8] = generatedEncryptedVerifierHash[0];
		generatedSalt_buf[9] = generatedEncryptedVerifierHash[1];
		generatedSalt_buf[10] = generatedEncryptedVerifierHash[2];
		generatedSalt_buf[11] = generatedEncryptedVerifierHash[3];
		Object generatedSalt_len = salt.getSalt_len();
		generatedSalt_len += 32/**
		   * digest
		   */;
		digest[0] = generatedEncryptedVerifierHash[0];
		digest[1] = generatedEncryptedVerifierHash[1];
		digest[2] = generatedEncryptedVerifierHash[2];
		digest[3] = generatedEncryptedVerifierHash[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		rakp_t rakp = (rakp_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 512;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 40;
		generatedLen_max[1] = 40;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[0];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[0];
		Object[] generatedSalt_buf = rakp.getSalt_buf();
		u8[] rakp_ptr = (u8)generatedSalt_buf;
		int i;
		int j;
		for (; i < salt_len; ) {
			rakp_ptr[j] = ModernizedCProgram.hex_to_u8(salt_pos + i);
		}
		rakp_ptr[j] = -1024;
		rakp.setSalt_len(j);
		for (i = 0; i < 64; i++) {
			generatedSalt_buf[i] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[i]);
		}
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedSalt_buf[4];
		generatedSalt_buf[5] = generatedSalt_buf[5];
		generatedSalt_buf[6] = generatedSalt_buf[6];
		generatedSalt_buf[7] = generatedSalt_buf[7];
		// muss min. 32 haben// muss min. 32 habensalt.setSalt_len(32);
		u8 hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		krb5tgs_t krb5tgs = (krb5tgs_t)esalt_buf;
		token_t token = new token_t();
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_KRB5TGS;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 12;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE/**
		   * $krb5tgs$23$checksum$edata2
		   * $krb5tgs$23$*user*realm*spn*$checksum$edata2
		   */;
		if (line_len < 16) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSep = token.getSep();
		Object[] generatedLen_min = token.getLen_min();
		Object[] generatedLen_max = token.getLen_max();
		if (line_buf[12] == (byte)'*') {
			Byte account_info_start = (byte)line_buf + 12;
			Byte account_info_stop = /*Error: Function owner not recognized*/strchr((byte)account_info_start + 1, (byte)'*');
			if (account_info_stop == (null)) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
			account_info_stop++;
			account_info_stop++;
			int account_info_len = account_info_stop - account_info_start;
			token.setToken_cnt(4);
			generatedLen[1] = account_info_len;
			generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
			generatedSep[2] = (byte)'$';
			generatedLen_min[2] = 32;
			generatedLen_max[2] = 32;
			generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[3] = (byte)'$';
			generatedLen_min[3] = 64;
			generatedLen_max[3] = 40960;
			generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		} else {
				token.setToken_cnt(3);
				generatedSep[1] = (byte)'$';
				generatedLen_min[1] = 32;
				generatedLen_max[1] = 32;
				generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
				generatedSep[2] = (byte)'$';
				generatedLen_min[2] = 64;
				generatedLen_max[2] = 40960;
				generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		u8 checksum_pos = new u8();
		u8[] data_pos = new u8();
		int data_len;
		Object[] generatedBuf = token.getBuf();
		Object[] generatedAccount_info = krb5tgs.getAccount_info();
		if (line_buf[12] == (byte)'*') {
			checksum_pos = generatedBuf[2];
			data_pos = generatedBuf[3];
			data_len = generatedLen[3];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedAccount_info, generatedBuf[1], generatedLen[1]);
		} else {
				checksum_pos = generatedBuf[1];
				data_pos = generatedBuf[2];
				data_len = generatedLen[2];
				generatedAccount_info[0] = 0;
		} 
		Object[] generatedChecksum = krb5tgs.getChecksum();
		generatedChecksum[0] = ModernizedCProgram.hex_to_u32(checksum_pos + 0);
		generatedChecksum[1] = ModernizedCProgram.hex_to_u32(checksum_pos + 8);
		generatedChecksum[2] = ModernizedCProgram.hex_to_u32(checksum_pos + 16);
		generatedChecksum[3] = ModernizedCProgram.hex_to_u32(checksum_pos + 24);
		Object[] generatedEdata2 = krb5tgs.getEdata2();
		u8 edata_ptr = (u8)generatedEdata2;
		for (int i = 0;
		 i < data_len; i += 2) {
			u8 p0 = data_pos[i + 0];
			u8 p1 = data_pos[i + 1];
			edata_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		krb5tgs.setEdata2_len(data_len / 2);
		edata_ptr++ = /* this is needed for hmac_md5 */-1024;
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedChecksum[0];
		generatedSalt_buf[1] = generatedChecksum[1];
		generatedSalt_buf[2] = generatedChecksum[2];
		generatedSalt_buf[3] = generatedChecksum[3];
		salt.setSalt_len(16);
		digest[0] = generatedChecksum[0];
		digest[1] = generatedChecksum[1];
		digest[2] = generatedChecksum[2];
		digest[3] = generatedChecksum[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		devise_hash_t devise_double_salt = (devise_hash_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[1] = hashconfig.getSeparator();
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = hashconfig.getSeparator();
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 256;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedLen_min[2] *= 2;
			generatedLen_max[2] *= 2;
			generatedAttr[2] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		Object[] generatedLen = token.getLen();
		Object[] generatedSalt_buf = devise_double_salt.getSalt_buf();
		int generatedSalt_len = devise_double_salt.getSalt_len();
		boolean parse_rc1 = ModernizedCProgram.generic_salt_decode(hashconfig, generatedBuf[1], generatedLen[1], (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc1 == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSite_key_buf = devise_double_salt.getSite_key_buf();
		int generatedSite_key_len = devise_double_salt.getSite_key_len();
		boolean parse_rc2 = ModernizedCProgram.generic_salt_decode(hashconfig, generatedBuf[2], generatedLen[2], (u8)generatedSite_key_buf, (int)generatedSite_key_len);
		if (parse_rc2 == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// make salt sorter happy
		md5_ctx_t md5_ctx = new md5_ctx_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_init(md5_ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(md5_ctx, generatedSalt_buf, generatedSalt_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(md5_ctx, generatedSite_key_buf, generatedSite_key_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_final(md5_ctx);
		Object[] generatedH = md5_ctx.getH();
		generatedSalt_buf[0] = generatedH[0];
		generatedSalt_buf[1] = generatedH[1];
		generatedSalt_buf[2] = generatedH[2];
		generatedSalt_buf[3] = generatedH[3];
		salt.setSalt_len(16);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pdf_t pdf = (pdf_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(12);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PDF;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 3;
		generatedLen_max[3] = 3;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 1;
		generatedLen_max[4] = 6;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[5] = 1;
		generatedLen_max[5] = 1;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[6] = 2;
		generatedLen_max[6] = 2;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[7] = 32;
		generatedLen_max[7] = 64;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[8] = 2;
		generatedLen_max[8] = 2;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[9] = 64;
		generatedLen_max[9] = 64;
		generatedSep[9] = (byte)'*';
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[10] = 2;
		generatedLen_max[10] = 2;
		generatedSep[10] = (byte)'*';
		generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[11] = 64;
		generatedLen_max[11] = 64;
		generatedSep[11] = (byte)'*';
		generatedAttr[11] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 V_pos = generatedBuf[1];
		u8 R_pos = generatedBuf[2];
		u8 bits_pos = generatedBuf[3];
		u8 P_pos = generatedBuf[4];
		u8 enc_md_pos = generatedBuf[5];
		u8 id_len_pos = generatedBuf[6];
		u8 id_buf_pos = generatedBuf[7];
		u8 u_len_pos = generatedBuf[8];
		u8 u_buf_pos = generatedBuf[9];
		u8 o_len_pos = generatedBuf[10];
		u8 o_buf_pos = generatedBuf[11];
		// validate data
		int V = /*Error: Function owner not recognized*/strtol((byte)V_pos, (null), 10);
		int R = /*Error: Function owner not recognized*/strtol((byte)R_pos, (null), 10);
		int P = /*Error: Function owner not recognized*/strtol((byte)P_pos, (null), 10);
		int vr_ok = 0;
		if ((V == 2) && (R == 3)) {
			vr_ok = 1;
		} 
		if ((V == 4) && (R == 4)) {
			vr_ok = 1;
		} 
		if (vr_ok == 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int id_len = /*Error: Function owner not recognized*/strtol((byte)id_len_pos, (null), 10);
		int u_len = /*Error: Function owner not recognized*/strtol((byte)u_len_pos, (null), 10);
		int o_len = /*Error: Function owner not recognized*/strtol((byte)o_len_pos, (null), 10);
		if ((id_len != 16) && (id_len != 32)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (u_len != 32) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (o_len != 32) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int bits = /*Error: Function owner not recognized*/strtol((byte)bits_pos, (null), 10);
		if (bits != 128) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int enc_md = 1;
		if (R >= 4) {
			enc_md = /*Error: Function owner not recognized*/strtol((byte)enc_md_pos, (null), 10);
		} 
		// copy data to esalt// copy data to esaltpdf.setV(V);
		pdf.setR(R);
		pdf.setP(P);
		pdf.setEnc_md(enc_md);
		Object[] generatedId_buf = pdf.getId_buf();
		generatedId_buf[0] = ModernizedCProgram.hex_to_u32(id_buf_pos + 0);
		generatedId_buf[1] = ModernizedCProgram.hex_to_u32(id_buf_pos + 8);
		generatedId_buf[2] = ModernizedCProgram.hex_to_u32(id_buf_pos + 16);
		generatedId_buf[3] = ModernizedCProgram.hex_to_u32(id_buf_pos + 24);
		if (id_len == 32) {
			generatedId_buf[4] = ModernizedCProgram.hex_to_u32(id_buf_pos + 32);
			generatedId_buf[5] = ModernizedCProgram.hex_to_u32(id_buf_pos + 40);
			generatedId_buf[6] = ModernizedCProgram.hex_to_u32(id_buf_pos + 48);
			generatedId_buf[7] = ModernizedCProgram.hex_to_u32(id_buf_pos + 56);
		} 
		pdf.setId_len(id_len);
		Object[] generatedU_buf = pdf.getU_buf();
		generatedU_buf[0] = ModernizedCProgram.hex_to_u32(u_buf_pos + 0);
		generatedU_buf[1] = ModernizedCProgram.hex_to_u32(u_buf_pos + 8);
		generatedU_buf[2] = ModernizedCProgram.hex_to_u32(u_buf_pos + 16);
		generatedU_buf[3] = ModernizedCProgram.hex_to_u32(u_buf_pos + 24);
		generatedU_buf[4] = ModernizedCProgram.hex_to_u32(u_buf_pos + 32);
		generatedU_buf[5] = ModernizedCProgram.hex_to_u32(u_buf_pos + 40);
		generatedU_buf[6] = ModernizedCProgram.hex_to_u32(u_buf_pos + 48);
		generatedU_buf[7] = ModernizedCProgram.hex_to_u32(u_buf_pos + 56);
		pdf.setU_len(u_len);
		Object[] generatedO_buf = pdf.getO_buf();
		generatedO_buf[0] = ModernizedCProgram.hex_to_u32(o_buf_pos + 0);
		generatedO_buf[1] = ModernizedCProgram.hex_to_u32(o_buf_pos + 8);
		generatedO_buf[2] = ModernizedCProgram.hex_to_u32(o_buf_pos + 16);
		generatedO_buf[3] = ModernizedCProgram.hex_to_u32(o_buf_pos + 24);
		generatedO_buf[4] = ModernizedCProgram.hex_to_u32(o_buf_pos + 32);
		generatedO_buf[5] = ModernizedCProgram.hex_to_u32(o_buf_pos + 40);
		generatedO_buf[6] = ModernizedCProgram.hex_to_u32(o_buf_pos + 48);
		generatedO_buf[7] = ModernizedCProgram.hex_to_u32(o_buf_pos + 56);
		pdf.setO_len(o_len)// precompute rc4 data for later use;// precompute rc4 data for later use
		u32[] padding = new u32[]{-1024, -1024, -1024, -1024, -1024, -1024, -1024, -1024};
		// md5u32[] salt_pc_block = new u32[]{0};
		u8 salt_pc_ptr = (u8)salt_pc_block;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_pc_ptr, padding, 32);
		int generatedId_len = pdf.getId_len();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_pc_ptr + 32, generatedId_buf, generatedId_len);
		u32[] salt_pc_digest = new u32[]{0};
		ModernizedCProgram.md5_complete_no_limit(salt_pc_digest, salt_pc_block, 32 + generatedId_len);
		Object[] generatedRc4data = pdf.getRc4data();
		generatedRc4data[0] = salt_pc_digest[0];
		generatedRc4data[1] = salt_pc_digest[1]// we use ID for salt, maybe needs to change, we will see...;// we use ID for salt, maybe needs to change, we will see...
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedId_buf[0];
		generatedSalt_buf[1] = generatedId_buf[1];
		generatedSalt_buf[2] = generatedId_buf[2];
		generatedSalt_buf[3] = generatedId_buf[3];
		generatedSalt_buf[4] = generatedU_buf[0];
		generatedSalt_buf[5] = generatedU_buf[1];
		generatedSalt_buf[6] = generatedO_buf[0];
		generatedSalt_buf[7] = generatedO_buf[1];
		salt.setSalt_len(generatedId_len + 16);
		salt.setSalt_iter((50 + 20));
		digest[0] = generatedU_buf[0];
		digest[1] = generatedU_buf[1];
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pstoken_t pstoken = (pstoken_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 32;
		generatedLen_max[1] = 1024;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = pstoken.getSalt_buf();
		u8[] pstoken_ptr = (u8)generatedSalt_buf;
		for (int i = 0;
		int j = 0;
		 i < salt_len; ) {
			pstoken_ptr[j] = ModernizedCProgram.hex_to_u8(salt_pos + i);
		}
		pstoken.setSalt_len(salt_len / 2);
		generatedSalt_buf[0] = generatedSalt_buf[/* some fake salt for the sorting mechanisms */0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedSalt_buf[4];
		generatedSalt_buf[5] = generatedSalt_buf[5];
		generatedSalt_buf[6] = generatedSalt_buf[6];
		generatedSalt_buf[7] = generatedSalt_buf[7];
		salt.setSalt_len(32/* we need to check if we can precompute some of the data --
		     this is possible since the scheme is badly designed */);
		Object[] generatedPc_digest = pstoken.getPc_digest();
		generatedPc_digest[0] = sha1_constants.SHA1M_A;
		generatedPc_digest[1] = sha1_constants.SHA1M_B;
		generatedPc_digest[2] = sha1_constants.SHA1M_C;
		generatedPc_digest[3] = sha1_constants.SHA1M_D;
		generatedPc_digest[4] = sha1_constants.SHA1M_E;
		pstoken.setPc_offset(0);
		Object generatedSalt_len = pstoken.getSalt_len();
		Object generatedPc_offset = pstoken.getPc_offset();
		for (int i = 0;
		 i < (int)generatedSalt_len - 63; i += 64) {
			u32[] w = new u32();
			w[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 0]);
			w[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 1]);
			w[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 2]);
			w[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 3]);
			w[4] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 4]);
			w[5] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 5]);
			w[6] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 6]);
			w[7] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 7]);
			w[8] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 8]);
			w[9] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 9]);
			w[10] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 10]);
			w[11] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 11]);
			w[12] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 12]);
			w[13] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 13]);
			w[14] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 14]);
			w[15] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[generatedPc_offset + 15]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_transform(w + 0, w + 4, w + 8, w + 12, generatedPc_digest);
			generatedPc_offset += 16;
		}
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_CRAM_MD5_DOVECOT;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 32;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[2] = 32;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		u8[] hash_pos = (u8)line_buf + 10;
		digest[0] = ModernizedCProgram.hex_to_u32((u8)hash_pos[0]);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)hash_pos[8]);
		digest[2] = ModernizedCProgram.hex_to_u32((u8)hash_pos[16]);
		digest[3] = ModernizedCProgram.hex_to_u32((u8)hash_pos[24]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_655331);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 64;
		generatedLen_max[1] = 64;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA512M_A;
			digest[1] -= sha2_64_constants.SHA512M_B;
			digest[2] -= sha2_64_constants.SHA512M_C;
			digest[3] -= sha2_64_constants.SHA512M_D;
			digest[4] -= sha2_64_constants.SHA512M_E;
			digest[5] -= sha2_64_constants.SHA512M_F;
			digest[6] -= sha2_64_constants.SHA512M_G;
			digest[7] -= sha2_64_constants.SHA512M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 16;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 16;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = 0;
		digest[3] = 0;
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		ethereum_scrypt_t ethereum_scrypt = (ethereum_scrypt_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(7);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ETHEREUM_SCRYPT;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 11;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'*';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 1;
		generatedLen_max[3] = 6;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[4] = (byte)'*';
		generatedLen_min[4] = 64;
		generatedLen_max[4] = 64;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[5] = (byte)'*';
		generatedLen_min[5] = 64;
		generatedLen_max[5] = 64;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[6] = (byte)'*';
		generatedLen_min[6] = 64;
		generatedLen_max[6] = 64;
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// scrypt settings
		Object[] generatedBuf = token.getBuf();
		u8 scryptN_pos = generatedBuf[1];
		u8 scryptr_pos = generatedBuf[2];
		u8 scryptp_pos = generatedBuf[3];
		u32 scrypt_N = ModernizedCProgram.hc_strtoul((byte)scryptN_pos, (null), 10);
		u32 scrypt_r = ModernizedCProgram.hc_strtoul((byte)scryptr_pos, (null), 10);
		u32 scrypt_p = ModernizedCProgram.hc_strtoul((byte)scryptp_pos, (null), 10);
		salt.setScrypt_N(scrypt_N);
		salt.setScrypt_r(scrypt_r);
		salt.setScrypt_p(scrypt_p)// salt;// salt
		u8 salt_pos = generatedBuf[4];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[4];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedSalt_buf[4];
		generatedSalt_buf[5] = generatedSalt_buf[5];
		generatedSalt_buf[6] = generatedSalt_buf[6];
		generatedSalt_buf[7] = generatedSalt_buf[7];
		salt.setSalt_iter(1)// ciphertext;// ciphertext
		u8[] ciphertext_pos = generatedBuf[5];
		Object[] generatedCiphertext = ethereum_scrypt.getCiphertext();
		generatedCiphertext[0] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[0]);
		generatedCiphertext[1] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[8]);
		generatedCiphertext[2] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[16]);
		generatedCiphertext[3] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[24]);
		generatedCiphertext[4] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[32]);
		generatedCiphertext[5] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[40]);
		generatedCiphertext[6] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[48]);
		generatedCiphertext[7] = ModernizedCProgram.hex_to_u32((u8)ciphertext_pos[56])// hash;// hash
		u8[] hash_pos = generatedBuf[6];
		digest[0] = ModernizedCProgram.hex_to_u32((u8)hash_pos[0]);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)hash_pos[8]);
		digest[2] = ModernizedCProgram.hex_to_u32((u8)hash_pos[16]);
		digest[3] = ModernizedCProgram.hex_to_u32((u8)hash_pos[24]);
		digest[4] = ModernizedCProgram.hex_to_u32((u8)hash_pos[32]);
		digest[5] = ModernizedCProgram.hex_to_u32((u8)hash_pos[40]);
		digest[6] = ModernizedCProgram.hex_to_u32((u8)hash_pos[48]);
		digest[7] = ModernizedCProgram.hex_to_u32((u8)hash_pos[56]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		Object[] generatedLen = token.getLen();
		generatedLen[1] = 2;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_327661);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(2048);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA512M_A;
			digest[1] -= sha2_64_constants.SHA512M_B;
			digest[2] -= sha2_64_constants.SHA512M_C;
			digest[3] -= sha2_64_constants.SHA512M_D;
			digest[4] -= sha2_64_constants.SHA512M_E;
			digest[5] -= sha2_64_constants.SHA512M_F;
			digest[6] -= sha2_64_constants.SHA512M_G;
			digest[7] -= sha2_64_constants.SHA512M_H;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'$';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[1] = 40;
		generatedLen_max[1] = 40;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer/**
			   * salt
			   */);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] salt_pos = generatedBuf[0];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[0];
		int user_len = 0;
		for (int i = 0;
		 i < salt_len; i++) {
			if (salt_pos[i] == (byte)' ') {
				continue;
			} 
			user_len++;
		}
		// SAP user names cannot be longer than 12 charactersif (user_len > 12) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// SAP user name cannot start with ! or ?if (salt_pos[0] == (byte)'!' || salt_pos[0] == (byte)'?') {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH/**
			   * hash
			   */);
		} 
		u8[] hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u32((u8)hash_pos[0]);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)hash_pos[8]);
		digest[2] = ModernizedCProgram.hex_to_u32((u8)hash_pos[16]);
		digest[3] = ModernizedCProgram.hex_to_u32((u8)hash_pos[24]);
		digest[4] = ModernizedCProgram.hex_to_u32((u8)hash_pos[32]);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 8;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[1] = 128;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA512M_A;
			digest[1] -= sha2_64_constants.SHA512M_B;
			digest[2] -= sha2_64_constants.SHA512M_C;
			digest[3] -= sha2_64_constants.SHA512M_D;
			digest[4] -= sha2_64_constants.SHA512M_E;
			digest[5] -= sha2_64_constants.SHA512M_F;
			digest[6] -= sha2_64_constants.SHA512M_G;
			digest[7] -= sha2_64_constants.SHA512M_H;
		} 
		u8 salt_pos = generatedBuf[0];
		int salt_len = generatedLen[0];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 8;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 8;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 8;
		generatedLen_max[1] = 8;
		generatedSep[1] = hashconfig.getSeparator();
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// digest
		Object[] generatedBuf = token.getBuf();
		u8[] hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32((u8)hash_pos[0]);
		digest[1] = 0;
		digest[2] = 0;
		digest[3] = 0// salt;// salt
		u8[] salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32((u8)salt_pos[0]);
		// 4// 4salt.setSalt_len(salt_len / 2);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		itunes_backup_t itunes_backup = (itunes_backup_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(7);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ITUNES_BACKUP;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 15;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 15;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 2;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 80;
		generatedLen_max[2] = 80;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[3] = 1;
		generatedLen_max[3] = 6;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 40;
		generatedLen_max[4] = 40;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[5] = 0;
		generatedLen_max[5] = 10;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[6] = 0;
		generatedLen_max[6] = 40;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// version
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u32 version = ModernizedCProgram.hc_strtoul((byte)version_pos, (null), 10);
		u32 hash_mode = hashconfig.getHash_mode();
		if (hash_mode == 14700) {
			if (version != 9) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
		}  else if (hash_mode == 14800) {
			if (version != 10) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
		} 
		Object[] generatedSalt_sign = salt.getSalt_sign();
		generatedSalt_sign[0] = (byte)version// wpky;// wpky
		u8[] wpky_pos = generatedBuf[2];
		Object[] generatedWpky = itunes_backup.getWpky();
		u32[] wpky_buf_ptr = (u32)generatedWpky;
		wpky_buf_ptr[0] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[0]);
		wpky_buf_ptr[1] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[8]);
		wpky_buf_ptr[2] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[16]);
		wpky_buf_ptr[3] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[24]);
		wpky_buf_ptr[4] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[32]);
		wpky_buf_ptr[5] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[40]);
		wpky_buf_ptr[6] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[48]);
		wpky_buf_ptr[7] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[56]);
		wpky_buf_ptr[8] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[64]);
		wpky_buf_ptr[9] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[72]);
		wpky_buf_ptr[0] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[0]);
		wpky_buf_ptr[1] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[1]);
		wpky_buf_ptr[2] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[2]);
		wpky_buf_ptr[3] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[3]);
		wpky_buf_ptr[4] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[4]);
		wpky_buf_ptr[5] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[5]);
		wpky_buf_ptr[6] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[6]);
		wpky_buf_ptr[7] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[7]);
		wpky_buf_ptr[8] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[8]);
		wpky_buf_ptr[9] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[9])// iter;// iter
		u8 iter_pos = generatedBuf[3];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		if (iter < 1) {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		if (hash_mode == 14700) {
			salt.setSalt_iter(iter - 1);
		}  else if (hash_mode == 14800) {
			salt.setSalt_iter(0);
			salt.setSalt_iter2(iter - 1);
		} 
		// saltu8 salt_pos = generatedBuf[4];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[4];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3]);
		generatedSalt_buf[4] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[4])// dpic + dpsl;// dpic + dpsl
		u8 dpic_pos = generatedBuf[5];
		int dpic_len = generatedLen[5];
		u8[] dpsl_pos = generatedBuf[6];
		int dpsl_len = generatedLen[6];
		u32 dpic = 0;
		Object[] generatedDpsl = itunes_backup.getDpsl();
		if (hash_mode == 14700) {
			if (dpic_len > 0) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
			if (dpsl_len > 0) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
		}  else if (hash_mode == 14800) {
			if (dpic_len < 1) {
				return (parser_rc.PARSER_SALT_ITERATION);
			} 
			if (dpic_len > 9) {
				return (parser_rc.PARSER_SALT_ITERATION);
			} 
			dpic = ModernizedCProgram.hc_strtoul((byte)dpic_pos, (null), 10);
			if (dpic < 1) {
				return (parser_rc.PARSER_SALT_ITERATION);
			} 
			salt.setSalt_iter(dpic - 1);
			if (dpsl_len != 40) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
			u32 dpsl_buf_ptr = (u32)generatedDpsl;
			dpsl_buf_ptr[0] = ModernizedCProgram.hex_to_u32((u8)dpsl_pos[0]);
			dpsl_buf_ptr[1] = ModernizedCProgram.hex_to_u32((u8)dpsl_pos[8]);
			dpsl_buf_ptr[2] = ModernizedCProgram.hex_to_u32((u8)dpsl_pos[16]);
			dpsl_buf_ptr[3] = ModernizedCProgram.hex_to_u32((u8)dpsl_pos[24]);
			dpsl_buf_ptr[4] = ModernizedCProgram.hex_to_u32((u8)dpsl_pos[32]);
			dpsl_buf_ptr[0] = ModernizedCProgram.byte_swap_32(dpsl_buf_ptr[0]);
			dpsl_buf_ptr[1] = ModernizedCProgram.byte_swap_32(dpsl_buf_ptr[1]);
			dpsl_buf_ptr[2] = ModernizedCProgram.byte_swap_32(dpsl_buf_ptr[2]);
			dpsl_buf_ptr[3] = ModernizedCProgram.byte_swap_32(dpsl_buf_ptr[3]);
			dpsl_buf_ptr[4] = ModernizedCProgram.byte_swap_32(dpsl_buf_ptr[4]);
		} 
		digest[0] = generatedDpsl[0] ^ generatedWpky[0];
		digest[1] = generatedDpsl[1] ^ generatedWpky[1];
		digest[2] = generatedDpsl[2] ^ generatedWpky[2];
		digest[3] = generatedDpsl[3] ^ generatedWpky[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		ethereum_presale_t ethereum_presale = (ethereum_presale_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ETHEREUM_PRESALE;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 11;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'*';
		generatedLen_min[1] = 64;
		generatedLen_max[1] = 1248;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 40;
		generatedLen_max[2] = 40;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// encseed
		Object[] generatedBuf = token.getBuf();
		u8[] encseed_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int encseed_len = generatedLen[1];
		Object[] generatedIv = ethereum_presale.getIv();
		generatedIv[0] = ModernizedCProgram.hex_to_u32((u8)encseed_pos[0]);
		generatedIv[1] = ModernizedCProgram.hex_to_u32((u8)encseed_pos[8]);
		generatedIv[2] = ModernizedCProgram.hex_to_u32((u8)encseed_pos[16]);
		generatedIv[3] = ModernizedCProgram.hex_to_u32((u8)encseed_pos[24]);
		generatedIv[0] = ModernizedCProgram.byte_swap_32(generatedIv[0]);
		generatedIv[1] = ModernizedCProgram.byte_swap_32(generatedIv[1]);
		generatedIv[2] = ModernizedCProgram.byte_swap_32(generatedIv[2]);
		generatedIv[3] = ModernizedCProgram.byte_swap_32(generatedIv[3]);
		Object[] generatedEnc_seed = ethereum_presale.getEnc_seed();
		u32[] esalt_buf_ptr = generatedEnc_seed;
		for (int i = 32;
		int j = 0;
		 i < encseed_len; ) {
			esalt_buf_ptr[j] = ModernizedCProgram.hex_to_u32((u8)encseed_pos[i]);
			esalt_buf_ptr[j] = ModernizedCProgram.byte_swap_32(esalt_buf_ptr[j]);
		}
		// encseed length without IV (raw bytes, not hex)// encseed length without IV (raw bytes, not hex)ethereum_presale.setEnc_seed_len((encseed_len - 32) / 2)// salt (address);// salt (address)
		u8 ethaddr_pos = generatedBuf[2];
		int ethaddr_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, ethaddr_pos, ethaddr_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_ETHEREUM_PRESALE - 1)// hash (bkp);// hash (bkp)
		u8[] bkp_pos = generatedBuf[3];
		digest[0] = ModernizedCProgram.hex_to_u32((u8)bkp_pos[0]);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)bkp_pos[8]);
		digest[2] = ModernizedCProgram.hex_to_u32((u8)bkp_pos[16]);
		digest[3] = ModernizedCProgram.hex_to_u32((u8)bkp_pos[24]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] hash_pos = generatedBuf[0];
		byte c9 = ModernizedCProgram.itoa64_to_int(hash_pos[9]);
		if (c9 & 3) {
			return (parser_rc.PARSER_HASH_VALUE);
		} 
		u8[] add_leading_zero = new u8();
		add_leading_zero[0] = (byte)'.';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(add_leading_zero + 1, line_buf, 10);
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.itoa64_to_int, (u8)add_leading_zero, 11, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 8);
		{ 
			{ 
				u32x t = new u32x();
				t = digest[1] >> 4;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 4;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 16;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 16;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 2;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 2;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 8;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 8;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 1;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 1;
				digest[1] = digest[1] ^ t;
			}
			;
		}
		;
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		if (line_len == 0) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		HCFILE fp = new HCFILE();
		if (fp.hc_fopen((byte)line_buf, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		psafe2_hdr buf = new psafe2_hdr();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(buf, 0, /*Error: Unsupported expression*/);
		size_t n = fp.hc_fread(buf, /*Error: Unsupported expression*/, 1);
		fp.hc_fclose();
		if (n != 1) {
			return (parser_rc.PARSER_PSAFE2_FILE_SIZE);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object[] generatedRandom = buf.getRandom();
		generatedSalt_buf[0] = generatedRandom[0];
		generatedSalt_buf[1] = generatedRandom[1];
		salt.setSalt_len(8);
		salt.setSalt_iter(1000);
		Object[] generatedHash = buf.getHash();
		digest[0] = ModernizedCProgram.byte_swap_32(generatedHash[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(generatedHash[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(generatedHash[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(generatedHash[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(generatedHash[4]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		agilekey_t agilekey = (agilekey_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 6;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[1] = 16;
		generatedLen_max[1] = 16;
		generatedSep[1] = (byte)':';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[2] = 2080;
		generatedLen_max[2] = 2080;
		generatedSep[2] = (byte)':';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer/**
			   * pbkdf2 iterations
			   */);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[0];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10) - 1/**
		   * handle salt encoding
		   */);
		u8[] salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		u8 saltbuf_ptr = (u8)generatedSalt_buf;
		for (int i = 0;
		 i < salt_len; i += 2) {
			u8 p0 = salt_pos[i + 0];
			u8 p1 = salt_pos[i + 1];
			saltbuf_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		salt.setSalt_len(salt_len / 2/**
		   * handle cipher encoding
		   */);
		u8[] cipher_pos = generatedBuf[2];
		int cipher_len = generatedLen[2];
		u32[] tmp = new u32[]{0};
		u8 cipherbuf_ptr = (u8)tmp;
		for (int i = 2016;
		 i < cipher_len; i += 2) {
			u8 p0 = cipher_pos[i + 0];
			u8 p1 = cipher_pos[i + 1];
			cipherbuf_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		// iv   is stored at salt_buf 4 (length 16)// data is stored at salt_buf 8 (length 16)// iv   is stored at salt_buf 4 (length 16)// data is stored at salt_buf 8 (length 16)generatedSalt_buf[4] = ModernizedCProgram.byte_swap_32(tmp[0]);
		generatedSalt_buf[5] = ModernizedCProgram.byte_swap_32(tmp[1]);
		generatedSalt_buf[6] = ModernizedCProgram.byte_swap_32(tmp[2]);
		generatedSalt_buf[7] = ModernizedCProgram.byte_swap_32(tmp[3]);
		generatedSalt_buf[8] = ModernizedCProgram.byte_swap_32(tmp[4]);
		generatedSalt_buf[9] = ModernizedCProgram.byte_swap_32(tmp[5]);
		generatedSalt_buf[10] = ModernizedCProgram.byte_swap_32(tmp[6]);
		generatedSalt_buf[11] = ModernizedCProgram.byte_swap_32(tmp[7]);
		Object[] generatedCipher = agilekey.getCipher();
		for (int i = 0;
		int j = 0;
		 i < 1040; ) {
			u8 p0 = cipher_pos[j + 0];
			u8 p1 = cipher_pos[j + 1];
			generatedCipher[i] = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4/**
			   * digest buf
			   */;
		}
		digest[0] = -1024;
		digest[1] = -1024;
		digest[2] = -1024;
		digest[3] = -1024;
		return (parser_rc.PARSER_OK);
		u32 digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 1;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		generatedLen[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		generatedLen[2] = 19;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedLen[3] = 1;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		if (generatedBuf[0][0] != (byte)'(') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		if (generatedBuf[1][0] != (byte)'G') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		if (generatedBuf[3][0] != (byte)')') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		u8[] hash_pos = generatedBuf[2];
		int hash_len = generatedLen[2];
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.lotus64_to_int, hash_pos, hash_len, tmp_buf);
		// dont ask!// dont ask!tmp_buf[3] += -4// salt;// salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, tmp_buf, 5);
		salt.setSalt_len(5);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf + 5, 9)// yes, only 9 byte are needed to crack, but 10 to display;// yes, only 9 byte are needed to crack, but 10 to display
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		generatedSalt_buf_pc[7] = hash_pos[18];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D/**
			   * This is a virtual salt. While the algorithm is basically not salted
			   * we can exploit the salt buffer to set the 0x80 and the w[14] value.
			   * This way we can save a special md5md5 kernel and reuse the one from vbull.
			   */;
		} 
		u8 zero = (u8)"";
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, zero, 0, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_NETSCALER;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 1;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		generatedLen[2] = 40;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, salt_pos, salt_len);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		salt.setSalt_len(salt_len)// hash;// hash
		u8 hash_pos = generatedBuf[2];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 56;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		int hash_len = generatedLen[0];
		if (hash_len != 56) {
			return (parser_rc.PARSER_GLOBAL_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		win8phone_t esalt = (win8phone_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 256;
		generatedLen_max[1] = 256;
		generatedSep[1] = hashconfig.getSeparator();
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// hash
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7])// salt;// salt
		u8 salt_pos = generatedBuf[1];
		Object[] generatedSalt_buf = esalt.getSalt_buf();
		u32[] salt_buf = generatedSalt_buf;
		for (int i = 0;
		int j = 0;
		 i < 32; ) {
			salt_buf[i] = ModernizedCProgram.hex_to_u32(salt_pos + j);
			salt_buf[i] = ModernizedCProgram.byte_swap_32(salt_buf[i]);
		}
		generatedSalt_buf[0] = salt_buf[0];
		generatedSalt_buf[1] = salt_buf[1];
		generatedSalt_buf[2] = salt_buf[2];
		generatedSalt_buf[3] = salt_buf[3];
		generatedSalt_buf[4] = salt_buf[4];
		generatedSalt_buf[5] = salt_buf[5];
		generatedSalt_buf[6] = salt_buf[6];
		generatedSalt_buf[7] = salt_buf[7];
		salt.setSalt_len(32);
		return (parser_rc.PARSER_OK);
		pkzip_t pkzip = (pkzip_t)esalt_buf;
		u32[] digest = (u32)digest_buf;
		byte[] input = new byte[line_len + 1];
		input[line_len] = (byte)'\0';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(input, line_buf, line_len);
		Byte saveptr = (null);
		byte[] p = /*Error: Function owner not recognized*/strtok_r(input, "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		if (/*Error: Function owner not recognized*/strncmp(p, ModernizedCProgram.SIGNATURE_PKZIP_V1, 7) != 0 && /*Error: Function owner not recognized*/strncmp(p, ModernizedCProgram.SIGNATURE_PKZIP_V2, 8) != 0) {
			return parser_rc.PARSER_SIGNATURE_UNMATCHED;
		} 
		pkzip.setVersion(1);
		if (/*Error: Function owner not recognized*/strlen(p) == 9) {
			pkzip.setVersion(2);
		} 
		byte[] sub = new byte[2];
		sub[0] = p[/*Error: Function owner not recognized*/strlen(p) - 1];
		sub[1] = (byte)'\0';
		pkzip.setHash_count(/*Error: Function owner not recognized*/atoi(sub));
		Object generatedHash_count = pkzip.getHash_count();
		// check here that the hash_count is valid for the attack typeif (generatedHash_count != 1) {
			return parser_rc.PARSER_HASH_VALUE;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		pkzip.setChecksum_size(/*Error: Function owner not recognized*/atoi(p));
		Object generatedChecksum_size = pkzip.getChecksum_size();
		if (generatedChecksum_size != 1 && generatedChecksum_size != 2) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		pkzip_hash generatedHash = pkzip.getHash();
		generatedHash.setData_type_enum(/*Error: Function owner not recognized*/atoi(p));
		Object generatedData_type_enum = generatedHash.getData_type_enum();
		if (generatedData_type_enum > 3) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		generatedHash.setMagic_type_enum(/*Error: Function owner not recognized*/atoi(p));
		Object generatedCompressed_length = generatedHash.getCompressed_length();
		if (generatedData_type_enum > 1) {
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHash.setCompressed_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHash.setUncompressed_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			if (generatedCompressed_length > (320 * 1024)) {
				return parser_rc.PARSER_TOKEN_LENGTH;
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			u32 crc32 = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%x", ModernizedCProgram.crc32);
			generatedHash.setCrc32(ModernizedCProgram.crc32);
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHash.setOffset(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHash.setAdditional_offset(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		generatedHash.setCompression_type(/*Error: Function owner not recognized*/atoi(p));
		Object generatedCompression_type = generatedHash.getCompression_type();
		if (generatedCompression_type != 8) {
			return parser_rc.PARSER_PKZIP_CT_UNMATCHED;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		generatedHash.setData_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		u16 checksum_from_crc = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%hx", checksum_from_crc);
		generatedHash.setChecksum_from_crc(checksum_from_crc);
		Object generatedVersion = pkzip.getVersion();
		Object generatedChecksum_from_crc = generatedHash.getChecksum_from_crc();
		if (generatedVersion == 2) {
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			u16 checksum_from_timestamp = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%hx", checksum_from_timestamp);
			generatedHash.setChecksum_from_timestamp(checksum_from_timestamp);
		} else {
				generatedHash.setChecksum_from_timestamp(generatedChecksum_from_crc);
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		Object[] generatedData = generatedHash.getData();
		ModernizedCProgram.hex_to_binary(p, /*Error: Function owner not recognized*/strlen(p), (byte)(generatedData));
		Object[] generatedSalt_buf = salt.getSalt_buf();
		// fake salt// fake saltgeneratedSalt_buf[0] = generatedData[0];
		generatedSalt_buf[1] = generatedData[1];
		generatedSalt_buf[2] = generatedData[2];
		generatedSalt_buf[3] = generatedData[3];
		salt.setSalt_len(16);
		Object generatedCrc32 = generatedHash.getCrc32();
		digest[0] = generatedCrc32;
		digest[1] = 0;
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA512M_A;
			digest[1] -= sha2_64_constants.SHA512M_B;
			digest[2] -= sha2_64_constants.SHA512M_C;
			digest[3] -= sha2_64_constants.SHA512M_D;
			digest[4] -= sha2_64_constants.SHA512M_E;
			digest[5] -= sha2_64_constants.SHA512M_F;
			digest[6] -= sha2_64_constants.SHA512M_G;
			digest[7] -= sha2_64_constants.SHA512M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		netntlm_t netntlm = (netntlm_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		Object[] generatedLen_min = token.getLen_min();
		// username// usernamegeneratedLen_min[0] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 60;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// unused// unusedgeneratedLen_min[1] = 0;
		generatedLen_max[1] = 0;
		generatedSep[1] = (byte)':';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// domain// domaingeneratedLen_min[2] = 0;
		generatedLen_max[2] = 45;
		generatedSep[2] = (byte)':';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// lm response// lm responsegeneratedLen_min[3] = 0;
		generatedLen_max[3] = 48;
		generatedSep[3] = (byte)':';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		// ntlm response// ntlm responsegeneratedLen_min[4] = 48;
		generatedLen_max[4] = 48;
		generatedSep[4] = (byte)':';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		// challenge// challengegeneratedLen_min[5] = 16;
		generatedLen_max[5] = 16;
		generatedSep[5] = (byte)':';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] user_pos = generatedBuf[0];
		u8[] domain_pos = generatedBuf[2];
		u8[] srvchall_pos = generatedBuf[3];
		u8 hash_pos = generatedBuf[4];
		u8[] clichall_pos = generatedBuf[5];
		Object[] generatedLen = token.getLen();
		int user_len = generatedLen[0];
		int domain_len = generatedLen[2];
		int srvchall_len = generatedLen[3];
		int clichall_len = generatedLen[5/**
		   * store some data for later use
		   */];
		netntlm.setUser_len(user_len * 2);
		netntlm.setDomain_len(domain_len * 2);
		netntlm.setSrvchall_len(srvchall_len / 2);
		netntlm.setClichall_len(clichall_len / 2);
		Object[] generatedUserdomain_buf = netntlm.getUserdomain_buf();
		u8 userdomain_ptr = (u8)generatedUserdomain_buf;
		Object[] generatedChall_buf = netntlm.getChall_buf();
		u8 chall_ptr = (u8)generatedChall_buf;
		for (int i = 0;
		 i < user_len; i++) {
			userdomain_ptr++ = user_pos[i];
			userdomain_ptr++ = 0;
		}
		for (int i = 0;
		 i < domain_len; i++) {
			userdomain_ptr++ = domain_pos[i];
			userdomain_ptr++ = 0/**
			   * handle server challenge encoding
			   */;
		}
		for (int i = 0;
		 i < srvchall_len; i += 2) {
			u8 p0 = srvchall_pos[i + 0];
			u8 p1 = srvchall_pos[i + 1];
			chall_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4/**
			   * handle client challenge encoding
			   */;
		}
		for (int i = 0;
		 i < clichall_len; i += 2) {
			u8 p0 = clichall_pos[i + 0];
			u8 p1 = clichall_pos[i + 1];
			chall_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4/**
			   * store data
			   */;
		}
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, clichall_pos, clichall_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		u32[] digest_tmp = new u32();
		digest_tmp[0] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest_tmp[1] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		if (srvchall_len == /* special case 2: ESS */48) {
			if ((generatedChall_buf[2] == 0) && (generatedChall_buf[3] == 0) && (generatedChall_buf[4] == 0) && (generatedChall_buf[5] == 0)) {
				u32[] w = new u32[]{0};
				w[0] = generatedSalt_buf[0];
				w[1] = generatedSalt_buf[1];
				w[2] = generatedChall_buf[0];
				w[3] = generatedChall_buf[1];
				w[4] = -1024;
				w[14] = 16 * 8;
				u32[] dgst = new u32[]{0};
				dgst[0] = md5_constants.MD5M_A;
				dgst[1] = md5_constants.MD5M_B;
				dgst[2] = md5_constants.MD5M_C;
				dgst[3] = md5_constants.MD5M_D;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(w + 0, w + 4, w + 8, w + 12, dgst);
				generatedSalt_buf[0] = dgst[0];
				generatedSalt_buf[1] = dgst[1];
			} 
		} 
		for (u32 i = 0;
		 i < -1024; /* precompute netntlmv1 exploit start */i++) {
			u32[] key_md4 = new u32[]{0};
			u32[] key_des = new u32[]{0};
			key_md4[0] = i;
			ModernizedCProgram.transform_netntlmv1_key((u8)key_md4, (u8)key_des);
			u32[] Kc = new u32[]{0};
			u32[] Kd = new u32[]{0};
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_des_crypt_keysetup(key_des[0], key_des[1], Kc, Kd, (u32)ModernizedCProgram.c_skb);
			u32[] data3 = new u32[]{generatedSalt_buf[0], generatedSalt_buf[1]};
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_des_crypt_encrypt(data3, data3, Kc, Kd, (u32)ModernizedCProgram.c_SPtrans);
			if (data3[0] != digest_tmp[0]) {
				continue;
			} 
			if (data3[1] != digest_tmp[1]) {
				continue;
			} 
			generatedSalt_buf[2] = i;
			salt.setSalt_len(24);
			break;
		}
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		generatedSalt_buf_pc[0] = digest_tmp[0];
		generatedSalt_buf_pc[1] = digest_tmp[1];
		{ 
			{ 
				u32x t = new u32x();
				t = digest[1] >> 4;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 4;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 16;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 16;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 2;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 2;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 8;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 8;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 1;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 1;
				digest[1] = digest[1] ^ /* precompute netntlmv1 exploit stop */t;
			}
			;
		}
		;
		{ 
			{ 
				u32x t = new u32x();
				t = digest[3] >> 4;
				t = t ^ digest[2];
				t = t & -1024;
				digest[2] = digest[2] ^ t;
				t = t << 4;
				digest[3] = digest[3] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[2] >> 16;
				t = t ^ digest[3];
				t = t & -1024;
				digest[3] = digest[3] ^ t;
				t = t << 16;
				digest[2] = digest[2] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[3] >> 2;
				t = t ^ digest[2];
				t = t & -1024;
				digest[2] = digest[2] ^ t;
				t = t << 2;
				digest[3] = digest[3] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[2] >> 8;
				t = t ^ digest[3];
				t = t & -1024;
				digest[3] = digest[3] ^ t;
				t = t << 8;
				digest[2] = digest[2] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[3] >> 1;
				t = t ^ digest[2];
				t = t & -1024;
				digest[2] = digest[2] ^ t;
				t = t << 1;
				digest[3] = digest[3] ^ t;
			}
			;
		}
		;
		digest[0] = ModernizedCProgram.rotr32(digest[0], 29);
		digest[1] = ModernizedCProgram.rotr32(digest[1], 29);
		digest[2] = ModernizedCProgram.rotr32(digest[2], 29);
		digest[3] = ModernizedCProgram.rotr32(digest[3], 29);
		{ 
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf[1] >> 4;
				t = t ^ generatedSalt_buf[0];
				t = t & -1024;
				generatedSalt_buf[0] = generatedSalt_buf[0] ^ t;
				t = t << 4;
				generatedSalt_buf[1] = generatedSalt_buf[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf[0] >> 16;
				t = t ^ generatedSalt_buf[1];
				t = t & -1024;
				generatedSalt_buf[1] = generatedSalt_buf[1] ^ t;
				t = t << 16;
				generatedSalt_buf[0] = generatedSalt_buf[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf[1] >> 2;
				t = t ^ generatedSalt_buf[0];
				t = t & -1024;
				generatedSalt_buf[0] = generatedSalt_buf[0] ^ t;
				t = t << 2;
				generatedSalt_buf[1] = generatedSalt_buf[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf[0] >> 8;
				t = t ^ generatedSalt_buf[1];
				t = t & -1024;
				generatedSalt_buf[1] = generatedSalt_buf[1] ^ t;
				t = t << 8;
				generatedSalt_buf[0] = generatedSalt_buf[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf[1] >> 1;
				t = t ^ generatedSalt_buf[0];
				t = t & -1024;
				generatedSalt_buf[0] = generatedSalt_buf[0] ^ t;
				t = t << 1;
				generatedSalt_buf[1] = generatedSalt_buf[1] ^ t;
			}
			;
		}
		;
		generatedSalt_buf[0] = ModernizedCProgram.rotl32(generatedSalt_buf[0], 3);
		generatedSalt_buf[1] = ModernizedCProgram.rotl32(generatedSalt_buf[1], 3);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 32;
		generatedLen_max[1] = 32;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		apple_secure_notes_t apple_secure_notes = (apple_secure_notes_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_FILEVAULT2;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 10;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)'$';
		generatedLen_min[4] = 1;
		generatedLen_max[4] = 6;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[5] = (byte)'$';
		generatedLen_min[5] = 48;
		generatedLen_max[5] = 48;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// Z_PK
		Object[] generatedBuf = token.getBuf();
		u8 Z_PK_pos = generatedBuf[1];
		u32 Z_PK = ModernizedCProgram.hc_strtoul((byte)Z_PK_pos, (null), 10);
		if (Z_PK != 1) {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		apple_secure_notes.setZ_PK(Z_PK)// ZCRYPTOSALT;// ZCRYPTOSALT
		u8[] ZCRYPTOSALT_pos = generatedBuf[3];
		Object[] generatedZCRYPTOSALT = apple_secure_notes.getZCRYPTOSALT();
		generatedZCRYPTOSALT[0] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[0]);
		generatedZCRYPTOSALT[1] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[8]);
		generatedZCRYPTOSALT[2] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[16]);
		generatedZCRYPTOSALT[3] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[24]);
		generatedZCRYPTOSALT[4] = 0;
		generatedZCRYPTOSALT[5] = 0;
		generatedZCRYPTOSALT[6] = 0;
		generatedZCRYPTOSALT[7] = 0;
		generatedZCRYPTOSALT[8] = 0;
		generatedZCRYPTOSALT[9] = 0;
		generatedZCRYPTOSALT[10] = 0;
		generatedZCRYPTOSALT[11] = 0;
		generatedZCRYPTOSALT[12] = 0;
		generatedZCRYPTOSALT[13] = 0;
		generatedZCRYPTOSALT[14] = 0;
		generatedZCRYPTOSALT[15] = 0// ZCRYPTOITERATIONCOUNT;// ZCRYPTOITERATIONCOUNT
		u8 ZCRYPTOITERATIONCOUNT_pos = generatedBuf[4];
		u32 ZCRYPTOITERATIONCOUNT = ModernizedCProgram.hc_strtoul((byte)ZCRYPTOITERATIONCOUNT_pos, (null), 10);
		apple_secure_notes.setZCRYPTOITERATIONCOUNT(ZCRYPTOITERATIONCOUNT)// ZCRYPTOWRAPPEDKEY;// ZCRYPTOWRAPPEDKEY
		u8[] ZCRYPTOWRAPPEDKEY_pos = generatedBuf[5];
		Object[] generatedZCRYPTOWRAPPEDKEY = apple_secure_notes.getZCRYPTOWRAPPEDKEY();
		generatedZCRYPTOWRAPPEDKEY[0] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[0]);
		generatedZCRYPTOWRAPPEDKEY[1] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[8]);
		generatedZCRYPTOWRAPPEDKEY[2] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[16]);
		generatedZCRYPTOWRAPPEDKEY[3] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[24]);
		generatedZCRYPTOWRAPPEDKEY[4] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[32]);
		generatedZCRYPTOWRAPPEDKEY[5] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[40])// fake salt;// fake salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedZCRYPTOSALT[0];
		generatedSalt_buf[1] = generatedZCRYPTOSALT[1];
		generatedSalt_buf[2] = generatedZCRYPTOSALT[2];
		generatedSalt_buf[3] = generatedZCRYPTOSALT[3];
		Object generatedZ_PK = apple_secure_notes.getZ_PK();
		generatedSalt_buf[4] = generatedZ_PK;
		Object generatedZCRYPTOITERATIONCOUNT = apple_secure_notes.getZCRYPTOITERATIONCOUNT();
		salt.setSalt_iter(generatedZCRYPTOITERATIONCOUNT - 1);
		salt.setSalt_len(20)// fake hash;// fake hash
		digest[0] = generatedZCRYPTOWRAPPEDKEY[0];
		digest[1] = generatedZCRYPTOWRAPPEDKEY[1];
		digest[2] = generatedZCRYPTOWRAPPEDKEY[2];
		digest[3] = generatedZCRYPTOWRAPPEDKEY[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 28;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 28;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		Object[] generatedLen = token.getLen();
		int hash_len = generatedLen[0];
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 20);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = -1024;
		salt.setSalt_len(0);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha256_t pbkdf2_sha256 = (pbkdf2_sha256_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PBKDF2_SHA256;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 6;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)':';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)':';
		generatedLen_min[2] = ((0 * 8) / 6) + 0;
		generatedLen_max[2] = ((256 * 8) / 6) + 3;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedSep[3] = (byte)':';
		generatedLen_min[3] = 16;
		generatedLen_max[3] = 256;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		u8[] tmp_buf = new u8();
		int tmp_len;
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		salt.setSalt_iter(iter - 1)// salt;// salt
		u8 salt_pos = generatedBuf[2];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[2];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, salt_pos, salt_len, tmp_buf);
		if (tmp_len > 256) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf = pbkdf2_sha256.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, tmp_buf, tmp_len);
		salt.setSalt_len(tmp_len);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_buf[4] = generatedSalt_iter// hash;// hash
		u8 hash_pos = generatedBuf[3];
		int hash_len = generatedLen[3];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		if (tmp_len < 16) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 16);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		cram_md5_t cram_md5 = (cram_md5_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_CRAM_MD5;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = ((0 * 8) / 6) + 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = ((256 * 8) / 6) + 3;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 44;
		generatedLen_max[2] = 132;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// hash
		u8 hash_pos = generatedBuf[2];
		int hash_len = generatedLen[2];
		u8[] tmp_buf = new u8[]{0};
		int tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, (u8)hash_pos, hash_len, tmp_buf);
		if (tmp_len < 32 + 1) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		u32 user_len = tmp_len - 32;
		u8 tmp_hash = tmp_buf + user_len;
		// skip the trailing space// skip the trailing spaceuser_len--;
		if (ModernizedCProgram.is_valid_hex_string(tmp_hash, 32) == 0) {
			return (parser_rc.PARSER_HASH_ENCODING);
		} 
		digest[0] = ModernizedCProgram.hex_to_u32(tmp_hash + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(tmp_hash + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(tmp_hash + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(tmp_hash + 24)// store username for host only (output hash if cracked);// store username for host only (output hash if cracked)
		Object[] generatedUser = cram_md5.getUser();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedUser, 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedUser, tmp_buf, user_len);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MYWALLETV2;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 15;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 5;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 64;
		generatedLen_max[3] = 20000;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		salt.setSalt_iter(iter - 1)// salt;// salt
		u8[] data_pos = generatedBuf[3];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32((u8)data_pos[0]);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32((u8)data_pos[8]);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32((u8)data_pos[16]);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32((u8)data_pos[24]);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3])// this is actually the CT, which is also the hash later (if matched);// this is actually the CT, which is also the hash later (if matched)
		generatedSalt_buf[4] = ModernizedCProgram.hex_to_u32((u8)data_pos[32]);
		generatedSalt_buf[5] = ModernizedCProgram.hex_to_u32((u8)data_pos[40]);
		generatedSalt_buf[6] = ModernizedCProgram.hex_to_u32((u8)data_pos[48]);
		generatedSalt_buf[7] = ModernizedCProgram.hex_to_u32((u8)data_pos[56]);
		generatedSalt_buf[4] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[4]);
		generatedSalt_buf[5] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[5]);
		generatedSalt_buf[6] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[6]);
		generatedSalt_buf[7] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[7]);
		// note we need to fix this to 16 in kernel// note we need to fix this to 16 in kernelsalt.setSalt_len(32)// hash;// hash
		digest[0] = generatedSalt_buf[4];
		digest[1] = generatedSalt_buf[5];
		digest[2] = generatedSalt_buf[6];
		digest[3] = generatedSalt_buf[7];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SHA1AIX;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 7;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 2;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 2;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[2] = 16;
		generatedLen_max[2] = 48;
		generatedSep[2] = (byte)'$';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen[3] = 27;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] iter_pos = generatedBuf[1];
		byte[] salt_iter = new byte[]{iter_pos[0], iter_pos[1], 0};
		Object[] generatedSalt_sign = salt.getSalt_sign();
		generatedSalt_sign[0] = ModernizedCProgram.hc_strtoul((byte)salt_iter, (null), 10);
		salt.setSalt_iter((-1024 << ModernizedCProgram.hc_strtoul((byte)salt_iter, (null), 10)) - 1);
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 hash_pos = generatedBuf[3];
		ModernizedCProgram.sha1aix_decode((u8)digest, hash_pos);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		oldoffice34_t oldoffice34 = (oldoffice34_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_OLDOFFICE3;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[4] = 40;
		generatedLen_max[4] = 40;
		generatedSep[4] = (byte)':';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[5] = 10;
		generatedLen_max[5] = 10;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 osalt_pos = generatedBuf[2];
		u8 encryptedVerifier_pos = generatedBuf[3];
		u8 encryptedVerifierHash_pos = generatedBuf[4];
		u8[] rc4key_pos = generatedBuf[5];
		// esalt
		u32 version = version_pos - -1024;
		if (version != 3 && version != 4) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		oldoffice34.setVersion(version);
		Object[] generatedEncryptedVerifier = oldoffice34.getEncryptedVerifier();
		generatedEncryptedVerifier[0] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 0);
		generatedEncryptedVerifier[1] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 8);
		generatedEncryptedVerifier[2] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 16);
		generatedEncryptedVerifier[3] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 24);
		Object[] generatedEncryptedVerifierHash = oldoffice34.getEncryptedVerifierHash();
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 0);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 8);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 16);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 24);
		generatedEncryptedVerifierHash[4] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 32);
		Object[] generatedRc4key = oldoffice34.getRc4key();
		generatedRc4key[1] = 0;
		generatedRc4key[0] = 0;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[0]) << 28;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[1]) << 24;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[2]) << 20;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[3]) << 16;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[4]) << 12;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[5]) << 8;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[6]) << 4;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[7]) << 0;
		generatedRc4key[1] |=  ModernizedCProgram.hex_convert(rc4key_pos[8]) << 28;
		generatedRc4key[1] |=  ModernizedCProgram.hex_convert(rc4key_pos[9]) << 24;
		generatedRc4key[0] = ModernizedCProgram.byte_swap_32(generatedRc4key[0]);
		generatedRc4key[1] = ModernizedCProgram.byte_swap_32(generatedRc4key[1])// salt;// salt
		salt.setSalt_len(16);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(osalt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(osalt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(osalt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(osalt_pos + 24);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3])// this is a workaround as office produces multiple documents with the same salt;// this is a workaround as office produces multiple documents with the same salt
		generatedSalt_buf[4] = generatedEncryptedVerifier[0];
		generatedSalt_buf[5] = generatedEncryptedVerifier[1];
		generatedSalt_buf[6] = generatedEncryptedVerifier[2];
		generatedSalt_buf[7] = generatedEncryptedVerifier[3];
		generatedSalt_buf[8] = generatedEncryptedVerifierHash[0];
		generatedSalt_buf[9] = generatedEncryptedVerifierHash[1];
		generatedSalt_buf[10] = generatedEncryptedVerifierHash[2];
		generatedSalt_buf[11] = generatedEncryptedVerifierHash[3];
		Object generatedSalt_len = salt.getSalt_len();
		generatedSalt_len += 32/**
		   * digest
		   */;
		digest[0] = generatedRc4key[0];
		digest[1] = generatedRc4key[1];
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 96;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		int hash_len = generatedLen[0];
		if (hash_len != 96) {
			return (parser_rc.PARSER_GLOBAL_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_200000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(2048);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 9;
		generatedLen_max[1] = 9;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		pkzip_t pkzip = (pkzip_t)esalt_buf;
		u32[] digest = (u32)digest_buf;
		byte[] input = new byte[line_len + 1];
		input[line_len] = (byte)'\0';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(input, line_buf, line_len);
		Byte saveptr = (null);
		byte[] p = /*Error: Function owner not recognized*/strtok_r(input, "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		if (/*Error: Function owner not recognized*/strncmp(p, ModernizedCProgram.SIGNATURE_PKZIP_V1, 7) != 0 && /*Error: Function owner not recognized*/strncmp(p, ModernizedCProgram.SIGNATURE_PKZIP_V2, 8) != 0) {
			return parser_rc.PARSER_SIGNATURE_UNMATCHED;
		} 
		pkzip.setVersion(1);
		if (/*Error: Function owner not recognized*/strlen(p) == 9) {
			pkzip.setVersion(2);
		} 
		byte[] sub = new byte[2];
		sub[0] = p[/*Error: Function owner not recognized*/strlen(p) - 1];
		sub[1] = (byte)'\0';
		pkzip.setHash_count(/*Error: Function owner not recognized*/atoi(sub));
		Object generatedHash_count = pkzip.getHash_count();
		// check here that the hash_count is valid for the attack typeif (generatedHash_count > 8) {
			return parser_rc.PARSER_HASH_VALUE;
		} 
		if (generatedHash_count < 3) {
			return parser_rc.PARSER_HASH_VALUE;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		pkzip.setChecksum_size(/*Error: Function owner not recognized*/atoi(p));
		Object generatedChecksum_size = pkzip.getChecksum_size();
		if (generatedChecksum_size != 1 && generatedChecksum_size != 2) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		Object generatedHashes = pkzip.getHashes();
		Object generatedVersion = pkzip.getVersion();
		Object[] generatedSalt_buf = salt.getSalt_buf();
		for (int i = 0;
		 i < generatedHash_count; i++) {
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setData_type_enum(/*Error: Function owner not recognized*/atoi(p));
			if (generatedHashes[i].getData_type_enum() > 3) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setMagic_type_enum(/*Error: Function owner not recognized*/atoi(p));
			if (generatedHashes[i].getData_type_enum() > 1) {
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setCompressed_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setUncompressed_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
				if (generatedHashes[i].getCompressed_length() > (320 * 1024)) {
					return parser_rc.PARSER_TOKEN_LENGTH;
				} 
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				u32 crc32 = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%x", ModernizedCProgram.crc32);
				generatedHashes[i].setCrc32(ModernizedCProgram.crc32);
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setOffset(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setAdditional_offset(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setCompression_type(/*Error: Function owner not recognized*/atoi(p));
			if (generatedHashes[i].getCompression_type() != 8 && generatedHashes[i].getCompression_type() != 0) {
				return parser_rc.PARSER_PKZIP_CT_UNMATCHED;
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setData_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			u16 checksum_from_crc = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%hx", checksum_from_crc);
			generatedHashes[i].setChecksum_from_crc(checksum_from_crc);
			if (generatedVersion == 2) {
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				u16 checksum_from_timestamp = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%hx", checksum_from_timestamp);
				generatedHashes[i].setChecksum_from_timestamp(checksum_from_timestamp);
			} else {
					generatedHashes[i].setChecksum_from_timestamp(generatedHashes[i].getChecksum_from_crc());
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			ModernizedCProgram.hex_to_binary(p, /*Error: Function owner not recognized*/strlen(p), (byte)(generatedHashes[i].getData()));
			generatedSalt_buf[i] = generatedHashes[i].getData()[0];
			if (i == 0) {
				digest[i] = generatedHashes[i].getChecksum_from_crc();
			} 
		}
		salt.setSalt_len(generatedHash_count << 2);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 40;
		generatedLen_max[1] = 40;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_RAR3;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 6;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'*';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 16;
		generatedLen_max[2] = 16;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] type_pos = generatedBuf[1];
		u8 salt_pos = generatedBuf[2];
		u8 crypted_pos = generatedBuf[3];
		if (type_pos[0] != (byte)'0') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED/**
			   * copy data
			   */);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(crypted_pos + 0);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(crypted_pos + 8);
		generatedSalt_buf[4] = ModernizedCProgram.hex_to_u32(crypted_pos + 16);
		generatedSalt_buf[5] = ModernizedCProgram.hex_to_u32(crypted_pos + 24);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3]);
		generatedSalt_buf[4] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[4]);
		generatedSalt_buf[5] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[5]);
		salt.setSalt_len(24);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_RAR3)// there's no hash for rar3. the data which is in crypted_pos is some encrypted data and;// there's no hash for rar3. the data which is in crypted_pos is some encrypted data and
		// if it matches the value \xc4\x3d\x7b\x00\x40\x07\x00 after decrypt we know that we successfully cracked it.// if it matches the value \xc4\x3d\x7b\x00\x40\x07\x00 after decrypt we know that we successfully cracked it.digest[0] = -1024;
		digest[1] = -1024;
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_AXCRYPT;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 9;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'*';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)'*';
		generatedLen_min[4] = 48;
		generatedLen_max[4] = 48;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 wrapping_rounds_pos = generatedBuf[2];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)wrapping_rounds_pos, (null), 10))// salt;// salt
		u8 wrapped_key_pos = generatedBuf[3];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(wrapped_key_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(wrapped_key_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(wrapped_key_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(wrapped_key_pos + 24);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3])// data;// data
		u8 data_pos = generatedBuf[4];
		generatedSalt_buf[4] = ModernizedCProgram.hex_to_u32(data_pos + 0);
		generatedSalt_buf[5] = ModernizedCProgram.hex_to_u32(data_pos + 8);
		generatedSalt_buf[6] = ModernizedCProgram.hex_to_u32(data_pos + 16);
		generatedSalt_buf[7] = ModernizedCProgram.hex_to_u32(data_pos + 24);
		generatedSalt_buf[8] = ModernizedCProgram.hex_to_u32(data_pos + 32);
		generatedSalt_buf[9] = ModernizedCProgram.hex_to_u32(data_pos + 40);
		generatedSalt_buf[4] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[4]);
		generatedSalt_buf[5] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[5]);
		generatedSalt_buf[6] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[6]);
		generatedSalt_buf[7] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[7]);
		generatedSalt_buf[8] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[8]);
		generatedSalt_buf[9] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[9]);
		salt.setSalt_len(40);
		digest[0] = generatedSalt_buf[0];
		digest[1] = generatedSalt_buf[1];
		digest[2] = generatedSalt_buf[2];
		digest[3] = generatedSalt_buf[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		diskcryptor_esalt_t diskcryptor_esalt = (diskcryptor_esalt_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_DISKCRYPTOR;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 13;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[2] = 4096;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// version
		Object[] generatedBuf = token.getBuf();
		u8[] version = generatedBuf[1];
		if (version[0] != (byte)'0' + ModernizedCProgram.DISKCRYPTOR_VERSION) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		// esalt
		u8[] data_buf = generatedBuf[2];
		Object[] generatedSalt_buf = diskcryptor_esalt.getSalt_buf();
		for (u32 i = 0;
		 i < 512; i++) {
			generatedSalt_buf[i] = ModernizedCProgram.hex_to_u32(data_buf[i * 8]);
		}
		// salt param// salt paramsalt.setSalt_len(64);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_DISKCRYPTOR - 1)// salt;// salt
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedSalt_buf[4];
		generatedSalt_buf[5] = generatedSalt_buf[5];
		generatedSalt_buf[6] = generatedSalt_buf[6];
		generatedSalt_buf[7] = generatedSalt_buf[7];
		generatedSalt_buf[8] = generatedSalt_buf[8];
		generatedSalt_buf[9] = generatedSalt_buf[9];
		generatedSalt_buf[10] = generatedSalt_buf[10];
		generatedSalt_buf[11] = generatedSalt_buf[11];
		generatedSalt_buf[12] = generatedSalt_buf[12];
		generatedSalt_buf[13] = generatedSalt_buf[13];
		generatedSalt_buf[14] = generatedSalt_buf[14];
		generatedSalt_buf[15] = generatedSalt_buf[15]// digest;// digest
		digest[0] = generatedSalt_buf[16];
		digest[1] = generatedSalt_buf[17];
		digest[2] = generatedSalt_buf[18];
		digest[3] = generatedSalt_buf[19];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pdf_t pdf = (pdf_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(16);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PDF;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 3;
		generatedLen_max[3] = 3;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 1;
		generatedLen_max[4] = 6;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[5] = 1;
		generatedLen_max[5] = 1;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[6] = 1;
		generatedLen_max[6] = 4;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[7] = 0;
		generatedLen_max[7] = 1024;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[8] = 1;
		generatedLen_max[8] = 4;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[9] = 0;
		generatedLen_max[9] = 1024;
		generatedSep[9] = (byte)'*';
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[10] = 1;
		generatedLen_max[10] = 4;
		generatedSep[10] = (byte)'*';
		generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[11] = 0;
		generatedLen_max[11] = 1024;
		generatedSep[11] = (byte)'*';
		generatedAttr[11] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[12] = 1;
		generatedLen_max[12] = 4;
		generatedSep[12] = (byte)'*';
		generatedAttr[12] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[13] = 0;
		generatedLen_max[13] = 1024;
		generatedSep[13] = (byte)'*';
		generatedAttr[13] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[14] = 1;
		generatedLen_max[14] = 4;
		generatedSep[14] = (byte)'*';
		generatedAttr[14] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[15] = 0;
		generatedLen_max[15] = 1024;
		generatedSep[15] = (byte)'*';
		generatedAttr[15] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 V_pos = generatedBuf[1];
		u8 R_pos = generatedBuf[2];
		u8 bits_pos = generatedBuf[3];
		u8 enc_md_pos = generatedBuf[5];
		u8 u_len_pos = generatedBuf[8];
		u8[] u_buf_pos = generatedBuf[9];
		// validate data
		int V = /*Error: Function owner not recognized*/strtol((byte)V_pos, (null), 10);
		int R = /*Error: Function owner not recognized*/strtol((byte)R_pos, (null), 10);
		int vr_ok = 0;
		if ((V == 5) && (R == 5)) {
			vr_ok = 1;
		} 
		if ((V == 5) && (R == 6)) {
			vr_ok = 1;
		} 
		if (vr_ok == 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int bits = /*Error: Function owner not recognized*/strtol((byte)bits_pos, (null), 10);
		if (bits != 256) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int enc_md = /*Error: Function owner not recognized*/strtol((byte)enc_md_pos, (null), 10);
		if ((enc_md != 0) && (enc_md != 1)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		u32 u_len = ModernizedCProgram.hc_strtoul((byte)u_len_pos, (null), 10);
		// copy data to esalt
		if (u_len < 40) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (ModernizedCProgram.is_valid_hex_string(u_buf_pos, 80) == 0) {
			return (parser_rc.PARSER_SALT_ENCODING);
		} 
		Object[] generatedU_buf = pdf.getU_buf();
		for (int i = 0;
		int j = 0;
		 i < 8 + 2; ) {
			generatedU_buf[i] = ModernizedCProgram.hex_to_u32((u8)u_buf_pos[j]);
		}
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedU_buf[8];
		generatedSalt_buf[1] = generatedU_buf[9];
		salt.setSalt_len(8);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_PDF17L8);
		digest[0] = ModernizedCProgram.byte_swap_32(generatedU_buf[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(generatedU_buf[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(generatedU_buf[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(generatedU_buf[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(generatedU_buf[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(generatedU_buf[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(generatedU_buf[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(generatedU_buf[7])// extra;// extra
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		generatedSalt_buf[2] = -1024;
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		pbkdf2_sha512_t pbkdf2_sha512 = (pbkdf2_sha512_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PBKDF2_SHA512;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 6;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)':';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)':';
		generatedLen_min[2] = ((0 * 8) / 6) + 0;
		generatedLen_max[2] = ((256 * 8) / 6) + 3;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedSep[3] = (byte)':';
		generatedLen_min[3] = 16;
		generatedLen_max[3] = 256;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		u8[] tmp_buf = new u8();
		int tmp_len;
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		salt.setSalt_iter(iter - 1)// salt;// salt
		u8 salt_pos = generatedBuf[2];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[2];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, salt_pos, salt_len, tmp_buf);
		if (tmp_len > 256) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf = pbkdf2_sha512.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, tmp_buf, tmp_len);
		salt.setSalt_len(tmp_len);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_buf[4] = generatedSalt_iter// hash;// hash
		u8 hash_pos = generatedBuf[3];
		int hash_len = generatedLen[3];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		if (tmp_len < 16) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 64);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		blake2_t blake2 = (blake2_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_BLAKE2B;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 8;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 128;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112)// Initialize BLAKE2 Params and State;// Initialize BLAKE2 Params and State
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(blake2, 0, /*Error: Unsupported expression*/);
		Object[] generatedH = blake2.getH();
		generatedH[0] = blake2b_constants.BLAKE2B_IV_00;
		generatedH[1] = blake2b_constants.BLAKE2B_IV_01;
		generatedH[2] = blake2b_constants.BLAKE2B_IV_02;
		generatedH[3] = blake2b_constants.BLAKE2B_IV_03;
		generatedH[4] = blake2b_constants.BLAKE2B_IV_04;
		generatedH[5] = blake2b_constants.BLAKE2B_IV_05;
		generatedH[6] = blake2b_constants.BLAKE2B_IV_06;
		generatedH[7] = blake2b_constants.BLAKE2B_IV_07;
		// blake2->h[0] ^= 0x0000000001010040; // digest_lenght = 0x40, depth = 0x01, fanout = 0x01// blake2->h[0] ^= 0x0000000001010040; // digest_lenght = 0x40, depth = 0x01, fanout = 0x01generatedH[0] ^=  -1024 << 0;
		generatedH[0] ^=  -1024 << 16;
		generatedH[0] ^=  -1024 << 24;
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		int hash_len = generatedLen[0];
		if (hash_len != 64) {
			return (parser_rc.PARSER_GLOBAL_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		krb5tgs_18_t krb5tgs = (krb5tgs_18_t)esalt_buf;
		token_t token = new token_t();
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_KRB5TGS;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 12;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE/**
		   * $krb5tgs$18$*user*realm*$checksum$edata2
		   * $krb5tgs$18$*user*realm*spn*$checksum$edata2
		   */;
		// assume no signature foundif (line_len < 12) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Byte spn_info_start = /*Error: Function owner not recognized*/strchr((byte)line_buf + 12 + 1, (byte)'*');
		int is_spn_provided = 0;
		Object[] generatedSep = token.getSep();
		Object[] generatedLen_min = token.getLen_min();
		Object[] generatedLen_max = token.getLen_max();
		// assume $krb5tgs$17$user$realm$checksum$edata2if (spn_info_start == (null)) {
			token.setToken_cnt(5);
			generatedSep[1] = (byte)'$';
			generatedLen_min[1] = 1;
			generatedLen_max[1] = 512;
			generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
			generatedSep[2] = (byte)'$';
			generatedLen_min[2] = 1;
			generatedLen_max[2] = 512;
			generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
			generatedSep[3] = (byte)'$';
			generatedLen_min[3] = 24;
			generatedLen_max[3] = 24;
			generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[4] = (byte)'$';
			generatedLen_min[4] = 64;
			generatedLen_max[4] = 40960;
			generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		} else {
				Byte spn_info_stop = /*Error: Function owner not recognized*/strchr((byte)spn_info_start + 1, (byte)'*');
				if (spn_info_stop == (null)) {
					return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
				} 
				spn_info_stop++;
				spn_info_stop++;
				int spn_info_len = spn_info_stop - spn_info_start;
				token.setToken_cnt(6);
				generatedSep[1] = (byte)'$';
				generatedLen_min[1] = 1;
				generatedLen_max[1] = 512;
				generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
				generatedSep[2] = (byte)'$';
				generatedLen_min[2] = 1;
				generatedLen_max[2] = 512;
				generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
				generatedLen[3] = spn_info_len;
				generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
				generatedSep[4] = (byte)'$';
				generatedLen_min[4] = 24;
				generatedLen_max[4] = 24;
				generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
				generatedSep[5] = (byte)'$';
				generatedLen_min[5] = 64;
				generatedLen_max[5] = 40960;
				generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
				is_spn_provided = 1;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		u8 user_pos = new u8();
		u8 domain_pos = new u8();
		u8 checksum_pos = new u8();
		u8[] data_pos = new u8();
		int user_len;
		int domain_len;
		int data_len;
		int account_info_len;
		Object[] generatedBuf = token.getBuf();
		user_pos = generatedBuf[1];
		user_len = generatedLen[1];
		Object[] generatedUser = krb5tgs.getUser();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedUser, user_pos, user_len);
		domain_pos = generatedBuf[2];
		domain_len = generatedLen[2];
		Object[] generatedDomain = krb5tgs.getDomain();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedDomain, domain_pos, domain_len);
		checksum_pos = generatedBuf[3 + is_spn_provided];
		data_pos = generatedBuf[4 + is_spn_provided];
		data_len = generatedLen[4 + is_spn_provided];
		account_info_len = generatedLen[2] + generatedLen[1];
		Object[] generatedAccount_info = krb5tgs.getAccount_info();
		u8 account_info_ptr = (u8)generatedAccount_info;
		// domain must be uppercaseu8[] domain = new u8();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(domain, domain_pos, domain_len);
		ModernizedCProgram.uppercase(domain, domain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(account_info_ptr, domain, domain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(account_info_ptr + domain_len, user_pos, user_len);
		krb5tgs.setAccount_info_len(account_info_len);
		Object[] generatedChecksum = krb5tgs.getChecksum();
		// hmac-sha1 is reduced to 12 bytes// hmac-sha1 is reduced to 12 bytesgeneratedChecksum[0] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 0));
		generatedChecksum[1] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 8));
		generatedChecksum[2] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 16));
		Object[] generatedEdata2 = krb5tgs.getEdata2();
		u8 edata_ptr = (u8)generatedEdata2;
		for (int i = 0;
		 i < data_len; i += 2) {
			u8 p0 = data_pos[i + 0];
			u8 p1 = data_pos[i + 1];
			edata_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		krb5tgs.setEdata2_len(data_len / 2);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedChecksum[0];
		generatedSalt_buf[1] = generatedChecksum[1];
		generatedSalt_buf[2] = generatedChecksum[2];
		salt.setSalt_iter(4096 - 1);
		digest[0] = generatedChecksum[0];
		digest[1] = generatedChecksum[1];
		digest[2] = generatedChecksum[2];
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		pkzip_t pkzip = (pkzip_t)esalt_buf;
		u32[] digest = (u32)digest_buf;
		byte[] input = new byte[line_len + 1];
		input[line_len] = (byte)'\0';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(input, line_buf, line_len);
		Byte saveptr = (null);
		byte[] p = /*Error: Function owner not recognized*/strtok_r(input, "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		if (/*Error: Function owner not recognized*/strncmp(p, ModernizedCProgram.SIGNATURE_PKZIP_V1, 7) != 0 && /*Error: Function owner not recognized*/strncmp(p, ModernizedCProgram.SIGNATURE_PKZIP_V2, 8) != 0) {
			return parser_rc.PARSER_SIGNATURE_UNMATCHED;
		} 
		pkzip.setVersion(1);
		if (/*Error: Function owner not recognized*/strlen(p) == 9) {
			pkzip.setVersion(2);
		} 
		byte[] sub = new byte[2];
		sub[0] = p[/*Error: Function owner not recognized*/strlen(p) - 1];
		sub[1] = (byte)'\0';
		pkzip.setHash_count(/*Error: Function owner not recognized*/atoi(sub));
		Object generatedHash_count = pkzip.getHash_count();
		// check here that the hash_count is valid for the attack typeif (generatedHash_count > 8) {
			return parser_rc.PARSER_HASH_VALUE;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		pkzip.setChecksum_size(/*Error: Function owner not recognized*/atoi(p));
		Object generatedChecksum_size = pkzip.getChecksum_size();
		if (generatedChecksum_size != 1 && generatedChecksum_size != 2) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		Object generatedHashes = pkzip.getHashes();
		Object generatedVersion = pkzip.getVersion();
		Object[] generatedSalt_buf = salt.getSalt_buf();
		for (int i = 0;
		 i < generatedHash_count; i++) {
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setData_type_enum(/*Error: Function owner not recognized*/atoi(p));
			if (generatedHashes[i].getData_type_enum() > 3) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setMagic_type_enum(/*Error: Function owner not recognized*/atoi(p));
			if (generatedHashes[i].getData_type_enum() > 1) {
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setCompressed_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setUncompressed_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
				if (generatedHashes[i].getCompressed_length() > (320 * 1024)) {
					return parser_rc.PARSER_TOKEN_LENGTH;
				} 
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				u32 crc32 = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%x", ModernizedCProgram.crc32);
				generatedHashes[i].setCrc32(ModernizedCProgram.crc32);
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setOffset(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setAdditional_offset(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setCompression_type(/*Error: Function owner not recognized*/atoi(p));
			if (generatedHashes[i].getCompression_type() != 8 && generatedHashes[i].getCompression_type() != 0) {
				return parser_rc.PARSER_HASH_VALUE;
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setData_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			u16 checksum_from_crc = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%hx", checksum_from_crc);
			generatedHashes[i].setChecksum_from_crc(checksum_from_crc);
			if (generatedVersion == 2) {
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				u16 checksum_from_timestamp = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%hx", checksum_from_timestamp);
				generatedHashes[i].setChecksum_from_timestamp(checksum_from_timestamp);
			} else {
					generatedHashes[i].setChecksum_from_timestamp(generatedHashes[i].getChecksum_from_crc());
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			ModernizedCProgram.hex_to_binary(p, /*Error: Function owner not recognized*/strlen(p), (byte)(generatedHashes[i].getData()));
			generatedSalt_buf[i] = generatedHashes[i].getData()[0];
			if (i == 0) {
				digest[i] = generatedHashes[i].getChecksum_from_crc();
			} 
		}
		salt.setSalt_len(generatedHash_count << 2);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 16;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 16;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[1] = (byte)':';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)':';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		Object[] generatedLen = token.getLen();
		generatedLen[3] = 32;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_c = generatedBuf[1][0];
		u8 iter_d = generatedBuf[2][0];
		// atm only defaults, let's see if there's more requestif (iter_c != (byte)'2') {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		if (iter_d != (byte)'4') {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		// hash
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = 0;
		digest[3] = 0// salt;// salt
		u8 salt_pos = generatedBuf[3];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt_pos + 24);
		salt.setSalt_len(16);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 2;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		generatedLen[1] = 11;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] salt_pos = generatedBuf[0];
		u8[] hash_pos = generatedBuf[1];
		int hash_len = generatedLen[1];
		u8 c10 = ModernizedCProgram.itoa64_to_int(hash_pos[10]);
		if (c10 & 3) {
			return (parser_rc.PARSER_HASH_VALUE);
		} 
		Object[] generatedSalt_sign = salt.getSalt_sign();
		// for ascii_to_ebcdic_digest// for ascii_to_ebcdic_digestgeneratedSalt_sign[0] = salt_pos[0];
		generatedSalt_sign[1] = salt_pos[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.itoa64_to_int(salt_pos[0]) | ModernizedCProgram.itoa64_to_int(salt_pos[1]) << 6;
		// doesn't eliminate salts that are identical but have different salt signs// doesn't eliminate salts that are identical but have different salt signsgeneratedSalt_buf[0] |=  salt_pos[0] << 16 | salt_pos[1] << 24;
		// actually it is only 2 (but we need to add the original salt_sign to it)// actually it is only 2 (but we need to add the original salt_sign to it)salt.setSalt_len(4);
		u32[] tmp = new u32[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.itoa64_to_int, hash_pos, hash_len, (u8)tmp);
		digest[0] = tmp[0];
		digest[1] = tmp[1];
		digest[2] = 0;
		digest[3] = 0;
		{ 
			{ 
				u32x t = new u32x();
				t = digest[1] >> 4;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 4;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 16;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 16;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 2;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 2;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 8;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 8;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 1;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 1;
				digest[1] = digest[1] ^ t;
			}
			;
		}
		;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		diskcryptor_esalt_t diskcryptor_esalt = (diskcryptor_esalt_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_DISKCRYPTOR;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 13;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[2] = 4096;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// version
		Object[] generatedBuf = token.getBuf();
		u8[] version = generatedBuf[1];
		if (version[0] != (byte)'0' + ModernizedCProgram.DISKCRYPTOR_VERSION) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		// esalt
		u8[] data_buf = generatedBuf[2];
		Object[] generatedSalt_buf = diskcryptor_esalt.getSalt_buf();
		for (u32 i = 0;
		 i < 512; i++) {
			generatedSalt_buf[i] = ModernizedCProgram.hex_to_u32(data_buf[i * 8]);
		}
		// salt param// salt paramsalt.setSalt_len(64);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_DISKCRYPTOR - 1)// salt;// salt
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedSalt_buf[4];
		generatedSalt_buf[5] = generatedSalt_buf[5];
		generatedSalt_buf[6] = generatedSalt_buf[6];
		generatedSalt_buf[7] = generatedSalt_buf[7];
		generatedSalt_buf[8] = generatedSalt_buf[8];
		generatedSalt_buf[9] = generatedSalt_buf[9];
		generatedSalt_buf[10] = generatedSalt_buf[10];
		generatedSalt_buf[11] = generatedSalt_buf[11];
		generatedSalt_buf[12] = generatedSalt_buf[12];
		generatedSalt_buf[13] = generatedSalt_buf[13];
		generatedSalt_buf[14] = generatedSalt_buf[14];
		generatedSalt_buf[15] = generatedSalt_buf[15]// digest;// digest
		digest[0] = generatedSalt_buf[16];
		digest[1] = generatedSalt_buf[17];
		digest[2] = generatedSalt_buf[18];
		digest[3] = generatedSalt_buf[19];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		return (parser_rc.PARSER_OK);
		u32 digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(2);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PHPASS1;
		generatedSignatures_buf[1] = ModernizedCProgram.SIGNATURE_PHPASS2;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 3;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		generatedLen[2] = 8;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		generatedLen[3] = 22;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedSalt_sign = salt.getSalt_sign();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((u8)generatedSalt_sign, line_buf, 4);
		Object[] generatedBuf = token.getBuf();
		u8[] iter_pos = generatedBuf[1];
		u32 salt_iter = -1024 << ModernizedCProgram.itoa64_to_int(iter_pos[0]);
		if (salt_iter > -1024) {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		salt.setSalt_iter(salt_iter);
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((u8)generatedSalt_buf, salt_pos, salt_len);
		salt.setSalt_len(salt_len);
		u8 hash_pos = generatedBuf[3];
		ModernizedCProgram.phpass_decode((u8)digest, hash_pos);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 32;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256 - 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH/*
			   * add static "salt" part
			   */);
		} 
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			if (generatedSalt_len > 46) {
				return (parser_rc.PARSER_SALT_LENGTH);
			} 
		} 
		// max. salt length: 55 (max for MD5) - 8 ("\nskyper\n") - 1 (0x80) = 46
		u8 salt_buf_ptr = (u8)generatedSalt_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr + generatedSalt_len, ModernizedCProgram.skyper, /*Error: Function owner not recognized*/strlen(ModernizedCProgram.skyper));
		generatedSalt_len += /*Error: Function owner not recognized*/strlen(ModernizedCProgram.skyper);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MSSQL;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[2] = 40;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[2];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SHA256B64S;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = (((32 + 0) * 8) / 6) + 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = (((32 + 256) * 8) / 6) + 3;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hashsalt_pos = generatedBuf[1];
		int hashsalt_len = generatedLen[1];
		u8[] tmp_buf = new u8[]{0};
		int tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hashsalt_pos, hashsalt_len, tmp_buf);
		if (tmp_len < 32) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		u8 hash_pos = tmp_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, hash_pos, 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		// saltu8 salt_pos = tmp_buf + 32;
		int salt_len = tmp_len - 32;
		salt.setSalt_len(salt_len);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, salt_pos, salt_len);
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_ADD80) {
			u8 ptr = (u8)generatedSalt_buf;
			ptr[salt_len] = -1024;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[1] = (byte)':';
		generatedLen_min[1] = 32;
		generatedLen_max[1] = 32;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[2] = 2;
		generatedLen_max[2] = 2;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt_pos + 24);
		salt.setSalt_len(16 + 1);
		generatedSalt_buf[4] = ModernizedCProgram.hex_to_u8(generatedBuf[2]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha1_t pbkdf2_sha1 = (pbkdf2_sha1_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PASSLIB_PBKDF2_SHA1;
		Object[] generatedSep = token.getSep();
		// the hash starts with a $// the hash starts with a $generatedSep[0] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 0;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[1] = (byte)'$';
		generatedLen_min[1] = 6;
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		// iterations in decimal representation// iterations in decimal representationgeneratedSep[2] = (byte)'$';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// salt in alternate base64 repretentation// salt in alternate base64 repretentationgeneratedSep[3] = (byte)'$';
		generatedLen_min[3] = 0;
		generatedLen_max[3] = 256;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		// payload in alternate base64 representanion// payload in alternate base64 representaniongeneratedSep[4] = (byte)'$';
		generatedLen_min[4] = ModernizedCProgram.HASH_LEN_B64;
		generatedLen_max[4] = ModernizedCProgram.HASH_LEN_B64;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		// iteru8 iter_pos = generatedBuf[2];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10) - 1);
		// base64 decode saltu8 salt_pos = generatedBuf[3];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[3];
		u8[] tmp_buf = new u8[]{0};
		size_t salt_len_decoded = ModernizedCProgram.base64_decode(ModernizedCProgram.ab64_to_int, (u8)salt_pos, salt_len, tmp_buf);
		Object[] generatedSalt_buf = pbkdf2_sha1.getSalt_buf();
		u8 salt_buf_ptr = (u8)generatedSalt_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr, tmp_buf, salt_len_decoded);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, salt_buf_ptr, salt_len_decoded);
		salt.setSalt_len(salt_len_decoded);
		// base64 decode hashu8 hash_pos = generatedBuf[4];
		int hash_len = generatedLen[4];
		ModernizedCProgram.base64_decode(ModernizedCProgram.ab64_to_int, (u8)hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, ModernizedCProgram.HASH_LEN_RAW);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SHA512B64S;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = (((64 + 0) * 8) / 6) + 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = (((64 + 256) * 8) / 6) + 3;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hashsalt_pos = generatedBuf[1];
		int hashsalt_len = generatedLen[1];
		u8[] tmp_buf = new u8[]{0};
		int tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hashsalt_pos, hashsalt_len, tmp_buf);
		if (tmp_len < 64) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		u8 hash_pos = tmp_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, hash_pos, 64);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA512M_A;
			digest[1] -= sha2_64_constants.SHA512M_B;
			digest[2] -= sha2_64_constants.SHA512M_C;
			digest[3] -= sha2_64_constants.SHA512M_D;
			digest[4] -= sha2_64_constants.SHA512M_E;
			digest[5] -= sha2_64_constants.SHA512M_F;
			digest[6] -= sha2_64_constants.SHA512M_G;
			digest[7] -= sha2_64_constants.SHA512M_H;
		} 
		// saltu8 salt_pos = tmp_buf + 64;
		int salt_len = tmp_len - 64;
		salt.setSalt_len(salt_len);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, salt_pos, salt_len);
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_ADD80) {
			u8 ptr = (u8)generatedSalt_buf;
			ptr[salt_len] = -1024;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_1K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		jwt_t jwt = (jwt_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'.';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 2047;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64C;
		generatedSep[1] = (byte)'.';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 2047;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64C;
		generatedSep[2] = (byte)'.';
		generatedLen_min[2] = 43;
		generatedLen_max[2] = 86;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64C;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// header
		Object[] generatedLen = token.getLen();
		int header_len = generatedLen[0];
		// payload
		int payload_len = generatedLen[1];
		// signature
		Object[] generatedBuf = token.getBuf();
		u8 signature_pos = generatedBuf[2];
		int signature_len = generatedLen[2];
		jwt.setSignature_len(signature_len)// esalt;// esalt
		int esalt_len = header_len + 1 + payload_len;
		if (esalt_len > 4096) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf = jwt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, esalt_len);
		jwt.setSalt_len(esalt_len)// salt//;// salt//
		// Create a hash of the esalt because esalt buffer can change somewhere behind salt->salt_buf size// Not a regular MD5 but good enoughu32[] hash = new u32();
		hash[0] = 0;
		hash[1] = 1;
		hash[2] = 2;
		hash[3] = 3;
		u32[] block = new u32();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(block, 0, /*Error: sizeof expression not supported yet*/);
		for (int i = 0;
		 i < 1024; i += 16) {
			for (int j = 0;
			 j < 16; j++) {
				block[j] = generatedSalt_buf[i + j];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(block + 0, block + 4, block + 8, block + 12, hash);
			}
		}
		generatedSalt_buf[0] = hash[0];
		generatedSalt_buf[1] = hash[1];
		generatedSalt_buf[2] = hash[2];
		generatedSalt_buf[3] = hash[3];
		salt.setSalt_len(16)// hash;// hash
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.base64url_to_int, signature_pos, signature_len, tmp_buf);
		if (signature_len == 43) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest_buf, tmp_buf, 32);
			u32 digest = (u32)digest_buf;
			digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
			digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
			digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
			digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
			digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
			digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
			digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
			digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		}  else if (signature_len == 64) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest_buf, tmp_buf, 48);
			u64 digest = (u64)digest_buf;
			digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
			digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
			digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
			digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
			digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
			digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		}  else if (signature_len == 86) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest_buf, tmp_buf, 64);
			u64 digest = (u64)digest_buf;
			digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
			digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
			digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
			digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
			digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
			digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
			digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
			digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		oldoffice34_t oldoffice34 = (oldoffice34_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(2);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_OLDOFFICE3;
		generatedSignatures_buf[1] = ModernizedCProgram.SIGNATURE_OLDOFFICE4;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[4] = 40;
		generatedLen_max[4] = 40;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 osalt_pos = generatedBuf[2];
		u8 encryptedVerifier_pos = generatedBuf[3];
		u8 encryptedVerifierHash_pos = generatedBuf[4];
		// esalt
		u32 version = version_pos - -1024;
		if (version != 3 && version != 4) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		oldoffice34.setVersion(version);
		Object[] generatedEncryptedVerifier = oldoffice34.getEncryptedVerifier();
		generatedEncryptedVerifier[0] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 0);
		generatedEncryptedVerifier[1] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 8);
		generatedEncryptedVerifier[2] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 16);
		generatedEncryptedVerifier[3] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 24);
		Object[] generatedEncryptedVerifierHash = oldoffice34.getEncryptedVerifierHash();
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 0);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 8);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 16);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 24);
		generatedEncryptedVerifierHash[4] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 32)// salt;// salt
		salt.setSalt_len(16);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(osalt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(osalt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(osalt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(osalt_pos + 24);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3])// this is a workaround as office produces multiple documents with the same salt;// this is a workaround as office produces multiple documents with the same salt
		generatedSalt_buf[4] = generatedEncryptedVerifier[0];
		generatedSalt_buf[5] = generatedEncryptedVerifier[1];
		generatedSalt_buf[6] = generatedEncryptedVerifier[2];
		generatedSalt_buf[7] = generatedEncryptedVerifier[3];
		generatedSalt_buf[8] = generatedEncryptedVerifierHash[0];
		generatedSalt_buf[9] = generatedEncryptedVerifierHash[1];
		generatedSalt_buf[10] = generatedEncryptedVerifierHash[2];
		generatedSalt_buf[11] = generatedEncryptedVerifierHash[3];
		Object generatedSalt_len = salt.getSalt_len();
		generatedSalt_len += 32/**
		   * digest
		   */;
		digest[0] = generatedEncryptedVerifierHash[0];
		digest[1] = generatedEncryptedVerifierHash[1];
		digest[2] = generatedEncryptedVerifierHash[2];
		digest[3] = generatedEncryptedVerifierHash[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		netntlm_t netntlm = (netntlm_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		Object[] generatedLen_min = token.getLen_min();
		// username// usernamegeneratedLen_min[0] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 60;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// unused// unusedgeneratedLen_min[1] = 0;
		generatedLen_max[1] = 0;
		generatedSep[1] = (byte)':';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// domain// domaingeneratedLen_min[2] = 0;
		generatedLen_max[2] = 45;
		generatedSep[2] = (byte)':';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// lm response// lm responsegeneratedLen_min[3] = 16;
		generatedLen_max[3] = 16;
		generatedSep[3] = (byte)':';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		// ntlm response// ntlm responsegeneratedLen_min[4] = 32;
		generatedLen_max[4] = 32;
		generatedSep[4] = (byte)':';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		// challenge// challengegeneratedLen_min[5] = 2;
		generatedLen_max[5] = 1024;
		generatedSep[5] = (byte)':';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] user_pos = generatedBuf[0];
		u8[] domain_pos = generatedBuf[2];
		u8[] srvchall_pos = generatedBuf[3];
		u8 hash_pos = generatedBuf[4];
		u8[] clichall_pos = generatedBuf[5];
		Object[] generatedLen = token.getLen();
		int user_len = generatedLen[0];
		int domain_len = generatedLen[2];
		int srvchall_len = generatedLen[3];
		int clichall_len = generatedLen[5/**
		   * store some data for later use
		   */];
		netntlm.setUser_len(user_len * 2);
		netntlm.setDomain_len(domain_len * 2);
		netntlm.setSrvchall_len(srvchall_len / 2);
		netntlm.setClichall_len(clichall_len / 2);
		Object[] generatedUserdomain_buf = netntlm.getUserdomain_buf();
		u8 userdomain_ptr = (u8)generatedUserdomain_buf;
		Object[] generatedChall_buf = netntlm.getChall_buf();
		u8 chall_ptr = (u8)generatedChall_buf;
		for (int i = 0;
		 i < user_len; i++) {
			userdomain_ptr++ = /*Error: Function owner not recognized*/toupper(user_pos[i]);
			userdomain_ptr++ = 0;
		}
		for (int i = 0;
		 i < domain_len; i++) {
			userdomain_ptr++ = domain_pos[i];
			userdomain_ptr++ = 0;
		}
		userdomain_ptr++ = -1024/**
		   * handle server challenge encoding
		   */;
		for (int i = 0;
		 i < srvchall_len; i += 2) {
			u8 p0 = srvchall_pos[i + 0];
			u8 p1 = srvchall_pos[i + 1];
			chall_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4/**
			   * handle client challenge encoding
			   */;
		}
		for (int i = 0;
		 i < clichall_len; i += 2) {
			u8 p0 = clichall_pos[i + 0];
			u8 p1 = clichall_pos[i + 1];
			chall_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		chall_ptr++ = -1024/**
		   * handle hash itself
		   */;
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24/**
		   * reuse challange data as salt_buf, its the buffer that is most likely unique
		   */);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = 0;
		generatedSalt_buf[1] = 0;
		generatedSalt_buf[2] = 0;
		generatedSalt_buf[3] = 0;
		generatedSalt_buf[4] = 0;
		generatedSalt_buf[5] = 0;
		generatedSalt_buf[6] = 0;
		generatedSalt_buf[7] = 0;
		u32 uptr = new u32();
		uptr = (u32)generatedUserdomain_buf;
		for (u32 i = 0;
		 i < 64; ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(uptr + 0, uptr + 4, uptr + 8, uptr + 12, generatedSalt_buf);
		}
		uptr = (u32)generatedChall_buf;
		for (u32 i = 0;
		 i < 256; ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_transform(uptr + 0, uptr + 4, uptr + 8, uptr + 12, generatedSalt_buf);
		}
		salt.setSalt_len(16);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SAPH_SHA1;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'}';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 49;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		if (iter < 1) {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		// first iteration is special// first iteration is specialiter--;
		salt.setSalt_iter(iter)// decode;// decode
		u8 base64_pos = generatedBuf[2];
		int base64_len = generatedLen[2];
		u8[] tmp_buf = new u8[]{0};
		u32 decoded_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, (u8)base64_pos, base64_len, tmp_buf);
		if (decoded_len < 24) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// copy the salt
		u32 salt_len = decoded_len - 20;
		if (salt_len > 16) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, tmp_buf + 20, salt_len);
		salt.setSalt_len(salt_len)// set digest;// set digest
		u32[] digest_ptr = (u32)tmp_buf;
		digest[0] = ModernizedCProgram.byte_swap_32(digest_ptr[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest_ptr[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest_ptr[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest_ptr[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest_ptr[4]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 1;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		generatedLen[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		generatedLen[2] = 48;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedLen[3] = 1;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		if (generatedBuf[0][0] != (byte)'(') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		if (generatedBuf[1][0] != (byte)'H') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		if (generatedBuf[3][0] != (byte)')') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		// decode
		u8 hash_pos = generatedBuf[2];
		int hash_len = generatedLen[2];
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.lotus64_to_int, hash_pos, hash_len, tmp_buf);
		// dont ask!// dont ask!tmp_buf[3] += -4// salt;// salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, tmp_buf, 16);
		// Attention: in theory we have 2 salt_len, one for the -m 8700 part (len: 8), 2nd for the 9100 part (len: 16)// Attention: in theory we have 2 salt_len, one for the -m 8700 part (len: 8), 2nd for the 9100 part (len: 16)salt.setSalt_len(16)// iteration;// iteration
		byte[] tmp_iter_buf = new byte[]{0};
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_iter_buf, tmp_buf + 16, 10);
		tmp_iter_buf[10] = 0;
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)tmp_iter_buf, (null), 10));
		Object generatedSalt_iter = salt.getSalt_iter();
		// well, the limit hopefully is much higherif (generatedSalt_iter < 1) {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		// first round in init// first round in initgeneratedSalt_iter--// 2 additional bytes for display only;// 2 additional bytes for display only
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		generatedSalt_buf_pc[0] = tmp_buf[26];
		generatedSalt_buf_pc[1] = tmp_buf[27]// digest;// digest
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf + 28, 8);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_1K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		odf11_t odf11 = (odf11_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(12);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ODF;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 5;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 5;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 1;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 4;
		generatedLen_max[3] = 6;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 2;
		generatedLen_max[4] = 2;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[5] = 40;
		generatedLen_max[5] = 40;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[6] = 1;
		generatedLen_max[6] = 1;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[7] = 16;
		generatedLen_max[7] = 16;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[8] = 2;
		generatedLen_max[8] = 2;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[9] = 32;
		generatedLen_max[9] = 32;
		generatedSep[9] = (byte)'*';
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[10] = 1;
		generatedLen_max[10] = 1;
		generatedSep[10] = (byte)'*';
		generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		Object[] generatedLen = token.getLen();
		generatedLen[11] = 2048;
		generatedAttr[11] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] checksum = generatedBuf[5];
		u8[] iv = generatedBuf[7];
		u8[] salt_buf = generatedBuf[9];
		u8[] encrypted_data = generatedBuf[11];
		u32 cipher_type = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[1], (null), 10);
		u32 checksum_type = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[2], (null), 10);
		u32 iterations = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[3], (null), 10);
		u32 key_size = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[4], (null), 10);
		u32 iv_len = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[6], (null), 10);
		u32 salt_len = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[8], (null), 10);
		u32 unused = /*Error: Function owner not recognized*/strtol((byte)generatedBuf[10], (null), 10);
		if (cipher_type != 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (checksum_type != 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (key_size != 16) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (iv_len != 8) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (salt_len != 16) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (unused != 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		// esalt
		odf11.setIterations(iterations);
		Object[] generatedChecksum = odf11.getChecksum();
		generatedChecksum[0] = ModernizedCProgram.hex_to_u32(checksum[0]);
		generatedChecksum[1] = ModernizedCProgram.hex_to_u32(checksum[8]);
		generatedChecksum[2] = ModernizedCProgram.hex_to_u32(checksum[16]);
		generatedChecksum[3] = ModernizedCProgram.hex_to_u32(checksum[24]);
		generatedChecksum[4] = ModernizedCProgram.hex_to_u32(checksum[32]);
		Object[] generatedIv = odf11.getIv();
		generatedIv[0] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(iv[0]));
		generatedIv[1] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(iv[8]));
		Object[] generatedEncrypted_data = odf11.getEncrypted_data();
		for (int i = 0;
		int j = 0;
		 i < 256; ) {
			generatedEncrypted_data[i] = ModernizedCProgram.hex_to_u32(encrypted_data[j]);
			generatedEncrypted_data[i] = ModernizedCProgram.byte_swap_32(generatedEncrypted_data[i]);
		}
		// salt// saltsalt.setSalt_len(salt_len);
		salt.setSalt_iter(iterations - 1);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_buf[8]);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_buf[16]);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt_buf[24]);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3/**
		   * digest
		   */]);
		digest[0] = ModernizedCProgram.byte_swap_32(generatedChecksum[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(generatedChecksum[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(generatedChecksum[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(generatedChecksum[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(generatedChecksum[4]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SHA256AIX;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 2;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 2;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[2] = 16;
		generatedLen_max[2] = 48;
		generatedSep[2] = (byte)'$';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen[3] = 43;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] iter_pos = generatedBuf[1];
		byte[] salt_iter = new byte[]{iter_pos[0], iter_pos[1], 0};
		Object[] generatedSalt_sign = salt.getSalt_sign();
		generatedSalt_sign[0] = ModernizedCProgram.hc_strtoul((byte)salt_iter, (null), 10);
		salt.setSalt_iter((-1024 << ModernizedCProgram.hc_strtoul((byte)salt_iter, (null), 10)) - 1);
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 hash_pos = generatedBuf[3];
		ModernizedCProgram.sha256aix_decode((u8)digest, hash_pos);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_1K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 16;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 16;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 4;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.itoa64_to_int(hash_pos[0]) << 0 | ModernizedCProgram.itoa64_to_int(hash_pos[1]) << 6 | ModernizedCProgram.itoa64_to_int(hash_pos[2]) << 12 | ModernizedCProgram.itoa64_to_int(hash_pos[3]) << 18;
		digest[1] = ModernizedCProgram.itoa64_to_int(hash_pos[4]) << 0 | ModernizedCProgram.itoa64_to_int(hash_pos[5]) << 6 | ModernizedCProgram.itoa64_to_int(hash_pos[6]) << 12 | ModernizedCProgram.itoa64_to_int(hash_pos[7]) << 18;
		digest[2] = ModernizedCProgram.itoa64_to_int(hash_pos[8]) << 0 | ModernizedCProgram.itoa64_to_int(hash_pos[9]) << 6 | ModernizedCProgram.itoa64_to_int(hash_pos[10]) << 12 | ModernizedCProgram.itoa64_to_int(hash_pos[11]) << 18;
		digest[3] = ModernizedCProgram.itoa64_to_int(hash_pos[12]) << 0 | ModernizedCProgram.itoa64_to_int(hash_pos[13]) << 6 | ModernizedCProgram.itoa64_to_int(hash_pos[14]) << 12 | ModernizedCProgram.itoa64_to_int(hash_pos[15]) << 18;
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		// store for encoder// store for encoderdigest[4] = digest[0];
		digest[5] = digest[1];
		digest[6] = digest[2];
		digest[7] = digest[3];
		digest[0] &=  -1024;
		digest[1] &=  -1024;
		digest[2] &=  -1024;
		digest[3] &=  -1024;
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA512M_A;
			digest[1] -= sha2_64_constants.SHA512M_B;
			digest[2] -= sha2_64_constants.SHA512M_C;
			digest[3] -= sha2_64_constants.SHA512M_D;
			digest[4] -= sha2_64_constants.SHA512M_E;
			digest[5] -= sha2_64_constants.SHA512M_F;
			digest[6] -= sha2_64_constants.SHA512M_G;
			digest[7] -= sha2_64_constants.SHA512M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32 digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MD5AIX;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 8;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_OPTIONAL_ROUNDS;
		generatedLen[2] = 22;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_MD5CRYPT);
		int generatedOpt_len = token.getOpt_len();
		Object generatedOpt_buf = token.getOpt_buf();
		if (generatedOpt_len != -1) {
			salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)generatedOpt_buf + 7, (null), 10));
		} 
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 hash_pos = generatedBuf[2];
		ModernizedCProgram.md5crypt_decode((u8)digest, hash_pos);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[1] = 32;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[8] = ModernizedCProgram.hex_to_u32(hash_pos + 64);
		digest[9] = ModernizedCProgram.hex_to_u32(hash_pos + 72);
		digest[10] = ModernizedCProgram.hex_to_u32(hash_pos + 80);
		digest[11] = ModernizedCProgram.hex_to_u32(hash_pos + 88);
		digest[12] = ModernizedCProgram.hex_to_u32(hash_pos + 96);
		digest[13] = ModernizedCProgram.hex_to_u32(hash_pos + 104);
		digest[14] = ModernizedCProgram.hex_to_u32(hash_pos + 112);
		digest[15] = ModernizedCProgram.hex_to_u32(hash_pos + 120);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		digest[8] = ModernizedCProgram.byte_swap_32(digest[8]);
		digest[9] = ModernizedCProgram.byte_swap_32(digest[9]);
		digest[10] = ModernizedCProgram.byte_swap_32(digest[10]);
		digest[11] = ModernizedCProgram.byte_swap_32(digest[11]);
		digest[12] = ModernizedCProgram.byte_swap_32(digest[12]);
		digest[13] = ModernizedCProgram.byte_swap_32(digest[13]);
		digest[14] = ModernizedCProgram.byte_swap_32(digest[14]);
		digest[15] = ModernizedCProgram.byte_swap_32(digest[15]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt_pos + 24);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3]);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_ORACLET - 1);
		salt.setSalt_len(16);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 56;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 56;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA224M_A;
			digest[1] -= sha2_32_constants.SHA224M_B;
			digest[2] -= sha2_32_constants.SHA224M_C;
			digest[3] -= sha2_32_constants.SHA224M_D;
			digest[4] -= sha2_32_constants.SHA224M_E;
			digest[5] -= sha2_32_constants.SHA224M_F;
			digest[6] -= sha2_32_constants.SHA224M_G;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_655331);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[8] = ModernizedCProgram.hex_to_u32(hash_pos + 64);
		digest[9] = ModernizedCProgram.hex_to_u32(hash_pos + 72);
		digest[10] = ModernizedCProgram.hex_to_u32(hash_pos + 80);
		digest[11] = ModernizedCProgram.hex_to_u32(hash_pos + 88);
		digest[12] = ModernizedCProgram.hex_to_u32(hash_pos + 96);
		digest[13] = ModernizedCProgram.hex_to_u32(hash_pos + 104);
		digest[14] = ModernizedCProgram.hex_to_u32(hash_pos + 112);
		digest[15] = ModernizedCProgram.hex_to_u32(hash_pos + 120);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		digest[8] = ModernizedCProgram.byte_swap_32(digest[8]);
		digest[9] = ModernizedCProgram.byte_swap_32(digest[9]);
		digest[10] = ModernizedCProgram.byte_swap_32(digest[10]);
		digest[11] = ModernizedCProgram.byte_swap_32(digest[11]);
		digest[12] = ModernizedCProgram.byte_swap_32(digest[12]);
		digest[13] = ModernizedCProgram.byte_swap_32(digest[13]);
		digest[14] = ModernizedCProgram.byte_swap_32(digest[14]);
		digest[15] = ModernizedCProgram.byte_swap_32(digest[15]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		jks_sha1_t jks_sha1 = (jks_sha1_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(7);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_JKS_SHA1;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 10;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'*';
		generatedLen_min[1] = 40;
		generatedLen_max[1] = 40;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 40;
		generatedLen_max[2] = 40;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 2;
		generatedLen_max[3] = 16384;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)'*';
		generatedLen_min[4] = 2;
		generatedLen_max[4] = 2;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[5] = (byte)'*';
		generatedLen_min[5] = 28;
		generatedLen_max[5] = 28;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[6] = (byte)'*';
		generatedLen_min[6] = 0;
		generatedLen_max[6] = 64;
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// checksum
		Object[] generatedBuf = token.getBuf();
		u8[] checksum_pos = generatedBuf[1];
		Object[] generatedChecksum = jks_sha1.getChecksum();
		generatedChecksum[0] = ModernizedCProgram.hex_to_u32((u8)checksum_pos[0]);
		generatedChecksum[1] = ModernizedCProgram.hex_to_u32((u8)checksum_pos[8]);
		generatedChecksum[2] = ModernizedCProgram.hex_to_u32((u8)checksum_pos[16]);
		generatedChecksum[3] = ModernizedCProgram.hex_to_u32((u8)checksum_pos[24]);
		generatedChecksum[4] = ModernizedCProgram.hex_to_u32((u8)checksum_pos[32])// iv;// iv
		u8[] iv_pos = generatedBuf[2];
		Object[] generatedIv = jks_sha1.getIv();
		generatedIv[0] = ModernizedCProgram.hex_to_u32((u8)iv_pos[0]);
		generatedIv[1] = ModernizedCProgram.hex_to_u32((u8)iv_pos[8]);
		generatedIv[2] = ModernizedCProgram.hex_to_u32((u8)iv_pos[16]);
		generatedIv[3] = ModernizedCProgram.hex_to_u32((u8)iv_pos[24]);
		generatedIv[4] = ModernizedCProgram.hex_to_u32((u8)iv_pos[32])// enc_key;// enc_key
		u8[] enc_key_pos = generatedBuf[3];
		Object[] generatedLen = token.getLen();
		int enc_key_len = generatedLen[3];
		Object[] generatedEnc_key_buf = jks_sha1.getEnc_key_buf();
		u8[] enc_key_buf = (u8)generatedEnc_key_buf;
		Object generatedEnc_key_len = jks_sha1.getEnc_key_len();
		for (int i = 0;
		int j = 0;
		 j < enc_key_len; ) {
			enc_key_buf[i] = ModernizedCProgram.hex_to_u8((u8)enc_key_pos[j]);
			generatedEnc_key_len++;
		}
		// der1u8[] der1_pos = generatedBuf[4];
		Object[] generatedDer = jks_sha1.getDer();
		u8[] der = (u8)generatedDer;
		der[0] = ModernizedCProgram.hex_to_u8((u8)der1_pos[0])// der2;// der2
		u8[] der2_pos = generatedBuf[5];
		for (int i = 6;
		int j = 0;
		 j < 28; ) {
			der[i] = ModernizedCProgram.hex_to_u8((u8)der2_pos[j]);
		}
		der[1] = 0;
		der[2] = 0;
		der[3] = 0;
		der[4] = 0;
		der[5] = 0// alias;// alias
		u8 alias_pos = generatedBuf[6];
		Object[] generatedAlias = jks_sha1.getAlias();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy((byte)generatedAlias, (byte)alias_pos, 64)// fake salt;// fake salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedIv[0];
		generatedSalt_buf[1] = generatedIv[1];
		generatedSalt_buf[2] = generatedIv[2];
		generatedSalt_buf[3] = generatedIv[3];
		generatedSalt_buf[4] = generatedIv[4];
		salt.setSalt_len(20)// fake digest;// fake digest
		digest[0] = ModernizedCProgram.byte_swap_32(generatedDer[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(generatedDer[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(generatedDer[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(generatedDer[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(generatedDer[4]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'$';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[1] = 40;
		generatedLen_max[1] = 40;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer/**
			   * salt
			   */);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] salt_pos = generatedBuf[0];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[0];
		int user_len = 0;
		for (int i = 0;
		 i < salt_len; i++) {
			if (salt_pos[i] == (byte)' ') {
				continue;
			} 
			user_len++;
		}
		// SAP user names cannot be longer than 12 charactersif (user_len > 12) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// SAP user name cannot start with ! or ?if (salt_pos[0] == (byte)'!' || salt_pos[0] == (byte)'?') {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH/**
			   * hash
			   */);
		} 
		u8[] hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u32((u8)hash_pos[0]);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)hash_pos[8]);
		digest[2] = ModernizedCProgram.hex_to_u32((u8)hash_pos[16]);
		digest[3] = ModernizedCProgram.hex_to_u32((u8)hash_pos[24]);
		digest[4] = ModernizedCProgram.hex_to_u32((u8)hash_pos[32]);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		int hash_len = generatedLen[0];
		if (hash_len != 64) {
			return (parser_rc.PARSER_GLOBAL_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 6;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// now we need to reduce our hash into a tokenint otp_code = ModernizedCProgram.hc_strtoul((byte)line_buf, (null), 10);
		digest[0] = otp_code;
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		// convert ascii timestamp to ulong timestampu64 timestamp = ModernizedCProgram.hc_strtoull((byte)salt_pos, (null), 10);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		// store the original salt value. Step division will destroy granularity for output// store the original salt value. Step division will destroy granularity for outputgeneratedSalt_buf[3] = ((u32)(timestamp >> 0));
		generatedSalt_buf[2] = ((u32)(timestamp >> 32));
		// divide our timestamp by our step. We will use the RFC 6238 default of 30 for now// divide our timestamp by our step. We will use the RFC 6238 default of 30 for nowtimestamp /= 30;
		// convert counter to 8-byte salt// convert counter to 8-byte saltgeneratedSalt_buf[1] = ModernizedCProgram.byte_swap_32((u32)(timestamp >> 0));
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32((u32)(timestamp >> 32));
		// our salt will always be 8 bytes, but we are going to cheat and store it twice, so...// our salt will always be 8 bytes, but we are going to cheat and store it twice, so...salt.setSalt_len(16);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 12;
		generatedLen_max[1] = 12;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_2K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		cloudkey_t cloudkey = (cloudkey_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[1] = (byte)':';
		generatedLen_min[1] = 32;
		generatedLen_max[1] = 32;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[2] = (byte)':';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[3] = 2;
		generatedLen_max[3] = 2048;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// hash
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7])// salt;// salt
		u8[] salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		u8 saltbuf_ptr = (u8)generatedSalt_buf;
		for (int i = 0;
		 i < salt_len; i += 2) {
			u8 p0 = salt_pos[i + 0];
			u8 p1 = salt_pos[i + 1];
			saltbuf_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		generatedSalt_buf[4] = -1024;
		generatedSalt_buf[5] = -1024;
		salt.setSalt_len(salt_len / 2)// iteration;// iteration
		u8 iter_pos = generatedBuf[2];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10) - 1)// data;// data
		u8[] data_pos = generatedBuf[3];
		int data_len = generatedLen[3];
		Object[] generatedData_buf = cloudkey.getData_buf();
		u8 databuf_ptr = (u8)generatedData_buf;
		for (int i = 0;
		 i < data_len; i += 2) {
			u8 p0 = data_pos[i + 0];
			u8 p1 = data_pos[i + 1];
			databuf_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		databuf_ptr++ = -1024;
		for (int i = 0;
		 i < 512; i++) {
			generatedData_buf[i] = ModernizedCProgram.byte_swap_32(generatedData_buf[i]);
		}
		cloudkey.setData_len(data_len / 2);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		electrum_wallet_t electrum_wallet = (electrum_wallet_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ELECTRUM_WALLET;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt_type
		Object[] generatedBuf = token.getBuf();
		u8 salt_type_pos = generatedBuf[1];
		u32 salt_type = ModernizedCProgram.hc_strtoul((byte)salt_type_pos, (null), 10);
		if ((salt_type == 1) || (salt_type == 2) || (salt_type == 3)) {
		} else {
				return (parser_rc.PARSER_SALT_VALUE);
		} 
		// all ok
		electrum_wallet.setSalt_type(salt_type)// iv;// iv
		u8[] iv_pos = generatedBuf[2];
		Object[] generatedIv = electrum_wallet.getIv();
		generatedIv[0] = ModernizedCProgram.hex_to_u32((u8)iv_pos[0]);
		generatedIv[1] = ModernizedCProgram.hex_to_u32((u8)iv_pos[8]);
		generatedIv[2] = ModernizedCProgram.hex_to_u32((u8)iv_pos[16]);
		generatedIv[3] = ModernizedCProgram.hex_to_u32((u8)iv_pos[24])// encrypted;// encrypted
		u8[] encrypted_pos = generatedBuf[3];
		Object[] generatedEncrypted = electrum_wallet.getEncrypted();
		generatedEncrypted[0] = ModernizedCProgram.hex_to_u32((u8)encrypted_pos[0]);
		generatedEncrypted[1] = ModernizedCProgram.hex_to_u32((u8)encrypted_pos[8]);
		generatedEncrypted[2] = ModernizedCProgram.hex_to_u32((u8)encrypted_pos[16]);
		generatedEncrypted[3] = ModernizedCProgram.hex_to_u32((u8)encrypted_pos[24])// salt fake;// salt fake
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedIv[0];
		generatedSalt_buf[1] = generatedIv[1];
		generatedSalt_buf[2] = generatedIv[2];
		generatedSalt_buf[3] = generatedIv[3];
		generatedSalt_buf[4] = generatedEncrypted[0];
		generatedSalt_buf[5] = generatedEncrypted[1];
		generatedSalt_buf[6] = generatedEncrypted[2];
		generatedSalt_buf[7] = generatedEncrypted[3];
		salt.setSalt_len(32)// hash fake;// hash fake
		digest[0] = generatedIv[0];
		digest[1] = generatedIv[1];
		digest[2] = generatedIv[2];
		digest[3] = generatedIv[3];
		digest[4] = generatedEncrypted[0];
		digest[5] = generatedEncrypted[1];
		digest[6] = generatedEncrypted[2];
		digest[7] = generatedEncrypted[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 30;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 30;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256 - 23;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] hash_pos = generatedBuf[0];
		// unscramble
		u8[] clean_input_buf = new u8[]{0};
		byte[] sig = new byte[]{(byte)'n', (byte)'r', (byte)'c', (byte)'s', (byte)'t', (byte)'n'};
		int[] pos = new int[]{0, 6, 12, 17, 23, 29};
		for (int i = 0;
		int j = 0;
		int k = 0;
		 i < 30; i++) {
			if (i == pos[j]) {
				if (sig[j] != hash_pos[i]) {
					return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
				} 
				j++;
			} else {
					clean_input_buf[k] = hash_pos[i];
					k++;
			} 
		}
		// base64 decodeu32 a = new u32();
		u32 b = new u32();
		u32 c = new u32();
		u32 d = new u32();
		u32 e = new u32();
		u32 f = new u32();
		a = ModernizedCProgram.base64_to_int(clean_input_buf[0] & -1024);
		b = ModernizedCProgram.base64_to_int(clean_input_buf[1] & -1024);
		c = ModernizedCProgram.base64_to_int(clean_input_buf[2] & -1024);
		d = ModernizedCProgram.base64_to_int(clean_input_buf[3] & -1024);
		e = ModernizedCProgram.base64_to_int(clean_input_buf[4] & -1024);
		f = ModernizedCProgram.base64_to_int(clean_input_buf[5] & -1024);
		digest[0] = (((a << 12) | (b << 6) | (c)) << 16) | (((d << 12) | (e << 6) | (f)) << 0);
		a = ModernizedCProgram.base64_to_int(clean_input_buf[6] & -1024);
		b = ModernizedCProgram.base64_to_int(clean_input_buf[7] & -1024);
		c = ModernizedCProgram.base64_to_int(clean_input_buf[8] & -1024);
		d = ModernizedCProgram.base64_to_int(clean_input_buf[9] & -1024);
		e = ModernizedCProgram.base64_to_int(clean_input_buf[10] & -1024);
		f = ModernizedCProgram.base64_to_int(clean_input_buf[11] & -1024);
		digest[1] = (((a << 12) | (b << 6) | (c)) << 16) | (((d << 12) | (e << 6) | (f)) << 0);
		a = ModernizedCProgram.base64_to_int(clean_input_buf[12] & -1024);
		b = ModernizedCProgram.base64_to_int(clean_input_buf[13] & -1024);
		c = ModernizedCProgram.base64_to_int(clean_input_buf[14] & -1024);
		d = ModernizedCProgram.base64_to_int(clean_input_buf[15] & -1024);
		e = ModernizedCProgram.base64_to_int(clean_input_buf[16] & -1024);
		f = ModernizedCProgram.base64_to_int(clean_input_buf[17] & -1024);
		digest[2] = (((a << 12) | (b << 6) | (c)) << 16) | (((d << 12) | (e << 6) | (f)) << 0);
		a = ModernizedCProgram.base64_to_int(clean_input_buf[18] & -1024);
		b = ModernizedCProgram.base64_to_int(clean_input_buf[19] & -1024);
		c = ModernizedCProgram.base64_to_int(clean_input_buf[20] & -1024);
		d = ModernizedCProgram.base64_to_int(clean_input_buf[21] & -1024);
		e = ModernizedCProgram.base64_to_int(clean_input_buf[22] & -1024);
		f = ModernizedCProgram.base64_to_int(clean_input_buf[23] & -1024);
		digest[3] = (((a << 12) | (b << 6) | (c)) << 16) | (((d << 12) | (e << 6) | (f)) << 0);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			if (generatedSalt_len > 32) {
				return (parser_rc.PARSER_SALT_LENGTH);
			} 
		} 
		// max. salt length: 55 (max for MD5) - 22 (":Administration Tools:") - 1 (0x80) = 32
		u8 salt_buf_ptr = (u8)generatedSalt_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr + generatedSalt_len, ModernizedCProgram.adm, /*Error: Function owner not recognized*/strlen(ModernizedCProgram.adm));
		generatedSalt_len += /*Error: Function owner not recognized*/strlen(ModernizedCProgram.adm);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md4_constants.MD4M_A;
			digest[1] -= md4_constants.MD4M_B;
			digest[2] -= md4_constants.MD4M_C;
			digest[3] -= md4_constants.MD4M_D;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		bitcoin_wallet_t bitcoin_wallet = (bitcoin_wallet_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(10);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_BITCOIN_WALLET;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 2;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 2;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 16;
		generatedLen_max[2] = 256;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 2;
		generatedLen_max[3] = 2;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[4] = (byte)'$';
		generatedLen_min[4] = 16;
		generatedLen_max[4] = 16;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[5] = (byte)'$';
		generatedLen_min[5] = 1;
		generatedLen_max[5] = 6;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[6] = (byte)'$';
		generatedLen_min[6] = 0;
		generatedLen_max[6] = 6;
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[7] = (byte)'$';
		generatedLen_min[7] = 0;
		generatedLen_max[7] = 999999;
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[8] = (byte)'$';
		generatedLen_min[8] = 0;
		generatedLen_max[8] = 6;
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[9] = (byte)'$';
		generatedLen_min[9] = 0;
		generatedLen_max[9] = 999999;
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 cry_master_len_pos = generatedBuf[1];
		u8[] cry_master_buf_pos = generatedBuf[2];
		u8 cry_salt_len_pos = generatedBuf[3];
		u8 cry_salt_buf_pos = generatedBuf[4];
		u8 cry_rounds_pos = generatedBuf[5];
		u8 ckey_len_pos = generatedBuf[6];
		u8 public_key_len_pos = generatedBuf[8];
		int cry_master_buf_len = generatedLen[2];
		int cry_salt_buf_len = generatedLen[4];
		int ckey_buf_len = generatedLen[7];
		int public_key_buf_len = generatedLen[9];
		// verify
		int cry_master_len = ModernizedCProgram.hc_strtoul((byte)cry_master_len_pos, (null), 10);
		int cry_salt_len = ModernizedCProgram.hc_strtoul((byte)cry_salt_len_pos, (null), 10);
		int ckey_len = ModernizedCProgram.hc_strtoul((byte)ckey_len_pos, (null), 10);
		int public_key_len = ModernizedCProgram.hc_strtoul((byte)public_key_len_pos, (null), 10);
		if (cry_master_buf_len != cry_master_len) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (cry_salt_buf_len != cry_salt_len) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (ckey_buf_len != ckey_len) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (public_key_buf_len != public_key_len) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (cry_master_len % 16) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		// esalt
		Object[] generatedCry_master_buf = bitcoin_wallet.getCry_master_buf();
		for (int i = 0;
		int j = 0;
		 j < cry_master_len; ) {
			generatedCry_master_buf[i] = ModernizedCProgram.hex_to_u32((u8)cry_master_buf_pos[j]);
		}
		bitcoin_wallet.setCry_master_len(cry_master_len / 2)// hash;// hash
		digest[0] = generatedCry_master_buf[0];
		digest[1] = generatedCry_master_buf[1];
		digest[2] = generatedCry_master_buf[2];
		digest[3] = generatedCry_master_buf[3]// iter;// iter
		int cry_rounds = ModernizedCProgram.hc_strtoul((byte)cry_rounds_pos, (null), 10);
		salt.setSalt_iter(cry_rounds - 1)// salt;// salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, cry_salt_buf_pos, cry_salt_buf_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		oldoffice01_t oldoffice01 = (oldoffice01_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(5);
		token.setSignatures_cnt(2);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_OLDOFFICE0;
		generatedSignatures_buf[1] = ModernizedCProgram.SIGNATURE_OLDOFFICE1;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[4] = 32;
		generatedLen_max[4] = 32;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 osalt_pos = generatedBuf[2];
		u8 encryptedVerifier_pos = generatedBuf[3];
		u8 encryptedVerifierHash_pos = generatedBuf[4];
		// esalt
		u32 version = version_pos - -1024;
		if (version != 0 && version != 1) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		oldoffice01.setVersion(version);
		Object[] generatedEncryptedVerifier = oldoffice01.getEncryptedVerifier();
		generatedEncryptedVerifier[0] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 0);
		generatedEncryptedVerifier[1] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 8);
		generatedEncryptedVerifier[2] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 16);
		generatedEncryptedVerifier[3] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 24);
		Object[] generatedEncryptedVerifierHash = oldoffice01.getEncryptedVerifierHash();
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 0);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 8);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 16);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 24)// salt;// salt
		salt.setSalt_len(16);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(osalt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(osalt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(osalt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(osalt_pos + 24)// this is a workaround as office produces multiple documents with the same salt;// this is a workaround as office produces multiple documents with the same salt
		generatedSalt_buf[4] = generatedEncryptedVerifier[0];
		generatedSalt_buf[5] = generatedEncryptedVerifier[1];
		generatedSalt_buf[6] = generatedEncryptedVerifier[2];
		generatedSalt_buf[7] = generatedEncryptedVerifier[3];
		generatedSalt_buf[8] = generatedEncryptedVerifierHash[0];
		generatedSalt_buf[9] = generatedEncryptedVerifierHash[1];
		generatedSalt_buf[10] = generatedEncryptedVerifierHash[2];
		generatedSalt_buf[11] = generatedEncryptedVerifierHash[3];
		Object generatedSalt_len = salt.getSalt_len();
		generatedSalt_len += 32/**
		   * digest
		   */;
		digest[0] = generatedEncryptedVerifierHash[0];
		digest[1] = generatedEncryptedVerifierHash[1];
		digest[2] = generatedEncryptedVerifierHash[2];
		digest[3] = generatedEncryptedVerifierHash[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(4);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_BCRYPT1;
		generatedSignatures_buf[1] = ModernizedCProgram.SIGNATURE_BCRYPT2;
		generatedSignatures_buf[2] = ModernizedCProgram.SIGNATURE_BCRYPT3;
		generatedSignatures_buf[3] = ModernizedCProgram.SIGNATURE_BCRYPT4;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 4;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 2;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 2;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen[2] = 22;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		generatedLen[3] = 31;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		u8 salt_pos = generatedBuf[2];
		u8 hash_pos = generatedBuf[3];
		int salt_len = generatedLen[2];
		int hash_len = generatedLen[3];
		salt.setSalt_len(16);
		salt.setSalt_iter(-1024 << ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10));
		Object[] generatedSalt_sign = salt.getSalt_sign();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((byte)generatedSalt_sign, line_buf, 6);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		u8 salt_buf_ptr = (u8)generatedSalt_buf;
		u8[] tmp_buf = new u8();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.base64_decode(ModernizedCProgram.bf64_to_int, (u8)salt_pos, salt_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr, tmp_buf, 16);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.base64_decode(ModernizedCProgram.bf64_to_int, (u8)hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 24);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		// its just 23 not 24 !// its just 23 not 24 !digest[5] &=  ~-1024;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_2K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 64;
		generatedLen_max[1] = 64;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// hash
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7])// salt;// salt
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH/**
			   * we can precompute the first sha256 transform
			   */);
		} 
		u32[] w = new u32[]{0};
		w[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		w[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		w[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		w[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3]);
		w[4] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[4]);
		w[5] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[5]);
		w[6] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[6]);
		w[7] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[7]);
		w[8] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[8]);
		w[9] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[9]);
		w[10] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[10]);
		w[11] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[11]);
		w[12] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[12]);
		w[13] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[13]);
		w[14] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[14]);
		w[15] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[15]);
		u32[] pc256 = new u32[]{sha2_32_constants.SHA256M_A, sha2_32_constants.SHA256M_B, sha2_32_constants.SHA256M_C, sha2_32_constants.SHA256M_D, sha2_32_constants.SHA256M_E, sha2_32_constants.SHA256M_F, sha2_32_constants.SHA256M_G, sha2_32_constants.SHA256M_H};
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_transform(w + 0, w + 4, w + 8, w + 12, pc256);
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		generatedSalt_buf_pc[0] = pc256[0];
		generatedSalt_buf_pc[1] = pc256[1];
		generatedSalt_buf_pc[2] = pc256[2];
		generatedSalt_buf_pc[3] = pc256[3];
		generatedSalt_buf_pc[4] = pc256[4];
		generatedSalt_buf_pc[5] = pc256[5];
		generatedSalt_buf_pc[6] = pc256[6];
		generatedSalt_buf_pc[7] = pc256[7];
		digest[0] -= pc256[0];
		digest[1] -= pc256[1];
		digest[2] -= pc256[2];
		digest[3] -= pc256[3];
		digest[4] -= pc256[4];
		digest[5] -= pc256[5];
		digest[6] -= pc256[6];
		digest[7] -= pc256[7];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 16;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 16;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 16;
		generatedLen_max[1] = 16;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = 0;
		generatedSalt_buf[3] = 0;
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		generatedSalt_buf_pc[0] = generatedSalt_buf[0];
		generatedSalt_buf_pc[1] = generatedSalt_buf[1];
		{ 
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[1] >> 4;
				t = t ^ generatedSalt_buf_pc[0];
				t = t & -1024;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
				t = t << 4;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[0] >> 16;
				t = t ^ generatedSalt_buf_pc[1];
				t = t & -1024;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
				t = t << 16;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[1] >> 2;
				t = t ^ generatedSalt_buf_pc[0];
				t = t & -1024;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
				t = t << 2;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[0] >> 8;
				t = t ^ generatedSalt_buf_pc[1];
				t = t & -1024;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
				t = t << 8;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = generatedSalt_buf_pc[1] >> 1;
				t = t ^ generatedSalt_buf_pc[0];
				t = t & -1024;
				generatedSalt_buf_pc[0] = generatedSalt_buf_pc[0] ^ t;
				t = t << 1;
				generatedSalt_buf_pc[1] = generatedSalt_buf_pc[1] ^ t;
			}
			;
		}
		;
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = 0;
		digest[3] = 0;
		{ 
			{ 
				u32x t = new u32x();
				t = digest[1] >> 4;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 4;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 16;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 16;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 2;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 2;
				digest[1] = digest[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[0] >> 8;
				t = t ^ digest[1];
				t = t & -1024;
				digest[1] = digest[1] ^ t;
				t = t << 8;
				digest[0] = digest[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = digest[1] >> 1;
				t = t ^ digest[0];
				t = t & -1024;
				digest[0] = digest[0] ^ t;
				t = t << 1;
				digest[1] = digest[1] ^ t;
			}
			;
		}
		;
		return (parser_rc.PARSER_OK);
		u32 digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_CISCO9;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 3;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 14;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 14;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen[2] = 43;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt is not encoded
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		u8 salt_buf_ptr = (u8)generatedSalt_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_ptr, salt_pos, salt_len);
		salt.setSalt_len(salt_len);
		salt.setSalt_iter(1);
		salt.setScrypt_N(16384);
		salt.setScrypt_r(1);
		salt.setScrypt_p(1)// base64 decode hash;// base64 decode hash
		u8 hash_pos = generatedBuf[2];
		int hash_len = generatedLen[2];
		u8[] tmp_buf = new u8[]{0};
		int tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.itoa64_to_int, hash_pos, hash_len, tmp_buf);
		if (tmp_len != 32) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 32);
		return (parser_rc.PARSER_OK);
		pkzip_t pkzip = (pkzip_t)esalt_buf;
		u32[] digest = (u32)digest_buf;
		byte[] input = new byte[line_len + 1];
		input[line_len] = (byte)'\0';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(input, line_buf, line_len);
		Byte saveptr = (null);
		byte[] p = /*Error: Function owner not recognized*/strtok_r(input, "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		if (/*Error: Function owner not recognized*/strncmp(p, ModernizedCProgram.SIGNATURE_PKZIP_V1, 7) != 0 && /*Error: Function owner not recognized*/strncmp(p, ModernizedCProgram.SIGNATURE_PKZIP_V2, 8) != 0) {
			return parser_rc.PARSER_SIGNATURE_UNMATCHED;
		} 
		pkzip.setVersion(1);
		if (/*Error: Function owner not recognized*/strlen(p) == 9) {
			pkzip.setVersion(2);
		} 
		byte[] sub = new byte[2];
		sub[0] = p[/*Error: Function owner not recognized*/strlen(p) - 1];
		sub[1] = (byte)'\0';
		pkzip.setHash_count(/*Error: Function owner not recognized*/atoi(sub));
		Object generatedHash_count = pkzip.getHash_count();
		// check here that the hash_count is valid for the attack typeif (generatedHash_count > 8) {
			return parser_rc.PARSER_HASH_VALUE;
		} 
		p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
		if (p == (null)) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		pkzip.setChecksum_size(/*Error: Function owner not recognized*/atoi(p));
		Object generatedChecksum_size = pkzip.getChecksum_size();
		if (generatedChecksum_size != 1 && generatedChecksum_size != 2) {
			return parser_rc.PARSER_HASH_LENGTH;
		} 
		Object generatedHashes = pkzip.getHashes();
		Object generatedVersion = pkzip.getVersion();
		Object[] generatedSalt_buf = salt.getSalt_buf();
		for (int i = 0;
		 i < generatedHash_count; i++) {
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setData_type_enum(/*Error: Function owner not recognized*/atoi(p));
			if (generatedHashes[i].getData_type_enum() > 3) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setMagic_type_enum(/*Error: Function owner not recognized*/atoi(p));
			if (generatedHashes[i].getData_type_enum() > 1) {
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setCompressed_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setUncompressed_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
				if (generatedHashes[i].getCompressed_length() > (320 * 1024)) {
					return parser_rc.PARSER_TOKEN_LENGTH;
				} 
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				u32 crc32 = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%x", ModernizedCProgram.crc32);
				generatedHashes[i].setCrc32(ModernizedCProgram.crc32);
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setOffset(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				generatedHashes[i].setAdditional_offset(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setCompression_type(/*Error: Function owner not recognized*/atoi(p));
			if (generatedHashes[i].getCompression_type() != 8) {
				return parser_rc.PARSER_PKZIP_CT_UNMATCHED;
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			generatedHashes[i].setData_length(/*Error: Function owner not recognized*/strtoul(p, (null), 16));
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			u16 checksum_from_crc = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%hx", checksum_from_crc);
			generatedHashes[i].setChecksum_from_crc(checksum_from_crc);
			if (generatedVersion == 2) {
				p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
				if (p == (null)) {
					return parser_rc.PARSER_HASH_LENGTH;
				} 
				u16 checksum_from_timestamp = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sscanf(p, "%hx", checksum_from_timestamp);
				generatedHashes[i].setChecksum_from_timestamp(checksum_from_timestamp);
			} else {
					generatedHashes[i].setChecksum_from_timestamp(generatedHashes[i].getChecksum_from_crc());
			} 
			p = /*Error: Function owner not recognized*/strtok_r((null), "*", saveptr);
			if (p == (null)) {
				return parser_rc.PARSER_HASH_LENGTH;
			} 
			ModernizedCProgram.hex_to_binary(p, /*Error: Function owner not recognized*/strlen(p), (byte)(generatedHashes[i].getData()));
			generatedSalt_buf[i] = generatedHashes[i].getData()[0];
			if (i == 0) {
				digest[i] = generatedHashes[i].getChecksum_from_crc();
			} 
		}
		salt.setSalt_len(generatedHash_count << 2);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[8] = ModernizedCProgram.hex_to_u32(hash_pos + 64);
		digest[9] = ModernizedCProgram.hex_to_u32(hash_pos + 72);
		digest[10] = ModernizedCProgram.hex_to_u32(hash_pos + 80);
		digest[11] = ModernizedCProgram.hex_to_u32(hash_pos + 88);
		digest[12] = ModernizedCProgram.hex_to_u32(hash_pos + 96);
		digest[13] = ModernizedCProgram.hex_to_u32(hash_pos + 104);
		digest[14] = ModernizedCProgram.hex_to_u32(hash_pos + 112);
		digest[15] = ModernizedCProgram.hex_to_u32(hash_pos + 120);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_EPISERVER;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 11;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 11;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = ((0 * 8) / 6) + 0;
		generatedLen_max[2] = ((256 * 8) / 6) + 3;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedLen_min[3] = 43;
		generatedLen_max[3] = 43;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[3];
		Object[] generatedLen = token.getLen();
		int hash_len = generatedLen[3];
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		krb5pa_t krb5pa = (krb5pa_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_KRB5PA;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 64;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 64;
		generatedSep[2] = (byte)'$';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[3] = 0;
		generatedLen_max[3] = 128;
		generatedSep[3] = (byte)'$';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen[4] = 72;
		generatedAttr[4] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[5] = 32;
		generatedAttr[5] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 user_pos = generatedBuf[1];
		u8 realm_pos = generatedBuf[2];
		u8 salt_pos = generatedBuf[3];
		int user_len = generatedLen[1];
		int realm_len = generatedLen[2];
		int salt_len = generatedLen[3/**
		   * copy data
		   */];
		Object[] generatedUser = krb5pa.getUser();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedUser, user_pos, user_len);
		Object[] generatedRealm = krb5pa.getRealm();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedRealm, realm_pos, realm_len);
		Object[] generatedSalt = krb5pa.getSalt();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt, salt_pos, salt_len/**
		   * decode data
		   */);
		u8[] timestamp_pos = generatedBuf[4];
		Object[] generatedTimestamp = krb5pa.getTimestamp();
		u8 timestamp_ptr = (u8)generatedTimestamp;
		for (int i = 0;
		 i < 72; i += 2) {
			u8 p0 = timestamp_pos[i + 0];
			u8 p1 = timestamp_pos[i + 1];
			timestamp_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		u8[] checksum_pos = generatedBuf[5];
		Object[] generatedChecksum = krb5pa.getChecksum();
		u8 checksum_ptr = (u8)generatedChecksum;
		for (int i = 0;
		 i < 32; i += 2) {
			u8 p0 = checksum_pos[i + 0];
			u8 p1 = checksum_pos[i + 1];
			checksum_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4/**
			   * copy some data to generic buffers to make sorting happy
			   */;
		}
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedTimestamp[0];
		generatedSalt_buf[1] = generatedTimestamp[1];
		generatedSalt_buf[2] = generatedTimestamp[2];
		generatedSalt_buf[3] = generatedTimestamp[3];
		generatedSalt_buf[4] = generatedTimestamp[4];
		generatedSalt_buf[5] = generatedTimestamp[5];
		generatedSalt_buf[6] = generatedTimestamp[6];
		generatedSalt_buf[7] = generatedTimestamp[7];
		generatedSalt_buf[8] = generatedTimestamp[8];
		salt.setSalt_len(36);
		digest[0] = generatedChecksum[0];
		digest[1] = generatedChecksum[1];
		digest[2] = generatedChecksum[2];
		digest[3] = generatedChecksum[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md4_constants.MD4M_A;
			digest[1] -= md4_constants.MD4M_B;
			digest[2] -= md4_constants.MD4M_C;
			digest[3] -= md4_constants.MD4M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		itunes_backup_t itunes_backup = (itunes_backup_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(7);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ITUNES_BACKUP;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 15;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 15;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 2;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 80;
		generatedLen_max[2] = 80;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[3] = 1;
		generatedLen_max[3] = 6;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 40;
		generatedLen_max[4] = 40;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[5] = 0;
		generatedLen_max[5] = 10;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[6] = 0;
		generatedLen_max[6] = 40;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// version
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u32 version = ModernizedCProgram.hc_strtoul((byte)version_pos, (null), 10);
		u32 hash_mode = hashconfig.getHash_mode();
		if (hash_mode == 14700) {
			if (version != 9) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
		}  else if (hash_mode == 14800) {
			if (version != 10) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
		} 
		Object[] generatedSalt_sign = salt.getSalt_sign();
		generatedSalt_sign[0] = (byte)version// wpky;// wpky
		u8[] wpky_pos = generatedBuf[2];
		Object[] generatedWpky = itunes_backup.getWpky();
		u32[] wpky_buf_ptr = (u32)generatedWpky;
		wpky_buf_ptr[0] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[0]);
		wpky_buf_ptr[1] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[8]);
		wpky_buf_ptr[2] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[16]);
		wpky_buf_ptr[3] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[24]);
		wpky_buf_ptr[4] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[32]);
		wpky_buf_ptr[5] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[40]);
		wpky_buf_ptr[6] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[48]);
		wpky_buf_ptr[7] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[56]);
		wpky_buf_ptr[8] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[64]);
		wpky_buf_ptr[9] = ModernizedCProgram.hex_to_u32((u8)wpky_pos[72]);
		wpky_buf_ptr[0] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[0]);
		wpky_buf_ptr[1] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[1]);
		wpky_buf_ptr[2] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[2]);
		wpky_buf_ptr[3] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[3]);
		wpky_buf_ptr[4] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[4]);
		wpky_buf_ptr[5] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[5]);
		wpky_buf_ptr[6] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[6]);
		wpky_buf_ptr[7] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[7]);
		wpky_buf_ptr[8] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[8]);
		wpky_buf_ptr[9] = ModernizedCProgram.byte_swap_32(wpky_buf_ptr[9])// iter;// iter
		u8 iter_pos = generatedBuf[3];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		if (iter < 1) {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		if (hash_mode == 14700) {
			salt.setSalt_iter(iter - 1);
		}  else if (hash_mode == 14800) {
			salt.setSalt_iter(0);
			salt.setSalt_iter2(iter - 1);
		} 
		// saltu8 salt_pos = generatedBuf[4];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[4];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3]);
		generatedSalt_buf[4] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[4])// dpic + dpsl;// dpic + dpsl
		u8 dpic_pos = generatedBuf[5];
		int dpic_len = generatedLen[5];
		u8[] dpsl_pos = generatedBuf[6];
		int dpsl_len = generatedLen[6];
		u32 dpic = 0;
		Object[] generatedDpsl = itunes_backup.getDpsl();
		if (hash_mode == 14700) {
			if (dpic_len > 0) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
			if (dpsl_len > 0) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
		}  else if (hash_mode == 14800) {
			if (dpic_len < 1) {
				return (parser_rc.PARSER_SALT_ITERATION);
			} 
			if (dpic_len > 9) {
				return (parser_rc.PARSER_SALT_ITERATION);
			} 
			dpic = ModernizedCProgram.hc_strtoul((byte)dpic_pos, (null), 10);
			if (dpic < 1) {
				return (parser_rc.PARSER_SALT_ITERATION);
			} 
			salt.setSalt_iter(dpic - 1);
			if (dpsl_len != 40) {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
			u32 dpsl_buf_ptr = (u32)generatedDpsl;
			dpsl_buf_ptr[0] = ModernizedCProgram.hex_to_u32((u8)dpsl_pos[0]);
			dpsl_buf_ptr[1] = ModernizedCProgram.hex_to_u32((u8)dpsl_pos[8]);
			dpsl_buf_ptr[2] = ModernizedCProgram.hex_to_u32((u8)dpsl_pos[16]);
			dpsl_buf_ptr[3] = ModernizedCProgram.hex_to_u32((u8)dpsl_pos[24]);
			dpsl_buf_ptr[4] = ModernizedCProgram.hex_to_u32((u8)dpsl_pos[32]);
			dpsl_buf_ptr[0] = ModernizedCProgram.byte_swap_32(dpsl_buf_ptr[0]);
			dpsl_buf_ptr[1] = ModernizedCProgram.byte_swap_32(dpsl_buf_ptr[1]);
			dpsl_buf_ptr[2] = ModernizedCProgram.byte_swap_32(dpsl_buf_ptr[2]);
			dpsl_buf_ptr[3] = ModernizedCProgram.byte_swap_32(dpsl_buf_ptr[3]);
			dpsl_buf_ptr[4] = ModernizedCProgram.byte_swap_32(dpsl_buf_ptr[4]);
		} 
		digest[0] = generatedDpsl[0] ^ generatedWpky[0];
		digest[1] = generatedDpsl[1] ^ generatedWpky[1];
		digest[2] = generatedDpsl[2] ^ generatedWpky[2];
		digest[3] = generatedDpsl[3] ^ generatedWpky[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_2K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 96;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		int hash_len = generatedLen[0];
		if (hash_len != 96) {
			return (parser_rc.PARSER_GLOBAL_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		office2013_t office2013 = (office2013_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(8);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_OFFICE2013;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 8;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 8;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 4;
		generatedLen_max[1] = 4;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 6;
		generatedLen_max[2] = 6;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 3;
		generatedLen_max[3] = 3;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 2;
		generatedLen_max[4] = 2;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[5] = 32;
		generatedLen_max[5] = 32;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[6] = 32;
		generatedLen_max[6] = 32;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[7] = 64;
		generatedLen_max[7] = 64;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 spinCount_pos = generatedBuf[2];
		u8 keySize_pos = generatedBuf[3];
		u8 saltSize_pos = generatedBuf[4];
		u8 osalt_pos = generatedBuf[5];
		u8 encryptedVerifier_pos = generatedBuf[6];
		u8 encryptedVerifierHash_pos = generatedBuf[7];
		u32 version = ModernizedCProgram.hc_strtoul((byte)version_pos, (null), 10);
		u32 spinCount = ModernizedCProgram.hc_strtoul((byte)spinCount_pos, (null), 10);
		u32 keySize = ModernizedCProgram.hc_strtoul((byte)keySize_pos, (null), 10);
		u32 saltSize = ModernizedCProgram.hc_strtoul((byte)saltSize_pos, (null), 10);
		if (version != 2013) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (spinCount != 100000) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (keySize != 256) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (saltSize != 16) {
			return (parser_rc.PARSER_SALT_VALUE/**
			   * salt
			   */);
		} 
		salt.setSalt_len(16);
		salt.setSalt_iter(spinCount);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(osalt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(osalt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(osalt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(osalt_pos + 24);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3/**
		   * esalt
		   */]);
		Object[] generatedEncryptedVerifier = office2013.getEncryptedVerifier();
		generatedEncryptedVerifier[0] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 0);
		generatedEncryptedVerifier[1] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 8);
		generatedEncryptedVerifier[2] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 16);
		generatedEncryptedVerifier[3] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 24);
		generatedEncryptedVerifier[0] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[0]);
		generatedEncryptedVerifier[1] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[1]);
		generatedEncryptedVerifier[2] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[2]);
		generatedEncryptedVerifier[3] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifier[3]);
		Object[] generatedEncryptedVerifierHash = office2013.getEncryptedVerifierHash();
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 0);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 8);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 16);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 24);
		generatedEncryptedVerifierHash[4] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 32);
		generatedEncryptedVerifierHash[5] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 40);
		generatedEncryptedVerifierHash[6] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 48);
		generatedEncryptedVerifierHash[7] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 56);
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[0]);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[1]);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[2]);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[3]);
		generatedEncryptedVerifierHash[4] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[4]);
		generatedEncryptedVerifierHash[5] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[5]);
		generatedEncryptedVerifierHash[6] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[6]);
		generatedEncryptedVerifierHash[7] = ModernizedCProgram.byte_swap_32(generatedEncryptedVerifierHash[7/**
		   * digest
		   */]);
		digest[0] = generatedEncryptedVerifierHash[0];
		digest[1] = generatedEncryptedVerifierHash[1];
		digest[2] = generatedEncryptedVerifierHash[2];
		digest[3] = generatedEncryptedVerifierHash[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		krb5tgs_17_t krb5tgs = (krb5tgs_17_t)esalt_buf;
		token_t token = new token_t();
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_KRB5TGS;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 12;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE/**
		   * $krb5tgs$17$*user*realm*$checksum$edata2
		   * $krb5tgs$17$*user*realm*spn*$checksum$edata2
		   */;
		// assume no signature foundif (line_len < 12) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Byte spn_info_start = /*Error: Function owner not recognized*/strchr((byte)line_buf + 12 + 1, (byte)'*');
		int is_spn_provided = 0;
		Object[] generatedSep = token.getSep();
		Object[] generatedLen_min = token.getLen_min();
		Object[] generatedLen_max = token.getLen_max();
		// assume $krb5tgs$17$user$realm$checksum$edata2if (spn_info_start == (null)) {
			token.setToken_cnt(5);
			generatedSep[1] = (byte)'$';
			generatedLen_min[1] = 1;
			generatedLen_max[1] = 512;
			generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
			generatedSep[2] = (byte)'$';
			generatedLen_min[2] = 1;
			generatedLen_max[2] = 512;
			generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
			generatedSep[3] = (byte)'$';
			generatedLen_min[3] = 24;
			generatedLen_max[3] = 24;
			generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[4] = (byte)'$';
			generatedLen_min[4] = 64;
			generatedLen_max[4] = 40960;
			generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		} else {
				Byte spn_info_stop = /*Error: Function owner not recognized*/strchr((byte)spn_info_start + 1, (byte)'*');
				if (spn_info_stop == (null)) {
					return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
				} 
				spn_info_stop++;
				spn_info_stop++;
				int spn_info_len = spn_info_stop - spn_info_start;
				token.setToken_cnt(6);
				generatedSep[1] = (byte)'$';
				generatedLen_min[1] = 1;
				generatedLen_max[1] = 512;
				generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
				generatedSep[2] = (byte)'$';
				generatedLen_min[2] = 1;
				generatedLen_max[2] = 512;
				generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
				generatedLen[3] = spn_info_len;
				generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
				generatedSep[4] = (byte)'$';
				generatedLen_min[4] = 24;
				generatedLen_max[4] = 24;
				generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
				generatedSep[5] = (byte)'$';
				generatedLen_min[5] = 64;
				generatedLen_max[5] = 40960;
				generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
				is_spn_provided = 1;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		u8 user_pos = new u8();
		u8 domain_pos = new u8();
		u8 checksum_pos = new u8();
		u8[] data_pos = new u8();
		int user_len;
		int domain_len;
		int data_len;
		int account_info_len;
		Object[] generatedBuf = token.getBuf();
		user_pos = generatedBuf[1];
		user_len = generatedLen[1];
		Object[] generatedUser = krb5tgs.getUser();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedUser, user_pos, user_len);
		domain_pos = generatedBuf[2];
		domain_len = generatedLen[2];
		Object[] generatedDomain = krb5tgs.getDomain();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedDomain, domain_pos, domain_len);
		checksum_pos = generatedBuf[3 + is_spn_provided];
		data_pos = generatedBuf[4 + is_spn_provided];
		data_len = generatedLen[4 + is_spn_provided];
		account_info_len = generatedLen[2] + generatedLen[1];
		Object[] generatedAccount_info = krb5tgs.getAccount_info();
		u8 account_info_ptr = (u8)generatedAccount_info;
		// domain must be uppercaseu8[] domain = new u8();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(domain, domain_pos, domain_len);
		ModernizedCProgram.uppercase(domain, domain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(account_info_ptr, domain, domain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(account_info_ptr + domain_len, user_pos, user_len);
		krb5tgs.setAccount_info_len(account_info_len);
		Object[] generatedChecksum = krb5tgs.getChecksum();
		// hmac-sha1 is reduced to 12 bytes// hmac-sha1 is reduced to 12 bytesgeneratedChecksum[0] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 0));
		generatedChecksum[1] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 8));
		generatedChecksum[2] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 16));
		Object[] generatedEdata2 = krb5tgs.getEdata2();
		u8 edata_ptr = (u8)generatedEdata2;
		for (int i = 0;
		 i < data_len; i += 2) {
			u8 p0 = data_pos[i + 0];
			u8 p1 = data_pos[i + 1];
			edata_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		krb5tgs.setEdata2_len(data_len / 2);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedChecksum[0];
		generatedSalt_buf[1] = generatedChecksum[1];
		generatedSalt_buf[2] = generatedChecksum[2];
		salt.setSalt_iter(4096 - 1);
		digest[0] = generatedChecksum[0];
		digest[1] = generatedChecksum[1];
		digest[2] = generatedChecksum[2];
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		zip2_t zip2 = (zip2_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(10);
		token.setSignatures_cnt(2);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_ZIP2_START;
		generatedSignatures_buf[1] = ModernizedCProgram.SIGNATURE_ZIP2_STOP;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 6;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 6;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 1;
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 1;
		generatedLen_max[3] = 1;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 16;
		generatedLen_max[4] = 32;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[5] = 1;
		generatedLen_max[5] = 6;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[6] = 1;
		generatedLen_max[6] = 6;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[7] = 0;
		generatedLen_max[7] = 16384;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[8] = 20;
		generatedLen_max[8] = 20;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[9] = 7;
		generatedLen_max[9] = 7;
		generatedSep[9] = (byte)'*';
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// type
		Object[] generatedBuf = token.getBuf();
		u8 type_pos = generatedBuf[1];
		u32 type = ModernizedCProgram.hc_strtoul((byte)type_pos, (null), 10);
		if (type != 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		zip2.setType(type)// mode;// mode
		u8 mode_pos = generatedBuf[2];
		u32 mode = ModernizedCProgram.hc_strtoul((byte)mode_pos, (null), 10);
		zip2.setMode(mode)// magic;// magic
		u8 magic_pos = generatedBuf[3];
		u32 magic = ModernizedCProgram.hc_strtoul((byte)magic_pos, (null), 10);
		if (magic != 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		zip2.setMagic(magic)// verify_bytes;// verify_bytes
		u8 verify_bytes_pos = generatedBuf[5];
		u32 verify_bytes = new u32();
		if (/*Error: Function owner not recognized*/sscanf((byte)verify_bytes_pos, "%4x*", verify_bytes) == (true)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (verify_bytes >= -1024) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		zip2.setVerify_bytes(verify_bytes)// compress_length;// compress_length
		u8 compress_length_pos = generatedBuf[6];
		u32 compress_length = ModernizedCProgram.hc_strtoul((byte)compress_length_pos, (null), 10);
		zip2.setCompress_length(compress_length)// salt;// salt
		u8[] salt_pos = generatedBuf[4];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[4];
		Object[] generatedSalt_buf = zip2.getSalt_buf();
		if (mode == 1) {
			if (salt_len != 16) {
				return (parser_rc.PARSER_SALT_VALUE);
			} 
			generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32((u8)salt_pos[0]);
			generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32((u8)salt_pos[8]);
			generatedSalt_buf[2] = 0;
			generatedSalt_buf[3] = 0;
			zip2.setSalt_len(8);
		}  else if (mode == 2) {
			if (salt_len != 24) {
				return (parser_rc.PARSER_SALT_VALUE);
			} 
			generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32((u8)salt_pos[0]);
			generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32((u8)salt_pos[8]);
			generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32((u8)salt_pos[16]);
			generatedSalt_buf[3] = 0;
			zip2.setSalt_len(12);
		}  else if (mode == 3) {
			if (salt_len != 32) {
				return (parser_rc.PARSER_SALT_VALUE);
			} 
			generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32((u8)salt_pos[0]);
			generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32((u8)salt_pos[8]);
			generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32((u8)salt_pos[16]);
			generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32((u8)salt_pos[24]);
			zip2.setSalt_len(16);
		} else {
				return (parser_rc.PARSER_SALT_VALUE);
		} 
		// datau8[] data_buf = generatedBuf[7];
		int data_len = generatedLen[7];
		Object[] generatedData_buf = zip2.getData_buf();
		u8 data_buf_ptr = (u8)generatedData_buf;
		Object generatedData_len = zip2.getData_len();
		for (int i = 0;
		 i < data_len; i += 2) {
			u8 p0 = data_buf[i + 0];
			u8 p1 = data_buf[i + 1];
			data_buf_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
			generatedData_len++;
		}
		data_buf_ptr = -1024// auth;// auth
		u8[] auth_buf = generatedBuf[8];
		int auth_len = generatedLen[8];
		Object[] generatedAuth_buf = zip2.getAuth_buf();
		u8 auth_ptr = (u8)generatedAuth_buf;
		Object generatedAuth_len = zip2.getAuth_len();
		for (int i = 0;
		 i < auth_len; i += 2) {
			u8 p0 = auth_buf[i + 0];
			u8 p1 = auth_buf[i + 1];
			auth_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
			generatedAuth_len++;
		}
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedData_buf[0];
		generatedSalt_buf[5] = generatedData_buf[1];
		generatedSalt_buf[6] = generatedData_buf[2];
		generatedSalt_buf[7] = generatedData_buf[3];
		salt.setSalt_len(32);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_ZIP2 - 1/**
		   * digest buf (fake)
		   */);
		digest[0] = generatedAuth_buf[0];
		digest[1] = generatedAuth_buf[1];
		digest[2] = generatedAuth_buf[2];
		digest[3] = generatedAuth_buf[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 55;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(digest, 0, hashconfig.getDgst_size());
		Object[] generatedBuf = token.getBuf();
		u8 pw_buf = generatedBuf[0];
		Object[] generatedLen = token.getLen();
		int pw_len = generatedLen[0];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((byte)digest + 64, pw_buf, pw_len)//strncpy ((char *) digest + 64, (char *) input_buf, 64);;//strncpy ((char *) digest + 64, (char *) input_buf, 64);
		u32[] w = new u32[]{0};
		//strncpy ((char *) w, (char *) input_buf, 64);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(w, pw_buf, pw_len);
		md4_ctx_t ctx = new md4_ctx_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md4_init(ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md4_update(ctx, w, pw_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md4_final(ctx);
		Object[] generatedH = ctx.getH();
		digest[0] = generatedH[0];
		digest[1] = generatedH[1];
		digest[2] = generatedH[2];
		digest[3] = generatedH[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md4_constants.MD4M_A;
			digest[1] -= md4_constants.MD4M_B;
			digest[2] -= md4_constants.MD4M_C;
			digest[3] -= md4_constants.MD4M_D;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SYBASEASE;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 16;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[2] = 64;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// hash
		u8 hash_pos = generatedBuf[2];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		oldoffice01_t oldoffice01 = (oldoffice01_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		token.setSignatures_cnt(2);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_OLDOFFICE0;
		generatedSignatures_buf[1] = ModernizedCProgram.SIGNATURE_OLDOFFICE1;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[4] = 32;
		generatedLen_max[4] = 32;
		generatedSep[4] = (byte)':';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[5] = 10;
		generatedLen_max[5] = 10;
		generatedSep[5] = (byte)':';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 osalt_pos = generatedBuf[2];
		u8 encryptedVerifier_pos = generatedBuf[3];
		u8 encryptedVerifierHash_pos = generatedBuf[4];
		u8[] rc4key_pos = generatedBuf[5];
		// esalt
		u32 version = version_pos - -1024;
		if (version != 0 && version != 1) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		oldoffice01.setVersion(version);
		Object[] generatedEncryptedVerifier = oldoffice01.getEncryptedVerifier();
		generatedEncryptedVerifier[0] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 0);
		generatedEncryptedVerifier[1] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 8);
		generatedEncryptedVerifier[2] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 16);
		generatedEncryptedVerifier[3] = ModernizedCProgram.hex_to_u32(encryptedVerifier_pos + 24);
		Object[] generatedEncryptedVerifierHash = oldoffice01.getEncryptedVerifierHash();
		generatedEncryptedVerifierHash[0] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 0);
		generatedEncryptedVerifierHash[1] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 8);
		generatedEncryptedVerifierHash[2] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 16);
		generatedEncryptedVerifierHash[3] = ModernizedCProgram.hex_to_u32(encryptedVerifierHash_pos + 24);
		Object[] generatedRc4key = oldoffice01.getRc4key();
		generatedRc4key[1] = 0;
		generatedRc4key[0] = 0;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[0]) << 28;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[1]) << 24;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[2]) << 20;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[3]) << 16;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[4]) << 12;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[5]) << 8;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[6]) << 4;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[7]) << 0;
		generatedRc4key[1] |=  ModernizedCProgram.hex_convert(rc4key_pos[8]) << 28;
		generatedRc4key[1] |=  ModernizedCProgram.hex_convert(rc4key_pos[9]) << 24;
		generatedRc4key[0] = ModernizedCProgram.byte_swap_32(generatedRc4key[0]);
		generatedRc4key[1] = ModernizedCProgram.byte_swap_32(generatedRc4key[1])// salt;// salt
		salt.setSalt_len(16);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(osalt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(osalt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(osalt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(osalt_pos + 24)// this is a workaround as office produces multiple documents with the same salt;// this is a workaround as office produces multiple documents with the same salt
		generatedSalt_buf[4] = generatedEncryptedVerifier[0];
		generatedSalt_buf[5] = generatedEncryptedVerifier[1];
		generatedSalt_buf[6] = generatedEncryptedVerifier[2];
		generatedSalt_buf[7] = generatedEncryptedVerifier[3];
		generatedSalt_buf[8] = generatedEncryptedVerifierHash[0];
		generatedSalt_buf[9] = generatedEncryptedVerifierHash[1];
		generatedSalt_buf[10] = generatedEncryptedVerifierHash[2];
		generatedSalt_buf[11] = generatedEncryptedVerifierHash[3];
		Object generatedSalt_len = salt.getSalt_len();
		generatedSalt_len += 32/**
		   * digest
		   */;
		digest[0] = generatedRc4key[0];
		digest[1] = generatedRc4key[1];
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA512M_A;
			digest[1] -= sha2_64_constants.SHA512M_B;
			digest[2] -= sha2_64_constants.SHA512M_C;
			digest[3] -= sha2_64_constants.SHA512M_D;
			digest[4] -= sha2_64_constants.SHA512M_E;
			digest[5] -= sha2_64_constants.SHA512M_F;
			digest[6] -= sha2_64_constants.SHA512M_G;
			digest[7] -= sha2_64_constants.SHA512M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MYSQL_AUTH;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 40;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 40;
		generatedLen_max[2] = 40;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// hash
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[2];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4/*
		   * store salt
		   */]);
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PHPS;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0 * 2;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 256 * 2;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[2];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 64;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		u8 salt_pos = generatedBuf[0];
		int salt_len = generatedLen[0];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[1] = (byte)':';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 32;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = (byte)':';
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 32;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[3] = (byte)':';
		generatedLen_min[3] = 1;
		generatedLen_max[3] = 6;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// ok, the plan for this algorithm is the following:// we have 2 salts here, the domain-name and a random salt// while both are used in the initial transformation,// only the random salt is used in the following iterations
		Object[] generatedBuf = token.getBuf();
		// so we create two buffer, one that includes domain-name (stored into salt_buf_pc[])// and one that includes only the real salt (stored into salt_buf[]).// the domain-name length is put into array position 7 of salt_buf_pc[] since there is not salt_pc_lenu8 hash_pos = generatedBuf[0];
		Object[] generatedLen = token.getLen();
		int hash_len = generatedLen[0];
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base32_decode(ModernizedCProgram.itoa32_to_int, hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 20);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4])// domain;// domain
		u8 domain_pos = generatedBuf[1];
		int domain_len = generatedLen[1];
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		u8[] salt_buf_pc_ptr = (u8)generatedSalt_buf_pc;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(salt_buf_pc_ptr, domain_pos, domain_len);
		if (salt_buf_pc_ptr[0] != (byte)'.') {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		u8 len_ptr = salt_buf_pc_ptr;
		len_ptr = 0;
		for (int i = 1;
		 i < domain_len; i++) {
			if (salt_buf_pc_ptr[i] == (byte)'.') {
				len_ptr = salt_buf_pc_ptr + i;
				len_ptr = 0;
			} else {
					len_ptr += 1;
			} 
		}
		salt.setSalt_len_pc(domain_len)// "real" salt;// "real" salt
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// iteration
		u8 iter_pos = generatedBuf[3];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10));
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_655331);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tc_t tc = (tc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = tc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = tc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_TRUECRYPT_1K - 1);
		// "TRUE"// "TRUE"tc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 16;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 16;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.itoa64_to_int(hash_pos[0]) << 0 | ModernizedCProgram.itoa64_to_int(hash_pos[1]) << 6 | ModernizedCProgram.itoa64_to_int(hash_pos[2]) << 12 | ModernizedCProgram.itoa64_to_int(hash_pos[3]) << 18;
		digest[1] = ModernizedCProgram.itoa64_to_int(hash_pos[4]) << 0 | ModernizedCProgram.itoa64_to_int(hash_pos[5]) << 6 | ModernizedCProgram.itoa64_to_int(hash_pos[6]) << 12 | ModernizedCProgram.itoa64_to_int(hash_pos[7]) << 18;
		digest[2] = ModernizedCProgram.itoa64_to_int(hash_pos[8]) << 0 | ModernizedCProgram.itoa64_to_int(hash_pos[9]) << 6 | ModernizedCProgram.itoa64_to_int(hash_pos[10]) << 12 | ModernizedCProgram.itoa64_to_int(hash_pos[11]) << 18;
		digest[3] = ModernizedCProgram.itoa64_to_int(hash_pos[12]) << 0 | ModernizedCProgram.itoa64_to_int(hash_pos[13]) << 6 | ModernizedCProgram.itoa64_to_int(hash_pos[14]) << 12 | ModernizedCProgram.itoa64_to_int(hash_pos[15]) << 18;
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		// store for encoder// store for encoderdigest[4] = digest[0];
		digest[5] = digest[1];
		digest[6] = digest[2];
		digest[7] = digest[3];
		digest[0] &=  -1024;
		digest[1] &=  -1024;
		digest[2] &=  -1024;
		digest[3] &=  -1024;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_AXCRYPT_SHA1;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 14;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 40;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = 0;
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = 0;
		return (parser_rc.PARSER_OK);
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_OTM_SHA256// sig;// sig
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 10;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		// iter// itergeneratedSep[1] = (byte)':';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// salt// saltgeneratedSep[2] = (byte)':';
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 16;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// hash// hashgeneratedSep[3] = (byte)':';
		Object[] generatedLen = token.getLen();
		generatedLen[3] = 44;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		salt.setSalt_iter(iter - 1)// salt;// salt
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, salt_pos, salt_len);
		salt.setSalt_len(salt_len)// hash;// hash
		u8 hash_pos = generatedBuf[3];
		int hash_len = generatedLen[3];
		u8[] tmp_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest_buf, tmp_buf, 32);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pdf_t pdf = (pdf_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(13);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PDF;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 2;
		generatedLen_max[3] = 2;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[4] = 1;
		generatedLen_max[4] = 6;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[5] = 1;
		generatedLen_max[5] = 1;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[6] = 2;
		generatedLen_max[6] = 2;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[7] = 32;
		generatedLen_max[7] = 32;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[8] = 2;
		generatedLen_max[8] = 2;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[9] = 64;
		generatedLen_max[9] = 64;
		generatedSep[9] = (byte)'*';
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[10] = 2;
		generatedLen_max[10] = 2;
		generatedSep[10] = (byte)'*';
		generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[11] = 64;
		generatedLen_max[11] = 64;
		generatedSep[11] = (byte)':';
		generatedAttr[11] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[12] = 10;
		generatedLen_max[12] = 10;
		generatedSep[12] = (byte)'*';
		generatedAttr[12] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 V_pos = generatedBuf[1];
		u8 R_pos = generatedBuf[2];
		u8 bits_pos = generatedBuf[3];
		u8 P_pos = generatedBuf[4];
		u8 enc_md_pos = generatedBuf[5];
		u8 id_len_pos = generatedBuf[6];
		u8 id_buf_pos = generatedBuf[7];
		u8 u_len_pos = generatedBuf[8];
		u8 u_buf_pos = generatedBuf[9];
		u8 o_len_pos = generatedBuf[10];
		u8 o_buf_pos = generatedBuf[11];
		u8[] rc4key_pos = generatedBuf[12];
		// validate data
		int V = /*Error: Function owner not recognized*/strtol((byte)V_pos, (null), 10);
		int R = /*Error: Function owner not recognized*/strtol((byte)R_pos, (null), 10);
		int P = /*Error: Function owner not recognized*/strtol((byte)P_pos, (null), 10);
		if (V != 1) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (R != 2) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int enc_md = /*Error: Function owner not recognized*/strtol((byte)enc_md_pos, (null), 10);
		if ((enc_md != 0) && (enc_md != 1)) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int id_len = /*Error: Function owner not recognized*/strtol((byte)id_len_pos, (null), 10);
		int u_len = /*Error: Function owner not recognized*/strtol((byte)u_len_pos, (null), 10);
		int o_len = /*Error: Function owner not recognized*/strtol((byte)o_len_pos, (null), 10);
		if (id_len != 16) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (u_len != 32) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (o_len != 32) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		int bits = /*Error: Function owner not recognized*/strtol((byte)bits_pos, (null), 10);
		if (bits != 40) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		// copy data to esalt
		pdf.setV(V);
		pdf.setR(R);
		pdf.setP(P);
		pdf.setEnc_md(enc_md);
		Object[] generatedId_buf = pdf.getId_buf();
		generatedId_buf[0] = ModernizedCProgram.hex_to_u32(id_buf_pos + 0);
		generatedId_buf[1] = ModernizedCProgram.hex_to_u32(id_buf_pos + 8);
		generatedId_buf[2] = ModernizedCProgram.hex_to_u32(id_buf_pos + 16);
		generatedId_buf[3] = ModernizedCProgram.hex_to_u32(id_buf_pos + 24);
		pdf.setId_len(id_len);
		Object[] generatedU_buf = pdf.getU_buf();
		generatedU_buf[0] = ModernizedCProgram.hex_to_u32(u_buf_pos + 0);
		generatedU_buf[1] = ModernizedCProgram.hex_to_u32(u_buf_pos + 8);
		generatedU_buf[2] = ModernizedCProgram.hex_to_u32(u_buf_pos + 16);
		generatedU_buf[3] = ModernizedCProgram.hex_to_u32(u_buf_pos + 24);
		generatedU_buf[4] = ModernizedCProgram.hex_to_u32(u_buf_pos + 32);
		generatedU_buf[5] = ModernizedCProgram.hex_to_u32(u_buf_pos + 40);
		generatedU_buf[6] = ModernizedCProgram.hex_to_u32(u_buf_pos + 48);
		generatedU_buf[7] = ModernizedCProgram.hex_to_u32(u_buf_pos + 56);
		pdf.setU_len(u_len);
		Object[] generatedO_buf = pdf.getO_buf();
		generatedO_buf[0] = ModernizedCProgram.hex_to_u32(o_buf_pos + 0);
		generatedO_buf[1] = ModernizedCProgram.hex_to_u32(o_buf_pos + 8);
		generatedO_buf[2] = ModernizedCProgram.hex_to_u32(o_buf_pos + 16);
		generatedO_buf[3] = ModernizedCProgram.hex_to_u32(o_buf_pos + 24);
		generatedO_buf[4] = ModernizedCProgram.hex_to_u32(o_buf_pos + 32);
		generatedO_buf[5] = ModernizedCProgram.hex_to_u32(o_buf_pos + 40);
		generatedO_buf[6] = ModernizedCProgram.hex_to_u32(o_buf_pos + 48);
		generatedO_buf[7] = ModernizedCProgram.hex_to_u32(o_buf_pos + 56);
		pdf.setO_len(o_len);
		Object[] generatedRc4key = pdf.getRc4key();
		generatedRc4key[1] = 0;
		generatedRc4key[0] = 0;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[0]) << 28;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[1]) << 24;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[2]) << 20;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[3]) << 16;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[4]) << 12;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[5]) << 8;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[6]) << 4;
		generatedRc4key[0] |=  ModernizedCProgram.hex_convert(rc4key_pos[7]) << 0;
		generatedRc4key[1] |=  ModernizedCProgram.hex_convert(rc4key_pos[8]) << 28;
		generatedRc4key[1] |=  ModernizedCProgram.hex_convert(rc4key_pos[9]) << 24;
		generatedRc4key[0] = ModernizedCProgram.byte_swap_32(generatedRc4key[0]);
		generatedRc4key[1] = ModernizedCProgram.byte_swap_32(generatedRc4key[1])// we use ID for salt, maybe needs to change, we will see...;// we use ID for salt, maybe needs to change, we will see...
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedId_buf[0];
		generatedSalt_buf[1] = generatedId_buf[1];
		generatedSalt_buf[2] = generatedId_buf[2];
		generatedSalt_buf[3] = generatedId_buf[3];
		generatedSalt_buf[4] = generatedU_buf[0];
		generatedSalt_buf[5] = generatedU_buf[1];
		generatedSalt_buf[6] = generatedO_buf[0];
		generatedSalt_buf[7] = generatedO_buf[1];
		int generatedId_len = pdf.getId_len();
		salt.setSalt_len(generatedId_len + 16);
		digest[0] = generatedRc4key[0];
		digest[1] = generatedRc4key[1];
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MS_DRSR;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 11;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 11;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)',';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen_min[1] = 20;
		generatedLen_max[1] = 20;
		generatedSep[1] = (byte)',';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedSep[2] = (byte)',';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[3] = 64;
		generatedLen_max[3] = 64;
		generatedSep[3] = (byte)',';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// salt
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_pos + 16) & -1024;
		generatedSalt_buf[3] = 0;
		salt.setSalt_len(salt_len / 2)// iter;// iter
		u8 iter_pos = generatedBuf[2];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10) - -1024)// hash;// hash
		u8 hash_pos = generatedBuf[3];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_200000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(2048);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha1_t pbkdf2_sha1 = (pbkdf2_sha1_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_PBKDF2_SHA1;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 4;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 4;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)':';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)':';
		generatedLen_min[2] = ((0 * 8) / 6) + 0;
		generatedLen_max[2] = ((256 * 8) / 6) + 3;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		generatedSep[3] = (byte)':';
		generatedLen_min[3] = 16;
		generatedLen_max[3] = 256;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		u8[] tmp_buf = new u8();
		int tmp_len;
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		salt.setSalt_iter(iter - 1)// salt;// salt
		u8 salt_pos = generatedBuf[2];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[2];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, salt_pos, salt_len, tmp_buf);
		if (tmp_len > 256) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf = pbkdf2_sha1.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, tmp_buf, tmp_len);
		salt.setSalt_len(tmp_len);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_buf[4] = generatedSalt_iter// hash;// hash
		u8 hash_pos = generatedBuf[3];
		int hash_len = generatedLen[3];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(tmp_buf, 0, /*Error: sizeof expression not supported yet*/);
		tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hash_pos, hash_len, tmp_buf);
		if (tmp_len < 16) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, tmp_buf, 16);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		krb5pa_18_t krb5pa = (krb5pa_18_t)esalt_buf;
		token_t token = new token_t();
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_KRB5PA;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 11;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE/**
		   * $krb5pa$18$*user*realm*$enc_timestamp+checksum
		   */;
		// assume no signature foundif (line_len < 11) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// assume $krb5pa$18$user$realm$enc_timestamp+checksum// assume $krb5pa$18$user$realm$enc_timestamp+checksumtoken.setToken_cnt(4);
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 512;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 512;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 104;
		generatedLen_max[3] = 112;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		u8 user_pos = new u8();
		u8 domain_pos = new u8();
		u8[] data_pos = new u8();
		u8 checksum_pos = new u8();
		int user_len;
		int domain_len;
		int data_len;
		int account_info_len;
		Object[] generatedBuf = token.getBuf();
		user_pos = generatedBuf[1];
		user_len = generatedLen[1];
		Object[] generatedUser = krb5pa.getUser();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedUser, user_pos, user_len);
		domain_pos = generatedBuf[2];
		domain_len = generatedLen[2];
		Object[] generatedDomain = krb5pa.getDomain();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedDomain, domain_pos, domain_len);
		data_pos = generatedBuf[3];
		data_len = generatedLen[3];
		account_info_len = generatedLen[2] + generatedLen[1];
		Object[] generatedAccount_info = krb5pa.getAccount_info();
		u8 account_info_ptr = (u8)generatedAccount_info;
		// domain must be uppercaseu8[] domain = new u8();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(domain, domain_pos, domain_len);
		ModernizedCProgram.uppercase(domain, domain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(account_info_ptr, domain, domain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(account_info_ptr + domain_len, user_pos, user_len);
		krb5pa.setAccount_info_len(account_info_len);
		// Split checksum// Split checksumchecksum_pos = data_pos + data_len - 24;
		data_len = data_len - 24;
		Object[] generatedChecksum = krb5pa.getChecksum();
		// hmac-sha1 is reduced to 12 bytes// hmac-sha1 is reduced to 12 bytesgeneratedChecksum[0] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 0));
		generatedChecksum[1] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 8));
		generatedChecksum[2] = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32(checksum_pos + 16));
		Object[] generatedEnc_timestamp = krb5pa.getEnc_timestamp();
		u8 edata_ptr = (u8)generatedEnc_timestamp;
		for (int i = 0;
		 i < data_len; i += 2) {
			u8 p0 = data_pos[i + 0];
			u8 p1 = data_pos[i + 1];
			edata_ptr++ = ModernizedCProgram.hex_convert(p1) << 0 | ModernizedCProgram.hex_convert(p0) << 4;
		}
		krb5pa.setEnc_timestamp_len(data_len / 2);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedChecksum[0];
		generatedSalt_buf[1] = generatedChecksum[1];
		generatedSalt_buf[2] = generatedChecksum[2];
		salt.setSalt_iter(4096 - 1);
		digest[0] = generatedChecksum[0];
		digest[1] = generatedChecksum[1];
		digest[2] = generatedChecksum[2];
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 16;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 16;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 30;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = 0;
		digest[3] = 0;
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA512M_A;
			digest[1] -= sha2_64_constants.SHA512M_B;
			digest[2] -= sha2_64_constants.SHA512M_C;
			digest[3] -= sha2_64_constants.SHA512M_D;
			digest[4] -= sha2_64_constants.SHA512M_E;
			digest[5] -= sha2_64_constants.SHA512M_F;
			digest[6] -= sha2_64_constants.SHA512M_G;
			digest[7] -= sha2_64_constants.SHA512M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 16;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 16;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 128;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_64_constants.SHA512M_A;
			digest[1] -= sha2_64_constants.SHA512M_B;
			digest[2] -= sha2_64_constants.SHA512M_C;
			digest[3] -= sha2_64_constants.SHA512M_D;
			digest[4] -= sha2_64_constants.SHA512M_E;
			digest[5] -= sha2_64_constants.SHA512M_F;
			digest[6] -= sha2_64_constants.SHA512M_G;
			digest[7] -= sha2_64_constants.SHA512M_H;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		rar5_t rar5 = (rar5_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(7);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_RAR5;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 2;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 2;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 2;
		generatedLen_max[3] = 2;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[4] = (byte)'$';
		generatedLen_min[4] = 32;
		generatedLen_max[4] = 32;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[5] = (byte)'$';
		generatedLen_min[5] = 1;
		generatedLen_max[5] = 1;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[6] = (byte)'$';
		generatedLen_min[6] = 16;
		generatedLen_max[6] = 16;
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[3];
		u32 iterations = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		salt.setSalt_iter(((-1024 << iterations) + 32) - 1);
		if (iterations == 0) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		Object[] generatedSalt_sign = salt.getSalt_sign();
		generatedSalt_sign[0] = iterations// salt;// salt
		u8 salt_buf = generatedBuf[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_buf + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_buf + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_buf + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt_buf + 24);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3])// iv;// iv
		u8 iv = generatedBuf[4];
		Object[] generatedIv = rar5.getIv();
		generatedIv[0] = ModernizedCProgram.hex_to_u32(iv + 0);
		generatedIv[1] = ModernizedCProgram.hex_to_u32(iv + 8);
		generatedIv[2] = ModernizedCProgram.hex_to_u32(iv + 16);
		generatedIv[3] = ModernizedCProgram.hex_to_u32(iv + 24);
		generatedIv[0] = ModernizedCProgram.byte_swap_32(generatedIv[0]);
		generatedIv[1] = ModernizedCProgram.byte_swap_32(generatedIv[1]);
		generatedIv[2] = ModernizedCProgram.byte_swap_32(generatedIv[2]);
		generatedIv[3] = ModernizedCProgram.byte_swap_32(generatedIv[3]);
		salt.setSalt_len(16)// hash;// hash
		u8 pswcheck = generatedBuf[6];
		digest[0] = ModernizedCProgram.hex_to_u32(pswcheck + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(pswcheck + 8);
		digest[2] = 0;
		digest[3] = 0;
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		luks_t luks = (luks_t)esalt_buf;
		int keyslot_idx_sav = 0;
		int keyslot_idx = keyslot_idx_sav;
		keyslot_idx_sav++;
		if (line_len == 0) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		HCFILE fp = new HCFILE();
		if (fp.hc_fopen((byte)line_buf, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		luks_phdr hdr = new luks_phdr();
		size_t nread = fp.hc_fread(hdr, /*Error: sizeof expression not supported yet*/, 1);
		if (nread != 1) {
			fp.hc_fclose();
			return (parser_rc.PARSER_LUKS_FILE_SIZE);
		} 
		Object[] generatedMkDigest = hdr.getMkDigest();
		// copy digest which we're not using ;)u32[] mkDigest_ptr = (u32)generatedMkDigest;
		digest[0] = mkDigest_ptr[0];
		digest[1] = mkDigest_ptr[1];
		digest[2] = mkDigest_ptr[2];
		digest[3] = mkDigest_ptr[3];
		digest[4] = mkDigest_ptr[4];
		digest[5] = 0;
		digest[6] = 0;
		digest[7] = 0// verify the content;// verify the content
		byte[] luks_magic = new byte[]{(byte)'L', (byte)'U', (byte)'K', (byte)'S', -1024, -1024};
		;
		Object[] generatedMagic = hdr.getMagic();
		if (/*Error: Function owner not recognized*/memcmp(generatedMagic, luks_magic, 6) != 0) {
			fp.hc_fclose();
			return (parser_rc.PARSER_LUKS_MAGIC);
		} 
		Object generatedVersion = hdr.getVersion();
		if (ModernizedCProgram.byte_swap_16(generatedVersion) != 1) {
			fp.hc_fclose();
			return (parser_rc.PARSER_LUKS_VERSION);
		} 
		Object[] generatedCipherName = hdr.getCipherName();
		if (/*Error: Function owner not recognized*/strcmp(generatedCipherName, "aes") == 0) {
			luks.setCipher_type(hc_luks_cipher_type.HC_LUKS_CIPHER_TYPE_AES);
		}  else if (/*Error: Function owner not recognized*/strcmp(generatedCipherName, "serpent") == 0) {
			luks.setCipher_type(hc_luks_cipher_type.HC_LUKS_CIPHER_TYPE_SERPENT);
		}  else if (/*Error: Function owner not recognized*/strcmp(generatedCipherName, "twofish") == 0) {
			luks.setCipher_type(hc_luks_cipher_type.HC_LUKS_CIPHER_TYPE_TWOFISH);
		} else {
				fp.hc_fclose();
				return (parser_rc.PARSER_LUKS_CIPHER_TYPE);
		} 
		Object[] generatedCipherMode = hdr.getCipherMode();
		if (/*Error: Function owner not recognized*/strcmp(generatedCipherMode, "cbc-essiv:sha256") == 0) {
			luks.setCipher_mode(hc_luks_cipher_mode.HC_LUKS_CIPHER_MODE_CBC_ESSIV);
		}  else if (/*Error: Function owner not recognized*/strcmp(generatedCipherMode, "cbc-plain") == 0) {
			luks.setCipher_mode(hc_luks_cipher_mode.HC_LUKS_CIPHER_MODE_CBC_PLAIN);
		}  else if (/*Error: Function owner not recognized*/strcmp(generatedCipherMode, "cbc-plain64") == 0) {
			luks.setCipher_mode(hc_luks_cipher_mode.HC_LUKS_CIPHER_MODE_CBC_PLAIN);
		}  else if (/*Error: Function owner not recognized*/strcmp(generatedCipherMode, "xts-plain") == 0) {
			luks.setCipher_mode(hc_luks_cipher_mode.HC_LUKS_CIPHER_MODE_XTS_PLAIN);
		}  else if (/*Error: Function owner not recognized*/strcmp(generatedCipherMode, "xts-plain64") == 0) {
			luks.setCipher_mode(hc_luks_cipher_mode.HC_LUKS_CIPHER_MODE_XTS_PLAIN);
		} else {
				fp.hc_fclose();
				return (parser_rc.PARSER_LUKS_CIPHER_MODE);
		} 
		Object[] generatedHashSpec = hdr.getHashSpec();
		if (/*Error: Function owner not recognized*/strcmp(generatedHashSpec, "sha1") == 0) {
			luks.setHash_type(hc_luks_hash_type.HC_LUKS_HASH_TYPE_SHA1);
		}  else if (/*Error: Function owner not recognized*/strcmp(generatedHashSpec, "sha256") == 0) {
			luks.setHash_type(hc_luks_hash_type.HC_LUKS_HASH_TYPE_SHA256);
		}  else if (/*Error: Function owner not recognized*/strcmp(generatedHashSpec, "sha512") == 0) {
			luks.setHash_type(hc_luks_hash_type.HC_LUKS_HASH_TYPE_SHA512);
		}  else if (/*Error: Function owner not recognized*/strcmp(generatedHashSpec, "ripemd160") == 0) {
			luks.setHash_type(hc_luks_hash_type.HC_LUKS_HASH_TYPE_RIPEMD160);
		}  else if (/*Error: Function owner not recognized*/strcmp(generatedHashSpec, "whirlpool") == 0) {
			luks.setHash_type(hc_luks_hash_type.HC_LUKS_HASH_TYPE_WHIRLPOOL);
		} else {
				fp.hc_fclose();
				return (parser_rc.PARSER_LUKS_HASH_TYPE);
		} 
		Object generatedKeyBytes = hdr.getKeyBytes();
		u32 keyBytes = ModernizedCProgram.byte_swap_32(generatedKeyBytes);
		if (keyBytes == 16) {
			luks.setKey_size(hc_luks_key_size.HC_LUKS_KEY_SIZE_128);
		}  else if (keyBytes == 32) {
			luks.setKey_size(hc_luks_key_size.HC_LUKS_KEY_SIZE_256);
		}  else if (keyBytes == 64) {
			luks.setKey_size(hc_luks_key_size.HC_LUKS_KEY_SIZE_512);
		} else {
				fp.hc_fclose();
				return (parser_rc.PARSER_LUKS_KEY_SIZE);
		} 
		Object[] generatedKeyblock = hdr.getKeyblock();
		// verify the selected keyslot informationsu32 active = ModernizedCProgram.byte_swap_32(generatedKeyblock[keyslot_idx].getActive());
		u32 stripes = ModernizedCProgram.byte_swap_32(generatedKeyblock[keyslot_idx].getStripes());
		if (active != -1024) {
			fp.hc_fclose();
			return (parser_rc.PARSER_LUKS_KEY_DISABLED);
		} 
		if (stripes != 4000) {
			fp.hc_fclose();
			return (parser_rc.PARSER_LUKS_KEY_STRIPES);
		} 
		// configure the salt (not esalt)u32[] passwordSalt_ptr = (u32)generatedKeyblock[keyslot_idx].getPasswordSalt();
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = passwordSalt_ptr[0];
		generatedSalt_buf[1] = passwordSalt_ptr[1];
		generatedSalt_buf[2] = passwordSalt_ptr[2];
		generatedSalt_buf[3] = passwordSalt_ptr[3];
		generatedSalt_buf[4] = passwordSalt_ptr[4];
		generatedSalt_buf[5] = passwordSalt_ptr[5];
		generatedSalt_buf[6] = passwordSalt_ptr[6];
		generatedSalt_buf[7] = passwordSalt_ptr[7];
		salt.setSalt_len(32);
		u32 passwordIterations = ModernizedCProgram.byte_swap_32(generatedKeyblock[keyslot_idx].getPasswordIterations());
		salt.setSalt_iter(passwordIterations - 1)// Load AF data for this keyslot into esalt;// Load AF data for this keyslot into esalt
		u32 keyMaterialOffset = ModernizedCProgram.byte_swap_32(generatedKeyblock[keyslot_idx].getKeyMaterialOffset());
		int rc_seek1 = fp.hc_fseek(keyMaterialOffset * 512, 0);
		if (rc_seek1 == -1) {
			fp.hc_fclose();
			return (parser_rc.PARSER_LUKS_FILE_SIZE);
		} 
		Object[] generatedAf_src_buf = luks.getAf_src_buf();
		size_t nread2 = fp.hc_fread(generatedAf_src_buf, keyBytes, stripes);
		if (nread2 != stripes) {
			fp.hc_fclose();
			return (parser_rc.PARSER_LUKS_FILE_SIZE);
		} 
		Object generatedPayloadOffset = hdr.getPayloadOffset();
		// finally, copy some encrypted payload data for entropy checku32 payloadOffset = ModernizedCProgram.byte_swap_32(generatedPayloadOffset);
		int rc_seek2 = fp.hc_fseek(payloadOffset * 512, 0);
		if (rc_seek2 == -1) {
			fp.hc_fclose();
			return (parser_rc.PARSER_LUKS_FILE_SIZE);
		} 
		Object[] generatedCt_buf = luks.getCt_buf();
		size_t nread3 = fp.hc_fread(generatedCt_buf, /*Error: Unsupported expression*/, 128);
		if (nread3 != 128) {
			fp.hc_fclose();
			return (parser_rc.PARSER_LUKS_FILE_SIZE);
		} 
		// that should be it, close the fp// that should be it, close the fpfp.hc_fclose();
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		pbkdf2_sha512_t pbkdf2_sha512 = (pbkdf2_sha512_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SHA512GRUB;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 19;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 6;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'.';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 256;
		generatedSep[2] = (byte)'.';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[3] = 128;
		generatedLen_max[3] = 128;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[3];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2] / 2;
		Object[] generatedSalt_buf = pbkdf2_sha512.getSalt_buf();
		u8[] salt_buf_ptr = (u8)generatedSalt_buf;
		for (int i = 0;
		int j = 0;
		 i < salt_len; ) {
			salt_buf_ptr[i] = ModernizedCProgram.hex_to_u8(salt_pos + j);
		}
		salt_buf_ptr[salt_len + 3] = -1024;
		salt_buf_ptr[salt_len + 4] = -1024;
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedSalt_buf[4];
		generatedSalt_buf[5] = generatedSalt_buf[5];
		generatedSalt_buf[6] = generatedSalt_buf[6];
		generatedSalt_buf[7] = generatedSalt_buf[7];
		salt.setSalt_len(salt_len);
		u8 iter_pos = generatedBuf[1];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10) - 1);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'$';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[1] = 16;
		generatedLen_max[1] = 16;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer/**
			   * salt
			   */);
		} 
		Object[] generatedBuf = token.getBuf();
		u8[] salt_pos = generatedBuf[0];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[0];
		int user_len = 0;
		for (int i = 0;
		 i < salt_len; i++) {
			if (salt_pos[i] == (byte)' ') {
				continue;
			} 
			user_len++;
		}
		// SAP user names cannot be longer than 12 charactersif (user_len > 12) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// SAP user name cannot start with ! or ?if (salt_pos[0] == (byte)'!' || salt_pos[0] == (byte)'?') {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH/**
			   * hash
			   */);
		} 
		u8 hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = 0;
		digest[3] = 0;
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 56;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		int hash_len = generatedLen[0];
		if (hash_len != 56) {
			return (parser_rc.PARSER_GLOBAL_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		if (line_len == 0) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		HCFILE fp = new HCFILE();
		if (fp.hc_fopen((byte)line_buf, "rb") == 0) {
			return (parser_rc.PARSER_HASH_FILE);
		} 
		psafe3_t in = new psafe3_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(in, 0, /*Error: Unsupported expression*/);
		size_t n = fp.hc_fread(in, /*Error: Unsupported expression*/, 1);
		fp.hc_fclose();
		if (n != 1) {
			return (parser_rc.PARSER_PSAFE3_FILE_SIZE);
		} 
		Object[] generatedSignature = in.getSignature();
		if (/*Error: Function owner not recognized*/memcmp(ModernizedCProgram.SIGNATURE_PSAFE3, generatedSignature, 4) != 0) {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		Object generatedIterations = in.getIterations();
		salt.setSalt_iter(generatedIterations + 1);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedSalt_buf[4];
		generatedSalt_buf[5] = generatedSalt_buf[5];
		generatedSalt_buf[6] = generatedSalt_buf[6];
		generatedSalt_buf[7] = generatedSalt_buf[7];
		salt.setSalt_len(32);
		Object[] generatedHash_buf = in.getHash_buf();
		digest[0] = generatedHash_buf[0];
		digest[1] = generatedHash_buf[1];
		digest[2] = generatedHash_buf[2];
		digest[3] = generatedHash_buf[3];
		digest[4] = generatedHash_buf[4];
		digest[5] = generatedHash_buf[5];
		digest[6] = generatedHash_buf[6];
		digest[7] = generatedHash_buf[7];
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 8;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 8;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[1] = hashconfig.getSeparator();
		generatedLen_min[1] = 8;
		generatedLen_max[1] = 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = 0;
		digest[2] = 0;
		digest[3] = 0;
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = 0;
		digest[2] = 0;
		digest[3] = 0;
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md4_constants.MD4M_A;
			digest[1] -= md4_constants.MD4M_B;
			digest[2] -= md4_constants.MD4M_C;
			digest[3] -= md4_constants.MD4M_D;
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MYWALLET;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 12;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 6;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 64;
		generatedLen_max[2] = 65536;
		generatedSep[2] = (byte)'$';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer/**
			   * salt
			   */);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt_pos + 24);
		generatedSalt_buf[0] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[0]);
		generatedSalt_buf[1] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[1]);
		generatedSalt_buf[2] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[2]);
		generatedSalt_buf[3] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[3])// this is actually the CT, which is also the hash later (if matched);// this is actually the CT, which is also the hash later (if matched)
		generatedSalt_buf[4] = ModernizedCProgram.hex_to_u32(salt_pos + 32);
		generatedSalt_buf[5] = ModernizedCProgram.hex_to_u32(salt_pos + 40);
		generatedSalt_buf[6] = ModernizedCProgram.hex_to_u32(salt_pos + 48);
		generatedSalt_buf[7] = ModernizedCProgram.hex_to_u32(salt_pos + 56);
		generatedSalt_buf[4] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[4]);
		generatedSalt_buf[5] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[5]);
		generatedSalt_buf[6] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[6]);
		generatedSalt_buf[7] = ModernizedCProgram.byte_swap_32(generatedSalt_buf[7]);
		// note we need to fix this to 16 in kernel// note we need to fix this to 16 in kernelsalt.setSalt_len(32);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_MYWALLET - 1/**
		   * digest buf
		   */);
		digest[0] = generatedSalt_buf[4];
		digest[1] = generatedSalt_buf[5];
		digest[2] = generatedSalt_buf[6];
		digest[3] = generatedSalt_buf[7];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		keepass_t keepass = (keepass_t)esalt_buf;
		boolean is_keyfile_present = false;
		if (line_len < 128) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		if ((line_buf[line_len - (64 + 1 + 2 + 1 + 2)] == (byte)'*') && (line_buf[line_len - (64 + 1 + 2 + 1 + 1)] == (byte)'1') && (line_buf[line_len - (64 + 1 + 2 + 1 + 0)] == (byte)'*')) {
			is_keyfile_present = true;
		} 
		token_t token = new token_t();
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_KEEPASS;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 9;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'*';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 1;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 8;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 1;
		generatedLen_max[3] = 3;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		if (line_len < 16) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 version = line_buf[10];
		if (version == (byte)'1') {
			token.setToken_cnt(11);
			generatedSep[4] = (byte)'*';
			generatedLen_min[4] = 32;
			generatedLen_max[4] = 32;
			generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[5] = (byte)'*';
			generatedLen_min[5] = 64;
			generatedLen_max[5] = 64;
			generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[6] = (byte)'*';
			generatedLen_min[6] = 32;
			generatedLen_max[6] = 32;
			generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[7] = (byte)'*';
			generatedLen_min[7] = 64;
			generatedLen_max[7] = 64;
			generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[8] = (byte)'*';
			generatedLen_min[8] = 1;
			generatedLen_max[8] = 1;
			generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
			generatedSep[9] = (byte)'*';
			generatedLen_min[9] = 1;
			generatedLen_max[9] = 6;
			generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
			generatedSep[10] = (byte)'*';
			generatedLen_min[10] = 2;
			generatedLen_max[10] = 600000;
			generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			if (is_keyfile_present == true) {
				token.setToken_cnt(14);
				generatedSep[11] = (byte)'*';
				generatedLen_min[11] = 1;
				generatedLen_max[11] = 1;
				generatedAttr[11] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
				generatedSep[12] = (byte)'*';
				generatedLen_min[12] = 2;
				generatedLen_max[12] = 2;
				generatedAttr[12] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
				generatedSep[13] = (byte)'*';
				generatedLen_min[13] = 64;
				generatedLen_max[13] = 64;
				generatedAttr[13] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			} 
		}  else if (version == (byte)'2') {
			token.setToken_cnt(9);
			generatedSep[4] = (byte)'*';
			generatedLen_min[4] = 64;
			generatedLen_max[4] = 64;
			generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[5] = (byte)'*';
			generatedLen_min[5] = 64;
			generatedLen_max[5] = 64;
			generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[6] = (byte)'*';
			generatedLen_min[6] = 32;
			generatedLen_max[6] = 32;
			generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[7] = (byte)'*';
			generatedLen_min[7] = 64;
			generatedLen_max[7] = 64;
			generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedSep[8] = (byte)'*';
			generatedLen_min[8] = 64;
			generatedLen_max[8] = 64;
			generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			if (is_keyfile_present == true) {
				token.setToken_cnt(12);
				generatedSep[9] = (byte)'*';
				generatedLen_min[9] = 1;
				generatedLen_max[9] = 1;
				generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
				generatedSep[10] = (byte)'*';
				generatedLen_min[10] = 2;
				generatedLen_max[10] = 2;
				generatedAttr[10] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
				generatedSep[11] = (byte)'*';
				generatedLen_min[11] = 64;
				generatedLen_max[11] = 64;
				generatedAttr[11] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
			} 
		} else {
				return (parser_rc.PARSER_SALT_VALUE);
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// version
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		keepass.setVersion(ModernizedCProgram.hc_strtoul((byte)version_pos, (null), 10))// iter;// iter
		u8 rounds_pos = generatedBuf[2];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)rounds_pos, (null), 10))// algo;// algo
		u8 algorithm_pos = generatedBuf[3];
		keepass.setAlgorithm(ModernizedCProgram.hc_strtoul((byte)algorithm_pos, (null), 10))// final_random_seed_pos;// final_random_seed_pos
		u8[] final_random_seed_pos = generatedBuf[4];
		Object[] generatedFinal_random_seed = keepass.getFinal_random_seed();
		generatedFinal_random_seed[0] = ModernizedCProgram.hex_to_u32((u8)final_random_seed_pos[0]);
		generatedFinal_random_seed[1] = ModernizedCProgram.hex_to_u32((u8)final_random_seed_pos[8]);
		generatedFinal_random_seed[2] = ModernizedCProgram.hex_to_u32((u8)final_random_seed_pos[16]);
		generatedFinal_random_seed[3] = ModernizedCProgram.hex_to_u32((u8)final_random_seed_pos[24]);
		generatedFinal_random_seed[0] = ModernizedCProgram.byte_swap_32(generatedFinal_random_seed[0]);
		generatedFinal_random_seed[1] = ModernizedCProgram.byte_swap_32(generatedFinal_random_seed[1]);
		generatedFinal_random_seed[2] = ModernizedCProgram.byte_swap_32(generatedFinal_random_seed[2]);
		generatedFinal_random_seed[3] = ModernizedCProgram.byte_swap_32(generatedFinal_random_seed[3]);
		Object generatedVersion = keepass.getVersion();
		if (generatedVersion == 2) {
			generatedFinal_random_seed[4] = ModernizedCProgram.hex_to_u32((u8)final_random_seed_pos[32]);
			generatedFinal_random_seed[5] = ModernizedCProgram.hex_to_u32((u8)final_random_seed_pos[40]);
			generatedFinal_random_seed[6] = ModernizedCProgram.hex_to_u32((u8)final_random_seed_pos[48]);
			generatedFinal_random_seed[7] = ModernizedCProgram.hex_to_u32((u8)final_random_seed_pos[56]);
			generatedFinal_random_seed[4] = ModernizedCProgram.byte_swap_32(generatedFinal_random_seed[4]);
			generatedFinal_random_seed[5] = ModernizedCProgram.byte_swap_32(generatedFinal_random_seed[5]);
			generatedFinal_random_seed[6] = ModernizedCProgram.byte_swap_32(generatedFinal_random_seed[6]);
			generatedFinal_random_seed[7] = ModernizedCProgram.byte_swap_32(generatedFinal_random_seed[7]);
		} 
		// transf_random_seed_posu8[] transf_random_seed_pos = generatedBuf[5];
		Object[] generatedTransf_random_seed = keepass.getTransf_random_seed();
		generatedTransf_random_seed[0] = ModernizedCProgram.hex_to_u32((u8)transf_random_seed_pos[0]);
		generatedTransf_random_seed[1] = ModernizedCProgram.hex_to_u32((u8)transf_random_seed_pos[8]);
		generatedTransf_random_seed[2] = ModernizedCProgram.hex_to_u32((u8)transf_random_seed_pos[16]);
		generatedTransf_random_seed[3] = ModernizedCProgram.hex_to_u32((u8)transf_random_seed_pos[24]);
		generatedTransf_random_seed[4] = ModernizedCProgram.hex_to_u32((u8)transf_random_seed_pos[32]);
		generatedTransf_random_seed[5] = ModernizedCProgram.hex_to_u32((u8)transf_random_seed_pos[40]);
		generatedTransf_random_seed[6] = ModernizedCProgram.hex_to_u32((u8)transf_random_seed_pos[48]);
		generatedTransf_random_seed[7] = ModernizedCProgram.hex_to_u32((u8)transf_random_seed_pos[56]);
		generatedTransf_random_seed[0] = ModernizedCProgram.byte_swap_32(generatedTransf_random_seed[0]);
		generatedTransf_random_seed[1] = ModernizedCProgram.byte_swap_32(generatedTransf_random_seed[1]);
		generatedTransf_random_seed[2] = ModernizedCProgram.byte_swap_32(generatedTransf_random_seed[2]);
		generatedTransf_random_seed[3] = ModernizedCProgram.byte_swap_32(generatedTransf_random_seed[3]);
		generatedTransf_random_seed[4] = ModernizedCProgram.byte_swap_32(generatedTransf_random_seed[4]);
		generatedTransf_random_seed[5] = ModernizedCProgram.byte_swap_32(generatedTransf_random_seed[5]);
		generatedTransf_random_seed[6] = ModernizedCProgram.byte_swap_32(generatedTransf_random_seed[6]);
		generatedTransf_random_seed[7] = ModernizedCProgram.byte_swap_32(generatedTransf_random_seed[7])// enc_iv_pos;// enc_iv_pos
		u8[] enc_iv_pos = generatedBuf[6];
		Object[] generatedEnc_iv = keepass.getEnc_iv();
		generatedEnc_iv[0] = ModernizedCProgram.hex_to_u32((u8)enc_iv_pos[0]);
		generatedEnc_iv[1] = ModernizedCProgram.hex_to_u32((u8)enc_iv_pos[8]);
		generatedEnc_iv[2] = ModernizedCProgram.hex_to_u32((u8)enc_iv_pos[16]);
		generatedEnc_iv[3] = ModernizedCProgram.hex_to_u32((u8)enc_iv_pos[24]);
		generatedEnc_iv[0] = ModernizedCProgram.byte_swap_32(generatedEnc_iv[0]);
		generatedEnc_iv[1] = ModernizedCProgram.byte_swap_32(generatedEnc_iv[1]);
		generatedEnc_iv[2] = ModernizedCProgram.byte_swap_32(generatedEnc_iv[2]);
		generatedEnc_iv[3] = ModernizedCProgram.byte_swap_32(generatedEnc_iv[3]);
		u8[] keyfile_pos = (null);
		Object[] generatedContents_hash = keepass.getContents_hash();
		Object[] generatedLen = token.getLen();
		Object[] generatedContents = keepass.getContents();
		Object[] generatedExpected_bytes = keepass.getExpected_bytes();
		if (generatedVersion == 1) {
			u8 contents_hash_pos = generatedBuf[7];
			generatedContents_hash[0] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[0]);
			generatedContents_hash[1] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[8]);
			generatedContents_hash[2] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[16]);
			generatedContents_hash[3] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[24]);
			generatedContents_hash[4] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[32]);
			generatedContents_hash[5] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[40]);
			generatedContents_hash[6] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[48]);
			generatedContents_hash[7] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[56]);
			generatedContents_hash[0] = ModernizedCProgram.byte_swap_32(generatedContents_hash[0]);
			generatedContents_hash[1] = ModernizedCProgram.byte_swap_32(generatedContents_hash[1]);
			generatedContents_hash[2] = ModernizedCProgram.byte_swap_32(generatedContents_hash[2]);
			generatedContents_hash[3] = ModernizedCProgram.byte_swap_32(generatedContents_hash[3]);
			generatedContents_hash[4] = ModernizedCProgram.byte_swap_32(generatedContents_hash[4]);
			generatedContents_hash[5] = ModernizedCProgram.byte_swap_32(generatedContents_hash[5]);
			generatedContents_hash[6] = ModernizedCProgram.byte_swap_32(generatedContents_hash[6]);
			generatedContents_hash[7] = ModernizedCProgram.byte_swap_32(generatedContents_hash[7]);
			u8 contents_pos = generatedBuf[10];
			int contents_len = generatedLen[10];
			keepass.setContents_len(contents_len / 2);
			for (int i = 0;
			int j = 0;
			 j < contents_len; ) {
				generatedContents[i] = ModernizedCProgram.hex_to_u32((u8)contents_pos[j]);
				generatedContents[i] = ModernizedCProgram.byte_swap_32(generatedContents[i]);
			}
			if (is_keyfile_present == true) {
				keyfile_pos = generatedBuf[13];
			} 
		}  else if (generatedVersion == 2) {
			u8 expected_bytes_pos = generatedBuf[7];
			generatedExpected_bytes[0] = ModernizedCProgram.hex_to_u32((u8)expected_bytes_pos[0]);
			generatedExpected_bytes[1] = ModernizedCProgram.hex_to_u32((u8)expected_bytes_pos[8]);
			generatedExpected_bytes[2] = ModernizedCProgram.hex_to_u32((u8)expected_bytes_pos[16]);
			generatedExpected_bytes[3] = ModernizedCProgram.hex_to_u32((u8)expected_bytes_pos[24]);
			generatedExpected_bytes[4] = ModernizedCProgram.hex_to_u32((u8)expected_bytes_pos[32]);
			generatedExpected_bytes[5] = ModernizedCProgram.hex_to_u32((u8)expected_bytes_pos[40]);
			generatedExpected_bytes[6] = ModernizedCProgram.hex_to_u32((u8)expected_bytes_pos[48]);
			generatedExpected_bytes[7] = ModernizedCProgram.hex_to_u32((u8)expected_bytes_pos[56]);
			generatedExpected_bytes[0] = ModernizedCProgram.byte_swap_32(generatedExpected_bytes[0]);
			generatedExpected_bytes[1] = ModernizedCProgram.byte_swap_32(generatedExpected_bytes[1]);
			generatedExpected_bytes[2] = ModernizedCProgram.byte_swap_32(generatedExpected_bytes[2]);
			generatedExpected_bytes[3] = ModernizedCProgram.byte_swap_32(generatedExpected_bytes[3]);
			generatedExpected_bytes[4] = ModernizedCProgram.byte_swap_32(generatedExpected_bytes[4]);
			generatedExpected_bytes[5] = ModernizedCProgram.byte_swap_32(generatedExpected_bytes[5]);
			generatedExpected_bytes[6] = ModernizedCProgram.byte_swap_32(generatedExpected_bytes[6]);
			generatedExpected_bytes[7] = ModernizedCProgram.byte_swap_32(generatedExpected_bytes[7]);
			u8 contents_hash_pos = generatedBuf[8];
			generatedContents_hash[0] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[0]);
			generatedContents_hash[1] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[8]);
			generatedContents_hash[2] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[16]);
			generatedContents_hash[3] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[24]);
			generatedContents_hash[4] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[32]);
			generatedContents_hash[5] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[40]);
			generatedContents_hash[6] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[48]);
			generatedContents_hash[7] = ModernizedCProgram.hex_to_u32((u8)contents_hash_pos[56]);
			generatedContents_hash[0] = ModernizedCProgram.byte_swap_32(generatedContents_hash[0]);
			generatedContents_hash[1] = ModernizedCProgram.byte_swap_32(generatedContents_hash[1]);
			generatedContents_hash[2] = ModernizedCProgram.byte_swap_32(generatedContents_hash[2]);
			generatedContents_hash[3] = ModernizedCProgram.byte_swap_32(generatedContents_hash[3]);
			generatedContents_hash[4] = ModernizedCProgram.byte_swap_32(generatedContents_hash[4]);
			generatedContents_hash[5] = ModernizedCProgram.byte_swap_32(generatedContents_hash[5]);
			generatedContents_hash[6] = ModernizedCProgram.byte_swap_32(generatedContents_hash[6]);
			generatedContents_hash[7] = ModernizedCProgram.byte_swap_32(generatedContents_hash[7]);
			if (is_keyfile_present == true) {
				keyfile_pos = generatedBuf[11];
			} 
		} 
		// contents_hash
		Object[] generatedKeyfile = keepass.getKeyfile();
		if (is_keyfile_present == true) {
			keepass.setKeyfile_len(32);
			generatedKeyfile[0] = ModernizedCProgram.hex_to_u32((u8)keyfile_pos[0]);
			generatedKeyfile[1] = ModernizedCProgram.hex_to_u32((u8)keyfile_pos[8]);
			generatedKeyfile[2] = ModernizedCProgram.hex_to_u32((u8)keyfile_pos[16]);
			generatedKeyfile[3] = ModernizedCProgram.hex_to_u32((u8)keyfile_pos[24]);
			generatedKeyfile[4] = ModernizedCProgram.hex_to_u32((u8)keyfile_pos[32]);
			generatedKeyfile[5] = ModernizedCProgram.hex_to_u32((u8)keyfile_pos[40]);
			generatedKeyfile[6] = ModernizedCProgram.hex_to_u32((u8)keyfile_pos[48]);
			generatedKeyfile[7] = ModernizedCProgram.hex_to_u32((u8)keyfile_pos[56]);
			generatedKeyfile[0] = ModernizedCProgram.byte_swap_32(generatedKeyfile[0]);
			generatedKeyfile[1] = ModernizedCProgram.byte_swap_32(generatedKeyfile[1]);
			generatedKeyfile[2] = ModernizedCProgram.byte_swap_32(generatedKeyfile[2]);
			generatedKeyfile[3] = ModernizedCProgram.byte_swap_32(generatedKeyfile[3]);
			generatedKeyfile[4] = ModernizedCProgram.byte_swap_32(generatedKeyfile[4]);
			generatedKeyfile[5] = ModernizedCProgram.byte_swap_32(generatedKeyfile[5]);
			generatedKeyfile[6] = ModernizedCProgram.byte_swap_32(generatedKeyfile[6]);
			generatedKeyfile[7] = ModernizedCProgram.byte_swap_32(generatedKeyfile[7]);
		} 
		if (generatedVersion == 1) {
			digest[0] = generatedContents_hash[0];
			digest[1] = generatedContents_hash[1];
			digest[2] = generatedContents_hash[2];
			digest[3] = generatedContents_hash[3];
		} else {
				digest[0] = generatedExpected_bytes[0];
				digest[1] = generatedExpected_bytes[1];
				digest[2] = generatedExpected_bytes[2];
				digest[3] = generatedExpected_bytes[3];
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedTransf_random_seed[0];
		generatedSalt_buf[1] = generatedTransf_random_seed[1];
		generatedSalt_buf[2] = generatedTransf_random_seed[2];
		generatedSalt_buf[3] = generatedTransf_random_seed[3];
		generatedSalt_buf[4] = generatedTransf_random_seed[4];
		generatedSalt_buf[5] = generatedTransf_random_seed[5];
		generatedSalt_buf[6] = generatedTransf_random_seed[6];
		generatedSalt_buf[7] = generatedTransf_random_seed[7];
		salt.setSalt_len(32);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MEDIAWIKI_B;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 3;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 32;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[2];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8[] salt_buf_ptr = (u8)generatedSalt_buf;
		salt_buf_ptr[salt_len] = -1024;
		salt.setSalt_len(salt_len + 1);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)':';
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 6;
		generatedSep[1] = (byte)':';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 32;
		generatedSep[2] = (byte)':';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		u8 iter_pos = generatedBuf[1];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10) - 1);
		u8 salt_pos = generatedBuf[2];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		dpapimk_t dpapimk = (dpapimk_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(10);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_DPAPIMK;
		Object[] generatedLen = token.getLen();
		// signature// signaturegeneratedLen[0] = 9;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		// version// versiongeneratedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 1;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'*';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// context// contextgeneratedLen_min[2] = 1;
		generatedLen_max[2] = 1;
		generatedSep[2] = (byte)'*';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// sid// sidgeneratedLen_min[3] = 10;
		generatedLen_max[3] = 60;
		generatedSep[3] = (byte)'*';
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// cipher// ciphergeneratedLen_min[4] = 4;
		generatedLen_max[4] = 6;
		generatedSep[4] = (byte)'*';
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// hash// hashgeneratedLen_min[5] = 4;
		generatedLen_max[5] = 6;
		generatedSep[5] = (byte)'*';
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		// iterations// iterationsgeneratedLen_min[6] = 1;
		generatedLen_max[6] = 6;
		generatedSep[6] = (byte)'*';
		generatedAttr[6] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// iv// ivgeneratedLen_min[7] = 32;
		generatedLen_max[7] = 32;
		generatedSep[7] = (byte)'*';
		generatedAttr[7] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		// content len// content lengeneratedLen_min[8] = 1;
		generatedLen_max[8] = 6;
		generatedSep[8] = (byte)'*';
		generatedAttr[8] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		// content// contentgeneratedLen_min[9] = 0;
		generatedLen_max[9] = 1024;
		generatedAttr[9] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 version_pos = generatedBuf[1];
		u8 context_pos = generatedBuf[2];
		u8[] SID_pos = generatedBuf[3];
		u8 rounds_pos = generatedBuf[6];
		u8[] iv_pos = generatedBuf[7];
		u8 contents_len_pos = generatedBuf[8];
		u8[] contents_pos = generatedBuf[9/**
		   * content verification
		   */];
		int version = ModernizedCProgram.hc_strtoul((byte)version_pos, (null), 10);
		int contents_len = ModernizedCProgram.hc_strtoul((byte)contents_len_pos, (null), 10);
		if (version == 1) {
			if (contents_len != 208) {
				return (parser_rc.PARSER_SALT_LENGTH);
			} 
		}  else if (version == 2) {
			if (contents_len != 288) {
				return (parser_rc.PARSER_SALT_LENGTH);
			} 
		} else {
				return (parser_rc.PARSER_SALT_VALUE);
		} 
		if (contents_len != generatedLen[9]) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		dpapimk.setContents_len(contents_len);
		dpapimk.setContext(ModernizedCProgram.hc_strtoul((byte)context_pos, (null), 10))// division by 4 should be fine because contents_len is either 208 or 288;// division by 4 should be fine because contents_len is either 208 or 288
		Object generatedContents_len = dpapimk.getContents_len();
		Object[] generatedContents = dpapimk.getContents();
		for (u32 i = 0;
		 i < generatedContents_len / 4; i++) {
			generatedContents[i] = ModernizedCProgram.hex_to_u32((u8)contents_pos[i * 8]);
			generatedContents[i] = ModernizedCProgram.byte_swap_32(generatedContents[i]);
		}
		// SIDint SID_len = generatedLen[3];
		u8[] SID_utf16le = new u8[]{0};
		for (int i = 0;
		 i < SID_len; i++) {
			SID_utf16le[i * 2] = SID_pos[i];
		}
		dpapimk.setSID_len((SID_len + 1) * /* Specific to DPAPI: needs trailing '\0' while computing hash */2);
		Object generatedSID_len = dpapimk.getSID_len();
		SID_utf16le[generatedSID_len] = -1024;
		Object[] generatedSID = dpapimk.getSID();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((u8)generatedSID, SID_utf16le, /*Error: sizeof expression not supported yet*/);
		for (u32 i = 0;
		 i < 32; i++) {
			generatedSID[i] = ModernizedCProgram.byte_swap_32(generatedSID[i]);
		}
		Object[] generatedIv = dpapimk.getIv();
		// iv// ivgeneratedIv[0] = ModernizedCProgram.hex_to_u32((u8)iv_pos[0]);
		generatedIv[1] = ModernizedCProgram.hex_to_u32((u8)iv_pos[8]);
		generatedIv[2] = ModernizedCProgram.hex_to_u32((u8)iv_pos[16]);
		generatedIv[3] = ModernizedCProgram.hex_to_u32((u8)iv_pos[24]);
		generatedIv[0] = ModernizedCProgram.byte_swap_32(generatedIv[0]);
		generatedIv[1] = ModernizedCProgram.byte_swap_32(generatedIv[1]);
		generatedIv[2] = ModernizedCProgram.byte_swap_32(generatedIv[2]);
		generatedIv[3] = ModernizedCProgram.byte_swap_32(generatedIv[3]);
		digest[0] = generatedIv[0];
		digest[1] = generatedIv[1];
		digest[2] = generatedIv[2];
		digest[3] = generatedIv[3];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedIv[0];
		generatedSalt_buf[1] = generatedIv[1];
		generatedSalt_buf[2] = generatedIv[2];
		generatedSalt_buf[3] = generatedIv[3];
		salt.setSalt_len(16)// iter;// iter
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)rounds_pos, (null), 10) - 1);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 20;
		generatedLen_max[1] = 20;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		sha1_double_salt_t sha1_double_salt = (sha1_double_salt_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[1] = hashconfig.getSeparator();
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = hashconfig.getSeparator();
		generatedLen_min[2] = 0;
		generatedLen_max[2] = 256;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
			generatedLen_min[2] *= 2;
			generatedLen_max[2] *= 2;
			generatedAttr[2] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		Object[] generatedLen = token.getLen();
		Object[] generatedSalt1_buf = sha1_double_salt.getSalt1_buf();
		int generatedSalt1_len = sha1_double_salt.getSalt1_len();
		boolean parse_rc1 = ModernizedCProgram.generic_salt_decode(hashconfig, generatedBuf[1], generatedLen[1], (u8)generatedSalt1_buf, (int)generatedSalt1_len);
		if (parse_rc1 == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt2_buf = sha1_double_salt.getSalt2_buf();
		int generatedSalt2_len = sha1_double_salt.getSalt2_len();
		boolean parse_rc2 = ModernizedCProgram.generic_salt_decode(hashconfig, generatedBuf[2], generatedLen[2], (u8)generatedSalt2_buf, (int)generatedSalt2_len);
		if (parse_rc2 == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		// make salt sorter happy
		md5_ctx_t md5_ctx = new md5_ctx_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_init(md5_ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(md5_ctx, generatedSalt1_buf, generatedSalt1_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(md5_ctx, generatedSalt2_buf, generatedSalt2_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_final(md5_ctx);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object[] generatedH = md5_ctx.getH();
		generatedSalt_buf[0] = generatedH[0];
		generatedSalt_buf[1] = generatedH[1];
		generatedSalt_buf[2] = generatedH[2];
		generatedSalt_buf[3] = generatedH[3];
		salt.setSalt_len(16);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_NETBSD_SHA1CRYPT;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 6;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 8;
		generatedLen_max[2] = 8;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 28;
		generatedLen_max[3] = 28;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// iter
		Object[] generatedBuf = token.getBuf();
		u8 iter_pos = generatedBuf[1];
		u32 iter = ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10);
		// (actually: CRYPT_SHA1_ITERATIONS should be 24680 or more)if (iter < 99) {
			return (parser_rc.PARSER_SALT_ITERATION);
		} 
		salt.setSalt_iter(iter - 1)// salt;// salt
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((u8)generatedSalt_buf, salt_pos, salt_len);
		salt.setSalt_len(salt_len)// hash;// hash
		u8 hash_pos = generatedBuf[3];
		Object[] generatedSalt_sign = salt.getSalt_sign();
		ModernizedCProgram.netbsd_sha1crypt_decode((u8)digest, hash_pos, (u8)generatedSalt_sign);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4])// precompute salt;// precompute salt
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		byte[] ptr = (byte)generatedSalt_buf_pc;
		int salt_len_pc = /*Error: Function owner not recognized*/snprintf(ptr, 64, "%s$sha1$%u", (byte)generatedSalt_buf, iter);
		ptr[salt_len_pc] = -1024;
		salt.setSalt_len_pc(salt_len_pc);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 64;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 64;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[5] = ModernizedCProgram.hex_to_u32(hash_pos + 40);
		digest[6] = ModernizedCProgram.hex_to_u32(hash_pos + 48);
		digest[7] = ModernizedCProgram.hex_to_u32(hash_pos + 56);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha2_32_constants.SHA256M_A;
			digest[1] -= sha2_32_constants.SHA256M_B;
			digest[2] -= sha2_32_constants.SHA256M_C;
			digest[3] -= sha2_32_constants.SHA256M_D;
			digest[4] -= sha2_32_constants.SHA256M_E;
			digest[5] -= sha2_32_constants.SHA256M_F;
			digest[6] -= sha2_32_constants.SHA256M_G;
			digest[7] -= sha2_32_constants.SHA256M_H;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_200000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(2048);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 32;
		generatedLen_max[1] = 32;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D;
		} 
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[1] = 40;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[1];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8[] salt_pos = generatedBuf[0];
		int salt_len = generatedLen[0];
		if ((salt_pos[8] != (byte)'0') || (salt_pos[9] != (byte)'1')) {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32 digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MD5CRYPT;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 3;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 8;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_OPTIONAL_ROUNDS;
		generatedLen[2] = 22;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_MD5CRYPT);
		int generatedOpt_len = token.getOpt_len();
		Object generatedOpt_buf = token.getOpt_buf();
		if (generatedOpt_len != -1) {
			salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)generatedOpt_buf + 7, (null), 10));
		} 
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 hash_pos = generatedBuf[2];
		ModernizedCProgram.md5crypt_decode((u8)digest, hash_pos);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_MSSQL;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedLen[1] = 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[2] = 40;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen[3] = 40;
		generatedAttr[3] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[3];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		apple_secure_notes_t apple_secure_notes = (apple_secure_notes_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_APFS;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 10;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 6;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 32;
		generatedLen_max[3] = 32;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)'$';
		generatedLen_min[4] = 1;
		generatedLen_max[4] = 6;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedSep[5] = (byte)'$';
		generatedLen_min[5] = 80;
		generatedLen_max[5] = 80;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// Z_PK
		Object[] generatedBuf = token.getBuf();
		u8 Z_PK_pos = generatedBuf[1];
		u32 Z_PK = ModernizedCProgram.hc_strtoul((byte)Z_PK_pos, (null), 10);
		if (Z_PK != 2) {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		apple_secure_notes.setZ_PK(Z_PK)// ZCRYPTOSALT;// ZCRYPTOSALT
		u8[] ZCRYPTOSALT_pos = generatedBuf[3];
		Object[] generatedZCRYPTOSALT = apple_secure_notes.getZCRYPTOSALT();
		generatedZCRYPTOSALT[0] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[0]);
		generatedZCRYPTOSALT[1] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[8]);
		generatedZCRYPTOSALT[2] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[16]);
		generatedZCRYPTOSALT[3] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOSALT_pos[24]);
		generatedZCRYPTOSALT[4] = 0;
		generatedZCRYPTOSALT[5] = 0;
		generatedZCRYPTOSALT[6] = 0;
		generatedZCRYPTOSALT[7] = 0;
		generatedZCRYPTOSALT[8] = 0;
		generatedZCRYPTOSALT[9] = 0;
		generatedZCRYPTOSALT[10] = 0;
		generatedZCRYPTOSALT[11] = 0;
		generatedZCRYPTOSALT[12] = 0;
		generatedZCRYPTOSALT[13] = 0;
		generatedZCRYPTOSALT[14] = 0;
		generatedZCRYPTOSALT[15] = 0// ZCRYPTOITERATIONCOUNT;// ZCRYPTOITERATIONCOUNT
		u8 ZCRYPTOITERATIONCOUNT_pos = generatedBuf[4];
		u32 ZCRYPTOITERATIONCOUNT = ModernizedCProgram.hc_strtoul((byte)ZCRYPTOITERATIONCOUNT_pos, (null), 10);
		apple_secure_notes.setZCRYPTOITERATIONCOUNT(ZCRYPTOITERATIONCOUNT)// ZCRYPTOWRAPPEDKEY;// ZCRYPTOWRAPPEDKEY
		u8[] ZCRYPTOWRAPPEDKEY_pos = generatedBuf[5];
		Object[] generatedZCRYPTOWRAPPEDKEY = apple_secure_notes.getZCRYPTOWRAPPEDKEY();
		generatedZCRYPTOWRAPPEDKEY[0] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[0]);
		generatedZCRYPTOWRAPPEDKEY[1] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[8]);
		generatedZCRYPTOWRAPPEDKEY[2] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[16]);
		generatedZCRYPTOWRAPPEDKEY[3] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[24]);
		generatedZCRYPTOWRAPPEDKEY[4] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[32]);
		generatedZCRYPTOWRAPPEDKEY[5] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[40]);
		generatedZCRYPTOWRAPPEDKEY[6] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[48]);
		generatedZCRYPTOWRAPPEDKEY[7] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[56]);
		generatedZCRYPTOWRAPPEDKEY[8] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[64]);
		generatedZCRYPTOWRAPPEDKEY[9] = ModernizedCProgram.hex_to_u32((u8)ZCRYPTOWRAPPEDKEY_pos[72])// fake salt;// fake salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedZCRYPTOSALT[0];
		generatedSalt_buf[1] = generatedZCRYPTOSALT[1];
		generatedSalt_buf[2] = generatedZCRYPTOSALT[2];
		generatedSalt_buf[3] = generatedZCRYPTOSALT[3];
		Object generatedZ_PK = apple_secure_notes.getZ_PK();
		generatedSalt_buf[4] = generatedZ_PK;
		Object generatedZCRYPTOITERATIONCOUNT = apple_secure_notes.getZCRYPTOITERATIONCOUNT();
		salt.setSalt_iter(generatedZCRYPTOITERATIONCOUNT - 1);
		salt.setSalt_len(20)// fake hash;// fake hash
		digest[0] = generatedZCRYPTOWRAPPEDKEY[0];
		digest[1] = generatedZCRYPTOWRAPPEDKEY[1];
		digest[2] = generatedZCRYPTOWRAPPEDKEY[2];
		digest[3] = generatedZCRYPTOWRAPPEDKEY[3];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		Object[] generatedSalt_buf_pc = salt.getSalt_buf_pc();
		ModernizedCProgram.precompute_salt_md5(generatedSalt_buf, generatedSalt_len, (u8)generatedSalt_buf_pc);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		chacha20_t chacha20 = (chacha20_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(6);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_CHACHA20;
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'*';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 10;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 10;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		generatedSep[1] = (byte)'*';
		generatedLen_min[1] = 16;
		generatedLen_max[1] = 16;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[2] = (byte)'*';
		generatedLen_min[2] = 1;
		generatedLen_max[2] = 2;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[3] = (byte)'*';
		generatedLen_min[3] = 16;
		generatedLen_max[3] = 16;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[4] = (byte)'*';
		generatedLen_min[4] = 16;
		generatedLen_max[4] = 16;
		generatedAttr[4] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[5] = (byte)'*';
		generatedLen_min[5] = 16;
		generatedLen_max[5] = 16;
		generatedAttr[5] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// offset
		Object[] generatedBuf = token.getBuf();
		u8 offset_marker = generatedBuf[2];
		int offset = /*Error: Function owner not recognized*/strtol((byte)offset_marker, (null), 10);
		if (offset > 63) {
			return (parser_rc.PARSER_SALT_VALUE);
		} 
		chacha20.setOffset(offset)// position;// position
		u8 position_marker = generatedBuf[1];
		Object[] generatedPosition = chacha20.getPosition();
		generatedPosition[0] = ModernizedCProgram.hex_to_u32((u8)position_marker + 0);
		generatedPosition[1] = ModernizedCProgram.hex_to_u32((u8)position_marker + 8)// iv;// iv
		u8 iv_marker = generatedBuf[3];
		Object[] generatedIv = chacha20.getIv();
		generatedIv[0] = ModernizedCProgram.hex_to_u32((u8)iv_marker + 8);
		generatedIv[1] = ModernizedCProgram.hex_to_u32((u8)iv_marker + 0)// plain;// plain
		u8 plain_marker = generatedBuf[4];
		Object[] generatedPlain = chacha20.getPlain();
		generatedPlain[0] = ModernizedCProgram.hex_to_u32((u8)plain_marker + 0);
		generatedPlain[1] = ModernizedCProgram.hex_to_u32((u8)plain_marker + 8);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedIv[/* some fake salt for the sorting mechanisms */0];
		generatedSalt_buf[1] = generatedIv[1];
		generatedSalt_buf[2] = generatedPlain[0];
		generatedSalt_buf[3] = generatedPlain[1];
		generatedSalt_buf[4] = generatedPosition[0];
		generatedSalt_buf[5] = generatedPosition[1];
		Object generatedOffset = chacha20.getOffset();
		generatedSalt_buf[6] = generatedOffset;
		generatedSalt_buf[7] = 0;
		salt.setSalt_len(32);
		u8 cipher_marker = generatedBuf[/* Store cipher for search mechanism */5];
		digest[0] = ModernizedCProgram.hex_to_u32((u8)cipher_marker + 8);
		digest[1] = ModernizedCProgram.hex_to_u32((u8)cipher_marker + 0);
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 128;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		int hash_len = generatedLen[0];
		if (hash_len != 128) {
			return (parser_rc.PARSER_GLOBAL_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		pbkdf2_sha512_t pbkdf2_sha512 = (pbkdf2_sha512_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SHA512MACOS;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 4;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 1;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 6;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_DIGIT;
		generatedLen_min[2] = 64;
		generatedLen_max[2] = 64;
		generatedSep[2] = (byte)'$';
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[3] = 128;
		generatedLen_max[3] = 128;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[3];
		digest[0] = ModernizedCProgram.hex_to_u64(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u64(hash_pos + 16);
		digest[2] = ModernizedCProgram.hex_to_u64(hash_pos + 32);
		digest[3] = ModernizedCProgram.hex_to_u64(hash_pos + 48);
		digest[4] = ModernizedCProgram.hex_to_u64(hash_pos + 64);
		digest[5] = ModernizedCProgram.hex_to_u64(hash_pos + 80);
		digest[6] = ModernizedCProgram.hex_to_u64(hash_pos + 96);
		digest[7] = ModernizedCProgram.hex_to_u64(hash_pos + 112);
		digest[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		digest[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		digest[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		digest[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		u8 salt_pos = generatedBuf[2];
		int salt_len = generatedLen[2] / 2;
		Object[] generatedSalt_buf = pbkdf2_sha512.getSalt_buf();
		generatedSalt_buf[0] = ModernizedCProgram.hex_to_u32(salt_pos + 0);
		generatedSalt_buf[1] = ModernizedCProgram.hex_to_u32(salt_pos + 8);
		generatedSalt_buf[2] = ModernizedCProgram.hex_to_u32(salt_pos + 16);
		generatedSalt_buf[3] = ModernizedCProgram.hex_to_u32(salt_pos + 24);
		generatedSalt_buf[4] = ModernizedCProgram.hex_to_u32(salt_pos + 32);
		generatedSalt_buf[5] = ModernizedCProgram.hex_to_u32(salt_pos + 40);
		generatedSalt_buf[6] = ModernizedCProgram.hex_to_u32(salt_pos + 48);
		generatedSalt_buf[7] = ModernizedCProgram.hex_to_u32(salt_pos + 56);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		generatedSalt_buf[1] = generatedSalt_buf[1];
		generatedSalt_buf[2] = generatedSalt_buf[2];
		generatedSalt_buf[3] = generatedSalt_buf[3];
		generatedSalt_buf[4] = generatedSalt_buf[4];
		generatedSalt_buf[5] = generatedSalt_buf[5];
		generatedSalt_buf[6] = generatedSalt_buf[6];
		generatedSalt_buf[7] = generatedSalt_buf[7];
		salt.setSalt_len(salt_len);
		u8 iter_pos = generatedBuf[1];
		salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)iter_pos, (null), 10) - 1);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = hashconfig.getSeparator();
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 40;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 40;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedLen_min[1] = 0;
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_HEX) {
			generatedLen_min[1] *= 2;
			generatedLen_max[1] *= 2;
			generatedAttr[1] |=  token_attr.TOKEN_ATTR_VERIFY_HEX;
		} 
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8 salt_pos = generatedBuf[1];
		Object[] generatedLen = token.getLen();
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(1);
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 32;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 32;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[0];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= md5_constants.MD5M_A;
			digest[1] -= md5_constants.MD5M_B;
			digest[2] -= md5_constants.MD5M_C;
			digest[3] -= md5_constants.MD5M_D/**
			   * This is a virtual salt. While the algorithm is basically not salted
			   * we can exploit the salt buffer to set the 0x80 and the w[14] value.
			   * This way we can save a special md5md5 kernel and reuse the one from vbull.
			   */;
		} 
		u8 zero = (u8)"";
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, zero, 0, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		vc_t vc = (vc_t)esalt_buf;
		double entropy = ModernizedCProgram.get_entropy((u8)line_buf, line_len);
		if (entropy < ModernizedCProgram.MIN_SUFFICIENT_ENTROPY_FILE) {
			return (parser_rc.PARSER_INSUFFICIENT_ENTROPY);
		} 
		Object[] generatedSalt_buf = vc.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, line_buf, 64);
		Object[] generatedData_buf = vc.getData_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData_buf, line_buf + 64, 512 - 64);
		generatedSalt_buf[0] = generatedSalt_buf[0];
		salt.setSalt_len(4);
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_VERACRYPT_500000);
		Object generatedSalt_iter = salt.getSalt_iter();
		generatedSalt_iter--;
		vc.setPim_multi(1000);
		vc.setPim_start(0);
		vc.setPim_stop(0);
		// "VERA"// "VERA"vc.setSignature(-1024);
		digest[0] = generatedData_buf[0];
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_DJANGOSHA1;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 5;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 256;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedLen[2] = 40;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hash_pos = generatedBuf[2];
		digest[0] = ModernizedCProgram.hex_to_u32(hash_pos + 0);
		digest[1] = ModernizedCProgram.hex_to_u32(hash_pos + 8);
		digest[2] = ModernizedCProgram.hex_to_u32(hash_pos + 16);
		digest[3] = ModernizedCProgram.hex_to_u32(hash_pos + 24);
		digest[4] = ModernizedCProgram.hex_to_u32(hash_pos + 32);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u64[] digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		Object[] generatedSep = token.getSep();
		generatedSep[0] = (byte)'@';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[0] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[0] = 0;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[1] = (byte)'@';
		generatedLen_min[1] = 1;
		generatedLen_max[1] = 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		generatedSep[2] = (byte)'@';
		generatedLen_min[2] = 32;
		generatedLen_max[2] = 128;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'@';
		generatedLen_min[3] = 8;
		generatedLen_max[3] = 16;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// check hash type
		Object[] generatedBuf = token.getBuf();
		if (generatedBuf[1][0] != (byte)'S') {
			return (parser_rc.PARSER_SIGNATURE_UNMATCHED);
		} 
		// check iter
		u32 iter = ModernizedCProgram.ROUNDS_QNX;
		Object[] generatedLen = token.getLen();
		if (generatedLen[1] > 1) {
			if (generatedBuf[1][1] != (byte)',') {
				return (parser_rc.PARSER_SEPARATOR_UNMATCHED);
			} 
			iter = ModernizedCProgram.hc_strtoul((byte)generatedBuf[1] + 2, (null), 10);
		} 
		// iter++; the additinal round is added in the init kernel// iter++; the additinal round is added in the init kernelsalt.setSalt_iter(iter)// digest;// digest
		if (generatedLen[2] != 128) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		digest[0] = ModernizedCProgram.hex_to_u64((u8)generatedBuf[2] + 0);
		digest[1] = ModernizedCProgram.hex_to_u64((u8)generatedBuf[2] + 16);
		digest[2] = ModernizedCProgram.hex_to_u64((u8)generatedBuf[2] + 32);
		digest[3] = ModernizedCProgram.hex_to_u64((u8)generatedBuf[2] + 48);
		digest[4] = ModernizedCProgram.hex_to_u64((u8)generatedBuf[2] + 64);
		digest[5] = ModernizedCProgram.hex_to_u64((u8)generatedBuf[2] + 80);
		digest[6] = ModernizedCProgram.hex_to_u64((u8)generatedBuf[2] + 96);
		digest[7] = ModernizedCProgram.hex_to_u64((u8)generatedBuf[2] + 112)// salt;// salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		if ((generatedLen[3] == 8) || (generatedLen[3] == 16)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, generatedBuf[3], generatedLen[3]);
			salt.setSalt_len(generatedLen[3]);
		} else {
				return (parser_rc.PARSER_SALT_LENGTH);
		} 
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(2);
		token.setSignatures_cnt(2);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SSHA1B64_lower;
		generatedSignatures_buf[1] = ModernizedCProgram.SIGNATURE_SSHA1B64_upper;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 6;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = (((20 + 0) * 8) / 6) + 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = (((20 + 256) * 8) / 6) + 3;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64A;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		Object[] generatedBuf = token.getBuf();
		u8 hashsalt_pos = generatedBuf[1];
		int hashsalt_len = generatedLen[1];
		u8[] tmp_buf = new u8[]{0};
		int tmp_len = ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, hashsalt_pos, hashsalt_len, tmp_buf);
		if (tmp_len < 20) {
			return (parser_rc.PARSER_HASH_LENGTH);
		} 
		u8 hash_pos = tmp_buf;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(digest, hash_pos, 20);
		digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			digest[0] -= sha1_constants.SHA1M_A;
			digest[1] -= sha1_constants.SHA1M_B;
			digest[2] -= sha1_constants.SHA1M_C;
			digest[3] -= sha1_constants.SHA1M_D;
			digest[4] -= sha1_constants.SHA1M_E;
		} 
		// saltu8 salt_pos = tmp_buf + 20;
		int salt_len = tmp_len - 20;
		salt.setSalt_len(salt_len);
		Object[] generatedSalt_buf = salt.getSalt_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedSalt_buf, salt_pos, salt_len);
		if (hashconfig.getOpts_type() & opts_type.OPTS_TYPE_ST_ADD80) {
			u8 ptr = (u8)generatedSalt_buf;
			ptr[salt_len] = -1024;
		} 
		return (parser_rc.PARSER_OK);
		return (parser_rc.PARSER_OK);
		u64 digest = (u64)digest_buf;
		token_t token = new token_t();
		token.setToken_cnt(3);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_SHA512CRYPT;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 3;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 0;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 16;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_OPTIONAL_ROUNDS;
		generatedLen[2] = 86;
		generatedAttr[2] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_BASE64B;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		salt.setSalt_iter(ModernizedCProgram.ROUNDS_SHA512CRYPT);
		int generatedOpt_len = token.getOpt_len();
		Object generatedOpt_buf = token.getOpt_buf();
		if (generatedOpt_len != -1) {
			salt.setSalt_iter(ModernizedCProgram.hc_strtoul((byte)generatedOpt_buf + 7, (null), 10));
		} 
		Object[] generatedBuf = token.getBuf();
		u8 salt_pos = generatedBuf[1];
		int salt_len = generatedLen[1];
		Object[] generatedSalt_buf = salt.getSalt_buf();
		Object generatedSalt_len = salt.getSalt_len();
		boolean parse_rc = ModernizedCProgram.generic_salt_decode(hashconfig, salt_pos, salt_len, (u8)generatedSalt_buf, (int)generatedSalt_len);
		if (parse_rc == 0) {
			return (parser_rc.PARSER_SALT_LENGTH);
		} 
		u8 hash_pos = generatedBuf[2];
		ModernizedCProgram.sha512crypt_decode((u8)digest, hash_pos);
		return (parser_rc.PARSER_OK);
		u32[] digest = (u32)digest_buf;
		tacacs_plus_t tacacs_plus = (tacacs_plus_t)esalt_buf;
		token_t token = new token_t();
		token.setToken_cnt(4);
		token.setSignatures_cnt(1);
		Object[] generatedSignatures_buf = token.getSignatures_buf();
		generatedSignatures_buf[0] = ModernizedCProgram.SIGNATURE_TACACS_PLUS;
		Object[] generatedLen = token.getLen();
		generatedLen[0] = 15;
		Object[] generatedAttr = token.getAttr();
		generatedAttr[0] = token_attr.TOKEN_ATTR_FIXED_LENGTH | token_attr.TOKEN_ATTR_VERIFY_SIGNATURE;
		Object[] generatedSep = token.getSep();
		generatedSep[1] = (byte)'$';
		Object[] generatedLen_min = token.getLen_min();
		generatedLen_min[1] = 8;
		Object[] generatedLen_max = token.getLen_max();
		generatedLen_max[1] = 8;
		generatedAttr[1] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[2] = (byte)'$';
		generatedLen_min[2] = 12;
		generatedLen_max[2] = 256;
		generatedAttr[2] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		generatedSep[3] = (byte)'$';
		generatedLen_min[3] = 4;
		generatedLen_max[3] = 4;
		generatedAttr[3] = token_attr.TOKEN_ATTR_VERIFY_LENGTH | token_attr.TOKEN_ATTR_VERIFY_HEX;
		int rc_tokenizer = token.input_tokenizer((u8)line_buf, line_len);
		if (rc_tokenizer != parser_rc.PARSER_OK) {
			return (rc_tokenizer);
		} 
		// session
		Object[] generatedBuf = token.getBuf();
		u8 session_pos = generatedBuf[1];
		Object[] generatedSession_buf = tacacs_plus.getSession_buf();
		u8[] session_ptr = (u8)generatedSession_buf;
		session_ptr[0] = ModernizedCProgram.hex_to_u8((u8)session_pos + 0);
		session_ptr[1] = ModernizedCProgram.hex_to_u8((u8)session_pos + 2);
		session_ptr[2] = ModernizedCProgram.hex_to_u8((u8)session_pos + 4);
		session_ptr[3] = ModernizedCProgram.hex_to_u8((u8)session_pos + 6)// ct_buf;// ct_buf
		u8[] ct_buf_pos = generatedBuf[2];
		int ct_buf_len = generatedLen[2];
		Object[] generatedCt_data_buf = tacacs_plus.getCt_data_buf();
		u8[] ct_data_ptr = (u8)generatedCt_data_buf;
		Object generatedCt_data_len = tacacs_plus.getCt_data_len();
		for (int i = 0;
		int j = 0;
		 j < ct_buf_len; ) {
			ct_data_ptr[i] = ModernizedCProgram.hex_to_u8((u8)ct_buf_pos[j]);
			generatedCt_data_len++;
		}
		// sequenceu8 sequence_pos = generatedBuf[3];
		Object[] generatedSequence_buf = tacacs_plus.getSequence_buf();
		u8[] sequence_ptr = (u8)generatedSequence_buf;
		sequence_ptr[0] = ModernizedCProgram.hex_to_u8((u8)sequence_pos + 0);
		sequence_ptr[1] = ModernizedCProgram.hex_to_u8((u8)sequence_pos + 2)// fake salt;// fake salt
		Object[] generatedSalt_buf = salt.getSalt_buf();
		generatedSalt_buf[0] = generatedSession_buf[0];
		generatedSalt_buf[1] = generatedSequence_buf[0];
		generatedSalt_buf[2] = generatedCt_data_buf[0];
		generatedSalt_buf[3] = generatedCt_data_buf[1];
		salt.setSalt_len(16)// fake hash;// fake hash
		digest[0] = generatedCt_data_buf[2];
		digest[1] = generatedCt_data_buf[3];
		digest[2] = generatedCt_data_buf[4];
		digest[3] = generatedCt_data_buf[5];
		return (parser_rc.PARSER_OK);
	}
	private static Object base64_decode(Object f, Object[] in_buf, Object in_len, Object out_buf) {
		u8[] in_ptr = in_buf;
		u8[] out_ptr = out_buf;
		for (size_t i = 0;
		 i < in_len; i += 4) {
			u8 f0 = ((i + 0) < in_len) ? in_ptr[0] : 0;
			u8 f1 = ((i + 1) < in_len) ? in_ptr[1] : 0;
			u8 f2 = ((i + 2) < in_len) ? in_ptr[2] : 0;
			u8 f3 = ((i + 3) < in_len) ? in_ptr[3] : 0;
			u8 out_val0 = /*Error: Function owner not recognized*/f(f0 & -1024);
			u8 out_val1 = /*Error: Function owner not recognized*/f(f1 & -1024);
			u8 out_val2 = /*Error: Function owner not recognized*/f(f2 & -1024);
			u8 out_val3 = /*Error: Function owner not recognized*/f(f3 & -1024);
			out_ptr[0] = ((out_val0 << 2) & -1024) | ((out_val1 >> 4) & -1024);
			out_ptr[1] = ((out_val1 << 4) & -1024) | ((out_val2 >> 2) & -1024);
			out_ptr[2] = ((out_val2 << 6) & -1024) | ((out_val3 >> 0) & -1024);
			in_ptr += 4;
			out_ptr += 3;
		}
		size_t tmp_len = 0;
		for (size_t i = 0;
		 i < in_len; ) {
			if (in_buf[i] != (byte)'=') {
				continue;
			} 
			break;
		}
		size_t out_len = (tmp_len * 6) / 8;
		return out_len;
	}
	private static void precompute_salt_md5(Object salt_buf, Object salt_len, Object salt_pc) {
		u32[] digest = new u32[]{0};
		ModernizedCProgram.md5_complete_no_limit(digest, salt_buf, salt_len);
		ModernizedCProgram.u32_to_hex(digest[0], salt_pc + 0);
		ModernizedCProgram.u32_to_hex(digest[1], salt_pc + 8);
		ModernizedCProgram.u32_to_hex(digest[2], salt_pc + 16);
		ModernizedCProgram.u32_to_hex(digest[3], salt_pc + 24);
		u32[] digest = new u32[]{0};
		ModernizedCProgram.md5_complete_no_limit(digest, salt_buf, salt_len);
		ModernizedCProgram.u32_to_hex(digest[0], salt_pc + 0);
		ModernizedCProgram.u32_to_hex(digest[1], salt_pc + 8);
		ModernizedCProgram.u32_to_hex(digest[2], salt_pc + 16);
		ModernizedCProgram.u32_to_hex(digest[3], salt_pc + 24);
	}
	private static void uppercase(Object[] buf, Object len) {
		for (size_t i = 0;
		 i < len; i++) {
			buf[i] = (u8)/*Error: Function owner not recognized*/toupper((int)buf[i]);
		}
	}
	private static void hex_to_binary(Object[] source, int len, byte[] out) {
		for (int i = 0;
		int j = 0;
		 j < len; ) {
			out[i] = ModernizedCProgram.hex_to_u8((u8)source[j]);
		}
		for (int i = 0;
		int j = 0;
		 j < len; ) {
			out[i] = ModernizedCProgram.hex_to_u8((u8)source[j]);
		}
		for (int i = 0;
		int j = 0;
		 j < len; ) {
			out[i] = ModernizedCProgram.hex_to_u8((u8)source[j]);
		}
		for (int i = 0;
		int j = 0;
		 j < len; ) {
			out[i] = ModernizedCProgram.hex_to_u8((u8)source[j]);
		}
		for (int i = 0;
		int j = 0;
		 j < len; ) {
			out[i] = ModernizedCProgram.hex_to_u8((u8)source[j]);
		}
	}
	private static void drupal7_decode(Object[] digest, Object[] buf) {
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[0] = (l >> 0) & -1024;
		digest[1] = (l >> 8) & -1024;
		digest[2] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[3] = (l >> 0) & -1024;
		digest[4] = (l >> 8) & -1024;
		digest[5] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[6] = (l >> 0) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[8] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[9] = (l >> 0) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[11] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[12] = (l >> 0) & -1024;
		digest[13] = (l >> 8) & -1024;
		digest[14] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[22]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[23]) << 18;
		digest[15] = (l >> 0) & -1024;
		digest[16] = (l >> 8) & -1024;
		digest[17] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[24]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[25]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[26]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[27]) << 18;
		digest[18] = (l >> 0) & -1024;
		digest[19] = (l >> 8) & -1024;
		digest[20] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[28]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[29]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[30]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[31]) << 18;
		digest[21] = (l >> 0) & -1024;
		digest[22] = (l >> 8) & -1024;
		digest[23] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[32]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[33]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[34]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[35]) << 18;
		digest[24] = (l >> 0) & -1024;
		digest[25] = (l >> 8) & -1024;
		digest[26] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[36]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[37]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[38]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[39]) << 18;
		digest[27] = (l >> 0) & -1024;
		digest[28] = (l >> 8) & -1024;
		digest[29] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[40]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[41]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[42]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[43]) << 18;
		digest[30] = (l >> 0) & -1024;
		digest[31] = (l >> 8) & -1024;
		digest[32] = (l >> 16) & -1024;
		digest[33] = 0;
		digest[34] = 0;
		digest[35] = 0;
		digest[36] = 0;
		digest[37] = 0;
		digest[38] = 0;
		digest[39] = 0;
		digest[40] = 0;
		digest[41] = 0;
		digest[42] = 0;
		digest[43] = 0;
		digest[44] = 0;
		digest[45] = 0;
		digest[46] = 0;
		digest[47] = 0;
		digest[48] = 0;
		digest[49] = 0;
		digest[50] = 0;
		digest[51] = 0;
		digest[52] = 0;
		digest[53] = 0;
		digest[54] = 0;
		digest[55] = 0;
		digest[56] = 0;
		digest[57] = 0;
		digest[58] = 0;
		digest[59] = 0;
		digest[60] = 0;
		digest[61] = 0;
		digest[62] = 0;
		digest[63] = 0;
	}
	private static void juniper_decrypt_hash(Object in, Object in_len, Object out) {
		// base64 decodeu8[] base64_buf = new u8[]{0};
		ModernizedCProgram.base64_decode(ModernizedCProgram.base64_to_int, (u8)in, in_len, base64_buf)// iv stuff;// iv stuff
		u32[] juniper_iv = new u32[]{0};
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(juniper_iv, base64_buf, 12);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out, juniper_iv, 12)// reversed key;// reversed key
		u32[] juniper_key = new u32[]{0};
		juniper_key[0] = ModernizedCProgram.byte_swap_32(-1024);
		juniper_key[1] = ModernizedCProgram.byte_swap_32(-1024);
		juniper_key[2] = ModernizedCProgram.byte_swap_32(-1024);
		juniper_key[3] = ModernizedCProgram.byte_swap_32(-1024)// AES decrypt;// AES decrypt
		u32 in_ptr = (u32)(base64_buf + 12);
		u32 out_ptr = (u32)(out + 12);
		ModernizedCProgram.AES128_decrypt_cbc(juniper_key, juniper_iv, in_ptr, out_ptr);
	}
	private static void AES128_decrypt_cbc(Object key, Object[] iv, Object[] in, Object[] out) {
		AES_KEY skey = new AES_KEY();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/aes128_set_decrypt_key(skey.getRdk(), key, (u32)ModernizedCProgram.te0, (u32)ModernizedCProgram.te1, (u32)ModernizedCProgram.te2, (u32)ModernizedCProgram.te3, (u32)ModernizedCProgram.td0, (u32)ModernizedCProgram.td1, (u32)ModernizedCProgram.td2, (u32)ModernizedCProgram.td3);
		u32[] _iv = new u32[]{0};
		_iv[0] = iv[0];
		_iv[1] = iv[1];
		_iv[2] = iv[2];
		_iv[3] = iv[3];
		for (int i = 0;
		 i < 16; i += 4) {
			u32[] _in = new u32[]{0};
			u32[] _out = new u32[]{0};
			_in[0] = in[i + 0];
			_in[1] = in[i + 1];
			_in[2] = in[i + 2];
			_in[3] = in[i + 3];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/aes128_decrypt(skey.getRdk(), _in, _out, (u32)ModernizedCProgram.td0, (u32)ModernizedCProgram.td1, (u32)ModernizedCProgram.td2, (u32)ModernizedCProgram.td3, (u32)ModernizedCProgram.td4);
			_out[0] ^=  _iv[0];
			_out[1] ^=  _iv[1];
			_out[2] ^=  _iv[2];
			_out[3] ^=  _iv[3];
			out[i + 0] = _out[0];
			out[i + 1] = _out[1];
			out[i + 2] = _out[2];
			out[i + 3] = _out[3];
			_iv[0] = _in[0];
			_iv[1] = _in[1];
			_iv[2] = _in[2];
			_iv[3] = _in[3];
		}
	}
	private static void md5crypt_decode(Object[] digest, Object[] buf) {
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[0] = (l >> 16) & -1024;
		digest[6] = (l >> 8) & -1024;
		digest[12] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[1] = (l >> 16) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[13] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[2] = (l >> 16) & -1024;
		digest[8] = (l >> 8) & -1024;
		digest[14] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[3] = (l >> 16) & -1024;
		digest[9] = (l >> 8) & -1024;
		digest[15] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[4] = (l >> 16) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[5] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		digest[11] = (l >> 0) & -1024/* uses OPTS_TYPE_HASH_COPY
		static void md5crypt_encode (const u8 digest[16], u8 buf[22])
		{
		  int l;
		
		  l = (digest[ 0] << 16) | (digest[ 6] << 8) | (digest[12] << 0);
		
		  buf[ 0] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[ 1] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[ 2] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[ 3] = int_to_itoa64 (l & 0x3f); //l >>= 6;
		
		  l = (digest[ 1] << 16) | (digest[ 7] << 8) | (digest[13] << 0);
		
		  buf[ 4] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[ 5] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[ 6] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[ 7] = int_to_itoa64 (l & 0x3f); //l >>= 6;
		
		  l = (digest[ 2] << 16) | (digest[ 8] << 8) | (digest[14] << 0);
		
		  buf[ 8] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[ 9] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[10] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[11] = int_to_itoa64 (l & 0x3f); //l >>= 6;
		
		  l = (digest[ 3] << 16) | (digest[ 9] << 8) | (digest[15] << 0);
		
		  buf[12] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[13] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[14] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[15] = int_to_itoa64 (l & 0x3f); //l >>= 6;
		
		  l = (digest[ 4] << 16) | (digest[10] << 8) | (digest[ 5] << 0);
		
		  buf[16] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[17] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[18] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[19] = int_to_itoa64 (l & 0x3f); //l >>= 6;
		
		  l = (digest[11] << 0);
		
		  buf[20] = int_to_itoa64 (l & 0x3f); l >>= 6;
		  buf[21] = int_to_itoa64 (l & 0x3f); //l >>= 6;
		}
		*/;
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[0] = (l >> 16) & -1024;
		digest[6] = (l >> 8) & -1024;
		digest[12] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[1] = (l >> 16) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[13] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[2] = (l >> 16) & -1024;
		digest[8] = (l >> 8) & -1024;
		digest[14] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[3] = (l >> 16) & -1024;
		digest[9] = (l >> 8) & -1024;
		digest[15] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[4] = (l >> 16) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[5] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		digest[11] = (l >> 0) & -1024;
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[0] = (l >> 16) & -1024;
		digest[6] = (l >> 8) & -1024;
		digest[12] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[1] = (l >> 16) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[13] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[2] = (l >> 16) & -1024;
		digest[8] = (l >> 8) & -1024;
		digest[14] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[3] = (l >> 16) & -1024;
		digest[9] = (l >> 8) & -1024;
		digest[15] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[4] = (l >> 16) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[5] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		digest[11] = (l >> 0) & -1024;
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[0] = (l >> 16) & -1024;
		digest[6] = (l >> 8) & -1024;
		digest[12] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[1] = (l >> 16) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[13] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[2] = (l >> 16) & -1024;
		digest[8] = (l >> 8) & -1024;
		digest[14] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[3] = (l >> 16) & -1024;
		digest[9] = (l >> 8) & -1024;
		digest[15] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[4] = (l >> 16) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[5] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		digest[11] = (l >> 0) & -1024;
	}
	private static void sha512aix_decode(Object[] digest, Object[] buf) {
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[2] = (l >> 0) & -1024;
		digest[1] = (l >> 8) & -1024;
		digest[0] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[5] = (l >> 0) & -1024;
		digest[4] = (l >> 8) & -1024;
		digest[3] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[8] = (l >> 0) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[6] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[11] = (l >> 0) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[9] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[14] = (l >> 0) & -1024;
		digest[13] = (l >> 8) & -1024;
		digest[12] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[22]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[23]) << 18;
		digest[17] = (l >> 0) & -1024;
		digest[16] = (l >> 8) & -1024;
		digest[15] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[24]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[25]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[26]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[27]) << 18;
		digest[20] = (l >> 0) & -1024;
		digest[19] = (l >> 8) & -1024;
		digest[18] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[28]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[29]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[30]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[31]) << 18;
		digest[23] = (l >> 0) & -1024;
		digest[22] = (l >> 8) & -1024;
		digest[21] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[32]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[33]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[34]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[35]) << 18;
		digest[26] = (l >> 0) & -1024;
		digest[25] = (l >> 8) & -1024;
		digest[24] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[36]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[37]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[38]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[39]) << 18;
		digest[29] = (l >> 0) & -1024;
		digest[28] = (l >> 8) & -1024;
		digest[27] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[40]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[41]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[42]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[43]) << 18;
		digest[32] = (l >> 0) & -1024;
		digest[31] = (l >> 8) & -1024;
		digest[30] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[44]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[45]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[46]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[47]) << 18;
		digest[35] = (l >> 0) & -1024;
		digest[34] = (l >> 8) & -1024;
		digest[33] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[48]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[49]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[50]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[51]) << 18;
		digest[38] = (l >> 0) & -1024;
		digest[37] = (l >> 8) & -1024;
		digest[36] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[52]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[53]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[54]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[55]) << 18;
		digest[41] = (l >> 0) & -1024;
		digest[40] = (l >> 8) & -1024;
		digest[39] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[56]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[57]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[58]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[59]) << 18;
		digest[44] = (l >> 0) & -1024;
		digest[43] = (l >> 8) & -1024;
		digest[42] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[60]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[61]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[62]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[63]) << 18;
		digest[47] = (l >> 0) & -1024;
		digest[46] = (l >> 8) & -1024;
		digest[45] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[64]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[65]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[66]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[67]) << 18;
		digest[50] = (l >> 0) & -1024;
		digest[49] = (l >> 8) & -1024;
		digest[48] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[68]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[69]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[70]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[71]) << 18;
		digest[53] = (l >> 0) & -1024;
		digest[52] = (l >> 8) & -1024;
		digest[51] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[72]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[73]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[74]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[75]) << 18;
		digest[56] = (l >> 0) & -1024;
		digest[55] = (l >> 8) & -1024;
		digest[54] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[76]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[77]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[78]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[79]) << 18;
		digest[59] = (l >> 0) & -1024;
		digest[58] = (l >> 8) & -1024;
		digest[57] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[80]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[81]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[82]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[83]) << 18;
		digest[62] = (l >> 0) & -1024;
		digest[61] = (l >> 8) & -1024;
		digest[60] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[84]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[85]) << 6;
		digest[63] = (l >> 16) & -1024;
	}
	private static void sha256crypt_decode(Object[] digest, Object[] buf) {
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[0] = (l >> 16) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[20] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[21] = (l >> 16) & -1024;
		digest[1] = (l >> 8) & -1024;
		digest[11] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[12] = (l >> 16) & -1024;
		digest[22] = (l >> 8) & -1024;
		digest[2] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[3] = (l >> 16) & -1024;
		digest[13] = (l >> 8) & -1024;
		digest[23] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[24] = (l >> 16) & -1024;
		digest[4] = (l >> 8) & -1024;
		digest[14] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[22]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[23]) << 18;
		digest[15] = (l >> 16) & -1024;
		digest[25] = (l >> 8) & -1024;
		digest[5] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[24]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[25]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[26]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[27]) << 18;
		digest[6] = (l >> 16) & -1024;
		digest[16] = (l >> 8) & -1024;
		digest[26] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[28]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[29]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[30]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[31]) << 18;
		digest[27] = (l >> 16) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[17] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[32]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[33]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[34]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[35]) << 18;
		digest[18] = (l >> 16) & -1024;
		digest[28] = (l >> 8) & -1024;
		digest[8] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[36]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[37]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[38]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[39]) << 18;
		digest[9] = (l >> 16) & -1024;
		digest[19] = (l >> 8) & -1024;
		digest[29] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[40]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[41]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[42]) << 12;
		digest[31] = (l >> 8) & -1024;
		digest[30] = (l >> 0) & -1024;
	}
	private static void lowercase(Object[] buf, Object len) {
		for (size_t i = 0;
		 i < len; i++) {
			buf[i] = (u8)/*Error: Function owner not recognized*/tolower((int)buf[i]);
		}
	}
	private static void u8_to_hex(Object v, Object[] hex) {
		u8[] tbl = new u8[]{(byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)'4', (byte)'5', (byte)'6', (byte)'7', (byte)'8', (byte)'9', (byte)'a', (byte)'b', (byte)'c', (byte)'d', (byte)'e', (byte)'f'};
		hex[1] = tbl[v >> 0 & 15];
		hex[0] = tbl[v >> 4 & 15];
	}
	// difference to original strncat is no returncode and u8* instead of char*
	private static void hc_strncat(Object dst, Object src, Object n) {
		size_t dst_len = /*Error: Function owner not recognized*/strlen((byte)dst);
		u8 src_ptr = src;
		u8 dst_ptr = dst + dst_len;
		for (size_t i = 0;
		 i < n && src_ptr != 0; i++) {
			dst_ptr++ = src_ptr++;
		}
		dst_ptr = 0;
	}
	private static void md5_complete_no_limit(Object[] digest, Object plain, Object plain_len) {
		// plain = u32 tmp_md5_buf[64] so this is compatiblemd5_ctx_t md5_ctx = new md5_ctx_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_init(md5_ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(md5_ctx, plain, plain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_final(md5_ctx);
		Object[] generatedH = md5_ctx.getH();
		digest[0] = generatedH[0];
		digest[1] = generatedH[1];
		digest[2] = generatedH[2];
		digest[3] = generatedH[3];
		// plain = u32 tmp_md5_buf[64] so this is compatiblemd5_ctx_t md5_ctx = new md5_ctx_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_init(md5_ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(md5_ctx, plain, plain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_final(md5_ctx);
		Object[] generatedH = md5_ctx.getH();
		digest[0] = generatedH[0];
		digest[1] = generatedH[1];
		digest[2] = generatedH[2];
		digest[3] = generatedH[3];
		// plain = u32 tmp_md5_buf[64] so this is compatiblemd5_ctx_t md5_ctx = new md5_ctx_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_init(md5_ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(md5_ctx, plain, plain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_final(md5_ctx);
		Object[] generatedH = md5_ctx.getH();
		digest[0] = generatedH[0];
		digest[1] = generatedH[1];
		digest[2] = generatedH[2];
		digest[3] = generatedH[3];
		// plain = u32 tmp_md5_buf[64] so this is compatiblemd5_ctx_t md5_ctx = new md5_ctx_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_init(md5_ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(md5_ctx, plain, plain_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_final(md5_ctx);
		Object[] generatedH = md5_ctx.getH();
		digest[0] = generatedH[0];
		digest[1] = generatedH[1];
		digest[2] = generatedH[2];
		digest[3] = generatedH[3];
	}
	private static void sha1aix_decode(Object[] digest, Object[] buf) {
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[2] = (l >> 0) & -1024;
		digest[1] = (l >> 8) & -1024;
		digest[0] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[5] = (l >> 0) & -1024;
		digest[4] = (l >> 8) & -1024;
		digest[3] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[8] = (l >> 0) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[6] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[11] = (l >> 0) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[9] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[14] = (l >> 0) & -1024;
		digest[13] = (l >> 8) & -1024;
		digest[12] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[22]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[23]) << 18;
		digest[17] = (l >> 0) & -1024;
		digest[16] = (l >> 8) & -1024;
		digest[15] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[24]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[25]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[26]) << 12;
		digest[19] = (l >> 8) & -1024;
		digest[18] = (l >> 16) & -1024;
	}
	private static void phpass_decode(Object[] digest, Object[] buf) {
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[0] = (l >> 0) & -1024;
		digest[1] = (l >> 8) & -1024;
		digest[2] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[3] = (l >> 0) & -1024;
		digest[4] = (l >> 8) & -1024;
		digest[5] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[6] = (l >> 0) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[8] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[9] = (l >> 0) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[11] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[12] = (l >> 0) & -1024;
		digest[13] = (l >> 8) & -1024;
		digest[14] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		digest[15] = (l >> 0) & -1024;
	}
	private static void sha256aix_decode(Object[] digest, Object[] buf) {
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[2] = (l >> 0) & -1024;
		digest[1] = (l >> 8) & -1024;
		digest[0] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[5] = (l >> 0) & -1024;
		digest[4] = (l >> 8) & -1024;
		digest[3] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[8] = (l >> 0) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[6] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[11] = (l >> 0) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[9] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[14] = (l >> 0) & -1024;
		digest[13] = (l >> 8) & -1024;
		digest[12] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[22]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[23]) << 18;
		digest[17] = (l >> 0) & -1024;
		digest[16] = (l >> 8) & -1024;
		digest[15] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[24]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[25]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[26]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[27]) << 18;
		digest[20] = (l >> 0) & -1024;
		digest[19] = (l >> 8) & -1024;
		digest[18] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[28]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[29]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[30]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[31]) << 18;
		digest[23] = (l >> 0) & -1024;
		digest[22] = (l >> 8) & -1024;
		digest[21] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[32]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[33]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[34]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[35]) << 18;
		digest[26] = (l >> 0) & -1024;
		digest[25] = (l >> 8) & -1024;
		digest[24] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[36]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[37]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[38]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[39]) << 18;
		digest[29] = (l >> 0) & -1024;
		digest[28] = (l >> 8) & -1024;
		digest[27] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[40]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[41]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[42]) << 12;
		//digest[32] = (l >>  0) & 0xff;//digest[32] = (l >>  0) & 0xff;digest[31] = (l >> 8) & -1024;
		digest[30] = (l >> 16) & -1024;
	}
	private static Object base32_decode(Object f, Object[] in_buf, Object in_len, Object out_buf) {
		u8[] in_ptr = in_buf;
		u8[] out_ptr = out_buf;
		for (size_t i = 0;
		 i < in_len; i += 8) {
			u8 f0 = ((i + 0) < in_len) ? in_ptr[0] : 0;
			u8 f1 = ((i + 1) < in_len) ? in_ptr[1] : 0;
			u8 f2 = ((i + 2) < in_len) ? in_ptr[2] : 0;
			u8 f3 = ((i + 3) < in_len) ? in_ptr[3] : 0;
			u8 f4 = ((i + 4) < in_len) ? in_ptr[4] : 0;
			u8 f5 = ((i + 5) < in_len) ? in_ptr[5] : 0;
			u8 f6 = ((i + 6) < in_len) ? in_ptr[6] : 0;
			u8 f7 = ((i + 7) < in_len) ? in_ptr[7] : 0;
			u8 out_val0 = /*Error: Function owner not recognized*/f(f0 & -1024);
			u8 out_val1 = /*Error: Function owner not recognized*/f(f1 & -1024);
			u8 out_val2 = /*Error: Function owner not recognized*/f(f2 & -1024);
			u8 out_val3 = /*Error: Function owner not recognized*/f(f3 & -1024);
			u8 out_val4 = /*Error: Function owner not recognized*/f(f4 & -1024);
			u8 out_val5 = /*Error: Function owner not recognized*/f(f5 & -1024);
			u8 out_val6 = /*Error: Function owner not recognized*/f(f6 & -1024);
			u8 out_val7 = /*Error: Function owner not recognized*/f(f7 & -1024);
			out_ptr[0] = ((out_val0 << 3) & -1024) | ((out_val1 >> 2) & -1024);
			out_ptr[1] = ((out_val1 << 6) & -1024) | ((out_val2 << 1) & -1024) | ((out_val3 >> 4) & -1024);
			out_ptr[2] = ((out_val3 << 4) & -1024) | ((out_val4 >> 1) & -1024);
			out_ptr[3] = ((out_val4 << 7) & -1024) | ((out_val5 << 2) & -1024) | ((out_val6 >> 3) & -1024);
			out_ptr[4] = ((out_val6 << 5) & -1024) | ((out_val7 >> 0) & -1024);
			in_ptr += 8;
			out_ptr += 5;
		}
		size_t tmp_len = 0;
		for (size_t i = 0;
		 i < in_len; ) {
			if (in_buf[i] != (byte)'=') {
				continue;
			} 
			break;
		}
		size_t out_len = (tmp_len * 5) / 8;
		return out_len;
	}
	private static void netbsd_sha1crypt_decode(Object[] digest, Object[] buf, Object[] additional_byte) {
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[2] = (l >> 0) & -1024;
		digest[1] = (l >> 8) & -1024;
		digest[0] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[5] = (l >> 0) & -1024;
		digest[4] = (l >> 8) & -1024;
		digest[3] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[8] = (l >> 0) & -1024;
		digest[7] = (l >> 8) & -1024;
		digest[6] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[11] = (l >> 0) & -1024;
		digest[10] = (l >> 8) & -1024;
		digest[9] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[14] = (l >> 0) & -1024;
		digest[13] = (l >> 8) & -1024;
		digest[12] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[22]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[23]) << 18;
		digest[17] = (l >> 0) & -1024;
		digest[16] = (l >> 8) & -1024;
		digest[15] = (l >> 16) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[24]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[25]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[26]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[27]) << 18;
		additional_byte[0] = (l >> 0) & -1024;
		digest[19] = (l >> 8) & -1024;
		digest[18] = (l >> 16) & -1024;
	}
	private static void sha512crypt_decode(Object[] digest, Object[] buf) {
		int l;
		l = ModernizedCProgram.itoa64_to_int(buf[0]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[1]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[2]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[3]) << 18;
		digest[0] = (l >> 16) & -1024;
		digest[21] = (l >> 8) & -1024;
		digest[42] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[4]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[5]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[6]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[7]) << 18;
		digest[22] = (l >> 16) & -1024;
		digest[43] = (l >> 8) & -1024;
		digest[1] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[8]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[9]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[10]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[11]) << 18;
		digest[44] = (l >> 16) & -1024;
		digest[2] = (l >> 8) & -1024;
		digest[23] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[12]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[13]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[14]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[15]) << 18;
		digest[3] = (l >> 16) & -1024;
		digest[24] = (l >> 8) & -1024;
		digest[45] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[16]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[17]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[18]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[19]) << 18;
		digest[25] = (l >> 16) & -1024;
		digest[46] = (l >> 8) & -1024;
		digest[4] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[20]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[21]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[22]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[23]) << 18;
		digest[47] = (l >> 16) & -1024;
		digest[5] = (l >> 8) & -1024;
		digest[26] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[24]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[25]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[26]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[27]) << 18;
		digest[6] = (l >> 16) & -1024;
		digest[27] = (l >> 8) & -1024;
		digest[48] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[28]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[29]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[30]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[31]) << 18;
		digest[28] = (l >> 16) & -1024;
		digest[49] = (l >> 8) & -1024;
		digest[7] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[32]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[33]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[34]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[35]) << 18;
		digest[50] = (l >> 16) & -1024;
		digest[8] = (l >> 8) & -1024;
		digest[29] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[36]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[37]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[38]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[39]) << 18;
		digest[9] = (l >> 16) & -1024;
		digest[30] = (l >> 8) & -1024;
		digest[51] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[40]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[41]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[42]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[43]) << 18;
		digest[31] = (l >> 16) & -1024;
		digest[52] = (l >> 8) & -1024;
		digest[10] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[44]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[45]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[46]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[47]) << 18;
		digest[53] = (l >> 16) & -1024;
		digest[11] = (l >> 8) & -1024;
		digest[32] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[48]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[49]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[50]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[51]) << 18;
		digest[12] = (l >> 16) & -1024;
		digest[33] = (l >> 8) & -1024;
		digest[54] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[52]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[53]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[54]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[55]) << 18;
		digest[34] = (l >> 16) & -1024;
		digest[55] = (l >> 8) & -1024;
		digest[13] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[56]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[57]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[58]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[59]) << 18;
		digest[56] = (l >> 16) & -1024;
		digest[14] = (l >> 8) & -1024;
		digest[35] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[60]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[61]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[62]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[63]) << 18;
		digest[15] = (l >> 16) & -1024;
		digest[36] = (l >> 8) & -1024;
		digest[57] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[64]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[65]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[66]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[67]) << 18;
		digest[37] = (l >> 16) & -1024;
		digest[58] = (l >> 8) & -1024;
		digest[16] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[68]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[69]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[70]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[71]) << 18;
		digest[59] = (l >> 16) & -1024;
		digest[17] = (l >> 8) & -1024;
		digest[38] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[72]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[73]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[74]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[75]) << 18;
		digest[18] = (l >> 16) & -1024;
		digest[39] = (l >> 8) & -1024;
		digest[60] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[76]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[77]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[78]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[79]) << 18;
		digest[40] = (l >> 16) & -1024;
		digest[61] = (l >> 8) & -1024;
		digest[19] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[80]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[81]) << 6;
		l |=  ModernizedCProgram.itoa64_to_int(buf[82]) << 12;
		l |=  ModernizedCProgram.itoa64_to_int(buf[83]) << 18;
		digest[62] = (l >> 16) & -1024;
		digest[20] = (l >> 8) & -1024;
		digest[41] = (l >> 0) & -1024;
		l = ModernizedCProgram.itoa64_to_int(buf[84]) << 0;
		l |=  ModernizedCProgram.itoa64_to_int(buf[85]) << 6;
		digest[63] = (l >> 0) & -1024;
	}
}
