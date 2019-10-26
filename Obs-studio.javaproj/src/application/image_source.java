package application;

public class image_source {
	private obs_source source;
	private byte file;
	private Object persistent;
	private Object file_timestamp;
	private double update_time_elapsed;
	private Object last_time;
	private Object active;
	private Object if2;
	
	public image_source(obs_source source, byte file, Object persistent, Object file_timestamp, double update_time_elapsed, Object last_time, Object active, Object if2) {
		setSource(source);
		setFile(file);
		setPersistent(persistent);
		setFile_timestamp(file_timestamp);
		setUpdate_time_elapsed(update_time_elapsed);
		setLast_time(last_time);
		setActive(active);
		setIf2(if2);
	}
	public image_source() {
	}
	
	public void image_source_load() {
		byte generatedFile = this.getFile();
		byte file = generatedFile;
		ModernizedCProgram.obs_enter_graphics();
		Object generatedIf2 = this.getIf2();
		generatedIf2.gs_image_file2_free();
		ModernizedCProgram.obs_leave_graphics();
		obs_source generatedSource = this.getSource();
		if (file && file) {
			ModernizedCProgram.blog(LOG_DEBUG, "[image_source: '%s'] loading texture '%s'", ModernizedCProgram.obs_source_get_name(generatedSource), file);
			this.setFile_timestamp(ModernizedCProgram.get_modified_timestamp(file));
			generatedIf2.gs_image_file2_init(file);
			this.setUpdate_time_elapsed(0);
			ModernizedCProgram.obs_enter_graphics();
			generatedIf2.gs_image_file2_init_texture();
			ModernizedCProgram.obs_leave_graphics();
			if (!generatedIf2.getImage().getLoaded()) {
				ModernizedCProgram.blog(LOG_WARNING, "[image_source: '%s'] failed to load texture '%s'", ModernizedCProgram.obs_source_get_name(generatedSource), file);
			} 
		} 
	}
	public void image_source_unload() {
		ModernizedCProgram.obs_enter_graphics();
		Object generatedIf2 = this.getIf2();
		generatedIf2.gs_image_file2_free();
		ModernizedCProgram.obs_leave_graphics();
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public byte getFile() {
		return file;
	}
	public void setFile(byte newFile) {
		file = newFile;
	}
	public Object getPersistent() {
		return persistent;
	}
	public void setPersistent(Object newPersistent) {
		persistent = newPersistent;
	}
	public Object getFile_timestamp() {
		return file_timestamp;
	}
	public void setFile_timestamp(Object newFile_timestamp) {
		file_timestamp = newFile_timestamp;
	}
	public double getUpdate_time_elapsed() {
		return update_time_elapsed;
	}
	public void setUpdate_time_elapsed(double newUpdate_time_elapsed) {
		update_time_elapsed = newUpdate_time_elapsed;
	}
	public Object getLast_time() {
		return last_time;
	}
	public void setLast_time(Object newLast_time) {
		last_time = newLast_time;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getIf2() {
		return if2;
	}
	public void setIf2(Object newIf2) {
		if2 = newIf2;
	}
}
