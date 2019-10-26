package application;

/*
 * The Trace2 settings that can be loaded from /etc/gitconfig
 * and/or user environment variables.
 *
 * Note that this set does not contain any of the transient
 * environment variables used to pass information from parent
 * to child git processes, such "GIT_TRACE2_PARENT_SID".
 */
public enum tr2_sysenv_variable {
	TR2_SYSENV_CFG_PARAM, 
	TR2_SYSENV_DST_DEBUG, 
	TR2_SYSENV_NORMAL, 
	TR2_SYSENV_NORMAL_BRIEF, 
	TR2_SYSENV_EVENT, 
	TR2_SYSENV_EVENT_BRIEF, 
	TR2_SYSENV_EVENT_NESTING, 
	TR2_SYSENV_PERF, 
	TR2_SYSENV_PERF_BRIEF, 
	TR2_SYSENV_MAX_FILES, 
	TR2_SYSENV_MUST_BE_LAST
}
