package application;

// partition header starts with magic
/* Actually we need only 37, but we don't want struct autoaligning to kick in */
/* Offset to keyslot area [in bytes] */
public class luks_phdr {
	private Object magic;
	private Object version;
	private Object cipherName;
	private Object cipherMode;
	private Object hashSpec;
	private Object payloadOffset;
	private Object keyBytes;
	private Object mkDigest;
	private Object mkDigestSalt;
	private Object mkDigestIterations;
	private Object uuid;
	private Object keyblock;
	private Object _padding;
	
	public luks_phdr(Object magic, Object version, Object cipherName, Object cipherMode, Object hashSpec, Object payloadOffset, Object keyBytes, Object mkDigest, Object mkDigestSalt, Object mkDigestIterations, Object uuid, Object keyblock, Object _padding) {
		setMagic(magic);
		setVersion(version);
		setCipherName(cipherName);
		setCipherMode(cipherMode);
		setHashSpec(hashSpec);
		setPayloadOffset(payloadOffset);
		setKeyBytes(keyBytes);
		setMkDigest(mkDigest);
		setMkDigestSalt(mkDigestSalt);
		setMkDigestIterations(mkDigestIterations);
		setUuid(uuid);
		setKeyblock(keyblock);
		set_padding(_padding);
	}
	public luks_phdr() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getCipherName() {
		return cipherName;
	}
	public void setCipherName(Object newCipherName) {
		cipherName = newCipherName;
	}
	public Object getCipherMode() {
		return cipherMode;
	}
	public void setCipherMode(Object newCipherMode) {
		cipherMode = newCipherMode;
	}
	public Object getHashSpec() {
		return hashSpec;
	}
	public void setHashSpec(Object newHashSpec) {
		hashSpec = newHashSpec;
	}
	public Object getPayloadOffset() {
		return payloadOffset;
	}
	public void setPayloadOffset(Object newPayloadOffset) {
		payloadOffset = newPayloadOffset;
	}
	public Object getKeyBytes() {
		return keyBytes;
	}
	public void setKeyBytes(Object newKeyBytes) {
		keyBytes = newKeyBytes;
	}
	public Object getMkDigest() {
		return mkDigest;
	}
	public void setMkDigest(Object newMkDigest) {
		mkDigest = newMkDigest;
	}
	public Object getMkDigestSalt() {
		return mkDigestSalt;
	}
	public void setMkDigestSalt(Object newMkDigestSalt) {
		mkDigestSalt = newMkDigestSalt;
	}
	public Object getMkDigestIterations() {
		return mkDigestIterations;
	}
	public void setMkDigestIterations(Object newMkDigestIterations) {
		mkDigestIterations = newMkDigestIterations;
	}
	public Object getUuid() {
		return uuid;
	}
	public void setUuid(Object newUuid) {
		uuid = newUuid;
	}
	public Object getKeyblock() {
		return keyblock;
	}
	public void setKeyblock(Object newKeyblock) {
		keyblock = newKeyblock;
	}
	public Object get_padding() {
		return _padding;
	}
	public void set_padding(Object new_padding) {
		_padding = new_padding;
	}
}
