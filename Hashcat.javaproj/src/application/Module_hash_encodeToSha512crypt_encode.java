package application;

public class Module_hash_encodeToSha512crypt_encode {
	
	
	private static int module_hash_encode(Object hashconfig, Object digest_buf, Object salt, Object esalt_buf, Object hook_salt_buf, Object hash_info, byte[] line_buf, Object line_size) {
		u32[] digest = (u32)digest_buf;
		// the encoder is a bit too intelligent, it expects the input data in the wrong BOM
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		byte[] ptr_plain = new byte[64];
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_itoa64, (u8)tmp, 32, (u8)ptr_plain);
		ptr_plain[43] = 0;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", ptr_plain);
		odf12_t odf12 = (odf12_t)esalt_buf;
		int out_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*1*1*%u*32*%08x%08x%08x%08x%08x%08x%08x%08x*16*%08x%08x%08x%08x*16*%08x%08x%08x%08x*0*", ModernizedCProgram.SIGNATURE_ODF, odf12.getIterations(), ModernizedCProgram.byte_swap_32(odf12.getChecksum()[0]), ModernizedCProgram.byte_swap_32(odf12.getChecksum()[1]), ModernizedCProgram.byte_swap_32(odf12.getChecksum()[2]), ModernizedCProgram.byte_swap_32(odf12.getChecksum()[3]), ModernizedCProgram.byte_swap_32(odf12.getChecksum()[4]), ModernizedCProgram.byte_swap_32(odf12.getChecksum()[5]), ModernizedCProgram.byte_swap_32(odf12.getChecksum()[6]), ModernizedCProgram.byte_swap_32(odf12.getChecksum()[7]), ModernizedCProgram.byte_swap_32(odf12.getIv()[0]), ModernizedCProgram.byte_swap_32(odf12.getIv()[1]), ModernizedCProgram.byte_swap_32(odf12.getIv()[2]), ModernizedCProgram.byte_swap_32(odf12.getIv()[3]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]));
		u8 out_buf = (u8)line_buf;
		for (int i = 0;
		 i < 256; i++) {
			ModernizedCProgram.u32_to_hex(odf12.getEncrypted_data()[i], out_buf + out_len);
			out_len += 8;
		}
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.rotl32(digest[0], 29);
		tmp[1] = ModernizedCProgram.rotl32(digest[1], 29);
		{ 
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 1;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 1;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 8;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 8;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 2;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 2;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 16;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 16;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 4;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 4;
				tmp[1] = tmp[1] ^ t;
			}
			;
		}
		;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%s*%08X%08X", ModernizedCProgram.SIGNATURE_RACF, tmp_salt, ModernizedCProgram.byte_swap_32(tmp[0]), ModernizedCProgram.byte_swap_32(tmp[1]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		int out_len = 24;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = 0;
		tmp[3] = 0;
		{ 
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 1;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 1;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 8;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 8;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 2;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 2;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 16;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 16;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 4;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 4;
				tmp[1] = tmp[1] ^ t;
			}
			;
		}
		;
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len++;
		ModernizedCProgram.u32_to_hex(salt.getSalt_buf()[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(salt.getSalt_buf()[1], out_buf + out_len);
		out_len += 8;
		return out_len;
		pdf_t pdf = (pdf_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$pdf$%d*%d*%d*%d*%d*%d*%08x%08x%08x%08x*%d*%08x%08x%08x%08x%08x%08x%08x%08x*%d*%08x%08x%08x%08x%08x%08x%08x%08x", pdf.getV(), pdf.getR(), 40, pdf.getP(), pdf.getEnc_md(), pdf.getId_len(), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[3]), pdf.getU_len(), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[7]), pdf.getO_len(), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[7]));
		return line_len;
		office2007_t office2007 = (office2007_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%d*%d*%u*%d*%08x%08x%08x%08x*%08x%08x%08x%08x*%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_OFFICE2007, 2007, 20, office2007.getKeySize(), 16, salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3], office2007.getEncryptedVerifier()[0], office2007.getEncryptedVerifier()[1], office2007.getEncryptedVerifier()[2], office2007.getEncryptedVerifier()[3], office2007.getEncryptedVerifierHash()[0], office2007.getEncryptedVerifierHash()[1], office2007.getEncryptedVerifierHash()[2], office2007.getEncryptedVerifierHash()[3], office2007.getEncryptedVerifierHash()[4]);
		return line_len;
		krb5pa_17_t krb5pa = (krb5pa_17_t)esalt_buf;
		byte[] data = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < krb5pa.getEnc_timestamp_len(); ) {
			u8 ptr_enc_timestamp = (u8)krb5pa.getEnc_timestamp();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(data + j, "%02x", ptr_enc_timestamp[i]);
		}
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%s$%s%08x%08x%08x", ModernizedCProgram.SIGNATURE_KRB5PA, (byte)krb5pa.getUser(), (byte)krb5pa.getDomain(), data, krb5pa.getChecksum()[0], krb5pa.getChecksum()[1], krb5pa.getChecksum()[2]);
		return line_len;
		apple_secure_notes_t apple_secure_notes = (apple_secure_notes_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%u*%u*%08x%08x%08x%08x*%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_APPLE_SECURE_NOTES, apple_secure_notes.getZ_PK(), apple_secure_notes.getZCRYPTOITERATIONCOUNT(), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOSALT()[0]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOSALT()[1]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOSALT()[2]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOSALT()[3]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[0]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[1]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[2]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[3]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[4]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[5]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s0$1$%08x%08x$%08x%08x", ModernizedCProgram.SIGNATURE_ECRYPTFS, salt.getSalt_buf()[0], salt.getSalt_buf()[1], digest[0], digest[1]);
		return line_len;
		pkzip_t pkzip = (pkzip_t)esalt_buf;
		int out_len = 0;
		if (pkzip.getVersion() == 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(line_buf, "%s", ModernizedCProgram.SIGNATURE_PKZIP_V1);
			out_len += 7;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(line_buf, "%s", ModernizedCProgram.SIGNATURE_PKZIP_V2);
				out_len += 8;
		} 
		out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%i*", pkzip.getHash_count(), pkzip.getChecksum_size());
		out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%i*", pkzip.getHash().getData_type_enum(), pkzip.getHash().getMagic_type_enum());
		if (pkzip.getHash().getData_type_enum() > 1) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%x*%x*%x*%x*%x*", pkzip.getHash().getCompressed_length(), pkzip.getHash().getUncompressed_length(), pkzip.getHash().getCrc32(), pkzip.getHash().getOffset(), pkzip.getHash().getAdditional_offset());
		} 
		out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%x*%04x*", pkzip.getHash().getCompression_type(), pkzip.getHash().getData_length(), pkzip.getHash().getChecksum_from_crc());
		if (pkzip.getVersion() == 2) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%04x*", pkzip.getHash().getChecksum_from_timestamp());
		} 
		for (u32 i = 0;
		 i < pkzip.getHash().getData_length() / 4; i++) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%08x", ModernizedCProgram.byte_swap_32(pkzip.getHash().getData()[i]));
		}
		for (u32 i = 0;
		 i < pkzip.getHash().getData_length() % 4; i++) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%02x", (pkzip.getHash().getData()[pkzip.getHash().getData_length() / 4] >> i * 8) & -1024);
		}
		if (pkzip.getVersion() == 1) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*$/pkzip$");
		} else {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*$/pkzip2$");
		} 
		return out_len;
		u64[] digest = (u64)digest_buf;
		// this (useless?) initialization makes scan-build happyu64[] tmp = new u64[]{0};
		tmp[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		tmp[4] = 0;
		tmp[5] = 0;
		tmp[6] = 0;
		tmp[7] = 0;
		byte[] ptr_plain = new byte[]{0};
		ModernizedCProgram.drupal7_encode((u8)tmp, (u8)ptr_plain)// ugly hack start;// ugly hack start
		byte[] tmpx = (byte)salt.getSalt_buf_pc();
		ptr_plain[42] = tmpx[0]// ugly hack end;// ugly hack end
		ptr_plain[43] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s%s", (byte)salt.getSalt_sign(), (byte)salt.getSalt_buf(), ptr_plain);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// encode iteration count
		byte[] salt_iter = new byte[5];
		salt_iter[0] = ModernizedCProgram.int_to_itoa64((salt.getSalt_iter()) & -1024);
		salt_iter[1] = ModernizedCProgram.int_to_itoa64((salt.getSalt_iter() >> 6) & -1024);
		salt_iter[2] = ModernizedCProgram.int_to_itoa64((salt.getSalt_iter() >> 12) & -1024);
		salt_iter[3] = ModernizedCProgram.int_to_itoa64((salt.getSalt_iter() >> 18) & -1024);
		salt_iter[4] = 0// encode salt;// encode salt
		byte[] ptr_salt = new byte[5];
		ptr_salt[0] = ModernizedCProgram.int_to_itoa64((salt.getSalt_buf()[0]) & -1024);
		ptr_salt[1] = ModernizedCProgram.int_to_itoa64((salt.getSalt_buf()[0] >> 6) & -1024);
		ptr_salt[2] = ModernizedCProgram.int_to_itoa64((salt.getSalt_buf()[0] >> 12) & -1024);
		ptr_salt[3] = ModernizedCProgram.int_to_itoa64((salt.getSalt_buf()[0] >> 18) & -1024);
		ptr_salt[4] = 0// encode digest;// encode digest
		u32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.rotl32(digest[0], 31);
		tmp[1] = ModernizedCProgram.rotl32(digest[1], 31);
		{ 
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 1;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 1;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 8;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 8;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 2;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 2;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 16;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 16;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 4;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 4;
				tmp[1] = tmp[1] ^ t;
			}
			;
		}
		;
		byte[] ptr_plain = new byte[12];
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_itoa64, (u8)tmp, 8, (u8)ptr_plain);
		ptr_plain[11] = 0// fill the resulting buffer;// fill the resulting buffer
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "_%s%s%s", salt_iter, ptr_salt, ptr_plain);
		return line_len;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		int out_len = 32;
		return out_len;
		 wpa_pmkid = ()esalt_buf;
		int line_len = 0;
		if (ModernizedCProgram.need_hexify((u8)wpa_pmkid.getEssid_buf(), wpa_pmkid.getEssid_len(), (byte)':', 0) == 1) {
			byte[] tmp_buf = new byte[128];
			int tmp_len = 0;
			tmp_buf[tmp_len++] = (byte)'$';
			tmp_buf[tmp_len++] = (byte)'H';
			tmp_buf[tmp_len++] = (byte)'E';
			tmp_buf[tmp_len++] = (byte)'X';
			tmp_buf[tmp_len++] = (byte)'[';
			ModernizedCProgram.exec_hexify((u8)wpa_pmkid.getEssid_buf(), wpa_pmkid.getEssid_len(), (u8)tmp_buf + tmp_len);
			tmp_len += wpa_pmkid.getEssid_len() * 2;
			tmp_buf[tmp_len++] = (byte)']';
			tmp_buf[tmp_len++] = 0;
			line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%02x%02x%02x%02x%02x%02x:%02x%02x%02x%02x%02x%02x:%s", wpa_pmkid.getOrig_mac_ap()[0], wpa_pmkid.getOrig_mac_ap()[1], wpa_pmkid.getOrig_mac_ap()[2], wpa_pmkid.getOrig_mac_ap()[3], wpa_pmkid.getOrig_mac_ap()[4], wpa_pmkid.getOrig_mac_ap()[5], wpa_pmkid.getOrig_mac_sta()[0], wpa_pmkid.getOrig_mac_sta()[1], wpa_pmkid.getOrig_mac_sta()[2], wpa_pmkid.getOrig_mac_sta()[3], wpa_pmkid.getOrig_mac_sta()[4], wpa_pmkid.getOrig_mac_sta()[5], tmp_buf);
		} else {
				line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%02x%02x%02x%02x%02x%02x:%02x%02x%02x%02x%02x%02x:%s", wpa_pmkid.getOrig_mac_ap()[0], wpa_pmkid.getOrig_mac_ap()[1], wpa_pmkid.getOrig_mac_ap()[2], wpa_pmkid.getOrig_mac_ap()[3], wpa_pmkid.getOrig_mac_ap()[4], wpa_pmkid.getOrig_mac_ap()[5], wpa_pmkid.getOrig_mac_sta()[0], wpa_pmkid.getOrig_mac_sta()[1], wpa_pmkid.getOrig_mac_sta()[2], wpa_pmkid.getOrig_mac_sta()[3], wpa_pmkid.getOrig_mac_sta()[4], wpa_pmkid.getOrig_mac_sta()[5], (byte)wpa_pmkid.getEssid_buf());
		} 
		return line_len;
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = 0;
		tmp[7] = 0;
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA384M_A;
			tmp[1] += sha2_64_constants.SHA384M_B;
			tmp[2] += sha2_64_constants.SHA384M_C;
			tmp[3] += sha2_64_constants.SHA384M_D;
			tmp[4] += sha2_64_constants.SHA384M_E;
			tmp[5] += sha2_64_constants.SHA384M_F;
			tmp[6] += 0;
			tmp[7] += 0;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = 0;
		tmp[7] = 0;
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + 16);
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + 32);
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + 48);
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + 64);
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + 80);
		int out_len = 96;
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32 salt_challenge = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]);
		byte[] user_name = new byte[]{0};
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(user_name, salt.getSalt_buf() + 1, salt.getSalt_len() - 4);
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s*%08x*%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_POSTGRESQL_AUTH, user_name, salt_challenge, ModernizedCProgram.byte_swap_32(tmp[0]), ModernizedCProgram.byte_swap_32(tmp[1]), ModernizedCProgram.byte_swap_32(tmp[2]), ModernizedCProgram.byte_swap_32(tmp[3]));
		return line_len;
		u64[] digest = (u64)digest_buf;
		pbkdf2_sha512_t pbkdf2_sha512 = (pbkdf2_sha512_t)esalt_buf;
		// hashu64[] tmp = new u64();
		tmp[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		tmp[8] = 0;
		byte[] salt_enc = new byte[]{0};
		byte[] hash_enc = new byte[]{0};
		size_t salt_len_enc = ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_ab64, (u8)pbkdf2_sha512.getSalt_buf(), salt.getSalt_len(), (u8)salt_enc);
		size_t hash_len_enc = ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_ab64, (u8)tmp, ModernizedCProgram.HASH_LEN_RAW, (u8)hash_enc);
		// remove padding =for (size_t i = 0;
		 i < salt_len_enc; i++) {
			if (salt_enc[i] == (byte)'=') {
				salt_enc[i] = (byte)'\0';
			} 
		}
		for (size_t i = 0;
		 i < hash_len_enc; i++) {
			if (hash_enc[i] == (byte)'=') {
				hash_enc[i] = (byte)'\0';
			} 
		}
		// outputint line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$%s$%u$%s$%s", ModernizedCProgram.SIGNATURE_PASSLIB_PBKDF2_SHA512, salt.getSalt_iter() + 1, salt_enc, hash_enc);
		return line_len;
		u32[] digest = (u32)digest_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x", salt.getSalt_buf()[4], salt.getSalt_buf()[5], salt.getSalt_buf()[6], salt.getSalt_buf()[7], salt.getSalt_buf()[8], salt.getSalt_buf()[9], salt.getSalt_buf()[10], salt.getSalt_buf()[11], digest[0], digest[1], digest[2], digest[3], digest[4], digest[5], digest[6], digest[7], salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s$%08X%08X", tmp_salt, ModernizedCProgram.byte_swap_32(digest[0]), ModernizedCProgram.byte_swap_32(digest[1]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)out_buf + out_len);
		return out_len;
		u64[] digest = (u64)digest_buf;
		// this (useless?) initialization makes scan-build happyu64[] tmp = new u64[]{0};
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		byte[] ptr_plain = new byte[]{0};
		ModernizedCProgram.sha512aix_encode((byte)tmp, (byte)ptr_plain);
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%02u$%s$%s", ModernizedCProgram.SIGNATURE_SHA512AIX, salt.getSalt_sign()[0], tmp_salt, ptr_plain);
		return line_len;
		u32[] digest = (u32)digest_buf;
		int line_len = 0;
		int iter = salt.getSalt_iter();
		if (iter == ModernizedCProgram.ROUNDS_QNX) {
			line_buf[line_len++] = (byte)'@';
			line_buf[line_len++] = (byte)'m';
			line_buf[line_len++] = (byte)'@';
		} else {
				line_buf[line_len++] = (byte)'@';
				line_buf[line_len++] = (byte)'m';
				line_buf[line_len++] = (byte)',';
				line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%d", iter);
				line_buf[line_len++] = (byte)'@';
		} 
		ModernizedCProgram.u32_to_hex(digest[0], (u8)line_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(digest[1], (u8)line_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(digest[2], (u8)line_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(digest[3], (u8)line_buf + line_len);
		line_len += 8;
		line_buf[line_len++] = (byte)'@';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(line_buf + line_len, salt.getSalt_buf(), salt.getSalt_len());
		line_len += salt.getSalt_len();
		line_buf[line_len] = 0;
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		tmp[8] = digest[8];
		tmp[9] = digest[9];
		tmp[10] = digest[10];
		tmp[11] = digest[11];
		tmp[12] = digest[12];
		tmp[13] = digest[13];
		tmp[14] = digest[14];
		tmp[15] = digest[15];
		u8[] out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + 56);
		ModernizedCProgram.u32_to_hex(tmp[8], out_buf + 64);
		ModernizedCProgram.u32_to_hex(tmp[9], out_buf + 72);
		ModernizedCProgram.u32_to_hex(tmp[10], out_buf + 80);
		ModernizedCProgram.u32_to_hex(tmp[11], out_buf + 88);
		ModernizedCProgram.u32_to_hex(tmp[12], out_buf + 96);
		ModernizedCProgram.u32_to_hex(tmp[13], out_buf + 104);
		ModernizedCProgram.u32_to_hex(tmp[14], out_buf + 112);
		ModernizedCProgram.u32_to_hex(tmp[15], out_buf + 120);
		int out_len = 128;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		ikepsk_t ikepsk = (ikepsk_t)esalt_buf;
		int line_len = 0;
		// msg_buf
		u32 ikepsk_msg_len = ikepsk.getMsg_len()[5] / 4;
		for (u32 i = 0;
		 i < ikepsk_msg_len; i++) {
			if ((i == ikepsk.getMsg_len()[0] / 4) || (i == ikepsk.getMsg_len()[1] / 4) || (i == ikepsk.getMsg_len()[2] / 4) || (i == ikepsk.getMsg_len()[3] / 4) || (i == ikepsk.getMsg_len()[4] / 4)) {
				line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, ":");
			} 
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%08x", ModernizedCProgram.byte_swap_32(ikepsk.getMsg_buf()[i]));
		}
		// nr_bufu32 ikepsk_nr_len = ikepsk.getNr_len() / 4;
		for (u32 i = 0;
		 i < ikepsk_nr_len; i++) {
			if ((i == 0) || (i == 5)) {
				line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, ":");
			} 
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%08x", ModernizedCProgram.byte_swap_32(ikepsk.getNr_buf()[i]));
		}
		// digest_buffor (u32 i = 0;
		 i < 5; i++) {
			if (i == 0) {
				line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, ":");
			} 
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%08x", digest[i]);
		}
		return line_len;
		android_backup_t android_backup = (android_backup_t)esalt_buf;
		int line_len = 0;
		line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%s%u*%u*%u", ModernizedCProgram.SIGNATURE_ANDROID_BACKUP, android_backup.getVersion(), android_backup.getCipher(), android_backup.getIter());
		line_buf[line_len++] = (byte)'*';
		for (int i = 0;
		 i < 16; i++) {
			ModernizedCProgram.u32_to_hex(android_backup.getUser_salt()[i], (u8)line_buf + line_len);
			line_len += 8;
		}
		line_buf[line_len++] = (byte)'*';
		for (int i = 0;
		 i < 16; i++) {
			ModernizedCProgram.u32_to_hex(android_backup.getCk_salt()[i], (u8)line_buf + line_len);
			line_len += 8;
		}
		line_buf[line_len++] = (byte)'*';
		for (int i = 0;
		 i < 4; i++) {
			ModernizedCProgram.u32_to_hex(android_backup.getUser_iv()[i], (u8)line_buf + line_len);
			line_len += 8;
		}
		line_buf[line_len++] = (byte)'*';
		for (int i = 0;
		 i < 24; i++) {
			ModernizedCProgram.u32_to_hex(android_backup.getMasterkey_blob()[i], (u8)line_buf + line_len);
			line_len += 8;
		}
		return line_len;
		byte[] ptr_plain = new byte[]{0};
		ModernizedCProgram.sha256crypt_encode((byte)digest_buf, (byte)ptr_plain);
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len;
		if (salt.getSalt_iter() == ModernizedCProgram.ROUNDS_SHA256CRYPT) {
			line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$5$%s$%s", tmp_salt, ptr_plain);
		} else {
				line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$5$rounds=%u$%s$%s", salt.getSalt_iter(), tmp_salt, ptr_plain);
		} 
		return line_len;
		u64[] digest = (u64)digest_buf;
		solarwinds_t solarwinds = (solarwinds_t)esalt_buf;
		// hash
		u64[] tmp = new u64();
		tmp[0] = ModernizedCProgram.byte_swap_64(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(digest[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(digest[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(digest[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(digest[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(digest[7]);
		tmp[8] = 0;
		byte[] hash_enc = new byte[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp, 64, (u8)hash_enc);
		// outputint line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%s", ModernizedCProgram.SIGNATURE_SOLARWINDS_ORION, (byte)solarwinds.getSalt_buf(), hash_enc);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// salt
		pbkdf2_sha256_t pbkdf2_sha256 = (pbkdf2_sha256_t)esalt_buf;
		Byte salt_buf_ptr = (byte)pbkdf2_sha256.getSalt_buf();
		// hash
		u32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		// needed for base64_encode ()// needed for base64_encode ()tmp[8] = 0;
		byte[] tmp_buf = new byte[48];
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_itoa64, (u8)tmp, 32, (u8)tmp_buf);
		// cut it here// cut it heretmp_buf[43] = 0// output;// output
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%s", ModernizedCProgram.SIGNATURE_CISCO8, salt_buf_ptr, tmp_buf);
		return line_len;
		 wpa_eapol = ()esalt_buf;
		int line_len = 0;
		if (ModernizedCProgram.need_hexify(wpa_eapol.getEssid(), wpa_eapol.getEssid_len(), (byte)':', 0) == 1) {
			byte[] tmp_buf = new byte[128];
			int tmp_len = 0;
			tmp_buf[tmp_len++] = (byte)'$';
			tmp_buf[tmp_len++] = (byte)'H';
			tmp_buf[tmp_len++] = (byte)'E';
			tmp_buf[tmp_len++] = (byte)'X';
			tmp_buf[tmp_len++] = (byte)'[';
			ModernizedCProgram.exec_hexify(wpa_eapol.getEssid(), wpa_eapol.getEssid_len(), (u8)tmp_buf + tmp_len);
			tmp_len += wpa_eapol.getEssid_len() * 2;
			tmp_buf[tmp_len++] = (byte)']';
			tmp_buf[tmp_len++] = 0;
			line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%02x%02x%02x%02x%02x%02x:%02x%02x%02x%02x%02x%02x:%s", wpa_eapol.getOrig_mac_ap()[0], wpa_eapol.getOrig_mac_ap()[1], wpa_eapol.getOrig_mac_ap()[2], wpa_eapol.getOrig_mac_ap()[3], wpa_eapol.getOrig_mac_ap()[4], wpa_eapol.getOrig_mac_ap()[5], wpa_eapol.getOrig_mac_sta()[0], wpa_eapol.getOrig_mac_sta()[1], wpa_eapol.getOrig_mac_sta()[2], wpa_eapol.getOrig_mac_sta()[3], wpa_eapol.getOrig_mac_sta()[4], wpa_eapol.getOrig_mac_sta()[5], tmp_buf);
		} else {
				line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%02x%02x%02x%02x%02x%02x:%02x%02x%02x%02x%02x%02x:%s", wpa_eapol.getOrig_mac_ap()[0], wpa_eapol.getOrig_mac_ap()[1], wpa_eapol.getOrig_mac_ap()[2], wpa_eapol.getOrig_mac_ap()[3], wpa_eapol.getOrig_mac_ap()[4], wpa_eapol.getOrig_mac_ap()[5], wpa_eapol.getOrig_mac_sta()[0], wpa_eapol.getOrig_mac_sta()[1], wpa_eapol.getOrig_mac_sta()[2], wpa_eapol.getOrig_mac_sta()[3], wpa_eapol.getOrig_mac_sta()[4], wpa_eapol.getOrig_mac_sta()[5], wpa_eapol.getEssid());
		} 
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] ptr_plain = new u8[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp, 20, (u8)ptr_plain);
		int out_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "{SHA}%s", (byte)ptr_plain);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		int out_len = 40;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8 out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		return out_len;
		u32[] digest = (u32)digest_buf;
		ansible_vault_t ansible_vault = (ansible_vault_t)esalt_buf;
		u8[] ct_data = new u8[]{0};
		u32[] ct_data_ptr = ansible_vault.getCt_data_buf();
		for (u32 i = 0;
		u32 j = 0;
		 i < ansible_vault.getCt_data_len() / 4; ) {
			ModernizedCProgram.u32_to_hex(ct_data_ptr[i], ct_data + j);
		}
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u*%u*%08x%08x%08x%08x%08x%08x%08x%08x*%s*%08x%08x%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_ANSIBLE_VAULT, ansible_vault.getCipher(), ansible_vault.getVersion(), salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3], salt.getSalt_buf()[4], salt.getSalt_buf()[5], salt.getSalt_buf()[6], salt.getSalt_buf()[7], ct_data, digest[0], digest[1], digest[2], digest[3], digest[4], digest[5], digest[6], digest[7]);
		return line_len;
		u64[] digest = (u64)digest_buf;
		u64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA512M_A;
			tmp[1] += sha2_64_constants.SHA512M_B;
			tmp[2] += sha2_64_constants.SHA512M_C;
			tmp[3] += sha2_64_constants.SHA512M_D;
			tmp[4] += sha2_64_constants.SHA512M_E;
			tmp[5] += sha2_64_constants.SHA512M_F;
			tmp[6] += sha2_64_constants.SHA512M_G;
			tmp[7] += sha2_64_constants.SHA512M_H;
		} 
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "0x0200%s%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x", tmp_salt, ModernizedCProgram.v32b_from_v64(tmp[0]), ModernizedCProgram.v32a_from_v64(tmp[0]), ModernizedCProgram.v32b_from_v64(tmp[1]), ModernizedCProgram.v32a_from_v64(tmp[1]), ModernizedCProgram.v32b_from_v64(tmp[2]), ModernizedCProgram.v32a_from_v64(tmp[2]), ModernizedCProgram.v32b_from_v64(tmp[3]), ModernizedCProgram.v32a_from_v64(tmp[3]), ModernizedCProgram.v32b_from_v64(tmp[4]), ModernizedCProgram.v32a_from_v64(tmp[4]), ModernizedCProgram.v32b_from_v64(tmp[5]), ModernizedCProgram.v32a_from_v64(tmp[5]), ModernizedCProgram.v32b_from_v64(tmp[6]), ModernizedCProgram.v32a_from_v64(tmp[6]), ModernizedCProgram.v32b_from_v64(tmp[7]), ModernizedCProgram.v32a_from_v64(tmp[7]));
		return line_len;
		u8[] tmp = new u8[]{0};
		ModernizedCProgram.md5crypt_encode(digest_buf, tmp);
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = 0;
		if (salt.getSalt_iter() == ModernizedCProgram.ROUNDS_MD5CRYPT) {
			line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$apr1$%s$%s", tmp_salt, tmp);
		} else {
				line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$apr1$rounds=%u$%s$%s", salt.getSalt_iter(), tmp_salt, tmp);
		} 
		return line_len;
		pdf_t pdf = (pdf_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$pdf$%d*%d*%d*%d*%d*%d*%08x%08x%08x%08x*%d*%08x%08x%08x%08x%08x%08x%08x%08x*%d*%08x%08x%08x%08x%08x%08x%08x%08x", pdf.getV(), pdf.getR(), 40, pdf.getP(), pdf.getEnc_md(), pdf.getId_len(), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[3]), pdf.getU_len(), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[7]), pdf.getO_len(), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[7]));
		return line_len;
		 wpa_pmkid = ()esalt_buf;
		int line_len = 0;
		if (wpa_pmkid.getEssid_len()) {
			if (ModernizedCProgram.need_hexify((u8)wpa_pmkid.getEssid_buf(), wpa_pmkid.getEssid_len(), (byte)':', 0) == 1) {
				byte[] tmp_buf = new byte[128];
				int tmp_len = 0;
				tmp_buf[tmp_len++] = (byte)'$';
				tmp_buf[tmp_len++] = (byte)'H';
				tmp_buf[tmp_len++] = (byte)'E';
				tmp_buf[tmp_len++] = (byte)'X';
				tmp_buf[tmp_len++] = (byte)'[';
				ModernizedCProgram.exec_hexify((u8)wpa_pmkid.getEssid_buf(), wpa_pmkid.getEssid_len(), (u8)tmp_buf + tmp_len);
				tmp_len += wpa_pmkid.getEssid_len() * 2;
				tmp_buf[tmp_len++] = (byte)']';
				tmp_buf[tmp_len++] = 0;
				line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%02x%02x%02x%02x%02x%02x:%02x%02x%02x%02x%02x%02x:%s", wpa_pmkid.getOrig_mac_ap()[0], wpa_pmkid.getOrig_mac_ap()[1], wpa_pmkid.getOrig_mac_ap()[2], wpa_pmkid.getOrig_mac_ap()[3], wpa_pmkid.getOrig_mac_ap()[4], wpa_pmkid.getOrig_mac_ap()[5], wpa_pmkid.getOrig_mac_sta()[0], wpa_pmkid.getOrig_mac_sta()[1], wpa_pmkid.getOrig_mac_sta()[2], wpa_pmkid.getOrig_mac_sta()[3], wpa_pmkid.getOrig_mac_sta()[4], wpa_pmkid.getOrig_mac_sta()[5], tmp_buf);
			} else {
					line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%02x%02x%02x%02x%02x%02x:%02x%02x%02x%02x%02x%02x:%s", wpa_pmkid.getOrig_mac_ap()[0], wpa_pmkid.getOrig_mac_ap()[1], wpa_pmkid.getOrig_mac_ap()[2], wpa_pmkid.getOrig_mac_ap()[3], wpa_pmkid.getOrig_mac_ap()[4], wpa_pmkid.getOrig_mac_ap()[5], wpa_pmkid.getOrig_mac_sta()[0], wpa_pmkid.getOrig_mac_sta()[1], wpa_pmkid.getOrig_mac_sta()[2], wpa_pmkid.getOrig_mac_sta()[3], wpa_pmkid.getOrig_mac_sta()[4], wpa_pmkid.getOrig_mac_sta()[5], (byte)wpa_pmkid.getEssid_buf());
			} 
		} else {
				line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%02x%02x%02x%02x%02x%02x:%02x%02x%02x%02x%02x%02x", wpa_pmkid.getOrig_mac_ap()[0], wpa_pmkid.getOrig_mac_ap()[1], wpa_pmkid.getOrig_mac_ap()[2], wpa_pmkid.getOrig_mac_ap()[3], wpa_pmkid.getOrig_mac_ap()[4], wpa_pmkid.getOrig_mac_ap()[5], wpa_pmkid.getOrig_mac_sta()[0], wpa_pmkid.getOrig_mac_sta()[1], wpa_pmkid.getOrig_mac_sta()[2], wpa_pmkid.getOrig_mac_sta()[3], wpa_pmkid.getOrig_mac_sta()[4], wpa_pmkid.getOrig_mac_sta()[5]);
		} 
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		bsp_t bsp = (bsp_t)esalt_buf;
		u8[] tmp_buf = new u8();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 0, bsp.getSignature(), 3);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 3, bsp.getDigest(), 32);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 35, bsp.getSalt(), 16);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 51, bsp.getIter(), 4);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 55, bsp.getCrc32(), 4);
		return ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp_buf, 59, (u8)line_buf);
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		int out_len = 24;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32 tmp = ModernizedCProgram.byte_swap_32(digest[0]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp, out_buf);
		int out_len = 8;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = 0;
		tmp[3] = 0;
		{ 
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 1;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 1;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 8;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 8;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 2;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 2;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 16;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 16;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 4;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 4;
				tmp[1] = tmp[1] ^ t;
			}
			;
		}
		;
		u8 out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		return out_len;
		u32[] digest = (u32)digest_buf;
		ikepsk_t ikepsk = (ikepsk_t)esalt_buf;
		int line_len = 0;
		// msg_buf
		u32 ikepsk_msg_len = ikepsk.getMsg_len()[5] / 4;
		for (u32 i = 0;
		 i < ikepsk_msg_len; i++) {
			if ((i == ikepsk.getMsg_len()[0] / 4) || (i == ikepsk.getMsg_len()[1] / 4) || (i == ikepsk.getMsg_len()[2] / 4) || (i == ikepsk.getMsg_len()[3] / 4) || (i == ikepsk.getMsg_len()[4] / 4)) {
				line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, ":");
			} 
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%08x", ModernizedCProgram.byte_swap_32(ikepsk.getMsg_buf()[i]));
		}
		// nr_bufu32 ikepsk_nr_len = ikepsk.getNr_len() / 4;
		for (u32 i = 0;
		 i < ikepsk_nr_len; i++) {
			if ((i == 0) || (i == 5)) {
				line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, ":");
			} 
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%08x", ModernizedCProgram.byte_swap_32(ikepsk.getNr_buf()[i]));
		}
		// digest_buffor (u32 i = 0;
		 i < 4; i++) {
			if (i == 0) {
				line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, ":");
			} 
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%08x", ModernizedCProgram.byte_swap_32(digest[i]));
		}
		return line_len;
		u32[] digest = (u32)digest_buf;
		int line_len = 0;
		line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%s%u#", ModernizedCProgram.SIGNATURE_DCC2, salt.getSalt_iter() + 1);
		line_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)line_buf + line_len);
		line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "#%08x%08x%08x%08x", digest[0], digest[1], digest[2], digest[3]);
		return line_len;
		seven_zip_hook_salt_t seven_zip = (seven_zip_hook_salt_t)hook_salt_buf;
		Object generatedData_len = seven_zip.getData_len();
		u32 data_len = generatedData_len;
		Byte data_buf = (byte)ModernizedCProgram.hcmalloc((data_len * 2) + 1);
		Object[] generatedData_buf = seven_zip.getData_buf();
		for (u32 i = 0;
		u32 j = 0;
		 i < data_len; ) {
			u8 ptr = (u8)generatedData_buf;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(data_buf + j, (data_len * 2) + 1 - j, "%02x", ptr[i]);
		}
		u32 salt_iter = salt.getSalt_iter();
		u32[] iv = new u32();
		Object[] generatedIv_buf = seven_zip.getIv_buf();
		iv[0] = ModernizedCProgram.byte_swap_32(generatedIv_buf[0]);
		iv[1] = ModernizedCProgram.byte_swap_32(generatedIv_buf[1]);
		iv[2] = ModernizedCProgram.byte_swap_32(generatedIv_buf[2]);
		iv[3] = ModernizedCProgram.byte_swap_32(generatedIv_buf[3]);
		Object generatedIv_len = seven_zip.getIv_len();
		u32 iv_len = generatedIv_len;
		// the log2 () of salt_iteru32 cost = 0;
		while (salt_iter >>=  1) {
			cost++;
		}
		Object generatedSalt_len = seven_zip.getSalt_len();
		Object[] generatedSalt_buf = seven_zip.getSalt_buf();
		Object generatedCrc = seven_zip.getCrc();
		Object generatedUnpack_size = seven_zip.getUnpack_size();
		int bytes_written = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u$%u$%u$%s$%u$%08x%08x%08x%08x$%u$%u$%u$%s", ModernizedCProgram.SIGNATURE_SEVEN_ZIP, salt.getSalt_sign()[0], cost, generatedSalt_len, (byte)generatedSalt_buf, iv_len, iv[0], iv[1], iv[2], iv[3], generatedCrc, generatedData_len, generatedUnpack_size, data_buf);
		Object generatedData_type = seven_zip.getData_type();
		Object generatedCrc_len = seven_zip.getCrc_len();
		Object[] generatedCoder_attributes = seven_zip.getCoder_attributes();
		Object generatedCoder_attributes_len = seven_zip.getCoder_attributes_len();
		if (generatedData_type > 0) {
			bytes_written += /*Error: Function owner not recognized*/snprintf(line_buf + bytes_written, line_size - bytes_written, "$%u$", generatedCrc_len);
			u8 ptr = (u8)generatedCoder_attributes;
			for (u32 i = 0;
			u32 j = 0;
			 i < generatedCoder_attributes_len; ) {
				bytes_written += /*Error: Function owner not recognized*/snprintf(line_buf + bytes_written, line_size - bytes_written, "%02x", ptr[i]);
			}
		} 
		ModernizedCProgram.hcfree(data_buf);
		return bytes_written;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		dpapimk_t dpapimk = (dpapimk_t)esalt_buf;
		u32 version = 2;
		u32 context = dpapimk.getContext();
		u32 rounds = salt.getSalt_iter() + 1;
		u32 contents_len = dpapimk.getContents_len();
		u32 SID_len = dpapimk.getSID_len();
		u32 iv_len = 32;
		u8[] cipher_algorithm = new u8[]{0};
		u8[] hash_algorithm = new u8[]{0};
		u8[] SID = new u8[]{0};
		u8[] SID_tmp = new u8();
		u32[] ptr_SID = (u32)dpapimk.getSID();
		u32[] ptr_iv = (u32)dpapimk.getIv();
		u32[] ptr_contents = (u32)dpapimk.getContents();
		u32[] u32_iv = new u32();
		u8[] iv = new u8();
		// convert back SID
		SID_tmp = (u8)ModernizedCProgram.hcmalloc((SID_len + 1) * /*Error: Unsupported expression*/);
		for (u32 i = 0;
		 i < (SID_len / 4) + 1; i++) {
			u8[] hex = new u8[]{0};
			ModernizedCProgram.u32_to_hex(ModernizedCProgram.byte_swap_32(ptr_SID[i]), hex);
			for (u32 j = 0;
			u32 k = 0;
			 j < 8; ) {
				SID_tmp[i * 4 + k] = ModernizedCProgram.hex_to_u8(hex[j]);
			}
		}
		// overwrite trailing 0x80// overwrite trailing 0x80SID_tmp[SID_len] = 0;
		for (u32 i = 0;
		u32 j = 0;
		 j < SID_len; ) {
			SID[i] = SID_tmp[j];
		}
		ModernizedCProgram.hcfree(SID_tmp);
		for (u32 i = 0;
		 i < iv_len / 8; i++) {
			u32_iv[i] = ModernizedCProgram.byte_swap_32(ptr_iv[i]);
			ModernizedCProgram.u32_to_hex(u32_iv[i], iv + i * 8);
		}
		iv[32] = 0;
		u32[] u32_contents = new u32();
		u8[] contents = new u8();
		for (u32 i = 0;
		 i < contents_len / 8; i++) {
			u32_contents[i] = ModernizedCProgram.byte_swap_32(ptr_contents[i]);
			ModernizedCProgram.u32_to_hex(u32_contents[i], contents + i * 8);
		}
		contents[288] = 0;
		if (contents_len == 288) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(cipher_algorithm, "aes256", /*Error: Function owner not recognized*/strlen("aes256"));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(hash_algorithm, "sha512", /*Error: Function owner not recognized*/strlen("sha512"));
		} 
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u*%u*%s*%s*%s*%u*%s*%u*%s", ModernizedCProgram.SIGNATURE_DPAPIMK, version, context, SID, cipher_algorithm, hash_algorithm, rounds, iv, contents_len, contents);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8 out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		return out_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		int out_len = 32;
		return out_len;
		 wpa_eapol = ()esalt_buf;
		int line_len = 0;
		if (ModernizedCProgram.need_hexify(wpa_eapol.getEssid(), wpa_eapol.getEssid_len(), (byte)':', 0) == 1) {
			byte[] tmp_buf = new byte[128];
			int tmp_len = 0;
			tmp_buf[tmp_len++] = (byte)'$';
			tmp_buf[tmp_len++] = (byte)'H';
			tmp_buf[tmp_len++] = (byte)'E';
			tmp_buf[tmp_len++] = (byte)'X';
			tmp_buf[tmp_len++] = (byte)'[';
			ModernizedCProgram.exec_hexify(wpa_eapol.getEssid(), wpa_eapol.getEssid_len(), (u8)tmp_buf + tmp_len);
			tmp_len += wpa_eapol.getEssid_len() * 2;
			tmp_buf[tmp_len++] = (byte)']';
			tmp_buf[tmp_len++] = 0;
			line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%02x%02x%02x%02x%02x%02x:%02x%02x%02x%02x%02x%02x:%s", wpa_eapol.getOrig_mac_ap()[0], wpa_eapol.getOrig_mac_ap()[1], wpa_eapol.getOrig_mac_ap()[2], wpa_eapol.getOrig_mac_ap()[3], wpa_eapol.getOrig_mac_ap()[4], wpa_eapol.getOrig_mac_ap()[5], wpa_eapol.getOrig_mac_sta()[0], wpa_eapol.getOrig_mac_sta()[1], wpa_eapol.getOrig_mac_sta()[2], wpa_eapol.getOrig_mac_sta()[3], wpa_eapol.getOrig_mac_sta()[4], wpa_eapol.getOrig_mac_sta()[5], tmp_buf);
		} else {
				line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%02x%02x%02x%02x%02x%02x:%02x%02x%02x%02x%02x%02x:%s", wpa_eapol.getOrig_mac_ap()[0], wpa_eapol.getOrig_mac_ap()[1], wpa_eapol.getOrig_mac_ap()[2], wpa_eapol.getOrig_mac_ap()[3], wpa_eapol.getOrig_mac_ap()[4], wpa_eapol.getOrig_mac_ap()[5], wpa_eapol.getOrig_mac_sta()[0], wpa_eapol.getOrig_mac_sta()[1], wpa_eapol.getOrig_mac_sta()[2], wpa_eapol.getOrig_mac_sta()[3], wpa_eapol.getOrig_mac_sta()[4], wpa_eapol.getOrig_mac_sta()[5], wpa_eapol.getEssid());
		} 
		return line_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		u64[] digest = (u64)digest_buf;
		u64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + 16);
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + 32);
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + 48);
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + 64);
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + 80);
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + 96);
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + 112);
		int out_len = 128;
		return out_len;
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha256_t pbkdf2_sha256 = (pbkdf2_sha256_t)esalt_buf;
		// hashu32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		tmp[8] = 0;
		byte[] salt_enc = new byte[]{0};
		byte[] hash_enc = new byte[]{0};
		size_t salt_len_enc = ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_ab64, (u8)pbkdf2_sha256.getSalt_buf(), salt.getSalt_len(), (u8)salt_enc);
		size_t hash_len_enc = ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_ab64, (u8)tmp, ModernizedCProgram.HASH_LEN_RAW, (u8)hash_enc);
		// remove padding =for (size_t i = 0;
		 i < salt_len_enc; i++) {
			if (salt_enc[i] == (byte)'=') {
				salt_enc[i] = (byte)'\0';
			} 
		}
		for (size_t i = 0;
		 i < hash_len_enc; i++) {
			if (hash_enc[i] == (byte)'=') {
				hash_enc[i] = (byte)'\0';
			} 
		}
		// outputint line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$%s$%u$%s$%s", ModernizedCProgram.SIGNATURE_PASSLIB_PBKDF2_SHA256, salt.getSalt_iter() + 1, salt_enc, hash_enc);
		return line_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_buf = new byte[64];
		// salt
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf, salt.getSalt_buf(), 12)// digest;// digest
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 12, tmp, 20)// base64 encode (salt + SHA1);// base64 encode (salt + SHA1)
		byte[] ptr_plain = new byte[48];
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp_buf, 12 + 20, (u8)ptr_plain);
		ptr_plain[44] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s", ModernizedCProgram.SIGNATURE_FORTIGATE, ptr_plain);
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		androidfde_t androidfde = (androidfde_t)esalt_buf;
		byte[] tmp = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < 384; ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(tmp + j, "%08x", androidfde.getData()[i]);
		}
		tmp[3072] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s16$%08x%08x%08x%08x$16$%08x%08x%08x%08x$%s", ModernizedCProgram.SIGNATURE_ANDROIDFDE, ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]), digest[0], digest[1], digest[2], digest[3], tmp);
		return line_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		byte[] ptr_plain = new byte[32];
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp, 20, (u8)ptr_plain);
		ptr_plain[27] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*0*%s*%s", ModernizedCProgram.SIGNATURE_EPISERVER, tmp_salt, ptr_plain);
		return line_len;
		u32[] digest = (u32)digest_buf;
		int line_len = 0;
		int iter = salt.getSalt_iter();
		if (iter == ModernizedCProgram.ROUNDS_QNX) {
			line_buf[line_len++] = (byte)'@';
			line_buf[line_len++] = (byte)'s';
			line_buf[line_len++] = (byte)'@';
		} else {
				line_buf[line_len++] = (byte)'@';
				line_buf[line_len++] = (byte)'s';
				line_buf[line_len++] = (byte)',';
				line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%d", iter);
				line_buf[line_len++] = (byte)'@';
		} 
		ModernizedCProgram.u32_to_hex(digest[0], (u8)line_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(digest[1], (u8)line_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(digest[2], (u8)line_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(digest[3], (u8)line_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(digest[4], (u8)line_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(digest[5], (u8)line_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(digest[6], (u8)line_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(digest[7], (u8)line_buf + line_len);
		line_len += 8;
		line_buf[line_len++] = (byte)'@';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(line_buf + line_len, salt.getSalt_buf(), salt.getSalt_len());
		line_len += salt.getSalt_len();
		line_buf[line_len] = 0;
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + 56);
		int out_len = 64;
		return out_len;
		office2010_t office2010 = (office2010_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%d*%d*%d*%d*%08x%08x%08x%08x*%08x%08x%08x%08x*%08x%08x%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_OFFICE2010, 2010, 100000, 128, 16, salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3], office2010.getEncryptedVerifier()[0], office2010.getEncryptedVerifier()[1], office2010.getEncryptedVerifier()[2], office2010.getEncryptedVerifier()[3], office2010.getEncryptedVerifierHash()[0], office2010.getEncryptedVerifierHash()[1], office2010.getEncryptedVerifierHash()[2], office2010.getEncryptedVerifierHash()[3], office2010.getEncryptedVerifierHash()[4], office2010.getEncryptedVerifierHash()[5], office2010.getEncryptedVerifierHash()[6], office2010.getEncryptedVerifierHash()[7]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha256_t pbkdf2_sha256 = (pbkdf2_sha256_t)esalt_buf;
		// hash
		u32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(digest[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(digest[7]);
		tmp[8] = 0;
		byte[] tmp_buf = new byte[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp, 32, (u8)tmp_buf)// output;// output
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s$%u$%s$%s", ModernizedCProgram.SIGNATURE_DJANGOPBKDF2, salt.getSalt_iter() + 1, (byte)pbkdf2_sha256.getSalt_buf(), tmp_buf);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		ethereum_pbkdf2_t ethereum_pbkdf2 = (ethereum_pbkdf2_t)esalt_buf;
		byte[] tmp_salt = (byte)ModernizedCProgram.hcmalloc((salt.getSalt_len() * 2) + 1);
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%u*%s*%08x%08x%08x%08x%08x%08x%08x%08x*%08x%08x%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_ETHEREUM_PBKDF2, salt.getSalt_iter() + 1, tmp_salt, ModernizedCProgram.byte_swap_32(ethereum_pbkdf2.getCiphertext()[0]), ModernizedCProgram.byte_swap_32(ethereum_pbkdf2.getCiphertext()[1]), ModernizedCProgram.byte_swap_32(ethereum_pbkdf2.getCiphertext()[2]), ModernizedCProgram.byte_swap_32(ethereum_pbkdf2.getCiphertext()[3]), ModernizedCProgram.byte_swap_32(ethereum_pbkdf2.getCiphertext()[4]), ModernizedCProgram.byte_swap_32(ethereum_pbkdf2.getCiphertext()[5]), ModernizedCProgram.byte_swap_32(ethereum_pbkdf2.getCiphertext()[6]), ModernizedCProgram.byte_swap_32(ethereum_pbkdf2.getCiphertext()[7]), ModernizedCProgram.byte_swap_32(digest[0]), ModernizedCProgram.byte_swap_32(digest[1]), ModernizedCProgram.byte_swap_32(digest[2]), ModernizedCProgram.byte_swap_32(digest[3]), ModernizedCProgram.byte_swap_32(digest[4]), ModernizedCProgram.byte_swap_32(digest[5]), ModernizedCProgram.byte_swap_32(digest[6]), ModernizedCProgram.byte_swap_32(digest[7]));
		ModernizedCProgram.hcfree(tmp_salt);
		return line_len;
		krb5asrep_t krb5asrep = (krb5asrep_t)esalt_buf;
		byte[] data = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < krb5asrep.getEdata2_len(); ) {
			u8 ptr_edata2 = (u8)krb5asrep.getEdata2();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(data + j, "%02x", ptr_edata2[i]);
		}
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s%08x%08x%08x%08x$%s", ModernizedCProgram.SIGNATURE_KRB5ASREP, (byte)krb5asrep.getAccount_info(), ModernizedCProgram.byte_swap_32(krb5asrep.getChecksum()[0]), ModernizedCProgram.byte_swap_32(krb5asrep.getChecksum()[1]), ModernizedCProgram.byte_swap_32(krb5asrep.getChecksum()[2]), ModernizedCProgram.byte_swap_32(krb5asrep.getChecksum()[3]), data);
		return line_len;
		byte[] base64_salt = new byte[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)salt.getSalt_buf(), salt.getSalt_len(), (u8)base64_salt);
		byte[] base64_digest = new byte[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)digest_buf, 32, (u8)base64_digest);
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s:%u:%u:%u:%s:%s", ModernizedCProgram.SIGNATURE_SCRYPT, salt.getScrypt_N(), salt.getScrypt_r(), salt.getScrypt_p(), base64_salt, base64_digest);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		int line_len = 0;
		// signature
		line_buf[line_len++] = (byte)'$';
		line_buf[line_len++] = (byte)'S';
		line_buf[line_len++] = (byte)'H';
		line_buf[line_len++] = (byte)'A';
		line_buf[line_len++] = (byte)'$'// salt;// salt
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(line_buf + line_len, salt.getSalt_buf(), salt.getSalt_len());
		line_len += salt.getSalt_len();
		line_buf[line_len++] = (byte)'$'// digest;// digest
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + line_len);
		line_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + line_len);
		line_len += 8;
		line_buf[line_len] = 0;
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		tmp[8] = digest[8];
		tmp[9] = digest[9];
		tmp[10] = digest[10];
		tmp[11] = digest[11];
		tmp[12] = digest[12];
		tmp[13] = digest[13];
		tmp[14] = digest[14];
		tmp[15] = digest[15];
		u8[] out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + 56);
		ModernizedCProgram.u32_to_hex(tmp[8], out_buf + 64);
		ModernizedCProgram.u32_to_hex(tmp[9], out_buf + 72);
		ModernizedCProgram.u32_to_hex(tmp[10], out_buf + 80);
		ModernizedCProgram.u32_to_hex(tmp[11], out_buf + 88);
		ModernizedCProgram.u32_to_hex(tmp[12], out_buf + 96);
		ModernizedCProgram.u32_to_hex(tmp[13], out_buf + 104);
		ModernizedCProgram.u32_to_hex(tmp[14], out_buf + 112);
		ModernizedCProgram.u32_to_hex(tmp[15], out_buf + 120);
		int out_len = 128;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		diskcryptor_esalt_t diskcryptor_esalt = (diskcryptor_esalt_t)esalt_buf;
		// first only add the signature and version number:
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%i*", ModernizedCProgram.SIGNATURE_DISKCRYPTOR, ModernizedCProgram.DISKCRYPTOR_VERSION);
		// ... then add the full header (in hexadecimal):
		for (u32 i = 0;
		 i < 512; i++) {
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%08x", ModernizedCProgram.byte_swap_32(diskcryptor_esalt.getSalt_buf()[i]));
		}
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%08x%08x%08x%08x%08x", tmp_salt, tmp[0], tmp[1], tmp[2], tmp[3], tmp[4]);
		return line_len;
		oldoffice01_t oldoffice01 = (oldoffice01_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u*%08x%08x%08x%08x*%08x%08x%08x%08x*%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_OLDOFFICE, oldoffice01.getVersion(), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[0]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[1]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[2]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[3]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[0]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[1]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[2]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[3]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		oldoffice34_t oldoffice34 = (oldoffice34_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u*%08x%08x%08x%08x*%08x%08x%08x%08x*%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_OLDOFFICE, oldoffice34.getVersion(), salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3], ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[0]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[1]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[2]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[3]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[0]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[1]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[2]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[3]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[4]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		rakp_t rakp = (rakp_t)esalt_buf;
		u8[] ptr = (u8)rakp.getSalt_buf();
		int line_len = 0;
		for (u32 i = 0;
		 i < rakp.getSalt_len(); i++) {
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%02x", ptr[i ^ 3]);
		}
		line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, ":%08x%08x%08x%08x%08x", digest[0], digest[1], digest[2], digest[3], digest[4]);
		return line_len;
		krb5tgs_t krb5tgs = (krb5tgs_t)esalt_buf;
		byte[] data = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < krb5tgs.getEdata2_len(); ) {
			u8 ptr_edata2 = (u8)krb5tgs.getEdata2();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(data + j, "%02x", ptr_edata2[i]);
		}
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s%08x%08x%08x%08x$%s", ModernizedCProgram.SIGNATURE_KRB5TGS, (byte)krb5tgs.getAccount_info(), ModernizedCProgram.byte_swap_32(krb5tgs.getChecksum()[0]), ModernizedCProgram.byte_swap_32(krb5tgs.getChecksum()[1]), ModernizedCProgram.byte_swap_32(krb5tgs.getChecksum()[2]), ModernizedCProgram.byte_swap_32(krb5tgs.getChecksum()[3]), data);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		devise_hash_t devise_double_salt = (devise_hash_t)esalt_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)devise_double_salt.getSalt_buf(), (int)devise_double_salt.getSalt_len(), out_buf + out_len);
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)devise_double_salt.getSite_key_buf(), (int)devise_double_salt.getSite_key_len(), out_buf + out_len);
		return out_len;
		pdf_t pdf = (pdf_t)esalt_buf;
		int line_len = 0;
		if (pdf.getId_len() == 32) {
			line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$pdf$%d*%d*%d*%d*%d*%d*%08x%08x%08x%08x%08x%08x%08x%08x*%d*%08x%08x%08x%08x%08x%08x%08x%08x*%d*%08x%08x%08x%08x%08x%08x%08x%08x", pdf.getV(), pdf.getR(), 128, pdf.getP(), pdf.getEnc_md(), pdf.getId_len(), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[7]), pdf.getU_len(), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[7]), pdf.getO_len(), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[7]));
		} else {
				line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$pdf$%d*%d*%d*%d*%d*%d*%08x%08x%08x%08x*%d*%08x%08x%08x%08x%08x%08x%08x%08x*%d*%08x%08x%08x%08x%08x%08x%08x%08x", pdf.getV(), pdf.getR(), 128, pdf.getP(), pdf.getEnc_md(), pdf.getId_len(), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[3]), pdf.getU_len(), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[7]), pdf.getO_len(), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[7]));
		} 
		return line_len;
		u32[] digest = (u32)digest_buf;
		pstoken_t pstoken = (pstoken_t)esalt_buf;
		u32 salt_len = (pstoken.getSalt_len() > 512) ? 512 : pstoken.getSalt_len();
		byte[] pstoken_tmp = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < salt_len; ) {
			u8 ptr = (u8)pstoken.getSalt_buf();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(pstoken_tmp + j, "%02x", ptr[i]);
		}
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08x%08x%08x%08x%08x:%s", digest[0], digest[1], digest[2], digest[3], digest[4], pstoken_tmp);
		return line_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA512M_A;
			tmp[1] += sha2_64_constants.SHA512M_B;
			tmp[2] += sha2_64_constants.SHA512M_C;
			tmp[3] += sha2_64_constants.SHA512M_D;
			tmp[4] += sha2_64_constants.SHA512M_E;
			tmp[5] += sha2_64_constants.SHA512M_F;
			tmp[6] += sha2_64_constants.SHA512M_G;
			tmp[7] += sha2_64_constants.SHA512M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + out_len);
		out_len += 16;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = 0;
		tmp[3] = 0;
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = 0;
		tmp[3] = 0;
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		int out_len = 16;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		ethereum_scrypt_t ethereum_scrypt = (ethereum_scrypt_t)esalt_buf;
		Object[] generatedCiphertext = ethereum_scrypt.getCiphertext();
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%u*%u*%u*%s*%08x%08x%08x%08x%08x%08x%08x%08x*%08x%08x%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_ETHEREUM_SCRYPT, salt.getScrypt_N(), salt.getScrypt_r(), salt.getScrypt_p(), (byte)tmp_salt, ModernizedCProgram.byte_swap_32(generatedCiphertext[0]), ModernizedCProgram.byte_swap_32(generatedCiphertext[1]), ModernizedCProgram.byte_swap_32(generatedCiphertext[2]), ModernizedCProgram.byte_swap_32(generatedCiphertext[3]), ModernizedCProgram.byte_swap_32(generatedCiphertext[4]), ModernizedCProgram.byte_swap_32(generatedCiphertext[5]), ModernizedCProgram.byte_swap_32(generatedCiphertext[6]), ModernizedCProgram.byte_swap_32(generatedCiphertext[7]), ModernizedCProgram.byte_swap_32(digest[0]), ModernizedCProgram.byte_swap_32(digest[1]), ModernizedCProgram.byte_swap_32(digest[2]), ModernizedCProgram.byte_swap_32(digest[3]), ModernizedCProgram.byte_swap_32(digest[4]), ModernizedCProgram.byte_swap_32(digest[5]), ModernizedCProgram.byte_swap_32(digest[6]), ModernizedCProgram.byte_swap_32(digest[7]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA512M_A;
			tmp[1] += sha2_64_constants.SHA512M_B;
			tmp[2] += sha2_64_constants.SHA512M_C;
			tmp[3] += sha2_64_constants.SHA512M_D;
			tmp[4] += sha2_64_constants.SHA512M_E;
			tmp[5] += sha2_64_constants.SHA512M_F;
			tmp[6] += sha2_64_constants.SHA512M_G;
			tmp[7] += sha2_64_constants.SHA512M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + 16);
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + 32);
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + 48);
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + 64);
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + 80);
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + 96);
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + 112);
		int out_len = 128;
		return out_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s$%08X%08X%08X%08X%08X", tmp_salt, digest[0], digest[1], digest[2], digest[3], digest[4]);
		return line_len;
		u64[] digest = (u64)digest_buf;
		u64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA512M_A;
			tmp[1] += sha2_64_constants.SHA512M_B;
			tmp[2] += sha2_64_constants.SHA512M_C;
			tmp[3] += sha2_64_constants.SHA512M_D;
			tmp[4] += sha2_64_constants.SHA512M_E;
			tmp[5] += sha2_64_constants.SHA512M_F;
			tmp[6] += sha2_64_constants.SHA512M_G;
			tmp[7] += sha2_64_constants.SHA512M_H;
		} 
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x", tmp_salt, ModernizedCProgram.v32b_from_v64(tmp[0]), ModernizedCProgram.v32a_from_v64(tmp[0]), ModernizedCProgram.v32b_from_v64(tmp[1]), ModernizedCProgram.v32a_from_v64(tmp[1]), ModernizedCProgram.v32b_from_v64(tmp[2]), ModernizedCProgram.v32a_from_v64(tmp[2]), ModernizedCProgram.v32b_from_v64(tmp[3]), ModernizedCProgram.v32a_from_v64(tmp[3]), ModernizedCProgram.v32b_from_v64(tmp[4]), ModernizedCProgram.v32a_from_v64(tmp[4]), ModernizedCProgram.v32b_from_v64(tmp[5]), ModernizedCProgram.v32a_from_v64(tmp[5]), ModernizedCProgram.v32b_from_v64(tmp[6]), ModernizedCProgram.v32a_from_v64(tmp[6]), ModernizedCProgram.v32b_from_v64(tmp[7]), ModernizedCProgram.v32a_from_v64(tmp[7]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08x:%08x", ModernizedCProgram.byte_swap_32(digest[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]));
		return line_len;
		itunes_backup_t itunes_backup = (itunes_backup_t)esalt_buf;
		// WPKY
		u32[] wkpy_u32 = new u32();
		wkpy_u32[0] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[0]);
		wkpy_u32[1] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[1]);
		wkpy_u32[2] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[2]);
		wkpy_u32[3] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[3]);
		wkpy_u32[4] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[4]);
		wkpy_u32[5] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[5]);
		wkpy_u32[6] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[6]);
		wkpy_u32[7] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[7]);
		wkpy_u32[8] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[8]);
		wkpy_u32[9] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[9]);
		u8[] wpky = new u8();
		ModernizedCProgram.u32_to_hex(wkpy_u32[0], wpky + 0);
		ModernizedCProgram.u32_to_hex(wkpy_u32[1], wpky + 8);
		ModernizedCProgram.u32_to_hex(wkpy_u32[2], wpky + 16);
		ModernizedCProgram.u32_to_hex(wkpy_u32[3], wpky + 24);
		ModernizedCProgram.u32_to_hex(wkpy_u32[4], wpky + 32);
		ModernizedCProgram.u32_to_hex(wkpy_u32[5], wpky + 40);
		ModernizedCProgram.u32_to_hex(wkpy_u32[6], wpky + 48);
		ModernizedCProgram.u32_to_hex(wkpy_u32[7], wpky + 56);
		ModernizedCProgram.u32_to_hex(wkpy_u32[8], wpky + 64);
		ModernizedCProgram.u32_to_hex(wkpy_u32[9], wpky + 72);
		wpky[80] = 0;
		u32[] salt_in = new u32();
		salt_in[0] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]);
		salt_in[1] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]);
		salt_in[2] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]);
		salt_in[3] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]);
		salt_in[4] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[4]);
		salt_in[5] = 0;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt_in, (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0// DPSL;// DPSL
		u32[] dpsl_u32 = new u32();
		dpsl_u32[0] = ModernizedCProgram.byte_swap_32(itunes_backup.getDpsl()[0]);
		dpsl_u32[1] = ModernizedCProgram.byte_swap_32(itunes_backup.getDpsl()[1]);
		dpsl_u32[2] = ModernizedCProgram.byte_swap_32(itunes_backup.getDpsl()[2]);
		dpsl_u32[3] = ModernizedCProgram.byte_swap_32(itunes_backup.getDpsl()[3]);
		dpsl_u32[4] = ModernizedCProgram.byte_swap_32(itunes_backup.getDpsl()[4]);
		u8[] dpsl = new u8();
		ModernizedCProgram.u32_to_hex(dpsl_u32[0], dpsl + 0);
		ModernizedCProgram.u32_to_hex(dpsl_u32[1], dpsl + 8);
		ModernizedCProgram.u32_to_hex(dpsl_u32[2], dpsl + 16);
		ModernizedCProgram.u32_to_hex(dpsl_u32[3], dpsl + 24);
		ModernizedCProgram.u32_to_hex(dpsl_u32[4], dpsl + 32);
		dpsl[40] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%u*%s*%u*%s*%u*%s", ModernizedCProgram.SIGNATURE_ITUNES_BACKUP, salt.getSalt_sign()[0], wpky, salt.getSalt_iter2() + 1, tmp_salt, salt.getSalt_iter() + 1, dpsl);
		return line_len;
		u32[] digest = (u32)digest_buf;
		ethereum_presale_t ethereum_presale = (ethereum_presale_t)esalt_buf;
		// get the initialization vector:
		u8[] encseed = new u8[]{0};
		u32[] iv = new u32();
		iv[0] = ModernizedCProgram.byte_swap_32(ethereum_presale.getIv()[0]);
		iv[1] = ModernizedCProgram.byte_swap_32(ethereum_presale.getIv()[1]);
		iv[2] = ModernizedCProgram.byte_swap_32(ethereum_presale.getIv()[2]);
		iv[3] = ModernizedCProgram.byte_swap_32(ethereum_presale.getIv()[3]);
		ModernizedCProgram.u32_to_hex(iv[0], encseed + 0);
		ModernizedCProgram.u32_to_hex(iv[1], encseed + 8);
		ModernizedCProgram.u32_to_hex(iv[2], encseed + 16);
		ModernizedCProgram.u32_to_hex(iv[3], encseed + 24)// get the raw enc_seed (without iv):;// get the raw enc_seed (without iv):
		u32[] enc_seed_ptr = (u32)ethereum_presale.getEnc_seed();
		for (u32 i = 0;
		u32 j = 32;
		 i < ethereum_presale.getEnc_seed_len() / 4; ) {
			u32 tmp = enc_seed_ptr[i];
			tmp = ModernizedCProgram.byte_swap_32(tmp);
			ModernizedCProgram.u32_to_hex(tmp, encseed + j);
		}
		// 16 bytes IV + encrypted seed (in hex)u32 max_hex_len = (16 + ethereum_presale.getEnc_seed_len()) * 2;
		u32 max_pos = (((/*Error: sizeof expression not supported yet*/ - 1) < (max_hex_len)) ? (/*Error: sizeof expression not supported yet*/ - 1) : (max_hex_len));
		encseed[max_pos] = 0// salt:;// salt:
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0// output:;// output:
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%s*%s*%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_ETHEREUM_PRESALE, encseed, tmp_salt, ModernizedCProgram.byte_swap_32(digest[0]), ModernizedCProgram.byte_swap_32(digest[1]), ModernizedCProgram.byte_swap_32(digest[2]), ModernizedCProgram.byte_swap_32(digest[3]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		{ 
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 1;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 1;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 8;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 8;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 2;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 2;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 16;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 16;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 4;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 4;
				tmp[1] = tmp[1] ^ t;
			}
			;
		}
		;
		byte[] ptr_plain = new byte[32];
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_itoa64, (u8)tmp, 8, (u8)ptr_plain);
		ptr_plain[11] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", ptr_plain + 1);
		return line_len;
		u32[] digest = (u32)digest_buf;
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(digest[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(digest[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(digest[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(digest[3], out_buf + 24);
		int out_len = 32;
		return out_len;
		agilekey_t agilekey = (agilekey_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%u:%08x%08x:", salt.getSalt_iter() + 1, ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]));
		for (u32 i = 0;
		 i < 1040; i++) {
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%02x", agilekey.getCipher()[i]);
		}
		return line_len;
		byte[] buf = new byte[]{0};
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + 0, salt.getSalt_buf(), 5);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + 5, digest_buf, 9);
		buf[3] -= -4;
		byte[] tmp_buf = new byte[20];
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_lotus64, (u8)buf, 14, (u8)tmp_buf);
		tmp_buf[18] = salt.getSalt_buf_pc()[7];
		tmp_buf[19] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "(G%s)", tmp_buf);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8 out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + 56);
		int out_len = 64;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		u32[] tmp_salt = new u32();
		tmp_salt[0] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]);
		tmp_salt[1] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]);
		tmp_salt[2] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "1%s%08x%08x%08x%08x%08x", (byte)tmp_salt, tmp[0], tmp[1], tmp[2], tmp[3], tmp[4]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		u8[] out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + 56);
		int out_len = 64;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		int out_len = 56;
		return out_len;
		u32[] digest = (u32)digest_buf;
		win8phone_t esalt = (win8phone_t)esalt_buf;
		byte[] buf = new byte[]{0};
		for (int i = 0;
		int j = 0;
		 i < 32; ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(buf + j, "%08x", esalt.getSalt_buf()[i]);
		}
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08x%08x%08x%08x%08x%08x%08x%08x:%s", digest[0], digest[1], digest[2], digest[3], digest[4], digest[5], digest[6], digest[7], buf);
		return line_len;
		pkzip_t pkzip = (pkzip_t)esalt_buf;
		int out_len = 0;
		if (pkzip.getVersion() == 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(line_buf, "%s", ModernizedCProgram.SIGNATURE_PKZIP_V1);
			out_len += 7;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(line_buf, "%s", ModernizedCProgram.SIGNATURE_PKZIP_V2);
				out_len += 8;
		} 
		out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%i*", pkzip.getHash_count(), pkzip.getChecksum_size());
		out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%i*", pkzip.getHash().getData_type_enum(), pkzip.getHash().getMagic_type_enum());
		if (pkzip.getHash().getData_type_enum() > 1) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%x*%x*%x*%x*%x*", pkzip.getHash().getCompressed_length(), pkzip.getHash().getUncompressed_length(), pkzip.getHash().getCrc32(), pkzip.getHash().getOffset(), pkzip.getHash().getAdditional_offset());
		} 
		out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%x*%04x*", pkzip.getHash().getCompression_type(), pkzip.getHash().getData_length(), pkzip.getHash().getChecksum_from_crc());
		if (pkzip.getVersion() == 2) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%04x*", pkzip.getHash().getChecksum_from_timestamp());
		} 
		for (u32 i = 0;
		 i < pkzip.getHash().getData_length() / 4; i++) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%08x", ModernizedCProgram.byte_swap_32(pkzip.getHash().getData()[i]));
		}
		for (u32 i = 0;
		 i < pkzip.getHash().getData_length() % 4; i++) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%02x", (pkzip.getHash().getData()[pkzip.getHash().getData_length() / 4] >> i * 8) & -1024);
		}
		if (pkzip.getVersion() == 1) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*$/pkzip$");
		} else {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*$/pkzip2$");
		} 
		return out_len;
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + out_len);
		out_len += 16;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA512M_A;
			tmp[1] += sha2_64_constants.SHA512M_B;
			tmp[2] += sha2_64_constants.SHA512M_C;
			tmp[3] += sha2_64_constants.SHA512M_D;
			tmp[4] += sha2_64_constants.SHA512M_E;
			tmp[5] += sha2_64_constants.SHA512M_F;
			tmp[6] += sha2_64_constants.SHA512M_G;
			tmp[7] += sha2_64_constants.SHA512M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + out_len);
		out_len += 16;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		netntlm_t netntlm = (netntlm_t)esalt_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[0] = ModernizedCProgram.rotl32(tmp[0], 29);
		tmp[1] = ModernizedCProgram.rotl32(tmp[1], 29);
		tmp[2] = ModernizedCProgram.rotl32(tmp[2], 29);
		tmp[3] = ModernizedCProgram.rotl32(tmp[3], 29);
		{ 
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 1;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 1;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 8;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 8;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 2;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 2;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 16;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 16;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 4;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 4;
				tmp[1] = tmp[1] ^ t;
			}
			;
		}
		;
		{ 
			{ 
				u32x t = new u32x();
				t = tmp[3] >> 1;
				t = t ^ tmp[2];
				t = t & -1024;
				tmp[2] = tmp[2] ^ t;
				t = t << 1;
				tmp[3] = tmp[3] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[2] >> 8;
				t = t ^ tmp[3];
				t = t & -1024;
				tmp[3] = tmp[3] ^ t;
				t = t << 8;
				tmp[2] = tmp[2] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[3] >> 2;
				t = t ^ tmp[2];
				t = t & -1024;
				tmp[2] = tmp[2] ^ t;
				t = t << 2;
				tmp[3] = tmp[3] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[2] >> 16;
				t = t ^ tmp[3];
				t = t & -1024;
				tmp[3] = tmp[3] ^ t;
				t = t << 16;
				tmp[2] = tmp[2] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[3] >> 4;
				t = t ^ tmp[2];
				t = t & -1024;
				tmp[2] = tmp[2] ^ t;
				t = t << 4;
				tmp[3] = tmp[3] ^ t;
			}
			;
		}
		;
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		u8[] ptr = new u8();
		ptr = (u8)netntlm.getUserdomain_buf();
		for (int i = 0;
		 i < netntlm.getUser_len(); i += 2) {
			out_buf[out_len++] = ptr[i];
		}
		out_buf[out_len++] = (byte)':';
		out_buf[out_len++] = (byte)':';
		ptr += netntlm.getUser_len();
		for (int i = 0;
		 i < netntlm.getDomain_len(); i += 2) {
			out_buf[out_len++] = ptr[i];
		}
		out_buf[out_len++] = (byte)':';
		ptr = (u8)netntlm.getChall_buf();
		for (int i = 0;
		 i < netntlm.getSrvchall_len(); i++) {
			ModernizedCProgram.u8_to_hex(ptr[i], out_buf + out_len);
			out_len += 2;
		}
		out_buf[out_len++] = (byte)':';
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(salt.getSalt_buf_pc()[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(salt.getSalt_buf_pc()[1], out_buf + out_len);
		out_len += 8;
		out_buf[out_len++] = (byte)':';
		ptr += netntlm.getSrvchall_len();
		for (int i = 0;
		 i < netntlm.getClichall_len(); i++) {
			ModernizedCProgram.u8_to_hex(ptr[i], out_buf + out_len);
			out_len += 2;
		}
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		apple_secure_notes_t apple_secure_notes = (apple_secure_notes_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u$16$%08x%08x%08x%08x$%u$%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_FILEVAULT2, apple_secure_notes.getZ_PK(), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOSALT()[0]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOSALT()[1]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOSALT()[2]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOSALT()[3]), apple_secure_notes.getZCRYPTOITERATIONCOUNT(), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[0]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[1]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[2]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[3]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[4]), ModernizedCProgram.byte_swap_32(apple_secure_notes.getZCRYPTOWRAPPEDKEY()[5]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		byte[] ptr_plain = new byte[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp, 20, (u8)ptr_plain);
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", ptr_plain);
		return line_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		u32[] digest = (u32)digest_buf;
		cram_md5_t cram_md5 = (cram_md5_t)esalt_buf;
		// challenge
		byte[] chal_buf = new byte[256 * 2];
		int chal_len = ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)salt.getSalt_buf(), salt.getSalt_len(), (u8)chal_buf);
		chal_buf[chal_len] = 0// response;// response
		byte[] tmp_buf = new byte[256 * 2];
		int tmp_len = /*Error: Function owner not recognized*/snprintf(tmp_buf, /*Error: sizeof expression not supported yet*/, "%s %08x%08x%08x%08x", (byte)cram_md5.getUser(), ModernizedCProgram.byte_swap_32(digest[0]), ModernizedCProgram.byte_swap_32(digest[1]), ModernizedCProgram.byte_swap_32(digest[2]), ModernizedCProgram.byte_swap_32(digest[3]));
		tmp_buf[tmp_len] = 0;
		byte[] resp_buf = new byte[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp_buf, tmp_len, (u8)resp_buf);
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%s", ModernizedCProgram.SIGNATURE_CRAM_MD5, chal_buf, resp_buf);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + 56);
		int out_len = 64;
		return out_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		u32[] digest = (u32)digest_buf;
		// this (useless?) initialization makes scan-build happyu32[] tmp = new u32[]{0};
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		byte[] ptr_plain = new byte[]{0};
		ModernizedCProgram.sha1aix_encode((byte)tmp, (byte)ptr_plain);
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%02u$%s$%s", ModernizedCProgram.SIGNATURE_SHA1AIX, salt.getSalt_sign()[0], tmp_salt, ptr_plain);
		return line_len;
		oldoffice34_t oldoffice34 = (oldoffice34_t)esalt_buf;
		u8[] rc4key = (u8)oldoffice34.getRc4key();
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u*%08x%08x%08x%08x*%08x%08x%08x%08x*%08x%08x%08x%08x%08x:%02x%02x%02x%02x%02x", ModernizedCProgram.SIGNATURE_OLDOFFICE, oldoffice34.getVersion(), salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3], ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[0]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[1]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[2]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[3]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[0]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[1]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[2]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[3]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[4]), rc4key[0], rc4key[1], rc4key[2], rc4key[3], rc4key[4]);
		return line_len;
		u64[] digest = (u64)digest_buf;
		u64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + 16);
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + 32);
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + 48);
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + 64);
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + 80);
		int out_len = 96;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		pkzip_t pkzip = (pkzip_t)esalt_buf;
		int out_len = 0;
		if (pkzip.getVersion() == 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(line_buf, "%s", ModernizedCProgram.SIGNATURE_PKZIP_V1);
			out_len += 7;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(line_buf, "%s", ModernizedCProgram.SIGNATURE_PKZIP_V2);
				out_len += 8;
		} 
		out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%i*", pkzip.getHash_count(), pkzip.getChecksum_size());
		for (int cnt = 0;
		 cnt < pkzip.getHash_count(); cnt++) {
			if (cnt > 0) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*");
			} 
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%i*", pkzip.getHashes()[cnt].getData_type_enum(), pkzip.getHashes()[cnt].getMagic_type_enum());
			if (pkzip.getHashes()[cnt].getData_type_enum() > 1) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%x*%x*%x*%x*%x*", pkzip.getHashes()[cnt].getCompressed_length(), pkzip.getHashes()[cnt].getUncompressed_length(), pkzip.getHashes()[cnt].getCrc32(), pkzip.getHashes()[cnt].getOffset(), pkzip.getHashes()[cnt].getAdditional_offset());
			} 
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%x*%04x*", pkzip.getHashes()[cnt].getCompression_type(), pkzip.getHashes()[cnt].getData_length(), pkzip.getHashes()[cnt].getChecksum_from_crc());
			if (pkzip.getVersion() == 2) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%04x*", pkzip.getHashes()[cnt].getChecksum_from_timestamp());
			} 
			for (u32 i = 0;
			 i < pkzip.getHashes()[cnt].getData_length() / 4; i++) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%08x", ModernizedCProgram.byte_swap_32(pkzip.getHashes()[cnt].getData()[i]));
			}
			for (u32 i = 0;
			 i < pkzip.getHashes()[cnt].getData_length() % 4; i++) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%02x", (pkzip.getHashes()[cnt].getData()[pkzip.getHashes()[cnt].getData_length() / 4] >> i * 8) & -1024);
			}
		}
		if (pkzip.getVersion() == 1) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*$/pkzip$");
		} else {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*$/pkzip2$");
		} 
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*0*%08x%08x*%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_RAR3, ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]), salt.getSalt_buf()[2], salt.getSalt_buf()[3], salt.getSalt_buf()[4], salt.getSalt_buf()[5]);
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*1*%u*%08x%08x%08x%08x*%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_AXCRYPT, salt.getSalt_iter(), salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3], salt.getSalt_buf()[4], salt.getSalt_buf()[5], salt.getSalt_buf()[6], salt.getSalt_buf()[7], salt.getSalt_buf()[8], salt.getSalt_buf()[9]);
		return line_len;
		diskcryptor_esalt_t diskcryptor_esalt = (diskcryptor_esalt_t)esalt_buf;
		// first only add the signature and version number:
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%i*", ModernizedCProgram.SIGNATURE_DISKCRYPTOR, ModernizedCProgram.DISKCRYPTOR_VERSION);
		// ... then add the full header (in hexadecimal):
		for (u32 i = 0;
		 i < 512; i++) {
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%08x", ModernizedCProgram.byte_swap_32(diskcryptor_esalt.getSalt_buf()[i]));
		}
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		int out_len = 40;
		return out_len;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		return line_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu8 out_buf = (u8)line_buf;
		int out_len = /*Error: Function owner not recognized*/strlen(ModernizedCProgram.SIGNATURE_BLAKE2B);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out_buf, ModernizedCProgram.SIGNATURE_BLAKE2B, out_len);
		ModernizedCProgram.u64_to_hex(digest[0], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(digest[1], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(digest[2], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(digest[3], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(digest[4], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(digest[5], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(digest[6], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(digest[7], out_buf + out_len);
		out_len += 16;
		return out_len;
		u64[] digest = (u64)digest_buf;
		u64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + 16);
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + 32);
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + 48);
		int out_len = 64;
		return out_len;
		krb5tgs_18_t krb5tgs = (krb5tgs_18_t)esalt_buf;
		byte[] data = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < krb5tgs.getEdata2_len(); ) {
			u8 ptr_edata2 = (u8)krb5tgs.getEdata2();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(data + j, "%02x", ptr_edata2[i]);
		}
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%s$%08x%08x%08x$%s", ModernizedCProgram.SIGNATURE_KRB5TGS, (byte)krb5tgs.getUser(), (byte)krb5tgs.getDomain(), krb5tgs.getChecksum()[0], krb5tgs.getChecksum()[1], krb5tgs.getChecksum()[2], data);
		return line_len;
		pkzip_t pkzip = (pkzip_t)esalt_buf;
		int out_len = 0;
		if (pkzip.getVersion() == 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(line_buf, "%s", ModernizedCProgram.SIGNATURE_PKZIP_V1);
			out_len += 7;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(line_buf, "%s", ModernizedCProgram.SIGNATURE_PKZIP_V2);
				out_len += 8;
		} 
		out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%i*", pkzip.getHash_count(), pkzip.getChecksum_size());
		for (int cnt = 0;
		 cnt < pkzip.getHash_count(); cnt++) {
			if (cnt > 0) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*");
			} 
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%i*", pkzip.getHashes()[cnt].getData_type_enum(), pkzip.getHashes()[cnt].getMagic_type_enum());
			if (pkzip.getHashes()[cnt].getData_type_enum() > 1) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%x*%x*%x*%x*%x*", pkzip.getHashes()[cnt].getCompressed_length(), pkzip.getHashes()[cnt].getUncompressed_length(), pkzip.getHashes()[cnt].getCrc32(), pkzip.getHashes()[cnt].getOffset(), pkzip.getHashes()[cnt].getAdditional_offset());
			} 
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%x*%04x*", pkzip.getHashes()[cnt].getCompression_type(), pkzip.getHashes()[cnt].getData_length(), pkzip.getHashes()[cnt].getChecksum_from_crc());
			if (pkzip.getVersion() == 2) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%04x*", pkzip.getHashes()[cnt].getChecksum_from_timestamp());
			} 
			for (u32 i = 0;
			 i < pkzip.getHashes()[cnt].getData_length() / 4; i++) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%08x", ModernizedCProgram.byte_swap_32(pkzip.getHashes()[cnt].getData()[i]));
			}
			for (u32 i = 0;
			 i < pkzip.getHashes()[cnt].getData_length() % 4; i++) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%02x", (pkzip.getHashes()[cnt].getData()[pkzip.getHashes()[cnt].getData_length() / 4] >> i * 8) & -1024);
			}
		}
		if (pkzip.getVersion() == 1) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*$/pkzip$");
		} else {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*$/pkzip2$");
		} 
		return out_len;
		u32[] digest = (u32)digest_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08x%08x:%d:%d:%08x%08x%08x%08x", ModernizedCProgram.byte_swap_32(digest[0]), ModernizedCProgram.byte_swap_32(digest[1]), 2, 4, ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = 0;
		tmp[3] = 0;
		{ 
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 1;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 1;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 8;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 8;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 2;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 2;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 16;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 16;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 4;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 4;
				tmp[1] = tmp[1] ^ t;
			}
			;
		}
		;
		u8[] ptr_plain = new u8[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_itoa64, (u8)tmp, 8, ptr_plain);
		line_buf[0] = salt.getSalt_sign()[0] & -1024;
		line_buf[1] = salt.getSalt_sign()[1] & -1024//original method, but changed because of this ticket: https://hashcat.net/trac/ticket/269//line_buf[0] = int_to_itoa64 ((salt->salt_buf[0] >> 0) & 0x3f);;//original method, but changed because of this ticket: https://hashcat.net/trac/ticket/269//line_buf[0] = int_to_itoa64 ((salt->salt_buf[0] >> 0) & 0x3f);
		/*Error: Function owner not recognized*///line_buf[1] = int_to_itoa64 ((salt->salt_buf[0] >> 6) & 0x3f);/*Error: Function owner not recognized*///line_buf[1] = int_to_itoa64 ((salt->salt_buf[0] >> 6) & 0x3f);snprintf(line_buf + 2, line_size - 2, "%s", ptr_plain);
		int out_len = 2 + 11;
		return out_len;
		diskcryptor_esalt_t diskcryptor_esalt = (diskcryptor_esalt_t)esalt_buf;
		// first only add the signature and version number:
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%i*", ModernizedCProgram.SIGNATURE_DISKCRYPTOR, ModernizedCProgram.DISKCRYPTOR_VERSION);
		// ... then add the full header (in hexadecimal):
		for (u32 i = 0;
		 i < 512; i++) {
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%08x", ModernizedCProgram.byte_swap_32(diskcryptor_esalt.getSalt_buf()[i]));
		}
		return line_len;
		u32[] digest = (u32)digest_buf;
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(digest[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(digest[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(digest[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(digest[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(digest[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(digest[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(digest[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(digest[7], out_buf + 56);
		int out_len = 64;
		return out_len;
		u8[] tmp = new u8[]{0};
		ModernizedCProgram.phpass_encode(digest_buf, tmp);
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s%s", (byte)salt.getSalt_sign(), (byte)salt.getSalt_buf(), tmp);
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len() - /*Error: Function owner not recognized*/strlen(ModernizedCProgram.skyper), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int out_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08x%08x%08x%08x:%s", ModernizedCProgram.byte_swap_32(tmp[0]), ModernizedCProgram.byte_swap_32(tmp[1]), ModernizedCProgram.byte_swap_32(tmp[2]), ModernizedCProgram.byte_swap_32(tmp[3]), tmp_salt);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "0x0100%s%08x%08x%08x%08x%08x", tmp_salt, tmp[0], tmp[1], tmp[2], tmp[3], tmp[4]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		byte[] tmp_buf = new byte[512];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf, tmp, 32);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 32, salt.getSalt_buf(), salt.getSalt_len());
		byte[] ptr_plain = new byte[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp_buf, 32 + salt.getSalt_len(), (u8)ptr_plain);
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s", ModernizedCProgram.SIGNATURE_SHA256B64S, ptr_plain);
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8 chap_id_byte = (u8)salt.getSalt_buf()[4];
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08x%08x%08x%08x:%08x%08x%08x%08x:%02x", ModernizedCProgram.byte_swap_32(tmp[0]), ModernizedCProgram.byte_swap_32(tmp[1]), ModernizedCProgram.byte_swap_32(tmp[2]), ModernizedCProgram.byte_swap_32(tmp[3]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]), chap_id_byte);
		return line_len;
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha1_t pbkdf2_sha1 = (pbkdf2_sha1_t)esalt_buf;
		// hashu32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		tmp[5] = 0;
		byte[] salt_enc = new byte[]{0};
		byte[] hash_enc = new byte[]{0};
		size_t salt_len_enc = ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_ab64, (u8)pbkdf2_sha1.getSalt_buf(), salt.getSalt_len(), (u8)salt_enc);
		size_t hash_len_enc = ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_ab64, (u8)tmp, ModernizedCProgram.HASH_LEN_RAW, (u8)hash_enc);
		// remove padding =for (size_t i = 0;
		 i < salt_len_enc; i++) {
			if (salt_enc[i] == (byte)'=') {
				salt_enc[i] = (byte)'\0';
			} 
		}
		for (size_t i = 0;
		 i < hash_len_enc; i++) {
			if (hash_enc[i] == (byte)'=') {
				hash_enc[i] = (byte)'\0';
			} 
		}
		// outputint line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$%s$%u$%s$%s", ModernizedCProgram.SIGNATURE_PASSLIB_PBKDF2_SHA1, salt.getSalt_iter() + 1, salt_enc, hash_enc);
		return line_len;
		u64[] digest = (u64)digest_buf;
		u64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA512M_A;
			tmp[1] += sha2_64_constants.SHA512M_B;
			tmp[2] += sha2_64_constants.SHA512M_C;
			tmp[3] += sha2_64_constants.SHA512M_D;
			tmp[4] += sha2_64_constants.SHA512M_E;
			tmp[5] += sha2_64_constants.SHA512M_F;
			tmp[6] += sha2_64_constants.SHA512M_G;
			tmp[7] += sha2_64_constants.SHA512M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		byte[] tmp_buf = new byte[512];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf, tmp, 64);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 64, salt.getSalt_buf(), salt.getSalt_len());
		byte[] ptr_plain = new byte[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp_buf, 64 + salt.getSalt_len(), (u8)ptr_plain);
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s", ModernizedCProgram.SIGNATURE_SHA512B64S, ptr_plain);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		u8[] out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + 56);
		int out_len = 64;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		jwt_t jwt = (jwt_t)esalt_buf;
		u32[] digest32 = (u32)digest_buf;
		u64[] digest64 = (u64)digest_buf;
		byte[] tmp_buf = new byte[]{0};
		byte[] ptr_plain = new byte[128];
		if (hashconfig.getKern_type() == kern_type_jwt.KERN_TYPE_JWT_HS256) {
			u32[] tmp = new u32();
			tmp[0] = ModernizedCProgram.byte_swap_32(digest32[0]);
			tmp[1] = ModernizedCProgram.byte_swap_32(digest32[1]);
			tmp[2] = ModernizedCProgram.byte_swap_32(digest32[2]);
			tmp[3] = ModernizedCProgram.byte_swap_32(digest32[3]);
			tmp[4] = ModernizedCProgram.byte_swap_32(digest32[4]);
			tmp[5] = ModernizedCProgram.byte_swap_32(digest32[5]);
			tmp[6] = ModernizedCProgram.byte_swap_32(digest32[6]);
			tmp[7] = ModernizedCProgram.byte_swap_32(digest32[7]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf, tmp, 32);
			ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64url, (u8)tmp_buf, 32, (u8)ptr_plain);
			ptr_plain[43] = 0;
		}  else if (hashconfig.getKern_type() == kern_type_jwt.KERN_TYPE_JWT_HS384) {
			u64[] tmp = new u64();
			tmp[0] = ModernizedCProgram.byte_swap_64(digest64[0]);
			tmp[1] = ModernizedCProgram.byte_swap_64(digest64[1]);
			tmp[2] = ModernizedCProgram.byte_swap_64(digest64[2]);
			tmp[3] = ModernizedCProgram.byte_swap_64(digest64[3]);
			tmp[4] = ModernizedCProgram.byte_swap_64(digest64[4]);
			tmp[5] = ModernizedCProgram.byte_swap_64(digest64[5]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf, tmp, 48);
			ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64url, (u8)tmp_buf, 48, (u8)ptr_plain);
			ptr_plain[64] = 0;
		}  else if (hashconfig.getKern_type() == kern_type_jwt.KERN_TYPE_JWT_HS512) {
			u64[] tmp = new u64();
			tmp[0] = ModernizedCProgram.byte_swap_64(digest64[0]);
			tmp[1] = ModernizedCProgram.byte_swap_64(digest64[1]);
			tmp[2] = ModernizedCProgram.byte_swap_64(digest64[2]);
			tmp[3] = ModernizedCProgram.byte_swap_64(digest64[3]);
			tmp[4] = ModernizedCProgram.byte_swap_64(digest64[4]);
			tmp[5] = ModernizedCProgram.byte_swap_64(digest64[5]);
			tmp[6] = ModernizedCProgram.byte_swap_64(digest64[6]);
			tmp[7] = ModernizedCProgram.byte_swap_64(digest64[7]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf, tmp, 64);
			ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64url, (u8)tmp_buf, 64, (u8)ptr_plain);
			ptr_plain[86] = 0;
		} 
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s.%s", (byte)jwt.getSalt_buf(), (byte)ptr_plain);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		oldoffice34_t oldoffice34 = (oldoffice34_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u*%08x%08x%08x%08x*%08x%08x%08x%08x*%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_OLDOFFICE, oldoffice34.getVersion(), salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3], ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[0]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[1]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[2]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifier()[3]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[0]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[1]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[2]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[3]), ModernizedCProgram.byte_swap_32(oldoffice34.getEncryptedVerifierHash()[4]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8 out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		return out_len;
		u32[] digest = (u32)digest_buf;
		netntlm_t netntlm = (netntlm_t)esalt_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		u8[] ptr = new u8();
		ptr = (u8)netntlm.getUserdomain_buf();
		for (int i = 0;
		 i < netntlm.getUser_len(); i += 2) {
			out_buf[out_len++] = ptr[i];
		}
		out_buf[out_len++] = (byte)':';
		out_buf[out_len++] = (byte)':';
		ptr += netntlm.getUser_len();
		for (int i = 0;
		 i < netntlm.getDomain_len(); i += 2) {
			out_buf[out_len++] = ptr[i];
		}
		out_buf[out_len++] = (byte)':';
		ptr = (u8)netntlm.getChall_buf();
		for (int i = 0;
		 i < netntlm.getSrvchall_len(); i++) {
			ModernizedCProgram.u8_to_hex(ptr[i], out_buf + out_len);
			out_len += 2;
		}
		out_buf[out_len++] = (byte)':';
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len++] = (byte)':';
		ptr += netntlm.getSrvchall_len();
		for (int i = 0;
		 i < netntlm.getClichall_len(); i++) {
			ModernizedCProgram.u8_to_hex(ptr[i], out_buf + out_len);
			out_len += 2;
		}
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		byte[] tmp_buf = new byte[64];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 0, tmp, 20);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 20, salt.getSalt_buf(), salt.getSalt_len());
		u32 tmp_len = 20 + salt.getSalt_len();
		// base64 encode it
		byte[] base64_encoded = new byte[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp_buf, tmp_len, (u8)base64_encoded);
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u}%s", ModernizedCProgram.SIGNATURE_SAPH_SHA1, salt.getSalt_iter() + 1, base64_encoded);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		byte[] buf = new byte[]{0};
		// salt
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + 0, salt.getSalt_buf(), 16);
		buf[3] -= -4// iteration;// iteration
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(buf + 16, 11, "%010u", salt.getSalt_iter() + 1)// chars;// chars
		// not a bug// not a bugbuf[26] = salt.getSalt_buf_pc()[0];
		// not a bug// not a bugbuf[27] = salt.getSalt_buf_pc()[1]// digest;// digest
		u32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + 28, tmp, 8);
		byte[] tmp_buf = new byte[64];
		int tmp_len = ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_lotus64, (u8)buf, 36, (u8)tmp_buf);
		tmp_buf[tmp_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "(H%s)", tmp_buf);
		return line_len;
		odf11_t odf11 = (odf11_t)esalt_buf;
		int out_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*0*0*%u*16*%08x%08x%08x%08x%08x*8*%08x%08x*16*%08x%08x%08x%08x*0*", ModernizedCProgram.SIGNATURE_ODF, odf11.getIterations(), ModernizedCProgram.byte_swap_32(odf11.getChecksum()[0]), ModernizedCProgram.byte_swap_32(odf11.getChecksum()[1]), ModernizedCProgram.byte_swap_32(odf11.getChecksum()[2]), ModernizedCProgram.byte_swap_32(odf11.getChecksum()[3]), ModernizedCProgram.byte_swap_32(odf11.getChecksum()[4]), odf11.getIv()[0], odf11.getIv()[1], salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3]);
		u8 out_buf = (u8)line_buf;
		for (int i = 0;
		 i < 256; i++) {
			ModernizedCProgram.u32_to_hex(ModernizedCProgram.byte_swap_32(odf11.getEncrypted_data()[i]), out_buf + out_len);
			out_len += 8;
		}
		return out_len;
		u32[] digest = (u32)digest_buf;
		// this (useless?) initialization makes scan-build happyu32[] tmp = new u32[]{0};
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		byte[] ptr_plain = new byte[]{0};
		ModernizedCProgram.sha256aix_encode((byte)tmp, (byte)ptr_plain);
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%02u$%s$%s", ModernizedCProgram.SIGNATURE_SHA256AIX, salt.getSalt_sign()[0], tmp_salt, ptr_plain);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		int out_len = 40;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[4];
		tmp[1] = digest[5];
		tmp[2] = digest[6];
		tmp[3] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		out_buf[0] = ModernizedCProgram.int_to_itoa64((tmp[0] >> 0) & -1024);
		out_buf[1] = ModernizedCProgram.int_to_itoa64((tmp[0] >> 6) & -1024);
		out_buf[2] = ModernizedCProgram.int_to_itoa64((tmp[0] >> 12) & -1024);
		out_buf[3] = ModernizedCProgram.int_to_itoa64((tmp[0] >> 18) & -1024);
		out_buf[4] = ModernizedCProgram.int_to_itoa64((tmp[1] >> 0) & -1024);
		out_buf[5] = ModernizedCProgram.int_to_itoa64((tmp[1] >> 6) & -1024);
		out_buf[6] = ModernizedCProgram.int_to_itoa64((tmp[1] >> 12) & -1024);
		out_buf[7] = ModernizedCProgram.int_to_itoa64((tmp[1] >> 18) & -1024);
		out_buf[8] = ModernizedCProgram.int_to_itoa64((tmp[2] >> 0) & -1024);
		out_buf[9] = ModernizedCProgram.int_to_itoa64((tmp[2] >> 6) & -1024);
		out_buf[10] = ModernizedCProgram.int_to_itoa64((tmp[2] >> 12) & -1024);
		out_buf[11] = ModernizedCProgram.int_to_itoa64((tmp[2] >> 18) & -1024);
		out_buf[12] = ModernizedCProgram.int_to_itoa64((tmp[3] >> 0) & -1024);
		out_buf[13] = ModernizedCProgram.int_to_itoa64((tmp[3] >> 6) & -1024);
		out_buf[14] = ModernizedCProgram.int_to_itoa64((tmp[3] >> 12) & -1024);
		out_buf[15] = ModernizedCProgram.int_to_itoa64((tmp[3] >> 18) & -1024);
		int out_len = 16;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + 56);
		int out_len = 64;
		return out_len;
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA512M_A;
			tmp[1] += sha2_64_constants.SHA512M_B;
			tmp[2] += sha2_64_constants.SHA512M_C;
			tmp[3] += sha2_64_constants.SHA512M_D;
			tmp[4] += sha2_64_constants.SHA512M_E;
			tmp[5] += sha2_64_constants.SHA512M_F;
			tmp[6] += sha2_64_constants.SHA512M_G;
			tmp[7] += sha2_64_constants.SHA512M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + out_len);
		out_len += 16;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u8[] tmp = new u8[]{0};
		ModernizedCProgram.md5crypt_encode(digest_buf, tmp);
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%s", ModernizedCProgram.SIGNATURE_MD5AIX, tmp_salt, tmp);
		return line_len;
		u32[] digest = (u32)digest_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X%08X", digest[0], digest[1], digest[2], digest[3], digest[4], digest[5], digest[6], digest[7], digest[8], digest[9], digest[10], digest[11], digest[12], digest[13], digest[14], digest[15], salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + out_len);
		out_len += 16;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA224M_A;
			tmp[1] += sha2_32_constants.SHA224M_B;
			tmp[2] += sha2_32_constants.SHA224M_C;
			tmp[3] += sha2_32_constants.SHA224M_D;
			tmp[4] += sha2_32_constants.SHA224M_E;
			tmp[5] += sha2_32_constants.SHA224M_F;
			tmp[6] += sha2_32_constants.SHA224M_G;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		int out_len = 56;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		tmp[8] = digest[8];
		tmp[9] = digest[9];
		tmp[10] = digest[10];
		tmp[11] = digest[11];
		tmp[12] = digest[12];
		tmp[13] = digest[13];
		tmp[14] = digest[14];
		tmp[15] = digest[15];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		tmp[8] = ModernizedCProgram.byte_swap_32(tmp[8]);
		tmp[9] = ModernizedCProgram.byte_swap_32(tmp[9]);
		tmp[10] = ModernizedCProgram.byte_swap_32(tmp[10]);
		tmp[11] = ModernizedCProgram.byte_swap_32(tmp[11]);
		tmp[12] = ModernizedCProgram.byte_swap_32(tmp[12]);
		tmp[13] = ModernizedCProgram.byte_swap_32(tmp[13]);
		tmp[14] = ModernizedCProgram.byte_swap_32(tmp[14]);
		tmp[15] = ModernizedCProgram.byte_swap_32(tmp[15]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + 56);
		ModernizedCProgram.u32_to_hex(tmp[8], out_buf + 64);
		ModernizedCProgram.u32_to_hex(tmp[9], out_buf + 72);
		ModernizedCProgram.u32_to_hex(tmp[10], out_buf + 80);
		ModernizedCProgram.u32_to_hex(tmp[11], out_buf + 88);
		ModernizedCProgram.u32_to_hex(tmp[12], out_buf + 96);
		ModernizedCProgram.u32_to_hex(tmp[13], out_buf + 104);
		ModernizedCProgram.u32_to_hex(tmp[14], out_buf + 112);
		ModernizedCProgram.u32_to_hex(tmp[15], out_buf + 120);
		int out_len = 128;
		return out_len;
		jks_sha1_t jks_sha1 = (jks_sha1_t)esalt_buf;
		byte[] enc_key = new byte[]{0};
		u8[] ptr = (u8)jks_sha1.getEnc_key_buf();
		for (u32 i = 0;
		u32 j = 0;
		 i < jks_sha1.getEnc_key_len(); ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(enc_key + j, "%02X", ptr[i]);
		}
		u8[] der = (u8)jks_sha1.getDer();
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%08X%08X%08X%08X%08X*%08X%08X%08X%08X%08X*%s*%02X*%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X*%s", ModernizedCProgram.SIGNATURE_JKS_SHA1, ModernizedCProgram.byte_swap_32(jks_sha1.getChecksum()[0]), ModernizedCProgram.byte_swap_32(jks_sha1.getChecksum()[1]), ModernizedCProgram.byte_swap_32(jks_sha1.getChecksum()[2]), ModernizedCProgram.byte_swap_32(jks_sha1.getChecksum()[3]), ModernizedCProgram.byte_swap_32(jks_sha1.getChecksum()[4]), ModernizedCProgram.byte_swap_32(jks_sha1.getIv()[0]), ModernizedCProgram.byte_swap_32(jks_sha1.getIv()[1]), ModernizedCProgram.byte_swap_32(jks_sha1.getIv()[2]), ModernizedCProgram.byte_swap_32(jks_sha1.getIv()[3]), ModernizedCProgram.byte_swap_32(jks_sha1.getIv()[4]), enc_key, der[0], der[6], der[7], der[8], der[9], der[10], der[11], der[12], der[13], der[14], der[15], der[16], der[17], der[18], der[19], (byte)jks_sha1.getAlias());
		return line_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s$%08X%08X%08X%08X%08X", tmp_salt, digest[0], digest[1], digest[2], digest[3], digest[4]);
		return line_len;
		u64[] digest = (u64)digest_buf;
		u64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + 16);
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + 32);
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + 48);
		int out_len = 64;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// salt_buf[1] holds our 32 bit value. salt_buf[0] and salt_buf[1] would be 64 bits.// we also need to multiply salt by our step to see the floor of our original timestamp range.
		// again, we will use the default RFC 6238 step of 30.u64 tmp_salt_buf = (((u64)(salt.getSalt_buf()[2])) << 32) | ((u64)(salt.getSalt_buf()[3]));
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%06d:%I64u", digest[0], tmp_salt_buf);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		cloudkey_t cloudkey = (cloudkey_t)esalt_buf;
		byte[] data_buf = new byte[]{0};
		for (int i = 0;
		int j = 0;
		 i < 512; ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(data_buf + j, "%08x", cloudkey.getData_buf()[i]);
		}
		data_buf[cloudkey.getData_len() * 2] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08x%08x%08x%08x%08x%08x%08x%08x:%08x%08x%08x%08x:%u:%s", digest[0], digest[1], digest[2], digest[3], digest[4], digest[5], digest[6], digest[7], ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]), salt.getSalt_iter() + 1, data_buf);
		return line_len;
		electrum_wallet_t electrum_wallet = (electrum_wallet_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u*%08x%08x%08x%08x*%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_ELECTRUM_WALLET, electrum_wallet.getSalt_type(), ModernizedCProgram.byte_swap_32(electrum_wallet.getIv()[0]), ModernizedCProgram.byte_swap_32(electrum_wallet.getIv()[1]), ModernizedCProgram.byte_swap_32(electrum_wallet.getIv()[2]), ModernizedCProgram.byte_swap_32(electrum_wallet.getIv()[3]), ModernizedCProgram.byte_swap_32(electrum_wallet.getEncrypted()[0]), ModernizedCProgram.byte_swap_32(electrum_wallet.getEncrypted()[1]), ModernizedCProgram.byte_swap_32(electrum_wallet.getEncrypted()[2]), ModernizedCProgram.byte_swap_32(electrum_wallet.getEncrypted()[3]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		byte[] sig = new byte[]{(byte)'n', (byte)'r', (byte)'c', (byte)'s', (byte)'t', (byte)'n'};
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		u8[] tmp_buf = new u8();
		tmp_buf[0] = sig[0];
		tmp_buf[1] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[0])) >> 12) & -1024);
		tmp_buf[2] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[0])) >> 6) & -1024);
		tmp_buf[3] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[0])) >> 0) & -1024);
		tmp_buf[4] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[0])) >> 12) & -1024);
		tmp_buf[5] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[0])) >> 6) & -1024);
		tmp_buf[6] = sig[1];
		tmp_buf[7] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[0])) >> 0) & -1024);
		tmp_buf[8] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[1])) >> 12) & -1024);
		tmp_buf[9] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[1])) >> 6) & -1024);
		tmp_buf[10] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[1])) >> 0) & -1024);
		tmp_buf[11] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[1])) >> 12) & -1024);
		tmp_buf[12] = sig[2];
		tmp_buf[13] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[1])) >> 6) & -1024);
		tmp_buf[14] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[1])) >> 0) & -1024);
		tmp_buf[15] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[2])) >> 12) & -1024);
		tmp_buf[16] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[2])) >> 6) & -1024);
		tmp_buf[17] = sig[3];
		tmp_buf[18] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[2])) >> 0) & -1024);
		tmp_buf[19] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[2])) >> 12) & -1024);
		tmp_buf[20] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[2])) >> 6) & -1024);
		tmp_buf[21] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[2])) >> 0) & -1024);
		tmp_buf[22] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[3])) >> 12) & -1024);
		tmp_buf[23] = sig[4];
		tmp_buf[24] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[3])) >> 6) & -1024);
		tmp_buf[25] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16b_from_v32(tmp[3])) >> 0) & -1024);
		tmp_buf[26] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[3])) >> 12) & -1024);
		tmp_buf[27] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[3])) >> 6) & -1024);
		tmp_buf[28] = ModernizedCProgram.int_to_base64(((ModernizedCProgram.v16a_from_v32(tmp[3])) >> 0) & -1024);
		tmp_buf[29] = sig[5];
		tmp_buf[30] = 0;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len() - /*Error: Function owner not recognized*/strlen(ModernizedCProgram.adm), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s:%s", tmp_buf, tmp_salt);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md4_constants.MD4M_A;
			tmp[1] += md4_constants.MD4M_B;
			tmp[2] += md4_constants.MD4M_C;
			tmp[3] += md4_constants.MD4M_D;
		} 
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		int out_len = 32;
		return out_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		oldoffice01_t oldoffice01 = (oldoffice01_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u*%08x%08x%08x%08x*%08x%08x%08x%08x*%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_OLDOFFICE, oldoffice01.getVersion(), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[0]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[1]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[2]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[3]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[0]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[1]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[2]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[3]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp_digest = new u32();
		tmp_digest[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp_digest[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		tmp_digest[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		tmp_digest[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		tmp_digest[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		tmp_digest[5] = ModernizedCProgram.byte_swap_32(digest[5]);
		u32[] tmp_salt = new u32();
		tmp_salt[0] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]);
		tmp_salt[1] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]);
		tmp_salt[2] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]);
		tmp_salt[3] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]);
		byte[] tmp_buf = new byte[64];
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_bf64, (u8)tmp_salt, 16, (u8)tmp_buf + 0);
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_bf64, (u8)tmp_digest, 23, (u8)tmp_buf + 22);
		// base64_encode wants to pad// base64_encode wants to padtmp_buf[22 + 31] = 0;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s$%s", (byte)salt.getSalt_sign(), tmp_buf);
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0] + salt.getSalt_buf_pc()[0];
		tmp[1] = digest[1] + salt.getSalt_buf_pc()[1];
		tmp[2] = digest[2] + salt.getSalt_buf_pc()[2];
		tmp[3] = digest[3] + salt.getSalt_buf_pc()[3];
		tmp[4] = digest[4] + salt.getSalt_buf_pc()[4];
		tmp[5] = digest[5] + salt.getSalt_buf_pc()[5];
		tmp[6] = digest[6] + salt.getSalt_buf_pc()[6];
		tmp[7] = digest[7] + salt.getSalt_buf_pc()[7];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = 0;
		tmp[3] = 0;
		{ 
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 1;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 1;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 8;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 8;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 2;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 2;
				tmp[1] = tmp[1] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[0] >> 16;
				t = t ^ tmp[1];
				t = t & -1024;
				tmp[1] = tmp[1] ^ t;
				t = t << 16;
				tmp[0] = tmp[0] ^ t;
			}
			;
			{ 
				u32x t = new u32x();
				t = tmp[1] >> 4;
				t = t ^ tmp[0];
				t = t & -1024;
				tmp[0] = tmp[0] ^ t;
				t = t << 4;
				tmp[1] = tmp[1] ^ t;
			}
			;
		}
		;
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len++;
		ModernizedCProgram.u32_to_hex(salt.getSalt_buf()[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(salt.getSalt_buf()[1], out_buf + out_len);
		out_len += 8;
		return out_len;
		byte[] tmp_buf = new byte[64];
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_itoa64, (u8)digest_buf, 32, (u8)tmp_buf);
		// cut it here// cut it heretmp_buf[43] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%s", ModernizedCProgram.SIGNATURE_CISCO9, (byte)salt.getSalt_buf(), tmp_buf);
		return line_len;
		pkzip_t pkzip = (pkzip_t)esalt_buf;
		int out_len = 0;
		if (pkzip.getVersion() == 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(line_buf, "%s", ModernizedCProgram.SIGNATURE_PKZIP_V1);
			out_len += 7;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(line_buf, "%s", ModernizedCProgram.SIGNATURE_PKZIP_V2);
				out_len += 8;
		} 
		out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%i*", pkzip.getHash_count(), pkzip.getChecksum_size());
		for (int cnt = 0;
		 cnt < pkzip.getHash_count(); cnt++) {
			if (cnt > 0) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*");
			} 
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%i*", pkzip.getHashes()[cnt].getData_type_enum(), pkzip.getHashes()[cnt].getMagic_type_enum());
			if (pkzip.getHashes()[cnt].getData_type_enum() > 1) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%x*%x*%x*%x*%x*", pkzip.getHashes()[cnt].getCompressed_length(), pkzip.getHashes()[cnt].getUncompressed_length(), pkzip.getHashes()[cnt].getCrc32(), pkzip.getHashes()[cnt].getOffset(), pkzip.getHashes()[cnt].getAdditional_offset());
			} 
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%i*%x*%04x*", pkzip.getHashes()[cnt].getCompression_type(), pkzip.getHashes()[cnt].getData_length(), pkzip.getHashes()[cnt].getChecksum_from_crc());
			if (pkzip.getVersion() == 2) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%04x*", pkzip.getHashes()[cnt].getChecksum_from_timestamp());
			} 
			for (u32 i = 0;
			 i < pkzip.getHashes()[cnt].getData_length() / 4; i++) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%08x", ModernizedCProgram.byte_swap_32(pkzip.getHashes()[cnt].getData()[i]));
			}
			for (u32 i = 0;
			 i < pkzip.getHashes()[cnt].getData_length() % 4; i++) {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "%02x", (pkzip.getHashes()[cnt].getData()[pkzip.getHashes()[cnt].getData_length() / 4] >> i * 8) & -1024);
			}
		}
		if (pkzip.getVersion() == 1) {
			out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*$/pkzip$");
		} else {
				out_len += /*Error: Function owner not recognized*/sprintf(line_buf + out_len, "*$/pkzip2$");
		} 
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		tmp[8] = digest[8];
		tmp[9] = digest[9];
		tmp[10] = digest[10];
		tmp[11] = digest[11];
		tmp[12] = digest[12];
		tmp[13] = digest[13];
		tmp[14] = digest[14];
		tmp[15] = digest[15];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + 56);
		ModernizedCProgram.u32_to_hex(tmp[8], out_buf + 64);
		ModernizedCProgram.u32_to_hex(tmp[9], out_buf + 72);
		ModernizedCProgram.u32_to_hex(tmp[10], out_buf + 80);
		ModernizedCProgram.u32_to_hex(tmp[11], out_buf + 88);
		ModernizedCProgram.u32_to_hex(tmp[12], out_buf + 96);
		ModernizedCProgram.u32_to_hex(tmp[13], out_buf + 104);
		ModernizedCProgram.u32_to_hex(tmp[14], out_buf + 112);
		ModernizedCProgram.u32_to_hex(tmp[15], out_buf + 120);
		int out_len = 128;
		return out_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		byte[] ptr_plain = new byte[64];
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp, 32, (u8)ptr_plain);
		ptr_plain[43] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*1*%s*%s", ModernizedCProgram.SIGNATURE_EPISERVER, tmp_salt, ptr_plain);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8 out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		return out_len;
		krb5pa_t krb5pa = (krb5pa_t)esalt_buf;
		u8[] ptr_timestamp = (u8)krb5pa.getTimestamp();
		u8[] ptr_checksum = (u8)krb5pa.getChecksum();
		byte[] data = new byte[]{0};
		Byte ptr_data = data;
		for (u32 i = 0;
		 i < 36; ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%02x", ptr_timestamp[i]);
		}
		for (u32 i = 0;
		 i < 16; ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%02x", ptr_checksum[i]);
		}
		ptr_data = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%s$%s$%s", ModernizedCProgram.SIGNATURE_KRB5PA, (byte)krb5pa.getUser(), (byte)krb5pa.getRealm(), (byte)krb5pa.getSalt(), data);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md4_constants.MD4M_A;
			tmp[1] += md4_constants.MD4M_B;
			tmp[2] += md4_constants.MD4M_C;
			tmp[3] += md4_constants.MD4M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		itunes_backup_t itunes_backup = (itunes_backup_t)esalt_buf;
		// WPKY
		u32[] wkpy_u32 = new u32();
		wkpy_u32[0] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[0]);
		wkpy_u32[1] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[1]);
		wkpy_u32[2] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[2]);
		wkpy_u32[3] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[3]);
		wkpy_u32[4] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[4]);
		wkpy_u32[5] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[5]);
		wkpy_u32[6] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[6]);
		wkpy_u32[7] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[7]);
		wkpy_u32[8] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[8]);
		wkpy_u32[9] = ModernizedCProgram.byte_swap_32(itunes_backup.getWpky()[9]);
		u8[] wpky = new u8();
		ModernizedCProgram.u32_to_hex(wkpy_u32[0], wpky + 0);
		ModernizedCProgram.u32_to_hex(wkpy_u32[1], wpky + 8);
		ModernizedCProgram.u32_to_hex(wkpy_u32[2], wpky + 16);
		ModernizedCProgram.u32_to_hex(wkpy_u32[3], wpky + 24);
		ModernizedCProgram.u32_to_hex(wkpy_u32[4], wpky + 32);
		ModernizedCProgram.u32_to_hex(wkpy_u32[5], wpky + 40);
		ModernizedCProgram.u32_to_hex(wkpy_u32[6], wpky + 48);
		ModernizedCProgram.u32_to_hex(wkpy_u32[7], wpky + 56);
		ModernizedCProgram.u32_to_hex(wkpy_u32[8], wpky + 64);
		ModernizedCProgram.u32_to_hex(wkpy_u32[9], wpky + 72);
		wpky[80] = 0;
		u32[] salt_in = new u32();
		salt_in[0] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]);
		salt_in[1] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]);
		salt_in[2] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]);
		salt_in[3] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]);
		salt_in[4] = ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[4]);
		salt_in[5] = 0;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt_in, (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%u*%s*%u*%s**", ModernizedCProgram.SIGNATURE_ITUNES_BACKUP, salt.getSalt_sign()[0], wpky, salt.getSalt_iter() + 1, tmp_salt);
		return line_len;
		u64[] digest = (u64)digest_buf;
		u64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + 16);
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + 32);
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + 48);
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + 64);
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + 80);
		int out_len = 96;
		return out_len;
		office2013_t office2013 = (office2013_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%d*%d*%d*%d*%08x%08x%08x%08x*%08x%08x%08x%08x*%08x%08x%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_OFFICE2013, 2013, 100000, 256, 16, salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3], office2013.getEncryptedVerifier()[0], office2013.getEncryptedVerifier()[1], office2013.getEncryptedVerifier()[2], office2013.getEncryptedVerifier()[3], office2013.getEncryptedVerifierHash()[0], office2013.getEncryptedVerifierHash()[1], office2013.getEncryptedVerifierHash()[2], office2013.getEncryptedVerifierHash()[3], office2013.getEncryptedVerifierHash()[4], office2013.getEncryptedVerifierHash()[5], office2013.getEncryptedVerifierHash()[6], office2013.getEncryptedVerifierHash()[7]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		krb5tgs_17_t krb5tgs = (krb5tgs_17_t)esalt_buf;
		byte[] data = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < krb5tgs.getEdata2_len(); ) {
			u8 ptr_edata2 = (u8)krb5tgs.getEdata2();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(data + j, "%02x", ptr_edata2[i]);
		}
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%s$%08x%08x%08x$%s", ModernizedCProgram.SIGNATURE_KRB5TGS, (byte)krb5tgs.getUser(), (byte)krb5tgs.getDomain(), krb5tgs.getChecksum()[0], krb5tgs.getChecksum()[1], krb5tgs.getChecksum()[2], data);
		return line_len;
		zip2_t zip2 = (zip2_t)esalt_buf;
		u32 salt_len = zip2.getSalt_len();
		byte[] salt_tmp = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < salt_len; ) {
			u8 ptr = (u8)zip2.getSalt_buf();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(salt_tmp + j, "%02x", ptr[i]);
		}
		u32 data_len = zip2.getData_len();
		byte[] data_tmp = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < data_len; ) {
			u8 ptr = (u8)zip2.getData_buf();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(data_tmp + j, "%02x", ptr[i]);
		}
		u32 auth_len = zip2.getAuth_len();
		byte[] auth_tmp = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < auth_len; ) {
			u8 ptr = (u8)zip2.getAuth_buf();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(auth_tmp + j, "%02x", ptr[i]);
		}
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%u*%u*%u*%s*%x*%u*%s*%s*%s", ModernizedCProgram.SIGNATURE_ZIP2_START, zip2.getType(), zip2.getMode(), zip2.getMagic(), salt_tmp, zip2.getVerify_bytes(), zip2.getCompress_length(), data_tmp, auth_tmp, ModernizedCProgram.SIGNATURE_ZIP2_STOP);
		return line_len;
		Byte ptr = (byte)digest_buf;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", ptr + 64);
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s%08x%08x%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_SYBASEASE, tmp_salt, digest[0], digest[1], digest[2], digest[3], digest[4], digest[5], digest[6], digest[7]);
		return line_len;
		oldoffice01_t oldoffice01 = (oldoffice01_t)esalt_buf;
		u8[] rc4key = (u8)oldoffice01.getRc4key();
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u*%08x%08x%08x%08x*%08x%08x%08x%08x*%08x%08x%08x%08x:%02x%02x%02x%02x%02x", ModernizedCProgram.SIGNATURE_OLDOFFICE, oldoffice01.getVersion(), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[0]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[1]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[2]), ModernizedCProgram.byte_swap_32(salt.getSalt_buf()[3]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[0]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[1]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[2]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifier()[3]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[0]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[1]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[2]), ModernizedCProgram.byte_swap_32(oldoffice01.getEncryptedVerifierHash()[3]), rc4key[0], rc4key[1], rc4key[2], rc4key[3], rc4key[4]);
		return line_len;
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA512M_A;
			tmp[1] += sha2_64_constants.SHA512M_B;
			tmp[2] += sha2_64_constants.SHA512M_C;
			tmp[3] += sha2_64_constants.SHA512M_D;
			tmp[4] += sha2_64_constants.SHA512M_E;
			tmp[5] += sha2_64_constants.SHA512M_F;
			tmp[6] += sha2_64_constants.SHA512M_G;
			tmp[7] += sha2_64_constants.SHA512M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + out_len);
		out_len += 16;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s*%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_MYSQL_AUTH, tmp_salt, digest[0], digest[1], digest[2], digest[3], digest[4]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_PHPS, tmp_salt, ModernizedCProgram.byte_swap_32(tmp[0]), ModernizedCProgram.byte_swap_32(tmp[1]), ModernizedCProgram.byte_swap_32(tmp[2]), ModernizedCProgram.byte_swap_32(tmp[3]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%08x%08x%08x%08x%08x%08x%08x%08x", tmp_salt, tmp[0], tmp[1], tmp[2], tmp[3], tmp[4], tmp[5], tmp[6], tmp[7]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		byte[] digest_buf_c = new byte[34];
		ModernizedCProgram.base32_encode(ModernizedCProgram.int_to_itoa32, (u8)tmp, 20, (u8)digest_buf_c);
		digest_buf_c[32] = 0// domain;// domain
		u32 salt_pc_len = salt.getSalt_len_pc();
		byte[] domain_buf_c = new byte[]{0};
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(domain_buf_c, (byte)salt.getSalt_buf_pc(), salt_pc_len);
		for (u32 i = 0;
		 i < salt_pc_len; i++) {
			byte next = domain_buf_c[i];
			domain_buf_c[i] = (byte)'.';
			i += next;
		}
		domain_buf_c[salt_pc_len] = 0// final;// final
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s:%s:%s:%u", digest_buf_c, domain_buf_c, tmp_salt, salt.getSalt_iter());
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[4];
		tmp[1] = digest[5];
		tmp[2] = digest[6];
		tmp[3] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		out_buf[0] = ModernizedCProgram.int_to_itoa64((tmp[0] >> 0) & -1024);
		out_buf[1] = ModernizedCProgram.int_to_itoa64((tmp[0] >> 6) & -1024);
		out_buf[2] = ModernizedCProgram.int_to_itoa64((tmp[0] >> 12) & -1024);
		out_buf[3] = ModernizedCProgram.int_to_itoa64((tmp[0] >> 18) & -1024);
		out_buf[4] = ModernizedCProgram.int_to_itoa64((tmp[1] >> 0) & -1024);
		out_buf[5] = ModernizedCProgram.int_to_itoa64((tmp[1] >> 6) & -1024);
		out_buf[6] = ModernizedCProgram.int_to_itoa64((tmp[1] >> 12) & -1024);
		out_buf[7] = ModernizedCProgram.int_to_itoa64((tmp[1] >> 18) & -1024);
		out_buf[8] = ModernizedCProgram.int_to_itoa64((tmp[2] >> 0) & -1024);
		out_buf[9] = ModernizedCProgram.int_to_itoa64((tmp[2] >> 6) & -1024);
		out_buf[10] = ModernizedCProgram.int_to_itoa64((tmp[2] >> 12) & -1024);
		out_buf[11] = ModernizedCProgram.int_to_itoa64((tmp[2] >> 18) & -1024);
		out_buf[12] = ModernizedCProgram.int_to_itoa64((tmp[3] >> 0) & -1024);
		out_buf[13] = ModernizedCProgram.int_to_itoa64((tmp[3] >> 6) & -1024);
		out_buf[14] = ModernizedCProgram.int_to_itoa64((tmp[3] >> 12) & -1024);
		out_buf[15] = ModernizedCProgram.int_to_itoa64((tmp[3] >> 18) & -1024);
		int out_len = 16;
		return out_len;
		u32[] digest = (u32)digest_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_AXCRYPT_SHA1, digest[0], digest[1], digest[2], digest[3]);
		return line_len;
		u8[] ptr_plain = new u8[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)digest_buf, 32, (u8)ptr_plain);
		int out_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "otm_sha256:%d:%s:%s", salt.getSalt_iter() + 1, (byte)salt.getSalt_buf(), (byte)ptr_plain);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		pdf_t pdf = (pdf_t)esalt_buf;
		u8[] rc4key = (u8)pdf.getRc4key();
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$pdf$%d*%d*%d*%d*%d*%d*%08x%08x%08x%08x*%d*%08x%08x%08x%08x%08x%08x%08x%08x*%d*%08x%08x%08x%08x%08x%08x%08x%08x:%02x%02x%02x%02x%02x", pdf.getV(), pdf.getR(), 40, pdf.getP(), pdf.getEnc_md(), pdf.getId_len(), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getId_buf()[3]), pdf.getU_len(), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getU_buf()[7]), pdf.getO_len(), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[0]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[1]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[2]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[3]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[4]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[5]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[6]), ModernizedCProgram.byte_swap_32(pdf.getO_buf()[7]), rc4key[0], rc4key[1], rc4key[2], rc4key[3], rc4key[4]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		u8[] ptr = (u8)salt.getSalt_buf();
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s,%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x,%u,%08x%08x%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_MS_DRSR, ptr[0], ptr[1], ptr[2], ptr[3], ptr[4], ptr[5], ptr[6], ptr[7], ptr[8], ptr[9], salt.getSalt_iter() + 1, digest[0], digest[1], digest[2], digest[3], digest[4], digest[5], digest[6], digest[7]);
		return line_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		krb5pa_18_t krb5pa = (krb5pa_18_t)esalt_buf;
		byte[] data = new byte[]{0};
		for (u32 i = 0;
		u32 j = 0;
		 i < krb5pa.getEnc_timestamp_len(); ) {
			u8 ptr_enc_timestamp = (u8)krb5pa.getEnc_timestamp();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(data + j, "%02x", ptr_enc_timestamp[i]);
		}
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%s$%s%08x%08x%08x", ModernizedCProgram.SIGNATURE_KRB5PA, (byte)krb5pa.getUser(), (byte)krb5pa.getDomain(), data, krb5pa.getChecksum()[0], krb5pa.getChecksum()[1], krb5pa.getChecksum()[2]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08X%08X", ModernizedCProgram.byte_swap_32(digest[0]), ModernizedCProgram.byte_swap_32(digest[1]));
		line_buf[line_len] = hashconfig.getSeparator();
		line_len += 1;
		line_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)line_buf + line_len);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA512M_A;
			tmp[1] += sha2_64_constants.SHA512M_B;
			tmp[2] += sha2_64_constants.SHA512M_C;
			tmp[3] += sha2_64_constants.SHA512M_D;
			tmp[4] += sha2_64_constants.SHA512M_E;
			tmp[5] += sha2_64_constants.SHA512M_F;
			tmp[6] += sha2_64_constants.SHA512M_G;
			tmp[7] += sha2_64_constants.SHA512M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + out_len);
		out_len += 16;
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + out_len);
		out_len += 16;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = 0;
		tmp[3] = 0;
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		int out_len = 16;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		int out_len = 40;
		return out_len;
		u64[] digest = (u64)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_64_constants.SHA512M_A;
			tmp[1] += sha2_64_constants.SHA512M_B;
			tmp[2] += sha2_64_constants.SHA512M_C;
			tmp[3] += sha2_64_constants.SHA512M_D;
			tmp[4] += sha2_64_constants.SHA512M_E;
			tmp[5] += sha2_64_constants.SHA512M_F;
			tmp[6] += sha2_64_constants.SHA512M_G;
			tmp[7] += sha2_64_constants.SHA512M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_64(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_64(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_64(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_64(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_64(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_64(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_64(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_64(tmp[7]);
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + 16);
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + 32);
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + 48);
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + 64);
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + 80);
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + 96);
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + 112);
		int out_len = 128;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		rar5_t rar5 = (rar5_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$rar5$16$%08x%08x%08x%08x$%u$%08x%08x%08x%08x$8$%08x%08x", salt.getSalt_buf()[0], salt.getSalt_buf()[1], salt.getSalt_buf()[2], salt.getSalt_buf()[3], salt.getSalt_sign()[0], rar5.getIv()[0], rar5.getIv()[1], rar5.getIv()[2], rar5.getIv()[3], digest[0], digest[1]);
		return line_len;
		u32[] digest = digest_buf;
		pbkdf2_sha512_t pbkdf2_sha512 = (pbkdf2_sha512_t)esalt_buf;
		int line_len = 0;
		line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%s%u.", ModernizedCProgram.SIGNATURE_SHA512GRUB, salt.getSalt_iter() + 1);
		byte[] salt_buf_ptr = (byte)pbkdf2_sha512.getSalt_buf();
		for (u32 i = 0;
		 i < salt.getSalt_len(); i++) {
			line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%02x", salt_buf_ptr[i]);
		}
		line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, ".%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x", digest[1], digest[0], digest[3], digest[2], digest[5], digest[4], digest[7], digest[6], digest[9], digest[8], digest[11], digest[10], digest[13], digest[12], digest[15], digest[14]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s$%08X%08X", tmp_salt, ModernizedCProgram.byte_swap_32(digest[0]), ModernizedCProgram.byte_swap_32(digest[1]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + 32);
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + 40);
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + 48);
		int out_len = 56;
		return out_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08x:%s", digest[0], tmp_salt);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md4_constants.MD4M_A;
			tmp[1] += md4_constants.MD4M_B;
			tmp[2] += md4_constants.MD4M_C;
			tmp[3] += md4_constants.MD4M_D;
		} 
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + 8);
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + 16);
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + 24);
		int out_len = 32;
		return out_len;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s", hash_info.getOrighash());
		keepass_t keepass = (keepass_t)esalt_buf;
		u32 version = keepass.getVersion();
		u32 rounds = salt.getSalt_iter();
		u32 algorithm = keepass.getAlgorithm();
		u32 keyfile_len = keepass.getKeyfile_len();
		u32[] ptr_final_random_seed = (u32)keepass.getFinal_random_seed();
		u32[] ptr_transf_random_seed = (u32)keepass.getTransf_random_seed();
		u32[] ptr_enc_iv = (u32)keepass.getEnc_iv();
		u32[] ptr_contents_hash = (u32)keepass.getContents_hash();
		u32[] ptr_keyfile = (u32)keepass.getKeyfile();
		// specific to version 2u32 expected_bytes_len = new u32();
		u32[] ptr_expected_bytes = new u32();
		u32 final_random_seed_len = new u32();
		u32 transf_random_seed_len = new u32();
		u32 enc_iv_len = new u32();
		u32 contents_hash_len = new u32();
		transf_random_seed_len = 8;
		enc_iv_len = 4;
		contents_hash_len = 8;
		final_random_seed_len = 8;
		if (version == 1) {
			final_random_seed_len = 4;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%u*%u*%u", ModernizedCProgram.SIGNATURE_KEEPASS, version, rounds, algorithm);
		Byte ptr_data = line_buf;
		ptr_data += /*Error: Function owner not recognized*/strlen(line_buf);
		ptr_data = (byte)'*';
		ptr_data++;
		for (u32 i = 0;
		 i < final_random_seed_len; ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%08x", ptr_final_random_seed[i]);
		}
		ptr_data = (byte)'*';
		ptr_data++;
		for (u32 i = 0;
		 i < transf_random_seed_len; ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%08x", ptr_transf_random_seed[i]);
		}
		ptr_data = (byte)'*';
		ptr_data++;
		for (u32 i = 0;
		 i < enc_iv_len; ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%08x", ptr_enc_iv[i]);
		}
		ptr_data = (byte)'*';
		ptr_data++;
		if (version == 1) {
			u32 contents_len = keepass.getContents_len();
			u32 ptr_contents = (u32)keepass.getContents();
			for (u32 i = 0;
			 i < contents_hash_len; ) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%08x", ptr_contents_hash[i]);
			}
			ptr_data = (byte)'*';
			ptr_data++;
			ptr_data = (byte)'1';
			ptr_data++;
			ptr_data = (byte)'*';
			ptr_data++;
			byte[] ptr_contents_len = new byte[]{0};
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf((byte)ptr_contents_len, "%u", contents_len);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%u", contents_len);
			ptr_data += /*Error: Function owner not recognized*/strlen(ptr_contents_len);
			ptr_data = (byte)'*';
			ptr_data++;
			for (u32 i = 0;
			 i < contents_len / 4; ) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%08x", ptr_contents[i]);
			}
		}  else if (version == 2) {
			expected_bytes_len = 8;
			ptr_expected_bytes = (u32)keepass.getExpected_bytes();
			for (u32 i = 0;
			 i < expected_bytes_len; ) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%08x", ptr_expected_bytes[i]);
			}
			ptr_data = (byte)'*';
			ptr_data++;
			for (u32 i = 0;
			 i < contents_hash_len; ) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%08x", ptr_contents_hash[i]);
			}
		} 
		if (keyfile_len) {
			ptr_data = (byte)'*';
			ptr_data++;
			ptr_data = (byte)'1';
			ptr_data++;
			ptr_data = (byte)'*';
			ptr_data++;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%u", keyfile_len * 2);
			ptr_data += 2;
			ptr_data = (byte)'*';
			ptr_data++;
			for (u32 i = 0;
			 i < 8; ) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ptr_data, "%08x", ptr_keyfile[i]);
			}
		} 
		return /*Error: Function owner not recognized*/strlen(line_buf);
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len() - 1, (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_MEDIAWIKI_B, tmp_salt, ModernizedCProgram.byte_swap_32(tmp[0]), ModernizedCProgram.byte_swap_32(tmp[1]), ModernizedCProgram.byte_swap_32(tmp[2]), ModernizedCProgram.byte_swap_32(tmp[3]));
		return line_len;
		u32[] digest = (u32)digest_buf;
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		return /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%08x%08x%08x%08x:%u:%s", digest[0], digest[1], digest[2], digest[3], salt.getSalt_iter() + 1, tmp_salt);
		dpapimk_t dpapimk = (dpapimk_t)esalt_buf;
		u32 version = 1;
		u32 context = dpapimk.getContext();
		u32 rounds = salt.getSalt_iter() + 1;
		u32 contents_len = dpapimk.getContents_len();
		u32 SID_len = dpapimk.getSID_len();
		u32 iv_len = 32;
		u8[] cipher_algorithm = new u8[]{0};
		u8[] hash_algorithm = new u8[]{0};
		u8[] SID = new u8[]{0};
		u8[] SID_tmp = new u8();
		u32[] ptr_SID = (u32)dpapimk.getSID();
		u32[] ptr_iv = (u32)dpapimk.getIv();
		u32[] ptr_contents = (u32)dpapimk.getContents();
		u32[] u32_iv = new u32();
		u8[] iv = new u8();
		// convert back SID
		SID_tmp = (u8)ModernizedCProgram.hcmalloc((SID_len + 1) * /*Error: Unsupported expression*/);
		for (u32 i = 0;
		 i < (SID_len / 4) + 1; i++) {
			u8[] hex = new u8[]{0};
			ModernizedCProgram.u32_to_hex(ModernizedCProgram.byte_swap_32(ptr_SID[i]), hex);
			for (u32 j = 0;
			u32 k = 0;
			 j < 8; ) {
				SID_tmp[i * 4 + k] = ModernizedCProgram.hex_to_u8(hex[j]);
			}
		}
		// overwrite trailing 0x80// overwrite trailing 0x80SID_tmp[SID_len] = 0;
		for (u32 i = 0;
		u32 j = 0;
		 j < SID_len; ) {
			SID[i] = SID_tmp[j];
		}
		ModernizedCProgram.hcfree(SID_tmp);
		for (u32 i = 0;
		 i < iv_len / 8; i++) {
			u32_iv[i] = ModernizedCProgram.byte_swap_32(ptr_iv[i]);
			ModernizedCProgram.u32_to_hex(u32_iv[i], iv + i * 8);
		}
		iv[32] = 0;
		u32[] u32_contents = new u32();
		u8[] contents = new u8();
		for (u32 i = 0;
		 i < contents_len / 8; i++) {
			u32_contents[i] = ModernizedCProgram.byte_swap_32(ptr_contents[i]);
			ModernizedCProgram.u32_to_hex(u32_contents[i], contents + i * 8);
		}
		contents[208] = 0;
		if (contents_len == 208) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(cipher_algorithm, "des3", /*Error: Function owner not recognized*/strlen("des3"));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(hash_algorithm, "sha1", /*Error: Function owner not recognized*/strlen("sha1"));
		} 
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u*%u*%s*%s*%s*%u*%s*%u*%s", ModernizedCProgram.SIGNATURE_DPAPIMK, version, context, SID, cipher_algorithm, hash_algorithm, rounds, iv, contents_len, contents);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		sha1_double_salt_t sha1_double_salt = (sha1_double_salt_t)esalt_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)sha1_double_salt.getSalt1_buf(), (int)sha1_double_salt.getSalt1_len(), out_buf + out_len);
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)sha1_double_salt.getSalt2_buf(), (int)sha1_double_salt.getSalt2_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// encode the digest:
		// this (useless?) initialization makes scan-build happyu32[] tmp = new u32[]{0};
		tmp[0] = ModernizedCProgram.byte_swap_32(digest[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(digest[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(digest[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(digest[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(digest[4]);
		byte[] ptr_plain = new byte[]{0};
		ModernizedCProgram.netbsd_sha1crypt_encode((byte)tmp, salt.getSalt_sign()[0], (byte)ptr_plain)// salt;// salt
		byte[] tmp_salt = new byte[256 * 2];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_salt, salt.getSalt_buf(), salt.getSalt_len());
		tmp_salt[salt.getSalt_len()] = 0// output:;// output:
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$sha1$%u$%s$%s", salt.getSalt_iter() + 1, tmp_salt, ptr_plain);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha2_32_constants.SHA256M_A;
			tmp[1] += sha2_32_constants.SHA256M_B;
			tmp[2] += sha2_32_constants.SHA256M_C;
			tmp[3] += sha2_32_constants.SHA256M_D;
			tmp[4] += sha2_32_constants.SHA256M_E;
			tmp[5] += sha2_32_constants.SHA256M_F;
			tmp[6] += sha2_32_constants.SHA256M_G;
			tmp[7] += sha2_32_constants.SHA256M_H;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		tmp[5] = ModernizedCProgram.byte_swap_32(tmp[5]);
		tmp[6] = ModernizedCProgram.byte_swap_32(tmp[6]);
		tmp[7] = ModernizedCProgram.byte_swap_32(tmp[7]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[5], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[6], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[7], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%08x%08x%08x%08x%08x", tmp_salt, tmp[0], tmp[1], tmp[2], tmp[3], tmp[4]);
		return line_len;
		u8[] tmp = new u8[]{0};
		ModernizedCProgram.md5crypt_encode(digest_buf, tmp);
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = 0;
		if (salt.getSalt_iter() == ModernizedCProgram.ROUNDS_MD5CRYPT) {
			line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$1$%s$%s", tmp_salt, tmp);
		} else {
				line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$1$rounds=%u$%s$%s", salt.getSalt_iter(), tmp_salt, tmp);
		} 
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "0x0100%s%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x", tmp_salt, -1024, -1024, -1024, -1024, -1024, tmp[0], tmp[1], tmp[2], tmp[3], tmp[4]);
		return line_len;
		apple_secure_notes_t apple_secure_notes = (apple_secure_notes_t)esalt_buf;
		Object generatedZ_PK = apple_secure_notes.getZ_PK();
		Object[] generatedZCRYPTOSALT = apple_secure_notes.getZCRYPTOSALT();
		Object generatedZCRYPTOITERATIONCOUNT = apple_secure_notes.getZCRYPTOITERATIONCOUNT();
		Object[] generatedZCRYPTOWRAPPEDKEY = apple_secure_notes.getZCRYPTOWRAPPEDKEY();
		int out_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u$16$%08x%08x%08x%08x$%u$%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_APFS, generatedZ_PK, ModernizedCProgram.byte_swap_32(generatedZCRYPTOSALT[0]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOSALT[1]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOSALT[2]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOSALT[3]), generatedZCRYPTOITERATIONCOUNT, ModernizedCProgram.byte_swap_32(generatedZCRYPTOWRAPPEDKEY[0]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOWRAPPEDKEY[1]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOWRAPPEDKEY[2]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOWRAPPEDKEY[3]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOWRAPPEDKEY[4]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOWRAPPEDKEY[5]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOWRAPPEDKEY[6]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOWRAPPEDKEY[7]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOWRAPPEDKEY[8]), ModernizedCProgram.byte_swap_32(generatedZCRYPTOWRAPPEDKEY[9]));
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		chacha20_t chacha20 = (chacha20_t)esalt_buf;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s*%08x%08x*%u*%08x%08x*%08x%08x*%08x%08x", ModernizedCProgram.SIGNATURE_CHACHA20, ModernizedCProgram.byte_swap_32(chacha20.getPosition()[0]), ModernizedCProgram.byte_swap_32(chacha20.getPosition()[1]), chacha20.getOffset(), ModernizedCProgram.byte_swap_32(chacha20.getIv()[1]), ModernizedCProgram.byte_swap_32(chacha20.getIv()[0]), ModernizedCProgram.byte_swap_32(chacha20.getPlain()[0]), ModernizedCProgram.byte_swap_32(chacha20.getPlain()[1]), ModernizedCProgram.byte_swap_32(digest[1]), ModernizedCProgram.byte_swap_32(digest[0]));
		return line_len;
		u64[] digest = (u64)digest_buf;
		u64[] tmp = new u64();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[5] = digest[5];
		tmp[6] = digest[6];
		tmp[7] = digest[7];
		u8 out_buf = (u8)line_buf;
		ModernizedCProgram.u64_to_hex(tmp[0], out_buf + 0);
		ModernizedCProgram.u64_to_hex(tmp[1], out_buf + 16);
		ModernizedCProgram.u64_to_hex(tmp[2], out_buf + 32);
		ModernizedCProgram.u64_to_hex(tmp[3], out_buf + 48);
		ModernizedCProgram.u64_to_hex(tmp[4], out_buf + 64);
		ModernizedCProgram.u64_to_hex(tmp[5], out_buf + 80);
		ModernizedCProgram.u64_to_hex(tmp[6], out_buf + 96);
		ModernizedCProgram.u64_to_hex(tmp[7], out_buf + 112);
		int out_len = 128;
		return out_len;
		u32[] digest = (u32)digest_buf;
		pbkdf2_sha512_t pbkdf2_sha512 = (pbkdf2_sha512_t)esalt_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] esalt = new u32[]{0};
		esalt[0] = ModernizedCProgram.byte_swap_32(pbkdf2_sha512.getSalt_buf()[0]);
		esalt[1] = ModernizedCProgram.byte_swap_32(pbkdf2_sha512.getSalt_buf()[1]);
		esalt[2] = ModernizedCProgram.byte_swap_32(pbkdf2_sha512.getSalt_buf()[2]);
		esalt[3] = ModernizedCProgram.byte_swap_32(pbkdf2_sha512.getSalt_buf()[3]);
		esalt[4] = ModernizedCProgram.byte_swap_32(pbkdf2_sha512.getSalt_buf()[4]);
		esalt[5] = ModernizedCProgram.byte_swap_32(pbkdf2_sha512.getSalt_buf()[5]);
		esalt[6] = ModernizedCProgram.byte_swap_32(pbkdf2_sha512.getSalt_buf()[6]);
		esalt[7] = ModernizedCProgram.byte_swap_32(pbkdf2_sha512.getSalt_buf()[7]);
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%u$%08x%08x%08x%08x%08x%08x%08x%08x$%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_SHA512MACOS, salt.getSalt_iter() + 1, esalt[0], esalt[1], esalt[2], esalt[3], esalt[4], esalt[5], esalt[6], esalt[7], digest[1], digest[0], digest[3], digest[2], digest[5], digest[4], digest[7], digest[6], digest[9], digest[8], digest[11], digest[10], digest[13], digest[12], digest[15], digest[14]);
		return line_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		u8[] out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[4], out_buf + out_len);
		out_len += 8;
		out_buf[out_len] = hashconfig.getSeparator();
		out_len += 1;
		out_len += ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), out_buf + out_len);
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += md5_constants.MD5M_A;
			tmp[1] += md5_constants.MD5M_B;
			tmp[2] += md5_constants.MD5M_C;
			tmp[3] += md5_constants.MD5M_D;
		} 
		u8 out_buf = (u8)line_buf;
		int out_len = 0;
		ModernizedCProgram.u32_to_hex(tmp[0], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[1], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[2], out_buf + out_len);
		out_len += 8;
		ModernizedCProgram.u32_to_hex(tmp[3], out_buf + out_len);
		out_len += 8;
		return out_len;
		u32[] digest = (u32)digest_buf;
		// we can not change anything in the original buffer, otherwise destroying sorting
		// therefore create some local bufferu32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%s$%08x%08x%08x%08x%08x", ModernizedCProgram.SIGNATURE_DJANGOSHA1, tmp_salt, ModernizedCProgram.byte_swap_32(tmp[0]), ModernizedCProgram.byte_swap_32(tmp[1]), ModernizedCProgram.byte_swap_32(tmp[2]), ModernizedCProgram.byte_swap_32(tmp[3]), ModernizedCProgram.byte_swap_32(tmp[4]));
		return line_len;
		u64[] digest = (u64)digest_buf;
		int line_len = 0;
		int iter = salt.getSalt_iter();
		if (iter == ModernizedCProgram.ROUNDS_QNX) {
			line_buf[line_len++] = (byte)'@';
			line_buf[line_len++] = (byte)'S';
			line_buf[line_len++] = (byte)'@';
		} else {
				line_buf[line_len++] = (byte)'@';
				line_buf[line_len++] = (byte)'S';
				line_buf[line_len++] = (byte)',';
				line_len += /*Error: Function owner not recognized*/snprintf(line_buf + line_len, line_size - line_len, "%d", iter);
				line_buf[line_len++] = (byte)'@';
		} 
		ModernizedCProgram.u64_to_hex(digest[0], (u8)line_buf + line_len);
		line_len += 16;
		ModernizedCProgram.u64_to_hex(digest[1], (u8)line_buf + line_len);
		line_len += 16;
		ModernizedCProgram.u64_to_hex(digest[2], (u8)line_buf + line_len);
		line_len += 16;
		ModernizedCProgram.u64_to_hex(digest[3], (u8)line_buf + line_len);
		line_len += 16;
		ModernizedCProgram.u64_to_hex(digest[4], (u8)line_buf + line_len);
		line_len += 16;
		ModernizedCProgram.u64_to_hex(digest[5], (u8)line_buf + line_len);
		line_len += 16;
		ModernizedCProgram.u64_to_hex(digest[6], (u8)line_buf + line_len);
		line_len += 16;
		ModernizedCProgram.u64_to_hex(digest[7], (u8)line_buf + line_len);
		line_len += 16;
		line_buf[line_len++] = (byte)'@';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(line_buf + line_len, salt.getSalt_buf(), salt.getSalt_len());
		line_len += salt.getSalt_len();
		line_buf[line_len] = 0;
		return line_len;
		u32[] digest = (u32)digest_buf;
		u32[] tmp = new u32();
		tmp[0] = digest[0];
		tmp[1] = digest[1];
		tmp[2] = digest[2];
		tmp[3] = digest[3];
		tmp[4] = digest[4];
		if (hashconfig.getOpti_type() & opti_type.OPTI_TYPE_OPTIMIZED_KERNEL) {
			tmp[0] += sha1_constants.SHA1M_A;
			tmp[1] += sha1_constants.SHA1M_B;
			tmp[2] += sha1_constants.SHA1M_C;
			tmp[3] += sha1_constants.SHA1M_D;
			tmp[4] += sha1_constants.SHA1M_E;
		} 
		tmp[0] = ModernizedCProgram.byte_swap_32(tmp[0]);
		tmp[1] = ModernizedCProgram.byte_swap_32(tmp[1]);
		tmp[2] = ModernizedCProgram.byte_swap_32(tmp[2]);
		tmp[3] = ModernizedCProgram.byte_swap_32(tmp[3]);
		tmp[4] = ModernizedCProgram.byte_swap_32(tmp[4]);
		byte[] tmp_buf = new byte[512];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf, tmp, 20);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(tmp_buf + 20, salt.getSalt_buf(), salt.getSalt_len());
		byte[] ptr_plain = new byte[]{0};
		ModernizedCProgram.base64_encode(ModernizedCProgram.int_to_base64, (u8)tmp_buf, 20 + salt.getSalt_len(), (u8)ptr_plain);
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "{SSHA}%s", ptr_plain);
		return line_len;
		return 0;
		u8[] tmp = new u8[]{0};
		ModernizedCProgram.sha512crypt_encode(digest_buf, tmp);
		byte[] tmp_salt = new byte[256 * 2];
		int salt_len = ModernizedCProgram.generic_salt_encode(hashconfig, (u8)salt.getSalt_buf(), (int)salt.getSalt_len(), (u8)tmp_salt);
		tmp_salt[salt_len] = 0;
		int line_len = 0;
		if (salt.getSalt_iter() == ModernizedCProgram.ROUNDS_SHA512CRYPT) {
			line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$6$%s$%s", tmp_salt, tmp);
		} else {
				line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "$6$rounds=%u$%s$%s", salt.getSalt_iter(), tmp_salt, tmp);
		} 
		return line_len;
		tacacs_plus_t tacacs_plus = (tacacs_plus_t)esalt_buf;
		byte[] ct_data = new byte[]{0};
		u8[] ct_data_ptr = (u8)tacacs_plus.getCt_data_buf();
		for (u32 i = 0;
		u32 j = 0;
		 i < tacacs_plus.getCt_data_len(); ) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(ct_data + j, "%02x", ct_data_ptr[i]);
		}
		u8[] session_ptr = (u8)tacacs_plus.getSession_buf();
		u8[] sequence_ptr = (u8)tacacs_plus.getSequence_buf();
		int line_len = /*Error: Function owner not recognized*/snprintf(line_buf, line_size, "%s%02x%02x%02x%02x$%s$%02x%02x", ModernizedCProgram.SIGNATURE_TACACS_PLUS, session_ptr[0], session_ptr[1], session_ptr[2], session_ptr[3], ct_data, sequence_ptr[0], sequence_ptr[1]);
		return line_len;
	}
	private static Object base64_encode(Object f, Object in_buf, Object in_len, Object[] out_buf) {
		u8[] in_ptr = in_buf;
		u8[] out_ptr = out_buf;
		for (size_t i = 0;
		 i < in_len; i += 3) {
			u8 f0 = ((i + 0) < in_len) ? in_ptr[0] : 0;
			u8 f1 = ((i + 1) < in_len) ? in_ptr[1] : 0;
			u8 f2 = ((i + 2) < in_len) ? in_ptr[2] : 0;
			u8 out_val0 = /*Error: Function owner not recognized*/f(((f0 >> 2) & -1024));
			u8 out_val1 = /*Error: Function owner not recognized*/f(((f0 << 4) & -1024) | ((f1 >> 4) & -1024));
			u8 out_val2 = /*Error: Function owner not recognized*/f(((f1 << 2) & -1024) | ((f2 >> 6) & -1024));
			u8 out_val3 = /*Error: Function owner not recognized*/f(((f2 >> 0) & -1024));
			out_ptr[0] = out_val0 & -1024;
			out_ptr[1] = out_val1 & -1024;
			out_ptr[2] = out_val2 & -1024;
			out_ptr[3] = out_val3 & -1024;
			in_ptr += 3;
			out_ptr += 4;
		}
		// ceil (in_len * 8 / 6)int out_len = (int)(((0.5 + in_len) * 8) / 6);
		while (out_len % 4) {
			out_buf[out_len] = (byte)'=';
			out_len++;
		}
		return out_len;
	}
	public static void u32_to_hex(Object v, Object[] hex) {
		u8[] tbl = new u8[]{(byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)'4', (byte)'5', (byte)'6', (byte)'7', (byte)'8', (byte)'9', (byte)'a', (byte)'b', (byte)'c', (byte)'d', (byte)'e', (byte)'f'};
		hex[1] = tbl[v >> 0 & 15];
		hex[0] = tbl[v >> 4 & 15];
		hex[3] = tbl[v >> 8 & 15];
		hex[2] = tbl[v >> 12 & 15];
		hex[5] = tbl[v >> 16 & 15];
		hex[4] = tbl[v >> 20 & 15];
		hex[7] = tbl[v >> 24 & 15];
		hex[6] = tbl[v >> 28 & 15];
	}
	private static void drupal7_encode(Object[] digest, Object[] buf) {
		int l;
		l = (digest[0] << 0) | (digest[1] << 8) | (digest[2] << 16);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[3] << 0) | (digest[4] << 8) | (digest[5] << 16);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[6] << 0) | (digest[7] << 8) | (digest[8] << 16);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[9] << 0) | (digest[10] << 8) | (digest[11] << 16);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[12] << 0) | (digest[13] << 8) | (digest[14] << 16);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[15] << 0) | (digest[16] << 8) | (digest[17] << 16);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[22] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[23] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[18] << 0) | (digest[19] << 8) | (digest[20] << 16);
		buf[24] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[25] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[26] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[27] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[21] << 0) | (digest[22] << 8) | (digest[23] << 16);
		buf[28] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[29] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[30] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[31] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[24] << 0) | (digest[25] << 8) | (digest[26] << 16);
		buf[32] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[33] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[34] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[35] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[27] << 0) | (digest[28] << 8) | (digest[29] << 16);
		buf[36] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[37] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[38] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[39] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[30] << 0) | (digest[31] << 8) | (digest[32] << 16);
		buf[40] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[41] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[42] = ModernizedCProgram.int_to_itoa64(l & -1024)//buf[43] = int_to_itoa64 (l & 0x3f);;//buf[43] = int_to_itoa64 (l & 0x3f);
	}
	private static void u64_to_hex(Object v, Object[] hex) {
		u8[] tbl = new u8[]{(byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)'4', (byte)'5', (byte)'6', (byte)'7', (byte)'8', (byte)'9', (byte)'a', (byte)'b', (byte)'c', (byte)'d', (byte)'e', (byte)'f'};
		hex[1] = tbl[v >> 0 & 15];
		hex[0] = tbl[v >> 4 & 15];
		hex[3] = tbl[v >> 8 & 15];
		hex[2] = tbl[v >> 12 & 15];
		hex[5] = tbl[v >> 16 & 15];
		hex[4] = tbl[v >> 20 & 15];
		hex[7] = tbl[v >> 24 & 15];
		hex[6] = tbl[v >> 28 & 15];
		hex[9] = tbl[v >> 32 & 15];
		hex[8] = tbl[v >> 36 & 15];
		hex[11] = tbl[v >> 40 & 15];
		hex[10] = tbl[v >> 44 & 15];
		hex[13] = tbl[v >> 48 & 15];
		hex[12] = tbl[v >> 52 & 15];
		hex[15] = tbl[v >> 56 & 15];
		hex[14] = tbl[v >> 60 & 15];
	}
	private static void sha512aix_encode(Object[] digest, Object[] buf) {
		int l;
		l = (digest[2] << 0) | (digest[1] << 8) | (digest[0] << 16);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[5] << 0) | (digest[4] << 8) | (digest[3] << 16);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[8] << 0) | (digest[7] << 8) | (digest[6] << 16);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[11] << 0) | (digest[10] << 8) | (digest[9] << 16);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[14] << 0) | (digest[13] << 8) | (digest[12] << 16);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[17] << 0) | (digest[16] << 8) | (digest[15] << 16);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[22] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[23] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[20] << 0) | (digest[19] << 8) | (digest[18] << 16);
		buf[24] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[25] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[26] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[27] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[23] << 0) | (digest[22] << 8) | (digest[21] << 16);
		buf[28] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[29] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[30] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[31] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[26] << 0) | (digest[25] << 8) | (digest[24] << 16);
		buf[32] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[33] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[34] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[35] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[29] << 0) | (digest[28] << 8) | (digest[27] << 16);
		buf[36] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[37] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[38] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[39] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[32] << 0) | (digest[31] << 8) | (digest[30] << 16);
		buf[40] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[41] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[42] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[43] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[35] << 0) | (digest[34] << 8) | (digest[33] << 16);
		buf[44] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[45] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[46] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[47] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[38] << 0) | (digest[37] << 8) | (digest[36] << 16);
		buf[48] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[49] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[50] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[51] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[41] << 0) | (digest[40] << 8) | (digest[39] << 16);
		buf[52] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[53] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[54] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[55] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[44] << 0) | (digest[43] << 8) | (digest[42] << 16);
		buf[56] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[57] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[58] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[59] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[47] << 0) | (digest[46] << 8) | (digest[45] << 16);
		buf[60] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[61] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[62] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[63] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[50] << 0) | (digest[49] << 8) | (digest[48] << 16);
		buf[64] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[65] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[66] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[67] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[53] << 0) | (digest[52] << 8) | (digest[51] << 16);
		buf[68] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[69] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[70] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[71] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[56] << 0) | (digest[55] << 8) | (digest[54] << 16);
		buf[72] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[73] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[74] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[75] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[59] << 0) | (digest[58] << 8) | (digest[57] << 16);
		buf[76] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[77] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[78] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[79] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[62] << 0) | (digest[61] << 8) | (digest[60] << 16);
		buf[80] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[81] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[82] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[83] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[63] << 16);
		buf[84] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[85] = ModernizedCProgram.int_to_itoa64(l & -1024);
	}
	private static void sha256crypt_encode(Object[] digest, Object[] buf) {
		int l;
		l = (digest[0] << 16) | (digest[10] << 8) | (digest[20] << 0);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[21] << 16) | (digest[1] << 8) | (digest[11] << 0);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[12] << 16) | (digest[22] << 8) | (digest[2] << 0);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[3] << 16) | (digest[13] << 8) | (digest[23] << 0);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[24] << 16) | (digest[4] << 8) | (digest[14] << 0);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[15] << 16) | (digest[25] << 8) | (digest[5] << 0);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[22] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[23] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[6] << 16) | (digest[16] << 8) | (digest[26] << 0);
		buf[24] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[25] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[26] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[27] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[27] << 16) | (digest[7] << 8) | (digest[17] << 0);
		buf[28] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[29] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[30] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[31] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[18] << 16) | (digest[28] << 8) | (digest[8] << 0);
		buf[32] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[33] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[34] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[35] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[9] << 16) | (digest[19] << 8) | (digest[29] << 0);
		buf[36] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[37] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[38] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[39] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = 0 | (digest[31] << 8) | (digest[30] << 0);
		buf[40] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[41] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[42] = ModernizedCProgram.int_to_itoa64(l & -1024);
	}
	private static void md5crypt_encode(Object[] digest, Object[] buf) {
		int l;
		l = (digest[0] << 16) | (digest[6] << 8) | (digest[12] << 0);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[1] << 16) | (digest[7] << 8) | (digest[13] << 0);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[2] << 16) | (digest[8] << 8) | (digest[14] << 0);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[3] << 16) | (digest[9] << 8) | (digest[15] << 0);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[4] << 16) | (digest[10] << 8) | (digest[5] << 0);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[11] << 0);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
		int l;
		l = (digest[0] << 16) | (digest[6] << 8) | (digest[12] << 0);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[1] << 16) | (digest[7] << 8) | (digest[13] << 0);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[2] << 16) | (digest[8] << 8) | (digest[14] << 0);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[3] << 16) | (digest[9] << 8) | (digest[15] << 0);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[4] << 16) | (digest[10] << 8) | (digest[5] << 0);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[11] << 0);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
		int l;
		l = (digest[0] << 16) | (digest[6] << 8) | (digest[12] << 0);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[1] << 16) | (digest[7] << 8) | (digest[13] << 0);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[2] << 16) | (digest[8] << 8) | (digest[14] << 0);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[3] << 16) | (digest[9] << 8) | (digest[15] << 0);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[4] << 16) | (digest[10] << 8) | (digest[5] << 0);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[11] << 0);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
	}
	private static void sha1aix_encode(Object[] digest, Object[] buf) {
		int l;
		l = (digest[2] << 0) | (digest[1] << 8) | (digest[0] << 16);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[5] << 0) | (digest[4] << 8) | (digest[3] << 16);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[8] << 0) | (digest[7] << 8) | (digest[6] << 16);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[11] << 0) | (digest[10] << 8) | (digest[9] << 16);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[14] << 0) | (digest[13] << 8) | (digest[12] << 16);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[17] << 0) | (digest[16] << 8) | (digest[15] << 16);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[22] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[23] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = 0 | (digest[19] << 8) | (digest[18] << 16);
		buf[24] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[25] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[26] = ModernizedCProgram.int_to_itoa64(l & -1024);
	}
	private static void phpass_encode(Object[] digest, Object[] buf) {
		int l;
		l = (digest[0] << 0) | (digest[1] << 8) | (digest[2] << 16);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[3] << 0) | (digest[4] << 8) | (digest[5] << 16);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[6] << 0) | (digest[7] << 8) | (digest[8] << 16);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[9] << 0) | (digest[10] << 8) | (digest[11] << 16);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[12] << 0) | (digest[13] << 8) | (digest[14] << 16);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[15] << 0);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
	}
	private static void sha256aix_encode(Object[] digest, Object[] buf) {
		int l;
		l = (digest[2] << 0) | (digest[1] << 8) | (digest[0] << 16);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[5] << 0) | (digest[4] << 8) | (digest[3] << 16);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[8] << 0) | (digest[7] << 8) | (digest[6] << 16);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[11] << 0) | (digest[10] << 8) | (digest[9] << 16);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[14] << 0) | (digest[13] << 8) | (digest[12] << 16);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[17] << 0) | (digest[16] << 8) | (digest[15] << 16);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[22] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[23] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[20] << 0) | (digest[19] << 8) | (digest[18] << 16);
		buf[24] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[25] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[26] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[27] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[23] << 0) | (digest[22] << 8) | (digest[21] << 16);
		buf[28] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[29] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[30] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[31] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[26] << 0) | (digest[25] << 8) | (digest[24] << 16);
		buf[32] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[33] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[34] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[35] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[29] << 0) | (digest[28] << 8) | (digest[27] << 16);
		buf[36] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[37] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[38] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[39] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = 0 | (digest[31] << 8) | (digest[30] << 16);
		buf[40] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[41] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[42] = ModernizedCProgram.int_to_itoa64(l & -1024);
	}
	private static Object base32_encode(Object f, Object in_buf, Object in_len, Object[] out_buf) {
		u8[] in_ptr = in_buf;
		u8[] out_ptr = out_buf;
		for (size_t i = 0;
		 i < in_len; i += 5) {
			u8 f0 = ((i + 0) < in_len) ? in_ptr[0] : 0;
			u8 f1 = ((i + 1) < in_len) ? in_ptr[1] : 0;
			u8 f2 = ((i + 2) < in_len) ? in_ptr[2] : 0;
			u8 f3 = ((i + 3) < in_len) ? in_ptr[3] : 0;
			u8 f4 = ((i + 4) < in_len) ? in_ptr[4] : 0;
			u8 out_val0 = /*Error: Function owner not recognized*/f(((f0 >> 3) & -1024));
			u8 out_val1 = /*Error: Function owner not recognized*/f(((f0 << 2) & -1024) | ((f1 >> 6) & -1024));
			u8 out_val2 = /*Error: Function owner not recognized*/f(((f1 >> 1) & -1024));
			u8 out_val3 = /*Error: Function owner not recognized*/f(((f1 << 4) & -1024) | ((f2 >> 4) & -1024));
			u8 out_val4 = /*Error: Function owner not recognized*/f(((f2 << 1) & -1024) | ((f3 >> 7) & -1024));
			u8 out_val5 = /*Error: Function owner not recognized*/f(((f3 >> 2) & -1024));
			u8 out_val6 = /*Error: Function owner not recognized*/f(((f3 << 3) & -1024) | ((f4 >> 5) & -1024));
			u8 out_val7 = /*Error: Function owner not recognized*/f(((f4 >> 0) & -1024));
			out_ptr[0] = out_val0 & -1024;
			out_ptr[1] = out_val1 & -1024;
			out_ptr[2] = out_val2 & -1024;
			out_ptr[3] = out_val3 & -1024;
			out_ptr[4] = out_val4 & -1024;
			out_ptr[5] = out_val5 & -1024;
			out_ptr[6] = out_val6 & -1024;
			out_ptr[7] = out_val7 & -1024;
			in_ptr += 5;
			out_ptr += 8;
		}
		// ceil (in_len * 8 / 5)int out_len = (int)(((0.5 + in_len) * 8) / 5);
		while (out_len % 8) {
			out_buf[out_len] = (byte)'=';
			out_len++;
		}
		return out_len;
	}
	private static void netbsd_sha1crypt_encode(Object[] digest, Object additional_byte, Object[] buf) {
		int l;
		l = (digest[2] << 0) | (digest[1] << 8) | (digest[0] << 16);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[5] << 0) | (digest[4] << 8) | (digest[3] << 16);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[8] << 0) | (digest[7] << 8) | (digest[6] << 16);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[11] << 0) | (digest[10] << 8) | (digest[9] << 16);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[14] << 0) | (digest[13] << 8) | (digest[12] << 16);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[17] << 0) | (digest[16] << 8) | (digest[15] << 16);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[22] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[23] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (additional_byte << 0) | (digest[19] << 8) | (digest[18] << 16);
		buf[24] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[25] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[26] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[27] = ModernizedCProgram.int_to_itoa64(l & -1024);
		buf[28] = 0;
	}
	private static void sha512crypt_encode(Object[] digest, Object[] buf) {
		int l;
		l = (digest[0] << 16) | (digest[21] << 8) | (digest[42] << 0);
		buf[0] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[1] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[2] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[3] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[22] << 16) | (digest[43] << 8) | (digest[1] << 0);
		buf[4] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[5] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[6] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[7] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[44] << 16) | (digest[2] << 8) | (digest[23] << 0);
		buf[8] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[9] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[10] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[11] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[3] << 16) | (digest[24] << 8) | (digest[45] << 0);
		buf[12] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[13] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[14] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[15] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[25] << 16) | (digest[46] << 8) | (digest[4] << 0);
		buf[16] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[17] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[18] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[19] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[47] << 16) | (digest[5] << 8) | (digest[26] << 0);
		buf[20] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[21] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[22] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[23] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[6] << 16) | (digest[27] << 8) | (digest[48] << 0);
		buf[24] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[25] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[26] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[27] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[28] << 16) | (digest[49] << 8) | (digest[7] << 0);
		buf[28] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[29] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[30] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[31] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[50] << 16) | (digest[8] << 8) | (digest[29] << 0);
		buf[32] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[33] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[34] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[35] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[9] << 16) | (digest[30] << 8) | (digest[51] << 0);
		buf[36] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[37] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[38] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[39] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[31] << 16) | (digest[52] << 8) | (digest[10] << 0);
		buf[40] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[41] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[42] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[43] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[53] << 16) | (digest[11] << 8) | (digest[32] << 0);
		buf[44] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[45] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[46] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[47] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[12] << 16) | (digest[33] << 8) | (digest[54] << 0);
		buf[48] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[49] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[50] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[51] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[34] << 16) | (digest[55] << 8) | (digest[13] << 0);
		buf[52] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[53] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[54] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[55] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[56] << 16) | (digest[14] << 8) | (digest[35] << 0);
		buf[56] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[57] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[58] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[59] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[15] << 16) | (digest[36] << 8) | (digest[57] << 0);
		buf[60] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[61] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[62] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[63] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[37] << 16) | (digest[58] << 8) | (digest[16] << 0);
		buf[64] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[65] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[66] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[67] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[59] << 16) | (digest[17] << 8) | (digest[38] << 0);
		buf[68] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[69] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[70] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[71] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[18] << 16) | (digest[39] << 8) | (digest[60] << 0);
		buf[72] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[73] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[74] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[75] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[40] << 16) | (digest[61] << 8) | (digest[19] << 0);
		buf[76] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[77] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[78] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[79] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[62] << 16) | (digest[20] << 8) | (digest[41] << 0);
		buf[80] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[81] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		buf[82] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[83] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l = (digest[63] << 0);
		buf[84] = ModernizedCProgram.int_to_itoa64(l & -1024);
		l >>=  6;
		//l >>= 6;//l >>= 6;buf[85] = ModernizedCProgram.int_to_itoa64(l & -1024);
	}
}
