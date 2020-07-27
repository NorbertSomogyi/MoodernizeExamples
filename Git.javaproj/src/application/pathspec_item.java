package application;

public class pathspec_item {
	private Byte match;
	private Byte original;
	private int magic;
	private int len;
	private int prefix;
	private int nowildcard_len;
	private int flags;
	private int attr_match_nr;
	private attr_match[] attr_match;
	private attr_check attr_check;
	
	public pathspec_item(Byte match, Byte original, int magic, int len, int prefix, int nowildcard_len, int flags, int attr_match_nr, attr_match[] attr_match, attr_check attr_check) {
		setMatch(match);
		setOriginal(original);
		setMagic(magic);
		setLen(len);
		setPrefix(prefix);
		setNowildcard_len(nowildcard_len);
		setFlags(flags);
		setAttr_match_nr(attr_match_nr);
		setAttr_match(attr_match);
		setAttr_check(attr_check);
	}
	public pathspec_item() {
	}
	
	public void parse_pathspec_attr_match(Object value) {
		string_list_item si = new string_list_item();
		string_list list = new string_list(((Object)0), 0, 0, 1, ((Object)0));
		Object generatedPathspec_item = this.getPathspec_item();
		if (generatedPathspec_item || generatedPathspec_item) {
			ModernizedCProgram.die(ModernizedCProgram._("Only one 'attr:' specification is allowed."));
		} 
		if (!value || !value) {
			ModernizedCProgram.die(ModernizedCProgram._("attr spec must not be empty"));
		} 
		list.string_list_split(value, (byte)' ', -1);
		list.string_list_remove_empty_items(0);
		attr_check attr_check = new attr_check();
		this.setPathspec_item(attr_check.attr_check_alloc());
		int generatedNr = list.getNr();
		this.setPathspec_item(ModernizedCProgram.xcalloc(generatedNr, /*Error: Unsupported expression*/));
		string_list_item[] generatedItems = (list).getItems();
		byte[] generatedString = si.getString();
		attr_check_item attr_check_item = new attr_check_item();
		for (si = generatedItems; si && si < generatedItems + generatedNr; ++si) {
			size_t attr_len = new size_t();
			byte attr_name;
			git_attr a = new git_attr();
			int j = generatedPathspec_item++;
			byte attr = generatedString;
			attr_match am = generatedPathspec_item[j];
			switch (ModernizedCProgram.attr) {
			case (byte)'!':
					am.setMatch_mode(attr_match_mode.MATCH_UNSPECIFIED);
					ModernizedCProgram.attr++;
					attr_len = /*Error: Function owner not recognized*/strlen(ModernizedCProgram.attr);
					break;
			case (byte)'-':
					am.setMatch_mode(attr_match_mode.MATCH_UNSET);
					ModernizedCProgram.attr++;
					attr_len = /*Error: Function owner not recognized*/strlen(ModernizedCProgram.attr);
					break;
			default:
					attr_len = /*Error: Function owner not recognized*/strcspn(ModernizedCProgram.attr, "=");
					if (ModernizedCProgram.attr[attr_len] != (byte)'=') {
						am.setMatch_mode(attr_match_mode.MATCH_SET);
					} else {
							byte v = ModernizedCProgram.attr[attr_len + 1];
							am.setMatch_mode(attr_match_mode.MATCH_VALUE);
							am.setValue(ModernizedCProgram.attr_value_unescape(v));
					} 
					break;
			}
			attr_name = ModernizedCProgram.xmemdupz(ModernizedCProgram.attr, attr_len);
			a = ModernizedCProgram.git_attr(attr_name);
			if (!a) {
				ModernizedCProgram.die(ModernizedCProgram._("invalid attribute name %s"), attr_name);
			} 
			attr_check_item.attr_check_append(generatedPathspec_item, a);
			ModernizedCProgram.free(attr_name);
		}
		if (generatedNr != generatedPathspec_item) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pathspec.c", 200, "should have same number of entries");
		} 
		list.string_list_clear(0);
	}
	public Object parse_long_magic(Integer magic, Integer prefix_len, Object elem) {
		byte pos;
		byte nextat;
		for (pos = elem + 2; pos && pos != (byte)')'; pos = nextat) {
			size_t len = ModernizedCProgram.strcspn_escaped(pos, ",)");
			int i;
			if (pos[ModernizedCProgram.len] == (byte)',') {
				nextat = pos + ModernizedCProgram.len + /* handle ',' */1;
			} else {
					nextat = pos + /* handle ')' and '\0' */ModernizedCProgram.len;
			} 
			if (!ModernizedCProgram.len) {
				continue;
			} 
			if (ModernizedCProgram.starts_with(pos, "prefix:")) {
				byte endptr;
				prefix_len = /*Error: Function owner not recognized*/strtol(pos + 7, endptr, 10);
				if (endptr - pos != ModernizedCProgram.len) {
					ModernizedCProgram.die(ModernizedCProgram._("invalid parameter for pathspec magic 'prefix'"));
				} 
				continue;
			} 
			if (ModernizedCProgram.starts_with(pos, "attr:")) {
				byte attr_body = ModernizedCProgram.xmemdupz(pos + 5, ModernizedCProgram.len - 5);
				item.parse_pathspec_attr_match(attr_body);
				magic |=  (1 << 6);
				ModernizedCProgram.free(attr_body);
				continue;
			} 
			for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
				if (/*Error: Function owner not recognized*/strlen(pathspec_magic[i].getName()) == ModernizedCProgram.len && !/*Error: Function owner not recognized*/strncmp(pathspec_magic[i].getName(), pos, ModernizedCProgram.len)) {
					magic |=  pathspec_magic[i].getBit();
					break;
				} 
			}
			if ((/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)) <= i) {
				ModernizedCProgram.die(ModernizedCProgram._("Invalid pathspec magic '%.*s' in '%s'"), (int)ModernizedCProgram.len, pos, elem);
			} 
		}
		if (pos != (byte)')') {
			ModernizedCProgram.die(ModernizedCProgram._("Missing ')' at the end of pathspec magic in '%s'"), elem);
		} 
		pos++;
		return pos/*
		 * Parse the pathspec element looking for short magic
		 *
		 * saves all magic in 'magic'
		 * returns the position in 'elem' after all magic has been parsed
		 */;
	}
	public Object parse_element_magic(Integer magic, Integer prefix_len, Object[] elem) {
		if (elem[0] != (byte)':' || ModernizedCProgram.get_literal_global()) {
			return /* nothing to do */elem;
		}  else if (elem[1] == (byte)'(') {
			return item.parse_long_magic(magic, prefix_len, /* longhand */elem);
		} else {
				return ModernizedCProgram.parse_short_magic(magic, /* shorthand */elem/*
				 * Perform the initialization of a pathspec_item based on a pathspec element.
				 */);
		} 
	}
	public void init_pathspec_item(int flags, Object prefix, int prefixlen, Object elt) {
		int magic = 0;
		int element_magic = 0;
		byte copyfrom = elt;
		byte match;
		int pathspec_prefix = -1;
		this.setPathspec_item(((Object)0));
		this.setPathspec_item(((Object)0));
		this.setPathspec_item(0);
		if (flags & (1 << /* PATHSPEC_LITERAL_PATH ignores magic */6)) {
			magic = (1 << 2);
		} else {
				copyfrom = item.parse_element_magic(element_magic, pathspec_prefix, elt);
				magic |=  element_magic;
				magic |=  ModernizedCProgram.get_global_magic(element_magic);
		} 
		this.setPathspec_item(magic);
		if (pathspec_prefix >= 0 && (prefixlen || (prefix && prefix))) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pathspec.c", 424, "'prefix' magic is supposed to be used at worktree's root");
		} 
		if ((magic & (1 << 2)) && (magic & (1 << 3))) {
			ModernizedCProgram.die(ModernizedCProgram._("%s: 'literal' and 'glob' are incompatible"), elt);
		} 
		if (pathspec_prefix >= /* Create match string which will be used for pathspec matching */0) {
			match = ModernizedCProgram.xstrdup(copyfrom);
			prefixlen = pathspec_prefix;
		}  else if (magic & (1 << 0)) {
			match = ModernizedCProgram.xstrdup(copyfrom);
			prefixlen = 0;
		} else {
				match = ModernizedCProgram.prefix_path_gently(prefix, prefixlen, prefixlen, copyfrom);
				if (!match) {
					ModernizedCProgram.die(ModernizedCProgram._("%s: '%s' is outside repository"), elt, copyfrom);
				} 
		} 
		this.setPathspec_item(match);
		Object generatedPathspec_item = this.getPathspec_item();
		this.setPathspec_item(/*Error: Function owner not recognized*/strlen(generatedPathspec_item));
		this.setPathspec_item(prefixlen/*
			 * Prefix the pathspec (keep all magic) and assign to
			 * original. Useful for passing to another command.
			 */);
		if ((flags & (1 << 4)) && !ModernizedCProgram.get_literal_global()) {
			strbuf sb = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			sb.prefix_magic(prefixlen, /* Preserve the actual prefix length of each pattern */element_magic);
			sb.strbuf_addstr(match);
			this.setPathspec_item(sb.strbuf_detach(((Object)0)));
		} else {
				this.setPathspec_item(ModernizedCProgram.xstrdup(elt));
		} 
		if (magic & (1 << 2)) {
			this.setPathspec_item(generatedPathspec_item);
		} else {
				this.setPathspec_item(ModernizedCProgram.simple_length(generatedPathspec_item));
				if (generatedPathspec_item < prefixlen) {
					this.setPathspec_item(prefixlen);
				} 
		} 
		this.setPathspec_item(0);
		if (magic & (1 << 3/*
				 * FIXME: should we enable ONESTAR in _GLOB for
				 * pattern "* * / * . c"?
				 */)) {
		} else {
				if (generatedPathspec_item < generatedPathspec_item && generatedPathspec_item[generatedPathspec_item] == (byte)'*' && ModernizedCProgram.no_wildcard(generatedPathspec_item + generatedPathspec_item + 1)) {
					generatedPathspec_item |=  1;
				} 
		} 
		if (generatedPathspec_item > generatedPathspec_item || generatedPathspec_item > generatedPathspec_item) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\pathspec.c", 488, "error initializing pathspec_item");
		} 
	}
	public Byte getMatch() {
		return match;
	}
	public void setMatch(Byte newMatch) {
		match = newMatch;
	}
	public Byte getOriginal() {
		return original;
	}
	public void setOriginal(Byte newOriginal) {
		original = newOriginal;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int newMagic) {
		magic = newMagic;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public int getPrefix() {
		return prefix;
	}
	public void setPrefix(int newPrefix) {
		prefix = newPrefix;
	}
	public int getNowildcard_len() {
		return nowildcard_len;
	}
	public void setNowildcard_len(int newNowildcard_len) {
		nowildcard_len = newNowildcard_len;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public int getAttr_match_nr() {
		return attr_match_nr;
	}
	public void setAttr_match_nr(int newAttr_match_nr) {
		attr_match_nr = newAttr_match_nr;
	}
	public attr_match[] getAttr_match() {
		return attr_match;
	}
	public void setAttr_match(attr_match[] newAttr_match) {
		attr_match = newAttr_match;
	}
	public attr_check getAttr_check() {
		return attr_check;
	}
	public void setAttr_check(attr_check newAttr_check) {
		attr_check = newAttr_check;
	}
}
/* PATHSPEC_H */
