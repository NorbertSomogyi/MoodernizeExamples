package application;

public class plane {
	private vec3 dir;
	private double dist;
	
	public plane(vec3 dir, double dist) {
		setDir(dir);
		setDist(dist);
	}
	public plane() {
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
	public void plane_from_tri(Object v1, Object v2, Object v3) {
		vec3 temp = new vec3();
		temp.vec3_sub(v2, v1);
		vec3 generatedDir = this.getDir();
		generatedDir.vec3_sub(v3, v1);
		generatedDir.vec3_cross(temp, generatedDir);
		generatedDir.vec3_norm(generatedDir);
		this.setDist(ModernizedCProgram.vec3_dot(v1, generatedDir));
	}
	public void plane_transform(Object p, Object m) {
		vec3 temp = new vec3();
		temp.vec3_zero();
		vec3 generatedDir = this.getDir();
		generatedDir.vec3_transform(generatedDir, m);
		generatedDir.vec3_norm(generatedDir);
		temp.vec3_transform(temp, m);
		this.setDist(p.getDist() - ModernizedCProgram.vec3_dot(generatedDir, temp));
	}
	public void plane_transform3x4(Object p, Object m) {
		vec3 temp = new vec3();
		vec3 generatedDir = this.getDir();
		generatedDir.vec3_transform3x4(generatedDir, m);
		generatedDir.vec3_norm(generatedDir);
		temp.vec3_transform3x4(m.getT(), m);
		this.setDist(p.getDist() - ModernizedCProgram.vec3_dot(generatedDir, temp));
	}
	public void plane_copy(Object p) {
		vec3 generatedDir = this.getDir();
		generatedDir.vec3_copy(generatedDir);
		this.setDist(p.getDist());
	}
	public void plane_set(Object dir, double dist) {
		vec3 generatedDir = this.getDir();
		generatedDir.vec3_copy(dir);
		this.setDist(dist);
	}
	public void plane_setf(double a, double b, double c, double d) {
		vec3 generatedDir = this.getDir();
		generatedDir.vec3_set(a, b, c);
		this.setDist(d);
	}
	public vec3 getDir() {
		return dir;
	}
	public void setDir(vec3 newDir) {
		dir = newDir;
	}
	public double getDist() {
		return dist;
	}
	public void setDist(double newDist) {
		dist = newDist;
	}
}
