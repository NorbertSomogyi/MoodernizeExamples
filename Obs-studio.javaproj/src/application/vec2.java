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
public class vec2 {
	private double x;
	private double y;
	private Object ptr;
	
	public vec2(double x, double y, Object ptr) {
		setX(x);
		setY(y);
		setPtr(ptr);
	}
	public vec2() {
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
	public void vec2_abs(Object v) {
		dst.vec2_set(/*Error: Function owner not recognized*/fabsf(v.getX()), /*Error: Function owner not recognized*/fabsf(v.getY()));
	}
	public void vec2_floor(Object v) {
		dst.vec2_set(/*Error: Function owner not recognized*/floorf(v.getX()), /*Error: Function owner not recognized*/floorf(v.getY()));
	}
	public void vec2_ceil(Object v) {
		dst.vec2_set(/*Error: Function owner not recognized*/ceilf(v.getX()), /*Error: Function owner not recognized*/ceilf(v.getY()));
	}
	public void vec2_norm(Object v) {
		double len = ModernizedCProgram.vec2_len(v);
		if (len > 0.0) {
			len = 1.0 / len;
			dst.vec2_mulf(v, len);
		} 
	}
	public void add_alignment(Object align, int cx, int cy) {
		Object generatedVec2 = this.getVec2();
		if (align & (1 << 1)) {
			generatedVec2 += (double)cx;
		}  else if ((align & (1 << 0)) == 0) {
			generatedVec2 += (double)(cx / 2);
		} 
		if (align & (1 << 3)) {
			generatedVec2 += (double)cy;
		}  else if ((align & (1 << 2)) == 0) {
			generatedVec2 += (double)(cy / 2);
		} 
	}
	public void obs_sceneitem_get_pos(Object item) {
		if (item) {
			pos.vec2_copy(item.getPos());
		} 
	}
	public void obs_sceneitem_get_scale(Object item) {
		if (item) {
			scale.vec2_copy(item.getScale());
		} 
	}
	public void obs_sceneitem_get_bounds(Object item) {
		if (item) {
			bounds = item.getBounds();
		} 
	}
	public void obs_sceneitem_get_box_scale(Object item) {
		if (item) {
			scale = item.getBox_scale();
		} 
	}
	public void vec2_zero() {
		this.setX(0.0);
		this.setY(0.0);
	}
	public void vec2_set(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	public void vec2_copy(Object v) {
		this.setX(v.getX());
		this.setY(v.getY());
	}
	public void vec2_add(Object v1, Object v2) {
		dst.vec2_set(v1.getX() + v2.getX(), v1.getY() + v2.getY());
	}
	public void vec2_sub(Object v1, Object v2) {
		dst.vec2_set(v1.getX() - v2.getX(), v1.getY() - v2.getY());
	}
	public void vec2_mul(Object v1, Object v2) {
		dst.vec2_set(v1.getX() * v2.getX(), v1.getY() * v2.getY());
	}
	public void vec2_div(Object v1, Object v2) {
		dst.vec2_set(v1.getX() / v2.getX(), v1.getY() / v2.getY());
	}
	public void vec2_addf(Object v, double f) {
		dst.vec2_set(v.getX() + f, v.getY() + f);
	}
	public void vec2_subf(Object v, double f) {
		dst.vec2_set(v.getX() - f, v.getY() - f);
	}
	public void vec2_mulf(Object v, double f) {
		dst.vec2_set(v.getX() * f, v.getY() * f);
	}
	public void vec2_divf(Object v, double f) {
		dst.vec2_set(v.getX() / f, v.getY() / f);
	}
	public void vec2_neg(Object v) {
		dst.vec2_set(-v.getX(), -v.getY());
	}
	public void vec2_minf(Object v, double val) {
		if (v.getX() < val) {
			this.setX(val);
		} 
		if (v.getY() < val) {
			this.setY(val);
		} 
	}
	public void vec2_min(Object v, Object min_v) {
		if (v.getX() < min_v.getX()) {
			this.setX(min_v.getX());
		} 
		if (v.getY() < min_v.getY()) {
			this.setY(min_v.getY());
		} 
	}
	public void vec2_maxf(Object v, double val) {
		if (v.getX() > val) {
			this.setX(val);
		} 
		if (v.getY() > val) {
			this.setY(val);
		} 
	}
	public void vec2_max(Object v, Object max_v) {
		if (v.getX() > max_v.getX()) {
			this.setX(max_v.getX());
		} 
		if (v.getY() > max_v.getY()) {
			this.setY(max_v.getY());
		} 
	}
	public void norm_to_polar(Object norm) {
		this.setX(/*Error: Function owner not recognized*/atan2f(norm.getX(), norm.getZ()));
		this.setY(/*Error: Function owner not recognized*/asinf(norm.getY()));
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
	public Object getPtr() {
		return ptr;
	}
	public void setPtr(Object newPtr) {
		ptr = newPtr;
	}
}
