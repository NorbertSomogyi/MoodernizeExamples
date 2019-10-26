package application;

public class hc_cuda_lib {
	private Object lib;
	private Object cuCtxCreate;
	private Object cuCtxDestroy;
	private Object cuCtxGetCacheConfig;
	private Object cuCtxGetCurrent;
	private Object cuCtxGetSharedMemConfig;
	private Object cuCtxPopCurrent;
	private Object cuCtxPushCurrent;
	private Object cuCtxSetCacheConfig;
	private Object cuCtxSetCurrent;
	private Object cuCtxSetSharedMemConfig;
	private Object cuCtxSynchronize;
	private Object cuDeviceGetAttribute;
	private Object cuDeviceGetCount;
	private Object cuDeviceGet;
	private Object cuDeviceGetName;
	private Object cuDeviceTotalMem;
	private Object cuDriverGetVersion;
	private Object cuEventCreate;
	private Object cuEventDestroy;
	private Object cuEventElapsedTime;
	private Object cuEventQuery;
	private Object cuEventRecord;
	private Object cuEventSynchronize;
	private Object cuFuncGetAttribute;
	private Object cuFuncSetAttribute;
	private Object cuFuncSetCacheConfig;
	private Object cuFuncSetSharedMemConfig;
	private Object cuGetErrorName;
	private Object cuGetErrorString;
	private Object cuInit;
	private Object cuLaunchKernel;
	private Object cuMemAlloc;
	private Object cuMemAllocHost;
	private Object cuMemcpyDtoD;
	private Object cuMemcpyDtoH;
	private Object cuMemcpyHtoD;
	private Object cuMemFree;
	private Object cuMemFreeHost;
	private Object cuMemGetInfo;
	private Object cuMemsetD32;
	private Object cuMemsetD8;
	private Object cuModuleGetFunction;
	private Object cuModuleGetGlobal;
	private Object cuModuleLoad;
	private Object cuModuleLoadData;
	private Object cuModuleLoadDataEx;
	private Object cuModuleUnload;
	private Object cuProfilerStart;
	private Object cuProfilerStop;
	private Object cuStreamCreate;
	private Object cuStreamDestroy;
	private Object cuStreamSynchronize;
	private Object cuStreamWaitEvent;
	
