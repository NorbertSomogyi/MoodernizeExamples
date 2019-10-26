package application;

/**
 * \struct _NV_ENC_MAP_INPUT_RESOURCE
 * Map an input resource to a Nvidia Encoder Input Buffer
 */
public class _NV_ENC_MAP_INPUT_RESOURCE {
	private Object version;
	private Object subResourceIndex;
	private Object inputResource;
	private Object registeredResource;
	private Object mappedResource;
	private _NV_ENC_BUFFER_FORMAT mappedBufferFmt;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_MAP_INPUT_RESOURCE(Object version, Object subResourceIndex, Object inputResource, Object registeredResource, Object mappedResource, _NV_ENC_BUFFER_FORMAT mappedBufferFmt, Object reserved1, Object reserved2) {
		setVersion(version);
		setSubResourceIndex(subResourceIndex);
		setInputResource(inputResource);
		setRegisteredResource(registeredResource);
		setMappedResource(mappedResource);
		setMappedBufferFmt(mappedBufferFmt);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_MAP_INPUT_RESOURCE() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getSubResourceIndex() {
		return subResourceIndex;
	}
	public void setSubResourceIndex(Object newSubResourceIndex) {
		subResourceIndex = newSubResourceIndex;
	}
	public Object getInputResource() {
		return inputResource;
	}
	public void setInputResource(Object newInputResource) {
		inputResource = newInputResource;
	}
	public Object getRegisteredResource() {
		return registeredResource;
	}
	public void setRegisteredResource(Object newRegisteredResource) {
		registeredResource = newRegisteredResource;
	}
	public Object getMappedResource() {
		return mappedResource;
	}
	public void setMappedResource(Object newMappedResource) {
		mappedResource = newMappedResource;
	}
	public _NV_ENC_BUFFER_FORMAT getMappedBufferFmt() {
		return mappedBufferFmt;
	}
	public void setMappedBufferFmt(_NV_ENC_BUFFER_FORMAT newMappedBufferFmt) {
		mappedBufferFmt = newMappedBufferFmt;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public Object getReserved2() {
		return reserved2;
	}
	public void setReserved2(Object newReserved2) {
		reserved2 = newReserved2;
	}
}
