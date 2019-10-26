package application;

/* Stores function pointers to some Windows functions */
public class S_NTFSSECT_XPFUNCS_ {
	private Object Size;
	private Object Kernel32;
	private Object GetVolumePathName;
	private Object GetDiskFreeSpace;
	
	public S_NTFSSECT_XPFUNCS_(Object Size, Object Kernel32, Object GetVolumePathName, Object GetDiskFreeSpace) {
		setSize(Size);
		setKernel32(Kernel32);
		setGetVolumePathName(GetVolumePathName);
		setGetDiskFreeSpace(GetDiskFreeSpace);
	}
	public S_NTFSSECT_XPFUNCS_() {
	}
	
	public Object NtfsSectLoadXpFuncs() {
		DWORD rc = new DWORD();
		if (!XpFuncs) {
			return -1024;
		} 
		this.setSize();
		this.setKernel32(.LoadLibraryA("kernel32.dll"));
		rc = .GetLastError();
		Object generatedKernel32 = this.getKernel32();
		if (!generatedKernel32) {
			(ModernizedCProgram.NtfsSectLastErrorMessage = ("KERNEL32.DLL not found!"));
			;
		} 
		this.setGetVolumePathNameA((F_KERNEL32_GETVOLUMEPATHNAME)(.GetProcAddress(generatedKernel32, "GetVolumePathNameA")));
		rc = .GetLastError();
		Object generatedGetVolumePathNameA = this.getGetVolumePathNameA();
		if (!generatedGetVolumePathNameA) {
			(ModernizedCProgram.NtfsSectLastErrorMessage = ("GetVolumePathName() not found in KERNEL32.DLL!"));
			;
		} 
		this.setGetDiskFreeSpaceA((F_KERNEL32_GETDISKFREESPACE)(.GetProcAddress(generatedKernel32, "GetDiskFreeSpaceA")));
		rc = .GetLastError();
		Object generatedGetDiskFreeSpaceA = this.getGetDiskFreeSpaceA();
		if (!generatedGetDiskFreeSpaceA) {
			(ModernizedCProgram.NtfsSectLastErrorMessage = ("GetDiskFreeSpace() not found in KERNEL32.DLL!"));
			;
		} 
		return -1024;
		return rc;
	}
	public void NtfsSectUnloadXpFuncs() {
		if (!XpFuncs) {
			return ;
		} 
		this.setGetDiskFreeSpaceA(((Object)0));
		this.setGetVolumePathNameA(((Object)0));
		Object generatedKernel32 = this.getKernel32();
		if (generatedKernel32) {
			.FreeLibrary(generatedKernel32);
		} 
		this.setKernel32(((Object)0));
		this.setSize(0);
		return ;
	}
	public Object getSize() {
		return Size;
	}
	public void setSize(Object newSize) {
		Size = newSize;
	}
	public Object getKernel32() {
		return Kernel32;
	}
	public void setKernel32(Object newKernel32) {
		Kernel32 = newKernel32;
	}
	public Object getGetVolumePathName() {
		return GetVolumePathName;
	}
	public void setGetVolumePathName(Object newGetVolumePathName) {
		GetVolumePathName = newGetVolumePathName;
	}
	public Object getGetDiskFreeSpace() {
		return GetDiskFreeSpace;
	}
	public void setGetDiskFreeSpace(Object newGetDiskFreeSpace) {
		GetDiskFreeSpace = newGetDiskFreeSpace;
	}
}
/*** Function types */
/* The function type for Kernel32.dll's GetDiskFreeSpace() */
/* The function type for Kernel32.dll's GetVolumePathName() */
