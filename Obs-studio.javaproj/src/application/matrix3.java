package application;

public class matrix3 {
	private vec3 x;
	private vec3 y;
	private vec3 z;
	private vec3 t;
	
	public matrix3(vec3 x, vec3 y, vec3 z, vec3 t) {
		setX(x);
		setY(y);
		setZ(z);
		setT(t);
	}
	public matrix3() {
	}
	
	public void matrix3_copy(Object m) {
		vec3 generatedX = this.getX();
		generatedX.vec3_copy(generatedX);
		vec3 generatedY = this.getY();
		generatedY.vec3_copy(generatedY);
		vec3 generatedZ = this.getZ();
		generatedZ.vec3_copy(generatedZ);
		vec3 generatedT = this.getT();
		generatedT.vec3_copy(generatedT);
	}
	public void matrix3_identity() {
		vec3 generatedX = this.getX();
		generatedX.vec3_zero();
		vec3 generatedY = this.getY();
		generatedY.vec3_zero();
		vec3 generatedZ = this.getZ();
		generatedZ.vec3_zero();
		vec3 generatedT = this.getT();
		generatedT.vec3_zero();
		generatedX.setX(generatedY.setY(generatedZ.setZ(1.0)));
	}
	public void matrix3_translate(Object m, Object v) {
		vec3 generatedT = this.getT();
		generatedT.vec3_sub(generatedT, v);
	}
	public void matrix3_translate3f(Object m, double x, double y, double z) {
		vec3 v = new vec3();
		v.vec3_set(x, y, z);
		dst.matrix3_translate(m, v);
	}
	public void matrix3_rotate_aa4f(Object m, double x, double y, double z, double rot) {
		axisang aa = new axisang();
		aa.axisang_set(x, y, z, rot);
		dst.matrix3_rotate_aa(m, aa);
	}
	public void matrix3_scale3f(Object m, double x, double y, double z) {
		vec3 v = new vec3();
		v.vec3_set(x, y, z);
		dst.matrix3_scale(m, v);
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
	public void matrix3_from_quat(Object q) {
		double norm = ModernizedCProgram.quat_dot(q, q);
		double s = (norm > 0.0) ? (2.0 / norm) : 0.0;
		double xx = q.getX() * q.getX() * s;
		double yy = q.getY() * q.getY() * s;
		double zz = q.getZ() * q.getZ() * s;
		double xy = q.getX() * q.getY() * s;
		double xz = q.getX() * q.getZ() * s;
		double yz = q.getY() * q.getZ() * s;
		double wx = q.getW() * q.getX() * s;
		double wy = q.getW() * q.getY() * s;
		double wz = q.getW() * q.getZ() * s;
		vec3 generatedX = this.getX();
		generatedX.vec3_set(1.0 - (yy + zz), xy + wz, xz - wy);
		vec3 generatedY = this.getY();
		generatedY.vec3_set(xy - wz, 1.0 - (xx + zz), yz + wx);
		vec3 generatedZ = this.getZ();
		generatedZ.vec3_set(xz + wy, yz - wx, 1.0 - (xx + yy));
		vec3 generatedT = this.getT();
		generatedT.vec3_zero();
	}
	public void matrix3_from_axisang(Object aa) {
		quat q = new quat();
		q.quat_from_axisang(aa);
		dst.matrix3_from_quat(q);
	}
	public void matrix3_from_matrix4(Object m) {
		vec3 generatedX = this.getX();
		generatedX.setM(m.getX().getM());
		vec3 generatedY = this.getY();
		generatedY.setM(m.getY().getM());
		vec3 generatedZ = this.getZ();
		generatedZ.setM(m.getZ().getM());
		vec3 generatedT = this.getT();
		generatedT.setM(m.getT().getM());
		generatedX.setW(0.0);
		generatedY.setW(0.0);
		generatedZ.setW(0.0);
		generatedT.setW(0.0);
	}
	public void matrix3_mul(Object m1, Object m2) {
		vec3 generatedX = temp.getX();
		vec3 generatedY = temp.getY();
		vec3 generatedZ = temp.getZ();
		vec3 generatedT = temp.getT();
		if (dst == m2) {
			matrix3 temp = new matrix3();
			generatedX.vec3_rotate(generatedX, m2);
			generatedY.vec3_rotate(generatedY, m2);
			generatedZ.vec3_rotate(generatedZ, m2);
			generatedT.vec3_transform3x4(generatedT, m2);
			dst.matrix3_copy(temp);
		} else {
				generatedX.vec3_rotate(generatedX, m2);
				generatedY.vec3_rotate(generatedY, m2);
				generatedZ.vec3_rotate(generatedZ, m2);
				generatedT.vec3_transform3x4(generatedT, m2);
		} 
	}
	public void matrix3_rotate(Object m, Object q) {
		matrix3 temp = new matrix3();
		temp.matrix3_from_quat(q);
		dst.matrix3_mul(m, temp);
	}
	public void matrix3_rotate_aa(Object m, Object aa) {
		matrix3 temp = new matrix3();
		temp.matrix3_from_axisang(aa);
		dst.matrix3_mul(m, temp);
	}
	public void matrix3_scale(Object m, Object v) {
		vec3 generatedX = this.getX();
		generatedX.vec3_mul(generatedX, v);
		vec3 generatedY = this.getY();
		generatedY.vec3_mul(generatedY, v);
		vec3 generatedZ = this.getZ();
		generatedZ.vec3_mul(generatedZ, v);
		vec3 generatedT = this.getT();
		generatedT.vec3_mul(generatedT, v);
	}
	public void matrix3_transpose(Object m) {
		__m128 tmp1 = new __m128();
		__m128 tmp2 = new __m128();
		vec3 generatedT = this.getT();
		generatedT.vec3_rotate(generatedT, m);
		generatedT.vec3_neg(generatedT);
		tmp1 = ._mm_movelh_ps(m.getX().getM(), m.getY().getM());
		tmp2 = ._mm_movehl_ps(m.getY().getM(), m.getX().getM());
		vec3 generatedX = this.getX();
		generatedX.setM(((__m128).__builtin_ia32_shufps((__v4sf)(__m128)(tmp1), (__v4sf)(__m128)(m.getZ().getM()), (int)((((true) << 6) | ((false) << 4) | ((true) << 2) | (false))))));
		vec3 generatedY = this.getY();
		generatedY.setM(((__m128).__builtin_ia32_shufps((__v4sf)(__m128)(tmp1), (__v4sf)(__m128)(m.getZ().getM()), (int)((((true) << 6) | ((true) << 4) | ((true) << 2) | (true))))));
		vec3 generatedZ = this.getZ();
		generatedZ.setM(((__m128).__builtin_ia32_shufps((__v4sf)(__m128)(tmp2), (__v4sf)(__m128)(m.getZ().getM()), (int)((((true) << 6) | ((true) << 4) | ((true) << 2) | (false))))));
	}
	public void matrix3_inv(Object m) {
		matrix4 m4 = new matrix4();
		m4.matrix4_from_matrix3(m);
		(matrix4)dst.matrix4_inv(m4);
		vec3 generatedT = this.getT();
		generatedT.setW(0.0);
	}
	public void matrix3_mirror(Object m, Object p) {
		vec3 generatedX = this.getX();
		generatedX.vec3_mirrorv(generatedX, p.getDir());
		vec3 generatedY = this.getY();
		generatedY.vec3_mirrorv(generatedY, p.getDir());
		vec3 generatedZ = this.getZ();
		generatedZ.vec3_mirrorv(generatedZ, p.getDir());
		vec3 generatedT = this.getT();
		generatedT.vec3_mirror(generatedT, p);
	}
	public void matrix3_mirrorv(Object m, Object v) {
		vec3 generatedX = this.getX();
		generatedX.vec3_mirrorv(generatedX, v);
		vec3 generatedY = this.getY();
		generatedY.vec3_mirrorv(generatedY, v);
		vec3 generatedZ = this.getZ();
		generatedZ.vec3_mirrorv(generatedZ, v);
		vec3 generatedT = this.getT();
		generatedT.vec3_mirrorv(generatedT, v);
	}
	public vec3 getX() {
		return x;
	}
	public void setX(vec3 newX) {
		x = newX;
	}
	public vec3 getY() {
		return y;
	}
	public void setY(vec3 newY) {
		y = newY;
	}
	public vec3 getZ() {
		return z;
	}
	public void setZ(vec3 newZ) {
		z = newZ;
	}
	public vec3 getT() {
		return t;
	}
	public void setT(vec3 newT) {
		t = newT;
	}
}
