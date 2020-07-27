package application;

/* ------------------------------------------------------------------------- */
public class error_data {
	private  errors;
	
	public error_data( errors) {
		setErrors(errors);
	}
	public error_data() {
	}
	
	public void error_data_init() {
		ModernizedCProgram.data.getErrors().getDa().darray_init();
	}
	public void error_data_free() {
		ModernizedCProgram.data.getErrors().getArray().error_item_array_free(ModernizedCProgram.data.getErrors().getNum());
		ModernizedCProgram.data.getErrors().getDa().darray_free();
	}
	public Object error_data_item(Object idx) {
		 generatedErrors = this.getErrors();
		Object generatedArray = generatedErrors.getArray();
		return generatedArray + idx;
	}
	public Object error_data_type_count(int type) {
		size_t count = 0;
		size_t i = new size_t();
		 generatedErrors = this.getErrors();
		Object generatedNum = generatedErrors.getNum();
		Object generatedArray = generatedErrors.getArray();
		for (i = 0; i < generatedNum; i++) {
			if (generatedArray[i].getLevel() == type) {
				count++;
			} 
		}
		return count;
	}
	public boolean error_data_has_errors() {
		size_t i = new size_t();
		 generatedErrors = this.getErrors();
		Object generatedNum = generatedErrors.getNum();
		Object generatedArray = generatedErrors.getArray();
		for (i = 0; i < generatedNum; i++) {
			if (generatedArray[i].getLevel() == 0) {
				return 1;
			} 
		}
		return 0;
	}
	/* ------------------------------------------------------------------------- */
	public void error_data_add(Object file, Object row, Object column, Object msg, int level) {
		error_item item = new error_item();
		if (!ModernizedCProgram.data) {
			return /*Error: Unsupported expression*/;
		} 
		item.setFile(file);
		item.setRow(row);
		item.setColumn(column);
		item.setLevel(level);
		item.setError(ModernizedCProgram.bstrdup(msg));
		ModernizedCProgram.data.getErrors().getDa().darray_push_back(/*Error: sizeof expression not supported yet*/, item);
	}
	public Byte error_data_buildstring() {
		dstr str = new dstr();
		 generatedErrors = this.getErrors();
		Object generatedArray = generatedErrors.getArray();
		error_item items = generatedArray;
		size_t i = new size_t();
		str.dstr_init();
		Object generatedNum = generatedErrors.getNum();
		Object generatedFile = item.getFile();
		Object generatedRow = item.getRow();
		Object generatedColumn = item.getColumn();
		Byte generatedError = item.getError();
		for (i = 0; i < generatedNum; i++) {
			error_item item = items + i;
			str.dstr_catf("%s (%u, %u): %s\n", generatedFile, generatedRow, generatedColumn, generatedError);
		}
		return generatedArray;
	}
	public  getErrors() {
		return errors;
	}
	public void setErrors( newErrors) {
		errors = newErrors;
	}
}
