package application;

/* not allowed in command-line window */
/*
 * Generally speaking, every Normal mode command should either clear any
 * pending operator (with *clearop*()), or set the motion type variable
 * oap->motion_type.
 *
 * When a cursor motion command is made, it is marked as being a character or
 * line oriented motion.  Then, if an operator is in effect, the operation
 * becomes character or line oriented accordingly.
 */
/*
 * This table contains one entry for every Normal or Visual mode command.
 * The order doesn't matter, init_normal_cmds() will create a sorted index.
 * It is faster when all keys from zero to '~' are present.
 */
public class nv_cmd {
	private int cmd_char;
	private Object cmd_func;
	private Object cmd_flags;
	private int cmd_arg;
	
	public nv_cmd(int cmd_char, Object cmd_func, Object cmd_flags, int cmd_arg) {
		setCmd_char(cmd_char);
		setCmd_func(cmd_func);
		setCmd_flags(cmd_flags);
		setCmd_arg(cmd_arg);
	}
	public nv_cmd() {
	}
	
	public int getCmd_char() {
		return cmd_char;
	}
	public void setCmd_char(int newCmd_char) {
		cmd_char = newCmd_char;
	}
	public Object getCmd_func() {
		return cmd_func;
	}
	public void setCmd_func(Object newCmd_func) {
		cmd_func = newCmd_func;
	}
	public Object getCmd_flags() {
		return cmd_flags;
	}
	public void setCmd_flags(Object newCmd_flags) {
		cmd_flags = newCmd_flags;
	}
	public int getCmd_arg() {
		return cmd_arg;
	}
	public void setCmd_arg(int newCmd_arg) {
		cmd_arg = newCmd_arg;
	}
}
