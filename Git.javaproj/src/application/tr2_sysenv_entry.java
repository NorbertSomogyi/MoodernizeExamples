package application;

/*
 * Each entry represents a trace2 setting.
 * See Documentation/technical/api-trace2.txt
 */
/* clang-format off */
public class tr2_sysenv_entry {
	private Object env_var_name;
	private Object git_config_name;
	private Byte value;
	private int getenv_called;
	
	public tr2_sysenv_entry(Object env_var_name, Object git_config_name, Byte value, int getenv_called) {
		setEnv_var_name(env_var_name);
		setGit_config_name(git_config_name);
		setValue(value);
		setGetenv_called(getenv_called);
	}
	public tr2_sysenv_entry() {
	}
	
	public Object getEnv_var_name() {
		return env_var_name;
	}
	public void setEnv_var_name(Object newEnv_var_name) {
		env_var_name = newEnv_var_name;
	}
	public Object getGit_config_name() {
		return git_config_name;
	}
	public void setGit_config_name(Object newGit_config_name) {
		git_config_name = newGit_config_name;
	}
	public Byte getValue() {
		return value;
	}
	public void setValue(Byte newValue) {
		value = newValue;
	}
	public int getGetenv_called() {
		return getenv_called;
	}
	public void setGetenv_called(int newGetenv_called) {
		getenv_called = newGetenv_called;
	}
}
