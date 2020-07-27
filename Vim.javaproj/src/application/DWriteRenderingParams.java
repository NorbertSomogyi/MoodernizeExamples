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
