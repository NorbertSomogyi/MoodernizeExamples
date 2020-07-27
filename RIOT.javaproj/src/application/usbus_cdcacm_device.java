package application;

/*
 * Copyright (C) 2018 Mesotic SAS
 *
 * This file is subject to the terms and conditions of the GNU Lesser General
 * Public License v2.1. See the file LICENSE in the top level directory for
 * more details.
 */
/**
 * @defgroup    usbus_cdc_acm USBUS CDC ACM - USBUS CDC abstract control model
 * @ingroup     usb
 * @brief       USBUS CDC ACM interface module
 *
 * @{
 *
 * @file
 * @brief       Interface and definitions for USB CDC ACM type interfaces in
 *              USBUS.
 *
 *              The functionality provided here only implements the USB
 *              specific handling. A different module is required to provide
 *              functional handling of the data e.g. UART or STDIO integration.
 *
 * @author      Dylan Laduranty <dylan.laduranty@mesotic.com>
 * @author      Koen Zandberg <koen@bergzand.net>
 */
/**
 * @brief Buffer size for STDIN and STDOUT data to and from USB when using
 *        the USBUS_CDC_ACM_STDIO module
 */
/**
 * @brief USB CDC ACM bulk endpoint size
 */
/**
 * @brief USBUS CDC ACM interrupt endpoint size.
 */
/**
 * @brief CDC ACM line state as reported by the host computer
 */
/**
     * @brief No DTE connected
     */
/**
     * @brief DTE (e.g. a personal computer) is present and connected
     */
/**
 * @brief USBUS CDC ACM context struct forward declaration
 */
/**
 * @brief USBUS CDC ACM context struct
 */
public class usbus_cdcacm_device {
	private Object handler_ctrl;
	private Object iface_ctrl;
	private Object iface_data;
	private Object cdcacm_hdr;
	private Object cb;
	private Object coding_cb;
	private tsrb tsrb;
	private Object usbus;
	private Object occupied;
	private  state;
	private Object flush;
	private Object coding;
	
	public usbus_cdcacm_device(Object handler_ctrl, Object iface_ctrl, Object iface_data, Object cdcacm_hdr, Object cb, Object coding_cb, tsrb tsrb, Object usbus, Object occupied,  state, Object flush, Object coding) {
		setHandler_ctrl(handler_ctrl);
		setIface_ctrl(iface_ctrl);
		setIface_data(iface_data);
		setCdcacm_hdr(cdcacm_hdr);
		setCb(cb);
		setCoding_cb(coding_cb);
		setTsrb(tsrb);
		setUsbus(usbus);
		setOccupied(occupied);
		setState(state);
		setFlush(flush);
		setCoding(coding);
	}
	public usbus_cdcacm_device() {
	}
	
	public Object getHandler_ctrl() {
		return handler_ctrl;
	}
	public void setHandler_ctrl(Object newHandler_ctrl) {
		handler_ctrl = newHandler_ctrl;
	}
	public Object getIface_ctrl() {
		return iface_ctrl;
	}
	public void setIface_ctrl(Object newIface_ctrl) {
		iface_ctrl = newIface_ctrl;
	}
	public Object getIface_data() {
		return iface_data;
	}
	public void setIface_data(Object newIface_data) {
		iface_data = newIface_data;
	}
	public Object getCdcacm_hdr() {
		return cdcacm_hdr;
	}
	public void setCdcacm_hdr(Object newCdcacm_hdr) {
		cdcacm_hdr = newCdcacm_hdr;
	}
	public Object getCb() {
		return cb;
	}
	public void setCb(Object newCb) {
		cb = newCb;
	}
	public Object getCoding_cb() {
		return coding_cb;
	}
	public void setCoding_cb(Object newCoding_cb) {
		coding_cb = newCoding_cb;
	}
	public tsrb getTsrb() {
		return tsrb;
	}
	public void setTsrb(tsrb newTsrb) {
		tsrb = newTsrb;
	}
	public Object getUsbus() {
		return usbus;
	}
	public void setUsbus(Object newUsbus) {
		usbus = newUsbus;
	}
	public Object getOccupied() {
		return occupied;
	}
	public void setOccupied(Object newOccupied) {
		occupied = newOccupied;
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public Object getFlush() {
		return flush;
	}
	public void setFlush(Object newFlush) {
		flush = newFlush;
	}
	public Object getCoding() {
		return coding;
	}
	public void setCoding(Object newCoding) {
		coding = newCoding;
	}
}
/**
 * @brief CDC ACM data callback.
 *
 * Callback for received data from the USB host
 *
 * @param[in]   cdcacm  CDC ACM handler context
 * @param[in]   data    ptr to the data
 * @param[in]   len     Length of the received data
 */
/**
 * @brief CDC ACM line coding callback.
 *
 * Callback for received line coding request from the USB host
 *
 * @param[in]   cdcacm  CDC ACM handler context
 * @param[in]   baud    requested baud rate
 * @param[in]   bits    requested number of data bits
 * @param[in]   parity  requested parity
 * @param[in]   stop    requested number of stop bits
 *
 * @return              0 when the mode is available
 * @return              negative if the mode is not available
 */
