package application;

public class AMFObject {
	private int o_num;
	private AMFObjectProperty[] o_props;
	
	public AMFObject(int o_num, AMFObjectProperty[] o_props) {
		setO_num(o_num);
		setO_props(o_props);
	}
	public AMFObject() {
	}
	
	public Byte AMF_Encode(Byte pBuffer, Byte pBufEnd) {
		int i;
		if (pBuffer + 4 >= pBufEnd) {
			return ((Object)0);
		} 
		pBuffer++ = .AMF_OBJECT;
		int generatedO_num = this.getO_num();
		AMFObjectProperty[] generatedO_props = this.getO_props();
		for (i = 0; i < generatedO_num; i++) {
			byte res = generatedO_props[i].AMFProp_Encode(pBuffer, pBufEnd);
			if (ModernizedCProgram.res == ((Object)0)) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "AMF_Encode - failed to encode property in index %d", i);
				break;
			} else {
					pBuffer = ModernizedCProgram.res;
			} 
		}
		if (pBuffer + 3 >= pBufEnd) {
			return ((Object)/* no room for the end marker */0);
		} 
		pBuffer = ModernizedCProgram.AMF_EncodeInt24(pBuffer, pBufEnd, .AMF_OBJECT_END);
		return pBuffer;
	}
	public Byte AMF_EncodeEcmaArray(Byte pBuffer, Byte pBufEnd) {
		int i;
		if (pBuffer + 4 >= pBufEnd) {
			return ((Object)0);
		} 
		pBuffer++ = .AMF_ECMA_ARRAY;
		int generatedO_num = this.getO_num();
		pBuffer = ModernizedCProgram.AMF_EncodeInt32(pBuffer, pBufEnd, generatedO_num);
		AMFObjectProperty[] generatedO_props = this.getO_props();
		for (i = 0; i < generatedO_num; i++) {
			byte res = generatedO_props[i].AMFProp_Encode(pBuffer, pBufEnd);
			if (ModernizedCProgram.res == ((Object)0)) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "AMF_Encode - failed to encode property in index %d", i);
				break;
			} else {
					pBuffer = ModernizedCProgram.res;
			} 
		}
		if (pBuffer + 3 >= pBufEnd) {
			return ((Object)/* no room for the end marker */0);
		} 
		pBuffer = ModernizedCProgram.AMF_EncodeInt24(pBuffer, pBufEnd, .AMF_OBJECT_END);
		return pBuffer;
	}
	public Byte AMF_EncodeArray(Byte pBuffer, Byte pBufEnd) {
		int i;
		if (pBuffer + 4 >= pBufEnd) {
			return ((Object)0);
		} 
		pBuffer++ = .AMF_STRICT_ARRAY;
		int generatedO_num = this.getO_num();
		pBuffer = ModernizedCProgram.AMF_EncodeInt32(pBuffer, pBufEnd, generatedO_num);
		AMFObjectProperty[] generatedO_props = this.getO_props();
		for (i = 0; i < generatedO_num; i++) {
			byte res = generatedO_props[i].AMFProp_Encode(pBuffer, pBufEnd);
			if (ModernizedCProgram.res == ((Object)0)) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "AMF_Encode - failed to encode property in index %d", i);
				break;
			} else {
					pBuffer = ModernizedCProgram.res;
			} 
		}
		//  return NULL;			/* no room for the end marker *///pBuffer = AMF_EncodeInt24(pBuffer, pBufEnd, AMF_OBJECT_END);return pBuffer;
	}
	public int AMF_DecodeArray(Object pBuffer, int nSize, int nArrayLen, int bDecodeName) {
		int nOriginalSize = nSize;
		int bError = 0;
		this.setO_num(0);
		this.setO_props(((Object)0));
		while (nArrayLen > 0) {
			AMFObjectProperty prop = new AMFObjectProperty();
			int nRes;
			nArrayLen--;
			if (nSize <= 0) {
				bError = 1;
				break;
			} 
			nRes = prop.AMFProp_Decode(pBuffer, nSize, bDecodeName);
			if (nRes == -1) {
				bError = 1;
				break;
			} else {
					nSize -= nRes;
					pBuffer += nRes;
					obj.AMF_AddProp(prop);
			} 
		}
		if (bError) {
			return -1;
		} 
		return nOriginalSize - nSize;
	}
	public int AMF3_Decode(Object pBuffer, int nSize, int bAMFData) {
		int nOriginalSize = nSize;
		int32_t ref = new int32_t();
		int len;
		this.setO_num(0);
		this.setO_props(((Object)0));
		if (bAMFData) {
			if (pBuffer != .AMF3_OBJECT) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "AMF3 Object encapsulated in AMF stream does not start with AMF3_OBJECT!");
			} 
			pBuffer++;
			nSize--;
		} 
		ref = 0;
		len = ModernizedCProgram.AMF3ReadInteger(pBuffer, ref);
		pBuffer += len;
		nSize -= len;
		AVal generatedCd_name = cd.getCd_name();
		byte[] generatedAv_val = generatedCd_name.getAv_val();
		byte generatedCd_externalizable = cd.getCd_externalizable();
		byte generatedCd_dynamic = cd.getCd_dynamic();
		int generatedCd_num = cd.getCd_num();
		return nOriginalSize - nSize;
	}
	public int AMF_Decode(Object pBuffer, int nSize, int bDecodeName) {
		int nOriginalSize = nSize;
		int bError = /* if there is an error while decoding - try to at least find the end mark AMF_OBJECT_END */0;
		this.setO_num(0);
		this.setO_props(((Object)0));
		while (nSize > 0) {
			AMFObjectProperty prop = new AMFObjectProperty();
			int nRes;
			if (nSize >= 3 && ModernizedCProgram.AMF_DecodeInt24(pBuffer) == .AMF_OBJECT_END) {
				nSize -= 3;
				bError = 0;
				break;
			} 
			if (bError) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "DECODING ERROR, IGNORING BYTES UNTIL NEXT KNOWN PATTERN!");
				nSize--;
				pBuffer++;
				continue;
			} 
			nRes = prop.AMFProp_Decode(pBuffer, nSize, bDecodeName);
			if (nRes == -1) {
				bError = 1;
				break;
			} else {
					nSize -= nRes;
					if (nSize < 0) {
						bError = 1;
						break;
					} 
					pBuffer += nRes;
					obj.AMF_AddProp(prop);
			} 
		}
		if (bError) {
			return -1;
		} 
		return nOriginalSize - nSize;
	}
	public void AMF_AddProp(Object prop) {
		int generatedO_num = this.getO_num();
		AMFObjectProperty[] generatedO_props = this.getO_props();
		if (!(generatedO_num & -1024)) {
			this.setO_props(/*Error: Function owner not recognized*/realloc(generatedO_props, (generatedO_num + 16) * /*Error: Unsupported expression*/));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedO_props[generatedO_num++], prop, /*Error: Unsupported expression*/);
	}
	public int AMF_CountProp() {
		int generatedO_num = this.getO_num();
		return generatedO_num;
	}
	public void AMF_Dump() {
		int n;
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "(object begin)");
		int generatedO_num = this.getO_num();
		AMFObjectProperty[] generatedO_props = this.getO_props();
		for (n = 0; n < generatedO_num; n++) {
			generatedO_props[n].AMFProp_Dump();
		}
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "(object end)");
	}
	public void AMF_Reset() {
		int n;
		int generatedO_num = this.getO_num();
		AMFObjectProperty[] generatedO_props = this.getO_props();
		for (n = 0; n < generatedO_num; n++) {
			generatedO_props[n].AMFProp_Reset();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedO_props);
		this.setO_props(((Object)0));
		this.setO_num(0);
	}
	public int DumpMetaData() {
		AMFObjectProperty prop = new AMFObjectProperty();
		int n;
		int len;
		int generatedO_num = this.getO_num();
		AMFObjectProperty aMFObjectProperty = new AMFObjectProperty();
		AVal generatedP_name = prop.getP_name();
		int generatedAv_len = generatedP_name.getAv_len();
		byte[] generatedAv_val = generatedP_name.getAv_val();
		 generatedP_vu = prop.getP_vu();
		Object generatedP_object = generatedP_vu.getP_object();
		Object generatedP_number = generatedP_vu.getP_number();
		 generatedP_type = prop.getP_type();
		for (n = 0; n < generatedO_num; n++) {
			byte[] str = "";
			prop = aMFObjectProperty.AMF_GetProp(obj, ((Object)0), n);
			switch (generatedP_type) {
			case .AMF_BOOLEAN:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(str, 255, "%s", generatedP_number != 0.0 ? "TRUE" : "FALSE");
					break;
			case .AMF_STRICT_ARRAY:
					if (generatedAv_len) {
						ModernizedCProgram.RTMP_Log(.RTMP_LOGINFO, "%.*s:", generatedAv_len, generatedAv_val);
					} 
					generatedP_object.DumpMetaData();
					break;
			case .AMF_OBJECT:
			case .AMF_NUMBER:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(str, 255, "%.2f", generatedP_number);
					break;
			case .AMF_ECMA_ARRAY:
			case .AMF_DATE:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(str, 255, "timestamp:%.2f", generatedP_number);
					break;
			case .AMF_STRING:
					len = /*Error: Function owner not recognized*/snprintf(str, 255, "%.*s", generatedAv_len, generatedAv_val);
					if (len >= 1 && str[len - 1] == (byte)'\n') {
						str[len - 1] = (byte)'\0';
					} 
					break;
			default:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(str, 255, "INVALID TYPE 0x%02x", (byte)generatedP_type);
			}
			if (str[0] && generatedAv_len) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGINFO, "  %-22.*s%s", generatedAv_len, generatedAv_val, str);
			} 
		}
		return 0;
	}
	public int getO_num() {
		return o_num;
	}
	public void setO_num(int newO_num) {
		o_num = newO_num;
	}
	public AMFObjectProperty[] getO_props() {
		return o_props;
	}
	public void setO_props(AMFObjectProperty[] newO_props) {
		o_props = newO_props;
	}
}
