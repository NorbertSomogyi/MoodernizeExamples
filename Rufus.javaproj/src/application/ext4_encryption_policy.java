package application;

/* Continue execution */
/* Remount fs read-only */
/* Panic */
/* Metadata checksum algorithms */
/* Encryption algorithms, key size and key reference len */
/* Password derivation constants */
/*
 * Policy provided via an ioctl on the topmost directory. This
 * structure is also in the kernel.
 */
public class ext4_encryption_policy {
	private byte version;
	private byte contents_encryption_mode;
	private byte filenames_encryption_mode;
	private byte flags;
	private Object[] master_key_descriptor;
	
	public ext4_encryption_policy(byte version, byte contents_encryption_mode, byte filenames_encryption_mode, byte flags, Object[] master_key_descriptor) {
		setVersion(version);
		setContents_encryption_mode(contents_encryption_mode);
		setFilenames_encryption_mode(filenames_encryption_mode);
		setFlags(flags);
		setMaster_key_descriptor(master_key_descriptor);
	}
	public ext4_encryption_policy() {
	}
	
	public byte getVersion() {
		return version;
	}
	public void setVersion(byte newVersion) {
		version = newVersion;
	}
	public byte getContents_encryption_mode() {
		return contents_encryption_mode;
	}
	public void setContents_encryption_mode(byte newContents_encryption_mode) {
		contents_encryption_mode = newContents_encryption_mode;
	}
	public byte getFilenames_encryption_mode() {
		return filenames_encryption_mode;
	}
	public void setFilenames_encryption_mode(byte newFilenames_encryption_mode) {
		filenames_encryption_mode = newFilenames_encryption_mode;
	}
	public byte getFlags() {
		return flags;
	}
	public void setFlags(byte newFlags) {
		flags = newFlags;
	}
	public Object[] getMaster_key_descriptor() {
		return master_key_descriptor;
	}
	public void setMaster_key_descriptor(Object[] newMaster_key_descriptor) {
		master_key_descriptor = newMaster_key_descriptor;
	}
}
