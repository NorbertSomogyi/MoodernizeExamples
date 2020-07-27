package application;

public class gs_image_file2 {
	private gs_image_file image;
	private Object mem_usage;
	
	public gs_image_file2(gs_image_file image, Object mem_usage) {
		setImage(image);
		setMem_usage(mem_usage);
	}
	public gs_image_file2() {
	}
	
	public void gs_image_file2_free() {
		gs_image_file generatedImage = this.getImage();
		generatedImage.gs_image_file_free();
		this.setMem_usage(0);
	}
	public void gs_image_file2_init_texture() {
		gs_image_file generatedImage = this.getImage();
		generatedImage.gs_image_file_init_texture();
	}
	public Object gs_image_file2_tick(Object elapsed_time_ns) {
		gs_image_file generatedImage = this.getImage();
		return generatedImage.gs_image_file_tick(elapsed_time_ns);
	}
	public void gs_image_file2_update_texture() {
		gs_image_file generatedImage = this.getImage();
		generatedImage.gs_image_file_update_texture();
	}
	public void gs_image_file2_init(Object file) {
		gs_image_file generatedImage = this.getImage();
		Object generatedMem_usage = this.getMem_usage();
		generatedImage.gs_image_file_init_internal(file, generatedMem_usage);
	}
	public gs_image_file getImage() {
		return image;
	}
	public void setImage(gs_image_file newImage) {
		image = newImage;
	}
	public Object getMem_usage() {
		return mem_usage;
	}
	public void setMem_usage(Object newMem_usage) {
		mem_usage = newMem_usage;
	}
}
