package application;

public class int_data {
	private int min;
	private int max;
	private int step;
	private obs_number_type type;
	private Byte suffix;
	
	public int_data(int min, int max, int step, obs_number_type type, Byte suffix) {
		setMin(min);
		setMax(max);
		setStep(step);
		setType(type);
		setSuffix(suffix);
	}
	public int_data() {
	}
	
	public void int_data_free() {
		if (ModernizedCProgram.data.getSuffix()) {
			ModernizedCProgram.bfree(ModernizedCProgram.data.getSuffix());
		} 
	}
	public int getMin() {
		return min;
	}
	public void setMin(int newMin) {
		min = newMin;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int newMax) {
		max = newMax;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int newStep) {
		step = newStep;
	}
	public obs_number_type getType() {
		return type;
	}
	public void setType(obs_number_type newType) {
		type = newType;
	}
	public Byte getSuffix() {
		return suffix;
	}
	public void setSuffix(Byte newSuffix) {
		suffix = newSuffix;
	}
}
