package application;

/* effect parser technique data */
public class ep_technique {
	private Byte name;
	private Object ;
	
	public ep_technique(Byte name, Object ) {
		setName(name);
		set();
	}
	public ep_technique() {
	}
	
	public void ep_technique_init() {
		.memset(ept, 0, );
	}
	public void ep_technique_free() {
		 i = new ();
		Object generatedPasses = this.getPasses();
		for (i = 0; i < generatedPasses.getNum(); i++) {
			generatedPasses.getArray() + i.ep_pass_free();
		}
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		.da_free(generatedPasses);
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
}
/* internal vars */
