package application;

public class ReadWriteSockets {
	private Sockets read;
	private Sockets write;
	
	public ReadWriteSockets(Sockets read, Sockets write) {
		setRead(read);
		setWrite(write);
	}
	public ReadWriteSockets() {
	}
	
	public Sockets getRead() {
		return read;
	}
	public void setRead(Sockets newRead) {
		read = newRead;
	}
	public Sockets getWrite() {
		return write;
	}
	public void setWrite(Sockets newWrite) {
		write = newWrite;
	}
}
