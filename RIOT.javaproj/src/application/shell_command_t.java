package application;

/*
 * Copyright (C) 2009-2013 Freie Universität Berlin
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @defgroup    sys_shell Shell
 * @ingroup     sys
 * @brief       Simple shell interpreter
 *
 * @{
 *
 * @file
 * @brief       Shell interface definition
 */
/**
 * @brief Default shell buffer size (maximum line length shell can handle)
 */
/**
 * @brief           Protype of a shell callback handler.
 * @details         The functions supplied to shell_run() must use this signature.
 *                  The argument list is terminated with a NULL, i.e ``argv[argc] == NULL`.
 *                  ``argv[0]`` is the function name.
 *
 *                  Escape sequences are removed before the function is called.
 *
 *                  The called function may edit `argv` and the contained strings,
 *                  but it must be taken care of not to leave the boundaries of the array.
 *                  This functionality can be used by getopt() or a similar function.
 * @param[in]       argc   Number of arguments supplied to the function invocation.
 * @param[in]       argv   The supplied argument list.
 *
 * @return 0 on success
 * @return Anything else on failure
 */
/**
 * @brief           A single command in the list of the supported commands.
 * @details         The list of commands is NULL terminated,
 *                  i.e. the last element must be ``{ NULL, NULL, NULL }``.
 */
public class shell_command_t {
	private Object name;
	private Object desc;
	private Object handler;
	
	public shell_command_t(Object name, Object desc, Object handler) {
		setName(name);
		setDesc(desc);
		setHandler(handler);
	}
	public shell_command_t() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getDesc() {
		return desc;
	}
	public void setDesc(Object newDesc) {
		desc = newDesc;
	}
	public Object getHandler() {
		return handler;
	}
	public void setHandler(Object newHandler) {
		handler = newHandler;
	}
}
