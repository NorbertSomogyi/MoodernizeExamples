package application;

public class _NV_ENC_REGISTER_RESOURCE {
	private Object version;
	private _NV_ENC_INPUT_RESOURCE_TYPE resourceType;
	private Object width;
	private Object height;
	private Object pitch;
	private Object subResourceIndex;
	private Object resourceToRegister;
	private Object registeredResource;
	private _NV_ENC_BUFFER_FORMAT bufferFormat;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_REGISTER_RESOURCE(Object version, _NV_ENC_INPUT_RESOURCE_TYPE resourceType, Object width, Object height, Object pitch, Object subResourceIndex, Object resourceToRegister, Object registeredResource, _NV_ENC_BUFFER_FORMAT bufferFormat, Object reserved1, Object reserved2) {
		setVersion(version);
		setResourceType(resourceType);
		setWidth(width);
		setHeight(height);
		setPitch(pitch);
		setSubResourceIndex(subResourceIndex);
		setResourceToRegister(resourceToRegister);
		setRegisteredResource(registeredResource);
		setBufferFormat(bufferFormat);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_REGISTER_RESOURCE() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public _NV_ENC_INPUT_RESOURCE_TYPE getResourceType() {
		return resourceType;
	}
	public void setResourceType(_NV_ENC_INPUT_RESOURCE_TYPE newResourceType) {
		resourceType = newResourceType;
	}
	public Object getWidth() {
		return width;
	}
	public void setWidth(Object newWidth) {
		width = newWidth;
	}
	public Object getHeight() {
		return height;
	}
	public void setHeight(Object newHeight) {
		height = newHeight;
	}
	public Object getPitch() {
		return pitch;
	}
	public void setPitch(Object newPitch) {
		pitch = newPitch;
	}
	public Object getSubResourceIndex() {
		return subResourceIndex;
	}
	public void setSubResourceIndex(Object newSubResourceIndex) {
		subResourceIndex = newSubResourceIndex;
	}
	public Object getResourceToRegister() {
		return resourceToRegister;
	}
	public void setResourceToRegister(Object newResourceToRegister) {
		resourceToRegister = newResourceToRegister;
	}
	public Object getRegisteredResource() {
		return registeredResource;
	}
	public void setRegisteredResource(Object newRegisteredResource) {
		registeredResource = newRegisteredResource;
	}
	public _NV_ENC_BUFFER_FORMAT getBufferFormat() {
		return bufferFormat;
	}
	public void setBufferFormat(_NV_ENC_BUFFER_FORMAT newBufferFormat) {
		bufferFormat = newBufferFormat;
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
