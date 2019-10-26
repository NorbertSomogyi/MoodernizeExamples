package application;

/*
 * "vtable" for a TRACE2 target.  Use NULL if a target does not want
 * to emit that message.
 */
/* clang-format off */
public class tr2_tgt {
	private tr2_dst pdst;
	private Object pfn_init;
	private Object pfn_term;
	private Object pfn_version_fl;
	private Object pfn_start_fl;
	private Object pfn_exit_fl;
	private Object pfn_signal;
	private Object pfn_atexit;
	private Object pfn_error_va_fl;
	private Object pfn_command_path_fl;
	private Object pfn_command_name_fl;
	private Object pfn_command_mode_fl;
	private Object pfn_alias_fl;
	private Object pfn_child_start_fl;
	private Object pfn_child_exit_fl;
	private Object pfn_thread_start_fl;
	private Object pfn_thread_exit_fl;
	private Object pfn_exec_fl;
	private Object pfn_exec_result_fl;
	private Object pfn_param_fl;
	private Object pfn_repo_fl;
	private Object pfn_region_enter_printf_va_fl;
	private Object pfn_region_leave_printf_va_fl;
	private Object pfn_data_fl;
	private Object pfn_data_json_fl;
	private Object pfn_printf_va_fl;
	
	public tr2_tgt(tr2_dst pdst, Object pfn_init, Object pfn_term, Object pfn_version_fl, Object pfn_start_fl, Object pfn_exit_fl, Object pfn_signal, Object pfn_atexit, Object pfn_error_va_fl, Object pfn_command_path_fl, Object pfn_command_name_fl, Object pfn_command_mode_fl, Object pfn_alias_fl, Object pfn_child_start_fl, Object pfn_child_exit_fl, Object pfn_thread_start_fl, Object pfn_thread_exit_fl, Object pfn_exec_fl, Object pfn_exec_result_fl, Object pfn_param_fl, Object pfn_repo_fl, Object pfn_region_enter_printf_va_fl, Object pfn_region_leave_printf_va_fl, Object pfn_data_fl, Object pfn_data_json_fl, Object pfn_printf_va_fl) {
		setPdst(pdst);
		setPfn_init(pfn_init);
		setPfn_term(pfn_term);
		setPfn_version_fl(pfn_version_fl);
		setPfn_start_fl(pfn_start_fl);
		setPfn_exit_fl(pfn_exit_fl);
		setPfn_signal(pfn_signal);
		setPfn_atexit(pfn_atexit);
		setPfn_error_va_fl(pfn_error_va_fl);
		setPfn_command_path_fl(pfn_command_path_fl);
		setPfn_command_name_fl(pfn_command_name_fl);
		setPfn_command_mode_fl(pfn_command_mode_fl);
		setPfn_alias_fl(pfn_alias_fl);
		setPfn_child_start_fl(pfn_child_start_fl);
		setPfn_child_exit_fl(pfn_child_exit_fl);
		setPfn_thread_start_fl(pfn_thread_start_fl);
		setPfn_thread_exit_fl(pfn_thread_exit_fl);
		setPfn_exec_fl(pfn_exec_fl);
		setPfn_exec_result_fl(pfn_exec_result_fl);
		setPfn_param_fl(pfn_param_fl);
		setPfn_repo_fl(pfn_repo_fl);
		setPfn_region_enter_printf_va_fl(pfn_region_enter_printf_va_fl);
		setPfn_region_leave_printf_va_fl(pfn_region_leave_printf_va_fl);
		setPfn_data_fl(pfn_data_fl);
		setPfn_data_json_fl(pfn_data_json_fl);
		setPfn_printf_va_fl(pfn_printf_va_fl);
	}
	public tr2_tgt() {
	}
	
