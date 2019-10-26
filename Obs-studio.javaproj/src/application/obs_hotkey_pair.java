package application;

public class obs_hotkey_pair {
	private Object pair_id;
	private Object id;
	private Object func;
	private Object pressed0;
	private Object pressed1;
	private Object data;
	
	public obs_hotkey_pair(Object pair_id, Object id, Object func, Object pressed0, Object pressed1, Object data) {
		setPair_id(pair_id);
		setId(id);
		setFunc(func);
		setPressed0(pressed0);
		setPressed1(pressed1);
		setData(data);
	}
	public obs_hotkey_pair() {
	}
	
	public obs_hotkey_pair create_hotkey_pair(obs_context_data context, Object func0, Object func1, Object data0, Object data1) {
		if ((ModernizedCProgram.obs.getHotkeys().getNext_pair_id() + 1) == (~(obs_hotkey_pair_id)0)) {
			ModernizedCProgram.blog(LOG_WARNING, "obs-hotkey: Available hotkey pair ids exhausted");
		} 
		obs_hotkey_pair_t base_addr = ModernizedCProgram.obs.getHotkeys().getHotkey_pairs().getArray();
		obs_hotkey_pair_t pair = .da_push_back_new(ModernizedCProgram.obs.getHotkeys().getHotkey_pairs());
		pair.setPair_id(ModernizedCProgram.obs.getHotkeys().getNext_pair_id()++);
		Object generatedFunc = pair.getFunc();
		generatedFunc[0] = func0;
		generatedFunc[1] = func1;
		Object generatedId = pair.getId();
		generatedId[0] = (~(obs_hotkey_id)0);
		generatedId[1] = (~(obs_hotkey_id)0);
		Object generatedData = pair.getData();
		generatedData[0] = data0;
		generatedData[1] = data1;
		Object generatedHotkey_pairs = context.getHotkey_pairs();
		Object generatedPair_id = pair.getPair_id();
		if (context) {
			.da_push_back(generatedHotkey_pairs, generatedPair_id);
		} 
		if (base_addr != generatedHotkey_pairs.getArray()) {
			ModernizedCProgram.fixup_pair_pointers();
		} 
		return pair;
	}
	public Object find_pair_id_helper(Object idx, Object data) {
		obs_hotkey_internal_find_pair_forward find = data;
		Object generatedPair_id = this.getPair_id();
		Object generatedId = find.getId();
		if (generatedPair_id != generatedId) {
			return true;
		} 
		find.setIdx(idx);
		find.setFound(true);
		return false;
	}
	public Object pair_pointer_fixup_func(Object idx, Object data) {
		.UNUSED_PARAMETER(idx);
		.UNUSED_PARAMETER(data);
		Object generatedId = this.getId();
		if (ModernizedCProgram.find_id(generatedId[0], idx)) {
			ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx].setData(pair);
		} 
		if (ModernizedCProgram.find_id(generatedId[1], idx)) {
			ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx].setData(pair);
		} 
		return true;
	}
	public Object getPair_id() {
		return pair_id;
	}
	public void setPair_id(Object newPair_id) {
		pair_id = newPair_id;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getFunc() {
		return func;
	}
	public void setFunc(Object newFunc) {
		func = newFunc;
	}
	public Object getPressed0() {
		return pressed0;
	}
	public void setPressed0(Object newPressed0) {
		pressed0 = newPressed0;
	}
	public Object getPressed1() {
		return pressed1;
	}
	public void setPressed1(Object newPressed1) {
		pressed1 = newPressed1;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}
