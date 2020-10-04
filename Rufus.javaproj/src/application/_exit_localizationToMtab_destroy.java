package application;

public class _exit_localizationToMtab_destroy {
	
	
	public static void _exit_localization(Object reinit) {
		if (!ModernizedCProgram.localization_initialized) {
			return /*Error: Unsupported expression*/;
		} 
		if (!reinit) {
			ModernizedCProgram.free_locale_list();
			if (ModernizedCProgram.loc_filename != ModernizedCProgram.embedded_loc_filename) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.loc_filename);
					ModernizedCProgram.loc_filename = (null);
				} while (0);
			} 
		} 
		ModernizedCProgram.free_dialog_list();
		ModernizedCProgram.mtab_destroy(reinit);
		ModernizedCProgram.htab_loc/*
		 * Validate and store localization command data
		 */.htab_destroy();
	}
	private static void free_dialog_list() {
		size_t i = 0;
		loc_cmd lcmd = new loc_cmd();
		loc_cmd next = new loc_cmd();
		list_head generatedList = lcmd.getList();
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			if (((ModernizedCProgram.loc_dlg[i].getList()).getNext() == (ModernizedCProgram.loc_dlg[i].getList()))) {
				continue;
			} 
			for (; generatedList != (generatedList); ) {
				generatedList.list_del();
				lcmd.free_loc_cmd();
			}
		}
	}
	private static void mtab_destroy(Object reinit) {
		size_t j = new size_t();
		for (j = 1; j < 3321 - 3000; j++) {
			do {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.current_msg_table[j]);
				ModernizedCProgram.current_msg_table[j] = (null);
			} while (0);
			if (!reinit) {
				do {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free((Object)ModernizedCProgram.default_msg_table[j]);
					ModernizedCProgram.default_msg_table[j] = (null);
				} while (0);
			} 
		}
	}
}
