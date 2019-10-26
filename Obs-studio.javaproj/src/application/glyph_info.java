package application;

/******************************************************************************
Copyright (C) 2014 by Nibbles

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
public class glyph_info {
	private double u;
	private double v;
	private double u2;
	private double v2;
	private Object w;
	private Object h;
	private Object xoff;
	private Object yoff;
	private Object xadv;
	
	public glyph_info(double u, double v, double u2, double v2, Object w, Object h, Object xoff, Object yoff, Object xadv) {
		setU(u);
		setV(v);
		setU2(u2);
		setV2(v2);
		setW(w);
		setH(h);
		setXoff(xoff);
		setYoff(yoff);
		setXadv(xadv);
	}
	public glyph_info() {
	}
	
	public double getU() {
		return u;
	}
	public void setU(double newU) {
		u = newU;
	}
	public double getV() {
		return v;
	}
	public void setV(double newV) {
		v = newV;
	}
	public double getU2() {
		return u2;
	}
	public void setU2(double newU2) {
		u2 = newU2;
	}
	public double getV2() {
		return v2;
	}
	public void setV2(double newV2) {
		v2 = newV2;
	}
	public Object getW() {
		return w;
	}
	public void setW(Object newW) {
		w = newW;
	}
	public Object getH() {
		return h;
	}
	public void setH(Object newH) {
		h = newH;
	}
	public Object getXoff() {
		return xoff;
	}
	public void setXoff(Object newXoff) {
		xoff = newXoff;
	}
	public Object getYoff() {
		return yoff;
	}
	public void setYoff(Object newYoff) {
		yoff = newYoff;
	}
	public Object getXadv() {
		return xadv;
	}
	public void setXadv(Object newXadv) {
		xadv = newXadv;
	}
}
