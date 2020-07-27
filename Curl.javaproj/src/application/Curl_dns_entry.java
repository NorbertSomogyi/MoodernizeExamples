package application;

public class Curl_dns_entry {
	private Curl_addrinfo addr;
	private Object timestamp;
	private long inuse;
	
	public Curl_dns_entry(Curl_addrinfo addr, Object timestamp, long inuse) {
		setAddr(addr);
		setTimestamp(timestamp);
		setInuse(inuse);
	}
	public Curl_dns_entry() {
	}
	
	public Curl_dns_entry fetch_addr(connectdata conn, Object hostname, int port) {
		Curl_dns_entry dns = ((Object)0);
		size_t entry_len = new size_t();
		Curl_easy generatedData = conn.getData();
		Curl_easy data = generatedData;
		byte[] entry_id = new byte[(255 + 7)];
		ModernizedCProgram.create_hostcache_id(hostname, port, entry_id, /*Error: sizeof expression not supported yet*/);
		entry_len = /*Error: Function owner not recognized*/strlen(entry_id);
		Names generatedDns = data.getDns();
		curl_hash generatedHostcache = generatedDns.getHostcache();
		dns = generatedHostcache.Curl_hash_pick(entry_id, entry_len + /* See if its already in our dns cache */1);
		DynamicStatic generatedChange = data.getChange();
		Object generatedWildcard_resolve = generatedChange.getWildcard_resolve();
		if (!dns && generatedWildcard_resolve) {
			ModernizedCProgram.create_hostcache_id("*", port, entry_id, /*Error: sizeof expression not supported yet*/);
			entry_len = /*Error: Function owner not recognized*/strlen(entry_id);
			dns = generatedHostcache.Curl_hash_pick(entry_id, entry_len + /* See if it's already in our dns cache */1);
		} 
		UserDefined generatedSet = data.getSet();
		long generatedDns_cache_timeout = generatedSet.getDns_cache_timeout();
		Object generatedNow = user.getNow();
		if (dns && (generatedDns_cache_timeout != -1/* See whether the returned entry is stale. Done before we release lock */)) {
			hostcache_prune_data user = new hostcache_prune_data();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/time(generatedNow);
			user.setCache_timeout(generatedDns_cache_timeout);
			if (ModernizedCProgram.hostcache_timestamp_remove(user, dns)) {
				data.Curl_infof("Hostname in DNS cache was stale, zapped\n");
				dns = ((Object)/* the memory deallocation is being handled by the hash */0);
				generatedHostcache.Curl_hash_delete(entry_id, entry_len + 1);
			} 
		} 
		return dns/*
		 * Curl_fetch_addr() fetches a 'Curl_dns_entry' already in the DNS cache.
		 *
		 * Curl_resolv() checks initially and multi_runsingle() checks each time
		 * it discovers the handle in the state WAITRESOLVE whether the hostname
		 * has already been resolved and the address has already been stored in
		 * the DNS cache. This short circuits waiting for a lot of pending
		 * lookups for the same hostname requested by different handles.
		 *
		 * Returns the Curl_dns_entry entry pointer or NULL if not in the cache.
		 *
		 * The returned data *MUST* be "unlocked" with Curl_resolv_unlock() after
		 * use, or we'll leak memory!
		 */;
	}
	public Curl_dns_entry Curl_fetch_addr(connectdata conn, Object hostname, int port) {
		Curl_easy generatedData = conn.getData();
		Curl_easy data = generatedData;
		Curl_dns_entry dns = ((Object)0);
		Curl_share generatedShare = data.getShare();
		if (generatedShare) {
			data.Curl_share_lock(CURL_LOCK_DATA_DNS, CURL_LOCK_ACCESS_SINGLE);
		} 
		Curl_dns_entry curl_dns_entry = new Curl_dns_entry();
		dns = curl_dns_entry.fetch_addr(conn, hostname, port);
		long generatedInuse = dns.getInuse();
		if (dns) {
			generatedInuse++;
		} 
		if (generatedShare) {
			data.Curl_share_unlock(CURL_LOCK_DATA_DNS);
		} 
		return dns;
	}
	public Curl_dns_entry Curl_cache_addr(Curl_easy data, Curl_addrinfo addr, Object hostname, int port) {
		byte[] entry_id = new byte[(255 + 7)];
		size_t entry_len = new size_t();
		Curl_dns_entry dns = new Curl_dns_entry();
		Curl_dns_entry dns2 = new Curl_dns_entry();
		UserDefined generatedSet = data.getSet();
		Object generatedDns_shuffle_addresses = generatedSet.getDns_shuffle_addresses();
		if (generatedDns_shuffle_addresses) {
			 result = ModernizedCProgram.Curl_shuffle_addr(data, addr);
			if (ModernizedCProgram.result) {
				return ((Object)0);
			} 
		} 
		dns = /*Error: Function owner not recognized*/Curl_ccalloc(1, /*Error: Unsupported expression*//* Create a new cache entry */);
		if (!dns) {
			return ((Object)0);
		} 
		ModernizedCProgram.create_hostcache_id(hostname, port, entry_id, /*Error: sizeof expression not supported yet*/);
		entry_len = /*Error: Function owner not recognized*/strlen(entry_id);
		dns.setInuse(/* the cache has the first reference */1);
		dns.setAddr(/* this is the address(es) */addr);
		Object generatedTimestamp = dns.getTimestamp();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/time(generatedTimestamp);
		if (generatedTimestamp == 0) {
			dns.setTimestamp(/* zero indicates CURLOPT_RESOLVE entry */1);
		} 
		Names generatedDns = data.getDns();
		curl_hash generatedHostcache = generatedDns.getHostcache();
		dns2 = generatedHostcache.Curl_hash_add(entry_id, entry_len + /* Store the resolved data in our DNS cache. */1, (Object)dns);
		if (!dns2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(dns);
			return ((Object)0);
		} 
		dns = dns2;
		long generatedInuse = dns.getInuse();
		generatedInuse++;
		return dns/*
		 * Curl_resolv() is the main name resolve function within libcurl. It resolves
		 * a name and returns a pointer to the entry in the 'entry' argument (if one
		 * is provided). This function might return immediately if we're using asynch
		 * resolves. See the return codes.
		 *
		 * The cache entry we return will get its 'inuse' counter increased when this
		 * function is used. You MUST call Curl_resolv_unlock() later (when you're
		 * done using this struct) to decrease the counter again.
		 *
		 * In debug mode, we specifically test for an interface name "LocalHost"
		 * and resolve "localhost" instead as a means to permit test cases
		 * to connect to a local test server with any host name.
		 *
		 * Return codes:
		 *
		 * CURLRESOLV_ERROR   (-1) = error, no pointer
		 * CURLRESOLV_RESOLVED (0) = OK, pointer provided
		 * CURLRESOLV_PENDING  (1) = waiting for response, no pointer
		 */;
	}
	public Curl_addrinfo getAddr() {
		return addr;
	}
	public void setAddr(Curl_addrinfo newAddr) {
		addr = newAddr;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public long getInuse() {
		return inuse;
	}
	public void setInuse(long newInuse) {
		inuse = newInuse;
	}
}
/*
 * Curl_ipv6works() returns TRUE if IPv6 seems to work.
 */
