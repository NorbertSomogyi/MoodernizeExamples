package application;

public class write_shallow_data {
	private strbuf out;
	private int use_pack_protocol;
	private int count;
	private int flags;
	
	public write_shallow_data(strbuf out, int use_pack_protocol, int count, int flags) {
		setOut(out);
		setUse_pack_protocol(use_pack_protocol);
		setCount(count);
		setFlags(flags);
	}
	public write_shallow_data() {
	}
	
	public strbuf getOut() {
		return out;
	}
	public void setOut(strbuf newOut) {
		out = newOut;
	}
	public int getUse_pack_protocol() {
		return use_pack_protocol;
	}
	public void setUse_pack_protocol(int newUse_pack_protocol) {
		use_pack_protocol = newUse_pack_protocol;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}
