package application;

/*
 * Rufus: The Reliable USB Formatting Utility
 * Device detection and enumeration
 * Copyright © 2014-2019 Pete Batard <pete@akeo.ie>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/* List of the properties we are interested in */
public class usb_device_props {
	private Object vid;
	private Object pid;
	private Object speed;
	private Object lower_speed;
	private Object port;
	private Object is_USB;
	private Object is_SCSI;
	private Object is_CARD;
	private Object is_UASP;
	private Object is_VHD;
	private Object is_Removable;
	
	public usb_device_props(Object vid, Object pid, Object speed, Object lower_speed, Object port, Object is_USB, Object is_SCSI, Object is_CARD, Object is_UASP, Object is_VHD, Object is_Removable) {
		setVid(vid);
		setPid(pid);
		setSpeed(speed);
		setLower_speed(lower_speed);
		setPort(port);
		setIs_USB(is_USB);
		setIs_SCSI(is_SCSI);
		setIs_CARD(is_CARD);
		setIs_UASP(is_UASP);
		setIs_VHD(is_VHD);
		setIs_Removable(is_Removable);
	}
	public usb_device_props() {
	}
	
	public Object GetUSBProperties(Byte parent_path, Byte device_id) {
		BOOL r = 0;
		CONFIGRET cr = new CONFIGRET();
		HANDLE handle = (HANDLE)(true);
		DWORD size = new DWORD();
		DEVINST device_inst = new DEVINST();
		USB_NODE_CONNECTION_INFORMATION_EX conn_info = new USB_NODE_CONNECTION_INFORMATION_EX();
		USB_NODE_CONNECTION_INFORMATION_EX_V2 conn_info_v2 = new USB_NODE_CONNECTION_INFORMATION_EX_V2();
		if (pfCM_Get_DevNode_Registry_PropertyA == (null)) {
			pfCM_Get_DevNode_Registry_PropertyA = (CM_Get_DevNode_Registry_PropertyA_t)/*Error: Function owner not recognized*/GetProcAddress(ModernizedCProgram.GetLibraryHandle("Cfgmgr32"), "CM_Get_DevNode_Registry_PropertyA");
		} 
		if ((parent_path == (null)) || (device_id == (null)) || (props == (null)) || (pfCM_Get_DevNode_Registry_PropertyA == (null))) {
			;
		} 
		cr = /*Error: Function owner not recognized*/CM_Locate_DevNodeA(device_inst, device_id, 0);
		if (cr != CR_SUCCESS) {
			ModernizedCProgram._uprintf("Could not get device instance handle for '%s': CR error %d", device_id, cr);
			;
		} 
		this.setPort(0);
		Object generatedPort = this.getPort();
		size = /*Error: sizeof expression not supported yet*/;
		cr = /*Error: Function owner not recognized*/pfCM_Get_DevNode_Registry_PropertyA(device_inst, CM_DRP_ADDRESS, (null), (PVOID)generatedPort, size, 0);
		if (cr != CR_SUCCESS) {
			ModernizedCProgram._uprintf("Could not get port for '%s': CR error %d", device_id, cr);
			;
		} 
		handle = /*Error: Function owner not recognized*/CreateFileA(parent_path, -1024, -1024, (null), 3, 1073741824, (null));
		if (handle == (HANDLE)(true)) {
			ModernizedCProgram._uprintf("Could not open hub %s: %s", parent_path, ModernizedCProgram.WindowsErrorString());
			;
		} 
		size = /*Error: sizeof expression not supported yet*/;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(conn_info, 0, size);
		conn_info.setConnectionIndex((ULONG)generatedPort)// coverity[tainted_data_argument];// coverity[tainted_data_argument]
		if (!/*Error: Function owner not recognized*/DeviceIoControl(handle, (((true) << 16) | ((true) << 14) | ((true) << 2) | (false)), conn_info, size, conn_info, size, size, (null))) {
			ModernizedCProgram._uprintf("Could not get node connection information for '%s': %s", device_id, ModernizedCProgram.WindowsErrorString());
			;
		} 
		_USB_DEVICE_DESCRIPTOR generatedDeviceDescriptor = conn_info.getDeviceDescriptor();
		Object generatedIdVendor = generatedDeviceDescriptor.getIdVendor();
		Object generatedIdProduct = generatedDeviceDescriptor.getIdProduct();
		Object generatedSpeed = conn_info.getSpeed();
		// have a screwed up implementation of IOCTL_USB_GET_NODE_CONNECTION_INFORMATION_EX that succeeds// but returns zeroed data => Add a workaround so that we don't lose our VID:PID...if ((generatedIdVendor != 0) || (generatedIdProduct != 0)) {
			this.setVid(generatedIdVendor);
			this.setPid(generatedIdProduct);
			this.setSpeed(generatedSpeed + 1);
			r = 1;
		} 
		_USB_PROTOCOLS generatedSupportedUsbProtocols = conn_info_v2.getSupportedUsbProtocols();
		_USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS generatedFlags = conn_info_v2.getFlags();
		Object generatedDeviceIsOperatingAtSuperSpeedPlusOrHigher = generatedFlags.getDeviceIsOperatingAtSuperSpeedPlusOrHigher();
		Object generatedDeviceIsOperatingAtSuperSpeedOrHigher = generatedFlags.getDeviceIsOperatingAtSuperSpeedOrHigher();
		Object generatedDeviceIsSuperSpeedPlusCapableOrHigher = generatedFlags.getDeviceIsSuperSpeedPlusCapableOrHigher();
		Object generatedDeviceIsSuperSpeedCapableOrHigher = generatedFlags.getDeviceIsSuperSpeedCapableOrHigher();
		// In their great wisdom, Microsoft decided to BREAK the USB speed report between Windows 7 and Windows 8if (ModernizedCProgram.nWindowsVersion >= WindowsVersion.WINDOWS_8) {
			size = /*Error: sizeof expression not supported yet*/;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(conn_info_v2, 0, size);
			conn_info_v2.setConnectionIndex((ULONG)generatedPort);
			conn_info_v2.setLength(size);
			generatedSupportedUsbProtocols.setUsb300(1);
			if (!/*Error: Function owner not recognized*/DeviceIoControl(handle, (((true) << 16) | ((true) << 14) | ((true) << 2) | (false)), conn_info_v2, size, conn_info_v2, size, size, (null))) {
				ModernizedCProgram._uprintf("Could not get node connection information (V2) for device '%s': %s", device_id, ModernizedCProgram.WindowsErrorString());
			}  else if (generatedDeviceIsOperatingAtSuperSpeedPlusOrHigher) {
				this.setSpeed(5);
			}  else if (generatedDeviceIsOperatingAtSuperSpeedOrHigher) {
				this.setSpeed(4);
			}  else if (generatedDeviceIsSuperSpeedPlusCapableOrHigher) {
				this.setLower_speed(2);
			}  else if (generatedDeviceIsSuperSpeedCapableOrHigher) {
				this.setLower_speed(1);
			} 
		} 
		return r/*
		 * Cycle the USB port of the selected device
		 */;
	}
	public Object getVid() {
		return vid;
	}
	public void setVid(Object newVid) {
		vid = newVid;
	}
	public Object getPid() {
		return pid;
	}
	public void setPid(Object newPid) {
		pid = newPid;
	}
	public Object getSpeed() {
		return speed;
	}
	public void setSpeed(Object newSpeed) {
		speed = newSpeed;
	}
	public Object getLower_speed() {
		return lower_speed;
	}
	public void setLower_speed(Object newLower_speed) {
		lower_speed = newLower_speed;
	}
	public Object getPort() {
		return port;
	}
	public void setPort(Object newPort) {
		port = newPort;
	}
	public Object getIs_USB() {
		return is_USB;
	}
	public void setIs_USB(Object newIs_USB) {
		is_USB = newIs_USB;
	}
	public Object getIs_SCSI() {
		return is_SCSI;
	}
	public void setIs_SCSI(Object newIs_SCSI) {
		is_SCSI = newIs_SCSI;
	}
	public Object getIs_CARD() {
		return is_CARD;
	}
	public void setIs_CARD(Object newIs_CARD) {
		is_CARD = newIs_CARD;
	}
	public Object getIs_UASP() {
		return is_UASP;
	}
	public void setIs_UASP(Object newIs_UASP) {
		is_UASP = newIs_UASP;
	}
	public Object getIs_VHD() {
		return is_VHD;
	}
	public void setIs_VHD(Object newIs_VHD) {
		is_VHD = newIs_VHD;
	}
	public Object getIs_Removable() {
		return is_Removable;
	}
	public void setIs_Removable(Object newIs_Removable) {
		is_Removable = newIs_Removable;
	}
}
