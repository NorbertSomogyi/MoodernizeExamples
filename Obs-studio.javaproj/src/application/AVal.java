package application;

public class AVal {
	private Byte av_val;
	private int av_len;
	
	public AVal(Byte av_val, int av_len) {
		setAv_val(av_val);
		setAv_len(av_len);
	}
	public AVal() {
	}
	
	/*
	 *  Copyright (C) 2009 Andrej Stepanchuk
	 *  Copyright (C) 2009-2010 Howard Chu
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
	public int RTMP_ParseURL(Object url, int protocol, int port, AVal app) {
		/* *ques, */byte p;
		byte end;
		byte col;
		byte slash;
		byte v6;
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Parsing...");
		protocol = 0;
		port = 0;
		app.setAv_len(0);
		app.setAv_val(((Object)0/* Old School Parsing */));
		p = .strstr(url, /* look for usual :// pattern */"://");
		if (!p) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "RTMP URL: No :// in url!");
			return 0;
		} 
		{ 
			int len = (int)(p - url);
			if (len == 4 && .strncasecmp(url, "rtmp", 4) == 0) {
				protocol = 0;
			}  else if (len == 5 && .strncasecmp(url, "rtmpt", 5) == 0) {
				protocol = -1024;
			}  else if (len == 5 && .strncasecmp(url, "rtmps", 5) == 0) {
				protocol = -1024;
			}  else if (len == 5 && .strncasecmp(url, "rtmpe", 5) == 0) {
				protocol = -1024;
			}  else if (len == 5 && .strncasecmp(url, "rtmfp", 5) == 0) {
				protocol = -1024;
			}  else if (len == 6 && .strncasecmp(url, "rtmpte", 6) == 0) {
				protocol = (-1024 | -1024);
			}  else if (len == 6 && .strncasecmp(url, "rtmpts", 6) == 0) {
				protocol = (-1024 | -1024);
			} else {
					ModernizedCProgram.RTMP_Log(.RTMP_LOGWARNING, "Unknown protocol!\n");
					;
			} 
		}
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Parsed protocol: %d", protocol);
		if (p == /* check for sudden death */0) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGWARNING, "No hostname in URL!");
			return 0;
		} 
		end = p + .strlen(p);
		v6 = .strchr(p, (byte)']')// ques  = strchr(p, '?');;// ques  = strchr(p, '?');
		slash = .strchr(p, (byte)'/');
		col = .strchr((v6 && v6 < slash) ? v6 : p, (byte)':');
		Byte generatedAv_val = this.getAv_val();
		{ 
			int hostlen;
			if (slash) {
				hostlen = slash - p;
			} else {
					hostlen = end - p;
			} 
			if (col && col - p < hostlen) {
				hostlen = col - p;
			} 
			if (hostlen < 256) {
				this.setAv_val(p);
				this.setAv_len(hostlen);
				ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Parsed host    : %.*s", hostlen, generatedAv_val);
			} else {
					ModernizedCProgram.RTMP_Log(.RTMP_LOGWARNING, "Hostname exceeds 255 characters!");
			} 
			p += hostlen;
		}
		if (p == /* get the port number if available */(byte)':') {
			int p2;
			p++;
			p2 = .atoi(p);
			if (p2 > 65535) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGWARNING, "Invalid port number!");
			} else {
					port = p2;
			} 
		} 
		if (!slash) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGWARNING, "No application or playpath in URL!");
			return 1;
		} 
		p = slash + 1;
		//just..  whatever.//just..  whatever.app.setAv_val(p);
		app.setAv_len((int).strlen(p));
		int generatedAv_len = app.getAv_len();
		if (generatedAv_len && p[generatedAv_len - 1] == (byte)'/') {
			generatedAv_len--;
		} 
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Parsed app     : %.*s", generatedAv_len, p);
		p += generatedAv_len;
		if (p == (byte)'/') {
			p++;
		} 
		return 1/*
		 * Extracts playpath from RTMP URL. playpath is the file part of the
		 * URL, i.e. the part that comes after rtmp://host:port/app/
		 *
		 * Returns the stream name in a format understood by FMS. The name is
		 * the playpath part of the URL with formatting depending on the stream
		 * type:
		 *
		 * mp4 streams: prepend "mp4:", remove extension
		 * mp3 streams: prepend "mp3:", remove extension
		 * flv streams: remove extension
		 */;
	}
	public void RTMP_ParsePlaypath(AVal out) {
		int addMP4 = 0;
		int addMP3 = 0;
		int subExt = 0;
		Byte generatedAv_val = this.getAv_val();
		byte playpath = generatedAv_val;
		byte temp;
		byte q;
		byte ext = ((Object)0);
		byte ppstart = playpath;
		byte streamname;
		byte destptr;
		byte p;
		int generatedAv_len = this.getAv_len();
		int pplen = generatedAv_len;
		out.setAv_val(((Object)0));
		out.setAv_len(0);
		if (!playpath) {
			return ;
		} 
		if ((ppstart == (byte)'?') && (temp = .strstr(ppstart, "slist=")) != 0) {
			ppstart = temp + 6;
			pplen = (int).strlen(ppstart);
			temp = .strchr(ppstart, (byte)'&');
			if (temp) {
				pplen = temp - ppstart;
			} 
		} 
		q = .strchr(ppstart, (byte)'?');
		if (pplen >= 4) {
			if (q) {
				ext = q - 4;
			} else {
					ext = ppstart[pplen - 4];
			} 
			if ((.strncmp(ext, ".f4v", 4) == 0) || (.strncmp(ext, ".mp4", 4) == 0)) {
				addMP4 = 1;
				subExt = 1/* Only remove .flv from rtmp URL, not slist params */;
			}  else if ((ppstart == playpath) && (.strncmp(ext, ".flv", 4) == 0)) {
				subExt = 1;
			}  else if (.strncmp(ext, ".mp3", 4) == 0) {
				addMP3 = 1;
				subExt = 1;
			} 
		} 
		streamname = (byte).malloc((pplen + 4 + 1) * );
		if (!streamname) {
			return ;
		} 
		destptr = streamname;
		if (addMP4) {
			if (.strncmp(ppstart, "mp4:", 4)) {
				.strcpy(destptr, "mp4:");
				destptr += 4;
			} else {
					subExt = 0;
			} 
		}  else if (addMP3) {
			if (.strncmp(ppstart, "mp3:", 4)) {
				.strcpy(destptr, "mp3:");
				destptr += 4;
			} else {
					subExt = 0;
			} 
		} 
		for (p = (byte)ppstart; pplen > 0; ) {
			if (subExt && p == /* skip extension */ext) {
				p += 4;
				pplen -= 4;
				continue;
			} 
			if (p == (byte)'%') {
				int c;
				.sscanf(p + 1, "%02x", c);
				destptr++ = c;
				pplen -= 3;
				p += 3;
			} else {
					destptr++ = p++;
					pplen--;
			} 
		}
		destptr = (byte)'\0';
		out.setAv_val(streamname);
		out.setAv_len(destptr - streamname);
	}
	public void AMF_DecodeString(Object data) {
		this.setAv_len(ModernizedCProgram.AMF_DecodeInt16(data));
		int generatedAv_len = this.getAv_len();
		this.setAv_val((generatedAv_len > 0) ? (byte)data + 2 : ((Object)0));
	}
	public void AMF_DecodeLongString(Object data) {
		this.setAv_len(ModernizedCProgram.AMF_DecodeInt32(data));
		int generatedAv_len = this.getAv_len();
		this.setAv_val((generatedAv_len > 0) ? (byte)data + 4 : ((Object)0));
	}
	public int AMF3ReadString(Object data) {
		int32_t ref = 0;
		int len;
		((str != 0) ? (Object)0 : ._assert("str != 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\amf.c", 470));
		len = ModernizedCProgram.AMF3ReadInteger(data, ref);
		data += len;
		if ((ref & -1024) == 0) {
			uint32_t refIndex = (ref >> /* reference: 0xxx */1);
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s, string reference, index: %d, not supported, ignoring!", __FUNCTION__, refIndex);
			this.setAv_val(((Object)0));
			this.setAv_len(0);
			return len;
		} else {
				uint32_t nSize = (ref >> 1);
				this.setAv_val((byte)data);
				this.setAv_len(nSize);
				return len + nSize;
		} 
		return len;
	}
	public AVal AMF3CD_GetProp(AMF3ClassDef cd, int nIndex) {
		int generatedCd_num = cd.getCd_num();
		if (nIndex >= generatedCd_num) {
			return (AVal)ModernizedCProgram.AV_empty;
		} 
		AVal generatedCd_props = cd.getCd_props();
		return generatedCd_props[nIndex];
	}
	public Byte AValChr(byte c) {
		int i;
		int generatedAv_len = this.getAv_len();
		Byte generatedAv_val = this.getAv_val();
		for (i = 0; i < generatedAv_len; i++) {
			if (generatedAv_val[i] == c) {
				return generatedAv_val[i];
			} 
		}
		return ((Object)0);
	}
	public void DecodeTEA(AVal text) {
		uint32_t v = new uint32_t();
		uint32_t[] k = new uint32_t[]{0};
		uint32_t u = new uint32_t();
		uint32_t z = new uint32_t();
		uint32_t y = new uint32_t();
		uint32_t sum = 0;
		uint32_t e = new uint32_t();
		uint32_t DELTA = -1024;
		int32_t p = new int32_t();
		int32_t q = new int32_t();
		int i;
		int n;
		byte ptr;
		byte out;
		ptr = (byte)ModernizedCProgram.key.getAv_val();
		u = 0;
		n = 0;
		v = k;
		p = ModernizedCProgram.key.getAv_len() > 16 ? 16 : ModernizedCProgram.key.getAv_len();
		for (i = 0; i < p; i++) {
			u |=  ptr[i] << (n * 8);
			if (n == 3) {
				v++ = u;
				u = 0;
				n = 0;
			} else {
					n++;
			} 
		}
		if (/* any trailing chars */u) {
			v = u;
		} 
		int generatedAv_len = text.getAv_len();
		n = (generatedAv_len + 7) / /* prep text: hex2bin, multiples of 4 */8;
		out = .malloc(n * 8);
		Byte generatedAv_val = text.getAv_val();
		ptr = (byte)generatedAv_val;
		v = (uint32_t)out;
		for (i = 0; i < n; i++) {
			u = ((((ptr[0]) & -1024) ? ((ptr[0]) & -1024) + 9 : ((ptr[0]) & -1024)) << 4) + (((ptr[1]) & -1024) ? ((ptr[1]) & -1024) + 9 : ((ptr[1]) & -1024));
			u |=  (((((ptr[2]) & -1024) ? ((ptr[2]) & -1024) + 9 : ((ptr[2]) & -1024)) << 4) + (((ptr[3]) & -1024) ? ((ptr[3]) & -1024) + 9 : ((ptr[3]) & -1024))) << 8;
			u |=  (((((ptr[4]) & -1024) ? ((ptr[4]) & -1024) + 9 : ((ptr[4]) & -1024)) << 4) + (((ptr[5]) & -1024) ? ((ptr[5]) & -1024) + 9 : ((ptr[5]) & -1024))) << 16;
			u |=  (((((ptr[6]) & -1024) ? ((ptr[6]) & -1024) + 9 : ((ptr[6]) & -1024)) << 4) + (((ptr[7]) & -1024) ? ((ptr[7]) & -1024) + 9 : ((ptr[7]) & -1024))) << 24;
			v++ = u;
			ptr += 8;
		}
		v = (uint32_t)out;
		z = v[n - /* http://www.movable-type.co.uk/scripts/tea-block.html */1];
		y = v[0];
		q = 6 + 52 / n;
		sum = q * DELTA;
		while (sum != 0) {
			e = sum >> 2 & 3;
			for (p = n - 1; p > 0; p--) {
				;
			}
			;
			z = v[n - 1];
			y = v[0] -= (((z >> 5) ^ (y << 2)) + ((y >> 3) ^ (z << 4))) ^ ((sum ^ y) + (k[(p & 3) ^ e] ^ z));
			;
			sum -= DELTA;
		}
		generatedAv_len /= 2;
		.memcpy(generatedAv_val, out, generatedAv_len);
		.free(out);
	}
	public Byte getAv_val() {
		return av_val;
	}
	public void setAv_val(Byte newAv_val) {
		av_val = newAv_val;
	}
	public int getAv_len() {
		return av_len;
	}
	public void setAv_len(int newAv_len) {
		av_len = newAv_len;
	}
}
