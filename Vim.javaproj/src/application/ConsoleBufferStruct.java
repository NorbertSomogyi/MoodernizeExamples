package application;

public class ConsoleBufferStruct {
	private Object IsValid;
	private _CONSOLE_SCREEN_BUFFER_INFO Info;
	private Object Buffer;
	private _COORD BufferSize;
	private Object Regions;
	private int NumRegions;
	
	public ConsoleBufferStruct(Object IsValid, _CONSOLE_SCREEN_BUFFER_INFO Info, Object Buffer, _COORD BufferSize, Object Regions, int NumRegions) {
		setIsValid(IsValid);
		setInfo(Info);
		setBuffer(Buffer);
		setBufferSize(BufferSize);
		setRegions(Regions);
		setNumRegions(NumRegions);
	}
	public ConsoleBufferStruct() {
	}
	
	public Object SaveConsoleBuffer() {
		DWORD NumCells = new DWORD();
		COORD BufferCoord = new COORD();
		SMALL_RECT ReadRegion = new SMALL_RECT();
		WORD Y = new WORD();
		WORD Y_incr = new WORD();
		int i;
		int numregions;
		if (cb == ((Object)0)) {
			return 0;
		} 
		_CONSOLE_SCREEN_BUFFER_INFO generatedInfo = this.getInfo();
		if (!/*Error: Function owner not recognized*/GetConsoleScreenBufferInfo(ModernizedCProgram.g_hConOut, generatedInfo)) {
			this.setIsValid(0);
			return 0;
		} 
		this.setIsValid(1/*
		     * Allocate a buffer large enough to hold the entire console screen
		     * buffer.  If this ConsoleBuffer structure has already been initialized
		     * with a buffer of the correct size, then just use that one.
		     */);
		Object generatedIsValid = this.getIsValid();
		Object generatedBuffer = this.getBuffer();
		_COORD generatedBufferSize = this.getBufferSize();
		Object generatedX = generatedBufferSize.getX();
		Object generatedY = generatedBufferSize.getY();
		if (!generatedIsValid || generatedBuffer == ((Object)0) || generatedX != generatedX || generatedY != generatedY) {
			generatedBufferSize.setX(generatedX);
			generatedBufferSize.setY(generatedY);
			NumCells = generatedX * generatedY;
			ModernizedCProgram.vim_free(generatedBuffer);
			this.setBuffer((CHAR_INFO)ModernizedCProgram.alloc(/*Error: Unsupported expression*/ * (NumCells)));
			if (generatedBuffer == ((Object)0)) {
				return 0/*
				     * We will now copy the console screen buffer into our buffer.
				     * ReadConsoleOutput() seems to be limited as far as how much you
				     * can read at a time.  Empirically, this number seems to be about
				     * 12000 cells (rows * columns).  Start at position (0, 0) and copy
				     * in chunks until it is all copied.  The chunks will all have the
				     * same horizontal characteristics, so initialize them now.  The
				     * height of each chunk will be (12000 / width).
				     */;
			} 
		} 
		BufferCoord.setX(0);
		ReadRegion.setLeft(0);
		ReadRegion.setRight(generatedX - 1);
		Y_incr = 12000 / generatedX;
		numregions = (generatedY + Y_incr - 1) / Y_incr;
		Object generatedRegions = this.getRegions();
		int generatedNumRegions = this.getNumRegions();
		if (generatedRegions == ((Object)0) || numregions != generatedNumRegions) {
			this.setNumRegions(numregions);
			ModernizedCProgram.vim_free(generatedRegions);
			this.setRegions((SMALL_RECT)ModernizedCProgram.alloc(/*Error: Unsupported expression*/ * (generatedNumRegions)));
			if (generatedRegions == ((Object)0)) {
				do {
					if ((generatedBuffer) != ((Object)0)) {
						ModernizedCProgram.vim_free(generatedBuffer);
						(generatedBuffer) = ((Object)0);
					} 
				} while (0);
				return 0;
			} 
		} 
		for (; i < generatedNumRegions; ) {
			BufferCoord.setY(Y/*
				 * Read the region whose top left corner is (0, Y) and whose bottom
				 * right corner is (width - 1, Y + Y_incr - 1).  This should define
				 * a region of size width by Y_incr.  Don't worry if this region is
				 * too large for the remaining buffer; it will be cropped.
				 */);
			ReadRegion.setTop(Y);
			ReadRegion.setBottom(Y + Y_incr - 1);
			if (!/*Error: Function owner not recognized*/ReadConsoleOutputW(/* output handle */ModernizedCProgram.g_hConOut, generatedBuffer, generatedBufferSize, /* offset in our buffer */BufferCoord, /* region to save */ReadRegion)) {
				do {
					if ((generatedBuffer) != ((Object)0)) {
						ModernizedCProgram.vim_free(generatedBuffer);
						(generatedBuffer) = ((Object)0);
					} 
				} while (0);
				do {
					if ((generatedRegions) != ((Object)0)) {
						ModernizedCProgram.vim_free(generatedRegions);
						(generatedRegions) = ((Object)0);
					} 
				} while (0);
				return 0;
			} 
			generatedRegions[i] = ReadRegion;
		}
		return 1/*
		 * RestoreConsoleBuffer()
		 * Description:
		 *  Restores important information about the console buffer, including the
		 *  actual buffer contents, if desired.  The information to restore is in
		 *  the same format used by SaveConsoleBuffer().
		 * Returns:
		 *  TRUE on success
		 */;
	}
	public Object RestoreConsoleBuffer(Object RestoreScreen) {
		COORD BufferCoord = new COORD();
		SMALL_RECT WriteRegion = new SMALL_RECT();
		int i;
		Object generatedIsValid = this.getIsValid();
		if (cb == ((Object)0) || !generatedIsValid) {
			return 0/*
			     * Before restoring the buffer contents, clear the current buffer, and
			     * restore the cursor position and window information.  Doing this now
			     * prevents old buffer contents from "flashing" onto the screen.
			     */;
		} 
		_CONSOLE_SCREEN_BUFFER_INFO generatedInfo = this.getInfo();
		Object generatedWAttributes = generatedInfo.getWAttributes();
		if (RestoreScreen) {
			ModernizedCProgram.ClearConsoleBuffer(generatedWAttributes);
		} 
		Object generatedDwSize = generatedInfo.getDwSize();
		generatedDwSize.FitConsoleWindow(1);
		if (!/*Error: Function owner not recognized*/SetConsoleScreenBufferSize(ModernizedCProgram.g_hConOut, generatedDwSize)) {
			return 0;
		} 
		if (!/*Error: Function owner not recognized*/SetConsoleTextAttribute(ModernizedCProgram.g_hConOut, generatedWAttributes)) {
			return 0;
		} 
		if (!RestoreScreen/*
			 * No need to restore the screen buffer contents, so we're done.
			 */) {
			return 1;
		} 
		Object generatedDwCursorPosition = generatedInfo.getDwCursorPosition();
		if (!/*Error: Function owner not recognized*/SetConsoleCursorPosition(ModernizedCProgram.g_hConOut, generatedDwCursorPosition)) {
			return 0;
		} 
		Object generatedSrWindow = generatedInfo.getSrWindow();
		if (!/*Error: Function owner not recognized*/SetConsoleWindowInfo(ModernizedCProgram.g_hConOut, 1, generatedSrWindow)) {
			return 0/*
			     * Restore the screen buffer contents.
			     */;
		} 
		Object generatedBuffer = this.getBuffer();
		int generatedNumRegions = this.getNumRegions();
		Object generatedRegions = this.getRegions();
		_COORD generatedBufferSize = this.getBufferSize();
		if (generatedBuffer != ((Object)0)) {
			for (i = 0; i < generatedNumRegions; i++) {
				BufferCoord.setX(generatedRegions[i].getLeft());
				BufferCoord.setY(generatedRegions[i].getTop());
				WriteRegion = generatedRegions[i];
				if (!/*Error: Function owner not recognized*/WriteConsoleOutputW(/* output handle */ModernizedCProgram.g_hConOut, generatedBuffer, generatedBufferSize, /* offset in our buffer */BufferCoord, /* region to restore */WriteRegion)) {
					return 0;
				} 
			}
		} 
		return 1;
	}
	public Object getIsValid() {
		return IsValid;
	}
	public void setIsValid(Object newIsValid) {
		IsValid = newIsValid;
	}
	public _CONSOLE_SCREEN_BUFFER_INFO getInfo() {
		return Info;
	}
	public void setInfo(_CONSOLE_SCREEN_BUFFER_INFO newInfo) {
		Info = newInfo;
	}
	public Object getBuffer() {
		return Buffer;
	}
	public void setBuffer(Object newBuffer) {
		Buffer = newBuffer;
	}
	public _COORD getBufferSize() {
		return BufferSize;
	}
	public void setBufferSize(_COORD newBufferSize) {
		BufferSize = newBufferSize;
	}
	public Object getRegions() {
		return Regions;
	}
	public void setRegions(Object newRegions) {
		Regions = newRegions;
	}
	public int getNumRegions() {
		return NumRegions;
	}
	public void setNumRegions(int newNumRegions) {
		NumRegions = newNumRegions;
	}
}
