package application;

public class device_info {
	private boolean skipped_dev;
	private boolean skipped_warning_dev;
	private double hashes_msec_dev;
	private double hashes_msec_dev_benchmark;
	private double exec_msec_dev;
	private Byte speed_sec_dev;
	private Byte guess_candidates_dev;
	private Byte hwmon_dev;
	private int corespeed_dev;
	private int memoryspeed_dev;
	private double runtime_msec_dev;
	private Object progress_dev;
	private int kernel_accel_dev;
	private int kernel_loops_dev;
	private int kernel_threads_dev;
	private int vector_width_dev;
	private int salt_pos_dev;
	private int innerloop_pos_dev;
	private int innerloop_left_dev;
	private int iteration_pos_dev;
	private int iteration_left_dev;
	
	public device_info(boolean skipped_dev, boolean skipped_warning_dev, double hashes_msec_dev, double hashes_msec_dev_benchmark, double exec_msec_dev, Byte speed_sec_dev, Byte guess_candidates_dev, Byte hwmon_dev, int corespeed_dev, int memoryspeed_dev, double runtime_msec_dev, Object progress_dev, int kernel_accel_dev, int kernel_loops_dev, int kernel_threads_dev, int vector_width_dev, int salt_pos_dev, int innerloop_pos_dev, int innerloop_left_dev, int iteration_pos_dev, int iteration_left_dev) {
		setSkipped_dev(skipped_dev);
		setSkipped_warning_dev(skipped_warning_dev);
		setHashes_msec_dev(hashes_msec_dev);
		setHashes_msec_dev_benchmark(hashes_msec_dev_benchmark);
		setExec_msec_dev(exec_msec_dev);
		setSpeed_sec_dev(speed_sec_dev);
		setGuess_candidates_dev(guess_candidates_dev);
		setHwmon_dev(hwmon_dev);
		setCorespeed_dev(corespeed_dev);
		setMemoryspeed_dev(memoryspeed_dev);
		setRuntime_msec_dev(runtime_msec_dev);
		setProgress_dev(progress_dev);
		setKernel_accel_dev(kernel_accel_dev);
		setKernel_loops_dev(kernel_loops_dev);
		setKernel_threads_dev(kernel_threads_dev);
		setVector_width_dev(vector_width_dev);
		setSalt_pos_dev(salt_pos_dev);
		setInnerloop_pos_dev(innerloop_pos_dev);
		setInnerloop_left_dev(innerloop_left_dev);
		setIteration_pos_dev(iteration_pos_dev);
		setIteration_left_dev(iteration_left_dev);
	}
	public device_info() {
	}
	
	public boolean getSkipped_dev() {
		return skipped_dev;
	}
	public void setSkipped_dev(boolean newSkipped_dev) {
		skipped_dev = newSkipped_dev;
	}
	public boolean getSkipped_warning_dev() {
		return skipped_warning_dev;
	}
	public void setSkipped_warning_dev(boolean newSkipped_warning_dev) {
		skipped_warning_dev = newSkipped_warning_dev;
	}
	public double getHashes_msec_dev() {
		return hashes_msec_dev;
	}
	public void setHashes_msec_dev(double newHashes_msec_dev) {
		hashes_msec_dev = newHashes_msec_dev;
	}
	public double getHashes_msec_dev_benchmark() {
		return hashes_msec_dev_benchmark;
	}
	public void setHashes_msec_dev_benchmark(double newHashes_msec_dev_benchmark) {
		hashes_msec_dev_benchmark = newHashes_msec_dev_benchmark;
	}
	public double getExec_msec_dev() {
		return exec_msec_dev;
	}
	public void setExec_msec_dev(double newExec_msec_dev) {
		exec_msec_dev = newExec_msec_dev;
	}
	public Byte getSpeed_sec_dev() {
		return speed_sec_dev;
	}
	public void setSpeed_sec_dev(Byte newSpeed_sec_dev) {
		speed_sec_dev = newSpeed_sec_dev;
	}
	public Byte getGuess_candidates_dev() {
		return guess_candidates_dev;
	}
	public void setGuess_candidates_dev(Byte newGuess_candidates_dev) {
		guess_candidates_dev = newGuess_candidates_dev;
	}
	public Byte getHwmon_dev() {
		return hwmon_dev;
	}
	public void setHwmon_dev(Byte newHwmon_dev) {
		hwmon_dev = newHwmon_dev;
	}
	public int getCorespeed_dev() {
		return corespeed_dev;
	}
	public void setCorespeed_dev(int newCorespeed_dev) {
		corespeed_dev = newCorespeed_dev;
	}
	public int getMemoryspeed_dev() {
		return memoryspeed_dev;
	}
	public void setMemoryspeed_dev(int newMemoryspeed_dev) {
		memoryspeed_dev = newMemoryspeed_dev;
	}
	public double getRuntime_msec_dev() {
		return runtime_msec_dev;
	}
	public void setRuntime_msec_dev(double newRuntime_msec_dev) {
		runtime_msec_dev = newRuntime_msec_dev;
	}
	public Object getProgress_dev() {
		return progress_dev;
	}
	public void setProgress_dev(Object newProgress_dev) {
		progress_dev = newProgress_dev;
	}
	public int getKernel_accel_dev() {
		return kernel_accel_dev;
	}
	public void setKernel_accel_dev(int newKernel_accel_dev) {
		kernel_accel_dev = newKernel_accel_dev;
	}
	public int getKernel_loops_dev() {
		return kernel_loops_dev;
	}
	public void setKernel_loops_dev(int newKernel_loops_dev) {
		kernel_loops_dev = newKernel_loops_dev;
	}
	public int getKernel_threads_dev() {
		return kernel_threads_dev;
	}
	public void setKernel_threads_dev(int newKernel_threads_dev) {
		kernel_threads_dev = newKernel_threads_dev;
	}
	public int getVector_width_dev() {
		return vector_width_dev;
	}
	public void setVector_width_dev(int newVector_width_dev) {
		vector_width_dev = newVector_width_dev;
	}
	public int getSalt_pos_dev() {
		return salt_pos_dev;
	}
	public void setSalt_pos_dev(int newSalt_pos_dev) {
		salt_pos_dev = newSalt_pos_dev;
	}
	public int getInnerloop_pos_dev() {
		return innerloop_pos_dev;
	}
	public void setInnerloop_pos_dev(int newInnerloop_pos_dev) {
		innerloop_pos_dev = newInnerloop_pos_dev;
	}
	public int getInnerloop_left_dev() {
		return innerloop_left_dev;
	}
	public void setInnerloop_left_dev(int newInnerloop_left_dev) {
		innerloop_left_dev = newInnerloop_left_dev;
	}
	public int getIteration_pos_dev() {
		return iteration_pos_dev;
	}
	public void setIteration_pos_dev(int newIteration_pos_dev) {
		iteration_pos_dev = newIteration_pos_dev;
	}
	public int getIteration_left_dev() {
		return iteration_left_dev;
	}
	public void setIteration_left_dev(int newIteration_left_dev) {
		iteration_left_dev = newIteration_left_dev;
	}
}
