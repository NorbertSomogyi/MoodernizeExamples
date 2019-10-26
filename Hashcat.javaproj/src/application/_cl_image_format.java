package application;

public class _cl_image_format {
	private Object image_channel_order;
	private Object image_channel_data_type;
	
	public _cl_image_format(Object image_channel_order, Object image_channel_data_type) {
		setImage_channel_order(image_channel_order);
		setImage_channel_data_type(image_channel_data_type);
	}
	public _cl_image_format() {
	}
	
	public Object getImage_channel_order() {
		return image_channel_order;
	}
	public void setImage_channel_order(Object newImage_channel_order) {
		image_channel_order = newImage_channel_order;
	}
	public Object getImage_channel_data_type() {
		return image_channel_data_type;
	}
	public void setImage_channel_data_type(Object newImage_channel_data_type) {
		image_channel_data_type = newImage_channel_data_type;
	}
}
