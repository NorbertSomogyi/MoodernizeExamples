package application;

public class brain_server_dbs {
	private Object mux_dbs;
	private brain_server_db_hash[] hash_buf;
	private brain_server_db_attack[] attack_buf;
	private int hash_cnt;
	private int attack_cnt;
	private int[] client_slots;
	
	public brain_server_dbs(Object mux_dbs, brain_server_db_hash[] hash_buf, brain_server_db_attack[] attack_buf, int hash_cnt, int attack_cnt, int[] client_slots) {
		setMux_dbs(mux_dbs);
		setHash_buf(hash_buf);
		setAttack_buf(attack_buf);
		setHash_cnt(hash_cnt);
		setAttack_cnt(attack_cnt);
		setClient_slots(client_slots);
	}
	public brain_server_dbs() {
	}
	
	public boolean brain_server_read_hash_dumps(Object path) {
		this.setHash_cnt(0);
		if (/*Error: Function owner not recognized*/chdir(path) == -1) {
			(_iob[2]).brain_logging(0, "%s: %s\n", path, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return 0;
		} 
		DIR dirp = /*Error: Function owner not recognized*/opendir(path);
		if (dirp == (null)) {
			(_iob[2]).brain_logging(0, "%s: %s\n", path, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return 0;
		} 
		dirent entry = new dirent();
		Object generatedD_name = entry.getD_name();
		brain_server_db_hash[] generatedHash_buf = this.getHash_buf();
		int generatedHash_cnt = this.getHash_cnt();
		while ((entry = /*Error: Function owner not recognized*/readdir(dirp)) != (null)) {
			Byte file = generatedD_name;
			size_t len = /*Error: Function owner not recognized*/strlen(file);
			if (len != 19) {
				continue;
			} 
			if (file[0] != (byte)'b') {
				continue;
			} 
			if (file[1] != (byte)'r') {
				continue;
			} 
			if (file[2] != (byte)'a') {
				continue;
			} 
			if (file[3] != (byte)'i') {
				continue;
			} 
			if (file[4] != (byte)'n') {
				continue;
			} 
			if (file[5] != (byte)'.') {
				continue;
			} 
			if (file[14] != (byte)'.') {
				continue;
			} 
			if (file[15] != (byte)'l') {
				continue;
			} 
			if (file[16] != (byte)'d') {
				continue;
			} 
			if (file[17] != (byte)'m') {
				continue;
			} 
			if (file[18] != (byte)'p') {
				continue;
			} 
			u32 brain_session = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32((u8)file + 6));
			brain_server_db_hash_t brain_server_db_hash = generatedHash_buf[generatedHash_cnt];
			brain_server_db_hash.brain_server_db_hash_init(brain_session);
			if (brain_server_db_hash.brain_server_read_hash_dump(file) == 0) {
				continue;
			} 
			generatedHash_cnt++;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/closedir(dirp);
		return 1;
	}
	public boolean brain_server_write_hash_dumps(Object path) {
		int generatedHash_cnt = this.getHash_cnt();
		brain_server_db_hash[] generatedHash_buf = this.getHash_buf();
		Object generatedMux_hg = brain_server_db_hash.getMux_hg();
		Object generatedBrain_session = brain_server_db_hash.getBrain_session();
		for (i64 idx = 0;
		 idx < generatedHash_cnt; idx++) {
			brain_server_db_hash_t brain_server_db_hash = generatedHash_buf[idx];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(generatedMux_hg, -1024);
			byte[] file = new byte[100];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(file, 0, /*Error: sizeof expression not supported yet*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(file, /*Error: sizeof expression not supported yet*/, "%s/brain.%08x.ldmp", path, generatedBrain_session);
			brain_server_db_hash.brain_server_write_hash_dump(file);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(generatedMux_hg);
		}
		return 1;
	}
	public boolean brain_server_read_attack_dumps(Object path) {
		this.setAttack_cnt(0);
		if (/*Error: Function owner not recognized*/chdir(path) == -1) {
			(_iob[2]).brain_logging(0, "%s: %s\n", path, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return 0;
		} 
		DIR dirp = /*Error: Function owner not recognized*/opendir(path);
		if (dirp == (null)) {
			(_iob[2]).brain_logging(0, "%s: %s\n", path, /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return 0;
		} 
		dirent entry = (null);
		Object generatedD_name = entry.getD_name();
		brain_server_db_attack[] generatedAttack_buf = this.getAttack_buf();
		int generatedAttack_cnt = this.getAttack_cnt();
		while ((entry = /*Error: Function owner not recognized*/readdir(dirp)) != (null)) {
			Byte file = generatedD_name;
			size_t len = /*Error: Function owner not recognized*/strlen(file);
			if (len != 19) {
				continue;
			} 
			if (file[0] != (byte)'b') {
				continue;
			} 
			if (file[1] != (byte)'r') {
				continue;
			} 
			if (file[2] != (byte)'a') {
				continue;
			} 
			if (file[3] != (byte)'i') {
				continue;
			} 
			if (file[4] != (byte)'n') {
				continue;
			} 
			if (file[5] != (byte)'.') {
				continue;
			} 
			if (file[14] != (byte)'.') {
				continue;
			} 
			if (file[15] != (byte)'a') {
				continue;
			} 
			if (file[16] != (byte)'d') {
				continue;
			} 
			if (file[17] != (byte)'m') {
				continue;
			} 
			if (file[18] != (byte)'p') {
				continue;
			} 
			u32 brain_attack = ModernizedCProgram.byte_swap_32(ModernizedCProgram.hex_to_u32((u8)file + 6));
			brain_server_db_attack_t brain_server_db_attack = generatedAttack_buf[generatedAttack_cnt];
			brain_server_db_attack.brain_server_db_attack_init(brain_attack);
			if (brain_server_db_attack.brain_server_read_attack_dump(file) == 0) {
				continue;
			} 
			generatedAttack_cnt++;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/closedir(dirp);
		return 1;
	}
	public boolean brain_server_write_attack_dumps(Object path) {
		int generatedAttack_cnt = this.getAttack_cnt();
		brain_server_db_attack[] generatedAttack_buf = this.getAttack_buf();
		Object generatedMux_ag = brain_server_db_attack.getMux_ag();
		Object generatedBrain_attack = brain_server_db_attack.getBrain_attack();
		for (i64 idx = 0;
		 idx < generatedAttack_cnt; idx++) {
			brain_server_db_attack_t brain_server_db_attack = generatedAttack_buf[idx];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(generatedMux_ag, -1024);
			byte[] file = new byte[100];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(file, 0, /*Error: sizeof expression not supported yet*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(file, /*Error: sizeof expression not supported yet*/, "%s/brain.%08x.admp", path, generatedBrain_attack);
			brain_server_db_attack.brain_server_write_attack_dump(file);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(generatedMux_ag);
		}
		return 1;
	}
	public int brain_server_get_client_idx() {
		int[] generatedClient_slots = this.getClient_slots();
		for (int i = 1;
		 i < ModernizedCProgram.BRAIN_SERVER_CLIENTS_MAX; i++) {
			if (generatedClient_slots[i] == 0) {
				generatedClient_slots[i] = 1;
				return i;
			} 
		}
		return -1;
	}
	public Object getMux_dbs() {
		return mux_dbs;
	}
	public void setMux_dbs(Object newMux_dbs) {
		mux_dbs = newMux_dbs;
	}
	public brain_server_db_hash[] getHash_buf() {
		return hash_buf;
	}
	public void setHash_buf(brain_server_db_hash[] newHash_buf) {
		hash_buf = newHash_buf;
	}
	public brain_server_db_attack[] getAttack_buf() {
		return attack_buf;
	}
	public void setAttack_buf(brain_server_db_attack[] newAttack_buf) {
		attack_buf = newAttack_buf;
	}
	public int getHash_cnt() {
		return hash_cnt;
	}
	public void setHash_cnt(int newHash_cnt) {
		hash_cnt = newHash_cnt;
	}
	public int getAttack_cnt() {
		return attack_cnt;
	}
	public void setAttack_cnt(int newAttack_cnt) {
		attack_cnt = newAttack_cnt;
	}
	public int[] getClient_slots() {
		return client_slots;
	}
	public void setClient_slots(int[] newClient_slots) {
		client_slots = newClient_slots;
	}
}
// required for cyclic dump
