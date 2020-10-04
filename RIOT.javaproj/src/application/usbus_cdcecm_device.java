package application;

/*
 * Copyright (C) 2019 Koen Zandberg
 *
 * This file is subject to the terms and conditions of the GNU Lesser General
 * Public License v2.1. See the file LICENSE in the top level directory for
 * more details.
 */
/**
 * @defgroup    usbus_cdc_ecm USBUS CDC ECM - USBUS CDC ethernet control model
 * @ingroup     usb
 * @brief       USBUS CDC ECM interface module
 *
 * @{
 *
 * @file
 * @brief       Interface and definitions for USB CDC ECM type interfaces
 *
 * @author      Koen Zandberg <koen@bergzand.net>
 */
/**
 * @brief Link throughput as reported by the peripheral
 *
 * This defines a common up and down link throughput in bits/second. The USB
 * peripheral will report this to the host. This doesn't affect the actual
 * throughput, only what the peripheral reports to the host.
 */
/**
 * @brief Link download speed as reported by the peripheral
 */
/**
 * @brief Link upload speed as reported by the peripheral
 */
/**
 * @brief CDC ECM interrupt endpoint size.
 *
 * Used by the device to report events to the host.
 *
 * @note Must be at least 16B to allow for reporting the link throughput
 */
/**
 * @brief CDC ECM bulk data endpoint size.
 *
 * Used for the transfer of network frames.
 */
/**
 * @brief notification state, used to track which information must be send to
 * the host
 */
/**< Nothing notified so far */
/**< Link status is notified */
/**< Link speed is notified */
/**
 * @brief USBUS CDC ECM device interface context
 */
public class usbus_cdcecm_device {
	private Object handler_ctrl;
	private Object iface_data;
	private Object iface_ctrl;
	private Object iface_data_alt;
	private Object ep_in;
	private Object ep_out;
	private Object ep_ctrl;
	private Object ecm_hdr;
	private Object rx_flush;
	private Object tx_xmit;
	private Object netdev;
	private Object[] mac_netdev;
	private Object[] mac_host;
	private Object mac_str;
	private Object usbus;
	private Object out_lock;
	private Object tx_len;
	private Object[] in_buf;
	private Object len;
	private  notif;
	private int active_iface;
	
	public usbus_cdcecm_device(Object handler_ctrl, Object iface_data, Object iface_ctrl, Object iface_data_alt, Object ep_in, Object ep_out, Object ep_ctrl, Object ecm_hdr, Object rx_flush, Object tx_xmit, Object netdev, Object[] mac_netdev, Object[] mac_host, Object mac_str, Object usbus, Object out_lock, Object tx_len, Object[] in_buf, Object len,  notif, int active_iface) {
		setHandler_ctrl(handler_ctrl);
		setIface_data(iface_data);
		setIface_ctrl(iface_ctrl);
		setIface_data_alt(iface_data_alt);
		setEp_in(ep_in);
		setEp_out(ep_out);
		setEp_ctrl(ep_ctrl);
		setEcm_hdr(ecm_hdr);
		setRx_flush(rx_flush);
		setTx_xmit(tx_xmit);
		setNetdev(netdev);
		setMac_netdev(mac_netdev);
		setMac_host(mac_host);
		setMac_str(mac_str);
		setUsbus(usbus);
		setOut_lock(out_lock);
		setTx_len(tx_len);
		setIn_buf(in_buf);
		setLen(len);
		setNotif(notif);
		setActive_iface(active_iface);
	}
	public usbus_cdcecm_device() {
	}
	
	public Object getHandler_ctrl() {
		return handler_ctrl;
	}
	public void setHandler_ctrl(Object newHandler_ctrl) {
		handler_ctrl = newHandler_ctrl;
	}
	public Object getIface_data() {
		return iface_data;
	}
	public void setIface_data(Object newIface_data) {
		iface_data = newIface_data;
	}
	public Object getIface_ctrl() {
		return iface_ctrl;
	}
	public void setIface_ctrl(Object newIface_ctrl) {
		iface_ctrl = newIface_ctrl;
	}
	public Object getIface_data_alt() {
		return iface_data_alt;
	}
	public void setIface_data_alt(Object newIface_data_alt) {
		iface_data_alt = newIface_data_alt;
	}
	public Object getEp_in() {
		return ep_in;
	}
	public void setEp_in(Object newEp_in) {
		ep_in = newEp_in;
	}
	public Object getEp_out() {
		return ep_out;
	}
	public void setEp_out(Object newEp_out) {
		ep_out = newEp_out;
	}
	public Object getEp_ctrl() {
		return ep_ctrl;
	}
	public void setEp_ctrl(Object newEp_ctrl) {
		ep_ctrl = newEp_ctrl;
	}
	public Object getEcm_hdr() {
		return ecm_hdr;
	}
	public void setEcm_hdr(Object newEcm_hdr) {
		ecm_hdr = newEcm_hdr;
	}
	public Object getRx_flush() {
		return rx_flush;
	}
	public void setRx_flush(Object newRx_flush) {
		rx_flush = newRx_flush;
	}
	public Object getTx_xmit() {
		return tx_xmit;
	}
	public void setTx_xmit(Object newTx_xmit) {
		tx_xmit = newTx_xmit;
	}
	public Object getNetdev() {
		return netdev;
	}
	public void setNetdev(Object newNetdev) {
		netdev = newNetdev;
	}
	public Object[] getMac_netdev() {
		return mac_netdev;
	}
	public void setMac_netdev(Object[] newMac_netdev) {
		mac_netdev = newMac_netdev;
	}
	public Object[] getMac_host() {
		return mac_host;
	}
	public void setMac_host(Object[] newMac_host) {
		mac_host = newMac_host;
	}
	public Object getMac_str() {
		return mac_str;
	}
	public void setMac_str(Object newMac_str) {
		mac_str = newMac_str;
	}
	public Object getUsbus() {
		return usbus;
	}
	public void setUsbus(Object newUsbus) {
		usbus = newUsbus;
	}
	public Object getOut_lock() {
		return out_lock;
	}
	public void setOut_lock(Object newOut_lock) {
		out_lock = newOut_lock;
	}
	public Object getTx_len() {
		return tx_len;
	}
	public void setTx_len(Object newTx_len) {
		tx_len = newTx_len;
	}
	public Object[] getIn_buf() {
		return in_buf;
	}
	public void setIn_buf(Object[] newIn_buf) {
		in_buf = newIn_buf;
	}
	public Object getLen() {
		return len;
	}
	public void setLen(Object newLen) {
		len = newLen;
	}
	public  getNotif() {
		return notif;
	}
	public void setNotif( newNotif) {
		notif = newNotif;
	}
	public int getActive_iface() {
		return active_iface;
	}
	public void setActive_iface(int newActive_iface) {
		active_iface = newActive_iface;
	}
}