	public tr2_dst getPdst() {
		return pdst;
	}
	public void setPdst(tr2_dst newPdst) {
		pdst = newPdst;
	}
	public Object getPfn_init() {
		return pfn_init;
	}
	public void setPfn_init(Object newPfn_init) {
		pfn_init = newPfn_init;
	}
	public Object getPfn_term() {
		return pfn_term;
	}
	public void setPfn_term(Object newPfn_term) {
		pfn_term = newPfn_term;
	}
	public Object getPfn_version_fl() {
		return pfn_version_fl;
	}
	public void setPfn_version_fl(Object newPfn_version_fl) {
		pfn_version_fl = newPfn_version_fl;
	}
	public Object getPfn_start_fl() {
		return pfn_start_fl;
	}
	public void setPfn_start_fl(Object newPfn_start_fl) {
		pfn_start_fl = newPfn_start_fl;
	}
	public Object getPfn_exit_fl() {
		return pfn_exit_fl;
	}
	public void setPfn_exit_fl(Object newPfn_exit_fl) {
		pfn_exit_fl = newPfn_exit_fl;
	}
	public Object getPfn_signal() {
		return pfn_signal;
	}
	public void setPfn_signal(Object newPfn_signal) {
		pfn_signal = newPfn_signal;
	}
	public Object getPfn_atexit() {
		return pfn_atexit;
	}
	public void setPfn_atexit(Object newPfn_atexit) {
		pfn_atexit = newPfn_atexit;
	}
	public Object getPfn_error_va_fl() {
		return pfn_error_va_fl;
	}
	public void setPfn_error_va_fl(Object newPfn_error_va_fl) {
		pfn_error_va_fl = newPfn_error_va_fl;
	}
	public Object getPfn_command_path_fl() {
		return pfn_command_path_fl;
	}
	public void setPfn_command_path_fl(Object newPfn_command_path_fl) {
		pfn_command_path_fl = newPfn_command_path_fl;
	}
	public Object getPfn_command_name_fl() {
		return pfn_command_name_fl;
	}
	public void setPfn_command_name_fl(Object newPfn_command_name_fl) {
		pfn_command_name_fl = newPfn_command_name_fl;
	}
	public Object getPfn_command_mode_fl() {
		return pfn_command_mode_fl;
	}
	public void setPfn_command_mode_fl(Object newPfn_command_mode_fl) {
		pfn_command_mode_fl = newPfn_command_mode_fl;
	}
	public Object getPfn_alias_fl() {
		return pfn_alias_fl;
	}
	public void setPfn_alias_fl(Object newPfn_alias_fl) {
		pfn_alias_fl = newPfn_alias_fl;
	}
	public Object getPfn_child_start_fl() {
		return pfn_child_start_fl;
	}
	public void setPfn_child_start_fl(Object newPfn_child_start_fl) {
		pfn_child_start_fl = newPfn_child_start_fl;
	}
	public Object getPfn_child_exit_fl() {
		return pfn_child_exit_fl;
	}
	public void setPfn_child_exit_fl(Object newPfn_child_exit_fl) {
		pfn_child_exit_fl = newPfn_child_exit_fl;
	}
	public Object getPfn_thread_start_fl() {
		return pfn_thread_start_fl;
	}
	public void setPfn_thread_start_fl(Object newPfn_thread_start_fl) {
		pfn_thread_start_fl = newPfn_thread_start_fl;
	}
	public Object getPfn_thread_exit_fl() {
		return pfn_thread_exit_fl;
	}
	public void setPfn_thread_exit_fl(Object newPfn_thread_exit_fl) {
		pfn_thread_exit_fl = newPfn_thread_exit_fl;
	}
	public Object getPfn_exec_fl() {
		return pfn_exec_fl;
	}
	public void setPfn_exec_fl(Object newPfn_exec_fl) {
		pfn_exec_fl = newPfn_exec_fl;
	}
	public Object getPfn_exec_result_fl() {
		return pfn_exec_result_fl;
	}
	public void setPfn_exec_result_fl(Object newPfn_exec_result_fl) {
		pfn_exec_result_fl = newPfn_exec_result_fl;
	}
	public Object getPfn_param_fl() {
		return pfn_param_fl;
	}
	public void setPfn_param_fl(Object newPfn_param_fl) {
		pfn_param_fl = newPfn_param_fl;
	}
	public Object getPfn_repo_fl() {
		return pfn_repo_fl;
	}
	public void setPfn_repo_fl(Object newPfn_repo_fl) {
		pfn_repo_fl = newPfn_repo_fl;
	}
	public Object getPfn_region_enter_printf_va_fl() {
		return pfn_region_enter_printf_va_fl;
	}
	public void setPfn_region_enter_printf_va_fl(Object newPfn_region_enter_printf_va_fl) {
		pfn_region_enter_printf_va_fl = newPfn_region_enter_printf_va_fl;
	}
	public Object getPfn_region_leave_printf_va_fl() {
		return pfn_region_leave_printf_va_fl;
	}
	public void setPfn_region_leave_printf_va_fl(Object newPfn_region_leave_printf_va_fl) {
		pfn_region_leave_printf_va_fl = newPfn_region_leave_printf_va_fl;
	}
	public Object getPfn_data_fl() {
		return pfn_data_fl;
	}
	public void setPfn_data_fl(Object newPfn_data_fl) {
		pfn_data_fl = newPfn_data_fl;
	}
	public Object getPfn_data_json_fl() {
		return pfn_data_json_fl;
	}
	public void setPfn_data_json_fl(Object newPfn_data_json_fl) {
		pfn_data_json_fl = newPfn_data_json_fl;
	}
	public Object getPfn_printf_va_fl() {
		return pfn_printf_va_fl;
	}
	public void setPfn_printf_va_fl(Object newPfn_printf_va_fl) {
		pfn_printf_va_fl = newPfn_printf_va_fl;
	}
}
/* TR2_TGT_H */
