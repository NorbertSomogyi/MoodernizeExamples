package application;

public class DWriteContext {
	private Object mHDC;
	private tagRECT mBindRect;
	private DrawingMode mDMode;
	private Object mInteropHDC;
	private boolean mDrawing;
	private boolean mFallbackDC;
	private Object mD2D1Factory;
	private Object mRT;
	private Object mGDIRT;
	private Object mBrush;
	private Object mBitmap;
	private Object mDWriteFactory;
	private Object mGdiInterop;
	private Object mRenderingParams;
	private FontCache mFontCache;
	private Object mTextFormat;
	private Object mFontWeight;
	private Object mFontStyle;
	private Object mTextAntialiasMode;
	
	public DWriteContext(Object mHDC, tagRECT mBindRect, DrawingMode mDMode, Object mInteropHDC, boolean mDrawing, boolean mFallbackDC, Object mD2D1Factory, Object mRT, Object mGDIRT, Object mBrush, Object mBitmap, Object mDWriteFactory, Object mGdiInterop, Object mRenderingParams, FontCache mFontCache, Object mTextFormat, Object mFontWeight, Object mFontStyle, Object mTextAntialiasMode) {
		setMHDC(mHDC);
		setMBindRect(mBindRect);
		setMDMode(mDMode);
		setMInteropHDC(mInteropHDC);
		setMDrawing(mDrawing);
		setMFallbackDC(mFallbackDC);
		setMD2D1Factory(mD2D1Factory);
		setMRT(mRT);
		setMGDIRT(mGDIRT);
		setMBrush(mBrush);
		setMBitmap(mBitmap);
		setMDWriteFactory(mDWriteFactory);
		setMGdiInterop(mGdiInterop);
		setMRenderingParams(mRenderingParams);
		setMFontCache(mFontCache);
		setMTextFormat(mTextFormat);
		setMFontWeight(mFontWeight);
		setMFontStyle(mFontStyle);
		setMTextAntialiasMode(mTextAntialiasMode);
	}
	public DWriteContext() {
	}
	
	public Object TextRenderer() {
		ModernizedCProgram.AddRef();
	}
	public DWriteContext DWriteContext_Open() {
		return ;
	}
	public void DWriteContext_BindDC(Object hdc, Object rect) {
		if (ctx != 0) {
			.UNRECOGNIZEDFUNCTIONNAME(hdc, rect);
		} 
	}
	public void DWriteContext_SetFont(Object hFont) {
		if (ctx != 0) {
			.UNRECOGNIZEDFUNCTIONNAME(hFont);
		} 
	}
	public void DWriteContext_DrawText(Object text, int len, int x, int y, int w, int h, int cellWidth, Object color, Object fuOptions, Object lprc, Object lpDx) {
		if (ctx != 0) {
			.UNRECOGNIZEDFUNCTIONNAME(text, len, x, y, w, h, cellWidth, color, fuOptions, lprc, lpDx);
		} 
	}
	public void DWriteContext_FillRect(Object rc, Object color) {
		if (ctx != 0) {
			.UNRECOGNIZEDFUNCTIONNAME(rc, color);
		} 
	}
	public void DWriteContext_DrawLine(int x1, int y1, int x2, int y2, Object color) {
		if (ctx != 0) {
			.UNRECOGNIZEDFUNCTIONNAME(x1, y1, x2, y2, color);
		} 
	}
	public void DWriteContext_SetPixel(int x, int y, Object color) {
		if (ctx != 0) {
			.UNRECOGNIZEDFUNCTIONNAME(x, y, color);
		} 
	}
	public void DWriteContext_Scroll(int x, int y, Object rc) {
		if (ctx != 0) {
			.UNRECOGNIZEDFUNCTIONNAME(x, y, rc);
		} 
	}
	public void DWriteContext_Flush() {
		if (ctx != 0) {
			.UNRECOGNIZEDFUNCTIONNAME();
		} 
	}
	public void DWriteContext_Close() {
		;
	}
	public void DWriteContext_SetRenderingParams(Object params) {
		if (ctx != 0) {
			.UNRECOGNIZEDFUNCTIONNAME(params);
		} 
	}
	public Object getMHDC() {
		return mHDC;
	}
	public void setMHDC(Object newMHDC) {
		mHDC = newMHDC;
	}
	public tagRECT getMBindRect() {
		return mBindRect;
	}
	public void setMBindRect(tagRECT newMBindRect) {
		mBindRect = newMBindRect;
	}
	public DrawingMode getMDMode() {
		return mDMode;
	}
	public void setMDMode(DrawingMode newMDMode) {
		mDMode = newMDMode;
	}
	public Object getMInteropHDC() {
		return mInteropHDC;
	}
	public void setMInteropHDC(Object newMInteropHDC) {
		mInteropHDC = newMInteropHDC;
	}
	public boolean getMDrawing() {
		return mDrawing;
	}
	public void setMDrawing(boolean newMDrawing) {
		mDrawing = newMDrawing;
	}
	public boolean getMFallbackDC() {
		return mFallbackDC;
	}
	public void setMFallbackDC(boolean newMFallbackDC) {
		mFallbackDC = newMFallbackDC;
	}
	public Object getMD2D1Factory() {
		return mD2D1Factory;
	}
	public void setMD2D1Factory(Object newMD2D1Factory) {
		mD2D1Factory = newMD2D1Factory;
	}
	public Object getMRT() {
		return mRT;
	}
	public void setMRT(Object newMRT) {
		mRT = newMRT;
	}
	public Object getMGDIRT() {
		return mGDIRT;
	}
	public void setMGDIRT(Object newMGDIRT) {
		mGDIRT = newMGDIRT;
	}
	public Object getMBrush() {
		return mBrush;
	}
	public void setMBrush(Object newMBrush) {
		mBrush = newMBrush;
	}
	public Object getMBitmap() {
		return mBitmap;
	}
	public void setMBitmap(Object newMBitmap) {
		mBitmap = newMBitmap;
	}
	public Object getMDWriteFactory() {
		return mDWriteFactory;
	}
	public void setMDWriteFactory(Object newMDWriteFactory) {
		mDWriteFactory = newMDWriteFactory;
	}
	public Object getMGdiInterop() {
		return mGdiInterop;
	}
	public void setMGdiInterop(Object newMGdiInterop) {
		mGdiInterop = newMGdiInterop;
	}
	public Object getMRenderingParams() {
		return mRenderingParams;
	}
	public void setMRenderingParams(Object newMRenderingParams) {
		mRenderingParams = newMRenderingParams;
	}
	public FontCache getMFontCache() {
		return mFontCache;
	}
	public void setMFontCache(FontCache newMFontCache) {
		mFontCache = newMFontCache;
	}
	public Object getMTextFormat() {
		return mTextFormat;
	}
	public void setMTextFormat(Object newMTextFormat) {
		mTextFormat = newMTextFormat;
	}
	public Object getMFontWeight() {
		return mFontWeight;
	}
	public void setMFontWeight(Object newMFontWeight) {
		mFontWeight = newMFontWeight;
	}
	public Object getMFontStyle() {
		return mFontStyle;
	}
	public void setMFontStyle(Object newMFontStyle) {
		mFontStyle = newMFontStyle;
	}
	public Object getMTextAntialiasMode() {
		return mTextAntialiasMode;
	}
	public void setMTextAntialiasMode(Object newMTextAntialiasMode) {
		mTextAntialiasMode = newMTextAntialiasMode;
	}
}
