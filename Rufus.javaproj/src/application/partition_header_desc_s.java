package application;

/** Partition Header Descriptor (ECMA 167r3 4/14.3) */
public class partition_header_desc_s {
	private udf_short_ad_s unalloc_space_table;
	private udf_short_ad_s unalloc_space_bitmap;
	private udf_short_ad_s partition_integrity_table;
	private udf_short_ad_s freed_space_table;
	private udf_short_ad_s freed_space_bitmap;
	private Object[] reserved;
	
	public partition_header_desc_s(udf_short_ad_s unalloc_space_table, udf_short_ad_s unalloc_space_bitmap, udf_short_ad_s partition_integrity_table, udf_short_ad_s freed_space_table, udf_short_ad_s freed_space_bitmap, Object[] reserved) {
		setUnalloc_space_table(unalloc_space_table);
		setUnalloc_space_bitmap(unalloc_space_bitmap);
		setPartition_integrity_table(partition_integrity_table);
		setFreed_space_table(freed_space_table);
		setFreed_space_bitmap(freed_space_bitmap);
		setReserved(reserved);
	}
	public partition_header_desc_s() {
	}
	
	public udf_short_ad_s getUnalloc_space_table() {
		return unalloc_space_table;
	}
	public void setUnalloc_space_table(udf_short_ad_s newUnalloc_space_table) {
		unalloc_space_table = newUnalloc_space_table;
	}
	public udf_short_ad_s getUnalloc_space_bitmap() {
		return unalloc_space_bitmap;
	}
	public void setUnalloc_space_bitmap(udf_short_ad_s newUnalloc_space_bitmap) {
		unalloc_space_bitmap = newUnalloc_space_bitmap;
	}
	public udf_short_ad_s getPartition_integrity_table() {
		return partition_integrity_table;
	}
	public void setPartition_integrity_table(udf_short_ad_s newPartition_integrity_table) {
		partition_integrity_table = newPartition_integrity_table;
	}
	public udf_short_ad_s getFreed_space_table() {
		return freed_space_table;
	}
	public void setFreed_space_table(udf_short_ad_s newFreed_space_table) {
		freed_space_table = newFreed_space_table;
	}
	public udf_short_ad_s getFreed_space_bitmap() {
		return freed_space_bitmap;
	}
	public void setFreed_space_bitmap(udf_short_ad_s newFreed_space_bitmap) {
		freed_space_bitmap = newFreed_space_bitmap;
	}
	public Object[] getReserved() {
		return reserved;
	}
	public void setReserved(Object[] newReserved) {
		reserved = newReserved;
	}
}
