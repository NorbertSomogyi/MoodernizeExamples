package application;

public class flickcurl_serializer_s {
	private Object fc;
	private Object data;
	private Object factory;
	
	public flickcurl_serializer_s(Object fc, Object data, Object factory) {
		setFc(fc);
		setData(data);
		setFactory(factory);
	}
	public flickcurl_serializer_s() {
	}
	
	public Object getFc() {
		return fc;
	}
	public void setFc(Object newFc) {
		fc = newFc;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getFactory() {
		return factory;
	}
	public void setFactory(Object newFactory) {
		factory = newFactory;
	}
}
