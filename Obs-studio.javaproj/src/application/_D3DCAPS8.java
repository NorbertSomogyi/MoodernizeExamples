package application;

/*==========================================================================;
 *
 *  Copyright (C) Microsoft Corporation.  All Rights Reserved.
 *
 *  File:       d3d8caps.h
 *  Content:    Direct3D capabilities include file
 *
 ***************************************************************************/
//DIRECT3D_VERSION
// include this file content only if compiling for DX8 interfaces
public class _D3DCAPS8 {
	private Object DeviceType;
	private Object AdapterOrdinal;
	private Object Caps;
	private Object Caps2;
	private Object Caps3;
	private Object PresentationIntervals;
	private Object CursorCaps;
	private Object DevCaps;
	private Object PrimitiveMiscCaps;
	private Object RasterCaps;
	private Object ZCmpCaps;
	private Object SrcBlendCaps;
	private Object DestBlendCaps;
	private Object AlphaCmpCaps;
	private Object ShadeCaps;
	private Object TextureCaps;
	private Object TextureFilterCaps;
	private Object CubeTextureFilterCaps;
	private Object VolumeTextureFilterCaps;
	private Object TextureAddressCaps;
	private Object VolumeTextureAddressCaps;
	private Object LineCaps;
	private Object MaxTextureWidth;
	private Object MaxTextureHeight;
	private Object MaxVolumeExtent;
	private Object MaxTextureRepeat;
	private Object MaxTextureAspectRatio;
	private Object MaxAnisotropy;
	private double MaxVertexW;
	private double GuardBandLeft;
	private double GuardBandTop;
	private double GuardBandRight;
	private double GuardBandBottom;
	private double ExtentsAdjust;
	private Object StencilCaps;
	private Object FVFCaps;
	private Object TextureOpCaps;
	private Object MaxTextureBlendStages;
	private Object MaxSimultaneousTextures;
	private Object VertexProcessingCaps;
	private Object MaxActiveLights;
	private Object MaxUserClipPlanes;
	private Object MaxVertexBlendMatrices;
	private Object MaxVertexBlendMatrixIndex;
	private double MaxPointSize;
	private Object MaxPrimitiveCount;
	private Object MaxVertexIndex;
	private Object MaxStreams;
	private Object MaxStreamStride;
	private Object VertexShaderVersion;
	private Object MaxVertexShaderConst;
	private Object PixelShaderVersion;
	private double MaxPixelShaderValue;
	
