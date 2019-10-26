package application;

public class VTermScreen {
	private VTerm vt;
	private VTermState state;
	private Object callbacks;
	private Object cbdata;
	private  damage_merge;
	private  damaged;
	private  pending_scrollrect;
	private int pending_scroll_downward;
	private int pending_scroll_rightward;
	private int rows;
	private int cols;
	private int global_reverse;
	private Object buffers;
	private  buffer;
	private  sb_buffer;
	private  pen;
	
	public VTermScreen(VTerm vt, VTermState state, Object callbacks, Object cbdata,  damage_merge,  damaged,  pending_scrollrect, int pending_scroll_downward, int pending_scroll_rightward, int rows, int cols, int global_reverse, Object buffers,  buffer,  sb_buffer,  pen) {
		setVt(vt);
		setState(state);
		setCallbacks(callbacks);
		setCbdata(cbdata);
		setDamage_merge(damage_merge);
		setDamaged(damaged);
		setPending_scrollrect(pending_scrollrect);
		setPending_scroll_downward(pending_scroll_downward);
		setPending_scroll_rightward(pending_scroll_rightward);
		setRows(rows);
		setCols(cols);
		setGlobal_reverse(global_reverse);
		setBuffers(buffers);
		setBuffer(buffer);
		setSb_buffer(sb_buffer);
		setPen(pen);
	}
	public VTermScreen() {
	}
	
