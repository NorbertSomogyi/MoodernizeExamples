package application;

public class nvmlUtilization_st {
	private int gpu;
	private int memory;
	
	public nvmlUtilization_st(int gpu, int memory) {
		setGpu(gpu);
		setMemory(memory);
	}
	public nvmlUtilization_st() {
	}
	
	public int getGpu() {
		return gpu;
	}
	public void setGpu(int newGpu) {
		gpu = newGpu;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int newMemory) {
		memory = newMemory;
	}
}