	public _D3DCAPS8(Object DeviceType, Object AdapterOrdinal, Object Caps, Object Caps2, Object Caps3, Object PresentationIntervals, Object CursorCaps, Object DevCaps, Object PrimitiveMiscCaps, Object RasterCaps, Object ZCmpCaps, Object SrcBlendCaps, Object DestBlendCaps, Object AlphaCmpCaps, Object ShadeCaps, Object TextureCaps, Object TextureFilterCaps, Object CubeTextureFilterCaps, Object VolumeTextureFilterCaps, Object TextureAddressCaps, Object VolumeTextureAddressCaps, Object LineCaps, Object MaxTextureWidth, Object MaxTextureHeight, Object MaxVolumeExtent, Object MaxTextureRepeat, Object MaxTextureAspectRatio, Object MaxAnisotropy, double MaxVertexW, double GuardBandLeft, double GuardBandTop, double GuardBandRight, double GuardBandBottom, double ExtentsAdjust, Object StencilCaps, Object FVFCaps, Object TextureOpCaps, Object MaxTextureBlendStages, Object MaxSimultaneousTextures, Object VertexProcessingCaps, Object MaxActiveLights, Object MaxUserClipPlanes, Object MaxVertexBlendMatrices, Object MaxVertexBlendMatrixIndex, double MaxPointSize, Object MaxPrimitiveCount, Object MaxVertexIndex, Object MaxStreams, Object MaxStreamStride, Object VertexShaderVersion, Object MaxVertexShaderConst, Object PixelShaderVersion, double MaxPixelShaderValue) {
		setDeviceType(DeviceType);
		setAdapterOrdinal(AdapterOrdinal);
		setCaps(Caps);
		setCaps2(Caps2);
		setCaps3(Caps3);
		setPresentationIntervals(PresentationIntervals);
		setCursorCaps(CursorCaps);
		setDevCaps(DevCaps);
		setPrimitiveMiscCaps(PrimitiveMiscCaps);
		setRasterCaps(RasterCaps);
		setZCmpCaps(ZCmpCaps);
		setSrcBlendCaps(SrcBlendCaps);
		setDestBlendCaps(DestBlendCaps);
		setAlphaCmpCaps(AlphaCmpCaps);
		setShadeCaps(ShadeCaps);
		setTextureCaps(TextureCaps);
		setTextureFilterCaps(TextureFilterCaps);
		setCubeTextureFilterCaps(CubeTextureFilterCaps);
		setVolumeTextureFilterCaps(VolumeTextureFilterCaps);
		setTextureAddressCaps(TextureAddressCaps);
		setVolumeTextureAddressCaps(VolumeTextureAddressCaps);
		setLineCaps(LineCaps);
		setMaxTextureWidth(MaxTextureWidth);
		setMaxTextureHeight(MaxTextureHeight);
		setMaxVolumeExtent(MaxVolumeExtent);
		setMaxTextureRepeat(MaxTextureRepeat);
		setMaxTextureAspectRatio(MaxTextureAspectRatio);
		setMaxAnisotropy(MaxAnisotropy);
		setMaxVertexW(MaxVertexW);
		setGuardBandLeft(GuardBandLeft);
		setGuardBandTop(GuardBandTop);
		setGuardBandRight(GuardBandRight);
		setGuardBandBottom(GuardBandBottom);
		setExtentsAdjust(ExtentsAdjust);
		setStencilCaps(StencilCaps);
		setFVFCaps(FVFCaps);
		setTextureOpCaps(TextureOpCaps);
		setMaxTextureBlendStages(MaxTextureBlendStages);
		setMaxSimultaneousTextures(MaxSimultaneousTextures);
		setVertexProcessingCaps(VertexProcessingCaps);
		setMaxActiveLights(MaxActiveLights);
		setMaxUserClipPlanes(MaxUserClipPlanes);
		setMaxVertexBlendMatrices(MaxVertexBlendMatrices);
		setMaxVertexBlendMatrixIndex(MaxVertexBlendMatrixIndex);
		setMaxPointSize(MaxPointSize);
		setMaxPrimitiveCount(MaxPrimitiveCount);
		setMaxVertexIndex(MaxVertexIndex);
		setMaxStreams(MaxStreams);
		setMaxStreamStride(MaxStreamStride);
		setVertexShaderVersion(VertexShaderVersion);
		setMaxVertexShaderConst(MaxVertexShaderConst);
		setPixelShaderVersion(PixelShaderVersion);
		setMaxPixelShaderValue(MaxPixelShaderValue);
	}
	public _D3DCAPS8() {
	}
	
