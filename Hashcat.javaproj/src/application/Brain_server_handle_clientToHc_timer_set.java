package application;

public class Brain_server_handle_clientToHc_timer_set {
	
	
	private static Object brain_server_handle_client(Object p) {
		brain_server_client_options_t brain_server_client_options = (brain_server_client_options_t)p;
		int generatedClient_idx = brain_server_client_options.getClient_idx();
		int client_idx = generatedClient_idx;
		int generatedClient_fd = brain_server_client_options.getClient_fd();
		int client_fd = generatedClient_fd;
		Byte generatedAuth_password = brain_server_client_options.getAuth_password();
		Byte auth_password = generatedAuth_password;
		Object generatedSession_whitelist_buf = brain_server_client_options.getSession_whitelist_buf();
		u32[] session_whitelist_buf = generatedSession_whitelist_buf;
		int generatedSession_whitelist_cnt = brain_server_client_options.getSession_whitelist_cnt();
		int session_whitelist_cnt = generatedSession_whitelist_cnt;
		brain_server_dbs generatedBrain_server_dbs = brain_server_client_options.getBrain_server_dbs();
		brain_server_dbs_t brain_server_dbs = generatedBrain_server_dbs;
		// client configuration
		u32 brain_link_version = 0;
		int[] generatedClient_slots = brain_server_dbs.getClient_slots();
		if ((null).brain_recv(client_fd, brain_link_version, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
			(_iob[2]).brain_logging(client_idx, "brain_recv: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		u32 brain_link_version_ok = (brain_link_version >= (u32)ModernizedCProgram.BRAIN_LINK_VERSION_MIN) ? 1 : 0;
		if ((null).brain_send(client_fd, brain_link_version_ok, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
			(_iob[2]).brain_logging(client_idx, "brain_send: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		if (brain_link_version_ok == 0) {
			(_iob[2]).brain_logging(client_idx, "Invalid version\n");
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		u32 challenge = ModernizedCProgram.brain_auth_challenge();
		if ((null).brain_send(client_fd, challenge, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
			(_iob[2]).brain_logging(client_idx, "brain_send: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		u64 response = 0;
		if ((null).brain_recv(client_fd, response, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
			(_iob[2]).brain_logging(client_idx, "brain_recv: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		u64 auth_hash = ModernizedCProgram.brain_auth_hash(challenge, auth_password, /*Error: Function owner not recognized*/strlen(auth_password));
		u32 password_ok = (auth_hash == response) ? 1 : 0;
		if ((null).brain_send(client_fd, password_ok, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
			(_iob[2]).brain_logging(client_idx, "brain_send: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		if (password_ok == 0) {
			(_iob[2]).brain_logging(client_idx, "Invalid password\n");
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		u32 brain_session = 0;
		if ((null).brain_recv(client_fd, brain_session, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
			(_iob[2]).brain_logging(client_idx, "brain_recv: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		if (session_whitelist_cnt > 0) {
			boolean found = false;
			for (int idx = 0;
			 idx < session_whitelist_cnt; idx++) {
				if (session_whitelist_buf[idx] == brain_session) {
					found = true;
					break;
				} 
			}
			if (found == false) {
				(_iob[2]).brain_logging(client_idx, "Invalid brain session: 0x%08x\n", brain_session);
				generatedClient_slots[client_idx] = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
				return (null);
			} 
		} 
		u32 brain_attack = 0;
		if ((null).brain_recv(client_fd, brain_attack, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
			(_iob[2]).brain_logging(client_idx, "brain_recv: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		i64 passwords_max = 0;
		if ((null).brain_recv(client_fd, passwords_max, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
			(_iob[2]).brain_logging(client_idx, "brain_recv: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		if (passwords_max >= ModernizedCProgram.BRAIN_LINK_CANDIDATES_MAX) {
			(_iob[2]).brain_logging(client_idx, "Too large candidate allocation buffer size\n");
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		(_iob[1]).brain_logging(client_idx, "Session: 0x%08x, Attack: 0x%08x, Kernel-power: %I64u\n", brain_session, brain_attack, passwords_max)// so far so good;// so far so good
		Object generatedMux_dbs = brain_server_dbs.getMux_dbs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(generatedMux_dbs, -1024)// long term memory;// long term memory
		brain_server_db_hash_t key_hash = new brain_server_db_hash_t();
		key_hash.setBrain_session(brain_session);
		int generatedHash_cnt = brain_server_dbs.getHash_cnt();
		int find_hash_cnt = (int)generatedHash_cnt;
		brain_server_db_hash[] generatedHash_buf = brain_server_dbs.getHash_buf();
		brain_server_db_hash_t brain_server_db_hash = (brain_server_db_hash_t)/*Error: Function owner not recognized*/lfind(key_hash, generatedHash_buf, find_hash_cnt, /*Error: Unsupported expression*/, ModernizedCProgram.brain_server_sort_db_hash);
		if (brain_server_db_hash == (null)) {
			if (generatedHash_cnt >= ModernizedCProgram.BRAIN_SERVER_SESSIONS_MAX) {
				(_iob[2]).brain_logging(0, "too many sessions\n");
				generatedClient_slots[client_idx] = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
				return (null);
			} 
			brain_server_db_hash = generatedHash_buf[generatedHash_cnt];
			brain_server_db_hash.brain_server_db_hash_init(brain_session);
			generatedHash_cnt++;
		} 
		// attack memorybrain_server_db_attack_t key_attack = new brain_server_db_attack_t();
		key_attack.setBrain_attack(brain_attack);
		int generatedAttack_cnt = brain_server_dbs.getAttack_cnt();
		int find_attack_cnt = (int)generatedAttack_cnt;
		brain_server_db_attack[] generatedAttack_buf = brain_server_dbs.getAttack_buf();
		brain_server_db_attack_t brain_server_db_attack = (brain_server_db_attack_t)/*Error: Function owner not recognized*/lfind(key_attack, generatedAttack_buf, find_attack_cnt, /*Error: Unsupported expression*/, ModernizedCProgram.brain_server_sort_db_attack);
		if (brain_server_db_attack == (null)) {
			if (generatedAttack_cnt >= ModernizedCProgram.BRAIN_SERVER_ATTACKS_MAX) {
				(_iob[2]).brain_logging(0, "too many attacks\n");
				generatedClient_slots[client_idx] = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
				return (null);
			} 
			brain_server_db_attack = generatedAttack_buf[generatedAttack_cnt];
			brain_server_db_attack.brain_server_db_attack_init(brain_attack);
			generatedAttack_cnt++;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(generatedMux_dbs)// higest position of that attack;// higest position of that attack
		u64 highest = ModernizedCProgram.brain_server_highest_attack(brain_server_db_attack);
		if ((null).brain_send(client_fd, highest, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
			(_iob[2]).brain_logging(client_idx, "brain_send: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		// recvsize_t recv_size = passwords_max * ModernizedCProgram.BRAIN_HASH_SIZE;
		u32[] recv_buf = (u32)ModernizedCProgram.hcmalloc(recv_size);
		if (recv_buf == (null)) {
			(_iob[2]).brain_logging(0, "%s\n", "Insufficient memory available");
			return (null);
		} 
		// sendsize_t send_size = passwords_max * /*Error: Unsupported expression*/;
		// we can reduce this to 1/8 if we use bits instead of bytesu8[] send_buf = (u8)ModernizedCProgram.hcmalloc(send_size);
		if (send_buf == (null)) {
			(_iob[2]).brain_logging(0, "%s\n", "Insufficient memory available");
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		// tempbrain_server_hash_unique_t[] temp_buf = (brain_server_hash_unique_t)ModernizedCProgram.hccalloc(passwords_max, /*Error: Unsupported expression*/);
		if (temp_buf == (null)) {
			(_iob[2]).brain_logging(0, "%s\n", "Insufficient memory available");
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		// short global allocbrain_server_db_short_t brain_server_db_short = ModernizedCProgram.hcmalloc(/*Error: Unsupported expression*/);
		brain_server_db_short.setShort_cnt(0);
		brain_server_db_short.setShort_buf((brain_server_hash_short_t)ModernizedCProgram.hccalloc(passwords_max, /*Error: Unsupported expression*/));
		brain_server_hash_short[] generatedShort_buf = brain_server_db_short.getShort_buf();
		if (generatedShort_buf == (null)) {
			(_iob[2]).brain_logging(0, "%s\n", "Insufficient memory available");
			generatedClient_slots[client_idx] = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
			return (null);
		} 
		Object generatedMux_ag = brain_server_db_attack.getMux_ag();
		Object generatedShort_cnt = brain_server_db_attack.getShort_cnt();
		brain_server_attack_long[] generatedLong_buf = brain_server_db_attack.getLong_buf();
		Object generatedLong_cnt = brain_server_db_attack.getLong_cnt();
		Object generatedMux_hg = brain_server_db_hash.getMux_hg();
		Object[] generatedHash = next.getHash();
		Object generatedHash_idx = cur.getHash_idx();
		Object generatedMux_hr = brain_server_db_hash.getMux_hr();
		int generatedHb = brain_server_db_hash.getHb();
		// main loopwhile (ModernizedCProgram.keep_running == 1) {
			int rc_select = ModernizedCProgram.select_read_timeout(client_fd, 1);
			if (rc_select == -1) {
				break;
			} 
			if (rc_select == 0) {
				continue;
			} 
			u8 operation = 0;
			if ((null).brain_recv(client_fd, operation, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
				break;
			} 
			if (operation == brain_operation.BRAIN_OPERATION_ATTACK_RESERVE) {
				u64 offset = 0;
				u64 length = 0;
				if ((null).brain_recv(client_fd, offset, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
					break;
				} 
				if ((null).brain_recv(client_fd, length, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
					break;
				} 
				hc_timer_t timer_reserved = new hc_timer_t();
				ModernizedCProgram.hc_timer_set(timer_reserved);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(generatedMux_ag, -1024);
				u64 overlap = 0;
				overlap += ModernizedCProgram.brain_server_find_attack_short(generatedShort_buf, generatedShort_cnt, offset, length);
				overlap += ModernizedCProgram.brain_server_find_attack_long(generatedLong_buf, generatedLong_cnt, offset + overlap, length - overlap);
				if (overlap < length) {
					if (brain_server_db_attack.brain_server_db_attack_realloc(0, 1) == 1) {
						generatedShort_buf[generatedShort_cnt].setOffset(offset + overlap);
						generatedShort_buf[generatedShort_cnt].setLength(length - overlap);
						generatedShort_buf[generatedShort_cnt].setClient_idx(client_idx);
						generatedShort_cnt++;
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort(generatedShort_buf, generatedShort_cnt, /*Error: Unsupported expression*/, ModernizedCProgram.brain_server_sort_attack_short);
					} 
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(generatedMux_ag);
				if ((null).brain_send(client_fd, overlap, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
					break;
				} 
				double ms = ModernizedCProgram.hc_timer_get(timer_reserved);
				(_iob[1]).brain_logging(client_idx, "R | %8.2f ms | Offset: %I64u, Length: %I64u, Overlap: %I64u\n", ms, offset, length, overlap);
			}  else if (operation == brain_operation.BRAIN_OPERATION_COMMIT) {
				hc_timer_t timer_commit = new hc_timer_t();
				ModernizedCProgram.hc_timer_set(timer_commit);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(generatedMux_ag, -1024);
				i64 new_attacks = 0;
				for (i64 idx = 0;
				 idx < generatedShort_cnt; idx++) {
					if (generatedClient_idx == client_idx) {
						if (brain_server_db_attack.brain_server_db_attack_realloc(1, 0) == 1) {
							generatedLong_buf[generatedLong_cnt].setOffset(generatedShort_buf[idx].getOffset());
							generatedLong_buf[generatedLong_cnt].setLength(generatedShort_buf[idx].getLength());
							generatedLong_cnt++;
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort(generatedLong_buf, generatedLong_cnt, /*Error: Unsupported expression*/, ModernizedCProgram.brain_server_sort_attack_long);
						} else {
								(_iob[2]).brain_logging(0, "%s\n", "Insufficient memory available");
						} 
						generatedShort_buf[idx].setOffset(0);
						generatedShort_buf[idx].setLength(0);
						generatedShort_buf[idx].setClient_idx(0);
						new_attacks++;
					} 
				}
				brain_server_db_attack.setWrite_attacks(1);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(generatedMux_ag);
				if (new_attacks) {
					double ms_attacks = ModernizedCProgram.hc_timer_get(timer_commit);
					(_iob[1]).brain_logging(client_idx, "C | %8.2f ms | Attacks: %I64i\n", ms_attacks, new_attacks);
				} 
				ModernizedCProgram.hc_timer_set(timer_commit);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(generatedMux_hg, -1024);
				if (generatedShort_cnt) {
					if (brain_server_db_hash.brain_server_db_hash_realloc(generatedShort_cnt) == 1) {
						if (generatedLong_cnt == 0) {
							for (i64 idx = 0;
							 idx < generatedShort_cnt; idx++) {
								generatedLong_buf[idx].getHash()[0] = generatedShort_buf[idx].getHash()[0];
								generatedLong_buf[idx].getHash()[1] = generatedShort_buf[idx].getHash()[1];
							}
							brain_server_db_hash.setLong_cnt(generatedShort_cnt);
						} else {
								i64 cnt_total = generatedLong_cnt + generatedShort_cnt;
								i64 long_left = generatedLong_cnt - 1;
								i64 short_left = generatedShort_cnt - 1;
								i64 long_dupes = 0;
								for (i64 idx = cnt_total - 1;
								 idx >= long_dupes; idx--) {
									brain_server_hash_long_t long_entry = generatedLong_buf[long_left];
									brain_server_hash_short_t short_entry = generatedShort_buf[short_left];
									int rc = 0;
									if ((long_left >= 0) && (short_left >= 0)) {
										rc = ModernizedCProgram.brain_server_sort_hash(long_entry.getHash(), short_entry.getHash());
									}  else if (long_left >= 0) {
										rc = 1;
									}  else if (short_left >= 0) {
										rc = -1;
									} else {
											(_iob[2]).brain_logging(client_idx, "unexpected remaining buffers in compare: %I64i - %I64i\n", long_left, short_left);
									} 
									brain_server_hash_long_t next = generatedLong_buf[idx];
									if (rc == -1) {
										generatedHash[0] = generatedHash[0];
										generatedHash[1] = generatedHash[1];
										short_left--;
									}  else if (rc == 1) {
										generatedHash[0] = generatedHash[0];
										generatedHash[1] = generatedHash[1];
										long_left--;
									} else {
											generatedHash[0] = generatedHash[0];
											generatedHash[1] = generatedHash[1];
											short_left--;
											long_left--;
											long_dupes++;
									} 
								}
								if ((long_left != -1) || (short_left != -1)) {
									(_iob[2]).brain_logging(client_idx, "unexpected remaining buffers in commit: %I64i - %I64i\n", long_left, short_left);
								} 
								brain_server_db_hash.setLong_cnt(cnt_total - long_dupes);
								if (long_dupes) {
									for (i64 idx = 0;
									 idx < generatedLong_cnt; idx++) {
										generatedHash[0] = generatedHash[0];
										generatedHash[1] = generatedHash[1];
									}
								} 
						} 
					} else {
							(_iob[2]).brain_logging(0, "%s\n", "Insufficient memory available");
					} 
					brain_server_db_hash.setWrite_hashes(1);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(generatedMux_hg);
				if (generatedShort_cnt) {
					double ms_hashes = ModernizedCProgram.hc_timer_get(timer_commit);
					(_iob[1]).brain_logging(client_idx, "C | %8.2f ms | Hashes: %I64i\n", ms_hashes, generatedShort_cnt);
				} 
				brain_server_db_short.setShort_cnt(0);
			}  else if (operation == brain_operation.BRAIN_OPERATION_HASH_LOOKUP) {
				int in_size = 0;
				if ((null).brain_recv(client_fd, in_size, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
					break;
				} 
				if (in_size == 0) {
					(_iob[2]).brain_logging(client_idx, "Zero in_size value\n");
					break;
				} 
				if (in_size > (int)recv_size) {
					break;
				} 
				if ((null).brain_recv(client_fd, recv_buf, (size_t)in_size, 0, (null)) == 0) {
					break;
				} 
				int hashes_cnt = in_size / ModernizedCProgram.BRAIN_HASH_SIZE;
				if (hashes_cnt == 0) {
					(_iob[2]).brain_logging(client_idx, "Zero passwords\n");
					break;
				} 
				if ((generatedShort_cnt + hashes_cnt) > passwords_max) {
					(_iob[2]).brain_logging(client_idx, "Too many passwords\n");
					break;
				} 
				hc_timer_t timer_lookup = new hc_timer_t();
				ModernizedCProgram.hc_timer_set(timer_lookup);
				for (int hash_idx = 0;
				int recv_idx = 0;
				 hash_idx < hashes_cnt; ) {
					generatedHash[0] = recv_buf[recv_idx + 0];
					generatedHash[1] = recv_buf[recv_idx + 1];
					temp_buf[hash_idx].setHash_idx(hash_idx);
					send_buf[hash_idx] = 0;
				}
				i64 temp_cnt = 0;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsort(temp_buf, hashes_cnt, /*Error: Unsupported expression*/, ModernizedCProgram.brain_server_sort_hash_unique);
				brain_server_hash_unique_t prev = temp_buf + temp_cnt;
				for (i64 temp_idx = 1;
				 temp_idx < hashes_cnt; temp_idx++) {
					brain_server_hash_unique_t cur = temp_buf + temp_idx;
					if ((generatedHash[0] == generatedHash[0]) && (generatedHash[1] == generatedHash[1])) {
						send_buf[generatedHash_idx] = 1;
					} else {
							temp_cnt++;
							prev = temp_buf + temp_cnt;
							generatedHash[0] = generatedHash[0];
							generatedHash[1] = generatedHash[1];
							prev.setHash_idx(generatedHash_idx);
					} 
				}
				temp_cnt++;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(generatedMux_hr, -1024);
				generatedHb++;
				if (generatedHb == 1) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(generatedMux_hg, -1024);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(generatedMux_hr);
				if (temp_cnt > 0) {
					i64 temp_idx_new = 0;
					for (i64 temp_idx = 0;
					 temp_idx < temp_cnt; temp_idx++) {
						brain_server_hash_unique_t cur = temp_buf[temp_idx];
						i64 r = ModernizedCProgram.brain_server_find_hash_long(generatedHash, generatedLong_buf, generatedLong_cnt);
						if (r != -1) {
							send_buf[generatedHash_idx] = 1;
						} else {
								brain_server_hash_unique_t save = temp_buf + temp_idx_new;
								temp_idx_new++;
								generatedHash[0] = generatedHash[0];
								generatedHash[1] = generatedHash[1];
								save.setHash_idx(generatedHash_idx);
						} 
					}
					temp_cnt = temp_idx_new;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(generatedMux_hr, -1024);
				generatedHb--;
				if (generatedHb == 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(generatedMux_hg);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(generatedMux_hr);
				if (temp_cnt > 0) {
					i64 temp_idx_new = 0;
					for (i64 temp_idx = 0;
					 temp_idx < temp_cnt; temp_idx++) {
						brain_server_hash_unique_t cur = temp_buf[temp_idx];
						i64 r = ModernizedCProgram.brain_server_find_hash_short(generatedHash, generatedShort_buf, generatedShort_cnt);
						if (r != -1) {
							send_buf[generatedHash_idx] = 1;
						} else {
								brain_server_hash_unique_t save = temp_buf + temp_idx_new;
								temp_idx_new++;
								generatedHash[0] = generatedHash[0];
								generatedHash[1] = generatedHash[1];
								save.setHash_idx(generatedHash_idx);
						} 
					}
					temp_cnt = temp_idx_new;
				} 
				if (temp_cnt > 0) {
					if (generatedShort_cnt == 0) {
						for (i64 idx = 0;
						 idx < temp_cnt; idx++) {
							generatedHash[0] = generatedHash[0];
							generatedHash[1] = generatedHash[1];
						}
						brain_server_db_short.setShort_cnt(temp_cnt);
					} else {
							i64 cnt_total = generatedShort_cnt + temp_cnt;
							i64 short_left = generatedShort_cnt - 1;
							i64 unique_left = temp_cnt - 1;
							for (i64 idx = cnt_total - 1;
							 idx >= 0; idx--) {
								brain_server_hash_short_t short_entry = generatedShort_buf + short_left;
								brain_server_hash_unique_t unique_entry = temp_buf + unique_left;
								int rc = 0;
								if ((short_left >= 0) && (unique_left >= 0)) {
									rc = ModernizedCProgram.brain_server_sort_hash(generatedHash, generatedHash);
								}  else if (short_left >= 0) {
									rc = 1;
								}  else if (unique_left >= 0) {
									rc = -1;
								} else {
										(_iob[2]).brain_logging(client_idx, "unexpected remaining buffers in compare: %I64i - %I64i\n", short_left, unique_left);
								} 
								brain_server_hash_short_t next = generatedShort_buf + idx;
								if (rc == -1) {
									generatedHash[0] = generatedHash[0];
									generatedHash[1] = generatedHash[1];
									unique_left--;
								}  else if (rc == 1) {
									generatedHash[0] = generatedHash[0];
									generatedHash[1] = generatedHash[1];
									short_left--;
								} else {
										(_iob[2]).brain_logging(client_idx, "unexpected zero comparison in commit\n");
								} 
							}
							if ((short_left != -1) || (unique_left != -1)) {
								(_iob[2]).brain_logging(client_idx, "unexpected remaining buffers in commit: %I64i - %I64i\n", short_left, unique_left);
							} 
							brain_server_db_short.setShort_cnt(cnt_total);
					} 
				} 
				int local_lookup_new = 0;
				for (i64 hashes_idx = 0;
				 hashes_idx < hashes_cnt; hashes_idx++) {
					if (send_buf[hashes_idx] == 0) {
						local_lookup_new++;
					} 
				}
				double ms = ModernizedCProgram.hc_timer_get(timer_lookup);
				(_iob[1]).brain_logging(client_idx, "L | %8.2f ms | Long: %I64i, Inc: %d, New: %d\n", ms, generatedLong_cnt, hashes_cnt, local_lookup_new);
				int out_size = hashes_cnt;
				if ((null).brain_send(client_fd, out_size, /*Error: sizeof expression not supported yet*/, 0, (null)) == 0) {
					break;
				} 
				if ((null).brain_send(client_fd, send_buf, out_size, 0, (null)) == 0) {
					break;
				} 
			} else {
					break;
			} 
		}// wait for client to send data, but not too long
		/*Error: Function owner not recognized*/// client reservations/*Error: Function owner not recognized*/// client reservationsWaitForSingleObject(generatedMux_ag, -1024);
		for (i64 idx = 0;
		 idx < generatedShort_cnt; idx++) {
			if (generatedClient_idx == client_idx) {
				generatedShort_buf[idx].setOffset(0);
				generatedShort_buf[idx].setLength(0);
				generatedShort_buf[idx].setClient_idx(0);
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(generatedMux_ag)// short free;// short free
		ModernizedCProgram.hcfree(generatedShort_buf);
		ModernizedCProgram.hcfree(brain_server_db_short)// free local memory;// free local memory
		ModernizedCProgram.hcfree(send_buf);
		ModernizedCProgram.hcfree(temp_buf);
		ModernizedCProgram.hcfree(recv_buf);
		(_iob[1]).brain_logging(client_idx, "Disconnected\n");
		generatedClient_slots[client_idx] = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(client_fd);
		return (null);
	}
	public static int brain_logging(Object client_idx, Object format) {
		double ms = ModernizedCProgram.hc_timer_get(ModernizedCProgram.timer_logging);
		ModernizedCProgram.hc_timer_set(ModernizedCProgram.timer_logging);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(ModernizedCProgram.mux_display, -1024);
		timeval v = new timeval();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gettimeofday(v, (null));
		Object generatedTv_sec = v.getTv_sec();
		Object generatedTv_usec = v.getTv_usec();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf(stream, "%u.%06u | %6.2fs | %3d | ", (u32)generatedTv_sec, (u32)generatedTv_usec, ms / 1000, client_idx);
		va_list ap = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(ap, format);
		int len = /*Error: Function owner not recognized*/vfprintf(stream, format, ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(ap);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ReleaseMutex(ModernizedCProgram.mux_display);
		return len;
	}
	/**
	 * Author......: See docs/credits.txt
	 * License.....: MIT
	 */
	public static void hc_timer_set(Object a) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/QueryPerformanceCounter(a);
	}
}
