package application;

public class dotdot {
	private Object input;
	private Object output;
	
	public dotdot(Object input, Object output) {
		setInput(input);
		setOutput(output);
	}
	public dotdot() {
	}
	
	public Object getInput() {
		return input;
	}
	public void setInput(Object newInput) {
		input = newInput;
	}
	public Object getOutput() {
		return output;
	}
	public void setOutput(Object newOutput) {
		output = newOutput;
	}
}
