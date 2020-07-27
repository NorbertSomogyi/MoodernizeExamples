package application;

public class vec4 {
	private double x;
	private double y;
	private double z;
	private double w;
	private Object ptr;
	private Object m;
	
	public vec4(double x, double y, double z, double w, Object ptr, Object m) {
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		setPtr(ptr);
		setM(m);
	}
	public vec4() {
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
	public void vec4_from_vec3(Object v) {
		this.setM(v.getM());
		this.setW(1.0);
	}
	public void vec4_transform(Object v, Object m) {
		vec4 temp = new vec4();
		matrix4 transpose = new matrix4();
		transpose.matrix4_transpose(m);
		vec4 generatedX = transpose.getX();
		temp.setX(ModernizedCProgram.vec4_dot(generatedX, v));
		vec4 generatedY = transpose.getY();
		temp.setY(ModernizedCProgram.vec4_dot(generatedY, v));
		vec4 generatedZ = transpose.getZ();
		temp.setZ(ModernizedCProgram.vec4_dot(generatedZ, v));
		vec4 generatedT = transpose.getT();
		temp.setW(ModernizedCProgram.vec4_dot(generatedT, v));
		dst.vec4_copy(temp);
	}
	public void vec4_zero() {
		this.setM(/*Error: Function owner not recognized*/_mm_setzero_ps());
	}
	public void vec4_set(double x, double y, double z, double w) {
		this.setM(/*Error: Function owner not recognized*/_mm_set_ps(w, z, y, x));
	}
	public void vec4_copy(Object v) {
		this.setM(v.getM());
	}
	public void vec4_add(Object v1, Object v2) {
		this.setM(/*Error: Function owner not recognized*/_mm_add_ps(v1.getM(), v2.getM()));
	}
	public void vec4_sub(Object v1, Object v2) {
		this.setM(/*Error: Function owner not recognized*/_mm_sub_ps(v1.getM(), v2.getM()));
	}
	public void vec4_mul(Object v1, Object v2) {
		this.setM(/*Error: Function owner not recognized*/_mm_mul_ps(v1.getM(), v2.getM()));
	}
	public void vec4_div(Object v1, Object v2) {
		this.setM(/*Error: Function owner not recognized*/_mm_div_ps(v1.getM(), v2.getM()));
	}
	public void vec4_addf(Object v, double f) {
		this.setM(/*Error: Function owner not recognized*/_mm_add_ps(v.getM(), /*Error: Function owner not recognized*/_mm_set1_ps(f)));
	}
	public void vec4_subf(Object v, double f) {
		this.setM(/*Error: Function owner not recognized*/_mm_sub_ps(v.getM(), /*Error: Function owner not recognized*/_mm_set1_ps(f)));
	}
	public void vec4_mulf(Object v, double f) {
		this.setM(/*Error: Function owner not recognized*/_mm_mul_ps(v.getM(), /*Error: Function owner not recognized*/_mm_set1_ps(f)));
	}
	public void vec4_divf(Object v, double f) {
		this.setM(/*Error: Function owner not recognized*/_mm_div_ps(v.getM(), /*Error: Function owner not recognized*/_mm_set1_ps(f)));
	}
	public void vec4_neg(Object v) {
		this.setX(-v.getX());
		this.setY(-v.getY());
		this.setZ(-v.getZ());
		this.setW(-v.getW());
	}
	public void vec4_norm(Object v) {
		double dot_val = ModernizedCProgram.vec4_dot(v, v);
		this.setM((dot_val > 0.0) ? /*Error: Function owner not recognized*/_mm_mul_ps(v.getM(), /*Error: Function owner not recognized*/_mm_set1_ps(1.0 / /*Error: Function owner not recognized*/sqrtf(dot_val))) : /*Error: Function owner not recognized*/_mm_setzero_ps());
	}
	public void vec4_min(Object v1, Object v2) {
		this.setM(/*Error: Function owner not recognized*/_mm_min_ps(v1.getM(), v2.getM()));
	}
	public void vec4_minf(Object v, double f) {
		this.setM(/*Error: Function owner not recognized*/_mm_min_ps(v.getM(), /*Error: Function owner not recognized*/_mm_set1_ps(f)));
	}
	public void vec4_max(Object v1, Object v2) {
		this.setM(/*Error: Function owner not recognized*/_mm_max_ps(v1.getM(), v2.getM()));
	}
	public void vec4_maxf(Object v, double f) {
		this.setM(/*Error: Function owner not recognized*/_mm_max_ps(v.getM(), /*Error: Function owner not recognized*/_mm_set1_ps(f)));
	}
	public void vec4_abs(Object v) {
		this.setX(/*Error: Function owner not recognized*/fabsf(v.getX()));
		this.setY(/*Error: Function owner not recognized*/fabsf(v.getY()));
		this.setZ(/*Error: Function owner not recognized*/fabsf(v.getZ()));
		this.setW(/*Error: Function owner not recognized*/fabsf(v.getW()));
	}
	public void vec4_floor(Object v) {
		this.setX(/*Error: Function owner not recognized*/floorf(v.getX()));
		this.setY(/*Error: Function owner not recognized*/floorf(v.getY()));
		this.setZ(/*Error: Function owner not recognized*/floorf(v.getZ()));
		this.setW(/*Error: Function owner not recognized*/floorf(v.getW()));
	}
	public void vec4_ceil(Object v) {
		this.setX(/*Error: Function owner not recognized*/ceilf(v.getX()));
		this.setY(/*Error: Function owner not recognized*/ceilf(v.getY()));
		this.setZ(/*Error: Function owner not recognized*/ceilf(v.getZ()));
		this.setW(/*Error: Function owner not recognized*/ceilf(v.getW()));
	}
	public void vec4_from_rgba(Object rgba) {
		this.setX((double)((double)(rgba & -1024) * (1.0 / 255.0)));
		rgba >>=  8;
		this.setY((double)((double)(rgba & -1024) * (1.0 / 255.0)));
		rgba >>=  8;
		this.setZ((double)((double)(rgba & -1024) * (1.0 / 255.0)));
		rgba >>=  8;
		this.setW((double)((double)(rgba & -1024) * (1.0 / 255.0)));
	}
	public void vec4_from_bgra(Object bgra) {
		this.setZ((double)((double)(bgra & -1024) * (1.0 / 255.0)));
		bgra >>=  8;
		this.setY((double)((double)(bgra & -1024) * (1.0 / 255.0)));
		bgra >>=  8;
		this.setX((double)((double)(bgra & -1024) * (1.0 / 255.0)));
		bgra >>=  8;
		this.setW((double)((double)(bgra & -1024) * (1.0 / 255.0)));
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
