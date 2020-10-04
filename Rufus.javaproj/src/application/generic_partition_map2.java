package application;

/** Type 2 Partition Map (ECMA 167r3 3/10.7.3) */
public class generic_partition_map2 {
	private Object partition_map_type;
	private Object partition_map_length;
	private Object[] partition_id;
	
	public generic_partition_map2(Object partition_map_type, Object partition_map_length, Object[] partition_id) {
		setPartition_map_type(partition_map_type);
		setPartition_map_length(partition_map_length);
		setPartition_id(partition_id);
	}
	public generic_partition_map2() {
	}
	
	public Object getPartition_map_type() {
		return partition_map_type;
	}
	public void setPartition_map_type(Object newPartition_map_type) {
		partition_map_type = newPartition_map_type;
	}
	public Object getPartition_map_length() {
		return partition_map_length;
	}
	public void setPartition_map_length(Object newPartition_map_length) {
		partition_map_length = newPartition_map_length;
	}
	public Object[] getPartition_id() {
		return partition_id;
	}
	public void setPartition_id(Object[] newPartition_id) {
		partition_id = newPartition_id;
	}
}
