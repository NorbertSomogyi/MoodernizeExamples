package application;

public class hash {
	private Object digest;
	private salt salt;
	private Object esalt;
	private Object hook_salt;
	private int cracked;
	private hashinfo hash_info;
	private Byte pw_buf;
	private int pw_len;
	
	public hash(Object digest, salt salt, Object esalt, Object hook_salt, int cracked, hashinfo hash_info, Byte pw_buf, int pw_len) {
		setDigest(digest);
		setSalt(salt);
		setEsalt(esalt);
		setHook_salt(hook_salt);
		setCracked(cracked);
		setHash_info(hash_info);
		setPw_buf(pw_buf);
		setPw_len(pw_len);
	}
	public hash() {
	}
	
	public int module_hash_init_selftest(Object hashconfig) {
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc();
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, );
		wpa_eapol_t wpa_eapol = (wpa_eapol_t)generatedEsalt;
		wpa_eapol.setDetected_le(1);
		wpa_eapol.setDetected_be(0);
		wpa_eapol.setNonce_error_corrections(3);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		wpa_eapol_t wpa_eapol = (wpa_eapol_t)generatedEsalt;
		wpa_eapol.setDetected_le(1);
		wpa_eapol.setDetected_be(0);
		wpa_eapol.setNonce_error_corrections(3);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
		size_t st_hash_len = .strlen(hashconfig.getSt_hash());
		byte tmpdata = (byte)ModernizedCProgram.hcmalloc(st_hash_len / 2);
		for (size_t i = 0;
		size_t j = 0;
		 j < st_hash_len; ) {
			u8 c = ModernizedCProgram.hex_to_u8((u8)hashconfig.getSt_hash() + j);
			tmpdata[i] = c;
		}
		Object generatedDigest = this.getDigest();
		salt generatedSalt = this.getSalt();
		Object generatedEsalt = this.getEsalt();
		Object generatedHook_salt = this.getHook_salt();
		hashinfo generatedHash_info = this.getHash_info();
		int parser_status = ModernizedCProgram.module_hash_decode(hashconfig, generatedDigest, generatedSalt, generatedEsalt, generatedHook_salt, generatedHash_info, tmpdata, st_hash_len / 2);
		ModernizedCProgram.hcfree(tmpdata);
		return parser_status;
	}
	public Object getDigest() {
		return digest;
	}
	public void setDigest(Object newDigest) {
		digest = newDigest;
	}
	public salt getSalt() {
		return salt;
	}
	public void setSalt(salt newSalt) {
		salt = newSalt;
	}
	public Object getEsalt() {
		return esalt;
	}
	public void setEsalt(Object newEsalt) {
		esalt = newEsalt;
	}
	public Object getHook_salt() {
		return hook_salt;
	}
	public void setHook_salt(Object newHook_salt) {
		hook_salt = newHook_salt;
	}
	public int getCracked() {
		return cracked;
	}
	public void setCracked(int newCracked) {
		cracked = newCracked;
	}
	public hashinfo getHash_info() {
		return hash_info;
	}
	public void setHash_info(hashinfo newHash_info) {
		hash_info = newHash_info;
	}
	public Byte getPw_buf() {
		return pw_buf;
	}
	public void setPw_buf(Byte newPw_buf) {
		pw_buf = newPw_buf;
	}
	public int getPw_len() {
		return pw_len;
	}
	public void setPw_len(int newPw_len) {
		pw_len = newPw_len;
	}
}
