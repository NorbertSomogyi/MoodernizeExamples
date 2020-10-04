package application;

/*
 * Copyright (C) 2014  René Kijewski  <rene.kijewski@fu-berlin.de>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
/**
 * @defgroup sys_ubjson  Universal Binary JSON library
 * @ingroup  sys_serialization
 * @brief    Provides a library to read and write UBJSON serialized data
 *
 * @deprecated  This module is deprecated and will be removed in release 2020.01.
 * @{
 *
 * @file
 * @brief       Headers for the UBJSON module
 *
 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
 *
 * @deprecated  This module is deprecated and will be removed in release 2020.01.
 */
/* ***************************************************************************
 * READ FUNCTIONS / DEFINITIONS
 *************************************************************************** */
/**
 * @brief Status code of ubjson_read(), ubjson_read_array() and ubjson_read_object() callback
 *
 * When ubjson_read(), ubjson_read_array() and ubjson_read_object() iteratively invokes the gives callback function.
 * The callback function then has to invoke another function such as ubjson_get_i32(), depending on the parameter `type`.
 */
/**
     * @brief There is no such value.
     *
     * Only used in the callback of ubjson_read() for parameter `type2`.
     */
/**
     * @brief The next datum is a null value.
     *
     * As you might have already guessed: you cannot read a null value.
     */
/**
     * @brief The next datum is a no-op value.
     *
     * As you might have already guessed: you cannot read a no-op value.
     */
/**
     * @brief The next datum is a boolean.
     *
     * The `content` is the boolean value.
     * Use ubjson_get_bool() or use `content` verbatim.
     */
/**
     * @brief The next datum is an integer that fits into an int32_t.
     *
     * Use ubjson_get_i32() to read the value.
     * `content` is one of ::ubjson_int32_type_t.
     */
/**
     * @brief The next datum is an integer that fits into an int64_t.
     *
     * Use ubjson_get_i64() to read the value.
     */
/**
     * @brief The next datum is a 32 bit floating point value.
     *
     * Use ubjson_get_float() to read the value.
     */
/**
     * @brief The next datum is a 64 bit floating point value.
     *
     * Use ubjson_get_double() to read the value.
     */
/* NOTE: High-precision numbers are not implemented, yet. Implement if needed. */
/* UBJSON_TYPE_HP_NUMBER, */
/**
     * @brief The next datum is a string (blob).
     *
     * Use ubjson_get_string() to read the value.
     * `content` is the length of the blob.
     */
/**
     * @brief The next datum is an array.
     *
     * Use ubjson_read_array() to read its contents.
     */
/**
     * @brief The next datum is an object.
     *
     * Use ubjson_read_object() to read its contents.
     */
/**
     * @brief The next datum is an array index.
     *
     * This value is emitted for every index in a call to ubjson_read_array().
     *
     * `content1` is the array index.
     * `type2` and `content2` describe the value of the index.
     *
     * Arrays can be nested.
     */
/**
     * @brief The next datum is an object key.
     *
     * This value is emitted for every index in a call to ubjson_read_object().
     *
     * `content1` is the length of the key, invoke ubjson_get_string().
     * `type2` and `content2` describe the value.
     *
     * Objects can be nested.
     */
/**
 * @brief Length of the UBJSON_TYPE_INT32 datum.
 */
/**< The stream contains an int8_t. */
/**< The stream contains an uint8_t. */
/**< The stream contains an int16_t. */
/**< The stream contains an int32_t. */
/**
 * @brief Return value of ::ubjson_read_callback_t and ubjson_read()
 *
 * The callback invoked by ubjson_read(), ubjson_read_array() or ubjson_read_object() can return an error value.
 * The error value is then returned by the read function.
 *
 * The values UBJSON_INVALID_DATA, UBJSON_PREMATURELY_ENDED, and UBJSON_SIZE_ERROR are returned on encoding errors, too.
 */
