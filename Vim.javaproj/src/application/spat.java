package application;

// A search pattern and its attributes are stored in a spat struct
public class spat {
	private Object pat;
	private int magic;
	private int no_scs;
	private soffset off;
	
	public spat(Object pat, int magic, int no_scs, soffset off) {
		setPat(pat);
		setMagic(magic);
		setNo_scs(no_scs);
		setOff(off);
	}
	public spat() {
	}
	
	/*
	 * Return the last used search pattern at "idx".
	 */
	public spat get_spat(int idx) {
		return ModernizedCProgram.spats[idx/*
		 * Return the last used search pattern index.
		 */];
	}
	public Object getPat() {
		return pat;
	}
	public void setPat(Object newPat) {
		pat = newPat;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int newMagic) {
		magic = newMagic;
	}
	public int getNo_scs() {
		return no_scs;
	}
	public void setNo_scs(int newNo_scs) {
		no_scs = newNo_scs;
	}
	public soffset getOff() {
		return off;
	}
	public void setOff(soffset newOff) {
		off = newOff;
	}
}
