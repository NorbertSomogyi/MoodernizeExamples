package application;

public class user_options {
	private Object hc_bin;
	private int hc_argc;
	private Byte hc_argv;
	private boolean attack_mode_chgd;
	private boolean hash_mode_chgd;
	private boolean hccapx_message_pair_chgd;
	private boolean increment_max_chgd;
	private boolean increment_min_chgd;
	private boolean kernel_accel_chgd;
	private boolean kernel_loops_chgd;
	private boolean kernel_threads_chgd;
	private boolean nonce_error_corrections_chgd;
	private boolean spin_damp_chgd;
	private boolean backend_vector_width_chgd;
	private boolean outfile_format_chgd;
	private boolean remove_timer_chgd;
	private boolean rp_gen_seed_chgd;
	private boolean runtime_chgd;
	private boolean segment_size_chgd;
	private boolean workload_profile_chgd;
	private boolean skip_chgd;
	private boolean limit_chgd;
	private boolean advice_disable;
	private boolean benchmark;
	private boolean benchmark_all;
	private boolean example_hashes;
	private boolean force;
	private boolean hwmon_disable;
	private boolean hex_charset;
	private boolean hex_salt;
	private boolean hex_wordlist;
	private boolean increment;
	private boolean keep_guessing;
	private boolean keyspace;
	private boolean left;
	private boolean logfile_disable;
	private boolean loopback;
	private boolean machine_readable;
	private boolean markov_classic;
	private boolean markov_disable;
	private boolean backend_info;
	private boolean optimized_kernel_enable;
	private boolean outfile_autohex;
	private boolean potfile_disable;
	private boolean progress_only;
	private boolean quiet;
	private boolean remove;
	private boolean restore;
	private boolean restore_disable;
	private boolean self_test_disable;
	private boolean show;
	private boolean slow_candidates;
	private boolean speed_only;
	private boolean status;
	private boolean status_json;
	private boolean stdout_flag;
	private boolean stdin_timeout_abort_chgd;
	private boolean usage;
	private boolean username;
	private boolean version;
	private boolean wordlist_autohex_disable;
	private Byte cpu_affinity;
	private Byte custom_charset_4;
	private Byte debug_file;
	private Byte induction_dir;
	private Byte keyboard_layout_mapping;
	private Byte markov_hcstat2;
	private Byte backend_devices;
	private Byte opencl_device_types;
	private Byte outfile;
	private Byte outfile_check_dir;
	private Byte potfile_path;
	private Byte restore_file_path;
	private Byte rp_files;
	private byte separator;
	private Byte truecrypt_keyfiles;
	private Byte veracrypt_keyfiles;
	private Object custom_charset_1;
	private Object custom_charset_2;
	private Object custom_charset_3;
	private Object encoding_from;
	private Object encoding_to;
	private Object rule_buf_l;
	private Object rule_buf_r;
	private Object session;
	private Object attack_mode;
	private Object bitmap_max;
	private Object bitmap_min;
	private Object debug_mode;
	private Object hwmon_temp_abort;
	private int hash_mode;
	private Object hccapx_message_pair;
	private Object increment_max;
	private Object increment_min;
	private Object kernel_accel;
	private Object kernel_loops;
	private Object kernel_threads;
	private Object markov_threshold;
	private Object nonce_error_corrections;
	private Object spin_damp;
	private Object backend_vector_width;
	private Object outfile_check_timer;
	private Object outfile_format;
	private Object remove_timer;
	private Object restore_timer;
	private Object rp_files_cnt;
	private Object rp_gen;
	private Object rp_gen_func_max;
	private Object rp_gen_func_min;
	private Object rp_gen_seed;
	private Object runtime;
	private Object scrypt_tmto;
	private Object segment_size;
	private Object status_timer;
	private Object stdin_timeout_abort;
	private Object veracrypt_pim_start;
	private Object veracrypt_pim_stop;
	private Object workload_profile;
	private Object limit;
	private Object skip;
	
