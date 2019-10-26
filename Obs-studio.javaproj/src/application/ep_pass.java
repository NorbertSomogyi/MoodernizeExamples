package application;

/* effect parser pass data */
/* struct ep_pass */
public class ep_pass {
	private Byte name;
	private Object ;
	private Object ;
	private gs_effect_pass pass;
	
	public ep_pass(Byte name, Object,  Object,  gs_effect_pass pass) {
		setName(name);
		set();
		set();
		setPass(pass);
	}
	public ep_pass() {
	}
	
	public void ep_pass_init() {
		.memset(epp, 0, );
	}
	public void ep_pass_free() {
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		Object generatedVertex_program = this.getVertex_program();
		.da_free(generatedVertex_program);
		Object generatedFragment_program = this.getFragment_program();
		.da_free(generatedFragment_program);
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public gs_effect_pass getPass() {
		return pass;
	}
	public void setPass(gs_effect_pass newPass) {
		pass = newPass;
	}
}
