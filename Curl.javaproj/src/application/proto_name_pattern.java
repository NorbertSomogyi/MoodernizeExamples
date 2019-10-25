package application;

public class proto_name_pattern {
	private Object proto_name;
	private long proto_pattern;
	
	public proto_name_pattern(Object proto_name, long proto_pattern) {
		setProto_name(proto_name);
		setProto_pattern(proto_pattern);
	}
	public proto_name_pattern() {
	}
	
	public Object getProto_name() {
		return proto_name;
	}
	public void setProto_name(Object newProto_name) {
		proto_name = newProto_name;
	}
	public long getProto_pattern() {
		return proto_pattern;
	}
	public void setProto_pattern(long newProto_pattern) {
		proto_pattern = newProto_pattern;
	}
}
