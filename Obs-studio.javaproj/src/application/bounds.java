package application;

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
/*
 * Axis Aligned Bounding Box
 */
public class bounds {
	private vec3 min;
	private vec3 max;
	
	public bounds(vec3 min, vec3 max) {
		setMin(min);
		setMax(max);
	}
	public bounds() {
	}
	
	public void bounds_zero() {
		vec3 generatedMin = this.getMin();
		generatedMin.vec3_zero();
		vec3 generatedMax = this.getMax();
		generatedMax.vec3_zero();
	}
	public void bounds_copy(Object b) {
		vec3 generatedMin = this.getMin();
		generatedMin.vec3_copy(generatedMin);
		vec3 generatedMax = this.getMax();
		generatedMax.vec3_copy(generatedMax);
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
	public void bounds_move(Object b, Object v) {
		vec3 generatedMin = this.getMin();
		generatedMin.vec3_add(generatedMin, v);
		vec3 generatedMax = this.getMax();
		generatedMax.vec3_add(generatedMax, v);
	}
	public void bounds_scale(Object b, Object v) {
		vec3 generatedMin = this.getMin();
		generatedMin.vec3_mul(generatedMin, v);
		vec3 generatedMax = this.getMax();
		generatedMax.vec3_mul(generatedMax, v);
	}
	public void bounds_merge(Object b1, Object b2) {
		vec3 generatedMin = this.getMin();
		generatedMin.vec3_min(generatedMin, generatedMin);
		vec3 generatedMax = this.getMax();
		generatedMax.vec3_max(generatedMax, generatedMax);
	}
	public void bounds_merge_point(Object b, Object v) {
		vec3 generatedMin = this.getMin();
		generatedMin.vec3_min(generatedMin, v);
		vec3 generatedMax = this.getMax();
		generatedMax.vec3_max(generatedMax, v);
	}
	public void bounds_transform(Object b, Object m) {
		bounds temp = new bounds();
		 b_init = false;
		int i;
		.memset(temp, 0, );
		vec3 generatedMin = temp.getMin();
		vec3 generatedMax = temp.getMax();
		double generatedX = p.getX();
		double generatedY = p.getY();
		double generatedZ = p.getZ();
		for (i = 0; i < 8; i++) {
			vec3 p = new vec3();
			p.bounds_get_point(b, i);
			p.vec3_transform(p, m);
			if (!b_init) {
				generatedMin.vec3_copy(p);
				generatedMax.vec3_copy(p);
				b_init = true;
			} else {
					if (generatedX < generatedX) {
						generatedMin.setX(generatedX);
					}  else if (generatedX > generatedX) {
						generatedMax.setX(generatedX);
					} 
					if (generatedY < generatedY) {
						generatedMin.setY(generatedY);
					}  else if (generatedY > generatedY) {
						generatedMax.setY(generatedY);
					} 
					if (generatedZ < generatedZ) {
						generatedMin.setZ(generatedZ);
					}  else if (generatedZ > generatedZ) {
						generatedMax.setZ(generatedZ);
					} 
			} 
		}
		dst.bounds_copy(temp);
	}
	public void bounds_transform3x4(Object b, Object m) {
		bounds temp = new bounds();
		 b_init = false;
		int i;
		.memset(temp, 0, );
		vec3 generatedMin = temp.getMin();
		vec3 generatedMax = temp.getMax();
		double generatedX = p.getX();
		double generatedY = p.getY();
		double generatedZ = p.getZ();
		for (i = 0; i < 8; i++) {
			vec3 p = new vec3();
			p.bounds_get_point(b, i);
			p.vec3_transform3x4(p, m);
			if (!b_init) {
				generatedMin.vec3_copy(p);
				generatedMax.vec3_copy(p);
				b_init = true;
			} else {
					if (generatedX < generatedX) {
						generatedMin.setX(generatedX);
					}  else if (generatedX > generatedX) {
						generatedMax.setX(generatedX);
					} 
					if (generatedY < generatedY) {
						generatedMin.setY(generatedY);
					}  else if (generatedY > generatedY) {
						generatedMax.setY(generatedY);
					} 
					if (generatedZ < generatedZ) {
						generatedMin.setZ(generatedZ);
					}  else if (generatedZ > generatedZ) {
						generatedMax.setZ(generatedZ);
					} 
			} 
		}
		dst.bounds_copy(temp);
	}
	public vec3 getMin() {
		return min;
	}
	public void setMin(vec3 newMin) {
		min = newMin;
	}
	public vec3 getMax() {
		return max;
	}
	public void setMax(vec3 newMax) {
		max = newMax;
	}
}
