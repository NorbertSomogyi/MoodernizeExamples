package application;

/*
 * Copyright (C) 2013-15 Freie Universität Berlin
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @addtogroup  posix_sockets
 * @{
 */
/**
 * @file
 * @brief   Main socket header
 * @see     <a href="http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/netinet_in.h.html">
 *              The Open Group Base Specifications Issue 7, <netinet/in.h>
 *          </a>
 *
 * @author  Martine Lenders <mlenders@inf.fu-berlin.de>
 */
/**< Length of the string form for IPv4. */
/**< Length of the string form for IPv6. */
/**
 * IPv4 local host address.
 */
/**
 * IPv4 broadcast address.
 */
/**
 * IPv6 wildcard address.
 */
/**
 * IPv6 loopback address.
 */
/**
 * @name    IPv6 address macros
 * @{
 */
/**
 * @brief Check if address is the unspecified address (`::`).
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not the unspecified address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is the loopback address (`::1`).
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not the loopback address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is a multicast address.
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not a multicast address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is a link-local address.
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not a link-local address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is a site-local address.
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not a site-local address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is an IPv4 mapped address.
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not an IPv4 mapped address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is an IPv4-compatible address.
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not an IPv4-compatible address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is a multicast node-local address.
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not a multicast node-local address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is a multicast link-local address.
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not a multicast link-local address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is a multicast site-local address.
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not a multicast site-local address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is a multicast organization-local address.
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not a multicast organization-local address.
 * @return any other value otherwise.
 */
/**
 * @brief Check if address is a multicast global address.
 *
 * @param[in] addr  address of type `const struct in6_addr *`
 *
 * @return 0, when an address is not a multicast global address.
 * @return any other value otherwise.
 */
/** @} */
/**
 * @name    Protocol numbers for option
 * @{
 */
/**< Internet Protocol version 4 */
/**< Internet Protocol version 6 */
/**< Internet Control Message Protocol */
/**< ICMP for IPv6 */
/**< Raw IP packets protocol */
/**< Transmission control protocol */
/**< User datagram protocol */
/** @} */
/**
 * @todo IPv6 option names
 */
/**< Internet port type */
/**< IPv4 address type */
/**
 * IPv4 address structure type.
 */
/**< IPv4 address */
public class in_addr {
	private Object s_addr;
	
	public in_addr(Object s_addr) {
		setS_addr(s_addr);
	}
	public in_addr() {
	}
	
	public Object getS_addr() {
		return s_addr;
	}
	public void setS_addr(Object newS_addr) {
		s_addr = newS_addr;
	}
}
/**
 * IPv6 socket address type.
 * @extends struct sockaddr
 */