	public user_options(Object hc_bin, int hc_argc, Byte hc_argv, boolean attack_mode_chgd, boolean hash_mode_chgd, boolean hccapx_message_pair_chgd, boolean increment_max_chgd, boolean increment_min_chgd, boolean kernel_accel_chgd, boolean kernel_loops_chgd, boolean kernel_threads_chgd, boolean nonce_error_corrections_chgd, boolean spin_damp_chgd, boolean backend_vector_width_chgd, boolean outfile_format_chgd, boolean remove_timer_chgd, boolean rp_gen_seed_chgd, boolean runtime_chgd, boolean segment_size_chgd, boolean workload_profile_chgd, boolean skip_chgd, boolean limit_chgd, boolean advice_disable, boolean benchmark, boolean benchmark_all, boolean example_hashes, boolean force, boolean hwmon_disable, boolean hex_charset, boolean hex_salt, boolean hex_wordlist, boolean increment, boolean keep_guessing, boolean keyspace, boolean left, boolean logfile_disable, boolean loopback, boolean machine_readable, boolean markov_classic, boolean markov_disable, boolean backend_info, boolean optimized_kernel_enable, boolean outfile_autohex, boolean potfile_disable, boolean progress_only, boolean quiet, boolean remove, boolean restore, boolean restore_disable, boolean self_test_disable, boolean show, boolean slow_candidates, boolean speed_only, boolean status, boolean status_json, boolean stdout_flag, boolean stdin_timeout_abort_chgd, boolean usage, boolean username, boolean version, boolean wordlist_autohex_disable, Byte cpu_affinity, Byte custom_charset_4, Byte debug_file, Byte induction_dir, Byte keyboard_layout_mapping, Byte markov_hcstat2, Byte backend_devices, Byte opencl_device_types, Byte outfile, Byte outfile_check_dir, Byte potfile_path, Byte restore_file_path, Byte rp_files, byte separator, Byte truecrypt_keyfiles, Byte veracrypt_keyfiles, Object custom_charset_1, Object custom_charset_2, Object custom_charset_3, Object encoding_from, Object encoding_to, Object rule_buf_l, Object rule_buf_r, Object session, Object attack_mode, Object bitmap_max, Object bitmap_min, Object debug_mode, Object hwmon_temp_abort, int hash_mode, Object hccapx_message_pair, Object increment_max, Object increment_min, Object kernel_accel, Object kernel_loops, Object kernel_threads, Object markov_threshold, Object nonce_error_corrections, Object spin_damp, Object backend_vector_width, Object outfile_check_timer, Object outfile_format, Object remove_timer, Object restore_timer, Object rp_files_cnt, Object rp_gen, Object rp_gen_func_max, Object rp_gen_func_min, Object rp_gen_seed, Object runtime, Object scrypt_tmto, Object segment_size, Object status_timer, Object stdin_timeout_abort, Object veracrypt_pim_start, Object veracrypt_pim_stop, Object workload_profile, Object limit, Object skip) {
		setHc_bin(hc_bin);
		setHc_argc(hc_argc);
		setHc_argv(hc_argv);
		setAttack_mode_chgd(attack_mode_chgd);
		setHash_mode_chgd(hash_mode_chgd);
		setHccapx_message_pair_chgd(hccapx_message_pair_chgd);
		setIncrement_max_chgd(increment_max_chgd);
		setIncrement_min_chgd(increment_min_chgd);
		setKernel_accel_chgd(kernel_accel_chgd);
		setKernel_loops_chgd(kernel_loops_chgd);
		setKernel_threads_chgd(kernel_threads_chgd);
		setNonce_error_corrections_chgd(nonce_error_corrections_chgd);
		setSpin_damp_chgd(spin_damp_chgd);
		setBackend_vector_width_chgd(backend_vector_width_chgd);
		setOutfile_format_chgd(outfile_format_chgd);
		setRemove_timer_chgd(remove_timer_chgd);
		setRp_gen_seed_chgd(rp_gen_seed_chgd);
		setRuntime_chgd(runtime_chgd);
		setSegment_size_chgd(segment_size_chgd);
		setWorkload_profile_chgd(workload_profile_chgd);
		setSkip_chgd(skip_chgd);
		setLimit_chgd(limit_chgd);
		setAdvice_disable(advice_disable);
		setBenchmark(benchmark);
		setBenchmark_all(benchmark_all);
		setExample_hashes(example_hashes);
		setForce(force);
		setHwmon_disable(hwmon_disable);
		setHex_charset(hex_charset);
		setHex_salt(hex_salt);
		setHex_wordlist(hex_wordlist);
		setIncrement(increment);
		setKeep_guessing(keep_guessing);
		setKeyspace(keyspace);
		setLeft(left);
		setLogfile_disable(logfile_disable);
		setLoopback(loopback);
		setMachine_readable(machine_readable);
		setMarkov_classic(markov_classic);
		setMarkov_disable(markov_disable);
		setBackend_info(backend_info);
		setOptimized_kernel_enable(optimized_kernel_enable);
		setOutfile_autohex(outfile_autohex);
		setPotfile_disable(potfile_disable);
		setProgress_only(progress_only);
		setQuiet(quiet);
		setRemove(remove);
		setRestore(restore);
		setRestore_disable(restore_disable);
		setSelf_test_disable(self_test_disable);
		setShow(show);
		setSlow_candidates(slow_candidates);
		setSpeed_only(speed_only);
		setStatus(status);
		setStatus_json(status_json);
		setStdout_flag(stdout_flag);
		setStdin_timeout_abort_chgd(stdin_timeout_abort_chgd);
		setUsage(usage);
		setUsername(username);
		setVersion(version);
		setWordlist_autohex_disable(wordlist_autohex_disable);
		setCpu_affinity(cpu_affinity);
		setCustom_charset_4(custom_charset_4);
		setDebug_file(debug_file);
		setInduction_dir(induction_dir);
		setKeyboard_layout_mapping(keyboard_layout_mapping);
		setMarkov_hcstat2(markov_hcstat2);
		setBackend_devices(backend_devices);
		setOpencl_device_types(opencl_device_types);
		setOutfile(outfile);
		setOutfile_check_dir(outfile_check_dir);
		setPotfile_path(potfile_path);
		setRestore_file_path(restore_file_path);
		setRp_files(rp_files);
		setSeparator(separator);
		setTruecrypt_keyfiles(truecrypt_keyfiles);
		setVeracrypt_keyfiles(veracrypt_keyfiles);
		setCustom_charset_1(custom_charset_1);
		setCustom_charset_2(custom_charset_2);
		setCustom_charset_3(custom_charset_3);
		setEncoding_from(encoding_from);
		setEncoding_to(encoding_to);
		setRule_buf_l(rule_buf_l);
		setRule_buf_r(rule_buf_r);
		setSession(session);
		setAttack_mode(attack_mode);
		setBitmap_max(bitmap_max);
		setBitmap_min(bitmap_min);
		setDebug_mode(debug_mode);
		setHwmon_temp_abort(hwmon_temp_abort);
		setHash_mode(hash_mode);
		setHccapx_message_pair(hccapx_message_pair);
		setIncrement_max(increment_max);
		setIncrement_min(increment_min);
		setKernel_accel(kernel_accel);
		setKernel_loops(kernel_loops);
		setKernel_threads(kernel_threads);
		setMarkov_threshold(markov_threshold);
		setNonce_error_corrections(nonce_error_corrections);
		setSpin_damp(spin_damp);
		setBackend_vector_width(backend_vector_width);
		setOutfile_check_timer(outfile_check_timer);
		setOutfile_format(outfile_format);
		setRemove_timer(remove_timer);
		setRestore_timer(restore_timer);
		setRp_files_cnt(rp_files_cnt);
		setRp_gen(rp_gen);
		setRp_gen_func_max(rp_gen_func_max);
		setRp_gen_func_min(rp_gen_func_min);
		setRp_gen_seed(rp_gen_seed);
		setRuntime(runtime);
		setScrypt_tmto(scrypt_tmto);
		setSegment_size(segment_size);
		setStatus_timer(status_timer);
		setStdin_timeout_abort(stdin_timeout_abort);
		setVeracrypt_pim_start(veracrypt_pim_start);
		setVeracrypt_pim_stop(veracrypt_pim_stop);
		setWorkload_profile(workload_profile);
		setLimit(limit);
		setSkip(skip);
	}
	public user_options() {
	}
	
