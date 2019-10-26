package application;

public class trailer_item {
	private list_head list;
	private Byte token;
	private Byte value;
	
	public trailer_item(list_head list, Byte token, Byte value) {
		setList(list);
		setToken(token);
		setValue(value);
	}
	public trailer_item() {
	}
	
	public void free_trailer_item() {
		Byte generatedToken = this.getToken();
		ModernizedCProgram.free(generatedToken);
		Byte generatedValue = this.getValue();
		ModernizedCProgram.free(generatedValue);
		ModernizedCProgram.free(item);
	}
	public trailer_item trailer_from_arg(arg_item arg_tok) {
		trailer_item new_item = ModernizedCProgram.xcalloc(, 1);
		Byte generatedToken = arg_tok.getToken();
		new_item.setToken(generatedToken);
		Byte generatedValue = arg_tok.getValue();
		new_item.setValue(generatedValue);
		arg_tok.setToken(arg_tok.setValue(((Object)0)));
		arg_tok.free_arg_item();
		return new_item;
	}
	public trailer_item add_trailer_item(list_head head, Byte tok, Byte val) {
		trailer_item new_item = ModernizedCProgram.xcalloc(, 1);
		new_item.setToken(tok);
		new_item.setValue(val);
		list_head generatedList = new_item.getList();
		generatedList.list_add_tail(head);
		return new_item;
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
}
