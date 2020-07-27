package application;

/* nothing */
public class credentials {
	private passwd pass;
	private Object gid;
	
	public credentials(passwd pass, Object gid) {
		setPass(pass);
		setGid(gid);
	}
	public credentials() {
	}
	
	public void drop_privileges() {
		passwd generatedPass = this.getPass();
		Object generatedPasswd = generatedPass.getPasswd();
		Object generatedGid = this.getGid();
		if (cred && (/*Error: Function owner not recognized*/initgroups(generatedPasswd, generatedGid) || /*Error: Function owner not recognized*/setgid(generatedGid) || /*Error: Function owner not recognized*/setuid(generatedPasswd))) {
			ModernizedCProgram.die("cannot drop privileges");
		} 
	}
	public credentials prepare_credentials(Object user_name, Object group_name) {
		credentials c = new credentials();
		passwd passwd = new passwd();
		c.setPass(passwd.getpwnam(user_name));
		passwd generatedPass = c.getPass();
		if (!generatedPass) {
			ModernizedCProgram.die("user not found - %s", user_name);
		} 
		Object generatedPasswd = generatedPass.getPasswd();
		Object generatedGroup = group.getGroup();
		if (!group_name) {
			c.setGid(generatedPasswd);
		} else {
				group group = /*Error: Function owner not recognized*/getgrnam(group_name);
				if (!group) {
					ModernizedCProgram.die("group not found - %s", group_name);
				} 
				c.setGid(generatedGroup);
		} 
		return c;
	}
	public passwd getPass() {
		return pass;
	}
	public void setPass(passwd newPass) {
		pass = newPass;
	}
	public Object getGid() {
		return gid;
	}
	public void setGid(Object newGid) {
		gid = newGid;
	}
}
