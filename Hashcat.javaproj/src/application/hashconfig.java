package application;

public class hashconfig {
	private byte separator;
	private int hash_mode;
	private Object salt_type;
	private Object attack_exec;
	private Object kern_type;
	private Object dgst_size;
	private Object opti_type;
	private Object opts_type;
	private Object dgst_pos0;
	private Object dgst_pos1;
	private Object dgst_pos2;
	private Object dgst_pos3;
	private boolean is_salted;
	private boolean has_pure_kernel;
	private boolean has_optimized_kernel;
	private Object esalt_size;
	private Object hook_salt_size;
	private Object tmp_size;
	private Object extra_tmp_size;
	private Object hook_size;
	private Object pw_min;
	private Object pw_max;
	private Object salt_min;
	private Object salt_max;
	private Object hashes_count_min;
	private Object hashes_count_max;
	private Object st_hash;
	private Object st_pass;
	private Object hash_category;
	private Object hash_name;
	private Object benchmark_mask;
	private Object kernel_accel_min;
	private Object kernel_accel_max;
	private Object kernel_loops_min;
	private Object kernel_loops_max;
	private Object kernel_threads_min;
	private Object kernel_threads_max;
	private Object forced_outfile_format;
	private boolean dictstat_disable;
	private boolean hlfmt_disable;
	private boolean warmup_disable;
	private boolean outfile_check_disable;
	private boolean outfile_check_nocomp;
	private boolean potfile_disable;
	private boolean potfile_keep_all_hashes;
	private boolean forced_jit_compile;
	private Object pwdump_column;
	
	public hashconfig(byte separator, int hash_mode, Object salt_type, Object attack_exec, Object kern_type, Object dgst_size, Object opti_type, Object opts_type, Object dgst_pos0, Object dgst_pos1, Object dgst_pos2, Object dgst_pos3, boolean is_salted, boolean has_pure_kernel, boolean has_optimized_kernel, Object esalt_size, Object hook_salt_size, Object tmp_size, Object extra_tmp_size, Object hook_size, Object pw_min, Object pw_max, Object salt_min, Object salt_max, Object hashes_count_min, Object hashes_count_max, Object st_hash, Object st_pass, Object hash_category, Object hash_name, Object benchmark_mask, Object kernel_accel_min, Object kernel_accel_max, Object kernel_loops_min, Object kernel_loops_max, Object kernel_threads_min, Object kernel_threads_max, Object forced_outfile_format, boolean dictstat_disable, boolean hlfmt_disable, boolean warmup_disable, boolean outfile_check_disable, boolean outfile_check_nocomp, boolean potfile_disable, boolean potfile_keep_all_hashes, boolean forced_jit_compile, Object pwdump_column) {
		setSeparator(separator);
		setHash_mode(hash_mode);
		setSalt_type(salt_type);
		setAttack_exec(attack_exec);
		setKern_type(kern_type);
		setDgst_size(dgst_size);
		setOpti_type(opti_type);
		setOpts_type(opts_type);
		setDgst_pos0(dgst_pos0);
		setDgst_pos1(dgst_pos1);
		setDgst_pos2(dgst_pos2);
		setDgst_pos3(dgst_pos3);
		setIs_salted(is_salted);
		setHas_pure_kernel(has_pure_kernel);
		setHas_optimized_kernel(has_optimized_kernel);
		setEsalt_size(esalt_size);
		setHook_salt_size(hook_salt_size);
		setTmp_size(tmp_size);
		setExtra_tmp_size(extra_tmp_size);
		setHook_size(hook_size);
		setPw_min(pw_min);
		setPw_max(pw_max);
		setSalt_min(salt_min);
		setSalt_max(salt_max);
		setHashes_count_min(hashes_count_min);
		setHashes_count_max(hashes_count_max);
		setSt_hash(st_hash);
		setSt_pass(st_pass);
		setHash_category(hash_category);
		setHash_name(hash_name);
		setBenchmark_mask(benchmark_mask);
		setKernel_accel_min(kernel_accel_min);
		setKernel_accel_max(kernel_accel_max);
		setKernel_loops_min(kernel_loops_min);
		setKernel_loops_max(kernel_loops_max);
		setKernel_threads_min(kernel_threads_min);
		setKernel_threads_max(kernel_threads_max);
		setForced_outfile_format(forced_outfile_format);
		setDictstat_disable(dictstat_disable);
		setHlfmt_disable(hlfmt_disable);
		setWarmup_disable(warmup_disable);
		setOutfile_check_disable(outfile_check_disable);
		setOutfile_check_nocomp(outfile_check_nocomp);
		setPotfile_disable(potfile_disable);
		setPotfile_keep_all_hashes(potfile_keep_all_hashes);
		setForced_jit_compile(forced_jit_compile);
		setPwdump_column(pwdump_column);
	}
	public hashconfig() {
	}
	
