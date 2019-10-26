package application;

public class mfxVPPCompInputStream {
	private Object DstX;
	private Object DstY;
	private Object DstW;
	private Object DstH;
	private Object LumaKeyEnable;
	private Object LumaKeyMin;
	private Object LumaKeyMax;
	private Object GlobalAlphaEnable;
	private Object GlobalAlpha;
	private Object PixelAlphaEnable;
	private Object TileId;
	private Object reserved2;
	
	public mfxVPPCompInputStream(Object DstX, Object DstY, Object DstW, Object DstH, Object LumaKeyEnable, Object LumaKeyMin, Object LumaKeyMax, Object GlobalAlphaEnable, Object GlobalAlpha, Object PixelAlphaEnable, Object TileId, Object reserved2) {
		setDstX(DstX);
		setDstY(DstY);
		setDstW(DstW);
		setDstH(DstH);
		setLumaKeyEnable(LumaKeyEnable);
		setLumaKeyMin(LumaKeyMin);
		setLumaKeyMax(LumaKeyMax);
		setGlobalAlphaEnable(GlobalAlphaEnable);
		setGlobalAlpha(GlobalAlpha);
		setPixelAlphaEnable(PixelAlphaEnable);
		setTileId(TileId);
		setReserved2(reserved2);
	}
	public mfxVPPCompInputStream() {
	}
	
	public Object getDstX() {
		return DstX;
	}
	public void setDstX(Object newDstX) {
		DstX = newDstX;
	}
	public Object getDstY() {
		return DstY;
	}
	public void setDstY(Object newDstY) {
		DstY = newDstY;
	}
	public Object getDstW() {
		return DstW;
	}
	public void setDstW(Object newDstW) {
		DstW = newDstW;
	}
	public Object getDstH() {
		return DstH;
	}
	public void setDstH(Object newDstH) {
		DstH = newDstH;
	}
	public Object getLumaKeyEnable() {
		return LumaKeyEnable;
	}
	public void setLumaKeyEnable(Object newLumaKeyEnable) {
		LumaKeyEnable = newLumaKeyEnable;
	}
	public Object getLumaKeyMin() {
		return LumaKeyMin;
	}
	public void setLumaKeyMin(Object newLumaKeyMin) {
		LumaKeyMin = newLumaKeyMin;
	}
	public Object getLumaKeyMax() {
		return LumaKeyMax;
	}
	public void setLumaKeyMax(Object newLumaKeyMax) {
		LumaKeyMax = newLumaKeyMax;
	}
	public Object getGlobalAlphaEnable() {
		return GlobalAlphaEnable;
	}
	public void setGlobalAlphaEnable(Object newGlobalAlphaEnable) {
		GlobalAlphaEnable = newGlobalAlphaEnable;
	}
	public Object getGlobalAlpha() {
		return GlobalAlpha;
	}
	public void setGlobalAlpha(Object newGlobalAlpha) {
		GlobalAlpha = newGlobalAlpha;
	}
	public Object getPixelAlphaEnable() {
		return PixelAlphaEnable;
	}
	public void setPixelAlphaEnable(Object newPixelAlphaEnable) {
		PixelAlphaEnable = newPixelAlphaEnable;
	}
	public Object getTileId() {
		return TileId;
	}
	public void setTileId(Object newTileId) {
		TileId = newTileId;
	}
	public Object getReserved2() {
		return reserved2;
	}
	public void setReserved2(Object newReserved2) {
		reserved2 = newReserved2;
	}
}
