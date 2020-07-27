package application;

public class xml_ctx {
	private Byte name;
	private int len;
	private Byte cdata;
	private Object userFunc;
	private Object userData;
	
	public xml_ctx(Byte name, int len, Byte cdata, Object userFunc, Object userData) {
		setName(name);
		setLen(len);
		setCdata(cdata);
		setUserFunc(userFunc);
		setUserData(userData);
	}
	public xml_ctx() {
	}
	
	public void handle_lockprop_ctx(int tag_closed) {
		int lock_flags = (int)ModernizedCProgram.ctx.getUserData();
		if (tag_closed) {
			if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ctx.getName(), ".multistatus.response.propstat.prop.supportedlock.lockentry")) {
				if ((lock_flags & (-1024 << 1)) && (lock_flags & (-1024 << 0))) {
					lock_flags |=  (-1024 << 2);
				} 
				lock_flags &=  (-1024 << 2);
			}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ctx.getName(), ".multistatus.response.propstat.prop.supportedlock.lockentry.locktype.write")) {
				lock_flags |=  (-1024 << 0);
			}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ctx.getName(), ".multistatus.response.propstat.prop.supportedlock.lockentry.lockscope.exclusive")) {
				lock_flags |=  (-1024 << 1);
			} 
		} 
	}
	public void handle_new_lock_ctx(int tag_closed) {
		remote_lock lock = (remote_lock)ModernizedCProgram.ctx.getUserData();
		git_hash_ctx hash_ctx = new git_hash_ctx();
		byte[] lock_token_hash = new byte[32];
		Byte generatedToken = lock.getToken();
		Object generatedTmpfile_suffix = lock.getTmpfile_suffix();
		if (tag_closed && ModernizedCProgram.ctx.getCdata()) {
			if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ctx.getName(), ".prop.lockdiscovery.activelock.owner.href")) {
				lock.setOwner(ModernizedCProgram.xstrdup(ModernizedCProgram.ctx.getCdata()));
			}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ctx.getName(), ".prop.lockdiscovery.activelock.timeout")) {
				byte arg;
				if (ModernizedCProgram.skip_prefix(ModernizedCProgram.ctx.getCdata(), "Second-", arg)) {
					lock.setTimeout(/*Error: Function owner not recognized*/strtol(arg, ((Object)0), 10));
				} 
			}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ctx.getName(), ".prop.lockdiscovery.activelock.locktoken.href")) {
				lock.setToken(ModernizedCProgram.xstrdup(ModernizedCProgram.ctx.getCdata()));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(hash_ctx);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(hash_ctx, generatedToken, /*Error: Function owner not recognized*/strlen(generatedToken));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(lock_token_hash, hash_ctx);
				generatedTmpfile_suffix[0] = (byte)'_';
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedTmpfile_suffix + 1, ModernizedCProgram.hash_to_hex(lock_token_hash), ModernizedCProgram.the_repository.getHash_algo().getHexsz());
			} 
		} 
	}
	public void handle_remote_ls_ctx(int tag_closed) {
		remote_ls_ctx ls = (remote_ls_ctx)ModernizedCProgram.ctx.getUserData();
		Byte generatedDentry_name = ls.getDentry_name();
		int generatedDentry_flags = ls.getDentry_flags();
		int generatedFlags = ls.getFlags();
		Byte generatedPath = ls.getPath();
		Object generatedUserFunc = ls.getUserFunc();
		Object generatedUserData = ls.getUserData();
		if (tag_closed) {
			if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ctx.getName(), ".multistatus.response") && generatedDentry_name) {
				if (generatedDentry_flags & (-1024 << 0)) {
					ModernizedCProgram.str_end_url_with_slash(generatedDentry_name, generatedDentry_name);
					if (generatedFlags & (-1024 << 1)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ls);
					} 
					if (/*Error: Function owner not recognized*/strcmp(generatedDentry_name, generatedPath) && generatedFlags & (-1024 << 2)) {
						ModernizedCProgram.remote_ls(generatedDentry_name, generatedFlags, generatedUserFunc, generatedUserData);
					} 
				}  else if (generatedFlags & (-1024 << 0)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ls);
				} 
			}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ctx.getName(), ".multistatus.response.href") && ModernizedCProgram.ctx.getCdata()) {
				byte path = ModernizedCProgram.ctx.getCdata();
				if (ModernizedCProgram.ctx.getCdata() == (byte)'h') {
					ModernizedCProgram.path = /*Error: Function owner not recognized*/strstr(ModernizedCProgram.path, "//");
					if (ModernizedCProgram.path) {
						ModernizedCProgram.path = /*Error: Function owner not recognized*/strchr(ModernizedCProgram.path + 2, (byte)'/');
					} 
				} 
				if (ModernizedCProgram.path) {
					byte url = ModernizedCProgram.repo.getUrl();
					if (generatedPath) {
						ModernizedCProgram.url = generatedPath;
					} 
					if (/*Error: Function owner not recognized*/strncmp(ModernizedCProgram.path, ModernizedCProgram.url, ModernizedCProgram.repo.getPath_len())) {
						();
					} else {
							ModernizedCProgram.path += ModernizedCProgram.repo.getPath_len();
							ls.setDentry_name(ModernizedCProgram.xstrdup(ModernizedCProgram.path));
					} 
				} 
			}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ctx.getName(), ".multistatus.response.propstat.prop.resourcetype.collection")) {
				generatedDentry_flags |=  (-1024 << 0);
			} 
		}  else if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.ctx.getName(), ".multistatus.response")) {
			do {
				ModernizedCProgram.free(generatedDentry_name);
				(generatedDentry_name) = ((Object)0);
			} while (0);
			ls.setDentry_flags(0/*
			 * NEEDSWORK: remote_ls() ignores info/refs on the remote side.  But it
			 * should _only_ heed the information from that file, instead of trying to
			 * determine the refs from the remote file system (badly: it does not even
			 * know about packed-refs).
			 */);
		} 
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public Byte getCdata() {
		return cdata;
	}
	public void setCdata(Byte newCdata) {
		cdata = newCdata;
	}
	public Object getUserFunc() {
		return userFunc;
	}
	public void setUserFunc(Object newUserFunc) {
		userFunc = newUserFunc;
	}
	public Object getUserData() {
		return userData;
	}
	public void setUserData(Object newUserData) {
		userData = newUserData;
	}
}
