package application;

public class USB_NODE_CONNECTION_INFORMATION_EX {
	private Object ConnectionIndex;
	private _USB_DEVICE_DESCRIPTOR DeviceDescriptor;
	private Object CurrentConfigurationValue;
	private Object Speed;
	private Object DeviceIsHub;
	private Object DeviceAddress;
	private Object NumberOfOpenPipes;
	private USB_CONNECTION_STATUS ConnectionStatus;
	
	public USB_NODE_CONNECTION_INFORMATION_EX(Object ConnectionIndex, _USB_DEVICE_DESCRIPTOR DeviceDescriptor, Object CurrentConfigurationValue, Object Speed, Object DeviceIsHub, Object DeviceAddress, Object NumberOfOpenPipes, USB_CONNECTION_STATUS ConnectionStatus) {
		setConnectionIndex(ConnectionIndex);
		setDeviceDescriptor(DeviceDescriptor);
		setCurrentConfigurationValue(CurrentConfigurationValue);
		setSpeed(Speed);
		setDeviceIsHub(DeviceIsHub);
		setDeviceAddress(DeviceAddress);
		setNumberOfOpenPipes(NumberOfOpenPipes);
		setConnectionStatus(ConnectionStatus);
	}
	public USB_NODE_CONNECTION_INFORMATION_EX() {
	}
	
	public Object getConnectionIndex() {
		return ConnectionIndex;
	}
	public void setConnectionIndex(Object newConnectionIndex) {
		ConnectionIndex = newConnectionIndex;
	}
	public _USB_DEVICE_DESCRIPTOR getDeviceDescriptor() {
		return DeviceDescriptor;
	}
	public void setDeviceDescriptor(_USB_DEVICE_DESCRIPTOR newDeviceDescriptor) {
		DeviceDescriptor = newDeviceDescriptor;
	}
	public Object getCurrentConfigurationValue() {
		return CurrentConfigurationValue;
	}
	public void setCurrentConfigurationValue(Object newCurrentConfigurationValue) {
		CurrentConfigurationValue = newCurrentConfigurationValue;
	}
	public Object getSpeed() {
		return Speed;
	}
	public void setSpeed(Object newSpeed) {
		Speed = newSpeed;
	}
	public Object getDeviceIsHub() {
		return DeviceIsHub;
	}
	public void setDeviceIsHub(Object newDeviceIsHub) {
		DeviceIsHub = newDeviceIsHub;
	}
	public Object getDeviceAddress() {
		return DeviceAddress;
	}
	public void setDeviceAddress(Object newDeviceAddress) {
		DeviceAddress = newDeviceAddress;
	}
	public Object getNumberOfOpenPipes() {
		return NumberOfOpenPipes;
	}
	public void setNumberOfOpenPipes(Object newNumberOfOpenPipes) {
		NumberOfOpenPipes = newNumberOfOpenPipes;
	}
	public USB_CONNECTION_STATUS getConnectionStatus() {
		return ConnectionStatus;
	}
	public void setConnectionStatus(USB_CONNECTION_STATUS newConnectionStatus) {
		ConnectionStatus = newConnectionStatus;
	}
}
