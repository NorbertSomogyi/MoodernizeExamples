package application;

public class AMFObjectProperty {
	private AVal p_name;
	private  p_type;
	private  p_vu;
	private Object p_UTCoffset;
	
	public AMFObjectProperty(AVal p_name,  p_type,  p_vu, Object p_UTCoffset) {
		setP_name(p_name);
		setP_type(p_type);
		setP_vu(p_vu);
		setP_UTCoffset(p_UTCoffset);
	}
	public AMFObjectProperty() {
	}
	
	public  AMFProp_GetType() {
		 generatedP_type = this.getP_type();
		return generatedP_type;
	}
	public double AMFProp_GetNumber() {
		 generatedP_vu = this.getP_vu();
		Object generatedP_number = generatedP_vu.getP_number();
		return generatedP_number;
	}
	public int AMFProp_GetBoolean() {
		 generatedP_vu = this.getP_vu();
		Object generatedP_number = generatedP_vu.getP_number();
		return generatedP_number != 0;
	}
	public int AMFProp_IsValid() {
		 generatedP_type = this.getP_type();
		return generatedP_type != .AMF_INVALID;
	}
	public Byte AMFProp_Encode(byte pBuffer, Byte pBufEnd) {
		 generatedP_type = this.getP_type();
		if (generatedP_type == .AMF_INVALID) {
			return ((Object)0);
		} 
		AVal generatedP_name = this.getP_name();
		int generatedAv_len = generatedP_name.getAv_len();
		if (generatedP_type != .AMF_NULL && pBuffer + generatedAv_len + 2 + 1 >= pBufEnd) {
			return ((Object)0);
		} 
		Byte generatedAv_val = generatedP_name.getAv_val();
		if (generatedP_type != .AMF_NULL && generatedAv_len) {
			pBuffer++ = generatedAv_len >> 8;
			pBuffer++ = generatedAv_len & -1024;
			.memcpy(pBuffer, generatedAv_val, generatedAv_len);
			pBuffer += generatedAv_len;
		} 
		 generatedP_vu = this.getP_vu();
		Object generatedP_number = generatedP_vu.getP_number();
		Object generatedP_aval = generatedP_vu.getP_aval();
		Object generatedP_object = generatedP_vu.getP_object();
		switch (generatedP_type) {
		case .AMF_ECMA_ARRAY:
				pBuffer = generatedP_object.AMF_EncodeEcmaArray(pBuffer, pBufEnd);
				break;
		case .AMF_OBJECT:
				pBuffer = generatedP_object.AMF_Encode(pBuffer, pBufEnd);
				break;
		case .AMF_NUMBER:
				pBuffer = ModernizedCProgram.AMF_EncodeNumber(pBuffer, pBufEnd, generatedP_number);
				break;
		case .AMF_BOOLEAN:
				pBuffer = ModernizedCProgram.AMF_EncodeBoolean(pBuffer, pBufEnd, generatedP_number != 0);
				break;
		case .AMF_STRING:
				pBuffer = ModernizedCProgram.AMF_EncodeString(pBuffer, pBufEnd, generatedP_aval);
				break;
		case .AMF_NULL:
				if (pBuffer + 1 >= pBufEnd) {
					return ((Object)0);
				} 
				pBuffer++ = .AMF_NULL;
				break;
		case .AMF_STRICT_ARRAY:
				pBuffer = generatedP_object.AMF_EncodeArray(pBuffer, pBufEnd);
				break;
		default:
				ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "%s, invalid type. %d", __FUNCTION__, generatedP_type);
				pBuffer = ((Object)0);
		}
		;
		return pBuffer;
	}
	public int AMF3Prop_Decode(Object pBuffer, int nSize, int bDecodeName) {
		int nOriginalSize = nSize;
		AMF3DataType type = new AMF3DataType();
		AVal generatedP_name = this.getP_name();
		generatedP_name.setAv_len(0);
		generatedP_name.setAv_val(((Object)0));
		if (nSize == 0 || !pBuffer) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "empty buffer/no buffer pointer!");
			return -1;
		} 
		int generatedAv_len = name.getAv_len();
		if (/* decode name */bDecodeName) {
			AVal name = ModernizedCProgram.AV_empty;
			int nRes = name.AMF3ReadString(pBuffer);
			if (generatedAv_len <= 0) {
				return nRes;
			} 
			nSize -= nRes;
			if (nSize <= 0) {
				return -1;
			} 
			this.setP_name(name);
			pBuffer += nRes;
		} 
		type = /* decode */pBuffer++;
		nSize--;
		 generatedP_vu = this.getP_vu();
		Object generatedP_aval = generatedP_vu.getP_aval();
		Object generatedP_object = generatedP_vu.getP_object();
		switch (type) {
		case .AMF3_XML:
				{ 
					int len = generatedP_aval.AMF3ReadString(pBuffer);
					this.setP_type(.AMF_STRING);
					nSize -= len;
					break;
				}
		case .AMF3_ARRAY:
		case .AMF3_UNDEFINED:
		case .AMF3_TRUE:
				this.setP_type(.AMF_BOOLEAN);
				generatedP_vu.setP_number(1.0);
				break;
		case .AMF3_DATE:
				{ 
					int32_t res = 0;
					int len = ModernizedCProgram.AMF3ReadInteger(pBuffer, ModernizedCProgram.res);
					nSize -= len;
					pBuffer += len;
					if ((ModernizedCProgram.res & -1024) == 0) {
						uint32_t nIndex = (ModernizedCProgram.res >> /* reference */1);
						ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "AMF3_DATE reference: %d, not supported!", nIndex);
					} else {
							if (nSize < 8) {
								return -1;
							} 
							generatedP_vu.setP_number(ModernizedCProgram.AMF_DecodeNumber(pBuffer));
							nSize -= 8;
							this.setP_type(.AMF_NUMBER);
					} 
					break;
				}
		case .AMF3_DOUBLE:
				if (nSize < 8) {
					return -1;
				} 
				generatedP_vu.setP_number(ModernizedCProgram.AMF_DecodeNumber(pBuffer));
				this.setP_type(.AMF_NUMBER);
				nSize -= 8;
				break;
		case .AMF3_FALSE:
				this.setP_type(.AMF_BOOLEAN);
				generatedP_vu.setP_number(0.0);
				break;
		case .AMF3_NULL:
				this.setP_type(.AMF_NULL);
				break;
		case .AMF3_INTEGER:
				{ 
					int32_t res = 0;
					int len = ModernizedCProgram.AMF3ReadInteger(pBuffer, ModernizedCProgram.res);
					generatedP_vu.setP_number((double)ModernizedCProgram.res);
					this.setP_type(.AMF_NUMBER);
					nSize -= len;
					break;
				}
		case .AMF3_OBJECT:
				{ 
					int nRes = generatedP_object.AMF3_Decode(pBuffer, nSize, 1);
					if (nRes == -1) {
						return -1;
					} 
					nSize -= nRes;
					this.setP_type(.AMF_OBJECT);
					break;
				}
		case .AMF3_STRING:
		case .AMF3_XML_DOC:
		case .AMF3_BYTE_ARRAY:
		default:
				ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s - AMF3 unknown/unsupported datatype 0x%02x, @%p", __FUNCTION__, (byte)(pBuffer), pBuffer);
				return -1;
		}
		if (nSize < 0) {
			return -1;
		} 
		return nOriginalSize - nSize;
	}
	public int AMFProp_Decode(Object pBuffer, int nSize, int bDecodeName) {
		int nOriginalSize = nSize;
		int nRes;
		AVal generatedP_name = this.getP_name();
		generatedP_name.setAv_len(0);
		generatedP_name.setAv_val(((Object)0));
		if (nSize == 0 || !pBuffer) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s: Empty buffer/no buffer pointer!", __FUNCTION__);
			return -1;
		} 
		if (bDecodeName && nSize < 4) {
			ModernizedCProgram.RTMP_Log(/* at least name (length + at least 1 byte) and 1 byte of data */.RTMP_LOGDEBUG, "%s: Not enough data for decoding with name, less than 4 bytes!", __FUNCTION__);
			return -1;
		} 
		if (bDecodeName) {
			int nNameSize = ModernizedCProgram.AMF_DecodeInt16(pBuffer);
			if (nNameSize > nSize - 2) {
				ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s: Name size out of range: namesize (%d) > len (%d) - 2", __FUNCTION__, nNameSize, nSize);
				return -1;
			} 
			generatedP_name.AMF_DecodeString(pBuffer);
			nSize -= 2 + nNameSize;
			pBuffer += 2 + nNameSize;
		} 
		if (nSize == 0) {
			return -1;
		} 
		nSize--;
		this.setP_type(pBuffer++);
		 generatedP_vu = this.getP_vu();
		Object generatedP_aval = generatedP_vu.getP_aval();
		Object generatedP_object = generatedP_vu.getP_object();
		 generatedP_type = this.getP_type();
		switch (generatedP_type) {
		case .AMF_STRICT_ARRAY:
				{ 
					int nArrayLen = ModernizedCProgram.AMF_DecodeInt32(pBuffer);
					nSize -= 4;
					nRes = generatedP_object.AMF_DecodeArray(pBuffer + 4, nSize, nArrayLen, 0);
					if (nRes == -1) {
						return -1;
					} 
					nSize -= nRes;
					break;
				}
		case .AMF_STRING:
				{ 
					int nStringSize = ModernizedCProgram.AMF_DecodeInt16(pBuffer);
					if (nSize < (long)nStringSize + 2) {
						return -1;
					} 
					generatedP_aval.AMF_DecodeString(pBuffer);
					nSize -= (2 + nStringSize);
					break;
				}
		case .AMF_NULL:
		case .AMF_TYPED_OBJECT:
				{ 
					ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "AMF_TYPED_OBJECT not supported!");
					return -1;
					break;
				}
		case .AMF_BOOLEAN:
				if (nSize < 1) {
					return -1;
				} 
				generatedP_vu.setP_number((double)ModernizedCProgram.AMF_DecodeBoolean(pBuffer));
				nSize--;
				break;
		case .AMF_UNSUPPORTED:
				this.setP_type(.AMF_NULL);
				break;
		case .AMF_ECMA_ARRAY:
				{ 
					nSize -= 4;
					nRes = generatedP_object.AMF_Decode(pBuffer + 4, nSize, /* next comes the rest, mixed array has a final 0x000009 mark and names, so its an object */1);
					if (nRes == -1) {
						return -1;
					} 
					nSize -= nRes;
					break;
				}
		case .AMF_LONG_STRING:
		case .AMF_XML_DOC:
				{ 
					int nStringSize = ModernizedCProgram.AMF_DecodeInt32(pBuffer);
					if (nSize < (long)nStringSize + 4) {
						return -1;
					} 
					generatedP_aval.AMF_DecodeLongString(pBuffer);
					nSize -= (4 + nStringSize);
					if (generatedP_type == .AMF_LONG_STRING) {
						this.setP_type(.AMF_STRING);
					} 
					break;
				}
		case .AMF_UNDEFINED:
		case .AMF_DATE:
				{ 
					ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "AMF_DATE");
					if (nSize < 10) {
						return -1;
					} 
					generatedP_vu.setP_number(ModernizedCProgram.AMF_DecodeNumber(pBuffer));
					this.setP_UTCoffset(ModernizedCProgram.AMF_DecodeInt16(pBuffer + 8));
					nSize -= 10;
					break;
				}
		case .AMF_RECORDSET:
				{ 
					ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "AMF_RECORDSET reserved!");
					return -1;
					break;
				}
		case .AMF_AVMPLUS:
				{ 
					int nRes = generatedP_object.AMF3_Decode(pBuffer, nSize, 1);
					if (nRes == -1) {
						return -1;
					} 
					nSize -= nRes;
					this.setP_type(.AMF_OBJECT);
					break;
				}
		case .AMF_OBJECT:
				{ 
					int nRes = generatedP_object.AMF_Decode(pBuffer, nSize, 1);
					if (nRes == -1) {
						return -1;
					} 
					nSize -= nRes;
					break;
				}
		case .AMF_REFERENCE:
				{ 
					ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "AMF_REFERENCE not supported!");
					return -1;
					break;
				}
		case .AMF_NUMBER:
				if (nSize < 8) {
					return -1;
				} 
				generatedP_vu.setP_number(ModernizedCProgram.AMF_DecodeNumber(pBuffer));
				nSize -= 8;
				break;
		case .AMF_OBJECT_END:
				{ 
					return -1;
					break;
				}
		case .AMF_MOVIECLIP:
				{ 
					ModernizedCProgram.RTMP_Log(.RTMP_LOGERROR, "AMF_MOVIECLIP reserved!");
					return -1;
					break;
				}
		default:
				ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "%s - unknown datatype 0x%02x, @%p", __FUNCTION__, generatedP_type, pBuffer - 1);
				return -1;
		}
		return nOriginalSize - nSize;
	}
	public void AMFProp_Dump() {
		byte[] strRes = new byte[256];
		byte[] str = new byte[256];
		AVal name = new AVal();
		 generatedP_type = this.getP_type();
		if (generatedP_type == .AMF_INVALID) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Property: INVALID");
			return ;
		} 
		if (generatedP_type == .AMF_NULL) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Property: NULL");
			return ;
		} 
		AVal generatedP_name = this.getP_name();
		int generatedAv_len = generatedP_name.getAv_len();
		if (generatedAv_len) {
			name = generatedP_name;
		} else {
				name.setAv_val("no-name.");
				name.setAv_len( - 1);
		} 
		if (generatedAv_len > 18) {
			name.setAv_len(18);
		} 
		Byte generatedAv_val = name.getAv_val();
		.snprintf(strRes, 255, "Name: %18.*s, ", generatedAv_len, generatedAv_val);
		 generatedP_vu = this.getP_vu();
		Object generatedP_object = generatedP_vu.getP_object();
		if (generatedP_type == .AMF_OBJECT) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Property: <%sOBJECT>", strRes);
			generatedP_object.AMF_Dump();
			return ;
		}  else if (generatedP_type == .AMF_ECMA_ARRAY) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Property: <%sECMA_ARRAY>", strRes);
			generatedP_object.AMF_Dump();
			return ;
		}  else if (generatedP_type == .AMF_STRICT_ARRAY) {
			ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Property: <%sSTRICT_ARRAY>", strRes);
			generatedP_object.AMF_Dump();
			return ;
		} 
		Object generatedP_number = generatedP_vu.getP_number();
		Object generatedP_UTCoffset = this.getP_UTCoffset();
		switch (generatedP_type) {
		case .AMF_BOOLEAN:
				.snprintf(str, 255, "BOOLEAN:\t%s", generatedP_number != 0.0 ? "TRUE" : "FALSE");
				break;
		case .AMF_NUMBER:
				.snprintf(str, 255, "NUMBER:\t%.2f", generatedP_number);
				break;
		case .AMF_DATE:
				.snprintf(str, 255, "DATE:\ttimestamp: %.2f, UTC offset: %d", generatedP_number, generatedP_UTCoffset);
				break;
		case .AMF_STRING:
				.snprintf(str, 255, "STRING:\t%.*s", generatedAv_len, generatedAv_val);
				break;
		default:
				.snprintf(str, 255, "INVALID TYPE 0x%02x", (byte)generatedP_type);
		}
		ModernizedCProgram.RTMP_Log(.RTMP_LOGDEBUG, "Property: <%s%s>", strRes, str);
	}
	public void AMFProp_Reset() {
		 generatedP_type = this.getP_type();
		 generatedP_vu = this.getP_vu();
		Object generatedP_object = generatedP_vu.getP_object();
		Object generatedP_aval = generatedP_vu.getP_aval();
		if (generatedP_type == .AMF_OBJECT || generatedP_type == .AMF_ECMA_ARRAY || generatedP_type == .AMF_STRICT_ARRAY) {
			generatedP_object.AMF_Reset();
		} else {
				generatedP_aval.setAv_len(0);
				generatedP_aval.setAv_val(((Object)0));
		} 
		this.setP_type(.AMF_INVALID/* AMFObject */);
	}
	public AMFObjectProperty AMF_GetProp(AMFObject obj, Object name, int nIndex) {
		int generatedO_num = obj.getO_num();
		AMFObjectProperty generatedO_props = obj.getO_props();
		if (nIndex >= 0) {
			if (nIndex < generatedO_num) {
				return generatedO_props[nIndex];
			} 
		} else {
				int n;
				for (n = 0; n < generatedO_num; n++) {
					if (((generatedO_props[n].getP_name()).getAv_len() == (name).getAv_len() && !.memcmp((generatedO_props[n].getP_name()).getAv_val(), (name).getAv_val(), (generatedO_props[n].getP_name()).getAv_len()))) {
						return generatedO_props[n];
					} 
				}
		} 
		return (AMFObjectProperty)ModernizedCProgram.AMFProp_Invalid;
	}
	public AVal getP_name() {
		return p_name;
	}
	public void setP_name(AVal newP_name) {
		p_name = newP_name;
	}
	public  getP_type() {
		return p_type;
	}
	public void setP_type( newP_type) {
		p_type = newP_type;
	}
	public  getP_vu() {
		return p_vu;
	}
	public void setP_vu( newP_vu) {
		p_vu = newP_vu;
	}
	public Object getP_UTCoffset() {
		return p_UTCoffset;
	}
	public void setP_UTCoffset(Object newP_UTCoffset) {
		p_UTCoffset = newP_UTCoffset;
	}
}
