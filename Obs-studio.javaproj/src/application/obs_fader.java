package application;

public class obs_fader {
	private Object mutex;
	private Object def_to_db;
	private Object db_to_def;
	private obs_source source;
	private obs_fader_type type;
	private double max_db;
	private double min_db;
	private double cur_db;
	private Object ignore_next_signal;
	private Object callback_mutex;
	private Object ;
	
	public obs_fader(Object mutex, Object def_to_db, Object db_to_def, obs_source source, obs_fader_type type, double max_db, double min_db, double cur_db, Object ignore_next_signal, Object callback_mutex, Object ) {
		setMutex(mutex);
		setDef_to_db(def_to_db);
		setDb_to_def(db_to_def);
		setSource(source);
		setType(type);
		setMax_db(max_db);
		setMin_db(min_db);
		setCur_db(cur_db);
		setIgnore_next_signal(ignore_next_signal);
		setCallback_mutex(callback_mutex);
		set();
	}
	public obs_fader() {
	}
	
	public void signal_volume_changed(Object db) {
		Object generatedCallback_mutex = this.getCallback_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedCallback_mutex);
		Object generatedCallbacks = this.getCallbacks();
		for (size_t i = generatedCallbacks.getNum();
		 i > 0; i--) {
			fader_cb cb = generatedCallbacks.getArray()[i - 1];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.cb.getParam(), db);
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedCallback_mutex);
	}
	public obs_fader obs_fader_create(obs_fader_type type) {
		obs_fader fader = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		if (!fader) {
			return ((Object)0);
		} 
		Object generatedMutex = fader.getMutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedMutex);
		Object generatedCallback_mutex = fader.getCallback_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedCallback_mutex);
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, ((Object)0)) != 0) {
			;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedCallback_mutex, ((Object)0)) != 0) {
			;
		} 
		switch (obs_fader_type.type) {
		case obs_fader_type.OBS_FADER_LOG:
				fader.setDef_to_db(log_def_to_db);
				fader.setDb_to_def(log_db_to_def);
				fader.setMax_db(0.0);
				fader.setMin_db(-96.0);
				break;
		case obs_fader_type.OBS_FADER_IEC:
				fader.setDef_to_db(iec_def_to_db);
				fader.setDb_to_def(iec_db_to_def);
				fader.setMax_db(0.0);
				fader.setMin_db(-/*Error: Function owner not recognized*/__builtin_inf());
				break;
		case obs_fader_type.OBS_FADER_CUBIC:
				fader.setDef_to_db(cubic_def_to_db);
				fader.setDb_to_def(cubic_db_to_def);
				fader.setMax_db(0.0);
				fader.setMin_db(-/*Error: Function owner not recognized*/__builtin_inf());
				break;
		default:
				;
				break;
		}
		fader.setType(obs_fader_type.type);
		return fader;
		return ((Object)0);
	}
	public void obs_fader_destroy() {
		if (!fader) {
			return /*Error: Unsupported expression*/;
		} 
		fader.obs_fader_detach_source();
		Object generatedCallbacks = this.getCallbacks();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedCallbacks);
		Object generatedCallback_mutex = this.getCallback_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedCallback_mutex);
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
		ModernizedCProgram.bfree(fader);
	}
	public Object obs_fader_set_db(Object db) {
		if (!fader) {
			return false;
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		 clamped = false;
		this.setCur_db(db);
		double generatedCur_db = this.getCur_db();
		double generatedMax_db = this.getMax_db();
		if (generatedCur_db > generatedMax_db) {
			this.setCur_db(generatedMax_db);
			clamped = true;
		} 
		double generatedMin_db = this.getMin_db();
		if (generatedCur_db < generatedMin_db) {
			this.setCur_db(-/*Error: Function owner not recognized*/__builtin_inf());
			clamped = true;
		} 
		this.setIgnore_next_signal(true);
		obs_source generatedSource = this.getSource();
		obs_source_t src = generatedSource;
		double mul = ModernizedCProgram.db_to_mul(generatedCur_db);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		if (src) {
			src.obs_source_set_volume(mul);
		} 
		return !clamped;
	}
	public double obs_fader_get_db() {
		if (!fader) {
			return 0.0;
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		double generatedCur_db = this.getCur_db();
		double db = generatedCur_db;
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return db;
	}
	public Object obs_fader_set_deflection(Object def) {
		if (!fader) {
			return false;
		} 
		return fader.obs_fader_set_db(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(def));
	}
	public double obs_fader_get_deflection() {
		if (!fader) {
			return 0.0;
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		double generatedCur_db = this.getCur_db();
		double def = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCur_db);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return def;
	}
	public Object obs_fader_set_mul(Object mul) {
		if (!fader) {
			return false;
		} 
		return fader.obs_fader_set_db(ModernizedCProgram.mul_to_db(mul));
	}
	public double obs_fader_get_mul() {
		if (!fader) {
			return 0.0;
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		double generatedCur_db = this.getCur_db();
		double mul = ModernizedCProgram.db_to_mul(generatedCur_db);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return mul;
	}
	public void obs_fader_detach_source() {
		 sh = new ();
		obs_source_t source = new obs_source_t();
		if (!fader) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		obs_source generatedSource = this.getSource();
		source = generatedSource;
		this.setSource(((Object)0));
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		if (!source) {
			return /*Error: Unsupported expression*/;
		} 
		sh = ModernizedCProgram.obs_source_get_signal_handler(source);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/signal_handler_disconnect(sh, "volume", fader_source_volume_changed, fader);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/signal_handler_disconnect(sh, "destroy", fader_source_destroyed, fader);
	}
	public void obs_fader_add_callback(Object callback, Object param) {
		fader_cb cb = new fader_cb(callback, param);
		if (!ModernizedCProgram.obs_object_valid(fader, "obs_fader_add_callback", "fader")) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedCallback_mutex = this.getCallback_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedCallback_mutex);
		Object generatedCallbacks = this.getCallbacks();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedCallbacks, cb);
		ModernizedCProgram.pthread_mutex_unlock(generatedCallback_mutex);
	}
	public void obs_fader_remove_callback(Object callback, Object param) {
		fader_cb cb = new fader_cb(callback, param);
		if (!ModernizedCProgram.obs_object_valid(fader, "obs_fader_remove_callback", "fader")) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedCallback_mutex = this.getCallback_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedCallback_mutex);
		Object generatedCallbacks = this.getCallbacks();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_erase_item(generatedCallbacks, cb);
		ModernizedCProgram.pthread_mutex_unlock(generatedCallback_mutex);
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getDef_to_db() {
		return def_to_db;
	}
	public void setDef_to_db(Object newDef_to_db) {
		def_to_db = newDef_to_db;
	}
	public Object getDb_to_def() {
		return db_to_def;
	}
	public void setDb_to_def(Object newDb_to_def) {
		db_to_def = newDb_to_def;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public obs_fader_type getType() {
		return type;
	}
	public void setType(obs_fader_type newType) {
		type = newType;
	}
	public double getMax_db() {
		return max_db;
	}
	public void setMax_db(double newMax_db) {
		max_db = newMax_db;
	}
	public double getMin_db() {
		return min_db;
	}
	public void setMin_db(double newMin_db) {
		min_db = newMin_db;
	}
	public double getCur_db() {
		return cur_db;
	}
	public void setCur_db(double newCur_db) {
		cur_db = newCur_db;
	}
	public Object getIgnore_next_signal() {
		return ignore_next_signal;
	}
	public void setIgnore_next_signal(Object newIgnore_next_signal) {
		ignore_next_signal = newIgnore_next_signal;
	}
	public Object getCallback_mutex() {
		return callback_mutex;
	}
	public void setCallback_mutex(Object newCallback_mutex) {
		callback_mutex = newCallback_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
