package application;

/* Take all paths relative to this one if non-NULL */
/* If defined, ~user notation is allowed and the string is inserted
 * after ~user/.  E.g. a request to git://host/~alice/frotz would
 * go to /home/alice/pub_git/frotz with --user-path=pub_git.
 */
/* Timeout, and initial timeout */
public class hostinfo {
	private strbuf hostname;
	private strbuf canon_hostname;
	private strbuf ip_address;
	private strbuf tcp_port;
	private int hostname_lookup_done;
	private int saw_extended_args;
	
	public hostinfo(strbuf hostname, strbuf canon_hostname, strbuf ip_address, strbuf tcp_port, int hostname_lookup_done, int saw_extended_args) {
		setHostname(hostname);
		setCanon_hostname(canon_hostname);
		setIp_address(ip_address);
		setTcp_port(tcp_port);
		setHostname_lookup_done(hostname_lookup_done);
		setSaw_extended_args(saw_extended_args);
	}
	public hostinfo() {
	}
	
	public Object get_canon_hostname() {
		hi.lookup_hostname();
		strbuf generatedCanon_hostname = this.getCanon_hostname();
		byte[] generatedBuf = generatedCanon_hostname.getBuf();
		return generatedBuf;
	}
	public Object get_ip_address() {
		hi.lookup_hostname();
		strbuf generatedIp_address = this.getIp_address();
		byte[] generatedBuf = generatedIp_address.getBuf();
		return generatedBuf;
	}
	public Object path_ok(Object directory) {
		byte[] rpath = new byte[260];
		byte[] interp_path = new byte[260];
		size_t rlen = new size_t();
		byte path;
		byte dir;
		dir = directory;
		if (ModernizedCProgram.daemon_avoid_alias(dir)) {
			ModernizedCProgram.logerror("'%s': aliased", dir);
			return ((Object)0);
		} 
		int generatedSaw_extended_args = this.getSaw_extended_args();
		byte[] generatedBuf = expanded_path.getBuf();
		if (dir == (byte)'~') {
			if (!ModernizedCProgram.user_path) {
				ModernizedCProgram.logerror("'%s': User-path not allowed", dir);
				return ((Object)0);
			} 
			if (ModernizedCProgram.user_path/* Got either "~alice" or "~alice/foo";
						 * rewrite them to "~alice/%s" or
						 * "~alice/%s/foo".
						 */) {
				int namlen;
				int restlen = /*Error: Function owner not recognized*/strlen(dir);
				byte slash = /*Error: Function owner not recognized*/strchr(dir, (byte)'/');
				if (!slash) {
					slash = dir + restlen;
				} 
				namlen = slash - dir;
				restlen -= namlen;
				ModernizedCProgram.loginfo("userpath <%s>, request <%s>, namlen %d, restlen %d, slash <%s>", ModernizedCProgram.user_path, dir, namlen, restlen, slash);
				rlen = /*Error: Function owner not recognized*/snprintf(rpath, /*Error: sizeof expression not supported yet*/, "%.*s/%s%.*s", namlen, dir, ModernizedCProgram.user_path, restlen, slash);
				if (rlen >= /*Error: sizeof expression not supported yet*/) {
					ModernizedCProgram.logerror("user-path too large: %s", rpath);
					return ((Object)0);
				} 
				dir = rpath;
			} 
		}  else if (ModernizedCProgram.interpolated_path && generatedSaw_extended_args) {
			strbuf expanded_path = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			expand_path_context context = new expand_path_context();
			ModernizedCProgram.context.setDirectory(directory);
			ModernizedCProgram.context.setHostinfo(hi);
			if (dir != (byte)'/') {
				ModernizedCProgram.logerror("'%s': Non-absolute path denied (interpolated-path active)", /* Allow only absolute */dir);
				return ((Object)0);
			} 
			expanded_path.strbuf_expand(ModernizedCProgram.interpolated_path, expand_path, ModernizedCProgram.context);
			rlen = /*Error: Function owner not recognized*/strlcpy(interp_path, generatedBuf, /*Error: sizeof expression not supported yet*/);
			if (rlen >= /*Error: sizeof expression not supported yet*/) {
				ModernizedCProgram.logerror("interpolated path too large: %s", interp_path);
				return ((Object)0);
			} 
			expanded_path.strbuf_release();
			ModernizedCProgram.loginfo("Interpolated dir '%s'", interp_path);
			dir = interp_path;
		}  else if (ModernizedCProgram.base_path) {
			if (dir != (byte)'/') {
				ModernizedCProgram.logerror("'%s': Non-absolute path denied (base-path active)", /* Allow only absolute */dir);
				return ((Object)0);
			} 
			rlen = /*Error: Function owner not recognized*/snprintf(rpath, /*Error: sizeof expression not supported yet*/, "%s%s", ModernizedCProgram.base_path, dir);
			if (rlen >= /*Error: sizeof expression not supported yet*/) {
				ModernizedCProgram.logerror("base-path too large: %s", rpath);
				return ((Object)0);
			} 
			dir = rpath;
		} 
		path = ModernizedCProgram.enter_repo(dir, ModernizedCProgram.strict_paths);
		if (!path && ModernizedCProgram.base_path && ModernizedCProgram.base_path_relaxed/*
				 * if we fail and base_path_relaxed is enabled, try without
				 * prefixing the base path
				 */) {
			dir = directory;
			path = ModernizedCProgram.enter_repo(dir, ModernizedCProgram.strict_paths);
		} 
		if (!path) {
			ModernizedCProgram.logerror("'%s' does not appear to be a git repository", dir);
			return ((Object)0);
		} 
		if (ModernizedCProgram.ok_paths && ModernizedCProgram.ok_paths) {
			byte pp;
			int pathlen = /*Error: Function owner not recognized*/strlen(path/* The validation is done on the paths after enter_repo
					 * appends optional {.git,.git/.git} and friends, but
					 * it does not use getcwd().  So if your /pub is
					 * a symlink to /mnt/pub, you can whitelist /pub and
					 * do not have to say /mnt/pub.
					 * Do not say /pub/.
					 */);
			for (pp = ModernizedCProgram.ok_paths; pp; pp++) {
				int len = /*Error: Function owner not recognized*/strlen(pp);
				if (ModernizedCProgram.len <= pathlen && !/*Error: Function owner not recognized*/memcmp(pp, path, ModernizedCProgram.len) && (path[ModernizedCProgram.len] == (byte)'\0' || (!ModernizedCProgram.strict_paths && path[ModernizedCProgram.len] == (byte)'/'))) {
					return path;
				} 
			}
		} else {
				if (!/* be backwards compatible */ModernizedCProgram.strict_paths) {
					return path;
				} 
		} 
		ModernizedCProgram.logerror("'%s': not in whitelist", path);
		return ((Object)/* Fallthrough. Deny by default */0);
	}
	public Byte parse_host_arg(Byte extra_args, int buflen) {
		byte val;
		int vallen;
		byte end = extra_args + buflen;
		strbuf generatedTcp_port = this.getTcp_port();
		strbuf generatedHostname = this.getHostname();
		if (extra_args < end && extra_args) {
			this.setSaw_extended_args(1);
			if (/*Error: Function owner not recognized*/strncasecmp("host=", extra_args, 5) == 0) {
				val = extra_args + 5;
				vallen = /*Error: Function owner not recognized*/strlen(val) + 1;
				ModernizedCProgram.loginfo("Extended attribute \"host\": %s", val);
				if (val/* Split <host>:<port> at colon. */) {
					byte host;
					byte port;
					ModernizedCProgram.parse_host_and_port(val, ModernizedCProgram.host, ModernizedCProgram.port);
					if (ModernizedCProgram.port) {
						generatedTcp_port.sanitize_client(ModernizedCProgram.port);
					} 
					generatedHostname.canonicalize_client(ModernizedCProgram.host);
					this.setHostname_lookup_done(0);
				} 
				extra_args = val + /* On to the next one */vallen;
			} 
			if (extra_args < end && extra_args) {
				ModernizedCProgram.die("Invalid request");
			} 
		} 
		return extra_args;
	}
	public void lookup_hostname() {
		int generatedHostname_lookup_done = this.getHostname_lookup_done();
		strbuf generatedHostname = this.getHostname();
		Object generatedLen = generatedHostname.getLen();
		byte[] generatedBuf = generatedHostname.getBuf();
		Object generatedAddrinfo = ai.getAddrinfo();
		Object generatedSin_addr = sin_addr.getSin_addr();
		strbuf generatedIp_address = this.getIp_address();
		strbuf generatedCanon_hostname = this.getCanon_hostname();
		if (!generatedHostname_lookup_done && generatedLen) {
			addrinfo hints = new addrinfo();
			addrinfo ai = new addrinfo();
			int gai;
			byte[] addrbuf = new byte[256 + 1];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hints, 0, /*Error: sizeof expression not supported yet*/);
			hints.setAddrinfo(AI_CANONNAME);
			gai = /*Error: Function owner not recognized*/getaddrinfo(generatedBuf, ((Object)0), hints, ai);
			if (!gai) {
				sockaddr_in sin_addr = (Object)generatedAddrinfo;
				ModernizedCProgram.inet_ntop(2, generatedSin_addr, addrbuf, /*Error: sizeof expression not supported yet*/);
				generatedIp_address.strbuf_addstr(addrbuf);
				if (generatedAddrinfo) {
					generatedCanon_hostname.sanitize_client(generatedAddrinfo);
				} else {
						generatedCanon_hostname.strbuf_addbuf(generatedIp_address);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/freeaddrinfo(ai);
			} 
			this.setHostname_lookup_done(1);
		} 
	}
	public void hostinfo_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hi, 0, /*Error: sizeof expression not supported yet*/);
		strbuf generatedHostname = this.getHostname();
		generatedHostname.strbuf_init(0);
		strbuf generatedCanon_hostname = this.getCanon_hostname();
		generatedCanon_hostname.strbuf_init(0);
		strbuf generatedIp_address = this.getIp_address();
		generatedIp_address.strbuf_init(0);
		strbuf generatedTcp_port = this.getTcp_port();
		generatedTcp_port.strbuf_init(0);
	}
	public void hostinfo_clear() {
		strbuf generatedHostname = this.getHostname();
		generatedHostname.strbuf_release();
		strbuf generatedCanon_hostname = this.getCanon_hostname();
		generatedCanon_hostname.strbuf_release();
		strbuf generatedIp_address = this.getIp_address();
		generatedIp_address.strbuf_release();
		strbuf generatedTcp_port = this.getTcp_port();
		generatedTcp_port.strbuf_release();
	}
	public strbuf getHostname() {
		return hostname;
	}
	public void setHostname(strbuf newHostname) {
		hostname = newHostname;
	}
	public strbuf getCanon_hostname() {
		return canon_hostname;
	}
	public void setCanon_hostname(strbuf newCanon_hostname) {
		canon_hostname = newCanon_hostname;
	}
	public strbuf getIp_address() {
		return ip_address;
	}
	public void setIp_address(strbuf newIp_address) {
		ip_address = newIp_address;
	}
	public strbuf getTcp_port() {
		return tcp_port;
	}
	public void setTcp_port(strbuf newTcp_port) {
		tcp_port = newTcp_port;
	}
	public int getHostname_lookup_done() {
		return hostname_lookup_done;
	}
	public void setHostname_lookup_done(int newHostname_lookup_done) {
		hostname_lookup_done = newHostname_lookup_done;
	}
	public int getSaw_extended_args() {
		return saw_extended_args;
	}
	public void setSaw_extended_args(int newSaw_extended_args) {
		saw_extended_args = newSaw_extended_args;
	}
}
