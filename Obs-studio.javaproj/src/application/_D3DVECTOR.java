package application;

/*==========================================================================;
 *
 *  Copyright (C) Microsoft Corporation.  All Rights Reserved.
 *
 *  File:       d3d8types.h
 *  Content:    Direct3D capabilities include file
 *
 ***************************************************************************/
//DIRECT3D_VERSION
// include this file content only if compiling for DX8 interfaces
// anonymous unions warning
// D3DCOLOR is equivalent to D3DFMT_A8R8G8B8
// maps unsigned 8 bits/channel to D3DCOLOR
// maps floating point channels (0.f to 1.f range) to D3DCOLOR
public class _D3DVECTOR {
	private double x;
	private double y;
	private double z;
	
	public _D3DVECTOR(double x, double y, double z) {
		setX(x);
		setY(y);
		setZ(z);
	}
	public _D3DVECTOR() {
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
}
