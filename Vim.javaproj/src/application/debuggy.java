package application;

// Profiling uses file and func names similar to breakpoints.
public class debuggy {
	private int dbg_nr;
	private int dbg_type;
	private Object dbg_name;
	private regprog dbg_prog;
	private Object dbg_lnum;
	private int dbg_forceit;
	private  dbg_val;
	private int dbg_level;
	
	public debuggy(int dbg_nr, int dbg_type, Object dbg_name, regprog dbg_prog, Object dbg_lnum, int dbg_forceit,  dbg_val, int dbg_level) {
		setDbg_nr(dbg_nr);
		setDbg_type(dbg_type);
		setDbg_name(dbg_name);
		setDbg_prog(dbg_prog);
		setDbg_lnum(dbg_lnum);
		setDbg_forceit(dbg_forceit);
		setDbg_val(dbg_val);
		setDbg_level(dbg_level);
	}
	public debuggy() {
	}
	
	public int getDbg_nr() {
		return dbg_nr;
	}
	public void setDbg_nr(int newDbg_nr) {
		dbg_nr = newDbg_nr;
	}
	public int getDbg_type() {
		return dbg_type;
	}
	public void setDbg_type(int newDbg_type) {
		dbg_type = newDbg_type;
	}
	public Object getDbg_name() {
		return dbg_name;
	}
	public void setDbg_name(Object newDbg_name) {
		dbg_name = newDbg_name;
	}
	public regprog getDbg_prog() {
		return dbg_prog;
	}
	public void setDbg_prog(regprog newDbg_prog) {
		dbg_prog = newDbg_prog;
	}
	public Object getDbg_lnum() {
		return dbg_lnum;
	}
	public void setDbg_lnum(Object newDbg_lnum) {
		dbg_lnum = newDbg_lnum;
	}
	public int getDbg_forceit() {
		return dbg_forceit;
	}
	public void setDbg_forceit(int newDbg_forceit) {
		dbg_forceit = newDbg_forceit;
	}
	public  getDbg_val() {
		return dbg_val;
	}
	public void setDbg_val( newDbg_val) {
		dbg_val = newDbg_val;
	}
	public int getDbg_level() {
		return dbg_level;
	}
	public void setDbg_level(int newDbg_level) {
		dbg_level = newDbg_level;
	}
}
// nr of last defined breakpoint
