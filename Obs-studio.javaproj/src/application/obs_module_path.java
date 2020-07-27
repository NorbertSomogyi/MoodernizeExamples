package application;

public class obs_module_path {
	private Byte bin;
	private Byte data;
	
	public obs_module_path(Byte bin, Byte data) {
		setBin(bin);
		setData(data);
	}
	public obs_module_path() {
	}
	
	public void process_found_module(Object path, Object directory, Object callback, Object param) {
		obs_module_info info = new obs_module_info();
		dstr name = new dstr(0);
		dstr parsed_bin_path = new dstr(0);
		byte file;
		byte parsed_data_dir;
		 bin_found = true;
		file = /*Error: Function owner not recognized*/strrchr(path, (byte)'/');
		file = file ? (file + 1) : path;
		if (/*Error: Function owner not recognized*/strcmp(file, ".") == 0 || /*Error: Function owner not recognized*/strcmp(file, "..") == 0) {
			return /*Error: Unsupported expression*/;
		} 
		name.dstr_copy(file);
		Object generatedDstr = name.getDstr();
		Byte generatedBin = this.getBin();
		if (!directory) {
			byte ext = /*Error: Function owner not recognized*/strrchr(generatedDstr, (byte)'.');
			if (ext) {
				name.dstr_resize(ext - generatedDstr);
			} 
			parsed_bin_path.dstr_copy(path);
		} else {
				bin_found = parsed_bin_path.parse_binary_from_directory(generatedBin, file);
		} 
		Byte generatedData = this.getData();
		parsed_data_dir = ModernizedCProgram.make_data_directory(generatedDstr, generatedData);
		if (parsed_data_dir && bin_found) {
			info.setBin_path(generatedDstr);
			info.setData_path(parsed_data_dir);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/callback(param, info);
		} 
		ModernizedCProgram.bfree(parsed_data_dir);
		name.dstr_free();
		parsed_bin_path.dstr_free();
	}
	public void find_modules_in_path(Object callback, Object param) {
		dstr search_path = new dstr(0);
		byte module_start;
		 search_directories = false;
		 gi = new ();
		Byte generatedBin = this.getBin();
		search_path.dstr_copy(generatedBin);
		Object generatedDstr = search_path.getDstr();
		module_start = /*Error: Function owner not recognized*/strstr(generatedDstr, "%module%");
		if (module_start) {
			search_path.dstr_resize(module_start - generatedDstr);
			search_directories = true;
		} 
		if (!ModernizedCProgram.dstr_is_empty(search_path) && ModernizedCProgram.dstr_end(search_path) != (byte)'/') {
			search_path.dstr_cat_ch((byte)'/');
		} 
		search_path.dstr_cat_ch((byte)'*');
		if (!search_directories) {
			search_path.dstr_cat(ModernizedCProgram.get_module_extension());
		} 
		if (gi.os_glob(generatedDstr, 0) == 0) {
			for ( i = 0;
			 i < gi.getGl_pathc(); i++) {
				if (search_directories == gi.getGl_pathv()[i].getDirectory()) {
					omp.process_found_module(gi.getGl_pathv()[i].getPath(), search_directories, callback, param);
				} 
			}
			gi.os_globfree();
		} 
		search_path.dstr_free();
	}
	public void free_module_path() {
		Byte generatedBin = this.getBin();
		Byte generatedData = this.getData();
		if (omp) {
			ModernizedCProgram.bfree(generatedBin);
			ModernizedCProgram.bfree(generatedData);
		} 
	}
	public Byte getBin() {
		return bin;
	}
	public void setBin(Byte newBin) {
		bin = newBin;
	}
	public Byte getData() {
		return data;
	}
	public void setData(Byte newData) {
		data = newData;
	}
}
