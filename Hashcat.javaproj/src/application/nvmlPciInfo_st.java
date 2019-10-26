package application;

public class nvmlPciInfo_st {
	private Object busId;
	private int domain;
	private int bus;
	private int device;
	private int pciDeviceId;
	private int pciSubSystemId;
	private int reserved0;
	private int reserved1;
	private int reserved2;
	private int reserved3;
	
	public nvmlPciInfo_st(Object busId, int domain, int bus, int device, int pciDeviceId, int pciSubSystemId, int reserved0, int reserved1, int reserved2, int reserved3) {
		setBusId(busId);
		setDomain(domain);
		setBus(bus);
		setDevice(device);
		setPciDeviceId(pciDeviceId);
		setPciSubSystemId(pciSubSystemId);
		setReserved0(reserved0);
		setReserved1(reserved1);
		setReserved2(reserved2);
		setReserved3(reserved3);
	}
	public nvmlPciInfo_st() {
	}
	
	public Object getBusId() {
		return busId;
	}
	public void setBusId(Object newBusId) {
		busId = newBusId;
	}
	public int getDomain() {
		return domain;
	}
	public void setDomain(int newDomain) {
		domain = newDomain;
	}
	public int getBus() {
		return bus;
	}
	public void setBus(int newBus) {
		bus = newBus;
	}
	public int getDevice() {
		return device;
	}
	public void setDevice(int newDevice) {
		device = newDevice;
	}
	public int getPciDeviceId() {
		return pciDeviceId;
	}
	public void setPciDeviceId(int newPciDeviceId) {
		pciDeviceId = newPciDeviceId;
	}
	public int getPciSubSystemId() {
		return pciSubSystemId;
	}
	public void setPciSubSystemId(int newPciSubSystemId) {
		pciSubSystemId = newPciSubSystemId;
	}
	public int getReserved0() {
		return reserved0;
	}
	public void setReserved0(int newReserved0) {
		reserved0 = newReserved0;
	}
	public int getReserved1() {
		return reserved1;
	}
	public void setReserved1(int newReserved1) {
		reserved1 = newReserved1;
	}
	public int getReserved2() {
		return reserved2;
	}
	public void setReserved2(int newReserved2) {
		reserved2 = newReserved2;
	}
	public int getReserved3() {
		return reserved3;
	}
	public void setReserved3(int newReserved3) {
		reserved3 = newReserved3;
	}
}
