package application;

/*
 * Copyright (C) 2017 Freie Universität Berlin
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @addtogroup  net_gnrc_ipv6_nib
 * @internal
 * @{
 *
 * @file
 * @brief       Internal definitions
 *
 * @author      Martine Lenders <m.lenders@fu-berlin.de>
 */
/**
 * @name    Mode flags for entries
 * @anchor  net_gnrc_ipv6_nib_mode
 * @{
 */
/**< empty */
/**< neighbor cache */
/**< destination cache */
/**< prefix list */
/**< default router list */
/**< forwarding table */
/**< 6LoWPAN duplicate address detection table */
/**< there is @ref _nib_offl_entry_t pointing
                                 to this @ref _nib_onl_entry_t */
/** @} */
/**
 * @name    Off-link entry flags
 * @anchor  net_gnrc_ipv6_nib_offl_flags
 * @{
 */
/** @} */
/**
 * @brief   Shorter name for convenience ;-)
 */
/**
 * @brief   Shorter name for convenience ;-)
 */
/**
 * @brief   Maximum identifier for the interface
 */
/**
 * @brief   On-link NIB entry
 * @anchor  _nib_onl_entry_t
 */
/**< next removable entry */
public class _nib_onl_entry {
	private _nib_onl_entry next;
	private Object ipv6;
	private Object nud_timeout;
	private Object snd_na;
	private Object info;
	private Object mode;
	
	public _nib_onl_entry(_nib_onl_entry next, Object ipv6, Object nud_timeout, Object snd_na, Object info, Object mode) {
		setNext(next);
		setIpv6(ipv6);
		setNud_timeout(nud_timeout);
		setSnd_na(snd_na);
		setInfo(info);
		setMode(mode);
	}
	public _nib_onl_entry() {
	}
	
	public void _nib_onl_set_if(int iface) {
		((iface <= ((GNRC_IPV6_NIB_NC_INFO_IFACE_MASK) >> (GNRC_IPV6_NIB_NC_INFO_IFACE_POS))) ? (Object)0 : /*Error: Function owner not recognized*/_assert("iface <= _NIB_IF_MAX", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\_nib-internal.h", 294));
		Object generatedInfo = this.getInfo();
		generatedInfo &=  ~((GNRC_IPV6_NIB_NC_INFO_IFACE_MASK));
		generatedInfo |=  ((iface << (GNRC_IPV6_NIB_NC_INFO_IFACE_POS)) & (GNRC_IPV6_NIB_NC_INFO_IFACE_MASK/**
		 * @brief   Creates or gets an existing on-link entry by address
		 *
		 * @param[in] addr  An IPv6 address. May be NULL (to be pointed to by a prefix
		 *                  list entry). *May also be a global address!*
		 * @param[in] iface The interface to the node.
		 *
		 * @return  A new or existing on-link entry with _nib_onl_entry_t::ipv6 set to
		 *          @p addr.
		 * @return  NULL, if no space is left.
		 */));
	}
	public boolean _nib_onl_clear() {
		Object generatedMode = this.getMode();
		if (generatedMode == (true)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(node, 0, /*Error: Unsupported expression*/);
			return 1;
		} 
		return 0/**
		 * @brief   Iterates over on-link entries
		 *
		 * @param[in] last  Last entry (NULL to start).
		 *
		 * @return  entry after @p last.
		 */;
	}
	public _nib_onl_entry _nib_dad_add(Object addr) {
		((addr != ((Object)0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("addr != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\_nib-internal.h", 411));
		_nib_onl_entry_t node = /*Error: Function owner not recognized*/_nib_onl_alloc(addr, 0);
		Object generatedMode = node.getMode();
		if (node != ((Object)0)) {
			generatedMode |=  ((true));
		} 
		return node/**
		 * @brief   Removes a node from the DAD table
		 *
		 * @param[in] node  A node.
		 */;
	}
	public void _nib_dad_remove() {
		Object generatedMode = this.getMode();
		generatedMode &=  ~((true));
		node/**
		 * @brief   Creates or gets an existing default router list entry by address
		 *
		 * @pre     `(addr != NULL)`
		 *
		 * @param[in] addr  An IPv6 address. Must not be NULL.
		 *                  *May also be a global address!*
		 * @param[in] iface The interface to the router.
		 *
		 * @return  A new or existing default router entry with _nib_onl_entry_t::ipv6
		 *          of _nib_dr_entry_t::next_hop set to @p router_addr.
		 * @return  NULL, if no space is left.
		 */._nib_onl_clear();
	}
	public _nib_onl_entry getNext() {
		return next;
	}
	public void setNext(_nib_onl_entry newNext) {
		next = newNext;
	}
	public Object getIpv6() {
		return ipv6;
	}
	public void setIpv6(Object newIpv6) {
		ipv6 = newIpv6;
	}
	public Object getNud_timeout() {
		return nud_timeout;
	}
	public void setNud_timeout(Object newNud_timeout) {
		nud_timeout = newNud_timeout;
	}
	public Object getSnd_na() {
		return snd_na;
	}
	public void setSnd_na(Object newSnd_na) {
		snd_na = newSnd_na;
	}
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object newInfo) {
		info = newInfo;
	}
	public Object getMode() {
		return mode;
	}
	public void setMode(Object newMode) {
		mode = newMode;
	}
}
/**
     * @brief   queue for packets currently in address resolution
     *
     * @note    Only available if @ref GNRC_IPV6_NIB_CONF_QUEUE_PKT != 0.
     */
