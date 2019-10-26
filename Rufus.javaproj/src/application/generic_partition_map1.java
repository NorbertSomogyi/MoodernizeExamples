package application;

/** Type 1 Partition Map (ECMA 167r3 3/10.7.2) */
public class generic_partition_map1 {
	private Object partition_map_type;
	private Object partition_map_length;
	private Object vol_seq_num;
	private Object i_partition;
	
	public generic_partition_map1(Object partition_map_type, Object partition_map_length, Object vol_seq_num, Object i_partition) {
		setPartition_map_type(partition_map_type);
		setPartition_map_length(partition_map_length);
		setVol_seq_num(vol_seq_num);
		setI_partition(i_partition);
	}
	public generic_partition_map1() {
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
	public Object getVol_seq_num() {
		return vol_seq_num;
	}
	public void setVol_seq_num(Object newVol_seq_num) {
		vol_seq_num = newVol_seq_num;
	}
	public Object getI_partition() {
		return i_partition;
	}
	public void setI_partition(Object newI_partition) {
		i_partition = newI_partition;
	}
}
