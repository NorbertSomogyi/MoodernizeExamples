package application;

public class salt {
	private Object salt_buf;
	private Object salt_buf_pc;
	private Object salt_len;
	private Object salt_len_pc;
	private Object salt_iter;
	private Object salt_iter2;
	private Object salt_sign;
	private Object digests_cnt;
	private Object digests_done;
	private Object digests_offset;
	private Object scrypt_N;
	private Object scrypt_r;
	private Object scrypt_p;
	
	public salt(Object salt_buf, Object salt_buf_pc, Object salt_len, Object salt_len_pc, Object salt_iter, Object salt_iter2, Object salt_sign, Object digests_cnt, Object digests_done, Object digests_offset, Object scrypt_N, Object scrypt_r, Object scrypt_p) {
		setSalt_buf(salt_buf);
		setSalt_buf_pc(salt_buf_pc);
		setSalt_len(salt_len);
		setSalt_len_pc(salt_len_pc);
		setSalt_iter(salt_iter);
		setSalt_iter2(salt_iter2);
		setSalt_sign(salt_sign);
		setDigests_cnt(digests_cnt);
		setDigests_done(digests_done);
		setDigests_offset(digests_offset);
		setScrypt_N(scrypt_N);
		setScrypt_r(scrypt_r);
		setScrypt_p(scrypt_p);
	}
	public salt() {
	}
	
	public salt module_benchmark_salt(Object hashconfig, Object user_options, Object user_options_extra) {
		salt_t salt = (salt_t)ModernizedCProgram.hcmalloc(/*Error: Unsupported expression*/);
		salt.setSalt_iter(1);
		salt.setSalt_len(16);
		return salt;
		salt_t salt = (salt_t)ModernizedCProgram.hcmalloc(/*Error: Unsupported expression*/);
		salt.setSalt_iter(10000000 - 1);
		salt.setSalt_iter2(10000 - 1);
		salt.setSalt_len(16);
		return salt;
		salt_t salt = (salt_t)ModernizedCProgram.hcmalloc(/*Error: Unsupported expression*/);
		// this equal to jtr -testint ROUNDS_LUKS = 163044;
		salt.setSalt_iter(ROUNDS_LUKS);
		return salt;
	}
	public Object getSalt_buf() {
		return salt_buf;
	}
	public void setSalt_buf(Object newSalt_buf) {
		salt_buf = newSalt_buf;
	}
	public Object getSalt_buf_pc() {
		return salt_buf_pc;
	}
	public void setSalt_buf_pc(Object newSalt_buf_pc) {
		salt_buf_pc = newSalt_buf_pc;
	}
	public Object getSalt_len() {
		return salt_len;
	}
	public void setSalt_len(Object newSalt_len) {
		salt_len = newSalt_len;
	}
	public Object getSalt_len_pc() {
		return salt_len_pc;
	}
	public void setSalt_len_pc(Object newSalt_len_pc) {
		salt_len_pc = newSalt_len_pc;
	}
	public Object getSalt_iter() {
		return salt_iter;
	}
	public void setSalt_iter(Object newSalt_iter) {
		salt_iter = newSalt_iter;
	}
	public Object getSalt_iter2() {
		return salt_iter2;
	}
	public void setSalt_iter2(Object newSalt_iter2) {
		salt_iter2 = newSalt_iter2;
	}
	public Object getSalt_sign() {
		return salt_sign;
	}
	public void setSalt_sign(Object newSalt_sign) {
		salt_sign = newSalt_sign;
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
	public Object getDigests_offset() {
		return digests_offset;
	}
	public void setDigests_offset(Object newDigests_offset) {
		digests_offset = newDigests_offset;
	}
	public Object getScrypt_N() {
		return scrypt_N;
	}
	public void setScrypt_N(Object newScrypt_N) {
		scrypt_N = newScrypt_N;
	}
	public Object getScrypt_r() {
		return scrypt_r;
	}
	public void setScrypt_r(Object newScrypt_r) {
		scrypt_r = newScrypt_r;
	}
	public Object getScrypt_p() {
		return scrypt_p;
	}
	public void setScrypt_p(Object newScrypt_p) {
		scrypt_p = newScrypt_p;
	}
}
