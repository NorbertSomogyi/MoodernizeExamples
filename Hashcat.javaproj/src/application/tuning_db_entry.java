package application;

public class tuning_db_entry {
	private Object device_name;
	private int attack_mode;
	private int hash_mode;
	private int workload_profile;
	private int vector_width;
	private int kernel_accel;
	private int kernel_loops;
	
	public tuning_db_entry(Object device_name, int attack_mode, int hash_mode, int workload_profile, int vector_width, int kernel_accel, int kernel_loops) {
		setDevice_name(device_name);
		setAttack_mode(attack_mode);
		setHash_mode(hash_mode);
		setWorkload_profile(workload_profile);
		setVector_width(vector_width);
		setKernel_accel(kernel_accel);
		setKernel_loops(kernel_loops);
	}
	public tuning_db_entry() {
	}
	
	public tuning_db_entry tuning_db_search(hashcat_ctx hashcat_ctx, Object device_name, Object device_type, int attack_mode, Object hash_mode) {
		tuning_db generatedTuning_db = hashcat_ctx.getTuning_db();
		tuning_db_t tuning_db = generatedTuning_db;
		tuning_db_entry_t s = new tuning_db_entry_t();
		// first we need to convert all spaces in the device_name to underscore
		byte[] device_name_nospace = ModernizedCProgram.hcstrdup(device_name);
		size_t device_name_length = /*Error: Function owner not recognized*/strlen(device_name_nospace);
		size_t i = new size_t();
		for (i = 0; i < device_name_length; i++) {
			if (device_name_nospace[i] == (byte)' ') {
				device_name_nospace[i] = (byte)'_';
			} 
		}
		// find out if there's an alias configuredtuning_db_alias_t a = new tuning_db_alias_t();
		a.setDevice_name(device_name_nospace);
		Byte alias_name = (null);
		tuning_db_alias[] generatedAlias_buf = tuning_db.getAlias_buf();
		int generatedAlias_cnt = tuning_db.getAlias_cnt();
		Byte generatedAlias_name = alias.getAlias_name();
		for (i = device_name_length; i >= 1; i--) {
			device_name_nospace[i] = 0;
			tuning_db_alias_t alias = /*Error: Function owner not recognized*/bsearch(a, generatedAlias_buf, generatedAlias_cnt, /*Error: Unsupported expression*/, sort_by_tuning_db_alias);
			if (alias == (null)) {
				continue;
			} 
			alias_name = generatedAlias_name;
			break;
		}
		// attack-mode 6 and 7 are attack-mode 1 basicallyif (attack_mode == 6) {
			attack_mode = 1;
		} 
		if (attack_mode == 7) {
			attack_mode = 1;
		} 
		// bsearch is not ideal but fast enough
		s.setDevice_name(device_name_nospace);
		s.setAttack_mode(attack_mode);
		s.setHash_mode(hash_mode);
		tuning_db_entry_t entry = (null);
		// this will produce all 2^3 combinations required
		tuning_db_entry[] generatedEntry_buf = tuning_db.getEntry_buf();
		int generatedEntry_cnt = tuning_db.getEntry_cnt();
		for (i = 0; i < 8; i++) {
			s.setDevice_name((i & 1) ? "*" : device_name_nospace);
			s.setAttack_mode((i & 2) ? -1 : attack_mode);
			s.setHash_mode((i & 4) ? -1 : hash_mode);
			entry = /*Error: Function owner not recognized*/bsearch(s, generatedEntry_buf, generatedEntry_cnt, /*Error: Unsupported expression*/, sort_by_tuning_db_entry);
			if (entry != (null)) {
				break;
			} 
			if ((i & 1) == 0) {
				if (alias_name != (null)) {
					s.setDevice_name(alias_name);
					entry = /*Error: Function owner not recognized*/bsearch(s, generatedEntry_buf, generatedEntry_cnt, /*Error: Unsupported expression*/, sort_by_tuning_db_entry);
					if (entry != (null)) {
						break;
					} 
				} 
				if (device_type & CL_DEVICE_TYPE_CPU) {
					s.setDevice_name("DEVICE_TYPE_CPU");
				}  else if (device_type & CL_DEVICE_TYPE_GPU) {
					s.setDevice_name("DEVICE_TYPE_GPU");
				}  else if (device_type & CL_DEVICE_TYPE_ACCELERATOR) {
					s.setDevice_name("DEVICE_TYPE_ACCELERATOR");
				} 
				entry = /*Error: Function owner not recognized*/bsearch(s, generatedEntry_buf, generatedEntry_cnt, /*Error: Unsupported expression*/, sort_by_tuning_db_entry);
				if (entry != (null)) {
					break;
				} 
			} 
		}
		// free converted device_name// free converted device_nameModernizedCProgram.hcfree(device_name_nospace);
		return entry;
	}
	public Object getDevice_name() {
		return device_name;
	}
	public void setDevice_name(Object newDevice_name) {
		device_name = newDevice_name;
	}
	public int getAttack_mode() {
		return attack_mode;
	}
	public void setAttack_mode(int newAttack_mode) {
		attack_mode = newAttack_mode;
	}
	public int getHash_mode() {
		return hash_mode;
	}
	public void setHash_mode(int newHash_mode) {
		hash_mode = newHash_mode;
	}
	public int getWorkload_profile() {
		return workload_profile;
	}
	public void setWorkload_profile(int newWorkload_profile) {
		workload_profile = newWorkload_profile;
	}
	public int getVector_width() {
		return vector_width;
	}
	public void setVector_width(int newVector_width) {
		vector_width = newVector_width;
	}
	public int getKernel_accel() {
		return kernel_accel;
	}
	public void setKernel_accel(int newKernel_accel) {
		kernel_accel = newKernel_accel;
	}
	public int getKernel_loops() {
		return kernel_loops;
	}
	public void setKernel_loops(int newKernel_loops) {
		kernel_loops = newKernel_loops;
	}
}
