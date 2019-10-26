package application;

public class hc_opencl_lib {
	private Object lib;
	private Object clBuildProgram;
	private Object clCreateBuffer;
	private Object clCreateCommandQueue;
	private Object clCreateContext;
	private Object clCreateKernel;
	private Object clCreateProgramWithBinary;
	private Object clCreateProgramWithSource;
	private Object clEnqueueCopyBuffer;
	private Object clEnqueueMapBuffer;
	private Object clEnqueueNDRangeKernel;
	private Object clEnqueueReadBuffer;
	private Object clEnqueueUnmapMemObject;
	private Object clEnqueueWriteBuffer;
	private Object clFinish;
	private Object clFlush;
	private Object clGetDeviceIDs;
	private Object clGetDeviceInfo;
	private Object clGetEventInfo;
	private Object clGetEventProfilingInfo;
	private Object clGetKernelWorkGroupInfo;
	private Object clGetPlatformIDs;
	private Object clGetPlatformInfo;
	private Object clGetProgramBuildInfo;
	private Object clGetProgramInfo;
	private Object clReleaseCommandQueue;
	private Object clReleaseContext;
	private Object clReleaseEvent;
	private Object clReleaseKernel;
	private Object clReleaseMemObject;
	private Object clReleaseProgram;
	private Object clSetKernelArg;
	private Object clWaitForEvents;
	
	public hc_opencl_lib(Object lib, Object clBuildProgram, Object clCreateBuffer, Object clCreateCommandQueue, Object clCreateContext, Object clCreateKernel, Object clCreateProgramWithBinary, Object clCreateProgramWithSource, Object clEnqueueCopyBuffer, Object clEnqueueMapBuffer, Object clEnqueueNDRangeKernel, Object clEnqueueReadBuffer, Object clEnqueueUnmapMemObject, Object clEnqueueWriteBuffer, Object clFinish, Object clFlush, Object clGetDeviceIDs, Object clGetDeviceInfo, Object clGetEventInfo, Object clGetEventProfilingInfo, Object clGetKernelWorkGroupInfo, Object clGetPlatformIDs, Object clGetPlatformInfo, Object clGetProgramBuildInfo, Object clGetProgramInfo, Object clReleaseCommandQueue, Object clReleaseContext, Object clReleaseEvent, Object clReleaseKernel, Object clReleaseMemObject, Object clReleaseProgram, Object clSetKernelArg, Object clWaitForEvents) {
		setLib(lib);
		setClBuildProgram(clBuildProgram);
		setClCreateBuffer(clCreateBuffer);
		setClCreateCommandQueue(clCreateCommandQueue);
		setClCreateContext(clCreateContext);
		setClCreateKernel(clCreateKernel);
		setClCreateProgramWithBinary(clCreateProgramWithBinary);
		setClCreateProgramWithSource(clCreateProgramWithSource);
		setClEnqueueCopyBuffer(clEnqueueCopyBuffer);
		setClEnqueueMapBuffer(clEnqueueMapBuffer);
		setClEnqueueNDRangeKernel(clEnqueueNDRangeKernel);
		setClEnqueueReadBuffer(clEnqueueReadBuffer);
		setClEnqueueUnmapMemObject(clEnqueueUnmapMemObject);
		setClEnqueueWriteBuffer(clEnqueueWriteBuffer);
		setClFinish(clFinish);
		setClFlush(clFlush);
		setClGetDeviceIDs(clGetDeviceIDs);
		setClGetDeviceInfo(clGetDeviceInfo);
		setClGetEventInfo(clGetEventInfo);
		setClGetEventProfilingInfo(clGetEventProfilingInfo);
		setClGetKernelWorkGroupInfo(clGetKernelWorkGroupInfo);
		setClGetPlatformIDs(clGetPlatformIDs);
		setClGetPlatformInfo(clGetPlatformInfo);
		setClGetProgramBuildInfo(clGetProgramBuildInfo);
		setClGetProgramInfo(clGetProgramInfo);
		setClReleaseCommandQueue(clReleaseCommandQueue);
		setClReleaseContext(clReleaseContext);
		setClReleaseEvent(clReleaseEvent);
		setClReleaseKernel(clReleaseKernel);
		setClReleaseMemObject(clReleaseMemObject);
		setClReleaseProgram(clReleaseProgram);
		setClSetKernelArg(clSetKernelArg);
		setClWaitForEvents(clWaitForEvents);
	}
	public hc_opencl_lib() {
	}
	
