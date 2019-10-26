package application;

public class hm_nvapi_lib {
	private Object lib;
	private Object nvapi_QueryInterface;
	private Object NvAPI_Initialize;
	private Object NvAPI_Unload;
	private Object NvAPI_GetErrorMessage;
	private Object NvAPI_EnumPhysicalGPUs;
	private Object NvAPI_GPU_GetPerfPoliciesInfo;
	private Object NvAPI_GPU_GetPerfPoliciesStatus;
	private Object NvAPI_GPU_GetBusId;
	private Object NvAPI_GPU_GetBusSlotId;
	
	public hm_nvapi_lib(Object lib, Object nvapi_QueryInterface, Object NvAPI_Initialize, Object NvAPI_Unload, Object NvAPI_GetErrorMessage, Object NvAPI_EnumPhysicalGPUs, Object NvAPI_GPU_GetPerfPoliciesInfo, Object NvAPI_GPU_GetPerfPoliciesStatus, Object NvAPI_GPU_GetBusId, Object NvAPI_GPU_GetBusSlotId) {
		setLib(lib);
		setNvapi_QueryInterface(nvapi_QueryInterface);
		setNvAPI_Initialize(NvAPI_Initialize);
		setNvAPI_Unload(NvAPI_Unload);
		setNvAPI_GetErrorMessage(NvAPI_GetErrorMessage);
		setNvAPI_EnumPhysicalGPUs(NvAPI_EnumPhysicalGPUs);
		setNvAPI_GPU_GetPerfPoliciesInfo(NvAPI_GPU_GetPerfPoliciesInfo);
		setNvAPI_GPU_GetPerfPoliciesStatus(NvAPI_GPU_GetPerfPoliciesStatus);
		setNvAPI_GPU_GetBusId(NvAPI_GPU_GetBusId);
		setNvAPI_GPU_GetBusSlotId(NvAPI_GPU_GetBusSlotId);
	}
	public hm_nvapi_lib() {
	}
	
	public Object getLib() {
		return lib;
	}
	public void setLib(Object newLib) {
		lib = newLib;
	}
	public Object getNvapi_QueryInterface() {
		return nvapi_QueryInterface;
	}
	public void setNvapi_QueryInterface(Object newNvapi_QueryInterface) {
		nvapi_QueryInterface = newNvapi_QueryInterface;
	}
	public Object getNvAPI_Initialize() {
		return NvAPI_Initialize;
	}
	public void setNvAPI_Initialize(Object newNvAPI_Initialize) {
		NvAPI_Initialize = newNvAPI_Initialize;
	}
	public Object getNvAPI_Unload() {
		return NvAPI_Unload;
	}
	public void setNvAPI_Unload(Object newNvAPI_Unload) {
		NvAPI_Unload = newNvAPI_Unload;
	}
	public Object getNvAPI_GetErrorMessage() {
		return NvAPI_GetErrorMessage;
	}
	public void setNvAPI_GetErrorMessage(Object newNvAPI_GetErrorMessage) {
		NvAPI_GetErrorMessage = newNvAPI_GetErrorMessage;
	}
	public Object getNvAPI_EnumPhysicalGPUs() {
		return NvAPI_EnumPhysicalGPUs;
	}
	public void setNvAPI_EnumPhysicalGPUs(Object newNvAPI_EnumPhysicalGPUs) {
		NvAPI_EnumPhysicalGPUs = newNvAPI_EnumPhysicalGPUs;
	}
	public Object getNvAPI_GPU_GetPerfPoliciesInfo() {
		return NvAPI_GPU_GetPerfPoliciesInfo;
	}
	public void setNvAPI_GPU_GetPerfPoliciesInfo(Object newNvAPI_GPU_GetPerfPoliciesInfo) {
		NvAPI_GPU_GetPerfPoliciesInfo = newNvAPI_GPU_GetPerfPoliciesInfo;
	}
	public Object getNvAPI_GPU_GetPerfPoliciesStatus() {
		return NvAPI_GPU_GetPerfPoliciesStatus;
	}
	public void setNvAPI_GPU_GetPerfPoliciesStatus(Object newNvAPI_GPU_GetPerfPoliciesStatus) {
		NvAPI_GPU_GetPerfPoliciesStatus = newNvAPI_GPU_GetPerfPoliciesStatus;
	}
	public Object getNvAPI_GPU_GetBusId() {
		return NvAPI_GPU_GetBusId;
	}
	public void setNvAPI_GPU_GetBusId(Object newNvAPI_GPU_GetBusId) {
		NvAPI_GPU_GetBusId = newNvAPI_GPU_GetBusId;
	}
	public Object getNvAPI_GPU_GetBusSlotId() {
		return NvAPI_GPU_GetBusSlotId;
	}
	public void setNvAPI_GPU_GetBusSlotId(Object newNvAPI_GPU_GetBusSlotId) {
		NvAPI_GPU_GetBusSlotId = newNvAPI_GPU_GetBusSlotId;
	}
}
