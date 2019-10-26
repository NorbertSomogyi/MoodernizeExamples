package application;

public class VTermPen {
	private  fg;
	private  bg;
	private int bold;
	private int underline;
	private int italic;
	private int blink;
	private int reverse;
	private int strike;
	private int font;
	
	public VTermPen( fg,  bg, int bold, int underline, int italic, int blink, int reverse, int strike, int font) {
		setFg(fg);
		setBg(bg);
		setBold(bold);
		setUnderline(underline);
		setItalic(italic);
		setBlink(blink);
		setReverse(reverse);
		setStrike(strike);
		setFont(font);
	}
	public VTermPen() {
	}
	
	public  getFg() {
		return fg;
	}
	public void setFg( newFg) {
		fg = newFg;
	}
	public  getBg() {
		return bg;
	}
	public void setBg( newBg) {
		bg = newBg;
	}
	public int getBold() {
		return bold;
	}
	public void setBold(int newBold) {
		bold = newBold;
	}
	public int getUnderline() {
		return underline;
	}
	public void setUnderline(int newUnderline) {
		underline = newUnderline;
	}
	public int getItalic() {
		return italic;
	}
	public void setItalic(int newItalic) {
		italic = newItalic;
	}
	public int getBlink() {
		return blink;
	}
	public void setBlink(int newBlink) {
		blink = newBlink;
	}
	public int getReverse() {
		return reverse;
	}
	public void setReverse(int newReverse) {
		reverse = newReverse;
	}
	public int getStrike() {
		return strike;
	}
	public void setStrike(int newStrike) {
		strike = newStrike;
	}
	public int getFont() {
		return font;
	}
	public void setFont(int newFont) {
		font = newFont;
	}
}
