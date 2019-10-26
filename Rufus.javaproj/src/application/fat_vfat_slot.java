package application;

/* A VFAT filesystem continuation entry */
public class fat_vfat_slot {
	private Object id;
	private Object name0;
	private Object attribute;
	private Object reserved;
	private Object alias_csum;
	private Object name5;
	private Object firstclust;
	private Object name11;
	
	public fat_vfat_slot(Object id, Object name0, Object attribute, Object reserved, Object alias_csum, Object name5, Object firstclust, Object name11) {
		setId(id);
		setName0(name0);
		setAttribute(attribute);
		setReserved(reserved);
		setAlias_csum(alias_csum);
		setName5(name5);
		setFirstclust(firstclust);
		setName11(name11);
	}
	public fat_vfat_slot() {
	}
	
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getName0() {
		return name0;
	}
	public void setName0(Object newName0) {
		name0 = newName0;
	}
	public Object getAttribute() {
		return attribute;
	}
	public void setAttribute(Object newAttribute) {
		attribute = newAttribute;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getAlias_csum() {
		return alias_csum;
	}
	public void setAlias_csum(Object newAlias_csum) {
		alias_csum = newAlias_csum;
	}
	public Object getName5() {
		return name5;
	}
	public void setName5(Object newName5) {
		name5 = newName5;
	}
	public Object getFirstclust() {
		return firstclust;
	}
	public void setFirstclust(Object newFirstclust) {
		firstclust = newFirstclust;
	}
	public Object getName11() {
		return name11;
	}
	public void setName11(Object newName11) {
		name11 = newName11;
	}
}
