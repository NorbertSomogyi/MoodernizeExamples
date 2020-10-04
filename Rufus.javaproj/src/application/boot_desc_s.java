package application;

/** Boot Descriptor (ECMA 167r3 2/9.4) */
public class boot_desc_s {
	private Object struct_type;
	private Object[] std_ident;
	private Object struct_version;
	private Object reserved1;
	private udf_regid_s arch_type;
	private udf_regid_s boot_ident;
	private Object bool_ext_location;
	private Object bool_ext_length;
	private Object load_address;
	private Object start_address;
	private udf_timestamp_s desc_creation_time;
	private Object flags;
	private Object[] reserved2;
	private Object[] boot_use;
	
	public boot_desc_s(Object struct_type, Object[] std_ident, Object struct_version, Object reserved1, udf_regid_s arch_type, udf_regid_s boot_ident, Object bool_ext_location, Object bool_ext_length, Object load_address, Object start_address, udf_timestamp_s desc_creation_time, Object flags, Object[] reserved2, Object[] boot_use) {
		setStruct_type(struct_type);
		setStd_ident(std_ident);
		setStruct_version(struct_version);
		setReserved1(reserved1);
		setArch_type(arch_type);
		setBoot_ident(boot_ident);
		setBool_ext_location(bool_ext_location);
		setBool_ext_length(bool_ext_length);
		setLoad_address(load_address);
		setStart_address(start_address);
		setDesc_creation_time(desc_creation_time);
		setFlags(flags);
		setReserved2(reserved2);
		setBoot_use(boot_use);
	}
	public boot_desc_s() {
	}
	
	public Object getStruct_type() {
		return struct_type;
	}
	public void setStruct_type(Object newStruct_type) {
		struct_type = newStruct_type;
	}
	public Object[] getStd_ident() {
		return std_ident;
	}
	public void setStd_ident(Object[] newStd_ident) {
		std_ident = newStd_ident;
	}
	public Object getStruct_version() {
		return struct_version;
	}
	public void setStruct_version(Object newStruct_version) {
		struct_version = newStruct_version;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public udf_regid_s getArch_type() {
		return arch_type;
	}
	public void setArch_type(udf_regid_s newArch_type) {
		arch_type = newArch_type;
	}
	public udf_regid_s getBoot_ident() {
		return boot_ident;
	}
	public void setBoot_ident(udf_regid_s newBoot_ident) {
		boot_ident = newBoot_ident;
	}
	public Object getBool_ext_location() {
		return bool_ext_location;
	}
	public void setBool_ext_location(Object newBool_ext_location) {
		bool_ext_location = newBool_ext_location;
	}
	public Object getBool_ext_length() {
		return bool_ext_length;
	}
	public void setBool_ext_length(Object newBool_ext_length) {
		bool_ext_length = newBool_ext_length;
	}
	public Object getLoad_address() {
		return load_address;
	}
	public void setLoad_address(Object newLoad_address) {
		load_address = newLoad_address;
	}
	public Object getStart_address() {
		return start_address;
	}
	public void setStart_address(Object newStart_address) {
		start_address = newStart_address;
	}
	public udf_timestamp_s getDesc_creation_time() {
		return desc_creation_time;
	}
	public void setDesc_creation_time(udf_timestamp_s newDesc_creation_time) {
		desc_creation_time = newDesc_creation_time;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public Object[] getReserved2() {
		return reserved2;
	}
	public void setReserved2(Object[] newReserved2) {
		reserved2 = newReserved2;
	}
	public Object[] getBoot_use() {
		return boot_use;
	}
	public void setBoot_use(Object[] newBoot_use) {
		boot_use = newBoot_use;
	}
}
