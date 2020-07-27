package application;

public class matrix4 {
	private vec4 x;
	private vec4 y;
	private vec4 z;
	private vec4 t;
	
	public matrix4(vec4 x, vec4 y, vec4 z, vec4 t) {
		setX(x);
		setY(y);
		setZ(z);
		setT(t);
	}
	public matrix4() {
	}
	
	public void matrix4_copy(Object m) {
		vec4 generatedX = this.getX();
		generatedX.setM(m.getX().getM());
		vec4 generatedY = this.getY();
		generatedY.setM(m.getY().getM());
		vec4 generatedZ = this.getZ();
		generatedZ.setM(m.getZ().getM());
		vec4 generatedT = this.getT();
		generatedT.setM(m.getT().getM());
	}
	public void matrix4_identity() {
		vec4 generatedX = this.getX();
		generatedX.vec4_zero();
		vec4 generatedY = this.getY();
		generatedY.vec4_zero();
		vec4 generatedZ = this.getZ();
		generatedZ.vec4_zero();
		vec4 generatedT = this.getT();
		generatedT.vec4_zero();
		generatedX.setX(1.0);
		generatedY.setY(1.0);
		generatedZ.setZ(1.0);
		generatedT.setW(1.0);
	}
	public void matrix4_translate3f(Object m, double x, double y, double z) {
		vec3 v = new vec3();
		v.vec3_set(x, y, z);
		dst.matrix4_translate3v(m, v);
	}
	public void matrix4_rotate_aa4f(Object m, double x, double y, double z, double rot) {
		axisang aa = new axisang();
		aa.axisang_set(x, y, z, rot);
		dst.matrix4_rotate_aa(m, aa);
	}
	public void matrix4_scale3f(Object m, double x, double y, double z) {
		vec3 v = new vec3();
		v.vec3_set(x, y, z);
		dst.matrix4_scale(m, v);
	}
	public void obs_sceneitem_get_draw_transform(Object item) {
		if (item) {
			transform.matrix4_copy(item.getDraw_transform());
		} 
	}
	public void obs_sceneitem_get_box_transform(Object item) {
		if (item) {
			transform.matrix4_copy(item.getBox_transform());
		} 
	}
	public matrix4 top_matrix(graphics_subsystem graphics) {
		Object generatedMatrix_stack = graphics.getMatrix_stack();
		Object generatedCur_matrix = graphics.getCur_matrix();
		return generatedMatrix_stack.getArray() + generatedCur_matrix;
	}
	public void gs_matrix_get() {
		matrix4 top_mat = new matrix4();
		if (!ModernizedCProgram.gs_valid("gs_matrix_get")) {
			return /*Error: Unsupported expression*/;
		} 
		matrix4 matrix4 = new matrix4();
		top_mat = matrix4.top_matrix(thread_graphics);
		if (top_mat) {
			dst.matrix4_copy(top_mat);
		} 
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
	public void matrix4_from_matrix3(Object m) {
		vec4 generatedX = this.getX();
		generatedX.setM(m.getX().getM());
		vec4 generatedY = this.getY();
		generatedY.setM(m.getY().getM());
		vec4 generatedZ = this.getZ();
		generatedZ.setM(m.getZ().getM());
		vec4 generatedT = this.getT();
		generatedT.setM(m.getT().getM());
		generatedT.setW(1.0);
	}
	public void matrix4_from_quat(Object q) {
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
		vec4 generatedX = this.getX();
		generatedX.vec4_set(1.0 - (yy + zz), xy + wz, xz - wy, 0.0);
		vec4 generatedY = this.getY();
		generatedY.vec4_set(xy - wz, 1.0 - (xx + zz), yz + wx, 0.0);
		vec4 generatedZ = this.getZ();
		generatedZ.vec4_set(xz + wy, yz - wx, 1.0 - (xx + yy), 0.0);
		vec4 generatedT = this.getT();
		generatedT.vec4_set(0.0, 0.0, 0.0, 1.0);
	}
	public void matrix4_from_axisang(Object aa) {
		quat q = new quat();
		q.quat_from_axisang(aa);
		dst.matrix4_from_quat(q);
	}
	public void matrix4_mul(Object m1, Object m2) {
		vec4 m1v = (vec4)m1;
		double m2f = (double)m2;
		vec4[] out = new vec4();
		int i;
		int j;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				vec4 temp = new vec4();
				temp.vec4_set(m2f[j], m2f[j + 4], m2f[j + 8], m2f[j + 12]);
				out[i].getPtr()[j] = ModernizedCProgram.vec4_dot(m1v[i], temp);
			}
		}
		dst.matrix4_copy((matrix4)out);
	}
	public void matrix4_translate3v(Object m, Object v) {
		matrix4 temp = new matrix4();
		vec4 generatedX = temp.getX();
		generatedX.vec4_set(1.0, 0.0, 0.0, 0.0);
		vec4 generatedY = temp.getY();
		generatedY.vec4_set(0.0, 1.0, 0.0, 0.0);
		vec4 generatedZ = temp.getZ();
		generatedZ.vec4_set(0.0, 0.0, 1.0, 0.0);
		vec4 generatedT = temp.getT();
		generatedT.vec4_from_vec3(v);
		dst.matrix4_mul(m, temp);
	}
	public void matrix4_translate4v(Object m, Object v) {
		matrix4 temp = new matrix4();
		vec4 generatedX = temp.getX();
		generatedX.vec4_set(1.0, 0.0, 0.0, 0.0);
		vec4 generatedY = temp.getY();
		generatedY.vec4_set(0.0, 1.0, 0.0, 0.0);
		vec4 generatedZ = temp.getZ();
		generatedZ.vec4_set(0.0, 0.0, 1.0, 0.0);
		vec4 generatedT = temp.getT();
		generatedT.vec4_copy(v);
		dst.matrix4_mul(m, temp);
	}
	public void matrix4_rotate(Object m, Object q) {
		matrix4 temp = new matrix4();
		temp.matrix4_from_quat(q);
		dst.matrix4_mul(m, temp);
	}
	public void matrix4_rotate_aa(Object m, Object aa) {
		matrix4 temp = new matrix4();
		temp.matrix4_from_axisang(aa);
		dst.matrix4_mul(m, temp);
	}
	public void matrix4_scale(Object m, Object v) {
		matrix4 temp = new matrix4();
		vec4 generatedX = temp.getX();
		generatedX.vec4_set(generatedX, 0.0, 0.0, 0.0);
		vec4 generatedY = temp.getY();
		generatedY.vec4_set(0.0, generatedY, 0.0, 0.0);
		vec4 generatedZ = temp.getZ();
		generatedZ.vec4_set(0.0, 0.0, generatedZ, 0.0);
		vec4 generatedT = temp.getT();
		generatedT.vec4_set(0.0, 0.0, 0.0, 1.0);
		dst.matrix4_mul(m, temp);
	}
	public void matrix4_translate3v_i(Object v, Object m) {
		matrix4 temp = new matrix4();
		vec4 generatedX = temp.getX();
		generatedX.vec4_set(1.0, 0.0, 0.0, 0.0);
		vec4 generatedY = temp.getY();
		generatedY.vec4_set(0.0, 1.0, 0.0, 0.0);
		vec4 generatedZ = temp.getZ();
		generatedZ.vec4_set(0.0, 0.0, 1.0, 0.0);
		vec4 generatedT = temp.getT();
		generatedT.vec4_from_vec3(v);
		dst.matrix4_mul(temp, m);
	}
	public void matrix4_translate4v_i(Object v, Object m) {
		matrix4 temp = new matrix4();
		vec4 generatedX = temp.getX();
		generatedX.vec4_set(1.0, 0.0, 0.0, 0.0);
		vec4 generatedY = temp.getY();
		generatedY.vec4_set(0.0, 1.0, 0.0, 0.0);
		vec4 generatedZ = temp.getZ();
		generatedZ.vec4_set(0.0, 0.0, 1.0, 0.0);
		vec4 generatedT = temp.getT();
		generatedT.vec4_copy(v);
		dst.matrix4_mul(temp, m);
	}
	public void matrix4_rotate_i(Object q, Object m) {
		matrix4 temp = new matrix4();
		temp.matrix4_from_quat(q);
		dst.matrix4_mul(temp, m);
	}
	public void matrix4_rotate_aa_i(Object aa, Object m) {
		matrix4 temp = new matrix4();
		temp.matrix4_from_axisang(aa);
		dst.matrix4_mul(temp, m);
	}
	public void matrix4_scale_i(Object v, Object m) {
		matrix4 temp = new matrix4();
		vec4 generatedX = temp.getX();
		generatedX.vec4_set(generatedX, 0.0, 0.0, 0.0);
		vec4 generatedY = temp.getY();
		generatedY.vec4_set(0.0, generatedY, 0.0, 0.0);
		vec4 generatedZ = temp.getZ();
		generatedZ.vec4_set(0.0, 0.0, generatedZ, 0.0);
		vec4 generatedT = temp.getT();
		generatedT.vec4_set(0.0, 0.0, 0.0, 1.0);
		dst.matrix4_mul(temp, m);
	}
	public Object matrix4_inv(Object m) {
		vec4 dstv = new vec4();
		double det;
		double[] m3x3 = new double[9];
		int i;
		int j;
		int sign;
		if (dst == m) {
			matrix4 temp = m;
			return dst.matrix4_inv(temp);
		} 
		dstv = (vec4)dst;
		det = ModernizedCProgram.matrix4_determinant(m);
		if (/*Error: Function owner not recognized*/fabs(det) < 5.0E-4) {
			return false;
		} 
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				sign = 1 - ((i + j) % 2) * 2;
				ModernizedCProgram.get_3x3_submatrix(m3x3, m, i, j);
				dstv[j].getPtr()[i] = ModernizedCProgram.get_3x3_determinant(m3x3) * (double)sign / det;
			}
		}
		return true;
	}
	public void matrix4_transpose(Object m) {
		if (dst == m) {
			matrix4 temp = m;
			dst.matrix4_transpose(temp);
			return /*Error: Unsupported expression*/;
		} 
		__m128 a0 = /*Error: Function owner not recognized*/_mm_unpacklo_ps(m.getX().getM(), m.getZ().getM());
		__m128 a1 = /*Error: Function owner not recognized*/_mm_unpacklo_ps(m.getY().getM(), m.getT().getM());
		__m128 a2 = /*Error: Function owner not recognized*/_mm_unpackhi_ps(m.getX().getM(), m.getZ().getM());
		__m128 a3 = /*Error: Function owner not recognized*/_mm_unpackhi_ps(m.getY().getM(), m.getT().getM());
		vec4 generatedX = this.getX();
		generatedX.setM(/*Error: Function owner not recognized*/_mm_unpacklo_ps(a0, a1));
		vec4 generatedY = this.getY();
		generatedY.setM(/*Error: Function owner not recognized*/_mm_unpackhi_ps(a0, a1));
		vec4 generatedZ = this.getZ();
		generatedZ.setM(/*Error: Function owner not recognized*/_mm_unpacklo_ps(a2, a3));
		vec4 generatedT = this.getT();
		generatedT.setM(/*Error: Function owner not recognized*/_mm_unpackhi_ps(a2, a3));
	}
	public vec4 getX() {
		return x;
	}
	public void setX(vec4 newX) {
		x = newX;
	}
	public vec4 getY() {
		return y;
	}
	public void setY(vec4 newY) {
		y = newY;
	}
	public vec4 getZ() {
		return z;
	}
	public void setZ(vec4 newZ) {
		z = newZ;
	}
	public vec4 getT() {
		return t;
	}
	public void setT(vec4 newT) {
		t = newT;
	}
}