/**< success / do continue */
/**< aborted / do abort */
/**< invalid marker or type*/
/**< the stream abruptly ended */
/**< the length of a field exceeded SSIZE_MAX */
/**
 * @brief         Method called by ubjson_write_null() and friends.
 * @details       The function in invoked multiple times per written value.
 *                You should use some kind of buffer if you send the data over a stream.
 *
 *                The function must write the whole buffer before returning.
 * @param[in]     cookie     The cookie that was passed to ubjson_write_init().
 * @param[in]     buf        Data to write, never NULL.
 * @param[in]     len        Data to write, always >= 0.
 * @returns       @arg `< 0` to indicate an error.
 *                @arg `> 0` to indicate success.
 */
/**
 * @brief        See @ref ubjson_cookie_t.
 */
public class ubjson_cookie {
	private  rw;
	private  callback;
	private byte marker;
	
	public ubjson_cookie( rw,  callback, byte marker) {
		setRw(rw);
		setCallback(callback);
		setMarker(marker);
	}
	public ubjson_cookie() {
	}
	
	/*
	 * Copyright (C) 2014  René Kijewski  <rene.kijewski@fu-berlin.de>
	 *
	 * This library is free software; you can redistribute it and/or
	 * modify it under the terms of the GNU Lesser General Public
	 * License as published by the Free Software Foundation; either
	 * version 2.1 of the License, or (at your option) any later version.
	 *
	 * This library is distributed in the hope that it will be useful,
	 * but WITHOUT ANY WARRANTY; without even the implied warranty of
	 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
	 * Lesser General Public License for more details.
	 *
	 * You should have received a copy of the GNU Lesser General Public
	 * License along with this library; if not, write to the Free Software
	 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
	 */
	/**
	 * @ingroup     sys_ubjson
	 * @{
	 * @file
	 * @brief       Universal Binary JSON deserializer
	 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
	 * @}
	 */
	public  _ubjson_read_marker(Byte marker) {
		byte generatedMarker = this.getMarker();
		while (1) {
			ssize_t bytes_read = new ssize_t();
			marker = generatedMarker;
			if (!marker) {
				bytes_read = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, marker, 1);
			} else {
					this.setMarker(0);
					bytes_read = 1;
			} 
			if (bytes_read == 1) {
				return .UBJSON_OKAY;
			}  else if (bytes_read != 0) {
				return .UBJSON_PREMATURELY_ENDED;
			} 
		}
	}
	public Object ubjson_get_string(Object length, Object dest_) {
		ssize_t total = 0;
		Byte dest = dest_;
		while (total < length) {
			ssize_t read = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, dest, length - total);
			if (read < 0) {
				return read;
			} 
			total += read;
			dest += read;
		}
		return total;
	}
	public Object ubjson_get_i32(Object content, Object dest) {
		int8_t[] LENGHTS = new int8_t[]{1, 1, 2, 4};
		Object value;
		int type = content;
		ssize_t result = cookie.ubjson_get_string(LENGHTS[type], value);
		Object generatedI8 = value.getI8();
		Object generatedU8 = value.getU8();
		Object generatedI16 = value.getI16();
		Object generatedI32 = value.getI32();
		if (result > 0) {
			switch (type) {
			case .UBJSON_INT32_UINT8:
					dest = generatedU8;
					break;
			case .UBJSON_INT32_INT32:
					dest = (int32_t)/*Error: Function owner not recognized*/byteorder_ntohl(generatedI32);
					break;
			case .UBJSON_INT32_INT16:
					dest = (int16_t)/*Error: Function owner not recognized*/byteorder_ntohs(generatedI16);
					break;
			case .UBJSON_INT32_INT8:
					dest = generatedI8;
					break;
			default:
					return -1;
			}
		} 
		return result;
	}
	public Object ubjson_get_i64(Object content, Object dest) {
		(Object)content;
		 buf = new ();
		ssize_t result = cookie.ubjson_get_string(8, buf);
		dest = /*Error: Function owner not recognized*/byteorder_ntohll(buf);
		return result;
	}
	public  _ubjson_read_length(Object len) {
		ubjson_type_t type = new ubjson_type_t();
		ssize_t content = 0;
		ubjson_read_callback_result_t result = cookie.ubjson_peek_value(type, content);
		if (result != .UBJSON_OKAY) {
			return result;
		} 
		int64_t len64 = -1;
		ssize_t read = new ssize_t();
		if (type == .UBJSON_TYPE_INT32) {
			int32_t len32 = new int32_t();
			read = cookie.ubjson_get_i32(content, len32);
			if (read > 0) {
				len64 = len32;
			} 
		}  else if (type == .UBJSON_TYPE_INT64) {
			read = cookie.ubjson_get_i64(content, len64);
		} else {
				return .UBJSON_INVALID_DATA;
		} 
		if (read <= 0) {
			return .UBJSON_PREMATURELY_ENDED;
		}  else if ((ssize_t)len64 < 0) {
			return .UBJSON_SIZE_ERROR;
		}  else if (len64 < 0) {
			return .UBJSON_INVALID_DATA;
		} 
		len = len64;
		return .UBJSON_OKAY;
	}
	public  _ubjson_get_call(byte marker,  type, Object content) {
		content = -1;
		switch (marker) {
		case .UBJSON_MARKER_FLOAT32:
				type = .UBJSON_TYPE_FLOAT;
				break;
		case .UBJSON_MARKER_COUNT:
		case .UBJSON_MARKER_ARRAY_START:
				type = .UBJSON_ENTER_ARRAY;
				break;
		case .UBJSON_MARKER_ARRAY_END:
		case .UBJSON_MARKER_CHAR:
				type = .UBJSON_TYPE_STRING;
				break;
		case .UBJSON_MARKER_STRING:
				{ 
					ubjson_read_callback_result_t result = cookie._ubjson_read_length(content);
					if (result != .UBJSON_OKAY) {
						return result;
					} 
					type = .UBJSON_TYPE_STRING;
					break;
				}
		case .UBJSON_MARKER_INT16:
				content = .UBJSON_INT32_INT16;
				type = .UBJSON_TYPE_INT32;
				break;
		case .UBJSON_MARKER_INT8:
				content = .UBJSON_INT32_INT8;
				type = .UBJSON_TYPE_INT32;
				break;
		case .UBJSON_MARKER_INT64:
				type = .UBJSON_TYPE_INT64;
				break;
		case .UBJSON_MARKER_INT32:
				content = .UBJSON_INT32_INT32;
				type = .UBJSON_TYPE_INT32;
				break;
		case .UBJSON_MARKER_FLOAT64:
				type = .UBJSON_TYPE_DOUBLE;
				break;
		case .UBJSON_MARKER_NOOP:
				type = .UBJSON_TYPE_NOOP;
				break;
		case .UBJSON_MARKER_FALSE:
				;
				break;
		case .UBJSON_MARKER_OBJECT_START:
				type = .UBJSON_ENTER_OBJECT;
				break;
		case .UBJSON_MARKER_NULL:
				type = .UBJSON_TYPE_NULL;
				break;
		case .UBJSON_MARKER_UINT8:
				content = .UBJSON_INT32_UINT8;
				type = .UBJSON_TYPE_INT32;
				break;
		case .UBJSON_MARKER_TYPE:
		case .UBJSON_MARKER_TRUE:
		case .UBJSON_MARKER_OBJECT_END:
		default:
				return .UBJSON_INVALID_DATA;
		}
		return .UBJSON_OKAY;
	}
	public  _ubjson_read_struct(Object get_continue) {
		ubjson_read_callback_result_t result = new ubjson_read_callback_result_t();
		ssize_t count = -1;
		byte marker;
		byte type_marker = 0;
		do {
			result = cookie._ubjson_read_marker(marker);
			if (result != .UBJSON_OKAY) {
				return result;
			} 
		} while (0);
		if (marker == .UBJSON_MARKER_TYPE) {
			do {
				result = cookie._ubjson_read_marker(marker);
				if (result != .UBJSON_OKAY) {
					return result;
				} 
			} while (0);
			if (marker == 0) {
				return .UBJSON_INVALID_DATA;
			} 
			type_marker = marker;
			do {
				result = cookie._ubjson_read_marker(marker);
				if (result != .UBJSON_OKAY) {
					return result;
				} 
			} while (0);
		} 
		if (marker == .UBJSON_MARKER_COUNT) {
			result = cookie._ubjson_read_length(count);
			if (result != .UBJSON_OKAY) {
				return result;
			} 
			do {
				result = cookie._ubjson_read_marker(marker);
				if (result != .UBJSON_OKAY) {
					return result;
				} 
			} while (0);
		} 
		this.setMarker(marker);
		if ((type_marker != 0) && (count < 0/* If a type is specified, a count must be specified as well.
		         * Otherwise a ']' could either be data (e.g. the character ']'),
		         * or be meant to close the array.
		         */)) {
			return .UBJSON_INVALID_DATA;
		} 
		for (ssize_t index = 0;
		 (count < 0) || (index < count); ++index) {
			ubjson_type_t type1 = new ubjson_type_t();
			ssize_t content1 = new ssize_t();
			do {
				result = cookie._ubjson_read_marker(marker);
				if (result != .UBJSON_OKAY) {
					return result;
				} 
			} while (0);
			if (!/*Error: Function owner not recognized*/get_continue(cookie, marker, result, count, index, type1, content1) || (result != .UBJSON_OKAY)) {
				break;
			} 
			result = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, type1, content1, .UBJSON_ABSENT, (byte)type_marker);
			if (result != .UBJSON_OKAY) {
				break;
			} 
		}
		return result;
	}
	public boolean _ubjson_read_array_continue(byte marker,  result, Object count, Object index,  type1, Object content1) {
		if (marker == .UBJSON_MARKER_ARRAY_END) {
			if (count >= 0) {
				result = .UBJSON_INVALID_DATA;
			} 
			return 0;
		} 
		this.setMarker(marker);
		type1 = .UBJSON_INDEX;
		content1 = index;
		return 1;
	}
	public boolean _ubjson_read_object_continue(byte marker,  result, Object count, Object index,  type1, Object content1) {
		(Object)index;
		if (marker == .UBJSON_MARKER_OBJECT_END) {
			if (count >= 0) {
				result = .UBJSON_INVALID_DATA;
			} 
			return 0;
		} 
		this.setMarker(marker);
		type1 = .UBJSON_KEY;
		result = cookie._ubjson_read_length(content1);
		return 1;
	}
	public  ubjson_read_array() {
		return cookie._ubjson_read_struct(_ubjson_read_array_continue);
	}
	public  ubjson_read_object() {
		return cookie._ubjson_read_struct(_ubjson_read_object_continue);
	}
	public  ubjson_read_next() {
		byte marker;
		ubjson_read_callback_result_t result = new ubjson_read_callback_result_t();
		do {
			result = cookie._ubjson_read_marker(marker);
			if (result != .UBJSON_OKAY) {
				return result;
			} 
		} while (0);
		ubjson_type_t type = new ubjson_type_t();
		ssize_t content = new ssize_t();
		result = cookie._ubjson_get_call(marker, type, content);
		if (result != .UBJSON_OKAY) {
			return result;
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, type, content, .UBJSON_ABSENT, 0);
	}
	public  ubjson_peek_value( type, Object content) {
		byte marker = (byte)content;
		if (marker == 0) {
			ubjson_read_callback_result_t result = new ubjson_read_callback_result_t();
			do {
				result = cookie._ubjson_read_marker(marker);
				if (result != .UBJSON_OKAY) {
					return result;
				} 
			} while (0);
		} 
		return cookie._ubjson_get_call(marker, type, content);
	}
	public  ubjson_read(Object read, Object callback) {
		 generatedRw = this.getRw();
		generatedRw.setRead(read);
		 generatedCallback = this.getCallback();
		generatedCallback.setRead(callback);
		this.setMarker(0);
		return cookie/**
		 * @brief         Use in a callback if type1 is UBJSON_KEY or UBJSON_INDEX.
		 * @details       Call like ``ubjson_peek_value(cookie, &type2, &content2)``.
		 * @param[in]     cookie     The cookie that was passed to the callback.
		 * @param[in,out] type       Pointer to a variable that was initialized with the value of type2, returns the new type1.
		 * @param[in,out] content    Pointer to a variable that was initialized with the value of content2, returns the new content1.
		 * @returns       The same as ubjson_read().
		 */.ubjson_read_next();
	}
	public Object ubjson_get_bool(Object content, Boolean dest) {
		(Object)cookie;
		dest = content;
		return 1/**
		 * @brief         Call if type1 of the callback was UBJSON_TYPE_FLOAT.
		 * @param[in]     cookie     The cookie that was passed to the callback function.
		 * @param[in]     content    The content1 that was passed to the callback function.
		 * @param[out]    dest       The read datum.
		 * @returns       The result of the read callback, probably the amount of read bytes.
		 */;
	}
	public Object ubjson_get_float(Object content, Double dest) {
		(Object)content;
		Object value;
		Object generatedI = value.getI();
		ubjson_read_callback_result_t result = cookie.ubjson_get_i32(.UBJSON_INT32_INT32, generatedI);
		Object generatedF = value.getF();
		dest = generatedF;
		return result/**
		 * @brief         Call if type1 of the callback was UBJSON_TYPE_DOUBLE.
		 * @param[in]     cookie     The cookie that was passed to the callback function.
		 * @param[in]     content    The content1 that was passed to the callback function.
		 * @param[out]    dest       The read datum.
		 * @returns       The result of the read callback, probably the amount of read bytes.
		 */;
	}
	public Object ubjson_get_double(Object content, Double dest) {
		(Object)content;
		Object value;
		Object generatedI = value.getI();
		ubjson_read_callback_result_t result = cookie.ubjson_get_i64(-1, generatedI);
		Object generatedF = value.getF();
		dest = generatedF;
		return result/**
		 * @brief         Call if type1 of the callback was UBJSON_ENTER_ARRAY.
		 * @details       Inside this call the callback function will be invoked multiple times,
		 *                once per array element, with type1=UBJSON_INDEX,
		 *                and content1=running index in the array.
		 *
		 *                Use ubjson_peek_value() to determine the type of the element.
		 * @param[in]     cookie     The cookie that was passed to the callback function.
		 * @returns       The same as ubjson_read().
		 */;
	}
	public void ubjson_write_init(Object write_fun) {
		 generatedRw = this.getRw();
		generatedRw.setWrite(write_fun/**
		 * @brief         Write a null value.
		 * @param[in]     cookie     The cookie that was initialized with ubjson_write_init().
		 */);
	}
	/*
	 * Copyright (C) 2014  René Kijewski  <rene.kijewski@fu-berlin.de>
	 *
	 * This library is free software; you can redistribute it and/or
	 * modify it under the terms of the GNU Lesser General Public
	 * License as published by the Free Software Foundation; either
	 * version 2.1 of the License, or (at your option) any later version.
	 *
	 * This library is distributed in the hope that it will be useful,
	 * but WITHOUT ANY WARRANTY; without even the implied warranty of
	 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
	 * Lesser General Public License for more details.
	 *
	 * You should have received a copy of the GNU Lesser General Public
	 * License along with this library; if not, write to the Free Software
	 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
	 */
	/**
	 * @ingroup     sys_ubjson
	 * @{
	 * @file
	 * @brief       Universal Binary JSON deserializer
	 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
	 * @}
	 */
	public Object ubjson_write_null() {
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)((.UBJSON_MARKER_NULL))};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		return result;
	}
	public Object ubjson_write_noop() {
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)((.UBJSON_MARKER_NOOP))};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		return result;
	}
	public Object ubjson_open_array() {
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)((.UBJSON_MARKER_ARRAY_START))};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		return result;
	}
	public Object ubjson_close_array() {
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)((.UBJSON_MARKER_ARRAY_END))};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		return result;
	}
	public Object ubjson_open_object() {
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)((.UBJSON_MARKER_OBJECT_START))};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		return result;
	}
	public Object ubjson_close_object() {
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)((.UBJSON_MARKER_OBJECT_END))};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		return result;
	}
	public Object ubjson_write_bool(boolean value) {
		byte[] marker_false = new byte[]{.UBJSON_MARKER_FALSE};
		byte[] marker_true = new byte[]{.UBJSON_MARKER_TRUE};
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, value ? marker_true : marker_false, 1);
	}
	public Object ubjson_write_i32(Object value) {
		ssize_t result = 0;
		if (((true) <= value) && (value <= 127)) {
			do {
				byte[] marker_buf = new byte[]{(byte)(.UBJSON_MARKER_INT8)};
				do {
					ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
					if (wrote < 0) {
						return wrote;
					} 
					result += wrote;
				} while (0);
			} while (0);
			do {
				byte[] marker_buf = new byte[]{(byte)((uint8_t)value)};
				do {
					ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
					if (wrote < 0) {
						return wrote;
					} 
					result += wrote;
				} while (0);
			} while (0);
		}  else if ((0 <= value) && (value <= -1024)) {
			do {
				byte[] marker_buf = new byte[]{(byte)(.UBJSON_MARKER_UINT8)};
				do {
					ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
					if (wrote < 0) {
						return wrote;
					} 
					result += wrote;
				} while (0);
			} while (0);
			do {
				byte[] marker_buf = new byte[]{(byte)((uint8_t)value)};
				do {
					ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
					if (wrote < 0) {
						return wrote;
					} 
					result += wrote;
				} while (0);
			} while (0);
		}  else if (((true) <= value) && (value <= -1024)) {
			do {
				byte[] marker_buf = new byte[]{(byte)(.UBJSON_MARKER_INT16)};
				do {
					ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
					if (wrote < 0) {
						return wrote;
					} 
					result += wrote;
				} while (0);
			} while (0);
			 buf = /*Error: Function owner not recognized*/byteorder_htons((uint16_t)value);
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (buf), (/*Error: sizeof expression not supported yet*/));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} else {
				do {
					byte[] marker_buf = new byte[]{(byte)(.UBJSON_MARKER_INT32)};
					do {
						ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
						if (wrote < 0) {
							return wrote;
						} 
						result += wrote;
					} while (0);
				} while (0);
				 buf = /*Error: Function owner not recognized*/byteorder_htonl((uint32_t)value);
				do {
					ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (buf), (/*Error: sizeof expression not supported yet*/));
					if (wrote < 0) {
						return wrote;
					} 
					result += wrote;
				} while (0);
		} 
		return result;
	}
	public Object ubjson_write_i64(Object value) {
		if (((-2147483647 - 1) <= value) && (value <= 2147483647)) {
			return cookie.ubjson_write_i32((int32_t)value);
		} 
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)(.UBJSON_MARKER_INT64)};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		 buf = /*Error: Function owner not recognized*/byteorder_htonll((uint64_t)value);
		do {
			ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (buf), (/*Error: sizeof expression not supported yet*/));
			if (wrote < 0) {
				return wrote;
			} 
			result += wrote;
		} while (0);
		return result;
	}
	public Object ubjson_write_float(double value) {
		Object v = {/*Error: Invalid initializer*/};
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)(.UBJSON_MARKER_FLOAT32)};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		Object generatedI = v.getI();
		 buf = /*Error: Function owner not recognized*/byteorder_htonl(generatedI);
		do {
			ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (buf), (/*Error: sizeof expression not supported yet*/));
			if (wrote < 0) {
				return wrote;
			} 
			result += wrote;
		} while (0);
		return result;
	}
	public Object ubjson_write_double(double value) {
		Object v = {/*Error: Invalid initializer*/};
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)(.UBJSON_MARKER_FLOAT64)};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		Object generatedI = v.getI();
		 buf = /*Error: Function owner not recognized*/byteorder_htonll(generatedI);
		do {
			ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (buf), (/*Error: sizeof expression not supported yet*/));
			if (wrote < 0) {
				return wrote;
			} 
			result += wrote;
		} while (0);
		return result;
	}
	public Object ubjson_write_string(Object value, Object len) {
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)(.UBJSON_MARKER_STRING)};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		do {
			ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, value, len);
			if (wrote < 0) {
				return wrote;
			} 
			result += wrote;
		} while (0);
		return result;
	}
	public Object _ubjson_write_length(Object len) {
		ssize_t result = 0;
		do {
			byte[] marker_buf = new byte[]{(byte)(.UBJSON_MARKER_COUNT)};
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (marker_buf), (true));
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} while (0);
		do {
			ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (int64_t)len);
			if (wrote < 0) {
				return wrote;
			} 
			result += wrote;
		} while (0);
		return result;
	}
	public Object ubjson_open_array_len(Object len) {
		ssize_t result = 0;
		do {
			ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie);
			if (wrote < 0) {
				return wrote;
			} 
			result += wrote;
		} while (0);
		if (len > 0) {
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, len);
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} else {
				do {
					ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie);
					if (wrote < 0) {
						return wrote;
					} 
					result += wrote;
				} while (0);
		} 
		return result;
	}
	public Object ubjson_open_object_len(Object len) {
		ssize_t result = 0;
		do {
			ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie);
			if (wrote < 0) {
				return wrote;
			} 
			result += wrote;
		} while (0);
		if (len > 0) {
			do {
				ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, len);
				if (wrote < 0) {
					return wrote;
				} 
				result += wrote;
			} while (0);
		} else {
				do {
					ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie);
					if (wrote < 0) {
						return wrote;
					} 
					result += wrote;
				} while (0);
		} 
		return result;
	}
	public Object ubjson_write_key(Object value, Object len) {
		ssize_t result = 0;
		do {
			ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (int64_t)len);
			if (wrote < 0) {
				return wrote;
			} 
			result += wrote;
		} while (0);
		do {
			ssize_t wrote = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cookie, (value), (len));
			if (wrote < 0) {
				return wrote;
			} 
			result += wrote;
		} while (0);
		return result;
	}
	public  getRw() {
		return rw;
	}
	public void setRw( newRw) {
		rw = newRw;
	}
	public  getCallback() {
		return callback;
	}
	public void setCallback( newCallback) {
		callback = newCallback;
	}
	public byte getMarker() {
		return marker;
	}
	public void setMarker(byte newMarker) {
		marker = newMarker;
	}
}
/**
 * @brief         A cookie passed between the read and write functions.
 * @details       You probably want to wrap the cookie in some other data structure,
 *                which you retrieve with container_of() in the callback.
 */
