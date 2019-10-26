package application;

/* this is BIG, so put it last */
public class imap_buffer {
	private imap_socket sock;
	private int bytes;
	private int offset;
	private Object buf;
	
	public imap_buffer(imap_socket sock, int bytes, int offset, Object buf) {
		setSock(sock);
		setBytes(bytes);
		setOffset(offset);
		setBuf(buf);
	}
	public imap_buffer() {
	}
	
	/* simple line buffering */
	public int buffer_gets(byte s) {
		int n;
		int generatedOffset = this.getOffset();
		int start = generatedOffset;
		Object generatedBuf = this.getBuf();
		s = generatedBuf + start;
		int generatedBytes = this.getBytes();
		imap_socket generatedSock = this.getSock();
		for (; ; ) {
			if (generatedOffset + 1 >= generatedBytes) {
				if (start) {
					s = generatedBuf;
					((start <= generatedBytes) ? (Object)0 : ._assert("start <= b->bytes", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\imap-send.c", 419));
					n = generatedBytes - start;
					if (n) {
						.memmove(generatedBuf, generatedBuf + start, n);
					} 
					generatedOffset -= start;
					this.setBytes(n);
					start = 0;
				} 
				n = generatedSock.socket_read(generatedBuf + generatedBytes,  - generatedBytes);
				if (n <= 0) {
					return -1;
				} 
				generatedBytes += n;
			} 
			if (generatedBuf[generatedOffset] == (byte)'\r') {
				((generatedOffset + 1 < generatedBytes) ? (Object)0 : ._assert("b->offset + 1 < b->bytes", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\imap-send.c", 439));
				if (generatedBuf[generatedOffset + 1] == (byte)'\n') {
					generatedBuf[generatedOffset] = /* terminate the string */0;
					generatedOffset += /* next line */2;
					if (0 < ModernizedCProgram.verbosity) {
						.puts(s);
					} 
					return 0;
				} 
			} 
			generatedOffset++;
		}
	}
	public imap_socket getSock() {
		return sock;
	}
	public void setSock(imap_socket newSock) {
		sock = newSock;
	}
	public int getBytes() {
		return bytes;
	}
	public void setBytes(int newBytes) {
		bytes = newBytes;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int newOffset) {
		offset = newOffset;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
}
