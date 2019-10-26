package application;

public class vec3 {
	private double x;
	private double y;
	private double z;
	private double w;
	private Object ptr;
	private Object m;
	
	public vec3(double x, double y, double z, double w, Object ptr, Object m) {
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		setPtr(ptr);
		setM(m);
	}
	public vec3() {
	}
	
	public void vec3_zero() {
		this.setM(._mm_setzero_ps());
	}
	public void vec3_set(double x, double y, double z) {
		this.setM(._mm_set_ps(0.0, z, y, x));
	}
	public void vec3_copy(Object v) {
		this.setM(v.getM());
	}
	public void vec3_add(Object v1, Object v2) {
		this.setM(._mm_add_ps(v1.getM(), v2.getM()));
		this.setW(0.0);
	}
	public void vec3_sub(Object v1, Object v2) {
		this.setM(._mm_sub_ps(v1.getM(), v2.getM()));
		this.setW(0.0);
	}
	public void vec3_mul(Object v1, Object v2) {
		this.setM(._mm_mul_ps(v1.getM(), v2.getM()));
	}
	public void vec3_div(Object v1, Object v2) {
		this.setM(._mm_div_ps(v1.getM(), v2.getM()));
		this.setW(0.0);
	}
	public void vec3_addf(Object v, double f) {
		this.setM(._mm_add_ps(v.getM(), ._mm_set1_ps(f)));
		this.setW(0.0);
	}
	public void vec3_subf(Object v, double f) {
		this.setM(._mm_sub_ps(v.getM(), ._mm_set1_ps(f)));
		this.setW(0.0);
	}
	public void vec3_mulf(Object v, double f) {
		this.setM(._mm_mul_ps(v.getM(), ._mm_set1_ps(f)));
	}
	public void vec3_divf(Object v, double f) {
		this.setM(._mm_div_ps(v.getM(), ._mm_set1_ps(f)));
		this.setW(0.0);
	}
	public void vec3_cross(Object v1, Object v2) {
		__m128 s1v1 = ((__m128).__builtin_ia32_shufps((__v4sf)(__m128)(v1.getM()), (__v4sf)(__m128)(v1.getM()), (int)((((true) << 6) | ((false) << 4) | ((true) << 2) | (true)))));
		__m128 s1v2 = ((__m128).__builtin_ia32_shufps((__v4sf)(__m128)(v2.getM()), (__v4sf)(__m128)(v2.getM()), (int)((((true) << 6) | ((true) << 4) | ((false) << 2) | (true)))));
		__m128 s2v1 = ((__m128).__builtin_ia32_shufps((__v4sf)(__m128)(v1.getM()), (__v4sf)(__m128)(v1.getM()), (int)((((true) << 6) | ((true) << 4) | ((false) << 2) | (true)))));
		__m128 s2v2 = ((__m128).__builtin_ia32_shufps((__v4sf)(__m128)(v2.getM()), (__v4sf)(__m128)(v2.getM()), (int)((((true) << 6) | ((false) << 4) | ((true) << 2) | (true)))));
		this.setM(._mm_sub_ps(._mm_mul_ps(s1v1, s1v2), ._mm_mul_ps(s2v1, s2v2)));
	}
	public void vec3_neg(Object v) {
		this.setX(-v.getX());
		this.setY(-v.getY());
		this.setZ(-v.getZ());
		this.setW(0.0);
	}
	public void vec3_norm(Object v) {
		double dot_val = ModernizedCProgram.vec3_dot(v, v);
		this.setM((dot_val > 0.0) ? ._mm_mul_ps(v.getM(), ._mm_set1_ps(1.0 / .sqrtf(dot_val))) : ._mm_setzero_ps());
	}
	public void vec3_min(Object v1, Object v2) {
		this.setM(._mm_min_ps(v1.getM(), v2.getM()));
		this.setW(0.0);
	}
	public void vec3_minf(Object v, double f) {
		this.setM(._mm_min_ps(v.getM(), ._mm_set1_ps(f)));
		this.setW(0.0);
	}
	public void vec3_max(Object v1, Object v2) {
		this.setM(._mm_max_ps(v1.getM(), v2.getM()));
		this.setW(0.0);
	}
	public void vec3_maxf(Object v, double f) {
		this.setM(._mm_max_ps(v.getM(), ._mm_set1_ps(f)));
		this.setW(0.0);
	}
	public void vec3_abs(Object v) {
		this.setX(.fabsf(v.getX()));
		this.setY(.fabsf(v.getY()));
		this.setZ(.fabsf(v.getZ()));
		this.setW(0.0);
	}
	public void vec3_floor(Object v) {
		this.setX(.floorf(v.getX()));
		this.setY(.floorf(v.getY()));
		this.setZ(.floorf(v.getZ()));
		this.setW(0.0);
	}
	public void vec3_ceil(Object v) {
		this.setX(.ceilf(v.getX()));
		this.setY(.ceilf(v.getY()));
		this.setZ(.ceilf(v.getZ()));
		this.setW(0.0);
	}
	/******************************************************************************
	    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>
	
	    This program is free software: you can redistribute it and/or modify
	    it under the terms of the GNU General Public License as published by
	    the Free Software Foundation, either version 2 of the License, or
	    (at your option) any later version.
	
	    This program is distributed in the hope that it will be useful,
	    but WITHOUT ANY WARRANTY; without even the implied warranty of
	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	    GNU General Public License for more details.
	
	    You should have received a copy of the GNU General Public License
	    along with this program.  If not, see <http://www.gnu.org/licenses/>.
	******************************************************************************/
	public void quat_vec3(Object q) {
		this.setM(q.getM());
		this.setW(0.0);
	}
	public void quat_get_dir(Object q) {
		matrix3 m = new matrix3();
		m.matrix3_from_quat(q);
		vec3 generatedZ = m.getZ();
		dst.vec3_copy(generatedZ);
	}
	public void bounds_get_point(Object b, int i) {
		if (i > 8) {
			return ;
		} 
		if (i > 3) {
			this.setX(b.getMax().getX());
			i -= 4;
		} else {
				this.setX(b.getMin().getX());
		} 
		if (i > 1) {
			this.setY(b.getMax().getY());
			i -= 2;
		} else {
				this.setY(b.getMin().getY());
		} 
		this.setZ((i == 1) ? b.getMax().getZ() : b.getMin().getZ());
	}
	public void bounds_get_center(Object b) {
		dst.vec3_sub(b.getMax(), b.getMin());
		dst.vec3_mulf(dst, 0.5);
		dst.vec3_add(dst, b.getMin());
	}
	/******************************************************************************
	    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>
	
	    This program is free software: you can redistribute it and/or modify
	    it under the terms of the GNU General Public License as published by
	    the Free Software Foundation, either version 2 of the License, or
	    (at your option) any later version.
	
	    This program is distributed in the hope that it will be useful,
	    but WITHOUT ANY WARRANTY; without even the implied warranty of
	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	    GNU General Public License for more details.
	
	    You should have received a copy of the GNU General Public License
	    along with this program.  If not, see <http://www.gnu.org/licenses/>.
	******************************************************************************/
	public void vec3_from_vec4(Object v) {
		this.setM(v.getM());
		this.setW(0.0);
	}
	public void vec3_rotate(Object v, Object m) {
		vec3 temp = new vec3();
		temp.vec3_copy(v);
		this.setX(ModernizedCProgram.vec3_dot(temp, m.getX()));
		this.setY(ModernizedCProgram.vec3_dot(temp, m.getY()));
		this.setZ(ModernizedCProgram.vec3_dot(temp, m.getZ()));
		this.setW(0.0);
	}
	public void vec3_transform(Object v, Object m) {
		vec4 v4 = new vec4();
		v4.vec4_from_vec3(v);
		v4.vec4_transform(v4, m);
		dst.vec3_from_vec4(v4);
	}
	public void vec3_transform3x4(Object v, Object m) {
		vec3 temp = new vec3();
		temp.vec3_sub(v, m.getT());
		this.setX(ModernizedCProgram.vec3_dot(temp, m.getX()));
		this.setY(ModernizedCProgram.vec3_dot(temp, m.getY()));
		this.setZ(ModernizedCProgram.vec3_dot(temp, m.getZ()));
		this.setW(0.0);
	}
	public void vec3_mirror(Object v, Object p) {
		vec3 temp = new vec3();
		temp.vec3_mulf(p.getDir(), ModernizedCProgram.vec3_plane_dist(v, p) * 2.0);
		dst.vec3_sub(v, temp);
	}
	public void vec3_mirrorv(Object v, Object vec) {
		vec3 temp = new vec3();
		temp.vec3_mulf(vec, ModernizedCProgram.vec3_dot(v, vec) * 2.0);
		dst.vec3_sub(v, temp);
	}
	public void vec3_rand(int positive_only) {
		this.setX(ModernizedCProgram.rand_float(positive_only));
		this.setY(ModernizedCProgram.rand_float(positive_only));
		this.setZ(ModernizedCProgram.rand_float(positive_only));
		this.setW(0.0);
	}
	/******************************************************************************
	    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>
	
	    This program is free software: you can redistribute it and/or modify
	    it under the terms of the GNU General Public License as published by
	    the Free Software Foundation, either version 2 of the License, or
	    (at your option) any later version.
	
	    This program is distributed in the hope that it will be useful,
	    but WITHOUT ANY WARRANTY; without even the implied warranty of
	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	    GNU General Public License for more details.
	
	    You should have received a copy of the GNU General Public License
	    along with this program.  If not, see <http://www.gnu.org/licenses/>.
	******************************************************************************/
	public void polar_to_cart(Object v) {
		vec3 cart = new vec3();
		double sinx = .cosf(v.getX());
		double sinx_z = v.getZ() * sinx;
		cart.setX(sinx_z * .sinf(v.getY()));
		cart.setZ(sinx_z * .cosf(v.getY()));
		cart.setY(v.getZ() * .sinf(v.getX()));
		dst.vec3_copy(cart);
	}
	public void cart_to_polar(Object v) {
		vec3 polar = new vec3();
		polar.setZ(ModernizedCProgram.vec3_len(v));
		double generatedZ = polar.getZ();
		if (ModernizedCProgram.close_float(generatedZ, 0.0, 1.0E-4)) {
			polar.vec3_zero();
		} else {
				polar.setX(.asinf(v.getY() / generatedZ));
				polar.setY(.atan2f(v.getX(), generatedZ));
		} 
		dst.vec3_copy(polar);
	}
	public void polar_to_norm(Object polar) {
		double sinx = .sinf(polar.getX());
		this.setX(sinx * .cosf(polar.getY()));
		this.setY(sinx * .sinf(polar.getY()));
		this.setZ(.cosf(polar.getX()));
	}
	public void calc_torque(Object v1, Object v2, double torque, double min_adjust, double t) {
		vec3 line = new vec3();
		vec3 dir = new vec3();
		double orig_dist;
		double torque_dist;
		double adjust_dist;
		if (ModernizedCProgram.vec3_close(v1, v2, 1.0E-4)) {
			dst.vec3_copy(v1);
			return ;
		} 
		line.vec3_sub(v2, v1);
		orig_dist = ModernizedCProgram.vec3_len(line);
		dir.vec3_mulf(line, 1.0 / orig_dist);
		torque_dist = orig_dist * /* use distance to determine speed */torque;
		if (torque_dist < /* prevent from going too slow */min_adjust) {
			torque_dist = min_adjust;
		} 
		adjust_dist = torque_dist * t;
		if (adjust_dist <= (orig_dist - 0.01)) {
			dst.vec3_mulf(dir, adjust_dist);
			dst.vec3_add(dst, /* add torque */v1);
		} else {
				dst.vec3_copy(/* clamp if overshoot */v2);
		} 
	}
	public double getX() {
		return x;
	}
	public void setX(double newX) {
		x = newX;
	}
	public double getY() {
		return y;
	}
	public void setY(double newY) {
		y = newY;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double newZ) {
		z = newZ;
	}
	public double getW() {
		return w;
	}
	public void setW(double newW) {
		w = newW;
	}
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
	public Object getM() {
		return m;
	}
	public void setM(Object newM) {
		m = newM;
	}
}
