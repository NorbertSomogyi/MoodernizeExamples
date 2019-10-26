package application;

public class curl_certinfo {
	private int num_of_certs;
	private curl_slist certinfo;
	
	public curl_certinfo(int num_of_certs, curl_slist certinfo) {
		setNum_of_certs(num_of_certs);
		setCertinfo(certinfo);
	}
	public curl_certinfo() {
	}
	
	public void curl_certinfo_free_all() {
		curl_slist generatedCertinfo = this.getCertinfo();
		int generatedNum_of_certs = this.getNum_of_certs();
		if (/* Free all memory used by certificate info. */info) {
			if (generatedCertinfo) {
				int i;
				for (i = 0; i < generatedNum_of_certs; i++) {
					generatedCertinfo[i].curl_slist_free_all();
				}
				.free((byte)generatedCertinfo);
			} 
			.free((byte)info);
		} 
	}
	public int getNum_of_certs() {
		return num_of_certs;
	}
	public void setNum_of_certs(int newNum_of_certs) {
		num_of_certs = newNum_of_certs;
	}
	public curl_slist getCertinfo() {
		return certinfo;
	}
	public void setCertinfo(curl_slist newCertinfo) {
		certinfo = newCertinfo;
	}
}