	public Object getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(Object newDeviceType) {
		DeviceType = newDeviceType;
	}
	public Object getAdapterOrdinal() {
		return AdapterOrdinal;
	}
	public void setAdapterOrdinal(Object newAdapterOrdinal) {
		AdapterOrdinal = newAdapterOrdinal;
	}
	public Object getCaps() {
		return Caps;
	}
	public void setCaps(Object newCaps) {
		Caps = newCaps;
	}
	public Object getCaps2() {
		return Caps2;
	}
	public void setCaps2(Object newCaps2) {
		Caps2 = newCaps2;
	}
	public Object getCaps3() {
		return Caps3;
	}
	public void setCaps3(Object newCaps3) {
		Caps3 = newCaps3;
	}
	public Object getPresentationIntervals() {
		return PresentationIntervals;
	}
	public void setPresentationIntervals(Object newPresentationIntervals) {
		PresentationIntervals = newPresentationIntervals;
	}
	public Object getCursorCaps() {
		return CursorCaps;
	}
	public void setCursorCaps(Object newCursorCaps) {
		CursorCaps = newCursorCaps;
	}
	public Object getDevCaps() {
		return DevCaps;
	}
	public void setDevCaps(Object newDevCaps) {
		DevCaps = newDevCaps;
	}
	public Object getPrimitiveMiscCaps() {
		return PrimitiveMiscCaps;
	}
	public void setPrimitiveMiscCaps(Object newPrimitiveMiscCaps) {
		PrimitiveMiscCaps = newPrimitiveMiscCaps;
	}
	public Object getRasterCaps() {
		return RasterCaps;
	}
	public void setRasterCaps(Object newRasterCaps) {
		RasterCaps = newRasterCaps;
	}
	public Object getZCmpCaps() {
		return ZCmpCaps;
	}
	public void setZCmpCaps(Object newZCmpCaps) {
		ZCmpCaps = newZCmpCaps;
	}
	public Object getSrcBlendCaps() {
		return SrcBlendCaps;
	}
	public void setSrcBlendCaps(Object newSrcBlendCaps) {
		SrcBlendCaps = newSrcBlendCaps;
	}
	public Object getDestBlendCaps() {
		return DestBlendCaps;
	}
	public void setDestBlendCaps(Object newDestBlendCaps) {
		DestBlendCaps = newDestBlendCaps;
	}
	public Object getAlphaCmpCaps() {
		return AlphaCmpCaps;
	}
	public void setAlphaCmpCaps(Object newAlphaCmpCaps) {
		AlphaCmpCaps = newAlphaCmpCaps;
	}
	public Object getShadeCaps() {
		return ShadeCaps;
	}
	public void setShadeCaps(Object newShadeCaps) {
		ShadeCaps = newShadeCaps;
	}
	public Object getTextureCaps() {
		return TextureCaps;
	}
	public void setTextureCaps(Object newTextureCaps) {
		TextureCaps = newTextureCaps;
	}
	public Object getTextureFilterCaps() {
		return TextureFilterCaps;
	}
	public void setTextureFilterCaps(Object newTextureFilterCaps) {
		TextureFilterCaps = newTextureFilterCaps;
	}
	public Object getCubeTextureFilterCaps() {
		return CubeTextureFilterCaps;
	}
	public void setCubeTextureFilterCaps(Object newCubeTextureFilterCaps) {
		CubeTextureFilterCaps = newCubeTextureFilterCaps;
	}
	public Object getVolumeTextureFilterCaps() {
		return VolumeTextureFilterCaps;
	}
	public void setVolumeTextureFilterCaps(Object newVolumeTextureFilterCaps) {
		VolumeTextureFilterCaps = newVolumeTextureFilterCaps;
	}
	public Object getTextureAddressCaps() {
		return TextureAddressCaps;
	}
	public void setTextureAddressCaps(Object newTextureAddressCaps) {
		TextureAddressCaps = newTextureAddressCaps;
	}
	public Object getVolumeTextureAddressCaps() {
		return VolumeTextureAddressCaps;
	}
	public void setVolumeTextureAddressCaps(Object newVolumeTextureAddressCaps) {
		VolumeTextureAddressCaps = newVolumeTextureAddressCaps;
	}
	public Object getLineCaps() {
		return LineCaps;
	}
	public void setLineCaps(Object newLineCaps) {
		LineCaps = newLineCaps;
	}
	public Object getMaxTextureWidth() {
		return MaxTextureWidth;
	}
	public void setMaxTextureWidth(Object newMaxTextureWidth) {
		MaxTextureWidth = newMaxTextureWidth;
	}
	public Object getMaxTextureHeight() {
		return MaxTextureHeight;
	}
	public void setMaxTextureHeight(Object newMaxTextureHeight) {
		MaxTextureHeight = newMaxTextureHeight;
	}
	public Object getMaxVolumeExtent() {
		return MaxVolumeExtent;
	}
	public void setMaxVolumeExtent(Object newMaxVolumeExtent) {
		MaxVolumeExtent = newMaxVolumeExtent;
	}
	public Object getMaxTextureRepeat() {
		return MaxTextureRepeat;
	}
	public void setMaxTextureRepeat(Object newMaxTextureRepeat) {
		MaxTextureRepeat = newMaxTextureRepeat;
	}
	public Object getMaxTextureAspectRatio() {
		return MaxTextureAspectRatio;
	}
	public void setMaxTextureAspectRatio(Object newMaxTextureAspectRatio) {
		MaxTextureAspectRatio = newMaxTextureAspectRatio;
	}
	public Object getMaxAnisotropy() {
		return MaxAnisotropy;
	}
	public void setMaxAnisotropy(Object newMaxAnisotropy) {
		MaxAnisotropy = newMaxAnisotropy;
	}
	public double getMaxVertexW() {
		return MaxVertexW;
	}
	public void setMaxVertexW(double newMaxVertexW) {
		MaxVertexW = newMaxVertexW;
	}
	public double getGuardBandLeft() {
		return GuardBandLeft;
	}
	public void setGuardBandLeft(double newGuardBandLeft) {
		GuardBandLeft = newGuardBandLeft;
	}
	public double getGuardBandTop() {
		return GuardBandTop;
	}
	public void setGuardBandTop(double newGuardBandTop) {
		GuardBandTop = newGuardBandTop;
	}
	public double getGuardBandRight() {
		return GuardBandRight;
	}
	public void setGuardBandRight(double newGuardBandRight) {
		GuardBandRight = newGuardBandRight;
	}
	public double getGuardBandBottom() {
		return GuardBandBottom;
	}
	public void setGuardBandBottom(double newGuardBandBottom) {
		GuardBandBottom = newGuardBandBottom;
	}
	public double getExtentsAdjust() {
		return ExtentsAdjust;
	}
	public void setExtentsAdjust(double newExtentsAdjust) {
		ExtentsAdjust = newExtentsAdjust;
	}
	public Object getStencilCaps() {
		return StencilCaps;
	}
	public void setStencilCaps(Object newStencilCaps) {
		StencilCaps = newStencilCaps;
	}
	public Object getFVFCaps() {
		return FVFCaps;
	}
	public void setFVFCaps(Object newFVFCaps) {
		FVFCaps = newFVFCaps;
	}
	public Object getTextureOpCaps() {
		return TextureOpCaps;
	}
	public void setTextureOpCaps(Object newTextureOpCaps) {
		TextureOpCaps = newTextureOpCaps;
	}
	public Object getMaxTextureBlendStages() {
		return MaxTextureBlendStages;
	}
	public void setMaxTextureBlendStages(Object newMaxTextureBlendStages) {
		MaxTextureBlendStages = newMaxTextureBlendStages;
	}
	public Object getMaxSimultaneousTextures() {
		return MaxSimultaneousTextures;
	}
	public void setMaxSimultaneousTextures(Object newMaxSimultaneousTextures) {
		MaxSimultaneousTextures = newMaxSimultaneousTextures;
	}
	public Object getVertexProcessingCaps() {
		return VertexProcessingCaps;
	}
	public void setVertexProcessingCaps(Object newVertexProcessingCaps) {
		VertexProcessingCaps = newVertexProcessingCaps;
	}
	public Object getMaxActiveLights() {
		return MaxActiveLights;
	}
	public void setMaxActiveLights(Object newMaxActiveLights) {
		MaxActiveLights = newMaxActiveLights;
	}
	public Object getMaxUserClipPlanes() {
		return MaxUserClipPlanes;
	}
	public void setMaxUserClipPlanes(Object newMaxUserClipPlanes) {
		MaxUserClipPlanes = newMaxUserClipPlanes;
	}
	public Object getMaxVertexBlendMatrices() {
		return MaxVertexBlendMatrices;
	}
	public void setMaxVertexBlendMatrices(Object newMaxVertexBlendMatrices) {
		MaxVertexBlendMatrices = newMaxVertexBlendMatrices;
	}
	public Object getMaxVertexBlendMatrixIndex() {
		return MaxVertexBlendMatrixIndex;
	}
	public void setMaxVertexBlendMatrixIndex(Object newMaxVertexBlendMatrixIndex) {
		MaxVertexBlendMatrixIndex = newMaxVertexBlendMatrixIndex;
	}
	public double getMaxPointSize() {
		return MaxPointSize;
	}
	public void setMaxPointSize(double newMaxPointSize) {
		MaxPointSize = newMaxPointSize;
	}
	public Object getMaxPrimitiveCount() {
		return MaxPrimitiveCount;
	}
	public void setMaxPrimitiveCount(Object newMaxPrimitiveCount) {
		MaxPrimitiveCount = newMaxPrimitiveCount;
	}
	public Object getMaxVertexIndex() {
		return MaxVertexIndex;
	}
	public void setMaxVertexIndex(Object newMaxVertexIndex) {
		MaxVertexIndex = newMaxVertexIndex;
	}
	public Object getMaxStreams() {
		return MaxStreams;
	}
	public void setMaxStreams(Object newMaxStreams) {
		MaxStreams = newMaxStreams;
	}
	public Object getMaxStreamStride() {
		return MaxStreamStride;
	}
	public void setMaxStreamStride(Object newMaxStreamStride) {
		MaxStreamStride = newMaxStreamStride;
	}
	public Object getVertexShaderVersion() {
		return VertexShaderVersion;
	}
	public void setVertexShaderVersion(Object newVertexShaderVersion) {
		VertexShaderVersion = newVertexShaderVersion;
	}
	public Object getMaxVertexShaderConst() {
		return MaxVertexShaderConst;
	}
	public void setMaxVertexShaderConst(Object newMaxVertexShaderConst) {
		MaxVertexShaderConst = newMaxVertexShaderConst;
	}
	public Object getPixelShaderVersion() {
		return PixelShaderVersion;
	}
	public void setPixelShaderVersion(Object newPixelShaderVersion) {
		PixelShaderVersion = newPixelShaderVersion;
	}
	public double getMaxPixelShaderValue() {
		return MaxPixelShaderValue;
	}
	public void setMaxPixelShaderValue(double newMaxPixelShaderValue) {
		MaxPixelShaderValue = newMaxPixelShaderValue;
	}
}