	public byte getSeparator() {
		return separator;
	}
	public void setSeparator(byte newSeparator) {
		separator = newSeparator;
	}
	public int getHash_mode() {
		return hash_mode;
	}
	public void setHash_mode(int newHash_mode) {
		hash_mode = newHash_mode;
	}
	public Object getSalt_type() {
		return salt_type;
	}
	public void setSalt_type(Object newSalt_type) {
		salt_type = newSalt_type;
	}
	public Object getAttack_exec() {
		return attack_exec;
	}
	public void setAttack_exec(Object newAttack_exec) {
		attack_exec = newAttack_exec;
	}
	public Object getKern_type() {
		return kern_type;
	}
	public void setKern_type(Object newKern_type) {
		kern_type = newKern_type;
	}
	public Object getDgst_size() {
		return dgst_size;
	}
	public void setDgst_size(Object newDgst_size) {
		dgst_size = newDgst_size;
	}
	public Object getOpti_type() {
		return opti_type;
	}
	public void setOpti_type(Object newOpti_type) {
		opti_type = newOpti_type;
	}
	public Object getOpts_type() {
		return opts_type;
	}
	public void setOpts_type(Object newOpts_type) {
		opts_type = newOpts_type;
	}
	public Object getDgst_pos0() {
		return dgst_pos0;
	}
	public void setDgst_pos0(Object newDgst_pos0) {
		dgst_pos0 = newDgst_pos0;
	}
	public Object getDgst_pos1() {
		return dgst_pos1;
	}
	public void setDgst_pos1(Object newDgst_pos1) {
		dgst_pos1 = newDgst_pos1;
	}
	public Object getDgst_pos2() {
		return dgst_pos2;
	}
	public void setDgst_pos2(Object newDgst_pos2) {
		dgst_pos2 = newDgst_pos2;
	}
	public Object getDgst_pos3() {
		return dgst_pos3;
	}
	public void setDgst_pos3(Object newDgst_pos3) {
		dgst_pos3 = newDgst_pos3;
	}
	public boolean getIs_salted() {
		return is_salted;
	}
	public void setIs_salted(boolean newIs_salted) {
		is_salted = newIs_salted;
	}
	public boolean getHas_pure_kernel() {
		return has_pure_kernel;
	}
	public void setHas_pure_kernel(boolean newHas_pure_kernel) {
		has_pure_kernel = newHas_pure_kernel;
	}
	public boolean getHas_optimized_kernel() {
		return has_optimized_kernel;
	}
	public void setHas_optimized_kernel(boolean newHas_optimized_kernel) {
		has_optimized_kernel = newHas_optimized_kernel;
	}
	public Object getEsalt_size() {
		return esalt_size;
	}
	public void setEsalt_size(Object newEsalt_size) {
		esalt_size = newEsalt_size;
	}
	public Object getHook_salt_size() {
		return hook_salt_size;
	}
	public void setHook_salt_size(Object newHook_salt_size) {
		hook_salt_size = newHook_salt_size;
	}
	public Object getTmp_size() {
		return tmp_size;
	}
	public void setTmp_size(Object newTmp_size) {
		tmp_size = newTmp_size;
	}
	public Object getExtra_tmp_size() {
		return extra_tmp_size;
	}
	public void setExtra_tmp_size(Object newExtra_tmp_size) {
		extra_tmp_size = newExtra_tmp_size;
	}
	public Object getHook_size() {
		return hook_size;
	}
	public void setHook_size(Object newHook_size) {
		hook_size = newHook_size;
	}
	public Object getPw_min() {
		return pw_min;
	}
	public void setPw_min(Object newPw_min) {
		pw_min = newPw_min;
	}
	public Object getPw_max() {
		return pw_max;
	}
	public void setPw_max(Object newPw_max) {
		pw_max = newPw_max;
	}
	public Object getSalt_min() {
		return salt_min;
	}
	public void setSalt_min(Object newSalt_min) {
		salt_min = newSalt_min;
	}
	public Object getSalt_max() {
		return salt_max;
	}
	public void setSalt_max(Object newSalt_max) {
		salt_max = newSalt_max;
	}
	public Object getHashes_count_min() {
		return hashes_count_min;
	}
	public void setHashes_count_min(Object newHashes_count_min) {
		hashes_count_min = newHashes_count_min;
	}
	public Object getHashes_count_max() {
		return hashes_count_max;
	}
	public void setHashes_count_max(Object newHashes_count_max) {
		hashes_count_max = newHashes_count_max;
	}
	public Object getSt_hash() {
		return st_hash;
	}
	public void setSt_hash(Object newSt_hash) {
		st_hash = newSt_hash;
	}
	public Object getSt_pass() {
		return st_pass;
	}
	public void setSt_pass(Object newSt_pass) {
		st_pass = newSt_pass;
	}
	public Object getHash_category() {
		return hash_category;
	}
	public void setHash_category(Object newHash_category) {
		hash_category = newHash_category;
	}
	public Object getHash_name() {
		return hash_name;
	}
	public void setHash_name(Object newHash_name) {
		hash_name = newHash_name;
	}
	public Object getBenchmark_mask() {
		return benchmark_mask;
	}
	public void setBenchmark_mask(Object newBenchmark_mask) {
		benchmark_mask = newBenchmark_mask;
	}
	public Object getKernel_accel_min() {
		return kernel_accel_min;
	}
	public void setKernel_accel_min(Object newKernel_accel_min) {
		kernel_accel_min = newKernel_accel_min;
	}
	public Object getKernel_accel_max() {
		return kernel_accel_max;
	}
	public void setKernel_accel_max(Object newKernel_accel_max) {
		kernel_accel_max = newKernel_accel_max;
	}
	public Object getKernel_loops_min() {
		return kernel_loops_min;
	}
	public void setKernel_loops_min(Object newKernel_loops_min) {
		kernel_loops_min = newKernel_loops_min;
	}
	public Object getKernel_loops_max() {
		return kernel_loops_max;
	}
	public void setKernel_loops_max(Object newKernel_loops_max) {
		kernel_loops_max = newKernel_loops_max;
	}
	public Object getKernel_threads_min() {
		return kernel_threads_min;
	}
	public void setKernel_threads_min(Object newKernel_threads_min) {
		kernel_threads_min = newKernel_threads_min;
	}
	public Object getKernel_threads_max() {
		return kernel_threads_max;
	}
	public void setKernel_threads_max(Object newKernel_threads_max) {
		kernel_threads_max = newKernel_threads_max;
	}
	public Object getForced_outfile_format() {
		return forced_outfile_format;
	}
	public void setForced_outfile_format(Object newForced_outfile_format) {
		forced_outfile_format = newForced_outfile_format;
	}
	public boolean getDictstat_disable() {
		return dictstat_disable;
	}
	public void setDictstat_disable(boolean newDictstat_disable) {
		dictstat_disable = newDictstat_disable;
	}
	public boolean getHlfmt_disable() {
		return hlfmt_disable;
	}
	public void setHlfmt_disable(boolean newHlfmt_disable) {
		hlfmt_disable = newHlfmt_disable;
	}
	public boolean getWarmup_disable() {
		return warmup_disable;
	}
	public void setWarmup_disable(boolean newWarmup_disable) {
		warmup_disable = newWarmup_disable;
	}
	public boolean getOutfile_check_disable() {
		return outfile_check_disable;
	}
	public void setOutfile_check_disable(boolean newOutfile_check_disable) {
		outfile_check_disable = newOutfile_check_disable;
	}
	public boolean getOutfile_check_nocomp() {
		return outfile_check_nocomp;
	}
	public void setOutfile_check_nocomp(boolean newOutfile_check_nocomp) {
		outfile_check_nocomp = newOutfile_check_nocomp;
	}
	public boolean getPotfile_disable() {
		return potfile_disable;
	}
	public void setPotfile_disable(boolean newPotfile_disable) {
		potfile_disable = newPotfile_disable;
	}
	public boolean getPotfile_keep_all_hashes() {
		return potfile_keep_all_hashes;
	}
	public void setPotfile_keep_all_hashes(boolean newPotfile_keep_all_hashes) {
		potfile_keep_all_hashes = newPotfile_keep_all_hashes;
	}
	public boolean getForced_jit_compile() {
		return forced_jit_compile;
	}
	public void setForced_jit_compile(boolean newForced_jit_compile) {
		forced_jit_compile = newForced_jit_compile;
	}
	public Object getPwdump_column() {
		return pwdump_column;
	}
	public void setPwdump_column(Object newPwdump_column) {
		pwdump_column = newPwdump_column;
	}
}
