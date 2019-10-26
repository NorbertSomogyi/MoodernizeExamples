package application;

public class mfxPluginParam {
	private Object reserved;
	private Object reserved1;
	private Object PluginVersion;
	private  APIVersion;
	private  PluginUID;
	private Object Type;
	private Object CodecId;
	private  ThreadPolicy;
	private Object MaxThreadNum;
	
	public mfxPluginParam(Object reserved, Object reserved1, Object PluginVersion,  APIVersion,  PluginUID, Object Type, Object CodecId,  ThreadPolicy, Object MaxThreadNum) {
		setReserved(reserved);
		setReserved1(reserved1);
		setPluginVersion(PluginVersion);
		setAPIVersion(APIVersion);
		setPluginUID(PluginUID);
		setType(Type);
		setCodecId(CodecId);
		setThreadPolicy(ThreadPolicy);
		setMaxThreadNum(MaxThreadNum);
	}
	public mfxPluginParam() {
	}
	
	public  GetPluginParam() {
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public Object getPluginVersion() {
		return PluginVersion;
	}
	public void setPluginVersion(Object newPluginVersion) {
		PluginVersion = newPluginVersion;
	}
	public  getAPIVersion() {
		return APIVersion;
	}
	public void setAPIVersion( newAPIVersion) {
		APIVersion = newAPIVersion;
	}
	public  getPluginUID() {
		return PluginUID;
	}
	public void setPluginUID( newPluginUID) {
		PluginUID = newPluginUID;
	}
	public Object getType() {
		return Type;
	}
	public void setType(Object newType) {
		Type = newType;
	}
	public Object getCodecId() {
		return CodecId;
	}
	public void setCodecId(Object newCodecId) {
		CodecId = newCodecId;
	}
	public  getThreadPolicy() {
		return ThreadPolicy;
	}
	public void setThreadPolicy( newThreadPolicy) {
		ThreadPolicy = newThreadPolicy;
	}
	public Object getMaxThreadNum() {
		return MaxThreadNum;
	}
	public void setMaxThreadNum(Object newMaxThreadNum) {
		MaxThreadNum = newMaxThreadNum;
	}
}
