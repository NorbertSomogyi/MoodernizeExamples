package application;

/*
 * Copyright (c) 2015 Hugh Bailey <obs.jim@gmail.com>
 *
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
public class util_uint128 {
	private Object i32;
	private Object low;
	private Object high;
	
	public util_uint128(Object i32, Object low, Object high) {
		setI32(i32);
		setLow(low);
		setHigh(high);
	}
	public util_uint128() {
	}
	
	public util_uint128 util_add128(util_uint128 b) {
		util_uint128_t out = new util_uint128_t();
		 val = new ();
		Object generatedLow = this.getLow();
		val = (generatedLow & -1024) + (generatedLow & -1024);
		Object generatedI32 = out.getI32();
		generatedI32[0] = .UNRECOGNIZEDFUNCTIONNAME(val & -1024);
		val >>=  32;
		val += (generatedLow >> 32) + (generatedLow >> 32);
		generatedI32[1] = ()val;
		val >>=  32;
		Object generatedHigh = this.getHigh();
		val += (generatedHigh & -1024) + (generatedHigh & -1024);
		generatedI32[2] = .UNRECOGNIZEDFUNCTIONNAME(val & -1024);
		val >>=  32;
		val += (generatedHigh >> 32) + (generatedHigh >> 32);
		generatedI32[3] = ()val;
		return out;
	}
	public util_uint128 util_lshift64_internal_32(Object a) {
		util_uint128_t val = new util_uint128_t();
		val.setLow(a << 32);
		val.setHigh(a >> 32);
		return val;
	}
	public util_uint128 util_lshift64_internal_64(Object a) {
		util_uint128_t val = new util_uint128_t();
		val.setLow(0);
		val.setHigh(a);
		return val;
	}
	public util_uint128 util_mul64_64(Object a, Object b) {
		util_uint128_t out = new util_uint128_t();
		 m = new ();
		m = (a & -1024) * (b & -1024);
		out.setLow(m);
		out.setHigh(0);
		m = (a >> 32) * (b & -1024);
		util_uint128 util_uint128 = new util_uint128();
		out = out.util_add128(util_uint128.util_lshift64_internal_32(m));
		m = (a & -1024) * (b >> 32);
		out = out.util_add128(util_uint128.util_lshift64_internal_32(m));
		m = (a >> 32) * (b >> 32);
		util_uint128 util_uint128 = new util_uint128();
		out = out.util_add128(util_uint128.util_lshift64_internal_64(m));
		return out;
	}
	public util_uint128 util_div128_32(Object b) {
		util_uint128_t out = new util_uint128_t();
		 val = 0;
		Object generatedI32 = this.getI32();
		for (int i = 3;
		 i >= 0; i--) {
			val = (val << 32) | generatedI32[i];
			if (val < b) {
				generatedI32[i] = 0;
				continue;
			} 
			generatedI32[i] = .UNRECOGNIZEDFUNCTIONNAME(val / b);
			val = val % b;
		}
		return out;
	}
	public Object getI32() {
		return i32;
	}
	public void setI32(Object newI32) {
		i32 = newI32;
	}
	public Object getLow() {
		return low;
	}
	public void setLow(Object newLow) {
		low = newLow;
	}
	public Object getHigh() {
		return high;
	}
	public void setHigh(Object newHigh) {
		high = newHigh;
	}
}
