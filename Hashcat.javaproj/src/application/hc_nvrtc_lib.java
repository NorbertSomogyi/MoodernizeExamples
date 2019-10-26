package application;

public class hc_nvrtc_lib {
	private Object lib;
	private Object nvrtcAddNameExpression;
	private Object nvrtcCompileProgram;
	private Object nvrtcCreateProgram;
	private Object nvrtcDestroyProgram;
	private Object nvrtcGetLoweredName;
	private Object nvrtcGetPTX;
	private Object nvrtcGetPTXSize;
	private Object nvrtcGetProgramLog;
	private Object nvrtcGetProgramLogSize;
	private Object nvrtcGetErrorString;
	private Object nvrtcVersion;
	
	public hc_nvrtc_lib(Object lib, Object nvrtcAddNameExpression, Object nvrtcCompileProgram, Object nvrtcCreateProgram, Object nvrtcDestroyProgram, Object nvrtcGetLoweredName, Object nvrtcGetPTX, Object nvrtcGetPTXSize, Object nvrtcGetProgramLog, Object nvrtcGetProgramLogSize, Object nvrtcGetErrorString, Object nvrtcVersion) {
		setLib(lib);
		setNvrtcAddNameExpression(nvrtcAddNameExpression);
		setNvrtcCompileProgram(nvrtcCompileProgram);
		setNvrtcCreateProgram(nvrtcCreateProgram);
		setNvrtcDestroyProgram(nvrtcDestroyProgram);
		setNvrtcGetLoweredName(nvrtcGetLoweredName);
		setNvrtcGetPTX(nvrtcGetPTX);
		setNvrtcGetPTXSize(nvrtcGetPTXSize);
		setNvrtcGetProgramLog(nvrtcGetProgramLog);
		setNvrtcGetProgramLogSize(nvrtcGetProgramLogSize);
		setNvrtcGetErrorString(nvrtcGetErrorString);
		setNvrtcVersion(nvrtcVersion);
	}
	public hc_nvrtc_lib() {
	}
	
	public Object getLib() {
		return lib;
	}
	public void setLib(Object newLib) {
		lib = newLib;
	}
	public Object getNvrtcAddNameExpression() {
		return nvrtcAddNameExpression;
	}
	public void setNvrtcAddNameExpression(Object newNvrtcAddNameExpression) {
		nvrtcAddNameExpression = newNvrtcAddNameExpression;
	}
	public Object getNvrtcCompileProgram() {
		return nvrtcCompileProgram;
	}
	public void setNvrtcCompileProgram(Object newNvrtcCompileProgram) {
		nvrtcCompileProgram = newNvrtcCompileProgram;
	}
	public Object getNvrtcCreateProgram() {
		return nvrtcCreateProgram;
	}
	public void setNvrtcCreateProgram(Object newNvrtcCreateProgram) {
		nvrtcCreateProgram = newNvrtcCreateProgram;
	}
	public Object getNvrtcDestroyProgram() {
		return nvrtcDestroyProgram;
	}
	public void setNvrtcDestroyProgram(Object newNvrtcDestroyProgram) {
		nvrtcDestroyProgram = newNvrtcDestroyProgram;
	}
	public Object getNvrtcGetLoweredName() {
		return nvrtcGetLoweredName;
	}
	public void setNvrtcGetLoweredName(Object newNvrtcGetLoweredName) {
		nvrtcGetLoweredName = newNvrtcGetLoweredName;
	}
	public Object getNvrtcGetPTX() {
		return nvrtcGetPTX;
	}
	public void setNvrtcGetPTX(Object newNvrtcGetPTX) {
		nvrtcGetPTX = newNvrtcGetPTX;
	}
	public Object getNvrtcGetPTXSize() {
		return nvrtcGetPTXSize;
	}
	public void setNvrtcGetPTXSize(Object newNvrtcGetPTXSize) {
		nvrtcGetPTXSize = newNvrtcGetPTXSize;
	}
	public Object getNvrtcGetProgramLog() {
		return nvrtcGetProgramLog;
	}
	public void setNvrtcGetProgramLog(Object newNvrtcGetProgramLog) {
		nvrtcGetProgramLog = newNvrtcGetProgramLog;
	}
	public Object getNvrtcGetProgramLogSize() {
		return nvrtcGetProgramLogSize;
	}
	public void setNvrtcGetProgramLogSize(Object newNvrtcGetProgramLogSize) {
		nvrtcGetProgramLogSize = newNvrtcGetProgramLogSize;
	}
	public Object getNvrtcGetErrorString() {
		return nvrtcGetErrorString;
	}
	public void setNvrtcGetErrorString(Object newNvrtcGetErrorString) {
		nvrtcGetErrorString = newNvrtcGetErrorString;
	}
	public Object getNvrtcVersion() {
		return nvrtcVersion;
	}
	public void setNvrtcVersion(Object newNvrtcVersion) {
		nvrtcVersion = newNvrtcVersion;
	}
}
