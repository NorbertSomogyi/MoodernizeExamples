package application;

/* "PACK" */
public class pack_header {
	private Object hdr_signature;
	private Object hdr_version;
	private Object hdr_entries;
	
	public pack_header(Object hdr_signature, Object hdr_version, Object hdr_entries) {
		setHdr_signature(hdr_signature);
		setHdr_version(hdr_version);
		setHdr_entries(hdr_entries);
	}
	public pack_header() {
	}
	
	public Object parse_pack_header() {
		switch (hdr.read_pack_header(0)) {
		case (true):
				return "protocol error (pack signature mismatch detected)";
		case 0:
				return ((Object)0);
		case (true):
				return "protocol error (pack version unsupported)";
		case (true):
				return "eof before pack header was fully read";
		default:
				return "unknown error in parse_pack_header";
		}
		all_attrs_item all_attrs_item = new all_attrs_item();
		pack_header hdr = all_attrs_item.fill();
		Object generatedHdr_signature = this.getHdr_signature();
		if (generatedHdr_signature != .htonl(/* Header consistency check */-1024)) {
			ModernizedCProgram.die(ModernizedCProgram._("pack signature mismatch"));
		} 
		Object generatedHdr_version = this.getHdr_version();
		if (!((generatedHdr_version) == .htonl(2) || (generatedHdr_version) == .htonl(3))) {
			ModernizedCProgram.die(ModernizedCProgram._("pack version %u unsupported"), .ntohl(generatedHdr_version));
		} 
		Object generatedHdr_entries = this.getHdr_entries();
		ModernizedCProgram.nr_objects = .ntohl(generatedHdr_entries);
		ModernizedCProgram.use();
	}
	public int read_pack_header(int fd) {
		if (ModernizedCProgram.read_in_full(fd, header, ) != ) {
			return (/* "eof before pack header was fully read" */true);
		} 
		Object generatedHdr_signature = this.getHdr_signature();
		if (generatedHdr_signature != .htonl(-1024)) {
			return (/* "protocol error (pack signature mismatch detected)" */true);
		} 
		Object generatedHdr_version = this.getHdr_version();
		if (!((generatedHdr_version) == .htonl(2) || (generatedHdr_version) == .htonl(3))) {
			return (/* "protocol error (pack version unsupported)" */true);
		} 
		return 0;
	}
	public Object getHdr_signature() {
		return hdr_signature;
	}
	public void setHdr_signature(Object newHdr_signature) {
		hdr_signature = newHdr_signature;
	}
	public Object getHdr_version() {
		return hdr_version;
	}
	public void setHdr_version(Object newHdr_version) {
		hdr_version = newHdr_version;
	}
	public Object getHdr_entries() {
		return hdr_entries;
	}
	public void setHdr_entries(Object newHdr_entries) {
		hdr_entries = newHdr_entries;
	}
}
