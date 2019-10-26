package application;

public class signature_check {
	private Byte payload;
	private Byte gpg_output;
	private Byte gpg_status;
	private byte result;
	private Byte signer;
	private Byte key;
	private Byte fingerprint;
	private Byte primary_key_fingerprint;
	
	public signature_check(Byte payload, Byte gpg_output, Byte gpg_status, byte result, Byte signer, Byte key, Byte fingerprint, Byte primary_key_fingerprint) {
		setPayload(payload);
		setGpg_output(gpg_output);
		setGpg_status(gpg_status);
		setResult(result);
		setSigner(signer);
		setKey(key);
		setFingerprint(fingerprint);
		setPrimary_key_fingerprint(primary_key_fingerprint);
	}
	public signature_check() {
	}
	
	public void signature_check_clear() {
		Byte generatedPayload = this.getPayload();
		do {
			ModernizedCProgram.free(generatedPayload);
			(generatedPayload) = ((Object)0);
		} while (0);
		Byte generatedGpg_output = this.getGpg_output();
		do {
			ModernizedCProgram.free(generatedGpg_output);
			(generatedGpg_output) = ((Object)0);
		} while (0);
		Byte generatedGpg_status = this.getGpg_status();
		do {
			ModernizedCProgram.free(generatedGpg_status);
			(generatedGpg_status) = ((Object)0);
		} while (0);
		Byte generatedSigner = this.getSigner();
		do {
			ModernizedCProgram.free(generatedSigner);
			(generatedSigner) = ((Object)0);
		} while (0);
		Byte generatedKey = this.getKey();
		do {
			ModernizedCProgram.free(generatedKey);
			(generatedKey) = ((Object)0);
		} while (0);
		Byte generatedFingerprint = this.getFingerprint();
		do {
			ModernizedCProgram.free(generatedFingerprint);
			(generatedFingerprint) = ((Object)0);
		} while (0);
		Byte generatedPrimary_key_fingerprint = this.getPrimary_key_fingerprint();
		do {
			ModernizedCProgram.free(generatedPrimary_key_fingerprint);
			(generatedPrimary_key_fingerprint) = ((Object)0);
		} while (0/* An exclusive status -- only one of them can appear in output *//* The status includes key identifier */);
	}
	public void parse_gpg_output() {
		Byte generatedGpg_status = this.getGpg_status();
		byte buf = generatedGpg_status;
		byte line;
		byte next;
		int i;
		int j;
		int seen_exclusive_status = 0;
		Byte generatedKey = this.getKey();
		Byte generatedSigner = this.getSigner();
		Byte generatedFingerprint = this.getFingerprint();
		Byte generatedPrimary_key_fingerprint = this.getPrimary_key_fingerprint();
		for (line = buf; line; line = ModernizedCProgram.gitstrchrnul(line + 1, /* Iterate over all lines */(byte)'\n')) {
			while (line == (byte)'\n') {
				line++;
			}
			if (!line) {
				break;
			} 
			if (!ModernizedCProgram.skip_prefix(line, "[GNUPG:] ", /* Skip lines that don't start with GNUPG status */line)) {
				continue;
			} 
			for (i = 0; i < ( /  + ( - 1)); /* Iterate over all search strings */i++) {
				if (ModernizedCProgram.skip_prefix(line, sigcheck_gpg_status[i].getCheck(), line)) {
					if (sigcheck_gpg_status[i].getFlags() & (1 << 0)) {
						if (seen_exclusive_status++) {
							;
						} 
					} 
					if (sigcheck_gpg_status[i].getResult()) {
						this.setResult(sigcheck_gpg_status[i].getResult());
					} 
					if (sigcheck_gpg_status[i].getFlags() & (1 << /* Do we have key information? */1)) {
						next = ModernizedCProgram.gitstrchrnul(line, (byte)' ');
						ModernizedCProgram.free(generatedKey);
						this.setKey(ModernizedCProgram.xmemdupz(line, next - line));
						if (next && (sigcheck_gpg_status[i].getFlags() & (1 << /* Do we have signer information? */2))) {
							line = next + 1;
							next = ModernizedCProgram.gitstrchrnul(line, (byte)'\n');
							ModernizedCProgram.free(generatedSigner);
							this.setSigner(ModernizedCProgram.xmemdupz(line, next - line));
						} 
					} 
					if (sigcheck_gpg_status[i].getFlags() & (1 << /* Do we have fingerprint? */3)) {
						next = ModernizedCProgram.gitstrchrnul(line, (byte)' ');
						ModernizedCProgram.free(generatedFingerprint);
						this.setFingerprint(ModernizedCProgram.xmemdupz(line, next - line));
						for (j = 9; j > 0; /* Skip interim fields */j--) {
							if (!next) {
								break;
							} 
							line = next + 1;
							next = ModernizedCProgram.gitstrchrnul(line, (byte)' ');
						}
						next = ModernizedCProgram.gitstrchrnul(line, (byte)'\n');
						ModernizedCProgram.free(generatedPrimary_key_fingerprint);
						this.setPrimary_key_fingerprint(ModernizedCProgram.xmemdupz(line, next - line));
					} 
					break;
				} 
			}
		}
		return ;
		do {
			ModernizedCProgram.free(generatedPrimary_key_fingerprint);
			(generatedPrimary_key_fingerprint) = ((Object)0);
		} while (/* Clear partial data to avoid confusion */0);
		do {
			ModernizedCProgram.free(generatedFingerprint);
			(generatedFingerprint) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(generatedSigner);
			(generatedSigner) = ((Object)0);
		} while (0);
		do {
			ModernizedCProgram.free(generatedKey);
			(generatedKey) = ((Object)0);
		} while (0);
	}
	public int check_signature(Object payload, Object plen, Object signature, Object slen) {
		strbuf gpg_output = new strbuf(, , );
		strbuf gpg_status = new strbuf(, , );
		int status;
		this.setResult((byte)'N');
		status = gpg_output.verify_signed_buffer(payload, plen, signature, slen, gpg_status);
		Object generatedLen = gpg_output.getLen();
		if (status && !generatedLen) {
			;
		} 
		this.setPayload(ModernizedCProgram.xmemdupz(payload, plen));
		this.setGpg_output(gpg_output.strbuf_detach(((Object)0)));
		this.setGpg_status(gpg_status.strbuf_detach(((Object)0)));
		sigc.parse_gpg_output();
		byte generatedResult = this.getResult();
		status |=  generatedResult != (byte)'G' && generatedResult != (byte)'U';
		gpg_output.strbuf_release();
		return !!status;
	}
	public Byte getPayload() {
		return payload;
	}
	public void setPayload(Byte newPayload) {
		payload = newPayload;
	}
	public Byte getGpg_output() {
		return gpg_output;
	}
	public void setGpg_output(Byte newGpg_output) {
		gpg_output = newGpg_output;
	}
	public Byte getGpg_status() {
		return gpg_status;
	}
	public void setGpg_status(Byte newGpg_status) {
		gpg_status = newGpg_status;
	}
	public byte getResult() {
		return result;
	}
	public void setResult(byte newResult) {
		result = newResult;
	}
	public Byte getSigner() {
		return signer;
	}
	public void setSigner(Byte newSigner) {
		signer = newSigner;
	}
	public Byte getKey() {
		return key;
	}
	public void setKey(Byte newKey) {
		key = newKey;
	}
	public Byte getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(Byte newFingerprint) {
		fingerprint = newFingerprint;
	}
	public Byte getPrimary_key_fingerprint() {
		return primary_key_fingerprint;
	}
	public void setPrimary_key_fingerprint(Byte newPrimary_key_fingerprint) {
		primary_key_fingerprint = newPrimary_key_fingerprint;
	}
}
