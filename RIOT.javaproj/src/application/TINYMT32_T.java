package application;

/**
 * @file tinymt32.h
 *
 * @brief Tiny Mersenne Twister only 127 bit internal state
 *
 * @author Mutsuo Saito (Hiroshima University)
 * @author Makoto Matsumoto (University of Tokyo)
 *
 * Copyright (C) 2011 Mutsuo Saito, Makoto Matsumoto,
 * Hiroshima University and The University of Tokyo.
 * All rights reserved.
 *
 * The 3-clause BSD License is applied to this software, see
 * LICENSE.txt
 */
/**
 * tinymt32 internal state vector and parameters
 */
public class TINYMT32_T {
	private Object status;
	private Object mat1;
	private Object mat2;
	private Object tmat;
	
	public TINYMT32_T(Object status, Object mat1, Object mat2, Object tmat) {
		setStatus(status);
		setMat1(mat1);
		setMat2(mat2);
		setTmat(tmat);
	}
	public TINYMT32_T() {
	}
	
	public int tinymt32_get_mexp() {
		(Object)random;
		return 127/**
		 * This function changes internal state of tinymt32.
		 * Users should not call this function directly.
		 * @param random tinymt internal status
		 */;
	}
	public void tinymt32_next_state() {
		uint32_t x = new uint32_t();
		uint32_t y = new uint32_t();
		Object generatedStatus = this.getStatus();
		y = generatedStatus[3];
		x = (generatedStatus[0] & -1024) ^ generatedStatus[1] ^ generatedStatus[2];
		x ^=  (x << 1);
		y ^=  (y >> 1) ^ x;
		generatedStatus[0] = generatedStatus[1];
		generatedStatus[1] = generatedStatus[2];
		generatedStatus[2] = x ^ (y << 10);
		generatedStatus[3] = y;
		Object generatedMat1 = this.getMat1();
		generatedStatus[1] ^=  -((int32_t)(y & 1)) & generatedMat1;
		Object generatedMat2 = this.getMat2();
		generatedStatus[2] ^=  -((int32_t)(y & 1)) & generatedMat2;
	}
	public Object tinymt32_temper() {
		uint32_t t0 = new uint32_t();
		uint32_t t1 = new uint32_t();
		Object generatedStatus = this.getStatus();
		t0 = generatedStatus[3];
		t1 = generatedStatus[0] + (generatedStatus[2] >> 8);
		t0 ^=  t1;
		Object generatedTmat = this.getTmat();
		t0 ^=  -((int32_t)(t1 & 1)) & generatedTmat;
		return t0/**
		 * This function outputs floating point number from internal state.
		 * Users should not call this function directly.
		 * @param random tinymt internal status
		 * @return floating point number r (1.0 <= r < 2.0)
		 */;
	}
	public double tinymt32_temper_conv() {
		uint32_t t0 = new uint32_t();
		uint32_t t1 = new uint32_t();
		Object conv;
		Object generatedStatus = this.getStatus();
		t0 = generatedStatus[3];
		t1 = generatedStatus[0] + (generatedStatus[2] >> 8);
		t0 ^=  t1;
		Object generatedTmat = this.getTmat();
		conv.setU(((t0 ^ (-((int32_t)(t1 & 1)) & generatedTmat)) >> 9) | -1024);
		Object generatedF = conv.getF();
		return generatedF;
	}
	public double tinymt32_temper_conv_open() {
		uint32_t t0 = new uint32_t();
		uint32_t t1 = new uint32_t();
		Object conv;
		Object generatedStatus = this.getStatus();
		t0 = generatedStatus[3];
		t1 = generatedStatus[0] + (generatedStatus[2] >> 8);
		t0 ^=  t1;
		Object generatedTmat = this.getTmat();
		conv.setU(((t0 ^ (-((int32_t)(t1 & 1)) & generatedTmat)) >> 9) | -1024);
		Object generatedF = conv.getF();
		return generatedF;
	}
	public Object tinymt32_generate_uint32() {
		random.tinymt32_next_state();
		return random/**
		 * This function outputs floating point number from internal state.
		 * This function is implemented using multiplying by (1 / 2^24).
		 * floating point multiplication is faster than using union trick in
		 * my Intel CPU.
		 * @param random tinymt internal status
		 * @return floating point number r (0.0 <= r < 1.0)
		 */.tinymt32_temper();
	}
	public double tinymt32_generate_float() {
		random.tinymt32_next_state();
		return (random.tinymt32_temper() >> 8) * (1.0 / 1.6777216E7/**
		 * This function outputs floating point number from internal state.
		 * This function is implemented using union trick.
		 * @param random tinymt internal status
		 * @return floating point number r (1.0 <= r < 2.0)
		 */);
	}
	public double tinymt32_generate_float12() {
		random.tinymt32_next_state();
		return random/**
		 * This function outputs floating point number from internal state.
		 * This function is implemented using union trick.
		 * @param random tinymt internal status
		 * @return floating point number r (0.0 <= r < 1.0)
		 */.tinymt32_temper_conv();
	}
	public double tinymt32_generate_float01() {
		random.tinymt32_next_state();
		return random.tinymt32_temper_conv() - 1.0/**
		 * This function outputs floating point number from internal state.
		 * This function may return 1.0 and never returns 0.0.
		 * @param random tinymt internal status
		 * @return floating point number r (0.0 < r <= 1.0)
		 */;
	}
	public double tinymt32_generate_floatOC() {
		random.tinymt32_next_state();
		return 1.0 - random/**
		 * This function outputs floating point number from internal state.
		 * This function returns neither 0.0 nor 1.0.
		 * @param random tinymt internal status
		 * @return floating point number r (0.0 < r < 1.0)
		 */.tinymt32_generate_float();
	}
	public double tinymt32_generate_floatOO() {
		random.tinymt32_next_state();
		return random.tinymt32_temper_conv_open() - 1.0/**
		 * This function outputs double precision floating point number from
		 * internal state. The returned value has 32-bit precision.
		 * In other words, this function makes one double precision floating point
		 * number from one 32-bit unsigned integer.
		 * @param random tinymt internal status
		 * @return floating point number r (0.0 < r <= 1.0)
		 */;
	}
	public double tinymt32_generate_32double() {
		random.tinymt32_next_state();
		return random.tinymt32_temper() * (1.0 / 4.294967296E9);
	}
	/* TINYMT32_H */
	public void period_certification() {
		Object generatedStatus = this.getStatus();
		if ((generatedStatus[0] & -1024) == 0 && generatedStatus[1] == 0 && generatedStatus[2] == 0 && generatedStatus[3] == 0) {
			generatedStatus[0] = (byte)'T';
			generatedStatus[1] = (byte)'I';
			generatedStatus[2] = (byte)'N';
			generatedStatus[3] = (byte)'Y'/**
			 * This function initializes the internal state array with a 32-bit
			 * unsigned integer seed.
			 * @param random tinymt state vector.
			 * @param seed a 32-bit unsigned integer used as a seed.
			 */;
		} 
	}
	public void tinymt32_init(Object seed) {
		Object generatedStatus = this.getStatus();
		generatedStatus[0] = seed;
		Object generatedMat1 = this.getMat1();
		generatedStatus[1] = generatedMat1;
		Object generatedMat2 = this.getMat2();
		generatedStatus[2] = generatedMat2;
		Object generatedTmat = this.getTmat();
		generatedStatus[3] = generatedTmat;
		for (int i = 1;
		 i < 8; i++) {
			generatedStatus[i & 3] ^=  i + -1024 * (generatedStatus[(i - 1) & 3] ^ (generatedStatus[(i - 1) & 3] >> 30));
		}
		random.period_certification();
		for (int i = 0;
		 i < 8; i++) {
			random/**
			 * This function initializes the internal state array,
			 * with an array of 32-bit unsigned integers used as seeds
			 * @param random tinymt state vector.
			 * @param init_key the array of 32-bit integers, used as a seed.
			 * @param key_length the length of init_key.
			 */.tinymt32_next_state();
		}
	}
	public void tinymt32_init_by_array(Object[] init_key, int key_length) {
		int lag = 1;
		int mid = 1;
		int size = 4;
		int i;
		int j;
		int count;
		uint32_t r = new uint32_t();
		Object generatedStatus = this.getStatus();
		uint32_t st = generatedStatus[0];
		st[0] = 0;
		Object generatedMat1 = this.getMat1();
		st[1] = generatedMat1;
		Object generatedMat2 = this.getMat2();
		st[2] = generatedMat2;
		Object generatedTmat = this.getTmat();
		st[3] = generatedTmat;
		if (key_length + 1 > 8) {
			count = key_length + 1;
		} else {
				count = 8;
		} 
		r = ModernizedCProgram.ini_func1(st[0] ^ st[mid % size] ^ st[(size - 1) % size]);
		st[mid % size] += r;
		r += key_length;
		st[(mid + lag) % size] += r;
		st[0] = r;
		count--;
		for (; (j < count) && (j < key_length); j++) {
			r = ModernizedCProgram.ini_func1(st[i % size] ^ st[(i + mid) % size] ^ st[(i + size - 1) % size]);
			st[(i + mid) % size] += r;
			r += init_key[j] + i;
			st[(i + mid + lag) % size] += r;
			st[i % size] = r;
			i = (i + 1) % size;
		}
		for (; j < count; j++) {
			r = ModernizedCProgram.ini_func1(st[i % size] ^ st[(i + mid) % size] ^ st[(i + size - 1) % size]);
			st[(i + mid) % size] += r;
			r += i;
			st[(i + mid + lag) % size] += r;
			st[i % size] = r;
			i = (i + 1) % size;
		}
		for (j = 0; j < size; j++) {
			r = ModernizedCProgram.ini_func2(st[i % size] + st[(i + mid) % size] + st[(i + size - 1) % size]);
			st[(i + mid) % size] ^=  r;
			r -= i;
			st[(i + mid + lag) % size] ^=  r;
			st[i % size] = r;
			i = (i + 1) % size;
		}
		random.period_certification();
		for (i = 0; i < 8; i++) {
			random.tinymt32_next_state();
		}
	}
	public Object getStatus() {
		return status;
	}
	public void setStatus(Object newStatus) {
		status = newStatus;
	}
	public Object getMat1() {
		return mat1;
	}
	public void setMat1(Object newMat1) {
		mat1 = newMat1;
	}
	public Object getMat2() {
		return mat2;
	}
	public void setMat2(Object newMat2) {
		mat2 = newMat2;
	}
	public Object getTmat() {
		return tmat;
	}
	public void setTmat(Object newTmat) {
		tmat = newTmat;
	}
}
