package application;

public class float_data {
	private double min;
	private double max;
	private double step;
	private obs_number_type type;
	private Byte suffix;
	
	public float_data(double min, double max, double step, obs_number_type type, Byte suffix) {
		setMin(min);
		setMax(max);
		setStep(step);
		setType(type);
		setSuffix(suffix);
	}
	public float_data() {
	}
	
	public void float_data_free() {
		if (ModernizedCProgram.data.getSuffix()) {
			ModernizedCProgram.bfree(ModernizedCProgram.data.getSuffix());
		} 
	}
	public double getMin() {
		return min;
	}
	public void setMin(double newMin) {
		min = newMin;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double newMax) {
		max = newMax;
	}
	public double getStep() {
		return step;
	}
	public void setStep(double newStep) {
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
