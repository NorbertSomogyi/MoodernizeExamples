package application;

/* hook addresses */
public class graphics_offsets {
	private d3d8_offsets d3d8;
	private d3d9_offsets d3d9;
	private dxgi_offsets dxgi;
	private ddraw_offsets ddraw;
	
	public graphics_offsets(d3d8_offsets d3d8, d3d9_offsets d3d9, dxgi_offsets dxgi, ddraw_offsets ddraw) {
		setD3d8(d3d8);
		setD3d9(d3d9);
		setDxgi(dxgi);
		setDdraw(ddraw);
	}
	public graphics_offsets() {
	}
	
	public boolean load_offsets_from_string(Object str) {
		 config = new ();
		if (config.config_open_string(str) != CONFIG_SUCCESS) {
			return 0;
		} 
		ModernizedCProgram.offsets.getD3d8().setPresent((uint32_t)config.config_get_uint("d3d8", "present"));
		ModernizedCProgram.offsets.getD3d9().setPresent((uint32_t)config.config_get_uint("d3d9", "present"));
		ModernizedCProgram.offsets.getD3d9().setPresent_ex((uint32_t)config.config_get_uint("d3d9", "present_ex"));
		ModernizedCProgram.offsets.getD3d9().setPresent_swap((uint32_t)config.config_get_uint("d3d9", "present_swap"));
		ModernizedCProgram.offsets.getD3d9().setD3d9_clsoff((uint32_t)config.config_get_uint("d3d9", "d3d9_clsoff"));
		ModernizedCProgram.offsets.getD3d9().setIs_d3d9ex_clsoff((uint32_t)config.config_get_uint("d3d9", "is_d3d9ex_clsoff"));
		ModernizedCProgram.offsets.getDxgi().setPresent((uint32_t)config.config_get_uint("dxgi", "present"));
		ModernizedCProgram.offsets.getDxgi().setPresent1((uint32_t)config.config_get_uint("dxgi", "present1"));
		ModernizedCProgram.offsets.getDxgi().setResize((uint32_t)config.config_get_uint("dxgi", "resize"));
		config.config_close();
		return 1;
	}
	public boolean load_offsets_from_file(Object file) {
		byte str = ModernizedCProgram.os_quick_read_utf8_file(file);
		boolean success = false;
		if (str && str) {
			success = ModernizedCProgram.offsets.load_offsets_from_string(str);
		} 
		ModernizedCProgram.bfree(str);
		return success;
	}
	public d3d8_offsets getD3d8() {
		return d3d8;
	}
	public void setD3d8(d3d8_offsets newD3d8) {
		d3d8 = newD3d8;
	}
	public d3d9_offsets getD3d9() {
		return d3d9;
	}
	public void setD3d9(d3d9_offsets newD3d9) {
		d3d9 = newD3d9;
	}
	public dxgi_offsets getDxgi() {
		return dxgi;
	}
	public void setDxgi(dxgi_offsets newDxgi) {
		dxgi = newDxgi;
	}
	public ddraw_offsets getDdraw() {
		return ddraw;
	}
	public void setDdraw(ddraw_offsets newDdraw) {
		ddraw = newDdraw;
	}
}
