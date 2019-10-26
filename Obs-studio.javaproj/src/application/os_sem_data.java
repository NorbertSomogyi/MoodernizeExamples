package application;

public class os_sem_data {
	private Object sem;
	
	public os_sem_data(Object sem) {
		setSem(sem);
	}
	public os_sem_data() {
	}
	
	public int os_sem_init(int value) {
		sem_t new_sem = new sem_t();
		int ret = ModernizedCProgram.sem_init(new_sem, 0, value);
		if (ret != 0) {
			return ret;
		} 
		sem = ModernizedCProgram.bzalloc();
		(sem).setSem(new_sem);
		return 0;
		HANDLE handle = .CreateSemaphoreA(((Object)0), (LONG)value, -1024, ((Object)0));
		if (!handle) {
			return -1;
		} 
		sem = (os_sem_t)handle;
		return 0;
	}
	public void os_sem_destroy() {
		Object generatedSem = this.getSem();
		if (sem) {
			ModernizedCProgram.sem_destroy(generatedSem);
			ModernizedCProgram.bfree(sem);
		} 
		if (sem) {
			.CloseHandle((HANDLE)sem);
		} 
	}
	public int os_sem_post() {
		if (!sem) {
			return -1;
		} 
		Object generatedSem = this.getSem();
		return ModernizedCProgram.sem_post(generatedSem);
		if (!sem) {
			return -1;
		} 
		return .ReleaseSemaphore((HANDLE)sem, 1, ((Object)0)) ? 0 : -1;
	}
	public int os_sem_wait() {
		if (!sem) {
			return -1;
		} 
		Object generatedSem = this.getSem();
		return ModernizedCProgram.sem_wait(generatedSem);
		DWORD ret = new DWORD();
		if (!sem) {
			return -1;
		} 
		ret = .WaitForSingleObject((HANDLE)sem, -1024);
		return (ret == 0) ? 0 : -1;
	}
	public Object getSem() {
		return sem;
	}
	public void setSem(Object newSem) {
		sem = newSem;
	}
}
