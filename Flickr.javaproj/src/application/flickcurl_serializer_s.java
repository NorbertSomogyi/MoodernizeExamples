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
	
	public flickcurl_serializer_s flickcurl_new_serializer(flickcurl_s fc, Object data,  factory) {
		flickcurl_serializer serializer = new flickcurl_serializer();
		Object generatedVersion = factory.getVersion();
		if (!factory || (factory && generatedVersion != 1)) {
			return ((Object)0);
		} 
		serializer = (flickcurl_serializer).malloc();
		if (!serializer) {
			return ((Object)0);
		} 
		serializer.setFc(fc);
		serializer.setData(data);
		serializer.setFactory(factory);
		return serializer/**
		 * flickcurl_free_serializer:
		 * @serializer: serializer object
		 *
		 * Destructor for triples serializer object
		 */;
	}
	public void flickcurl_free_serializer() {
		do {
			if (!serializer) {
				.fprintf((_iob[2]), "%s:%d: (%s) assertion failed: object pointer of type flickcurl_serializer is NULL.\n", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Flickr\\src\\serializer.c", 211, __func__);
				return ;
			} 
		} while (0);
		.free(serializer);
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
