package application;

public class arg_item {
	private list_head list;
	private Byte token;
	private Byte value;
	private conf_info conf;
	
	public arg_item(list_head list, Byte token, Byte value, conf_info conf) {
		setList(list);
		setToken(token);
		setValue(value);
		setConf(conf);
	}
	public arg_item() {
	}
	
	public void free_arg_item() {
		conf_info generatedConf = this.getConf();
		Byte generatedName = generatedConf.getName();
		ModernizedCProgram.free(generatedName);
		Byte generatedKey = generatedConf.getKey();
		ModernizedCProgram.free(generatedKey);
		Byte generatedCommand = generatedConf.getCommand();
		ModernizedCProgram.free(generatedCommand);
		Byte generatedToken = this.getToken();
		ModernizedCProgram.free(generatedToken);
		Byte generatedValue = this.getValue();
		ModernizedCProgram.free(generatedValue);
		ModernizedCProgram.free(item);
	}
	public arg_item get_conf_item(Object name) {
		list_head pos = new list_head();
		arg_item item = new arg_item();
		conf_info generatedConf = item.getConf();
		Byte generatedName = generatedConf.getName();
		list_head generatedNext = pos.getNext();
		for (pos = generatedNext; pos != (ModernizedCProgram.conf_head); pos = generatedNext) {
			item = ((arg_item)((byte)(pos) - ((size_t)((arg_item)0).getList())));
			if (!.strcasecmp(generatedName, name)) {
				return item;
			} 
		}
		item = ModernizedCProgram.xcalloc(, /* Item does not already exists, create it */1);
		generatedConf.duplicate_conf(ModernizedCProgram.default_conf_info);
		generatedConf.setName(ModernizedCProgram.xstrdup(name));
		list_head generatedList = item.getList();
		generatedList.list_add_tail(ModernizedCProgram.conf_head);
		return item;
	}
	public Object token_from_item(Byte tok) {
		conf_info generatedConf = this.getConf();
		Byte generatedKey = generatedConf.getKey();
		if (generatedKey) {
			return generatedKey;
		} 
		if (tok) {
			return tok;
		} 
		Byte generatedName = generatedConf.getName();
		return generatedName;
	}
	public int token_matches_item(Object tok, Object tok_len) {
		conf_info generatedConf = this.getConf();
		Byte generatedName = generatedConf.getName();
		if (!.strncasecmp(tok, generatedName, tok_len)) {
			return 1;
		} 
		Byte generatedKey = generatedConf.getKey();
		return generatedKey ? !.strncasecmp(tok, generatedKey, tok_len) : 0/*
		 * If the given line is of the form
		 * "<token><optional whitespace><separator>..." or "<separator>...", return the
		 * location of the separator. Otherwise, return -1.  The optional whitespace
		 * is allowed there primarily to allow things like "Bug #43" where <token> is
		 * "Bug" and <separator> is "#".
		 *
		 * The separator-starts-line case (in which this function returns 0) is
		 * distinguished from the non-well-formed-line case (in which this function
		 * returns -1) because some callers of this function need such a distinction.
		 */;
	}
	public list_head getList() {
		return list;
	}
	public void setList(list_head newList) {
		list = newList;
	}
	public Byte getToken() {
		return token;
	}
	public void setToken(Byte newToken) {
		token = newToken;
	}
	public Byte getValue() {
		return value;
	}
	public void setValue(Byte newValue) {
		value = newValue;
	}
	public conf_info getConf() {
		return conf;
	}
	public void setConf(conf_info newConf) {
		conf = newConf;
	}
}
