package application;

public class packet_reader {
	private int fd;
	private Byte src_buffer;
	private Object src_len;
	private Byte buffer;
	private int buffer_size;
	private int options;
	private packet_read_status status;
	private int pktlen;
	private Object[] line;
	private int line_peeked;
	private int use_sideband;
	private Object me;
	
	public packet_reader(int fd, Byte src_buffer, Object src_len, Byte buffer, int buffer_size, int options, packet_read_status status, int pktlen, Object[] line, int line_peeked, int use_sideband, Object me) {
		setFd(fd);
		setSrc_buffer(src_buffer);
		setSrc_len(src_len);
		setBuffer(buffer);
		setBuffer_size(buffer_size);
		setOptions(options);
		setStatus(status);
		setPktlen(pktlen);
		setLine(line);
		setLine_peeked(line_peeked);
		setUse_sideband(use_sideband);
		setMe(me);
	}
	public packet_reader() {
	}
	
	public void process_capabilities_v2() {
		Object[] generatedLine = this.getLine();
		while (reader.packet_reader_read() == packet_read_status.PACKET_READ_NORMAL) {
			ModernizedCProgram.server_capabilities_v2.argv_array_push(generatedLine);
		}
		packet_read_status generatedStatus = this.getStatus();
		if (generatedStatus != packet_read_status.PACKET_READ_FLUSH) {
			ModernizedCProgram.die(ModernizedCProgram._("expected flush after capabilities"));
		} 
	}
	public protocol_version discover_version() {
		protocol_version version = protocol_version.protocol_unknown_version/*
			 * Peek the first line of the server's response to
			 * determine the protocol version the server is speaking.
			 */;
		Object[] generatedLine = this.getLine();
		switch (reader.packet_reader_peek()) {
		case packet_read_status.PACKET_READ_DELIM:
				protocol_version.version = protocol_version.protocol_v0;
				break;
		case packet_read_status.PACKET_READ_EOF:
				ModernizedCProgram.die_initial_contact(0);
		case packet_read_status.PACKET_READ_FLUSH:
		case packet_read_status.PACKET_READ_NORMAL:
				protocol_version.version = ModernizedCProgram.determine_protocol_version_client(generatedLine);
				break;
		}
		switch (protocol_version.version) {
		case protocol_version.protocol_v1:
				/* Read the peeked version line */reader.packet_reader_read();
				break;
		case protocol_version.protocol_unknown_version:
				ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\connect.c", 148, "unknown protocol version");
		case protocol_version.protocol_v2:
				reader.process_capabilities_v2();
				break;
		case protocol_version.protocol_v0:
				break;
		}
		return protocol_version.version;
	}
	/* Packet Reader Functions */
	public void packet_reader_init(int fd, Byte src_buffer, Object src_len, int options) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(reader, 0, /*Error: sizeof expression not supported yet*/);
		this.setFd(fd);
		this.setSrc_buffer(src_buffer);
		this.setSrc_len(src_len);
		this.setBuffer(ModernizedCProgram.packet_buffer);
		this.setBuffer_size(/*Error: sizeof expression not supported yet*/);
		this.setOptions(options);
		this.setMe("git");
	}
	public packet_read_status packet_reader_read() {
		strbuf scratch = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int generatedLine_peeked = this.getLine_peeked();
		packet_read_status generatedStatus = this.getStatus();
		if (generatedLine_peeked) {
			this.setLine_peeked(0);
			return generatedStatus;
		} 
		int generatedFd = this.getFd();
		Byte generatedSrc_buffer = this.getSrc_buffer();
		Object generatedSrc_len = this.getSrc_len();
		Byte generatedBuffer = this.getBuffer();
		int generatedBuffer_size = this.getBuffer_size();
		int generatedPktlen = this.getPktlen();
		int generatedOptions = this.getOptions();
		int generatedUse_sideband = this.getUse_sideband();
		Object generatedMe = this.getMe();
		while (1) {
			sideband_type sideband_type;
			this.setStatus(ModernizedCProgram.packet_read_with_status(generatedFd, generatedSrc_buffer, generatedSrc_len, generatedBuffer, generatedBuffer_size, generatedPktlen, generatedOptions));
			if (!generatedUse_sideband) {
				break;
			} 
			if (scratch.demultiplex_sideband(generatedMe, generatedBuffer, generatedPktlen, 1, sideband_type.sideband_type)) {
				break;
			} 
		}
		if (generatedStatus == packet_read_status.PACKET_READ_NORMAL) {
			this.setLine(generatedUse_sideband ? generatedBuffer + 1 : generatedBuffer);
		} else {
				this.setLine(((Object)0));
		} 
		return generatedStatus;
	}
	public packet_read_status packet_reader_peek() {
		int generatedLine_peeked = this.getLine_peeked();
		packet_read_status generatedStatus = this.getStatus();
		if (generatedLine_peeked) {
			return generatedStatus;
		} 
		/* Peek a line by reading it and setting peeked flag */reader.packet_reader_read();
		this.setLine_peeked(1);
		return generatedStatus;
	}
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public Byte getSrc_buffer() {
		return src_buffer;
	}
	public void setSrc_buffer(Byte newSrc_buffer) {
		src_buffer = newSrc_buffer;
	}
	public Object getSrc_len() {
		return src_len;
	}
	public void setSrc_len(Object newSrc_len) {
		src_len = newSrc_len;
	}
	public Byte getBuffer() {
		return buffer;
	}
	public void setBuffer(Byte newBuffer) {
		buffer = newBuffer;
	}
	public int getBuffer_size() {
		return buffer_size;
	}
	public void setBuffer_size(int newBuffer_size) {
		buffer_size = newBuffer_size;
	}
	public int getOptions() {
		return options;
	}
	public void setOptions(int newOptions) {
		options = newOptions;
	}
	public packet_read_status getStatus() {
		return status;
	}
	public void setStatus(packet_read_status newStatus) {
		status = newStatus;
	}
	public int getPktlen() {
		return pktlen;
	}
	public void setPktlen(int newPktlen) {
		pktlen = newPktlen;
	}
	public Object[] getLine() {
		return line;
	}
	public void setLine(Object[] newLine) {
		line = newLine;
	}
	public int getLine_peeked() {
		return line_peeked;
	}
	public void setLine_peeked(int newLine_peeked) {
		line_peeked = newLine_peeked;
	}
	public int getUse_sideband() {
		return use_sideband;
	}
	public void setUse_sideband(int newUse_sideband) {
		use_sideband = newUse_sideband;
	}
	public Object getMe() {
		return me;
	}
	public void setMe(Object newMe) {
		me = newMe;
	}
}
/* source file descriptor */
