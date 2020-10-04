package application;

public class _gnrc_netif_configTo_del_usage {
	
	
	/* parse interface */
	/* parse address */
	/* put packet together */
	/* and send it */
	private static int _gnrc_netif_config(int argc, byte[][] argv) {
		if (argc < 2) {
			 netif = (null);
			while ((netif = /*Error: Function owner not recognized*/gnrc_netif_iter(netif))) {
				ModernizedCProgram._netif_list(netif.getPid());
			}
			return 0;
		}  else if (ModernizedCProgram._is_number(argv[1])) {
			 iface = /*Error: Function owner not recognized*/atoi(argv[1]);
			if (ModernizedCProgram._is_iface(iface)) {
				if (argc < 3) {
					ModernizedCProgram._netif_list(iface);
					return 0;
				}  else if (/*Error: Function owner not recognized*/strcmp(argv[2], "set") == 0) {
					if (argc < 5) {
						ModernizedCProgram._set_usage(argv[0]);
						return 1;
					} 
					return ModernizedCProgram._netif_set(argv[0], iface, argv[3], argv[4]);
				}  else if (/*Error: Function owner not recognized*/strcmp(argv[2], "add") == 0) {
					if (argc < 4) {
						ModernizedCProgram._add_usage(argv[0]);
						return 1;
					} 
					return ModernizedCProgram._netif_add(argv[0], ()iface, argc - 3, argv + 3);
				}  else if (/*Error: Function owner not recognized*/strcmp(argv[2], "del") == 0/* check for requested module */) {
					if (argc < 4) {
						ModernizedCProgram._del_usage(argv[0]);
						return 1;
					} 
					return ModernizedCProgram._netif_del(()iface, argv[3]);
				}  else if (/*Error: Function owner not recognized*/strcmp(argv[2], "help") == 0) {
					ModernizedCProgram._usage(argv[0]);
					return 0;
				} else {
						return ModernizedCProgram._netif_flag(argv[0], iface, argv[2]);
				} 
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: invalid interface given");
					return 1;
			} 
		} 
		ModernizedCProgram._usage(argv[0]);
		return 1;
	}
	/*
	 * Copyright (C) Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 * @author Martine Lenders <mlenders@inf.fu-berlin.de>
	 * @author Martin Landsmann <martin.landsmann@haw-hamburg.de>
	 */
	private static void _usage(Byte cmd) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: * %s\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Lists all addresses in the blacklist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s add <addr>\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Adds <addr> to the blacklist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s del <addr>\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Deletes <addr> from the blacklist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s help\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Print this.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Usage: %s <server addr>[%%<interface>] [<timeout in us>]\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("default: timeout = %lu\n", (true));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s [{add <0-15> <prefix>/<prefix_len> <ltime in min>|del <ctx>}]\n", cmd_str);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("       `del` will only invalidate the context for compression. It can be");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("       reassigned after 5 min.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: * %s\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Lists all addresses in the whitelist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s add <addr>\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Adds <addr> to the whitelist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s del <addr>\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Deletes <addr> from the whitelist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s help\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Print this.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s\n", cmd);
		ModernizedCProgram._set_usage(cmd);
		ModernizedCProgram._flag_usage(cmd);
		ModernizedCProgram._add_usage(cmd);
		ModernizedCProgram._del_usage(cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s {neigh|prefix|route|help} ...\n", argv[/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C */0/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C */]);
	}
	private static void _add_usage(Byte cmd_name) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s <if_id> add [anycast|multicast|unicast] <ipv6_addr>[/prefix_len]\n", cmd_name);
	}
	private static void _del_usage(Byte cmd_name) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s <if_id> del <ipv6_addr>\n", cmd_name);
	}
}
