package application;

/*
 * Copyright (c) 2015 Hugh Bailey <obs.jim@gmail.com>
 *
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
public class win_version_info {
	private int major;
	private int minor;
	private int build;
	private int revis;
	
	public win_version_info(int major, int minor, int build, int revis) {
		setMajor(major);
		setMinor(minor);
		setBuild(build);
		setRevis(revis);
	}
	public win_version_info() {
	}
	
	public boolean get_dll_ver(Object lib) {
		VS_FIXEDFILEINFO info = ((Object)0);
		UINT len = 0;
		BOOL success = new BOOL();
		LPVOID data = new LPVOID();
		DWORD size = new DWORD();
		byte[] utf8_lib = new byte[512];
		if (!ModernizedCProgram.ver_initialized && !ModernizedCProgram.initialize_version_functions()) {
			return 0;
		} 
		if (!ModernizedCProgram.ver_initialize_success) {
			return 0;
		} 
		ModernizedCProgram.os_wcs_to_utf8(lib, 0, utf8_lib, );
		size = .get_file_version_info_size(lib, ((Object)0));
		if (!size) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to get %s version info size", utf8_lib);
			return 0;
		} 
		data = ModernizedCProgram.bmalloc(size);
		if (!.get_file_version_info(lib, 0, size, data)) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to get %s version info", utf8_lib);
			ModernizedCProgram.bfree(data);
			return 0;
		} 
		success = .ver_query_value(data, L"\\", (LPVOID)info, len);
		if (!success || !info || !len) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to get %s version info value", utf8_lib);
			ModernizedCProgram.bfree(data);
			return 0;
		} 
		Object generatedDwFileVersionMS = info.getDwFileVersionMS();
		this.setWin_version_info((int)((WORD)(((DWORD)(generatedDwFileVersionMS) >> 16) & -1024)));
		this.setWin_version_info((int)((WORD)((DWORD)(generatedDwFileVersionMS))));
		Object generatedDwFileVersionLS = info.getDwFileVersionLS();
		this.setWin_version_info((int)((WORD)(((DWORD)(generatedDwFileVersionLS) >> 16) & -1024)));
		this.setWin_version_info((int)((WORD)((DWORD)(generatedDwFileVersionLS))));
		ModernizedCProgram.bfree(data);
		return 1;
	}
	public void get_win_ver() {
		win_version_info ver = new win_version_info(0);
		boolean got_version = false;
		if (!info) {
			return ;
		} 
		Object generatedWin_version_info = ver.getWin_version_info();
		if (!got_version) {
			ver.get_dll_ver(L"kernel32");
			got_version = true;
			if (generatedWin_version_info == 10) {
				HKEY key = new HKEY();
				DWORD size = new DWORD();
				DWORD win10_revision = new DWORD();
				 status = new ();
				status = .RegOpenKeyW(((HKEY)-1024), L"SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion", ModernizedCProgram.key);
				if (status != -1024) {
					return ;
				} 
				size = ;
				status = .RegQueryValueExW(ModernizedCProgram.key, L"UBR", ((Object)0), ((Object)0), (LPBYTE)win10_revision, size);
				if (status == -1024) {
					ver.setWin_version_info((int)win10_revision > generatedWin_version_info ? (int)win10_revision : generatedWin_version_info);
				} 
				.RegCloseKey(ModernizedCProgram.key);
			} 
		} 
		info = ver;
	}
	public void write_config_ver(Object ver_config, Object section) {
		Object generatedWin_version_info = this.getWin_version_info();
		ver_config.config_set_int(section, "major", generatedWin_version_info);
		;
		ver_config.config_set_int(section, "minor", generatedWin_version_info);
		;
		ver_config.config_set_int(section, "build", generatedWin_version_info);
		;
		ver_config.config_set_int(section, "revis", generatedWin_version_info);
		;
	}
	public boolean get_32bit_system_dll_ver(Object system_lib) {
		wchar_t[] path = new wchar_t();
		UINT ret = new UINT();
		ret = .GetSystemDirectoryW(path, 260);
		if (!ret) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to get windows 32bit system path: %lu", .GetLastError());
			return 0;
		} 
		.wcscat(path, L"\\");
		.wcscat(path, system_lib);
		return ver.get_dll_ver(path);
	}
	public int getMajor() {
		return major;
	}
	public void setMajor(int newMajor) {
		major = newMajor;
	}
	public int getMinor() {
		return minor;
	}
	public void setMinor(int newMinor) {
		minor = newMinor;
	}
	public int getBuild() {
		return build;
	}
	public void setBuild(int newBuild) {
		build = newBuild;
	}
	public int getRevis() {
		return revis;
	}
	public void setRevis(int newRevis) {
		revis = newRevis;
	}
}