	public Object getLib() {
		return lib;
	}
	public void setLib(Object newLib) {
		lib = newLib;
	}
	public Object getClBuildProgram() {
		return clBuildProgram;
	}
	public void setClBuildProgram(Object newClBuildProgram) {
		clBuildProgram = newClBuildProgram;
	}
	public Object getClCreateBuffer() {
		return clCreateBuffer;
	}
	public void setClCreateBuffer(Object newClCreateBuffer) {
		clCreateBuffer = newClCreateBuffer;
	}
	public Object getClCreateCommandQueue() {
		return clCreateCommandQueue;
	}
	public void setClCreateCommandQueue(Object newClCreateCommandQueue) {
		clCreateCommandQueue = newClCreateCommandQueue;
	}
	public Object getClCreateContext() {
		return clCreateContext;
	}
	public void setClCreateContext(Object newClCreateContext) {
		clCreateContext = newClCreateContext;
	}
	public Object getClCreateKernel() {
		return clCreateKernel;
	}
	public void setClCreateKernel(Object newClCreateKernel) {
		clCreateKernel = newClCreateKernel;
	}
	public Object getClCreateProgramWithBinary() {
		return clCreateProgramWithBinary;
	}
	public void setClCreateProgramWithBinary(Object newClCreateProgramWithBinary) {
		clCreateProgramWithBinary = newClCreateProgramWithBinary;
	}
	public Object getClCreateProgramWithSource() {
		return clCreateProgramWithSource;
	}
	public void setClCreateProgramWithSource(Object newClCreateProgramWithSource) {
		clCreateProgramWithSource = newClCreateProgramWithSource;
	}
	public Object getClEnqueueCopyBuffer() {
		return clEnqueueCopyBuffer;
	}
	public void setClEnqueueCopyBuffer(Object newClEnqueueCopyBuffer) {
		clEnqueueCopyBuffer = newClEnqueueCopyBuffer;
	}
	public Object getClEnqueueMapBuffer() {
		return clEnqueueMapBuffer;
	}
	public void setClEnqueueMapBuffer(Object newClEnqueueMapBuffer) {
		clEnqueueMapBuffer = newClEnqueueMapBuffer;
	}
	public Object getClEnqueueNDRangeKernel() {
		return clEnqueueNDRangeKernel;
	}
	public void setClEnqueueNDRangeKernel(Object newClEnqueueNDRangeKernel) {
		clEnqueueNDRangeKernel = newClEnqueueNDRangeKernel;
	}
	public Object getClEnqueueReadBuffer() {
		return clEnqueueReadBuffer;
	}
	public void setClEnqueueReadBuffer(Object newClEnqueueReadBuffer) {
		clEnqueueReadBuffer = newClEnqueueReadBuffer;
	}
	public Object getClEnqueueUnmapMemObject() {
		return clEnqueueUnmapMemObject;
	}
	public void setClEnqueueUnmapMemObject(Object newClEnqueueUnmapMemObject) {
		clEnqueueUnmapMemObject = newClEnqueueUnmapMemObject;
	}
	public Object getClEnqueueWriteBuffer() {
		return clEnqueueWriteBuffer;
	}
	public void setClEnqueueWriteBuffer(Object newClEnqueueWriteBuffer) {
		clEnqueueWriteBuffer = newClEnqueueWriteBuffer;
	}
	public Object getClFinish() {
		return clFinish;
	}
	public void setClFinish(Object newClFinish) {
		clFinish = newClFinish;
	}
	public Object getClFlush() {
		return clFlush;
	}
	public void setClFlush(Object newClFlush) {
		clFlush = newClFlush;
	}
	public Object getClGetDeviceIDs() {
		return clGetDeviceIDs;
	}
	public void setClGetDeviceIDs(Object newClGetDeviceIDs) {
		clGetDeviceIDs = newClGetDeviceIDs;
	}
	public Object getClGetDeviceInfo() {
		return clGetDeviceInfo;
	}
	public void setClGetDeviceInfo(Object newClGetDeviceInfo) {
		clGetDeviceInfo = newClGetDeviceInfo;
	}
	public Object getClGetEventInfo() {
		return clGetEventInfo;
	}
	public void setClGetEventInfo(Object newClGetEventInfo) {
		clGetEventInfo = newClGetEventInfo;
	}
	public Object getClGetEventProfilingInfo() {
		return clGetEventProfilingInfo;
	}
	public void setClGetEventProfilingInfo(Object newClGetEventProfilingInfo) {
		clGetEventProfilingInfo = newClGetEventProfilingInfo;
	}
	public Object getClGetKernelWorkGroupInfo() {
		return clGetKernelWorkGroupInfo;
	}
	public void setClGetKernelWorkGroupInfo(Object newClGetKernelWorkGroupInfo) {
		clGetKernelWorkGroupInfo = newClGetKernelWorkGroupInfo;
	}
	public Object getClGetPlatformIDs() {
		return clGetPlatformIDs;
	}
	public void setClGetPlatformIDs(Object newClGetPlatformIDs) {
		clGetPlatformIDs = newClGetPlatformIDs;
	}
	public Object getClGetPlatformInfo() {
		return clGetPlatformInfo;
	}
	public void setClGetPlatformInfo(Object newClGetPlatformInfo) {
		clGetPlatformInfo = newClGetPlatformInfo;
	}
	public Object getClGetProgramBuildInfo() {
		return clGetProgramBuildInfo;
	}
	public void setClGetProgramBuildInfo(Object newClGetProgramBuildInfo) {
		clGetProgramBuildInfo = newClGetProgramBuildInfo;
	}
	public Object getClGetProgramInfo() {
		return clGetProgramInfo;
	}
	public void setClGetProgramInfo(Object newClGetProgramInfo) {
		clGetProgramInfo = newClGetProgramInfo;
	}
	public Object getClReleaseCommandQueue() {
		return clReleaseCommandQueue;
	}
	public void setClReleaseCommandQueue(Object newClReleaseCommandQueue) {
		clReleaseCommandQueue = newClReleaseCommandQueue;
	}
	public Object getClReleaseContext() {
		return clReleaseContext;
	}
	public void setClReleaseContext(Object newClReleaseContext) {
		clReleaseContext = newClReleaseContext;
	}
	public Object getClReleaseEvent() {
		return clReleaseEvent;
	}
	public void setClReleaseEvent(Object newClReleaseEvent) {
		clReleaseEvent = newClReleaseEvent;
	}
	public Object getClReleaseKernel() {
		return clReleaseKernel;
	}
	public void setClReleaseKernel(Object newClReleaseKernel) {
		clReleaseKernel = newClReleaseKernel;
	}
	public Object getClReleaseMemObject() {
		return clReleaseMemObject;
	}
	public void setClReleaseMemObject(Object newClReleaseMemObject) {
		clReleaseMemObject = newClReleaseMemObject;
	}
	public Object getClReleaseProgram() {
		return clReleaseProgram;
	}
	public void setClReleaseProgram(Object newClReleaseProgram) {
		clReleaseProgram = newClReleaseProgram;
	}
	public Object getClSetKernelArg() {
		return clSetKernelArg;
	}
	public void setClSetKernelArg(Object newClSetKernelArg) {
		clSetKernelArg = newClSetKernelArg;
	}
	public Object getClWaitForEvents() {
		return clWaitForEvents;
	}
	public void setClWaitForEvents(Object newClWaitForEvents) {
		clWaitForEvents = newClWaitForEvents;
	}
}