	public void damagescreen() {
		VTermRect rect = new VTermRect(0, 0, 0, 0);
		rect.setEnd_row(ModernizedCProgram.screen.getRows());
		rect.setEnd_col(ModernizedCProgram.screen.getCols());
		ModernizedCProgram.damagerect(ModernizedCProgram.screen, rect);
	}
	public VTermScreen screen_new(VTerm vt) {
		VTermState vTermState = new VTermState();
		VTermState state = vTermState.vterm_obtain_state(vt);
		VTermScreen screen = new VTermScreen();
		int rows;
		int cols;
		if (state == ((Object)0)) {
			return ((Object)0);
		} 
		screen = vt.vterm_allocator_malloc();
		if (screen == ((Object)0)) {
			return ((Object)0);
		} 
		ModernizedCProgram.vterm_get_size(vt, rows, cols);
		screen.setVt(vt);
		screen.setState(state);
		screen.setDamage_merge(.VTERM_DAMAGE_CELL);
		 generatedDamaged = screen.getDamaged();
		generatedDamaged.setStart_row(-1);
		 generatedPending_scrollrect = screen.getPending_scrollrect();
		generatedPending_scrollrect.setStart_row(-1);
		screen.setRows(rows);
		screen.setCols(cols);
		screen.setCallbacks(((Object)0));
		screen.setCbdata(((Object)0));
		Object generatedBuffers = screen.getBuffers();
		generatedBuffers[0] = ModernizedCProgram.realloc_buffer(screen, ((Object)0), rows, cols);
		screen.setBuffer(generatedBuffers[0]);
		VTerm generatedVt = screen.getVt();
		screen.setSb_buffer(generatedVt.vterm_allocator_malloc( * cols));
		 generatedBuffer = screen.getBuffer();
		 generatedSb_buffer = screen.getSb_buffer();
		if (generatedBuffer == ((Object)0) || generatedSb_buffer == ((Object)0)) {
			screen.vterm_screen_free();
			return ((Object)0);
		} 
		VTermState generatedState = screen.getState();
		generatedState.vterm_state_set_callbacks(ModernizedCProgram.state_cbs, screen);
		return screen;
	}
	public void vterm_screen_free() {
		ModernizedCProgram.screen.getVt().vterm_allocator_free(ModernizedCProgram.screen.getBuffers()[0]);
		ModernizedCProgram.screen.getVt().vterm_allocator_free(ModernizedCProgram.screen.getBuffers()[1]);
		ModernizedCProgram.screen.getVt().vterm_allocator_free(ModernizedCProgram.screen.getSb_buffer());
		ModernizedCProgram.screen.getVt().vterm_allocator_free(ModernizedCProgram.screen);
	}
	public void vterm_screen_reset(int hard) {
		ModernizedCProgram.screen.getDamaged().setStart_row(-1);
		ModernizedCProgram.screen.getPending_scrollrect().setStart_row(-1);
		ModernizedCProgram.screen.getState().vterm_state_reset(hard);
		ModernizedCProgram.screen.vterm_screen_flush_damage();
	}
	public VTermScreen vterm_obtain_screen(VTerm vt) {
		VTermScreen generatedScreen = vt.getScreen();
		VTermScreen vTermScreen = new VTermScreen();
		if (!generatedScreen) {
			vt.setScreen(vTermScreen.screen_new(vt));
		} 
		return generatedScreen;
	}
	public void vterm_screen_enable_altscreen(int altscreen) {
		if (!ModernizedCProgram.screen.getBuffers()[1] && altscreen) {
			int rows;
			int cols;
			ModernizedCProgram.vterm_get_size(ModernizedCProgram.screen.getVt(), ModernizedCProgram.rows, ModernizedCProgram.cols);
			ModernizedCProgram.screen.getBuffers()[1] = ModernizedCProgram.realloc_buffer(ModernizedCProgram.screen, ((Object)0), ModernizedCProgram.rows, ModernizedCProgram.cols);
		} 
	}
	public void vterm_screen_set_callbacks(Object callbacks, Object user) {
		ModernizedCProgram.screen.setCallbacks(callbacks);
		ModernizedCProgram.screen.setCbdata(user);
	}
	public Object vterm_screen_get_cbdata() {
		return ModernizedCProgram.screen.getCbdata();
	}
	public void vterm_screen_set_unrecognised_fallbacks(Object fallbacks, Object user) {
		ModernizedCProgram.screen.getState().vterm_state_set_unrecognised_fallbacks(fallbacks, user);
	}
	public Object vterm_screen_get_unrecognised_fbdata() {
		return ModernizedCProgram.screen.getState().vterm_state_get_unrecognised_fbdata();
	}
	public void vterm_screen_flush_damage() {
		if (ModernizedCProgram.screen.getPending_scrollrect().getStart_row() != -1) {
			ModernizedCProgram.screen.getPending_scrollrect().vterm_scroll_rect(ModernizedCProgram.screen.getPending_scroll_downward(), ModernizedCProgram.screen.getPending_scroll_rightward(), moverect_user, erase_user, ModernizedCProgram.screen);
			ModernizedCProgram.screen.getPending_scrollrect().setStart_row(-1);
		} 
		if (ModernizedCProgram.screen.getDamaged().getStart_row() != -1) {
			if (ModernizedCProgram.screen.getCallbacks() && ModernizedCProgram.screen.getCallbacks().getDamage()) {
				.UNRECOGNIZEDFUNCTIONNAME(ModernizedCProgram.screen.getDamaged(), ModernizedCProgram.screen.getCbdata());
			} 
			ModernizedCProgram.screen.getDamaged().setStart_row(-1);
		} 
	}
	public void vterm_screen_set_damage_merge( size) {
		ModernizedCProgram.screen.vterm_screen_flush_damage();
		ModernizedCProgram.screen.setDamage_merge(size);
	}
	public VTerm getVt() {
		return vt;
	}
	public void setVt(VTerm newVt) {
		vt = newVt;
	}
	public VTermState getState() {
		return state;
	}
	public void setState(VTermState newState) {
		state = newState;
	}
	public Object getCallbacks() {
		return callbacks;
	}
	public void setCallbacks(Object newCallbacks) {
		callbacks = newCallbacks;
	}
	public Object getCbdata() {
		return cbdata;
	}
	public void setCbdata(Object newCbdata) {
		cbdata = newCbdata;
	}
	public  getDamage_merge() {
		return damage_merge;
	}
	public void setDamage_merge( newDamage_merge) {
		damage_merge = newDamage_merge;
	}
	public  getDamaged() {
		return damaged;
	}
	public void setDamaged( newDamaged) {
		damaged = newDamaged;
	}
	public  getPending_scrollrect() {
		return pending_scrollrect;
	}
	public void setPending_scrollrect( newPending_scrollrect) {
		pending_scrollrect = newPending_scrollrect;
	}
	public int getPending_scroll_downward() {
		return pending_scroll_downward;
	}
	public void setPending_scroll_downward(int newPending_scroll_downward) {
		pending_scroll_downward = newPending_scroll_downward;
	}
	public int getPending_scroll_rightward() {
		return pending_scroll_rightward;
	}
	public void setPending_scroll_rightward(int newPending_scroll_rightward) {
		pending_scroll_rightward = newPending_scroll_rightward;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int newRows) {
		rows = newRows;
	}
	public int getCols() {
		return cols;
	}
	public void setCols(int newCols) {
		cols = newCols;
	}
	public int getGlobal_reverse() {
		return global_reverse;
	}
	public void setGlobal_reverse(int newGlobal_reverse) {
		global_reverse = newGlobal_reverse;
	}
	public Object getBuffers() {
		return buffers;
	}
	public void setBuffers(Object newBuffers) {
		buffers = newBuffers;
	}
	public  getBuffer() {
		return buffer;
	}
	public void setBuffer( newBuffer) {
		buffer = newBuffer;
	}
	public  getSb_buffer() {
		return sb_buffer;
	}
	public void setSb_buffer( newSb_buffer) {
		sb_buffer = newSb_buffer;
	}
	public  getPen() {
		return pen;
	}
	public void setPen( newPen) {
		pen = newPen;
	}
}
