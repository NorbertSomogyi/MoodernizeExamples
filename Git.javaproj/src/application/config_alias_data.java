package application;

public class config_alias_data {
	private Object alias;
	private Byte v;
	private string_list list;
	
	public config_alias_data(Object alias, Byte v, string_list list) {
		setAlias(alias);
		setV(v);
		setList(list);
	}
	public config_alias_data() {
	}
	
	public Object getAlias() {
		return alias;
	}
	public void setAlias(Object newAlias) {
		alias = newAlias;
	}
	public Byte getV() {
		return v;
	}
	public void setV(Byte newV) {
		v = newV;
	}
	public string_list getList() {
		return list;
	}
	public void setList(string_list newList) {
		list = newList;
	}
}
