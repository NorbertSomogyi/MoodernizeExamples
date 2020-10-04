package application;

// HCPX
// this is required to force mingw to accept the packed attribute
public class hccapx {
	private Object signature;
	private Object version;
	private Object message_pair;
	private Object essid_len;
	private Object[] essid;
	private Object keyver;
	private Object[] keymic;
	private Object[] mac_ap;
	private Object[] nonce_ap;
	private Object[] mac_sta;
	private Object[] nonce_sta;
	private Object eapol_len;
	private Object[] eapol;
	
	public hccapx(Object signature, Object version, Object message_pair, Object essid_len, Object[] essid, Object keyver, Object[] keymic, Object[] mac_ap, Object[] nonce_ap, Object[] mac_sta, Object[] nonce_sta, Object eapol_len, Object[] eapol) {
		setSignature(signature);
		setVersion(version);
		setMessage_pair(message_pair);
		setEssid_len(essid_len);
		setEssid(essid);
		setKeyver(keyver);
		setKeymic(keymic);
		setMac_ap(mac_ap);
		setNonce_ap(nonce_ap);
		setMac_sta(mac_sta);
		setNonce_sta(nonce_sta);
		setEapol_len(eapol_len);
		setEapol(eapol);
	}
	public hccapx() {
	}
	
