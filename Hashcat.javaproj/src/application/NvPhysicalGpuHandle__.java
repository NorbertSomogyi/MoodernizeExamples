package application;

/**
 * Author......: See docs/credits.txt
 * License.....: MIT
 */
/**
 * Declarations from nvapi.h and subheaders
 */
// A single physical GPU
public class NvPhysicalGpuHandle__ {
	private int unused;
	
	public NvPhysicalGpuHandle__(int unused) {
		setUnused(unused);
	}
	public NvPhysicalGpuHandle__() {
	}
	
	public int getUnused() {
		return unused;
	}
	public void setUnused(int newUnused) {
		unused = newUnused;
	}
}
