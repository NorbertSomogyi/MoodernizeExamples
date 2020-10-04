package application;

public class Shell_run_onceToFlush_if_needed {
	
	
	private static void shell_run_once(Object shell_commands, Byte line_buf, int len) {
		ModernizedCProgram.print_prompt();
		while (1) {
			int res = ModernizedCProgram.readline(line_buf, len);
			if (res == (true)) {
				break;
			} 
			if (!res) {
				ModernizedCProgram.handle_input_line(shell_commands, line_buf);
			} 
			ModernizedCProgram.print_prompt();
		}
	}
	private static void print_prompt() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'>');
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)' ');
		ModernizedCProgram.flush_if_needed();
	}
	/*
	 * Copyright (C) 2009, Freie Universitaet Berlin (FUB).
	 * Copyright (C) 2013, INRIA.
	 * Copyright (C) 2015 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell
	 * @{
	 *
	 * @file
	 * @brief       Implementation of a very simple command interpreter.
	 *              For each command (i.e. "echo"), a handler can be specified.
	 *              If the first word of a user-entered command line matches the
	 *              name of a handler, the handler will be called with the whole
	 *              command line as parameter.
	 *
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
	 *
	 * @}
	 */
	/** ASCII "End-of-Text", or ctrl-C */
	/* use local copy of putchar, as it seems to be inlined,
	 * enlarging code by 50% */
	private static void flush_if_needed() {
	}
}
