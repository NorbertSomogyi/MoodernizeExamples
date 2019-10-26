package application;

/* Declare data structures for ntdll functions.  */
public class _FILE_PIPE_LOCAL_INFORMATION {
	private Object NamedPipeType;
	private Object NamedPipeConfiguration;
	private Object MaximumInstances;
	private Object CurrentInstances;
	private Object InboundQuota;
	private Object ReadDataAvailable;
	private Object OutboundQuota;
	private Object WriteQuotaAvailable;
	private Object NamedPipeState;
	private Object NamedPipeEnd;
	
	public _FILE_PIPE_LOCAL_INFORMATION(Object NamedPipeType, Object NamedPipeConfiguration, Object MaximumInstances, Object CurrentInstances, Object InboundQuota, Object ReadDataAvailable, Object OutboundQuota, Object WriteQuotaAvailable, Object NamedPipeState, Object NamedPipeEnd) {
		setNamedPipeType(NamedPipeType);
		setNamedPipeConfiguration(NamedPipeConfiguration);
		setMaximumInstances(MaximumInstances);
		setCurrentInstances(CurrentInstances);
		setInboundQuota(InboundQuota);
		setReadDataAvailable(ReadDataAvailable);
		setOutboundQuota(OutboundQuota);
		setWriteQuotaAvailable(WriteQuotaAvailable);
		setNamedPipeState(NamedPipeState);
		setNamedPipeEnd(NamedPipeEnd);
	}
	public _FILE_PIPE_LOCAL_INFORMATION() {
	}
	
	public Object getNamedPipeType() {
		return NamedPipeType;
	}
	public void setNamedPipeType(Object newNamedPipeType) {
		NamedPipeType = newNamedPipeType;
	}
	public Object getNamedPipeConfiguration() {
		return NamedPipeConfiguration;
	}
	public void setNamedPipeConfiguration(Object newNamedPipeConfiguration) {
		NamedPipeConfiguration = newNamedPipeConfiguration;
	}
	public Object getMaximumInstances() {
		return MaximumInstances;
	}
	public void setMaximumInstances(Object newMaximumInstances) {
		MaximumInstances = newMaximumInstances;
	}
	public Object getCurrentInstances() {
		return CurrentInstances;
	}
	public void setCurrentInstances(Object newCurrentInstances) {
		CurrentInstances = newCurrentInstances;
	}
	public Object getInboundQuota() {
		return InboundQuota;
	}
	public void setInboundQuota(Object newInboundQuota) {
		InboundQuota = newInboundQuota;
	}
	public Object getReadDataAvailable() {
		return ReadDataAvailable;
	}
	public void setReadDataAvailable(Object newReadDataAvailable) {
		ReadDataAvailable = newReadDataAvailable;
	}
	public Object getOutboundQuota() {
		return OutboundQuota;
	}
	public void setOutboundQuota(Object newOutboundQuota) {
		OutboundQuota = newOutboundQuota;
	}
	public Object getWriteQuotaAvailable() {
		return WriteQuotaAvailable;
	}
	public void setWriteQuotaAvailable(Object newWriteQuotaAvailable) {
		WriteQuotaAvailable = newWriteQuotaAvailable;
	}
	public Object getNamedPipeState() {
		return NamedPipeState;
	}
	public void setNamedPipeState(Object newNamedPipeState) {
		NamedPipeState = newNamedPipeState;
	}
	public Object getNamedPipeEnd() {
		return NamedPipeEnd;
	}
	public void setNamedPipeEnd(Object newNamedPipeEnd) {
		NamedPipeEnd = newNamedPipeEnd;
	}
}
