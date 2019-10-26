package application;

// variable used for g:
// Dictionary with g: variables
// values for vv_flags:
// compatible, also used without "v:"
// read-only
// read-only in the sandbox
public class vimvar {
	private Byte vv_name;
	private dictitem16_S vv_di;
	private byte vv_flags;
	
	public vimvar(Byte vv_name, dictitem16_S vv_di, byte vv_flags) {
		setVv_name(vv_name);
		setVv_di(vv_di);
		setVv_flags(vv_flags);
	}
	public vimvar() {
	}
	
	public Byte getVv_name() {
		return vv_name;
	}
	public void setVv_name(Byte newVv_name) {
		vv_name = newVv_name;
	}
	public dictitem16_S getVv_di() {
		return vv_di;
	}
	public void setVv_di(dictitem16_S newVv_di) {
		vv_di = newVv_di;
	}
	public byte getVv_flags() {
		return vv_flags;
	}
	public void setVv_flags(byte newVv_flags) {
		vv_flags = newVv_flags;
	}
}
