package application;

public class _USB_NODE_CONNECTION_INFORMATION_EX_V2 {
	private Object ConnectionIndex;
	private Object Length;
	private _USB_PROTOCOLS SupportedUsbProtocols;
	private _USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS Flags;
	
	public _USB_NODE_CONNECTION_INFORMATION_EX_V2(Object ConnectionIndex, Object Length, _USB_PROTOCOLS SupportedUsbProtocols, _USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS Flags) {
		setConnectionIndex(ConnectionIndex);
		setLength(Length);
		setSupportedUsbProtocols(SupportedUsbProtocols);
		setFlags(Flags);
	}
	public _USB_NODE_CONNECTION_INFORMATION_EX_V2() {
	}
	
	public Object getConnectionIndex() {
		return ConnectionIndex;
	}
	public void setConnectionIndex(Object newConnectionIndex) {
		ConnectionIndex = newConnectionIndex;
	}
	public Object getLength() {
		return Length;
	}
	public void setLength(Object newLength) {
		Length = newLength;
	}
	public _USB_PROTOCOLS getSupportedUsbProtocols() {
		return SupportedUsbProtocols;
	}
	public void setSupportedUsbProtocols(_USB_PROTOCOLS newSupportedUsbProtocols) {
		SupportedUsbProtocols = newSupportedUsbProtocols;
	}
	public _USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS getFlags() {
		return Flags;
	}
	public void setFlags(_USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS newFlags) {
		Flags = newFlags;
	}
}
