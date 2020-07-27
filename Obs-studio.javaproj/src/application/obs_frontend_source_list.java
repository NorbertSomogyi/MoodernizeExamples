package application;

/* ------------------------------------------------------------------------- */
public class obs_frontend_source_list {
	private Object ;
	
	public obs_frontend_source_list(Object ) {
		set();
	}
	public obs_frontend_source_list() {
	}
	
	public void obs_frontend_source_list_free() {
		Object generatedSources = this.getSources();
		 num = generatedSources.getNum();
		for ( i = 0;
		 i < num; i++) {
			generatedSources.getArray()[i].obs_source_release();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedSources)//!SWIG;//!SWIG
	}
	/* NOTE: Functions that return char** string lists are a single allocation of
	 * memory with pointers to itself.  Free with a single call to bfree on the
	 * base char** pointer. */
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}
