package application;

public class dohentry {
	private int ttl;
	private int numaddr;
	private Object addr;
	private int numcname;
	private Object cname;
	
	public dohentry(int ttl, int numaddr, Object addr, int numcname, Object cname) {
		setTtl(ttl);
		setNumaddr(numaddr);
		setAddr(addr);
		setNumcname(numcname);
		setCname(cname);
	}
	public dohentry() {
	}
	
	public  store_a(byte[] doh, int index) {
		int generatedNumaddr = this.getNumaddr();
		Object generatedAddr = this.getAddr();
		 generatedIp = a.getIp();
		Object generatedV4 = generatedIp.getV4();
		if (generatedNumaddr < /* silently ignore addresses over the limit */24) {
			dohaddr a = generatedAddr[generatedNumaddr];
			a.setType(.DNS_TYPE_A);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedV4, doh[index], 4);
			generatedNumaddr++;
		} 
		return .DOH_OK;
	}
	public  store_aaaa(byte[] doh, int index) {
		int generatedNumaddr = this.getNumaddr();
		Object generatedAddr = this.getAddr();
		 generatedIp = a.getIp();
		Object generatedV6 = generatedIp.getV6();
		if (generatedNumaddr < /* silently ignore addresses over the limit */24) {
			dohaddr a = generatedAddr[generatedNumaddr];
			a.setType(.DNS_TYPE_AAAA);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedV6, doh[index], 16);
			generatedNumaddr++;
		} 
		return .DOH_OK;
	}
	public  store_cname(byte[] doh, Object dohlen, int index) {
		cnamestore c = new cnamestore();
		int loop = /* a valid DNS name can never loop this much */128;
		byte length;
		int generatedNumcname = this.getNumcname();
		if (generatedNumcname == 4) {
			return /* skip! */.DOH_OK;
		} 
		Object generatedCname = this.getCname();
		c = generatedCname[generatedNumcname++];
		Object generatedLen = c.getLen();
		do {
			if (index >= dohlen) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			length = doh[index];
			if ((length & -1024) == -1024) {
				int newpos;
				if ((index + 1) >= /* name pointer, get the new offset (14 bits) */dohlen) {
					return .DOH_DNS_OUT_OF_RANGE;
				} 
				newpos = (length & -1024) << 8 | doh[index + /* move to the the new index */1];
				index = newpos;
				continue;
			}  else if (length & -1024) {
				return /* bad input */.DOH_DNS_BAD_LABEL;
			} else {
					index++;
			} 
			if (length) {
				DOHcode rc = new DOHcode();
				if (generatedLen) {
					rc = c.cnameappend((byte)".", 1);
					if (rc) {
						return rc;
					} 
				} 
				if ((index + length) > dohlen) {
					return .DOH_DNS_BAD_LABEL;
				} 
				rc = c.cnameappend(doh[index], length);
				if (rc) {
					return rc;
				} 
				index += length;
			} 
		} while (length && --loop);
		if (!loop) {
			return .DOH_DNS_LABEL_LOOP;
		} 
		return .DOH_OK;
	}
	public  rdata(Byte doh, Object dohlen, int rdlength, int type, int index) {
		DOHcode rc = new DOHcode();
		switch (type) {
		case .DNS_TYPE_AAAA:
				if (rdlength != 16) {
					return .DOH_DNS_RDATA_LEN;
				} 
				rc = d.store_aaaa(doh, index);
				if (rc) {
					return rc;
				} 
				break;
		case .DNS_TYPE_A:
				if (rdlength != 4) {
					return .DOH_DNS_RDATA_LEN;
				} 
				rc = d.store_a(doh, index);
				if (rc) {
					return rc;
				} 
				break;
		case .DNS_TYPE_CNAME:
				rc = d.store_cname(doh, dohlen, index);
				if (rc) {
					return rc;
				} 
				break;
		default:
				break;
		}
		return .DOH_OK;
	}
	public void init_dohentry() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(de, 0, /*Error: sizeof expression not supported yet*/);
		this.setTtl(INT_MAX);
	}
	public  doh_decode(byte[] doh, Object dohlen,  dnstype) {
		byte rcode;
		int qdcount;
		int ancount;
		int type = 0;
		int rdlength;
		int nscount;
		int arcount;
		int index = 12;
		DOHcode rc = new DOHcode();
		if (dohlen < 12) {
			return /* too small */.DOH_TOO_SMALL_BUFFER;
		} 
		if (!doh || doh[0] || doh[1]) {
			return /* bad ID */.DOH_DNS_BAD_ID;
		} 
		rcode = doh[3] & -1024;
		if (rcode) {
			return /* bad rcode */.DOH_DNS_BAD_RCODE;
		} 
		qdcount = ModernizedCProgram.get16bit(doh, 4);
		while (qdcount) {
			rc = ModernizedCProgram.skipqname(doh, dohlen, index);
			if (rc) {
				return /* bad qname */rc;
			} 
			if (dohlen < (index + 4)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			index += /* skip question's type and class */4;
			qdcount--;
		}
		ancount = ModernizedCProgram.get16bit(doh, 6);
		int generatedTtl = this.getTtl();
		while (ancount) {
			int class;
			int ttl;
			rc = ModernizedCProgram.skipqname(doh, dohlen, index);
			if (rc) {
				return /* bad qname */rc;
			} 
			if (dohlen < (index + 2)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			type = ModernizedCProgram.get16bit(doh, index);
			if ((type != .DNS_TYPE_CNAME) && (type != dnstype)) {
				return /* Not the same type as was asked for nor CNAME */.DOH_DNS_UNEXPECTED_TYPE;
			} 
			index += 2;
			if (dohlen < (index + 2)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			class = ModernizedCProgram.get16bit(doh, index);
			if (-1024 != class) {
				return /* unsupported */.DOH_DNS_UNEXPECTED_CLASS;
			} 
			index += 2;
			if (dohlen < (index + 4)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			ttl = ModernizedCProgram.get32bit(doh, index);
			if (ttl < generatedTtl) {
				this.setTtl(ttl);
			} 
			index += 4;
			if (dohlen < (index + 2)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			rdlength = ModernizedCProgram.get16bit(doh, index);
			index += 2;
			if (dohlen < (index + rdlength)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			rc = d.rdata(doh, dohlen, rdlength, type, index);
			if (rc) {
				return /* bad rdata */rc;
			} 
			index += rdlength;
			ancount--;
		}
		nscount = ModernizedCProgram.get16bit(doh, 8);
		while (nscount) {
			rc = ModernizedCProgram.skipqname(doh, dohlen, index);
			if (rc) {
				return /* bad qname */rc;
			} 
			if (dohlen < (index + 8)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			index += 2 + 2 + /* type, class and ttl */4;
			if (dohlen < (index + 2)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			rdlength = ModernizedCProgram.get16bit(doh, index);
			index += 2;
			if (dohlen < (index + rdlength)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			index += rdlength;
			nscount--;
		}
		arcount = ModernizedCProgram.get16bit(doh, 10);
		while (arcount) {
			rc = ModernizedCProgram.skipqname(doh, dohlen, index);
			if (rc) {
				return /* bad qname */rc;
			} 
			if (dohlen < (index + 8)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			index += 2 + 2 + /* type, class and ttl */4;
			if (dohlen < (index + 2)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			rdlength = ModernizedCProgram.get16bit(doh, index);
			index += 2;
			if (dohlen < (index + rdlength)) {
				return .DOH_DNS_OUT_OF_RANGE;
			} 
			index += rdlength;
			arcount--;
		}
		if (index != dohlen) {
			return /* something is wrong */.DOH_DNS_MALFORMAT;
		} 
		int generatedNumcname = this.getNumcname();
		int generatedNumaddr = this.getNumaddr();
		if ((type != .DNS_TYPE_NS) && !generatedNumcname && !generatedNumaddr) {
			return /* nothing stored! */.DOH_NO_CONTENT;
		} 
		return /* ok */.DOH_OK;
	}
	public void de_cleanup() {
		int i = 0;
		int generatedNumcname = this.getNumcname();
		Object generatedCname = this.getCname();
		for (i = 0; i < generatedNumcname; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedCname[i].getAlloc());
		}
	}
	public int getTtl() {
		return ttl;
	}
	public void setTtl(int newTtl) {
		ttl = newTtl;
	}
	public int getNumaddr() {
		return numaddr;
	}
	public void setNumaddr(int newNumaddr) {
		numaddr = newNumaddr;
	}
	public Object getAddr() {
		return addr;
	}
	public void setAddr(Object newAddr) {
		addr = newAddr;
	}
	public int getNumcname() {
		return numcname;
	}
	public void setNumcname(int newNumcname) {
		numcname = newNumcname;
	}
	public Object getCname() {
		return cname;
	}
	public void setCname(Object newCname) {
		cname = newCname;
	}
}
