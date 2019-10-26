package application;

public class loc_parse_struct {
	private byte c;
	private loc_command_type cmd;
	private Byte arg_type;
	
	public loc_parse_struct(byte c, loc_command_type cmd, Byte arg_type) {
		setC(c);
		setCmd(cmd);
		setArg_type(arg_type);
	}
	public loc_parse_struct() {
	}
	
	public byte getC() {
		return c;
	}
	public void setC(byte newC) {
		c = newC;
	}
	public loc_command_type getCmd() {
		return cmd;
	}
	public void setCmd(loc_command_type newCmd) {
		cmd = newCmd;
	}
	public Byte getArg_type() {
		return arg_type;
	}
	public void setArg_type(Byte newArg_type) {
		arg_type = newArg_type;
	}
}