	public Object getHc_bin() {
		return hc_bin;
	}
	public void setHc_bin(Object newHc_bin) {
		hc_bin = newHc_bin;
	}
	public int getHc_argc() {
		return hc_argc;
	}
	public void setHc_argc(int newHc_argc) {
		hc_argc = newHc_argc;
	}
	public Byte getHc_argv() {
		return hc_argv;
	}
	public void setHc_argv(Byte newHc_argv) {
		hc_argv = newHc_argv;
	}
	public boolean getAttack_mode_chgd() {
		return attack_mode_chgd;
	}
	public void setAttack_mode_chgd(boolean newAttack_mode_chgd) {
		attack_mode_chgd = newAttack_mode_chgd;
	}
	public boolean getHash_mode_chgd() {
		return hash_mode_chgd;
	}
	public void setHash_mode_chgd(boolean newHash_mode_chgd) {
		hash_mode_chgd = newHash_mode_chgd;
	}
	public boolean getHccapx_message_pair_chgd() {
		return hccapx_message_pair_chgd;
	}
	public void setHccapx_message_pair_chgd(boolean newHccapx_message_pair_chgd) {
		hccapx_message_pair_chgd = newHccapx_message_pair_chgd;
	}
	public boolean getIncrement_max_chgd() {
		return increment_max_chgd;
	}
	public void setIncrement_max_chgd(boolean newIncrement_max_chgd) {
		increment_max_chgd = newIncrement_max_chgd;
	}
	public boolean getIncrement_min_chgd() {
		return increment_min_chgd;
	}
	public void setIncrement_min_chgd(boolean newIncrement_min_chgd) {
		increment_min_chgd = newIncrement_min_chgd;
	}
	public boolean getKernel_accel_chgd() {
		return kernel_accel_chgd;
	}
	public void setKernel_accel_chgd(boolean newKernel_accel_chgd) {
		kernel_accel_chgd = newKernel_accel_chgd;
	}
	public boolean getKernel_loops_chgd() {
		return kernel_loops_chgd;
	}
	public void setKernel_loops_chgd(boolean newKernel_loops_chgd) {
		kernel_loops_chgd = newKernel_loops_chgd;
	}
	public boolean getKernel_threads_chgd() {
		return kernel_threads_chgd;
	}
	public void setKernel_threads_chgd(boolean newKernel_threads_chgd) {
		kernel_threads_chgd = newKernel_threads_chgd;
	}
	public boolean getNonce_error_corrections_chgd() {
		return nonce_error_corrections_chgd;
	}
	public void setNonce_error_corrections_chgd(boolean newNonce_error_corrections_chgd) {
		nonce_error_corrections_chgd = newNonce_error_corrections_chgd;
	}
	public boolean getSpin_damp_chgd() {
		return spin_damp_chgd;
	}
	public void setSpin_damp_chgd(boolean newSpin_damp_chgd) {
		spin_damp_chgd = newSpin_damp_chgd;
	}
	public boolean getBackend_vector_width_chgd() {
		return backend_vector_width_chgd;
	}
	public void setBackend_vector_width_chgd(boolean newBackend_vector_width_chgd) {
		backend_vector_width_chgd = newBackend_vector_width_chgd;
	}
	public boolean getOutfile_format_chgd() {
		return outfile_format_chgd;
	}
	public void setOutfile_format_chgd(boolean newOutfile_format_chgd) {
		outfile_format_chgd = newOutfile_format_chgd;
	}
	public boolean getRemove_timer_chgd() {
		return remove_timer_chgd;
	}
	public void setRemove_timer_chgd(boolean newRemove_timer_chgd) {
		remove_timer_chgd = newRemove_timer_chgd;
	}
	public boolean getRp_gen_seed_chgd() {
		return rp_gen_seed_chgd;
	}
	public void setRp_gen_seed_chgd(boolean newRp_gen_seed_chgd) {
		rp_gen_seed_chgd = newRp_gen_seed_chgd;
	}
	public boolean getRuntime_chgd() {
		return runtime_chgd;
	}
	public void setRuntime_chgd(boolean newRuntime_chgd) {
		runtime_chgd = newRuntime_chgd;
	}
	public boolean getSegment_size_chgd() {
		return segment_size_chgd;
	}
	public void setSegment_size_chgd(boolean newSegment_size_chgd) {
		segment_size_chgd = newSegment_size_chgd;
	}
	public boolean getWorkload_profile_chgd() {
		return workload_profile_chgd;
	}
	public void setWorkload_profile_chgd(boolean newWorkload_profile_chgd) {
		workload_profile_chgd = newWorkload_profile_chgd;
	}
	public boolean getSkip_chgd() {
		return skip_chgd;
	}
	public void setSkip_chgd(boolean newSkip_chgd) {
		skip_chgd = newSkip_chgd;
	}
	public boolean getLimit_chgd() {
		return limit_chgd;
	}
	public void setLimit_chgd(boolean newLimit_chgd) {
		limit_chgd = newLimit_chgd;
	}
	public boolean getAdvice_disable() {
		return advice_disable;
	}
	public void setAdvice_disable(boolean newAdvice_disable) {
		advice_disable = newAdvice_disable;
	}
	public boolean getBenchmark() {
		return benchmark;
	}
	public void setBenchmark(boolean newBenchmark) {
		benchmark = newBenchmark;
	}
	public boolean getBenchmark_all() {
		return benchmark_all;
	}
	public void setBenchmark_all(boolean newBenchmark_all) {
		benchmark_all = newBenchmark_all;
	}
	public boolean getExample_hashes() {
		return example_hashes;
	}
	public void setExample_hashes(boolean newExample_hashes) {
		example_hashes = newExample_hashes;
	}
	public boolean getForce() {
		return force;
	}
	public void setForce(boolean newForce) {
		force = newForce;
	}
	public boolean getHwmon_disable() {
		return hwmon_disable;
	}
	public void setHwmon_disable(boolean newHwmon_disable) {
		hwmon_disable = newHwmon_disable;
	}
	public boolean getHex_charset() {
		return hex_charset;
	}
	public void setHex_charset(boolean newHex_charset) {
		hex_charset = newHex_charset;
	}
	public boolean getHex_salt() {
		return hex_salt;
	}
	public void setHex_salt(boolean newHex_salt) {
		hex_salt = newHex_salt;
	}
	public boolean getHex_wordlist() {
		return hex_wordlist;
	}
	public void setHex_wordlist(boolean newHex_wordlist) {
		hex_wordlist = newHex_wordlist;
	}
	public boolean getIncrement() {
		return increment;
	}
	public void setIncrement(boolean newIncrement) {
		increment = newIncrement;
	}
	public boolean getKeep_guessing() {
		return keep_guessing;
	}
	public void setKeep_guessing(boolean newKeep_guessing) {
		keep_guessing = newKeep_guessing;
	}
	public boolean getKeyspace() {
		return keyspace;
	}
	public void setKeyspace(boolean newKeyspace) {
		keyspace = newKeyspace;
	}
	public boolean getLeft() {
		return left;
	}
	public void setLeft(boolean newLeft) {
		left = newLeft;
	}
	public boolean getLogfile_disable() {
		return logfile_disable;
	}
	public void setLogfile_disable(boolean newLogfile_disable) {
		logfile_disable = newLogfile_disable;
	}
	public boolean getLoopback() {
		return loopback;
	}
	public void setLoopback(boolean newLoopback) {
		loopback = newLoopback;
	}
	public boolean getMachine_readable() {
		return machine_readable;
	}
	public void setMachine_readable(boolean newMachine_readable) {
		machine_readable = newMachine_readable;
	}
	public boolean getMarkov_classic() {
		return markov_classic;
	}
	public void setMarkov_classic(boolean newMarkov_classic) {
		markov_classic = newMarkov_classic;
	}
	public boolean getMarkov_disable() {
		return markov_disable;
	}
	public void setMarkov_disable(boolean newMarkov_disable) {
		markov_disable = newMarkov_disable;
	}
	public boolean getBackend_info() {
		return backend_info;
	}
	public void setBackend_info(boolean newBackend_info) {
		backend_info = newBackend_info;
	}
	public boolean getOptimized_kernel_enable() {
		return optimized_kernel_enable;
	}
	public void setOptimized_kernel_enable(boolean newOptimized_kernel_enable) {
		optimized_kernel_enable = newOptimized_kernel_enable;
	}
	public boolean getOutfile_autohex() {
		return outfile_autohex;
	}
	public void setOutfile_autohex(boolean newOutfile_autohex) {
		outfile_autohex = newOutfile_autohex;
	}
	public boolean getPotfile_disable() {
		return potfile_disable;
	}
	public void setPotfile_disable(boolean newPotfile_disable) {
		potfile_disable = newPotfile_disable;
	}
	public boolean getProgress_only() {
		return progress_only;
	}
	public void setProgress_only(boolean newProgress_only) {
		progress_only = newProgress_only;
	}
	public boolean getQuiet() {
		return quiet;
	}
	public void setQuiet(boolean newQuiet) {
		quiet = newQuiet;
	}
	public boolean getRemove() {
		return remove;
	}
	public void setRemove(boolean newRemove) {
		remove = newRemove;
	}
	public boolean getRestore() {
		return restore;
	}
	public void setRestore(boolean newRestore) {
		restore = newRestore;
	}
	public boolean getRestore_disable() {
		return restore_disable;
	}
	public void setRestore_disable(boolean newRestore_disable) {
		restore_disable = newRestore_disable;
	}
	public boolean getSelf_test_disable() {
		return self_test_disable;
	}
	public void setSelf_test_disable(boolean newSelf_test_disable) {
		self_test_disable = newSelf_test_disable;
	}
	public boolean getShow() {
		return show;
	}
	public void setShow(boolean newShow) {
		show = newShow;
	}
	public boolean getSlow_candidates() {
		return slow_candidates;
	}
	public void setSlow_candidates(boolean newSlow_candidates) {
		slow_candidates = newSlow_candidates;
	}
	public boolean getSpeed_only() {
		return speed_only;
	}
	public void setSpeed_only(boolean newSpeed_only) {
		speed_only = newSpeed_only;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean newStatus) {
		status = newStatus;
	}
	public boolean getStatus_json() {
		return status_json;
	}
	public void setStatus_json(boolean newStatus_json) {
		status_json = newStatus_json;
	}
	public boolean getStdout_flag() {
		return stdout_flag;
	}
	public void setStdout_flag(boolean newStdout_flag) {
		stdout_flag = newStdout_flag;
	}
	public boolean getStdin_timeout_abort_chgd() {
		return stdin_timeout_abort_chgd;
	}
	public void setStdin_timeout_abort_chgd(boolean newStdin_timeout_abort_chgd) {
		stdin_timeout_abort_chgd = newStdin_timeout_abort_chgd;
	}
	public boolean getUsage() {
		return usage;
	}
	public void setUsage(boolean newUsage) {
		usage = newUsage;
	}
	public boolean getUsername() {
		return username;
	}
	public void setUsername(boolean newUsername) {
		username = newUsername;
	}
	public boolean getVersion() {
		return version;
	}
	public void setVersion(boolean newVersion) {
		version = newVersion;
	}
	public boolean getWordlist_autohex_disable() {
		return wordlist_autohex_disable;
	}
	public void setWordlist_autohex_disable(boolean newWordlist_autohex_disable) {
		wordlist_autohex_disable = newWordlist_autohex_disable;
	}
	public Byte getCpu_affinity() {
		return cpu_affinity;
	}
	public void setCpu_affinity(Byte newCpu_affinity) {
		cpu_affinity = newCpu_affinity;
	}
	public Byte getCustom_charset_4() {
		return custom_charset_4;
	}
	public void setCustom_charset_4(Byte newCustom_charset_4) {
		custom_charset_4 = newCustom_charset_4;
	}
	public Byte getDebug_file() {
		return debug_file;
	}
	public void setDebug_file(Byte newDebug_file) {
		debug_file = newDebug_file;
	}
	public Byte getInduction_dir() {
		return induction_dir;
	}
	public void setInduction_dir(Byte newInduction_dir) {
		induction_dir = newInduction_dir;
	}
	public Byte getKeyboard_layout_mapping() {
		return keyboard_layout_mapping;
	}
	public void setKeyboard_layout_mapping(Byte newKeyboard_layout_mapping) {
		keyboard_layout_mapping = newKeyboard_layout_mapping;
	}
	public Byte getMarkov_hcstat2() {
		return markov_hcstat2;
	}
	public void setMarkov_hcstat2(Byte newMarkov_hcstat2) {
		markov_hcstat2 = newMarkov_hcstat2;
	}
	public Byte getBackend_devices() {
		return backend_devices;
	}
	public void setBackend_devices(Byte newBackend_devices) {
		backend_devices = newBackend_devices;
	}
	public Byte getOpencl_device_types() {
		return opencl_device_types;
	}
	public void setOpencl_device_types(Byte newOpencl_device_types) {
		opencl_device_types = newOpencl_device_types;
	}
	public Byte getOutfile() {
		return outfile;
	}
	public void setOutfile(Byte newOutfile) {
		outfile = newOutfile;
	}
	public Byte getOutfile_check_dir() {
		return outfile_check_dir;
	}
	public void setOutfile_check_dir(Byte newOutfile_check_dir) {
		outfile_check_dir = newOutfile_check_dir;
	}
	public Byte getPotfile_path() {
		return potfile_path;
	}
	public void setPotfile_path(Byte newPotfile_path) {
		potfile_path = newPotfile_path;
	}
	public Byte getRestore_file_path() {
		return restore_file_path;
	}
	public void setRestore_file_path(Byte newRestore_file_path) {
		restore_file_path = newRestore_file_path;
	}
	public Byte getRp_files() {
		return rp_files;
	}
	public void setRp_files(Byte newRp_files) {
		rp_files = newRp_files;
	}
	public byte getSeparator() {
		return separator;
	}
	public void setSeparator(byte newSeparator) {
		separator = newSeparator;
	}
	public Byte getTruecrypt_keyfiles() {
		return truecrypt_keyfiles;
	}
	public void setTruecrypt_keyfiles(Byte newTruecrypt_keyfiles) {
		truecrypt_keyfiles = newTruecrypt_keyfiles;
	}
	public Byte getVeracrypt_keyfiles() {
		return veracrypt_keyfiles;
	}
	public void setVeracrypt_keyfiles(Byte newVeracrypt_keyfiles) {
		veracrypt_keyfiles = newVeracrypt_keyfiles;
	}
	public Object getCustom_charset_1() {
		return custom_charset_1;
	}
	public void setCustom_charset_1(Object newCustom_charset_1) {
		custom_charset_1 = newCustom_charset_1;
	}
	public Object getCustom_charset_2() {
		return custom_charset_2;
	}
	public void setCustom_charset_2(Object newCustom_charset_2) {
		custom_charset_2 = newCustom_charset_2;
	}
	public Object getCustom_charset_3() {
		return custom_charset_3;
	}
	public void setCustom_charset_3(Object newCustom_charset_3) {
		custom_charset_3 = newCustom_charset_3;
	}
	public Object getEncoding_from() {
		return encoding_from;
	}
	public void setEncoding_from(Object newEncoding_from) {
		encoding_from = newEncoding_from;
	}
	public Object getEncoding_to() {
		return encoding_to;
	}
	public void setEncoding_to(Object newEncoding_to) {
		encoding_to = newEncoding_to;
	}
	public Object getRule_buf_l() {
		return rule_buf_l;
	}
	public void setRule_buf_l(Object newRule_buf_l) {
		rule_buf_l = newRule_buf_l;
	}
	public Object getRule_buf_r() {
		return rule_buf_r;
	}
	public void setRule_buf_r(Object newRule_buf_r) {
		rule_buf_r = newRule_buf_r;
	}
	public Object getSession() {
		return session;
	}
	public void setSession(Object newSession) {
		session = newSession;
	}
	public Object getAttack_mode() {
		return attack_mode;
	}
	public void setAttack_mode(Object newAttack_mode) {
		attack_mode = newAttack_mode;
	}
	public Object getBitmap_max() {
		return bitmap_max;
	}
	public void setBitmap_max(Object newBitmap_max) {
		bitmap_max = newBitmap_max;
	}
	public Object getBitmap_min() {
		return bitmap_min;
	}
	public void setBitmap_min(Object newBitmap_min) {
		bitmap_min = newBitmap_min;
	}
	public Object getDebug_mode() {
		return debug_mode;
	}
	public void setDebug_mode(Object newDebug_mode) {
		debug_mode = newDebug_mode;
	}
	public Object getHwmon_temp_abort() {
		return hwmon_temp_abort;
	}
	public void setHwmon_temp_abort(Object newHwmon_temp_abort) {
		hwmon_temp_abort = newHwmon_temp_abort;
	}
	public int getHash_mode() {
		return hash_mode;
	}
	public void setHash_mode(int newHash_mode) {
		hash_mode = newHash_mode;
	}
	public Object getHccapx_message_pair() {
		return hccapx_message_pair;
	}
	public void setHccapx_message_pair(Object newHccapx_message_pair) {
		hccapx_message_pair = newHccapx_message_pair;
	}
	public Object getIncrement_max() {
		return increment_max;
	}
	public void setIncrement_max(Object newIncrement_max) {
		increment_max = newIncrement_max;
	}
	public Object getIncrement_min() {
		return increment_min;
	}
	public void setIncrement_min(Object newIncrement_min) {
		increment_min = newIncrement_min;
	}
	public Object getKernel_accel() {
		return kernel_accel;
	}
	public void setKernel_accel(Object newKernel_accel) {
		kernel_accel = newKernel_accel;
	}
	public Object getKernel_loops() {
		return kernel_loops;
	}
	public void setKernel_loops(Object newKernel_loops) {
		kernel_loops = newKernel_loops;
	}
	public Object getKernel_threads() {
		return kernel_threads;
	}
	public void setKernel_threads(Object newKernel_threads) {
		kernel_threads = newKernel_threads;
	}
	public Object getMarkov_threshold() {
		return markov_threshold;
	}
	public void setMarkov_threshold(Object newMarkov_threshold) {
		markov_threshold = newMarkov_threshold;
	}
	public Object getNonce_error_corrections() {
		return nonce_error_corrections;
	}
	public void setNonce_error_corrections(Object newNonce_error_corrections) {
		nonce_error_corrections = newNonce_error_corrections;
	}
	public Object getSpin_damp() {
		return spin_damp;
	}
	public void setSpin_damp(Object newSpin_damp) {
		spin_damp = newSpin_damp;
	}
	public Object getBackend_vector_width() {
		return backend_vector_width;
	}
	public void setBackend_vector_width(Object newBackend_vector_width) {
		backend_vector_width = newBackend_vector_width;
	}
	public Object getOutfile_check_timer() {
		return outfile_check_timer;
	}
	public void setOutfile_check_timer(Object newOutfile_check_timer) {
		outfile_check_timer = newOutfile_check_timer;
	}
	public Object getOutfile_format() {
		return outfile_format;
	}
	public void setOutfile_format(Object newOutfile_format) {
		outfile_format = newOutfile_format;
	}
	public Object getRemove_timer() {
		return remove_timer;
	}
	public void setRemove_timer(Object newRemove_timer) {
		remove_timer = newRemove_timer;
	}
	public Object getRestore_timer() {
		return restore_timer;
	}
	public void setRestore_timer(Object newRestore_timer) {
		restore_timer = newRestore_timer;
	}
	public Object getRp_files_cnt() {
		return rp_files_cnt;
	}
	public void setRp_files_cnt(Object newRp_files_cnt) {
		rp_files_cnt = newRp_files_cnt;
	}
	public Object getRp_gen() {
		return rp_gen;
	}
	public void setRp_gen(Object newRp_gen) {
		rp_gen = newRp_gen;
	}
	public Object getRp_gen_func_max() {
		return rp_gen_func_max;
	}
	public void setRp_gen_func_max(Object newRp_gen_func_max) {
		rp_gen_func_max = newRp_gen_func_max;
	}
	public Object getRp_gen_func_min() {
		return rp_gen_func_min;
	}
	public void setRp_gen_func_min(Object newRp_gen_func_min) {
		rp_gen_func_min = newRp_gen_func_min;
	}
	public Object getRp_gen_seed() {
		return rp_gen_seed;
	}
	public void setRp_gen_seed(Object newRp_gen_seed) {
		rp_gen_seed = newRp_gen_seed;
	}
	public Object getRuntime() {
		return runtime;
	}
	public void setRuntime(Object newRuntime) {
		runtime = newRuntime;
	}
	public Object getScrypt_tmto() {
		return scrypt_tmto;
	}
	public void setScrypt_tmto(Object newScrypt_tmto) {
		scrypt_tmto = newScrypt_tmto;
	}
	public Object getSegment_size() {
		return segment_size;
	}
	public void setSegment_size(Object newSegment_size) {
		segment_size = newSegment_size;
	}
	public Object getStatus_timer() {
		return status_timer;
	}
	public void setStatus_timer(Object newStatus_timer) {
		status_timer = newStatus_timer;
	}
	public Object getStdin_timeout_abort() {
		return stdin_timeout_abort;
	}
	public void setStdin_timeout_abort(Object newStdin_timeout_abort) {
		stdin_timeout_abort = newStdin_timeout_abort;
	}
	public Object getVeracrypt_pim_start() {
		return veracrypt_pim_start;
	}
	public void setVeracrypt_pim_start(Object newVeracrypt_pim_start) {
		veracrypt_pim_start = newVeracrypt_pim_start;
	}
	public Object getVeracrypt_pim_stop() {
		return veracrypt_pim_stop;
	}
	public void setVeracrypt_pim_stop(Object newVeracrypt_pim_stop) {
		veracrypt_pim_stop = newVeracrypt_pim_stop;
	}
	public Object getWorkload_profile() {
		return workload_profile;
	}
	public void setWorkload_profile(Object newWorkload_profile) {
		workload_profile = newWorkload_profile;
	}
	public Object getLimit() {
		return limit;
	}
	public void setLimit(Object newLimit) {
		limit = newLimit;
	}
	public Object getSkip() {
		return skip;
	}
	public void setSkip(Object newSkip) {
		skip = newSkip;
	}
}
