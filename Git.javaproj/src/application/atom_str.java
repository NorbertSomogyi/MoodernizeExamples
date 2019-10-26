package application;

public class atom_str {
	private atom_str next_atom;
	private int str_len;
	private Object str_dat;
	
	public atom_str(atom_str next_atom, int str_len, Object str_dat) {
		setNext_atom(next_atom);
		setStr_len(str_len);
		setStr_dat(str_dat);
	}
	public atom_str() {
	}
	
	public atom_str to_atom(Object s, int len) {
		int hc = ModernizedCProgram.hc_str(s, len) % ModernizedCProgram.atom_table_sz;
		atom_str c = new atom_str();
		int generatedStr_len = c.getStr_len();
		Object generatedStr_dat = c.getStr_dat();
		atom_str generatedNext_atom = c.getNext_atom();
		for (c = ModernizedCProgram.atom_table[hc]; c; c = generatedNext_atom) {
			if (generatedStr_len == len && !.strncmp(s, generatedStr_dat, len)) {
				return c;
			} 
		}
		c = ModernizedCProgram.fi_mem_pool.mem_pool_alloc( + len + 1);
		c.setStr_len(len);
		.memcpy(generatedStr_dat, s, len);
		generatedStr_dat[len] = 0;
		c.setNext_atom(ModernizedCProgram.atom_table[hc]);
		ModernizedCProgram.atom_table[hc] = c;
		ModernizedCProgram.atom_cnt++;
		return c;
	}
	public atom_str getNext_atom() {
		return next_atom;
	}
	public void setNext_atom(atom_str newNext_atom) {
		next_atom = newNext_atom;
	}
	public int getStr_len() {
		return str_len;
	}
	public void setStr_len(int newStr_len) {
		str_len = newStr_len;
	}
	public Object getStr_dat() {
		return str_dat;
	}
	public void setStr_dat(Object newStr_dat) {
		str_dat = newStr_dat;
	}
}
