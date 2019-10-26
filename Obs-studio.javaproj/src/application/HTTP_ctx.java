package application;

/*
 *      Copyright (C) 2010 Howard Chu
 *      Copyright (C) 2010 Antti Ajanki
 *
 *  This file is part of librtmp.
 *
 *  librtmp is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as
 *  published by the Free Software Foundation; either version 2.1,
 *  or (at your option) any later version.
 *
 *  librtmp is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with librtmp see the file COPYING.  If not, write to
 *  the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 *  Boston, MA  02110-1301, USA.
 *  http://www.gnu.org/copyleft/lgpl.html
 */
/* result OK */
/* not modified since last request */
/* not found */
/* client error */
/* server reported an error */
/* resource has been moved */
/* connection lost while waiting for data */
public class HTTP_ctx {
	private Byte date;
	private int size;
	private int status;
	private Object data;
	
	public HTTP_ctx(Byte date, int size, int status, Object data) {
		setDate(date);
		setSize(size);
		setStatus(status);
		setData(data);
	}
	public HTTP_ctx() {
	}
	
	public  HTTP_get(Object url, Object cb) {
		byte host;
		byte path;
		byte p1;
		byte p2;
		byte[] hbuf = new byte[256];
		int port = 80;
		int ssl = 0;
		int hlen;
		int flen = 0;
		int rc;
		int i;
		int len_known;
		HTTPResult ret = .HTTPRES_OK;
		sockaddr_in sa = new sockaddr_in();
		RTMPSockBuf sb = new RTMPSockBuf(0);
		this.setStatus(-1);
		.memset(sa, 0, );
		sa.setSin_family(2);
		if (.strncasecmp(url, "http", /* we only handle http here */4)) {
			return .HTTPRES_BAD_REQUEST;
		} 
		if (url[4] == (byte)'s') {
			ssl = 1;
			port = 443;
			if (!ModernizedCProgram.RTMP_TLS_ctx) {
				ModernizedCProgram.RTMP_TLS_Init();
			} 
		} 
		p1 = .strchr(url + 4, (byte)':');
		if (!p1 || .strncmp(p1, "://", 3)) {
			return .HTTPRES_BAD_REQUEST;
		} 
		host = p1 + 3;
		path = .strchr(host, (byte)'/');
		hlen = path - host;
		.strncpy(hbuf, host, hlen);
		hbuf[hlen] = (byte)'\0';
		host = hbuf;
		p1 = .strrchr(host, (byte)':');
		if (p1) {
			p1++ = (byte)'\0';
			port = .atoi(p1);
		} 
		Object generatedSin_addr = sa.getSin_addr();
		generatedSin_addr.getS_un().setS_addr(.inet_addr(host));
		Object generatedH_addr_list = hp.getH_addr_list();
		if (generatedSin_addr.getS_un().getS_addr() == -1024) {
			hostent hp = .gethostbyname(host);
			if (!hp || !generatedH_addr_list[0]) {
				return .HTTPRES_LOST_CONNECTION;
			} 
			sa.setSin_addr((in_addr)generatedH_addr_list[0]);
		} 
		sa.setSin_port(.htons(port));
		sb.setSb_socket(.socket(2, 1, 6));
		Object generatedSb_socket = sb.getSb_socket();
		if (generatedSb_socket == (SOCKET)(~0)) {
			return .HTTPRES_LOST_CONNECTION;
		} 
		Object generatedSb_buf = sb.getSb_buf();
		i = .sprintf(generatedSb_buf, "GET %s HTTP/1.0\r\nUser-Agent: %s\r\nHost: %s\r\nReferer: %.*s\r\n", path, "Mozilla/5.0", host, (int)(path - url + 1), url);
		Byte generatedDate = this.getDate();
		if (generatedDate[0]) {
			i += .sprintf(generatedSb_buf + i, "If-Modified-Since: %s\r\n", generatedDate);
		} 
		i += .sprintf(generatedSb_buf + i, "\r\n");
		if (ModernizedCProgram.connect(generatedSb_socket, (sockaddr)sa, ) < 0) {
			ret = .HTTPRES_LOST_CONNECTION;
			;
		} 
		Object generatedSb_ssl = sb.getSb_ssl();
		if (ssl) {
			sb.setSb_ssl(.SSL_new(ModernizedCProgram.RTMP_TLS_ctx));
			.SSL_set_fd(generatedSb_ssl, generatedSb_socket);
			int connect_return = .SSL_connect(generatedSb_ssl);
			if (connect_return < 0) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s, TLS_Connect failed", __FUNCTION__);
				ret = .HTTPRES_LOST_CONNECTION;
				;
			} 
		} 
		sb.RTMPSockBuf_Send(generatedSb_buf, i/* set timeout */);
		{ 
			int tv = 5 * 1000;
			if (.UNRECOGNIZEDFUNCTIONNAME(generatedSb_socket, -1024, -1024, (byte)(byte)tv, (int))) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s, Setting socket timeout to %ds failed!", __FUNCTION__, 5);
			} 
		}
		sb.setSb_size(0);
		sb.setSb_timedout(0);
		if (sb.RTMPSockBuf_Fill() < 1) {
			ret = .HTTPRES_LOST_CONNECTION;
			;
		} 
		if (.strncmp(generatedSb_buf, "HTTP/1", 6)) {
			ret = .HTTPRES_BAD_REQUEST;
			;
		} 
		p1 = .strchr(generatedSb_buf, (byte)' ');
		rc = .atoi(p1 + 1);
		this.setStatus(rc);
		if (rc >= 300) {
			if (rc == 304) {
				ret = .HTTPRES_OK_NOT_MODIFIED;
				;
			}  else if (rc == 404) {
				ret = .HTTPRES_NOT_FOUND;
			}  else if (rc >= 500) {
				ret = .HTTPRES_SERVER_ERROR;
			}  else if (rc >= 400) {
				ret = .HTTPRES_BAD_REQUEST;
			} else {
					ret = .HTTPRES_REDIRECTED;
			} 
		} 
		int generatedSb_size = sb.getSb_size();
		p1 = .memchr(generatedSb_buf, (byte)'\n', generatedSb_size);
		if (!p1) {
			ret = .HTTPRES_BAD_REQUEST;
			;
		} 
		sb.setSb_start(p1 + 1);
		byte generatedSb_start = sb.getSb_start();
		generatedSb_size -= generatedSb_start - generatedSb_buf;
		while ((p2 = .memchr(generatedSb_start, (byte)'\r', generatedSb_size))) {
			if (generatedSb_start == (byte)'\r') {
				generatedSb_start += 2;
				generatedSb_size -= 2;
				break;
			}  else if (!.strncasecmp(generatedSb_start, "Content-Length: ",  - 1)) {
				flen = .atoi(generatedSb_start +  - 1);
			}  else if (!.strncasecmp(generatedSb_start, "Last-Modified: ",  - 1)) {
				p2 = (byte)'\0';
				.strcpy(generatedDate, generatedSb_start +  - 1);
			} 
			p2 += 2;
			generatedSb_size -= p2 - generatedSb_start;
			sb.setSb_start(p2);
			if (generatedSb_size < 1) {
				if (sb.RTMPSockBuf_Fill() < 1) {
					ret = .HTTPRES_LOST_CONNECTION;
					;
				} 
			} 
		}
		len_known = flen > 0;
		Object generatedData = this.getData();
		int generatedSize = this.getSize();
		while ((!len_known || flen > 0) && (generatedSb_size > 0 || sb.RTMPSockBuf_Fill() > 0)) {
			.cb(generatedSb_start, 1, generatedSb_size, generatedData);
			if (len_known) {
				flen -= generatedSb_size;
			} 
			generatedSize += generatedSb_size;
			sb.setSb_size(0);
		}
		if (flen > 0) {
			ret = .HTTPRES_LOST_CONNECTION;
		} 
		return ret;
	}
	public Byte getDate() {
		return date;
	}
	public void setDate(Byte newDate) {
		date = newDate;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int newStatus) {
		status = newStatus;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
