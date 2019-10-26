package application;

public class atom_value {
	private Object s;
	private Object handler;
	private Object value;
	private used_atom atom;
	
	public atom_value(Object s, Object handler, Object value, used_atom atom) {
		setS(s);
		setHandler(handler);
		setValue(value);
		setAtom(atom);
	}
	public atom_value() {
	}
	
	public void grab_date(Object buf, Object atomname) {
		byte eoemail = .strstr(buf, "> ");
		byte zone;
		timestamp_t timestamp = new timestamp_t();
		long tz;
		date_mode date_mode = new date_mode(date_mode_type.DATE_NORMAL);
		byte formatp;
		/*
			 * We got here because atomname ends in "date" or "date<something>";
			 * it's not possible that <something> is not ":<format>" because
			 * parse_ref_filter_atom() wouldn't have allowed it, so we can assume that no
			 * ":" means no format is specified, and use the default.
			 */
		formatp = .strchr(atomname, (byte)':');
		if (formatp != ((Object)0)) {
			formatp++;
			date_mode.parse_date_format(formatp);
		} 
		if (!eoemail) {
			;
		} 
		timestamp = .strtoumax(eoemail + 2, zone, 10);
		if (timestamp == -1024) {
			;
		} 
		tz = .strtol(zone, ((Object)0), 10);
		if ((tz == (--1024 - 1) || tz == -1024) && (._errno()) == 34) {
			;
		} 
		this.setS(ModernizedCProgram.xstrdup(ModernizedCProgram.show_date(timestamp, tz, date_mode)));
		this.setValue(timestamp);
		return ;
		this.setValue(0);
	}
	/* See grab_values */
	public void grab_person(Object who, int deref, Object buf) {
		int i;
		int wholen = .strlen(who);
		byte wholine = ((Object)0);
		for (i = 0; i < ModernizedCProgram.used_atom_cnt; i++) {
			byte name = used_atom[i].getName();
			atom_value v = val[i];
			if (!!deref != (name == (byte)'*')) {
				continue;
			} 
			if (deref) {
				name++;
			} 
			if (.strncmp(who, name, wholen)) {
				continue;
			} 
			if (name[wholen] != 0 && .strcmp(name + wholen, "name") && .strcmp(name + wholen, "email") && !ModernizedCProgram.starts_with(name + wholen, "date")) {
				continue;
			} 
			if (!wholine) {
				wholine = ModernizedCProgram.find_wholine(who, wholen, buf);
			} 
			if (!wholine) {
				return ;
			} 
			if (name[wholen] == 0) {
				v.setS(ModernizedCProgram.copy_line(wholine));
			}  else if (!.strcmp(name + wholen, "name")) {
				v.setS(ModernizedCProgram.copy_name(wholine));
			}  else if (!.strcmp(name + wholen, "email")) {
				v.setS(ModernizedCProgram.copy_email(wholine));
			}  else if (ModernizedCProgram.starts_with(name + wholen, "date")) {
				v.grab_date(wholine, name/*
					 * For a tag or a commit object, if "creator" or "creatordate" is
					 * requested, do something special.
					 */);
			} 
		}
		if (.strcmp(who, "tagger") && .strcmp(who, "committer")) {
			return ;
		} 
		if (!wholine) {
			wholine = ModernizedCProgram.find_wholine(who, wholen, buf);
		} 
		if (!wholine) {
			return ;
		} 
		for (i = 0; i < ModernizedCProgram.used_atom_cnt; i++) {
			byte name = used_atom[i].getName();
			atom_value v = val[i];
			if (!!deref != (name == (byte)'*')) {
				continue;
			} 
			if (deref) {
				name++;
			} 
			if (ModernizedCProgram.starts_with(name, "creatordate")) {
				v.grab_date(wholine, name);
			}  else if (!.strcmp(name, "creator")) {
				v.setS(ModernizedCProgram.copy_line(wholine));
			} 
		}
	}
	/* See grab_values */
	public void grab_sub_body_contents(int deref, Object buf) {
		int i;
		byte subpos = ((Object)0);
		byte bodypos = ((Object)0);
		byte sigpos = ((Object)0);
		long sublen = 0;
		long bodylen = 0;
		long nonsiglen = 0;
		long siglen = 0;
		Object generatedName = atom.getName();
		 generatedU = atom.getU();
		Object generatedContents = generatedU.getContents();
		for (i = 0; i < ModernizedCProgram.used_atom_cnt; i++) {
			used_atom atom = used_atom[i];
			byte name = generatedName;
			atom_value v = val[i];
			if (!!deref != (name == (byte)'*')) {
				continue;
			} 
			if (deref) {
				name++;
			} 
			if (.strcmp(name, "subject") && .strcmp(name, "body") && !ModernizedCProgram.starts_with(name, "trailers") && !ModernizedCProgram.starts_with(name, "contents")) {
				continue;
			} 
			if (!subpos) {
				ModernizedCProgram.find_subpos(buf, subpos, sublen, bodypos, bodylen, nonsiglen, sigpos, siglen);
			} 
			if (generatedContents.getOption() == .C_SUB) {
				v.setS(ModernizedCProgram.copy_subject(subpos, sublen));
			}  else if (generatedContents.getOption() == .C_BODY_DEP) {
				v.setS(ModernizedCProgram.xmemdupz(bodypos, bodylen));
			}  else if (generatedContents.getOption() == .C_BODY) {
				v.setS(ModernizedCProgram.xmemdupz(bodypos, nonsiglen));
			}  else if (generatedContents.getOption() == .C_SIG) {
				v.setS(ModernizedCProgram.xmemdupz(sigpos, siglen));
			}  else if (generatedContents.getOption() == .C_LINES) {
				strbuf s = new strbuf(, , );
				byte contents_end = bodylen + bodypos - siglen;
				s.append_lines(subpos, contents_end - subpos, generatedContents.getNlines());
				v.setS(s.strbuf_detach(((Object)0)));
			}  else if (generatedContents.getOption() == .C_TRAILERS) {
				strbuf s = new strbuf(, , );
				s.format_trailers_from_commit(subpos, generatedContents.getTrailer_opts());
				v.setS(s.strbuf_detach(((Object)0)));
			}  else if (generatedContents.getOption() == .C_BARE) {
				v.setS(ModernizedCProgram.xstrdup(subpos/*
				 * We want to have empty print-string for field requests
				 * that do not apply (e.g. "authordate" for a tag object)
				 */));
			} 
		}
	}
	public void fill_missing_values() {
		int i;
		Object generatedS = v.getS();
		for (i = 0; i < ModernizedCProgram.used_atom_cnt; i++) {
			atom_value v = val[i];
			if (generatedS == ((Object)0)) {
				v.setS(ModernizedCProgram.xstrdup(""/*
				 * val is a list of atom_value to hold returned values.  Extract
				 * the values for atoms in used_atom array out of (obj, buf, sz).
				 * when deref is false, (obj, buf, sz) is the object that is
				 * pointed at by the ref itself; otherwise it is the object the
				 * ref (which is a tag) refers to.
				 */));
			} 
		}
	}
	public Object getS() {
		return s;
	}
	public void setS(Object newS) {
		s = newS;
	}
	public Object getHandler() {
		return handler;
	}
	public void setHandler(Object newHandler) {
		handler = newHandler;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
	public used_atom getAtom() {
		return atom;
	}
	public void setAtom(used_atom newAtom) {
		atom = newAtom;
	}
}
