package application;

public class axisang {
	private double x;
	private double y;
	private double z;
	private double w;
	private Object ptr;
	
	public axisang(double x, double y, double z, double w, Object ptr) {
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		setPtr(ptr);
	}
	public axisang() {
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
	public void axisang_from_quat(Object q) {
		double len;
		double leni;
		len = q.getX() * q.getX() + q.getY() * q.getY() + q.getZ() * q.getZ();
		if (!ModernizedCProgram.close_float(len, 0.0, 1.0E-4)) {
			leni = 1.0 / /*Error: Function owner not recognized*/sqrtf(len);
			this.setX(q.getX() * leni);
			this.setY(q.getY() * leni);
			this.setZ(q.getZ() * leni);
			this.setW(/*Error: Function owner not recognized*/acosf(q.getW()) * 2.0);
		} else {
				this.setX(0.0);
				this.setY(0.0);
				this.setZ(0.0);
				this.setW(0.0);
		} 
	}
	public void axisang_zero() {
		this.setX(0.0);
		this.setY(0.0);
		this.setZ(0.0);
		this.setW(0.0);
	}
	public void axisang_copy(axisang aa) {
		double generatedX = aa.getX();
		this.setX(generatedX);
		double generatedY = aa.getY();
		this.setY(generatedY);
		double generatedZ = aa.getZ();
		this.setZ(generatedZ);
		double generatedW = aa.getW();
		this.setW(generatedW);
	}
	public void axisang_set(double x, double y, double z, double w) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
		this.setW(w);
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
}
