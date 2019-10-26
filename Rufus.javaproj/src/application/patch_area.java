package application;

/* Patch area for disk-based installers */
public class patch_area {
	private Object magic;
	private Object instance;
	private Object data_sectors;
	private Object adv_sectors;
	private Object dwords;
	private Object checksum;
	private Object maxtransfer;
	private Object epaoffset;
	
	public patch_area(Object magic, Object instance, Object data_sectors, Object adv_sectors, Object dwords, Object checksum, Object maxtransfer, Object epaoffset) {
		setMagic(magic);
		setInstance(instance);
		setData_sectors(data_sectors);
		setAdv_sectors(adv_sectors);
		setDwords(dwords);
		setChecksum(checksum);
		setMaxtransfer(maxtransfer);
		setEpaoffset(epaoffset);
	}
	public patch_area() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getInstance() {
		return instance;
	}
	public void setInstance(Object newInstance) {
		instance = newInstance;
	}
	public Object getData_sectors() {
		return data_sectors;
	}
	public void setData_sectors(Object newData_sectors) {
		data_sectors = newData_sectors;
	}
	public Object getAdv_sectors() {
		return adv_sectors;
	}
	public void setAdv_sectors(Object newAdv_sectors) {
		adv_sectors = newAdv_sectors;
	}
	public Object getDwords() {
		return dwords;
	}
	public void setDwords(Object newDwords) {
		dwords = newDwords;
	}
	public Object getChecksum() {
		return checksum;
	}
	public void setChecksum(Object newChecksum) {
		checksum = newChecksum;
	}
	public Object getMaxtransfer() {
		return maxtransfer;
	}
	public void setMaxtransfer(Object newMaxtransfer) {
		maxtransfer = newMaxtransfer;
	}
	public Object getEpaoffset() {
		return epaoffset;
	}
	public void setEpaoffset(Object newEpaoffset) {
		epaoffset = newEpaoffset;
	}
}
