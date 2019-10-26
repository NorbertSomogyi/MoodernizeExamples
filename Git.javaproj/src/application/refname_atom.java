package application;

public class refname_atom {
	private  option;
	private int lstrip;
	private int rstrip;
	
	public refname_atom( option, int lstrip, int rstrip) {
		setOption(option);
		setLstrip(lstrip);
		setRstrip(rstrip);
	}
	public refname_atom() {
	}
	
	public Object show_ref(Object refname) {
		 generatedOption = this.getOption();
		int generatedLstrip = this.getLstrip();
		int generatedRstrip = this.getRstrip();
		if (generatedOption == .R_SHORT) {
			return ModernizedCProgram.shorten_unambiguous_ref(refname, ModernizedCProgram.warn_ambiguous_refs);
		}  else if (generatedOption == .R_LSTRIP) {
			return ModernizedCProgram.lstrip_ref_components(refname, generatedLstrip);
		}  else if (generatedOption == .R_RSTRIP) {
			return ModernizedCProgram.rstrip_ref_components(refname, generatedRstrip);
		} else {
				return ModernizedCProgram.xstrdup(refname);
		} 
		if (ModernizedCProgram.show_head && !.strcmp(refname, "HEAD")) {
			;
		} 
		if (ModernizedCProgram.tags_only || ModernizedCProgram.heads_only) {
			int match;
			match = ModernizedCProgram.heads_only && ModernizedCProgram.starts_with(refname, "refs/heads/");
			match |=  ModernizedCProgram.tags_only && ModernizedCProgram.starts_with(refname, "refs/tags/");
			if (!match) {
				return 0;
			} 
		} 
		if (ModernizedCProgram.pattern) {
			int reflen = .strlen(refname);
			byte p = ModernizedCProgram.pattern;
			byte m;
			while ((m = p++) != ((Object)0)) {
				int len = .strlen(m);
				if (ModernizedCProgram.len > reflen) {
					continue;
				} 
				if (.memcmp(m, refname + reflen - ModernizedCProgram.len, ModernizedCProgram.len)) {
					continue;
				} 
				if (ModernizedCProgram.len == reflen) {
					;
				} 
				if (refname[reflen - ModernizedCProgram.len - 1] == (byte)'/') {
					;
				} 
			}
			return 0;
		} 
		ModernizedCProgram.show_one(refname, oid);
		return 0;
		byte generatedBuf = cap.getBuf();
		if (ModernizedCProgram.sent_capabilities) {
			ModernizedCProgram.packet_write_fmt(1, "%s %s\n", ModernizedCProgram.oid_to_hex(oid), ModernizedCProgram.path);
		} else {
				strbuf cap = new strbuf(, , );
				cap.strbuf_addstr("report-status delete-refs side-band-64k quiet");
				if (ModernizedCProgram.advertise_atomic_push) {
					cap.strbuf_addstr(" atomic");
				} 
				if (ModernizedCProgram.prefer_ofs_delta) {
					cap.strbuf_addstr(" ofs-delta");
				} 
				if (ModernizedCProgram.push_cert_nonce) {
					cap.strbuf_addf(" push-cert=%s", ModernizedCProgram.push_cert_nonce);
				} 
				if (ModernizedCProgram.advertise_push_options) {
					cap.strbuf_addstr(" push-options");
				} 
				cap.strbuf_addf(" agent=%s", ModernizedCProgram.git_user_agent_sanitized());
				ModernizedCProgram.packet_write_fmt(1, "%s %s%c%s\n", ModernizedCProgram.oid_to_hex(oid), ModernizedCProgram.path, 0, generatedBuf);
				cap.strbuf_release();
				ModernizedCProgram.sent_capabilities = 1;
		} 
	}
	public  getOption() {
		return option;
	}
	public void setOption( newOption) {
		option = newOption;
	}
	public int getLstrip() {
		return lstrip;
	}
	public void setLstrip(int newLstrip) {
		lstrip = newLstrip;
	}
	public int getRstrip() {
		return rstrip;
	}
	public void setRstrip(int newRstrip) {
		rstrip = newRstrip;
	}
}