/**
 * @brief         Method called by ubjson_read() to get more data.
 * @param[in]     cookie    The cookie that was passed to ubjson_read().
 * @param[out]    buf       The buffer that should be written to.
 * @param[in]     max_len   The length of the buffer. Always `>= 1`.
 * @return        @arg `< 0` on error. UBJSON_PREMATURELY_ENDED will be return by ubjson_read().
 *                @arg `> 0` the amount of read data, which must not exceed max_len.
 */
/**
 * @brief         Method called by ubjson_read() to denote the next element in the structure.
 * @details       Depending on the value of type1 a different function, such as ubjson_get_i32(),
 *                must be invoked by the callback function.
 *
 *                With ubjson_read_array() or ubjson_read_object() the value of type1 is
 *                UBJSON_INDEX or UBJSON_KEY, resp.
 * @param[in]     cookie     The cookie that was passed to ubjson_read().
 * @param[in]     type1      The type of the next datum.
 * @param[in]     content1   The sub-type of the next datum.
 * @param[in]     type2      The type of the value that belongs to the next key/index, or UBJSON_ABSENT.
 * @param[in]     content2   The sub-type of the value that belongs to the next key/index.
 * @returns       Either UBJSON_OKAY or UBJSON_ABORTED.
 */
/**
     * @brief     Read/write function
     * @internal
     */
