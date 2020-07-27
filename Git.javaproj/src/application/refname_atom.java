package application;

public class refname_atom {
	private  option;
	private int lstrip;
	private int rstrip;
	
	public refname_atom( option, int lstrip, int rstrip) {
		setOption(option);
		setLstrip(lstrip);
		setRstrip(rstrip);
	}
	public refname_atom() {
	}
	
	public  getOption() {
		return option;
	}
	public void setOption( newOption) {
		option = newOption;
	}
	public int getLstrip() {
		return lstrip;
	}
	public void setLstrip(int newLstrip) {
		lstrip = newLstrip;
	}
	public int getRstrip() {
		return rstrip;
	}
	public void setRstrip(int newRstrip) {
		rstrip = newRstrip;
	}
}