	public void to_hccapx_t(Object hashes, Object salt_pos, Object digest_pos) {
		salt_t[] salts_buf = hashes.getSalts_buf();
		Object esalts_buf = hashes.getEsalts_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hccapx, 0, /*Error: Unsupported expression*/);
		this.setSignature(-1024);
		this.setVersion(4);
		salt_t salt = salts_buf[salt_pos];
		u32 digest_cur = salt.getDigests_offset() + digest_pos;
		this.setEssid_len(salt.getSalt_len());
		Object[] generatedEssid = this.getEssid();
		Object generatedEssid_len = this.getEssid_len();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedEssid, salt.getSalt_buf(), generatedEssid_len);
		[] wpa_eapols = ()esalts_buf;
		 wpa_eapol = wpa_eapols[digest_cur];
		this.setMessage_pair(wpa_eapol.getMessage_pair());
		this.setKeyver(wpa_eapol.getKeyver());
		this.setEapol_len(wpa_eapol.getEapol_len());
		Object[] generatedEapol = this.getEapol();
		if (wpa_eapol.getKeyver() != 1) {
			u32[] eapol_tmp = new u32[]{0};
			for (u32 i = 0;
			 i < 64; i++) {
				eapol_tmp[i] = ModernizedCProgram.byte_swap_32(wpa_eapol.getEapol()[i]);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedEapol, eapol_tmp, wpa_eapol.getEapol_len());
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedEapol, generatedEapol, wpa_eapol.getEapol_len());
		} 
		Object[] generatedMac_ap = this.getMac_ap();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedMac_ap, wpa_eapol.getOrig_mac_ap(), 6);
		Object[] generatedMac_sta = this.getMac_sta();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedMac_sta, wpa_eapol.getOrig_mac_sta(), 6);
		Object[] generatedNonce_ap = this.getNonce_ap();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedNonce_ap, wpa_eapol.getOrig_nonce_ap(), 32);
		Object[] generatedNonce_sta = this.getNonce_sta();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedNonce_sta, wpa_eapol.getOrig_nonce_sta(), 32);
		Object[] generatedKeymic = this.getKeymic();
		if (wpa_eapol.getKeyver() != 1) {
			u32[] digest_tmp = new u32();
			digest_tmp[0] = ModernizedCProgram.byte_swap_32(wpa_eapol.getKeymic()[0]);
			digest_tmp[1] = ModernizedCProgram.byte_swap_32(wpa_eapol.getKeymic()[1]);
			digest_tmp[2] = ModernizedCProgram.byte_swap_32(wpa_eapol.getKeymic()[2]);
			digest_tmp[3] = ModernizedCProgram.byte_swap_32(wpa_eapol.getKeymic()[3]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedKeymic, digest_tmp, 16);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedKeymic, generatedKeymic, 16/*
				static int check_old_hccap (const char *hashfile)
				{
				  FILE *fp = fopen (hashfile, "rb");
				
				  if (fp == NULL) return -1;
				
				  u32 signature;
				
				  const size_t nread = hc_fread (&signature, sizeof (u32), 1, fp);
				
				  fclose (fp);
				
				  if (nread != 1) return -1;
				
				  if (signature == HCCAPX_SIGNATURE) return 0;
				
				  return 1;
				}
				*/);
		} 
		salt_t[] salts_buf = hashes.getSalts_buf();
		Object esalts_buf = hashes.getEsalts_buf();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hccapx, 0, /*Error: Unsupported expression*/);
		this.setSignature(-1024);
		this.setVersion(4);
		salt_t salt = salts_buf[salt_pos];
		u32 digest_cur = salt.getDigests_offset() + digest_pos;
		this.setEssid_len(salt.getSalt_len());
		Object[] generatedEssid = this.getEssid();
		Object generatedEssid_len = this.getEssid_len();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedEssid, salt.getSalt_buf(), generatedEssid_len);
		[] wpa_eapols = ()esalts_buf;
		 wpa_eapol = wpa_eapols[digest_cur];
		this.setMessage_pair(wpa_eapol.getMessage_pair());
		this.setKeyver(wpa_eapol.getKeyver());
		this.setEapol_len(wpa_eapol.getEapol_len());
		Object[] generatedEapol = this.getEapol();
		if (wpa_eapol.getKeyver() != 1) {
			u32[] eapol_tmp = new u32[]{0};
			for (u32 i = 0;
			 i < 64; i++) {
				eapol_tmp[i] = ModernizedCProgram.byte_swap_32(wpa_eapol.getEapol()[i]);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedEapol, eapol_tmp, wpa_eapol.getEapol_len());
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedEapol, generatedEapol, wpa_eapol.getEapol_len());
		} 
		Object[] generatedMac_ap = this.getMac_ap();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedMac_ap, wpa_eapol.getOrig_mac_ap(), 6);
		Object[] generatedMac_sta = this.getMac_sta();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedMac_sta, wpa_eapol.getOrig_mac_sta(), 6);
		Object[] generatedNonce_ap = this.getNonce_ap();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedNonce_ap, wpa_eapol.getOrig_nonce_ap(), 32);
		Object[] generatedNonce_sta = this.getNonce_sta();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedNonce_sta, wpa_eapol.getOrig_nonce_sta(), 32);
		Object[] generatedKeymic = this.getKeymic();
		if (wpa_eapol.getKeyver() != 1) {
			u32[] digest_tmp = new u32();
			digest_tmp[0] = ModernizedCProgram.byte_swap_32(wpa_eapol.getKeymic()[0]);
			digest_tmp[1] = ModernizedCProgram.byte_swap_32(wpa_eapol.getKeymic()[1]);
			digest_tmp[2] = ModernizedCProgram.byte_swap_32(wpa_eapol.getKeymic()[2]);
			digest_tmp[3] = ModernizedCProgram.byte_swap_32(wpa_eapol.getKeymic()[3]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedKeymic, digest_tmp, 16);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedKeymic, generatedKeymic, 16/*
				static int check_old_hccap (const char *hashfile)
				{
				  FILE *fp = fopen (hashfile, "rb");
				
				  if (fp == NULL) return -1;
				
				  u32 signature;
				
				  const size_t nread = hc_fread (&signature, sizeof (u32), 1, fp);
				
				  fclose (fp);
				
				  if (nread != 1) return -1;
				
				  if (signature == HCCAPX_SIGNATURE) return 0;
				
				  return 1;
				}
				*/);
		} 
	}
	public Object getSignature() {
		return signature;
	}
	public void setSignature(Object newSignature) {
		signature = newSignature;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getMessage_pair() {
		return message_pair;
	}
	public void setMessage_pair(Object newMessage_pair) {
		message_pair = newMessage_pair;
	}
	public Object getEssid_len() {
		return essid_len;
	}
	public void setEssid_len(Object newEssid_len) {
		essid_len = newEssid_len;
	}
	public Object[] getEssid() {
		return essid;
	}
	public void setEssid(Object[] newEssid) {
		essid = newEssid;
	}
	public Object getKeyver() {
		return keyver;
	}
	public void setKeyver(Object newKeyver) {
		keyver = newKeyver;
	}
	public Object[] getKeymic() {
		return keymic;
	}
	public void setKeymic(Object[] newKeymic) {
		keymic = newKeymic;
	}
	public Object[] getMac_ap() {
		return mac_ap;
	}
	public void setMac_ap(Object[] newMac_ap) {
		mac_ap = newMac_ap;
	}
	public Object[] getNonce_ap() {
		return nonce_ap;
	}
	public void setNonce_ap(Object[] newNonce_ap) {
		nonce_ap = newNonce_ap;
	}
	public Object[] getMac_sta() {
		return mac_sta;
	}
	public void setMac_sta(Object[] newMac_sta) {
		mac_sta = newMac_sta;
	}
	public Object[] getNonce_sta() {
		return nonce_sta;
	}
	public void setNonce_sta(Object[] newNonce_sta) {
		nonce_sta = newNonce_sta;
	}
	public Object getEapol_len() {
		return eapol_len;
	}
	public void setEapol_len(Object newEapol_len) {
		eapol_len = newEapol_len;
	}
	public Object[] getEapol() {
		return eapol;
	}
	public void setEapol(Object[] newEapol) {
		eapol = newEapol;
	}
}
