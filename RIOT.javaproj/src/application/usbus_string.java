package application;

/*
 * Copyright (C) 2018 Koen Zandberg
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @defgroup    usb_usbus USBUS device and endpoint manager
 * @ingroup     usb
 * @brief       USBUS (Universal Serial Bus Unified Stack),  USB device
 *              management interface
 *
 * @{
 *
 * @file
 * @brief       USBUS basic interface
 *
 * @author      Koen Zandberg <koen@bergzand.net>
 */
/**
 * @brief USBUS thread stack size
 */
/**
 * @brief USBUS thread priority
 */
/**
 * @brief USBUS thread name
 */
/**
 * @brief USBUS auto attach setting
 *
 * When set, the USBUS thread will automatically enable the USB pull-up
 * resistor after initializing the thread. This will signal to the host
 * that the USB peripheral is ready for use.
 */
/**
 * @brief USBUS endpoint 0 buffer size
 *
 * This configures the buffer size of the control endpoint. Unless you transfer
 * large amount of data often over the control endpoint, a minimal size should
 * be sufficient
 */
/**
 * @name USBUS thread flags
 *
 * Thread flags used by the USBUS thread. @ref THREAD_FLAG_EVENT is also used,
 * but defined elsewhere
 * @{
 */
/**< usbdev esr needs handling */
/**< One or more endpoints requires
                                                 servicing */
/** @} */
/**
 * @name USBUS handler subscription flags
 *
 * @{
 */
/**< Report reset event */
/**< Report SOF events */
/**< Report suspend events */
/**< Report resume from suspend */
/**< Report transfer fail */
/**< Report transfer stall complete */
/** @} */
/**
 * @brief USB handler events
 */
/**< USB reset event                */
/**< USB start of frame received    */
/**< USB suspend condition detected */
/**< USB resume condition detected  */
/**
 * @brief USB endpoint transfer status events
 */
/**< Transfer succesfully completed */
/**< Transfer nack replied by peripheral */
/**< Transfer stall replied by peripheral */
/**
 * @brief state machine states for the global USBUS thread
 */
/**< Device is disconnected from the host */
/**< Reset condition received */
/**< Address configured */
/**< Peripheral is configured */
/**< Peripheral is suspended by the host */
/**
 * @brief USBUS control request state machine
 */
/**< Ready for new control request */
/**< Request received with expected
                                               DATA IN stage */
/**< Expecting a zero-length ack OUT
                                               request from the host */
/**< Data OUT expected */
/**< Expecting a zero-length ack IN
                                               request from the host */
/**
 * @brief USBUS string type
 */
/**< Ptr to the next registered string */
public class usbus_string {
	private usbus_string next;
	private Object str;
	private Object idx;
	
	public usbus_string(usbus_string next, Object str, Object idx) {
		setNext(next);
		setStr(str);
		setIdx(idx);
	}
	public usbus_string() {
	}
	
	public usbus_string getNext() {
		return next;
	}
	public void setNext(usbus_string newNext) {
		next = newNext;
	}
	public Object getStr() {
		return str;
	}
	public void setStr(Object newStr) {
		str = newStr;
	}
	public Object getIdx() {
		return idx;
	}
	public void setIdx(Object newIdx) {
		idx = newIdx;
	}
}
