package application;

public class pager_command_config_data {
	private Object cmd;
	private int want;
	private Byte value;
	
	public pager_command_config_data(Object cmd, int want, Byte value) {
		setCmd(cmd);
		setWant(want);
		setValue(value);
	}
	public pager_command_config_data() {
	}
	
	public Object getCmd() {
		return cmd;
	}
	public void setCmd(Object newCmd) {
		cmd = newCmd;
	}
	public int getWant() {
		return want;
	}
	public void setWant(int newWant) {
		want = newWant;
	}
	public Byte getValue() {
		return value;
	}
	public void setValue(Byte newValue) {
		value = newValue;
	}
}
