package application;

public class gain_data {
	private obs_source context;
	private Object channels;
	private double multiple;
	
	public gain_data(obs_source context, Object channels, double multiple) {
		setContext(context);
		setChannels(channels);
		setMultiple(multiple);
	}
	public gain_data() {
	}
	
	public obs_source getContext() {
		return context;
	}
	public void setContext(obs_source newContext) {
		context = newContext;
	}
	public Object getChannels() {
		return channels;
	}
	public void setChannels(Object newChannels) {
		channels = newChannels;
	}
	public double getMultiple() {
		return multiple;
	}
	public void setMultiple(double newMultiple) {
		multiple = newMultiple;
	}
}
