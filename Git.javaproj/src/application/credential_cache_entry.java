package application;

public class credential_cache_entry {
	private credential item;
	private Object expiration;
	
	public credential_cache_entry(credential item, Object expiration) {
		setItem(item);
		setExpiration(expiration);
	}
	public credential_cache_entry() {
	}
	
	public credential_cache_entry lookup_credential(Object c) {
		int i;
		for (i = 0; i < ModernizedCProgram.entries_nr; i++) {
			credential e = ModernizedCProgram.entries[i].getItem();
			if (.credential_match(c, e)) {
				return ModernizedCProgram.entries[i];
			} 
		}
		return ((Object)0);
		string_list_item fn = new string_list_item();
		byte generatedString = fn.getString();
		for (fn = (fns).getItems(); fn && fn < (fns).getItems() + (fns).getNr(); ++fn) {
			if (c.parse_credential_file(generatedString, print_entry, ((Object)0))) {
				return ;
			} 
		}
	}
	public credential getItem() {
		return item;
	}
	public void setItem(credential newItem) {
		item = newItem;
	}
	public Object getExpiration() {
		return expiration;
	}
	public void setExpiration(Object newExpiration) {
		expiration = newExpiration;
	}
}
