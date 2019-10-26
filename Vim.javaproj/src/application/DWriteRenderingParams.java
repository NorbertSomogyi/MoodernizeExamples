package application;

public class DWriteRenderingParams {
	private double gamma;
	private double enhancedContrast;
	private double clearTypeLevel;
	private int pixelGeometry;
	private int renderingMode;
	private int textAntialiasMode;
	
	public DWriteRenderingParams(double gamma, double enhancedContrast, double clearTypeLevel, int pixelGeometry, int renderingMode, int textAntialiasMode) {
		setGamma(gamma);
		setEnhancedContrast(enhancedContrast);
		setClearTypeLevel(clearTypeLevel);
		setPixelGeometry(pixelGeometry);
		setRenderingMode(renderingMode);
		setTextAntialiasMode(textAntialiasMode);
	}
	public DWriteRenderingParams() {
	}
	
	public DWriteRenderingParams GetRenderingParams() {
		if (ModernizedCProgram.params != 0 && mRenderingParams != 0) {
			ModernizedCProgram.params.setGamma(.UNRECOGNIZEDFUNCTIONNAME());
			ModernizedCProgram.params.setEnhancedContrast(.UNRECOGNIZEDFUNCTIONNAME());
			ModernizedCProgram.params.setClearTypeLevel(.UNRECOGNIZEDFUNCTIONNAME());
			ModernizedCProgram.params.setPixelGeometry(ModernizedCProgram.ToInt(.UNRECOGNIZEDFUNCTIONNAME()));
			ModernizedCProgram.params.setRenderingMode(ModernizedCProgram.ToInt(.UNRECOGNIZEDFUNCTIONNAME()));
			ModernizedCProgram.params.setTextAntialiasMode(mTextAntialiasMode);
		} 
		return ModernizedCProgram.params;////////////////////////////////////////////////////////////////////////////
	}
	public DWriteRenderingParams DWriteContext_GetRenderingParams(DWriteContext ctx) {
		if (ctx != 0) {
			return .UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.params);
		} else {
				return 0;
		} 
	}
	public double getGamma() {
		return gamma;
	}
	public void setGamma(double newGamma) {
		gamma = newGamma;
	}
	public double getEnhancedContrast() {
		return enhancedContrast;
	}
	public void setEnhancedContrast(double newEnhancedContrast) {
		enhancedContrast = newEnhancedContrast;
	}
	public double getClearTypeLevel() {
		return clearTypeLevel;
	}
	public void setClearTypeLevel(double newClearTypeLevel) {
		clearTypeLevel = newClearTypeLevel;
	}
	public int getPixelGeometry() {
		return pixelGeometry;
	}
	public void setPixelGeometry(int newPixelGeometry) {
		pixelGeometry = newPixelGeometry;
	}
	public int getRenderingMode() {
		return renderingMode;
	}
	public void setRenderingMode(int newRenderingMode) {
		renderingMode = newRenderingMode;
	}
	public int getTextAntialiasMode() {
		return textAntialiasMode;
	}
	public void setTextAntialiasMode(int newTextAntialiasMode) {
		textAntialiasMode = newTextAntialiasMode;
	}
}
