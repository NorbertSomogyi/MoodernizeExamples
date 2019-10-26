package application;

public class libfat_dirpos {
	private Object cluster;
	private Object offset;
	private Object sector;
	
	public libfat_dirpos(Object cluster, Object offset, Object sector) {
		setCluster(cluster);
		setOffset(offset);
		setSector(sector);
	}
	public libfat_dirpos() {
	}
	
	public Object getCluster() {
		return cluster;
	}
	public void setCluster(Object newCluster) {
		cluster = newCluster;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public Object getSector() {
		return sector;
	}
	public void setSector(Object newSector) {
		sector = newSector;
	}
}
