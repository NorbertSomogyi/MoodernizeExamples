package application;

/* Stream state: Transfer in this direction finished. */
/* Unidirectional transfer. */
public class unidirectional_transfer {
	private int src;
	private int dest;
	private int src_is_sock;
	private int dest_is_sock;
	private int state;
	private Object buf;
	private Object bufuse;
	private Object src_name;
	private Object dest_name;
	
	public unidirectional_transfer(int src, int dest, int src_is_sock, int dest_is_sock, int state, Object buf, Object bufuse, Object src_name, Object dest_name) {
		setSrc(src);
		setDest(dest);
		setSrc_is_sock(src_is_sock);
		setDest_is_sock(dest_is_sock);
		setState(state);
		setBuf(buf);
		setBufuse(bufuse);
		setSrc_name(src_name);
		setDest_name(dest_name);
	}
	public unidirectional_transfer() {
	}
	
	/* Closes the target (for writing) if transfer has finished. */
	public void udt_close_if_finished() {
		int generatedState = this.getState();
		Object generatedBufuse = this.getBufuse();
		int generatedDest_is_sock = this.getDest_is_sock();
		int generatedDest = this.getDest();
		Object generatedDest_name = this.getDest_name();
		if (((generatedState) == 1) && !generatedBufuse) {
			this.setState(2);
			if (generatedDest_is_sock) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/shutdown(generatedDest, SHUT_WR);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedDest);
			} 
			ModernizedCProgram.transfer_debug("Closed %s.", generatedDest_name);
		} 
	}
	public int udt_do_read() {
		ssize_t bytes = new ssize_t();
		Object generatedBufuse = this.getBufuse();
		if (generatedBufuse == 65536) {
			return /* No space for more. */0;
		} 
		Object generatedSrc_name = this.getSrc_name();
		ModernizedCProgram.transfer_debug("%s is readable", generatedSrc_name);
		int generatedSrc = this.getSrc();
		Object generatedBuf = this.getBuf();
		bytes = ModernizedCProgram.xread(generatedSrc, generatedBuf + generatedBufuse, 65536 - generatedBufuse);
		if (bytes < 0) {
			();
			return -1;
		}  else if (bytes == 0) {
			ModernizedCProgram.transfer_debug("%s EOF (with %i bytes in buffer)", generatedSrc_name, (int)generatedBufuse);
			this.setState(1);
		}  else if (bytes > 0) {
			generatedBufuse += bytes;
			ModernizedCProgram.transfer_debug("Read %i bytes from %s (buffer now at %i)", (int)bytes, generatedSrc_name, (int)generatedBufuse);
		} 
		return 0/* Tries to write data from buffer into destination. If buffer is empty,
		 * no data is written. Returns 0 on success, -1 on error.
		 */;
	}
	public int udt_do_write() {
		ssize_t bytes = new ssize_t();
		Object generatedBufuse = this.getBufuse();
		if (generatedBufuse == 0) {
			return /* Nothing to write. */0;
		} 
		Object generatedDest_name = this.getDest_name();
		ModernizedCProgram.transfer_debug("%s is writable", generatedDest_name);
		int generatedDest = this.getDest();
		Object generatedBuf = this.getBuf();
		bytes = ModernizedCProgram.xwrite(generatedDest, generatedBuf, generatedBufuse);
		if (bytes < 0) {
			();
			return -1;
		}  else if (bytes > 0) {
			generatedBufuse -= bytes;
			if (generatedBufuse) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(generatedBuf, generatedBuf + bytes, generatedBufuse);
			} 
			ModernizedCProgram.transfer_debug("Wrote %i bytes to %s (buffer now at %i)", (int)bytes, generatedDest_name, (int)generatedBufuse);
		} 
		return 0;
	}
	public int getSrc() {
		return src;
	}
	public void setSrc(int newSrc) {
		src = newSrc;
	}
	public int getDest() {
		return dest;
	}
	public void setDest(int newDest) {
		dest = newDest;
	}
	public int getSrc_is_sock() {
		return src_is_sock;
	}
	public void setSrc_is_sock(int newSrc_is_sock) {
		src_is_sock = newSrc_is_sock;
	}
	public int getDest_is_sock() {
		return dest_is_sock;
	}
	public void setDest_is_sock(int newDest_is_sock) {
		dest_is_sock = newDest_is_sock;
	}
	public int getState() {
		return state;
	}
	public void setState(int newState) {
		state = newState;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public Object getBufuse() {
		return bufuse;
	}
	public void setBufuse(Object newBufuse) {
		bufuse = newBufuse;
	}
	public Object getSrc_name() {
		return src_name;
	}
	public void setSrc_name(Object newSrc_name) {
		src_name = newSrc_name;
	}
	public Object getDest_name() {
		return dest_name;
	}
	public void setDest_name(Object newDest_name) {
		dest_name = newDest_name;
	}
}
/* Source */
/* Direction from git to program. */
