package application;

public class hashdump {
	private int version;
	private hashes hashes;
	
	public hashdump(int version, hashes hashes) {
		setVersion(version);
		setHashes(hashes);
	}
	public hashdump() {
	}
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int newVersion) {
		version = newVersion;
	}
	public hashes getHashes() {
		return hashes;
	}
	public void setHashes(hashes newHashes) {
		hashes = newHashes;
	}
}