	public hc_cuda_lib(Object lib, Object cuCtxCreate, Object cuCtxDestroy, Object cuCtxGetCacheConfig, Object cuCtxGetCurrent, Object cuCtxGetSharedMemConfig, Object cuCtxPopCurrent, Object cuCtxPushCurrent, Object cuCtxSetCacheConfig, Object cuCtxSetCurrent, Object cuCtxSetSharedMemConfig, Object cuCtxSynchronize, Object cuDeviceGetAttribute, Object cuDeviceGetCount, Object cuDeviceGet, Object cuDeviceGetName, Object cuDeviceTotalMem, Object cuDriverGetVersion, Object cuEventCreate, Object cuEventDestroy, Object cuEventElapsedTime, Object cuEventQuery, Object cuEventRecord, Object cuEventSynchronize, Object cuFuncGetAttribute, Object cuFuncSetAttribute, Object cuFuncSetCacheConfig, Object cuFuncSetSharedMemConfig, Object cuGetErrorName, Object cuGetErrorString, Object cuInit, Object cuLaunchKernel, Object cuMemAlloc, Object cuMemAllocHost, Object cuMemcpyDtoD, Object cuMemcpyDtoH, Object cuMemcpyHtoD, Object cuMemFree, Object cuMemFreeHost, Object cuMemGetInfo, Object cuMemsetD32, Object cuMemsetD8, Object cuModuleGetFunction, Object cuModuleGetGlobal, Object cuModuleLoad, Object cuModuleLoadData, Object cuModuleLoadDataEx, Object cuModuleUnload, Object cuProfilerStart, Object cuProfilerStop, Object cuStreamCreate, Object cuStreamDestroy, Object cuStreamSynchronize, Object cuStreamWaitEvent) {
		setLib(lib);
		setCuCtxCreate(cuCtxCreate);
		setCuCtxDestroy(cuCtxDestroy);
		setCuCtxGetCacheConfig(cuCtxGetCacheConfig);
		setCuCtxGetCurrent(cuCtxGetCurrent);
		setCuCtxGetSharedMemConfig(cuCtxGetSharedMemConfig);
		setCuCtxPopCurrent(cuCtxPopCurrent);
		setCuCtxPushCurrent(cuCtxPushCurrent);
		setCuCtxSetCacheConfig(cuCtxSetCacheConfig);
		setCuCtxSetCurrent(cuCtxSetCurrent);
		setCuCtxSetSharedMemConfig(cuCtxSetSharedMemConfig);
		setCuCtxSynchronize(cuCtxSynchronize);
		setCuDeviceGetAttribute(cuDeviceGetAttribute);
		setCuDeviceGetCount(cuDeviceGetCount);
		setCuDeviceGet(cuDeviceGet);
		setCuDeviceGetName(cuDeviceGetName);
		setCuDeviceTotalMem(cuDeviceTotalMem);
		setCuDriverGetVersion(cuDriverGetVersion);
		setCuEventCreate(cuEventCreate);
		setCuEventDestroy(cuEventDestroy);
		setCuEventElapsedTime(cuEventElapsedTime);
		setCuEventQuery(cuEventQuery);
		setCuEventRecord(cuEventRecord);
		setCuEventSynchronize(cuEventSynchronize);
		setCuFuncGetAttribute(cuFuncGetAttribute);
		setCuFuncSetAttribute(cuFuncSetAttribute);
		setCuFuncSetCacheConfig(cuFuncSetCacheConfig);
		setCuFuncSetSharedMemConfig(cuFuncSetSharedMemConfig);
		setCuGetErrorName(cuGetErrorName);
		setCuGetErrorString(cuGetErrorString);
		setCuInit(cuInit);
		setCuLaunchKernel(cuLaunchKernel);
		setCuMemAlloc(cuMemAlloc);
		setCuMemAllocHost(cuMemAllocHost);
		setCuMemcpyDtoD(cuMemcpyDtoD);
		setCuMemcpyDtoH(cuMemcpyDtoH);
		setCuMemcpyHtoD(cuMemcpyHtoD);
		setCuMemFree(cuMemFree);
		setCuMemFreeHost(cuMemFreeHost);
		setCuMemGetInfo(cuMemGetInfo);
		setCuMemsetD32(cuMemsetD32);
		setCuMemsetD8(cuMemsetD8);
		setCuModuleGetFunction(cuModuleGetFunction);
		setCuModuleGetGlobal(cuModuleGetGlobal);
		setCuModuleLoad(cuModuleLoad);
		setCuModuleLoadData(cuModuleLoadData);
		setCuModuleLoadDataEx(cuModuleLoadDataEx);
		setCuModuleUnload(cuModuleUnload);
		setCuProfilerStart(cuProfilerStart);
		setCuProfilerStop(cuProfilerStop);
		setCuStreamCreate(cuStreamCreate);
		setCuStreamDestroy(cuStreamDestroy);
		setCuStreamSynchronize(cuStreamSynchronize);
		setCuStreamWaitEvent(cuStreamWaitEvent);
	}
	public hc_cuda_lib() {
	}
	
