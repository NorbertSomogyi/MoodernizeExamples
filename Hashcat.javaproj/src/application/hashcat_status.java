package application;

public class hashcat_status {
	private Byte hash_target;
	private Byte hash_name;
	private int guess_mode;
	private Byte guess_base;
	private int guess_base_offset;
	private int guess_base_count;
	private double guess_base_percent;
	private Byte guess_mod;
	private int guess_mod_offset;
	private int guess_mod_count;
	private double guess_mod_percent;
	private Byte guess_charset;
	private int guess_mask_length;
	private Byte session;
	private Object status_string;
	private int status_number;
	private Byte time_estimated_absolute;
	private Byte time_estimated_relative;
	private Byte time_started_absolute;
	private Byte time_started_relative;
	private double msec_paused;
	private double msec_running;
	private double msec_real;
	private int digests_cnt;
	private int digests_done;
	private double digests_percent;
	private int salts_cnt;
	private int salts_done;
	private double salts_percent;
	private int progress_mode;
	private double progress_finished_percent;
	private Object progress_cur;
	private Object progress_cur_relative_skip;
	private Object progress_done;
	private Object progress_end;
	private Object progress_end_relative_skip;
	private Object progress_ignore;
	private Object progress_rejected;
	private double progress_rejected_percent;
	private Object progress_restored;
	private Object progress_skip;
	private Object restore_point;
	private Object restore_total;
	private double restore_percent;
	private int cpt_cur_min;
	private int cpt_cur_hour;
	private int cpt_cur_day;
	private double cpt_avg_min;
	private double cpt_avg_hour;
	private double cpt_avg_day;
	private Byte cpt;
	private Object[] device_info_buf;
	private int device_info_cnt;
	private int device_info_active;
	private double hashes_msec_all;
	private double exec_msec_all;
	private Byte speed_sec_all;
	
	public hashcat_status(Byte hash_target, Byte hash_name, int guess_mode, Byte guess_base, int guess_base_offset, int guess_base_count, double guess_base_percent, Byte guess_mod, int guess_mod_offset, int guess_mod_count, double guess_mod_percent, Byte guess_charset, int guess_mask_length, Byte session, Object status_string, int status_number, Byte time_estimated_absolute, Byte time_estimated_relative, Byte time_started_absolute, Byte time_started_relative, double msec_paused, double msec_running, double msec_real, int digests_cnt, int digests_done, double digests_percent, int salts_cnt, int salts_done, double salts_percent, int progress_mode, double progress_finished_percent, Object progress_cur, Object progress_cur_relative_skip, Object progress_done, Object progress_end, Object progress_end_relative_skip, Object progress_ignore, Object progress_rejected, double progress_rejected_percent, Object progress_restored, Object progress_skip, Object restore_point, Object restore_total, double restore_percent, int cpt_cur_min, int cpt_cur_hour, int cpt_cur_day, double cpt_avg_min, double cpt_avg_hour, double cpt_avg_day, Byte cpt, Object[] device_info_buf, int device_info_cnt, int device_info_active, double hashes_msec_all, double exec_msec_all, Byte speed_sec_all) {
		setHash_target(hash_target);
		setHash_name(hash_name);
		setGuess_mode(guess_mode);
		setGuess_base(guess_base);
		setGuess_base_offset(guess_base_offset);
		setGuess_base_count(guess_base_count);
		setGuess_base_percent(guess_base_percent);
		setGuess_mod(guess_mod);
		setGuess_mod_offset(guess_mod_offset);
		setGuess_mod_count(guess_mod_count);
		setGuess_mod_percent(guess_mod_percent);
		setGuess_charset(guess_charset);
		setGuess_mask_length(guess_mask_length);
		setSession(session);
		setStatus_string(status_string);
		setStatus_number(status_number);
		setTime_estimated_absolute(time_estimated_absolute);
		setTime_estimated_relative(time_estimated_relative);
		setTime_started_absolute(time_started_absolute);
		setTime_started_relative(time_started_relative);
		setMsec_paused(msec_paused);
		setMsec_running(msec_running);
		setMsec_real(msec_real);
		setDigests_cnt(digests_cnt);
		setDigests_done(digests_done);
		setDigests_percent(digests_percent);
		setSalts_cnt(salts_cnt);
		setSalts_done(salts_done);
		setSalts_percent(salts_percent);
		setProgress_mode(progress_mode);
		setProgress_finished_percent(progress_finished_percent);
		setProgress_cur(progress_cur);
		setProgress_cur_relative_skip(progress_cur_relative_skip);
		setProgress_done(progress_done);
		setProgress_end(progress_end);
		setProgress_end_relative_skip(progress_end_relative_skip);
		setProgress_ignore(progress_ignore);
		setProgress_rejected(progress_rejected);
		setProgress_rejected_percent(progress_rejected_percent);
		setProgress_restored(progress_restored);
		setProgress_skip(progress_skip);
		setRestore_point(restore_point);
		setRestore_total(restore_total);
		setRestore_percent(restore_percent);
		setCpt_cur_min(cpt_cur_min);
		setCpt_cur_hour(cpt_cur_hour);
		setCpt_cur_day(cpt_cur_day);
		setCpt_avg_min(cpt_avg_min);
		setCpt_avg_hour(cpt_avg_hour);
		setCpt_avg_day(cpt_avg_day);
		setCpt(cpt);
		setDevice_info_buf(device_info_buf);
		setDevice_info_cnt(device_info_cnt);
		setDevice_info_active(device_info_active);
		setHashes_msec_all(hashes_msec_all);
		setExec_msec_all(exec_msec_all);
		setSpeed_sec_all(speed_sec_all);
	}
	public hashcat_status() {
	}
	
