package application;

public class convert_driver {
	private Object[] name;
	private convert_driver next;
	private Object smudge;
	private Object clean;
	private Object process;
	private int required;
	
	public convert_driver(Object[] name, convert_driver next, Object smudge, Object clean, Object process, int required) {
		setName(name);
		setNext(next);
		setSmudge(smudge);
		setClean(clean);
		setProcess(process);
		setRequired(required);
	}
	public convert_driver() {
	}
	
	public convert_driver git_path_check_convert(attr_check_item check) {
		Object generatedValue = check.getValue();
		byte value = generatedValue;
		convert_driver drv = new convert_driver();
		if (((value) == ModernizedCProgram.git_attr__true) || ((value) == ModernizedCProgram.git_attr__false) || ((value) == ((Object)0))) {
			return ((Object)0);
		} 
		Object[] generatedName = drv.getName();
		convert_driver generatedNext = drv.getNext();
		for (drv = user_convert; drv; drv = generatedNext) {
			if (!/*Error: Function owner not recognized*/strcmp(value, generatedName)) {
				return drv;
			} 
		}
		return ((Object)0);
	}
	public Object[] getName() {
		return name;
	}
	public void setName(Object[] newName) {
		name = newName;
	}
	public convert_driver getNext() {
		return next;
	}
	public void setNext(convert_driver newNext) {
		next = newNext;
	}
	public Object getSmudge() {
		return smudge;
	}
	public void setSmudge(Object newSmudge) {
		smudge = newSmudge;
	}
	public Object getClean() {
		return clean;
	}
	public void setClean(Object newClean) {
		clean = newClean;
	}
	public Object getProcess() {
		return process;
	}
	public void setProcess(Object newProcess) {
		process = newProcess;
	}
	public int getRequired() {
		return required;
	}
	public void setRequired(int newRequired) {
		required = newRequired;
	}
}
