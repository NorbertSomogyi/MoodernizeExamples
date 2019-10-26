package application;

public class module_info {
	private Object addr;
	private Object name_utf8;
	
	public module_info(Object addr, Object name_utf8) {
		setAddr(addr);
		setName_utf8(name_utf8);
	}
	public module_info() {
	}
	
	public Object enum_module(Object module_name, Object module_base, Object module_size) {
		Object generatedAddr = this.getAddr();
		Object generatedName_utf8 = this.getName_utf8();
		if (generatedAddr >= module_base && generatedAddr < module_base + module_size) {
			ModernizedCProgram.os_wcs_to_utf8(module_name, 0, generatedName_utf8, 260);
			.strlwr(generatedName_utf8);
			return false;
		} 
		return true;
	}
	public Object getAddr() {
		return addr;
	}
	public void setAddr(Object newAddr) {
		addr = newAddr;
	}
	public Object getName_utf8() {
		return name_utf8;
	}
	public void setName_utf8(Object newName_utf8) {
		name_utf8 = newName_utf8;
	}
}
