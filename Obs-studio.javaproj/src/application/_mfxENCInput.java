package application;

/******************************************************************************* *\

Copyright (C) 2014-2018 Intel Corporation.  All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
- Redistributions of source code must retain the above copyright notice,
this list of conditions and the following disclaimer.
- Redistributions in binary form must reproduce the above copyright notice,
this list of conditions and the following disclaimer in the documentation
and/or other materials provided with the distribution.
- Neither the name of Intel Corporation nor the names of its contributors
may be used to endorse or promote products derived from this software
without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY INTEL CORPORATION "AS IS" AND ANY EXPRESS OR
IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL INTEL CORPORATION BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

File Name: mfxenc.h

*******************************************************************************/
/* __cplusplus */
public class _mfxENCInput {
	private Object reserved;
	private  InSurface;
	private Object NumFrameL0;
	private  L0Surface;
	private Object NumFrameL1;
	private  L1Surface;
	private Object NumExtParam;
	private  ExtParam;
	
	public _mfxENCInput(Object reserved,  InSurface, Object NumFrameL0,  L0Surface, Object NumFrameL1,  L1Surface, Object NumExtParam,  ExtParam) {
		setReserved(reserved);
		setInSurface(InSurface);
		setNumFrameL0(NumFrameL0);
		setL0Surface(L0Surface);
		setNumFrameL1(NumFrameL1);
		setL1Surface(L1Surface);
		setNumExtParam(NumExtParam);
		setExtParam(ExtParam);
	}
	public _mfxENCInput() {
	}
	
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public  getInSurface() {
		return InSurface;
	}
	public void setInSurface( newInSurface) {
		InSurface = newInSurface;
	}
	public Object getNumFrameL0() {
		return NumFrameL0;
	}
	public void setNumFrameL0(Object newNumFrameL0) {
		NumFrameL0 = newNumFrameL0;
	}
	public  getL0Surface() {
		return L0Surface;
	}
	public void setL0Surface( newL0Surface) {
		L0Surface = newL0Surface;
	}
	public Object getNumFrameL1() {
		return NumFrameL1;
	}
	public void setNumFrameL1(Object newNumFrameL1) {
		NumFrameL1 = newNumFrameL1;
	}
	public  getL1Surface() {
		return L1Surface;
	}
	public void setL1Surface( newL1Surface) {
		L1Surface = newL1Surface;
	}
	public Object getNumExtParam() {
		return NumExtParam;
	}
	public void setNumExtParam(Object newNumExtParam) {
		NumExtParam = newNumExtParam;
	}
	public  getExtParam() {
		return ExtParam;
	}
	public void setExtParam( newExtParam) {
		ExtParam = newExtParam;
	}
}