	public Byte getHash_target() {
		return hash_target;
	}
	public void setHash_target(Byte newHash_target) {
		hash_target = newHash_target;
	}
	public Byte getHash_name() {
		return hash_name;
	}
	public void setHash_name(Byte newHash_name) {
		hash_name = newHash_name;
	}
	public int getGuess_mode() {
		return guess_mode;
	}
	public void setGuess_mode(int newGuess_mode) {
		guess_mode = newGuess_mode;
	}
	public Byte getGuess_base() {
		return guess_base;
	}
	public void setGuess_base(Byte newGuess_base) {
		guess_base = newGuess_base;
	}
	public int getGuess_base_offset() {
		return guess_base_offset;
	}
	public void setGuess_base_offset(int newGuess_base_offset) {
		guess_base_offset = newGuess_base_offset;
	}
	public int getGuess_base_count() {
		return guess_base_count;
	}
	public void setGuess_base_count(int newGuess_base_count) {
		guess_base_count = newGuess_base_count;
	}
	public double getGuess_base_percent() {
		return guess_base_percent;
	}
	public void setGuess_base_percent(double newGuess_base_percent) {
		guess_base_percent = newGuess_base_percent;
	}
	public Byte getGuess_mod() {
		return guess_mod;
	}
	public void setGuess_mod(Byte newGuess_mod) {
		guess_mod = newGuess_mod;
	}
	public int getGuess_mod_offset() {
		return guess_mod_offset;
	}
	public void setGuess_mod_offset(int newGuess_mod_offset) {
		guess_mod_offset = newGuess_mod_offset;
	}
	public int getGuess_mod_count() {
		return guess_mod_count;
	}
	public void setGuess_mod_count(int newGuess_mod_count) {
		guess_mod_count = newGuess_mod_count;
	}
	public double getGuess_mod_percent() {
		return guess_mod_percent;
	}
	public void setGuess_mod_percent(double newGuess_mod_percent) {
		guess_mod_percent = newGuess_mod_percent;
	}
	public Byte getGuess_charset() {
		return guess_charset;
	}
	public void setGuess_charset(Byte newGuess_charset) {
		guess_charset = newGuess_charset;
	}
	public int getGuess_mask_length() {
		return guess_mask_length;
	}
	public void setGuess_mask_length(int newGuess_mask_length) {
		guess_mask_length = newGuess_mask_length;
	}
	public Byte getSession() {
		return session;
	}
	public void setSession(Byte newSession) {
		session = newSession;
	}
	public Object getStatus_string() {
		return status_string;
	}
	public void setStatus_string(Object newStatus_string) {
		status_string = newStatus_string;
	}
	public int getStatus_number() {
		return status_number;
	}
	public void setStatus_number(int newStatus_number) {
		status_number = newStatus_number;
	}
	public Byte getTime_estimated_absolute() {
		return time_estimated_absolute;
	}
	public void setTime_estimated_absolute(Byte newTime_estimated_absolute) {
		time_estimated_absolute = newTime_estimated_absolute;
	}
	public Byte getTime_estimated_relative() {
		return time_estimated_relative;
	}
	public void setTime_estimated_relative(Byte newTime_estimated_relative) {
		time_estimated_relative = newTime_estimated_relative;
	}
	public Byte getTime_started_absolute() {
		return time_started_absolute;
	}
	public void setTime_started_absolute(Byte newTime_started_absolute) {
		time_started_absolute = newTime_started_absolute;
	}
	public Byte getTime_started_relative() {
		return time_started_relative;
	}
	public void setTime_started_relative(Byte newTime_started_relative) {
		time_started_relative = newTime_started_relative;
	}
	public double getMsec_paused() {
		return msec_paused;
	}
	public void setMsec_paused(double newMsec_paused) {
		msec_paused = newMsec_paused;
	}
	public double getMsec_running() {
		return msec_running;
	}
	public void setMsec_running(double newMsec_running) {
		msec_running = newMsec_running;
	}
	public double getMsec_real() {
		return msec_real;
	}
	public void setMsec_real(double newMsec_real) {
		msec_real = newMsec_real;
	}
	public int getDigests_cnt() {
		return digests_cnt;
	}
	public void setDigests_cnt(int newDigests_cnt) {
		digests_cnt = newDigests_cnt;
	}
	public int getDigests_done() {
		return digests_done;
	}
	public void setDigests_done(int newDigests_done) {
		digests_done = newDigests_done;
	}
	public double getDigests_percent() {
		return digests_percent;
	}
	public void setDigests_percent(double newDigests_percent) {
		digests_percent = newDigests_percent;
	}
	public int getSalts_cnt() {
		return salts_cnt;
	}
	public void setSalts_cnt(int newSalts_cnt) {
		salts_cnt = newSalts_cnt;
	}
	public int getSalts_done() {
		return salts_done;
	}
	public void setSalts_done(int newSalts_done) {
		salts_done = newSalts_done;
	}
	public double getSalts_percent() {
		return salts_percent;
	}
	public void setSalts_percent(double newSalts_percent) {
		salts_percent = newSalts_percent;
	}
	public int getProgress_mode() {
		return progress_mode;
	}
	public void setProgress_mode(int newProgress_mode) {
		progress_mode = newProgress_mode;
	}
	public double getProgress_finished_percent() {
		return progress_finished_percent;
	}
	public void setProgress_finished_percent(double newProgress_finished_percent) {
		progress_finished_percent = newProgress_finished_percent;
	}
	public Object getProgress_cur() {
		return progress_cur;
	}
	public void setProgress_cur(Object newProgress_cur) {
		progress_cur = newProgress_cur;
	}
	public Object getProgress_cur_relative_skip() {
		return progress_cur_relative_skip;
	}
	public void setProgress_cur_relative_skip(Object newProgress_cur_relative_skip) {
		progress_cur_relative_skip = newProgress_cur_relative_skip;
	}
	public Object getProgress_done() {
		return progress_done;
	}
	public void setProgress_done(Object newProgress_done) {
		progress_done = newProgress_done;
	}
	public Object getProgress_end() {
		return progress_end;
	}
	public void setProgress_end(Object newProgress_end) {
		progress_end = newProgress_end;
	}
	public Object getProgress_end_relative_skip() {
		return progress_end_relative_skip;
	}
	public void setProgress_end_relative_skip(Object newProgress_end_relative_skip) {
		progress_end_relative_skip = newProgress_end_relative_skip;
	}
	public Object getProgress_ignore() {
		return progress_ignore;
	}
	public void setProgress_ignore(Object newProgress_ignore) {
		progress_ignore = newProgress_ignore;
	}
	public Object getProgress_rejected() {
		return progress_rejected;
	}
	public void setProgress_rejected(Object newProgress_rejected) {
		progress_rejected = newProgress_rejected;
	}
	public double getProgress_rejected_percent() {
		return progress_rejected_percent;
	}
	public void setProgress_rejected_percent(double newProgress_rejected_percent) {
		progress_rejected_percent = newProgress_rejected_percent;
	}
	public Object getProgress_restored() {
		return progress_restored;
	}
	public void setProgress_restored(Object newProgress_restored) {
		progress_restored = newProgress_restored;
	}
	public Object getProgress_skip() {
		return progress_skip;
	}
	public void setProgress_skip(Object newProgress_skip) {
		progress_skip = newProgress_skip;
	}
	public Object getRestore_point() {
		return restore_point;
	}
	public void setRestore_point(Object newRestore_point) {
		restore_point = newRestore_point;
	}
	public Object getRestore_total() {
		return restore_total;
	}
	public void setRestore_total(Object newRestore_total) {
		restore_total = newRestore_total;
	}
	public double getRestore_percent() {
		return restore_percent;
	}
	public void setRestore_percent(double newRestore_percent) {
		restore_percent = newRestore_percent;
	}
	public int getCpt_cur_min() {
		return cpt_cur_min;
	}
	public void setCpt_cur_min(int newCpt_cur_min) {
		cpt_cur_min = newCpt_cur_min;
	}
	public int getCpt_cur_hour() {
		return cpt_cur_hour;
	}
	public void setCpt_cur_hour(int newCpt_cur_hour) {
		cpt_cur_hour = newCpt_cur_hour;
	}
	public int getCpt_cur_day() {
		return cpt_cur_day;
	}
	public void setCpt_cur_day(int newCpt_cur_day) {
		cpt_cur_day = newCpt_cur_day;
	}
	public double getCpt_avg_min() {
		return cpt_avg_min;
	}
	public void setCpt_avg_min(double newCpt_avg_min) {
		cpt_avg_min = newCpt_avg_min;
	}
	public double getCpt_avg_hour() {
		return cpt_avg_hour;
	}
	public void setCpt_avg_hour(double newCpt_avg_hour) {
		cpt_avg_hour = newCpt_avg_hour;
	}
	public double getCpt_avg_day() {
		return cpt_avg_day;
	}
	public void setCpt_avg_day(double newCpt_avg_day) {
		cpt_avg_day = newCpt_avg_day;
	}
	public Byte getCpt() {
		return cpt;
	}
	public void setCpt(Byte newCpt) {
		cpt = newCpt;
	}
	public Object[] getDevice_info_buf() {
		return device_info_buf;
	}
	public void setDevice_info_buf(Object[] newDevice_info_buf) {
		device_info_buf = newDevice_info_buf;
	}
	public int getDevice_info_cnt() {
		return device_info_cnt;
	}
	public void setDevice_info_cnt(int newDevice_info_cnt) {
		device_info_cnt = newDevice_info_cnt;
	}
	public int getDevice_info_active() {
		return device_info_active;
	}
	public void setDevice_info_active(int newDevice_info_active) {
		device_info_active = newDevice_info_active;
	}
	public double getHashes_msec_all() {
		return hashes_msec_all;
	}
	public void setHashes_msec_all(double newHashes_msec_all) {
		hashes_msec_all = newHashes_msec_all;
	}
	public double getExec_msec_all() {
		return exec_msec_all;
	}
	public void setExec_msec_all(double newExec_msec_all) {
		exec_msec_all = newExec_msec_all;
	}
	public Byte getSpeed_sec_all() {
		return speed_sec_all;
	}
	public void setSpeed_sec_all(Byte newSpeed_sec_all) {
		speed_sec_all = newSpeed_sec_all;
	}
}