	public Object getLib() {
		return lib;
	}
	public void setLib(Object newLib) {
		lib = newLib;
	}
	public Object getCuCtxCreate() {
		return cuCtxCreate;
	}
	public void setCuCtxCreate(Object newCuCtxCreate) {
		cuCtxCreate = newCuCtxCreate;
	}
	public Object getCuCtxDestroy() {
		return cuCtxDestroy;
	}
	public void setCuCtxDestroy(Object newCuCtxDestroy) {
		cuCtxDestroy = newCuCtxDestroy;
	}
	public Object getCuCtxGetCacheConfig() {
		return cuCtxGetCacheConfig;
	}
	public void setCuCtxGetCacheConfig(Object newCuCtxGetCacheConfig) {
		cuCtxGetCacheConfig = newCuCtxGetCacheConfig;
	}
	public Object getCuCtxGetCurrent() {
		return cuCtxGetCurrent;
	}
	public void setCuCtxGetCurrent(Object newCuCtxGetCurrent) {
		cuCtxGetCurrent = newCuCtxGetCurrent;
	}
	public Object getCuCtxGetSharedMemConfig() {
		return cuCtxGetSharedMemConfig;
	}
	public void setCuCtxGetSharedMemConfig(Object newCuCtxGetSharedMemConfig) {
		cuCtxGetSharedMemConfig = newCuCtxGetSharedMemConfig;
	}
	public Object getCuCtxPopCurrent() {
		return cuCtxPopCurrent;
	}
	public void setCuCtxPopCurrent(Object newCuCtxPopCurrent) {
		cuCtxPopCurrent = newCuCtxPopCurrent;
	}
	public Object getCuCtxPushCurrent() {
		return cuCtxPushCurrent;
	}
	public void setCuCtxPushCurrent(Object newCuCtxPushCurrent) {
		cuCtxPushCurrent = newCuCtxPushCurrent;
	}
	public Object getCuCtxSetCacheConfig() {
		return cuCtxSetCacheConfig;
	}
	public void setCuCtxSetCacheConfig(Object newCuCtxSetCacheConfig) {
		cuCtxSetCacheConfig = newCuCtxSetCacheConfig;
	}
	public Object getCuCtxSetCurrent() {
		return cuCtxSetCurrent;
	}
	public void setCuCtxSetCurrent(Object newCuCtxSetCurrent) {
		cuCtxSetCurrent = newCuCtxSetCurrent;
	}
	public Object getCuCtxSetSharedMemConfig() {
		return cuCtxSetSharedMemConfig;
	}
	public void setCuCtxSetSharedMemConfig(Object newCuCtxSetSharedMemConfig) {
		cuCtxSetSharedMemConfig = newCuCtxSetSharedMemConfig;
	}
	public Object getCuCtxSynchronize() {
		return cuCtxSynchronize;
	}
	public void setCuCtxSynchronize(Object newCuCtxSynchronize) {
		cuCtxSynchronize = newCuCtxSynchronize;
	}
	public Object getCuDeviceGetAttribute() {
		return cuDeviceGetAttribute;
	}
	public void setCuDeviceGetAttribute(Object newCuDeviceGetAttribute) {
		cuDeviceGetAttribute = newCuDeviceGetAttribute;
	}
	public Object getCuDeviceGetCount() {
		return cuDeviceGetCount;
	}
	public void setCuDeviceGetCount(Object newCuDeviceGetCount) {
		cuDeviceGetCount = newCuDeviceGetCount;
	}
	public Object getCuDeviceGet() {
		return cuDeviceGet;
	}
	public void setCuDeviceGet(Object newCuDeviceGet) {
		cuDeviceGet = newCuDeviceGet;
	}
	public Object getCuDeviceGetName() {
		return cuDeviceGetName;
	}
	public void setCuDeviceGetName(Object newCuDeviceGetName) {
		cuDeviceGetName = newCuDeviceGetName;
	}
	public Object getCuDeviceTotalMem() {
		return cuDeviceTotalMem;
	}
	public void setCuDeviceTotalMem(Object newCuDeviceTotalMem) {
		cuDeviceTotalMem = newCuDeviceTotalMem;
	}
	public Object getCuDriverGetVersion() {
		return cuDriverGetVersion;
	}
	public void setCuDriverGetVersion(Object newCuDriverGetVersion) {
		cuDriverGetVersion = newCuDriverGetVersion;
	}
	public Object getCuEventCreate() {
		return cuEventCreate;
	}
	public void setCuEventCreate(Object newCuEventCreate) {
		cuEventCreate = newCuEventCreate;
	}
	public Object getCuEventDestroy() {
		return cuEventDestroy;
	}
	public void setCuEventDestroy(Object newCuEventDestroy) {
		cuEventDestroy = newCuEventDestroy;
	}
	public Object getCuEventElapsedTime() {
		return cuEventElapsedTime;
	}
	public void setCuEventElapsedTime(Object newCuEventElapsedTime) {
		cuEventElapsedTime = newCuEventElapsedTime;
	}
	public Object getCuEventQuery() {
		return cuEventQuery;
	}
	public void setCuEventQuery(Object newCuEventQuery) {
		cuEventQuery = newCuEventQuery;
	}
	public Object getCuEventRecord() {
		return cuEventRecord;
	}
	public void setCuEventRecord(Object newCuEventRecord) {
		cuEventRecord = newCuEventRecord;
	}
	public Object getCuEventSynchronize() {
		return cuEventSynchronize;
	}
	public void setCuEventSynchronize(Object newCuEventSynchronize) {
		cuEventSynchronize = newCuEventSynchronize;
	}
	public Object getCuFuncGetAttribute() {
		return cuFuncGetAttribute;
	}
	public void setCuFuncGetAttribute(Object newCuFuncGetAttribute) {
		cuFuncGetAttribute = newCuFuncGetAttribute;
	}
	public Object getCuFuncSetAttribute() {
		return cuFuncSetAttribute;
	}
	public void setCuFuncSetAttribute(Object newCuFuncSetAttribute) {
		cuFuncSetAttribute = newCuFuncSetAttribute;
	}
	public Object getCuFuncSetCacheConfig() {
		return cuFuncSetCacheConfig;
	}
	public void setCuFuncSetCacheConfig(Object newCuFuncSetCacheConfig) {
		cuFuncSetCacheConfig = newCuFuncSetCacheConfig;
	}
	public Object getCuFuncSetSharedMemConfig() {
		return cuFuncSetSharedMemConfig;
	}
	public void setCuFuncSetSharedMemConfig(Object newCuFuncSetSharedMemConfig) {
		cuFuncSetSharedMemConfig = newCuFuncSetSharedMemConfig;
	}
	public Object getCuGetErrorName() {
		return cuGetErrorName;
	}
	public void setCuGetErrorName(Object newCuGetErrorName) {
		cuGetErrorName = newCuGetErrorName;
	}
	public Object getCuGetErrorString() {
		return cuGetErrorString;
	}
	public void setCuGetErrorString(Object newCuGetErrorString) {
		cuGetErrorString = newCuGetErrorString;
	}
	public Object getCuInit() {
		return cuInit;
	}
	public void setCuInit(Object newCuInit) {
		cuInit = newCuInit;
	}
	public Object getCuLaunchKernel() {
		return cuLaunchKernel;
	}
	public void setCuLaunchKernel(Object newCuLaunchKernel) {
		cuLaunchKernel = newCuLaunchKernel;
	}
	public Object getCuMemAlloc() {
		return cuMemAlloc;
	}
	public void setCuMemAlloc(Object newCuMemAlloc) {
		cuMemAlloc = newCuMemAlloc;
	}
	public Object getCuMemAllocHost() {
		return cuMemAllocHost;
	}
	public void setCuMemAllocHost(Object newCuMemAllocHost) {
		cuMemAllocHost = newCuMemAllocHost;
	}
	public Object getCuMemcpyDtoD() {
		return cuMemcpyDtoD;
	}
	public void setCuMemcpyDtoD(Object newCuMemcpyDtoD) {
		cuMemcpyDtoD = newCuMemcpyDtoD;
	}
	public Object getCuMemcpyDtoH() {
		return cuMemcpyDtoH;
	}
	public void setCuMemcpyDtoH(Object newCuMemcpyDtoH) {
		cuMemcpyDtoH = newCuMemcpyDtoH;
	}
	public Object getCuMemcpyHtoD() {
		return cuMemcpyHtoD;
	}
	public void setCuMemcpyHtoD(Object newCuMemcpyHtoD) {
		cuMemcpyHtoD = newCuMemcpyHtoD;
	}
	public Object getCuMemFree() {
		return cuMemFree;
	}
	public void setCuMemFree(Object newCuMemFree) {
		cuMemFree = newCuMemFree;
	}
	public Object getCuMemFreeHost() {
		return cuMemFreeHost;
	}
	public void setCuMemFreeHost(Object newCuMemFreeHost) {
		cuMemFreeHost = newCuMemFreeHost;
	}
	public Object getCuMemGetInfo() {
		return cuMemGetInfo;
	}
	public void setCuMemGetInfo(Object newCuMemGetInfo) {
		cuMemGetInfo = newCuMemGetInfo;
	}
	public Object getCuMemsetD32() {
		return cuMemsetD32;
	}
	public void setCuMemsetD32(Object newCuMemsetD32) {
		cuMemsetD32 = newCuMemsetD32;
	}
	public Object getCuMemsetD8() {
		return cuMemsetD8;
	}
	public void setCuMemsetD8(Object newCuMemsetD8) {
		cuMemsetD8 = newCuMemsetD8;
	}
	public Object getCuModuleGetFunction() {
		return cuModuleGetFunction;
	}
	public void setCuModuleGetFunction(Object newCuModuleGetFunction) {
		cuModuleGetFunction = newCuModuleGetFunction;
	}
	public Object getCuModuleGetGlobal() {
		return cuModuleGetGlobal;
	}
	public void setCuModuleGetGlobal(Object newCuModuleGetGlobal) {
		cuModuleGetGlobal = newCuModuleGetGlobal;
	}
	public Object getCuModuleLoad() {
		return cuModuleLoad;
	}
	public void setCuModuleLoad(Object newCuModuleLoad) {
		cuModuleLoad = newCuModuleLoad;
	}
	public Object getCuModuleLoadData() {
		return cuModuleLoadData;
	}
	public void setCuModuleLoadData(Object newCuModuleLoadData) {
		cuModuleLoadData = newCuModuleLoadData;
	}
	public Object getCuModuleLoadDataEx() {
		return cuModuleLoadDataEx;
	}
	public void setCuModuleLoadDataEx(Object newCuModuleLoadDataEx) {
		cuModuleLoadDataEx = newCuModuleLoadDataEx;
	}
	public Object getCuModuleUnload() {
		return cuModuleUnload;
	}
	public void setCuModuleUnload(Object newCuModuleUnload) {
		cuModuleUnload = newCuModuleUnload;
	}
	public Object getCuProfilerStart() {
		return cuProfilerStart;
	}
	public void setCuProfilerStart(Object newCuProfilerStart) {
		cuProfilerStart = newCuProfilerStart;
	}
	public Object getCuProfilerStop() {
		return cuProfilerStop;
	}
	public void setCuProfilerStop(Object newCuProfilerStop) {
		cuProfilerStop = newCuProfilerStop;
	}
	public Object getCuStreamCreate() {
		return cuStreamCreate;
	}
	public void setCuStreamCreate(Object newCuStreamCreate) {
		cuStreamCreate = newCuStreamCreate;
	}
	public Object getCuStreamDestroy() {
		return cuStreamDestroy;
	}
	public void setCuStreamDestroy(Object newCuStreamDestroy) {
		cuStreamDestroy = newCuStreamDestroy;
	}
	public Object getCuStreamSynchronize() {
		return cuStreamSynchronize;
	}
	public void setCuStreamSynchronize(Object newCuStreamSynchronize) {
		cuStreamSynchronize = newCuStreamSynchronize;
	}
	public Object getCuStreamWaitEvent() {
		return cuStreamWaitEvent;
	}
	public void setCuStreamWaitEvent(Object newCuStreamWaitEvent) {
		cuStreamWaitEvent = newCuStreamWaitEvent;
	}
}
