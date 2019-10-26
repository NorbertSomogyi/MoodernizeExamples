package application;

public class pathspec_magic {
	private int bit;
	private byte mnemonic;
	private Object name;
	
	public pathspec_magic(int bit, byte mnemonic, Object name) {
		setBit(bit);
		setMnemonic(mnemonic);
		setName(name);
	}
	public pathspec_magic() {
	}
	
	public int getBit() {
		return bit;
	}
	public void setBit(int newBit) {
		bit = newBit;
	}
	public byte getMnemonic() {
		return mnemonic;
	}
	public void setMnemonic(byte newMnemonic) {
		mnemonic = newMnemonic;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}
