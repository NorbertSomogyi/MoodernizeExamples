package application;

public class quat {
	private double x;
	private double y;
	private double z;
	private double w;
	private Object ptr;
	private Object m;
	
	public quat(double x, double y, double z, double w, Object ptr, Object m) {
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		setPtr(ptr);
		setM(m);
	}
	public quat() {
	}
	
	public void quat_mul(Object q1, Object q2) {
		vec3 q1axis = new vec3();
		vec3 q2axis = new vec3();
		vec3 temp1 = new vec3();
		vec3 temp2 = new vec3();
		q1axis.quat_vec3(q1);
		q2axis.quat_vec3(q2);
		temp1.vec3_mulf(q2axis, q1.getW());
		temp2.vec3_mulf(q1axis, q2.getW());
		temp1.vec3_add(temp1, temp2);
		temp2.vec3_cross(q1axis, q2axis);
		(vec3)dst.vec3_add(temp1, temp2);
		this.setW((q1.getW() * q2.getW()) - ModernizedCProgram.vec3_dot(q1axis, q2axis));
	}
	public void quat_from_axisang(Object aa) {
		double halfa = aa.getW() * 0.5;
		double sine = .sinf(halfa);
		this.setX(aa.getX() * sine);
		this.setY(aa.getY() * sine);
		this.setZ(aa.getZ() * sine);
		this.setW(.cosf(halfa));
	}
	public void quat_from_matrix3(Object m) {
		dst.quat_from_matrix4((matrix4)m);
	}
	public void quat_from_matrix4(Object m) {
		double tr = (m.getX().getX() + m.getY().getY() + m.getZ().getZ());
		double inv_half;
		double four_d;
		int i;
		int j;
		int k;
		Object generatedPtr = val.getPtr();
		if (tr > 0.0) {
			four_d = .sqrtf(tr + 1.0);
			this.setW(four_d * 0.5);
			inv_half = 0.5 / four_d;
			this.setX((m.getY().getZ() - m.getZ().getY()) * inv_half);
			this.setY((m.getZ().getX() - m.getX().getZ()) * inv_half);
			this.setZ((m.getX().getY() - m.getY().getX()) * inv_half);
		} else {
				f4x4 val = (f4x4)m;
				i = (m.getX().getX() > m.getY().getY()) ? 0 : 1;
				if (m.getZ().getZ() > generatedPtr[i][i]) {
					i = 2;
				} 
				j = (i + 1) % 3;
				k = (i + 2) % 3;
				four_d = .sqrtf((generatedPtr[i][i] - generatedPtr[j][j] - generatedPtr[k][k]) + 1.0);
				generatedPtr[i] = four_d * 0.5;
				inv_half = 0.5 / four_d;
				generatedPtr[j] = (generatedPtr[i][j] + generatedPtr[j][i]) * inv_half;
				generatedPtr[k] = (generatedPtr[i][k] + generatedPtr[k][i]) * inv_half;
				this.setW((generatedPtr[j][k] - generatedPtr[k][j]) * inv_half);
		} 
	}
	public void quat_set_look_dir(Object dir) {
		vec3 new_dir = new vec3();
		quat xz_rot = new quat();
		quat yz_rot = new quat();
		 xz_valid = new ();
		 yz_valid = new ();
		axisang aa = new axisang();
		new_dir.vec3_norm(dir);
		new_dir.vec3_neg(new_dir);
		xz_rot.quat_identity();
		yz_rot.quat_identity();
		double generatedX = new_dir.getX();
		double generatedZ = new_dir.getZ();
		xz_valid = ModernizedCProgram.close_float(generatedX, 0.0, 1.0E-4) || ModernizedCProgram.close_float(generatedZ, 0.0, 1.0E-4);
		double generatedY = new_dir.getY();
		yz_valid = ModernizedCProgram.close_float(generatedY, 0.0, 1.0E-4);
		if (xz_valid) {
			aa.axisang_set(0.0, 1.0, 0.0, .atan2f(generatedX, generatedZ));
			xz_rot.quat_from_axisang(aa);
		} 
		if (yz_valid) {
			aa.axisang_set(-1.0, 0.0, 0.0, .asinf(generatedY));
			yz_rot.quat_from_axisang(aa);
		} 
		if (!xz_valid) {
			dst.quat_copy(yz_rot);
		}  else if (!yz_valid) {
			dst.quat_copy(xz_rot);
		} else {
				dst.quat_mul(xz_rot, yz_rot);
		} 
	}
	public void quat_log(Object q) {
		double angle = .acosf(q.getW());
		double sine = .sinf(angle);
		double w = q.getW();
		dst.quat_copy(q);
		this.setW(0.0);
		if ((.fabsf(w) < 1.0) && (.fabsf(sine) >= 1.0E-4)) {
			sine = angle / sine;
			dst.quat_mulf(dst, sine);
		} 
	}
	public void quat_exp(Object q) {
		double length = .sqrtf(q.getX() * q.getX() + q.getY() * q.getY() + q.getZ() * q.getZ());
		double sine = .sinf(length);
		dst.quat_copy(q);
		sine = (length > 1.0E-4) ? (sine / length) : 1.0;
		dst.quat_mulf(dst, sine);
		this.setW(.cosf(length));
	}
	public void quat_interpolate(Object q1, Object q2, double t) {
		double dot = ModernizedCProgram.quat_dot(q1, q2);
		double anglef = .acosf(dot);
		double sine;
		double sinei;
		double sinet;
		double sineti;
		quat temp = new quat();
		if (anglef >= 1.0E-4) {
			sine = .sinf(anglef);
			sinei = 1 / sine;
			sinet = .sinf(anglef * t) * sinei;
			sineti = .sinf(anglef * (1.0 - t)) * sinei;
			temp.quat_mulf(q1, sineti);
			dst.quat_mulf(q2, sinet);
			dst.quat_add(temp, dst);
		} else {
				temp.quat_sub(q2, q1);
				temp.quat_mulf(temp, t);
				dst.quat_add(temp, q1);
		} 
	}
	public void quat_get_tangent(Object prev, Object q, Object next) {
		quat temp = new quat();
		temp.quat_sub(q, prev);
		temp.quat_add(temp, next);
		temp.quat_sub(temp, q);
		dst.quat_mulf(temp, 0.5);
	}
	public void quat_interpolate_cubic(Object q1, Object q2, Object m1, Object m2, double t) {
		quat temp1 = new quat();
		quat temp2 = new quat();
		temp1.quat_interpolate(q1, q2, t);
		temp2.quat_interpolate(m1, m2, t);
		dst.quat_interpolate(temp1, temp2, 2.0 * (1.0 - t) * t);
	}
	public void quat_identity() {
		this.setM(._mm_setzero_ps());
		this.setW(1.0);
	}
	public void quat_set(double x, double y, double z, double w) {
		this.setM(._mm_set_ps(x, y, z, w));
	}
	public void quat_copy(Object q) {
		this.setM(q.getM());
	}
	public void quat_add(Object q1, Object q2) {
		this.setM(._mm_add_ps(q1.getM(), q2.getM()));
	}
	public void quat_sub(Object q1, Object q2) {
		this.setM(._mm_sub_ps(q1.getM(), q2.getM()));
	}
	public void quat_addf(Object q, double f) {
		this.setM(._mm_add_ps(q.getM(), ._mm_set1_ps(f)));
	}
	public void quat_subf(Object q, double f) {
		this.setM(._mm_sub_ps(q.getM(), ._mm_set1_ps(f)));
	}
	public void quat_mulf(Object q, double f) {
		this.setM(._mm_mul_ps(q.getM(), ._mm_set1_ps(f)));
	}
	public void quat_divf(Object q, double f) {
		this.setM(._mm_div_ps(q.getM(), ._mm_set1_ps(f)));
	}
	public void quat_inv(Object q) {
		this.setX(-q.getX());
		this.setY(-q.getY());
		this.setZ(-q.getZ());
	}
	public void quat_neg(Object q) {
		this.setX(-q.getX());
		this.setY(-q.getY());
		this.setZ(-q.getZ());
		this.setW(-q.getW());
	}
	public void quat_norm(Object q) {
		double dot_val = ModernizedCProgram.quat_dot(q, q);
		this.setM((dot_val > 0.0) ? ._mm_mul_ps(q.getM(), ._mm_set1_ps(1.0 / .sqrtf(dot_val))) : ._mm_setzero_ps());
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
