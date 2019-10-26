package application;

public class tuning_db_alias {
	private Byte device_name;
	private Byte alias_name;
	
	public tuning_db_alias(Byte device_name, Byte alias_name) {
		setDevice_name(device_name);
		setAlias_name(alias_name);
	}
	public tuning_db_alias() {
	}
	
	public Byte getDevice_name() {
		return device_name;
	}
	public void setDevice_name(Byte newDevice_name) {
		device_name = newDevice_name;
	}
	public Byte getAlias_name() {
		return alias_name;
	}
	public void setAlias_name(Byte newAlias_name) {
		alias_name = newAlias_name;
	}
}
