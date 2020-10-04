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
 * @see     <a href="http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/sys_socket.h.html">
 *              The Open Group Base Specifications Issue 7, <sys/socket.h>
 *          </a>
 *
 * @todo Omitted from original specification for now:
 * * struct msghdr, struct cmesghdr, and struct linger and all related defines
 * * getsockopt()/setsockopt() and all related defines.
 * * shutdown() and all related defines.
 * * sockatmark()
 *
 * @author  Martine Lenders <mlenders@inf.fu-berlin.de>
 */
/* Ignore Linux definitions in native */
/**
 * @brief Maximum number of sockets available on for creation with @ref socket()
 */
/* define enough for accepted sockets */
/**
 * @brief Maximum number of incoming TCP connections a listening socket can
 *        handle
 */
/**
 * @brief   Maximum data length for a socket address.
 *
 * It is assumed that struct sockaddr_in6 is currently the longest socket address struct.
 * As such it's data length is taken consisting of the IPv6 address (16 byte), the port (2 byte),
 * the flow information (4 byte) and the scope ID (4 byte)
 */
/**
 * @name    Socket types
 * @{
 */
/**< Datagram socket */
/**< Raw socket */
/**< Sequenced-packet socket */
/**< Stream socket */
/** @} */
/**< Options to be accessed at socket level, not protocol level */
/**
 * @name    Option names
 * @brief   Option names for getsockopt() and setsockopt()
 * @{
 */
/**< Socket is accepting connections. */
/**< Transmission of broadcast messages is supported. */
/**< Debugging information is being recorded. */
/**< Bypass normal routing. */
/**< Socket error status. */
/**< Connections are kept alive with periodic messages. */
/**< Socket lingers on close. */
/**< Out-of-band data is transmitted in line. */
/**< Receive buffer size. */
/**< Receive "low water mark". */
/**< Receive timeout. */
/**< Reuse of local addresses is supported. */
/**< Send buffer size. */
/**< Send "low water mark". */
/**< Send timeout. */
/**< Socket type. */
/** @} */
/**< address family type */
/**
 * @brief   Used to define the socket address.
 */
public class sockaddr {
	private Object sa_family;
	private Object[] sa_data;
	
	public sockaddr(Object sa_family, Object[] sa_data) {
		setSa_family(sa_family);
		setSa_data(sa_data);
	}
	public sockaddr() {
	}
	
	public Object getSa_family() {
		return sa_family;
	}
	public void setSa_family(Object newSa_family) {
		sa_family = newSa_family;
	}
	public Object[] getSa_data() {
		return sa_data;
	}
	public void setSa_data(Object[] newSa_data) {
		sa_data = newSa_data;
	}
}
/**
 * @brief   Receive a message from a connected socket.
 * @details Shall receive a message from a connection-mode or
 *          connectionless-mode socket. It is normally used with connected
 *          sockets because it does not permit the application to retrieve the
 *          source address of received data.
 *
 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/recv.html">
 *          The Open Group Base Specification Issue 7, recv
 *      </a>
 *
 * @param[in] socket    Specifies the socket file descriptor.
 * @param[out] buffer   Points to a buffer where the message should be stored.
 * @param[in] length    Specifies the length in bytes of the buffer pointed to
 *                      by the buffer argument.
 * @param[in] flags     Specifies the type of message reception. Support for
 *                      values other than 0 is not implemented yet.
 *
 * @return  Upon successful completion, recv() shall return the length of the
 *          message in bytes. If no messages are available to be received and
 *          the peer has performed an orderly shutdown, recv() shall return 0.
 *          Otherwise, -1 shall be returned and errno set to indicate the error.
 */
/**
 * @brief   Send a message on a socket.
 * @details Shall initiate transmission of a message from the specified socket
 *          to its peer. The send() function shall send a message only when the
 *          socket is connected. If the socket is a connectionless-mode socket,
 *          the message shall be sent to the pre-specified peer address.
 *
 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/send.html">
 *          The Open Group Base Specification Issue 7, send
 *      </a>
 *
 * @param[in] socket    Specifies the socket file descriptor.
 * @param[in] buffer    Points to the buffer containing the message to send.
 * @param[in] length    Specifies the length of the message in bytes.
 * @param[in] flags     Specifies the type of message reception. Support
 *                      for values other than 0 is not implemented yet.
 *
 * @return  Upon successful completion, send() shall return the number of bytes
 *          sent. Otherwise, -1 shall be returned and errno set to indicate the
 *          error.
 */
