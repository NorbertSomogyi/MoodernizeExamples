package application;

public class io_pump {
	private int fd;
	private int type;
	private  u;
	private int error;
	private compat_pollfd pfd;
	
	public io_pump(int fd, int type,  u, int error, compat_pollfd pfd) {
		setFd(fd);
		setType(type);
		setU(u);
		setError(error);
		setPfd(pfd);
	}
	public io_pump() {
	}
	
	public int pump_io(int nr) {
		compat_pollfd pfd = new compat_pollfd();
		int i;
		for (i = 0; i < nr; i++) {
			slots[i].setError(0);
		}
		(pfd) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (nr)));
		while (ModernizedCProgram.pump_io_round(slots, nr, pfd)) {
			;
		}
		ModernizedCProgram.free(pfd);
		for (i = 0; i < nr; /* There may be multiple errno values, so just pick the first. */i++) {
			if (slots[i].getError()) {
				(/*Error: Function owner not recognized*/_errno()) = slots[i].getError();
				return -1;
			} 
		}
		return 0;
	}
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public int getType() {
		return type;
	}
	public void setType(int newType) {
		type = newType;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
	public int getError() {
		return error;
	}
	public void setError(int newError) {
		error = newError;
	}
	public compat_pollfd getPfd() {
		return pfd;
	}
	public void setPfd(compat_pollfd newPfd) {
		pfd = newPfd;
	}
}
/* initialized by caller */
