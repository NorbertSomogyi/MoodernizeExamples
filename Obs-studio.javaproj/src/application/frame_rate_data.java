package application;

public class frame_rate_data {
	private Object ;
	private Object ;
	
	public frame_rate_data(Object,  Object ) {
		set();
		set();
	}
	public frame_rate_data() {
	}
	
	public void frame_rate_data_options_free() {
		Byte generatedName = opt.getName();
		Byte generatedDescription = opt.getDescription();
		for ( i = 0;
		 i < ModernizedCProgram.data.getExtra_options().getNum(); i++) {
			frame_rate_option opt = ModernizedCProgram.data.getExtra_options().getArray()[i];
			ModernizedCProgram.bfree(generatedName);
			ModernizedCProgram.bfree(generatedDescription);
		}
		.da_resize(ModernizedCProgram.data.getExtra_options(), 0);
	}
	public void frame_rate_data_ranges_free() {
		.da_resize(ModernizedCProgram.data.getRanges(), 0);
	}
	public void frame_rate_data_free() {
		ModernizedCProgram.data.frame_rate_data_options_free();
		ModernizedCProgram.data.frame_rate_data_ranges_free();
		.da_free(ModernizedCProgram.data.getExtra_options());
		.da_free(ModernizedCProgram.data.getRanges());
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
