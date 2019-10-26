package application;

/* Most of the structures below need to be packed */
public class _USB_DEVICE_DESCRIPTOR {
	private Object bLength;
	private Object bDescriptorType;
	private Object bcdUSB;
	private Object bDeviceClass;
	private Object bDeviceSubClass;
	private Object bDeviceProtocol;
	private Object bMaxPacketSize0;
	private Object idVendor;
	private Object idProduct;
	private Object bcdDevice;
	private Object iManufacturer;
	private Object iProduct;
	private Object iSerialNumber;
	private Object bNumConfigurations;
	
	public _USB_DEVICE_DESCRIPTOR(Object bLength, Object bDescriptorType, Object bcdUSB, Object bDeviceClass, Object bDeviceSubClass, Object bDeviceProtocol, Object bMaxPacketSize0, Object idVendor, Object idProduct, Object bcdDevice, Object iManufacturer, Object iProduct, Object iSerialNumber, Object bNumConfigurations) {
		setBLength(bLength);
		setBDescriptorType(bDescriptorType);
		setBcdUSB(bcdUSB);
		setBDeviceClass(bDeviceClass);
		setBDeviceSubClass(bDeviceSubClass);
		setBDeviceProtocol(bDeviceProtocol);
		setBMaxPacketSize0(bMaxPacketSize0);
		setIdVendor(idVendor);
		setIdProduct(idProduct);
		setBcdDevice(bcdDevice);
		setIManufacturer(iManufacturer);
		setIProduct(iProduct);
		setISerialNumber(iSerialNumber);
		setBNumConfigurations(bNumConfigurations);
	}
	public _USB_DEVICE_DESCRIPTOR() {
	}
	
	public Object getBLength() {
		return bLength;
	}
	public void setBLength(Object newBLength) {
		bLength = newBLength;
	}
	public Object getBDescriptorType() {
		return bDescriptorType;
	}
	public void setBDescriptorType(Object newBDescriptorType) {
		bDescriptorType = newBDescriptorType;
	}
	public Object getBcdUSB() {
		return bcdUSB;
	}
	public void setBcdUSB(Object newBcdUSB) {
		bcdUSB = newBcdUSB;
	}
	public Object getBDeviceClass() {
		return bDeviceClass;
	}
	public void setBDeviceClass(Object newBDeviceClass) {
		bDeviceClass = newBDeviceClass;
	}
	public Object getBDeviceSubClass() {
		return bDeviceSubClass;
	}
	public void setBDeviceSubClass(Object newBDeviceSubClass) {
		bDeviceSubClass = newBDeviceSubClass;
	}
	public Object getBDeviceProtocol() {
		return bDeviceProtocol;
	}
	public void setBDeviceProtocol(Object newBDeviceProtocol) {
		bDeviceProtocol = newBDeviceProtocol;
	}
	public Object getBMaxPacketSize0() {
		return bMaxPacketSize0;
	}
	public void setBMaxPacketSize0(Object newBMaxPacketSize0) {
		bMaxPacketSize0 = newBMaxPacketSize0;
	}
	public Object getIdVendor() {
		return idVendor;
	}
	public void setIdVendor(Object newIdVendor) {
		idVendor = newIdVendor;
	}
	public Object getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Object newIdProduct) {
		idProduct = newIdProduct;
	}
	public Object getBcdDevice() {
		return bcdDevice;
	}
	public void setBcdDevice(Object newBcdDevice) {
		bcdDevice = newBcdDevice;
	}
	public Object getIManufacturer() {
		return iManufacturer;
	}
	public void setIManufacturer(Object newIManufacturer) {
		iManufacturer = newIManufacturer;
	}
	public Object getIProduct() {
		return iProduct;
	}
	public void setIProduct(Object newIProduct) {
		iProduct = newIProduct;
	}
	public Object getISerialNumber() {
		return iSerialNumber;
	}
	public void setISerialNumber(Object newISerialNumber) {
		iSerialNumber = newISerialNumber;
	}
	public Object getBNumConfigurations() {
		return bNumConfigurations;
	}
	public void setBNumConfigurations(Object newBNumConfigurations) {
		bNumConfigurations = newBNumConfigurations;
	}
}
