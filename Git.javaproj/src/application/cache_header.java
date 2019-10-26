package application;

/* used internally in tree-diff */
/*
 * Intensive research over the course of many years has shown that
 * port 9418 is totally unused by anything else. Or
 *
 *	Your search - "port 9418" - did not match any documents.
 *
 * as www.google.com puts it.
 *
 * This port has been properly assigned for git use by IANA:
 * git (Assigned-9418) [I06-050728-0001].
 *
 *	git  9418/tcp   git pack transfer service
 *	git  9418/udp   git pack transfer service
 *
 * with Linus Torvalds <torvalds@osdl.org> as the point of
 * contact. September 2005.
 *
 * See http://www.iana.org/assignments/port-numbers
 */
/*
 * Basic data structures for the directory cache
 */
/* "DIRC" */
public class cache_header {
	private Object hdr_signature;
	private Object hdr_version;
	private Object hdr_entries;
	
	public cache_header(Object hdr_signature, Object hdr_version, Object hdr_entries) {
		setHdr_signature(hdr_signature);
		setHdr_version(hdr_version);
		setHdr_entries(hdr_entries);
	}
	public cache_header() {
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
