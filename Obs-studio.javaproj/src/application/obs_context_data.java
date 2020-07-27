package application;

/* ------------------------------------------------------------------------- */
/* obs shared context data */
public class obs_context_data {
	private Byte name;
	private Object[] data;
	private obs_data settings;
	private Object signals;
	private Object procs;
	private obs_obj_type type;
	private obs_data hotkey_data;
	private Object ;
	private Object rename_cache_mutex;
	private Object mutex;
	private obs_context_data next;
	private obs_context_data prev_next;
	private Object private;
	
	public obs_context_data(Byte name, Object[] data, obs_data settings, Object signals, Object procs, obs_obj_type type, obs_data hotkey_data, Object,  Object rename_cache_mutex, Object mutex, obs_context_data next, obs_context_data prev_next, Object private) {
		setName(name);
		setData(data);
		setSettings(settings);
		setSignals(signals);
		setProcs(procs);
		setType(type);
		setHotkey_data(hotkey_data);
		set();
		setRename_cache_mutex(rename_cache_mutex);
		setMutex(mutex);
		setNext(next);
		setPrev_next(prev_next);
		setPrivate(private);
	}
	public obs_context_data() {
	}
	
	public void obs_context_data_free() {
		context.obs_hotkeys_context_release();
		Object generatedSignals = this.getSignals();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/signal_handler_destroy(generatedSignals);
		Object generatedProcs = this.getProcs();
		generatedProcs.proc_handler_destroy();
		obs_data generatedSettings = this.getSettings();
		generatedSettings.obs_data_release();
		context.obs_context_data_remove();
		Object generatedRename_cache_mutex = this.getRename_cache_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedRename_cache_mutex);
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		Object generatedRename_cache = this.getRename_cache();
		for ( i = 0;
		 i < generatedRename_cache.getNum(); i++) {
			ModernizedCProgram.bfree(generatedRename_cache.getArray()[i]);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedRename_cache);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(context, 0, /*Error: sizeof expression not supported yet*/);
	}
	public void obs_context_data_insert(Object mutex, Object pfirst) {
		obs_context_data first = pfirst;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(context);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(mutex);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(first);
		this.setMutex(mutex);
		ModernizedCProgram.pthread_mutex_lock(mutex);
		this.setPrev_next(first);
		this.setNext(first);
		first = context;
		obs_context_data generatedNext = this.getNext();
		if (generatedNext) {
			generatedNext.setPrev_next(generatedNext);
		} 
		ModernizedCProgram.pthread_mutex_unlock(mutex);
	}
	public void obs_context_data_remove() {
		Object generatedMutex = this.getMutex();
		obs_context_data generatedPrev_next = this.getPrev_next();
		obs_context_data generatedNext = this.getNext();
		if (context && generatedMutex) {
			ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			if (generatedPrev_next) {
				generatedPrev_next = generatedNext;
			} 
			if (generatedNext) {
				generatedNext.setPrev_next(generatedPrev_next);
			} 
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
			this.setMutex(NULL);
		} 
	}
	public void obs_context_data_setname(Object name) {
		Object generatedRename_cache_mutex = this.getRename_cache_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedRename_cache_mutex);
		Byte generatedName = this.getName();
		Object generatedRename_cache = this.getRename_cache();
		if (generatedName) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedRename_cache, generatedName);
		} 
		Object generatedPrivate = this.getPrivate();
		this.setName(ModernizedCProgram.dup_name(name, generatedPrivate));
		ModernizedCProgram.pthread_mutex_unlock(generatedRename_cache_mutex);
	}
	public void context_add_hotkey(Object id) {
		Object generatedHotkeys = this.getHotkeys();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedHotkeys, id);
	}
	public Object obs_hotkey_register_internal(obs_hotkey_registerer_type type, Object registerer, Object name, Object description, Object func, Object data) {
		if ((ModernizedCProgram.obs.getHotkeys().getNext_id() + 1) == (~(obs_hotkey_id)0)) {
			ModernizedCProgram.blog(LOG_WARNING, "obs-hotkey: Available hotkey ids exhausted");
		} 
		obs_hotkey_t base_addr = ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray();
		obs_hotkey_id result = ModernizedCProgram.obs.getHotkeys().getNext_id()++;
		obs_hotkey_t hotkey = /*Error: Function owner not recognized*/da_push_back_new(ModernizedCProgram.obs.getHotkeys().getHotkeys());
		hotkey.setId(result);
		hotkey.setName(ModernizedCProgram.bstrdup(name));
		hotkey.setDescription(ModernizedCProgram.bstrdup(description));
		hotkey.setFunc(func);
		hotkey.setData(data);
		hotkey.setRegisterer_type(type);
		hotkey.setRegisterer(registerer);
		hotkey.setPair_partner_id((~(obs_hotkey_pair_id)0));
		obs_data generatedHotkey_data = this.getHotkey_data();
		obs_data_array obs_data_array = new obs_data_array();
		if (context) {
			obs_data_array_t data = obs_data_array.obs_data_get_array(generatedHotkey_data, name);
			ModernizedCProgram.load_bindings(hotkey, data);
			data.obs_data_array_release();
			context.context_add_hotkey(result);
		} 
		if (base_addr != ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()) {
			ModernizedCProgram.fixup_pointers();
		} 
		hotkey.hotkey_signal("hotkey_register");
		return result;
	}
	public Object register_hotkey_pair_internal(obs_hotkey_registerer_type type, Object registerer, Object weak_ref, Object name0, Object description0, Object name1, Object description1, Object func0, Object func1, Object data0, Object data1) {
		if (!ModernizedCProgram.lock()) {
			return (~(obs_hotkey_pair_id)0);
		} 
		obs_hotkey_pair obs_hotkey_pair = new obs_hotkey_pair();
		obs_hotkey_pair_t pair = obs_hotkey_pair.create_hotkey_pair(context, func0, func1, data0, data1);
		Object generatedId = pair.getId();
		generatedId[0] = context.obs_hotkey_register_internal(type, /*Error: Function owner not recognized*/weak_ref(registerer), name0, description0, obs_hotkey_pair_first_func, pair);
		generatedId[1] = context.obs_hotkey_register_internal(type, /*Error: Function owner not recognized*/weak_ref(registerer), name1, description1, obs_hotkey_pair_second_func, pair);
		 idx = new ();
		if (ModernizedCProgram.find_id(generatedId[0], idx)) {
			ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx].setPair_partner_id(generatedId[1]);
		} 
		if (ModernizedCProgram.find_id(generatedId[1], idx)) {
			ModernizedCProgram.obs.getHotkeys().getHotkeys().getArray()[idx].setPair_partner_id(generatedId[0]);
		} 
		Object generatedPair_id = pair.getPair_id();
		obs_hotkey_pair_id id = generatedPair_id;
		ModernizedCProgram.unlock();
		return id;
	}
	public void enum_context_hotkeys(Object func, Object data) {
		Object generatedHotkeys = this.getHotkeys();
		 num = generatedHotkeys.getNum();
		obs_hotkey_id array = generatedHotkeys.getArray();
		obs_hotkey_t hotkey_array = generatedHotkeys.getArray();
		for ( i = 0;
		 i < num; i++) {
			 idx = new ();
			if (!ModernizedCProgram.find_id(array[i], idx)) {
				continue;
			} 
			if (!ModernizedCProgram.func(data, idx, hotkey_array[idx])) {
				break;
			} 
		}
	}
	public void context_release_hotkeys() {
		Object generatedHotkeys = this.getHotkeys();
		if (!generatedHotkeys.getNum()) {
			;
		} 
		 need_fixup = false;
		for ( i = 0;
		 i < generatedHotkeys.getNum(); i++) {
			need_fixup = ModernizedCProgram.unregister_hotkey(generatedHotkeys.getArray()[i]) || need_fixup;
		}
		if (need_fixup) {
			ModernizedCProgram.fixup_pointers();
		} 
	}
	public void context_release_hotkey_pairs() {
		Object generatedHotkey_pairs = this.getHotkey_pairs();
		if (!generatedHotkey_pairs.getNum()) {
			;
		} 
		 need_fixup = false;
		for ( i = 0;
		 i < generatedHotkey_pairs.getNum(); i++) {
			need_fixup = ModernizedCProgram.unregister_hotkey_pair(generatedHotkey_pairs.getArray()[i]) || need_fixup;
		}
		if (need_fixup) {
			ModernizedCProgram.fixup_pair_pointers();
		} 
	}
	public void obs_hotkeys_context_release() {
		if (!ModernizedCProgram.lock()) {
			return /*Error: Unsupported expression*/;
		} 
		context.context_release_hotkeys();
		context.context_release_hotkey_pairs();
		obs_data generatedHotkey_data = this.getHotkey_data();
		generatedHotkey_data.obs_data_release();
		ModernizedCProgram.unlock();
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object[] getData() {
		return data;
	}
	public void setData(Object[] newData) {
		data = newData;
	}
	public obs_data getSettings() {
		return settings;
	}
	public void setSettings(obs_data newSettings) {
		settings = newSettings;
	}
	public Object getSignals() {
		return signals;
	}
	public void setSignals(Object newSignals) {
		signals = newSignals;
	}
	public Object getProcs() {
		return procs;
	}
	public void setProcs(Object newProcs) {
		procs = newProcs;
	}
	public obs_obj_type getType() {
		return type;
	}
	public void setType(obs_obj_type newType) {
		type = newType;
	}
	public obs_data getHotkey_data() {
		return hotkey_data;
	}
	public void setHotkey_data(obs_data newHotkey_data) {
		hotkey_data = newHotkey_data;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getRename_cache_mutex() {
		return rename_cache_mutex;
	}
	public void setRename_cache_mutex(Object newRename_cache_mutex) {
		rename_cache_mutex = newRename_cache_mutex;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public obs_context_data getNext() {
		return next;
	}
	public void setNext(obs_context_data newNext) {
		next = newNext;
	}
	public obs_context_data getPrev_next() {
		return prev_next;
	}
	public void setPrev_next(obs_context_data newPrev_next) {
		prev_next = newPrev_next;
	}
	public Object getPrivate() {
		return private;
	}
	public void setPrivate(Object newPrivate) {
		private = newPrivate;
	}
}
