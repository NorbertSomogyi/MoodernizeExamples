package application;

/** Generic Partition Map (ECMA 167r3 3/10.7.1) */
public class generic_partition_map {
	private Object partition_map_type;
	private Object partition_map_length;
	private Object[] partition_mapping;
	
	public generic_partition_map(Object partition_map_type, Object partition_map_length, Object[] partition_mapping) {
		setPartition_map_type(partition_map_type);
		setPartition_map_length(partition_map_length);
		setPartition_mapping(partition_mapping);
	}
	public generic_partition_map() {
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
	public Object[] getPartition_mapping() {
		return partition_mapping;
	}
	public void setPartition_mapping(Object[] newPartition_mapping) {
		partition_mapping = newPartition_mapping;
	}
}
