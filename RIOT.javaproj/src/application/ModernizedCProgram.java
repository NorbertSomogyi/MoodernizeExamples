package application;

public class ModernizedCProgram {
	public static  puf_sram_seed = new ();
	public static  puf_sram_state = new ();
	public static  puf_sram_marker = new ();
	public static int pthread_setschedparam;
	public static int pthread_getschedparam;
	public static int pthread_setschedprio;
	public static [] sht1x_devs = new ();
	public static Object _event_handler;
	public static int _control_handler;
	public static Object _transfer_handler;
	public static Object _init;
	public static Object _handle_rx_flush_ev;
	public static Object _handle_tx_xmit;
	public static size_t _gen_full_ecm_descriptor = new size_t();
	public static  _ecm_descriptor = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static  cdcecm_driver = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static Object _event_loop;
	public static int iib_register_if;
	public static iib_link_set_entry_t iib_process_hello = new iib_link_set_entry_t();
	public static Object iib_fill_wr_addresses;
	public static Object iib_update_lt_status;
	public static Object iib_propagate_nb_entry_change;
	public static Object iib_process_metric_msg;
	public static Object iib_process_metric_pckt;
	public static Object iib_process_metric_refresh;
	public static int pthread_mutexattr_init;
	public static int pthread_mutexattr_destroy;
	public static int pthread_mutexattr_getpshared;
	public static int pthread_mutexattr_setpshared;
	public static int pthread_mutexattr_gettype;
	public static int pthread_mutexattr_settype;
	public static int pthread_mutexattr_getprotocol;
	public static int pthread_mutexattr_setprotocol;
	public static int pthread_mutexattr_getprioceiling;
	public static int pthread_mutexattr_setprioceiling;
	public static int pthread_mutexattr_getrobust;
	public static int pthread_mutexattr_setrobust;
	public static size_t universal_address_table_filled = /**
	 * universal address container implementation
	 *
	 * Copyright (C) 2014 Martin Landsmann <Martin.Landsmann@HAW-Hamburg.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *
	 * @ingroup sys_universal_address
	 * @{
	 * @file
	 * @brief   Functions to manage universal address container
	 * @author  Martin Landsmann <Martin.Landsmann@HAW-Hamburg.de>
	 * @}
	 *//**
	 * @brief Maximum number of entries handled
	 *//* determine the maximum numer of entries *//* all potential users of universal addresses have to add their requirements here *//* all potential users of universal addresses have to add their requirements here *//**
	 * @brief counter indicating the number of entries allocated
	 */0/**
	 * @brief The array of universal_address containers
	 */;
	public static universal_address_container_t[] universal_address_table = new universal_address_container_t();
	public static  mtx_access = MUTEX_INIT/**
	 * @brief finds the universal address container for the given address
	 *
	 * @param[in] addr       pointer to the address
	 * @param[in] addr_size  the number of bytes required for the address entry
	 *
	 * @return pointer to the universal_address_container_t containing the address on success
	 *         NULL if the address could not be inserted
	 */;
	public static  _driver = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static Object nhdp_writer_init;
	public static Object nhdp_writer_cleanup;
	public static Object nhdp_writer_register_if;
	public static Object nhdp_writer_send_hello;
	public static Object nhdp_writer_add_addr;
	public static vfs_file_ops_t _stdio_ops = new vfs_file_ops_t(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static Object ps;
	public static Object puf_sram_init;
	public static Object puf_sram_generate;
	public static  puf_sram_softreset = new ();
	public static int sa_family_t;
	public static int accept;
	public static int bind;
	public static int connect;
	public static int getpeername;
	public static int getsockname;
	public static int listen;
	public static ssize_t recvfrom = new ssize_t();
	public static ssize_t sendto = new ssize_t();
	public static int socket;
	public static int setsockopt;
	public static TINYMT32_T tinymt32_t = new TINYMT32_T();
	public static Object tinymt32_init;
	public static Object tinymt32_init_by_array;
	public static Object _rcvbuf_init;
	public static int _rcvbuf_get_buffer;
	public static Object _rcvbuf_release_buffer;
	public static Object suit_coap_run;
	public static  coap_subtree_handler = new ();
	public static int coap_blockwise_cb_t;
	public static coap_resource_subtree_t coap_resource_subtree_suit = new coap_resource_subtree_t();
	public static int suit_coap_get_blockwise_url;
	public static Object _event_cb;
	public static Object _event_ep_cb;
	public static Object _usbus_thread;
	public static int sock_dns_query;
	public static  sock_dns_server = new ();
	public static Object random_init;
	public static Object random_init_by_array;
	public static uint32_t random_uint32 = new uint32_t();
	public static Object random_bytes;
	public static uint32_t random_uint32_range = new uint32_t();
	public static schedstat_t[] sched_pidlist = new schedstat_t();
	public static Object init_schedstatistics;
	public static int riotboot_slot_current;
	public static int riotboot_slot_other;
	public static  riotboot_slot_get_image_startaddr = new ();
	public static Object riotboot_slot_jump;
	public static  riotboot_slot_get_hdr = new ();
	public static Object riotboot_slot_dump_addrs;
	public static int riotboot_slot_numof;
	public static [] riotboot_slots = new ();
	public static Object rtt_stdio_enable_stdin;
	public static Object rtt_stdio_enable_blocking_stdout;
	public static Object _handle_flush;
	public static  cdc_driver = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static size_t _gen_full_acm_descriptor = new size_t();
	public static size_t _gen_assoc_descriptor = new size_t();
	public static  _cdcacm_descriptor = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static  gnrc_rpl_evtimer = new ();
	public static quad_t __lmulq = new quad_t();
	public static Object phydat_dump;
	public static byte phydat_unit_to_str;
	public static byte phydat_prefix_from_scale;
	public static Object phydat_fit;
	public static usbus usbus_t = new usbus();
	public static usbus_handler usbus_handler_t = new usbus_handler();
	public static uint16_t usbus_add_string_descriptor = new uint16_t();
	public static uint16_t usbus_add_interface = new uint16_t();
	public static usbus_endpoint_t usbus_add_endpoint = new usbus_endpoint_t();
	public static Object usbus_add_conf_descriptor;
	public static Object usbus_register_event_handler;
	public static Object usbus_init;
	public static Object usbus_create;
	public static uint32_t _seed = /**
	 * Copyright (C) 2015 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *
	 * Code taken from C FAQ (http://c-faq.com/lib/rand.html).
	 *//**
	 * @ingroup sys_random
	 * @{
	 * @file
	 *
	 * @brief Simple Park & Miller "minimal standard" PRNG
	 *
	 * This file contains a simple Park-Miller pseudo random number generator.
	 *
	 * While not very random when considering crypto requirements, this is probably
	 * random enough anywhere where pseudo-randomness is sufficient, e.g., when
	 * provided with a sensible seed source, for MAC algorithms.
	 *
	 * The implementation is taken from the C FAQ, but modified to use magic number
	 * division and adapted to RIOT's coding conventions..
	 *
	 * @author Kaspar Schleiser <kaspar@schleiser.de>
	 * @}
	 *//* 44488 *//* 3399 */1;
	public static int pthread_attr_init;
	public static int pthread_attr_destroy;
	public static int pthread_attr_getdetachstate;
	public static int pthread_attr_setdetachstate;
	public static int pthread_attr_getguardsize;
	public static int pthread_attr_setguardsize;
	public static int pthread_attr_getschedparam;
	public static int pthread_attr_setschedparam;
	public static int pthread_attr_getschedpolicy;
	public static int pthread_attr_setschedpolicy;
	public static int pthread_attr_getinheritsched;
	public static int pthread_attr_setinheritsched;
	public static int pthread_attr_getscope;
	public static int pthread_attr_setscope;
	public static int pthread_attr_getstackaddr;
	public static int pthread_attr_setstackaddr;
	public static int pthread_attr_getstacksize;
	public static int pthread_attr_setstacksize;
	public static int _can_usage;
	public static vfs_file_ops vfs_file_ops_t = new vfs_file_ops();
	public static vfs_dir_ops vfs_dir_ops_t = new vfs_dir_ops();
	public static vfs_file_system_ops vfs_file_system_ops_t = new vfs_file_system_ops();
	public static vfs_mount_struct vfs_mount_t = new vfs_mount_struct();
	public static Object vfs_bind_stdio;
	public static int vfs_close;
	public static int vfs_fcntl;
	public static int vfs_fstat;
	public static int vfs_fstatvfs;
	public static off_t vfs_lseek = new off_t();
	public static int vfs_open;
	public static ssize_t vfs_read = new ssize_t();
	public static ssize_t vfs_write = new ssize_t();
	public static int vfs_opendir;
	public static int vfs_readdir;
	public static int vfs_closedir;
	public static int vfs_format;
	public static int vfs_mount;
	public static int vfs_rename;
	public static int vfs_umount;
	public static int vfs_unlink;
	public static int vfs_mkdir;
	public static int vfs_rmdir;
	public static int vfs_stat;
	public static int vfs_statvfs;
	public static int vfs_bind;
	public static int vfs_normalize_path;
	public static vfs_mount_t vfs_iterate_mounts = new vfs_mount_t();
	public static Object sema_create;
	public static Object sema_destroy;
	public static int _sema_wait;
	public static int sema_post;
	public static  pthread_mutex_t = new ();
	public static int pthread_mutex_init;
	public static int pthread_mutex_destroy;
	public static int pthread_mutex_trylock;
	public static int pthread_mutex_lock;
	public static int pthread_mutex_timedlock;
	public static int pthread_mutex_unlock;
	public static int pthread_mutex_getprioceiling;
	public static int pthread_mutex_setprioceiling;
	public static Object suit_init_conditions;
	public static uuid_t suit_get_vendor_id = new uuid_t();
	public static uuid_t suit_get_class_id = new uuid_t();
	public static uuid_t suit_get_device_id = new uuid_t();
	public static  ctx = new ();
	public static uint32_t datapos = /*
	 * Copyright (C) 2018 HAW Hamburg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *
	 * Code referring to Docjar
	 * (http://www.docjar.net/html/api/gnu/java/security/provider/SHA1PRNG.java.html)
	 *//**
	 * @ingroup sys_random
	 * @{
	 * @file
	 *
	 * @brief   SHA1PRNG random number generator implementation
	 *
	 * @author Peter Kietzmann <peter.kietzmann@haw-hamburg.de>
	 * @}
	 */(true);
	public static int8_t[] digestdata = new int8_t();
	public static int8_t[] prng_state = new int8_t();
	public static int _reboot_handler;
	public static shell_command_t[] _shell_command_list = new shell_command_t[]{new shell_command_t("reboot", "Reboot the node", _reboot_handler), new shell_command_t(((Object)0), ((Object)0), ((Object)0))};
	public static nhdp_addr_t nhdp_addr_db_get_address = new nhdp_addr_t();
	public static Object nhdp_decrement_addr_usage;
	public static Object nhdp_free_addr_list;
	public static Object nhdp_free_addr_entry;
	public static nhdp_addr_entry_t nhdp_generate_addr_list_from_tmp = new nhdp_addr_entry_t();
	public static Object nhdp_reset_addresses_tmp_usg;
	public static nhdp_addr_t nhdp_get_addr_db_head = new nhdp_addr_t();
	public static uint32_t _state32 = new uint32_t();
	public static  CSMA_SENDER_CONF_DEFAULT = new (/*
	 * Copyright (C) 2015 INRIA
	 * Copyright (C) 2016 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @{
	 * @ingroup     net_csma_sender
	 * @file
	 * @brief       Implementation of the CSMA/CA helper
	 *
	 * @author      Kévin Roussel <Kevin.Roussel@inria.fr>
	 * @author      Martine Lenders <mlenders@inf.fu-berlin.de>
	 * @}
	 *//* For PRIu16 etc. */CSMA_SENDER_MIN_BE_DEFAULT, CSMA_SENDER_MAX_BE_DEFAULT, CSMA_SENDER_MAX_BACKOFFS_DEFAULT, CSMA_SENDER_BACKOFF_PERIOD_UNIT/*--------------------- "INTERNAL" UTILITY FUNCTIONS ---------------------*//**
	 * @brief choose an adequate random backoff period in microseconds,
	 *        from the given Backoff Exponent
	 *
	 * @param[in] be        Backoff Exponent for the computation of period
	 *
	 * @return              An adequate random backoff exponent in microseconds
	 */);
	public static  netif_list = new ();
	public static  mtx_addr_access = /*
	 * Copyright (C) 2014 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     nhdp
	 * @{
	 *
	 * @file
	 * @brief       Centralized address storage implementation for NHDP
	 *
	 * @author      Fabian Nack <nack@inf.fu-berlin.de>
	 *
	 * @}
	 *//* Internal variables */MUTEX_INIT;
	public static nhdp_addr_t nhdp_addr_db_head = NULL/*---------------------------------------------------------------------------*
	 *                      Centralized Address Storage API                      *
	 *---------------------------------------------------------------------------*/;
	public static int pthread_spin_init;
	public static int pthread_spin_destroy;
	public static int pthread_spin_lock;
	public static int pthread_spin_trylock;
	public static int pthread_spin_unlock;
	public static int pthread_barrier_init;
	public static int pthread_barrier_destroy;
	public static int pthread_barrier_wait;
	public static int pthread_barrierattr_init;
	public static int pthread_barrierattr_destroy;
	public static int pthread_barrierattr_getpshared;
	public static int pthread_barrierattr_setpshared;
	public static uint32_t[] fortuna_seed_t = new uint32_t();
	public static int fortuna_init;
	public static int fortuna_random_data;
	public static int fortuna_add_random_event;
	public static int fortuna_write_seed;
	public static int fortuna_update_seed;
	public static uint32_t[] mt = new uint32_t();
	public static uint16_t mti = (624 + 1);
	public static uint64_t gnrc_gomach_phase_now = new uint64_t();
	public static Object gnrc_gomach_set_netdev_state;
	public static int _gnrc_gomach_transmit;
	public static  gnrc_gomach_check_duplicate = new ();
	public static int gnrc_gomach_send;
	public static int gnrc_gomach_send_preamble_ack;
	public static int gnrc_gomach_send_beacon;
	public static int gnrc_gomach_dispatch_defer;
	public static Object gnrc_gomach_indicator_update;
	public static Object gnrc_gomach_cp_packet_process;
	public static Object gnrc_gomach_init_choose_subchannel;
	public static int gnrc_gomach_bcast_subchann_seq;
	public static int gnrc_gomach_send_preamble;
	public static Object gnrc_gomach_process_preamble_ack;
	public static Object gnrc_gomach_process_pkt_in_wait_preamble_ack;
	public static int gnrc_gomach_send_data;
	public static  gnrc_gomach_find_next_tx_neighbor = new ();
	public static Object gnrc_gomach_beacon_process;
	public static Object gnrc_gomach_packet_process_in_wait_beacon;
	public static Object gnrc_gomach_packet_process_in_vtdma;
	public static Object gnrc_gomach_update_neighbor_phase;
	public static Object gnrc_gomach_update_neighbor_pubchan;
	public static saul_reg_t saul_reg = new saul_reg_t();
	public static int saul_reg_add;
	public static int saul_reg_rm;
	public static saul_reg_t saul_reg_find_nth = new saul_reg_t();
	public static saul_reg_t saul_reg_find_type = new saul_reg_t();
	public static saul_reg_t saul_reg_find_name = new saul_reg_t();
	public static int saul_reg_read;
	public static int saul_reg_write;
	public static int pthread_cond_condattr_init;
	public static int pthread_cond_condattr_destroy;
	public static int pthread_condattr_getpshared;
	public static int pthread_condattr_setpshared;
	public static int pthread_condattr_getclock;
	public static int pthread_condattr_setclock;
	public static int pthread_cond_init;
	public static int pthread_cond_destroy;
	public static int pthread_cond_wait;
	public static int pthread_cond_timedwait;
	public static int pthread_cond_signal;
	public static int pthread_cond_broadcast;
	public static int _handle_command_sequence;
	public static int _common_handler;
	public static int _common_sequence_handler;
	public static [] global_handlers = new []{/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/};
	public static int global_handlers_len = /*Error: Function owner not recognized*/ARRAY_SIZE(/* end{code-style-ignore} */global_handlers);
	public static [] _sequence_handlers = new []{/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/};
	public static int _sequence_handlers_len = /*Error: Function owner not recognized*/ARRAY_SIZE(/* end{code-style-ignore} */_sequence_handlers);
	public static sema_t sem_t = new sema_t();
	public static int sem_timedwait;
	public static sock_dtls sock_dtls_t = new sock_dtls();
	public static sock_dtls_session sock_dtls_session_t = new sock_dtls_session();
	public static Object sock_dtls_init;
	public static int sock_dtls_create;
	public static int sock_dtls_session_create;
	public static Object sock_dtls_session_destroy;
	public static ssize_t sock_dtls_recv = new ssize_t();
	public static ssize_t sock_dtls_send = new ssize_t();
	public static Object sock_dtls_close;
	public static int shell_command_handler_t;
	public static Object shell_run_once;
	public static  tls_mutex = new ();
	public static Object sixlowpan_print;
	public static  mtx_iib_access = /*
	 * Copyright (C) 2014 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     nhdp
	 * @{
	 *
	 * @file
	 * @brief       Interface Information Base implementation for NHDP
	 *
	 * @author      Fabian Nack <nack@inf.fu-berlin.de>
	 *
	 * @}
	 *//* Internal variables */MUTEX_INIT;
	public static iib_base_entry_t iib_base_entry_head = ((Object)0);
	public static Object rem_link_set_entry;
	public static Object cleanup_link_sets;
	public static iib_link_set_entry_t add_default_link_set_entry = new iib_link_set_entry_t();
	public static Object reset_link_set_entry;
	public static iib_link_set_entry_t update_link_set = new iib_link_set_entry_t();
	public static Object release_link_tuple_addresses;
	public static int update_two_hop_set;
	public static int add_two_hop_entry;
	public static Object rem_two_hop_entry;
	public static Object wr_update_ls_status;
	public static Object update_nb_tuple_symmetry;
	public static Object rem_not_heard_nb_tuple;
	public static timex_t get_max_timex = new timex_t();
	public static iib_link_tuple_status_t get_tuple_status = new iib_link_tuple_status_t();
	public static Object gnrc_lwmac_tx_start;
	public static Object gnrc_lwmac_tx_stop;
	public static Object gnrc_lwmac_tx_update;
	public static int suit_manifest_handler_t;
	public static suit_manifest_handler_t suit_manifest_get_manifest_handler = new suit_manifest_handler_t();
	public static Object malloc;
	public static Object realloc;
	public static Object calloc;
	public static Object free;
	public static uint32_t[] lookup_table_positive = new uint32_t[]{/*
	 * Copyright (C) 2018 Eistec AB
	 *               2018 Otto-von-Guericke-Universität Magdeburg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     sys_phydat
	 * @{
	 *
	 * @file
	 * @brief       Generic sensor/actuator data handling
	 *
	 * @author      Joakim Nohlgård <joakim.nohlgard@eistec.se>
	 * @author      Marian Buschsieweke <marian.buschsieweke@ovgu.de>
	 *
	 * @}
	 */327674999, 32767499, 3276749, 327674, 32767};
	public static uint32_t[] divisors = new uint32_t[]{100000, 10000, 1000, 100, 10};
	public static xtimer_t[] del_timer = new xtimer_t();
	public static pthread_thread_t[] pthread_sched_threads = new pthread_thread_t();
	public static  pthread_mutex = new ();
	public static  pthread_reaper_pid = KERNEL_PID_UNDEF;
	public static byte[] pthread_reaper_stack = new byte[THREAD_STACKSIZE_DEFAULT];
	public static __pthread_tls_key pthread_key_t = new __pthread_tls_key();
	public static Object pthread_getspecific;
	public static int pthread_setspecific;
	public static int pthread_key_create;
	public static int pthread_key_delete;
	public static Object __pthread_keys_exit;
	public static __pthread_tls_datum __pthread_get_tls_head = new __pthread_tls_datum();
	public static int PURE;
	public static Object skald_ibeacon_advertise;
	public static  _manifest_get_auth_wrapper_handler = new ();
	public static  suit_manifest_handler_getter_t = new ();
	public static [] _auth_handlers = new []{/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/};
	public static int _auth_handlers_len = /*Error: Function owner not recognized*/ARRAY_SIZE(/* end{code-style-ignore} */_auth_handlers);
	public static int sntp_sync;
	public static int64_t sntp_get_offset = new int64_t();
	public static int8_t[] TM_MON_DAYS = new int8_t[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int16_t[] TM_MON_DAYS_ACCU = new int16_t[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	public static int riotboot_flashwrite_init_raw;
	public static int riotboot_flashwrite_putbytes;
	public static int riotboot_flashwrite_finish_raw;
	public static  riotboot_flashwrite_slotsize = new ();
	public static int riotboot_flashwrite_verify_sha256;
	public static byte[] nhdp_stack = new byte[/*
	 * Copyright (C) 2014 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     nhdp
	 * @{
	 *
	 * @file
	 * @brief       Implementation of NHDP's core functionality
	 *
	 * @author      Fabian Nack <nack@inf.fu-berlin.de>
	 *
	 * @}
	 */(THREAD_STACKSIZE_DEFAULT)];
	public static byte[] nhdp_rcv_stack = new byte[(THREAD_STACKSIZE_DEFAULT)];
	public static  nhdp_pid = /* Internal variables */KERNEL_PID_UNDEF;
	public static  nhdp_rcv_pid = KERNEL_PID_UNDEF;
	public static  helper_pid = KERNEL_PID_UNDEF;
	public static nhdp_if_entry_t[] nhdp_if_table = new nhdp_if_entry_t();
	public static  send_rcv_mutex = MUTEX_INIT;
	public static  sock = new ();
	public static Object _nhdp_runner;
	public static Object _nhdp_receiver;
	public static Object write_packet;
	public static byte[] _ansi_codes = new byte[]{/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/};
	public static size_t socklen_t = new size_t();
	public static Object _handler_ep0_event;
	public static Object _handler_ep0_transfer;
	public static  _ep0_driver = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static usbus_cdcacm_device usbus_cdcacm_device_t = new usbus_cdcacm_device();
	public static Object usbus_cdcacm_cb_t;
	public static int usbus_cdcacm_coding_cb_t;
	public static Object usbus_cdc_acm_init;
	public static size_t usbus_cdc_acm_submit = new size_t();
	public static Object usbus_cdc_acm_flush;
	public static Object usbus_cdc_acm_set_coding_cb;
	public static int pthread_t;
	public static int pthread_create;
	public static Object pthread_exit;
	public static int NORETURN;
	public static int pthread_join;
	public static int pthread_detach;
	public static pthread_t pthread_self = new pthread_t();
	public static  _xtimer_now64 = new ();
	public static int _xtimer_set_absolute;
	public static Object _xtimer_set;
	public static Object _xtimer_set64;
	public static Object _xtimer_periodic_wakeup;
	public static Object _xtimer_set_msg;
	public static Object _xtimer_set_msg64;
	public static Object _xtimer_set_wakeup;
	public static Object _xtimer_set_wakeup64;
	public static int _xtimer_msg_receive_timeout;
	public static int _xtimer_msg_receive_timeout64;
	public static Object _xtimer_tsleep;
	public static Object __pthread_cleanup_push;
	public static Object __pthread_cleanup_pop;
	public static Object skald_eddystone_uid_adv;
	public static Object skald_eddystone_url_adv;
	public static int _option_parse;
	public static int pthread_rwlockattr_init;
	public static int pthread_rwlockattr_destroy;
	public static int pthread_rwlockattr_getpshared;
	public static int pthread_rwlockattr_setpshared;
	public static  gnrc_tcp_pid = new ();
	public static  _list_tcb_head = new ();
	public static  _list_tcb_lock = new ();
	public static Object test_utils_interactive_sync;
	public static uuid_t uuid_namespace_dns = new uuid_t();
	public static uuid_t uuid_namespace_url = new uuid_t();
	public static uuid_t uuid_namespace_iso = new uuid_t();
	public static uuid_t uuid_namespace_x500 = new uuid_t();
	public static Object uuid_v3;
	public static Object uuid_v4;
	public static Object uuid_v5;
	public static Object uuid_to_string;
	public static int uuid_from_string;
	public static Object riotboot_hdr_print;
	public static int riotboot_hdr_validate;
	public static uint32_t riotboot_hdr_checksum = new uint32_t();
	public static int creat;
	public static int fcntl;
	public static int open;
	public static int openat;
	public static int posix_fadvise;
	public static int posix_fallocate;
	public static int ringbuffer_op_t;
	public static int tm_is_leap_year;
	public static int CONST;
	public static int tm_doomsday;
	public static Object tm_get_wyday;
	public static Object tm_fill_derived_values;
	public static int tm_is_valid_date;
	public static int tm_is_valid_time;
	public static size_t usbus_fmt_hdr_conf = new size_t();
	public static size_t usbus_fmt_hdr_dev = new size_t();
	public static byte _sheap;
	public static byte _eheap;
	public static byte heap_top = /*
	 * Copyright (C) 2015 Kaspar Schleiser <kaspar@schleiser.de>
	 *               2014 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser General
	 * Public License v2.1. See the file LICENSE in the top level directory for more
	 * details.
	 *//**
	 * @defgroup    sys_newlib Newlib system call
	 * @ingroup     sys
	 * @brief       Newlib system call
	 * @{
	 *
	 * @file
	 * @brief       Newlib system call implementations
	 *
	 * @author      Michael Baar <michael.baar@fu-berlin.de>
	 * @author      Stefan Pfeiffer <pfeiffer@inf.fu-berlin.de>
	 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * @}
	 */_sheap + /**
	 * @brief manage the heap
	 *//* start of the heap *//* end of the heap */4/* MIPS newlib crt implements _init,_fini and _exit and manages the heap */;
	public static _sock_tl_ep sock_udp_ep_t = new _sock_tl_ep();
	public static sock_udp sock_udp_t = new sock_udp();
	public static int sock_udp_create;
	public static Object sock_udp_close;
	public static int sock_udp_get_local;
	public static int sock_udp_get_remote;
	public static ssize_t sock_udp_recv = new ssize_t();
	public static ssize_t sock_udp_send = new ssize_t();
	public static Object trickle_reset_timer;
	public static Object trickle_start;
	public static Object trickle_stop;
	public static Object trickle_increment_counter;
	public static Object trickle_interval;
	public static Object trickle_callback;
	public static int pthread_setcancelstate;
	public static int pthread_setcanceltype;
	public static int pthread_cancel;
	public static Object pthread_testcancel;
	public static  gnrc_rpl_get_of0 = new ();
	public static  ipv6_addr_unspecified = /*
	 * Copyright (C) 2015 Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser General
	 * Public License v2.1. See the file LICENSE in the top level directory for
	 * more details.
	 *//**
	 * @{
	 *
	 * @file
	 *
	 * @author      Martine Lenders <mlenders@inf.fu-berlin.de>
	 */IPV6_ADDR_UNSPECIFIED;
	public static  ipv6_addr_loopback = IPV6_ADDR_LOOPBACK;
	public static  ipv6_addr_link_local_prefix = IPV6_ADDR_LINK_LOCAL_PREFIX;
	public static  ipv6_addr_solicited_node_prefix = IPV6_ADDR_SOLICITED_NODE_PREFIX;
	public static  ipv6_addr_all_nodes_if_local = IPV6_ADDR_ALL_NODES_IF_LOCAL;
	public static  ipv6_addr_all_nodes_link_local = IPV6_ADDR_ALL_NODES_LINK_LOCAL;
	public static  ipv6_addr_all_routers_if_local = IPV6_ADDR_ALL_ROUTERS_IF_LOCAL;
	public static  ipv6_addr_all_routers_link_local = IPV6_ADDR_ALL_ROUTERS_LINK_LOCAL;
	public static  ipv6_addr_all_routers_site_local = IPV6_ADDR_ALL_ROUTERS_SITE_LOCAL;
	public static Object universal_address_init;
	public static Object universal_address_reset;
	public static universal_address_container_t universal_address_add = new universal_address_container_t();
	public static Object universal_address_rem;
	public static uint8_t universal_address_get_address = new uint8_t();
	public static int universal_address_compare;
	public static int universal_address_compare_prefix;
	public static Object universal_address_print_entry;
	public static int universal_address_get_num_used_entries;
	public static Object universal_address_print_table;
	public static int suit_v4_parse;
	public static int suit_v4_policy_check;
	public static int suit_cbor_map_iterate_init;
	public static int suit_cbor_map_iterate;
	public static int suit_cbor_get_int32;
	public static int suit_cbor_get_uint;
	public static int suit_cbor_get_uint32;
	public static int suit_cbor_get_string;
	public static int suit_cbor_subparse;
	public static int suit_flashwrite_helper;
	public static Object usbus_cdcecm_init;
	public static int lib_add_if_addr;
	public static Object lib_rem_if;
	public static Object lib_fill_wr_addresses;
	public static  lib_is_reg_addr = new ();
	public static byte[] _stack = new byte[/*
	 * Copyright (C) 2019 Freie Universität Berlin
	 *               2019 Inria
	 *               2019 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     sys_suit
	 * @{
	 *
	 * @file
	 * @brief       SUIT coap
	 *
	 * @author      Koen Zandberg <koen@bergzand.net>
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 * @}
	 *//* allocate stack needed to keep a page buffer and do manifest validation *//* allocate stack needed to keep a page buffer and do manifest validation */(3 * THREAD_STACKSIZE_LARGE + FLASHPAGE_SIZE)];
	public static byte[] _url = new byte[128];
	public static uint8_t[] _manifest_buf = new uint8_t();
	public static  _suit_coap_pid = new ();
	public static [] _subtree = new []{new ("/suit/trigger", COAP_METHOD_PUT | COAP_METHOD_POST, _trigger_handler, ((Object)0)), new ("/suit/version", COAP_METHOD_GET, _version_handler, ((Object)0))};
	public static byte[] ___QUAD_ASSERT__LENGHTS = new byte[/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 *
	 * $OpenBSD: quad.h,v 1.7 2009/11/07 23:09:35 jsg Exp $
	 *//*
	 * Quad arithmetic.
	 *
	 * This library makes the following assumptions:
	 *
	 *  - The type long long (aka quad_t) exists.
	 *
	 *  - A quad variable is exactly twice as long as `int'.
	 *
	 *  - The machine's arithmetic is two's complement.
	 *
	 * This library can provide 128-bit arithmetic on a machine with 128-bit
	 * quads and 64-bit ints, for instance, or 96-bit arithmetic on machines
	 * with 48-bit ints.
	 *//*Error: Unsupported expression*/ == 2 * /*Error: Unsupported expression*/ ? +1 : -1];
	public static byte[] ___QUAD_ASSERT__2COMPLEMENT = new byte[-1234 == (~1234 + 1) ? +1 : -1/*
	 * Define high and low parts of a quad_t.
	 */];
	public static long quad_t;
	public static long u_quad_t;
	public static int qshift_t;
	public static quad_t __adddi3 = new quad_t();
	public static quad_t __anddi3 = new quad_t();
	public static quad_t __ashldi3 = new quad_t();
	public static quad_t __ashrdi3 = new quad_t();
	public static int __cmpdi2;
	public static quad_t __divdi3 = new quad_t();
	public static quad_t __fixdfdi = new quad_t();
	public static quad_t __fixsfdi = new quad_t();
	public static u_quad_t __fixunsdfdi = new u_quad_t();
	public static u_quad_t __fixunssfdi = new u_quad_t();
	public static double __floatdidf;
	public static double __floatdisf;
	public static double __floatunsdidf;
	public static quad_t __iordi3 = new quad_t();
	public static quad_t __lshldi3 = new quad_t();
	public static quad_t __lshrdi3 = new quad_t();
	public static quad_t __moddi3 = new quad_t();
	public static quad_t __muldi3 = new quad_t();
	public static quad_t __negdi2 = new quad_t();
	public static quad_t __one_cmpldi2 = new quad_t();
	public static u_quad_t __qdivrem = new u_quad_t();
	public static quad_t __subdi3 = new quad_t();
	public static int __ucmpdi2;
	public static u_quad_t __udivdi3 = new u_quad_t();
	public static u_quad_t __umoddi3 = new u_quad_t();
	public static quad_t __xordi3 = new quad_t();
	public static uint16_t in_port_t = new uint16_t();
	public static uint32_t in_addr_t = new uint32_t();
	public static in6_addr in6addr_any = new in6_addr();
	public static in6_addr in6addr_loopback = new in6_addr();
	public static  _conditions = new ();
	public static  mtx_lib_access = /*
	 * Copyright (C) 2014 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     nhdp
	 * @{
	 *
	 * @file
	 * @brief       Local Information Base implementation for NHDP
	 *
	 * @author      Fabian Nack <nack@inf.fu-berlin.de>
	 *
	 * @}
	 *//* Internal variables */MUTEX_INIT;
	public static lib_entry_t lib_entry_head = NULL;
	public static int create_if_entry;
	public static int add_address_to_if;
	public static Object od_hex_dump;
	public static Object nhdp_init;
	public static  nhdp_start = new ();
	public static int nhdp_register_if_default;
	public static int nhdp_register_if;
	public static int nhdp_register_non_manet_if;
	public static int nhdp_add_address;
	public static byte inet_ntop;
	public static int inet_pton;
	public static  loramac = new ();
	public static byte[] print_buf = new byte[/*
	 * Copyright 2018 Inria
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Shell command implementation for Semtech loramac stack
	 *
	 * @author      Alexandre Abadie <alexandre.abadie@inria.fr>
	 *
	 * @}
	 */LORAMAC_APPKEY_LEN * 2 + /* Application key is 16 bytes long (e.g. 32 hex chars), and thus the longest
	   possible size (with application session and network session keys) */1];
	public static ubjson_cookie ubjson_cookie_t = new ubjson_cookie();
	public static ssize_t ubjson_read_t = new ssize_t();
	public static ubjson_read_callback_result_t ubjson_read_callback_t = new ubjson_read_callback_result_t();
	public static ssize_t ubjson_write_t = new ssize_t();
	public static ubjson_read_callback_result_t ubjson_read_next = new ubjson_read_callback_result_t();
	public static ubjson_read_callback_result_t ubjson_peek_value = new ubjson_read_callback_result_t();
	public static ssize_t ubjson_get_i32 = new ssize_t();
	public static ssize_t ubjson_get_i64 = new ssize_t();
	public static ssize_t ubjson_get_string = new ssize_t();
	public static ubjson_read_callback_result_t ubjson_read_array = new ubjson_read_callback_result_t();
	public static ubjson_read_callback_result_t ubjson_read_object = new ubjson_read_callback_result_t();
	public static ssize_t ubjson_write_null = new ssize_t();
	public static ssize_t ubjson_write_noop = new ssize_t();
	public static ssize_t ubjson_write_bool = new ssize_t();
	public static ssize_t ubjson_write_i32 = new ssize_t();
	public static ssize_t ubjson_write_i64 = new ssize_t();
	public static ssize_t ubjson_write_float = new ssize_t();
	public static ssize_t ubjson_write_double = new ssize_t();
	public static ssize_t ubjson_write_string = new ssize_t();
	public static ssize_t ubjson_open_array = new ssize_t();
	public static ssize_t ubjson_open_array_len = new ssize_t();
	public static ssize_t ubjson_close_array = new ssize_t();
	public static ssize_t ubjson_open_object = new ssize_t();
	public static ssize_t ubjson_open_object_len = new ssize_t();
	public static ssize_t ubjson_write_key = new ssize_t();
	public static ssize_t ubjson_close_object = new ssize_t();
	public static vfs_file_t[] _vfs_open_files = new vfs_file_t();
	public static  _vfs_mounts_list = new ();
	public static int _allocate_fd;
	public static Object _free_fd;
	public static int _init_fd;
	public static int _find_mount;
	public static int _fd_is_valid;
	public static  _mount_mutex = MUTEX_INIT;
	public static  _open_mutex = MUTEX_INIT;
	public static pm_blocker_t pm_blocker = new pm_blocker_t(/*Error: Invalid initializer*/);
	public static Object gnrc_lwmac_rx_start;
	public static Object gnrc_lwmac_rx_stop;
	public static Object gnrc_lwmac_rx_update;
	public static Object nhdp_reader_init;
	public static Object nhdp_reader_cleanup;
	public static int nhdp_reader_handle_packet;
	public static int pthread_once_t;
	public static int pthread_once;
	public static int digit;
	public static Object shl;
	public static _sock_tl_ep sock_tcp_ep_t = new _sock_tl_ep();
	public static sock_tcp sock_tcp_t = new sock_tcp();
	public static sock_tcp_queue sock_tcp_queue_t = new sock_tcp_queue();
	public static int sock_tcp_connect;
	public static int sock_tcp_listen;
	public static Object sock_tcp_disconnect;
	public static Object sock_tcp_stop_listen;
	public static int sock_tcp_get_local;
	public static int sock_tcp_get_remote;
	public static int sock_tcp_queue_get_local;
	public static int sock_tcp_accept;
	public static ssize_t sock_tcp_read = new ssize_t();
	public static ssize_t sock_tcp_write = new ssize_t();
	public static Object pm_block;
	public static Object pm_unblock;
	public static Object pm_set;
	public static byte[] _int_buf = new byte[/*
	 * Copyright (C) 2015, 2016  INRIA.
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Shell commands to interact with the CCN-Lite stack
	 *
	 * @author      Oliver Hahm <oliver.hahm@inria.fr>
	 *
	 * @}
	 */(true)];
	public static byte[] _out = new byte[CCNL_MAX_PACKET_SIZE];
	public static int _in_handler = /**
	 * Copyright (C) 2015 Kaspar Schleiser <kaspar@schleiser.de>
	 *               2016 Eistec AB
	 *               2018 Josua Arndt
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup sys_xtimer
	 *
	 * @{
	 * @file
	 * @brief xtimer core functionality
	 * @author Kaspar Schleiser <kaspar@schleiser.de>
	 * @author Joakim Nohlgård <joakim.nohlgard@eistec.se>
	 * @author Josua Arndt <jarndt@ias.rwth-aachen.de>
	 * @}
	 *//* WARNING! enabling this will have side effects and can lead to timer underflows. */0;
	public static uint32_t _long_cnt = 0;
	public static Object xtimer_spin_until;
	public static xtimer_t timer_list_head = ((Object)0);
	public static xtimer_t overflow_list_head = ((Object)0);
	public static xtimer_t long_list_head = ((Object)0);
	public static Object _add_timer_to_list;
	public static Object _add_timer_to_long_list;
	public static Object _shoot;
	public static Object _remove;
	public static Object _lltimer_set;
	public static uint32_t _time_left = new uint32_t();
	public static Object _timer_callback;
	public static Object _periph_timer_callback;
	public static int _this_high_period;
	public static Object pipe_init;
	public static ssize_t pipe_read = new ssize_t();
	public static ssize_t pipe_write = new ssize_t();
	public static pipe_t pipe_malloc = new pipe_t();
	public static Object pipe_free;
	public static int tsrb_get_one;
	public static int tsrb_get;
	public static int tsrb_drop;
	public static int tsrb_add_one;
	public static int tsrb_add;
	public static  cdcacm = new ();
	public static [] _cdc_tx_buf_mem = new ();
	public static [] _cdc_rx_buf_mem = new ();
	public static  _cdc_stdio_isrpipe = /*Error: Function owner not recognized*/ISRPIPE_INIT(_cdc_rx_buf_mem);
	public static  _nib_evtimer = new ();
	public static _nib_dr_entry_t _prime_def_router = new _nib_dr_entry_t();
	public static Object _nib_init;
	public static Object _nib_acquire;
	public static Object _nib_release;
	public static _nib_onl_entry_t _nib_onl_alloc = new _nib_onl_entry_t();
	public static _nib_onl_entry_t _nib_onl_iter = new _nib_onl_entry_t();
	public static _nib_onl_entry_t _nib_onl_get = new _nib_onl_entry_t();
	public static _nib_onl_entry_t _nib_nc_add = new _nib_onl_entry_t();
	public static Object _nib_nc_remove;
	public static Object _nib_nc_get;
	public static Object _nib_nc_set_reachable;
	public static _nib_dr_entry_t _nib_drl_add = new _nib_dr_entry_t();
	public static Object _nib_drl_remove;
	public static _nib_dr_entry_t _nib_drl_iter = new _nib_dr_entry_t();
	public static _nib_dr_entry_t _nib_drl_get = new _nib_dr_entry_t();
	public static Object _nib_drl_ft_get;
	public static _nib_dr_entry_t _nib_drl_get_dr = new _nib_dr_entry_t();
	public static _nib_offl_entry_t _nib_offl_alloc = new _nib_offl_entry_t();
	public static Object _nib_offl_clear;
	public static _nib_offl_entry_t _nib_offl_iter = new _nib_offl_entry_t();
	public static boolean _nib_offl_is_entry;
	public static _nib_offl_entry_t _nib_pl_add = new _nib_offl_entry_t();
	public static Object _nib_pl_remove;
	public static Object _nib_ft_get;
	public static int _nib_get_route;
	public static uint32_t _evtimer_lookup = new uint32_t();
	public static byte[] state_names = new byte[]{/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/};
	public static uint8_t seq8_t = new uint8_t();
	public static uint16_t seq16_t = new uint16_t();
	public static uint32_t seq32_t = new uint32_t();
	public static uint64_t seq64_t = new uint64_t();
	public static seq8_t seq8_adds = new seq8_t();
	public static int seq8_compares;
	public static seq16_t seq16_adds = new seq16_t();
	public static int seq16_compares;
	public static seq32_t seq32_adds = new seq32_t();
	public static int seq32_compares;
	public static seq64_t seq64_adds = new seq64_t();
	public static int seq64_compares;
	public static Object gnrc_sock_create;
	public static  gnrc_sock_recv = new ();
	public static  gnrc_sock_send = new ();
	public static rfc5444_reader reader = new rfc5444_reader();
	public static  mtx_packet_handler = MUTEX_INIT;
	public static iib_link_set_entry_t originator_link_tuple = NULL;
	public static uint32_t lt_metric_val = (false);
	public static  if_pid = new ();
	public static uint64_t val_time = new uint64_t();
	public static uint64_t int_time = new uint64_t();
	public static uint8_t sym = 0;
	public static uint8_t lost = 0;
	public static rfc5444_result _nhdp_pkt_end_cb;
	public static rfc5444_result _nhdp_blocktlv_msg_cb;
	public static rfc5444_result _nhdp_blocktlv_address_cb;
	public static rfc5444_result _nhdp_msg_end_cb;
	public static rfc5444_result check_msg_validity;
	public static rfc5444_result check_addr_validity;
	public static nhdp_addr_t get_nhdp_db_addr = new nhdp_addr_t();
	public static Object add_temp_metric_value;
	public static Object process_temp_tables;
	public static rfc5444_reader_tlvblock_consumer_entry[] _nhdp_msg_tlvs = new rfc5444_reader_tlvblock_consumer_entry[]{/*Error: Invalid initializer*/, /*Error: Invalid initializer*/};
	public static rfc5444_reader_tlvblock_consumer_entry[] _nhdp_addr_tlvs = new rfc5444_reader_tlvblock_consumer_entry[]{/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/};
	public static rfc5444_reader_tlvblock_consumer _nhdp_packet_consumer = new rfc5444_reader_tlvblock_consumer(/*Error: Invalid initializer*/);
	public static rfc5444_reader_tlvblock_consumer _nhdp_msg_consumer = new rfc5444_reader_tlvblock_consumer(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static rfc5444_reader_tlvblock_consumer _nhdp_address_consumer = new rfc5444_reader_tlvblock_consumer(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static Object sbrk;
	public static int _fsm;
	public static boolean _ubjson_read_struct_continue;
	public static Object skald_init;
	public static Object skald_adv_start;
	public static Object skald_adv_stop;
	public static Object skald_generate_random_addr;
	public static sock_ip sock_ip_t = new sock_ip();
	public static int sock_ip_create;
	public static Object sock_ip_close;
	public static int sock_ip_get_local;
	public static int sock_ip_get_remote;
	public static ssize_t sock_ip_recv = new ssize_t();
	public static ssize_t sock_ip_send = new ssize_t();
	public static timex_t timex_add = new timex_t();
	public static timex_t timex_sub = new timex_t();
	public static timex_t timex_set = new timex_t();
	public static int timex_cmp;
	public static byte timex_to_str;
	public static byte[] _netopt_state_str = new byte[]{/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/};
	public static Object stdio_init;
	public static ssize_t stdio_read = new ssize_t();
	public static ssize_t stdio_write = new ssize_t();
	public static int uhcp_iface_t;
	public static Object uhcp_handle_udp;
	public static Object uhcp_handle_req;
	public static Object uhcp_handle_push;
	public static Object uhcp_handle_prefix;
	public static int udp_sendto;
	public static byte[] tmp_ipv4_dst = new byte[/*
	 * Copyright (C) 2015 Martin Landsmann <Martin.Landsmann@HAW-Hamburg.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Provides shell commands to manage and show FIB Entries
	 *
	 * @author      2015 Martin Landsmann <Martin.Landsmann@HAW-Hamburg.de>
	 *
	 * @}
	 *//**< buffer for ipv4 address conversion */INADDRSZ];
	public static byte[] tmp_ipv4_nxt = new byte[/**< buffer for ipv4 address conversion */INADDRSZ];
	public static byte[] tmp_ipv6_dst = new byte[/**< buffer for ipv6 address conversion */IN6ADDRSZ];
	public static byte[] tmp_ipv6_nxt = new byte[/**< buffer for ipv6 address conversion */IN6ADDRSZ];
	public static  mtx_packet_write = /*
	 * Copyright (C) 2014 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     nhdp
	 * @{
	 *
	 * @file
	 * @brief       Writer implementation for message generation in NHDP
	 *
	 * @author      Fabian Nack <nack@inf.fu-berlin.de>
	 *
	 * @}
	 *//* Internal variables */MUTEX_INIT;
	public static rfc5444_writer nhdp_writer = new rfc5444_writer();
	public static nhdp_if_entry_t nhdp_wr_curr_if_entry = new nhdp_if_entry_t();
	public static uint8_t[] msg_buffer = new uint8_t();
	public static uint8_t[] msg_addrtlvs = new uint8_t();
	public static Object _nhdp_add_hello_msg_header_cb;
	public static Object _nhdp_add_message_tlvs_cb;
	public static Object _nhdp_add_addresses_cb;
	public static Object _nhdp_add_packet_header_cb;
	public static Object netaddr_from_nhdp_address;
	public static rfc5444_writer_tlvtype[] _nhdp_addrtlvs = new rfc5444_writer_tlvtype[]{/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/};
	public static rfc5444_writer_content_provider _nhdp_message_content_provider = new rfc5444_writer_content_provider(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static uintptr_t __stack_chk_guard = /*
	 * Copyright (C) 2016 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     sys_ssp
	 * @{
	 *
	 * @file
	 * @brief       Stack Smashing Protector (SSP) helper functions
	 *
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * @}
	 */(uintptr_t)/* this should be randomized for each build */-1024;
	public static  _rx_mutex = /*
	 * Copyright (C) 2016 Michael Andersen <m.andersen@cs.berkeley.edu>
	 *
	 * This file was based on SEGGER's reference implementation
	 * which can be found here: https://www.segger.com/jlink-rtt.html
	 * (c) 2014-2016 SEGGER Microcontroller GmbH & Co. KG
	 * This implementation bore the following license notes:
	 **********************************************************************
	 *               SEGGER MICROCONTROLLER GmbH & Co. KG                 *
	 *       Solutions for real time microcontroller applications         *
	 **********************************************************************
	 *                                                                    *
	 *       (c) 2014 - 2016  SEGGER Microcontroller GmbH & Co. KG        *
	 *                                                                    *
	 *       www.segger.com     Support: support@segger.com               *
	 *                                                                    *
	 **********************************************************************
	 *                                                                    *
	 *       SEGGER RTT * Real Time Transfer for embedded targets         *
	 *                                                                    *
	 **********************************************************************
	 *                                                                    *
	 * All rights reserved.                                               *
	 *                                                                    *
	 * SEGGER strongly recommends to not make any changes                 *
	 * to or modify the source code of this software in order to stay     *
	 * compatible with the RTT protocol and J-Link.                       *
	 *                                                                    *
	 * Redistribution and use in source and binary forms, with or         *
	 * without modification, are permitted provided that the following    *
	 * conditions are met:                                                *
	 *                                                                    *
	 * o Redistributions of source code must retain the above copyright   *
	 *   notice, this list of conditions and the following disclaimer.    *
	 *                                                                    *
	 * o Redistributions in binary form must reproduce the above          *
	 *   copyright notice, this list of conditions and the following      *
	 *   disclaimer in the documentation and/or other materials provided  *
	 *   with the distribution.                                           *
	 *                                                                    *
	 * o Neither the name of SEGGER Microcontroller GmbH & Co. KG         *
	 *   nor the names of its contributors may be used to endorse or      *
	 *   promote products derived from this software without specific     *
	 *   prior written permission.                                        *
	 *                                                                    *
	 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND             *
	 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,        *
	 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF           *
	 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE           *
	 * DISCLAIMED. IN NO EVENT SHALL SEGGER Microcontroller BE LIABLE FOR *
	 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR           *
	 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT  *
	 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;    *
	 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF      *
	 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT          *
	 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE  *
	 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH   *
	 * DAMAGE.                                                            *
	 *                                                                    *
	 **********************************************************************//**
	 * @ingroup sys
	 * @{
	 *
	 * @file
	 * @brief SEGGER RTT stdio implementation
	 *
	 * This file implements RIOTs STDIO interface and works with a ringbuffer that
	 * complies with SEGGER RTT.
	 *
	 * @author      Michael Andersen <m.andersen@cs.berkeley.edu>
	 *
	 * @}
	 *//* This parameter affects the bandwidth of both input and output. Decreasing
	   it will significantly improve bandwidth at the cost of CPU time. *//**
	 * @brief use mutex for waiting on stdin being enabled
	 */MUTEX_INIT/**
	 * @brief buffer holding stdout
	 */;
	public static byte[] up_buffer = new byte[(true/**
	 * @brief buffer holding stdin
	 */)];
	public static byte[] down_buffer = new byte[(true/**
	 * @brief flag that enables stdin polling
	 */)];
	public static byte stdin_enabled = 0/**
	 * @brief flag that enables stdout blocking/polling
	 */;
	public static byte blocking_stdout = 0/**
	 * @brief SEGGER's ring buffer implementation
	 */;
	public static segger_rtt_cb_t rtt_cb = new segger_rtt_cb_t(/**
	 * @brief The SEGGER Real-Time-Terminal control block (CB)
	 */"SEGGER RTT", 1, 1, {new segger_rtt_cb_t("Terminal", up_buffer[0], /*Error: sizeof expression not supported yet*/, 0, 0, 0)}, {new segger_rtt_cb_t("Terminal", down_buffer[0], /*Error: sizeof expression not supported yet*/, 0, 0, 0/**
	 * @brief read bytes from the down buffer. This function does not block.
	 *        The logic here is unmodified from SEGGER's reference, it is just
	 *        refactored to match code style. The string is not null terminated.
	 *
	 * @return the number of bytes read
	 */)});
	public static int sock_udp_ep_fmt;
	public static int sock_urlsplit;
	public static int sock_udp_str2ep;
	public static boolean sock_udp_ep_equal;
	public static  gnrc_rpl_validation_options = new ();
	public static Object usbus_control_init;
	public static  usbus_control_slicer_put_bytes = new ();
	public static  usbus_control_slicer_put_char = new ();
	public static Object usbus_control_slicer_ready;
	public static int usbus_control_slicer_nextslice;
	public static  usbus_control_get_out_data = new ();
	public static Object xtimer_callback_t;
	public static xtimer_ticks32_t xtimer_now = new xtimer_ticks32_t();
	public static xtimer_ticks64_t xtimer_now64 = new xtimer_ticks64_t();
	public static Object xtimer_now_timex;
	public static uint32_t xtimer_now_usec = new uint32_t();
	public static uint64_t xtimer_now_usec64 = new uint64_t();
	public static Object xtimer_init;
	public static Object xtimer_sleep;
	public static Object xtimer_usleep;
	public static Object xtimer_nanosleep;
	public static Object xtimer_tsleep32;
	public static Object xtimer_tsleep64;
	public static Object xtimer_spin;
	public static Object xtimer_periodic_wakeup;
	public static Object xtimer_set_msg;
	public static Object xtimer_set_msg64;
	public static Object xtimer_set_wakeup;
	public static Object xtimer_set_wakeup64;
	public static Object xtimer_set;
	public static Object xtimer_set64;
	public static Object xtimer_remove;
	public static int xtimer_msg_receive_timeout;
	public static int xtimer_msg_receive_timeout64;
	public static xtimer_ticks32_t xtimer_ticks_from_usec = new xtimer_ticks32_t();
	public static xtimer_ticks64_t xtimer_ticks_from_usec64 = new xtimer_ticks64_t();
	public static uint32_t xtimer_usec_from_ticks = new uint32_t();
	public static uint64_t xtimer_usec_from_ticks64 = new uint64_t();
	public static xtimer_ticks32_t xtimer_ticks = new xtimer_ticks32_t();
	public static xtimer_ticks64_t xtimer_ticks64 = new xtimer_ticks64_t();
	public static xtimer_ticks32_t xtimer_diff = new xtimer_ticks32_t();
	public static xtimer_ticks64_t xtimer_diff64 = new xtimer_ticks64_t();
	public static xtimer_ticks32_t xtimer_diff32_64 = new xtimer_ticks32_t();
	public static  xtimer_less = new ();
	public static  xtimer_less64 = new ();
	public static int xtimer_mutex_lock_timeout;
	public static Object xtimer_set_timeout_flag;
	public static socket_t[] _socket_pool = new socket_t();
	public static socket_sock_t[] _sock_pool = new socket_sock_t();
	public static int BITFIELD;
	public static  _socket_pool_mutex = MUTEX_INIT;
	public static ssize_t socket_recvfrom = new ssize_t();
	public static ssize_t socket_sendto = new ssize_t();
	public static vfs_file_ops_t socket_ops = new vfs_file_ops_t(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
	public static int pthread_rwlock_init;
	public static int pthread_rwlock_destroy;
	public static int pthread_rwlock_rdlock;
	public static int pthread_rwlock_tryrdlock;
	public static int pthread_rwlock_timedrdlock;
	public static int pthread_rwlock_wrlock;
	public static int pthread_rwlock_trywrlock;
	public static int pthread_rwlock_timedwrlock;
	public static int pthread_rwlock_unlock;
	public static boolean __pthread_rwlock_blocked_readingly;
	public static boolean __pthread_rwlock_blocked_writingly;
	public static nib_entry_t nib_process_hello = new nib_entry_t();
	public static Object nib_fill_wr_addresses;
	public static Object nib_rem_nb_entry;
	public static Object nib_set_nb_entry_sym;
	public static Object nib_reset_nb_entry_sym;
	public static  mtx_nib_access = /*
	 * Copyright (C) 2014 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *//**
	 * @ingroup     nhdp
	 * @{
	 *
	 * @file
	 * @brief       Neighbor Information Base implementation for NHDP
	 *
	 * @author      Fabian Nack <nack@inf.fu-berlin.de>
	 *
	 * @}
	 *//* Internal variables */MUTEX_INIT;
	public static nib_entry_t nib_entry_head = NULL;
	public static nib_lost_address_entry_t nib_lost_address_entry_head = NULL;
	public static nib_entry_t add_nib_entry_for_nb_addr_list = new nib_entry_t();
	public static Object rem_nib_entry;
	public static Object clear_nb_addresses;
	public static int add_lost_neighbor_address;
	public static Object rem_ln_entry;
	public static Object _snd_ns;
	public static Object _snd_uc_ns;
	public static Object _handle_sl2ao;
	public static Object _usage;
	public static int _nib_neigh;
	public static int _nib_prefix;
	public static int _nib_route;
	public static int _pkt_build_reset_from_pkt;
	public static int _pkt_build;
	public static int _pkt_send;
	public static int _pkt_chk_seq_num;
	public static uint32_t _pkt_get_seg_len = new uint32_t();
	public static uint32_t _pkt_get_pay_len = new uint32_t();
	public static int _pkt_setup_retransmit;
	public static int _pkt_acknowledge;
	public static uint16_t _pkt_calc_csum = new uint16_t();
	public static  netdev_driver_cdcecm = new ();
	public static int _gnrc_lwmac_transmit;
	public static int _gnrc_lwmac_parse_packet;
	public static  _gnrc_lwmac_get_netdev_state = new ();
	public static Object _gnrc_lwmac_set_netdev_state;
	public static int _gnrc_lwmac_dispatch_defer;
	
	
	/*
	 * Copyright (C) 2018 HAW Hamburg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_puf_sram
	 *
	 * @{
	 * @file
	 *
	 * @author      Peter Kietzmann <peter.kietzmann@haw-hamburg.de>
	 *
	 * @}
	 */
	/* Allocation of the PUF seed variable */
	/* Allocation of the PUF seed state */
	/* Allocation of the memory marker */
	public static void puf_sram_init(Object ram, Object len) {
		if (!ModernizedCProgram.puf_sram_softreset()) {
			ModernizedCProgram.puf_sram_generate(ram, len);
		} 
	}
	public static void puf_sram_generate(Object ram, Object len) {
		ModernizedCProgram.puf_sram_seed = /*Error: Function owner not recognized*/dek_hash(ram, /* build hash from start-up pattern */len);
		ModernizedCProgram.puf_sram_marker = (/* write marker to a defined section for subsequent reset detection */true);
		ModernizedCProgram.puf_sram_state = /* seting state to 0 means seed was generated from SRAM pattern */0;
	}
	public static Object puf_sram_softreset() {
		if (ModernizedCProgram.puf_sram_marker != (true)) {
			ModernizedCProgram.puf_sram_state = 2;
			return 0;
		} 
		ModernizedCProgram.puf_sram_state = 1;
		return 1;
	}
	/*
	 * Copyright (c) 1996 by Internet Software Consortium.
	 * Copyright (c) 2015 by Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * Permission to use, copy, modify, and distribute this software for any
	 * purpose with or without fee is hereby granted, provided that the above
	 * copyright notice and this permission notice appear in all copies.
	 *
	 * THE SOFTWARE IS PROVIDED "AS IS" AND INTERNET SOFTWARE CONSORTIUM DISCLAIMS
	 * ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES
	 * OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL INTERNET SOFTWARE
	 * CONSORTIUM BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL
	 * DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR
	 * PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
	 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS
	 * SOFTWARE.
	 */
	/**
	 * @ingroup     net_ipv6_addr
	 * @{
	 *
	 * @file
	 *
	 * @author      Paul Vixie
	 * @author      Martine Lenders <mlenders@inf.fu-berlin.de>
	 */
	/* based on inet_pton6() by Paul Vixie */
	public static Object ipv6_addr_from_str(Object result, Object addr) {
		uint8_t colonp = 0;
		uint32_t val = 0;
		byte ch;
		uint8_t saw_xdigit = 0;
		uint8_t i = 0;
		if ((result == ((Object)0)) || (addr == ((Object)0))) {
			return ((Object)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ipv6_addr_set_unspecified(result);
		if (addr == /* Leading :: requires some special handling. */(byte)':') {
			if (++addr != (byte)':') {
				return ((Object)0);
			} 
		} 
		while ((ch = addr++) != (byte)'\0') {
			byte pch;
			byte xdigits;
			if ((pch = /*Error: Function owner not recognized*/strchr((xdigits = "0123456789abcdef"), ch)) == ((Object)0)) {
				pch = /*Error: Function owner not recognized*/strchr((xdigits = "0123456789ABCDEF"), ch);
			} 
			if (pch != ((Object)0)) {
				val <<=  4;
				val |=  (pch - xdigits);
				if (val > -1024) {
					return ((Object)0);
				} 
				saw_xdigit = 1;
				continue;
			} 
			if (ch == (byte)':') {
				if (!saw_xdigit) {
					if (colonp != ((Object)0)) {
						return ((Object)0);
					} 
					colonp = (result.getU8()[i]);
					continue;
				} 
				if ((i + /*Error: Unsupported expression*/) > /*Error: Unsupported expression*/) {
					return ((Object)0);
				} 
				result.getU8()[i++] = (uint8_t)(val >> 8) & -1024;
				result.getU8()[i++] = (uint8_t)val & -1024;
				saw_xdigit = 0;
				val = 0;
				continue;
			} 
			return ((Object)/* '\0' was seen by ipv4_addr_from_str(). */0);
		}
		if (saw_xdigit) {
			if (i + /*Error: Unsupported expression*/ > /*Error: Unsupported expression*/) {
				return ((Object)0);
			} 
			result.getU8()[i++] = (uint8_t)(val >> 8) & -1024;
			result.getU8()[i++] = (uint8_t)val & -1024;
		} 
		if (colonp != ((Object)0/*
		         * Since some memmove()'s erroneously fail to handle
		         * overlapping regions, we'll do the shift by hand.
		         */)) {
			int32_t n = (result.getU8()[i++]) - colonp;
			for (int32_t j = 1;
			 j <= n; j++) {
				result.getU8()[/*Error: Unsupported expression*/ - j] = colonp[n - j];
				colonp[n - j] = 0;
			}
			i = /*Error: Unsupported expression*/;
		} 
		if (i != /*Error: Unsupported expression*/) {
			return ((Object)0);
		} 
		return result/**
		 * @}
		 */;
	}
	public static Object get_dev(int argc, byte[][] argv) {
		switch (argc) {
		case 1:
				return ModernizedCProgram.sht1x_devs[0];
		case 2:
				{ 
					int pos = /*Error: Function owner not recognized*/atoi(argv[1]);
					if ((pos < 0) || (pos >= (int)/*Error: Function owner not recognized*/ARRAY_SIZE(sht1x_params))) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("No SHT10/SHT11/SHT15 device with number %i\n", pos);
						return ((Object)0);
					} 
					return ModernizedCProgram.sht1x_devs[pos];
				}
		default:
				break;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Usage: %s [DEVICE_NUMBER]\n", argv[0]);
		return ((Object)0);
		if (argc == 2) {
			int idx = /*Error: Function owner not recognized*/atoi(argv[1]);
			if ((idx < 0) || (idx >= (int)I2C_NUMOF)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("I2C device with number \"%s\" not found\n", argv[1]);
			} else {
					dev = /*Error: Function owner not recognized*/I2C_DEV(idx);
					return 0;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Usage: %s [DEVICE_NUMBER]\n", argv[0]);
		return -1;
	}
	public static void error_msg(Object msg) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[sht1x] Operation failed: %s\n", msg);
	}
	public static int read_sensor(Object temp, Object hum, int argc, Byte argv) {
		 dev = ModernizedCProgram.get_dev(argc, argv);
		if (!dev) {
			return -1;
		} 
		switch (/*Error: Function owner not recognized*/sht1x_read(dev, temp, hum)) {
		case -EIO:
				ModernizedCProgram.error_msg("gpio_init() failed");
				return -1;
		case -ECANCELED:
				ModernizedCProgram.error_msg("Measurement timed out");
				return -1;
		case 0:
				break;
		case -EPROTO:
				ModernizedCProgram.error_msg("Sensor did not acknowledge command");
				return -1;
		case -EBADMSG:
				ModernizedCProgram.error_msg("CRC checksum error");
				return -1;
		default:
				ModernizedCProgram.error_msg(/* Should never happen, but better safe the sorry */"Unknown error");
				return -1;
		}
		return 0;
	}
	public static int _get_humidity_handler(int argc, Byte argv) {
		int16_t hum = new int16_t();
		if (ModernizedCProgram.read_sensor(((Object)0), hum, argc, argv)) {
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Relative humidity: %i.%02i%%\n", (int)hum / 100, (int)hum % 100);
		return 0;
	}
	public static int _get_temperature_handler(int argc, Byte argv) {
		int16_t temp = new int16_t();
		if (ModernizedCProgram.read_sensor(temp, ((Object)0), argc, argv)) {
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Temperature: %i.%02i°C\n", (int)temp / 100, (int)temp % 100);
		return 0;
	}
	public static int _get_weather_handler(int argc, Byte argv) {
		int16_t hum = new int16_t();
		int16_t temp = new int16_t();
		if (ModernizedCProgram.read_sensor(temp, hum, argc, argv)) {
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Relative humidity: %i.%02i%%\n", (int)hum / 100, (int)hum % 100);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Temperature: %i.%02i°C\n", (int)temp / 100, (int)temp % 100);
		return 0;
	}
	public static void print_config(Object dev) {
		byte[] vdds = new byte[]{"5.0", "4.0", "3.5", "3.0", "2.5"};
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Sensor VDD = %s\n", vdds[dev.getVdd()]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Temperature offset [-t]: %i\n", (int)dev.getTemp_off());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Humidity offset [-h]: %i\n", (int)dev.getHum_off());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Resolution [-r]: %s\n", (dev.getConf() & SHT1X_CONF_LOW_RESOLUTION) ? "low" : "high");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Skip calibration (faster reading) [-c]: %s\n", (dev.getConf() & SHT1X_CONF_SKIP_CALIBRATION) ? "yes" : "no");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Heater [-H]: %s\n", (dev.getConf() & SHT1X_CONF_ENABLE_HEATER) ? "on" : "off");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("CRC checking [-C]: %s\n", (dev.getConf() & SHT1X_CONF_SKIP_CRC) ? "off" : "on");
	}
	public static void unknown_parameter(int index, byte[][] argv) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Unknown parameter \"%s\"\nUsage: \"%s [PARAMS]\", run \"%s --help\" for help\n", argv[index], argv[0], argv[0]);
	}
	public static void missing_argument(int index, byte[][] argv) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Missing argument for parameter \"%s\"\nUsage: \"%s [%s <ARG>][PARAMS]\", run \"%s --help\" for help\n", argv[index], argv[0], argv[index], argv[0]);
	}
	public static void invalid_argument(int index, byte[][] argv, Object valid) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Invalid argument \"%s\" for parameter \"%s\"\nValid arguments are: \"%s\", run \"%s --help\" for help\n", argv[index + 1], argv[index], valid, argv[0]);
	}
	public static int _sht_config_handler(int argc, byte[][] argv) {
		uint8_t set_conf = 0;
		uint8_t unset_conf = 0;
		int16_t temp_off = 32767;
		int16_t hum_off = 32767;
		int dev_num = 0;
		if ((argc == 2) && (/*Error: Function owner not recognized*/strcmp("--help", argv[1]) == 0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Usage: \"%s [PARMS]\n\nSupported parameters:\n  -d <NUM>\n    Use SHT10/11/15 sensor number <NUM>. Default: 0\n\n  -t <OFFSET>\n    Add <OFFSET> (in e-2°C) to all temperature measurements\n\n  -h <OFFSET>\n    Add <OFFSET> (in e-2%%) to all humidity measurements\n\n  -r l/h\n    Set resolution to low/high. Low resolution trades presicion for speed\n\n  -H y/n\n    Turns heater on/off. Can increase temperature by up to 10°C\n\n  -C y/n\n    Turns on/off CRC checking. No checking trades robustness for speed\n", argv[0]);
			return 0;
		} 
		for (int i = 1;
		 i < argc; i++) {
			if ((argv[i][0] != (byte)'-') || (!argv[i][1]) || (argv[i][2])) {
				ModernizedCProgram.unknown_parameter(i, argv);
				return -1;
			} 
			switch (argv[i][1]) {
			case (byte)'C':
					if (++i >= argc) {
						ModernizedCProgram.missing_argument(i - 1, argv);
						return -1;
					} 
					if ((!argv[i][0]) || (argv[i][1])) {
						ModernizedCProgram.invalid_argument(i - 1, argv, "y, n");
						return -1;
					} 
					switch (argv[i][0]) {
					case (byte)'y':
							unset_conf |=  SHT1X_CONF_SKIP_CRC;
							break;
					case (byte)'n':
							set_conf |=  SHT1X_CONF_SKIP_CRC;
							break;
					default:
							ModernizedCProgram.invalid_argument(i - 1, argv, "y, n");
							return -1;
					}
					break;
			case (byte)'h':
					if (++i >= argc) {
						ModernizedCProgram.missing_argument(i - 1, argv);
						return -1;
					} 
					hum_off = /*Error: Function owner not recognized*/atoi(argv[i]);
					break;
			case (byte)'d':
					if (++i >= argc) {
						ModernizedCProgram.missing_argument(i - 1, argv);
						return -1;
					} 
					dev_num = /*Error: Function owner not recognized*/atoi(argv[i]);
					if ((dev_num < 0) || (dev_num >= (int)/*Error: Function owner not recognized*/ARRAY_SIZE(sht1x_params))) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("No SHT10/11/15 sensor with number %i\n", dev_num);
						return -1;
					} 
					break;
			case (byte)'t':
					if (++i >= argc) {
						ModernizedCProgram.missing_argument(i - 1, argv);
						return -1;
					} 
					temp_off = /*Error: Function owner not recognized*/atoi(argv[i]);
					break;
			case (byte)'H':
					if (++i >= argc) {
						ModernizedCProgram.missing_argument(i - 1, argv);
						return -1;
					} 
					if ((!argv[i][0]) || (argv[i][1])) {
						ModernizedCProgram.invalid_argument(i - 1, argv, "y, n");
						return -1;
					} 
					switch (argv[i][0]) {
					case (byte)'n':
							unset_conf |=  SHT1X_CONF_ENABLE_HEATER;
							break;
					case (byte)'y':
							set_conf |=  SHT1X_CONF_ENABLE_HEATER;
							break;
					default:
							ModernizedCProgram.invalid_argument(i - 1, argv, "y, n");
							return -1;
					}
					break;
			case (byte)'r':
					if (++i >= argc) {
						ModernizedCProgram.missing_argument(i - 1, argv);
						return -1;
					} 
					if ((!argv[i][0]) || (argv[i][1])) {
						ModernizedCProgram.invalid_argument(i - 1, argv, "l, h");
						return -1;
					} 
					switch (argv[i][0]) {
					case (byte)'l':
							set_conf |=  SHT1X_CONF_LOW_RESOLUTION;
							break;
					case (byte)'h':
							unset_conf |=  SHT1X_CONF_LOW_RESOLUTION;
							break;
					default:
							ModernizedCProgram.invalid_argument(i - 1, argv, "l, h");
							return -1;
					}
					break;
			case (byte)'c':
					if (++i >= argc) {
						ModernizedCProgram.missing_argument(i - 1, argv);
						return -1;
					} 
					if ((!argv[i][0]) || (argv[i][1])) {
						ModernizedCProgram.invalid_argument(i - 1, argv, "y, n");
						return -1;
					} 
					switch (argv[i][0]) {
					case (byte)'y':
							set_conf |=  SHT1X_CONF_SKIP_CALIBRATION;
							break;
					case (byte)'n':
							unset_conf |=  SHT1X_CONF_SKIP_CALIBRATION;
							break;
					default:
							ModernizedCProgram.invalid_argument(i - 1, argv, "y, n");
							return -1;
					}
					break;
			default:
					ModernizedCProgram.unknown_parameter(i, argv);
					return -1;
			}
		}
		if ((set_conf) || (unset_conf)) {
			uint8_t new_conf = ModernizedCProgram.sht1x_devs[dev_num].getConf();
			new_conf &=  ~(unset_conf);
			new_conf |=  set_conf;
			switch (/*Error: Function owner not recognized*/sht1x_configure(ModernizedCProgram.sht1x_devs[dev_num], new_conf)) {
			case -EIO:
					ModernizedCProgram.error_msg("gpio_init() failed");
					return -1;
			case -EBADMSG:
					ModernizedCProgram.error_msg("CRC checksum error");
					return -1;
			case -EPROTO:
					ModernizedCProgram.error_msg("Sensor did not acknowledge command");
					return -1;
			case 0:
					break;
			case -ECANCELED:
					ModernizedCProgram.error_msg("Sensor did not apply configuration");
					return -1;
			default:
					ModernizedCProgram.error_msg(/* Should never happen, but better safe the sorry */"Unknown error");
					return -1;
			}
		} 
		if (temp_off != 32767) {
			if ((temp_off > 2000) || (temp_off < -2000)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("A temperature offset of %i.%02i°C is unreasonable\n", (int)temp_off / 100, (int)temp_off % 100);
				return -1;
			} 
			ModernizedCProgram.sht1x_devs[dev_num].setTemp_off(temp_off);
		} 
		if (hum_off != 32767) {
			if ((hum_off > 1000) || (hum_off < -1000)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("A humidity offset of %i.%02i%% is unreasonable\n", (int)hum_off / 100, (int)hum_off % 100);
				return -1;
			} 
			ModernizedCProgram.sht1x_devs[dev_num].setHum_off(hum_off);
		} 
		ModernizedCProgram.print_config(ModernizedCProgram.sht1x_devs[dev_num]);
		return 0;
	}
	public static Object _gen_union_descriptor(Object usbus, Object cdcecm) {
		 uni = new ();
		uni.setLength(/*Error: Unsupported expression*//* functional union descriptor */);
		uni.setType(USB_TYPE_DESCRIPTOR_CDC);
		uni.setSubtype(USB_CDC_DESCR_SUBTYPE_UNION);
		uni.setMaster_if(cdcecm.getIface_ctrl().getIdx());
		uni.setSlave_if(cdcecm.getIface_data().getIdx());
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)uni, /*Error: sizeof expression not supported yet*/);
		return /*Error: Unsupported expression*/;
		 uni = new ();
		uni.setLength(/*Error: Unsupported expression*//* functional union descriptor */);
		uni.setType(USB_TYPE_DESCRIPTOR_CDC);
		uni.setSubtype(USB_CDC_DESCR_SUBTYPE_UNION);
		uni.setMaster_if(ModernizedCProgram.cdcacm.getIface_ctrl().getIdx());
		uni.setSlave_if(ModernizedCProgram.cdcacm.getIface_data().getIdx());
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)uni, /*Error: sizeof expression not supported yet*/);
		return /*Error: Unsupported expression*/;
	}
	public static Object _gen_ecm_descriptor(Object usbus, Object cdcecm) {
		 ecm = new ();
		ecm.setLength(/*Error: Unsupported expression*//* functional cdc ecm descriptor */);
		ecm.setType(USB_TYPE_DESCRIPTOR_CDC);
		ecm.setSubtype(USB_CDC_DESCR_SUBTYPE_ETH_NET);
		ecm.setMacaddress(cdcecm.getMac_str().getIdx());
		ecm.setEthernetstatistics(0);
		ecm.setMaxsegmentsize(ETHERNET_FRAME_LEN);
		ecm.setNumbermcfilters(/* No filtering */-1024);
		ecm.setNumberpowerfilters(0);
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)ecm, /*Error: sizeof expression not supported yet*/);
		return /*Error: Unsupported expression*/;
	}
	public static Object _gen_cdc_descriptor(Object usbus) {
		 cdc = new ();
		cdc.setLength(/*Error: Unsupported expression*//* functional cdc descriptor */);
		cdc.setBcd_cdc(USB_CDC_VERSION_BCD);
		cdc.setType(USB_TYPE_DESCRIPTOR_CDC);
		cdc.setSubtype(-1024);
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)cdc, /*Error: sizeof expression not supported yet*/);
		return /*Error: Unsupported expression*/;
		 cdc = new ();
		cdc.setLength(/*Error: Unsupported expression*//* functional cdc descriptor */);
		cdc.setBcd_cdc(USB_CDC_VERSION_BCD);
		cdc.setType(USB_TYPE_DESCRIPTOR_CDC);
		cdc.setSubtype(USB_CDC_DESCR_SUBTYPE_FUNCTIONAL);
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)cdc, /*Error: sizeof expression not supported yet*/);
		return /*Error: Unsupported expression*/;
	}
	public static Object _gen_full_ecm_descriptor(Object usbus, Object arg) {
		 cdcecm = ()arg;
		size_t total_size = 0;
		total_size += ModernizedCProgram._gen_cdc_descriptor(usbus);
		total_size += ModernizedCProgram._gen_union_descriptor(usbus, cdcecm);
		total_size += ModernizedCProgram._gen_ecm_descriptor(usbus, cdcecm);
		return total_size;
	}
	public static void _notify_link_speed(Object cdcecm) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC ECM: sending link speed indication\n");
		 notification = ()cdcecm.getEp_ctrl().getEp().getBuf();
		notification.getSetup().setType(USB_SETUP_REQUEST_DEVICE2HOST | USB_SETUP_REQUEST_TYPE_CLASS | USB_SETUP_REQUEST_RECIPIENT_INTERFACE);
		notification.getSetup().setRequest(USB_CDC_MGNT_NOTIF_CONN_SPEED_CHANGE);
		notification.getSetup().setValue(0);
		notification.getSetup().setIndex(cdcecm.getIface_ctrl().getIdx());
		notification.getSetup().setLength(8);
		notification.setDown(USBUS_CDC_ECM_CONFIG_SPEED_DOWNSTREAM);
		notification.setUp(USBUS_CDC_ECM_CONFIG_SPEED_UPSTREAM);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(cdcecm.getEp_ctrl().getEp(), /*Error: Unsupported expression*/);
		cdcecm.setNotif(USBUS_CDCECM_NOTIF_SPEED);
	}
	public static void _notify_link_up(Object cdcecm) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC ECM: sending link up indication\n");
		 notification = ()cdcecm.getEp_ctrl().getEp().getBuf();
		notification.setType(USB_SETUP_REQUEST_DEVICE2HOST | USB_SETUP_REQUEST_TYPE_CLASS | USB_SETUP_REQUEST_RECIPIENT_INTERFACE);
		notification.setRequest(USB_CDC_MGNT_NOTIF_NETWORK_CONNECTION);
		notification.setValue(1);
		notification.setIndex(cdcecm.getIface_ctrl().getIdx());
		notification.setLength(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(cdcecm.getEp_ctrl().getEp(), /*Error: Unsupported expression*/);
		cdcecm.setNotif(USBUS_CDCECM_NOTIF_LINK_UP);
	}
	public static void _fill_ethernet(Object cdcecm) {
		uint8_t[] ethernet = new uint8_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/luid_get(ethernet, ETHERNET_ADDR_LEN);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/eui48_set_local(()ethernet);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/eui48_clear_group(()ethernet);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fmt_bytes_hex(cdcecm.getMac_host(), ethernet, /*Error: sizeof expression not supported yet*/);
	}
	public static void usbus_cdcecm_init(Object usbus, Object handler) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(usbus);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(handler);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(handler, 0, /*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_init(handler.getOut_lock());
		ModernizedCProgram._fill_ethernet(handler);
		handler.setUsbus(usbus);
		handler.getHandler_ctrl().setDriver(ModernizedCProgram.cdcecm_driver);
		ModernizedCProgram.usbus_register_event_handler(usbus, ()handler);
	}
	public static void _init(Object usbus, Object handler) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC ECM: initialization\n");
		 cdcecm = ()handler;
		cdcecm.getTx_xmit().setHandler(/* Add event handlers */ModernizedCProgram._handle_tx_xmit);
		cdcecm.getRx_flush().setHandler(ModernizedCProgram._handle_rx_flush_ev);
		cdcecm.getEcm_hdr().setNext(((Object)/* Set up header generators */0));
		cdcecm.getEcm_hdr().setFuncs(ModernizedCProgram._ecm_descriptor);
		cdcecm.getEcm_hdr().setArg(cdcecm);
		cdcecm.getIface_ctrl().setClass(/* Configure Interface 0 as control interface */USB_CLASS_CDC_CONTROL);
		cdcecm.getIface_ctrl().setSubclass(USB_CDC_SUBCLASS_ENCM);
		cdcecm.getIface_ctrl().setProtocol(USB_CDC_PROTOCOL_NONE);
		cdcecm.getIface_ctrl().setHdr_gen(cdcecm.getEcm_hdr());
		cdcecm.getIface_ctrl().setHandler(handler);
		cdcecm.getIface_data().setClass(/* Configure second interface to handle data endpoint */USB_CLASS_CDC_DATA);
		cdcecm.getIface_data().setSubclass(USB_CDC_SUBCLASS_NONE);
		cdcecm.getIface_data().setProtocol(USB_CDC_PROTOCOL_NONE);
		cdcecm.getIface_data().setHdr_gen(((Object)0));
		cdcecm.getIface_data().setHandler(handler);
		ModernizedCProgram.usbus_add_string_descriptor(usbus, cdcecm.getMac_str(), cdcecm.getMac_host());
		cdcecm.setEp_ctrl(ModernizedCProgram.usbus_add_endpoint(usbus, cdcecm.getIface_ctrl(), USB_EP_TYPE_INTERRUPT, USB_EP_DIR_IN, USBUS_CDCECM_EP_CTRL_SIZE));
		cdcecm.getEp_ctrl().setInterval(-1024);
		cdcecm.setEp_out(ModernizedCProgram.usbus_add_endpoint(usbus, ()cdcecm.getIface_data_alt(), USB_EP_TYPE_BULK, USB_EP_DIR_OUT, USBUS_CDCECM_EP_DATA_SIZE));
		cdcecm.getEp_out().setInterval(/* Must be 0 for bulk endpoints */0);
		cdcecm.setEp_in(ModernizedCProgram.usbus_add_endpoint(usbus, ()cdcecm.getIface_data_alt(), USB_EP_TYPE_BULK, USB_EP_DIR_IN, USBUS_CDCECM_EP_DATA_SIZE));
		cdcecm.getEp_in().setInterval(/* Must be 0 for bulk endpoints */0);
		ModernizedCProgram.usbus_add_interface(usbus, cdcecm.getIface_ctrl());
		ModernizedCProgram.usbus_add_interface(usbus, cdcecm.getIface_data());
		cdcecm.getIface_data().setAlts(cdcecm.getIface_data_alt());
		cdcecm.getEp_out().usbus_enable_endpoint();
		cdcecm.getEp_in().usbus_enable_endpoint();
		cdcecm.getEp_ctrl().usbus_enable_endpoint();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(cdcecm.getEp_out().getEp(), 0);
		handler.usbus_handler_set_flag(USBUS_HANDLER_FLAG_RESET);
		 dev = ()netdev;
		int res = /* assume everything would be fine */0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(dev.getMutex());
		if (dev.getInit_cb() != ((Object)0)) {
			res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(netdev);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(dev.getMutex());
		return res;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC_ACM: initialization\n");
		 cdcacm = ()handler;
		cdcacm.getFlush().setHandler(ModernizedCProgram._handle_flush);
		cdcacm.getCdcacm_hdr().setNext(((Object)0));
		cdcacm.getCdcacm_hdr().setFuncs(ModernizedCProgram._cdcacm_descriptor);
		cdcacm.getCdcacm_hdr().setArg(cdcacm);
		cdcacm.getIface_ctrl().setClass(/* Configure Interface 0 as control interface */USB_CLASS_CDC_CONTROL);
		cdcacm.getIface_ctrl().setSubclass(USB_CDC_SUBCLASS_ACM);
		cdcacm.getIface_ctrl().setProtocol(USB_CDC_PROTOCOL_NONE);
		cdcacm.getIface_ctrl().setHdr_gen(cdcacm.getCdcacm_hdr());
		cdcacm.getIface_ctrl().setHandler(handler);
		cdcacm.getIface_data().setClass(/* Configure second interface to handle data endpoint */USB_CLASS_CDC_DATA);
		cdcacm.getIface_data().setSubclass(USB_CDC_SUBCLASS_NONE);
		cdcacm.getIface_data().setProtocol(USB_CDC_PROTOCOL_NONE);
		cdcacm.getIface_data().setHdr_gen(((Object)0));
		cdcacm.getIface_data().setHandler(handler);
		 ep = ModernizedCProgram.usbus_add_endpoint(usbus, cdcacm.getIface_ctrl(), USB_EP_TYPE_INTERRUPT, USB_EP_DIR_IN, 8);
		ep.setInterval(/* Max interval */255);
		ep.usbus_enable_endpoint();
		ep = ModernizedCProgram.usbus_add_endpoint(usbus, cdcacm.getIface_data(), USB_EP_TYPE_BULK, USB_EP_DIR_IN, USBUS_CDC_ACM_BULK_EP_SIZE);
		ep.setInterval(/* Interval is not used with bulk endpoints */0);
		ep.usbus_enable_endpoint();
		ep = ModernizedCProgram.usbus_add_endpoint(usbus, cdcacm.getIface_data(), USB_EP_TYPE_BULK, USB_EP_DIR_OUT, USBUS_CDC_ACM_BULK_EP_SIZE);
		ep.setInterval(/* Interval is not used with bulk endpoints */0);
		ep.usbus_enable_endpoint();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(ep.getEp(), 0);
		ModernizedCProgram.usbus_add_interface(usbus, cdcacm.getIface_ctrl());
		ModernizedCProgram.usbus_add_interface(usbus, cdcacm.getIface_data());
		handler.usbus_handler_set_flag(USBUS_HANDLER_FLAG_RESET);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: Initializing EP0\n");
		 ep0_handler = ()handler;
		handler.usbus_handler_set_flag(USBUS_HANDLER_FLAG_RESET);
		ep0_handler.setControl_request_state(USBUS_CONTROL_REQUEST_STATE_READY);
		ep0_handler.setIn(ModernizedCProgram.usbus_add_endpoint(usbus, ((Object)0), USB_EP_TYPE_CONTROL, USB_EP_DIR_IN, USBUS_EP0_SIZE).getEp());
		ep0_handler.setOut(ModernizedCProgram.usbus_add_endpoint(usbus, ((Object)0), USB_EP_TYPE_CONTROL, USB_EP_DIR_OUT, USBUS_EP0_SIZE).getEp());
		 cdcecm = ModernizedCProgram._netdev_to_cdcecm(netdev);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/luid_get(cdcecm.getMac_netdev(), ETHERNET_ADDR_LEN);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/eui48_set_local(()cdcecm.getMac_netdev());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/eui48_clear_group(()cdcecm.getMac_netdev());
		return 0;
	}
	public static int _control_handler(Object usbus, Object handler, Object state, Object setup) {
		(Object)usbus;
		(Object)state;
		 cdcecm = ()handler;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC ECM: Request: 0x%x\n", setup.getRequest());
		switch (setup.getRequest()) {
		case USB_SETUP_REQ_SET_INTERFACE:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC ECM: Changing active interface to alt %d\n", setup.getValue());
				cdcecm.setActive_iface((uint8_t)setup.getValue());
				if (cdcecm.getActive_iface() == 1) {
					ModernizedCProgram._notify_link_up(cdcecm);
				} 
				break;
		case USB_CDC_MGNT_REQUEST_SET_ETH_PACKET_FILTER/* While we do answer the request, CDC ECM filters are not really
		             * implemented */:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC ECM: Not modifying filter to 0x%x\n", setup.getValue());
				break;
		default:
				return -1;
		}
		return 1;
		(Object)state;
		 cdcacm = ()handler;
		return 1;
	}
	public static int _handle_in_complete(Object usbus, Object handler) {
		(Object)usbus;
		 cdcecm = ()handler;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(cdcecm.getOut_lock());
		return 0;
	}
	public static void _handle_tx_xmit(Object ev) {
		 cdcecm = /*Error: Function owner not recognized*/container_of(ev, usbus_cdcecm_device_t, tx_xmit);
		 usbus = cdcecm.getUsbus();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC_ECM: Handling TX xmit from netdev\n");
		if (usbus.getState() != USBUS_STATE_CONFIGURED || cdcecm.getActive_iface() == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC ECM: not configured, unlocking\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(cdcecm.getOut_lock());
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(cdcecm.getEp_in().getEp(), cdcecm.getTx_len());
	}
	public static void _handle_rx_flush(Object cdcecm) {
		cdcecm.setLen(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(cdcecm.getEp_out().getEp(), 0);
	}
	public static void _handle_rx_flush_ev(Object ev) {
		 cdcecm = /*Error: Function owner not recognized*/container_of(ev, usbus_cdcecm_device_t, rx_flush);
		ModernizedCProgram._handle_rx_flush(cdcecm);
	}
	public static void _store_frame_chunk(Object cdcecm) {
		uint8_t buf = cdcecm.getEp_out().getEp().getBuf();
		size_t len = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_get(cdcecm.getEp_out().getEp(), USBOPT_EP_AVAILABLE, len, /*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(cdcecm.getIn_buf() + cdcecm.getLen(), buf, len);
		cdcecm.getLen() += len;
		if (len < USBUS_CDCECM_EP_DATA_SIZE && cdcecm.getNetdev().getEvent_callback()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cdcecm.getNetdev(), NETDEV_EVENT_ISR);
		} 
	}
	public static void _transfer_handler(Object usbus, Object handler, Object ep, Object event) {
		(Object)/* Only receives TR_COMPLETE events */event;
		(Object)usbus;
		 cdcecm = ()handler;
		if (ep == cdcecm.getEp_out().getEp()) {
			if (cdcecm.getNotif() == /* Retrieve incoming data */USBUS_CDCECM_NOTIF_NONE) {
				ModernizedCProgram._notify_link_up(cdcecm);
			} 
			size_t len = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_get(ep, USBOPT_EP_AVAILABLE, len, /*Error: Unsupported expression*/);
			ModernizedCProgram._store_frame_chunk(cdcecm);
			if (len == USBUS_CDCECM_EP_DATA_SIZE) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(ep, 0);
			} 
		}  else if (ep == cdcecm.getEp_in().getEp()) {
			ModernizedCProgram._handle_in_complete(usbus, handler);
		}  else if (ep == cdcecm.getEp_ctrl().getEp() && cdcecm.getNotif() == USBUS_CDCECM_NOTIF_LINK_UP) {
			ModernizedCProgram._notify_link_speed(cdcecm);
		} 
		(Object)usbus;
		(Object)/* Only receives TR_COMPLETE events */event;
		 cdcacm = ()handler;
		if ((ep.getDir() == USB_EP_DIR_OUT) && (ep.getType() == USB_EP_TYPE_BULK)) {
			size_t len = new size_t();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_get(ep, USBOPT_EP_AVAILABLE, len, /*Error: Unsupported expression*//* Retrieve incoming data */);
			if (len > 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cdcacm, ep.getBuf(), len);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(ep, 0);
		} 
		if ((ep.getDir() == USB_EP_DIR_IN) && (ep.getType() == USB_EP_TYPE_BULK)) {
			cdcacm.setOccupied(0);
			if (!ModernizedCProgram.tsrb_empty(cdcacm.getTsrb())) {
				return ModernizedCProgram._handle_in(cdcacm, ep);
			} 
		} 
	}
	public static void _handle_reset(Object usbus, Object handler) {
		 cdcecm = ()handler;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC ECM: Reset\n");
		ModernizedCProgram._handle_rx_flush(cdcecm);
		ModernizedCProgram._handle_in_complete(usbus, handler);
		cdcecm.setNotif(USBUS_CDCECM_NOTIF_NONE);
		cdcecm.setActive_iface(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(cdcecm.getOut_lock());
		 cdcacm = ()handler;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC ACM: Reset notification received\n");
		cdcacm.setState(USBUS_CDC_ACM_LINE_STATE_DISCONNECTED);
	}
	/*
	 * Copyright (C) 2019 Koen Zandberg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup usbus_cdc_ecm
	 * @{
	 * @file USBUS implementation for ethernet control model
	 *
	 * @author  Koen Zandberg <koen@bergzand.net>
	 * @}
	 */
	public static void _event_handler(Object usbus, Object handler, Object event) {
		switch (event) {
		case USBUS_EVENT_USB_RESET:
				ModernizedCProgram._handle_reset(usbus, handler);
				break;
		default:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("Unhandled event :0x%x\n", event);
				break;
		}
		(Object)usbus;
		switch (event) {
		case USBUS_EVENT_USB_RESET:
				ModernizedCProgram._handle_reset(handler);
				break;
		default:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("Unhandled event :0x%x\n", event);
				break;
		}
	}
	/*
	 * Copyright (C) 2017 TriaGnoSys GmbH
	 *               2013 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 *
	 * @author  Christian Mehlis <mehlis@inf.fu-berlin.de>
	 * @author  Martine Lenders <mlenders@inf.fu-berlin.de>
	 * @author  René Kijewski <kijewski@inf.fu-berlin.de>
	 * @author  Víctor Ariño <victor.arino@zii.aero>
	 */
	public static int sem_timedwait(Object sem, Object abstime) {
		uint64_t timeout = (((uint64_t)abstime.getTv_sec()) * (true)) + (abstime.getTv_nsec() / (true));
		uint64_t now = ModernizedCProgram.xtimer_now_usec64();
		if (now > timeout) {
			(/*Error: Function owner not recognized*/_errno()) = ETIMEDOUT;
			return -1;
		} 
		timeout = timeout - now;
		int res = (sema_t)sem.sema_wait_timed(timeout);
		if (res < 0) {
			(/*Error: Function owner not recognized*/_errno()) = -res;
			return -1;
		} 
		return 0/** @} */;
	}
	public static void probe_all() {
		saul_reg_t dev = ModernizedCProgram.saul_reg;
		int i = 0;
		saul_reg generatedNext = dev.getNext();
		while (dev) {
			dev.probe(i++);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
			dev = generatedNext;
		}
	}
	public static void list() {
		saul_reg_t dev = ModernizedCProgram.saul_reg;
		int i = 0;
		if (dev) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("ID\tClass\t\tName");
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("No devices found");
		} 
		Object generatedDriver = dev.getDriver();
		Object generatedName = dev.getName();
		saul_reg generatedNext = dev.getNext();
		while (dev) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("#%i\t%s\t%s\n", i++, /*Error: Function owner not recognized*/saul_class_to_str(generatedDriver.getType()), generatedName);
			dev = generatedNext;
		}
	}
	public static void read(int argc, byte[][] argv) {
		int num;
		saul_reg_t dev = new saul_reg_t();
		if (argc < 3) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s %s <device id>|all\n", argv[0], argv[1]);
			return /*Error: Unsupported expression*/;
		} 
		if (/*Error: Function owner not recognized*/strcmp(argv[2], "all") == 0) {
			ModernizedCProgram.probe_all();
			return /*Error: Unsupported expression*/;
		} 
		num = /*Error: Function owner not recognized*/atoi(argv[/* get device id */2]);
		saul_reg saul_reg = new saul_reg();
		dev = saul_reg.saul_reg_find_nth(num);
		if (dev == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: undefined device id given");
			return /*Error: Unsupported expression*/;
		} 
		dev.probe(num);
	}
	public static void write(int argc, byte[][] argv) {
		int num;
		int dim;
		saul_reg_t dev = new saul_reg_t();
		phydat_t data = new phydat_t();
		if (argc < 4) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s %s <device id> <value 0> [<value 1> [<value 2]]\n", argv[0], argv[1]);
			return /*Error: Unsupported expression*/;
		} 
		num = /*Error: Function owner not recognized*/atoi(argv[2]);
		saul_reg saul_reg = new saul_reg();
		dev = saul_reg.saul_reg_find_nth(num);
		if (dev == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: undefined device given");
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(data, 0, /*Error: sizeof expression not supported yet*/);
		dim = ((argc - 3) > (int)(true)) ? (int)(true) : (argc - 3);
		Object generatedVal = data.getVal();
		for (int i = 0;
		 i < dim; i++) {
			generatedVal[i] = /*Error: Function owner not recognized*/atoi(argv[i + 3]);
		}
		Object generatedName = dev.getName();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Writing to device #%i - %s\n", num, generatedName);
		data.phydat_dump(dim);
		dim = ModernizedCProgram.saul_reg_write(dev, /* write values to device */data);
		if (dim <= 0) {
			if (dim == -ENOTSUP) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: device #%i is not writable\n", num);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: failure to write to device #%i\n", num);
			} 
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("data successfully written to device #%i\n", num);
	}
	public static int _saul(int argc, byte[][] argv) {
		if (argc < 2) {
			ModernizedCProgram.list();
		} else {
				if (/*Error: Function owner not recognized*/strcmp(argv[1], "read") == 0) {
					ModernizedCProgram.read(argc, argv);
				}  else if (/*Error: Function owner not recognized*/strcmp(argv[1], "write") == 0) {
					ModernizedCProgram.write(argc, argv);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s read|write\n", argv[0]);
				} 
		} 
		return 0;
	}
	public static  universal_address_find_entry(Object addr, Object addr_size) {
		for (size_t i = 0;
		 i < ((false)); ++i) {
			if (ModernizedCProgram.universal_address_table[i].getAddress_size() == addr_size) {
				if (/*Error: Function owner not recognized*/memcmp((ModernizedCProgram.universal_address_table[i].getAddress()), addr, addr_size) == 0) {
					return (ModernizedCProgram.universal_address_table[i]);
				} 
			} 
		}
		return ((Object)0/**
		 * @brief finds the next empty or unused universal address containers
		 *
		 * @return pointer to the next free/unused universal_address_container_t
		 *         or NULL if no memory is left in universal_address_table
		 */);
	}
	/* cppcheck-suppress unsignedLessThanZero
	     * (reason: UNIVERSAL_ADDRESS_MAX_ENTRIES may be zero in which case this
	     * code is optimized out) */
	public static  universal_address_get_next_unused_entry() {
		if (ModernizedCProgram.universal_address_table_filled < ((false/* cppcheck-suppress unsignedLessThanZero
		         * (reason: UNIVERSAL_ADDRESS_MAX_ENTRIES may be zero, see above) */))) {
			for (size_t i = 0;
			 i < ((false)); ++i) {
				if (ModernizedCProgram.universal_address_table[i].getUse_count() == 0) {
					return (ModernizedCProgram.universal_address_table[i]);
				} 
			}
		} 
		return ((Object)0);
	}
	/* cppcheck-suppress unsignedLessThanZero
	     * (reason: UNIVERSAL_ADDRESS_MAX_ENTRIES may be zero in which case this
	     * code is optimized out) */
	public static  universal_address_add(Object addr, Object addr_size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_access);
		universal_address_container_t pEntry = ModernizedCProgram.universal_address_find_entry(addr, addr_size);
		Object generatedAddress_size = pEntry.getAddress_size();
		Object generatedAddress = pEntry.getAddress();
		if (pEntry == ((Object)0)) {
			pEntry = ModernizedCProgram.universal_address_get_next_unused_entry();
			if (pEntry == ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
				return ((Object)/* no free room */0);
			} 
			if (generatedAddress_size != /* look if the former memory has distinct size */addr_size) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedAddress, 0, (/* clean the address */false));
				pEntry.setAddress_size(/* set the used bytes */addr_size);
				pEntry.setUse_count(0);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((generatedAddress), addr, /* copy the address */addr_size);
		} 
		Object generatedUse_count = pEntry.getUse_count();
		generatedUse_count++;
		if (generatedUse_count == 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[universal_address_add] universal_address_table_filled: %d\n", (int)ModernizedCProgram.universal_address_table_filled);
			ModernizedCProgram.universal_address_table_filled++;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
		return pEntry;
	}
	public static void universal_address_rem() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_access);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[universal_address_rem] entry: %p\n", (Object)entry);
		Object generatedUse_count = this.getUse_count();
		if (entry != ((Object)/* we do not delete anything on remove */0)) {
			if (generatedUse_count != 0) {
				generatedUse_count--;
				if (generatedUse_count == 0) {
					ModernizedCProgram.universal_address_table_filled--;
				} 
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[universal_address_rem] universal_address_table_filled: %d\n", (int)ModernizedCProgram.universal_address_table_filled);
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
	}
	public static Object universal_address_get_address(Object addr, Object addr_size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_access);
		Object generatedAddress_size = this.getAddress_size();
		Object generatedAddress = this.getAddress();
		if (addr_size >= generatedAddress_size) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(addr, generatedAddress, generatedAddress_size);
			addr_size = generatedAddress_size;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
			return addr;
		} 
		addr_size = generatedAddress_size;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
		return ((Object)0);
	}
	public static int universal_address_compare(Object[] addr, Object addr_size_in_bits) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_access);
		int ret = -2;
		Object generatedAddress_size = this.getAddress_size();
		if ((size_t)(generatedAddress_size << 3) != /* If we have distinct sizes, the addresses are probably not comperable */addr_size_in_bits) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
			return ret;
		} 
		int idx = -/* compare up to fist distinct byte, pretty clumsy method for now */1;
		 test_all_zeros = true;
		Object generatedAddress = this.getAddress();
		for (size_t i = 0;
		 i < generatedAddress_size; i++) {
			if ((idx == -1) && (generatedAddress[i] != addr[i])) {
				idx = i;
			} 
			if (test_all_zeros) {
				test_all_zeros = (generatedAddress[i] == 0);
			} 
			if ((idx != -1) && !test_all_zeros) {
				break;
			} 
		}
		if (/* if the address is all 0 its a default route address */test_all_zeros) {
			addr_size_in_bits = 0;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
			return (true);
		} 
		if (idx == -/* if we have no distinct bytes the addresses are equal */1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
			return (false);
		} 
		uint8_t xor = generatedAddress[idx] ^ addr[/* count equal bits */idx];
		int8_t j = 7;
		for (; j > 0; --j) {
			if ((xor >> j) & -1024) {
				break;
			} 
		}
		addr_size_in_bits = (idx << 3) + /* get the total number of matching bits */j;
		ret = (true);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
		return ret;
	}
	public static int universal_address_compare_prefix(Object[] prefix, Object prefix_size_in_bits) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_access);
		int ret = -2;
		Object generatedAddress_size = this.getAddress_size();
		if ((size_t)(generatedAddress_size << 3) != /* If we have distinct sizes, the prefix is not comperable */prefix_size_in_bits) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
			return ret;
		} 
		int i = /* Get the index of the first trailing `0` */0;
		for (i = generatedAddress_size - 1; i >= 0; --i) {
			if (prefix[i] != 0) {
				break;
			} 
		}
		Object generatedAddress = this.getAddress();
		if (/*Error: Function owner not recognized*/memcmp(generatedAddress, prefix, i) == 0) {
			uint8_t bitmask = /* if the bytes-1 equals we check the bits of the lowest byte */-1024;
			for (uint8_t j = 0;
			 j < 8; ++/* get a bitmask for the trailing 0b */j) {
				if ((prefix[i] >> j) & -1024) {
					bitmask = -1024 << j;
					break;
				} 
			}
			if ((generatedAddress[i] & bitmask) == (prefix[i] & bitmask)) {
				ret = generatedAddress[i] != prefix[i];
				if (ret == (false)) {
					/* check if the remaining bits from entry are significant */i++;
					for (; i < generatedAddress_size; ++i) {
						if (generatedAddress[i] != 0) {
							ret = (true);
							break;
						} 
					}
				} 
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
		return ret;
	}
	public static void universal_address_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_access/* cppcheck-suppress unsignedLessThanZero
		     * (reason: UNIVERSAL_ADDRESS_MAX_ENTRIES may be zero in which case this
		     * code is optimized out) */);
		for (size_t i = 0;
		 i < ((false)); ++i) {
			ModernizedCProgram.universal_address_table[i].setUse_count(0);
			ModernizedCProgram.universal_address_table[i].setAddress_size(0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.universal_address_table[i].getAddress(), 0, (false));
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
	}
	public static void universal_address_reset() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_access/* cppcheck-suppress unsignedLessThanZero
		     * (reason: UNIVERSAL_ADDRESS_MAX_ENTRIES may be zero in which case this
		     * code is optimized out) */);
		for (size_t i = 0;
		 i < ((false)); ++i) {
			ModernizedCProgram.universal_address_table[i].setUse_count(0);
		}
		ModernizedCProgram.universal_address_table_filled = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
	}
	public static void universal_address_print_entry() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_access);
		Object generatedUse_count = this.getUse_count();
		Object generatedAddress_size = this.getAddress_size();
		Object generatedAddress = this.getAddress();
		if (entry != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[universal_address_print_entry] entry@: %p, use_count: %d, address_size: %d, content: ", (Object)entry, (int)generatedUse_count, (int)generatedAddress_size);
			for (size_t i = 0;
			 i < generatedAddress_size; ++i) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%c", (byte)generatedAddress[/* printf("%02x ", (char)entry->address[i]); */i]);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
	}
	public static int universal_address_get_num_used_entries() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_access);
		size_t ret = ModernizedCProgram.universal_address_table_filled;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_access);
		return ret;
	}
	public static void universal_address_print_table() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[universal_address_print_table] universal_address_table_filled: %d\n", (int)ModernizedCProgram.universal_address_table_filled/* cppcheck-suppress unsignedLessThanZero
		     * (reason: UNIVERSAL_ADDRESS_MAX_ENTRIES may be zero in which case this
		     * code is optimized out) */);
		for (size_t i = 0;
		 i < ((false)); ++i) {
			ModernizedCProgram.universal_address_table[i].universal_address_print_entry();
		}
	}
	/*
	 * Copyright (C) 2016 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 * @author  Martine Lenders <mlenders@inf.fu-berlin.de>
	 */
	public static void netdev_test_reset(Object dev) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(dev.getMutex());
		dev.setSend_cb(((Object)0));
		dev.setRecv_cb(((Object)0));
		dev.setInit_cb(((Object)0));
		dev.setIsr_cb(((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dev.getGet_cbs(), 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dev.getSet_cbs(), 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(dev.getMutex());
	}
	public static int _send(Object netdev, Object iolist) {
		 dev = ()netdev;
		int res = -22;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(dev.getMutex());
		if (dev.getSend_cb() != ((Object)0)) {
			res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(netdev, iolist);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(dev.getMutex());
		return res;
		if (argc < 3 || argc > 11) {
			ModernizedCProgram._can_usage();
			return 1;
		} 
		 conn = new ();
		can_frame frame = new can_frame();
		int ifnum = /*Error: Function owner not recognized*/atoi(argv[1]);
		if (ifnum >= CAN_DLL_NUMOF) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Invalid ifnum");
			return 1;
		} 
		frame.setCan_frame(/*Error: Function owner not recognized*/strtoul(argv[2], ((Object)0), 16));
		frame.setCan_frame(argc - 3);
		Object generatedCan_frame = frame.getCan_frame();
		for (int i = 0;
		 i < generatedCan_frame; i++) {
			generatedCan_frame[i] = /*Error: Function owner not recognized*/strtoul(argv[3 + i], ((Object)0), 16);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/conn_can_raw_create(conn, ((Object)0), 0, ifnum, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/conn_can_raw_send(conn, frame, 0);
		return 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(iolist);
		 cdcecm = ModernizedCProgram._netdev_to_cdcecm(netdev);
		 buf = cdcecm.getEp_in().getEp().getBuf();
		 iolist_start = iolist;
		size_t len = /*Error: Function owner not recognized*/iolist_size(iolist/* interface with alternative function ID 1 is the interface containing the
		     * data endpoints, no sense trying to transmit data if it is not active */);
		if (cdcecm.getActive_iface() != 1) {
			return -ENOTCONN;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC_ECM_netdev: sending %u bytes\n", len);
		size_t iol_offset = /* load packet data into FIFO */0;
		size_t usb_offset = 0;
		size_t usb_remain = cdcecm.getEp_in().getEp().getLen();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC_ECM_netdev: cur iol: %d\n", iolist.getIol_len());
		while (len) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(cdcecm.getOut_lock());
			if (iolist.getIol_len() - iol_offset > usb_remain) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + usb_offset, ()iolist.getIol_base() + /* Only part of the iolist can be copied, usb_remain bytes */iol_offset, usb_remain);
				usb_offset = cdcecm.getEp_in().getMaxpacketsize();
				len -= usb_remain;
				iol_offset += usb_remain;
				usb_remain = 0;
			} else {
					size_t bytes_copied = iolist.getIol_len() - iol_offset;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + usb_offset, ()iolist.getIol_base() + /* Full iolist can be copied */iol_offset, bytes_copied);
					len -= bytes_copied;
					usb_offset += bytes_copied;
					usb_remain -= bytes_copied;
					iol_offset = iolist.getIol_len();
			} 
			if (iol_offset == iolist.getIol_len()) {
				iolist = iolist.getIol_next();
				if (iolist) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC_ECM: cur iol: %d\n", iolist.getIol_len());
				} 
				iol_offset = 0;
			} 
			if (usb_remain == 0 || !len) {
				cdcecm.setTx_len(usb_offset/* USB frame full or last frame, flush! */);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC_ECM_NETDEV: triggering xmit with len %d\n", cdcecm.getTx_len());
				ModernizedCProgram._signal_tx_xmit(cdcecm);
				usb_remain = cdcecm.getEp_in().getMaxpacketsize();
				usb_offset = 0;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(cdcecm.getOut_lock());
			} 
		}
		if ((/*Error: Function owner not recognized*/iolist_size(iolist_start) % cdcecm.getEp_in().getMaxpacketsize()) == /* Zero length USB packet required */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(cdcecm.getOut_lock());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("CDC ECM netdev: Zero length USB packet required\n");
			cdcecm.setTx_len(0);
			ModernizedCProgram._signal_tx_xmit(cdcecm);
		} 
		return len;
	}
	public static int _recv(Object netdev, Object buf, Object len, Object info) {
		 dev = ()netdev;
		int res = (buf == ((Object)0)) ? 0 : /* assume everything would be fine */len;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(dev.getMutex());
		if (dev.getRecv_cb() != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(dev.getMutex());
			res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(netdev, buf, len, info);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(dev.getMutex());
		} 
		return res;
		 cdcecm = ModernizedCProgram._netdev_to_cdcecm(netdev);
		(Object)info;
		if (max_len == 0 && buf == ((Object)0)) {
			return cdcecm.getLen();
		} 
		if (max_len && buf == ((Object)0)) {
			ModernizedCProgram._signal_rx_flush(cdcecm);
			return cdcecm.getLen();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf, cdcecm.getIn_buf(), max_len);
		ModernizedCProgram._signal_rx_flush(cdcecm);
		return max_len;
	}
	public static void _isr(Object netdev) {
		 dev = ()netdev;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(dev.getMutex());
		if (dev.getIsr_cb() != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(dev.getMutex());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(netdev);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(dev.getMutex());
		} 
		 cdcecm = ModernizedCProgram._netdev_to_cdcecm(dev);
		if (cdcecm.getLen()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cdcecm.getNetdev(), NETDEV_EVENT_RX_COMPLETE);
		} 
	}
	public static int _get(Object netdev, Object opt, Object value, Object max_len) {
		 dev = ()netdev;
		int res = -/* option assumed to be not supported */ENOTSUP;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(dev.getMutex());
		if (dev.getGet_cbs()[opt] != ((Object)0)) {
			res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(netdev, value, max_len);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(dev.getMutex());
		return res;
		 cdcecm = ModernizedCProgram._netdev_to_cdcecm(netdev);
		(Object)max_len;
		switch (opt) {
		case NETOPT_ADDRESS:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(max_len >= ETHERNET_ADDR_LEN);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(value, cdcecm.getMac_netdev(), ETHERNET_ADDR_LEN);
				return ETHERNET_ADDR_LEN;
		default:
				return /*Error: Function owner not recognized*/netdev_eth_get(netdev, opt, value, max_len);
		}
	}
	public static int _set(Object netdev, Object opt, Object value, Object value_len) {
		 dev = ()netdev;
		int res = -/* option assumed to be not supported */ENOTSUP;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(dev.getMutex());
		if (dev.getSet_cbs()[opt] != ((Object)0)) {
			res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(netdev, value, value_len);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(dev.getMutex());
		return res;
		 cdcecm = ModernizedCProgram._netdev_to_cdcecm(netdev);
		(Object)cdcecm;
		switch (opt) {
		case NETOPT_ADDRESS:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(value_len == ETHERNET_ADDR_LEN);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(cdcecm.getMac_netdev(), value, ETHERNET_ADDR_LEN);
				return ETHERNET_ADDR_LEN;
		default:
				return /*Error: Function owner not recognized*/netdev_eth_set(netdev, opt, value, value_len);
		}
	}
	public static void netdev_test_setup(Object dev, Object state) {
		 netdev = ()dev;
		netdev.setDriver(ModernizedCProgram._driver);
		dev.setState(state);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_init(dev.getMutex());
		ModernizedCProgram.netdev_test_reset(dev/** @} */);
	}
	/* $OpenBSD: divdi3.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Divide two signed quads.
	 * ??? if -1/2 should produce -1 on this machine, this code is wrong
	 */
	public static Object __divdi3(Object a, Object b) {
		u_quad_t ua = new u_quad_t();
		u_quad_t ub = new u_quad_t();
		u_quad_t uq = new u_quad_t();
		int neg = 0;
		ua = a;
		ub = b;
		if (a < 0) {
			ua = -ua;
			neg = !neg;
		} 
		if (b < 0) {
			ub = -ub;
			neg = !neg;
		} 
		uq = ModernizedCProgram.__qdivrem(ua, ub, NULL);
		if (neg) {
			uq = -uq;
		} 
		return uq;
	}
	/*
	 * Copyright (C) 2015 Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 */
	/* based on inet_ntop4() by Paul Vixie */
	public static Byte ipv4_addr_to_str(Byte result, Object addr, Object result_len) {
		 n = 0;
		byte next = result;
		if ((result == ((Object)0)) || (addr == ((Object)0)) || (result_len < IPV4_ADDR_MAX_STR_LEN)) {
			return ((Object)0);
		} 
		do {
			 u = addr.getU8()[n];
			if (u > 99) {
				next++ = (byte)'0' + u / 100;
				u %= 100;
				next++ = (byte)'0' + u / 10;
				u %= 10;
			}  else if (u > 9) {
				next++ = (byte)'0' + u / 10;
				u %= 10;
			} 
			next++ = (byte)'0' + u;
			next++ = (byte)'.';
			n++;
		} while (n < 4);
		--next = (byte)'\0';
		return result/** @} */;
	}
	/*
	 * Copyright (C) 2017 HAW Hamburg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     net_tcp
	 * @{
	 *
	 * @file
	 *
	 * @author smlng <s@mlng.net>
	 */
	public static void tcp_hdr_print(Object hdr) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("   src-port: %5u  dst-port: %5u\n", /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getSrc_port()), /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getDst_port()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("   seq-num: %10u  ack-num: %10u\n", /*Error: Function owner not recognized*/byteorder_ntohl(hdr.getSeq_num()), /*Error: Function owner not recognized*/byteorder_ntohl(hdr.getAck_num()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("   off_ctl: %5u  window: %5u\n", /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getOff_ctl()), /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getWindow()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("   cksum: 0x%04x  urgent_ptr: %5u\n", /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getChecksum()), /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getUrgent_ptr()));
	}
	/*
	 * Copyright (C) 2016 Eistec AB
	 *               2018 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys
	 * @{
	 *
	 * @file
	 * @brief       STDIO binding for the VFS module
	 *
	 * @author      Joakim Nohlgård <joakim.nohlgard@eistec.se>
	 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
	 *
	 * @}
	 */
	public static Object _stdio_read(Object dest, Object nbytes) {
		Object generatedPrivate_data = this.getPrivate_data();
		int fd = generatedPrivate_data.getValue();
		if (fd != 0) {
			return -9;
		} 
		return ModernizedCProgram.stdio_read(dest, nbytes);
	}
	public static Object _stdio_write(Object src, Object nbytes) {
		Object generatedPrivate_data = this.getPrivate_data();
		int fd = generatedPrivate_data.getValue();
		if (fd == 0) {
			return -9;
		} 
		return ModernizedCProgram.stdio_write(src, nbytes/**
		 * @brief   VFS file operation table for stdin/stdout/stderr
		 */);
	}
	public static void vfs_bind_stdio() {
		int fd;
		fd = ModernizedCProgram.vfs_bind(0, 0, ModernizedCProgram._stdio_ops, (Object)0);
		((fd >= 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("fd >= 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\vfs_stdio.c", /* Is there a better way to handle errors on init? */63));
		fd = ModernizedCProgram.vfs_bind(1, 1, ModernizedCProgram._stdio_ops, (Object)1);
		((fd >= 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("fd >= 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\vfs_stdio.c", 65));
		fd = ModernizedCProgram.vfs_bind(2, 1, ModernizedCProgram._stdio_ops, (Object)2);
		((fd >= 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("fd >= 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\vfs_stdio.c", 67/* we are not interested in the return value in case assert is not
		     * compiled in */));
		(Object)fd;
	}
	/*
	 * Copyright (C) 2015 Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 */
	public static void ipv6_hdr_print(Object hdr) {
		byte[] addr_str = new byte[IPV6_ADDR_MAX_STR_LEN];
		if (!/*Error: Function owner not recognized*/ipv6_hdr_is(hdr)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("illegal version field: %u\n", /*Error: Function owner not recognized*/ipv6_hdr_get_version(hdr));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("traffic class: 0x%02x (ECN: 0x%x, DSCP: 0x%02x)\n", (int)/*Error: Function owner not recognized*/ipv6_hdr_get_tc(hdr), (int)/*Error: Function owner not recognized*/ipv6_hdr_get_tc_ecn(hdr), (int)/*Error: Function owner not recognized*/ipv6_hdr_get_tc_dscp(hdr));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("flow label: 0x%05x\n", /*Error: Function owner not recognized*/ipv6_hdr_get_fl(hdr));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("length: %u  next header: %u  hop limit: %u\n", /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getLen()), (int)hdr.getNh(), (int)hdr.getHl());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("source address: %s\n", ModernizedCProgram.ipv6_addr_to_str(addr_str, hdr.getSrc(), /*Error: sizeof expression not supported yet*/));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("destination address: %s\n", ModernizedCProgram.ipv6_addr_to_str(addr_str, hdr.getDst(), /*Error: sizeof expression not supported yet*/));
	}
	/*
	 * Copyright (C) 2014 Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 */
	public static void od_hex_dump(Object data, Object data_len, Object width) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/print_str("00000000");
		if (width == 0) {
			width = (true);
		} 
		for (int i = 0;
		 i < data_len; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/print_str("  ");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/print_byte_hex(((uint8_t)data)[i]);
			if ((((i + 1) % width) == 0) || i == (data_len - 1/* fill in whitespace for incomplete hex lines */)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar(/* safe position for next iteration */(byte)'\n');
				if (i != (data_len - 1)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/print_u32_hex((uint32_t)(i + 1));
				} 
			} 
		}
	}
	/* $OpenBSD: lshldi3.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Shift an (unsigned) quad value left (logical shift left).
	 * This is the same as arithmetic shift left!
	 */
	public static Object __lshldi3(Object a, Object shift) {
		Object aa;
		if (shift == 0) {
			return a;
		} 
		aa.setQ(a);
		Object generatedUl = aa.getUl();
		if (shift >= (/*Error: Unsupported expression*/ * 8)) {
			generatedUl[(true)] = generatedUl[(false)] << (shift - (/*Error: Unsupported expression*/ * 8));
			generatedUl[(false)] = 0;
		} else {
				generatedUl[(true)] = (generatedUl[(true)] << shift) | (generatedUl[(false)] >> ((/*Error: Unsupported expression*/ * 8) - shift));
				generatedUl[(false)] <<=  shift;
		} 
		Object generatedQ = aa.getQ();
		return generatedQ;
	}
	public static Object recv(int socket, Object buffer, Object length, int flags) {
		return ModernizedCProgram.recvfrom(socket, buffer, length, flags, ((Object)0), ((Object)0/**
		 * @brief   Send a message on a socket.
		 * @details Shall send a message through a connection-mode or
		 *          connectionless-mode socket. If the socket is a connectionless-mode
		 *          socket, the message shall be sent to the address specified by
		 *          @p address if no pre-specified peer address has been set. If a
		 *          peer address has been pre-specified, either the message shall be
		 *          sent to the address specified by @p address (overriding the
		 *          pre-specified peer address), or the function shall return -1 and
		 *          set errno to EISCONN.
		 *
		 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/sendto.html">
		 *          The Open Group Base Specification Issue 7, sendto
		 *      </a>
		 *
		 * @param[in] socket        Specifies the socket file descriptor.
		 * @param[in] buffer        Points to the buffer containing the message to send.
		 * @param[in] length        Specifies the length of the message in bytes.
		 * @param[in] flags         Specifies the type of message reception. Support
		 *                          for values other than 0 is not implemented yet.
		 * @param[in] address       Points to a sockaddr structure containing the
		 *                          destination address. The length and format of the
		 *                          address depend on the address family of the socket.
		 * @param[in] address_len   Specifies the length of the sockaddr structure pointed
		 *                          to by the @p address argument.
		 *
		 * @post    The socket will implicitely be bound to the unspecified address and
		 *          a random port, in case it is not already bound. Rationale: A client
		 *          should not require to explicitly call bind() to receive packets,
		 *          but is expected to receive replies sent to the ephemeral port that
		 *          was selected as a source port by the UDP implementation.
		 *
		 * @todo    For @ref net_gnrc any @ref recvfrom call that is called to receive
		 *          an expected response to this send command, must be called from the
		 *          same thread. This is undesired behavior and will be fixed in
		 *          upcoming versions of RIOT.
		 *
		 * @return  Upon successful completion, send() shall return the number of bytes
		 *          sent. Otherwise, -1 shall be returned and errno set to indicate the
		 *          error.
		 */));
	}
	public static Object send(int socket, Object buffer, Object length, int flags) {
		return ModernizedCProgram.sendto(socket, buffer, length, flags, ((Object)0), 0/**
		 * @brief   Create an endpoint for communication.
		 * @details Shall create an unbound socket in a communications domain, and
		 *          return a file descriptor that can be used in later function calls
		 *          that operate on sockets.
		 *
		 * @param[in] domain    Specifies the communications domain in which a socket
		 *                      is to be created. Valid values are prefixed with ``AF_`
		 *                      and defined in @ref socket.h.
		 * @param[in] type      Specifies the type of socket to be created. Valued
		 *                      values are prefixed with ``SOCK_`` and defined in
		 *                      @ref socket.h.
		 * @param[in] protocol  Specifies a particular protocol to be used with the
		 *                      socket. Specifying a protocol of 0 causes socket() to
		 *                      use an unspecified default protocol appropriate for
		 *                      the requested socket type.
		 *
		 * @return  Upon successful completion, socket() shall return a non-negative
		 *          integer, the socket file descriptor. Otherwise, a value of -1 shall
		 *          be returned and errno set to indicate the error.
		 */);
	}
	public static int getsockopt(int socket, int level, int option_name, Object option_value, Object option_len) {
		(Object)socket;
		(Object)level;
		(Object)option_name;
		(Object)option_value;
		(Object)option_len;
		return -1;
	}
	public static void usbus_init(Object usbus, Object usbdev) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(usbus, 0, /*Error: Unsupported expression*/);
		usbus.setDev(usbdev);
	}
	public static void usbus_create(Byte stack, int stacksize, byte priority, Object name, Object usbus) {
		int res = /*Error: Function owner not recognized*/thread_create(stack, stacksize, priority, THREAD_CREATE_STACKTEST, ModernizedCProgram._usbus_thread, (Object)usbus, name);
		(Object)res;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(res > 0);
	}
	public static Object usbus_add_string_descriptor(Object usbus, Object desc, Object str) {
		desc.setNext(usbus.getStrings());
		usbus.setStrings(desc);
		desc.setIdx(usbus.getStr_idx()++);
		desc.setStr(str);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus: Adding string descriptor number %u for: \"%s\"\n", desc.getIdx(), str);
		return desc.getIdx();
	}
	public static void usbus_add_conf_descriptor(Object usbus, Object hdr_gen) {
		hdr_gen.setNext(usbus.getHdr_gen());
		usbus.setHdr_gen(hdr_gen);
	}
	public static Object _ep_to_handler(Object usbus, Object ep) {
		if (ep.getNum() == 0) {
			return usbus.getHandlers();
		} 
		for ( iface = usbus.getIface();
		 iface; iface = iface.getNext()) {
			for ( pep = iface.getEp();
			 pep; pep = pep.getNext()) {
				if (pep.getEp() == ep) {
					return iface.getHandler();
				} 
			}
			for ( alt = iface.getAlts();
			 alt; alt = alt.getNext()) {
				for ( pep = alt.getEp();
				 pep; pep = pep.getNext()) {
					if (pep.getEp() == ep) {
						return iface.getHandler();
					} 
				}
			}
		}
		return ((Object)0);
	}
	public static Object usbus_add_interface(Object usbus, Object iface) {
		uint16_t idx = 0;
		 last = usbus.getIface();
		while (last) {
			last = (last).getNext();
			idx++;
		}
		iface.setIdx(idx);
		last = iface;
		return idx;
	}
	/* While it is possible to us clist.h here, this results in less flash
	     * usages. Furthermore, the O(1) append is not really necessary as this is
	     * only used at init */
	public static void usbus_register_event_handler(Object usbus, Object handler) {
		 last = usbus.getHandlers();
		while (last) {
			last = (last).getNext();
		}
		last = handler;
	}
	public static Object usbus_add_endpoint(Object usbus, Object iface,  type,  dir, Object len) {
		 ep = ((Object)0);
		 usbdev_ep = /*Error: Function owner not recognized*/usbdev_new_ep(usbus.getDev(), type, dir, len);
		if (usbdev_ep) {
			ep = dir == .USB_EP_DIR_IN ? usbus.getEp_in()[usbdev_ep.getNum()] : usbus.getEp_out()[usbdev_ep.getNum()];
			ep.setMaxpacketsize(usbdev_ep.getLen());
			ep.setEp(usbdev_ep);
			if (iface) {
				ep.setNext(iface.getEp());
				iface.setEp(ep);
			} 
		} 
		return ep;
	}
	public static Object _get_ep_bitflag(Object ep) {
		return 1 << ((ep.getDir() == .USB_EP_DIR_IN ? /* Endpoint activity bit flag, lower USBDEV_NUM_ENDPOINTS bits are
		     * useb as OUT endpoint flags, upper bit are IN endpoints */USBDEV_NUM_ENDPOINTS : -1024) + ep.getNum());
	}
	public static void _set_ep_event(Object usbus, Object ep) {
		if (/*Error: Function owner not recognized*/irq_is_in()) {
			usbus.getEp_events() |=  ModernizedCProgram._get_ep_bitflag(ep);
		} else {
				int state = /*Error: Function owner not recognized*/irq_disable();
				usbus.getEp_events() |=  ModernizedCProgram._get_ep_bitflag(ep);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(state);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/thread_flags_set(()/*Error: Function owner not recognized*/thread_get(usbus.getPid()), USBUS_THREAD_FLAG_USBDEV_EP);
	}
	public static Object _get_and_reset_ep_events(Object usbus) {
		int state = /*Error: Function owner not recognized*/irq_disable();
		uint32_t res = usbus.getEp_events();
		usbus.setEp_events(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(state);
		return res;
	}
	public static void _signal_handlers(Object usbus, Object flag, Object msg) {
		for ( handler = usbus.getHandlers();
		 handler; handler = handler.getNext()) {
			if (handler.getFlags() & flag) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(usbus, handler, msg);
			} 
		}
	}
	public static void _usbus_init_handlers(Object usbus) {
		for ( handler = usbus.getHandlers();
		 handler; handler = handler.getNext()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(usbus, handler);
		}
	}
	public static Object _usbus_thread(Object args) {
		 usbus = ()args;
		 ep0_handler = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/event_queue_init(usbus.getQueue());
		usbus.setControl(ep0_handler.getHandler());
		ModernizedCProgram.usbus_control_init(usbus, ep0_handler);
		 dev = usbus.getDev();
		usbus.setPid(sched_active_pid);
		usbus.setAddr(0);
		usbus.setIface(((Object)0));
		usbus.setStr_idx(1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus: starting thread %i\n", sched_active_pid/* setup the link-layer's message queue */);
		dev.setCb(/* register the event callback with the device driver */ModernizedCProgram._event_cb);
		dev.setEpcb(ModernizedCProgram._event_ep_cb);
		dev.setContext(/* initialize low-level driver */usbus);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_init(dev);
		ModernizedCProgram.usbus_add_string_descriptor(usbus, usbus.getConfig(), "USB config");
		ModernizedCProgram.usbus_add_string_descriptor(usbus, usbus.getProduct(), "USB device");
		ModernizedCProgram.usbus_add_string_descriptor(usbus, usbus.getManuf(), "RIOT-os.org");
		usbus.setState(USBUS_STATE_DISCONNECT);
		ModernizedCProgram._usbus_init_handlers(/* Initialize handlers */usbus);
		while (1) {
			 flags = /*Error: Function owner not recognized*/thread_flags_wait_any(USBUS_THREAD_FLAG_USBDEV | USBUS_THREAD_FLAG_USBDEV_EP | THREAD_FLAG_EVENT);
			if (flags & USBUS_THREAD_FLAG_USBDEV) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_esr(dev);
			} 
			if (flags & USBUS_THREAD_FLAG_USBDEV_EP) {
				uint32_t events = ModernizedCProgram._get_and_reset_ep_events(usbus);
				while (events) {
					int num = /*Error: Function owner not recognized*/bitarithm_lsb(events);
					events &=  ~(1 << num);
					if (num < USBDEV_NUM_ENDPOINTS) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_esr(usbus.getEp_out()[num].getEp());
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_esr(usbus.getEp_in()[num - USBDEV_NUM_ENDPOINTS].getEp());
					} 
				}
			} 
			if (flags & THREAD_FLAG_EVENT) {
				 event = /*Error: Function owner not recognized*/event_get(usbus.getQueue());
				if (event) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(event);
				} 
			} 
		}
		return ((Object)0);
	}
	/*
	 * Copyright (C) 2018 Koen Zandberg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup usb_usbus
	 * @{
	 * @file
	 * @brief   USBUS USB manager thread, handles USB interaction
	 *
	 * @author  Koen Zandberg <koen@bergzand.net>
	 * @}
	 */
	/* Forward declaration of the generic USBUS event callback */
	/* USB event callback */
	public static void _event_cb(Object usbdev, Object event) {
		 usbus = ()usbdev.getContext();
		if (event == USBDEV_EVENT_ESR) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/thread_flags_set(()/*Error: Function owner not recognized*/thread_get(usbus.getPid()), USBUS_THREAD_FLAG_USBDEV);
		} else {
				 msg = new ();
				uint16_t flag = new uint16_t();
				switch (event) {
				case USBDEV_EVENT_RESET:
						usbus.setState(USBUS_STATE_RESET);
						usbus.setAddr(0);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_set(usbus.getDev(), USBOPT_ADDRESS, usbus.getAddr(), /*Error: Unsupported expression*/);
						flag = USBUS_HANDLER_FLAG_RESET;
						msg = USBUS_EVENT_USB_RESET;
						break;
				case USBDEV_EVENT_RESUME:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus: USB resume detected\n");
						usbus.setState(usbus.getPstate());
						flag = USBUS_HANDLER_FLAG_RESUME;
						msg = USBUS_EVENT_USB_RESUME;
						break;
				case USBDEV_EVENT_SUSPEND:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus: USB suspend detected\n");
						usbus.setPstate(usbus.getState());
						usbus.setState(USBUS_STATE_SUSPEND);
						flag = USBUS_HANDLER_FLAG_SUSPEND;
						msg = USBUS_EVENT_USB_SUSPEND;
						break;
				default:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus: unhandled event %x\n", event);
						return /*Error: Unsupported expression*/;
				}
				ModernizedCProgram._signal_handlers(usbus, flag, msg);
		} 
	}
	/* Forward declaration of the endpoint USBUS event callback */
	/* USB generic endpoint callback */
	public static void _event_ep_cb(Object ep, Object event) {
		 usbus = ()ep.getDev().getContext();
		if (event == USBDEV_EVENT_ESR) {
			ModernizedCProgram._set_ep_event(usbus, ep);
		} else {
				 handler = ModernizedCProgram._ep_to_handler(usbus, ep);
				if (handler) {
					switch (event) {
					case USBDEV_EVENT_TR_FAIL:
							if (handler.usbus_handler_isset_flag(USBUS_HANDLER_FLAG_TR_FAIL)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(usbus, handler, ep, USBUS_EVENT_TRANSFER_FAIL);
							} 
							break;
					case USBDEV_EVENT_TR_STALL:
							if (handler.usbus_handler_isset_flag(USBUS_HANDLER_FLAG_TR_STALL)) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(usbus, handler, ep, USBUS_EVENT_TRANSFER_STALL);
								 disable = USBOPT_DISABLE;
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_set(ep, USBOPT_EP_STALL, disable, /*Error: Unsupported expression*/);
							} 
							break;
					case USBDEV_EVENT_TR_COMPLETE:
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(usbus, handler, ep, USBUS_EVENT_TRANSFER_COMPLETE);
							break;
					default:
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("unhandled event: %x\n", event);
							break;
					}
				} 
		} 
	}
	/* $OpenBSD: notdi2.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Return ~a.  For some reason gcc calls this `one's complement' rather
	 * than `not'.
	 */
	public static Object __one_cmpldi2(Object a) {
		Object aa;
		aa.setQ(a);
		Object generatedUl = aa.getUl();
		generatedUl[0] = ~generatedUl[0];
		generatedUl[1] = ~generatedUl[1];
		Object generatedQ = aa.getQ();
		return generatedQ;
	}
	/* $OpenBSD: iordi3.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Return a | b, in quad.
	 */
	public static Object __iordi3(Object a, Object b) {
		Object aa;
		Object bb;
		aa.setQ(a);
		bb.setQ(b);
		Object generatedUl = aa.getUl();
		generatedUl[0] |=  generatedUl[0];
		generatedUl[1] |=  generatedUl[1];
		Object generatedQ = aa.getQ();
		return generatedQ;
	}
	public static int riotboot_slot_validate(int slot) {
		return ModernizedCProgram.riotboot_hdr_validate(ModernizedCProgram.riotboot_slot_get_hdr(slot/**
		 * @brief  Print formatted slot header to STDIO
		 *
		 * @param[in]   slot    slot nr to work on
		 *
		 */));
	}
	public static void riotboot_slot_print_hdr(int slot) {
		ModernizedCProgram.riotboot_hdr_print(ModernizedCProgram.riotboot_slot_get_hdr(slot/**
		 * @brief  Dump the addresses of all configured slots
		 *
		 */));
	}
	/*
	 * Copyright (C) 2018 Koen Zandberg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup usb_usbus
	 * @{
	 * @file
	 * @brief   USBUS multipart control message handling
	 *
	 * @author  Koen Zandberg <koen@bergzand.net>
	 * @}
	 */
	public static int usbus_control_slicer_nextslice(Object usbus) {
		 ep0 = ()usbus.getControl();
		 bldr = ep0.getSlicer();
		size_t end = bldr.getStart() + ep0.getIn().getLen();
		if (bldr.getCur() > end && bldr.getStart() < bldr.getReqlen() && bldr.getTransferred() < bldr.getReqlen()) {
			bldr.getStart() += ep0.getIn().getLen();
			bldr.setCur(0);
			bldr.setLen(0);
			return 1;
		} 
		return 0;
	}
	public static Object usbus_control_slicer_put_bytes(Object usbus, Object buf, Object len) {
		 ep0 = ()usbus.getControl();
		 bldr = ep0.getSlicer();
		size_t end = bldr.getStart() + ep0.getIn().getLen();
		size_t byte_len = /* Length of the string to copy */0;
		/* Calculate start offset of the supplied bytes */size_t byte_offset = (bldr.getStart() > bldr.getCur()) ? bldr.getStart() - bldr.getCur() : 0;
		if ((bldr.getCur() >= end) || (byte_offset > /* Check for string before or beyond window */len)) {
			bldr.getCur() += len;
			return 0;
		} 
		if ((bldr.getCur() + len) >= /* Check if string is over the end of the window */end) {
			byte_len = end - (bldr.getCur() + byte_offset);
		} else {
				byte_len = len - byte_offset;
		} 
		size_t start_offset = bldr.getCur() - bldr.getStart() + byte_offset;
		bldr.getCur() += len;
		bldr.getLen() += byte_len;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ep0.getIn().getBuf() + start_offset, buf + byte_offset, byte_len);
		return byte_len;
	}
	public static Object usbus_control_slicer_put_char(Object usbus, byte c) {
		 ep0 = ()usbus.getControl();
		 bldr = ep0.getSlicer();
		size_t end = bldr.getStart() + ep0.getIn().getLen();
		if ((bldr.getStart() <= bldr.getCur()) && (bldr.getCur() < /* Only copy the char if it is within the window */end)) {
			 pos = ep0.getIn().getBuf() + bldr.getCur() - bldr.getStart();
			pos = c;
			bldr.getCur()++;
			bldr.getLen()++;
			return 1;
		} 
		bldr.getCur()++;
		return 0;
	}
	public static void usbus_control_slicer_ready(Object usbus) {
		 ep0 = ()usbus.getControl();
		 bldr = ep0.getSlicer();
		size_t len = bldr.getLen();
		len = len < bldr.getReqlen() - bldr.getStart() ? len : bldr.getReqlen() - bldr.getStart();
		bldr.getTransferred() += len;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(ep0.getIn(), len);
	}
	public static Object _gen_assoc_descriptor(Object usbus, Object arg) {
		 cdcacm = arg;
		 iad = new ();
		iad.setLength(/*Error: Unsupported expression*/);
		iad.setType(USB_TYPE_DESCRIPTOR_INTERFACE_ASSOC);
		iad.setFirst_interface(cdcacm.getIface_ctrl().getIdx());
		iad.setInterface_count(/* Management and data interface */2);
		iad.setClass(USB_CLASS_CDC_CONTROL);
		iad.setSubclass(USB_CDC_SUBCLASS_ACM);
		iad.setProtocol(0);
		iad.setIdx(0);
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)iad, /*Error: sizeof expression not supported yet*/);
		return /*Error: sizeof expression not supported yet*/;
	}
	public static Object _gen_mngt_descriptor(Object usbus, Object cdcacm) {
		 mngt = new ();
		mngt.setLength(/*Error: Unsupported expression*//* functional call management descriptor */);
		mngt.setType(USB_TYPE_DESCRIPTOR_CDC);
		mngt.setSubtype(USB_CDC_DESCR_SUBTYPE_CALL_MGMT);
		mngt.setCapabalities(0);
		mngt.setData_if(cdcacm.getIface_data().getIdx());
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)mngt, /*Error: sizeof expression not supported yet*/);
		return /*Error: Unsupported expression*/;
	}
	public static Object _gen_acm_descriptor(Object usbus) {
		 acm = new ();
		acm.setLength(/*Error: Unsupported expression*//* functional cdc acm descriptor */);
		acm.setType(USB_TYPE_DESCRIPTOR_CDC);
		acm.setSubtype(USB_CDC_DESCR_SUBTYPE_ACM);
		acm.setCapabalities(/* Support for Set/Get_Line_coding, Control_State, and Serial_State notif */-1024);
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)acm, /*Error: sizeof expression not supported yet*/);
		return /*Error: Unsupported expression*/;
	}
	public static Object _gen_full_acm_descriptor(Object usbus, Object arg) {
		 cdcacm = ()arg;
		size_t total_len = 0;
		total_len += ModernizedCProgram._gen_cdc_descriptor(usbus);
		total_len += ModernizedCProgram._gen_acm_descriptor(usbus);
		total_len += ModernizedCProgram._gen_union_descriptor(usbus, cdcacm);
		total_len += ModernizedCProgram._gen_mngt_descriptor(usbus, cdcacm);
		return total_len;
	}
	/* Submit (ACM interface in) */
	public static Object usbus_cdc_acm_submit(Object cdcacm, Object buf, Object len) {
		return cdcacm.getTsrb().tsrb_add(buf, len);
	}
	public static void usbus_cdc_acm_set_coding_cb(Object cdcacm, Object coding_cb) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_disable();
		cdcacm.setCoding_cb(coding_cb);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_enable();
	}
	/* flush event */
	public static void usbus_cdc_acm_flush(Object cdcacm) {
		if (cdcacm.getUsbus()) {
			cdcacm.getUsbus().usbus_event_post(cdcacm.getFlush());
		} 
	}
	public static void usbus_cdc_acm_init(Object usbus, Object cdcacm, Object cb, Object coding_cb, Object buf, Object len) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(cdcacm, 0, /*Error: Unsupported expression*/);
		cdcacm.setUsbus(usbus);
		cdcacm.getTsrb().tsrb_init(buf, len);
		cdcacm.getHandler_ctrl().setDriver(ModernizedCProgram.cdc_driver);
		cdcacm.setCb(cb);
		cdcacm.setCoding_cb(coding_cb);
		cdcacm.setState(USBUS_CDC_ACM_LINE_STATE_DISCONNECTED);
		ModernizedCProgram.usbus_register_event_handler(usbus, cdcacm.getHandler_ctrl());
	}
	public static void _handle_in(Object cdcacm, Object ep) {
		if ((cdcacm.getUsbus().getState() != USBUS_STATE_CONFIGURED) || (cdcacm.getState() != USBUS_CDC_ACM_LINE_STATE_DTE)) {
			return /*Error: Unsupported expression*/;
		} 
		while (!ModernizedCProgram.tsrb_empty(cdcacm.getTsrb())) {
			int c = cdcacm.getTsrb().tsrb_get_one();
			ep.getBuf()[cdcacm.getOccupied()++] = (uint8_t)c;
			if (cdcacm.getOccupied() >= USBUS_CDC_ACM_BULK_EP_SIZE) {
				break;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(ep, cdcacm.getOccupied());
	}
	public static void _handle_flush(Object ev) {
		 cdcacm = /*Error: Function owner not recognized*/container_of(ev, ModernizedCProgram.usbus_cdcacm_device_t, flush);
		if (cdcacm.getOccupied() == 0) {
			ModernizedCProgram._handle_in(cdcacm, cdcacm.getIface_data().getEp().getNext().getEp());
		} 
	}
	/*
	 * POSIX compatible implementation of barriers.
	 *
	 * Copyright (C) 2014 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup pthread
	 * @{
	 * @file
	 * @brief Synchronization barriers.
	 * @author René Kijewski <kijewski@inf.fu-berlin.de>
	 * @}
	 */
	public static int pthread_barrier_init(Object attr, int count) {
		(Object)attr;
		this.setNext(((Object)0));
		Object generatedMutex = this.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_init(generatedMutex);
		this.setCount(count);
		return 0;
	}
	public static int pthread_barrier_destroy() {
		this.setCount(-1);
		return 0;
	}
	public static int priority_min(int a, int b) {
		if (a == -1) {
			return b;
		} 
		return a < b ? a : b;
	}
	public static int pthread_barrier_wait() {
		Object generatedMutex = this.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(generatedMutex);
		int switch_prio = -1;
		Object generatedCount = this.getCount();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedMutex);
		if (switch_prio != -1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_switch(switch_prio);
		} 
		return 0;
	}
	/* Idea: the count is decreased by every thread that waits on the barrier.
	     * If the value is bigger than zero afterwards, then the thread has to wait
	     * to be woken up. Once the value reaches zero, everyone gets woken up. */
	public static Object __muldi3(Object a, Object b) {
		Object u;
		Object v;
		Object low;
		Object prod;
		 high = new ();
		 mid = new ();
		 udiff = new ();
		 vdiff = new ();
		int negall;
		if (a >= /*
		     * Get u and v such that u, v >= 0.  When this is finished,
		     * u1, u0, v1, and v0 will be directly accessible through the
		     * int fields.
		     */0) {
			;
		} else {
				;
		} 
		if (b >= 0) {
			v.setQ(b);
		} else {
				;
		} 
		Object generatedUl = u.getUl();
		if (generatedUl[(true)] == 0 && generatedUl[(true)] == 0/*
		         * An (I hope) important optimization occurs when u1 and v1
		         * are both 0.  This should be common since most numbers
		         * are small.  Here the product is just u0*v0.
		         */) {
			prod.setQ(ModernizedCProgram.__lmulq(generatedUl[(false)], generatedUl[(false)]));
		} else {
				int negmid;
				low.setQ(ModernizedCProgram.__lmulq(generatedUl[(false)], generatedUl[(false)]));
				if (generatedUl[(true)] >= generatedUl[(false)]) {
					;
				} else {
						;
				} 
				if (generatedUl[(false)] >= generatedUl[(true)]) {
					vdiff = generatedUl[(false)] - generatedUl[(true)];
				} else {
						;
				} 
				mid = udiff * vdiff;
				high = generatedUl[(true)] * generatedUl[(true/*
				         * Assemble the final product.
				         */)];
				generatedUl[(true)] = high + (negmid ? -mid : mid) + generatedUl[(false)] + generatedUl[(true)];
				generatedUl[(false)] = generatedUl[(false)];
		} 
		Object generatedQ = prod.getQ();
		return negall ? -generatedQ : generatedQ;/*
		 * Multiply two 2N-bit ints to produce a 4N-bit quad, where N is half
		 * the number of bits in an int (whatever that is---the code below
		 * does not care as long as quad.h does its part of the bargain---but
		 * typically N==16).
		 *
		 * We use the same algorithm from Knuth, but this time the modulo refinement
		 * does not apply.  On the other hand, since N is half the size of an int,
		 * we can get away with native multiplication---none of our input terms
		 * exceeds (UINT_MAX >> 1).
		 *
		 * Note that, for u_int l, the quad-precision result
		 *
		 *  l << N
		 *
		 * splits into high and low ints as HHALF(l) and LHUP(l) respectively.
		 */
	}
	/* $OpenBSD: muldi3.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Multiply two quads.
	 *
	 * Our algorithm is based on the following.  Split incoming quad values
	 * u and v (where u,v >= 0) into
	 *
	 *  u = 2^n u1  *  u0   (n = number of bits in `u_int', usu. 32)
	 *
	 * and
	 *
	 *  v = 2^n v1  *  v0
	 *
	 * Then
	 *
	 *  uv = 2^2n u1 v1  +  2^n u1 v0  +  2^n v1 u0  +  u0 v0
	 *     = 2^2n u1 v1  +     2^n (u1 v0 + v1 u0)   +  u0 v0
	 *
	 * Now add 2^n u1 v1 to the first term and subtract it from the middle,
	 * and add 2^n u0 v0 to the last term and subtract it from the middle.
	 * This gives:
	 *
	 *  uv = (2^2n + 2^n) (u1 v1)  +
	 *           (2^n)    (u1 v0 - u1 v1 + u0 v1 - u0 v0)  +
	 *         (2^n + 1)  (u0 v0)
	 *
	 * Factoring the middle a bit gives us:
	 *
	 *  uv = (2^2n + 2^n) (u1 v1)  +            [u1v1 = high]
	 *       (2^n)    (u1 - u0) (v0 - v1)  +    [(u1-u0)... = mid]
	 *         (2^n + 1)  (u0 v0)           [u0v0 = low]
	 *
	 * The terms (u1 v1), (u1 - u0) (v0 - v1), and (u0 v0) can all be done
	 * in just half the precision of the original.  (Note that either or both
	 * of (u1 - u0) or (v0 - v1) may be negative.)
	 *
	 * This algorithm is from Knuth vol. 2 (2nd ed), section 4.3.3, p. 278.
	 *
	 * Since C does not give us a `int * int = quad' operator, we split
	 * our input quads into two ints, then split the two ints into two
	 * shorts.  We can then calculate `short * short = int' in native
	 * arithmetic.
	 *
	 * Our product should, strictly speaking, be a `long quad', with 128
	 * bits, but we are going to discard the upper 64.  In other words,
	 * we are not interested in uv, but rather in (uv mod 2^2n).  This
	 * makes some of the terms above vanish, and we get:
	 *
	 *  (2^n)(high) + (2^n)(mid) + (2^n + 1)(low)
	 *
	 * or
	 *
	 *  (2^n)(high + mid + low) + low
	 *
	 * Furthermore, `high' and `mid' can be computed mod 2^n, as any factor
	 * of 2^n in either one will also vanish.  Only `low' need be computed
	 * mod 2^2n, and only because of the final term above.
	 */
	public static Object __lmulq(int u, int v) {
		 u1 = new ();
		 u0 = new ();
		 v1 = new ();
		 v0 = new ();
		 udiff = new ();
		 vdiff = new ();
		 high = new ();
		 mid = new ();
		 low = new ();
		 prodh = new ();
		 prodl = new ();
		 was = new ();
		Object prod;
		int neg;
		u1 = (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(u) >> (/*Error: Unsupported expression*/ * 8 / 2));
		u0 = (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(u) & (((int)1 << (/*Error: Unsupported expression*/ * 8 / 2)) - 1));
		v1 = (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(v) >> (/*Error: Unsupported expression*/ * 8 / 2));
		v0 = (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(v) & (((int)1 << (/*Error: Unsupported expression*/ * 8 / 2)) - 1));
		low = u0 * v0;
		if (u1 == 0 && v1 == /* This is the same small-number optimization as before. */0) {
			return low;
		} 
		if (u1 >= u0) {
			;
		} else {
				;
		} 
		if (v0 >= v1) {
			vdiff = v0 - v1;
		} else {
				;
		} 
		mid = udiff * vdiff;
		high = u1 * v1;
		prodh = high + (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(high) >> (/*Error: Unsupported expression*/ * 8 / /* prod = (high << 2N) + (high << N); */2));
		prodl = (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(high) << (/*Error: Unsupported expression*/ * 8 / 2));
		if (/* if (neg) prod -= mid << N; else prod += mid << N; */neg) {
			was = prodl;
			prodl -= (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mid) << (/*Error: Unsupported expression*/ * 8 / 2));
			prodh -= (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mid) >> (/*Error: Unsupported expression*/ * 8 / 2)) + (prodl > was);
		} else {
				was = prodl;
				prodl += (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mid) << (/*Error: Unsupported expression*/ * 8 / 2));
				prodh += (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mid) >> (/*Error: Unsupported expression*/ * 8 / 2)) + (prodl < was);
		} 
		was = /* prod += low << N */prodl;
		prodl += (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(low) << (/*Error: Unsupported expression*/ * 8 / 2));
		prodh += (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(low) >> (/*Error: Unsupported expression*/ * 8 / 2)) + (prodl < was);
		if ((prodl += low) < /* ... + low; */low) {
			prodh++;
		} 
		Object generatedUl = prod.getUl();
		generatedUl[(true)] = /* return 4N-bit product */prodh;
		generatedUl[(false)] = prodl;
		Object generatedQ = prod.getQ();
		return generatedQ;
	}
	/* $OpenBSD: adddi3.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Add two quads.  This is trivial since a one-bit carry from a single
	 * u_int addition x+y occurs if and only if the sum x+y is less than
	 * either x or y (the choice to compare with x or y is arbitrary).
	 */
	public static Object __adddi3(Object a, Object b) {
		Object aa;
		Object bb;
		Object sum;
		aa.setQ(a);
		bb.setQ(b);
		Object generatedUl = sum.getUl();
		generatedUl[(false)] = generatedUl[(false)] + generatedUl[(false)];
		generatedUl[(true)] = generatedUl[(true)] + generatedUl[(true)] + (generatedUl[(false)] < generatedUl[(false)]);
		Object generatedQ = sum.getQ();
		return generatedQ;
	}
	/*
	 * Copyright (C) 2013 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup pthread
	 * @{
	 * @file
	 * @brief   Mutual exclusion.
	 * @author  Christian Mehlis <mehlis@inf.fu-berlin.de>
	 * @author  René Kijewski <kijewski@inf.fu-berlin.de>
	 * @}
	 */
	public static int pthread_mutex_init(Object mutex, Object mutexattr) {
		(Object)mutexattr;
		if (!mutex) {
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_init(mutex);
		return 0;
	}
	public static int pthread_mutex_destroy(Object mutex) {
		(Object)mutex;
		return 0;
	}
	public static int pthread_mutex_trylock(Object mutex) {
		if (!mutex) {
			return -1;
		} 
		return 1 - /*Error: Function owner not recognized*/mutex_trylock(/* mutex_trylock() returns 1 on success, and 0 otherwise. *//* We want the reverse. */mutex);
	}
	public static int pthread_mutex_lock(Object mutex) {
		if (!mutex) {
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(mutex);
		return 0;
	}
	public static int pthread_mutex_timedlock(Object mutex, Object abstime) {
		(Object)mutex;
		(Object)abstime;
		return -/* currently not supported */1;
	}
	public static int pthread_mutex_unlock(Object mutex) {
		if (!mutex) {
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(mutex);
		return 0;
	}
	/*
	 * Copyright (C) 2015 Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 */
	public static void sixlowpan_print(Object[] data, Object size) {
		if (data[0] == SIXLOWPAN_UNCOMP) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Uncompressed IPv6 packet");
			if (size > /*Error: Unsupported expression*//* might just be the dispatch (or fragmented) so better check */) {
				ModernizedCProgram.ipv6_hdr_print(()(data + 1));
				ModernizedCProgram.od_hex_dump(data + /*Error: Unsupported expression*/ + 1, size - /*Error: Unsupported expression*/ - 1, (true));
			} 
		}  else if (ModernizedCProgram.sixlowpan_nalp(data[0])) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Not a LoWPAN (NALP) frame");
			ModernizedCProgram.od_hex_dump(data, size, (true));
		}  else if ((data[0] & SIXLOWPAN_FRAG_DISP_MASK) == SIXLOWPAN_FRAG_1_DISP) {
			 hdr = ()data;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Fragmentation Header (first)");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("datagram size: %u\n", (/*Error: Function owner not recognized*/byteorder_ntohs(hdr.getDisp_size()) & SIXLOWPAN_FRAG_SIZE_MASK));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("tag: 0x%04x\n", /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getTag()));
			ModernizedCProgram.sixlowpan_print(data + /*Error: Unsupported expression*//* Print next dispatch */, size - /*Error: Unsupported expression*/);
		}  else if ((data[0] & SIXLOWPAN_FRAG_DISP_MASK) == SIXLOWPAN_FRAG_N_DISP) {
			 hdr = ()data;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Fragmentation Header (subsequent)");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("datagram size: %u\n", (/*Error: Function owner not recognized*/byteorder_ntohs(hdr.getDisp_size()) & SIXLOWPAN_FRAG_SIZE_MASK));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("tag: 0x%04x\n", /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getTag()));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("offset: %u\n", (int)hdr.getOffset());
			ModernizedCProgram.od_hex_dump(data + /*Error: Unsupported expression*/, size - /*Error: Unsupported expression*/, (true));
		}  else if ((data[0] & SIXLOWPAN_IPHC1_DISP_MASK) == SIXLOWPAN_IPHC1_DISP) {
			uint8_t offset = SIXLOWPAN_IPHC_HDR_LEN;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("IPHC dispatch");
			switch (data[0] & SIXLOWPAN_IPHC1_TF) {
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("TF: ECN + DSCP (1 bytes)");
					break;
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("TF: traffic class and flow label elided");
					break;
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("TF: ECN + Flow Label (3 bytes)");
					break;
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("TF: ECN + DSCP + Flow Label (4 bytes)");
					break;
			}
			switch (data[0] & SIXLOWPAN_IPHC1_NH) {
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("NH: inline");
					break;
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("NH: LOWPAN_NHC");
					break;
			}
			switch (data[0] & SIXLOWPAN_IPHC1_HL) {
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("HLIM: inline");
					break;
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("HLIM: 64");
					break;
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("HLIM: 255");
					break;
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("HLIM: 1");
					break;
			}
			if (data[1] & SIXLOWPAN_IPHC2_SAC) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Stateful source address compression: ");
				switch (data[1] & SIXLOWPAN_IPHC2_SAM) {
				case -1024:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("16 bits inline");
						break;
				case -1024:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("unspecified address (::)");
						break;
				case -1024:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("elided (use L2 address)");
						break;
				case -1024:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("64 bits inline");
						break;
				}
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Stateless source address compression: ");
					switch (data[1] & SIXLOWPAN_IPHC2_SAM) {
					case -1024:
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("64 bits inline");
							break;
					case -1024:
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("elided (use L2 address)");
							break;
					case -1024:
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("16 bits inline");
							break;
					case -1024:
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("128 bits inline");
							break;
					}
			} 
			if (data[1] & SIXLOWPAN_IPHC2_M) {
				if (data[1] & SIXLOWPAN_IPHC2_DAC) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Stateful destinaton multicast address compression:");
					switch (data[1] & SIXLOWPAN_IPHC2_DAM) {
					case -1024:
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("    reserved");
							break;
					case -1024:
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("    48 bits carried inline (Unicast-Prefix-based)");
							break;
					case -1024:
					case -1024:
					}
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Stateless destinaton multicast address compression:");
						switch (data[1] & SIXLOWPAN_IPHC2_DAM) {
						case -1024:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("    32 bits carried inline");
								break;
						case -1024:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("    8 bits carried inline");
								break;
						case -1024:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("    128 bits carried inline");
								break;
						case -1024:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("    48 bits carried inline");
								break;
						}
				} 
			} else {
					if (data[1] & SIXLOWPAN_IPHC2_DAC) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Stateful destinaton address compression: ");
						switch (data[1] & SIXLOWPAN_IPHC2_DAM) {
						case -1024:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("16 bits inline");
								break;
						case -1024:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("64 bits inline");
								break;
						case -1024:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("elided (use L2 address)");
								break;
						case -1024:
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("reserved");
								break;
						}
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Stateless destinaton address compression: ");
							switch (data[1] & SIXLOWPAN_IPHC2_DAM) {
							case -1024:
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("64 bits inline");
									break;
							case -1024:
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("128 bits inline");
									break;
							case -1024:
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("16 bits inline");
									break;
							case -1024:
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("elided (use L2 address)");
									break;
							}
					} 
			} 
			if (data[1] & SIXLOWPAN_IPHC2_CID_EXT) {
				offset += SIXLOWPAN_IPHC_CID_EXT_LEN;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("SCI: 0x%x, DCI: 0x%x\n", (int)(data[2] >> 4), (int)(data[2] & -1024));
			} 
			ModernizedCProgram.od_hex_dump(data + offset, size - offset, (true/** @} */));
		} 
	}
	/**
	 * Timex implementation
	 *
	 * Copyright (C) 2009, 2010, 2013, 2014 Freie Universitaet Berlin (FUB).
	 * Copyright (C) 2013, 2014 INRIA.
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @file
	 * @author Kaspar Schleiser <kaspar@schleiser.de>
	 * @author Oliver Hahm <oliver.hahm@inria.fr>
	 * @author Christian Mehlis <mehlis@inf.fu-berlin.de>
	 * @author Daniel Jentsch <d.jentsch@fu-berlin.de>
	 *
	 */
	public static  timex_add(Object a, Object b) {
		timex_t result = new timex_t();
		result.setSeconds(a.getSeconds() + b.getSeconds());
		result.setMicroseconds(a.getMicroseconds() + b.getMicroseconds());
		Object generatedMicroseconds = result.getMicroseconds();
		Object generatedSeconds = result.getSeconds();
		if (generatedMicroseconds > (true)) {
			generatedMicroseconds -= (true);
			generatedSeconds++;
		} 
		return result;
	}
	public static  timex_set(Object seconds, Object microseconds) {
		timex_t result = new timex_t();
		result.setSeconds(seconds);
		result.setMicroseconds(microseconds);
		return result;
	}
	public static  timex_sub(Object a, Object b) {
		timex_t result = new timex_t();
		if (a.getMicroseconds() >= b.getMicroseconds()) {
			result.setSeconds(a.getSeconds() - b.getSeconds());
			result.setMicroseconds(a.getMicroseconds() - b.getMicroseconds());
		} else {
				result.setSeconds(a.getSeconds() - b.getSeconds() - 1);
				result.setMicroseconds(a.getMicroseconds() + (true) - b.getMicroseconds());
		} 
		return result;
	}
	public static int timex_cmp(Object a, Object b) {
		if (a.getSeconds() < b.getSeconds()) {
			return -1;
		} 
		if (a.getSeconds() == b.getSeconds()) {
			if (a.getMicroseconds() < b.getMicroseconds()) {
				return -1;
			} 
			if (a.getMicroseconds() == b.getMicroseconds()) {
				return 0;
			} 
		} 
		return 1;
	}
	public static int rand_minstd() {
		uint32_t hi = /*Error: Function owner not recognized*/div_u32_by_44488(ModernizedCProgram._seed);
		uint32_t lo = /*Error: Function owner not recognized*/div_u32_mod_44488(ModernizedCProgram._seed);
		uint32_t test = (48271 * lo) - ((2147483647 % 48271) * hi);
		if (test > 0) {
			ModernizedCProgram._seed = test;
		} else {
				ModernizedCProgram._seed = test + 2147483647;
		} 
		return ModernizedCProgram._seed;
	}
	public static Object random_uint32() {
		uint16_t A = (ModernizedCProgram.rand_minstd() >> /* minstd as implemented returns only values from 1 to 2147483647,
		     * so run it two times to get 32bits */15);
		uint16_t B = (ModernizedCProgram.rand_minstd() >> 15);
		return (((uint32_t)A) << 16) | B;
		uint32_t ret = new uint32_t();
		int8_t[] bytes = new int8_t();
		ModernizedCProgram._random_bytes((uint8_t)bytes, /*Error: Unsupported expression*/);
		ret = ((bytes[0] & -1024) << 24) | ((bytes[1] & -1024) << 16) | ((bytes[2] & -1024) << 8) | (bytes[3] & -1024);
		return ret;
		return ModernizedCProgram.xorshift32(ModernizedCProgram._state32);
		if (ModernizedCProgram.mti >= 624) {
			ModernizedCProgram.generate_numbers();
		} 
		uint32_t y = ModernizedCProgram.mt[ModernizedCProgram.mti++];
		y ^=  y >> 11;
		y ^=  (y << 7) & -1024;
		y ^=  (y << 15) & -1024;
		y ^=  y >> 18;
		return y;
		ModernizedCProgram._seed = -1024 * ModernizedCProgram._seed + 1;
		return ModernizedCProgram._seed >> 32;
	}
	public static void random_init(Object val) {
		if (!val) {
			val = 1;
		} 
		ModernizedCProgram._seed = val;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_init(ModernizedCProgram.ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_update(ModernizedCProgram.ctx, (Object)seed, /*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_final(ModernizedCProgram.ctx, ModernizedCProgram.digestdata);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.prng_state, ModernizedCProgram.ctx.getState(), /* copy seeded SHA1 state to PRNG state */20);
		if (!val) {
			val = 1;
		} 
		ModernizedCProgram._state32 = val;
		ModernizedCProgram.mt[0] = s;
		for (int i = 1;
		 i < 624; ++i) {
			ModernizedCProgram.mt[i] = -1024 * (ModernizedCProgram.mt[i - 1] ^ (ModernizedCProgram.mt[i - 1] >> 30)) + i/* See Knuth TAOCP Vol2. 3rd Ed. P.106 for multiplier. *//* In the previous versions, MSBs of the seed affect   *//* only MSBs of the array mt[].                        */;
		}
		ModernizedCProgram.mti = /* 2002/01/09 modified by Makoto Matsumoto             */624;
		ModernizedCProgram._seed = s - 1;
	}
	public static int _list(int argc, Byte argv) {
		(Object)argc;
		(Object)argv;
		for (int i = 0;
		 i < CAN_DLL_NUMOF; i++) {
			byte name = /*Error: Function owner not recognized*/raw_can_get_name_by_ifnum(i);
			if (name) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("CAN #%d: %s\n", i, name);
			} else {
					break;
			} 
		}
		return 0;
	}
	public static int _dump(int argc, byte[][] argv) {
		if (argc < 4) {
			ModernizedCProgram._can_usage();
			return 0;
		} 
		int ret = -1;
		can_filter[] filters = new can_filter();
		 conn = new ();
		can_frame frame = new can_frame();
		int ifnum = /*Error: Function owner not recognized*/atoi(argv[1]);
		int cnt = /*Error: Function owner not recognized*/atoi(argv[2]);
		uint32_t ms = /*Error: Function owner not recognized*/strtoul(argv[3], ((Object)0), 0);
		size_t nb_filters = 1;
		if (ifnum >= CAN_DLL_NUMOF) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Invalid ifnum");
			return 1;
		} 
		if (cnt) {
			cnt++;
		} 
		if (argc > 4) {
			byte p = argv[4];
			byte end;
			int i = 0;
			while (p != (byte)'\0' && i < 10) {
				filters[i].setCan_filter(/*Error: Function owner not recognized*/strtoul(p, end, 16));
				if (end == (byte)':') {
					p = end + 1;
					filters[i].setCan_filter(/*Error: Function owner not recognized*/strtoul(p, end, 16));
				} else {
						filters[i].setCan_filter(-1024);
				} 
				if (end == (byte)',') {
					p = end + 1;
				} else {
						p = end;
				} 
				i++;
			}
			nb_filters = i;
		} else {
				filters[0].setCan_filter(0);
				filters[0].setCan_filter(0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/conn_can_raw_create(conn, filters, nb_filters, ifnum, 0);
		if (ret < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Timeout");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Closing");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/conn_can_raw_close(conn);
		return 0;
	}
	/*
	 * Copyright 2017 OTA keys S.A.
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Shell command implementation for CAN stack
	 *
	 * @author      Vincent Dupont <vincent@otakeys.com>
	 *
	 * @}
	 */
	public static int _can_usage() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("usage: can <command> [arguments]");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("commands:");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\tlist");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\tsend ifnum id [B1 .. B8]");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\tdump ifnum nb ms [id1[:mask1][,id2[:mask2], .. id10:[mask10]]");
		return 0;
	}
	public static int _can_handler(int argc, byte[][] argv) {
		if (argc < 2) {
			ModernizedCProgram._can_usage();
			return 1;
		}  else if (/*Error: Function owner not recognized*/strncmp(argv[1], "list", 5) == 0) {
			return ModernizedCProgram._list(argc - 1, argv + 1);
		}  else if (/*Error: Function owner not recognized*/strncmp(argv[1], "send", 5) == 0) {
			return ModernizedCProgram._send(argc - 1, argv + 1);
		}  else if (/*Error: Function owner not recognized*/strncmp(argv[1], "dump", 5) == 0) {
			return ModernizedCProgram._dump(argc - 1, argv + 1);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("unknown command: %s\n", argv[1]);
				return 1;
		} 
		return 0;
	}
	public static int sema_wait_timed(Object timeout) {
		return sema._sema_wait((timeout != 0), timeout/**
		 * @brief   Wait for a semaphore being posted (without timeout).
		 *
		 * @pre `(sema != NULL)`
		 *
		 * @param[in]  sema A semaphore.
		 *
		 * @return  0 on success
		 * @return  -ECANCELED, if the semaphore was destroyed.
		 */);
	}
	public static int sema_wait() {
		return sema._sema_wait(1, 0/**
		 * @brief   Test if the semaphore is posted
		 *
		 * @pre `(sema != NULL)`
		 *
		 * This is a non-blocking alternative to @ref sema_wait.
		 *
		 * @return 0 on success
		 * @return  -EAGAIN, if the semaphore is not posted.
		 * @return  -ECANCELED, if the semaphore was destroyed.
		 */);
	}
	public static int sema_try_wait() {
		return sema._sema_wait(0, 0/**
		 * @brief   Signal semaphore.
		 *
		 * @pre `(sema != NULL)`
		 *
		 * @param[in] sema  A semaphore.
		 *
		 * @return  0, on success
		 * @return  -EOVERFLOW, if the semaphore's value would overflow.
		 */);
	}
	public static boolean sixlowpan_sfr_is() {
		Object generatedDisp_ecn = this.getDisp_ecn();
		return ((generatedDisp_ecn & (true)) == (true/**
		 * @brief   Set the ECN flag in a 6LoWPAN selective fragment recovery header
		 *
		 * @param[in,out] hdr   A 6LoWPAN selective fragment recovery header
		 */));
	}
	public static void sixlowpan_sfr_set_ecn() {
		Object generatedDisp_ecn = this.getDisp_ecn();
		generatedDisp_ecn |=  (true/**
		 * @brief   Clear the ECN flag in a 6LoWPAN recoverable fragment header
		 *
		 * @param[in,out] hdr   A 6LoWPAN selective fragment recovery header
		 */);
	}
	public static void sixlowpan_sfr_clear_ecn() {
		Object generatedDisp_ecn = this.getDisp_ecn();
		generatedDisp_ecn &=  ~(true/**
		 * @brief   Check if the ECN flag in a 6LoWPAN recoverable fragment header is
		 *          set
		 *
		 * @param[in] hdr   A 6LoWPAN selective fragment recovery header
		 *
		 * return   true, if ECN flag in @p hdr is set
		 * return   false, if ECN flag in @p hdr is cleared
		 */);
	}
	public static boolean sixlowpan_sfr_ecn(Object hdr) {
		return (hdr.getDisp_ecn() & (true/**
		 * @brief   Initialize 6LoWPAN recoverable fragment dispatch
		 *
		 * @see @ref SIXLOWPAN_SFR_RFRAG_DISP
		 *
		 * @param[in,out] hdr   A 6LoWPAN selective fragment recovery header
		 */));
	}
	public static void sixlowpan_sfr_rfrag_set_disp() {
		Object generatedDisp_ecn = this.getDisp_ecn();
		generatedDisp_ecn &=  ~SIXLOWPAN_SFR_DISP_MASK;
		generatedDisp_ecn |=  SIXLOWPAN_SFR_RFRAG_DISP/**
		 * @brief   Check if given header is a 6LoWPAN recoverable fragment header
		 *
		 * @see @ref SIXLOWPAN_SFR_RFRAG_DISP
		 *
		 * @param[in] hdr       The 6LoWPAN selective fragment recovery header to check
		 *
		 * return   true, if @p hdr is a 6LoWPAN recoverable fragment header
		 * return   false, if @p hdr is not a 6LoWPAN recoverable fragment header
		 */;
	}
	public static boolean sixlowpan_sfr_rfrag_is(Object hdr) {
		return ((hdr.getDisp_ecn() & SIXLOWPAN_SFR_DISP_MASK) == SIXLOWPAN_SFR_RFRAG_DISP/**
		 * @brief   Set the Acknowledgment request flag in a 6LoWPAN recoverable
		 *          fragment header
		 *
		 * @param[in,out] hdr   A 6LoWPAN recoverable fragment header
		 */);
	}
	public static void sixlowpan_sfr_rfrag_set_ack_req() {
		Object generatedAr_seq_fs = this.getAr_seq_fs();
		generatedAr_seq_fs.getU8()[0] |=  (true/**
		 * @brief   Clear the Acknowledgment request flag in a 6LoWPAN recoverable
		 *          fragment header
		 *
		 * @param[in,out] hdr   A 6LoWPAN recoverable fragment header
		 */);
	}
	public static void sixlowpan_sfr_rfrag_clear_ack_req() {
		Object generatedAr_seq_fs = this.getAr_seq_fs();
		generatedAr_seq_fs.getU8()[0] &=  ~(true/**
		 * @brief   Check if the Acknowledgment request flag in a 6LoWPAN recoverable
		 *          fragment header is set
		 *
		 * @param[in] hdr   A 6LoWPAN recoverable fragment header
		 *
		 * return   true, if Acknowledgment request flag in @p hdr is set
		 * return   false, if Acknowledgment request flag in @p hdr is cleared
		 */);
	}
	public static boolean sixlowpan_sfr_rfrag_ack_req() {
		Object generatedAr_seq_fs = this.getAr_seq_fs();
		return (generatedAr_seq_fs.getU8()[0] & (true/**
		 * @brief   Set sequence number in a 6LoWPAN recoverable fragment header
		 *
		 * @pre     `seq <= SIXLOWPAN_SFR_SEQ_MAX`
		 *
		 * @param[in,out] hdr   A 6LoWPAN recoverable fragment header
		 * @param[in] seq       The sequence number to set. Must be lesser or equal
		 *                      to @ref SIXLOWPAN_SFR_SEQ_MAX.
		 */));
	}
	public static void sixlowpan_sfr_rfrag_set_seq(Object seq) {
		((seq <= (true)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("seq <= SIXLOWPAN_SFR_SEQ_MAX", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\sfr.h", 277));
		Object generatedAr_seq_fs = this.getAr_seq_fs();
		generatedAr_seq_fs.getU8()[0] &=  ~(true);
		generatedAr_seq_fs.getU8()[0] |=  (seq << (true/**
		 * @brief   Get sequence number from a 6LoWPAN recoverable fragment header
		 *
		 * @param[in] hdr   A 6LoWPAN recoverable fragment header
		 *
		 * @return  The sequence number of the 6LoWPAN recoverable fragment
		 */));
	}
	public static Object sixlowpan_sfr_rfrag_get_seq(Object hdr) {
		return ((hdr.getAr_seq_fs().getU8()[0] & (true)) >> (true/**
		 * @brief   Set fragment size in a 6LoWPAN recoverable fragment header
		 *
		 * @pre     `frag_size <= SIXLOWPAN_SFR_FRAG_SIZE_MAX`
		 *
		 * @param[in,out] hdr   A 6LoWPAN recoverable fragment header
		 * @param[in] frag_size The fragment size to set. Must be lesser or equal to
		 *                      @ref SIXLOWPAN_SFR_FRAG_SIZE_MAX.
		 */));
	}
	public static void sixlowpan_sfr_rfrag_set_frag_size(Object frag_size) {
		((frag_size <= (true)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("frag_size <= SIXLOWPAN_SFR_FRAG_SIZE_MAX", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\sfr.h", 307));
		Object generatedAr_seq_fs = this.getAr_seq_fs();
		generatedAr_seq_fs.getU16() &=  ~/*Error: Function owner not recognized*/htons((true));
		generatedAr_seq_fs.getU16() |=  /*Error: Function owner not recognized*/htons(frag_size/**
		 * @brief   Get fragment size from a 6LoWPAN recoverable fragment header
		 *
		 * @param[in] hdr   A 6LoWPAN recoverable fragment header
		 *
		 * @return  The fragment size of the 6LoWPAN recoverable fragment
		 */);
	}
	public static Object sixlowpan_sfr_rfrag_get_frag_size(Object hdr) {
		return (/*Error: Function owner not recognized*/byteorder_ntohs(hdr.getAr_seq_fs()) & (true/**
		 * @brief   Set fragment offset in a 6LoWPAN recoverable fragment header
		 *
		 * @param[in,out] hdr   A 6LoWPAN recoverable fragment header
		 * @param[in] offset    The fragment offset to set.
		 */));
	}
	public static void sixlowpan_sfr_rfrag_set_offset(Object offset) {
		this.setOffset(/*Error: Function owner not recognized*/byteorder_htons(offset/**
		 * @brief   Get fragment offset from a 6LoWPAN recoverable fragment header
		 *
		 * @param[in] hdr   A 6LoWPAN recoverable fragment header
		 *
		 * @return  The fragment offset of the 6LoWPAN recoverable fragment
		 */));
	}
	public static Object sixlowpan_sfr_rfrag_get_offset(Object hdr) {
		return /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getOffset());
	}
	public static void sixlowpan_sfr_ack_set_disp() {
		Object generatedDisp_ecn = this.getDisp_ecn();
		generatedDisp_ecn &=  ~SIXLOWPAN_SFR_DISP_MASK;
		generatedDisp_ecn |=  SIXLOWPAN_SFR_ACK_DISP/**
		 * @brief   Check if given header is a 6LoWPAN RFRAG acknowledgment header
		 *
		 * @see @ref SIXLOWPAN_SFR_ACK_DISP
		 *
		 * @param[in] hdr       The 6LoWPAN selective fragment recovery header to check
		 *
		 * return   true, if @p hdr is a 6LoWPAN RFRAG acknowledgment header
		 * return   false, if @p hdr is not a 6LoWPAN RFRAG acknowledgment header
		 */;
	}
	public static boolean sixlowpan_sfr_ack_is(Object hdr) {
		return ((hdr.getDisp_ecn() & SIXLOWPAN_SFR_DISP_MASK) == SIXLOWPAN_SFR_ACK_DISP);
	}
	/* NET_SIXLOWPAN_SFR_H */
	/** @} */
	public static void _updatestate(Object[] state) {
		int last = 1;
		byte zf = 0;
		for (int i = 0;
		 i < 20; i++) {
			int v;
			byte t;
			v = (int)state[i] + (int)ModernizedCProgram.digestdata[i] + /* add two bytes */last;
			t = (byte)(v & /* result is lower 8 bits */-1024);
			zf = zf | (state[i] != /* check for state collision */t);
			state[i] = /* store result, */t;
			last = (v >> /* high 8 bits are carry, store for next iteration */8);
		}
		if (!/* make sure at least one bit changes! */zf) {
			state[0]++;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_update(ModernizedCProgram.ctx, (Object)state, /*Error: sizeof expression not supported yet*/);
	}
	/* TODO: use with global API */
	public static void _random_bytes(Object bytes, Object size) {
		uint32_t loc = 0;
		while (loc < size) {
			int copy;
			if ((size - loc) < ((true) - /* find min between remaining out bytes and so far unused seed bytes */ModernizedCProgram.datapos)) {
				copy = size - loc;
			} else {
					copy = (true) - /* in first iteration this will be 0 */ModernizedCProgram.datapos;
			} 
			if (copy > 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(bytes + loc, ModernizedCProgram.digestdata + ModernizedCProgram.datapos, /* directly copy data to out buffer */copy);
				ModernizedCProgram.datapos += copy;
				loc += copy/* no out data ready, (re)fill internal buffer */;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_init(/* reset SHA1 internal state */ModernizedCProgram.ctx);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_update(ModernizedCProgram.ctx, (Object)ModernizedCProgram.prng_state, /*Error: sizeof expression not supported yet*/);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_final(ModernizedCProgram.ctx, /* get the digest */ModernizedCProgram.digestdata);
					ModernizedCProgram._updatestate(/* update PRNG state for next round */ModernizedCProgram.prng_state);
					ModernizedCProgram.datapos = /* reset counter for buffer position */0;
			} 
		}
	}
	public static void random_init_by_array(Object[] init_key, int key_length) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_init(ModernizedCProgram.ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_update(ModernizedCProgram.ctx, (Object)init_key, key_length);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_final(ModernizedCProgram.ctx, ModernizedCProgram.digestdata);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.prng_state, ModernizedCProgram.ctx.getState(), /* copy seeded SHA1 state to PRNG state */20);
		ModernizedCProgram.random_init(-1024);
		int i = 1;
		int j = 0;
		for (int k = 624 > key_length ? 624 : key_length;
		 k; --k) {
			ModernizedCProgram.mt[i] = (ModernizedCProgram.mt[i] ^ ((ModernizedCProgram.mt[i - 1] ^ (ModernizedCProgram.mt[i - 1] >> 30)) * -1024)) + init_key[j] + /* non linear */j;
			++i;
			++j;
			if (i >= 624) {
				ModernizedCProgram.mt[0] = ModernizedCProgram.mt[624 - 1];
				i = 1;
			} 
			if (j >= key_length) {
				j = 0;
			} 
		}
		for (int k = 624 - 1;
		 k; k--) {
			ModernizedCProgram.mt[i] = (ModernizedCProgram.mt[i] ^ ((ModernizedCProgram.mt[i - 1] ^ (ModernizedCProgram.mt[i - 1] >> 30)) * -1024)) - /* non linear */i;
			i++;
			if (i >= 624) {
				ModernizedCProgram.mt[0] = ModernizedCProgram.mt[624 - 1];
				i = 1;
			} 
		}
		ModernizedCProgram.mt[0] = /* MSB is 1; assuring non-zero initial array */-1024;
	}
	/**
	 * Copyright (C) 2017 Inria
	 *               2017 Freie Universität Berlin
	 *               2017 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *
	 * Code taken from Wikipedia (https://en.wikipedia.org/wiki/Xorshift)
	 */
	/**
	 * @ingroup sys_random
	 * @{
	 * @file
	 *
	 * @brief   Xorshift random number generator implementation
	 *
	 * @author Kaspar Schleiser <kaspar@schleiser.de>
	 * @}
	 */
	/* The state word must be initialized to non-zero */
	public static Object xorshift32(Object state) {
		uint32_t x = state;
		x ^=  x << 13;
		x ^=  x >> 17;
		x ^=  x << 5;
		state = x;
		return x;
	}
	/* The state array must be initialized to not be all zero */
	public static Object xorshift128(Object[] state) {
		uint32_t t = state[3];
		t ^=  t << 11;
		t ^=  t >> 8;
		state[3] = state[2];
		state[2] = state[1];
		state[1] = state[0];
		t ^=  state[0];
		t ^=  state[0] >> 19;
		state[0] = t;
		return t;
	}
	public static Object choose_backoff_period(int be, Object conf) {
		if (be < conf.getMin_be()) {
			be = conf.getMin_be();
		} 
		if (be > conf.getMax_be()) {
			be = conf.getMax_be();
		} 
		uint32_t max_backoff = ((1 << be) - 1) * CSMA_SENDER_BACKOFF_PERIOD_UNIT;
		uint32_t period = ModernizedCProgram.random_uint32() % max_backoff;
		if (period < CSMA_SENDER_BACKOFF_PERIOD_UNIT) {
			period = CSMA_SENDER_BACKOFF_PERIOD_UNIT;
		} 
		return period/**
		 * @brief Perform a CCA and send the given packet if medium is available
		 *
		 * @param[in] device    netdev device, needs to be already initialized
		 * @param[in] iolist    pointer to the data
		 *
		 * @return              the return value of device driver's
		 *                      netdev_driver_t::send() function if medium was
		 *                      available
		 * @return              -ECANCELED if an internal driver error occurred
		 * @return              -EBUSY if radio medium was not available
		 *                      to send the given data
		 */;
	}
	public static int send_if_cca(Object device, Object iolist) {
		 hwfeat = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* perform a CCA */"csma: Checking radio medium availability...\n");
		int res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(device, NETOPT_IS_CHANNEL_CLR, (Object)hwfeat, /*Error: Unsupported expression*/);
		if (res < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* normally impossible: we got a big internal problem! */"csma: !!! DEVICE DRIVER FAILURE! TRANSMISSION ABORTED!\n");
			return -ECANCELED;
		} 
		if (hwfeat == /* if medium is clear, send the packet and return */NETOPT_ENABLE) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("csma: Radio medium available: sending packet.\n");
			return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(device, iolist);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* if we arrive here, medium was not available for transmission */"csma: Radio medium busy.\n");
		return -16;
	}
	/*------------------------- "EXPORTED" FUNCTIONS -------------------------*/
	public static int csma_sender_csma_ca_send(Object dev, Object iolist, Object conf) {
		 hwfeat = new ();
		((dev) ? (Object)0 : /*Error: Function owner not recognized*/_assert("dev", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\csma_sender.c", 124));
		if (conf == ((Object)/* choose default configuration if none is given */0)) {
			conf = ModernizedCProgram.CSMA_SENDER_CONF_DEFAULT;
		} 
		int res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(/* Does the transceiver do automatic CSMA/CA when sending? */dev, NETOPT_CSMA, (Object)hwfeat, /*Error: Unsupported expression*/);
		boolean ok = false;
		switch (res) {
		case -ECANCELED:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("csma: !!! DEVICE DRIVER FAILURE! TRANSMISSION ABORTED!\n");
				return -/* internal driver error! */ECANCELED;
		case -19:
				return -/* invalid device pointer given */19;
		case -/* (normally impossible...*/EOVERFLOW:
		case -ENOTSUP/* device doesn't make auto-CSMA/CA */:
				break;
		default:
				ok = (hwfeat == NETOPT_ENABLE);
		}
		if (ok) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* device does CSMA/CA all by itself: let it do its job */"csma: Network device does hardware CSMA/CA\n");
			return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(dev, iolist);
		} 
		ModernizedCProgram.random_init(ModernizedCProgram._xtimer_now());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("csma: Starting software CSMA/CA....\n");
		int nb = 0;
		int be = conf.getMin_be();
		while (nb <= conf.getMax_be()) {
			uint32_t bp = ModernizedCProgram.choose_backoff_period(be, /* delay for an adequate random backoff period */conf);
			ModernizedCProgram.xtimer_usleep(bp);
			res = ModernizedCProgram.send_if_cca(dev, /* try to send after a CCA */iolist);
			if (res >= 0) {
				return /* TX done */res;
			}  else if (res != -16) {
				return /* something has gone wrong, return the error code */res;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* medium is busy: increment CSMA counters */"csma: Radio medium busy.\n");
			be++;
			if (be > conf.getMax_be()) {
				be = conf.getMax_be();
			} 
			nb/* ... and try again if we have no exceeded the retry limit */++;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* if we arrive here, medium was never available for transmission */"csma: Software CSMA/CA failure: medium never available.\n");
		return -16;
	}
	public static int csma_sender_cca_send(Object dev, Object iolist) {
		 hwfeat = new ();
		((dev) ? (Object)0 : /*Error: Function owner not recognized*/_assert("dev", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\csma_sender.c", 201));
		int res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(/* Does the transceiver do automatic CCA before sending? */dev, NETOPT_AUTOCCA, (Object)hwfeat, /*Error: Unsupported expression*/);
		boolean ok = false;
		switch (res) {
		case -ENOTSUP/* device doesn't make auto-CCA */:
				break;
		case -ECANCELED:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* internal driver error! */"csma: !!! DEVICE DRIVER FAILURE! TRANSMISSION ABORTED!\n");
				return -ECANCELED;
		case -19:
				return -/* invalid device pointer given */19;
		case -/* (normally impossible...*/EOVERFLOW:
		default:
				ok = (hwfeat == NETOPT_ENABLE);
		}
		if (ok) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* device does auto-CCA: let him do its job */"csma: Network device does auto-CCA checking.\n");
			return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(dev, iolist);
		} 
		res = ModernizedCProgram.send_if_cca(dev, /* if we arrive here, we must do CCA ourselves to see if radio medium
		       is clear before sending */iolist);
		if (res == -16) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("csma: Transmission cancelled!\n");
		} 
		return res;
	}
	/*
	 * Copyright (C) 2013  INRIA.
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Shell commands for the PS module
	 *
	 * @author      Oliver Hahm <oliver.hahm@inria.fr>
	 *
	 * @}
	 */
	public static int _ps_handler(int argc, Byte argv) {
		(Object)argc;
		(Object)argv;
		ModernizedCProgram.ps();
		return 0;
	}
	/*
	 * Copyright (C) 2019 Kaspar Schleiser <kaspar@schleiser.de>
	 *               2019 Inria
	 *               2019 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_suit_v4
	 * @{
	 *
	 * @file
	 * @brief       SUIT v4 policy checking code
	 *
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * @}
	 */
	public static int suit_v4_policy_check(Object manifest) {
		if (SUIT_DEFAULT_POLICY & ~(manifest.getValidated())) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("SUIT policy check failed!\n");
			return -1;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("SUIT policy check OK.\n");
				return 0;
		} 
	}
	/*
	 * Copyright (C) 2019 HAW Hamburg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 * @author  Jose I. Alamos <jose.alamos@haw-hamburg.de>
	 */
	public static int netif_register(Object netif) {
		if (netif == ((Object)0)) {
			return -22;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/list_add(ModernizedCProgram.netif_list, netif.getNode());
		return 0;
	}
	public static Object netif_iter(Object last) {
		if (last == ((Object)0)) {
			return ()ModernizedCProgram.netif_list.getNext();
		} 
		return ()last.getNode().getNext();
	}
	public static Object netif_get_by_name(Object name) {
		((name) ? (Object)0 : /*Error: Function owner not recognized*/_assert("name", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\netif.c", 45));
		 node = ModernizedCProgram.netif_list.getNext();
		byte[] tmp = new byte[NETIF_NAMELENMAX];
		while (node) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/netif_get_name(()node, tmp);
			if (/*Error: Function owner not recognized*/strncmp(name, tmp, NETIF_NAMELENMAX) == 0) {
				return ()node;
			} 
			node = node.getNext();
		}
		return ((Object)0/** @} */);
	}
	public static void nhdp_reset_addresses_tmp_usg(Object decr_usg) {
		nhdp_addr_t addr_elt = new nhdp_addr_t();
		nhdp_addr_t addr_tmp = new nhdp_addr_t();
		Object generatedIn_tmp_table = addr_elt.getIn_tmp_table();
		for ((addr_elt) = (ModernizedCProgram.nhdp_addr_db_head); (addr_elt) && (); (addr_elt) = addr_tmp) {
			addr_elt.setTmp_metric_val((false));
			if (generatedIn_tmp_table) {
				addr_elt.setIn_tmp_table((true));
				if (decr_usg) {
					addr_elt.nhdp_decrement_addr_usage();
				} 
			} 
		}
	}
	/** generates N words at one time */
	public static void generate_numbers() {
		if (ModernizedCProgram.mti == (624 + 1)) {
			ModernizedCProgram.random_init(/* if init_genrand() has not been called, a default initial seed is used */-1024);
		} 
		for (int k = 0;
		 k < 624; ++k) {
			uint32_t y = (ModernizedCProgram.mt[k] & -1024) | (ModernizedCProgram.mt[(k + 1) % 624] & -1024);
			ModernizedCProgram.mt[k] = ModernizedCProgram.mt[(k + 397) % 624] ^ (y >> 1);
			if (y & 1) {
				ModernizedCProgram.mt[k] ^=  -1024;
			} 
		}
		ModernizedCProgram.mti = 0;
	}
	/*
	 * Copyright (C) 2014  René Kijewski  <rene.kijewski@fu-berlin.de>
	 *
	 * This library is free software; you can redistribute it and/or
	 * modify it under the terms of the GNU Lesser General Public
	 * License as published by the Free Software Foundation; either
	 * version 2.1 of the License, or (at your option) any later version.
	 *
	 * This library is distributed in the hope that it will be useful,
	 * but WITHOUT ANY WARRANTY; without even the implied warranty of
	 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
	 * Lesser General Public License for more details.
	 *
	 * You should have received a copy of the GNU Lesser General Public
	 * License along with this library; if not, write to the Free Software
	 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
	 */
	/**
	 * @ingroup     pthread
	 * @{
	 *
	 * @file
	 * @brief       Implementation of a fair, POSIX conforming reader/writer lock (attribute set).
	 *
	 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
	 *
	 * @}
	 */
	public static int pthread_rwlockattr_init() {
		if (attr == ((Object)0)) {
			return 22;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(attr, 0, /*Error: sizeof expression not supported yet*/);
		return 0;
	}
	public static int pthread_rwlockattr_destroy() {
		if (attr == ((Object)0)) {
			return 22;
		} 
		(Object)attr;
		return 0;
	}
	/* Return current setting of process-shared attribute of ATTR in PSHARED.  */
	public static int pthread_rwlockattr_getpshared(Object attr, Integer pshared) {
		if (attr == ((Object)0) || pshared == ((Object)0)) {
			return 22;
		} 
		pshared = attr.getPshared();
		return 0;
	}
	public static int pthread_rwlockattr_setpshared(int pshared) {
		if (attr == ((Object)0) || (pshared != (false) && pshared != (true))) {
			return 22;
		} 
		this.setPshared(pshared);
		return 0;
	}
	/* $OpenBSD: xordi3.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Return a ^ b, in quad.
	 */
	public static Object __xordi3(Object a, Object b) {
		Object aa;
		Object bb;
		aa.setQ(a);
		bb.setQ(b);
		Object generatedUl = aa.getUl();
		generatedUl[0] ^=  generatedUl[0];
		generatedUl[1] ^=  generatedUl[1];
		Object generatedQ = aa.getQ();
		return generatedQ;
	}
	/*
	 * Copyright (C) 2017 INRIA
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     net_gnrc_gomach
	 * @{
	 *
	 * @file
	 * @brief       GoMacH's internal functions.
	 * @internal
	 * @author      Shuguo Zhuo  <shuguo.zhuo@inria.fr>
	 */
	/**
	 * @brief Flag to track if the transmission has finished.
	 */
	/**
	 * @brief Flag to track if a packet has been successfully received.
	 */
	/**
	 * @brief Flag to track if need to update GoMacH.
	 */
	/**
	 * @brief Flag to track if need to quit the current cycle in GoMacH.
	 */
	/**
	 * @brief Flag to track if CP period has ended in GoMacH.
	 */
	/**
	 * @brief Flag to track if vTDMA has ended in GoMacH.
	 */
	/**
	 * @brief Flag to track if the node has received unintended preamble.
	 */
	/**
	 * @brief Flag to track if need to quit the current cycle in GoMacH.
	 */
	/**
	 * @brief Flag to track if node's duty-cycle has started in GoMacH.
	 */
	/**
	 * @brief Flag to track if node need to backoff its phase in GoMacH.
	 */
	/**
	 * @brief Flag to track if beacon transmission fail in GoMacH.
	 */
	/**
	 * @brief Flag to track if node's packet buffer is full in GoMacH.
	 */
	/**
	 * @brief Flag to track if node has entered a new cycle in GoMacH.
	 */
	/**
	 * @brief Flag to track if node has got preamble-ACK in GoMacH.
	 */
	/**
	 * @brief Flag to track if node's radio is on public-channel-1.
	 */
	/**
	 * @brief Flag to track if node has reached maximum preamble interval.
	 */
	/**
	 * @brief Flag to track if node has turned on its radio.
	 */
	/**
	 * @brief Set the @ref GNRC_GOMACH_INFO_TX_FINISHED flag of the device.
	 *
	 * @param[in,out] netif    the network interface.
	 * @param[in] tx_finish    value for GoMacH's
	 *                         @ref GNRC_GOMACH_INFO_TX_FINISHED flag.
	 *
	 */
	public static void gnrc_gomach_set_tx_finish(Object netif, Object tx_finish) {
		if (tx_finish) {
			netif.getMac().getMac_info() |=  (true);
		} else {
				netif.getMac().getMac_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INFO_TX_FINISHED flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if TX has finished.
				 * @return             false if TX hasn't finished yet.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_tx_finish(Object netif) {
		return (netif.getMac().getMac_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INFO_PKT_RECEIVED flag of the device.
		 *
		 * @param[in,out] netif    the network interface.
		 * @param[in] received     value for GoMacH's
		 *                         @ref GNRC_GOMACH_INFO_PKT_RECEIVED flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_pkt_received(Object netif, Object received) {
		if (received) {
			netif.getMac().getMac_info() |=  (true);
		} else {
				netif.getMac().getMac_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INFO_PKT_RECEIVED flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if radio has successfully received a packet.
				 * @return             false if radio hasn't received a packet yet.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_pkt_received(Object netif) {
		return (netif.getMac().getMac_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_QUIT_CYCLE flag of the device.
		 *
		 * @param[in,out] netif    the network interface.
		 * @param[in] quit         value for GoMacH's
		 *                         @ref GNRC_GOMACH_INTERNAL_INFO_QUIT_CYCLE flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_quit_cycle(Object netif, Object quit) {
		if (quit) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_QUIT_CYCLE flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if need to quit cycle.
				 * @return             false if no need to quit cycle.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_quit_cycle(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_GOT_PREAMBLE flag of the device.
		 *
		 * @param[in,out] netif     the network interface.
		 * @param[in] got_preamble  value for GoMacH's
		 *                          @ref GNRC_GOMACH_INTERNAL_INFO_GOT_PREAMBLE flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_got_preamble(Object netif, Object got_preamble) {
		if (got_preamble) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_GOT_PREAMBLE flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if get preamble packet.
				 * @return             false if not get preamble packet yet.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_got_preamble(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_CP_END flag of the device.
		 *
		 * @param[in,out] netif    the network interface.
		 * @param[in] cp_end       value for GoMacH's
		 *                         @ref GNRC_GOMACH_INTERNAL_INFO_CP_END flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_cp_end(Object netif, Object cp_end) {
		if (cp_end) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_CP_END flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if cp has ended.
				 * @return             false if cp hasn't ended yet.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_cp_end(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_VTDMA_END flag of the device.
		 *
		 * @param[in,out] netif    the network interface.
		 * @param[in] vtdma_end    value for GoMacH's
		 *                         @ref GNRC_GOMACH_INTERNAL_INFO_VTDMA_END flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_vTDMA_end(Object netif, Object vtdma_end) {
		if (vtdma_end) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_VTDMA_END flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if vTDMA has ended.
				 * @return             false if vTDMA hasn't ended yet.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_vTDMA_end(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_UNINTD_PREAMBLE flag of the device.
		 *
		 * @param[in,out] netif        the network interface.
		 * @param[in] uintd_preamble   value for GoMacH's
		 *                             @ref GNRC_GOMACH_INTERNAL_INFO_UNINTD_PREAMBLE flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_unintd_preamble(Object netif, Object uintd_preamble) {
		if (uintd_preamble) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_UNINTD_PREAMBLE flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if has received unintended-preamble.
				 * @return             false if hasn't received unintended-preamble yet.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_unintd_preamble(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_ND_UPDATE flag of the device.
		 *
		 * @param[in,out] netif  the network interface.
		 * @param[in] update     value for GoMacH's
		 *                       @ref GNRC_GOMACH_INTERNAL_INFO_ND_UPDATE flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_update(Object netif, Object update) {
		if (update) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_ND_UPDATE flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if need update GoMacH.
				 * @return             false if no need to update GoMacH.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_update(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_DUTY_CYCLE_START flag of the device.
		 *
		 * @param[in,out] netif  the network interface.
		 * @param[in] start      value for GoMacH's
		 *                       @ref GNRC_GOMACH_INTERNAL_INFO_DUTY_CYCLE_START flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_duty_cycle_start(Object netif, Object start) {
		if (start) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_DUTY_CYCLE_START flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if duty-cycle has started.
				 * @return             false if duty-cycle hasn't started yet.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_duty_cycle_start(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_PHASE_BACKOFF flag of the device.
		 *
		 * @param[in,out] netif   the network interface.
		 * @param[in] backoff     value for GoMacH's
		 *                        @ref GNRC_GOMACH_INTERNAL_INFO_PHASE_BACKOFF flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_phase_backoff(Object netif, Object backoff) {
		if (backoff) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_PHASE_BACKOFF flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if need to run phase backoff.
				 * @return             false if no need to run phase backoff.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_phase_backoff(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_BEACON_FAIL flag of the device.
		 *
		 * @param[in,out] netif  the network interface.
		 * @param[in] fail       value for GoMacH's
		 *                       @ref GNRC_GOMACH_INTERNAL_INFO_BEACON_FAIL flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_beacon_fail(Object netif, Object fail) {
		if (fail) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_BEACON_FAIL flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if send beacon fail.
				 * @return             false upon beacon transmission success.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_beacon_fail(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_BUFFER_FULL flag of the device.
		 *
		 * @param[in,out] netif  the network interface.
		 * @param[in] full       value for GoMacH's
		 *                       @ref GNRC_GOMACH_INTERNAL_INFO_BUFFER_FULL flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_buffer_full(Object netif, Object full) {
		if (full) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_BUFFER_FULL flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if node's packet buffer is full.
				 * @return             false if node's packet buffer is not full.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_buffer_full(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_ENTER_NEW_CYCLE flag of the device.
		 *
		 * @param[in,out] netif  the network interface.
		 * @param[in] enter      value for GoMacH's
		 *                       @ref GNRC_GOMACH_INTERNAL_INFO_ENTER_NEW_CYCLE flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_enter_new_cycle(Object netif, Object enter) {
		if (enter) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_ENTER_NEW_CYCLE flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if node has entered a new cycle.
				 * @return             false if node hasn't entered a new cycle yet.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_enter_new_cycle(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_GOT_PREAMBLEACK flag of the device.
		 *
		 * @param[in,out] netif  the network interface.
		 * @param[in] got        value for GoMacH's
		 *                       @ref GNRC_GOMACH_INTERNAL_INFO_GOT_PREAMBLEACK flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_got_preamble_ack(Object netif, Object got) {
		if (got) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_GOT_PREAMBLEACK flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if node has got preamble-ACK.
				 * @return             false if node hasn't got preamble-ACK yet.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_got_preamble_ack(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_ON_PUBCHAN_1 flag of the device.
		 *
		 * @param[in,out] netif      the network interface.
		 * @param[in] on_pubchan_1   value for GoMacH's
		 *                           @ref GNRC_GOMACH_INTERNAL_INFO_ON_PUBCHAN_1 flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_on_pubchan_1(Object netif, Object on_pubchan_1) {
		if (on_pubchan_1) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_ON_PUBCHAN_1 flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if node is on public channel 1.
				 * @return             false if node is not on public channel 1.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_on_pubchan_1(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Set the @ref GNRC_GOMACH_INTERNAL_INFO_MAX_PREAM_INTERV flag of the device.
		 *
		 * @param[in,out] netif  the network interface.
		 * @param[in] max        value for GoMacH's @ref
		 *                       GNRC_GOMACH_INTERNAL_INFO_MAX_PREAM_INTERV flag.
		 *
		 */));
	}
	public static void gnrc_gomach_set_max_pream_interv(Object netif, Object max) {
		if (max) {
			netif.getMac().getProt().getGomach().getGomach_info() |=  (true);
		} else {
				netif.getMac().getProt().getGomach().getGomach_info() &=  ~(true/**
				 * @brief Get the @ref GNRC_GOMACH_INTERNAL_INFO_MAX_PREAM_INTERV flag of the device.
				 *
				 * @param[in] netif    the network interface.
				 *
				 * @return             true if node has reached maximum preamble interval.
				 * @return             false if node hasn't reached maximum preamble interval yet.
				 */);
		} 
	}
	public static Object gnrc_gomach_get_max_pream_interv(Object netif) {
		return (netif.getMac().getProt().getGomach().getGomach_info() & (true/**
		 * @brief Get device's current phase.
		 *
		 * @param[in] netif    the network interface.
		 *
		 * @return             device's current phase.
		 */));
	}
	public static void gnrc_gomach_set_autoack(Object netif, Object autoack) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(netif != NULL);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(netif.getDev(), NETOPT_AUTOACK, autoack, /*Error: sizeof expression not supported yet*/);
	}
	public static void gnrc_gomach_set_ack_req(Object netif, Object ack_req) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(netif != NULL);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(netif.getDev(), NETOPT_ACK_REQ, ack_req, /*Error: sizeof expression not supported yet*/);
	}
	public static Object gnrc_gomach_get_netdev_state(Object netif) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(netif != NULL);
		 state = new ();
		if (0 < /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(netif.getDev(), NETOPT_STATE, state, /*Error: sizeof expression not supported yet*/)) {
			return state;
		} 
		return -ENOSYS/**
		 * @brief Turn the radio to a specific channel.
		 *
		 * @param[in,out] netif    the network interface.
		 * @param[in] channel_num  targeted channel number to turn to.
		 *
		 */;
	}
	public static void gnrc_gomach_turn_channel(Object netif, Object channel_num) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(netif != NULL);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(netif.getDev(), NETOPT_CHANNEL, channel_num, /*Error: sizeof expression not supported yet*/);
	}
	public static int _hello_handler(Object manifest, int key, Object it) {
		(Object)manifest;
		(Object)key;
		if (/*Error: Function owner not recognized*/nanocbor_get_type(it) == NANOCBOR_TYPE_TSTR) {
			 len = 32;
			byte[] buf = new byte[32];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_get_tstr(it, ((uint8_t)buf), len);
			return SUIT_OK;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("_hello_handler(): unexpected value type: %u\n", /*Error: Function owner not recognized*/nanocbor_get_type(it));
				return -1;
		} 
	}
	public static int _validate_uuid(Object manifest, Object it, Object uuid) {
		(Object)manifest;
		uint8_t uuid_manifest_ptr = new uint8_t();
		 len = /*Error: Unsupported expression*/;
		byte[] uuid_str = new byte[UUID_STR_LEN + 1];
		byte[] uuid_str2 = new byte[UUID_STR_LEN + 1];
		if (ModernizedCProgram.suit_cbor_get_string(it, uuid_manifest_ptr, len) != SUIT_OK) {
			return SUIT_ERR_INVALID_MANIFEST;
		} 
		ModernizedCProgram.uuid_to_string(()uuid_manifest_ptr, uuid_str);
		ModernizedCProgram.uuid_to_string(uuid, uuid_str2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("Comparing %s to %s from manifest\n", uuid_str2, uuid_str);
		return ModernizedCProgram.uuid_equal(uuid, ()uuid_manifest_ptr) ? 0 : -1;
	}
	public static int _cond_vendor_handler(Object manifest, int key, Object it) {
		(Object)key;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("validating vendor ID\n");
		int rc = ModernizedCProgram._validate_uuid(manifest, it, ModernizedCProgram.suit_get_vendor_id());
		if (rc == SUIT_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("validating vendor ID: OK\n");
			manifest.getValidated() |=  SUIT_VALIDATED_VENDOR;
		} 
		return rc;
	}
	public static int _cond_class_handler(Object manifest, int key, Object it) {
		(Object)key;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("validating class id\n");
		int rc = ModernizedCProgram._validate_uuid(manifest, it, ModernizedCProgram.suit_get_class_id());
		if (rc == SUIT_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("validating class id: OK\n");
			manifest.getValidated() |=  SUIT_VALIDATED_CLASS;
		} 
		return rc;
	}
	public static int _cond_comp_offset(Object manifest, int key, Object it) {
		(Object)manifest;
		(Object)key;
		uint32_t offset = new uint32_t();
		ModernizedCProgram.suit_cbor_get_uint32(it, offset);
		uint32_t other_offset = (uint32_t)ModernizedCProgram.riotboot_slot_get_hdr(ModernizedCProgram.riotboot_slot_other()) - CPU_FLASH_BASE;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("Comparing manifest offset %u with other slot offset %u\n", (int)offset, (int)other_offset);
		return other_offset == offset ? 0 : -1;
	}
	public static int _dtv_set_comp_idx(Object manifest, int key, Object it) {
		(Object)key;
		if (/*Error: Function owner not recognized*/nanocbor_get_type(it) == NANOCBOR_TYPE_FLOAT) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("_dtv_set_comp_idx() ignoring boolean and floats\n)");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_skip(it);
			return 0;
		} 
		int res = ModernizedCProgram.suit_cbor_get_int32(it, manifest.getComponent_current());
		if (!res) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("Setting component index to %d\n", (int)manifest.getComponent_current());
		} 
		return res;
	}
	public static int _dtv_run_seq_cond(Object manifest, int key, Object it) {
		(Object)key;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("Starting conditional sequence handler\n");
		ModernizedCProgram._handle_command_sequence(manifest, it, ModernizedCProgram._common_sequence_handler);
		return 0;
	}
	public static int _param_get_uri_list(Object manifest, Object it) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("got url list\n");
		manifest.getComponents()[manifest.getComponent_current()].setUrl(it);
		return 0;
	}
	public static int _param_get_digest(Object manifest, Object it) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("got digest\n");
		manifest.getComponents()[manifest.getComponent_current()].setDigest(it);
		return 0;
	}
	public static int _param_get_img_size(Object manifest, Object it) {
		int res = ModernizedCProgram.suit_cbor_get_uint32(it, manifest.getComponents()[0].getSize());
		if (res) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("error getting image size\n");
			return res;
		} 
		return res;
	}
	public static int _dtv_set_param(Object manifest, int key, Object it) {
		(Object)key/* `it` points to the entry of the map containing the type and value */;
		 map = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_enter_map(it, map);
		while (!/*Error: Function owner not recognized*/nanocbor_at_end(map/* map points to the key of the param */)) {
			int32_t param_key = new int32_t();
			ModernizedCProgram.suit_cbor_get_int32(map, param_key);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("Setting component index to %i\n", manifest.getComponent_current());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("param_key=%i\n", param_key);
			int res;
			switch (param_key) {
			case /* SUIT DIGEST */11:
					res = ModernizedCProgram._param_get_digest(manifest, map);
					break;
			case /* SUIT URI LIST */6:
					res = ModernizedCProgram._param_get_uri_list(manifest, map);
					break;
			case /* SUIT IMAGE SIZE */12:
					res = ModernizedCProgram._param_get_img_size(manifest, map);
					break;
			default:
					res = -1;
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_skip(map);
			if (res) {
				return res;
			} 
		}
		return SUIT_OK;
	}
	public static int _dtv_fetch(Object manifest, int key, Object _it) {
		(Object)key;
		(Object)_it;
		(Object)manifest;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("_dtv_fetch() key=%i\n", key);
		uint8_t url = new uint8_t();
		 url_len = new ();
		/* TODO: there must be a simpler way *//* the url list is a binary sequence containing a cbor array of
		         * (priority, url) tuples (represented as array with length two)
		         * */
		{ 
			 it = new ();
			int err = ModernizedCProgram.suit_cbor_subparse(manifest.getComponents()[0].getUrl(), /* open sequence with cbor parser */it);
			if (err < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("subparse failed\n)");
				return err;
			} 
			if (/*Error: Function owner not recognized*/nanocbor_get_type(it) != /* confirm the document contains an array */NANOCBOR_TYPE_ARR) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("url list no array\n)");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("type: %u\n", /*Error: Function owner not recognized*/nanocbor_get_type(it));
			} 
			 url_it = new ();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_enter_array(it, url_it);
			if (/*Error: Function owner not recognized*/nanocbor_get_type(url_it) != NANOCBOR_TYPE_ARR) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("url entry no array\n)");
			} 
			 url_value_it = new ();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_enter_array(url_it, url_value_it);
			if (/*Error: Function owner not recognized*/nanocbor_get_type(url_value_it) != /* check that first array entry is an int (the priotity of the url) */NANOCBOR_TYPE_UINT) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("expected URL priority (int), got %d\n", /*Error: Function owner not recognized*/nanocbor_get_type(url_value_it));
				return -1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_skip(/* skip URL priority (currently unused) */url_value_it);
			int res = ModernizedCProgram.suit_cbor_get_string(url_value_it, url, url_len);
			if (res) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("error parsing URL\n)");
				return -1;
			} 
			if (url_len >= manifest.getUrlbuf_len()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("url too large: %u>%u\n)", (int)url_len, (int)manifest.getUrlbuf_len());
				return -1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(manifest.getUrlbuf(), url, url_len);
			manifest.getUrlbuf()[url_len] = (byte)'\0';
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_leave_container(url_it, url_value_it);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_leave_container(it, url_it);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("_dtv_fetch() fetching \"%s\" (url_len=%u)\n", manifest.getUrlbuf(), (int)url_len);
		int target_slot = ModernizedCProgram.riotboot_slot_other();
		manifest.getWriter().riotboot_flashwrite_init(target_slot);
		int res = ModernizedCProgram.suit_coap_get_blockwise_url(manifest.getUrlbuf(), COAP_BLOCKSIZE_64, ModernizedCProgram.suit_flashwrite_helper, manifest.getWriter());
		if (res) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("image download failed\n)");
			return res;
		} 
		uint8_t digest = new uint8_t();
		 digest_len = new ();
		res = ModernizedCProgram.suit_cbor_get_string(manifest.getComponents()[0].getDigest(), digest, digest_len);
		if (res) {
			return res/* "digest" points to a 36 byte string that includes the digest type.
			     * riotboot_flashwrite_verify_sha256() is only interested in the 32b digest,
			     * so shift the pointer accordingly.
			     */;
		} 
		res = ModernizedCProgram.riotboot_flashwrite_verify_sha256(digest + 4, manifest.getComponents()[0].getSize(), target_slot);
		if (res) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("image verification failed\n");
			return res;
		} 
		manifest.getState() |=  SUIT_MANIFEST_HAVE_IMAGE;
		return SUIT_OK;
	}
	public static int _version_handler(Object manifest, int key, Object it) {
		(Object)manifest;
		(Object)key;
		int32_t version = -/* Validate manifest version */1;
		if ((/*Error: Function owner not recognized*/nanocbor_get_type(it) == NANOCBOR_TYPE_UINT) && (/*Error: Function owner not recognized*/nanocbor_get_int32(it, version) >= 0)) {
			if (version == SUIT_VERSION) {
				manifest.getValidated() |=  SUIT_VALIDATED_VERSION;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit: validated manifest version\n)");
				return 0;
			} else {
					return -1;
			} 
		} 
		return -1;
		(Object)context;
		return /*Error: Function owner not recognized*/coap_reply_simple(pkt, COAP_CODE_205, buf, len, COAP_FORMAT_TEXT, (uint8_t)"NONE", 4);
	}
	public static int _seq_no_handler(Object manifest, int key, Object it) {
		(Object)manifest;
		(Object)key;
		(Object)it;
		int32_t seq_nr = new int32_t();
		if ((/*Error: Function owner not recognized*/nanocbor_get_type(it) == NANOCBOR_TYPE_UINT)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_get_int32(it, seq_nr);
			 hdr = ModernizedCProgram.riotboot_slot_get_hdr(ModernizedCProgram.riotboot_slot_current());
			if (seq_nr <= (int32_t)hdr.getVersion()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("%d <= %d\n", seq_nr, hdr.getVersion());
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("seq_nr <= running image\n)");
				return -1;
			} 
			hdr = ModernizedCProgram.riotboot_slot_get_hdr(ModernizedCProgram.riotboot_slot_other());
			if (ModernizedCProgram.riotboot_hdr_validate(hdr) == 0) {
				if (seq_nr <= (int32_t)hdr.getVersion()) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("%u <= %u\n", seq_nr, hdr.getVersion());
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("seq_nr <= other image\n)");
					return -1;
				} 
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit: validated sequence number\n)");
			manifest.getValidated() |=  SUIT_VALIDATED_SEQ_NR;
			return 0;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("Unable to get sequence number\n");
		return -1;
	}
	public static int _dependencies_handler(Object manifest, int key, Object it) {
		(Object)manifest;
		(Object)key;
		(Object)it;
		return /* No dependency support */0;
	}
	public static int _component_handler(Object manifest, int key, Object it) {
		(Object)manifest;
		(Object)key;
		 arr = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("storing components\n)");
		if (/*Error: Function owner not recognized*/nanocbor_get_type(it) != NANOCBOR_TYPE_ARR) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("components field not an array\n");
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_enter_array(it, arr);
		int n = 0;
		while (!/*Error: Function owner not recognized*/nanocbor_at_end(arr)) {
			 map = new ();
			 key = new ();
			 value = new ();
			if (n < SUIT_V4_COMPONENT_MAX) {
				manifest.getComponents_len() += 1;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("too many components\n)");
					return SUIT_ERR_INVALID_MANIFEST;
			} 
			ModernizedCProgram.suit_cbor_map_iterate_init(arr, map);
			 current = manifest.getComponents()[n];
			while (ModernizedCProgram.suit_cbor_map_iterate(map, key, value/* handle key, value */)) {
				int32_t integer_key = new int32_t();
				if (ModernizedCProgram.suit_cbor_get_int32(key, integer_key)) {
					return SUIT_ERR_INVALID_MANIFEST;
				} 
				switch (integer_key) {
				case SUIT_COMPONENT_DIGEST:
						current.setDigest(value);
						break;
				case SUIT_COMPONENT_SIZE:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("skipping SUIT_COMPONENT_SIZE");
						break;
				case SUIT_COMPONENT_IDENTIFIER:
						current.setIdentifier(value);
						break;
				default:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("ignoring unexpected component data (nr. %i)\n", integer_key);
				}
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("component %u parsed\n", n);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_leave_container(arr, map);
			n++;
		}
		manifest.getState() |=  SUIT_MANIFEST_HAVE_COMPONENTS;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_leave_container(it, arr);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("storing components done\n)");
		return 0;
	}
	public static Object _suit_manifest_get_handler(int key, Object[] handlers, Object len) {
		if (key < 0 || ()key >= len) {
			return NULL;
		} 
		return handlers[key];
		if (key < 0 || (size_t)key >= len) {
			return ((Object)0);
		} 
		return handlers[key];
	}
	public static Object suit_manifest_get_manifest_handler(int key) {
		return ModernizedCProgram._suit_manifest_get_handler(key, ModernizedCProgram.global_handlers, ModernizedCProgram.global_handlers_len);
	}
	public static int _common_sequence_handler(Object manifest, int key, Object it) {
		 handler = ModernizedCProgram._suit_manifest_get_handler(key, ModernizedCProgram._sequence_handlers, ModernizedCProgram._sequence_handlers_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("Handling handler with key %d at %p\n", key, handler);
		if (handler) {
			return /*Error: Function owner not recognized*/handler(manifest, key, it);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("Sequence handler not implemented, ID: %d\n", key);
				return -1;
		} 
	}
	public static int _common_handler(Object manifest, int key, Object it) {
		(Object)key;
		return ModernizedCProgram._handle_command_sequence(manifest, it, ModernizedCProgram._common_sequence_handler);
	}
	/*
	 * Copyright (C) 2019 Koen Zandberg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_suit_v4
	 * @{
	 *
	 * @file
	 * @brief       SUIT v4
	 *
	 * @author      Koen Zandberg <koen@bergzand.net>
	 *
	 * @}
	 */
	public static int _handle_command_sequence(Object manifest, Object bseq, Object handler) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("Handling command sequence\n");
		 it = new ();
		 arr = new ();
		int err = ModernizedCProgram.suit_cbor_subparse(bseq, it);
		if (err < 0) {
			return err;
		} 
		if (/*Error: Function owner not recognized*/nanocbor_get_type(it) != NANOCBOR_TYPE_ARR) {
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_enter_array(it, arr);
		while (!/*Error: Function owner not recognized*/nanocbor_at_end(arr)) {
			 map = new ();
			if (/*Error: Function owner not recognized*/nanocbor_get_type(arr) != NANOCBOR_TYPE_MAP) {
				return SUIT_ERR_INVALID_MANIFEST;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_enter_map(arr, map);
			int32_t integer_key = new int32_t();
			if (ModernizedCProgram.suit_cbor_get_int32(map, integer_key)) {
				return SUIT_ERR_INVALID_MANIFEST;
			} 
			int res = /*Error: Function owner not recognized*/handler(manifest, integer_key, map);
			if (res < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("Sequence handler error\n");
				return res;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_leave_container(arr, map);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_leave_container(it, arr);
		return 0;
	}
	/*
	 * Copyright (C) 2017 TriaGnoSys GmbH
	 *               2013 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @defgroup    posix_semaphore POSIX semaphores
	 * @ingroup     posix
	 * @{
	 * @file
	 * @brief   Semaphores
	 * @see     <a href="http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/semaphore.h.html">
	 *              The Open Group Base Specifications Issue 7, <semaphore.h>
	 *          </a>
	 * @author  Christian Mehlis <mehlis@inf.fu-berlin.de>
	 * @author  Martine Lenders <mlenders@inf.fu-berlin.de>
	 * @author  René Kijewski <kijewski@inf.fu-berlin.de>
	 * @author  Víctor Ariño <victor.arino@zii.aero>
	 */
	/**
	 * @brief POSIX-specific semaphore type
	 */
	/**
	 * @brief Value returned if `sem_open' failed.
	 */
	/**
	 * @brief Initialize an unnamed semaphore.
	 *
	 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/sem_init.html">
	 *          The Open Group Base Specifications Issue 7, sem_init()
	 *      </a>
	 *
	 * The sem_init() function shall initialize the unnamed semaphore referred to by @p sem. The value
	 * of the initialized semaphore shall be @p value. Following a successful call to sem_init(),
	 * the semaphore may be used in subsequent calls to sem_wait(), sem_timedwait(),
	 * sem_trywait(), sem_post(), and sem_destroy(). This semaphore shall remain usable until the
	 * semaphore is destroyed.
	 *
	 * @param[out] sem      Semaphore to initialize.
	 * @param[in] pshared   **(unused, since RIOT only has threads)**
	 *                      Semaphore is shared between processes not threads.
	 * @param[in] value     Value to set.
	 *
	 * @return  0 on success.
	 * @return  -1, on error and errno set to indicate the error.
	 */
	public static int sem_init(Object sem, int pshared, int value) {
		(sema_t)sem.sema_create(value);
		(Object)pshared;
		return 0/**
		 * @brief destroy an unnamed semaphore
		 *
		 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/sem_destroy.html">
		 *          The Open Group Base Specifications Issue 7, sem_destroy()
		 *      </a>
		 *
		 * The sem_destroy() function shall destroy the unnamed semaphore indicated by @p sem. Only a
		 * semaphore that was created using sem_init() may be destroyed using sem_destroy(); the effect of
		 * calling sem_destroy() with a named semaphore is undefined. The effect of subsequent use of the
		 * semaphore @p sem is undefined until sem is reinitialized by another call to sem_init().
		 *
		 * It is safe to destroy an initialized semaphore upon which no threads are currently blocked.
		 * The effect of destroying a semaphore upon which other threads are currently blocked is
		 * undefined.
		 *
		 * @param sem   A semaphore.
		 *
		 * @return  0 on success.
		 * @return  -1, on error and errno set to indicate the error.
		 */;
	}
	public static int sem_destroy(Object sem) {
		(sema_t)sem.sema_destroy();
		return 0/**
		 * @brief Unlock a semaphore.
		 *
		 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/sem_post.html">
		 *          The Open Group Base Specifications Issue 7, sem_post()
		 *      </a>
		 *
		 * The sem_post() function shall unlock the semaphore referenced by @p sem by performing a
		 * semaphore unlock operation on that semaphore.
		 *
		 * If the semaphore value resulting from this operation is positive, then no threads were blocked
		 * waiting for the semaphore to become unlocked; the semaphore value is simply incremented.
		 *
		 * If the value of the semaphore resulting from this operation is zero, then one of the threads
		 * blocked waiting for the semaphore shall be allowed to return successfully from its call to
		 * sem_wait().
		 *
		 * @param sem   A semaphore
		 *
		 * @return  0 on success.
		 * @return  -1, on error and errno set to indicate the error.
		 */;
	}
	public static int sem_post(Object sem) {
		int res = (sema_t)sem.sema_post();
		if (res < 0) {
			(/*Error: Function owner not recognized*/_errno()) = -res;
			return -1;
		} 
		return 0/**
		 * @brief Lock a semaphore.
		 *
		 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/sem_wait.html">
		 *          The Open Group Base Specifications Issue 7, sem_wait()
		 *      </a>
		 *
		 * The sem_wait() function shall lock the semaphore referenced by @p sem by performing a semaphore
		 * lock operation on that semaphore. If the semaphore value is currently zero, then the calling
		 * thread shall not return from the call to sem_wait() until it either locks the semaphore or the
		 * call is interrupted by a signal.
		 *
		 * @param sem   A semaphore.
		 *
		 * @return  0 on success.
		 * @return  -1, on error and errno set to indicate the error.
		 */;
	}
	public static int sem_wait(Object sem) {
		int res = (sema_t)sem.sema_wait();
		if (res < 0) {
			(/*Error: Function owner not recognized*/_errno()) = -res;
			return -1;
		} 
		return 0/**
		 * @brief Open a named semaphore @p name with open flags @p oflag.
		 *
		 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/sem_open.html">
		 *          The Open Group Base Specifications Issue 7, sem_open()
		 *      </a>
		 *
		 * @todo  named semaphore are currently not supported
		 *
		 * @param[in] name  Name to set.
		 * @param[in] oflag Flags to set.
		 *
		 * @return  Always @ref SEM_FAILED, since it is not implemented currently.
		 */;
	}
	public static Object sem_open(Object name, int oflag) {
		(Object)name;
		(Object)oflag;
		(/*Error: Function owner not recognized*/_errno()) = 12;
		return ((sem_t)0/**
		 * @brief Close descriptor for named semaphore @p sem.
		 *
		 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/sem_close.html">
		 *          The Open Group Base Specifications Issue 7, sem_close()
		 *      </a>
		 *
		 * @todo  named semaphore are currently not supported
		 *
		 * @param[in] sem   Semaphore to close.
		 *
		 * @return  Always -1, since it is not implemented currently.
		 */);
	}
	public static int sem_close(Object sem) {
		(Object)sem;
		(/*Error: Function owner not recognized*/_errno()) = 22;
		return -1/**
		 * @brief Remove named semaphore @p name.
		 *
		 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/sem_unlink.html">
		 *          The Open Group Base Specifications Issue 7, sem_unlink()
		 *      </a>
		 *
		 * @todo  named semaphore are currently not supported
		 *
		 * @param[in] name  Name to unlink.
		 *
		 * @return  Always -1, since it is not implemented currently.
		 */;
	}
	public static int sem_unlink(Object name) {
		(Object)name;
		(/*Error: Function owner not recognized*/_errno()) = 2;
		return -1/**
		 * @brief Similar to `sem_wait' but wait only until @p abstime.
		 *
		 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/sem_timedwait.html">
		 *          The Open Group Base Specifications Issue 7, sem_timedwait()
		 *      </a>
		 *
		 * The sem_timedwait() function shall lock the semaphore referenced by @p sem as in the sem_wait()
		 * function. However, if the semaphore cannot be locked without waiting for another process or
		 * thread to unlock the semaphore by performing a sem_post() function, this wait shall be
		 * terminated when the specified timeout expires.
		 *
		 * @param[in] sem       Semaphore to wait on.
		 * @param[in] abstime   Absolute time (that is when the clock on which temouts are based equals
		 *                      this value) the timeout for the wait shall expire. If the value specified
		 *                      has already passed the timeout expires immediately.
		 *
		 * @return  0 on success.
		 * @return  -1, on error and errno set to indicate the error.
		 */;
	}
	public static int sem_trywait(Object sem) {
		int res = (sema_t)sem.sema_try_wait();
		if (res < 0) {
			(/*Error: Function owner not recognized*/_errno()) = -res;
			return -1;
		} 
		return 0/**
		 * @brief Get current value of @p sem and store it in @p sval.
		 *
		 * @see <a href="http://pubs.opengroup.org/onlinepubs/9699919799/functions/sem_getvalue.html">
		 *          The Open Group Base Specifications Issue 7, sem_getvalue()
		 *      </a>
		 *
		 * @param[in] sem   Semaphore to get the value from.
		 * @param[out] sval Place where value goes to.
		 *
		 * @return  0 on success.
		 * @return  -1, on error and errno set to indicate the error.
		 */;
	}
	public static int sem_getvalue(Object sem, Integer sval) {
		if (sem != ((Object)0)) {
			sval = (int)sem.getValue();
			return 0;
		} 
		(/*Error: Function owner not recognized*/_errno()) = 22;
		return -1;
	}
	/* SEMAPHORE_H */
	/** @} */
	public static boolean usb_setup_is_read() {
		Object generatedType = this.getType();
		return generatedType & -1024;
	}
	/* USB_DESCRIPTOR_H */
	/** @} */
	/* $OpenBSD: negdi2.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Return -a (or, equivalently, 0 - a), in quad.  See subdi3.c.
	 */
	public static Object __negdi2(Object a) {
		Object aa;
		Object res;
		aa.setQ(a);
		Object generatedUl = res.getUl();
		generatedUl[(false)] = -generatedUl[(false)];
		generatedUl[(true)] = -generatedUl[(true)] - (generatedUl[(false)] > 0);
		Object generatedQ = res.getQ();
		return generatedQ;
	}
	/*
	 * Copyright (C) 2013  INRIA.
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Provides shell commands to access storage (like MMC)
	 *
	 * @author      Oliver Hahm <oliver.hahm@inria.fr>
	 *
	 * @}
	 */
	public static Object sector_read(byte[] read_buf, long sector, long length, long offset) {
		if (/*Error: Function owner not recognized*/mci_read(read_buf, sector, 1) == DISKIO_RES_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[disk] Read sector %lu (%lu):\n", sector, offset);
			for (long i = offset + 1;
			 i <= offset + length; i++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" %u", read_buf[i - 1]);
				if (!(i % 16)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
				} 
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
			return 1;
		} 
		return 0;
	}
	public static int _get_sectorsize(int argc, Byte argv) {
		(Object)argc;
		(Object)argv;
		int ssize;
		if (/*Error: Function owner not recognized*/mci_ioctl(GET_SECTOR_SIZE, ssize) == DISKIO_RES_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[disk] sector size is %u\n", ssize);
			return 0;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("[disk] Failed to fetch sector size. Card inserted?");
				return 1;
		} 
	}
	public static int _get_blocksize(int argc, Byte argv) {
		(Object)argc;
		(Object)argv;
		long bsize;
		if (/*Error: Function owner not recognized*/mci_ioctl(GET_BLOCK_SIZE, bsize) == DISKIO_RES_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[disk] block size is %lu\n", bsize);
			return 0;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("[disk] Failed to fetch block size. Card inserted?");
				return 1;
		} 
	}
	public static int _get_sectorcount(int argc, Byte argv) {
		(Object)argc;
		(Object)argv;
		long scount;
		if (/*Error: Function owner not recognized*/mci_ioctl(GET_SECTOR_COUNT, scount) == DISKIO_RES_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[disk] sector count is %lu\n", scount);
			return 0;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("[disk] Failed to fetch sector count. Card inserted?");
				return 1;
		} 
	}
	public static int _read_sector(int argc, byte[][] argv) {
		if (argc == 2) {
			long scount;
			int ssize;
			long sectornr = /*Error: Function owner not recognized*/atol(argv[1]);
			if ((/*Error: Function owner not recognized*/mci_ioctl(GET_SECTOR_COUNT, scount) == DISKIO_RES_OK) && (/*Error: Function owner not recognized*/mci_ioctl(GET_SECTOR_SIZE, ssize) == DISKIO_RES_OK)) {
				byte[] read_buf = new byte[ssize];
				if (ModernizedCProgram.sector_read(read_buf, sectornr, ssize, 0)) {
					return 0;
				} 
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[disk] Error while reading sector %lu\n", sectornr);
			return 1;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[disk] Usage:\n%s <SECTOR>\n", argv[0]);
				return 1;
		} 
	}
	public static int _read_bytes(int argc, byte[][] argv) {
		long sector = 1;
		long scount;
		long offset;
		int ssize;
		int length;
		if (argc != 3) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[disk] Usage:\n%s <OFFSET> <LENGTH>\n", argv[0]);
			return 1;
		} 
		offset = /*Error: Function owner not recognized*/atol(argv[1]);
		length = /*Error: Function owner not recognized*/atoi(argv[2]);
		if ((/*Error: Function owner not recognized*/mci_ioctl(GET_SECTOR_COUNT, scount) == DISKIO_RES_OK) && (/*Error: Function owner not recognized*/mci_ioctl(GET_SECTOR_SIZE, ssize) == /* get card info */DISKIO_RES_OK)) {
			sector = (offset / ssize) + /* calculate sector and offset position */1;
			offset = (offset % ssize);
			byte[] read_buf = new byte[((length / ssize) + 1) * /* preapre buffer (size must be a multiple of sector size) */512];
			if (length > (ssize - /* read from several sectors */offset)) {
				long j = /* buffer offset */0;
				int tmp = ssize - /* chunk from current sector */offset;
				while (length) {
					ModernizedCProgram.sector_read(read_buf + j, sector++, tmp, offset);
					length -= /* decrease length  and recalculate chunk */tmp;
					tmp = (length >= ssize) ? ssize : length;
				}
				return 0/* length > (ssize - offset) */;
			} else {
					if (ModernizedCProgram.sector_read(read_buf, sector, length, /* read only one sector */offset)) {
						return 0/* length < (ssize - offset) */;
					} 
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[disk] Error while reading sector %lu\n", /* ioctl */sector);
		return 1;
	}
	/*
	 * Copyright (C) 2013 Zakaria Kasmi <zkasmi@inf.fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Print the state of the heap
	 *
	 * @author      Zakaria Kasmi <zkasmi@inf.fu-berlin.de>
	 *
	 * @}
	 */
	public static int _heap_handler(int argc, Byte argv) {
		(Object)argc;
		(Object)argv;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("heap statistics are not supported for %s cpu\n", RIOT_CPU);
		return 1;
	}
	public static void shell_run_forever(Object commands, Byte line_buf, int len) {
		while (1) {
			ModernizedCProgram.shell_run_once(commands, line_buf, len/**
			 * @brief           Back-porting alias for @ref shell_run_forever
			 *
			 * @param[in]       commands    ptr to array of command structs
			 * @param[in]       line_buf    Buffer that will be used for reading a line
			 * @param[in]       len         nr of bytes that fit in line_buf
			 */);
		}
	}
	public static void shell_run(Object commands, Byte line_buf, int len) {
		ModernizedCProgram.shell_run_forever(commands, line_buf, len);
	}
	/* SHELL_H */
	/** @} */
	public static int pthread_key_create(Object key, Object destructor) {
		key = ModernizedCProgram.malloc(/*Error: sizeof expression not supported yet*/);
		if (!key) {
			return 12;
		} 
		(key).setDestructor(destructor);
		return 0;
	}
	public static int pthread_key_delete(Object key) {
		if (!key) {
			return 22;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.tls_mutex);
		__pthread_tls_datum __pthread_tls_datum = new __pthread_tls_datum();
		__pthread_tls_datum generatedNext = specific.getNext();
		for (int i = 1;
		 i <= MAXTHREADS; ++i) {
			tls_data_t tls = __pthread_tls_datum.__pthread_get_tls_head(i);
			if (!tls) {
				continue;
			} 
			tls_data_t prev = new tls_data_t();
			tls_data_t specific = tls.find_specific(key, prev);
			if (specific) {
				if (prev) {
					prev.setNext(generatedNext);
				} else {
						tls = generatedNext;
				} 
				ModernizedCProgram.free(specific);
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.tls_mutex);
		return 0;
	}
	public static Object pthread_getspecific(Object key) {
		if (!key) {
			return ((Object)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.tls_mutex);
		__pthread_tls_datum __pthread_tls_datum = new __pthread_tls_datum();
		tls_data_t specific = __pthread_tls_datum.get_specific(key);
		Object generatedValue = specific.getValue();
		Object result = specific ? generatedValue : ((Object)0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.tls_mutex);
		return result;
	}
	public static int pthread_setspecific(Object key, Object value) {
		if (!key) {
			return 22;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.tls_mutex);
		__pthread_tls_datum __pthread_tls_datum = new __pthread_tls_datum();
		tls_data_t specific = __pthread_tls_datum.get_specific(key);
		if (specific) {
			specific.setValue((Object)value);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.tls_mutex);
		return specific ? 0 : 12;
	}
	public static void __pthread_keys_exit(int self_id) {
		__pthread_tls_datum __pthread_tls_datum = new __pthread_tls_datum();
		tls_data_t tls = __pthread_tls_datum.__pthread_get_tls_head(self_id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(/* Calling the dtor could cause another pthread_exit(), so we dehead and free defore calling it. */ModernizedCProgram.tls_mutex);
		__pthread_tls_datum generatedNext = specific.getNext();
		Object generatedValue = specific.getValue();
		Object generatedKey = specific.getKey();
		for (tls_data_t specific = new tls_data_t();
		 (specific = tls); /*Error: Unsupported expression*/) {
			tls = generatedNext;
			Object value = generatedValue;
			Object destructor = generatedKey.getDestructor();
			ModernizedCProgram.free(specific);
			if (value && destructor) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.tls_mutex);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/destructor(value);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.tls_mutex);
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.tls_mutex);
	}
	/*
	 * Copyright (C) 2015 Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @defgroup    net_sixlowpan   6LoWPAN
	 * @ingroup     net
	 * @brief       Provides 6LoWPAN dispatch types and helper functions
	 * @{
	 *
	 * @file
	 * @brief   6LoWPAN dispatch type and helper function definitons.
	 *
	 * @author  Martine Lenders <mlenders@inf.fu-berlin.de>
	 */
	/**
	 * @name    6LoWPAN dispatch definition
	 * @see     <a href="https://tools.ietf.org/html/rfc4944#section-5.1">
	 *              RFC 4944, section 5.1
	 *          </a>
	 * @{
	 */
	/**< uncompressed 6LoWPAN frame dispatch. */
	/**< mask for fragmentation
	                                                 *   dispatch */
	/**< dispatch for 1st fragment */
	/**< dispatch for subsequent
	                                                 *   fragments */
	/**< Maximum datagram size @f$ (2^{11} - 1) @f$ */
	/**
	 * @brief   Dispatch mask for LOWPAN_IPHC.
	 * @see     <a href="https://tools.ietf.org/html/rfc6282#section-3.1">
	 *              RFC 6282, section 3.1
	 *          </a>
	 */
	/**
	 * @brief   Dispatch for LOWPAN_IPHC.
	 * @see     <a href="https://tools.ietf.org/html/rfc6282#section-3.1">
	 *              RFC 6282, section 3.1
	 *          </a>
	 */
	/**
	 * @brief   Dispatch mask for 6LoWPAN selective fragment recovery
	 * @see [draft-ietf-6lo-fragment-recovery-05,
	 *      section 5](https://tools.ietf.org/html/draft-ietf-6lo-fragment-recovery-05#section-5)
	 */
	/**
	 * @brief   Dispatch for 6LoWPAN recoverable fragment
	 * @see [draft-ietf-6lo-fragment-recovery-05, section
	 *      5.1](https://tools.ietf.org/html/draft-ietf-6lo-fragment-recovery-05#section-5.1)
	 */
	/**
	 * @brief   Dispatch for 6LoWPAN recoverable fragment acknowledgment
	 * @see [draft-ietf-6lo-fragment-recovery-05, section
	 *      5.2](https://tools.ietf.org/html/draft-ietf-6lo-fragment-recovery-05#section-5.2)
	 */
	/**
	 * @brief   Checks if dispatch indicates that frame is not a 6LoWPAN (NALP) frame.
	 *
	 * @param[in] disp  The first byte of a frame.
	 *
	 * @return  true, if frame is a NALP.
	 * @return  false, if frame is not a NALP.
	 */
	public static boolean sixlowpan_nalp(Object disp) {
		return ((disp & -1024) == 0/** @} *//**
		 * @name    6LoWPAN fragmentation header definitions
		 * @{
		 */);
	}
	/**< mask for datagram size */
	/**
	 * @brief   General and 1st 6LoWPAN fragmentation header
	 *
	 * @note    The general 6LoWPAN fragmentation header refers to the first 4
	 *          bytes of a \c FRAG0 or \c FRAGN fragmentation header, which are
	 *          identical.
	 *
	 * @see <a href="https://tools.ietf.org/html/rfc4944#section-5.3">
	 *          RFC 4944, section 5.3
	 *      </a>
	 */
	public static boolean sixlowpan_frag_1_is() {
		Object generatedDisp_size = this.getDisp_size();
		return ((generatedDisp_size.getU8()[0] & (true)) == (true/**
		 * @brief   Checks if a given header is a subsequent 6LoWPAN fragment header
		 *
		 * @param[in] hdr   A 6LoWPAN fragmentation header.
		 *
		 * @return  true, if given fragment is a subsequent 6LoWPAN fragment.
		 * @return  false, if given fragment is not a subsequent 6LoWPAN fragment.
		 */));
	}
	public static boolean sixlowpan_frag_n_is() {
		Object generatedDisp_size = this.getDisp_size();
		return ((generatedDisp_size.getU8()[0] & (true)) == (true/**
		 * @brief   Checks if a given header is a 6LoWPAN fragment header.
		 *
		 * @param[in] hdr   A 6LoWPAN fragmentation header.
		 *
		 * @return  true, if given fragment is a 6LoWPAN fragment.
		 * @return  false, if given fragment is not a 6LoWPAN fragment.
		 */));
	}
	public static boolean sixlowpan_frag_is() {
		return hdr.sixlowpan_frag_1_is() || hdr/**
		 * @brief   Get datagram size from general 6LoWPAN fragment header
		 *
		 * @param[in] hdr   A general 6LoWPAN fragment header.
		 *
		 * @return  The datagram size for the 6LoWPAN fragment.
		 */.sixlowpan_frag_n_is();
	}
	public static Object sixlowpan_frag_datagram_size() {
		Object generatedDisp_size = this.getDisp_size();
		return (/*Error: Function owner not recognized*/byteorder_ntohs(generatedDisp_size) & (true/**
		 * @brief   Get datagram tag from general 6LoWPAN fragment header
		 *
		 * @param[in] hdr   A general 6LoWPAN fragment header.
		 *
		 * @return  The datagram tag for the 6LoWPAN fragment.
		 */));
	}
	public static Object sixlowpan_frag_datagram_tag() {
		Object generatedTag = this.getTag();
		return /*Error: Function owner not recognized*/byteorder_ntohs(generatedTag);
	}
	public static Object sixlowpan_frag_offset() {
		Object generatedOffset = this.getOffset();
		return (generatedOffset * -1024/** @} *//**
		 * @name    6LoWPAN IPHC dispatch definitions
		 * @{
		 */);
	}
	/* https://tools.ietf.org/html/rfc4944#section-5.3:
	     * datagram_offset:  This field is present only in the second and
	     *    subsequent link fragments and SHALL specify the offset, in
	     *    increments of 8 octets, of the fragment from the beginning of the
	     *    payload datagram. [...] */
	/**
	 * @brief   Flag for Traffic Class & Flow Label elision (part of first byte of
	 *          LOWPAN_IPHC).
	 * @see <a href="http://tools.ietf.org/html/rfc6282#section-3.1.1">
	 *          RFC 6282, section 3.1.1
	 *      </a>
	 */
	/**
	 * @brief   Flag for Next Header Compression (part of first byte of
	 *          LOWPAN_IPHC).
	 * @see <a href="http://tools.ietf.org/html/rfc6282#section-3.1.1">
	 *          RFC 6282, section 3.1.1
	 *      </a>
	 */
	/**
	 * @brief   Flag for Hop Limit elision (part of first byte of LOWPAN_IPHC).
	 * @see <a href="http://tools.ietf.org/html/rfc6282#section-3.1.1">
	 *          RFC 6282, section 3.1.1
	 *      </a>
	 */
	/**
	 * @brief   Flag for Context Identifier Extention (part of second byte
	 *          of LOWPAN_IPHC).
	 * @see <a href="http://tools.ietf.org/html/rfc6282#section-3.1.1">
	 *          RFC 6282, section 3.1.1
	 *      </a>
	 */
	/**
	 * @brief   Flag for Source Address Compression (part of second byte
	 *          of LOWPAN_IPHC).
	 * @see <a href="http://tools.ietf.org/html/rfc6282#section-3.1.1">
	 *          RFC 6282, section 3.1.1
	 *      </a>
	 */
	/**
	 * @brief   Bits for Source Address Mode (part of second byte of
	 *          LOWPAN_IPHC).
	 * @see <a href="http://tools.ietf.org/html/rfc6282#section-3.1.1">
	 *          RFC 6282, section 3.1.1
	 *      </a>
	 */
	/**
	 * @brief   Flag for Destination Address Compression (part of second
	 *          byte of LOWPAN_IPHC).
	 * @see <a href="http://tools.ietf.org/html/rfc6282#section-3.1.1">
	 *          RFC 6282, section 3.1.1
	 *      </a>
	 */
	/**
	 * @brief   Bits for Destination Address Mode (part of second byte of
	 *          LOWPAN_IPHC).
	 * @see <a href="http://tools.ietf.org/html/rfc6282#section-3.1.1">
	 *          RFC 6282, section 3.1.1
	 *      </a>
	 */
	/**
	 * @brief   Flag for Multicast Compression (part of second byte of
	 *          LOWPAN_IPHC).
	 * @see <a href="http://tools.ietf.org/html/rfc6282#section-3.1.1">
	 *          RFC 6282, section 3.1.1
	 *      </a>
	 */
	/**
	 * @brief   6LoWPAN IPHC header length
	 */
	/**
	 * @brief   6LoWPAN context idendifier extension header length
	 */
	/**
	 * @brief   Checks if datagram is an IPHC datagram.
	 *
	 * @param[in] data  Data of a datagram. Must not be NULL.
	 *
	 * @return  true, if datagram is an IPHC datagram.
	 * @return  false, if datagram is not an IPHC datagram.
	 */
	public static boolean sixlowpan_iphc_is(Object data) {
		return ((data & (true)) == (true/** @} *//**
		 * @brief   Prints 6LoWPAN dispatch to stdout.
		 *
		 * @param[in] data  A 6LoWPAN frame.
		 * @param[in] size  Size of @p data.
		 */));
	}
	/*---------------------------------------------------------------------------*
	 *                       Interface Information Base API                      *
	 *---------------------------------------------------------------------------*/
	public static int iib_register_if(Object pid) {
		iib_base_entry_t new_entry = (iib_base_entry_t)ModernizedCProgram.malloc(/*Error: Unsupported expression*/);
		if (!new_entry) {
			return -/* Insufficient memory */1;
		} 
		new_entry.setIf_pid(pid);
		new_entry.setLink_set_head(((Object)0));
		new_entry.setTwo_hop_set_head(((Object)0));
		do {
			(new_entry).setNext(ModernizedCProgram.iib_base_entry_head);
			ModernizedCProgram.iib_base_entry_head = new_entry;
		} while (0);
		return 0;
	}
	public static void iib_fill_wr_addresses(Object if_pid, Object wr) {
		iib_base_entry_t base_elt = new iib_base_entry_t();
		iib_link_set_entry_t ls_elt = new iib_link_set_entry_t();
		nhdp_addr_entry_t addr_elt = new nhdp_addr_entry_t();
		timex_t now = new timex_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_iib_access);
		now.xtimer_now_timex();
		/* Before adding addresses first update the status of all link tuples */now.iib_update_lt_status();
		Object generatedIf_pid = base_elt.getIf_pid();
		 generatedLast_status = ls_elt.getLast_status();
		nhdp_addr generatedAddress = addr_elt.getAddress();
		Object generatedIn_tmp_table = generatedAddress.getIn_tmp_table();
		Object generatedMetric_in = ls_elt.getMetric_in();
		Object generatedMetric_out = ls_elt.getMetric_out();
		nhdp_addr_entry generatedNext = (addr_elt).getNext();
		nhdp_addr_entry generatedAddress_list_head = ls_elt.getAddress_list_head();
		iib_link_set_entry generatedLink_set_head = base_elt.getLink_set_head();
		for (base_elt = ModernizedCProgram.iib_base_entry_head; base_elt; base_elt = generatedNext) {
			if (generatedIf_pid == if_pid) {
				for (ls_elt = generatedLink_set_head; ls_elt; ls_elt = generatedNext) {
					if (generatedLast_status != .IIB_LT_STATUS_PENDING) {
						for (addr_elt = generatedAddress_list_head; addr_elt; addr_elt = generatedNext) {
							if (!((generatedIn_tmp_table & -1024))) {
								switch (generatedLast_status) {
								case .IIB_LT_STATUS_LOST:
										ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_LINK_STATUS, RFC5444_LINKSTATUS_LOST, /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_in), /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_out));
										generatedAddress.setIn_tmp_table((true));
										break;
								case .IIB_LT_STATUS_SYM:
										ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_LINK_STATUS, RFC5444_LINKSTATUS_SYMMETRIC, /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_in), /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_out));
										generatedAddress.setIn_tmp_table((true));
										break;
								case .IIB_LT_STATUS_HEARD:
										ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_LINK_STATUS, RFC5444_LINKSTATUS_HEARD, /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_in), /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_out));
										generatedAddress.setIn_tmp_table((true));
										break;
								case .IIB_LT_STATUS_UNKNOWN/* Fall through */:
								case .IIB_LT_STATUS_PENDING/* Pending link tuples are not included */:
										break;
								default:
										/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* Should not happen */"%s:%d in %s: [WARNING] Unknown link tuple status\n", RIOT_FILE_RELATIVE, 200, DEBUG_FUNC);
										break;
								}
							} 
						}
					} 
				}
				break;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_iib_access);
	}
	public static void iib_update_lt_status() {
		iib_base_entry_t base_elt = new iib_base_entry_t();
		iib_link_set_entry_t ls_elt = new iib_link_set_entry_t();
		iib_link_set_entry_t ls_tmp = new iib_link_set_entry_t();
		iib_link_set_entry generatedLink_set_head = base_elt.getLink_set_head();
		iib_base_entry generatedNext = (base_elt).getNext();
		for (base_elt = ModernizedCProgram.iib_base_entry_head; base_elt; base_elt = generatedNext) {
			for ((ls_elt) = (generatedLink_set_head); (ls_elt) && (); (ls_elt) = ls_tmp) {
				ModernizedCProgram.wr_update_ls_status(base_elt, ls_elt, now);
			}
		}
	}
	/* Better value, use it also for your neighbor */
	/* The corresponding neighbor tuples metric needs to be updated */
	/* Smaller DAT value is better */
	/* NHDP_METRIC is not set properly */
	public static void iib_process_metric_refresh() {
	}
	/* Nothing to do here */
	/* NHDP_METRIC is not set properly */
	/*------------------------------------------------------------------------------------*/
	/*                                Internal functions                                  */
	/*------------------------------------------------------------------------------------*/
	/**
	 * Remove addresses included in the Removed Address List from all existing Link Tuples
	 */
	public static void cleanup_link_sets() {
		iib_base_entry_t base_elt = new iib_base_entry_t();
		nhdp_addr generatedAddress = lt_elt.getAddress();
		Object generatedIn_tmp_table = generatedAddress.getIn_tmp_table();
		nhdp_addr_entry generatedAddress_list_head = ls_elt.getAddress_list_head();
		nhdp_addr_entry generatedNext = (generatedAddress_list_head).getNext();
		 generatedLast_status = ls_elt.getLast_status();
		iib_link_set_entry generatedLs_elt = th_elt.getLs_elt();
		iib_two_hop_set_entry generatedTwo_hop_set_head = base_elt.getTwo_hop_set_head();
		iib_link_set_entry generatedLink_set_head = base_elt.getLink_set_head();
		for (base_elt = ModernizedCProgram.iib_base_entry_head; base_elt; base_elt = generatedNext) {
			iib_link_set_entry_t ls_elt = new iib_link_set_entry_t();
			iib_link_set_entry_t ls_tmp = new iib_link_set_entry_t();
			for ((ls_elt) = (generatedLink_set_head); (ls_elt) && (); (ls_elt) = ls_tmp/* Loop through all addresses of the link tuples */) {
				nhdp_addr_entry_t lt_elt = new nhdp_addr_entry_t();
				nhdp_addr_entry_t lt_tmp = new nhdp_addr_entry_t();
				for ((lt_elt) = (generatedAddress_list_head); (lt_elt) && (); (lt_elt) = lt_tmp) {
					if (((generatedIn_tmp_table & -1024) >> 2)) {
						do {
							int _tmp;
							if ((generatedAddress_list_head) == (lt_elt)) {
								(generatedAddress_list_head) = generatedNext;
							} else {
									_tmp = generatedAddress_list_head;
									while (generatedNext && (generatedNext != (lt_elt))) {
										_tmp = generatedNext;
									}
									if (generatedNext) {
										_tmp.setNext((generatedNext));
									} 
							} 
						} while (/* Remove link tuple address if included in the Removed Addr List */0);
						lt_elt.nhdp_free_addr_entry();
					} 
				}
				if (!generatedAddress_list_head) {
					if (generatedLast_status == .IIB_LT_STATUS_SYM/* Remove all two hop entries for the corresponding link tuple */) {
						iib_two_hop_set_entry_t th_elt = new iib_two_hop_set_entry_t();
						iib_two_hop_set_entry_t th_tmp = new iib_two_hop_set_entry_t();
						for ((th_elt) = (generatedTwo_hop_set_head); (th_elt) && (); (th_elt) = th_tmp) {
							if (generatedLs_elt == ls_elt) {
								ModernizedCProgram.rem_two_hop_entry(base_elt, th_elt);
							} 
						}
					} 
					ModernizedCProgram.rem_link_set_entry(base_elt, ls_elt);
				} 
			}
		}
	}
	public static void wr_update_ls_status(iib_base_entry base_entry, iib_link_set_entry ls_elt,  now) {
		 generatedExp_time = ls_elt.getExp_time();
		 generatedLast_status = ls_elt.getLast_status();
		 generatedSym_time = ls_elt.getSym_time();
		 generatedHeard_time = ls_elt.getHeard_time();
		if (ModernizedCProgram.timex_cmp(generatedExp_time, now) != 1) {
			if (generatedLast_status == /* Entry expired and has to be removed */.IIB_LT_STATUS_SYM) {
				ModernizedCProgram.update_nb_tuple_symmetry(base_entry, ls_elt, now);
			} 
			ModernizedCProgram.rem_not_heard_nb_tuple(ls_elt, now);
			ModernizedCProgram.rem_link_set_entry(base_entry, ls_elt);
		}  else if ((generatedLast_status == .IIB_LT_STATUS_SYM) && (ModernizedCProgram.timex_cmp(generatedSym_time, now) != 1)) {
			ModernizedCProgram.update_nb_tuple_symmetry(base_entry, ls_elt, /* Status changed from SYMMETRIC to HEARD */now);
			ls_elt.setLast_status(.IIB_LT_STATUS_HEARD);
			if (ModernizedCProgram.timex_cmp(generatedHeard_time, now) != 1) {
				ModernizedCProgram.rem_not_heard_nb_tuple(ls_elt, /* New status is LOST (equals IIB_LT_STATUS_UNKNOWN) */now);
				ls_elt.setNb_elt(((Object)0));
				ls_elt.setLast_status(.IIB_LT_STATUS_UNKNOWN);
			} 
		}  else if ((generatedLast_status == .IIB_LT_STATUS_HEARD) && (ModernizedCProgram.timex_cmp(generatedHeard_time, now) != 1)) {
			ModernizedCProgram.rem_not_heard_nb_tuple(ls_elt, /* Status changed from HEARD to LOST (equals IIB_LT_STATUS_UNKNOWN) */now);
			ls_elt.setNb_elt(((Object)0));
			ls_elt.setLast_status(.IIB_LT_STATUS_UNKNOWN);
		} 
	}
	public static void reset_link_set_entry(iib_link_set_entry ls_entry,  now, Object val_time) {
		timex_t v_time = ModernizedCProgram.timex_from_uint64(val_time * (true));
		ls_entry.release_link_tuple_addresses();
		 generatedSym_time = ls_entry.getSym_time();
		generatedSym_time.setMicroseconds(0);
		generatedSym_time.setSeconds(0);
		 generatedHeard_time = ls_entry.getHeard_time();
		generatedHeard_time.setMicroseconds(0);
		generatedHeard_time.setSeconds(0);
		ls_entry.setPending((false));
		ls_entry.setLost(0);
		ls_entry.setExp_time(ModernizedCProgram.timex_add(now, v_time));
		ls_entry.setNb_elt(((Object)0));
		ls_entry.setLast_status(.IIB_LT_STATUS_UNKNOWN);
		ls_entry.setMetric_in((false));
		ls_entry.setMetric_out((false));
	}
	/* Internal function prototypes */
	/**
	 * Remove a given Link Tuple
	 */
	public static void rem_link_set_entry(iib_base_entry base_entry, iib_link_set_entry ls_entry) {
		iib_link_set_entry generatedLink_set_head = base_entry.getLink_set_head();
		iib_link_set_entry generatedNext = (generatedLink_set_head).getNext();
		do {
			int _tmp;
			if ((generatedLink_set_head) == (ls_entry)) {
				(generatedLink_set_head) = generatedNext;
			} else {
					_tmp = generatedLink_set_head;
					while (generatedNext && (generatedNext != (ls_entry))) {
						_tmp = generatedNext;
					}
					if (generatedNext) {
						_tmp.setNext((generatedNext));
					} 
			} 
		} while (0);
		ls_entry.release_link_tuple_addresses();
		ModernizedCProgram.free(ls_entry/**
		 * Free all address entries of a link tuple
		 */);
	}
	public static int update_two_hop_set(iib_base_entry base_entry, iib_link_set_entry ls_entry,  now, Object val_time) {
		if (ls_entry == ((Object)/* Check whether a corresponding link tuple was created */0)) {
			return -1;
		} 
		 generatedExp_time = ths_elt.getExp_time();
		iib_link_set_entry generatedLs_elt = ths_elt.getLs_elt();
		nhdp_addr generatedTh_nb_addr = ths_elt.getTh_nb_addr();
		Object generatedIn_tmp_table = generatedTh_nb_addr.getIn_tmp_table();
		iib_two_hop_set_entry generatedTwo_hop_set_head = base_entry.getTwo_hop_set_head();
		nhdp_addr generatedNext = (addr_elt).getNext();
		nhdp_addr nhdp_addr = new nhdp_addr();
		if (ModernizedCProgram.get_tuple_status(ls_entry, now) == /* If the link to the neighbor is still symmetric */.IIB_LT_STATUS_SYM) {
			iib_two_hop_set_entry_t ths_elt = new iib_two_hop_set_entry_t();
			iib_two_hop_set_entry_t ths_tmp = new iib_two_hop_set_entry_t();
			nhdp_addr_t addr_elt = new nhdp_addr_t();
			for ((ths_elt) = (generatedTwo_hop_set_head); (ths_elt) && (); (ths_elt) = /* Loop through all the two hop tuples of the two hop set */ths_tmp) {
				if (ModernizedCProgram.timex_cmp(generatedExp_time, now) != 1) {
					ModernizedCProgram.rem_two_hop_entry(base_entry, /* Entry is expired, remove it */ths_elt);
				}  else if (generatedLs_elt == ls_entry) {
					if (generatedIn_tmp_table & ((true) | (true))) {
						ModernizedCProgram.rem_two_hop_entry(base_entry, ths_elt);
					} 
				} 
			}
			for (addr_elt = nhdp_addr.nhdp_get_addr_db_head(); addr_elt; addr_elt = generatedNext) {
				if (((generatedIn_tmp_table & -1024) >> 4)) {
					if (ModernizedCProgram.add_two_hop_entry(base_entry, ls_entry, addr_elt, now, val_time)) {
						return -/* No more memory available, return error */1;
					} 
				} 
			}
		} 
		return 0/**
		 * Add a 2-Hop Tuple for a given address
		 */;
	}
	public static int add_two_hop_entry(iib_base_entry base_entry, iib_link_set_entry ls_entry, nhdp_addr th_addr,  now, Object val_time) {
		iib_two_hop_set_entry_t new_entry = new iib_two_hop_set_entry_t();
		timex_t v_time = ModernizedCProgram.timex_from_uint64(val_time * (true));
		new_entry = (iib_two_hop_set_entry_t)ModernizedCProgram.malloc(/*Error: Unsupported expression*/);
		if (!new_entry) {
			return -/* Insufficient memory */1;
		} 
		Object generatedUsg_count = th_addr.getUsg_count();
		generatedUsg_count++;
		new_entry.setTh_nb_addr(th_addr);
		new_entry.setLs_elt(ls_entry);
		new_entry.setExp_time(ModernizedCProgram.timex_add(now, v_time));
		Object generatedTmp_metric_val = th_addr.getTmp_metric_val();
		if (generatedTmp_metric_val != (false)) {
			new_entry.setMetric_in(/*Error: Function owner not recognized*/rfc5444_metric_decode(generatedTmp_metric_val));
			new_entry.setMetric_out(/*Error: Function owner not recognized*/rfc5444_metric_decode(generatedTmp_metric_val));
		} else {
				new_entry.setMetric_in((false));
				new_entry.setMetric_out((false));
		} 
		iib_two_hop_set_entry generatedTwo_hop_set_head = base_entry.getTwo_hop_set_head();
		do {
			(new_entry).setNext(generatedTwo_hop_set_head);
			base_entry.setTwo_hop_set_head(new_entry);
		} while (0);
		return 0/**
		 * Remove a given 2-Hop Tuple
		 */;
	}
	public static void rem_two_hop_entry(iib_base_entry base_entry, iib_two_hop_set_entry th_entry) {
		iib_two_hop_set_entry generatedTwo_hop_set_head = base_entry.getTwo_hop_set_head();
		iib_two_hop_set_entry generatedNext = (generatedTwo_hop_set_head).getNext();
		do {
			int _tmp;
			if ((generatedTwo_hop_set_head) == (th_entry)) {
				(generatedTwo_hop_set_head) = generatedNext;
			} else {
					_tmp = generatedTwo_hop_set_head;
					while (generatedNext && (generatedNext != (th_entry))) {
						_tmp = generatedNext;
					}
					if (generatedNext) {
						_tmp.setNext((generatedNext));
					} 
			} 
		} while (0);
		nhdp_addr generatedTh_nb_addr = th_entry.getTh_nb_addr();
		generatedTh_nb_addr.nhdp_decrement_addr_usage();
		ModernizedCProgram.free(th_entry/**
		 * Remove all corresponding two hop entries for a given link tuple that lost symmetry status.
		 * Additionally reset the neighbor tuple's symmmetry flag (for the neighbor tuple this link
		 * tuple is represented in), if no more corresponding symmetric link tuples are left.
		 * Implements section 13.2 of RFC 6130
		 */);
	}
	public static void update_nb_tuple_symmetry(iib_base_entry base_entry, iib_link_set_entry ls_entry,  now) {
		iib_two_hop_set_entry_t th_elt = new iib_two_hop_set_entry_t();
		iib_two_hop_set_entry_t th_tmp = new iib_two_hop_set_entry_t();
		iib_link_set_entry generatedLs_elt = th_elt.getLs_elt();
		iib_two_hop_set_entry generatedTwo_hop_set_head = base_entry.getTwo_hop_set_head();
		for ((th_elt) = (generatedTwo_hop_set_head); (th_elt) && (); (th_elt) = /* First remove all two hop entries for the corresponding link tuple */th_tmp) {
			if (generatedLs_elt == ls_entry) {
				ModernizedCProgram.rem_two_hop_entry(base_entry, th_elt);
			} 
		}
		nib_entry generatedNb_elt = ls_entry.getNb_elt();
		Object generatedSymmetric = generatedNb_elt.getSymmetric();
		 generatedSym_time = ls_tmp.getSym_time();
		iib_link_set_entry generatedNext = (ls_tmp).getNext();
		iib_link_set_entry generatedLink_set_head = base_tmp.getLink_set_head();
		if ((generatedNb_elt != ((Object)0)) && (generatedSymmetric == /* Afterwards check the neighbor tuple containing the link tuple's addresses */1)) {
			iib_base_entry_t base_tmp = new iib_base_entry_t();
			for (base_tmp = ModernizedCProgram.iib_base_entry_head; base_tmp; base_tmp = generatedNext) {
				iib_link_set_entry_t ls_tmp = new iib_link_set_entry_t();
				for (ls_tmp = generatedLink_set_head; ls_tmp; ls_tmp = generatedNext) {
					if ((generatedNb_elt == generatedNb_elt) && (ls_entry != ls_tmp)) {
						if (ModernizedCProgram.timex_cmp(generatedSym_time, now) == 1) {
							return /*Error: Unsupported expression*/;
						} 
					} 
				}
			}
			ModernizedCProgram.nib_reset_nb_entry_sym(generatedNb_elt, /* No remaining symmetric link tuple for the neighbor tuple */now/**
			 * Remove a neighbor tuple if no more corresponding heard link tuples are left
			 * Implements section 13.3 of RFC 6130
			 */);
		} 
	}
	public static void rem_not_heard_nb_tuple(iib_link_set_entry ls_entry,  now) {
		nib_entry generatedNb_elt = ls_entry.getNb_elt();
		 generatedHeard_time = ls_tmp.getHeard_time();
		iib_link_set_entry generatedNext = (ls_tmp).getNext();
		iib_link_set_entry generatedLink_set_head = base_tmp.getLink_set_head();
		if (generatedNb_elt) {
			iib_base_entry_t base_tmp = new iib_base_entry_t();
			for (base_tmp = ModernizedCProgram.iib_base_entry_head; base_tmp; base_tmp = generatedNext) {
				iib_link_set_entry_t ls_tmp = new iib_link_set_entry_t();
				for (ls_tmp = generatedLink_set_head; ls_tmp; ls_tmp = generatedNext) {
					if ((generatedNb_elt == generatedNb_elt) && (ls_entry != ls_tmp)) {
						if (ModernizedCProgram.timex_cmp(generatedHeard_time, now) == 1) {
							return /*Error: Unsupported expression*/;
						} 
						ls_tmp.setNb_elt(((Object)0));
					} 
				}
			}
			generatedNb_elt.nib_rem_nb_entry();
		} 
	}
	/**
	 * Get the L_STATUS value of a given link tuple
	 */
	public static  get_tuple_status(iib_link_set_entry ls_entry,  now) {
		Object generatedPending = ls_entry.getPending();
		Object generatedLost = ls_entry.getLost();
		 generatedSym_time = ls_entry.getSym_time();
		 generatedHeard_time = ls_entry.getHeard_time();
		if (generatedPending) {
			return .IIB_LT_STATUS_PENDING;
		}  else if (generatedLost) {
			return .IIB_LT_STATUS_LOST;
		}  else if (ModernizedCProgram.timex_cmp(generatedSym_time, now) == 1) {
			return .IIB_LT_STATUS_SYM;
		}  else if (ModernizedCProgram.timex_cmp(generatedHeard_time, now) == 1) {
			return .IIB_LT_STATUS_HEARD;
		} 
		return .IIB_LT_STATUS_UNKNOWN/**
		 * Get the later one of two timex representation
		 */;
	}
	public static  get_max_timex( time_two) {
		if (ModernizedCProgram.timex_cmp(time_one, time_two) != -1) {
			return time_one;
		} 
		return time_two/**
		 * Sum all elements in the queue
		 */;
	}
	/**
	 * Remove the oldest element in the queue
	 */
	/* Clear spot for a new element */
	/* Shift elements */
	/**
	 * Update DAT metric values for all Link Tuples
	 */
	/* Compute lost time proportion */
	/* Better value, use it also for your neighbor */
	/* The corresponding neighbor tuples metric needs to be updated */
	/* Smaller DAT value is better */
	/**
	 * Copyright (C) 2014 Martin Landsmann <Martin.Landsmann@HAW-Hamburg.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     net_fib
	 * @{
	 *
	 * @file
	 * @brief       Functions to manage FIB entries
	 *
	 * @author      Martin Landsmann <martin.landsmann@haw-hamburg.de>
	 * @author      Oliver Hahm <oliver.hahm@inria.fr>
	 *
	 * @}
	 */
	/**
	 * @brief convert an offset given in ms to abolute time in time in us
	 * @param[in]  ms       the milliseconds to be converted
	 * @param[out] target   the converted point in time
	 */
	public static void fib_lifetime_to_absolute(Object ms, Object target) {
		target = ModernizedCProgram.xtimer_now_usec64() + (ms * (true/**
		 * @brief returns pointer to the entry for the given destination address
		 *
		 * @param[in] table                the FIB table to search in
		 * @param[in] dst                  the destination address
		 * @param[in] dst_size             the destination address size
		 * @param[out] entry_arr           the array to scribe the found match
		 * @param[in, out] entry_arr_size  the number of entries provided by entry_arr (should be always 1)
		 *                                 this value is overwritten with the actual found number
		 *
		 * @return 0 if we found a next-hop prefix
		 *         1 if we found the exact address next-hop
		 *         -EHOSTUNREACH if no fitting next-hop is available
		 */));
	}
	public static int fib_find_entry(Object table, Object[] dst, Object dst_size, Object[][] entry_arr, Object entry_arr_size) {
		uint64_t now = ModernizedCProgram.xtimer_now_usec64();
		size_t count = 0;
		size_t prefix_size = 0;
		size_t match_size = dst_size << 3;
		int ret = -EHOSTUNREACH;
		 is_all_zeros_addr = true;
		for (size_t i = 0;
		 i < dst_size; ++i) {
			if (dst[i] != 0) {
				is_all_zeros_addr = false;
				break;
			} 
		}
		for (size_t i = 0;
		 i < table.getSize(); ++i) {
			if (table.getData().getEntries()[i].getLifetime() != /* autoinvalidate if the entry lifetime is not set to not expire */FIB_LIFETIME_NO_EXPIRE) {
				if (table.getData().getEntries()[i].getLifetime() < /* check if the lifetime expired */now) {
					table.getData().getEntries()[i].setLifetime(/* remove this entry if its lifetime expired */0);
					table.getData().getEntries()[i].setGlobal_flags(0);
					table.getData().getEntries()[i].setNext_hop_flags(0);
					table.getData().getEntries()[i].setIface_id(KERNEL_PID_UNDEF);
					if (table.getData().getEntries()[i].getGlobal() != ((Object)0)) {
						table.getData().getEntries()[i].getGlobal().universal_address_rem();
						table.getData().getEntries()[i].setGlobal(((Object)0));
					} 
					if (table.getData().getEntries()[i].getNext_hop() != ((Object)0)) {
						table.getData().getEntries()[i].getNext_hop().universal_address_rem();
						table.getData().getEntries()[i].setNext_hop(((Object)0));
					} 
				} 
			} 
			if ((prefix_size < (dst_size << 3)) && (table.getData().getEntries()[i].getGlobal() != ((Object)0))) {
				int ret_comp = table.getData().getEntries()[i].getGlobal().universal_address_compare(dst, match_size);
				if ((ret_comp == /* If we found an exact match */UNIVERSAL_ADDRESS_EQUAL) || (is_all_zeros_addr && (ret_comp == UNIVERSAL_ADDRESS_IS_ALL_ZERO_ADDRESS))) {
					entry_arr[0] = (table.getData().getEntries()[i]);
					entry_arr_size = 1;
					return /* we will not find a better one so we return */1;
				} else {
						if (ret_comp == /* we try to find the most fitting prefix */UNIVERSAL_ADDRESS_MATCHING_PREFIX) {
							if (table.getData().getEntries()[i].getGlobal_flags() & FIB_FLAG_NET_PREFIX_MASK) {
								size_t global_prefix_len = (table.getData().getEntries()[i].getGlobal_flags() & FIB_FLAG_NET_PREFIX_MASK) >> FIB_FLAG_NET_PREFIX_SHIFT;
								if ((match_size >= global_prefix_len) && ((prefix_size == 0) || (match_size > prefix_size))) {
									entry_arr[0] = (table.getData().getEntries()[i]);
									ret = /* we could find a better one so we move on */0;
									prefix_size = match_size;
									count = 1;
								} 
							} 
						}  else if (ret_comp == UNIVERSAL_ADDRESS_IS_ALL_ZERO_ADDRESS/* we found the default gateway entry, e.g. ::/0 for IPv6
						                     * and we keep it only if there is no better one
						                     */) {
							if (prefix_size == 0) {
								entry_arr[0] = (table.getData().getEntries()[i]);
								ret = /* we could find a better one so we move on */0;
								count = 1;
							} 
						} 
						match_size = dst_size << 3;
				} 
			} 
		}
		entry_arr_size = count;
		return ret/**
		 * @brief updates the next hop the lifetime and the interface id for a given entry
		 *
		 * @param[in] entry          the entry to be updated
		 * @param[in] next_hop       the next hop address to be updated
		 * @param[in] next_hop_size  the next hop address size
		 * @param[in] next_hop_flags the next-hop address flags
		 * @param[in] lifetime       the lifetime in ms
		 *
		 * @return 0 if the entry has been updated
		 *         -ENOMEM if the entry cannot be updated due to insufficient RAM
		 */;
	}
	public static int fib_upd_entry(Object entry, Object next_hop, Object next_hop_size, Object next_hop_flags, Object lifetime) {
		 container = ModernizedCProgram.universal_address_add(next_hop, next_hop_size);
		if (container == ((Object)0)) {
			return -12;
		} 
		entry.getNext_hop().universal_address_rem();
		entry.setNext_hop(container);
		entry.setNext_hop_flags(next_hop_flags);
		if (lifetime != (uint32_t)FIB_LIFETIME_NO_EXPIRE) {
			ModernizedCProgram.fib_lifetime_to_absolute(lifetime, entry.getLifetime());
		} else {
				entry.setLifetime(FIB_LIFETIME_NO_EXPIRE);
		} 
		return 0/**
		 * @brief creates a new FIB entry with the provided parameters
		 *
		 * @param[in] table          the FIB table to create the entry in
		 * @param[in] iface_id       the interface ID
		 * @param[in] dst            the destination address
		 * @param[in] dst_size       the destination address size
		 * @param[in] dst_flags      the destination address flags
		 * @param[in] next_hop       the next hop address
		 * @param[in] next_hop_size  the next hop address size
		 * @param[in] next_hop_flags the next-hop address flags
		 * @param[in] lifetime       the lifetime in ms
		 *
		 * @return 0 on success
		 *         -ENOMEM if no new entry can be created
		 */;
	}
	public static int fib_create_entry(Object table, Object iface_id, Object dst, Object dst_size, Object dst_flags, Object next_hop, Object next_hop_size, Object next_hop_flags, Object lifetime) {
		for (size_t i = 0;
		 i < table.getSize(); ++i) {
			if (table.getData().getEntries()[i].getLifetime() == 0) {
				table.getData().getEntries()[i].setGlobal(ModernizedCProgram.universal_address_add(dst, dst_size));
				if (table.getData().getEntries()[i].getGlobal() != ((Object)0)) {
					table.getData().getEntries()[i].setGlobal_flags(dst_flags);
					table.getData().getEntries()[i].setNext_hop(ModernizedCProgram.universal_address_add(next_hop, next_hop_size));
					table.getData().getEntries()[i].setNext_hop_flags(next_hop_flags);
				} 
				if (table.getData().getEntries()[i].getNext_hop() != ((Object)0)) {
					table.getData().getEntries()[i].setIface_id(/* everything worked fine */iface_id);
					if (lifetime != (uint32_t)FIB_LIFETIME_NO_EXPIRE) {
						ModernizedCProgram.fib_lifetime_to_absolute(lifetime, table.getData().getEntries()[i].getLifetime());
					} else {
							table.getData().getEntries()[i].setLifetime(FIB_LIFETIME_NO_EXPIRE);
					} 
					return 0;
				} 
			} 
		}
		return -12/**
		 * @brief removes the given entry
		 *
		 * @param[in] entry the entry to be removed
		 *
		 * @return 0 on success
		 */;
	}
	public static int fib_remove(Object entry) {
		if (entry.getGlobal() != ((Object)0)) {
			entry.getGlobal().universal_address_rem();
		} 
		if (entry.getNext_hop()) {
			entry.getNext_hop().universal_address_rem();
		} 
		entry.setGlobal(((Object)0));
		entry.setGlobal_flags(0);
		entry.setNext_hop(((Object)0));
		entry.setNext_hop_flags(0);
		entry.setIface_id(KERNEL_PID_UNDEF);
		entry.setLifetime(0);
		return 0/**
		 * @brief signals (sends a message to) all registered routing protocols
		 *        registered with a matching prefix (usually this should be only one).
		 *        The receiver MUST copy the content, i.e. the address before reply.
		 *
		 * @param[in] table     the fib instance to use
		 * @param[in] type      the kind of signal
		 * @param[in] dat       the data to send
		 * @param[in] dat_size  the data size in bytes
		 * @param[in] dat_flags the data flags
		 *
		 * @return 0 on a new available entry,
		 *         -ENOENT if no suiting entry is provided.
		 */;
	}
	public static int fib_signal_rp(Object table, Object type, Object dat, Object dat_size, Object dat_flags) {
		 msg = new ();
		 reply = new ();
		 rp_addr_msg = new ();
		int ret = -2;
		Object content = ((Object)0);
		if (type != FIB_MSG_RP_SIGNAL_SOURCE_ROUTE_CREATED) {
			rp_addr_msg.setAddress(/* the passed data is an address */dat);
			rp_addr_msg.setAddress_size(dat_size);
			rp_addr_msg.setAddress_flags(dat_flags);
			content = (Object)rp_addr_msg;
		} else {
				content = (Object)/* the passed data is a sr head
				         * dat_size and dat_flags are not used in this case
				         */dat;
		} 
		msg.setType(type);
		msg.getContent().setPtr(content);
		for (size_t i = 0;
		 i < FIB_MAX_REGISTERED_RP; ++i) {
			if (table.getNotify_rp()[i] != KERNEL_PID_UNDEF) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_signal_rp] send msg@: %p to pid[%d]: %d\n", msg.getContent().getPtr(), (int)i, (int)(table.getNotify_rp()[i]));
				if (type != /* do only signal a RP if its registered prefix matches */FIB_MSG_RP_SIGNAL_SOURCE_ROUTE_CREATED) {
					size_t dat_size_in_bits = dat_size << 3;
					if (table.getPrefix_rp()[i].universal_address_compare(dat, dat_size_in_bits) != -2/* the receiver, i.e. the RP, MUST copy the content value.
					                     * using the provided pointer after replying this message
					                     * will lead to errors
					                     */) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_send_receive(msg, reply, table.getNotify_rp()[i]);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_signal_rp] got reply.\n");
						ret = 0;
					} 
				} else {
						 temp_sr = ()dat;
						size_t dat_size_in_bits = temp_sr.getSr_dest().getAddress().getAddress_size() << 3;
						if (table.getPrefix_rp()[i].universal_address_compare(temp_sr.getSr_dest().getAddress().getAddress(), dat_size_in_bits) != -2/* the receiver, i.e. the RP, MUST copy the content value.
						                     * using the provided pointer after replying this message
						                     * will lead to errors
						                     */) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_send_receive(msg, reply, table.getNotify_rp()[i]);
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_signal_rp] got reply.\n");
							ret = 0;
						} 
				} 
			} 
		}
		return ret;
	}
	public static int fib_add_entry(Object table, Object iface_id, Object dst, Object dst_size, Object dst_flags, Object next_hop, Object next_hop_size, Object next_hop_flags, Object lifetime) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_add_entry]\n");
		size_t count = 1;
		[] entry = new ();
		if ((dst == ((Object)0)) || (next_hop == ((Object)/* check if dst and next_hop are valid pointers */0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		int ret = ModernizedCProgram.fib_find_entry(table, dst, dst_size, (entry[0]), count);
		if (ret == 1) {
			ret = ModernizedCProgram.fib_upd_entry(entry[0], next_hop, next_hop_size, next_hop_flags, /* we must take the according entry and update the values */lifetime);
		} else {
				ret = ModernizedCProgram.fib_create_entry(table, iface_id, dst, dst_size, dst_flags, next_hop, next_hop_size, next_hop_flags, lifetime);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return ret;
	}
	public static int fib_update_entry(Object table, Object dst, Object dst_size, Object next_hop, Object next_hop_size, Object next_hop_flags, Object lifetime) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_update_entry]\n");
		size_t count = 1;
		[] entry = new ();
		int ret = -12;
		if ((dst == ((Object)0)) || (next_hop == ((Object)/* check if dst and next_hop are valid pointers */0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_find_entry(table, dst, dst_size, (entry[0]), count) == 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_update_entry] found entry: %p\n", (Object)(entry[0]));
			ret = ModernizedCProgram.fib_upd_entry(entry[0], next_hop, next_hop_size, next_hop_flags, /* we must take the according entry and update the values */lifetime);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* we have ambiguous entries, i.e. count > 1
				         * this should never happen
				         */"[fib_update_entry] ambigious entries detected!!!\n");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return ret;
	}
	public static void fib_remove_entry(Object table, Object dst, Object dst_size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_remove_entry]\n");
		size_t count = 1;
		[] entry = new ();
		int ret = ModernizedCProgram.fib_find_entry(table, dst, dst_size, (entry[0]), count);
		if (ret == 1) {
			ModernizedCProgram.fib_remove(entry[/* we must take the according entry and update the values */0]);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* we have ambiguous entries, i.e. count > 1
				         * this should never happen
				         */"[fib_update_entry] ambigious entries detected!!!\n");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
	}
	public static void fib_flush(Object table, Object interface) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_flush]\n");
		for (size_t i = 0;
		 i < table.getSize(); ++i) {
			if ((interface == KERNEL_PID_UNDEF) || (interface == table.getData().getEntries()[i].getIface_id())) {
				ModernizedCProgram.fib_remove(table.getData().getEntries()[i]);
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
	}
	public static int fib_get_next_hop(Object table, Object iface_id, Object next_hop, Object next_hop_size, Object next_hop_flags, Object dst, Object dst_size, Object dst_flags) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_get_next_hop]\n");
		size_t count = 1;
		[] entry = new ();
		if ((iface_id == ((Object)0)) || (next_hop_size == ((Object)0)) || (next_hop_flags == ((Object)0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -22;
		} 
		if ((dst == ((Object)0)) || (next_hop == ((Object)0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		int ret = ModernizedCProgram.fib_find_entry(table, dst, dst_size, (entry[0]), count);
		if (!(ret == 0 || ret == 1)) {
			if (ModernizedCProgram.fib_signal_rp(table, /* notify all responsible RPs for unknown  next-hop for the destination address */FIB_MSG_RP_SIGNAL_UNREACHABLE_DESTINATION, dst, dst_size, dst_flags) == 0) {
				count = 1;
				ret = ModernizedCProgram.fib_find_entry(table, dst, dst_size, (entry[0]), /* now lets see if the RRPs have found a valid next-hop */count);
			} 
		} 
		if (ret == 0 || ret == 1) {
			uint8_t address_ret = entry[0].getNext_hop().universal_address_get_address(next_hop, next_hop_size);
			if (address_ret == ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return -ENOBUFS;
			} 
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return -EHOSTUNREACH;
		} 
		iface_id = entry[0].getIface_id();
		next_hop_flags = entry[0].getNext_hop_flags();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return 0;
	}
	public static int fib_get_destination_set(Object table, Object prefix, Object prefix_size, Object[] dst_set, Object dst_set_size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		int ret = -EHOSTUNREACH;
		size_t found_entries = 0;
		for (size_t i = 0;
		 i < table.getSize(); ++i) {
			if ((table.getData().getEntries()[i].getGlobal() != ((Object)0)) && (table.getData().getEntries()[i].getGlobal().universal_address_compare_prefix(prefix, prefix_size << 3) >= UNIVERSAL_ADDRESS_EQUAL)) {
				if ((dst_set != ((Object)0)) && (found_entries < dst_set_size)) {
					dst_set[found_entries].setDest_size(/*Error: sizeof expression not supported yet*/);
					table.getData().getEntries()[i].getGlobal().universal_address_get_address(dst_set[found_entries].getDest(), dst_set[found_entries].getDest_size());
				} 
				found_entries++;
			} 
		}
		if (found_entries > dst_set_size) {
			ret = -ENOBUFS;
		}  else if (found_entries > 0) {
			ret = 0;
		} 
		dst_set_size = found_entries;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return ret;
	}
	public static void fib_init(Object table) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_init] hello. Initializing some stuff.\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_init((table.getMtx_access()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		for (size_t i = 0;
		 i < FIB_MAX_REGISTERED_RP; ++i) {
			table.getNotify_rp()[i] = KERNEL_PID_UNDEF;
			table.getPrefix_rp()[i] = ((Object)0);
		}
		table.setNotify_rp_pos(0);
		if (table.getTable_type() == FIB_TABLE_TYPE_SR) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(table.getData().getSource_routes().getHeaders(), 0, /*Error: Unsupported expression*/ * table.getSize());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(table.getData().getSource_routes().getEntry_pool(), 0, /*Error: Unsupported expression*/ * table.getData().getSource_routes().getEntry_pool_size());
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(table.getData().getEntries(), 0, (table.getSize() * /*Error: Unsupported expression*/));
		} 
		ModernizedCProgram.universal_address_init();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
	}
	public static void fib_deinit(Object table) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("[fib_deinit] hello. De-Initializing stuff.\n");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		for (size_t i = 0;
		 i < FIB_MAX_REGISTERED_RP; ++i) {
			table.getNotify_rp()[i] = KERNEL_PID_UNDEF;
			table.getPrefix_rp()[i] = ((Object)0);
		}
		table.setNotify_rp_pos(0);
		if (table.getTable_type() == FIB_TABLE_TYPE_SR) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(table.getData().getSource_routes().getHeaders(), 0, /*Error: Unsupported expression*/ * table.getSize());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(table.getData().getSource_routes().getEntry_pool(), 0, /*Error: Unsupported expression*/ * table.getData().getSource_routes().getEntry_pool_size());
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(table.getData().getEntries(), 0, (table.getSize() * /*Error: Unsupported expression*/));
		} 
		ModernizedCProgram.universal_address_reset();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
	}
	public static int fib_register_rp(Object table, Object prefix, Object prefix_addr_type_size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if (table.getNotify_rp_pos() >= FIB_MAX_REGISTERED_RP) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -12;
		} 
		if ((prefix == ((Object)0)) || (prefix_addr_type_size == 0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -22;
		} 
		if (table.getNotify_rp_pos() < FIB_MAX_REGISTERED_RP) {
			table.getNotify_rp()[table.getNotify_rp_pos()] = sched_active_pid;
			 container = ModernizedCProgram.universal_address_add(prefix, prefix_addr_type_size);
			table.getPrefix_rp()[table.getNotify_rp_pos()] = container;
			table.getNotify_rp_pos()++;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return 0;
	}
	public static int fib_get_num_used_entries(Object table) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		size_t used_entries = 0;
		for (size_t i = 0;
		 i < table.getSize(); ++i) {
			used_entries += (size_t)(table.getData().getEntries()[i].getGlobal() != ((Object)0));
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return used_entries;
	}
	/* source route handling */
	public static int fib_sr_create(Object table, Object fib_sr, Object sr_iface_id, Object sr_flags, Object sr_lifetime) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (sr_lifetime == 0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		for (size_t i = 0;
		 i < table.getSize(); ++i) {
			if (table.getData().getSource_routes().getHeaders()[i].getSr_lifetime() == 0) {
				table.getData().getSource_routes().getHeaders()[i].setSr_iface_id(sr_iface_id);
				table.getData().getSource_routes().getHeaders()[i].setSr_flags(sr_flags);
				table.getData().getSource_routes().getHeaders()[i].setSr_path(((Object)0));
				table.getData().getSource_routes().getHeaders()[i].setSr_dest(((Object)0));
				if (sr_lifetime < (uint32_t)FIB_LIFETIME_NO_EXPIRE) {
					ModernizedCProgram.fib_lifetime_to_absolute(sr_lifetime, table.getData().getSource_routes().getHeaders()[i].getSr_lifetime());
				} else {
						table.getData().getSource_routes().getHeaders()[i].setSr_lifetime(FIB_LIFETIME_NO_EXPIRE);
				} 
				fib_sr = table.getData().getSource_routes().getHeaders()[i];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return 0;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return -ENOBUFS/**
		* @brief Internal function:
		*        checks the lifetime and removes the entry in case it expired
		*/;
	}
	public static int fib_sr_check_lifetime(Object fib_sr) {
		uint64_t tm = fib_sr.getSr_lifetime() - ModernizedCProgram.xtimer_now_usec64();
		if ((int64_t)tm < /* check if the lifetime expired */0) {
			fib_sr.setSr_lifetime(/* remove this sr if its lifetime expired */0);
			if (fib_sr.getSr_path() != ((Object)0)) {
				 elt = new ();
				for (elt = fib_sr.getSr_path(); elt; elt = (elt).getNext()) {
					elt.getAddress().universal_address_rem();
				}
				fib_sr.setSr_path(((Object)0));
			} 
			return -/* and return an errorcode */2;
		} 
		return 0/**
		* @brief Internal function:
		*        creates a new entry in the table entry pool for a hop in a source route
		*/;
	}
	public static int fib_sr_new_entry(Object table, Object addr, Object addr_size, Object new_entry) {
		for (size_t i = 0;
		 i < table.getData().getSource_routes().getEntry_pool_size(); ++i) {
			if (table.getData().getSource_routes().getEntry_pool()[i].getAddress() == ((Object)0)) {
				table.getData().getSource_routes().getEntry_pool()[i].setAddress(ModernizedCProgram.universal_address_add(addr, addr_size));
				if (table.getData().getSource_routes().getEntry_pool()[i].getAddress() == ((Object)0)) {
					return -12;
				} else {
						(Object)new_entry;
						new_entry = table.getData().getSource_routes().getEntry_pool()[i];
						return 0;
				} 
			} 
		}
		return -12/**
		* @brief Internal function:
		*        checks if the source route belongs to the given table
		*/;
	}
	public static int fib_is_sr_in_table(Object table, Object fib_sr) {
		for (size_t i = 0;
		 i < table.getSize(); ++i) {
			if ((table.getData().getSource_routes().getHeaders()[i]) == fib_sr) {
				return 0;
			} 
		}
		return -2;
	}
	public static int fib_sr_read_head(Object table, Object fib_sr, Object iface_id, Object sr_flags, Object sr_lifetime) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (iface_id == ((Object)0)) || (sr_flags == ((Object)0)) || (sr_lifetime == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_sr_check_lifetime(fib_sr) == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -2;
		} 
		iface_id = fib_sr.getSr_iface_id();
		sr_flags = fib_sr.getSr_flags();
		sr_lifetime = fib_sr.getSr_lifetime() - ModernizedCProgram.xtimer_now_usec64();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return 0;
	}
	public static int fib_sr_read_destination(Object table, Object fib_sr, Object dst, Object dst_size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (dst == ((Object)0)) || (dst_size == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_sr_check_lifetime(fib_sr) == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -2;
		} 
		if (fib_sr.getSr_dest() == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -EHOSTUNREACH;
		} 
		if (fib_sr.getSr_dest().getAddress().universal_address_get_address(dst, dst_size) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -ENOBUFS;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return 0;
	}
	public static int fib_sr_set(Object table, Object fib_sr, Object sr_iface_id, Object sr_flags, Object sr_lifetime) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_sr_check_lifetime(fib_sr) == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -2;
		} 
		if (sr_iface_id != ((Object)0)) {
			fib_sr.setSr_iface_id(sr_iface_id);
		} 
		if (sr_flags != ((Object)0)) {
			fib_sr.setSr_flags(sr_flags);
		} 
		if (sr_lifetime != ((Object)0)) {
			ModernizedCProgram.fib_lifetime_to_absolute(sr_lifetime, (fib_sr.getSr_lifetime()));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return 0;
	}
	public static int fib_sr_delete(Object table, Object fib_sr) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		fib_sr.setSr_lifetime(0);
		if (fib_sr.getSr_path() != ((Object)0)) {
			 elt = new ();
			 tmp = new ();
			for ((elt) = (fib_sr.getSr_path()); (elt) && (); (elt) = tmp) {
				elt.getAddress().universal_address_rem();
				elt.setAddress(((Object)0));
				do {
					int _tmp;
					if ((fib_sr.getSr_path()) == (elt)) {
						(fib_sr.getSr_path()) = (fib_sr.getSr_path()).getNext();
					} else {
							_tmp = fib_sr.getSr_path();
							while (_tmp.getNext() && (_tmp.getNext() != (elt))) {
								_tmp = _tmp.getNext();
							}
							if (_tmp.getNext()) {
								_tmp.setNext(((elt).getNext()));
							} 
					} 
				} while (0);
			}
			fib_sr.setSr_path(((Object)0));
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return 0;
	}
	public static int fib_sr_next(Object table, Object fib_sr, Object sr_path_entry) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (sr_path_entry == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (fib_sr.getSr_path() == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_sr_check_lifetime(fib_sr) == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -2;
		} 
		if (sr_path_entry == fib_sr.getSr_dest()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return 1;
		} 
		if (sr_path_entry == ((Object)/* when we start, we pass the first entry */0)) {
			sr_path_entry = fib_sr.getSr_path();
		} else {
				sr_path_entry = (sr_path_entry).getNext();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return 0;
	}
	public static int fib_sr_search(Object table, Object fib_sr, Object addr, Object addr_size, Object sr_path_entry) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (addr == ((Object)0)) || (sr_path_entry == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_sr_check_lifetime(fib_sr) == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -2;
		} 
		 elt = new ();
		for (elt = fib_sr.getSr_path(); elt; elt = (elt).getNext()) {
			size_t addr_size_match = addr_size << 3;
			if (elt.getAddress().universal_address_compare(addr, addr_size_match) == UNIVERSAL_ADDRESS_EQUAL) {
				(Object)/* temporary workaround to calm compiler */sr_path_entry;
				sr_path_entry = elt;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return 0;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return -EHOSTUNREACH;
	}
	public static int fib_sr_entry_append(Object table, Object fib_sr, Object addr, Object addr_size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (addr == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_sr_check_lifetime(fib_sr) == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -2;
		} 
		 elt = new ();
		for (elt = fib_sr.getSr_path(); elt; elt = (elt).getNext()) {
			size_t addr_size_match = addr_size << 3;
			if (elt.getAddress().universal_address_compare(addr, addr_size_match) == UNIVERSAL_ADDRESS_EQUAL) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return -22;
			} 
		}
		[] new_entry = new ();
		int ret = ModernizedCProgram.fib_sr_new_entry(table, addr, addr_size, new_entry[0]);
		if (ret == 0) {
			 tmp = fib_sr.getSr_dest();
			if (tmp != ((Object)0)) {
				tmp.setNext(new_entry[/* we append the new entry behind the former destination */0]);
			} else {
					fib_sr.setSr_path(new_entry[/* this is also our first entry */0]);
			} 
			fib_sr.setSr_dest(new_entry[0]);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return ret;
	}
	public static int fib_sr_entry_add(Object table, Object fib_sr, Object sr_path_entry, Object addr, Object addr_size, Object keep_remaining_route) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (sr_path_entry == ((Object)0)) || (addr == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_sr_check_lifetime(fib_sr) == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -2;
		} 
		 found = false;
		 elt = new ();
		for (elt = fib_sr.getSr_path(); elt; elt = (elt).getNext()) {
			size_t addr_size_match = addr_size << 3;
			if (elt.getAddress().universal_address_compare(addr, addr_size_match) == UNIVERSAL_ADDRESS_EQUAL) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return -22;
			} 
			if (sr_path_entry == elt) {
				found = true;
				break;
			} 
		}
		int ret = -2;
		if (found) {
			[] new_entry = new ();
			ret = ModernizedCProgram.fib_sr_new_entry(table, addr, addr_size, new_entry[0]);
			if (ret == 0) {
				 remaining = sr_path_entry.getNext();
				sr_path_entry.setNext(new_entry[0]);
				if (keep_remaining_route) {
					new_entry[0].setNext(remaining);
				} else {
						 elt = new ();
						 tmp = new ();
						for ((elt) = (remaining); (elt) && (); (elt) = tmp) {
							elt.getAddress().universal_address_rem();
							elt.setAddress(((Object)0));
							do {
								int _tmp;
								if ((remaining) == (elt)) {
									(remaining) = (remaining).getNext();
								} else {
										_tmp = remaining;
										while (_tmp.getNext() && (_tmp.getNext() != (elt))) {
											_tmp = _tmp.getNext();
										}
										if (_tmp.getNext()) {
											_tmp.setNext(((elt).getNext()));
										} 
								} 
							} while (0);
						}
						new_entry[0].setNext(((Object)0));
						fib_sr.setSr_dest(new_entry[0]);
				} 
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return ret;
	}
	public static int fib_sr_entry_delete(Object table, Object fib_sr, Object addr, Object addr_size, Object keep_remaining_route) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_sr_check_lifetime(fib_sr) == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -2;
		} 
		 elt = new ();
		 tmp = new ();
		tmp = fib_sr.getSr_path();
		for (elt = fib_sr.getSr_path(); elt; elt = (elt).getNext()) {
			size_t addr_size_match = addr_size << 3;
			if (elt.getAddress().universal_address_compare(addr, addr_size_match) == UNIVERSAL_ADDRESS_EQUAL) {
				elt.getAddress().universal_address_rem();
				if (keep_remaining_route) {
					tmp.setNext(elt.getNext());
				} else {
						 elt_del = new ();
						 tmp_del = new ();
						for ((elt_del) = (tmp); (elt_del) && (); (elt_del) = tmp_del) {
							elt_del.getAddress().universal_address_rem();
							elt_del.setAddress(((Object)0));
							do {
								int _tmp;
								if ((tmp) == (elt_del)) {
									(tmp) = (tmp).getNext();
								} else {
										_tmp = tmp;
										while (_tmp.getNext() && (_tmp.getNext() != (elt_del))) {
											_tmp = _tmp.getNext();
										}
										if (_tmp.getNext()) {
											_tmp.setNext(((elt_del).getNext()));
										} 
								} 
							} while (0);
						}
				} 
				if (elt == fib_sr.getSr_path()) {
					fib_sr.setSr_path(elt.getNext());
				} 
				if (elt == fib_sr.getSr_dest()) {
					fib_sr.setSr_dest(/* if we remove the last entry we must adjust the destination */tmp);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return 0;
			} 
			tmp = elt;
		}
		return -2;
	}
	public static int fib_sr_entry_overwrite(Object table, Object fib_sr, Object addr_old, Object addr_old_size, Object addr_new, Object addr_new_size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (addr_old == ((Object)0)) || (addr_new == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_sr_check_lifetime(fib_sr) == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -2;
		} 
		 elt = new ();
		 elt_repl = new ();
		elt_repl = ((Object)0);
		for (elt = fib_sr.getSr_path(); elt; elt = (elt).getNext()) {
			size_t addr_old_size_match = addr_old_size << 3;
			size_t addr_new_size_match = addr_old_size << 3;
			if (elt.getAddress().universal_address_compare(addr_old, addr_old_size_match) == UNIVERSAL_ADDRESS_EQUAL) {
				elt_repl = elt;
			} 
			if (elt.getAddress().universal_address_compare(addr_new, addr_new_size_match) == UNIVERSAL_ADDRESS_EQUAL) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return -22;
			} 
		}
		if (elt_repl != ((Object)0)) {
			elt_repl.getAddress().universal_address_rem();
			 add = ModernizedCProgram.universal_address_add(addr_new, addr_new_size);
			if (add == ((Object)0/* if this happened we deleted one entry, i.e. decreased the usecount
			             * adding a new one was not possible since lack of memory
			             * so we add back the old entry, i.e. increasing the usecount
			             */)) {
				ModernizedCProgram.universal_address_add(addr_old, addr_old_size);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return -12;
			} 
			elt_repl.setAddress(add);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return 0;
	}
	public static int fib_sr_entry_get_address(Object table, Object fib_sr, Object sr_entry, Object addr, Object addr_size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((fib_sr == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, fib_sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		if (ModernizedCProgram.fib_sr_check_lifetime(fib_sr) == -2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -2;
		} 
		 elt = new ();
		for (elt = fib_sr.getSr_path(); elt; elt = (elt).getNext()) {
			if (elt == sr_entry) {
				if (elt.getAddress().universal_address_get_address(addr, addr_size) != ((Object)0)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
					return 0;
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
						return -12;
				} 
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		return -2/**
		 * @brief helper function to search a partial path to a given destination,
		 *         and iff successful to create a new source route
		 *
		 * @param[in] table the fib table the entry should be added to
		 * @param[in] dst pointer to the destination address bytes
		 * @param[in] dst_size the size in bytes of the destination address type
		 * @param[in] check_free_entry position to start the search for a free entry
		 * @param[out] error the state of of this operation when finished
		 *
		 * @return pointer to the new source route on success
		 *         NULL otherwise
		*/;
	}
	public static Object _fib_create_sr_from_partial(Object table, Object dst, Object dst_size, int check_free_entry, Integer error) {
		 hit = ((Object)0);
		for (size_t i = 0;
		 i < table.getSize(); ++i) {
			if (table.getData().getSource_routes().getHeaders()[i].getSr_lifetime() != 0) {
				 elt = new ();
				for (elt = table.getData().getSource_routes().getHeaders()[i].getSr_path(); elt; elt = (elt).getNext()) {
					size_t addr_size_match = dst_size << 3;
					if (elt.getAddress().universal_address_compare(dst, addr_size_match) == UNIVERSAL_ADDRESS_EQUAL) {
						if (check_free_entry == -/* we create a new sr */1/* we have no room to create a new sr
						                         * so we just retrun and NOT tell the RPs to find a route
						                         * since we cannot save it
						                         */) {
							error = -ENOBUFS;
							return ((Object)0);
						} else {
								 new_sr = ((Object)/* we check if there is a free place for the new sr */0);
								for (size_t j = check_free_entry;
								 j < table.getSize(); ++j) {
									if (table.getData().getSource_routes().getHeaders()[j].getSr_lifetime() != 0/* not this one, maybe the next one */) {
										continue;
									} else {
											new_sr = table.getData().getSource_routes().getHeaders()[/* there it is, so we copy the header */j];
											new_sr.setSr_iface_id(table.getData().getSource_routes().getHeaders()[i].getSr_iface_id());
											new_sr.setSr_flags(table.getData().getSource_routes().getHeaders()[i].getSr_flags());
											new_sr.setSr_lifetime(table.getData().getSource_routes().getHeaders()[i].getSr_lifetime());
											new_sr.setSr_path(((Object)0));
											 elt_iter = new ();
											 elt_add = ((Object)/* and the path until the searched destination */0);
											for (elt_iter = table.getData().getSource_routes().getHeaders()[i].getSr_path(); elt_iter; elt_iter = (elt_iter).getNext()) {
												 new_entry = new ();
												if (ModernizedCProgram.fib_sr_new_entry(table, elt_iter.getAddress().getAddress(), elt_iter.getAddress().getAddress_size(), new_entry) != 0/* we could not create a new entry
												                                         * so we return to clean up the partial route
												                                         */) {
													error = -ENOBUFS;
													return new_sr;
												} 
												if (new_sr.getSr_path() == ((Object)0)) {
													new_sr.setSr_path(new_entry);
													elt_add = new_sr.getSr_path();
												} else {
														elt_add.setNext(new_entry);
														elt_add = elt_add.getNext();
												} 
												if (elt_iter == elt) {
													new_sr.setSr_dest(/* we copied until the destination */new_entry);
													hit = new_sr/* tell the RPs that a new sr has been created
													                                         * the size and the flags parameters are ignored
													                                         */;
													if (ModernizedCProgram.fib_signal_rp(table, FIB_MSG_RP_SIGNAL_SOURCE_ROUTE_CREATED, (uint8_t)new_sr, 0, 0) != 0/* if no RP can handle the source route
													                                             * then the host is not directly reachable
													                                             */) {
														error = -EHOSTUNREACH;
													} 
													break;
												} 
											}
									} 
								}
								break;
						} 
					} 
				}
				if (hit != ((Object)0/* break iterating all sr since we have a path now */)) {
					break;
				} 
			} 
		}
		return hit;
	}
	public static int fib_sr_get_route(Object table, Object dst, Object dst_size, Object sr_iface_id, Object sr_flags, Object addr_list, Object addr_list_elements, Object element_size, Object reverse, Object fib_sr) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((dst == ((Object)0)) || (sr_iface_id == ((Object)0)) || (sr_flags == ((Object)0)) || (addr_list == ((Object)0)) || (addr_list_elements == ((Object)0)) || (element_size == ((Object)0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return -14;
		} 
		 hit = ((Object)0);
		 tmp_hit = ((Object)0);
		int check_free_entry = -1;
		 skip = (fib_sr != ((Object)0)) && (fib_sr != ((Object)0)) ? true : false;
		for (size_t i = 0;
		 i < table.getSize(); ++/* Case 1 - check if we know a direct route */i) {
			if (ModernizedCProgram.fib_sr_check_lifetime(table.getData().getSource_routes().getHeaders()[i]) == -2) {
				if (check_free_entry == -/* expired, so skip this sr and remember its position */1) {
					check_free_entry = /* we want to fill up the source routes from the beginning */i;
				} 
				continue;
			} 
			if (skip) {
				if (fib_sr == table.getData().getSource_routes().getHeaders()[i]) {
					skip = false;
				} 
				continue;
			} 
			size_t addr_size_match = dst_size << 3;
			if (table.getData().getSource_routes().getHeaders()[i].getSr_dest().getAddress().universal_address_compare(dst, addr_size_match) == UNIVERSAL_ADDRESS_EQUAL) {
				if (sr_flags == table.getData().getSource_routes().getHeaders()[i].getSr_flags()) {
					hit = table.getData().getSource_routes().getHeaders()[/* found a perfect matching sr, no need to search further */i];
					tmp_hit = ((Object)0);
					if (check_free_entry == -1) {
						check_free_entry = i;
					} 
					break;
				} else {
						tmp_hit = table.getData().getSource_routes().getHeaders()[/* found a sr to the destination but with different flags,
						                 * maybe we find a better one.
						                 */i];
				} 
			} 
		}
		if (hit == ((Object)0)) {
			hit = /* we didn't find a perfect sr, but one with distinct flags */tmp_hit/* Case 2 - if no hit is found check if there is a matching entry in one sr_path
			     * @note the first match wins, if we find one we will NOT continue searching,
			     * since this search is very expensive in terms of compare operations
			    */;
		} 
		if (hit == ((Object)0)) {
			int error = 0;
			hit = ModernizedCProgram._fib_create_sr_from_partial(table, dst, dst_size, check_free_entry, error);
			if ((error != 0) && (error != -EHOSTUNREACH/* something went wrong, so we clean up our mess
			             *
			             * @note we could handle -EHOSTUNREACH differently here,
			             * since it says that we have a partial source route but no RP
			             * to manage it.
			             * Thats why I let it pass for now.
			             */)) {
				if (hit != ((Object)0)) {
					hit.setSr_lifetime(0);
					if (hit.getSr_path() != ((Object)0)) {
						 elt = new ();
						 tmp = new ();
						for ((elt) = (hit.getSr_path()); (elt) && (); (elt) = tmp) {
							elt.getAddress().universal_address_rem();
							elt.setAddress(((Object)0));
							do {
								int _tmp;
								if ((hit.getSr_path()) == (elt)) {
									(hit.getSr_path()) = (hit.getSr_path()).getNext();
								} else {
										_tmp = hit.getSr_path();
										while (_tmp.getNext() && (_tmp.getNext() != (elt))) {
											_tmp = _tmp.getNext();
										}
										if (_tmp.getNext()) {
											_tmp.setNext(((elt).getNext()));
										} 
								} 
							} while (0);
						}
						hit.setSr_path(((Object)0));
					} 
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return error;
			} 
		} 
		if (hit != ((Object)/* Final step - copy the list in the desired order */0)) {
			if (fib_sr != ((Object)/* store the current hit to enable consecutive searches */0)) {
				fib_sr = hit;
			} 
			int count;
			 elt = ((Object)0);
			{ 
				count = 0;
				for (elt = hit.getSr_path(); elt; elt = (elt).getNext()) {
					++count;
				}
			}
			;
			if (((size_t)count > addr_list_elements) || (/*Error: sizeof expression not supported yet*/ > element_size)) {
				addr_list_elements = count;
				element_size = /*Error: sizeof expression not supported yet*/;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return -ENOBUFS;
			} 
			uint8_t next_entry = /* start copy the individual entries in the desired order */addr_list;
			int one_address_size = element_size;
			if (reverse) {
				next_entry += (count - 1) * /*Error: sizeof expression not supported yet*/;
				one_address_size *= -/* and set the storing direction during the iteration */1;
			} 
			elt = ((Object)0);
			for (elt = hit.getSr_path(); elt; elt = (elt).getNext()) {
				size_t tmp_size = /*Error: sizeof expression not supported yet*/;
				elt.getAddress().universal_address_get_address(next_entry, tmp_size);
				next_entry += one_address_size;
			}
			sr_iface_id = hit.getSr_iface_id();
			sr_flags = hit.getSr_flags();
			addr_list_elements = count;
			element_size = /*Error: sizeof expression not supported yet*/;
		} else {
				ModernizedCProgram.fib_signal_rp(table, FIB_MSG_RP_SIGNAL_UNREACHABLE_DESTINATION, dst, dst_size, /* trigger RPs for route discovery */sr_flags);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
				return -EHOSTUNREACH;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
		if (tmp_hit == ((Object)0)) {
			return 0;
		} else {
				return 1;
		} 
	}
	/* print functions */
	public static void fib_print_notify_rp(Object table) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		for (size_t i = 0;
		 i < FIB_MAX_REGISTERED_RP; ++i) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[fib_print_notify_rp] pid[%d]: %d\n", (int)i, (int)(table.getNotify_rp()[i]));
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
	}
	public static void fib_print_fib_table(Object table) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		for (size_t i = 0;
		 i < table.getSize(); ++i) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[fib_print_table] %d) iface_id: %d, global: %p, next hop: %p, lifetime: %u\n", (int)i, (int)table.getData().getEntries()[i].getIface_id(), (Object)table.getData().getEntries()[i].getGlobal(), (Object)table.getData().getEntries()[i].getNext_hop(), (uint32_t)(table.getData().getEntries()[i].getLifetime() / 1000));
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
	}
	public static void fib_print_sr(Object table, Object sr) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		if ((sr == ((Object)0)) || (ModernizedCProgram.fib_is_sr_in_table(table, sr) == -2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\n-= Source route (%p) =-\nIface: %d\nflags: %x\npath: %p\ndest: ", (Object)sr, sr.getSr_iface_id(), (int)sr.getSr_flags(), (Object)sr.getSr_path());
		if (sr.getSr_dest() != ((Object)0)) {
			sr.getSr_dest().getAddress().universal_address_print_entry();
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Not set.");
		} 
		 nxt = sr.getSr_path();
		while (nxt) {
			nxt.getAddress().universal_address_print_entry();
			nxt = nxt.getNext();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("-= END (%p) =-\n", (Object)sr);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
	}
	public static void fib_print_address(Object entry) {
		uint8_t[] address = new uint8_t();
		size_t addr_size = UNIVERSAL_ADDRESS_SIZE;
		uint8_t ret = entry.universal_address_get_address(address, addr_size);
		if (ret == address) {
			for (size_t i = 0;
			 i < UNIVERSAL_ADDRESS_SIZE; ++i) {
				if (i <= addr_size) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%02x", address[i]);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("  "/* print trailing whitespaces */);
				} 
			}
		} 
	}
	public static void fib_print_routes(Object table) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock((table.getMtx_access()));
		uint64_t now = ModernizedCProgram.xtimer_now_usec64();
		if (table.getTable_type() == FIB_TABLE_TYPE_SH) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%-32s %-17s %-32s %-10s %-16s Interface\n", "Destination", "Flags", "Next Hop", "Flags", "Expires");
			for (size_t i = 0;
			 i < table.getSize(); ++i) {
				if (table.getData().getEntries()[i].getLifetime() != 0) {
					ModernizedCProgram.fib_print_address(table.getData().getEntries()[i].getGlobal());
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" 0x%08x ", table.getData().getEntries()[i].getGlobal_flags());
					if (table.getData().getEntries()[i].getGlobal_flags() & FIB_FLAG_NET_PREFIX_MASK) {
						uint32_t prefix = (table.getData().getEntries()[i].getGlobal_flags() & FIB_FLAG_NET_PREFIX_MASK);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("N /%-3d ", (int)(prefix >> FIB_FLAG_NET_PREFIX_SHIFT));
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("H      ");
					} 
					ModernizedCProgram.fib_print_address(table.getData().getEntries()[i].getNext_hop());
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" 0x%08x ", table.getData().getEntries()[i].getNext_hop_flags());
					if (table.getData().getEntries()[i].getLifetime() != FIB_LIFETIME_NO_EXPIRE) {
						uint64_t tm = table.getData().getEntries()[i].getLifetime() - now;
						if ((int64_t)tm < /* we must interpret the values as signed */0) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%-16s ", "EXPIRED");
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%u.%05u", (uint32_t)(tm / 1000000), (uint32_t)(tm % 1000000));
						} 
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%-16s ", "NEVER");
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%d\n", (int)table.getData().getEntries()[i].getIface_id());
				} 
			}
		}  else if (table.getTable_type() == FIB_TABLE_TYPE_SR) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%-32s %-32s %-6s %-16s Interface\n", "SR Destination", "SR First Hop", "SR Flags", "Expires");
			for (size_t i = 0;
			 i < table.getSize(); ++i) {
				if (table.getData().getSource_routes().getHeaders()[i].getSr_lifetime() != 0) {
					ModernizedCProgram.fib_print_address(table.getData().getSource_routes().getHeaders()[i].getSr_dest().getAddress());
					ModernizedCProgram.fib_print_address(table.getData().getSource_routes().getHeaders()[i].getSr_path().getAddress());
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" 0x%04x ", table.getData().getSource_routes().getHeaders()[i].getSr_flags());
					if (table.getData().getSource_routes().getHeaders()[i].getSr_lifetime() != FIB_LIFETIME_NO_EXPIRE) {
						uint64_t tm = table.getData().getSource_routes().getHeaders()[i].getSr_lifetime() - now;
						if ((int64_t)tm < /* we must interpret the values as signed */0) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%-16s ", "EXPIRED");
						} else {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%u.%05u", (uint32_t)(tm / 1000000), (uint32_t)(tm % 1000000));
						} 
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%-16s ", "NEVER");
					} 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%d\n", (int)table.getData().getSource_routes().getHeaders()[i].getSr_iface_id());
				} 
			}
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock((table.getMtx_access()));
	}
	/* only return lifetime of exact matches */
	/* first hit wins here */
	/* $OpenBSD: fixsfdi.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992 The Regents of the University of California.
	 * All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Convert float to (signed) quad.
	 * We clamp anything that is out of range.
	 *
	 * N.B.: must use new ANSI syntax (sorry).
	 */
	public static Object __fixsfdi(double x) {
		if (x < 0) {
			if (x <= ((--1024 - 1))) {
				return ((--1024 - 1));
			} else {
					return (quad_t)-(u_quad_t)-x;
			} 
		} else {
				if (x >= (true)) {
					return (true);
				} else {
						return (quad_t)(u_quad_t)x;
				} 
		} 
	}
	/*
	 * Copyright (C) 2016 Cenk Gündoğan <cenk.guendogan@haw-hamburg.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     net_gnrc_rpl
	 * @{
	 *
	 * @file
	 * @brief       RPL control message statistics functions
	 *
	 * @author      Cenk Gündoğan <cenk.guendogan@haw-hamburg.de>
	 */
	/**
	 * @brief   Increase statistics for received DIO
	 *
	 * @param[in]   netstats    Pointer to netstats_rpl_t
	 * @param[in]   len         Length in bytes of an ICMPv6 packet to add to statistics
	 * @param[in]   cast        GNRC_RPL_NETSTATS_MULTICAST or GNRC_RPL_NETSTATS_UNICAST
	 */
	public static void gnrc_rpl_netstats_rx_DIO(Object netstats, Object len, int cast) {
		if (cast == (false)) {
			netstats.getDio_rx_mcast_count()++;
			netstats.getDio_rx_mcast_bytes() += len;
		}  else if (cast == (true)) {
			netstats.getDio_rx_ucast_count()++;
			netstats.getDio_rx_ucast_bytes() += len/**
			 * @brief   Increase statistics for sent DIO
			 *
			 * @param[in]   netstats    Pointer to netstats_rpl_t
			 * @param[in]   len         Length in bytes of an ICMPv6 packet to add to statistics
			 * @param[in]   cast        GNRC_RPL_NETSTATS_MULTICAST or GNRC_RPL_NETSTATS_UNICAST
			 */;
		} 
	}
	public static void gnrc_rpl_netstats_tx_DIO(Object netstats, Object len, int cast) {
		if (cast == (false)) {
			netstats.getDio_tx_mcast_count()++;
			netstats.getDio_tx_mcast_bytes() += len;
		}  else if (cast == (true)) {
			netstats.getDio_tx_ucast_count()++;
			netstats.getDio_tx_ucast_bytes() += len/**
			 * @brief   Increase statistics for received DIS
			 *
			 * @param[in]   netstats    Pointer to netstats_rpl_t
			 * @param[in]   len         Length in bytes of an ICMPv6 packet to add to statistics
			 * @param[in]   cast        GNRC_RPL_NETSTATS_MULTICAST or GNRC_RPL_NETSTATS_UNICAST
			 */;
		} 
	}
	public static void gnrc_rpl_netstats_rx_DIS(Object netstats, Object len, int cast) {
		if (cast == (false)) {
			netstats.getDis_rx_mcast_count()++;
			netstats.getDis_rx_mcast_bytes() += len;
		}  else if (cast == (true)) {
			netstats.getDis_rx_ucast_count()++;
			netstats.getDis_rx_ucast_bytes() += len/**
			 * @brief   Increase statistics for sent DIS
			 *
			 * @param[in]   netstats    Pointer to netstats_rpl_t
			 * @param[in]   len         Length in bytes of an ICMPv6 packet to add to statistics
			 * @param[in]   cast        GNRC_RPL_NETSTATS_MULTICAST or GNRC_RPL_NETSTATS_UNICAST
			 */;
		} 
	}
	public static void gnrc_rpl_netstats_tx_DIS(Object netstats, Object len, int cast) {
		if (cast == (false)) {
			netstats.getDis_tx_mcast_count()++;
			netstats.getDis_tx_mcast_bytes() += len;
		}  else if (cast == (true)) {
			netstats.getDis_tx_ucast_count()++;
			netstats.getDis_tx_ucast_bytes() += len/**
			 * @brief   Increase statistics for received DAO
			 *
			 * @param[in]   netstats    Pointer to netstats_rpl_t
			 * @param[in]   len         Length in bytes of an ICMPv6 packet to add to statistics
			 * @param[in]   cast        GNRC_RPL_NETSTATS_MULTICAST or GNRC_RPL_NETSTATS_UNICAST
			 */;
		} 
	}
	public static void gnrc_rpl_netstats_rx_DAO(Object netstats, Object len, int cast) {
		if (cast == (false)) {
			netstats.getDao_rx_mcast_count()++;
			netstats.getDao_rx_mcast_bytes() += len;
		}  else if (cast == (true)) {
			netstats.getDao_rx_ucast_count()++;
			netstats.getDao_rx_ucast_bytes() += len/**
			 * @brief   Increase statistics for sent DIO
			 *
			 * @param[in]   netstats    Pointer to netstats_rpl_t
			 * @param[in]   len         Length in bytes of an ICMPv6 packet to add to statistics
			 * @param[in]   cast        GNRC_RPL_NETSTATS_MULTICAST or GNRC_RPL_NETSTATS_UNICAST
			 */;
		} 
	}
	public static void gnrc_rpl_netstats_tx_DAO(Object netstats, Object len, int cast) {
		if (cast == (false)) {
			netstats.getDao_tx_mcast_count()++;
			netstats.getDao_tx_mcast_bytes() += len;
		}  else if (cast == (true)) {
			netstats.getDao_tx_ucast_count()++;
			netstats.getDao_tx_ucast_bytes() += len/**
			 * @brief   Increase statistics for received DAO-ACK
			 *
			 * @param[in]   netstats    Pointer to netstats_rpl_t
			 * @param[in]   len         Length in bytes of an ICMPv6 packet to add to statistics
			 * @param[in]   cast        GNRC_RPL_NETSTATS_MULTICAST or GNRC_RPL_NETSTATS_UNICAST
			 */;
		} 
	}
	public static void gnrc_rpl_netstats_rx_DAO_ACK(Object netstats, Object len, int cast) {
		if (cast == (false)) {
			netstats.getDao_ack_rx_mcast_count()++;
			netstats.getDao_ack_rx_mcast_bytes() += len;
		}  else if (cast == (true)) {
			netstats.getDao_ack_rx_ucast_count()++;
			netstats.getDao_ack_rx_ucast_bytes() += len/**
			 * @brief   Increase statistics for sent DAO-ACK
			 *
			 * @param[in]   netstats    Pointer to netstats_rpl_t
			 * @param[in]   len         Length in bytes of an ICMPv6 packet to add to statistics
			 * @param[in]   cast        GNRC_RPL_NETSTATS_MULTICAST or GNRC_RPL_NETSTATS_UNICAST
			 */;
		} 
	}
	public static void gnrc_rpl_netstats_tx_DAO_ACK(Object netstats, Object len, int cast) {
		if (cast == (false)) {
			netstats.getDao_ack_tx_mcast_count()++;
			netstats.getDao_ack_tx_mcast_bytes() += len;
		}  else if (cast == (true)) {
			netstats.getDao_ack_tx_ucast_count()++;
			netstats.getDao_ack_tx_ucast_bytes() += len;
		} 
	}
	/* NETSTATS_H */
	/** @} */
	/* $OpenBSD: lshrdi3.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Shift an (unsigned) quad value right (logical shift right).
	 */
	public static Object __lshrdi3(Object a, Object shift) {
		Object aa;
		if (shift == 0) {
			return a;
		} 
		aa.setQ(a);
		Object generatedUl = aa.getUl();
		if (shift >= (/*Error: Unsupported expression*/ * 8)) {
			generatedUl[(false)] = generatedUl[(true)] >> (shift - (/*Error: Unsupported expression*/ * 8));
			generatedUl[(true)] = 0;
		} else {
				generatedUl[(false)] = (generatedUl[(false)] >> shift) | (generatedUl[(true)] << ((/*Error: Unsupported expression*/ * 8) - shift));
				generatedUl[(true)] >>=  shift;
		} 
		Object generatedQ = aa.getQ();
		return generatedQ;
	}
	public static void phydat_fit(Object[] values, int dim) {
		Object generatedVal = this.getVal();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(dim <= /*Error: Function owner not recognized*/ARRAY_SIZE(generatedVal));
		uint32_t divisor = 0;
		uint32_t max = 0;
		uint32_t lookup = ModernizedCProgram.lookup_table_positive/* Get the value with the highest magnitude and the correct lookup table.
		     * If PHYDAT_FIT_TRADE_PRECISION_FOR_ROM is true, the same lookup table will
		     * be used for both positive and negative values. As result, -32768 will be
		     * considered as out of range and scaled down. So statistically in 0.00153%
		     * of the cases an unneeded scaling is performed, when
		     * PHYDAT_FIT_TRADE_PRECISION_FOR_ROM is true.
		     */;
		for (int i = 0;
		 i < dim; i++) {
			if (values[i] > (int32_t)max) {
				max = values[i];
			}  else if (-values[i] > (int32_t)max) {
				max = -values[i];
			} 
		}
		Object generatedScale = this.getScale();
		for (int i = 0;
		 i < /*Error: Function owner not recognized*/ARRAY_SIZE(ModernizedCProgram.lookup_table_positive); i++) {
			if (max > lookup[i]) {
				divisor = ModernizedCProgram.divisors[i];
				generatedScale += 5 - i;
				break;
			} 
		}
		if (!divisor) {
			for (int i = 0;
			 i < dim; /* No rescaling required */i++) {
				generatedVal[i] = values[i];
			}
			return /*Error: Unsupported expression*/;
		} 
		uint32_t divisor_half = divisor >> /* Applying scale and add half of the divisor for correct rounding */1;
		for (int i = 0;
		 i < dim; i++) {
			if (values[i] >= 0) {
				generatedVal[i] = (uint32_t)(values[i] + divisor_half) / divisor/* For negative integers the C standards seems to lack information
				             * on whether to round down or towards zero. So using positive
				             * integer division as last resort here.
				             */;
			} else {
					generatedVal[i] = -((uint32_t)((-values[i]) + divisor_half) / divisor);
			} 
		}
	}
	public static void _del_cb(Object ptr) {
		 ctx = ptr;
		uint8_t cid = ctx.getFlags_id() & GNRC_SIXLOWPAN_CTX_FLAGS_CID_MASK;
		ctx.setPrefix_len(0);
		ModernizedCProgram.del_timer[cid].setCallback(((Object)0));
	}
	public static void _usage(Byte cmd_str) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s [{add <0-15> <prefix>/<prefix_len> <ltime in min>|del <ctx>}]\n", cmd_str);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("       `del` will only invalidate the context for compression. It can be");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("       reassigned after 5 min.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Usage: %s <server addr>[%%<interface>] [<timeout in us>]\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("default: timeout = %lu\n", (true));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: * %s\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Lists all addresses in the whitelist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s add <addr>\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Adds <addr> to the whitelist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s del <addr>\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Deletes <addr> from the whitelist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s help\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Print this.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: * %s\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Lists all addresses in the blacklist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s add <addr>\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Adds <addr> to the blacklist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s del <addr>\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Deletes <addr> from the blacklist.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       * %s help\n", cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("         Print this.");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s\n", cmd);
		ModernizedCProgram._set_usage(cmd);
		ModernizedCProgram._flag_usage(cmd);
		ModernizedCProgram._add_usage(cmd);
		ModernizedCProgram._del_usage(cmd);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s {neigh|prefix|route|help} ...\n", argv[/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C */0/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C */]);
	}
	public static int _gnrc_6ctx_list() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("cid|prefix                                     |C|ltime");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("-----------------------------------------------------------");
		for (uint8_t cid = 0;
		 cid < GNRC_SIXLOWPAN_CTX_SIZE; cid++) {
			 ctx = /*Error: Function owner not recognized*/gnrc_sixlowpan_ctx_lookup_id(cid);
			if (ModernizedCProgram.ctx != ((Object)0)) {
				byte[] addr_str = new byte[IPV6_ADDR_MAX_STR_LEN];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" %2u|%39s/%-3u|%x|%5umin\n", cid, ModernizedCProgram.ipv6_addr_to_str(addr_str, ModernizedCProgram.ctx.getPrefix(), /*Error: sizeof expression not supported yet*/), ModernizedCProgram.ctx.getPrefix_len(), (uint8_t)((ModernizedCProgram.ctx.getFlags_id() & -1024) >> 4), ModernizedCProgram.ctx.getLtime());
			} 
		}
		return 0;
	}
	public static int _gnrc_6ctx_add(Byte cmd_str, Byte ctx_str, Byte prefix_str, Byte ltime_str) {
		 prefix = new ();
		byte addr_str;
		byte prefix_len_str;
		byte save_ptr;
		int prefix_len;
		int ltime;
		int ctx = /*Error: Function owner not recognized*/atoi(ctx_str);
		if (ctx >= GNRC_SIXLOWPAN_CTX_SIZE) {
			ModernizedCProgram._usage(cmd_str);
			return 1;
		} 
		addr_str = /*Error: Function owner not recognized*/strtok_r(prefix_str, "/", save_ptr);
		if (addr_str == ((Object)0)) {
			ModernizedCProgram._usage(cmd_str);
			return 1;
		} 
		prefix_len_str = /*Error: Function owner not recognized*/strtok_r(((Object)0), "/", save_ptr);
		if (prefix_len_str == ((Object)0)) {
			ModernizedCProgram._usage(cmd_str);
			return 1;
		} 
		prefix_len = /*Error: Function owner not recognized*/atoi(prefix_len_str);
		if ((prefix_len - -1024) > -1024) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("ERROR: prefix_len < 1 || prefix_len > 128");
			return 1;
		} 
		ModernizedCProgram.ipv6_addr_from_str(prefix, addr_str);
		if (/*Error: Function owner not recognized*/ipv6_addr_is_unspecified(prefix)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("ERROR: prefix may not be ::");
			return 1;
		} 
		ltime = /*Error: Function owner not recognized*/atoi(ltime_str);
		if (/*Error: Function owner not recognized*/gnrc_sixlowpan_ctx_update((uint8_t)ctx, prefix, (uint8_t)prefix_len, ltime, true) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("ERROR: can not add context");
			return 1;
		} 
		return 0;
	}
	public static int _gnrc_6ctx_del(Byte cmd_str, Byte ctx_str) {
		 ctx = new ();
		int cid = /*Error: Function owner not recognized*/atoi(ctx_str);
		if (cid >= GNRC_SIXLOWPAN_CTX_SIZE) {
			ModernizedCProgram._usage(cmd_str);
			return 1;
		}  else if (ModernizedCProgram.del_timer[cid].getCallback() == ((Object)0)) {
			ctx = /*Error: Function owner not recognized*/gnrc_sixlowpan_ctx_lookup_id(cid);
			if (ctx != ((Object)0)) {
				ctx.getFlags_id() &=  ~GNRC_SIXLOWPAN_CTX_FLAGS_COMP;
				ctx.setLtime(0);
				ModernizedCProgram.del_timer[cid].setCallback(_del_cb);
				ModernizedCProgram.del_timer[cid].setArg(ctx);
				ModernizedCProgram.xtimer_set(ModernizedCProgram.del_timer[cid], SIXLOWPAN_ND_MIN_CTX_CHANGE_SEC_DELAY * (true));
			} 
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Context %u already marked for removal\n", cid);
				return 1;
		} 
		return 0;
	}
	public static int _gnrc_6ctx(int argc, byte[][] argv) {
		if (argc < 2) {
			ModernizedCProgram._gnrc_6ctx_list();
		}  else if (/*Error: Function owner not recognized*/strcmp("add", argv[1]) == 0) {
			if (argc < 5) {
				ModernizedCProgram._usage(argv[0]);
				return 1;
			} 
			return ModernizedCProgram._gnrc_6ctx_add(argv[0], argv[2], argv[3], argv[4]);
		}  else if (/*Error: Function owner not recognized*/strcmp("del", argv[1]) == 0) {
			return ModernizedCProgram._gnrc_6ctx_del(argv[0], argv[2]);
		} else {
				ModernizedCProgram._usage(argv[0]);
				return 1;
		} 
		return 0/** @} */;
	}
	public static Object pthread_start_routine(Object pt_) {
		pthread_thread_t pt = pt_;
		Object generatedArg = pt.getArg();
		Object retval = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedArg);
		ModernizedCProgram.pthread_exit(retval);
	}
	public static int insert() {
		int result = KERNEL_PID_UNDEF;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.pthread_mutex);
		for (int i = 0;
		 i < MAXTHREADS; i++) {
			if (!ModernizedCProgram.pthread_sched_threads[i]) {
				ModernizedCProgram.pthread_sched_threads[i] = pt;
				result = i + 1;
				break;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.pthread_mutex);
		return result;
	}
	public static Object pthread_reaper(Object arg) {
		(Object)arg;
		while (1) {
			 m = new ();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_receive(m);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("pthread_reaper(): free(%p)\n", m.getContent().getPtr());
			ModernizedCProgram.free(m.getContent().getPtr());
		}
		return ((Object)0);
	}
	public static int pthread_create(Object newthread, Object attr, Object start_routine, Object arg) {
		pthread_thread_t pt = ModernizedCProgram.calloc(1, /*Error: Unsupported expression*/);
		if (pt == ((Object)0)) {
			return -12;
		} 
		 pthread_pid = pt.insert();
		if (pthread_pid == KERNEL_PID_UNDEF) {
			ModernizedCProgram.free(pt);
			return -1;
		} 
		newthread = pthread_pid;
		pt.setStatus(attr && attr.getDetached() ? .PTS_DETACHED : .PTS_RUNNING);
		pt.setStart_routine(start_routine);
		pt.setArg(arg);
		boolean autofree = attr == ((Object)0) || attr.getSs_sp() == ((Object)0) || attr.getSs_size() == 0;
		size_t stack_size = attr && attr.getSs_size() > 0 ? attr.getSs_size() : THREAD_STACKSIZE_DEFAULT;
		Object stack = autofree ? ModernizedCProgram.malloc(stack_size) : attr.getSs_sp();
		if (stack == ((Object)0)) {
			ModernizedCProgram.free(pt);
			return -12;
		} 
		pt.setStack(autofree ? stack : ((Object)0));
		if (autofree && ModernizedCProgram.pthread_reaper_pid != KERNEL_PID_UNDEF) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.pthread_mutex);
			if (ModernizedCProgram.pthread_reaper_pid != KERNEL_PID_UNDEF) {
				 pid = /*Error: Function owner not recognized*/thread_create(/* volatile pid to overcome problems with double checking */ModernizedCProgram.pthread_reaper_stack, THREAD_STACKSIZE_DEFAULT, 0, THREAD_CREATE_STACKTEST, pthread_reaper, ((Object)0), "pthread-reaper");
				ModernizedCProgram.pthread_reaper_pid = pid;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.pthread_mutex);
		} 
		pt.setThread_pid(/*Error: Function owner not recognized*/thread_create(stack, stack_size, THREAD_PRIORITY_MAIN, THREAD_CREATE_WOUT_YIELD | THREAD_CREATE_STACKTEST, pthread_start_routine, pt, "pthread"));
		Object generatedThread_pid = pt.getThread_pid();
		Object generatedStack = pt.getStack();
		if (!/*Error: Function owner not recognized*/pid_is_valid(generatedThread_pid)) {
			ModernizedCProgram.free(generatedStack);
			ModernizedCProgram.free(pt);
			ModernizedCProgram.pthread_sched_threads[pthread_pid - 1] = ((Object)0);
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_switch(THREAD_PRIORITY_MAIN);
		return 0;
	}
	public static void pthread_exit(Object retval) {
		pthread_t self_id = ModernizedCProgram.pthread_self();
		Object generatedCleanup_top = self.getCleanup_top();
		__pthread_cleanup_datum generated__next = ct.get__next();
		Object generated__arg = ct.get__arg();
		Object generatedStatus = self.getStatus();
		Object generatedJoining_thread = self.getJoining_thread();
		Object generatedStack = self.getStack();
		if (self_id == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("ERROR called pthread_self() returned 0 in \"%s\"!\n", __func__);
		} else {
				pthread_thread_t self = ModernizedCProgram.pthread_sched_threads[self_id - 1];
				while (generatedCleanup_top) {
					__pthread_cleanup_datum_t ct = generatedCleanup_top;
					self.setCleanup_top(generated__next);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generated__arg);
				}
				Object __pthread_keys_exit;
				if (ModernizedCProgram.__pthread_keys_exit) {
					ModernizedCProgram.__pthread_keys_exit(self_id);
				} 
				self.setThread_pid(KERNEL_PID_UNDEF);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("pthread_exit(%p), self == %p\n", retval, (Object)self);
				if (generatedStatus != .PTS_DETACHED) {
					self.setReturnval(retval);
					self.setStatus(.PTS_ZOMBIE);
					if (generatedJoining_thread) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/thread_wakeup(generatedJoining_thread);
					} 
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_disable();
				if (generatedStack) {
					 m = new ();
					m.getContent().setPtr(generatedStack);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_send_int(m, ModernizedCProgram.pthread_reaper_pid);
				} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_task_exit();
	}
	public static int pthread_join(Object th, Object thread_return) {
		if (th < 1 || th > MAXTHREADS) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("passed pthread_t th (%d) exceeds bounds of pthread_sched_threads[] in \"%s\"!\n", th, __func__);
			return -3;
		} 
		pthread_thread_t other = ModernizedCProgram.pthread_sched_threads[th - 1];
		if (!other) {
			return -1;
		} 
		Object generatedReturnval = other.getReturnval();
		Object generatedStatus = other.getStatus();
		switch (generatedStatus) {
		case (.PTS_DETACHED):
				return -1;
		case (/* falls through */.PTS_ZOMBIE):
				if (thread_return) {
					thread_return = generatedReturnval;
				} 
				ModernizedCProgram.free(other/* we only need to free the pthread layer struct,
				            native thread stack is freed by other */);
				ModernizedCProgram.pthread_sched_threads[th - 1] = ((Object)0);
				return 0;
		case (.PTS_RUNNING):
				other.setJoining_thread(sched_active_pid);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/thread_sleep();
		}
		return -2;
	}
	public static int pthread_detach(Object th) {
		if (th < 1 || th > MAXTHREADS) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("passed pthread_t th (%d) exceeds bounds of pthread_sched_threads[] in \"%s\"!\n", th, __func__);
			return -2;
		} 
		pthread_thread_t other = ModernizedCProgram.pthread_sched_threads[th - 1];
		if (!other) {
			return -1;
		} 
		Object generatedStatus = other.getStatus();
		if (generatedStatus == .PTS_ZOMBIE) {
			ModernizedCProgram.free(other/* we only need to free the pthread layer struct,
			        native thread stack is freed by other */);
			ModernizedCProgram.pthread_sched_threads[th - 1] = ((Object)0);
		} else {
				other.setStatus(.PTS_DETACHED);
		} 
		return 0;
	}
	public static Object pthread_self() {
		pthread_t result = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.pthread_mutex);
		 pid = /* sched_active_pid is volatile */sched_active_pid;
		for (int i = 0;
		 i < MAXTHREADS; i++) {
			if (ModernizedCProgram.pthread_sched_threads[i] && ModernizedCProgram.pthread_sched_threads[i].getThread_pid() == pid) {
				result = i + 1;
				break;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.pthread_mutex);
		return result;
	}
	public static int pthread_cancel(Object th) {
		pthread_thread_t other = ModernizedCProgram.pthread_sched_threads[th - 1];
		if (!other) {
			return -1;
		} 
		other.setShould_cancel(1);
		return 0;
	}
	public static int pthread_setcancelstate(int state, Integer oldstate) {
		(Object)state;
		(Object)oldstate;
		return -1;
	}
	public static int pthread_setcanceltype(int type, Integer oldtype) {
		(Object)type;
		(Object)oldtype;
		return -1;
	}
	public static void pthread_testcancel() {
		pthread_t self = ModernizedCProgram.pthread_self();
		if (self == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("ERROR called pthread_self() returned 0 in \"%s\"!\n", __func__);
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.pthread_sched_threads[self - 1].getShould_cancel()) {
			ModernizedCProgram.pthread_exit(((Object)-2));
		} 
	}
	public static Object sixlowpan_nd_opt_6ctx_is_comp(Object ctx_opt) {
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ctx_opt.getResv_c_cid() & (true/**
		 * @brief   Gets a CID (context identifier) from a 6LoWPAN context option.
		 *
		 * @param[in] ctx_opt   A 6LoWPAN context option.
		 *
		 * @return  The CID in the 6LoWPAN context option @p ctx_opt.
		 */));
	}
	public static Object sixlowpan_nd_opt_6ctx_get_cid(Object ctx_opt) {
		return (ctx_opt.getResv_c_cid() & (true/**
		 * @brief   Sets a CID (context identifier) for a 6LoWPAN context option.
		 *
		 * @param[out] ctx_opt  A 6LoWPAN context option.
		 * @param[in] cid       The CID for the 6LoWPAN context option.
		 */));
	}
	public static void sixlowpan_nd_opt_6ctx_set_cid(Object cid) {
		Object generatedResv_c_cid = this.getResv_c_cid();
		generatedResv_c_cid &=  ~(true);
		generatedResv_c_cid |=  ((true) & cid/**
		 * @brief   Gets the version in correct order from an Authoritative Border
		 *          Router option
		 *
		 * @param[in] abr_opt   An Authoritative Border Router option (ABRO).
		 *
		 * @return  The version of the ABRO
		 */);
	}
	public static Object sixlowpan_nd_opt_abr_get_version(Object abr_opt) {
		return ((uint32_t)/*Error: Function owner not recognized*/byteorder_ntohs(abr_opt.getVlow())) | (((uint32_t)/*Error: Function owner not recognized*/byteorder_ntohs(abr_opt.getVhigh())) << 16/**
		 * @brief   Sets the version of an Authoritative Border Router option
		 *
		 * @param[in] abr_opt   An Authoritative Border Router option (ABRO).
		 * @param[in] version   Version for the ABRO.
		 */);
	}
	public static void sixlowpan_nd_opt_abr_set_version(Object version) {
		this.setVlow(/*Error: Function owner not recognized*/byteorder_htons((uint16_t)(version & -1024)));
		this.setVhigh(/*Error: Function owner not recognized*/byteorder_htons((uint16_t)(version >> 16)));
	}
	/* NET_SIXLOWPAN_ND_H */
	/** @} */
	/*
	 * Copyright (C) 2018 Koen Zandberg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup usb_usbus_fmt
	 * @{
	 * @file
	 * @brief   USBUS protocol message formatting functions
	 *
	 * @author  Koen Zandberg <koen@bergzand.net>
	 * @}
	 */
	public static Object _num_ifaces(Object usbus) {
		size_t num = 0;
		for ( iface = usbus.getIface();
		 iface; iface = iface.getNext()) {
			num++;
		}
		return num;
	}
	public static Object _num_endpoints(Object iface) {
		size_t num = 0;
		for ( ep = iface.getEp();
		 ep; ep = ep.getNext()) {
			num++;
		}
		return num;
	}
	public static Object _type_to_attribute(Object ep) {
		switch (ep.getEp().getType()) {
		case USB_EP_TYPE_ISOCHRONOUS:
				return -1024;
		case USB_EP_TYPE_CONTROL:
				return -1024;
		case USB_EP_TYPE_BULK:
				return -1024;
		case USB_EP_TYPE_INTERRUPT:
				return -1024;
		default:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(false);
				break;
		}
		return -1024;
	}
	public static Object _num_endpoints_alt(Object alt) {
		size_t num = 0;
		for ( ep = alt.getEp();
		 ep; ep = ep.getNext()) {
			num++;
		}
		return num;
	}
	public static Object call_get_header_len(Object usbus, Object hdr) {
		return hdr.getFuncs().getLen_type() == USBUS_HDR_LEN_FIXED ? hdr.getFuncs().getLen().getFixed_len() : /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(usbus, hdr.getArg());
	}
	public static Object _hdr_gen_size(Object usbus, Object hdr) {
		size_t len = 0;
		for (; hdr; hdr = hdr.getNext()) {
			len += ModernizedCProgram.call_get_header_len(usbus, hdr);
		}
		return len;
	}
	public static Object _ep_size(Object usbus, Object ep) {
		size_t len = 0;
		for (; ep; ep = ep.getNext()) {
			len += /*Error: Unsupported expression*/;
			len += ModernizedCProgram._hdr_gen_size(usbus, ep.getHdr_gen());
		}
		return len;
	}
	public static Object _alt_size(Object usbus, Object alt) {
		size_t len = 0;
		for (; alt; alt = alt.getNext()) {
			len += /*Error: Unsupported expression*/;
			len += ModernizedCProgram._hdr_gen_size(usbus, alt.getHdr_gen());
			len += ModernizedCProgram._ep_size(usbus, alt.getEp());
		}
		return len;
	}
	public static Object _hdrs_config_size(Object usbus) {
		size_t len = /*Error: Unsupported expression*/;
		len += ModernizedCProgram._hdr_gen_size(usbus, usbus.getHdr_gen());
		for ( iface = usbus.getIface();
		 iface; iface = iface.getNext()) {
			len += /*Error: Unsupported expression*/;
			len += ModernizedCProgram._hdr_gen_size(usbus, iface.getHdr_gen());
			len += ModernizedCProgram._ep_size(usbus, iface.getEp());
			len += ModernizedCProgram._alt_size(usbus, iface.getAlts());
		}
		return len;
	}
	public static Object _get_pre_header(Object usbus, Object hdr) {
		return (hdr.getFuncs().getFmt_pre_descriptor() != ((Object)0)) ? /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(usbus, hdr.getArg()) : 0;
	}
	public static Object _get_additional_header(Object usbus, Object hdr) {
		return (hdr.getFuncs().getGet_header() != ((Object)0)) ? /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(usbus, hdr.getArg()) : 0;
	}
	public static Object _hdrs_fmt_pre(Object usbus, Object hdr) {
		size_t len = 0;
		for (; hdr; hdr = hdr.getNext()) {
			len += ModernizedCProgram._get_pre_header(usbus, hdr);
		}
		return len;
	}
	public static Object _hdrs_fmt_additional(Object usbus, Object hdr) {
		size_t len = 0;
		for (; hdr; hdr = hdr.getNext()) {
			len += ModernizedCProgram._get_additional_header(usbus, hdr);
		}
		return len;
	}
	public static Object _hdrs_fmt_hdrs(Object usbus) {
		return ModernizedCProgram._hdrs_fmt_additional(usbus, usbus.getHdr_gen());
	}
	public static Object _hdrs_fmt_endpoints(Object usbus, Object ep) {
		size_t len = 0;
		while (ep) {
			ModernizedCProgram._hdrs_fmt_pre(usbus, ep.getHdr_gen());
			 usb_ep = new ();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(usb_ep, 0, /*Error: Unsupported expression*/);
			usb_ep.setLength(/*Error: Unsupported expression*/);
			usb_ep.setType(USB_TYPE_DESCRIPTOR_ENDPOINT);
			usb_ep.setAddress(ep.getEp().getNum());
			if (ep.getEp().getDir() == USB_EP_DIR_IN) {
				usb_ep.getAddress() |=  -1024;
			} 
			usb_ep.setAttributes(ModernizedCProgram._type_to_attribute(ep));
			usb_ep.setMax_packet_size(ep.getMaxpacketsize());
			usb_ep.setInterval(ep.getInterval());
			ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, ()usb_ep, /*Error: Unsupported expression*/);
			ModernizedCProgram._hdrs_fmt_additional(usbus, ep.getHdr_gen());
			len += usb_ep.getLength();
			ep = ep.getNext();
		}
		return len;
	}
	public static void _hdrs_fmt_iface(Object iface, Object usb_iface) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(usb_iface, 0, /*Error: Unsupported expression*/);
		usb_iface.setLength(/*Error: Unsupported expression*/);
		usb_iface.setType(USB_TYPE_DESCRIPTOR_INTERFACE);
		usb_iface.setInterface_num(iface.getIdx());
		usb_iface.setClass(iface.getClass());
		usb_iface.setSubclass(iface.getSubclass());
		usb_iface.setProtocol(iface.getProtocol());
	}
	public static Object _hdrs_fmt_iface_alts(Object usbus, Object iface) {
		size_t len = 0;
		 alts = 1;
		for ( alt = iface.getAlts();
		 alt; alt = alt.getNext()) {
			 usb_iface = new ();
			ModernizedCProgram._hdrs_fmt_iface(iface, usb_iface);
			usb_iface.setAlternate_setting(alts++);
			usb_iface.setNum_endpoints(ModernizedCProgram._num_endpoints_alt(alt));
			ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, ()usb_iface, /*Error: Unsupported expression*/);
			len += ModernizedCProgram._hdrs_fmt_additional(usbus, alt.getHdr_gen());
			len += ModernizedCProgram._hdrs_fmt_endpoints(usbus, alt.getEp());
		}
		return len;
	}
	public static Object _hdrs_fmt_ifaces(Object usbus) {
		size_t len = 0;
		for ( iface = usbus.getIface();
		 iface; iface = iface.getNext()) {
			len += ModernizedCProgram._hdrs_fmt_pre(usbus, iface.getHdr_gen());
			 usb_iface = new ();
			ModernizedCProgram._hdrs_fmt_iface(iface, usb_iface);
			usb_iface.setNum_endpoints(ModernizedCProgram._num_endpoints(iface));
			if (iface.getDescr()) {
				usb_iface.setIdx(iface.getDescr().getIdx());
			} else {
					usb_iface.setIdx(0);
			} 
			ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, ()usb_iface, /*Error: Unsupported expression*/);
			len += /*Error: Unsupported expression*/;
			len += ModernizedCProgram._hdrs_fmt_additional(usbus, iface.getHdr_gen());
			len += ModernizedCProgram._hdrs_fmt_endpoints(usbus, iface.getEp());
			len += ModernizedCProgram._hdrs_fmt_iface_alts(usbus, iface);
		}
		return len;
	}
	public static Object usbus_fmt_hdr_conf(Object usbus) {
		size_t len = 0;
		 conf = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(conf, 0, /*Error: Unsupported expression*/);
		conf.setLength(/*Error: Unsupported expression*/);
		conf.setType(USB_TYPE_DESCRIPTOR_CONFIGURATION);
		conf.setTotal_length(/*Error: Unsupported expression*/);
		conf.setVal(1);
		conf.setAttributes(USB_CONF_ATTR_RESERVED);
		if (USB_CONFIG_SELF_POWERED) {
			conf.getAttributes() |=  USB_CONF_ATTR_SELF_POWERED;
		} 
		conf.setMax_power(USB_CONFIG_MAX_POWER / /* TODO: upper bound *//* USB max power is reported in increments of 2 mA */2);
		conf.setNum_interfaces(ModernizedCProgram._num_ifaces(usbus));
		len += /*Error: Unsupported expression*/;
		conf.setTotal_length(ModernizedCProgram._hdrs_config_size(usbus));
		conf.setIdx(usbus.getConfig().getIdx());
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, ()conf, /*Error: sizeof expression not supported yet*/);
		len += ModernizedCProgram._hdrs_fmt_hdrs(usbus);
		len += ModernizedCProgram._hdrs_fmt_ifaces(usbus);
		return len;
	}
	public static Object usbus_fmt_hdr_dev(Object usbus) {
		 desc = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(desc, 0, /*Error: Unsupported expression*/);
		desc.setLength(/*Error: Unsupported expression*/);
		desc.setType(USB_TYPE_DESCRIPTOR_DEVICE);
		desc.setBcd_usb(USB_CONFIG_SPEC_BCDVERSION);
		desc.setMax_packet_size(USBUS_EP0_SIZE);
		desc.setVendor_id(USB_CONFIG_VID);
		desc.setProduct_id(USB_CONFIG_PID);
		desc.setManufacturer_idx(usbus.getManuf().getIdx());
		desc.setProduct_idx(usbus.getProduct().getIdx());
		desc.setNum_configurations(/* USBUS supports only a single config at the moment */1);
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, ()desc, /*Error: Unsupported expression*/);
		return /*Error: Unsupported expression*/;
	}
	public static int suit_cbor_map_iterate_init(Object map, Object it) {
		if (/*Error: Function owner not recognized*/nanocbor_get_type(map) != NANOCBOR_TYPE_MAP) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit_v4_parse(): manifest not a map\n)");
			return SUIT_ERR_INVALID_MANIFEST;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_enter_map(map, it);
		return SUIT_OK;
	}
	public static int suit_cbor_map_iterate(Object it, Object key, Object value) {
		if (/*Error: Function owner not recognized*/nanocbor_at_end(it)) {
			return 0;
		} 
		key = it;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_skip(it);
		value = it;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_skip(it);
		return 1;
	}
	public static int suit_cbor_get_int32(Object it, Object out) {
		int res = /*Error: Function owner not recognized*/nanocbor_get_int32(it, out);
		if (res < NANOCBOR_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("suit_cbor_get_int32() error %u\n", res);
			return SUIT_ERR_INVALID_MANIFEST;
		} 
		return SUIT_OK;
	}
	public static int suit_cbor_get_string(Object it, Object buf, Object len) {
		if (/*Error: Function owner not recognized*/nanocbor_get_type(it) == NANOCBOR_TYPE_TSTR) {
			if (/*Error: Function owner not recognized*/nanocbor_get_tstr(it, buf, len) < 0) {
				return SUIT_ERR_INVALID_MANIFEST;
			} 
			return SUIT_OK;
		}  else if (/*Error: Function owner not recognized*/nanocbor_get_type(it) == NANOCBOR_TYPE_BSTR) {
			if (/*Error: Function owner not recognized*/nanocbor_get_bstr(it, buf, len) < 0) {
				return SUIT_ERR_INVALID_MANIFEST;
			} 
			return SUIT_OK;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("suit_cbor_get_string(): unexpected type: %i\n", /*Error: Function owner not recognized*/nanocbor_get_type(it));
				return SUIT_ERR_INVALID_MANIFEST;
		} 
	}
	public static int suit_cbor_get_uint32(Object it, Object out) {
		if (/*Error: Function owner not recognized*/nanocbor_get_uint32(it, out) < 0) {
			return SUIT_ERR_INVALID_MANIFEST;
		} 
		return SUIT_OK;
	}
	public static int suit_cbor_get_uint(Object it, Integer out) {
		return ModernizedCProgram.suit_cbor_get_uint32(it, (uint32_t)out);
	}
	public static int suit_cbor_subparse(Object bseq, Object it) {
		uint8_t bytes = new uint8_t();
		size_t bytes_len = 0;
		int res = ModernizedCProgram.suit_cbor_get_string(bseq, bytes, bytes_len);
		if (res != SUIT_OK) {
			return res;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_decoder_init(it, bytes, bytes_len);
		return SUIT_OK;
	}
	public static int _v4_parse(Object manifest, Object buf, Object len, Object getter) {
		 it = new ();
		 map = new ();
		 key = new ();
		 value = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_decoder_init(it, buf, len);
		map = it;
		if (ModernizedCProgram.suit_cbor_map_iterate_init(map, it) != SUIT_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_DEBUG("suit _v4_parse(): manifest not a map!\n");
			return SUIT_ERR_INVALID_MANIFEST;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nanocbor_leave_container(map, it);
		return SUIT_OK;
	}
	public static int suit_v4_parse(Object manifest, Object buf, Object len) {
		manifest.setBuf(buf);
		manifest.setLen(len);
		return ModernizedCProgram._v4_parse(manifest, buf, len, ModernizedCProgram._manifest_get_auth_wrapper_handler);
	}
	public static int _auth_handler(Object manifest, int key, Object it) {
		(Object)key;
		uint8_t cose_buf = new uint8_t();
		size_t cose_len = 0;
		int res = ModernizedCProgram.suit_cbor_get_string(it, cose_buf, cose_len);
		if (res < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("Unable to get COSE signature\n");
			return SUIT_ERR_INVALID_MANIFEST;
		} 
		res = /*Error: Function owner not recognized*/cose_sign_decode(manifest.getVerify(), cose_buf, cose_len);
		if (res < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("Unable to parse COSE signature\n");
			return SUIT_ERR_INVALID_MANIFEST;
		} 
		return 0;
	}
	public static int _manifest_handler(Object manifest, int key, Object it) {
		(Object)key;
		uint8_t manifest_buf = new uint8_t();
		size_t manifest_len = new size_t();
		ModernizedCProgram.suit_cbor_get_string(it, manifest_buf, manifest_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/cose_sign_decode_set_payload(manifest.getVerify(), manifest_buf, /* Validate the COSE struct first now that we have the payload */manifest_len);
		/* Iterate over signatures, should only be a single signature */ signature = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/cose_sign_signature_iter_init(signature);
		if (!/*Error: Function owner not recognized*/cose_sign_signature_iter(manifest.getVerify(), signature)) {
			return SUIT_ERR_INVALID_MANIFEST;
		} 
		/* Initialize key from hardcoded public key */ pkey = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/cose_key_init(pkey);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/cose_key_set_keys(pkey, COSE_EC_CURVE_ED25519, COSE_ALGO_EDDSA, public_key, ((Object)0), ((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit: verifying manifest signature...\n");
		int verification = /*Error: Function owner not recognized*/cose_sign_verify(manifest.getVerify(), signature, pkey, manifest.getValidation_buf(), SUIT_COSE_BUF_SIZE);
		if (verification != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("Unable to validate signature\n");
			return SUIT_ERR_SIGNATURE;
		} 
		return ModernizedCProgram._v4_parse(manifest, manifest_buf, manifest_len, ModernizedCProgram.suit_manifest_get_manifest_handler);
	}
	/*
	 * Copyright (C) 2018 Freie Universität Berlin
	 * Copyright (C) 2018 Inria
	 *               2019 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_suit
	 * @{
	 *
	 * @file
	 * @brief       SUIT manifest parser library for CBOR based manifests
	 *
	 * @author      Koen Zandberg <koen@bergzand.net>
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * @}
	 */
	public static Object _manifest_get_auth_wrapper_handler(int key) {
		return ModernizedCProgram._suit_manifest_get_handler(key, ModernizedCProgram._auth_handlers, ModernizedCProgram._auth_handlers_len);
	}
	public static Object sntp_get_unix_usec() {
		return (uint64_t)(/*Error: Function owner not recognized*/sntp_get_offset() - (NTP_UNIX_OFFSET * (true)) + ModernizedCProgram.xtimer_now_usec64());
	}
	/* NET_SNTP_H */
	/** @} */
	public static int tm_is_leap_year(int year) {
		return ((year & 3) == 0) && ((year % 400 == 0) || (year % 100 != 0));
	}
	public static int tm_doomsday(int year) {
		int result;
		result = (true);
		result += year;
		result += year >>=  2;
		result -= year /= 25;
		result += year >>=  2;
		return result;
	}
	public static void tm_get_wyday(int year, int mon, int mday, Integer wday, Integer yday) {
		int is_leap_year = ModernizedCProgram.tm_is_leap_year(year);
		yday = ModernizedCProgram.TM_MON_DAYS_ACCU[mon] + mday + (mon <= (true) ? 0 : is_leap_year) - 1;
		int jan1 = ModernizedCProgram.tm_doomsday(year) - 2 - is_leap_year;
		wday = (jan1 + yday) % 7;
	}
	public static void tm_fill_derived_values() {
		Object generatedTm_year = this.getTm_year();
		Object generatedTm_mon = this.getTm_mon();
		Object generatedTm_mday = this.getTm_mday();
		Object generatedTm_wday = this.getTm_wday();
		Object generatedTm_yday = this.getTm_yday();
		ModernizedCProgram.tm_get_wyday(generatedTm_year + 1900, generatedTm_mon, generatedTm_mday, generatedTm_wday, generatedTm_yday);
	}
	public static int tm_is_valid_date(int year, int mon, int mday) {
		if ((mon < (false)) || (mon > (true))) {
			return 0;
		} 
		if ((mday <= 0) || (mday > ModernizedCProgram.TM_MON_DAYS[mon])) {
			if ((mday != 29) || (mon != (true)) || !ModernizedCProgram.tm_is_leap_year(year)) {
				return 0;
			} 
		} 
		if (year <= 1582) {
			if (year < 1582) {
				return 0;
			} 
			if ((mon < (true)) || ((mon == (true)) && (mday < 15))) {
				return 0;
			} 
		} 
		return 1;
	}
	public static int tm_is_valid_time(int hour, int min, int sec) {
		return (hour >= 0) && (hour < 24) && (min >= 0) && (min < 60) && (sec >= 0) && (sec <= 60);
	}
	public static int saul_reg_read(saul_reg dev,  res) {
		if (dev == ((Object)0)) {
			return -ENODEV;
		} 
		Object generatedDev = dev.getDev();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDev, res);
	}
	public static int saul_reg_write(saul_reg dev,  data) {
		if (dev == ((Object)0)) {
			return -ENODEV;
		} 
		Object generatedDev = dev.getDev();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDev, data);
	}
	public static int riotboot_flashwrite_init(int target_slot) {
		return ModernizedCProgram.riotboot_flashwrite_init_raw(state, /* initialize state, but skip "RIOT" */target_slot, /*Error: Unsupported expression*//**
		 * @brief   Feed bytes into the firmware writer
		 *
		 * @note    If the update has been initialized via @ref
		 *          riotboot_flashwrite_init(), make sure to skip the first
		 *          RIOTBOOT_FLASHWRITE_SKIPLEN bytes.
		 *
		 * @param[in,out]   state   ptr to previously used update state
		 * @param[in]       bytes   ptr to data
		 * @param[in]       len     len of data
		 * @param[in]       more    whether more data is coming
		 *
		 * @returns         0 on success, <0 otherwise
		 */);
	}
	public static int riotboot_flashwrite_finish() {
		return ModernizedCProgram.riotboot_flashwrite_finish_raw(state, ()"RIOT", /*Error: Unsupported expression*//**
		 * @brief       Get a slot's size
		 *
		 * @param[in]   state   ptr to state struct
		 *
		 * @returns     the size of the slot that @p state is configured to update to
		 */);
	}
	/* $OpenBSD: ucmpdi2.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Return 0, 1, or 2 as a <, =, > b respectively.
	 * Neither a nor b are considered signed.
	 */
	public static int __ucmpdi2(Object a, Object b) {
		Object aa;
		Object bb;
		aa.setUq(a);
		bb.setUq(b);
		Object generatedUl = aa.getUl();
		return generatedUl[(true)] < generatedUl[(true)] ? 0 : generatedUl[(true)] > generatedUl[(true)] ? 2 : generatedUl[(false)] < generatedUl[(false)] ? 0 : generatedUl[(false)] > generatedUl[(false)] ? 2 : 1;
	}
	public static void nhdp_init() {
		if (ModernizedCProgram.nhdp_pid != KERNEL_PID_UNDEF/* do not initialize twice */) {
			return /*Error: Unsupported expression*/;
		} 
		for (int i = 0;
		 i < GNRC_NETIF_NUMOF; /* Prepare interface table */i++) {
			ModernizedCProgram.nhdp_if_table[i].setIf_pid(KERNEL_PID_UNDEF);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.nhdp_if_table[i].getWr_target(), 0, /*Error: Unsupported expression*/);
		}
		ModernizedCProgram.nhdp_writer_init();
		ModernizedCProgram.nhdp_reader_init();
	}
	public static Object nhdp_start() {
		if (ModernizedCProgram.nhdp_pid == KERNEL_PID_UNDEF/* Init destination address for NHDP's packets */) {
			ModernizedCProgram.nhdp_pid = /*Error: Function owner not recognized*/thread_create(ModernizedCProgram.nhdp_stack, /*Error: sizeof expression not supported yet*/, THREAD_PRIORITY_MAIN - /* Start the NHDP thread */1, THREAD_CREATE_STACKTEST, ModernizedCProgram._nhdp_runner, ((Object)0), "NHDP"/* Configure periodic timer message to refresh metric values */);
		} 
		return ModernizedCProgram.nhdp_pid;
	}
	public static int nhdp_register_if_default(Object if_pid, Object addr, Object addr_size, Object addr_type, Object max_pl_size) {
		return ModernizedCProgram.nhdp_register_if(if_pid, addr, addr_size, addr_type, max_pl_size, (true), (3 * (true)));
	}
	public static int nhdp_register_if(Object if_pid, Object addr, Object addr_size, Object addr_type, Object max_pl_size, Object hello_int_ms, Object val_time_ms) {
		nhdp_if_entry_t if_entry = ((Object)0);
		nhdp_addr_t nhdp_addr = new nhdp_addr_t();
		 signal_msg = new ();
		if (ModernizedCProgram.nhdp_rcv_pid != KERNEL_PID_UNDEF) {
			return -2;
		} 
		for (int i = 0;
		 i < GNRC_NETIF_NUMOF; i++) {
			if (ModernizedCProgram.nhdp_if_table[i].getIf_pid() == KERNEL_PID_UNDEF) {
				if_entry = ModernizedCProgram.nhdp_if_table[i];
				break;
			} 
		}
		if (!if_entry) {
			return -/* Maximum number of registerable interfaces reached */2;
		} 
		uint16_t payload_size = max_pl_size > (true) ? (true) : max_pl_size;
		Object generatedWr_target = if_entry.getWr_target();
		generatedWr_target.setRfc5444_writer_target((uint8_t)ModernizedCProgram.calloc(payload_size, /*Error: Unsupported expression*/));
		if (!generatedWr_target.getRfc5444_writer_target()) {
			return -/* Insufficient memory */1;
		} 
		generatedWr_target.setRfc5444_writer_target(payload_size);
		generatedWr_target.setRfc5444_writer_target(ModernizedCProgram.write_packet);
		nhdp_addr nhdp_addr = new nhdp_addr();
		nhdp_addr = nhdp_addr.nhdp_addr_db_get_address(addr, addr_size, /* Get NHDP address entry for the given address */addr_type);
		if (!nhdp_addr) {
			ModernizedCProgram.free(generatedWr_target.getRfc5444_writer_target());
			return -1;
		} 
		if (nhdp_addr.lib_add_if_addr(if_pid) != /* Add the interface to the LIB */0) {
			ModernizedCProgram.free(generatedWr_target.getRfc5444_writer_target());
			nhdp_addr.nhdp_decrement_addr_usage();
			return -1;
		} 
		if (ModernizedCProgram.iib_register_if(if_pid) != /* Create new IIB for the interface */0) {
			ModernizedCProgram.free(generatedWr_target.getRfc5444_writer_target());
			nhdp_addr.nhdp_decrement_addr_usage();
			return -1;
		} 
		if_entry.setIf_pid(/* Set Interface's PID */if_pid);
		Object generatedHello_interval = if_entry.getHello_interval();
		generatedHello_interval.setSeconds(/* Set HELLO_INTERVAL and H_HOLD_TIME (validity time) */0);
		generatedHello_interval.setMicroseconds((true) * hello_int_ms);
		Object generatedValidity_time = if_entry.getValidity_time();
		generatedValidity_time.setSeconds(0);
		generatedValidity_time.setMicroseconds((true) * val_time_ms);
		generatedHello_interval.timex_normalize();
		generatedValidity_time.timex_normalize();
		if_entry.setSeq_no(/* Reset sequence number */0);
		/* Everything went well */nhdp_addr.nhdp_decrement_addr_usage();
		ModernizedCProgram.nhdp_writer_register_if(generatedWr_target);
		ModernizedCProgram.helper_pid = if_pid;
		ModernizedCProgram.nhdp_rcv_pid = /*Error: Function owner not recognized*/thread_create(ModernizedCProgram.nhdp_rcv_stack, /*Error: sizeof expression not supported yet*/, THREAD_PRIORITY_MAIN - /* Start the receiving thread */1, THREAD_CREATE_STACKTEST, ModernizedCProgram._nhdp_receiver, ((Object)0), "nhdp_rcv_thread");
		signal_msg.setType((/* Start sending periodic HELLO */true));
		signal_msg.getContent().setPtr(if_entry);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_try_send(signal_msg, /* TODO: msg_send or msg_try_send? */ModernizedCProgram.nhdp_pid);
		return 0;
	}
	public static int nhdp_register_non_manet_if(Object if_pid, Object addr, Object addr_size, Object addr_type) {
		return ModernizedCProgram.nhdp_add_address(if_pid, addr, addr_size, addr_type);
	}
	public static int nhdp_add_address(Object if_pid, Object addr, Object addr_size, Object addr_type) {
		int result;
		nhdp_addr nhdp_addr = new nhdp_addr();
		nhdp_addr_t nhdp_addr = nhdp_addr.nhdp_addr_db_get_address(addr, addr_size, /* Get NHDP address entry for the given address */addr_type);
		if (!nhdp_addr) {
			return -/* Insufficient memory */1;
		} 
		result = nhdp_addr.lib_add_if_addr(if_pid);
		nhdp_addr.nhdp_decrement_addr_usage();
		return result/*------------------------------------------------------------------------------------*//*                                Internal functions                                  *//*------------------------------------------------------------------------------------*/;
	}
	/* Internal function prototypes */
	/**
	 * Function executed by NHDP thread receiving messages in an endless loop
	 */
	public static Object _nhdp_runner(Object arg) {
		nhdp_if_entry_t if_entry = new nhdp_if_entry_t();
		 msg_rcvd = new ();
		[] msg_queue = new ();
		(Object)arg;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_init_queue(msg_queue, (true));
		Object generatedIf_timer = if_entry.getIf_timer();
		Object generatedHello_interval = if_entry.getHello_interval();
		while (1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_receive(msg_rcvd);
			switch (msg_rcvd.getType()) {
			case (true):
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.send_rcv_mutex);
					if_entry = msg_rcvd.getContent().getPtr();
					if_entry/* TODO: Add jitter */.nhdp_writer_send_hello();
					ModernizedCProgram.xtimer_set_msg64(generatedIf_timer, ModernizedCProgram.timex_uint64(generatedHello_interval), msg_rcvd, /*Error: Function owner not recognized*/thread_getpid());
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.send_rcv_mutex);
					break;
			default:
					break;
			}
		}
		return 0/**
		 * Receive HELLOs over the configured socket and handle them
		 */;
	}
	public static Object _nhdp_receiver(Object arg) {
		 ep = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		byte[] nhdp_rcv_buf = new byte[(true)];
		[] msg_q = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_init_queue(msg_q, (true));
		if (/*Error: Function owner not recognized*/sock_udp_create(ModernizedCProgram.sock, ep, ((Object)0), 0) < /* Bind UDP socket to socket address */0) {
			return /* Failed creating the connection */0;
		} 
		while (1) {
			int32_t rcv_size = /*Error: Function owner not recognized*/sock_udp_recv(ModernizedCProgram.sock, (Object)nhdp_rcv_buf, (true), SOCK_NO_TIMEOUT, ((Object)0));
			if (rcv_size > 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(/* Packet received, let the reader handle it */ModernizedCProgram.send_rcv_mutex);
				ModernizedCProgram.nhdp_reader_handle_packet(ModernizedCProgram.helper_pid, (Object)nhdp_rcv_buf, rcv_size);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.send_rcv_mutex);
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sock_udp_close(ModernizedCProgram.sock);
		return 0/**
		 * Send packet for the registered interface
		 * Called by oonf_api to send packet over the configured socket
		 */;
	}
	public static void write_packet(Object wr, Object buffer, Object length) {
		 ep = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ep.getAddr().getIpv6(), ModernizedCProgram.ipv6_addr_all_nodes_link_local, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sock_udp_send(ModernizedCProgram.sock, buffer, length, ep);
	}
	/*---------------------------------------------------------------------------*
	 *                            NHDP Core API                                  *
	 *---------------------------------------------------------------------------*/
	public static void log_write(int level, Object format) {
		((level > 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("level > 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\log_module.h", 96));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s", ModernizedCProgram._ansi_codes[level]);
		va_list args = new va_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_start(args, format/* Temporarily disable clang format-nonliteral warning */);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/vprintf(format, /* clang */args);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__builtin_va_end(/* clang */args);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(("\033[0m"/* no fflush on msp430 */))/**@}*/;/**@}*/
	}
	/* LOG_MODULE_H */
	public static void usbus_control_init(Object usbus, Object handler) {
		handler.getHandler().setDriver(ModernizedCProgram._ep0_driver);
		handler.getHandler().setNext(usbus.getHandlers());
		usbus.setHandlers(handler.getHandler());
	}
	public static void _activate_endpoints(Object usbus) {
		for ( iface = usbus.getIface();
		 iface; iface = iface.getNext()) {
			for ( ep = iface.getEp();
			 ep; ep = ep.getNext()) {
				if (ep.getActive()) {
					 enable = USBOPT_ENABLE;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_set(ep.getEp(), USBOPT_EP_ENABLE, enable, /*Error: Unsupported expression*/);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: activated endpoint %d, dir %s\n", ep.getEp().getNum(), ep.getEp().getDir() == USB_EP_DIR_OUT ? "out" : "in");
				} 
			}
			for ( alt = iface.getAlts();
			 alt; alt = alt.getNext()) {
				for ( ep = alt.getEp();
				 ep; ep = ep.getNext()) {
					if (ep.getActive()) {
						 enable = USBOPT_ENABLE;
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_set(ep.getEp(), USBOPT_EP_ENABLE, enable, /*Error: Unsupported expression*/);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: activated endpoint %d, dir %s\n", ep.getEp().getNum(), ep.getEp().getDir() == USB_EP_DIR_OUT ? "out" : "in");
					} 
				}
			}
		}
	}
	public static Object _cpy_str_to_utf16(Object usbus, Object str) {
		size_t len = 0;
		while (str) {
			ModernizedCProgram.usbus_control_slicer_put_char(usbus, str);
			ModernizedCProgram.usbus_control_slicer_put_char(usbus, 0);
			len += /* Two bytes added each iteration */2;
			str++;
		}
		return len;
	}
	public static Object _get_descriptor(Object usbus, Object idx) {
		for ( str = usbus.getStrings();
		 str; str = str.getNext()) {
			if (str.getIdx() == idx) {
				return str;
			} 
		}
		return ((Object)0);
	}
	public static int _req_status(Object usbus) {
		uint8_t[] status = new uint8_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(status, 0, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, status, /*Error: sizeof expression not supported yet*/);
		return /*Error: sizeof expression not supported yet*/;
	}
	public static int _req_str(Object usbus, Object idx) {
		int res = -/* Return an error condition by default */1;
		if (usbus.getStrings()) {
			if (idx == 0) {
				 desc = new ();
				desc.setType(USB_TYPE_DESCRIPTOR_STRING);
				desc.setLength(/*Error: Unsupported expression*/ + /*Error: Unsupported expression*/);
				ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)desc, /*Error: sizeof expression not supported yet*/);
				uint16_t us = /* Only one language ID supported */USB_CONFIG_DEFAULT_LANGID;
				ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)us, /*Error: Unsupported expression*/);
				res = 1;
			} else {
					 desc = new ();
					desc.setType(USB_TYPE_DESCRIPTOR_STRING);
					 str = ModernizedCProgram._get_descriptor(usbus, idx);
					if (str) {
						desc.setLength(/*Error: Unsupported expression*/);
						desc.getLength() += 2 * /*Error: Function owner not recognized*/strlen(str.getStr());
						ModernizedCProgram.usbus_control_slicer_put_bytes(usbus, (uint8_t)desc, /*Error: sizeof expression not supported yet*/);
						ModernizedCProgram._cpy_str_to_utf16(usbus, str.getStr());
						res = 1;
					} 
			} 
		} 
		return res;
	}
	public static int _req_dev(Object usbus) {
		return ModernizedCProgram.usbus_fmt_hdr_dev(usbus);
	}
	public static int _req_config(Object usbus) {
		return ModernizedCProgram.usbus_fmt_hdr_conf(usbus);
	}
	public static int _req_dev_qualifier(Object usbus) {
		 speed = USB_SPEED_LOW;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(usbus.getDev(), USBOPT_MAX_SPEED, speed, /*Error: Unsupported expression*/);
		if (speed == USB_SPEED_HIGH/* TODO: implement device qualifier support (only required
		         * for High speed) */) {
		} 
		return -/* Signal a stall condition */1;
	}
	public static int _req_descriptor(Object usbus, Object pkt) {
		uint8_t type = pkt.getValue() >> 8;
		uint8_t idx = (uint8_t)pkt.getValue();
		switch (/* Decode descriptor type */type) {
		case USB_TYPE_DESCRIPTOR_DEVICE:
				return ModernizedCProgram._req_dev(usbus);
		case USB_TYPE_DESCRIPTOR_DEV_QUALIFIER:
				return ModernizedCProgram._req_dev_qualifier(usbus);
		case USB_TYPE_DESCRIPTOR_STRING:
				return ModernizedCProgram._req_str(usbus, idx);
		case USB_TYPE_DESCRIPTOR_CONFIGURATION:
				return ModernizedCProgram._req_config(usbus);
		default:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus: unknown descriptor request %u, signalling stall\n", type);
				return -1;
		}
	}
	public static int _recv_dev_setup(Object usbus, Object pkt) {
		int res = -1;
		if (pkt.usb_setup_is_read()) {
			switch (pkt.getRequest()) {
			case USB_SETUP_REQ_GET_DESCRIPTOR:
					res = ModernizedCProgram._req_descriptor(usbus, pkt);
					break;
			case USB_SETUP_REQ_GET_STATUS:
					res = ModernizedCProgram._req_status(usbus);
					break;
			default:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus: Unknown read request %u\n", pkt.getRequest());
					break;
			}
		} else {
				switch (pkt.getRequest()) {
				case USB_SETUP_REQ_SET_CONFIGURATION/* Nothing configuration dependent to do here, only one
				                 * configuration supported */:
						usbus.setState(USBUS_STATE_CONFIGURED);
						ModernizedCProgram._activate_endpoints(usbus);
						res = 1;
						break;
				case USB_SETUP_REQ_SET_ADDRESS:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: Setting address\n");
						usbus.setAddr((uint8_t)pkt.getValue());
						res = 1;
						break;
				default:
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus: Unknown write request %u\n", pkt.getRequest());
						break;
				}
		} 
		return res;
	}
	public static int _recv_interface_setup(Object usbus, Object pkt) {
		 ep0_handler = ()usbus.getControl();
		uint16_t destination = pkt.getIndex() & -1024;
		for ( iface = usbus.getIface();
		 iface; iface = iface.getNext()) {
			if (destination == iface.getIdx() && iface.getHandler().getDriver().getControl_handler()) {
				return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(usbus, iface.getHandler(), ep0_handler.getControl_request_state(), pkt);
			} 
		}
		return -1;
	}
	public static void _recv_setup(Object usbus, Object handler) {
		 pkt = handler.getSetup();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: Received setup %x %x @ %d\n", pkt.getType(), pkt.getRequest(), pkt.getLength());
		uint8_t destination = pkt.getType() & USB_SETUP_REQUEST_RECIPIENT_MASK;
		int res = 0;
		switch (destination) {
		case USB_SETUP_REQUEST_RECIPIENT_DEVICE:
				res = ModernizedCProgram._recv_dev_setup(usbus, pkt);
				break;
		case USB_SETUP_REQUEST_RECIPIENT_INTERFACE:
				res = ModernizedCProgram._recv_interface_setup(usbus, pkt);
				break;
		default:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: Unhandled setup request\n");
		}
		if (res < 0) {
			 enable = /* Signal stall to indicate unsupported (USB 2.0 spec 9.6.2 */USBOPT_ENABLE;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_set(handler.getIn(), USBOPT_EP_STALL, enable, /*Error: Unsupported expression*/);
			handler.setControl_request_state(USBUS_CONTROL_REQUEST_STATE_READY);
		}  else if (res) {
			if (pkt.usb_setup_is_read()) {
				handler.setControl_request_state(USBUS_CONTROL_REQUEST_STATE_INDATA);
				ModernizedCProgram.usbus_control_slicer_ready(usbus);
			} else {
					if (handler.getReceived_len() < pkt.getLength()) {
						handler.setControl_request_state(USBUS_CONTROL_REQUEST_STATE_OUTDATA);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(handler.getOut(), 1);
					} else {
							handler.setControl_request_state(USBUS_CONTROL_REQUEST_STATE_INACK);
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(handler.getIn(), 0);
					} 
			} 
		} 
	}
	public static void _usbus_config_ep0(Object ep0_handler) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: Enabling EP0\n");
		 enable = USBOPT_ENABLE;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_init(ep0_handler.getIn());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_init(ep0_handler.getOut());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_set(ep0_handler.getIn(), USBOPT_EP_ENABLE, enable, /*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_set(ep0_handler.getOut(), USBOPT_EP_ENABLE, enable, /*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(ep0_handler.getOut(), 0);
	}
	public static Object usbus_control_get_out_data(Object usbus, Object len) {
		 handler = ()usbus.getControl();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(handler.getControl_request_state() == USBUS_CONTROL_REQUEST_STATE_OUTDATA);
		 ep_out = handler.getOut();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_get(ep_out, USBOPT_EP_AVAILABLE, len, /*Error: Unsupported expression*/);
		return ep_out.getBuf();
	}
	public static int _handle_tr_complete(Object usbus, Object ep0_handler, Object ep) {
		switch (ep0_handler.getControl_request_state()) {
		case USBUS_CONTROL_REQUEST_STATE_OUTACK:
				if (ep.getDir() == USB_EP_DIR_OUT) {
					ep0_handler.setControl_request_state(USBUS_CONTROL_REQUEST_STATE_READY);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(ep0_handler.getOut(), /* Ready for new control request */0);
				} 
				break;
		case USBUS_CONTROL_REQUEST_STATE_INDATA:
				if (ep.getDir() == USB_EP_DIR_IN) {
					if (ModernizedCProgram.usbus_control_slicer_nextslice(usbus)) {
						ModernizedCProgram._recv_setup(usbus, ep0_handler);
						ep0_handler.setControl_request_state(USBUS_CONTROL_REQUEST_STATE_INDATA);
					} else {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(ep0_handler.getOut(), /* Ready out ZLP */0);
							ep0_handler.setControl_request_state(USBUS_CONTROL_REQUEST_STATE_OUTACK);
					} 
				} 
				break;
		case USBUS_CONTROL_REQUEST_STATE_OUTDATA:
				if (ep.getDir() == USB_EP_DIR_OUT) {
					size_t len = 0;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_get(ep0_handler.getOut(), USBOPT_EP_AVAILABLE, len, /*Error: Unsupported expression*/);
					ep0_handler.getReceived_len() += len;
					ModernizedCProgram._recv_setup(usbus, ep0_handler);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: Invalid state OUTDATA with IN request\n");
				} 
				break;
		case USBUS_CONTROL_REQUEST_STATE_INACK:
				if (ep.getDir() == USB_EP_DIR_IN) {
					if (usbus.getAddr() && usbus.getState() == USBUS_STATE_RESET) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_set(usbus.getDev(), USBOPT_ADDRESS, usbus.getAddr(), /*Error: sizeof expression not supported yet*/);
						usbus.setState(/* Address configured */USBUS_STATE_ADDR);
					} 
					ep0_handler.setControl_request_state(USBUS_CONTROL_REQUEST_STATE_READY);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/usbdev_ep_ready(ep0_handler.getOut(), /* Ready for new control request */0);
				} 
				break;
		case USBUS_CONTROL_REQUEST_STATE_READY:
				if (ep.getDir() == USB_EP_DIR_OUT) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ep0_handler.getSlicer(), 0, /*Error: Unsupported expression*/);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ep0_handler.getSetup(), ep0_handler.getOut().getBuf(), /*Error: Unsupported expression*/);
					ep0_handler.setReceived_len(0);
					ep0_handler.getSlicer().setReqlen(ep0_handler.getSetup().getLength());
					ModernizedCProgram._recv_setup(usbus, ep0_handler);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: invalid state, READY with IN request\n");
				} 
				break;
		default:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: Invalid state\n");
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(false);
				break;
		}
		return 0;
	}
	/* USB endpoint 0 callback */
	public static void _handler_ep0_event(Object usbus, Object handler, Object event) {
		 ep0_handler = ()handler;
		(Object)usbus;
		switch (event) {
		case USBUS_EVENT_USB_RESET:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("usbus_control: Reset event triggered\n");
				ep0_handler.setControl_request_state(USBUS_CONTROL_REQUEST_STATE_READY);
				ModernizedCProgram._usbus_config_ep0(ep0_handler);
				break;
		default:
				break;
		}
	}
	public static void _handler_ep0_transfer(Object usbus, Object handler, Object ep, Object event) {
		 ep0_handler = ()handler;
		switch (event) {
		case USBUS_EVENT_TRANSFER_COMPLETE:
				ModernizedCProgram._handle_tr_complete(usbus, ep0_handler, ep);
				break;
		default:
				break;
		}
	}
	public static int pthread_equal(Object thread1, Object thread2) {
		return thread1 == thread2;
	}
	/* PTHREAD_THREADING_H */
	/**
	 * @}
	 */
	/*
	 * Copyright (C) 2015 Kaspar Schleiser <kaspar@schleiser.de>
	 *               2016 Eistec AB
	 *               2018 Josua Arndt
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup   sys_xtimer
	
	 * @{
	 * @file
	 * @brief   xtimer implementation
	 *
	 * @author  Kaspar Schleiser <kaspar@schleiser.de>
	 * @author  Joakim Nohlgård <joakim.nohlgard@eistec.se>
	 * @author  Josua Arndt <jarndt@ias.rwth-aachen.de>
	 *
	 */
	/**
	 * @brief IPC message type for xtimer msg callback
	 */
	/**
	 * @brief returns the (masked) low-level timer counter value.
	 */
	public static Object _xtimer_lltimer_now() {
		return /*Error: Function owner not recognized*/timer_read(XTIMER_DEV/**
		 * @brief drop bits of a value that don't fit into the low-level timer.
		 */);
	}
	public static Object _xtimer_lltimer_mask(Object val) {
		return val & ~/* cppcheck-suppress shiftTooManyBits
		     * (reason: cppcheck bug. `XTIMER_MASK` is zero when `XTIMER_WIDTH` is 32) */XTIMER_MASK/**
		 * @{
		 * @brief xtimer internal stuff
		 * @internal
		 */;
	}
	/* Doxygen warns that these are undocumented, but the documentation can be found in xtimer.h */
	/* Doxygen warns that these are undocumented, but the documentation can be found in xtimer.h */
	public static Object _xtimer_now() {
		return ModernizedCProgram._xtimer_lltimer_now();
	}
	/* _high_cnt can change at any time, so check the value before
	     * and after reading the low-level timer. If it hasn't changed,
	     * then it can be safely applied to the timer count. */
	public static Object xtimer_now() {
		 ret = new ();
		ret.setTicks32(ModernizedCProgram._xtimer_now());
		return ret;
	}
	public static Object xtimer_now64() {
		 ret = new ();
		ret.setTicks64(ModernizedCProgram._xtimer_now64());
		return ret;
	}
	public static Object xtimer_now_usec() {
		return ModernizedCProgram.xtimer_usec_from_ticks(ModernizedCProgram.xtimer_now());
	}
	public static Object xtimer_now_usec64() {
		return ModernizedCProgram.xtimer_usec_from_ticks64(ModernizedCProgram.xtimer_now64());
	}
	public static void _xtimer_spin(Object offset) {
		 start = ModernizedCProgram._xtimer_lltimer_now();
		while ((ModernizedCProgram._xtimer_lltimer_now() - start) < offset) {
			;
		}
	}
	public static void _xtimer_tsleep32(Object ticks) {
		ModernizedCProgram._xtimer_tsleep(ticks, 0);
	}
	public static void _xtimer_tsleep64(Object ticks) {
		ModernizedCProgram._xtimer_tsleep(()ticks, /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ticks >> 32));
	}
	public static void xtimer_spin(Object ticks) {
		ModernizedCProgram._xtimer_spin(ticks.getTicks32());
	}
	public static void xtimer_usleep(Object microseconds) {
		ModernizedCProgram._xtimer_tsleep32(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec(microseconds));
	}
	public static void xtimer_usleep64(Object microseconds) {
		ModernizedCProgram._xtimer_tsleep64(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec64(microseconds));
	}
	public static void xtimer_sleep(Object seconds) {
		ModernizedCProgram._xtimer_tsleep64(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec64(()seconds * US_PER_SEC));
	}
	public static void xtimer_nanosleep(Object nanoseconds) {
		ModernizedCProgram._xtimer_tsleep32(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec(nanoseconds / NS_PER_US));
	}
	public static void xtimer_tsleep32(Object ticks) {
		ModernizedCProgram._xtimer_tsleep32(ticks.getTicks32());
	}
	public static void xtimer_tsleep64(Object ticks) {
		ModernizedCProgram._xtimer_tsleep64(ticks.getTicks64());
	}
	public static void xtimer_periodic_wakeup(Object last_wakeup, Object period) {
		ModernizedCProgram._xtimer_periodic_wakeup(last_wakeup.getTicks32(), /*Error: Function owner not recognized*/_xtimer_ticks_from_usec(period));
	}
	public static void xtimer_set_msg(Object timer, Object offset, Object msg, Object target_pid) {
		timer._xtimer_set_msg(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec(offset), msg, target_pid);
	}
	public static void xtimer_set_msg64(Object timer, Object offset, Object msg, Object target_pid) {
		timer._xtimer_set_msg64(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec64(offset), msg, target_pid);
	}
	public static void xtimer_set_wakeup(Object timer, Object offset, Object pid) {
		timer._xtimer_set_wakeup(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec(offset), pid);
	}
	public static void xtimer_set_wakeup64(Object timer, Object offset, Object pid) {
		timer._xtimer_set_wakeup64(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec64(offset), pid);
	}
	public static void xtimer_set(Object timer, Object offset) {
		timer._xtimer_set(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec(offset));
	}
	public static void xtimer_set64(Object timer, Object period_us) {
		 ticks = /*Error: Function owner not recognized*/_xtimer_ticks_from_usec64(period_us);
		timer._xtimer_set64(ticks, ticks >> 32);
	}
	public static int xtimer_msg_receive_timeout(Object msg, Object timeout) {
		return ModernizedCProgram._xtimer_msg_receive_timeout(msg, /*Error: Function owner not recognized*/_xtimer_ticks_from_usec(timeout));
	}
	public static int xtimer_msg_receive_timeout64(Object msg, Object timeout) {
		return ModernizedCProgram._xtimer_msg_receive_timeout64(msg, /*Error: Function owner not recognized*/_xtimer_ticks_from_usec64(timeout));
	}
	public static Object xtimer_ticks_from_usec(Object usec) {
		 ticks = new ();
		ticks.setTicks32(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec(usec));
		return ticks;
	}
	public static Object xtimer_ticks_from_usec64(Object usec) {
		 ticks = new ();
		ticks.setTicks64(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec64(usec));
		return ticks;
	}
	public static Object xtimer_usec_from_ticks(Object ticks) {
		return /*Error: Function owner not recognized*/_xtimer_usec_from_ticks(ticks.getTicks32());
	}
	public static Object xtimer_usec_from_ticks64(Object ticks) {
		return /*Error: Function owner not recognized*/_xtimer_usec_from_ticks64(ticks.getTicks64());
	}
	public static Object xtimer_ticks(Object ticks) {
		 ret = new ();
		ret.setTicks32(ticks);
		return ret;
	}
	public static Object xtimer_ticks64(Object ticks) {
		 ret = new ();
		ret.setTicks64(ticks);
		return ret;
	}
	public static Object xtimer_diff(Object a, Object b) {
		 ret = new ();
		ret.setTicks32(a.getTicks32() - b.getTicks32());
		return ret;
	}
	public static Object xtimer_diff64(Object a, Object b) {
		 ret = new ();
		ret.setTicks64(a.getTicks64() - b.getTicks64());
		return ret;
	}
	public static Object xtimer_diff32_64(Object a, Object b) {
		 diff = a.getTicks64() - b.getTicks64();
		 ret = new ();
		ret.setTicks32(diff);
		return ret;
	}
	public static Object xtimer_less(Object a, Object b) {
		return (a.getTicks32() < b.getTicks32());
	}
	public static Object xtimer_less64(Object a, Object b) {
		return (a.getTicks64() < b.getTicks64());
	}
	/* XTIMER_IMPLEMENTATION_H */
	/* $OpenBSD: udivdi3.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Divide two unsigned quads.
	 */
	public static Object __udivdi3(Object a, Object b) {
		return ModernizedCProgram.__qdivrem(a, b, NULL);
	}
	public static int _ntpdate(int argc, byte[][] argv) {
		uint32_t timeout = (true);
		if (argc < 2) {
			ModernizedCProgram._usage(argv[0]);
			return 1;
		} 
		 server = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		 addr = ()server.getAddr();
		 src_iface = /*Error: Function owner not recognized*/ipv6_addr_split_iface(argv[1]);
		if (src_iface == -1) {
			src_iface = KERNEL_PID_UNDEF;
		} 
		if (ModernizedCProgram.ipv6_addr_from_str(addr, argv[1]) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: malformed address");
			return 1;
		} 
		if (argc > 2) {
			timeout = /*Error: Function owner not recognized*/atoi(argv[2]);
		} 
		if (/*Error: Function owner not recognized*/sntp_sync(server, timeout) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Error in synchronization");
			return 1;
		} 
		uint64_t time = ModernizedCProgram.sntp_get_unix_usec();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%u.%u (%i us)\n", (uint32_t)(time / (true)), (uint32_t)(time / (true)), (int)/*Error: Function owner not recognized*/sntp_get_offset());
		return 0;
	}
	/*
	 * Copyright (C) 2015-2017 Simon Brummer
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     net_gnrc_tcp
	 *
	 * @{
	 *
	 * @file
	 * @brief       TCP option handling declarations.
	 *
	 * @author      Simon Brummer <simon.brummer@posteo.de>
	 */
	/**
	 * @brief Helper function to build the MSS option.
	 *
	 * @param[in] mss   MSS value that should be set.
	 *
	 * @returns   MSS option value.
	 */
	public static Object _option_build_mss(Object mss) {
		return (((uint32_t)TCP_OPTION_KIND_MSS << 24) | ((uint32_t)TCP_OPTION_LENGTH_MSS << 16) | mss/**
		 * @brief Helper function to build the combined option and control flag field.
		 *
		 * @param[in]  nopts   Number of options.
		 * @param[in]  ctl     Control flag field.
		 *
		 * @returns   Bitfield with encoded control bits and number of options.
		 */);
	}
	public static Object _option_build_offset_control(Object nopts, Object ctl) {
		((TCP_HDR_OFFSET_MIN <= nopts && nopts <= TCP_HDR_OFFSET_MAX) ? (Object)0 : /*Error: Function owner not recognized*/_assert("TCP_HDR_OFFSET_MIN <= nopts && nopts <= TCP_HDR_OFFSET_MAX", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\option.h", 55));
		return (nopts << 12) | ctl/**
		 * @brief Parses options of a given TCP header.
		 *
		 * @param[in,out] tcb   TCB holding the connection information.
		 * @param[in]     hdr   TCP header to be parsed.
		 *
		 * @returns   Zero on success.
		 *            Negative value on error.
		 */;
	}
	public static void _riotboot_slot_jump_to_image(Object hdr) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/cpu_jump_to_image(hdr.getStart_addr());
	}
	public static int riotboot_slot_current() {
		 base_addr = /*Error: Function owner not recognized*/cpu_get_image_baseaddr();
		for (int i = 0;
		 i < ModernizedCProgram.riotboot_slot_numof; i++) {
			 hdr = ModernizedCProgram.riotboot_slot_get_hdr(i);
			if (base_addr == hdr.getStart_addr()) {
				return i;
			} 
		}
		return -1;
	}
	public static int riotboot_slot_other() {
		return ModernizedCProgram.riotboot_slot_current() ? 0 : 1;
	}
	public static void riotboot_slot_jump(int slot) {
		ModernizedCProgram._riotboot_slot_jump_to_image(ModernizedCProgram.riotboot_slot_get_hdr(slot));
	}
	public static Object riotboot_slot_get_image_startaddr(int slot) {
		return ModernizedCProgram.riotboot_slot_get_hdr(slot).getStart_addr();
	}
	public static void riotboot_slot_dump_addrs() {
	}
	public static Object riotboot_slot_get_hdr(int slot) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(slot < ModernizedCProgram.riotboot_slot_numof);
		return ModernizedCProgram.riotboot_slots[slot];
	}
	/* $OpenBSD: ashldi3.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Shift a (signed) quad value left (arithmetic shift left).
	 * This is the same as logical shift left!
	 */
	public static Object __ashldi3(Object a, Object shift) {
		Object aa;
		if (shift == 0) {
			return a;
		} 
		aa.setQ(a);
		Object generatedUl = aa.getUl();
		if (shift >= (/*Error: Unsupported expression*/ * 8)) {
			generatedUl[(true)] = generatedUl[(false)] << (shift - (/*Error: Unsupported expression*/ * 8));
			generatedUl[(false)] = 0;
		} else {
				generatedUl[(true)] = (generatedUl[(true)] << shift) | (generatedUl[(false)] >> ((/*Error: Unsupported expression*/ * 8) - shift));
				generatedUl[(false)] <<=  shift;
		} 
		Object generatedQ = aa.getQ();
		return generatedQ;
	}
	/*
	 * POSIX implementation of threading.
	 *
	 * Copyright (C) 2013 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup pthread
	 * @{
	 * @file
	 * @brief   Singletons features / single-shot execution.
	 * @author  Christian Mehlis <mehlis@inf.fu-berlin.de>
	 * @author  René Kijewski <kijewski@inf.fu-berlin.de>
	 * @}
	 */
	public static int pthread_once(Object once_control, Object init_routine) {
		if (once_control == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/init_routine();
		} 
		once_control = 0 + 1;
		return 0;
	}
	/*
	 * Copyright (C) 2017 Kaspar Schleiser <kaspar@schleiser.de>
	 *               2018 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     net_sock_util
	 * @{
	 *
	 * @file
	 * @brief       sock utility functions implementation
	 *
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
	 * @}
	 */
	public static int sock_udp_ep_fmt(Object endpoint, Byte addr_str, Object port) {
		Object addr_ptr;
		addr_str = (byte)'\0';
		switch (endpoint.getFamily()) {
		default:
				return -ENOTSUP;
		}
		if (!ModernizedCProgram.inet_ntop(endpoint.getFamily(), addr_ptr, addr_str, INET6_ADDRSTRLEN)) {
			return 0;
		} 
		if (port) {
			port = endpoint.getPort();
		} 
		return /*Error: Function owner not recognized*/strlen(addr_str);
	}
	public static Byte _find_hoststart(Object url) {
		size_t remaining = SOCK_SCHEME_MAXLEN + 1;
		byte urlpos = (byte)url;
		while (urlpos && remaining) {
			remaining--;
			if (urlpos++ == (byte)':') {
				if (/*Error: Function owner not recognized*/strncmp(urlpos, "//", 2) == 0) {
					return urlpos + 2;
				} 
				break;
			} 
			urlpos++;
		}
		return ((Object)0);
	}
	/* Increment SOCK_SCHEME_MAXLEN due to comparison with the colon after the
	     * scheme part
	     */
	public static Byte _find_pathstart(Object url) {
		size_t remaining = SOCK_HOSTPORT_MAXLEN;
		byte urlpos = (byte)url;
		while (urlpos && remaining) {
			remaining--;
			if (urlpos == (byte)'/') {
				return urlpos;
			} 
			urlpos++;
		}
		return urlpos;
	}
	public static int sock_urlsplit(Object url, byte[] hostport, byte[] urlpath) {
		((url) ? (Object)0 : /*Error: Function owner not recognized*/_assert("url", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\sock_util.c", 120));
		byte hoststart = ModernizedCProgram._find_hoststart(url);
		if (!hoststart) {
			return -22;
		} 
		byte pathstart = ModernizedCProgram._find_pathstart(hoststart);
		if (hostport) {
			size_t hostlen = pathstart - hoststart/* hostlen must be smaller SOCK_HOSTPORT_MAXLEN to have space for the null
			        * terminator */;
			if (hostlen > SOCK_HOSTPORT_MAXLEN - 1) {
				return -EOVERFLOW;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(hostport, hoststart, hostlen);
			hostport[hostlen] = (byte)'\0';
		} 
		if (urlpath) {
			size_t pathlen = /*Error: Function owner not recognized*/strlen(pathstart);
			if (pathlen > SOCK_URLPATH_MAXLEN - 1) {
				return -EOVERFLOW;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(urlpath, pathstart, pathlen);
			urlpath[pathlen] = (byte)'\0';
		} 
		return 0;
	}
	public static int sock_udp_str2ep(Object ep_out, Object str) {
		int brackets_flag;
		byte hoststart = (byte)str;
		byte hostend = hoststart;
		byte[] hostbuf = new byte[SOCK_HOSTPORT_MAXLEN];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ep_out, 0, /*Error: Unsupported expression*/);
		if (hoststart == (byte)'[') {
			brackets_flag = 1;
			for (hostend = ++hoststart; hostend && hostend != (byte)']'; hostend++) {
				;
			}
			if (!hostend || ((size_t)(hostend - hoststart) >= /*Error: sizeof expression not supported yet*/)) {
				return -/* none found, bail out */22;
			} 
		} else {
				brackets_flag = 0;
				for (hostend = hoststart; hostend && (hostend != (byte)':') && ((size_t)(hostend - hoststart) < /*Error: sizeof expression not supported yet*/); hostend++) {
				}
		} 
		size_t hostlen = hostend - hoststart;
		if ((hostend + brackets_flag) == (byte)':') {
			byte portstart = hostend + brackets_flag + 1/* Checks here verify that the supplied port number is up to 5 (random)
			         * chars in size and result is smaller or equal to UINT16_MAX. */;
			if (/*Error: Function owner not recognized*/strlen(portstart) > 5) {
				return -22;
			} 
			 port = /*Error: Function owner not recognized*/atol(portstart);
			if (port > UINT16_MAX) {
				return -22;
			} 
			ep_out.setPort(()port);
		} 
		if (hostlen >= /*Error: sizeof expression not supported yet*/) {
			return -22;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(hostbuf, hoststart, hostlen);
		hostbuf[hostlen] = (byte)'\0';
		if (!brackets_flag) {
			if (ModernizedCProgram.inet_pton(AF_INET, hostbuf, ep_out.getAddr().getIpv4()) == 1) {
				ep_out.setFamily(AF_INET);
				return 0;
			} 
		} 
		return -22;
	}
	public static Object sock_udp_ep_equal(Object a, Object b) {
		((a && b) ? (Object)0 : /*Error: Function owner not recognized*/_assert("a && b", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\sock_util.c", 215));
		if ((a.getFamily() != b.getFamily()) || (a.getPort() != b.getPort())) {
			return false;
		} 
		switch (a.getFamily()) {
		case AF_INET:
				return (/*Error: Function owner not recognized*/memcmp(a.getAddr().getIpv4(), b.getAddr().getIpv4(), 4) == 0);
		default:
				return false;
		}
	}
	/* $OpenBSD: floatdisf.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Convert (signed) quad to float.
	 */
	public static double __floatdisf(Object x) {
		double f;
		Object u;
		int neg;
		/*
		     * Get an unsigned number first, by negating if necessary.
		     */
		if (x < 0) {
			u.setQ(-x);
			neg = 1;
		} else {
				u.setQ(x);
				neg = 0/*
				     * Now u.ul[H] has the factor of 2^32 (or whatever) and u.ul[L]
				     * has the units.  Ideally we could just set f, add INT_BITS to
				     * its exponent, and then add the units, but this is portable
				     * code and does not know how to get at an exponent.  Machine-
				     * specific code may be able to do this more efficiently.
				     *
				     * Using double here may be excessive paranoia.
				     */;
		} 
		Object generatedUl = u.getUl();
		f = (double)generatedUl[(true)] * (((int)1 << ((/*Error: Unsupported expression*/ * 8) - 2)) * 4.0);
		f += generatedUl[(false)];
		return neg ? -f : f;
	}
	public static int uuid_version(Object uuid) {
		uint16_t time_hi_vers = /*Error: Function owner not recognized*/byteorder_ntohs(uuid.getTime_hi());
		return (time_hi_vers & -1024) >> 12/**
		 * Compare two UUID's
		 *
		 * @param[in]   uuid1   First uuid to compare
		 * @param[in]   uuid2   Second uuid to compare
		 *
		 * @return              True when equal
		 */;
	}
	public static boolean uuid_equal(Object uuid1, Object uuid2) {
		return (/*Error: Function owner not recognized*/memcmp(uuid1, uuid2, /*Error: Unsupported expression*/) == 0/**
		 * @brief   Generate an UUID string from an UUID structure
		 *
		 * @param[in]   uuid    UUID
		 * @param[out]  str     null-terminated UUID string, must be at least UUID_STR_LEN + 1 bytes
		 */);
	}
	/* $OpenBSD: fixunssfdi.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Convert float to (unsigned) quad.  We do most of our work in double,
	 * out of sheer paranoia.
	 *
	 * Not sure what to do with negative numbers---for now, anything out
	 * of range becomes UQUAD_MAX.
	 *
	 * N.B.: must use new ANSI syntax (sorry).
	 */
	public static Object __fixunssfdi(double f) {
		double x;
		double toppart;
		Object t;
		if (f < 0) {
			return (((-1024 * -1024 + /* ??? should be 0?  ERANGE??? */1/* this falls afoul of a GCC bug */)));
		} 
		if (f >= /* so we wire in 2^64-1 instead *//* XXX */1.8446744073709552E19) {
			return (((-1024 * -1024 + 1)));
		} 
		x = f/*
		     * Get the upper part of the result.  Note that the divide
		     * may round up; we want to avoid this if possible, so we
		     * subtract `1/2' first.
		     */;
		toppart = (x - (((int)1 << ((/*Error: Unsupported expression*/ * 8) - 2)) * 2.0)) / (((int)1 << ((/*Error: Unsupported expression*/ * 8) - 2)) * 4.0/*
		     * Now build a u_quad_t out of the top part.  The difference
		     * between x and this is the bottom part (this may introduce
		     * a few fuzzy bits, but what the heck).  With any luck this
		     * difference will be nonnegative: x should wind up in the
		     * range [0..UINT_MAX].  For paranoia, we assume [INT_MIN..
		     * 2*UINT_MAX] instead.
		     */);
		Object generatedUl = t.getUl();
		generatedUl[(true)] = (int)toppart;
		generatedUl[(false)] = 0;
		Object generatedUq = t.getUq();
		x -= (double)generatedUq;
		if (x < 0) {
			generatedUl[(true)]--;
			x += -1024;
		} 
		if (x > -1024) {
			generatedUl[(true)]++;
			x -= -1024;
		} 
		generatedUl[(false)] = ()x;
		return generatedUq;
	}
	/*
	 * Copyright (C) 2014  René Kijewski  <rene.kijewski@fu-berlin.de>
	 *
	 * This library is free software; you can redistribute it and/or
	 * modify it under the terms of the GNU Lesser General Public
	 * License as published by the Free Software Foundation; either
	 * version 2.1 of the License, or (at your option) any later version.
	 *
	 * This library is distributed in the hope that it will be useful,
	 * but WITHOUT ANY WARRANTY; without even the implied warranty of
	 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
	 * Lesser General Public License for more details.
	 *
	 * You should have received a copy of the GNU Lesser General Public
	 * License along with this library; if not, write to the Free Software
	 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
	 */
	/**
	 * @ingroup     sys_pipe
	 * @{
	 * @file
	 * @brief       Implementation for statically allocated pipes.
	 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
	 * @}
	 */
	public static Object pipe_rw(Object rb, Object buf, Object n, Object other_op_blocked, Object this_op_blocked, Object ringbuffer_op) {
		if (n == 0) {
			return 0;
		} 
		while (1) {
			int old_state = /*Error: Function owner not recognized*/irq_disable();
			int count = /*Error: Function owner not recognized*/ringbuffer_op(rb, buf, n);
			if (count > 0) {
				 other_thread = other_op_blocked;
				int other_prio = -1;
				if (other_thread) {
					other_op_blocked = ((Object)0);
					other_prio = other_thread.getPriority();
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_set_status(other_thread, STATUS_PENDING);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old_state);
				if (other_prio >= 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_switch(other_prio);
				} 
				return count;
			}  else if (this_op_blocked || /*Error: Function owner not recognized*/irq_is_in()) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old_state);
				return 0;
			} else {
					this_op_blocked = ()sched_active_thread;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_set_status(()sched_active_thread, STATUS_SLEEPING);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old_state);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/thread_yield_higher();
			} 
		}
	}
	/**
	 * @brief Fortuna PRNG implementation.
	 *
	 * The MIT License applies to this software. See the included LICENSE.txt file
	 * for more information.
	 */
	/**
	 * @brief Helper to increment the 128-bit counter (see section 9.4).
	 */
	public static void fortuna_increment_counter() {
		Object generatedGen = this.getGen();
		generatedGen.getCounter().getSplit().getL()++;
		if (generatedGen.getCounter().getSplit().getL() == /* on overflow of low, increment high */0) {
			generatedGen.getCounter().getSplit().getH()++;
		} 
	}
	/*
	 * Corresponds to section 9.4.2.
	 */
	public static void fortuna_reseed(Object seed, Object length) {
		 ctx = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_init(ctx);
		Object generatedGen = this.getGen();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_update(ctx, generatedGen.getKey(), 32);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_update(ctx, seed, length);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_final(ctx, generatedGen.getKey());
		/* if the generator was unseeded, this will mark it as seeded */state.fortuna_increment_counter();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ctx, 0, /*Error: sizeof expression not supported yet*/);
	}
	/*
	 * Corresponds to section 9.4.3.
	 */
	public static int fortuna_generate_blocks(Object out, Object blocks) {
		 cipher = new ();
		Object generatedGen = this.getGen();
		if (generatedGen.getCounter().getSplit().getL() == 0 && generatedGen.getCounter().getSplit().getH() == /* check if generator has been seeded */0) {
			return -1;
		} 
		int res = /*Error: Function owner not recognized*/aes_init(cipher, generatedGen.getKey(), (/* initialize cipher based on state */true));
		if (res != CIPHER_INIT_SUCCESS) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(cipher, 0, /*Error: sizeof expression not supported yet*/);
			return -2;
		} 
		for (size_t i = 0;
		 i < blocks; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/aes_encrypt(cipher, generatedGen.getCounter().getBytes(), out + (i * 16));
			state.fortuna_increment_counter();
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(cipher, 0, /*Error: sizeof expression not supported yet*/);
		return 0/*
		 * Corresponds to section 9.4.4.
		 */;
	}
	public static int fortuna_pseudo_random_data(Object out, Object bytes) {
		uint8_t[] buf = new uint8_t();
		if (bytes > (-1024 << /* maximum number of bytes per read is FORTUNA_RESEED_LIMIT */20)) {
			return -1;
		} 
		Object generatedGen = this.getGen();
		if (generatedGen.getCounter().getSplit().getL() == 0 && generatedGen.getCounter().getSplit().getH() == /* check if generator has been seeded */0) {
			return -2;
		} 
		size_t blocks = bytes / /* generate blocks per 16 bytes */16;
		if (state.fortuna_generate_blocks(out, blocks)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(buf, 0, /*Error: sizeof expression not supported yet*/);
			return -3;
		} 
		size_t remaining = bytes % /* generate one block for the remaining bytes */16;
		if (remaining) {
			if (state.fortuna_generate_blocks(buf, 1)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(buf, 0, /*Error: sizeof expression not supported yet*/);
				return -3;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out + (blocks * 16), buf, remaining);
		} 
		if (state.fortuna_generate_blocks(generatedGen.getKey(), /* switch to a new key to avoid later compromises of this output */2)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(buf, 0, /*Error: sizeof expression not supported yet*/);
			return -3;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(buf, 0, /*Error: sizeof expression not supported yet*/);
		return 0/*
		 * Corresponds to section 9.4.1 and 9.5.4.
		 */;
	}
	public static int fortuna_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(state, 0, /*Error: Unsupported expression*//* set everything to zero, then initialize the pools */);
		Object generatedPools = this.getPools();
		for (int i = 0;
		 i < (int)(true); i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_init(generatedPools[i].getCtx());
		}
		Object generatedLock = this.getLock();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_init(generatedLock);
		return 0/*
		 * Corresponds to section 9.5.5.
		 */;
	}
	public static int fortuna_random_data(Object out, Object bytes) {
		uint8_t[] buf = new uint8_t();
		Object generatedLock = this.getLock();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(generatedLock);
		Object generatedPools = this.getPools();
		Object generatedReseeds = this.getReseeds();
		if (generatedPools[0].getLen() >= (true)) {
			generatedReseeds++;
			size_t len = 0;
			for (int i = 0;
			 i < (int)(true); i++) {
				if (generatedReseeds | (1 << i)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_final(generatedPools[i].getCtx(), buf[len]);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_init(generatedPools[i].getCtx());
					generatedPools[i].setLen(0);
					len += /* append length of SHA-256 hash */32;
				} 
			}
			state.fortuna_reseed(buf, len);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(buf, 0, /*Error: sizeof expression not supported yet*/);
		} 
		int res = state.fortuna_pseudo_random_data(out, /* read bytes from the generator */bytes);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedLock);
		return res/*
		 * Corresponds to section 9.5.6.
		 */;
	}
	public static int fortuna_add_random_event(Object data, Object length, Object source, Object pool) {
		if (length < 1 || length > 32) {
			return -1;
		} 
		if (pool >= (true)) {
			return -2;
		} 
		Object generatedLock = this.getLock();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(generatedLock);
		uint8_t[] header = new uint8_t();
		header[0] = source;
		header[1] = length;
		Object generatedPools = this.getPools();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_update(generatedPools[pool].getCtx(), header, 2);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_update(generatedPools[pool].getCtx(), (uint8_t)data, length);
		generatedPools[pool].getLen() += length;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedLock);
		return 0/*
		 * Corresponds to section 9.6.2.
		 */;
	}
	public static int fortuna_write_seed(Object out) {
		return state.fortuna_random_data((uint8_t)out, (true/*
		 * Corresponds to section 9.6.2.
		 */));
	}
	public static int fortuna_update_seed(Object inout) {
		Object generatedLock = this.getLock();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(generatedLock);
		state.fortuna_reseed((uint8_t)inout, (/* reseed using the provided seed */true));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedLock);
		return state.fortuna_random_data((uint8_t)inout, (/* the seed file must be overwritten by a new seed file */true));
	}
	/*
	 * Copyright (c) 1996 by Internet Software Consortium.
	 * Copyright (c) 2015 by Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * Permission to use, copy, modify, and distribute this software for any
	 * purpose with or without fee is hereby granted, provided that the above
	 * copyright notice and this permission notice appear in all copies.
	 *
	 * THE SOFTWARE IS PROVIDED "AS IS" AND INTERNET SOFTWARE CONSORTIUM DISCLAIMS
	 * ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES
	 * OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL INTERNET SOFTWARE
	 * CONSORTIUM BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL
	 * DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR
	 * PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
	 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS
	 * SOFTWARE.
	 */
	/**
	 * @ingroup     net_ipv6_addr
	 * @{
	 *
	 * @file
	 *
	 * @author      Paul Vixie
	 * @author      Martine Lenders <mlenders@inf.fu-berlin.de>
	 */
	/* Length of an IPv6 address in 16-bit words */
	/* based on inet_ntop6() by Paul Vixie */
	public static Byte ipv6_addr_to_str(Byte result, Object addr, Object result_len) {
		byte[] tmp = new byte[IPV6_ADDR_MAX_STR_LEN];
		byte tp;
		Object best = {-1, 0};
		Object cur = {-1, 0};
		if ((result == ((Object)0)) || (addr == ((Object)0))) {
			return ((Object)0/*
			     * Preprocess:
			     *  Find the longest run of 0x0000's in address for :: shorthanding.
			     */);
		} 
		Object generatedBase = cur.getBase();
		Object generatedLen = cur.getLen();
		for (uint8_t i = 0;
		 i < (/*Error: Unsupported expression*/ / /*Error: Unsupported expression*/); i++) {
			if (addr.getU16()[i].getU16() == 0) {
				if (generatedBase == -1) {
					cur.setBase(i);
					cur.setLen(1);
				} else {
						generatedLen++;
				} 
			} else {
					if (generatedBase != -1) {
						if (generatedBase == -1 || generatedLen > generatedLen) {
							best = cur;
						} 
						cur.setBase(-1);
					} 
			} 
		}
		if (generatedBase != -1) {
			if (generatedBase == -1 || generatedLen > generatedLen) {
				best = cur;
			} 
		} 
		if (generatedBase != -1 && generatedLen < 2) {
			best.setBase(-1);
		} 
		tp = /*
		     * Format the result.
		     */tmp;
		for (int i = 0;
		 i < ((int)(/*Error: Unsupported expression*/ / /*Error: Unsupported expression*/)); /*Error: Unsupported expression*/) {
			if (i == generatedBase) {
				tp++ = (byte)':';
				i += generatedLen;
				continue;
			} 
			if (i != /* Are we following an initial run of 0x00s or any real hex? */0) {
				tp++ = (byte)':'/* Is this address an encapsulated IPv4? */;
			} 
			if ((addr.getU16()[i].getU8()[0] & -1024) != -1024) {
				tp++ = "0123456789abcdef"[addr.getU16()[i].getU8()[0] >> 4];
				tp++ = "0123456789abcdef"[addr.getU16()[i].getU8()[0] & -1024];
				tp++ = "0123456789abcdef"[addr.getU16()[i].getU8()[1] >> 4];
			}  else if ((addr.getU16()[i].getU8()[0] & -1024) != -1024) {
				tp++ = "0123456789abcdef"[addr.getU16()[i].getU8()[0] & -1024];
				tp++ = "0123456789abcdef"[addr.getU16()[i].getU8()[1] >> 4];
			}  else if ((addr.getU16()[i].getU8()[1] & -1024) != -1024) {
				tp++ = "0123456789abcdef"[addr.getU16()[i].getU8()[1] >> 4];
			} 
			tp++ = "0123456789abcdef"[addr.getU16()[i].getU8()[1] & -1024];
			i++;
		}
		if (generatedBase != -1 && (generatedBase + generatedLen) == (/*Error: Unsupported expression*/ / /*Error: Unsupported expression*//* Was it a trailing run of 0x00's? */)) {
			tp++ = (byte)':';
		} 
		tp++ = (byte)'\0'/*
		     * Check for overflow, copy, and we're done.
		     */;
		if ((size_t)(tp - tmp) > result_len) {
			return ((Object)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy(result, tmp);
		return result/**
		 * @}
		 */;
	}
	/*
	 * Copyright (C) 2018       HAW Hamburg
	 * Copyright (C) 2015–2017  Cenk Gündoğan <mail-github@cgundogan.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser General
	 * Public License v2.1. See the file LICENSE in the top level directory for
	 * more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 *
	 * @author      Cenk Gündoğan <cenk.guendogan@haw-hamburg.de>
	 */
	public static int _gnrc_rpl_init(Byte arg) {
		 iface_pid = /*Error: Function owner not recognized*/atoi(arg);
		if (/*Error: Function owner not recognized*/gnrc_netif_get_by_pid(iface_pid) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("unknown interface specified");
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_rpl_init(iface_pid);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("successfully initialized RPL on interface %d\n", iface_pid);
		return 0;
	}
	public static int _gnrc_rpl_dodag_root(Byte arg1, Byte arg2) {
		uint8_t instance_id = /*Error: Function owner not recognized*/atoi(arg1);
		 dodag_id = new ();
		if (ModernizedCProgram.ipv6_addr_from_str(dodag_id, arg2) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: <dodag_id> must be a valid IPv6 address");
			return 1;
		} 
		 inst = /*Error: Function owner not recognized*/gnrc_rpl_root_init(instance_id, dodag_id, false, false);
		if (inst == ((Object)0)) {
			byte[] addr_str = new byte[IPV6_ADDR_MAX_STR_LEN];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: could not add DODAG (%s) to instance (%d)\n", ModernizedCProgram.ipv6_addr_to_str(addr_str, dodag_id, /*Error: sizeof expression not supported yet*/), instance_id);
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("successfully added a new RPL DODAG\n");
		return 0;
	}
	public static int _gnrc_rpl_instance_remove(Byte arg1) {
		uint8_t instance_id = /*Error: Function owner not recognized*/atoi(arg1);
		 inst = new ();
		if ((inst = /*Error: Function owner not recognized*/gnrc_rpl_instance_get(instance_id)) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: could not find the instance (%d)\n", instance_id);
			return 1;
		} 
		if (/*Error: Function owner not recognized*/gnrc_rpl_instance_remove(inst) == false) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: could not remove instance (%d)\n", instance_id);
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: removed instance (%d)\n", instance_id);
		return 0;
	}
	public static int _gnrc_rpl_trickle_reset(Byte arg1) {
		uint8_t instance_id = /*Error: Function owner not recognized*/atoi(arg1);
		 inst = new ();
		byte[] addr_str = new byte[IPV6_ADDR_MAX_STR_LEN];
		if ((inst = /*Error: Function owner not recognized*/gnrc_rpl_instance_get(instance_id)) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: could not find the <instance_id>");
			return 1;
		} 
		(inst.getDodag().getTrickle()).trickle_reset_timer();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: reset trickle timer of DODAG (%s) from instance (%d)\n", ModernizedCProgram.ipv6_addr_to_str(addr_str, (inst.getDodag().getDodag_id()), /*Error: sizeof expression not supported yet*/), instance_id);
		return 0;
	}
	public static int _gnrc_rpl_trickle_stop(Byte arg1) {
		uint8_t instance_id = /*Error: Function owner not recognized*/atoi(arg1);
		 inst = new ();
		byte[] addr_str = new byte[IPV6_ADDR_MAX_STR_LEN];
		if ((inst = /*Error: Function owner not recognized*/gnrc_rpl_instance_get(instance_id)) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: could not find the <instance_id>");
			return 1;
		} 
		(inst.getDodag().getTrickle()).trickle_stop();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: stopped trickle timer of DODAG (%s) from instance (%d)\n", ModernizedCProgram.ipv6_addr_to_str(addr_str, (inst.getDodag().getDodag_id()), /*Error: sizeof expression not supported yet*/), instance_id);
		return 0;
	}
	public static int _gnrc_rpl_trickle_start(Byte arg1) {
		uint8_t instance_id = /*Error: Function owner not recognized*/atoi(arg1);
		 inst = new ();
		byte[] addr_str = new byte[IPV6_ADDR_MAX_STR_LEN];
		if ((inst = /*Error: Function owner not recognized*/gnrc_rpl_instance_get(instance_id)) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: could not find the <instance_id>");
			return 1;
		} 
		(inst.getDodag().getTrickle()).trickle_start(gnrc_rpl_pid, GNRC_RPL_MSG_TYPE_TRICKLE_MSG, (1 << inst.getDodag().getDio_min()), inst.getDodag().getDio_interval_doubl(), inst.getDodag().getDio_redun());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: started trickle timer of DODAG (%s) from instance (%d)\n", ModernizedCProgram.ipv6_addr_to_str(addr_str, (inst.getDodag().getDodag_id()), /*Error: sizeof expression not supported yet*/), instance_id);
		return 0;
	}
	public static int _gnrc_rpl_send_dis_w_sol_opt(Byte VID, Byte version, Byte instance, Byte dodag) {
		uint8_t VID_flags = /*Error: Function owner not recognized*/atoi(VID);
		uint8_t version_number = /*Error: Function owner not recognized*/atoi(version);
		uint8_t instance_id = /*Error: Function owner not recognized*/atoi(instance);
		 sol = new ();
		sol.setType(GNRC_RPL_OPT_SOLICITED_INFO);
		sol.setLength(GNRC_RPL_DIS_SOLICITED_INFO_LENGTH);
		sol.setVID_flags(/*Error: Function owner not recognized*/htons(VID_flags));
		sol.setVersion_number(version_number);
		sol.setInstance_id(instance_id);
		if (ModernizedCProgram.ipv6_addr_from_str(sol.getDodag_id(), dodag)) {
			[] opt = new []{()sol};
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_rpl_send_DIS(((Object)0), ()ipv6_addr_all_rpl_nodes, opt, 1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("success: send a DIS with SOL option\n");
		} 
		return 0;
	}
	public static int _gnrc_rpl_send_dis() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_rpl_send_DIS(((Object)0), ()ipv6_addr_all_rpl_nodes, ((Object)0), 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("success: send a DIS\n");
		return 0;
	}
	public static int _gnrc_rpl_dodag_show() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("instance table:\t");
		for (uint8_t i = 0;
		 i < GNRC_RPL_INSTANCES_NUMOF; ++i) {
			if (gnrc_rpl_instances[i].getState() == 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[ ]");
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[X]");
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\t');
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("parent table:\t");
		for (uint8_t i = 0;
		 i < GNRC_RPL_PARENTS_NUMOF; ++i) {
			if (gnrc_rpl_parents[i].getState() == 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[ ]");
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[X]");
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\t');
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
		 dodag = ((Object)0);
		byte[] addr_str = new byte[IPV6_ADDR_MAX_STR_LEN];
		uint64_t tc = new uint64_t();
		uint64_t xnow = ModernizedCProgram.xtimer_now_usec64();
		return 0;
	}
	public static int _gnrc_rpl_operation(Object leaf, Byte arg1) {
		uint8_t instance_id = /*Error: Function owner not recognized*/atoi(arg1);
		 inst = new ();
		if ((inst = /*Error: Function owner not recognized*/gnrc_rpl_instance_get(instance_id)) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: could not find the instance (%d)\n", instance_id);
			return 1;
		} 
		if (leaf) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_rpl_leaf_operation(inst.getDodag());
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_rpl_router_operation(inst.getDodag());
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: operate in instance (%d) as %s\n", instance_id, leaf ? "leaf" : "router");
		return 0;
	}
	public static int _gnrc_rpl_set_pio(Byte inst_id, Object status) {
		uint8_t instance_id = /*Error: Function owner not recognized*/atoi(inst_id);
		 inst = new ();
		if ((inst = /*Error: Function owner not recognized*/gnrc_rpl_instance_get(instance_id)) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: could not find the instance (%d)\n", instance_id);
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_rpl_config_pio(inst.getDodag(), status);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: %sactivated PIO transmissions\n", status ? "" : "de");
		return 0;
	}
	public static int _gnrc_rpl(int argc, byte[][] argv) {
		if ((argc < 2) || (/*Error: Function owner not recognized*/strcmp(argv[1], "show") == 0)) {
			return ModernizedCProgram._gnrc_rpl_dodag_show();
		}  else if ((argc == 3) && /*Error: Function owner not recognized*/strcmp(argv[1], "init") == 0) {
			return ModernizedCProgram._gnrc_rpl_init(argv[2]);
		}  else if ((argc == 4) && /*Error: Function owner not recognized*/strcmp(argv[1], "root") == 0) {
			return ModernizedCProgram._gnrc_rpl_dodag_root(argv[2], argv[3]);
		}  else if (/*Error: Function owner not recognized*/strcmp(argv[1], "rm") == 0) {
			if (argc == 3) {
				return ModernizedCProgram._gnrc_rpl_instance_remove(argv[2]);
			} 
		}  else if (/*Error: Function owner not recognized*/strcmp(argv[1], "trickle") == 0) {
			if ((argc == 4) && (/*Error: Function owner not recognized*/strcmp(argv[2], "reset") == 0)) {
				return ModernizedCProgram._gnrc_rpl_trickle_reset(argv[3]);
			}  else if ((argc == 4) && (/*Error: Function owner not recognized*/strcmp(argv[2], "stop") == 0)) {
				return ModernizedCProgram._gnrc_rpl_trickle_stop(argv[3]);
			}  else if ((argc == 4) && (/*Error: Function owner not recognized*/strcmp(argv[2], "start") == 0)) {
				return ModernizedCProgram._gnrc_rpl_trickle_start(argv[3]);
			} 
		}  else if (/*Error: Function owner not recognized*/strcmp(argv[1], "send") == 0) {
			if ((argc == 3) && (/*Error: Function owner not recognized*/strcmp(argv[2], "dis") == 0)) {
				return ModernizedCProgram._gnrc_rpl_send_dis();
			} 
			if ((argc == 7) && (/*Error: Function owner not recognized*/strcmp(argv[2], "dis") == 0)) {
				return ModernizedCProgram._gnrc_rpl_send_dis_w_sol_opt(argv[3], argv[4], argv[5], argv[6]);
			} 
		}  else if (/*Error: Function owner not recognized*/strcmp(argv[1], "leaf") == 0) {
			if (argc == 3) {
				return ModernizedCProgram._gnrc_rpl_operation(true, argv[2]);
			} 
		}  else if (/*Error: Function owner not recognized*/strcmp(argv[1], "router") == 0) {
			if (argc == 3) {
				return ModernizedCProgram._gnrc_rpl_operation(false, argv[2]);
			} 
		}  else if (/*Error: Function owner not recognized*/strcmp(argv[1], "set") == 0) {
			if (argc > 2) {
				if (/*Error: Function owner not recognized*/strcmp(argv[2], "pio") == 0) {
					if ((argc == 5) && (/*Error: Function owner not recognized*/strcmp(argv[3], "on") == 0)) {
						return ModernizedCProgram._gnrc_rpl_set_pio(argv[4], true);
					}  else if ((argc == 5) && (/*Error: Function owner not recognized*/strcmp(argv[3], "off") == 0)) {
						return ModernizedCProgram._gnrc_rpl_set_pio(argv[4], false);
					} 
				} 
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* help\t\t\t\t\t- show usage");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* init <if_id>\t\t\t\t- initialize RPL on the given interface");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* leaf <instance_id>\t\t\t- operate as leaf in the instance");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* trickle reset <instance_id>\t\t- reset the trickle timer");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* trickle start <instance_id>\t\t- start the trickle timer");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* trickle stop <instance_id>\t\t- stop the trickle timer");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* rm <instance_id>\t\t\t- delete the given instance and related dodag");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* root <inst_id> <dodag_id>\t\t- add a dodag to a new or existing instance");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* router <instance_id>\t\t\t- operate as router in the instance");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* send dis\t\t\t\t- send a multicast DIS");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* send dis <VID_flags> <version> <instance_id> <dodag_id> - send a multicast DIS with SOL option");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* set pio <on/off> <instance_id>\t- (de-)activate PIO transmissions in DIOs");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("* show\t\t\t\t\t- show instance and dodag tables");
		return 0/**
		 * @}
		 */;
	}
	/**
	 * @brief Free resources on NewLib de-initialization, not used for RIOT
	 */
	/* __attribute__((used)) fixes linker errors when building with LTO, but without nano.specs */
	public static void _fini() {
	}
	/* nothing to do here */
	/**
	 * @brief Exit a program without cleaning up files
	 *
	 * If your system doesn't provide this, it is best to avoid linking with subroutines that
	 * require it (exit, system).
	 *
	 * @param n     the exit code, 0 for all OK, >0 for not OK
	 */
	public static void _exit(int n) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("#! exit %i: powering off\n", n);
		ModernizedCProgram.pm_off();
		while (1/**
		 * @brief Allocate memory from the heap.
		 *
		 * The current heap implementation is very rudimentary, it is only able to allocate
		 * memory. But it does not have any means to free memory again
		 *
		 * @return      pointer to the newly allocated memory on success
		 * @return      pointer set to address `-1` on failure
		 */) {
			;
		}
	}
	public static Object _sbrk_r(Object r, Object incr) {
		int state = /*Error: Function owner not recognized*/irq_disable();
		Object res = ModernizedCProgram.heap_top;
		if ((ModernizedCProgram.heap_top + incr > ModernizedCProgram._eheap) || (ModernizedCProgram.heap_top + incr < ModernizedCProgram._sheap)) {
			r.set_errno(12);
			res = (Object)-1;
		} else {
				ModernizedCProgram.heap_top += incr;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(state);
		return res/**
		 * @brief Print heap statistics
		 *
		 * If the CPU does not provide its own heap handling and heap_stats function,
		 * but instead uses the newlib_syscall_default function, this function outputs
		 * the heap statistics. If the CPU provides its own heap_stats function, it
		 * should define HAVE_HEAP_STATS in its cpu_conf.h file.
		 */;
	}
	public static void heap_stats() {
		mallinfo minfo = /*Error: Function owner not recognized*/mallinfo();
		long heap_size = ModernizedCProgram._eheap - ModernizedCProgram._sheap;
		Object generatedMallinfo = minfo.getMallinfo();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("heap: %ld (used %d, free %ld) [bytes]\n", heap_size, generatedMallinfo, heap_size - generatedMallinfo);
	}
	/**
	 * @brief Get the process-ID of the current thread
	 *
	 * @return      the process ID of the current thread
	 */
	public static Object _getpid() {
		return sched_active_pid/**
		 * @brief Get the process-ID of the current thread
		 *
		 * @return      the process ID of the current thread
		 */;
	}
	public static Object _getpid_r(Object ptr) {
		(Object)ptr;
		return sched_active_pid/**
		 * @brief Send a signal to a given thread
		 *
		 * @param r     TODO
		 * @param pid   TODO
		 * @param sig   TODO
		 *
		 * @return      TODO
		 */;
	}
	public static int _kill_r(Object r, Object pid, int sig) {
		(Object)pid;
		(Object)sig;
		r.set_errno(/* not implemented yet */3);
		return -1/**
		 * @brief Open a file
		 *
		 * This is a wrapper around @c vfs_open
		 *
		 * @param r     pointer to reent structure
		 * @param name  file name to open
		 * @param flags flags, see man 3p open
		 * @param mode  mode, file creation mode if the file is created when opening
		 *
		 * @return      fd number (>= 0) on success
		 * @return      -1 on error, @c r->_errno set to a constant from errno.h to indicate the error
		 */;
	}
	/* vfs returns negative error codes */
	/**
	 * @brief Read bytes from an open file
	 *
	 * This is a wrapper around @c vfs_read
	 *
	 * @param[in]  r      pointer to reent structure
	 * @param[in]  fd     open file descriptor obtained from @c open()
	 * @param[out] dest   destination buffer
	 * @param[in]  count  maximum number of bytes to read
	 *
	 * @return       number of bytes read on success
	 * @return       -1 on error, @c r->_errno set to a constant from errno.h to indicate the error
	 */
	/* vfs returns negative error codes */
	/**
	 * @brief Write bytes to an open file
	 *
	 * This is a wrapper around @c vfs_write
	 *
	 * @param[in]  r      pointer to reent structure
	 * @param[in]  fd     open file descriptor obtained from @c open()
	 * @param[in]  src    source data buffer
	 * @param[in]  count  maximum number of bytes to write
	 *
	 * @return       number of bytes written on success
	 * @return       -1 on error, @c r->_errno set to a constant from errno.h to indicate the error
	 */
	/* vfs returns negative error codes */
	/**
	 * @brief Close an open file
	 *
	 * This is a wrapper around @c vfs_close
	 *
	 * If this call returns an error, the fd should still be considered invalid and
	 * no further attempt to use it shall be made, not even to retry @c close()
	 *
	 * @param[in]  r      pointer to reent structure
	 * @param[in]  fd     open file descriptor obtained from @c open()
	 *
	 * @return       0 on success
	 * @return       -1 on error, @c r->_errno set to a constant from errno.h to indicate the error
	 */
	/* vfs returns negative error codes */
	/**
	 * @brief Query or set options on an open file
	 *
	 * This is a wrapper around @c vfs_fcntl
	 *
	 * @param[in]  r      pointer to reent structure
	 * @param[in]  fd     open file descriptor obtained from @c open()
	 * @param[in]  cmd    fcntl command, see man 3p fcntl
	 * @param[in]  arg    argument to fcntl command, see man 3p fcntl
	 *
	 * @return       0 on success
	 * @return       -1 on error, @c r->_errno set to a constant from errno.h to indicate the error
	 */
	/* vfs returns negative error codes */
	/**
	 * @brief Seek to position in file
	 *
	 * This is a wrapper around @c vfs_lseek
	 *
	 * @p whence determines the function of the seek and should be set to one of
	 * the following values:
	 *
	 *  - @c SEEK_SET: Seek to absolute offset @p off
	 *  - @c SEEK_CUR: Seek to current location + @p off
	 *  - @c SEEK_END: Seek to end of file + @p off
	 *
	 * @param[in]  r        pointer to reent structure
	 * @param[in]  fd       open file descriptor obtained from @c open()
	 * @param[in]  off      seek offset
	 * @param[in]  whence   determines the seek method, see detailed description
	 *
	 * @return the new seek location in the file on success
	 * @return -1 on error, @c r->_errno set to a constant from errno.h to indicate the error
	 */
	/* vfs returns negative error codes */
	/**
	 * @brief Get status of an open file
	 *
	 * This is a wrapper around @c vfs_fstat
	 *
	 * @param[in]  r        pointer to reent structure
	 * @param[in]  fd       open file descriptor obtained from @c open()
	 * @param[out] buf      pointer to stat struct to fill
	 *
	 * @return 0 on success
	 * @return -1 on error, @c r->_errno set to a constant from errno.h to indicate the error
	 */
	/* vfs returns negative error codes */
	/**
	 * @brief Status of a file (by name)
	 *
	 * This is a wrapper around @c vfs_fstat
	 *
	 * @param[in]  r        pointer to reent structure
	 * @param[in]  name     path to file
	 * @param[out] buf      pointer to stat struct to fill
	 *
	 * @return 0 on success
	 * @return -1 on error, @c r->_errno set to a constant from errno.h to indicate the error
	 */
	/* vfs returns negative error codes */
	/**
	 * @brief  Unlink (delete) a file
	 *
	 * @param[in]  r        pointer to reent structure
	 * @param[in]  path     path to file to be deleted
	 *
	 * @return 0 on success
	 * @return -1 on error, @c r->_errno set to a constant from errno.h to indicate the error
	 */
	/* vfs returns negative error codes */
	/* MODULE_VFS */
	/* Fallback stdio_uart wrappers for when VFS is not used, does not allow any
	 * other file access */
	/*
	 * Fallback read function
	 *
	 * All input is read from stdio_uart regardless of fd number. The function will
	 * block until a byte is actually read.
	 *
	 * Note: the read function does not buffer - data will be lost if the function is not
	 * called fast enough.
	 */
	public static Object _read_r(Object r, int fd, Object buffer, Object count) {
		(Object)r;
		(Object)fd;
		return ModernizedCProgram.stdio_read(buffer, count/*
		 * Fallback write function
		 *
		 * All output is directed to stdio_uart, independent of the given file descriptor.
		 * The write call will further block until the byte is actually written to the UART.
		 */);
	}
	public static Object _write_r(Object r, int fd, Object data, Object count) {
		(Object)r;
		(Object)fd;
		return ModernizedCProgram.stdio_write(data, count);
	}
	/* Stubs to avoid linking errors, these functions do not have any effect */
	public static int _open_r(Object r, Object name, int flags, int mode) {
		(Object)name;
		(Object)flags;
		(Object)mode;
		r.set_errno(19);
		return -1;
	}
	public static int _close_r(Object r, int fd) {
		(Object)fd;
		r.set_errno(19);
		return -1;
	}
	public static Object _lseek_r(Object r, int fd, Object pos, int dir) {
		(Object)fd;
		(Object)pos;
		(Object)dir;
		r.set_errno(19);
		return -1;
	}
	public static int _fstat_r(Object r, int fd) {
		(Object)fd;
		(Object)st;
		r.set_errno(19);
		return -1;
	}
	public static int _stat_r(Object r, Object name) {
		(Object)name;
		(Object)st;
		r.set_errno(19);
		return -1;
	}
	public static int _unlink_r(Object r, Object path) {
		(Object)path;
		r.set_errno(19);
		return -1/* MODULE_VFS *//**
		 * Create a hard link (not implemented).
		 *
		 * @todo    Not implemented.
		 *
		 * @return  -1. Sets errno to ENOSYS.
		 */;
	}
	public static int _link_r(Object ptr, Object old_name, Object new_name) {
		(Object)old_name;
		(Object)new_name;
		ptr.set_errno(40);
		return -1/**
		 * @brief Query whether output stream is a terminal
		 *
		 * @param r     TODO
		 * @param fd    TODO
		 *
		 * @return      TODO
		 */;
	}
	public static int _isatty_r(Object r, int fd) {
		r.set_errno(0);
		if (fd == 0 || fd == 1 || fd == 2) {
			return 1;
		} 
		return 0/**
		 * @brief Send a signal to a thread
		 *
		 * @param[in] pid the pid to send to
		 * @param[in] sig the signal to send
		 *
		 * @return TODO
		 */;
	}
	public static int _kill(Object pid, int sig) {
		(Object)pid;
		(Object)sig;
		(/*Error: Function owner not recognized*/_errno()) = /* not implemented yet */3;
		return -1;
	}
	public static int _gettimeofday_r(Object r, Object tp, Object tzp) {
		(Object)tp;
		(Object)tzp;
		r.set_errno(40);
		return -1/**
		 * Current process times (not implemented).
		 *
		 * @param[out]  ptms    Not modified.
		 *
		 * @return  -1, this function always fails. errno is set to ENOSYS.
		 */;
	}
	public static Object _times_r(Object ptr, Object ptms) {
		(Object)ptms;
		ptr.set_errno(40);
		return (true);
	}
	public static void sched_statistics_cb(Object active_thread, Object next_thread) {
		uint32_t now = ModernizedCProgram.xtimer_now().getTicks32();
		schedstat_t active_stat = ModernizedCProgram.sched_pidlist[/* Update active thread runtime, there is allways an active thread since
		       first sched_run happens when main_trampoline gets scheduled */active_thread];
		Object generatedRuntime_ticks = active_stat.getRuntime_ticks();
		Object generatedLaststart = active_stat.getLaststart();
		generatedRuntime_ticks += now - generatedLaststart;
		schedstat_t next_stat = ModernizedCProgram.sched_pidlist[/* Update next_thread stats */next_thread];
		next_stat.setLaststart(now);
		Object generatedSchedules = next_stat.getSchedules();
		generatedSchedules++;
	}
	public static void init_schedstatistics() {
		schedstat_t active_stat = ModernizedCProgram.sched_pidlist[/* Init laststart for the thread starting schedstatistics since the callback
		       wasn't registered when it was first scheduled */sched_active_pid];
		active_stat.setLaststart(ModernizedCProgram.xtimer_now().getTicks32());
		active_stat.setSchedules(1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_register_cb(sched_statistics_cb);
	}
	/* $OpenBSD: moddi3.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Return remainder after dividing two signed quads.
	 *
	 * XXX  we assume a % b < 0 iff a < 0, but this is actually machine-dependent.
	 */
	public static Object __moddi3(Object a, Object b) {
		u_quad_t ua = new u_quad_t();
		u_quad_t ub = new u_quad_t();
		u_quad_t ur = new u_quad_t();
		int neg = 0;
		ua = a;
		ub = b;
		if (a < 0) {
			ua = -ua;
			neg = 1;
		} 
		if (b < 0) {
			ub = -ub;
		} 
		(Object)ModernizedCProgram.__qdivrem(ua, ub, ur);
		if (neg) {
			ur = -ur;
		} 
		return ur;
	}
	/*
	 * Copyright (C) 2013 Freie Universität Berlin
	 *               2015 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Shell commands for random generators
	 *
	 * @author      Christian Mehlis <mehlis@inf.fu-berlin.de>
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 * @}
	 */
	public static int _random_init(int argc, byte[][] argv) {
		int initval;
		if (argc == 1) {
			(Object)initval;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("xtimer module not compiled in, can't initialize by time.\nPlease provide a seed.\n");
			return 1;
		} else {
				initval = /*Error: Function owner not recognized*/atoi(argv[1]);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("PRNG initialized given value: %d\n", initval);
		} 
		ModernizedCProgram.random_init(initval);
		return 0;
	}
	public static int _random_get(int argc, Byte argv) {
		(Object)argc;
		(Object)argv;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%u\n", ModernizedCProgram.random_uint32());
		return 0;
	}
	/*
	 * Copyright (C) 2019 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 * @author  Martine Lenders <m.lenders@fu-berlin.de>
	 */
	public static int _gnrc_6lo_frag_stats(int argc, Byte argv) {
		 stats = /*Error: Function owner not recognized*/gnrc_sixlowpan_frag_stats_get();
		(Object)argc;
		(Object)argv;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("rbuf full: %u\n", stats.getRbuf_full());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("frag full: %u\n", stats.getFrag_full());
		return 0/** @} */;
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
	public static void flush_if_needed() {
	}
	public static Object find_handler(Object command_list, Byte command) {
		shell_command_t[] command_lists = new shell_command_t[]{command_list};
		for (int i = 0;
		 i < /*Error: Function owner not recognized*/ARRAY_SIZE(command_lists); /* iterating over command_lists */i++) {
			shell_command_t entry = new shell_command_t();
			if ((entry = command_lists[i])) {
				while (entry.getName() != ((Object)/* iterating over commands in command_lists entry */0)) {
					if (/*Error: Function owner not recognized*/strcmp(entry.getName(), command) == 0) {
						return entry.getHandler();
					} else {
							entry++;
					} 
				}
			} 
		}
		return ((Object)0);
	}
	public static void print_help(Object command_list) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%-20s %s\n", "Command", "Description");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("---------------------------------------");
		shell_command_t[] command_lists = new shell_command_t[]{command_list};
		for (int i = 0;
		 i < /*Error: Function owner not recognized*/ARRAY_SIZE(command_lists); /* iterating over command_lists */i++) {
			shell_command_t entry = new shell_command_t();
			if ((entry = command_lists[i])) {
				while (entry.getName() != ((Object)/* iterating over commands in command_lists entry */0)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%-20s %s\n", entry.getName(), entry.getDesc());
					entry++;
				}
			} 
		}
	}
	public static void handle_input_line(Object command_list, Byte line) {
		byte INCORRECT_QUOTING = "shell: incorrect quoting";
		int argc = /* first we need to calculate the number of arguments */0;
		byte pos = line;
		int contains_esc_seq = 0;
		while (1) {
			if ((byte)pos > (byte)' ') {
				if (pos == (byte)'"' || pos == /* found an argument */(byte)'\'') {
					byte quote_char = /* it's a quoted argument */pos;
					do {
						++pos;
						if (!pos) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(INCORRECT_QUOTING);
							return /*Error: Unsupported expression*/;
						}  else if (pos == (byte)'\\') {
							++/* skip over the next character */contains_esc_seq;
							++pos;
							if (!pos) {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(INCORRECT_QUOTING);
								return /*Error: Unsupported expression*/;
							} 
							continue;
						} 
					} while (pos != quote_char);
					if ((byte)pos[1] > (byte)' ') {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(INCORRECT_QUOTING);
						return /*Error: Unsupported expression*/;
					} 
				} else {
						do {
							if (pos == (byte)'\\') {
								++/* skip over the next character */contains_esc_seq;
								++pos;
								if (!pos) {
									/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(INCORRECT_QUOTING);
									return /*Error: Unsupported expression*/;
								} 
							} 
							++pos;
							if (pos == (byte)'"') {
								/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(INCORRECT_QUOTING);
								return /*Error: Unsupported expression*/;
							} 
						} while ((byte)pos > (byte)' ');
				} 
				++/* count the number of arguments we got */argc;
			} 
			if (pos > /* zero out the current position (space or quotation mark) and advance */0) {
				pos = 0;
				++pos;
			} else {
					break;
			} 
		}
		if (!argc) {
			return /*Error: Unsupported expression*/;
		} 
		byte[] argv = new byte[argc + /* then we fill the argv array */1];
		argv[argc] = ((Object)0);
		pos = line;
		for (int i = 0;
		 i < argc; ++i) {
			while (!pos) {
				++pos;
			}
			if (pos == (byte)'"' || pos == (byte)'\'') {
				++pos;
			} 
			argv[i] = pos;
			while (pos) {
				++pos;
			}
		}
		for (byte arg = argv;
		 contains_esc_seq && arg; ++arg) {
			for (byte c = arg;
			 c; ++c) {
				if (c != (byte)'\\') {
					continue;
				} 
				for (byte d = c;
				 d; ++d) {
					d = d[1];
				}
				if (--contains_esc_seq == 0) {
					break;
				} 
			}
		}
		shell_command_handler_t handler = ModernizedCProgram.find_handler(command_list, argv[/* then we call the appropriate handler */0]);
		if (handler != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/handler(argc, argv);
		} else {
				if (/*Error: Function owner not recognized*/strcmp("help", argv[0]) == 0) {
					ModernizedCProgram.print_help(command_list);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("shell: command not found: %s\n", argv[0]);
				} 
		} 
	}
	public static int readline(Byte buf, Object size) {
		byte line_buf_ptr = buf;
		while (1) {
			if ((line_buf_ptr - buf) >= ((int)size) - 1) {
				return -1;
			} 
			int c = /*Error: Function owner not recognized*/getchar();
			if (c < 0) {
				return (true/* We allow Unix linebreaks (\n), DOS linebreaks (\r\n), and Mac linebreaks (\r). */);
			} 
			if (c == (byte)'\r' || c == (byte)'\n' || c == /* QEMU transmits only a single '\r' == 13 on hitting enter ("-serial stdio"). *//* DOS newlines are handled like hitting enter twice, but empty lines are ignored. *//* Ctrl-C cancels the current line. */(byte)'\x03') {
				line_buf_ptr = (byte)'\0';
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\r');
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\n');
				return c == (byte)'\x03' || line_buf_ptr == /* return 1 if line is empty, 0 otherwise */buf;
			}  else if (c == -1024 || c == /* QEMU uses 0x7f (DEL) as backspace, while 0x08 (BS) is for most terminals */-1024) {
				if (line_buf_ptr == buf/* The line is empty. */) {
					continue;
				} 
				--line_buf_ptr = (byte)'\0'/* white-tape the character */;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\b');
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)' ');
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'\b');
			} else {
					line_buf_ptr++ = c;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar(c);
			} 
			ModernizedCProgram.flush_if_needed();
		}
	}
	public static void print_prompt() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)'>');
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putchar((byte)' ');
		ModernizedCProgram.flush_if_needed();
	}
	public static void shell_run_once(Object shell_commands, Byte line_buf, int len) {
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
	/* $OpenBSD: umoddi3.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Return remainder after dividing two unsigned quads.
	 */
	public static Object __umoddi3(Object a, Object b) {
		u_quad_t r = new u_quad_t();
		(Object)ModernizedCProgram.__qdivrem(a, b, r);
		return r;
	}
	/*
	 * Copyright (C) 2015 Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 */
	public static int u32_to_str(byte[] str, Object u32) {
		int len;
		int i = 0;
		if (u32 == 0) {
			str[i] = (byte)'0';
			return 1;
		} 
		for (; u32 > 0; u32 /= (true)) {
			byte digit = (byte)(u32 % (true));
			str[i++] = (byte)'0' + ModernizedCProgram.digit;
		}
		len = i;
		/* go back to last character */i--;
		for (int j = 0;
		 j < i; ) {
			byte tmp = str[i];
			str[i] = str[j];
			str[j] = tmp;
		}
		return len;
	}
	public static Object timex_to_str(byte[] timestamp) {
		t.timex_normalize();
		byte dec;
		uint8_t offset = 6;
		Object generatedSeconds = this.getSeconds();
		dec = timestamp[ModernizedCProgram.u32_to_str(timestamp, generatedSeconds)];
		(dec++) = /* set decimal point */(byte)'.';
		Object generatedMicroseconds = this.getMicroseconds();
		for (uint32_t i = 100000;
		 i > 1; i /= /* timex_normalize() ensures that i < 1000000 */10) {
			if (generatedMicroseconds < /* pad with 0's */i) {
				(dec++) = (byte)'0';
				offset--;
			} 
		}
		ModernizedCProgram.u32_to_str(dec, generatedMicroseconds);
		dec += offset;
		(dec++) = /* append unit */(byte)' ';
		(dec++) = (byte)'s';
		(dec) = (byte)'\0';
		return timestamp/** @} */;
	}
	/**
	 * Copyright (C) 2017 Kaspar Schleiser <kaspar@schleiser.de>
	 *               2019 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_random
	 * @{
	 * @file
	 *
	 * @brief       PRNG seeding
	 *
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
	 * @}
	 */
	public static void auto_init_random() {
		uint32_t seed = new uint32_t();
		/* TODO: hand state to application? */
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_WARNING("random: NO SEED AVAILABLE!\n");
		seed = (true);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("random: using seed value %u\n", (int)seed);
		ModernizedCProgram.random_init(seed);
	}
	public static void random_bytes(Object target, Object n) {
		uint32_t random = new uint32_t();
		uint8_t random_pos = (uint8_t)random;
		int _n = 0;
		while (n--) {
			if (!(_n++ & -1024)) {
				random = ModernizedCProgram.random_uint32();
				random_pos = (uint8_t)random;
			} 
			target++ = random_pos++;
		}
	}
	public static Object random_uint32_range(Object a, Object b) {
		((a < b) ? (Object)0 : /*Error: Function owner not recognized*/_assert("a < b", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\random.c", 80));
		uint32_t divisor = new uint32_t();
		uint32_t rand_val = new uint32_t();
		uint32_t range = b - a;
		uint8_t range_msb = /*Error: Function owner not recognized*/bitarithm_msb(range);
		if (!(range & (range - /* check if range is a power of two */1))) {
			divisor = (1 << range_msb) - 1;
		}  else if (range_msb < 31) {
			divisor = (1 << (range_msb + 1)) - /* leftshift for next power of two interval */1;
		} else {
				divisor = /* disable modulo operation in loop below */-1024;
		} 
		/* get random numbers until value is smaller than range */do {
			rand_val = (ModernizedCProgram.random_uint32() & divisor);
		} while (rand_val >= range);
		return (rand_val + /* return random in range [a,b] */a);
	}
	public static void _set_version(int version) {
		Object generatedTime_hi = this.getTime_hi();
		uint16_t time_hi = /*Error: Function owner not recognized*/byteorder_ntohs(generatedTime_hi) & -1024;
		time_hi |=  (version << 12);
		this.setTime_hi(/*Error: Function owner not recognized*/byteorder_htons(time_hi));
	}
	public static void _set_reserved() {
		Object generatedClk_seq_hi_res = this.getClk_seq_hi_res();
		this.setClk_seq_hi_res((generatedClk_seq_hi_res & -1024) | -1024);
	}
	public static void uuid_v3(Object ns, Object name, Object len) {
		/* Digest calculation */ ctx = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_init(ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(ctx, ns, /*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(ctx, name, len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_final(ctx, uuid);
		uuid._set_version((true));
		uuid._set_reserved();
	}
	public static void uuid_v4() {
		ModernizedCProgram.random_bytes((uint8_t)uuid, /*Error: Unsupported expression*/);
		uuid._set_version((true));
		uuid._set_reserved();
	}
	public static void uuid_v5(Object ns, Object name, Object len) {
		uint8_t[] digest = new uint8_t();
		 ctx = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_init(ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_update(ctx, ns, /*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_update(ctx, name, len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha1_final(ctx, digest);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(uuid, digest, /*Error: Unsupported expression*/);
		uuid._set_version((true));
		uuid._set_reserved();
	}
	public static void uuid_to_string(Object uuid, Byte str) {
		byte p = str;
		p += /*Error: Function owner not recognized*/fmt_u32_hex(p, /*Error: Function owner not recognized*/byteorder_ntohl(uuid.getTime_low()));
		p += /*Error: Function owner not recognized*/fmt_char(p, (byte)'-');
		p += /*Error: Function owner not recognized*/fmt_u16_hex(p, /*Error: Function owner not recognized*/byteorder_ntohs(uuid.getTime_mid()));
		p += /*Error: Function owner not recognized*/fmt_char(p, (byte)'-');
		p += /*Error: Function owner not recognized*/fmt_u16_hex(p, /*Error: Function owner not recognized*/byteorder_ntohs(uuid.getTime_hi()));
		p += /*Error: Function owner not recognized*/fmt_char(p, (byte)'-');
		p += /*Error: Function owner not recognized*/fmt_byte_hex(p, uuid.getClk_seq_hi_res());
		p += /*Error: Function owner not recognized*/fmt_byte_hex(p, uuid.getClk_seq_low());
		p += /*Error: Function owner not recognized*/fmt_char(p, (byte)'-');
		p += /*Error: Function owner not recognized*/fmt_bytes_hex(p, uuid.getNode(), (true));
		p = (byte)'\0';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fmt_to_lower(str, str);
	}
	public static int uuid_from_string(Object str) {
		uint32_t tmp = new uint32_t();
		if (/*Error: Function owner not recognized*/fmt_strlen(str) < (true)) {
			return -1;
		} 
		tmp = /*Error: Function owner not recognized*/scn_u32_hex(str, 8);
		this.setTime_low(/*Error: Function owner not recognized*/byteorder_htonl(tmp));
		str += 8;
		if (str++ != (byte)'-') {
			return -2;
		} 
		tmp = /*Error: Function owner not recognized*/scn_u32_hex(str, 4);
		this.setTime_mid(/*Error: Function owner not recognized*/byteorder_htons(tmp));
		str += 4;
		if (str++ != (byte)'-') {
			return -2;
		} 
		tmp = /*Error: Function owner not recognized*/scn_u32_hex(str, 4);
		this.setTime_hi(/*Error: Function owner not recognized*/byteorder_htons(tmp));
		str += 4;
		if (str++ != (byte)'-') {
			return -2;
		} 
		this.setClk_seq_hi_res(/*Error: Function owner not recognized*/scn_u32_hex(str, 2));
		str += 2;
		this.setClk_seq_low(/*Error: Function owner not recognized*/scn_u32_hex(str, 2));
		str += 2;
		if (str++ != (byte)'-') {
			return -2;
		} 
		Object generatedNode = this.getNode();
		for (int i = 0;
		 i < (true); i++) {
			generatedNode[i] = /*Error: Function owner not recognized*/scn_u32_hex(str, 2);
			str += 2;
		}
		return 0;
	}
	public static int _whitelist(int argc, byte[][] argv) {
		 addr = new ();
		if (argc < 2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_whitelist_print();
			return 0;
		}  else if (argc > 2) {
			if (ModernizedCProgram.ipv6_addr_from_str(addr, argv[2]) == ((Object)0)) {
				ModernizedCProgram._usage(argv[0]);
				return 1;
			} 
		} 
		if (/*Error: Function owner not recognized*/strcmp("add", argv[1]) == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_whitelist_add(addr);
		}  else if (/*Error: Function owner not recognized*/strcmp("del", argv[1]) == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_whitelist_del(addr);
		}  else if (/*Error: Function owner not recognized*/strcmp("help", argv[1]) == 0) {
			ModernizedCProgram._usage(argv[0]);
		} else {
				ModernizedCProgram._usage(argv[0]);
				return 1;
		} 
		return 0/** @} */;
	}
	public static Object ipv6_addr_equal(Object a, Object b) {
		return (a.getU64()[0].getU64() == b.getU64()[0].getU64()) && (a.getU64()[1].getU64() == b.getU64()[1].getU64());
	}
	public static Object ipv6_addr_match_prefix(Object a, Object b) {
		 prefix_len = 0;
		if ((a == ((Object)0)) || (b == ((Object)0))) {
			return 0;
		} 
		if (a == b) {
			return 128;
		} 
		for (int i = 0;
		 i < 16; i++) {
			if (a.getU8()[i] == b.getU8()[/* if bytes are equal add 8 */i]) {
				prefix_len += 8;
			} else {
					 xor = (a.getU8()[i] ^ b.getU8()[i]);
					for (int j = 0;
					 j < 8; /* while bits from byte equal add 1 */j++) {
						if ((xor & -1024) == 0) {
							prefix_len++;
							xor = xor << 1;
						} else {
								break;
						} 
					}
					break;
			} 
		}
		return prefix_len;
	}
	public static void ipv6_addr_init_prefix(Object out, Object prefix, Object bits) {
		 bytes = new ();
		if (bits > 128) {
			bits = 128;
		} 
		bytes = bits / 8;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out, prefix, bytes);
		if (bits % 8) {
			 mask = -1024 << (8 - (bits - (bytes * 8)));
			out.getU8()[bytes] &=  ~mask;
			out.getU8()[bytes] |=  (prefix.getU8()[bytes] & mask);
		} 
	}
	public static void ipv6_addr_init_iid(Object out, Object iid, Object bits) {
		 unaligned_bits = new ();
		 bytes = new ();
		 pos = new ();
		if (bits > 128) {
			bits = 128;
		} 
		unaligned_bits = bits % 8;
		bytes = bits / 8;
		pos = (IPV6_ADDR_BIT_LEN / 8) - bytes;
		if (unaligned_bits) {
			 mask = -1024 << unaligned_bits;
			out.getU8()[pos - 1] &=  mask;
			out.getU8()[pos - 1] |=  (iid & ~mask);
			iid++;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((out.getU8()[pos]), iid, bytes);
	}
	public static int ipv6_addr_split(Byte addr_str, byte seperator, int _default) {
		byte sep = addr_str;
		while (++sep) {
			if (sep == seperator) {
				sep++ = (byte)'\0';
				if (sep) {
					_default = /*Error: Function owner not recognized*/atoi(sep);
				} 
				break;
			} 
		}
		return _default;
	}
	public static void ipv6_addr_print(Object addr) {
		((addr) ? (Object)0 : /*Error: Function owner not recognized*/_assert("addr", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\ipv6_addr.c", 144));
		byte[] addr_str = new byte[IPV6_ADDR_MAX_STR_LEN];
		ModernizedCProgram.ipv6_addr_to_str(addr_str, addr, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s", addr_str/**
		 * @}
		 */);
	}
	/* $OpenBSD: anddi3.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Return a & b, in quad.
	 */
	public static Object __anddi3(Object a, Object b) {
		Object aa;
		Object bb;
		aa.setQ(a);
		bb.setQ(b);
		Object generatedUl = aa.getUl();
		generatedUl[0] &=  generatedUl[0];
		generatedUl[1] &=  generatedUl[1];
		Object generatedQ = aa.getQ();
		return generatedQ;
	}
	/*
	 * Copyright (C) 2013 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup pthread
	 * @{
	 * @file
	 * @brief   Spin locks.
	 * @author  Christian Mehlis <mehlis@inf.fu-berlin.de>
	 * @author  René Kijewski <kijewski@inf.fu-berlin.de>
	 * @author  Joakim Nohlgård <joakim.nohlgard@eistec.se>
	 * @}
	 */
	public static int pthread_spin_init(int pshared) {
		if (lock == ((Object)0)) {
			return 22;
		} 
		(Object)pshared;
		Object generatedFlag = this.getFlag();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_clear(((generatedFlag)), 5);
		return 0;
	}
	public static int pthread_spin_destroy() {
		if (lock == ((Object)0)) {
			return 22;
		} 
		(Object)lock;
		return 0;
	}
	public static int pthread_spin_lock() {
		if (lock == ((Object)0)) {
			return 22;
		} 
		Object generatedFlag = this.getFlag();
		while (/*Error: Function owner not recognized*/__atomic_test_and_set(((generatedFlag)), 5/* spin */)) {
		}
		return 0;
	}
	public static int pthread_spin_trylock() {
		if (lock == ((Object)0)) {
			return 22;
		} 
		Object generatedFlag = this.getFlag();
		if (/*Error: Function owner not recognized*/__atomic_test_and_set(((generatedFlag)), 5)) {
			return 16;
		} 
		return 0;
	}
	public static int pthread_spin_unlock() {
		if (lock == ((Object)0)) {
			return 22;
		} 
		Object generatedFlag = this.getFlag();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_clear(((generatedFlag)), 5);
		return 0;
	}
	/* $OpenBSD: fixunsdfdi.c,v 1.7 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Convert double to (unsigned) quad.
	 * Not sure what to do with negative numbers---for now, anything out
	 * of range becomes UQUAD_MAX.
	 */
	public static Object __fixunsdfdi(double x) {
		Object t;
		int tmp;
		if (x < 0) {
			return (((-1024 * -1024 + /* ??? should be 0?  ERANGE??? */1/* this falls afoul of a GCC bug */)));
		} 
		if (x >= /* so we wire in 2^64-1 instead *//* XXX */1.8446744073709552E19) {
			return (((-1024 * -1024 + 1/*
			     * Now we know that 0 <= x <= 18446744073709549568.  The upper
			     * limit is one ulp less than 18446744073709551615 tested for above.
			     * Dividing this by 2^32 will *not* round irrespective of any
			     * rounding modes (except if the result is an IEEE denorm).
			     * Furthermore, the quotient will fit into a 32-bit integer.
			     */)));
		} 
		tmp = x / (((int)1 << ((/*Error: Unsupported expression*/ * 8) - 2)) * 4.0);
		Object generatedUl = t.getUl();
		generatedUl[(false)] = (int)(x - tmp * (((int)1 << ((/*Error: Unsupported expression*/ * 8) - 2)) * 4.0));
		generatedUl[(true)] = tmp;
		Object generatedUq = t.getUq();
		return (generatedUq);
	}
	public static Object coap_subtree_handler(Object pkt, Object buf, Object len, Object context) {
		uint8_t[] uri = new uint8_t();
		int method_flag = /*Error: Function owner not recognized*/coap_method2flag(/*Error: Function owner not recognized*/coap_get_code_detail(pkt));
		if (/*Error: Function owner not recognized*/coap_get_uri_path(pkt, uri) > 0) {
			 subtree = context;
			for (int i = 0;
			 i < subtree.getResources_numof(); i++) {
				 resource = subtree.getResources()[i];
				if (!(resource.getMethods() & method_flag)) {
					continue;
				} 
				int res = /*Error: Function owner not recognized*/coap_match_path(resource, uri);
				if (res > 0) {
					continue;
				}  else if (res < 0) {
					break;
				} else {
						return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(pkt, buf, len, resource.getContext());
				} 
			}
		} 
		return /*Error: Function owner not recognized*/coap_reply_simple(pkt, COAP_CODE_INTERNAL_SERVER_ERROR, buf, len, COAP_FORMAT_TEXT, ((Object)0), 0);
	}
	public static Object _now() {
		return ModernizedCProgram.xtimer_now_usec();
	}
	public static Object deadline_from_interval(Object interval) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(interval >= 0);
		return ModernizedCProgram._now() + (uint32_t)interval;
	}
	public static Object deadline_left(Object deadline) {
		int32_t left = (int32_t)(deadline - ModernizedCProgram._now());
		if (left < 0) {
			left = 0;
		} 
		return left;
	}
	public static Object _nanocoap_request(Object sock, Object pkt, Object len) {
		 res = -EAGAIN;
		size_t pdu_len = (pkt.getPayload() - (uint8_t)pkt.getHdr()) + pkt.getPayload_len();
		uint8_t buf = (uint8_t)pkt.getHdr();
		uint32_t id = /*Error: Function owner not recognized*/coap_get_id(pkt);
		uint32_t timeout = COAP_ACK_TIMEOUT * /* TODO: timeout random between between ACK_TIMEOUT and (ACK_TIMEOUT *
		     * ACK_RANDOM_FACTOR) */US_PER_SEC;
		uint32_t deadline = ModernizedCProgram.deadline_from_interval(timeout);
		int tries_left = COAP_MAX_RETRANSMIT + /* add 1 for initial transmit */1;
		while (tries_left) {
			if (res == -EAGAIN) {
				res = /*Error: Function owner not recognized*/sock_udp_send(sock, buf, pdu_len, ((Object)0));
				if (res <= 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("nanocoap: error sending coap request, %d\n", (int)res);
					break;
				} 
			} 
			res = /*Error: Function owner not recognized*/sock_udp_recv(sock, buf, len, ModernizedCProgram.deadline_left(deadline), ((Object)0));
			if (res <= 0) {
				if (res == -ETIMEDOUT) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("nanocoap: timeout\n");
					tries_left--;
					if (!tries_left) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("nanocoap: maximum retries reached\n");
						break;
					} else {
							timeout *= 2;
							deadline = ModernizedCProgram.deadline_from_interval(timeout);
							res = -EAGAIN;
							continue;
					} 
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("nanocoap: error receiving coap response, %d\n", (int)res);
				break;
			} else {
					if (/*Error: Function owner not recognized*/coap_parse(pkt, (uint8_t)buf, res) < 0) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("nanocoap: error parsing packet\n");
						res = -EBADMSG;
					}  else if (/*Error: Function owner not recognized*/coap_get_id(pkt) != id) {
						res = -EBADMSG;
						continue;
					} 
					break;
			} 
		}
		return res;
	}
	public static int _fetch_block(Object pkt, Object buf, Object sock, Object path, Object blksize, Object num) {
		uint8_t pktpos = buf;
		pkt.setHdr(()buf);
		pktpos += /*Error: Function owner not recognized*/coap_build_hdr(pkt.getHdr(), COAP_TYPE_CON, ((Object)0), 0, COAP_METHOD_GET, num);
		pktpos += /*Error: Function owner not recognized*/coap_opt_put_uri_path(pktpos, 0, path);
		pktpos += /*Error: Function owner not recognized*/coap_opt_put_uint(pktpos, COAP_OPT_URI_PATH, COAP_OPT_BLOCK2, (num << 4) | blksize);
		pkt.setPayload(pktpos);
		pkt.setPayload_len(0);
		int res = ModernizedCProgram._nanocoap_request(sock, pkt, 64 + (-1024 << (blksize + 4)));
		if (res < 0) {
			return res;
		} 
		res = /*Error: Function owner not recognized*/coap_get_code(pkt);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("code=%i\n", res);
		if (res != 205) {
			return -res;
		} 
		return 0;
	}
	public static int suit_coap_get_blockwise(Object remote, Object path, Object blksize, Object callback, Object arg) {
		uint8_t[] buf = new uint8_t();
		 local = SOCK_IPV6_EP_ANY;
		 pkt = new ();
		local.setPort(-1024 + (ModernizedCProgram.xtimer_now_usec() % /* HACK: use random local port */-1024));
		 sock = new ();
		int res = /*Error: Function owner not recognized*/sock_udp_create(sock, local, remote, 0);
		if (res < 0) {
			return res;
		} 
		int more = 1;
		size_t num = 0;
		res = -1;
		while (more == 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("fetching block %u\n", (int)num);
			res = ModernizedCProgram._fetch_block(pkt, buf, sock, path, blksize, num);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("res=%i\n", res);
			if (!res) {
				 block2 = new ();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/coap_get_block2(pkt, block2);
				more = block2.getMore();
				if (/*Error: Function owner not recognized*/callback(arg, block2.getOffset(), pkt.getPayload(), pkt.getPayload_len(), more)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("callback res != 0, aborting.\n");
					res = -1;
					;
				} 
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("error fetching block\n");
					res = -1;
					;
			} 
			num += 1;
		}
		return res;
	}
	public static int suit_coap_get_blockwise_url(Object url, Object blksize, Object callback, Object arg) {
		byte[] hostport = new byte[SOCK_HOSTPORT_MAXLEN];
		byte[] urlpath = new byte[SOCK_URLPATH_MAXLEN];
		 remote = new ();
		if (/*Error: Function owner not recognized*/strncmp(url, "coap://", 7)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit: URL doesn't start with \"coap://\"\n");
			return -EINVAL;
		} 
		if (ModernizedCProgram.sock_urlsplit(url, hostport, urlpath) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit: invalid URL\n");
			return -EINVAL;
		} 
		if (ModernizedCProgram.sock_udp_str2ep(remote, hostport) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit: invalid URL\n");
			return -EINVAL;
		} 
		if (!remote.getPort()) {
			remote.setPort(COAP_PORT);
		} 
		return ModernizedCProgram.suit_coap_get_blockwise(remote, urlpath, blksize, callback, arg);
	}
	public static int _2buf(Object arg, Object offset, Object buf, Object len, int more) {
		(Object)more;
		_buf_t _buf = arg;
		Object generatedOffset = _buf.getOffset();
		if (generatedOffset != offset) {
			return 0;
		} 
		Object generatedLen = _buf.getLen();
		Object generatedPtr = _buf.getPtr();
		if (len > generatedLen) {
			return -1;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPtr, buf, len);
				generatedOffset += len;
				generatedPtr += len;
				generatedLen -= len;
				return 0;
		} 
	}
	public static Object suit_coap_get_blockwise_url_buf(Object url, Object blksize, Object buf, Object len) {
		_buf_t _buf = new _buf_t(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int res = ModernizedCProgram.suit_coap_get_blockwise_url(url, blksize, _2buf, _buf);
		Object generatedOffset = _buf.getOffset();
		return (res < 0) ? ()res : ()generatedOffset;
	}
	public static void _suit_handle_url(Object url) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit_coap: downloading \"%s\"\n", url);
		 size = ModernizedCProgram.suit_coap_get_blockwise_url_buf(url, COAP_BLOCKSIZE_64, ModernizedCProgram._manifest_buf, 640);
		if (size >= 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit_coap: got manifest with size %u\n", (int)size);
			 writer = new ();
			if (res == 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit_coap: finalizing image flash\n");
				writer.riotboot_flashwrite_finish();
				 hdr = ModernizedCProgram.riotboot_slot_get_hdr(ModernizedCProgram.riotboot_slot_other());
				ModernizedCProgram.riotboot_hdr_print(hdr);
				ModernizedCProgram.xtimer_sleep(1);
				if (ModernizedCProgram.riotboot_hdr_validate(hdr) == 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit_coap: rebooting...");
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pm_reboot();
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit_coap: update failed, hdr invalid");
				} 
			} 
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit_coap: error getting manifest\n");
		} 
	}
	public static int suit_flashwrite_helper(Object arg, Object offset, Object buf, Object len, int more) {
		 writer = arg;
		if (offset == 0) {
			if (len < RIOTBOOT_FLASHWRITE_SKIPLEN) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_WARNING("_suit_flashwrite(): offset==0, len<4. aborting\n");
				return -1;
			} 
			offset = RIOTBOOT_FLASHWRITE_SKIPLEN;
			buf += RIOTBOOT_FLASHWRITE_SKIPLEN;
			len -= RIOTBOOT_FLASHWRITE_SKIPLEN;
		} 
		if (writer.getOffset() != offset) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_WARNING("_suit_flashwrite(): writer->offset=%u, offset==%u, aborting\n", (int)writer.getOffset(), (int)offset);
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("_suit_flashwrite(): writing %u bytes at pos %u\n", len, offset);
		return ModernizedCProgram.riotboot_flashwrite_putbytes(writer, buf, len, more);
	}
	public static Object _suit_coap_thread(Object arg) {
		(Object)arg;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit_coap: started.\n");
		[] msg_queue = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_init_queue(msg_queue, 4);
		ModernizedCProgram._suit_coap_pid = /*Error: Function owner not recognized*/thread_getpid();
		 m = new ();
		while (true) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_receive(m);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("suit_coap: got msg with type %u\n", m.getContent().getValue());
			switch (m.getContent().getValue()) {
			case -1024:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit_coap: trigger received\n");
					ModernizedCProgram._suit_handle_url(ModernizedCProgram._url);
					break;
			default:
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_WARNING("suit_coap: warning: unhandled msg\n");
			}
		}
		return ((Object)0);
	}
	public static void suit_coap_run() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/thread_create(ModernizedCProgram._stack, (3 * THREAD_STACKSIZE_LARGE + FLASHPAGE_SIZE), THREAD_PRIORITY_MAIN - 1, THREAD_CREATE_STACKTEST, _suit_coap_thread, ((Object)0), "suit_coap");
	}
	public static Object _trigger_handler(Object pkt, Object buf, Object len, Object context) {
		(Object)context;
		int code;
		size_t payload_len = pkt.getPayload_len();
		if (payload_len) {
			if (payload_len >= 128) {
				code = COAP_CODE_REQUEST_ENTITY_TOO_LARGE;
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram._url, pkt.getPayload(), payload_len);
					ModernizedCProgram._url[payload_len] = (byte)'\0';
					code = COAP_CODE_CREATED;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("suit: received URL: \"%s\"\n", ModernizedCProgram._url);
					 m = new (/*Error: Invalid initializer*/);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_send(m, ModernizedCProgram._suit_coap_pid);
			} 
		} else {
				code = COAP_CODE_REQUEST_ENTITY_INCOMPLETE;
		} 
		return /*Error: Function owner not recognized*/coap_reply_simple(pkt, code, buf, len, COAP_FORMAT_NONE, ((Object)0), 0);
	}
	/*
	 * Copyright (C) 2019 Koen Zandberg
	 *               2019 Inria
	 *               2019 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_suit
	 * @{
	 *
	 * @file
	 * @brief       SUIT conditions
	 *
	 * @author      Koen Zandberg <koen@bergzand.net>
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 * @}
	 */
	public static void suit_init_conditions() {
		ModernizedCProgram._conditions.getVendor().uuid_v5(ModernizedCProgram.uuid_namespace_dns, (uint8_t)SUIT_VENDOR_DOMAIN, /*Error: Function owner not recognized*/strlen(SUIT_VENDOR_DOMAIN));
		ModernizedCProgram._conditions.getClass().uuid_v5(ModernizedCProgram._conditions.getVendor(), (uint8_t)SUIT_CLASS_ID, /*Error: Function owner not recognized*/strlen(SUIT_CLASS_ID));
		uint8_t[] devid = new uint8_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/luid_base(devid, 32);
		ModernizedCProgram._conditions.getDevice().uuid_v5(ModernizedCProgram._conditions.getVendor(), devid, 32);
	}
	/* Generate UUID's following the instructions from
	     * https://tools.ietf.org/html/draft-moran-suit-manifest-03#section-7.7.1
	     */
	public static  suit_get_vendor_id() {
		return ModernizedCProgram._conditions.getVendor();
	}
	public static  suit_get_class_id() {
		return ModernizedCProgram._conditions.getClass();
	}
	public static  suit_get_device_id() {
		return ModernizedCProgram._conditions.getDevice();
	}
	public static void lib_rem_if(Object if_pid) {
		lib_entry_t lib_elt = new lib_entry_t();
		lib_entry_t lib_tmp = new lib_entry_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_lib_access);
		Object generatedIf_pid = lib_elt.getIf_pid();
		nhdp_addr_entry generatedIf_addr_list_head = lib_elt.getIf_addr_list_head();
		lib_entry generatedNext = _tmp.getNext();
		for ((lib_elt) = (ModernizedCProgram.lib_entry_head); (lib_elt) && (); (lib_elt) = lib_tmp) {
			if (generatedIf_pid == if_pid) {
				generatedIf_addr_list_head.nhdp_free_addr_list();
				do {
					int _tmp;
					if ((ModernizedCProgram.lib_entry_head) == (lib_elt)) {
						(ModernizedCProgram.lib_entry_head) = (ModernizedCProgram.lib_entry_head).getNext();
					} else {
							_tmp = ModernizedCProgram.lib_entry_head;
							while (generatedNext && (generatedNext != (lib_elt))) {
								_tmp = generatedNext;
							}
							if (generatedNext) {
								_tmp.setNext((generatedNext));
							} 
					} 
				} while (0);
				ModernizedCProgram.free(lib_elt);
				break;
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_lib_access);
	}
	public static void lib_fill_wr_addresses(Object if_pid, Object wr) {
		lib_entry_t lib_elt = new lib_entry_t();
		nhdp_addr_entry_t add_tmp = new nhdp_addr_entry_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_lib_access);
		Object generatedIf_pid = lib_elt.getIf_pid();
		nhdp_addr generatedAddress = add_tmp.getAddress();
		nhdp_addr_entry generatedNext = (add_tmp).getNext();
		nhdp_addr_entry generatedIf_addr_list_head = lib_elt.getIf_addr_list_head();
		for (lib_elt = ModernizedCProgram.lib_entry_head; lib_elt; lib_elt = generatedNext) {
			if (generatedIf_pid == if_pid) {
				for (add_tmp = generatedIf_addr_list_head; add_tmp; add_tmp = generatedNext) {
					ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_LOCAL_IF, RFC5444_LOCALIF_THIS_IF, (false), (false));
					generatedAddress.setIn_tmp_table((true));
				}
				break;
			} 
		}
		Object generatedIn_tmp_table = generatedAddress.getIn_tmp_table();
		for (lib_elt = ModernizedCProgram.lib_entry_head; lib_elt; lib_elt = generatedNext) {
			if (generatedIf_pid != if_pid) {
				for (add_tmp = generatedIf_addr_list_head; add_tmp; add_tmp = generatedNext) {
					if (!((generatedIn_tmp_table & /* Check if this address is not already included in a list */-1024))) {
						ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_LOCAL_IF, RFC5444_LOCALIF_OTHER_IF, (false), (false));
						generatedAddress.setIn_tmp_table((true));
					} 
				}
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_lib_access);
	}
	public static int add_address_to_if(lib_entry if_entry, nhdp_addr addr) {
		nhdp_addr_entry_t new_entry = (nhdp_addr_entry_t)ModernizedCProgram.malloc(/*Error: Unsupported expression*/);
		if (!new_entry) {
			return -/* Insufficient memory */1;
		} 
		Object generatedUsg_count = addr.getUsg_count();
		generatedUsg_count++;
		new_entry.setAddress(addr);
		nhdp_addr_entry generatedIf_addr_list_head = if_entry.getIf_addr_list_head();
		do {
			(new_entry).setNext(generatedIf_addr_list_head);
			if_entry.setIf_addr_list_head(new_entry);
		} while (0);
		return 0;
	}
	/*---------------------------------------------------------------------------*
	 *                       Local Information Base API                          *
	 *---------------------------------------------------------------------------*/
	public static void _loramac_usage() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Usage: loramac <get|set|join|tx>");
	}
	public static void _loramac_join_usage() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Usage: loramac join <otaa|abp>");
	}
	public static void _loramac_tx_usage() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Usage: loramac tx <payload> [<cnf|uncnf>] [port]");
	}
	public static void _loramac_set_usage() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Usage: loramac set <deveui|appeui|appkey|appskey|nwkskey|devaddr|class|dr|adr|public|netid|tx_power|rx2_freq|rx2_dr|ul_cnt> <value>");
	}
	public static void _loramac_get_usage() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Usage: loramac get <deveui|appeui|appkey|appskey|nwkskey|devaddr|class|dr|adr|public|netid|tx_power|rx2_freq|rx2_dr|ul_cnt>");
	}
	public static int _loramac_handler(int argc, byte[][] argv) {
		if (argc < 2) {
			ModernizedCProgram._loramac_usage();
			return 1;
		} 
		return 0;
	}
	public static int vfs_close(int fd) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_close: %d\n", fd);
		int res = ModernizedCProgram._fd_is_valid(fd);
		if (res < 0) {
			return res;
		} 
		vfs_file_t filp = ModernizedCProgram._vfs_open_files[fd];
		Object generatedF_op = filp.getF_op();
		if (generatedF_op.getClose() != ((Object)0/* We will invalidate the fd regardless of the outcome of the file
		         * system driver close() call below */)) {
			res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(filp);
		} 
		ModernizedCProgram._free_fd(fd);
		return res;
	}
	public static int vfs_fcntl(int fd, int cmd, int arg) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_fcntl: %d, %d, %d\n", fd, cmd, arg);
		int res = ModernizedCProgram._fd_is_valid(fd);
		if (res < 0) {
			return res;
		} 
		vfs_file_t filp = ModernizedCProgram._vfs_open_files[fd/* The default fcntl implementation below only allows querying flags,
		     * any other command requires insight into the file system driver */];
		Object generatedFlags = filp.getFlags();
		switch (cmd) {
		case F_GETFL:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_fcntl: GETFL: %d\n", generatedFlags);
				return generatedFlags;
		default:
				break;
		}
		Object generatedF_op = filp.getF_op();
		if (generatedF_op.getFcntl() != ((Object)/* pass on to file system driver */0)) {
			return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(filp, cmd, arg);
		} 
		return -22;
	}
	public static int vfs_fstat(int fd) {
		;
		if (buf == ((Object)0)) {
			return -14;
		} 
		int res = ModernizedCProgram._fd_is_valid(fd);
		if (res < 0) {
			return res;
		} 
		vfs_file_t filp = ModernizedCProgram._vfs_open_files[fd];
		Object generatedF_op = filp.getF_op();
		if (generatedF_op.getFstat() == ((Object)0)) {
			return -/* driver does not implement fstat() */22;
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(filp, buf);
	}
	public static int vfs_fstatvfs(int fd, Object buf) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_fstatvfs: %d, %p\n", fd, (Object)buf);
		if (buf == ((Object)0)) {
			return -14;
		} 
		int res = ModernizedCProgram._fd_is_valid(fd);
		if (res < 0) {
			return res;
		} 
		vfs_file_t filp = ModernizedCProgram._vfs_open_files[fd];
		Object generatedMp = filp.getMp();
		if (generatedMp.getFs().getFs_op().getFstatvfs() == ((Object)0)) {
			if (generatedMp.getFs().getFs_op().getStatvfs() != ((Object)/* file system driver does not implement fstatvfs() */0)) {
				return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedMp, "/", /* Fall back to statvfs */buf);
			} 
			return -22;
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedMp, filp, buf);
	}
	public static Object vfs_lseek(int fd, Object off, int whence) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_lseek: %d, %ld, %d\n", fd, (long)off, whence);
		int res = ModernizedCProgram._fd_is_valid(fd);
		if (res < 0) {
			return res;
		} 
		vfs_file_t filp = ModernizedCProgram._vfs_open_files[fd];
		Object generatedF_op = filp.getF_op();
		Object generatedPos = filp.getPos();
		if (generatedF_op.getLseek() == ((Object)0/* driver does not implement lseek() */)) {
			switch (/* default seek functionality is naive */whence) {
			case 0:
					break;
			case 2/* we could use fstat here, but most file system drivers will
			                 * likely already implement lseek in a more efficient fashion */:
					return -22;
			case 1:
					off += generatedPos;
					break;
			default:
					return -22;
			}
			if (off < 0) {
				return -/* the resulting file offset would be negative */22;
			} 
			filp.setPos(off);
			return off;
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(filp, off, whence);
	}
	public static int vfs_open(Object name, int flags, Object mode) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_open: \"%s\", 0x%x, 0%03lo\n", name, flags, (long)mode);
		if (name == ((Object)0)) {
			return -22;
		} 
		byte rel_path;
		vfs_mount_t mountp = new vfs_mount_t();
		int res = mountp._find_mount(name, rel_path);
		if (res < /* _find_mount implicitly increments the open_files count on success */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* No mount point maps to the requested file name */"vfs_open: no matching mount\n");
			return res;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._open_mutex);
		Object generatedFs = mountp.getFs();
		int fd = mountp._init_fd((true), generatedFs.getF_op(), flags, ((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._open_mutex);
		Object generatedOpen_files = mountp.getOpen_files();
		if (fd < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_open: _init_fd: ERR %d!\n", fd);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
			return fd;
		} 
		vfs_file_t filp = ModernizedCProgram._vfs_open_files[fd];
		Object generatedF_op = filp.getF_op();
		if (generatedF_op.getOpen() != ((Object)0)) {
			res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(filp, rel_path, flags, mode, name);
			if (res < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_open: open: ERR %d!\n", /* something went wrong during open */res);
				ModernizedCProgram._free_fd(/* clean up */fd);
				return res;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_open: opened %d\n", fd);
		return fd;
	}
	public static Object vfs_read(int fd, Object dest, Object count) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_read: %d, %p, %lu\n", fd, dest, (long)count);
		if (dest == ((Object)0)) {
			return -14;
		} 
		int res = ModernizedCProgram._fd_is_valid(fd);
		if (res < 0) {
			return res;
		} 
		vfs_file_t filp = ModernizedCProgram._vfs_open_files[fd];
		Object generatedFlags = filp.getFlags();
		if (((generatedFlags & (0 | 1 | 2)) != 0) & ((generatedFlags & (0 | 1 | 2)) != 2)) {
			return -/* File not open for reading */9;
		} 
		Object generatedF_op = filp.getF_op();
		if (generatedF_op.getRead() == ((Object)0)) {
			return -/* driver does not implement read() */22;
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(filp, dest, count);
	}
	public static Object vfs_write(int fd, Object src, Object count) {
		;
		if (src == ((Object)0)) {
			return -14;
		} 
		int res = ModernizedCProgram._fd_is_valid(fd);
		if (res < 0) {
			return res;
		} 
		vfs_file_t filp = ModernizedCProgram._vfs_open_files[fd];
		Object generatedFlags = filp.getFlags();
		if (((generatedFlags & (0 | 1 | 2)) != 1) & ((generatedFlags & (0 | 1 | 2)) != 2)) {
			return -/* File not open for writing */9;
		} 
		Object generatedF_op = filp.getF_op();
		if (generatedF_op.getWrite() == ((Object)0)) {
			return -/* driver does not implement write() */22;
		} 
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(filp, src, count);
	}
	public static int vfs_opendir(Object dirname) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_opendir: %p, \"%s\"\n", (Object)dirp, dirname);
		if ((dirp == ((Object)0)) || (dirname == ((Object)0))) {
			return -22;
		} 
		byte rel_path;
		vfs_mount_t mountp = new vfs_mount_t();
		int res = mountp._find_mount(dirname, rel_path);
		if (res < /* _find_mount implicitly increments the open_files count on success */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* No mount point maps to the requested file name */"vfs_open: no matching mount\n");
			return res;
		} 
		if (rel_path[0] == (byte)'\0'/* if the trailing slash is missing we will get an empty string back, to
		         * be consistent against the file system drivers we give the relative
		         * path "/" instead */) {
			rel_path = "/";
		} 
		Object generatedFs = mountp.getFs();
		if (generatedFs.getD_op() == ((Object)0)) {
			return -/* file system driver does not support directories */22;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dirp, 0, /*Error: sizeof expression not supported yet*/);
		this.setMp(mountp);
		this.setD_op(generatedFs.getD_op());
		Object generatedD_op = this.getD_op();
		Object generatedOpen_files = mountp.getOpen_files();
		if (generatedD_op.getOpendir() != ((Object)0)) {
			int res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(dirp, rel_path, dirname);
			if (res < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
				return res;
			} 
		} 
		return 0;
	}
	public static int vfs_readdir( entry) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_readdir: %p, %p\n", (Object)dirp, (Object)entry);
		if ((dirp == ((Object)0)) || (entry == ((Object)0))) {
			return -22;
		} 
		Object generatedD_op = this.getD_op();
		if (generatedD_op != ((Object)0)) {
			if (generatedD_op.getReaddir() != ((Object)0)) {
				return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(dirp, entry);
			} 
		} 
		return -22;
	}
	public static int vfs_closedir() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_closedir: %p\n", (Object)dirp);
		if (dirp == ((Object)0)) {
			return -22;
		} 
		Object generatedMp = this.getMp();
		vfs_mount_t mountp = generatedMp;
		if (mountp == ((Object)0)) {
			return -9;
		} 
		int res = 0;
		Object generatedD_op = this.getD_op();
		if (generatedD_op != ((Object)0)) {
			if (generatedD_op.getClosedir() != ((Object)0)) {
				res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(dirp);
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dirp, 0, /*Error: sizeof expression not supported yet*/);
		Object generatedOpen_files = mountp.getOpen_files();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), 5);
		return res/**
		 * @brief Check if the given mount point is mounted
		 *
		 * If the mount point is not mounted, _mount_mutex will be locked by this function
		 *
		 * @param mountp    mount point to check
		 * @return 0 on success (mount point is valid and not mounted)
		 * @return -EINVAL if mountp is invalid
		 * @return -EBUSY if mountp is already mounted
		 */;
	}
	public static int vfs_rename(Object from_path, Object to_path) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_rename: \"%s\", \"%s\"\n", from_path, to_path);
		if ((from_path == ((Object)0)) || (to_path == ((Object)0))) {
			return -22;
		} 
		byte rel_from;
		vfs_mount_t mountp = new vfs_mount_t();
		int res = mountp._find_mount(from_path, rel_from);
		if (res < /* _find_mount implicitly increments the open_files count on success */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* No mount point maps to the requested file name */"vfs_rename: from: no matching mount\n");
			return res;
		} 
		Object generatedFs = mountp.getFs();
		Object generatedOpen_files = mountp.getOpen_files();
		if ((generatedFs.getFs_op() == ((Object)0)) || (generatedFs.getFs_op().getRename() == ((Object)0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* rename not supported */"vfs_rename: rename not supported by fs!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
			return -1;
		} 
		byte rel_to;
		vfs_mount_t mountp_to = new vfs_mount_t();
		res = mountp_to._find_mount(to_path, rel_to);
		if (res < /* _find_mount implicitly increments the open_files count on success */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* No mount point maps to the requested file name */"vfs_rename: to: no matching mount\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
			return res;
		} 
		if (mountp_to != mountp) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* The paths are on different file systems */"vfs_rename: from_path and to_path are on different mounts\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), 5);
			return -18;
		} 
		res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mountp, rel_from, rel_to);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_rename: rename %p, \"%s\" -> \"%s\"", (Object)mountp, rel_from, rel_to);
		if (res < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(": ERR %d!\n", /* something went wrong during rename */res);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("\n");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), 5);
		return res;
	}
	/* TODO: Share code between vfs_unlink, vfs_mkdir, vfs_rmdir since they are almost identical */
	public static int vfs_unlink(Object name) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_unlink: \"%s\"\n", name);
		if (name == ((Object)0)) {
			return -22;
		} 
		byte rel_path;
		vfs_mount_t mountp = new vfs_mount_t();
		int res;
		res = mountp._find_mount(name, rel_path);
		if (res < /* _find_mount implicitly increments the open_files count on success */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* No mount point maps to the requested file name */"vfs_unlink: no matching mount\n");
			return res;
		} 
		Object generatedFs = mountp.getFs();
		Object generatedOpen_files = mountp.getOpen_files();
		if ((generatedFs.getFs_op() == ((Object)0)) || (generatedFs.getFs_op().getUnlink() == ((Object)0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* unlink not supported */"vfs_unlink: unlink not supported by fs!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
			return -1;
		} 
		res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mountp, rel_path);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_unlink: unlink %p, \"%s\"", (Object)mountp, rel_path);
		if (res < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(": ERR %d!\n", /* something went wrong during unlink */res);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("\n");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
		return res;
	}
	public static int vfs_mkdir(Object name, Object mode) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_mkdir: \"%s\", 0%03lo\n", name, (long)mode);
		if (name == ((Object)0)) {
			return -22;
		} 
		byte rel_path;
		vfs_mount_t mountp = new vfs_mount_t();
		int res;
		res = mountp._find_mount(name, rel_path);
		if (res < /* _find_mount implicitly increments the open_files count on success */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* No mount point maps to the requested file name */"vfs_mkdir: no matching mount\n");
			return res;
		} 
		Object generatedFs = mountp.getFs();
		Object generatedOpen_files = mountp.getOpen_files();
		if ((generatedFs.getFs_op() == ((Object)0)) || (generatedFs.getFs_op().getMkdir() == ((Object)0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* mkdir not supported */"vfs_mkdir: mkdir not supported by fs!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
			return -1;
		} 
		res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mountp, rel_path, mode);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_mkdir: mkdir %p, \"%s\"", (Object)mountp, rel_path);
		if (res < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(": ERR %d!\n", /* something went wrong during mkdir */res);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("\n");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
		return res;
	}
	public static int vfs_rmdir(Object name) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_rmdir: \"%s\"\n", name);
		if (name == ((Object)0)) {
			return -22;
		} 
		byte rel_path;
		vfs_mount_t mountp = new vfs_mount_t();
		int res;
		res = mountp._find_mount(name, rel_path);
		if (res < /* _find_mount implicitly increments the open_files count on success */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* No mount point maps to the requested file name */"vfs_rmdir: no matching mount\n");
			return res;
		} 
		Object generatedFs = mountp.getFs();
		Object generatedOpen_files = mountp.getOpen_files();
		if ((generatedFs.getFs_op() == ((Object)0)) || (generatedFs.getFs_op().getRmdir() == ((Object)0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* rmdir not supported */"vfs_rmdir: rmdir not supported by fs!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
			return -1;
		} 
		res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mountp, rel_path);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_rmdir: rmdir %p, \"%s\"", (Object)mountp, rel_path);
		if (res < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(": ERR %d!\n", /* something went wrong during rmdir */res);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("\n");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
		return res;
	}
	public static int vfs_stat(Object path) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_stat: \"%s\", %p\n", path, (Object)buf);
		if (path == ((Object)0) || buf == ((Object)0)) {
			return -22;
		} 
		byte rel_path;
		vfs_mount_t mountp = new vfs_mount_t();
		int res;
		res = mountp._find_mount(path, rel_path);
		if (res < /* _find_mount implicitly increments the open_files count on success */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* No mount point maps to the requested file name */"vfs_stat: no matching mount\n");
			return res;
		} 
		Object generatedFs = mountp.getFs();
		Object generatedOpen_files = mountp.getOpen_files();
		if ((generatedFs.getFs_op() == ((Object)0)) || (generatedFs.getFs_op().getStat() == ((Object)0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* stat not supported */"vfs_stat: stat not supported by fs!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
			return -1;
		} 
		res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mountp, rel_path, buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
		return res;
	}
	public static int vfs_statvfs(Object path, Object buf) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_statvfs: \"%s\", %p\n", path, (Object)buf);
		if (path == ((Object)0) || buf == ((Object)0)) {
			return -22;
		} 
		byte rel_path;
		vfs_mount_t mountp = new vfs_mount_t();
		int res;
		res = mountp._find_mount(path, rel_path);
		if (res < /* _find_mount implicitly increments the open_files count on success */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* No mount point maps to the requested file name */"vfs_statvfs: no matching mount\n");
			return res;
		} 
		Object generatedFs = mountp.getFs();
		Object generatedOpen_files = mountp.getOpen_files();
		if ((generatedFs.getFs_op() == ((Object)0)) || (generatedFs.getFs_op().getStatvfs() == ((Object)0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* statvfs not supported */"vfs_statvfs: statvfs not supported by fs!\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
			return -1;
		} 
		res = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(mountp, rel_path, buf);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((generatedOpen_files), (true), /* remember to decrement the open_files count */5);
		return res;
	}
	public static int vfs_bind(int fd, int flags, Object f_op, Object private_data) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_bind: %d, %d, %p, %p\n", fd, flags, (Object)f_op, private_data);
		if (f_op == ((Object)0)) {
			return -22;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._open_mutex);
		fd = ((Object)0)._init_fd(fd, f_op, flags, private_data);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._open_mutex);
		if (fd < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_bind: _init_fd: ERR %d!\n", fd);
			return fd;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_bind: bound %d\n", fd);
		return fd;
	}
	public static int vfs_normalize_path(byte[] buf, Object[] path, Object buflen) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_normalize_path: %p, \"%s\" (%p), %lu\n", (Object)buf, path, (Object)path, (long)buflen);
		size_t len = 0;
		int npathcomp = 0;
		byte path_end = path + /*Error: Function owner not recognized*/strlen(/* Find the terminating null byte */path);
		if (len >= buflen) {
			return -38;
		} 
		while (path <= path_end) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_normalize_path: + %d \"%.*s\" <- \"%s\" (%p)\n", npathcomp, (int)len, buf, path, (Object)path);
			if (path[0] == (byte)'\0') {
				break;
			} 
			while (path[0] == (byte)'/') {
				++/* skip extra slashes */path;
			}
			if (path[0] == (byte)'.') {
				++path;
				if (path[0] == (byte)'/' || path[0] == (byte)'\0') {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(/* skip /./ components */"vfs_normalize_path: skip .\n");
					continue;
				} 
				if (path[0] == (byte)'.' && (path[1] == (byte)'/' || path[1] == (byte)'\0')) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_normalize_path: reduce ../\n");
					if (len == 0) {
						return -/* outside root */22;
					} 
					++path;
					while (len > 0 && buf[--len] != /* delete the last component of the path */(byte)'/') {
					}
					--npathcomp;
					continue;
				} 
			} 
			buf[len++] = (byte)'/';
			if (len >= buflen) {
				return -38;
			} 
			if (path[0] == (byte)'\0'/* trailing slash in original path, don't increment npathcomp */) {
				break;
			} 
			++npathcomp;
			while (len < buflen && path[0] != (byte)'/' && path[0] != /* copy the path component */(byte)'\0') {
				buf[len++] = path[0];
				++path;
			}
			if (len >= buflen) {
				return -38;
			} 
		}
		if (len == /* special case for "/": (otherwise it will be zero) */1) {
			npathcomp = 1;
		} 
		buf[len] = (byte)'\0';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("vfs_normalize_path: = %d, \"%s\"\n", npathcomp, buf);
		return npathcomp;
	}
	public static Object vfs_iterate_mounts(Object cur) {
		 node = new ();
		if (cur == ((Object)0)) {
			node = ModernizedCProgram._vfs_mounts_list.getNext();
			if (node == ((Object)0)) {
				return ((Object)/* empty list */0);
			} 
		} else {
				node = cur.getList_entry().getNext();
				if (node == ModernizedCProgram._vfs_mounts_list.getNext()) {
					return ((Object)0);
				} 
		} 
		return /*Error: Function owner not recognized*/container_of(node, , list_entry);
	}
	public static int _allocate_fd(int fd) {
		if (fd < 0) {
			for (fd = 0; fd < (true); ++fd) {
				if ((fd == STDIN_FILENO) || (fd == STDOUT_FILENO) || (fd == STDERR_FILENO/* Do not auto-allocate the stdio file descriptor numbers to
				                 * avoid conflicts between normal file system users and stdio
				                 * drivers such as stdio_uart, stdio_rtt which need to be able
				                 * to bind to these specific file descriptor numbers. */)) {
					continue;
				} 
				if (ModernizedCProgram._vfs_open_files[fd].getPid() == KERNEL_PID_UNDEF) {
					break;
				} 
			}
		} 
		if (fd >= (true)) {
			return -/* The _vfs_open_files array is full */23;
		}  else if (ModernizedCProgram._vfs_open_files[fd].getPid() != KERNEL_PID_UNDEF) {
			return -/* The desired fd is already in use */17;
		} 
		 pid = /*Error: Function owner not recognized*/thread_getpid();
		if (pid == KERNEL_PID_UNDEF/* This happens when calling vfs_bind during boot, before threads have
		         * been started. */) {
			pid = -1;
		} 
		ModernizedCProgram._vfs_open_files[fd].setPid(pid);
		return fd;
	}
	/**
	 * @internal
	 * @brief Mark an allocated entry as unused in the _vfs_open_files array
	 *
	 * @param[in]  fd     fd to free
	 */
	public static void _free_fd(int fd) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("_free_fd: %d, pid=%d\n", fd, ModernizedCProgram._vfs_open_files[fd].getPid());
		if (ModernizedCProgram._vfs_open_files[fd].getMp() != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/__atomic_fetch_sub((ModernizedCProgram._vfs_open_files[fd].getMp().getOpen_files()), (true), 5);
		} 
		ModernizedCProgram._vfs_open_files[fd].setPid(KERNEL_PID_UNDEF);
	}
	/**
	 * @internal
	 * @brief Initialize an entry in the _vfs_open_files array and mark it as used.
	 *
	 * @param[in]  fd           desired fd number, passed to _allocate_fd
	 * @param[in]  f_op         pointer to file operations table
	 * @param[in]  mountp       pointer to mount table entry, may be NULL
	 * @param[in]  flags        file flags
	 * @param[in]  private_data private_data initial value
	 *
	 * @return fd on success
	 * @return <0 on error
	 */
	public static int _fd_is_valid(int fd) {
		if ((int)fd >= (true)) {
			return -9;
		} 
		vfs_file_t filp = ModernizedCProgram._vfs_open_files[fd];
		Object generatedPid = filp.getPid();
		if (generatedPid == KERNEL_PID_UNDEF) {
			return -9;
		} 
		Object generatedF_op = filp.getF_op();
		if (generatedF_op == ((Object)0)) {
			return -9;
		} 
		return 0/** @} */;
	}
	/*
	 * Copyright (C) 2017 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 * @author  Martine Lenders <m.lenders@fu-berlin.de>
	 */
	public static int _gnrc_pktbuf_cmd(int argc, Byte argv) {
		(Object)argc;
		(Object)argv;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_pktbuf_stats();
		return 0/** @} */;
	}
	/*
	 * Copyright (C) 2016 TriaGnoSys GmbH
	 *               2013-15 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 *
	 * @author  Víctor Ariño <victor.arino@zii.aero>
	 */
	public static void sema_create(int value) {
		((sema != NULL) ? (Object)0 : /*Error: Function owner not recognized*/_assert("sema != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\sema.c", 29));
		this.setValue(value);
		this.setState(.SEMA_OK);
		Object generatedMutex = this.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_init(generatedMutex);
		if (value == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(generatedMutex);
		} 
	}
	public static void sema_destroy() {
		((sema != NULL) ? (Object)0 : /*Error: Function owner not recognized*/_assert("sema != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\sema.c", 41));
		this.setState(.SEMA_DESTROY);
		Object generatedMutex = this.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedMutex);
	}
	public static int _sema_wait(int block, Object us) {
		((sema != NULL) ? (Object)0 : /*Error: Function owner not recognized*/_assert("sema != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\sema.c", 49));
		Object generatedState = this.getState();
		if (generatedState != .SEMA_OK) {
			return -ECANCELED;
		} 
		int did_block = block;
		int old = /*Error: Function owner not recognized*/irq_disable();
		Object generatedValue = this.getValue();
		Object generatedMutex = this.getMutex();
		while ((generatedValue == 0) && block) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old);
			if (us == 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(generatedMutex);
			} else {
					uint64_t start = ModernizedCProgram.xtimer_now_usec64();
					block = !ModernizedCProgram.xtimer_mutex_lock_timeout(generatedMutex, us);
					uint64_t elapsed = ModernizedCProgram.xtimer_now_usec64() - start;
					if (elapsed < us) {
						us -= elapsed;
					} else {
							block = 0;
					} 
			} 
			if (generatedState != .SEMA_OK) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedMutex);
				return -ECANCELED;
			} 
			old = /*Error: Function owner not recognized*/irq_disable();
		}
		if (generatedValue == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old);
			return (did_block) ? -ETIMEDOUT : -11;
		} 
		int value = --generatedValue;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old);
		if (did_block && value > /* only unlock mutex if it was a blocking operation */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedMutex);
		} 
		return 0;
	}
	public static int sema_post() {
		((sema != NULL) ? (Object)0 : /*Error: Function owner not recognized*/_assert("sema != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\sema.c", 101));
		int old = /*Error: Function owner not recognized*/irq_disable();
		Object generatedValue = this.getValue();
		if (generatedValue == UINT_MAX) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old);
			return -EOVERFLOW;
		} 
		int value = generatedValue++;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old);
		Object generatedMutex = this.getMutex();
		if (value == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedMutex);
		} 
		return 0/** @} */;
	}
	public static void pm_set_lowest() {
		pm_blocker_t blocker = ModernizedCProgram.pm_blocker;
		int mode = PM_NUM_MODES;
		Object generatedVal_u8 = blocker.getVal_u8();
		while (mode) {
			if (generatedVal_u8[mode - 1]) {
				break;
			} 
			mode--;
		}
		int state = /*Error: Function owner not recognized*/irq_disable();
		Object generatedVal_u32 = blocker.getVal_u32();
		if (generatedVal_u32 == generatedVal_u32) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("pm: setting mode %u\n", mode);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pm_set(mode);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("pm: mode block changed\n");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(state);
	}
	public static void pm_block(int mode) {
		((ModernizedCProgram.pm_blocker.getVal_u8()[mode] != 255) ? (Object)0 : /*Error: Function owner not recognized*/_assert("pm_blocker.val_u8[mode] != 255", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\pm.c", 74));
		int state = /*Error: Function owner not recognized*/irq_disable();
		ModernizedCProgram.pm_blocker.getVal_u8()[mode]++;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(state);
	}
	public static void pm_unblock(int mode) {
		((ModernizedCProgram.pm_blocker.getVal_u8()[mode] > 0) ? (Object)0 : /*Error: Function owner not recognized*/_assert("pm_blocker.val_u8[mode] > 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\pm.c", 83));
		int state = /*Error: Function owner not recognized*/irq_disable();
		ModernizedCProgram.pm_blocker.getVal_u8()[mode]--;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(state);
	}
	public static void pm_off() {
		ModernizedCProgram.pm_blocker.setVal_u32(0);
		ModernizedCProgram.pm_set_lowest();
		while (1) {
		}
	}
	/*
	 * Copyright (C) 2013-15 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	public static Object inet_ntop(int af, Object src, Byte dst, Object size) {
		switch (af) {
		default:
				(Object)src;
				(Object)dst;
				(Object)size;
				(/*Error: Function owner not recognized*/_errno()) = EAFNOSUPPORT;
				return NULL;
		}
		return dst;
	}
	public static int inet_pton(int af, Object src, Object dst) {
		switch (af) {
		default:
				(Object)src;
				(Object)dst;
				(/*Error: Function owner not recognized*/_errno()) = EAFNOSUPPORT;
				return -1;
		}
		return 1;
	}
	/*
	 * Copyright (C) 2017-2018 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Shell commands for the cord_ep module
	 *
	 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
	 *
	 * @}
	 */
	public static int make_sock_ep(Object ep, Object addr) {
		ep.setPort(0);
		if (ModernizedCProgram.sock_udp_str2ep(ep, addr) < 0) {
			return -1;
		} 
		ep.setFamily(AF_INET6);
		ep.setNetif(SOCK_ADDR_ANY_NETIF);
		if (ep.getPort() == 0) {
			ep.setPort(COAP_PORT);
		} 
		return 0;
	}
	public static int _cord_ep_handler(int argc, byte[][] argv) {
		int res;
		if ((argc > 1) && (/*Error: Function owner not recognized*/strcmp(argv[1], "register") == 0)) {
			byte regif = ((Object)0);
			if (argc < 3) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s register <server address> [registration interface]\n", argv[0]);
				return 1;
			} 
			 remote = new ();
			if (ModernizedCProgram.make_sock_ep(remote, argv[2]) < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: unable to parse address\n");
				return 1;
			} 
			if (argc > 3) {
				regif = argv[3];
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Registering with RD now, this may take a short while...");
			if (/*Error: Function owner not recognized*/cord_ep_register(remote, regif) != CORD_EP_OK) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: registration failed");
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("registration successful\n");
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/cord_ep_dump_status();
			} 
		}  else if ((argc > 1) && (/*Error: Function owner not recognized*/strcmp(argv[1], "discover") == 0)) {
			if (argc < 3) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s discover <server address>\n", argv[0]);
				return 1;
			} 
			byte[] regif = new byte[NANOCOAP_URI_MAX];
			 remote = new ();
			if (ModernizedCProgram.make_sock_ep(remote, argv[2]) < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: unable to parse address\n");
				return 1;
			} 
			if (/*Error: Function owner not recognized*/cord_ep_discover_regif(remote, regif, /*Error: sizeof expression not supported yet*/) == CORD_EP_OK) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("the registration interface is '%s'\n", regif);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: unable to discover registration interface\n");
			} 
		}  else if ((argc > 1) && (/*Error: Function owner not recognized*/strcmp(argv[1], "update") == 0)) {
			res = /*Error: Function owner not recognized*/cord_ep_update();
			if (res == CORD_EP_OK) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("RD update successful");
			}  else if (res == CORD_EP_NORD) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: not associated with any RD");
			}  else if (res == CORD_EP_TIMEOUT) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to reach RD - dropped association");
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: RD update failed");
			} 
		}  else if ((argc > 1) && (/*Error: Function owner not recognized*/strcmp(argv[1], "remove") == 0)) {
			res = /*Error: Function owner not recognized*/cord_ep_remove();
			if (res == CORD_EP_OK) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("node successfully removed from RD");
			}  else if (res == CORD_EP_NORD) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: not associated with any RD");
			}  else if (res == CORD_EP_TIMEOUT) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to reach RD - remove association only locally");
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to remove node from RD");
			} 
		}  else if ((argc > 1) && (/*Error: Function owner not recognized*/strcmp(argv[1], "info") == 0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/cord_ep_dump_status();
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s <register|discover|update|remove|info>\n", argv[0]);
				return 1;
		} 
		return 0;
	}
	/*
	 * Copyright (C) 2015 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     net_udp
	 * @{
	 *
	 * @file
	 * @brief       Generic module to dump packages received via netapi to STDOUT
	 *
	 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
	 *
	 * @}
	 */
	public static void udp_hdr_print(Object hdr) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("   src-port: %5u  dst-port: %5u\n", /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getSrc_port()), /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getDst_port()));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("   length: %u  cksum: 0x%04x\n", /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getLength()), /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getChecksum()));
	}
	/*
	 * Copyright (C) 2019 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Shell commands to control NimBLEs netif wrapper
	 *
	 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
	 *
	 * @}
	 */
	/* 500ms */
	/* 500ms */
	public static void _on_ble_evt(int handle, Object event) {
		switch (event) {
		case NIMBLE_NETIF_CONNECTED_SLAVE:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("event: handle %i -> CONNECTED as SLAVE (", handle);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bluetil_addr_print(/*Error: Function owner not recognized*/nimble_netif_conn_get(handle).getAddr());
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(")");
				break;
		case NIMBLE_NETIF_CLOSED_SLAVE:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("event: handle %i -> CONNECTION CLOSED\n", handle);
				break;
		case NIMBLE_NETIF_CONNECT_ABORT:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("event: handle %i -> CONNECTION ABORT\n", handle);
				break;
		case NIMBLE_NETIF_CLOSED_MASTER:
		case NIMBLE_NETIF_CONNECTED_MASTER:
				{ 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("event: handle %i -> CONNECTED as MASTER (", handle);
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bluetil_addr_print(/*Error: Function owner not recognized*/nimble_netif_conn_get(handle).getAddr());
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts(")");
					break;
				}
		case NIMBLE_NETIF_CONN_UPDATED:
		default:
				break;
		}
	}
	public static int _conn_dump(Object conn, int handle, Object arg) {
		(Object)arg;
		byte role = (conn.getState() & NIMBLE_NETIF_GAP_MASTER) ? (byte)'M' : (byte)'S';
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[%2i] ", handle);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bluetil_addr_print(conn.getAddr());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" (%c)", role);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
		return 0;
	}
	public static int _conn_state_dump(Object conn, int handle, Object arg) {
		(Object)arg;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[%2i] state: 0x%04x -", handle, conn.getState());
		if (conn.getState() & NIMBLE_NETIF_UNUSED) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" unused");
		} 
		if (conn.getState() & NIMBLE_NETIF_CONNECTING) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" connecting");
		} 
		if (conn.getState() & NIMBLE_NETIF_ADV) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" advertising");
		} 
		if (conn.getState() & NIMBLE_NETIF_GAP_SLAVE) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" GAP-slave");
		} 
		if (conn.getState() & NIMBLE_NETIF_GAP_MASTER) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" GAP-master");
		} 
		if (conn.getState() & NIMBLE_NETIF_L2CAP_SERVER) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" L2CAP-server");
		} 
		if (conn.getState() & NIMBLE_NETIF_L2CAP_CLIENT) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" L2CAP-client");
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
		return 0;
	}
	public static void _conn_list() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nimble_netif_conn_foreach(NIMBLE_NETIF_L2CAP_CONNECTED, _conn_dump, ((Object)0));
	}
	public static void _cmd_info() {
		int free = /*Error: Function owner not recognized*/nimble_netif_conn_count(NIMBLE_NETIF_UNUSED);
		int active = /*Error: Function owner not recognized*/nimble_netif_conn_count(NIMBLE_NETIF_L2CAP_CONNECTED);
		uint8_t[] own_addr = new uint8_t();
		uint8_t[] tmp_addr = new uint8_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ble_hs_id_copy_addr(nimble_riot_own_addr_type, tmp_addr, ((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bluetil_addr_swapped_cp(tmp_addr, own_addr);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Own Address: ");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bluetil_addr_print(own_addr);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" Free slots: %u/%u\n", free, NIMBLE_NETIF_MAX_CONN);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Advertising: ");
		if (/*Error: Function owner not recognized*/nimble_netif_conn_get_adv() != NIMBLE_NETIF_CONN_INVALID) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("yes");
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("no");
		} 
		if (active > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Connections: %u\n", active);
			ModernizedCProgram._conn_list();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("   Contexts:");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nimble_netif_conn_foreach(NIMBLE_NETIF_ANY, _conn_state_dump, ((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
	}
	public static void _cmd_adv(Object name) {
		int res;
		(Object)res;
		uint8_t[] buf = new uint8_t();
		 ad = new ();
		ble_gap_adv_params _adv_params = new ble_gap_adv_params(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (/*Error: Function owner not recognized*/nimble_netif_conn_is_adv()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("err: advertising already in progress");
			return /*Error: Unsupported expression*/;
		} 
		res = /*Error: Function owner not recognized*/bluetil_ad_init_with_flags(ad, buf, /* build advertising data */BLE_HS_ADV_MAX_SZ, BLUETIL_AD_FLAGS_DEFAULT);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(res == BLUETIL_AD_OK);
		uint16_t ipss = BLE_GATT_SVC_IPSS;
		res = /*Error: Function owner not recognized*/bluetil_ad_add(ad, BLE_GAP_AD_UUID16_INCOMP, ipss, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(res == BLUETIL_AD_OK);
		if (name == ((Object)0)) {
			name = "bleRIOT";
		} 
		res = /*Error: Function owner not recognized*/bluetil_ad_add(ad, BLE_GAP_AD_NAME, name, /*Error: Function owner not recognized*/strlen(name));
		if (res != BLUETIL_AD_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("err: the given name is too long");
			return /*Error: Unsupported expression*/;
		} 
		res = /*Error: Function owner not recognized*/nimble_netif_accept(ad.getBuf(), ad.getPos(), /* start listening for incoming connections */_adv_params);
		if (res != NIMBLE_NETIF_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("err: unable to start advertising (%i)\n", res);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: advertising this node as '%s'\n", name);
		} 
	}
	public static void _cmd_adv_stop() {
		int res = /*Error: Function owner not recognized*/nimble_netif_accept_stop();
		if (res == NIMBLE_NETIF_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("canceled advertising");
		}  else if (res == NIMBLE_NETIF_NOTADV) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("no advertising in progress");
		} 
	}
	public static void _cmd_scan(int duration) {
		if (duration == 0) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("scanning (for %ums) ... ", (duration / 1000));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nimble_scanlist_clear();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nimble_scanner_start();
		ModernizedCProgram.xtimer_usleep(duration);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nimble_scanner_stop();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("done");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nimble_scanlist_print();
	}
	public static void _cmd_connect_addr(Object addr) {
		int res = /*Error: Function owner not recognized*/nimble_netif_connect(addr, ((Object)0), (/* simply use NimBLEs default connection parameters */true));
		if (res < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("err: unable to trigger connection sequence (%i)\n", res);
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("initiated connection procedure with ");
		uint8_t[] addrn = new uint8_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bluetil_addr_swapped_cp(addr.getVal(), addrn);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bluetil_addr_print(addrn);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
	}
	public static void _cmd_connect_addstr(Object addr_str) {
		uint8_t[] tmp = new uint8_t();
		 addr = new (/*Error: Invalid initializer*/);
		if (/*Error: Function owner not recognized*/bluetil_addr_from_str(tmp, addr_str) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("err: unable to parse address");
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bluetil_addr_swapped_cp(tmp, addr.getVal());
		ModernizedCProgram._cmd_connect_addr(addr);
	}
	public static void _cmd_connect(int pos) {
		 sle = /*Error: Function owner not recognized*/nimble_scanlist_get_by_pos(pos);
		if (sle == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("err: unable to find given entry in scanlist");
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram._cmd_connect_addr(sle.getAddr());
	}
	public static void _cmd_close(int handle) {
		int res = /*Error: Function owner not recognized*/nimble_netif_close(handle);
		if (res != NIMBLE_NETIF_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("err: unable to close connection with given handle");
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("success: connection tear down initiated");
		} 
	}
	public static void _cmd_update(int handle, int itvl, int timeout) {
		ble_gap_upd_params params = new ble_gap_upd_params();
		params.setBle_gap_upd_params((uint16_t)((itvl * 1000) / BLE_HCI_CONN_ITVL));
		params.setBle_gap_upd_params((uint16_t)((itvl * 1000) / BLE_HCI_CONN_ITVL));
		params.setBle_gap_upd_params(0);
		params.setBle_gap_upd_params((uint16_t)(timeout / 10));
		params.setBle_gap_upd_params(BLE_GAP_INITIAL_CONN_MIN_CE_LEN);
		params.setBle_gap_upd_params(BLE_GAP_INITIAL_CONN_MAX_CE_LEN);
		int res = /*Error: Function owner not recognized*/nimble_netif_update(handle, params);
		if (res != NIMBLE_NETIF_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("err: unable to update connection parameters for given handle");
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("success: connection parameters updated");
		} 
	}
	public static int _ishelp(Byte argv) {
		return /*Error: Function owner not recognized*/memcmp(argv, "help", 4) == 0;
	}
	public static void sc_nimble_netif_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nimble_scanlist_init();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nimble_scanner_init(((Object)0), nimble_scanlist_update);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nimble_netif_eventcb(/* register event callback with the netif wrapper */_on_ble_evt);
	}
	public static int _nimble_netif_handler(int argc, byte[][] argv) {
		if ((argc == 1) || ModernizedCProgram._ishelp(argv[1])) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s [help|info|adv|scan|connect|close|update]\n", argv[0]);
			return 0;
		} 
		if (/*Error: Function owner not recognized*/memcmp(argv[1], "info", 4) == 0) {
			ModernizedCProgram._cmd_info();
		}  else if (/*Error: Function owner not recognized*/memcmp(argv[1], "adv", 3) == 0) {
			byte name = ((Object)0);
			if (argc > 2) {
				if (ModernizedCProgram._ishelp(argv[2])) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s adv [help|stop|<name>]\n", argv[0]);
					return 0;
				} 
				if (/*Error: Function owner not recognized*/memcmp(argv[2], "stop", 4) == 0) {
					ModernizedCProgram._cmd_adv_stop();
					return 0;
				} 
				name = argv[2];
			} 
			ModernizedCProgram._cmd_adv(name);
		}  else if (/*Error: Function owner not recognized*/memcmp(argv[1], "scan", 4) == 0) {
			uint32_t duration = (true);
			if (argc > 2) {
				if (ModernizedCProgram._ishelp(argv[2])) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s scan [help|list|[duration in ms]]\n", argv[0]);
					return 0;
				} 
				if (/*Error: Function owner not recognized*/memcmp(argv[2], "list", 4) == 0) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/nimble_scanlist_print();
					return 0;
				} 
				duration = /*Error: Function owner not recognized*/atoi(argv[2]);
			} 
			ModernizedCProgram._cmd_scan(duration * 1000);
		}  else if (/*Error: Function owner not recognized*/memcmp(argv[1], "connect", 7) == 0) {
			if ((argc < 3) || ModernizedCProgram._ishelp(argv[2])) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s connect [help|list|<scanlist entry #>|<BLE addr>]\n", argv[0]);
			} 
			if (/*Error: Function owner not recognized*/memcmp(argv[2], "list", 4) == 0) {
				ModernizedCProgram._conn_list();
				return 0;
			} 
			if (/*Error: Function owner not recognized*/strlen(argv[2]) == (BLUETIL_ADDR_STRLEN - 1)) {
				ModernizedCProgram._cmd_connect_addstr(argv[2]);
				return 0;
			} 
			int pos = /*Error: Function owner not recognized*/atoi(argv[2]);
			ModernizedCProgram._cmd_connect(pos);
		}  else if (/*Error: Function owner not recognized*/memcmp(argv[1], "close", 5) == 0) {
			if ((argc < 3) || ModernizedCProgram._ishelp(argv[2])) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s close [help|list|<conn #>]\n", argv[0]);
				return 0;
			} 
			if (/*Error: Function owner not recognized*/memcmp(argv[2], "list", 4) == 0) {
				ModernizedCProgram._conn_list();
				return 0;
			} 
			int handle = /*Error: Function owner not recognized*/atoi(argv[2]);
			ModernizedCProgram._cmd_close(handle);
		}  else if ((/*Error: Function owner not recognized*/memcmp(argv[1], "update", 6) == 0)) {
			if ((argc < 5) || ModernizedCProgram._ishelp(argv[2])) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s update [help|<handle> <itvl> <timeout>]\n", argv[0]);
				return 0;
			} 
			int handle = /*Error: Function owner not recognized*/atoi(argv[2]);
			int itvl = /*Error: Function owner not recognized*/atoi(argv[3]);
			int timeout = /*Error: Function owner not recognized*/atoi(argv[4]);
			ModernizedCProgram._cmd_update(handle, itvl, timeout);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("unable to parse the command. Use '%s help' for more help\n", argv[0]);
		} 
		return 0;
	}
	/*
	 * Trickle implementation
	 *
	 * Copyright (C) 2013, 2014  INRIA.
	 *               2017 HAW Hamburg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @author  Eric Engel <eric.engel@fu-berlin.de>
	 * @author  Cenk Gündoğan <cenk.guendogan@haw-hamburg.de>
	 */
	public static void trickle_callback() {
		Object generatedC = this.getC();
		Object generatedK = this.getK();
		Object generatedCallback = this.getCallback();
		if ((generatedC < generatedK) || (generatedK == /* Handle k=0 like k=infinity (according to RFC6206, section 6.5) */0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedCallback.getArgs());
		} 
		trickle.trickle_interval();
	}
	public static void trickle_interval() {
		Object generatedI = this.getI();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(generatedI > 0);
		uint32_t old_interval = generatedI;
		Object generatedImin = this.getImin();
		Object generatedImax = this.getImax();
		uint32_t max_interval = generatedImin << generatedImax;
		Object generatedT = this.getT();
		uint32_t diff = old_interval - generatedT;
		generatedI *= 2;
		if (generatedI > max_interval) {
			this.setI(max_interval);
			old_interval = max_interval / 2;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("trickle: I == %u, diff == %u\n", generatedI, diff);
		this.setC(0);
		this.setT(ModernizedCProgram.random_uint32_range(old_interval, generatedI));
		uint64_t msg_time = (generatedT + diff) * (true);
		Object generatedMsg_timer = this.getMsg_timer();
		Object generatedMsg = this.getMsg();
		Object generatedPid = this.getPid();
		ModernizedCProgram.xtimer_set_msg64(generatedMsg_timer, msg_time, generatedMsg, generatedPid);
	}
	public static void trickle_reset_timer() {
		Object generatedI = this.getI();
		Object generatedImin = this.getImin();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(generatedI > generatedImin);
		trickle.trickle_stop();
		this.setI(this.setT(generatedImin));
		trickle.trickle_interval();
	}
	public static void trickle_start(Object pid, Object msg_type, Object Imin, Object Imax, Object k) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(Imin > 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert((Imin << Imax) < (-1024 / 2));
		this.setPid(pid);
		this.setC(0);
		this.setK(k);
		this.setImin(Imin);
		this.setImax(Imax);
		Object generatedImin = this.getImin();
		this.setI(this.setT(ModernizedCProgram.random_uint32_range(generatedImin, 4 * generatedImin)));
		this.setPid(pid);
		Object generatedMsg = this.getMsg();
		generatedMsg.getContent().setPtr(trickle);
		generatedMsg.setType(msg_type);
		trickle.trickle_interval();
	}
	public static void trickle_stop() {
		Object generatedMsg_timer = this.getMsg_timer();
		generatedMsg_timer.xtimer_remove();
	}
	public static void trickle_increment_counter() {
		Object generatedC = this.getC();
		generatedC++;
	}
	public static Object __qdivrem(Object uq, Object vq, Object arq) {
		Object tmp;
		digit u = new digit();
		digit v = new digit();
		digit q = new digit();
		digit v1 = new digit();
		digit v2 = new digit();
		 qhat = new ();
		 rhat = new ();
		 t = new ();
		int m;
		int n;
		int d;
		int j;
		int i;
		digit[] uspace = new digit();
		digit[] vspace = new digit();
		digit[] qspace = new digit();
		Object generatedUl = tmp.getUl();
		Object generatedQ = tmp.getQ();
		if (vq == 0) {
			int zero = /* divide by zero. */0;
			generatedUl[(true)] = generatedUl[(false)] = 1 / /* cppcheck-suppress zerodiv
			         * (reason: division by zero is on purpose here) */zero;
			if (arq) {
				arq = uq;
			} 
			return generatedQ;
		} 
		if (uq < vq) {
			if (arq) {
				arq = uq;
			} 
			return 0;
		} 
		u = uspace[0];
		v = vspace[0];
		q = qspace[0/*
		     * Break dividend and divisor into digits in base B, then
		     * count leading zeros to determine m and n.  When done, we
		     * will have:
		     *  u = (u[1]u[2]...u[m+n]) sub B
		     *  v = (v[1]v[2]...v[n]) sub B
		     *  v[1] != 0
		     *  1 < n <= 4 (if n = 1, we use a different division algorithm)
		     *  m >= 0 (otherwise u < v, which we already checked)
		     *  m + n = 4
		     * and thus
		     *  m = 4 - n <= 2
		     */];
		tmp.setUq(uq);
		u[0] = 0;
		u[1] = (digit)(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUl[(true)]) >> (/*Error: Unsupported expression*/ * 8 / 2));
		u[2] = (digit)(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUl[(true)]) & (((int)1 << (/*Error: Unsupported expression*/ * 8 / 2)) - 1));
		u[3] = (digit)(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUl[(false)]) >> (/*Error: Unsupported expression*/ * 8 / 2));
		u[4] = (digit)(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUl[(false)]) & (((int)1 << (/*Error: Unsupported expression*/ * 8 / 2)) - 1));
		tmp.setUq(vq);
		v[1] = (digit)(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUl[(true)]) >> (/*Error: Unsupported expression*/ * 8 / 2));
		v[2] = (digit)(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUl[(true)]) & (((int)1 << (/*Error: Unsupported expression*/ * 8 / 2)) - 1));
		v[3] = (digit)(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUl[(false)]) >> (/*Error: Unsupported expression*/ * 8 / 2));
		v[4] = (digit)(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedUl[(false)]) & (((int)1 << (/*Error: Unsupported expression*/ * 8 / 2)) - 1));
		for (n = 4; v[1] == 0; v++) {
			if (--n == 1) {
				 rbj = new ();
				digit q1 = new digit();
				digit q2 = new digit();
				digit q3 = new digit();
				digit q4 = new digit();
				t = v[/* nonzero, by definition */2];
				q1 = (digit)(u[1] / t);
				rbj = ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(u[1] % t) << (/*Error: Unsupported expression*/ * 8 / 2)) | (u[2]));
				q2 = (digit)(rbj / t);
				rbj = ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(rbj % t) << (/*Error: Unsupported expression*/ * 8 / 2)) | (u[3]));
				q3 = (digit)(rbj / t);
				rbj = ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(rbj % t) << (/*Error: Unsupported expression*/ * 8 / 2)) | (u[4]));
				q4 = (digit)(rbj / t);
				if (arq) {
					arq = rbj % t;
				} 
				generatedUl[(true)] = ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(q1) << (/*Error: Unsupported expression*/ * 8 / 2)) | (q2));
				generatedUl[(false)] = ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(q3) << (/*Error: Unsupported expression*/ * 8 / 2)) | (q4));
				return generatedQ;
			} 
		}
		for (m = 4 - n; u[1] == 0; u++) {
			m--;
		}
		for (i = 4 - m; --i >= 0; /*Error: Unsupported expression*/) {
			q[i] = 0;
		}
		q += 4 - m/*
		     * Here we run Program D, translated from MIX to C and acquiring
		     * a few minor changes.
		     *
		     * D1: choose multiplier 1 << d to ensure v[1] >= B/2.
		     */;
		d = 0;
		for (t = v[1]; t < ((int)1 << (/*Error: Unsupported expression*/ * 8 / 2)) / 2; t <<=  1) {
			d++;
		}
		if (d > 0) {
			ModernizedCProgram.shl(u[0], m + n, /* u <<= d */d);
			ModernizedCProgram.shl(v[1], n - 1, /* v <<= d */d);
		} 
		j = /*
		     * D2: j = 0.
		     */0;
		v1 = v[/* for D3 -- note that v[1..n] are constant */1];
		v2 = v[/* for D3 */2];
		if (arq) {
			if (d) {
				for (i = m + n; i > m; --i) {
					u[i] = (digit)((()u[i] >> d) | (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(()u[i - 1] << ((/*Error: Unsupported expression*/ * 8 / 2) - d)) & (((int)1 << (/*Error: Unsupported expression*/ * 8 / 2)) - 1)));
				}
				u[i] = 0;
			} 
			generatedUl[(true)] = ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(uspace[1]) << (/*Error: Unsupported expression*/ * 8 / 2)) | (uspace[2]));
			generatedUl[(false)] = ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(uspace[3]) << (/*Error: Unsupported expression*/ * 8 / 2)) | (uspace[4]));
			arq = generatedQ;
		} 
		generatedUl[(true)] = ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(qspace[1]) << (/*Error: Unsupported expression*/ * 8 / 2)) | (qspace[2]));
		generatedUl[(false)] = ((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(qspace[3]) << (/*Error: Unsupported expression*/ * 8 / 2)) | (qspace[4]));
		return generatedQ;
	}
	/* $OpenBSD: qdivrem.c,v 1.7 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Multiprecision divide.  This algorithm is from Knuth vol. 2 (2nd ed),
	 * section 4.3.1, pp. 257--259.
	 */
	/* digit base */
	/* Combine two `digits' to make a single two-digit number. */
	/* select a type for digits in base B: use unsigned short if they fit */
	public static void shl(Object[] p, int len, int sh) {
		int i;
		for (i = 0; i < len; i++) {
			p[i] = (digit)((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(()p[i] << sh) & (((int)1 << (/*Error: Unsupported expression*/ * 8 / 2)) - 1)) | (()p[i + 1] >> ((/*Error: Unsupported expression*/ * 8 / 2) - sh)));
		}
		p[i] = (digit)((/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(()p[i] << sh) & (((int)1 << (/*Error: Unsupported expression*/ * 8 / 2)) - 1)));
	}
	/*
	 * __qdivrem(u, v, rem) returns u/v and, optionally, sets *rem to u%v.
	 *
	 * We do this in base 2-sup-HALF_BITS, so that all intermediate products
	 * fit within u_int.  As a consequence, the maximum length dividend and
	 * divisor are 4 `digits' in this base (they are shorter if they have
	 * leading zeros).
	 */
	/*
	 * Copyright (C) 2013 INRIA
	 *               2015 Kaspar Schleiser <kaspar@schleiser.de>
	 *               2016 Eistec AB
	 *               2018 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys
	 * @{
	 *
	 * @file
	 * @brief       STDIO over UART implementation
	 *
	 * This file implements a UART callback and the STDIO read/write functions
	 *
	 * @author      Oliver Hahm <oliver.hahm@inria.fr>
	 * @author      Ludwig Knüpfer <ludwig.knuepfer@fu-berlin.de>
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 * @author      Joakim Nohlgård <joakim.nohlgard@eistec.se>
	 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
	 *
	 * @}
	 */
	public static void stdio_init() {
		 cb = new ();
		Object arg;
		cb = NULL;
		arg = NULL;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/uart_init(/*Error: Function owner not recognized*/UART_DEV(0), (true), cb, arg);
		ModernizedCProgram.stdin_enabled = 1;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(/* the mutex should start locked */ModernizedCProgram._rx_mutex);
	}
	public static Object stdio_read(Object buffer, Object count) {
		(Object)buffer;
		(Object)count;
		return -ENOTSUP;
		(Object)buffer;
		(Object)len;
		return /*Error: Function owner not recognized*/isrpipe_read(ModernizedCProgram._cdc_stdio_isrpipe, buffer, len);
		int res = ModernizedCProgram.rtt_read((Object)buffer, (uint16_t)count);
		if (res == 0) {
			if (!ModernizedCProgram.stdin_enabled) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._rx_mutex/* We only unlock when rtt_stdio_enable_stdin is called
				               Note that we assume only one caller invoked this function */);
			} 
			xtimer_ticks32_t last_wakeup = ModernizedCProgram.xtimer_now();
			while (1) {
				ModernizedCProgram.xtimer_periodic_wakeup(last_wakeup, -1024);
				res = ModernizedCProgram.rtt_read(buffer, count);
				if (res > 0) {
					return res;
				} 
			}
		} 
		return (ssize_t)res;
	}
	public static Object stdio_write(Object buffer, Object len) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/uart_write(/*Error: Function owner not recognized*/UART_DEV(0), (uint8_t)buffer, len);
		return len;
		ModernizedCProgram.usbus_cdc_acm_submit(ModernizedCProgram.cdcacm, buffer, len);
		ModernizedCProgram.usbus_cdc_acm_flush(ModernizedCProgram.cdcacm);
		return /* Use tsrb and flush */len;
		byte buffer = (byte)in;
		int written = ModernizedCProgram.rtt_write(buffer, (int)len);
		xtimer_ticks32_t last_wakeup = ModernizedCProgram.xtimer_now();
		while (ModernizedCProgram.blocking_stdout && ((size_t)written < len)) {
			ModernizedCProgram.xtimer_periodic_wakeup(last_wakeup, -1024);
			written += ModernizedCProgram.rtt_write(buffer[written], len - written);
		}
		return (ssize_t)written;
	}
	/*
	 * Copyright (C) 2015 Cenk Gündoğan <cnkgndgn@gmail.com>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_seq
	 * @{
	 *
	 * @file
	 * @brief       Serial Number Arithmetic (RFC 1982)
	 *
	 * @author      Cenk Gündoğan <cnkgndgn@gmail.com>
	 *
	 * @}
	 */
	public static Object seq8_adds(Object s, Object n, Object space) {
		(((space != 0) && ((space & (space + 1)) == 0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(space != 0) && ((space & (space + 1)) == 0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\seq.c", /* check if space is a power of 2 minus 1 */27));
		if (n > (space >> 1)) {
			return s;
		} 
		return (space == -1024) ? (s + n) : ((s + n) & space);
	}
	public static int seq8_compares(Object s1, Object s2, Object space) {
		(((space != 0) && ((space & (space + 1)) == 0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(space != 0) && ((space & (space + 1)) == 0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\seq.c", /* check if space is a power of 2 minus 1 */39));
		if (s1 == s2) {
			return 0;
		} 
		if (((s1 < s2) && ((uint8_t)(s2 - s1) < ((space >> 1) + 1))) || ((s1 > s2) && ((uint8_t)(s1 - s2) > ((space >> 1) + 1)))) {
			return -1;
		} 
		if (((s1 < s2) && ((uint8_t)(s2 - s1) > ((space >> 1) + 1))) || ((s1 > s2) && ((uint8_t)(s1 - s2) < ((space >> 1) + 1)))) {
			return 1;
		} 
		return -22;
	}
	public static Object seq16_adds(Object s, Object n, Object space) {
		(((space != 0) && ((space & (space + 1)) == 0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(space != 0) && ((space & (space + 1)) == 0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\seq.c", /* check if space is a power of 2 minus 1 */61));
		if (n > (space >> 1)) {
			return s;
		} 
		return (space == -1024) ? (s + n) : ((s + n) & space);
	}
	public static int seq16_compares(Object s1, Object s2, Object space) {
		(((space != 0) && ((space & (space + 1)) == 0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(space != 0) && ((space & (space + 1)) == 0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\seq.c", /* check if space is a power of 2 minus 1 */73));
		if (s1 == s2) {
			return 0;
		} 
		if (((s1 < s2) && ((uint16_t)(s2 - s1) < ((space >> 1) + 1))) || ((s1 > s2) && ((uint16_t)(s1 - s2) > ((space >> 1) + 1)))) {
			return -1;
		} 
		if (((s1 < s2) && ((uint16_t)(s2 - s1) > ((space >> 1) + 1))) || ((s1 > s2) && ((uint16_t)(s1 - s2) < ((space >> 1) + 1)))) {
			return 1;
		} 
		return -22;
	}
	public static Object seq32_adds(Object s, Object n, Object space) {
		(((space != 0) && ((space & (space + 1)) == 0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(space != 0) && ((space & (space + 1)) == 0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\seq.c", /* check if space is a power of 2 minus 1 */95));
		if (n > (space >> 1)) {
			return s;
		} 
		return (space == -1024) ? (s + n) : ((s + n) & space);
	}
	public static int seq32_compares(Object s1, Object s2, Object space) {
		(((space != 0) && ((space & (space + 1)) == 0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(space != 0) && ((space & (space + 1)) == 0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\seq.c", /* check if space is a power of 2 minus 1 */107));
		if (s1 == s2) {
			return 0;
		} 
		if (((s1 < s2) && ((uint32_t)(s2 - s1) < ((space >> 1) + 1))) || ((s1 > s2) && ((uint32_t)(s1 - s2) > ((space >> 1) + 1)))) {
			return -1;
		} 
		if (((s1 < s2) && ((uint32_t)(s2 - s1) > ((space >> 1) + 1))) || ((s1 > s2) && ((uint32_t)(s1 - s2) < ((space >> 1) + 1)))) {
			return 1;
		} 
		return -22;
	}
	public static Object seq64_adds(Object s, Object n, Object space) {
		(((space != 0) && ((space & (space + 1)) == 0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(space != 0) && ((space & (space + 1)) == 0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\seq.c", /* check if space is a power of 2 minus 1 */129));
		if (n > (space >> 1)) {
			return s;
		} 
		return (space == -1024) ? (s + n) : ((s + n) & space);
	}
	public static int seq64_compares(Object s1, Object s2, Object space) {
		(((space != 0) && ((space & (space + 1)) == 0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(space != 0) && ((space & (space + 1)) == 0)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\seq.c", /* check if space is a power of 2 minus 1 */141));
		if (s1 == s2) {
			return 0;
		} 
		if (((s1 < s2) && ((uint64_t)(s2 - s1) < ((space >> 1) + 1))) || ((s1 > s2) && ((uint64_t)(s1 - s2) > ((space >> 1) + 1)))) {
			return -1;
		} 
		if (((s1 < s2) && ((uint64_t)(s2 - s1) > ((space >> 1) + 1))) || ((s1 > s2) && ((uint64_t)(s1 - s2) < ((space >> 1) + 1)))) {
			return 1;
		} 
		return -22;
	}
	/*
	 * Copyright (C) 2019 HAW Hamburg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Shell command for getting application metadata.
	
	 *
	 * @author      Kevin Weiss <kevin.weiss@haw-hamburg.de>
	 * @}
	 */
	public static int _app_metadata_handler(int argc, Byte argv) {
		(Object)argc;
		(Object)argv;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/app_metadata_print_json();
		return 0;
	}
	/* usage for open command */
	public static void _open_usage() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("ccnl <interface>");
	}
	public static int _ccnl_open(int argc, byte[][] argv) {
		if (ccnl_relay.getIfcount() >= /* check if already running */CCNL_MAX_INTERFACES) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Already opened max. number of interfaces for CCN!");
			return -1;
		} 
		if (argc != /* check if parameter is given */2) {
			ModernizedCProgram._open_usage();
			return -1;
		} 
		int pid = /*Error: Function owner not recognized*/atoi(argv[/* check if given number is a valid netif PID */1]);
		if (/*Error: Function owner not recognized*/gnrc_netif_get_by_pid(pid) == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%i is not a valid interface!\n", pid);
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ccnl_start();
		if (/*Error: Function owner not recognized*/ccnl_open_netif(pid, GNRC_NETTYPE_CCN) < /* set the relay's PID, configure the interface to interface to use CCN
		     * nettype */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Error registering at network interface!");
			return -1;
		} 
		return 0;
	}
	public static void _content_usage(Byte argv) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s [URI] [content]\nprints the CS if called without parameters:\n%% %s /riot/peter/schmerzl RIOT\n", argv, argv);
	}
	public static int _ccnl_content(int argc, byte[][] argv) {
		if (argc < 2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ccnl_cs_dump(ccnl_relay);
			return 0;
		} 
		if (argc == 2) {
			ModernizedCProgram._content_usage(argv[0]);
			return -1;
		} 
		int arg_len;
		byte[] buf = new byte[(true) + /* add one extra space to fit trailing '\0' */1];
		int pos = 0;
		for (int i = 2;
		 (i < argc) && (pos < (true)); ++i) {
			arg_len = /*Error: Function owner not recognized*/strlen(argv[i]);
			if ((pos + arg_len) > (true)) {
				arg_len = (true) - pos;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(buf[pos], argv[i], arg_len);
			pos += arg_len;
			buf[pos++] = /* increment pos _after_ adding ' ' */(byte)' ';
		}
		buf[--pos] = /* decrement pos _before_ to overwrite last ' ' with '\0' */(byte)'\0';
		arg_len = /*Error: Function owner not recognized*/strlen(buf);
		ccnl_prefix_s prefix = /*Error: Function owner not recognized*/ccnl_URItoPrefix(argv[1], CCNL_SUITE_NDNTLV, ((Object)0));
		size_t offs = CCNL_MAX_PACKET_SIZE;
		size_t reslen = 0;
		arg_len = /*Error: Function owner not recognized*/ccnl_ndntlv_prependContent(prefix, (byte)buf, arg_len, ((Object)0), ((Object)0), offs, ModernizedCProgram._out, reslen);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ccnl_prefix_free(prefix);
		byte olddata;
		byte data = olddata = ModernizedCProgram._out + offs;
		size_t len = new size_t();
		uint64_t typ = new uint64_t();
		if (/*Error: Function owner not recognized*/ccnl_ndntlv_dehead(data, reslen, typ, len) || typ != NDN_TLV_Data) {
			return -1;
		} 
		ccnl_content_s c = 0;
		ccnl_pkt_s pk = /*Error: Function owner not recognized*/ccnl_ndntlv_bytes2pkt(typ, olddata, data, reslen);
		c = /*Error: Function owner not recognized*/ccnl_content_new(pk);
		Object generatedCcnl_content_s = c.getCcnl_content_s();
		generatedCcnl_content_s |=  CCNL_CONTENT_FLAGS_STATIC;
		 m = new (/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (/*Error: Function owner not recognized*/msg_send(m, ccnl_event_loop_pid) < 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("could not add content");
		} 
		return 0;
	}
	public static ccnl_face_s _intern_face_get(Byte addr_str) {
		uint8_t[] relay_addr = new uint8_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(relay_addr, -1024, (GNRC_NETIF_L2ADDR_MAXLEN));
		size_t addr_len = /*Error: Function owner not recognized*/gnrc_netif_addr_from_str(addr_str, relay_addr);
		if (addr_len == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error: %s is not a valid link layer address\n", addr_str);
			return ((Object)0);
		} 
		 sun = new ();
		sun.getSa().setSa_family(AF_PACKET);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy((sun.getLinklayer().getSll_addr()), relay_addr, addr_len);
		sun.getLinklayer().setSll_halen(addr_len);
		sun.getLinklayer().setSll_protocol(/*Error: Function owner not recognized*/htons(ETHERTYPE_NDN));
		ccnl_face_s fibface = /*Error: Function owner not recognized*/ccnl_get_face_or_create(ccnl_relay, 0, sun.getSa(), /*Error: sizeof expression not supported yet*/);
		return fibface;
	}
	public static int _intern_fib_add(Byte pfx, Byte addr_str) {
		int suite = CCNL_SUITE_NDNTLV;
		ccnl_prefix_s prefix = /*Error: Function owner not recognized*/ccnl_URItoPrefix(pfx, suite, ((Object)0));
		if (!prefix) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Error: prefix could not be created!");
			return -1;
		} 
		ccnl_face_s fibface = ModernizedCProgram._intern_face_get(addr_str);
		if (fibface == ((Object)0)) {
			return -1;
		} 
		Object generatedCcnl_face_s = fibface.getCcnl_face_s();
		generatedCcnl_face_s |=  CCNL_FACE_FLAGS_STATIC;
		if (/*Error: Function owner not recognized*/ccnl_fib_add_entry(ccnl_relay, prefix, fibface) != 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Error adding (%s : %s) to the FIB\n", pfx, addr_str);
			return -1;
		} 
		return 0;
	}
	public static void _interest_usage(Byte arg) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s <URI> [relay]\n%% %s /riot/peter/schmerzl                     (classic lookup)\n", arg, arg);
	}
	public static int _ccnl_interest(int argc, byte[][] argv) {
		if (argc < 2) {
			ModernizedCProgram._interest_usage(argv[0]);
			return -1;
		} 
		if (argc > 2) {
			if (ModernizedCProgram._intern_fib_add(argv[1], argv[2]) < 0) {
				ModernizedCProgram._interest_usage(argv[0]);
				return -1;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram._int_buf, (byte)'\0', (true));
		ccnl_prefix_s prefix = /*Error: Function owner not recognized*/ccnl_URItoPrefix(argv[1], CCNL_SUITE_NDNTLV, ((Object)0));
		int res = /*Error: Function owner not recognized*/ccnl_send_interest(prefix, ModernizedCProgram._int_buf, (true), ((Object)0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ccnl_prefix_free(prefix);
		return res;
	}
	public static void _ccnl_fib_usage(Byte argv) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s [<action> <options>]\nprints the FIB if called without parameters:\n%% %s\n<action> may be one of the following\n  * \"add\" - adds an entry to the FIB, requires a prefix and a next-hop address, e.g.\n            %s add /riot/peter/schmerzl ab:cd:ef:01:23:45:67:89\n  * \"del\" - deletes an entry to the FIB, requires a prefix or a next-hop address, e.g.\n            %s del /riot/peter/schmerzl\n            %s del ab:cd:ef:01:23:45:67:89\n", argv, argv, argv, argv, argv);
	}
	public static int _ccnl_fib(int argc, byte[][] argv) {
		if (argc < 2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ccnl_fib_show(ccnl_relay);
		}  else if ((argc == 3) && (/*Error: Function owner not recognized*/strncmp(argv[1], "del", 3) == 0)) {
			int suite = CCNL_SUITE_NDNTLV;
			if (/*Error: Function owner not recognized*/strchr(argv[2], (byte)'/')) {
				ccnl_prefix_s prefix = /*Error: Function owner not recognized*/ccnl_URItoPrefix(argv[2], suite, ((Object)0));
				if (!prefix) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Error: prefix could not be created!");
					return -1;
				} 
				int res = /*Error: Function owner not recognized*/ccnl_fib_rem_entry(ccnl_relay, prefix, ((Object)0));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ccnl_prefix_free(prefix);
				return res;
			} else {
					ccnl_face_s face = ModernizedCProgram._intern_face_get(argv[2]);
					if (face == ((Object)0)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("There is no face for address %s\n", argv[1]);
						return -1;
					} 
					int res = /*Error: Function owner not recognized*/ccnl_fib_rem_entry(ccnl_relay, ((Object)0), face);
					return res;
			} 
		}  else if ((argc == 4) && (/*Error: Function owner not recognized*/strncmp(argv[1], "add", 3) == 0)) {
			if (ModernizedCProgram._intern_fib_add(argv[2], argv[3]) < 0) {
				ModernizedCProgram._ccnl_fib_usage(argv[0]);
				return -1;
			} 
		} else {
				ModernizedCProgram._ccnl_fib_usage(argv[0]);
				return -1;
		} 
		return 0;
	}
	/*
	 * Copyright (C) 2014 René Kijewski <rene.kijewski@fu-berlin.de>
	 *
	 * This library is free software; you can redistribute it and/or
	 * modify it under the terms of the GNU Lesser General Public
	 * License as published by the Free Software Foundation; either
	 * version 2.1 of the License, or (at your option) any later version.
	 *
	 * This library is distributed in the hope that it will be useful,
	 * but WITHOUT ANY WARRANTY; without even the implied warranty of
	 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
	 * Lesser General Public License for more details.
	 *
	 * You should have received a copy of the GNU Lesser General Public
	 * License along with this library; if not, write to the Free Software
	 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
	 */
	/**
	 * @ingroup pthread
	 * @{
	 * @file
	 * @brief Attributes for pthread mutexes.
	 * @author René Kijewski <rene.kijewski@fu-berlin.de>
	 * @}
	 */
	public static int pthread_mutexattr_init() {
		if (attr == ((Object)0)) {
			return 22;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(attr, 0, /*Error: sizeof expression not supported yet*/);
		return 0;
	}
	public static int pthread_mutexattr_destroy() {
		if (attr == ((Object)0)) {
			return 22;
		} 
		(Object)attr;
		return 0;
	}
	public static int pthread_mutexattr_getpshared(Object attr, Integer pshared) {
		if (attr == ((Object)0) || pshared == ((Object)0)) {
			return 22;
		} 
		pshared = attr.getPshared();
		return 0;
	}
	public static int pthread_mutexattr_setpshared(int pshared) {
		if (attr == ((Object)0) || (pshared != (false) && pshared != (true))) {
			return 22;
		} 
		this.setPshared(pshared);
		return 0;
	}
	public static int pthread_mutexattr_gettype(Object attr, Integer kind) {
		if (attr == ((Object)0) || kind == ((Object)0)) {
			return 22;
		} 
		kind = attr.getKind();
		return 0;
	}
	public static int pthread_mutexattr_settype(int kind) {
		if (attr == ((Object)0) || (kind != 0 && kind != 1 && kind != 2)) {
			return 22;
		} 
		if (kind != 0) {
			return /* only "normal" mutexes are implemented, yet */22;
		} 
		this.setKind(kind);
		return 0;
	}
	public static int pthread_mutexattr_getprotocol(Object attr, Integer protocol) {
		if (attr == ((Object)0) || protocol == ((Object)0)) {
			return 22;
		} 
		protocol = attr.getProtocol();
		return 0;
	}
	public static int pthread_mutexattr_setprotocol(int protocol) {
		if (attr == ((Object)0) || (protocol != 0 && protocol != 1 && protocol != 2)) {
			return 22;
		} 
		if (protocol != 0) {
			return /* priority inheritance is not supported, yet */22;
		} 
		this.setProtocol(protocol);
		return 0;
	}
	public static int pthread_mutexattr_getrobust(Object attr, Integer robustness) {
		if (attr == ((Object)0) || robustness == ((Object)0)) {
			return 22;
		} 
		robustness = attr.getRobustness();
		return 0;
	}
	public static int pthread_mutexattr_setrobust(int robustness) {
		if (attr == ((Object)0) || (robustness != 0 && robustness != 1)) {
			return 22;
		} 
		if (robustness != 0) {
			return /* robust mutexes are not supported, yet */22;
		} 
		this.setRobustness(robustness);
		return 0;
	}
	/*
	 * Copyright (C) 2017 HAW Hamburg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 *
	 * @author smlng <s@mlng.net>
	 */
	public static void icmpv6_hdr_print(Object hdr) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("   type: %3u  code: %3u\n", (uint16_t)hdr.getType(), (uint16_t)hdr.getCode());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("   cksum: 0x%04x\n", /*Error: Function owner not recognized*/byteorder_ntohs(hdr.getCsum()));
	}
	public static void xtimer_spin_until(Object target) {
		while (ModernizedCProgram._xtimer_lltimer_now() > target) {
		}
		while (ModernizedCProgram._xtimer_lltimer_now() < target) {
		}
	}
	public static void xtimer_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/timer_init(/*Error: Function owner not recognized*/TIMER_DEV(0), (true), ModernizedCProgram._periph_timer_callback, ((Object)/* initialize low-level timer */0));
		ModernizedCProgram._lltimer_set(/* register initial overflow tick */-1024);
	}
	public static void _xtimer_now_internal(Object short_term, Object long_term) {
		uint32_t before = new uint32_t();
		uint32_t after = new uint32_t();
		uint32_t long_value = new uint32_t();
		/* loop to cope with possible overflow of _xtimer_now() */do {
			before = ModernizedCProgram._xtimer_now();
			long_value = ModernizedCProgram._long_cnt;
			after = ModernizedCProgram._xtimer_now();
		} while (before > after);
		short_term = after;
		long_term = long_value;
	}
	public static Object _xtimer_now64() {
		uint32_t short_term = new uint32_t();
		uint32_t long_term = new uint32_t();
		ModernizedCProgram._xtimer_now_internal(short_term, long_term);
		return ((uint64_t)long_term << 32) + short_term;
	}
	public static void _periph_timer_callback(Object arg, int chan) {
		(Object)arg;
		(Object)chan;
		ModernizedCProgram._timer_callback();
	}
	public static void _lltimer_set(Object target) {
		if (ModernizedCProgram._in_handler) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("_lltimer_set(): setting %u\n", ModernizedCProgram._xtimer_lltimer_mask(target));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/timer_set_absolute(/*Error: Function owner not recognized*/TIMER_DEV(0), (false), ModernizedCProgram._xtimer_lltimer_mask(target));
	}
	public static Object _time_left(Object target, Object reference) {
		uint32_t now = ModernizedCProgram._xtimer_lltimer_now();
		if (now < reference) {
			return 0;
		} 
		if (target > now) {
			return target - now;
		} else {
				return 0;
		} 
	}
	public static int _this_high_period(Object target) {
		(Object)target;
		return 1/**
		 * @brief compare two timers' target values, return the one with lower value.
		 *
		 * if either is NULL, return the other.
		 * if both are NULL, return NULL.
		 */;
	}
	public static void _select_long_timers() {
		xtimer_t select_list_start = ModernizedCProgram.long_list_head;
		xtimer_t select_list_last = ((Object)0);
		while (/* advance long_list head so it points to the first timer of the next (not
		     * just started) "long timer period" */ModernizedCProgram.long_list_head) {
			if ((ModernizedCProgram.long_list_head.getLong_target() <= ModernizedCProgram._long_cnt) && ModernizedCProgram._this_high_period(ModernizedCProgram.long_list_head.getTarget())) {
				select_list_last = ModernizedCProgram.long_list_head;
				ModernizedCProgram.long_list_head = ModernizedCProgram.long_list_head.getNext();
			} else {
					break;
			} 
		}
		if (/* cut the "selected long timer list" at the end */select_list_last) {
			select_list_last.setNext(((Object)0));
		} 
		if (/* merge "current timer list" and "selected long timer list" */ModernizedCProgram.timer_list_head) {
			if (select_list_last) {
				ModernizedCProgram.timer_list_head = ModernizedCProgram.timer_list_head._merge_lists(/* both lists are non-empty. merge. */select_list_start/* "selected long timer list" is empty, nothing to do */);
			} 
		} else {
				if (/* current timer list is empty */select_list_last/* there's no current timer list, but a non-empty "selected long
				             * timer list".  So just use that list as the new current timer
				             * list.*/) {
					ModernizedCProgram.timer_list_head = select_list_start;
				} 
		} 
	}
	/**
	 * @brief handle low-level timer overflow, advance to next short timer period
	 */
	public static void _next_period() {
		/* high_cnt overflowed, so advance >32bit counter *//* advance >32bit counter */ModernizedCProgram._long_cnt++;
		ModernizedCProgram.timer_list_head = /* swap overflow list to current timer list */ModernizedCProgram.overflow_list_head;
		ModernizedCProgram.overflow_list_head = ((Object)0);
		ModernizedCProgram._select_long_timers();
	}
	/* advance <32bit mask register */
	public static void _timer_callback() {
		uint32_t next_target = new uint32_t();
		uint32_t reference = new uint32_t();
		ModernizedCProgram._in_handler = 1;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("_timer_callback() now=%u (%u)pleft=%u\n", ModernizedCProgram.xtimer_now().getTicks32(), ModernizedCProgram._xtimer_lltimer_mask(ModernizedCProgram.xtimer_now().getTicks32()), ModernizedCProgram._xtimer_lltimer_mask(-1024 - ModernizedCProgram.xtimer_now().getTicks32()));
		if (!ModernizedCProgram.timer_list_head) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("_timer_callback(): tick\n"/* there's no timer for this timer period,
			         * so this was a timer overflow callback.
			         *
			         * In this case, we advance to the next timer period.
			         */);
			ModernizedCProgram._next_period();
			reference = 0;
			while (ModernizedCProgram._xtimer_lltimer_now() == ModernizedCProgram._xtimer_lltimer_mask(/* make sure the timer counter also arrived
			         * in the next timer period */-1024/* we ended up in _timer_callback and there is
			         * a timer waiting.
			         */)) {
			}
		} else {
				reference = ModernizedCProgram._xtimer_lltimer_now();
		} 
		uint32_t now = ModernizedCProgram._xtimer_lltimer_now() + /* check if the end of this period is very soon */20;
		if (now < reference) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("_timer_callback: overflowed while executing callbacks. %i\n", ModernizedCProgram.timer_list_head != ((Object)0));
			ModernizedCProgram._next_period();
			while (reference < ModernizedCProgram._xtimer_lltimer_now()) {
			}
			reference = 0;
			;
		} 
		if (ModernizedCProgram.timer_list_head) {
			next_target = ModernizedCProgram.timer_list_head.getTarget() - /* schedule callback on next timer target time */20;
			if (next_target < (ModernizedCProgram._xtimer_now() + /* make sure we're not setting a time in the past */20)) {
				;
			} 
		} else {
				next_target = ModernizedCProgram._xtimer_lltimer_mask(/* there's no timer planned for this timer period *//* schedule callback on next overflow */-1024);
				uint32_t now = ModernizedCProgram._xtimer_lltimer_now();
				if (now < /* check for overflow again */reference) {
					ModernizedCProgram._next_period();
					reference = 0;
					;
				} else {
						if (ModernizedCProgram._xtimer_lltimer_mask(now + 20) < /* check if the end of this period is very soon */now) {
							while (ModernizedCProgram._xtimer_lltimer_now() >= /* spin until next period, then advance */now) {
							}
							ModernizedCProgram._next_period();
							reference = 0;
							;
						} 
				} 
		} 
		ModernizedCProgram._in_handler = 0;
		ModernizedCProgram._lltimer_set(/* set low level timer */next_target);
	}
	/*
	 * Copyright (C) 2015 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_phydat
	 * @{
	 *
	 * @file
	 * @brief       Generic sensor/actuator data handling
	 *
	 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
	 *
	 * @}
	 */
	public static void phydat_dump(Object dim) {
		if (data == ((Object)0) || dim > (true)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Unable to display data object");
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Data:");
		Object generatedScale = this.getScale();
		Object generatedUnit = this.getUnit();
		Object generatedVal = this.getVal();
		for (uint8_t i = 0;
		 i < dim; i++) {
			byte scale_prefix;
			switch (generatedUnit) {
			case .UNIT_UNDEF:
			case .UNIT_PERCENT:
			case .UNIT_TEMP_C:
			case .UNIT_DBM:
					scale_prefix = /* no string conversion */(byte)'\0';
					break;
			case .UNIT_M3:
			case .UNIT_NONE:
			case .UNIT_TEMP_F:
			case .UNIT_M2:
			default:
					scale_prefix = ModernizedCProgram.phydat_prefix_from_scale(generatedScale);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\t");
			if (dim > 1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("[%u] ", (int)i);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("     ");
			} 
			if (scale_prefix) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%6d %c", (int)generatedVal[i], scale_prefix);
			}  else if (generatedScale == 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%6d", (int)generatedVal[i]);
			}  else if ((generatedScale > -5) && (generatedScale < 0)) {
				byte[] num = new byte[8];
				size_t len = /*Error: Function owner not recognized*/fmt_s16_dfp(num, generatedVal[i], generatedScale);
				num[len] = (byte)'\0';
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s", num);
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%iE%i", (int)generatedVal[i], (int)generatedScale);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s\n", ModernizedCProgram.phydat_unit_to_str(generatedUnit));
		}
	}
	public static Object phydat_unit_to_str(Object unit) {
		switch (unit) {
		case .UNIT_M:
				return "m";
		case .UNIT_M2:
				return "m^2";
		case .UNIT_CD:
				return "cd";
		case .UNIT_DPS:
				return "dps";
		case .UNIT_M3:
				return "m^3";
		case .UNIT_V:
				return "V";
		case .UNIT_PPM:
				return "ppm";
		case .UNIT_PPB:
				return "ppb";
		case .UNIT_DBM:
				return "dBm";
		case .UNIT_PA:
				return "Pa";
		case .UNIT_GR:
				return "G";
		case .UNIT_A:
				return "A";
		case .UNIT_GPM3:
				return "g/m^3";
		case .UNIT_BAR:
				return "Bar";
		case .UNIT_COULOMB:
				return "C";
		case .UNIT_TEMP_K:
				return "K";
		case .UNIT_PERCENT:
				return "%";
		case .UNIT_GS:
				return "Gs";
		case .UNIT_F:
				return "F";
		case .UNIT_LUX:
				return "lx";
		case .UNIT_TEMP_C:
				return "°C";
		case .UNIT_G:
				return "g";
		case .UNIT_CTS:
				return "cts";
		case .UNIT_PH:
				return "pH";
		case .UNIT_TEMP_F:
				return "°F";
		default:
				return "";
		}
	}
	public static byte phydat_prefix_from_scale(Object scale) {
		switch (scale) {
		case 9:
				return (byte)'G';
		case -12:
				return (byte)'p';
		case 12:
				return (byte)'T';
		case 15:
				return (byte)'P';
		case -3:
				return (byte)'m';
		case -9:
				return (byte)'n';
		case 3:
				return (byte)'k';
		case -6:
				return (byte)'u';
		case 2:
				return (byte)'h';
		case -15:
				return (byte)'f';
		case 6:
				return (byte)'M';
		default:
				return (byte)'\0';
		}
	}
	public static int _blacklist(int argc, byte[][] argv) {
		 addr = new ();
		if (argc < 2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_blacklist_print();
			return 0;
		}  else if (argc > 2) {
			if (ModernizedCProgram.ipv6_addr_from_str(addr, argv[2]) == ((Object)0)) {
				ModernizedCProgram._usage(argv[0]);
				return 1;
			} 
		} 
		if (/*Error: Function owner not recognized*/strcmp("add", argv[1]) == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_blacklist_add(addr);
		}  else if (/*Error: Function owner not recognized*/strcmp("del", argv[1]) == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_blacklist_del(addr);
		}  else if (/*Error: Function owner not recognized*/strcmp("help", argv[1]) == 0) {
			ModernizedCProgram._usage(argv[0]);
		} else {
				ModernizedCProgram._usage(argv[0]);
				return 1;
		} 
		return 0/** @} */;
	}
	public static void _callback_unlock_mutex(Object arg) {
		 mutex = ()arg;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(mutex);
	}
	public static void _xtimer_tsleep(Object offset, Object long_offset) {
		if (/*Error: Function owner not recognized*/irq_is_in()) {
			((!long_offset) ? (Object)0 : /*Error: Function owner not recognized*/_assert("!long_offset", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\xtimer.c", 60));
			ModernizedCProgram._xtimer_spin(offset);
			return /*Error: Unsupported expression*/;
		} 
		xtimer_t timer = new xtimer_t();
		 mutex = MUTEX_INIT;
		timer.setCallback(_callback_unlock_mutex);
		timer.setArg((Object)mutex);
		timer.setTarget(timer.setLong_target(0));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(mutex);
		timer._xtimer_set64(offset, long_offset);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(mutex);
	}
	public static void _xtimer_periodic_wakeup(Object last_wakeup, Object period) {
		xtimer_t timer = new xtimer_t();
		 mutex = MUTEX_INIT;
		timer.setCallback(_callback_unlock_mutex);
		timer.setArg((Object)mutex);
		uint32_t target = (last_wakeup) + period;
		uint32_t now = ModernizedCProgram._xtimer_now();
		if (now < (/* make sure we're not setting a value in the past */last_wakeup)) {
			if (!((now < target) && (target < (/* base timer overflowed between last_wakeup and now */last_wakeup/* target time has already passed */)))) {
				;
			} 
		} else {
				if ((((last_wakeup) <= target) && (target <= /* base timer did not overflow */now/* target time has already passed */))) {
					;
				} 
		} 
		uint32_t offset = target - /*
		     * Note: last_wakeup _must never_ specify a time in the future after
		     * _xtimer_periodic_sleep returns.
		     * If this happens, last_wakeup may specify a time in the future when the
		     * next call to _xtimer_periodic_sleep is made, which in turn will trigger
		     * the overflow logic above and make the next timer fire too early, causing
		     * last_wakeup to point even further into the future, leading to a chain
		     * reaction.
		     *
		     * tl;dr Don't return too early!
		     */now;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("xps, now: %9u, tgt: %9u, off: %9u\n", now, target, offset);
		if (offset < (30 * 2)) {
			ModernizedCProgram._xtimer_spin(offset);
		} else {
				if (offset < (true/* NB: This will overshoot the target by the amount of time it took
				             * to get here from the beginning of xtimer_periodic_wakeup()
				             *
				             * Since interrupts are normally enabled inside this function, this time may
				             * be undeterministic. */)) {
					target = ModernizedCProgram._xtimer_now() + offset;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(mutex);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("xps, abs: %u\n", target);
				timer._xtimer_set_absolute(target);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(mutex);
		} 
	}
	public static void _callback_msg(Object arg) {
		 msg = ()arg;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_send_int(msg, msg.getSender_pid());
	}
	public static void _callback_wakeup(Object arg) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/thread_wakeup(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((intptr_t)arg));
	}
	public static void xtimer_now_timex() {
		uint64_t now = ModernizedCProgram.xtimer_usec_from_ticks64(ModernizedCProgram.xtimer_now64());
		this.setSeconds(/*Error: Function owner not recognized*/div_u64_by_1000000(now));
		Object generatedSeconds = this.getSeconds();
		this.setMicroseconds(now - (generatedSeconds * (true/* Prepares the message to trigger the timeout.
		 * Additionally, the xtimer_t struct gets initialized.
		 */)));
	}
	public static int _xtimer_msg_receive_timeout64(Object m, Object timeout_ticks) {
		 tmsg = new ();
		xtimer_t t = new xtimer_t();
		t._setup_timer_msg(tmsg);
		t._xtimer_set_msg64(timeout_ticks, tmsg, sched_active_pid);
		return t._msg_wait(m, tmsg);
	}
	public static int _xtimer_msg_receive_timeout(Object msg, Object timeout_ticks) {
		 tmsg = new ();
		xtimer_t t = new xtimer_t();
		t._setup_timer_msg(tmsg);
		t._xtimer_set_msg(timeout_ticks, tmsg, sched_active_pid);
		return t._msg_wait(msg, tmsg);
	}
	public static void _mutex_timeout(Object arg) {
		int irqstate = /*Error: Function owner not recognized*/irq_disable();
		mutex_thread_t mt = (mutex_thread_t)arg;
		mt.setTimeout(1);
		Object generatedMutex = mt.getMutex();
		Object generatedThread = mt.getThread();
		 node = /*Error: Function owner not recognized*/list_remove(generatedMutex.getQueue(), ()generatedThread.getRq_entry());
		if (node != ((Object)/* if thread was removed from the list */0)) {
			if (generatedMutex.getQueue().getNext() == ((Object)0)) {
				generatedMutex.getQueue().setNext(MUTEX_LOCKED);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_set_status(generatedThread, STATUS_PENDING);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(irqstate);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_switch(generatedThread.getPriority());
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(irqstate);
	}
	/* interupts a disabled because xtimer can spin
	     * if xtimer_set spins the callback is executed
	     * in the thread context
	     *
	     * If the xtimer spin is fixed in the future
	     * interups disable/restore can be removed
	     */
	public static int xtimer_mutex_lock_timeout(Object mutex, Object timeout) {
		xtimer_t t = new xtimer_t();
		mutex_thread_t mt = new mutex_thread_t(mutex, ()sched_active_thread, 0);
		if (timeout != 0) {
			t.setCallback(_mutex_timeout);
			t.setArg((Object)((mutex_thread_t)mt));
			ModernizedCProgram.xtimer_set64(t, timeout);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(mutex);
		t.xtimer_remove();
		Object generatedTimeout = mt.getTimeout();
		return -generatedTimeout;
	}
	/*
	 * Copyright (C) 2014  Ludwig Knüpfer <ludwig.knuepfer@fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Shell commands for system calls
	 *
	 * @author      Ludwig Knüpfer <ludwig.knuepfer@fu-berlin.de>
	 *
	 * @}
	 */
	public static int _reboot_handler(int argc, Byte argv) {
		(Object)argc;
		(Object)argv;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pm_reboot();
		return 0;
	}
	public static int tsrb_empty(Object rb) {
		return (rb.getReads() == rb.getWrites());
	}
	public static int tsrb_avail(Object rb) {
		return (rb.getWrites() - rb.getReads());
	}
	public static int tsrb_full(Object rb) {
		return (rb.getWrites() - rb.getReads()) == rb.getSize();
	}
	public static int tsrb_free(Object rb) {
		return (rb.getSize() - rb.getWrites() + rb.getReads());
	}
	public static void _cdc_acm_rx_pipe(Object cdcacm, Object[] data, Object len) {
		(Object)cdcacm;
		for (size_t i = 0;
		 i < len; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/isrpipe_write_one(ModernizedCProgram._cdc_stdio_isrpipe, data[i]);
		}
	}
	public static void usb_cdc_acm_stdio_init(Object usbus) {
		ModernizedCProgram.usbus_cdc_acm_init(usbus, ModernizedCProgram.cdcacm, _cdc_acm_rx_pipe, ((Object)0), ModernizedCProgram._cdc_tx_buf_mem, /*Error: sizeof expression not supported yet*/);
	}
	public static int _nib_onl_get_if(Object node) {
		return (node.getInfo() & (GNRC_IPV6_NIB_NC_INFO_IFACE_MASK)) >> (GNRC_IPV6_NIB_NC_INFO_IFACE_POS/**
		 * @brief   Sets interface for a NIB entry
		 *
		 * @param[in,out] node  A NIB entry.
		 * @param[in] iface     An interface identifier.
		 */);
	}
	public static  _nib_offl_add(Object next_hop, int iface, Object pfx, int pfx_len, Object mode) {
		_nib_offl_entry_t nib_offl = /*Error: Function owner not recognized*/_nib_offl_alloc(next_hop, iface, pfx, pfx_len);
		Object generatedMode = nib_offl.getMode();
		if (nib_offl != ((Object)0)) {
			generatedMode |=  mode;
		} 
		return nib_offl/**
		 * @brief   Helper function for the view-level remove-functions below
		 *
		 * @param[in,out] nib_offl  An entry.
		 */;
	}
	public static void _nib_offl_remove(Object mode) {
		Object generatedMode = this.getMode();
		generatedMode &=  ~mode;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/_nib_offl_clear(nib_offl/**
		 * @brief   Creates or gets an existing destination cache entry by its addresses
		 *
		 * @pre     `(next_hop != NULL)`
		 * @pre     `(dst != NULL)`
		 *
		 * @param[in] next_hop  Next hop to the destination. Must not be NULL.
		 *                      *May also be a global address!*
		 * @param[in] iface     The interface to the destination.
		 *
		 * @note    Only available if @ref GNRC_IPV6_NIB_CONF_DC.
		 *
		 * @return  A new or existing off-link entry with _nib_offl_entry_t::pfx set to
		 *          @p pfx.
		 * @return  NULL, if no space is left.
		 */);
	}
	/**
	 * @brief   Removes a destination cache entry
	 *
	 * @param[in,out] nib_dr    An entry.
	 *
	 * Corresponding on-link entry is removed, too.
	 *
	 * @note    Only available if @ref GNRC_IPV6_NIB_CONF_DC.
	 */
	public static void _evtimer_add(Object ctx, Object type, Object event, Object offset) {
		 target_pid = /* just for testing */KERNEL_PID_LAST;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/evtimer_del(()(ModernizedCProgram._nib_evtimer), ()event);
		event.getEvent().setNext(((Object)0));
		event.getEvent().setOffset(offset);
		event.getMsg().setType(type);
		event.getMsg().getContent().setPtr(ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/evtimer_add_msg(ModernizedCProgram._nib_evtimer, event, target_pid);
	}
	/* PRIV_NIB_INTERNAL_H */
	/** @} */
	/*
	 * Copyright (C) 2019 Inria
	 *               2019 Freie Universität Berlin
	 *               2019 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_riotboot_flashwrite
	 * @{
	 *
	 * @file
	 * @brief       Firmware update helper functions
	 *
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * @}
	 */
	public static Object min(Object a, Object b) {
		return a <= b ? a : b;
	}
	public static Object riotboot_flashwrite_slotsize(Object state) {
		switch (state.getTarget_slot()) {
		case 0:
				return SLOT0_LEN;
		default:
				return 0;
		}
	}
	public static int riotboot_flashwrite_init_raw(Object state, int target_slot, Object offset) {
		((offset <= FLASHPAGE_SIZE) ? (Object)0 : /*Error: Function owner not recognized*/_assert("offset <= FLASHPAGE_SIZE", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\flashwrite.c", 51));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("riotboot_flashwrite: initializing update to target slot %i\n", target_slot);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(state, 0, /*Error: Unsupported expression*/);
		state.setOffset(offset);
		state.setTarget_slot(target_slot);
		state.setFlashpage(/*Error: Function owner not recognized*/flashpage_page((Object)ModernizedCProgram.riotboot_slot_get_hdr(target_slot)));
		return 0;
	}
	public static int riotboot_flashwrite_putbytes(Object state, Object bytes, Object len, Object more) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("riotboot_flashwrite: processing bytes %u-%u\n", state.getOffset(), state.getOffset() + len - 1);
		while (len) {
			size_t flashpage_pos = state.getOffset() % FLASHPAGE_SIZE;
			size_t flashpage_avail = FLASHPAGE_SIZE - flashpage_pos;
			size_t to_copy = ModernizedCProgram.min(flashpage_avail, len);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(state.getFlashpage_buf() + flashpage_pos, bytes, to_copy);
			flashpage_avail -= to_copy;
			state.getOffset() += to_copy;
			bytes += to_copy;
			len -= to_copy;
			if ((!flashpage_avail) || (!more)) {
				if (/*Error: Function owner not recognized*/flashpage_write_and_verify(state.getFlashpage(), state.getFlashpage_buf()) != FLASHPAGE_OK) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_WARNING("riotboot_flashwrite: error writing flashpage %u!\n", state.getFlashpage());
					return -1;
				} 
				state.getFlashpage()++;
			} 
		}
		return 0;
	}
	public static int riotboot_flashwrite_finish_raw(Object state, Object bytes, Object len) {
		((len <= FLASHPAGE_SIZE) ? (Object)0 : /*Error: Function owner not recognized*/_assert("len <= FLASHPAGE_SIZE", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\flashwrite.c", 97));
		int res = -1;
		uint8_t slot_start = (uint8_t)ModernizedCProgram.riotboot_slot_get_hdr(state.getTarget_slot());
		uint8_t firstpage = new uint8_t();
		if (len < FLASHPAGE_SIZE) {
			firstpage = state.getFlashpage_buf();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(firstpage, bytes, len);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(firstpage + len, slot_start + len, FLASHPAGE_SIZE - len);
		} else {
				firstpage = (Object)bytes;
		} 
		int flashpage = /*Error: Function owner not recognized*/flashpage_page((Object)slot_start);
		if (/*Error: Function owner not recognized*/flashpage_write_and_verify(flashpage, firstpage) != FLASHPAGE_OK) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_WARNING("riotboot_flashwrite: re-flashing first block failed!\n");
			;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("riotboot_flashwrite: riotboot flashing completed successfully\n");
		res = 0;
	}
	public static int is_addr_reserved(Object addr) {
		if ((addr < -1024) || (addr > -1024)) {
			return 1;
		} 
		return 0;
	}
	public static int _i2c_scan(int argc, byte[][] argv) {
		 dev = new ();
		if (ModernizedCProgram.get_dev(dev, argc, argv)) {
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Scanning I2C device %s...\n", argv[1]);
		if (/*Error: Function owner not recognized*/i2c_acquire(dev)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Failed to acquire I2C device");
			return -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("addr not ack'ed = \"-\", addr ack'ed = \"X\", addr reserved = \"R\", error = \"E\"\n     0 1 2 3 4 5 6 7 8 9 a b c d e f");
		for (byte i = 0;
		 i < 8; i++) {
			byte[] row = new byte[]{(byte)'0', (byte)'x', (byte)'0' + i, (byte)'0', (byte)'\0'};
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(row, (_iob[1]));
			uint16_t addr = i;
			addr <<=  4;
			for (int j = 0;
			 j < 16; j++) {
				byte[] str = new byte[]{(byte)' ', (byte)'-', (byte)'\0'};
				if (ModernizedCProgram.is_addr_reserved(addr)) {
					str[1] = (byte)'R';
				} else {
						byte[] dummy = new byte[1];
						int retval;
						while (-11 == (retval = /*Error: Function owner not recognized*/i2c_read_byte(dev, addr, dummy, 0/* retry until bus arbitration succeeds */))) {
						}
						switch (retval) {
						case -6/* No ACK --> no device */:
								break;
						case 0:
								str[1] = /* success: Device did respond */(byte)'X';
								break;
						default:
								str[1] = /* Some unexpected error */(byte)'E';
								break;
						}
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(str, (_iob[1]));
				addr++;
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/i2c_release(dev);
		return 0;
	}
	/*
	 * Copyright (C) 2019 Inria
	 *               2019 Freie Universität Berlin
	 *               2019 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_riotboot_flashwrite
	 * @{
	 *
	 * @file
	 * @brief       Firmware update sha256 verification helper functions
	 *
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * @}
	 */
	public static int riotboot_flashwrite_verify_sha256(Object sha256_digest, Object img_len, int target_slot) {
		byte[] digest = new byte[SHA256_DIGEST_LENGTH];
		 sha256 = new ();
		if (img_len < 4) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("riotboot: verify_sha256(): image too small\n");
			return -1;
		} 
		uint8_t img_start = (uint8_t)ModernizedCProgram.riotboot_slot_get_hdr(target_slot);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LOG_INFO("riotboot: verifying digest at %p (img at: %p size: %u)\n", sha256_digest, img_start, img_len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_init(sha256);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_update(sha256, "RIOT", /* add RIOTBOOT_MAGIC since it isn't written into flash until
		     * riotboot_flashwrite_finish()" */4);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_update(sha256, img_start + 4, img_len - /* account for injected RIOTBOOT_MAGIC by skipping RIOTBOOT_MAGIC_LEN */4);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sha256_final(sha256, digest);
		return /*Error: Function owner not recognized*/memcmp(sha256_digest, digest, SHA256_DIGEST_LENGTH) != 0;
	}
	public static void ps() {
		byte[] queued_name = new byte[]{(byte)'_', (byte)'Q'};
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\tpid | %-9sQ | pri \n", "state");
	}
	public static Object seq8_add(Object s, Object n) {
		return ModernizedCProgram.seq8_adds(s, n, -1024/**
		 * @brief           Increment a sequence number @p s by 1 in the serial number @p space
		 * @param[in]       s       sequence number
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          s + 1
		 */);
	}
	public static Object seq8_incs(Object s, Object space) {
		return ModernizedCProgram.seq8_adds(s, 1, space/**
		 * @brief           Increment a sequence number @p s by 1 in the serial number space UINT8_MAX
		 * @param[in]       s       sequence number
		 * @return          s + 1
		 */);
	}
	public static Object seq8_inc(Object s) {
		return ModernizedCProgram.seq8_adds(s, 1, -1024/**
		 * @brief           Compare sequence numbers @p s1, @p s2 in the serial number @p space
		 * @see             <a href="https://tools.ietf.org/html/rfc1982#section-3.2">
		 *                      3.2. Comparison
		 *                  </a>
		 * @param[in]       s1      first sequence number
		 * @param[in]       s2      second sequence number
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          -1, if s1 < s2
		 * @return          0, if s1 == s2
		 * @return          1, if s1 > s2
		 * @return          -EINVAL, if comparison of the pair (s1,s2) is undefined
		 */);
	}
	public static int seq8_compare(Object s1, Object s2) {
		return ModernizedCProgram.seq8_compares(s1, s2, -1024/**
		 * @brief           Addition of a 16 bit sequence number @p s and a positive integer @p n
		 *                  in the serial number @p space
		 * @see             <a href="https://tools.ietf.org/html/rfc1982#section-3.1">
		 *                      3.1. Addition
		 *                  </a>
		 * @param[in]       s       sequence number
		 * @param[in]       n       positive integer in the range of [0 .. ((@p space / 2) - 1)]
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          s + n, if valid
		 * @return          s, if n is out of range
		 */);
	}
	public static Object seq16_add(Object s, Object n) {
		return ModernizedCProgram.seq16_adds(s, n, -1024/**
		 * @brief           Increment a sequence number @p s by 1 in the serial number @p space
		 * @param[in]       s       sequence number
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          s + 1
		 */);
	}
	public static Object seq16_incs(Object s, Object space) {
		return ModernizedCProgram.seq16_adds(s, 1, space/**
		 * @brief           Increment a sequence number @p s by 1 in the serial number space UINT16_MAX
		 * @param[in]       s       sequence number
		 * @return          s + 1
		 */);
	}
	public static Object seq16_inc(Object s) {
		return ModernizedCProgram.seq16_adds(s, 1, -1024/**
		 * @brief           Compare sequence numbers @p s1, @p s2 in the serial number @p space
		 * @see             <a href="https://tools.ietf.org/html/rfc1982#section-3.2">
		 *                      3.2. Comparison
		 *                  </a>
		 * @param[in]       s1      first sequence number
		 * @param[in]       s2      second sequence number
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          -1, if s1 < s2
		 * @return          0, if s1 == s2
		 * @return          1, if s1 > s2
		 * @return          -EINVAL, if comparison of the pair (s1,s2) is undefined
		 */);
	}
	public static int seq16_compare(Object s1, Object s2) {
		return ModernizedCProgram.seq16_compares(s1, s2, -1024/**
		 * @brief           Addition of a 32 bit sequence number @p s and a positive integer @p n
		 *                  in the serial number @p space
		 * @see             <a href="https://tools.ietf.org/html/rfc1982#section-3.1">
		 *                      3.1. Addition
		 *                  </a>
		 * @param[in]       s       sequence number
		 * @param[in]       n       positive integer in the range of [0 .. ((@p space / 2) - 1)]
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          s + n, if valid
		 * @return          s, if n is out of range
		 */);
	}
	public static Object seq32_add(Object s, Object n) {
		return ModernizedCProgram.seq32_adds(s, n, -1024/**
		 * @brief           Increment a sequence number @p s by 1 in the serial number @p space
		 * @param[in]       s       sequence number
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          s + 1
		 */);
	}
	public static Object seq32_incs(Object s, Object space) {
		return ModernizedCProgram.seq32_adds(s, 1, space/**
		 * @brief           Increment a sequence number @p s by 1 in the serial number space UINT32_MAX
		 * @param[in]       s       sequence number
		 * @return          s + 1
		 */);
	}
	public static Object seq32_inc(Object s) {
		return ModernizedCProgram.seq32_adds(s, 1, -1024/**
		 * @brief           Compare sequence numbers @p s1, @p s2 in the serial number @p space
		 * @see             <a href="https://tools.ietf.org/html/rfc1982#section-3.2">
		 *                      3.2. Comparison
		 *                  </a>
		 * @param[in]       s1      first sequence number
		 * @param[in]       s2      second sequence number
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          -1, if s1 < s2
		 * @return          0, if s1 == s2
		 * @return          1, if s1 > s2
		 * @return          -EINVAL, if comparison of the pair (s1,s2) is undefined
		 */);
	}
	public static int seq32_compare(Object s1, Object s2) {
		return ModernizedCProgram.seq32_compares(s1, s2, -1024/**
		 * @brief           Addition of a 64 bit sequence number @p s and a positive integer @p n
		 *                  in the serial number @p space
		 * @see             <a href="https://tools.ietf.org/html/rfc1982#section-3.1">
		 *                      3.1. Addition
		 *                  </a>
		 * @param[in]       s       sequence number
		 * @param[in]       n       positive integer in the range of [0 .. ((@p space / 2) - 1)]
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          s + n, if valid
		 * @return          s, if n is out of range
		 */);
	}
	public static Object seq64_add(Object s, Object n) {
		return ModernizedCProgram.seq64_adds(s, n, -1024/**
		 * @brief           Increment a sequence number @p s by 1 in the serial number @p space
		 * @param[in]       s       sequence number
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          s + 1
		 */);
	}
	public static Object seq64_incs(Object s, Object space) {
		return ModernizedCProgram.seq64_adds(s, 1, space/**
		 * @brief           Increment a sequence number @p s by 1 in the serial number space UINT64_MAX
		 * @param[in]       s       sequence number
		 * @return          s + 1
		 */);
	}
	public static Object seq64_inc(Object s) {
		return ModernizedCProgram.seq64_adds(s, 1, -1024/**
		 * @brief           Compare sequence numbers @p s1, @p s2 in the serial number @p space
		 * @see             <a href="https://tools.ietf.org/html/rfc1982#section-3.2">
		 *                      3.2. Comparison
		 *                  </a>
		 * @param[in]       s1      first sequence number
		 * @param[in]       s2      second sequence number
		 * @param[in]       space   serial number space must be a power of 2 minus 1
		 * @return          -1, if s1 < s2
		 * @return          0, if s1 == s2
		 * @return          1, if s1 > s2
		 * @return          -EINVAL, if comparison of the pair (s1,s2) is undefined
		 */);
	}
	public static int seq64_compare(Object s1, Object s2) {
		return ModernizedCProgram.seq64_compares(s1, s2, -1024);
	}
	/** @} */
	/* SEQ_H */
	/*
	 * Copyright (C) 2016 Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     net_gnrc_sock
	 *
	 * @{
	 *
	 * @file
	 * @brief   Internal GNRC-specific types and function definitions
	 *
	 * @author  Martine Lenders <mlenders@inf.fu-berlin.de>
	 */
	/**
	 * @brief   Minimum port number in the dynamic portrange
	 */
	/**
	 * @brief   Maximum port number in the dynamic portrange
	 */
	/**
	 * @brief   Available ports in the range for dynamic source port allocation
	 */
	/**
	 * @brief   Error value indicating that no free port could be found in the
	 *          dynamic port range
	 */
	/**
	 * @brief   Offset for next dynamic port
	 *
	 * Currently set to a static (prime) offset, but could be random, too
	 * see https://tools.ietf.org/html/rfc6056#section-3.3.3
	 */
	/**
	 * @brief   Internal helper functions for GNRC
	 * @internal
	 * @{
	 */
	/**
	 * @brief   Checks if address family is not supported
	 * @internal
	 */
	public static boolean gnrc_af_not_supported(int af) {
		return (af != /* TODO: add AF_INET support */AF_INET6/**
		 * @brief   Check if end point points to any address
		 * @internal
		 */);
	}
	public static boolean gnrc_ep_addr_any(Object ep) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(ep != ((Object)0));
		uint8_t p = (uint8_t)ep.getAddr();
		for (uint8_t i = 0;
		 i < /*Error: sizeof expression not supported yet*/; i++) {
			if (p[i] != 0) {
				return 0;
			} 
		}
		return 1/**
		 * @brief   Initializes a sock end-point from a given and sets the network
		 *          interface implicitly if there is only one potential interface.
		 * @internal
		 */;
	}
	public static void gnrc_ep_set(Object out, Object in, Object in_size) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out, in, in_size/* set interface implicitly */);
	}
	/* $OpenBSD: ashrdi3.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Shift a (signed) quad value right (arithmetic shift right).
	 */
	public static Object __ashrdi3(Object a, Object shift) {
		Object aa;
		if (shift == 0) {
			return a;
		} 
		aa.setQ(a);
		Object generatedSl = aa.getSl();
		Object generatedUl = aa.getUl();
		if (shift >= (/*Error: Unsupported expression*/ * 8/*
		         * Smear bits rightward using the machine's right-shift
		         * method, whether that is sign extension or zero fill,
		         * to get the `sign word' s.  Note that shifting by
		         * INT_BITS is undefined, so we shift (INT_BITS-1),
		         * then 1 more, to get our answer.
		         */)) {
			int s = (generatedSl[(true)] >> ((/*Error: Unsupported expression*/ * 8) - 1)) >> /* LINTED inherits machine dependency */1;
			generatedUl[(false)] = generatedSl[(true)] >> (shift - (/*Error: Unsupported expression*/ * /* LINTED inherits machine dependency*/8));
			generatedUl[(true)] = s;
		} else {
				generatedUl[(false)] = (generatedUl[(false)] >> shift) | (generatedUl[(true)] << ((/*Error: Unsupported expression*/ * 8) - shift));
				generatedSl[(true)] >>=  /* LINTED inherits machine dependency */shift;
		} 
		Object generatedQ = aa.getQ();
		return generatedQ;
	}
	public static Object unaligned_get_u16(Object ptr) {
		uint16_una_t tmp = ptr;
		return tmp.getVal();
	}
	/** @} */
	/* UNALIGNED_H */
	public static void nhdp_reader_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_reader_init(/* Initialize reader */ModernizedCProgram.reader);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_reader_add_packet_consumer(ModernizedCProgram.reader, ModernizedCProgram._nhdp_packet_consumer, NULL, /* Register packet consumer for sequence number processing */0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_reader_add_message_consumer(ModernizedCProgram.reader, /* Register HELLO message consumer */ModernizedCProgram._nhdp_msg_consumer, ModernizedCProgram._nhdp_msg_tlvs, /*Error: Function owner not recognized*/ARRAY_SIZE(ModernizedCProgram._nhdp_msg_tlvs));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_reader_add_message_consumer(ModernizedCProgram.reader, ModernizedCProgram._nhdp_address_consumer, ModernizedCProgram._nhdp_addr_tlvs, /*Error: Function owner not recognized*/ARRAY_SIZE(ModernizedCProgram._nhdp_addr_tlvs));
	}
	public static int nhdp_reader_handle_packet(Object rcvg_if_pid, Object buffer, Object length) {
		int result;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_packet_handler);
		ModernizedCProgram.if_pid = /* Store PID of interface this packet was received on */rcvg_if_pid;
		result = /*Error: Function owner not recognized*/rfc5444_reader_handle_packet(ModernizedCProgram.reader, buffer, /* Parse packet with reader */length);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_packet_handler);
		return result;
	}
	public static void nhdp_reader_cleanup() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_reader_cleanup(ModernizedCProgram.reader/*------------------------------------------------------------------------------------*//*                                Internal functions                                  */)/*------------------------------------------------------------------------------------*/;/*------------------------------------------------------------------------------------*/
	}
	public static rfc5444_result _nhdp_pkt_end_cb(Object context, Object dropped) {
		if ((ModernizedCProgram.originator_link_tuple != NULL) && (context.getHas_pktseqno())) {
			ModernizedCProgram.originator_link_tuple.iib_process_metric_pckt(ModernizedCProgram.lt_metric_val, context.getPkt_seqno());
		} 
		ModernizedCProgram.originator_link_tuple = /* Reset originator temp fields */NULL;
		ModernizedCProgram.lt_metric_val = (false);
		return RFC5444_OKAY/**
		 * Handle one address and its corresponding TLVs
		 * Called by oonf_api for every included address to allow parsing
		 */;
	}
	public static rfc5444_result _nhdp_blocktlv_address_cb(Object cont) {
		uint8_t tmp_result = new uint8_t();
		nhdp_addr nhdp_addr = new nhdp_addr();
		nhdp_addr_t current_addr = nhdp_addr.get_nhdp_db_addr(cont.getAddr().get_addr()[0], cont.getAddr().get_prefix_len());
		if (!current_addr) {
			return /* Insufficient memory */RFC5444_DROP_MESSAGE;
		} 
		if (current_addr.check_addr_validity() != /* Check validity of address tlvs */RFC5444_OKAY) {
			current_addr.nhdp_decrement_addr_usage();
			return RFC5444_DROP_MESSAGE;
		} 
		if (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LOCAL_IF].getRfc5444_reader_tlvblock_consumer_entry()) {
			switch (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LOCAL_IF].getRfc5444_reader_tlvblock_consumer_entry().getSingle_value()) {
			case RFC5444_LOCALIF_THIS_IF:
					current_addr.setIn_tmp_table((true));
					break;
			case RFC5444_LOCALIF_OTHER_IF:
					current_addr.setIn_tmp_table((true));
					break;
			default:
					/* Wrong value, drop message */current_addr.nhdp_decrement_addr_usage();
					return RFC5444_DROP_MESSAGE;
			}
		}  else if ((tmp_result = current_addr.lib_is_reg_addr(ModernizedCProgram.if_pid))) {
			if ((!ModernizedCProgram.sym) && (tmp_result == 1) && ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_STATUS].getRfc5444_reader_tlvblock_consumer_entry()) {
				switch (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_STATUS].getRfc5444_reader_tlvblock_consumer_entry().getSingle_value()) {
				case RFC5444_LINKSTATUS_LOST:
						ModernizedCProgram.lost = 1;
						break;
				case RFC5444_LINKSTATUS_SYMMETRIC/* Fall - through */:
				case RFC5444_LINKSTATUS_HEARD:
						ModernizedCProgram.sym = 1;
						break;
				default:
						/* Wrong value, drop message */current_addr.nhdp_decrement_addr_usage();
						return RFC5444_DROP_MESSAGE;
				}
			} 
			if (ModernizedCProgram.lt_metric_val == (false) && ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_METRIC].getRfc5444_reader_tlvblock_consumer_entry() != NULL) {
				uint16_t metric_enc = ((uint16_t)ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_METRIC].getRfc5444_reader_tlvblock_consumer_entry().getSingle_value());
				if (metric_enc & (true)) {
					ModernizedCProgram.lt_metric_val = /*Error: Function owner not recognized*/rfc5444_metric_decode(/* Incoming metric value at the neighbor if is outgoing value for our if */metric_enc);
				} 
			} 
			/* Address is one of our own addresses, ignore it */current_addr.nhdp_decrement_addr_usage();
		}  else if (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_STATUS].getRfc5444_reader_tlvblock_consumer_entry()) {
			switch (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_LINK_STATUS].getRfc5444_reader_tlvblock_consumer_entry().getSingle_value()) {
			case RFC5444_LINKSTATUS_LOST:
					if (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_OTHER_NEIGHB].getRfc5444_reader_tlvblock_consumer_entry() && ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_OTHER_NEIGHB].getRfc5444_reader_tlvblock_consumer_entry().getSingle_value() == RFC5444_OTHERNEIGHB_SYMMETRIC) {
						/* Symmetric has higher priority */current_addr.add_temp_metric_value();
						current_addr.setIn_tmp_table((true));
					} else {
							current_addr.setIn_tmp_table((true));
					} 
					break;
			case RFC5444_LINKSTATUS_HEARD/* Fall-through */:
			case RFC5444_LINKSTATUS_SYMMETRIC:
					current_addr.add_temp_metric_value();
					current_addr.setIn_tmp_table((true));
					break;
			default:
					/* Wrong value, drop message */current_addr.nhdp_decrement_addr_usage();
					return RFC5444_DROP_MESSAGE;
			}
		}  else if (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_OTHER_NEIGHB].getRfc5444_reader_tlvblock_consumer_entry()) {
			switch (ModernizedCProgram._nhdp_addr_tlvs[RFC5444_ADDRTLV_OTHER_NEIGHB].getRfc5444_reader_tlvblock_consumer_entry().getSingle_value()) {
			case RFC5444_OTHERNEIGHB_LOST:
					current_addr.setIn_tmp_table((true));
					break;
			case RFC5444_OTHERNEIGHB_SYMMETRIC:
					current_addr.add_temp_metric_value();
					current_addr.setIn_tmp_table((true));
					break;
			default:
					/* Wrong value, drop message */current_addr.nhdp_decrement_addr_usage();
					return RFC5444_DROP_MESSAGE;
			}
		} else {
				/* Addresses without expected TLV are ignored */current_addr.nhdp_decrement_addr_usage();
				return RFC5444_DROP_ADDRESS;
		} 
		return RFC5444_OKAY/**
		 * Handle message TLVs of received HELLO
		 * Called by oonf_api to allow message TLV parsing
		 */;
	}
	public static rfc5444_result _nhdp_blocktlv_msg_cb(Object cont) {
		if (ModernizedCProgram.check_msg_validity(cont) != /* Check whether specified message TLVs are correctly included */RFC5444_OKAY) {
			return RFC5444_DROP_MESSAGE;
		} 
		ModernizedCProgram.val_time = /*Error: Function owner not recognized*/rfc5444_timetlv_decode(ModernizedCProgram._nhdp_msg_tlvs[RFC5444_MSGTLV_VALIDITY_TIME].getRfc5444_reader_tlvblock_consumer_entry().getSingle_value());
		if (ModernizedCProgram._nhdp_msg_tlvs[RFC5444_MSGTLV_INTERVAL_TIME].getRfc5444_reader_tlvblock_consumer_entry()) {
			ModernizedCProgram.int_time = /*Error: Function owner not recognized*/rfc5444_timetlv_decode(ModernizedCProgram._nhdp_msg_tlvs[RFC5444_MSGTLV_INTERVAL_TIME].getRfc5444_reader_tlvblock_consumer_entry().getSingle_value());
		} 
		return RFC5444_OKAY/**
		 * Process received addresses and clean up temporary stuff
		 * Called by oonf_api after message was parsed
		 */;
	}
	public static rfc5444_result _nhdp_msg_end_cb(Object cont, Object dropped) {
		if (!dropped) {
			ModernizedCProgram.process_temp_tables();
		} 
		ModernizedCProgram.val_time = /* Clean all temporary stuff */-1024;
		ModernizedCProgram.int_time = -1024;
		ModernizedCProgram.sym = 0;
		ModernizedCProgram.lost = 0;
		ModernizedCProgram.nhdp_reset_addresses_tmp_usg(1);
		if (dropped) {
			return RFC5444_DROP_MESSAGE;
		} 
		return RFC5444_OKAY/**
		 * Check validity of HELLO message header and message TLVs
		 */;
	}
	public static rfc5444_result check_msg_validity(Object cont) {
		if (cont.getHas_hoplimit() && cont.getHoplimit() != 1) {
			return /* Hop Limit other than 1 */RFC5444_DROP_MESSAGE;
		} 
		if (cont.getHas_hopcount() && cont.getHopcount() != 0) {
			return /* Hop Count other than zero */RFC5444_DROP_MESSAGE;
		} 
		if (!(ModernizedCProgram._nhdp_msg_tlvs[RFC5444_MSGTLV_VALIDITY_TIME].getRfc5444_reader_tlvblock_consumer_entry())) {
			return /* No validity time tlv */RFC5444_DROP_MESSAGE;
		}  else if (ModernizedCProgram._nhdp_msg_tlvs[RFC5444_MSGTLV_VALIDITY_TIME].getRfc5444_reader_tlvblock_consumer_entry().getNext_entry()) {
			return /* Multiple validity time tlvs */RFC5444_DROP_MESSAGE;
		} 
		if (ModernizedCProgram._nhdp_msg_tlvs[RFC5444_MSGTLV_INTERVAL_TIME].getRfc5444_reader_tlvblock_consumer_entry() && ModernizedCProgram._nhdp_msg_tlvs[RFC5444_MSGTLV_INTERVAL_TIME].getRfc5444_reader_tlvblock_consumer_entry().getNext_entry()) {
			return /* Multiple interval time tlvs */RFC5444_DROP_MESSAGE;
		} 
		return RFC5444_OKAY/**
		 * Check validity of address block TLVs
		 */;
	}
	/**
	 * Process address lists from the HELLO msg in the information bases
	 */
	public static void process_temp_tables() {
		nib_entry_t nib_elt = new nib_entry_t();
		timex_t now = new timex_t();
		now.xtimer_now_timex();
		now.iib_update_lt_status();
		nib_entry nib_entry = new nib_entry();
		nib_elt = nib_entry.nib_process_hello();
		iib_link_set_entry iib_link_set_entry = new iib_link_set_entry();
		if (nib_elt) {
			ModernizedCProgram.originator_link_tuple = iib_link_set_entry.iib_process_hello(ModernizedCProgram.if_pid, nib_elt, ModernizedCProgram.val_time, ModernizedCProgram.sym, ModernizedCProgram.lost);
			if (ModernizedCProgram.originator_link_tuple) {
				ModernizedCProgram.originator_link_tuple.iib_process_metric_msg(ModernizedCProgram.int_time != 0 ? ModernizedCProgram.int_time : ModernizedCProgram.val_time);
			} 
		} 
	}
	public static Object malloc(Object size) {
		if (size != 0) {
			Object ptr = /*Error: Function owner not recognized*/sbrk(size);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("malloc(): allocating block of size %u at %p.\n", (int)size, ptr);
			if (ptr != (Object)-1) {
				return ptr;
			} 
		} 
		return ((Object)0);
	}
	public static Object realloc(Object ptr, Object size) {
		if (ptr == ((Object)0)) {
			return ModernizedCProgram.malloc(size);
		}  else if (size == 0) {
			ModernizedCProgram.free(ptr);
			return ((Object)0);
		} else {
				Object newptr = ModernizedCProgram.malloc(size);
				if (newptr) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(newptr, ptr, size);
				} 
				return newptr;
		} 
	}
	public static Object calloc(Object size, Object cnt) {
		Object mem = ModernizedCProgram.malloc(size * cnt);
		if (mem) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(mem, 0, size * cnt);
		} 
		return mem;
	}
	public static void free(Object ptr) {
		(Object)/* who cares about pointers? */ptr;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("free(): block at %p lost.\n", ptr);
	}
	/*
	 * Copyright (C) 2017 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup net_gnrc_ipv6_nib
	 * @{
	 *
	 * @file
	 * @brief   Definitions related to 6Lo node (6LN) functionality of the NIB
	 * @see     @ref GNRC_IPV6_NIB_CONF_6LN
	 *
	 * @author  Martine Lenders <m.lenders@fu-berlin.de>
	 */
	public static Object _now_min() {
		return (uint32_t)((ModernizedCProgram.xtimer_now_usec64() / ((true) * (true))) & -1024/**
		 * @brief   Additional (local) status to ARO status values for tentative
		 *          addresses
		 */);
	}
	/**
	 * @brief   Additional (local) status to ARO status values for return values
	 *          to signify that the address was ignored
	 */
	/**
	 * @brief   Additional (local) status to ARO status values to signify that ARO
	 *          is not available in NA
	 *
	 * Can be assigned to the variable that receives the return value of
	 * @ref _handle_aro(), so that the case that an NA does not contain an ARO
	 * (e.g. because upstream router does not support it) can be dealt with.
	 */
	/**
	 * @brief   Resolves address statically from destination address using reverse
	 *          translation of the IID
	 *
	 * @param[in] dst   A destination address.
	 * @param[in] netif The interface to @p dst.
	 * @param[out] nce  Neighbor cache entry to resolve into
	 *
	 * @return  true when @p nce was set, false when not.
	 */
	/**
	 * @brief   Calculates exponential backoff for RS retransmissions
	 *
	 * @see [RFC 6775, section 5.3](https://tools.ietf.org/html/rfc6775#section-5.3)
	 *
	 * @param[in] netif The network interface that the RS will be sent over.
	 *
	 * @return  The interval in ms to the next RS
	 */
	/**
	 * @brief   Handles ARO
	 *
	 * @param[in] netif     The interface the ARO-carrying message came over.
	 * @param[in] ipv6      The IPv6 header of the message carrying the ARO.
	 * @param[in] icmpv6    The message carrying the ARO.
	 * @param[in] aro       ARO that carries the address registration information.
	 * @param[in] sl2ao     SL2AO associated with the ARO.
	 * @param[in] nce       Neighbor cache entry the ARO is supposed to change.
	 *
	 * @return  registration status of the address (including
	 *          @ref _ADDR_REG_STATUS_TENTATIVE and @ref _ADDR_REG_STATUS_IGNORE).
	 */
	/**
	 * @brief   Handler for @ref GNRC_IPV6_NIB_REREG_ADDRESS event handler
	 *
	 * @param[in] addr  An IPv6 address.
	 */
	/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C || defined(DOXYGEN) */
	/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C || defined(DOXYGEN) */
	/* GNRC_IPV6_NIB_CONF_6LN || defined(DOXYGEN) */
	/* _handle_aro() doesn't make sense without 6LR so don't even use it
	 * => throw error in case it is compiled in => don't define it here as NOP macro
	 */
	/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C || defined(DOXYGEN) */
	/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C || defined(DOXYGEN) */
	/* GNRC_IPV6_NIB_CONF_6LN || defined(DOXYGEN) */
	/* PRIV_NIB_6LN_H */
	/** @} */
	/* $OpenBSD: fixdfdi.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Convert double to (signed) quad.
	 * We clamp anything that is out of range.
	 */
	public static Object __fixdfdi(double x) {
		if (x < 0) {
			if (x <= ((--1024 - 1))) {
				return ((--1024 - 1));
			} else {
					return (quad_t)-(u_quad_t)-x;
			} 
		} else {
				if (x >= (true)) {
					return (true);
				} else {
						return (quad_t)(u_quad_t)x;
				} 
		} 
	}
	/*
	 * Copyright (C) 2013 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup pthread
	 * @{
	 * @file
	 * @brief   Thread creation attributes.
	 * @author  Christian Mehlis <mehlis@inf.fu-berlin.de>
	 * @author  René Kijewski <kijewski@inf.fu-berlin.de>
	 * @}
	 */
	public static int pthread_attr_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(attr, 0, /*Error: sizeof expression not supported yet*/);
		return 0;
	}
	public static int pthread_attr_destroy() {
		(Object)attr;
		return 0;
	}
	public static int pthread_attr_getdetachstate(Object attr, Integer detachstate) {
		detachstate = attr.getDetached() ? (true) : (false);
		return 0;
	}
	public static int pthread_attr_setdetachstate(int detachstate) {
		switch (detachstate) {
		case (true):
				this.setDetached(1);
				return 0;
		case (false):
				this.setDetached(0);
				return 0;
		default:
				return -1;
		}
	}
	public static int pthread_attr_getguardsize(Object attr, Object guardsize) {
		// TODO// TODO(Object)attr;
		(Object)guardsize;
		return -1;
	}
	public static int pthread_attr_setguardsize(Object guardsize) {
		// TODO// TODO(Object)attr;
		(Object)guardsize;
		return -1;
	}
	public static int pthread_attr_setschedparam(Object param) {
		// TODO// TODO(Object)attr;
		(Object)param;
		return -1;
	}
	public static int pthread_attr_getschedpolicy(Object attr, Integer policy) {
		// TODO// TODO(Object)attr;
		(Object)policy;
		return -1;
	}
	public static int pthread_attr_setschedpolicy(int policy) {
		// TODO// TODO(Object)attr;
		(Object)policy;
		return -1;
	}
	public static int pthread_attr_getinheritsched(Object attr, Integer inherit) {
		// TODO// TODO(Object)attr;
		(Object)inherit;
		return -1;
	}
	public static int pthread_attr_setinheritsched(int inherit) {
		// TODO// TODO(Object)attr;
		(Object)inherit;
		return -1;
	}
	public static int pthread_attr_getscope(Object attr, Integer scope) {
		// TODO// TODO(Object)attr;
		(Object)scope;
		return -1;
	}
	public static int pthread_attr_setscope(int scope) {
		// TODO// TODO(Object)attr;
		(Object)scope;
		return -1;
	}
	public static int pthread_attr_getstackaddr(Object attr, Object stackaddr) {
		stackaddr = attr.getSs_sp();
		return 0;
	}
	public static int pthread_attr_setstackaddr(Object stackaddr) {
		this.setSs_sp((byte)stackaddr);
		return 0;
	}
	public static int pthread_attr_getstacksize(Object attr, Object stacksize) {
		stacksize = attr.getSs_size();
		if (stacksize == 0/* FIXME: the standard says that this function should return the default value if no explicit value was set. */) {
		} 
		return 0;
	}
	public static int pthread_attr_setstacksize(Object stacksize) {
		this.setSs_size(stacksize);
		return 0;
	}
	/* $OpenBSD: floatunsdidf.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Convert (unsigned) quad to double.
	 * This is exactly like floatdidf.c except that negatives never occur.
	 */
	public static double __floatunsdidf(Object x) {
		double d;
		Object u;
		u.setUq(x);
		Object generatedUl = u.getUl();
		d = (double)generatedUl[(true)] * (((int)1 << ((/*Error: Unsupported expression*/ * 8) - 2)) * 4.0);
		d += generatedUl[(false)];
		return d;
	}
	public static void timex_normalize() {
		Object generatedSeconds = this.getSeconds();
		Object generatedMicroseconds = this.getMicroseconds();
		generatedSeconds += (generatedMicroseconds / (true));
		generatedMicroseconds %= (true/**
		 * @brief Tests a timex timestamp for normalization
		 *
		 * @param[in] time  Pointer to the timestamp to check
		 *
		 * @return true for a normalized timex_t
		 * @return false otherwise
		 */);
	}
	public static int timex_isnormalized(Object time) {
		return (time.getMicroseconds() < (true/**
		 * @brief Converts a timex timestamp to a 64 bit value
		 *
		 * @param[in] a The timestamp to convert
		 *
		 * @return timex representation as uint64_t
		 */));
	}
	public static Object timex_uint64(Object a) {
		return (uint64_t)a.getSeconds() * (true) + a.getMicroseconds();
	}
	public static  timex_from_uint64(Object timestamp) {
		return ModernizedCProgram.timex_set(timestamp / (true), timestamp % (true/**
		 * @brief Converts a timex timestamp to a string
		 *
		 * @pre memory at timestamp >= TIMEX_MAX_STR_LEN
		 *
		 * @param[in]  t            The timestamp to convert
		 * @param[out] timestamp    The output char buffer for the converted timestamp
		 *
		 * @note The timestamp will be normalized
		 *
		 * @return A pointer to the string representation of the timestamp
		 */));
	}
	/*
	 * Copyright (C) 2014  René Kijewski  <rene.kijewski@fu-berlin.de>
	 *
	 * This library is free software; you can redistribute it and/or
	 * modify it under the terms of the GNU Lesser General Public
	 * License as published by the Free Software Foundation; either
	 * version 2.1 of the License, or (at your option) any later version.
	 *
	 * This library is distributed in the hope that it will be useful,
	 * but WITHOUT ANY WARRANTY; without even the implied warranty of
	 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
	 * Lesser General Public License for more details.
	 *
	 * You should have received a copy of the GNU Lesser General Public
	 * License along with this library; if not, write to the Free Software
	 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
	 */
	/**
	 * @ingroup     pthread
	 * @{
	 *
	 * @file
	 * @brief       Implementation of a fair, POSIX conforming reader/writer lock.
	 *
	 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
	 *
	 * @}
	 */
	public static int pthread_rwlock_init(Object attr) {
		(Object)attr;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(rwlock, 0, /*Error: sizeof expression not supported yet*/);
		return 0;
	}
	public static int pthread_rwlock_destroy() {
		Object generatedMutex = this.getMutex();
		Object generatedReaders = this.getReaders();
		if ((/*Error: Function owner not recognized*/mutex_trylock(generatedMutex) == 0) || (generatedReaders != /* do not unlock the mutex, no need */0)) {
			return 16;
		} 
		return 0;
	}
	public static boolean __pthread_rwlock_blocked_readingly(Object rwlock) {
		if (rwlock.getReaders() < 0) {
			return /* a writer holds the lock */1;
		} 
		if (rwlock.getQueue().getFirst() == ((Object)/* Determine if there is a writer waiting to get this lock who has a higher or the same priority: */0)) {
			return /* no waiting thread */0;
		} 
		 qnode = rwlock.getQueue().getFirst();
		if (qnode.getPriority() > sched_active_thread.getPriority()) {
			return /* the waiting thread has a lower priority */0;
		} 
		__pthread_rwlock_waiter_node_t waiting_node = (__pthread_rwlock_waiter_node_t)qnode.getData();
		Object generatedIs_writer = waiting_node.getIs_writer();
		return generatedIs_writer;
	}
	public static boolean __pthread_rwlock_blocked_writingly(Object rwlock) {
		return rwlock.getReaders() != /* if any thread holds the lock, then no writer may enter the critical section */0;
	}
	public static int pthread_rwlock_lock(Object is_blocked, boolean is_writer, int incr_when_held, boolean allow_spurious) {
		Object generatedMutex = this.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(generatedMutex);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedMutex);
		return 0;
	}
	public static int pthread_rwlock_trylock(Object is_blocked, int incr_when_held) {
		Object generatedReaders = this.getReaders();
		generatedReaders += incr_when_held;
		Object generatedMutex = this.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedMutex);
		return 0;
	}
	public static int pthread_rwlock_timedlock(Object is_blocked, boolean is_writer, int incr_when_held, Object abstime) {
		uint64_t now = ModernizedCProgram.xtimer_now_usec64();
		uint64_t then = ((uint64_t)abstime.getTv_sec() * (true)) + (abstime.getTv_nsec() / (true));
		if (now >= then) {
			return ETIMEDOUT;
		} else {
				xtimer_t timer = new xtimer_t();
				ModernizedCProgram.xtimer_set_wakeup64(timer, (then - now), sched_active_pid);
				int result = rwlock.pthread_rwlock_lock(is_blocked, is_writer, incr_when_held, 1);
				if (result != ETIMEDOUT) {
					timer.xtimer_remove();
				} 
				return result;
		} 
	}
	public static int pthread_rwlock_rdlock() {
		return rwlock.pthread_rwlock_lock(ModernizedCProgram.__pthread_rwlock_blocked_readingly, 0, +1, 0);
	}
	public static int pthread_rwlock_wrlock() {
		return rwlock.pthread_rwlock_lock(ModernizedCProgram.__pthread_rwlock_blocked_writingly, 1, -1, 0);
	}
	public static int pthread_rwlock_tryrdlock() {
		return rwlock.pthread_rwlock_trylock(ModernizedCProgram.__pthread_rwlock_blocked_readingly, +1);
	}
	public static int pthread_rwlock_trywrlock() {
		return rwlock.pthread_rwlock_trylock(ModernizedCProgram.__pthread_rwlock_blocked_writingly, -1);
	}
	public static int pthread_rwlock_timedrdlock(Object abstime) {
		return rwlock.pthread_rwlock_timedlock(ModernizedCProgram.__pthread_rwlock_blocked_readingly, 0, +1, abstime);
	}
	public static int pthread_rwlock_timedwrlock(Object abstime) {
		return rwlock.pthread_rwlock_timedlock(ModernizedCProgram.__pthread_rwlock_blocked_writingly, 1, -1, abstime);
	}
	public static int pthread_rwlock_unlock() {
		Object generatedMutex = this.getMutex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(generatedMutex);
		Object generatedReaders = this.getReaders();
		Object generatedQueue = this.getQueue();
		 qnode = /*Error: Function owner not recognized*/priority_queue_remove_head(generatedQueue);
		__pthread_rwlock_waiter_node_t waiting_node = (__pthread_rwlock_waiter_node_t)qnode.getData();
		waiting_node.setContinue_(1);
		uint16_t prio = qnode.getPriority();
		Object generatedThread = waiting_node.getThread();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_set_status(generatedThread, STATUS_PENDING);
		Object generatedIs_writer = waiting_node.getIs_writer();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(generatedMutex);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_switch(/* yield if a woken up thread had a higher priority */prio);
		return 0;
	}
	/* utility functions */
	public static Object _is_number(Byte str) {
		for (; str; str++) {
			if (str < (byte)'0' || str > (byte)'9') {
				return false;
			} 
		}
		return true;
	}
	public static Object _is_iface(Object iface) {
		return (/*Error: Function owner not recognized*/gnrc_netif_get_by_pid(iface) != ((Object)0));
	}
	/* MODULE_NETSTATS */
	public static void _set_usage(Byte cmd_name) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s <if_id> set <key> <value>\n", cmd_name);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("      Sets an hardware specific specific value\n      <key> may be one of the following\n       * \"addr\" - sets (short) address\n       * \"addr_long\" - sets long address\n       * \"addr_short\" - alias for \"addr\"\n       * \"cca_threshold\" - set ED threshold during CCA in dBm\n       * \"freq\" - sets the \"channel\" center frequency\n       * \"channel\" - sets the frequency channel\n       * \"chan\" - alias for \"channel\"\n       * \"checksum\" - set checksumming on-off\n       * \"csma_retries\" - set max. number of channel access attempts\n       * \"encrypt\" - set the encryption on-off\n       * \"hop_limit\" - set hop limit\n       * \"hl\" - alias for \"hop_limit\"\n       * \"key\" - set the encryption key in hexadecimal format\n       * \"mtu\" - IPv6 maximum transition unit\n       * \"nid\" - sets the network identifier (or the PAN ID)\n       * \"page\" - set the channel page (IEEE 802.15.4)\n       * \"pan\" - alias for \"nid\"\n       * \"pan_id\" - alias for \"nid\"\n       * \"phy_busy\" - set busy mode on-off\n       * \"power\" - TX power in dBm\n       * \"retrans\" - max. number of retransmissions\n       * \"src_len\" - sets the source address length in byte\n       * \"state\" - set the device state\n");
	}
	public static void _flag_usage(Byte cmd_name) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s <if_id> [-]{", cmd_name);
		for (int i = 0;
		 i < /*Error: Function owner not recognized*/ARRAY_SIZE(flag_cmds); i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s", flag_cmds[i].getName());
			if (i < (/*Error: Function owner not recognized*/ARRAY_SIZE(flag_cmds) - 1)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("|");
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("}");
	}
	public static void _add_usage(Byte cmd_name) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s <if_id> add [anycast|multicast|unicast] <ipv6_addr>[/prefix_len]\n", cmd_name);
	}
	public static void _del_usage(Byte cmd_name) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s <if_id> del <ipv6_addr>\n", cmd_name);
	}
	public static void _print_netopt(Object opt) {
		switch (opt) {
		case NETOPT_SRC_LEN:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("source address length");
				break;
		case NETOPT_ENCRYPTION:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("encryption");
				break;
		case NETOPT_ADDRESS:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("(short) address");
				break;
		case NETOPT_NID:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("network identifier");
				break;
		case NETOPT_PHY_BUSY:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("PHY busy");
				break;
		case NETOPT_ADDRESS_LONG:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("long address");
				break;
		case NETOPT_CHANNEL_PAGE:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("page");
				break;
		case NETOPT_MAX_PDU_SIZE:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("MTU");
				break;
		case NETOPT_CHANNEL:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("channel");
				break;
		case NETOPT_CHANNEL_FREQUENCY:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("frequency [in Hz]");
				break;
		case NETOPT_TX_POWER:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("TX power [in dBm]");
				break;
		case NETOPT_CHECKSUM:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("checksum");
				break;
		case NETOPT_CSMA_RETRIES:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("CSMA retries");
				break;
		case NETOPT_RETRANS:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("max. retransmissions");
				break;
		case NETOPT_ENCRYPTION_KEY:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("encryption key");
				break;
		case NETOPT_HOP_LIMIT:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("hop limit");
				break;
		case NETOPT_CCA_THRESHOLD:
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("CCA threshold [in dBm]");
				break;
		default:
				break;
		}
	}
	/* for some lines threshold might just be 0, so we can't use _LINE_THRESHOLD
	 * here */
	public static int _newline(int threshold, int line_thresh) {
		if (line_thresh > threshold) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\n          ");
			line_thresh = -1024;
		} 
		return line_thresh;
	}
	public static int _netif_list_flag(Object iface, Object opt, Byte str, int line_thresh) {
		 enable = NETOPT_DISABLE;
		int res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, opt, 0, enable, /*Error: sizeof expression not supported yet*/);
		if ((res >= 0) && (enable == NETOPT_ENABLE)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s", str);
			line_thresh = ModernizedCProgram._newline((true), ++line_thresh);
		} 
		return line_thresh;
	}
	public static void _netif_list(Object iface) {
		[] hwaddr = new ();
		 u32 = new ();
		 u16 = new ();
		 i16 = new ();
		 u8 = new ();
		int res;
		 state = new ();
		int line_thresh = 1;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Iface %2d ", iface);
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_ADDRESS, 0, hwaddr, /*Error: sizeof expression not supported yet*/);
		if (res >= 0) {
			byte[] hwaddr_str = new byte[res * 3];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" HWaddr: %s ", /*Error: Function owner not recognized*/gnrc_netif_addr_to_str(hwaddr, res, hwaddr_str));
		} 
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_CHANNEL, 0, u16, /*Error: sizeof expression not supported yet*/);
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_CHANNEL_FREQUENCY, 0, u32, /*Error: sizeof expression not supported yet*/);
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_CHANNEL_PAGE, 0, u16, /*Error: sizeof expression not supported yet*/);
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_NID, 0, u16, /*Error: sizeof expression not supported yet*/);
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_LINK_CONNECTED, 0, u8, /*Error: sizeof expression not supported yet*/);
		if (res >= 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" Link: %s ", ()u8 ? "up" : "down");
		} 
		line_thresh = ModernizedCProgram._newline(-1024, line_thresh);
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_ADDRESS_LONG, 0, hwaddr, /*Error: sizeof expression not supported yet*/);
		if (res >= 0) {
			byte[] hwaddr_str = new byte[res * 3];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Long HWaddr: ");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s ", /*Error: Function owner not recognized*/gnrc_netif_addr_to_str(hwaddr, res, hwaddr_str));
			line_thresh++;
		} 
		line_thresh = ModernizedCProgram._newline(-1024, line_thresh);
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_TX_POWER, 0, i16, /*Error: sizeof expression not supported yet*/);
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_STATE, 0, state, /*Error: sizeof expression not supported yet*/);
		if (res >= 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" State: %s ", ModernizedCProgram._netopt_state_str[state]);
			line_thresh++;
		} 
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_RETRANS, 0, u8, /*Error: sizeof expression not supported yet*/);
		if (res >= 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" max. Retrans.: %u ", (int)u8);
			line_thresh++;
		} 
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_CSMA_RETRIES, 0, u8, /*Error: sizeof expression not supported yet*/);
		if (res >= 0) {
			 enable = NETOPT_DISABLE;
			res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_CSMA, 0, enable, /*Error: sizeof expression not supported yet*/);
			if ((res >= 0) && (enable == NETOPT_ENABLE)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf(" CSMA Retries: %u ", (int)u8);
			} 
			line_thresh++;
		} 
		line_thresh = ModernizedCProgram._newline(-1024, line_thresh);
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_PROMISCUOUSMODE, "PROMISC  ", line_thresh);
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_AUTOACK, "AUTOACK  ", line_thresh);
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_ACK_REQ, "ACK_REQ  ", line_thresh);
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_PRELOADING, "PRELOAD  ", line_thresh);
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_RAWMODE, "RAWMODE  ", line_thresh);
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_MAC_NO_SLEEP, "MAC_NO_SLEEP  ", line_thresh);
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_CSMA, "CSMA  ", line_thresh);
		line_thresh += (true) + /* enforce linebreak after this option */1;
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_AUTOCCA, "AUTOCCA", line_thresh);
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_IQ_INVERT, "IQ_INVERT", line_thresh);
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_SINGLE_RECEIVE, "RX_SINGLE", line_thresh);
		line_thresh = ModernizedCProgram._netif_list_flag(iface, NETOPT_CHANNEL_HOP, "CHAN_HOP", line_thresh);
		res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_MAX_PDU_SIZE, 0, u16, /*Error: sizeof expression not supported yet*/);
		/* enforce linebreak after this option *//* enforce linebreak after this option */res = /*Error: Function owner not recognized*/gnrc_netapi_get(iface, NETOPT_SRC_LEN, 0, u16, /*Error: sizeof expression not supported yet*/);
		line_thresh = ModernizedCProgram._newline(-1024, line_thresh)/* assume it to succeed (otherwise array will stay 0) *//* yes, the res of NETOPT_IPV6_ADDR is meant to be here ;-) */;/* assume it to succeed (otherwise array will stay 0) *//* yes, the res of NETOPT_IPV6_ADDR is meant to be here ;-) */
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
	}
	public static int _netif_set_u32(Object iface, Object opt, Object context, Byte u32_str) {
		long res;
		 hex = false;
		if (ModernizedCProgram._is_number(u32_str)) {
			if ((res = /*Error: Function owner not recognized*/strtoul(u32_str, ((Object)0), 10)) == ULONG_MAX) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to parse value.\nMust be a 32-bit unsigned integer (dec or hex)\n");
				return 1;
			} 
		} else {
				if ((res = /*Error: Function owner not recognized*/strtoul(u32_str, ((Object)0), 32)) == ULONG_MAX) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to parse value.\nMust be a 32-bit unsigned integer (dec or hex)\n");
					return 1;
				} 
				hex = true;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(res <= ULONG_MAX);
		if (/*Error: Function owner not recognized*/gnrc_netapi_set(iface, opt, context, ()res, /*Error: Unsupported expression*/) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: unable to set ");
			ModernizedCProgram._print_netopt(opt);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: set ");
		ModernizedCProgram._print_netopt(opt);
		if (hex) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("0x%04lx\n", res);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%lu\n", res);
		} 
		return 0;
	}
	/* MODULE_GNRC_NETIF_CMD_LORA */
	public static int _netif_set_u16(Object iface, Object opt, Object context, Byte u16_str) {
		long res;
		 hex = false;
		if (ModernizedCProgram._is_number(u16_str)) {
			if ((res = /*Error: Function owner not recognized*/strtoul(u16_str, ((Object)0), 10)) == ULONG_MAX) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to parse value.\nMust be a 16-bit unsigned integer (dec or hex)\n");
				return 1;
			} 
		} else {
				if ((res = /*Error: Function owner not recognized*/strtoul(u16_str, ((Object)0), 16)) == ULONG_MAX) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to parse value.\nMust be a 16-bit unsigned integer (dec or hex)\n");
					return 1;
				} 
				hex = true;
		} 
		if (res > -1024) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to parse value.\nMust be a 16-bit unsigned integer (dec or hex)\n");
			return 1;
		} 
		if (/*Error: Function owner not recognized*/gnrc_netapi_set(iface, opt, context, ()res, /*Error: Unsupported expression*/) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: unable to set ");
			ModernizedCProgram._print_netopt(opt);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: set ");
		ModernizedCProgram._print_netopt(opt);
		if (hex) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("0x%04lx\n", res);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%lu\n", res);
		} 
		return 0;
	}
	public static int _netif_set_i16(Object iface, Object opt, Byte i16_str) {
		 val = /*Error: Function owner not recognized*/atoi(i16_str);
		if (/*Error: Function owner not recognized*/gnrc_netapi_set(iface, opt, 0, ()val, /*Error: Unsupported expression*/) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: unable to set ");
			ModernizedCProgram._print_netopt(opt);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: set ");
		ModernizedCProgram._print_netopt(opt);
		return 0;
	}
	public static int _netif_set_u8(Object iface, Object opt, Object context, Byte u8_str) {
		 val = /*Error: Function owner not recognized*/atoi(u8_str);
		if (/*Error: Function owner not recognized*/gnrc_netapi_set(iface, opt, context, ()val, /*Error: Unsupported expression*/) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: unable to set ");
			ModernizedCProgram._print_netopt(opt);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: set ");
		ModernizedCProgram._print_netopt(opt);
		return 0;
	}
	public static int _netif_set_flag(Object iface, Object opt, Object set) {
		if (/*Error: Function owner not recognized*/gnrc_netapi_set(iface, opt, 0, set, /*Error: Unsupported expression*/) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to set option");
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: %sset option\n", (set) ? "" : "un");
		return 0;
	}
	public static int _netif_set_addr(Object iface, Object opt, Byte addr_str) {
		[] addr = new ();
		size_t addr_len = /*Error: Function owner not recognized*/gnrc_netif_addr_from_str(addr_str, addr);
		if (addr_len == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to parse address.\nMust be of format [0-9a-fA-F]{2}(:[0-9a-fA-F]{2})*\n(hex pairs delimited by colons)");
			return 1;
		} 
		if (/*Error: Function owner not recognized*/gnrc_netapi_set(iface, opt, 0, addr, addr_len) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: unable to set ");
			ModernizedCProgram._print_netopt(opt);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
			return 1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("success: set ");
		ModernizedCProgram._print_netopt(opt);
		return 0;
	}
	public static int _netif_set_state(Object iface, Byte state_str) {
		 state = new ();
		if ((/*Error: Function owner not recognized*/strcmp("off", state_str) == 0) || (/*Error: Function owner not recognized*/strcmp("OFF", state_str) == 0)) {
			state = NETOPT_STATE_OFF;
		}  else if ((/*Error: Function owner not recognized*/strcmp("sleep", state_str) == 0) || (/*Error: Function owner not recognized*/strcmp("SLEEP", state_str) == 0)) {
			state = NETOPT_STATE_SLEEP;
		}  else if ((/*Error: Function owner not recognized*/strcmp("idle", state_str) == 0) || (/*Error: Function owner not recognized*/strcmp("IDLE", state_str) == 0)) {
			state = NETOPT_STATE_IDLE;
		}  else if ((/*Error: Function owner not recognized*/strcmp("rx", state_str) == 0) || (/*Error: Function owner not recognized*/strcmp("RX", state_str) == 0)) {
			state = NETOPT_STATE_RX;
		}  else if ((/*Error: Function owner not recognized*/strcmp("tx", state_str) == 0) || (/*Error: Function owner not recognized*/strcmp("TX", state_str) == 0)) {
			state = NETOPT_STATE_TX;
		}  else if ((/*Error: Function owner not recognized*/strcmp("reset", state_str) == 0) || (/*Error: Function owner not recognized*/strcmp("RESET", state_str) == 0)) {
			state = NETOPT_STATE_RESET;
		}  else if ((/*Error: Function owner not recognized*/strcmp("standby", state_str) == 0) || (/*Error: Function owner not recognized*/strcmp("STANDBY", state_str) == 0)) {
			state = NETOPT_STATE_STANDBY;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("usage: ifconfig <if_id> set state [off|sleep|idle|rx|tx|reset|standby]");
				return 1;
		} 
		if (/*Error: Function owner not recognized*/gnrc_netapi_set(iface, NETOPT_STATE, 0, state, /*Error: Unsupported expression*/) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: unable to set state to %s\n", ModernizedCProgram._netopt_state_str[state]);
			return 1;
		} 
		return 0;
	}
	public static int _hex_to_int(byte c) {
		if ((byte)'0' <= c && c <= (byte)'9') {
			return c - (byte)'0';
		}  else if ((byte)'a' <= c && c <= (byte)'f') {
			return c - (byte)'a';
		}  else if ((byte)'A' <= c && c <= (byte)'F') {
			return c - (byte)'A';
		} else {
				return -1;
		} 
	}
	public static int _netif_set_encrypt_key(Object iface, Object opt, byte[] key_str) {
		size_t str_len = /*Error: Function owner not recognized*/strlen(key_str);
		size_t key_len = str_len / 2;
		[] key = new ();
		if (str_len == -1024) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\nNotice: setting 56 bit key.");
		}  else if (str_len == -1024) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\nNotice: setting 64 bit key.");
		}  else if (str_len == -1024) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\nNotice: setting 128 bit key.");
		}  else if (str_len == -1024) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\nNotice: setting 192 bit key.");
		}  else if (str_len == -1024) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\nNotice: setting 256 bit key.");
		}  else if (str_len == -1024) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\nNotice: setting 512 bit key.");
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: invalid key size.\n");
				return 1;
		} 
		for (size_t i = 0;
		 i < str_len; i += /* Convert any char from ASCII table in hex format */2) {
			int i1 = ModernizedCProgram._hex_to_int(key_str[i]);
			int i2 = ModernizedCProgram._hex_to_int(key_str[i + 1]);
			if (i1 == -1 || i2 == -1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to parse key");
				return 1;
			} 
			key[i / 2] = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((i1 << 4) + i2);
		}
		if (/*Error: Function owner not recognized*/gnrc_netapi_set(iface, opt, 0, key, key_len) < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to set encryption key");
			return 1;
		} 
		for (size_t i = 0;
		 i < key_len; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%02x", key[/* print the hex value of the key */i]);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("");
		return 0;
	}
	public static int _netif_set(Byte cmd_name, Object iface, Byte key, Byte value) {
		if ((/*Error: Function owner not recognized*/strcmp("addr", key) == 0) || (/*Error: Function owner not recognized*/strcmp("addr_short", key) == 0)) {
			return ModernizedCProgram._netif_set_addr(iface, NETOPT_ADDRESS, value);
		}  else if (/*Error: Function owner not recognized*/strcmp("addr_long", key) == 0) {
			return ModernizedCProgram._netif_set_addr(iface, NETOPT_ADDRESS_LONG, value);
		}  else if (/*Error: Function owner not recognized*/strcmp("cca_threshold", key) == 0) {
			return ModernizedCProgram._netif_set_u8(iface, NETOPT_CCA_THRESHOLD, 0, value);
		}  else if ((/*Error: Function owner not recognized*/strcmp("frequency", key) == 0) || (/*Error: Function owner not recognized*/strcmp("freq", key) == 0)) {
			return ModernizedCProgram._netif_set_u32(iface, NETOPT_CHANNEL_FREQUENCY, 0, value);
		}  else if ((/*Error: Function owner not recognized*/strcmp("channel", key) == 0) || (/*Error: Function owner not recognized*/strcmp("chan", key) == 0)) {
			return ModernizedCProgram._netif_set_u16(iface, NETOPT_CHANNEL, 0, value);
		}  else if (/*Error: Function owner not recognized*/strcmp("csma_retries", key) == 0) {
			return ModernizedCProgram._netif_set_u8(iface, NETOPT_CSMA_RETRIES, 0, value);
		}  else if ((/*Error: Function owner not recognized*/strcmp("hl", key) == 0) || (/*Error: Function owner not recognized*/strcmp("hop_limit", key) == 0)) {
			return ModernizedCProgram._netif_set_u8(iface, NETOPT_HOP_LIMIT, 0, value);
		}  else if (/*Error: Function owner not recognized*/strcmp("key", key) == 0) {
			return ModernizedCProgram._netif_set_encrypt_key(iface, NETOPT_ENCRYPTION_KEY, value);
		}  else if ((/*Error: Function owner not recognized*/strcmp("nid", key) == 0) || (/*Error: Function owner not recognized*/strcmp("pan", key) == 0) || (/*Error: Function owner not recognized*/strcmp("pan_id", key) == 0)) {
			return ModernizedCProgram._netif_set_u16(iface, NETOPT_NID, 0, value);
		}  else if (/*Error: Function owner not recognized*/strcmp("page", key) == 0) {
			return ModernizedCProgram._netif_set_u16(iface, NETOPT_CHANNEL_PAGE, 0, value);
		}  else if (/*Error: Function owner not recognized*/strcmp("power", key) == 0) {
			return ModernizedCProgram._netif_set_i16(iface, NETOPT_TX_POWER, value);
		}  else if (/*Error: Function owner not recognized*/strcmp("retrans", key) == 0) {
			return ModernizedCProgram._netif_set_u8(iface, NETOPT_RETRANS, 0, value);
		}  else if (/*Error: Function owner not recognized*/strcmp("src_len", key) == 0) {
			return ModernizedCProgram._netif_set_u16(iface, NETOPT_SRC_LEN, 0, value);
		}  else if (/*Error: Function owner not recognized*/strcmp("state", key) == 0) {
			return ModernizedCProgram._netif_set_state(iface, value);
		} 
		ModernizedCProgram._set_usage(cmd_name);
		return 1;
	}
	public static int _netif_flag(Byte cmd, Object iface, byte[] flag) {
		 set = NETOPT_ENABLE;
		if (flag[0] == (byte)'-') {
			set = NETOPT_DISABLE;
			flag++;
		} 
		for (int i = 0;
		 i < /*Error: Function owner not recognized*/ARRAY_SIZE(flag_cmds); i++) {
			if (/*Error: Function owner not recognized*/strcmp(flag_cmds[i].getName(), flag) == 0) {
				return ModernizedCProgram._netif_set_flag(iface, flag_cmds[i].getOpt(), set);
			} 
		}
		ModernizedCProgram._flag_usage(cmd);
		return 1;
	}
	public static int _netif_add(Byte cmd_name, Object iface, int argc, Byte argv) {
		(Object)cmd_name;
		(Object)iface;
		(Object)argc;
		(Object)argv;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to add IPv6 address.");
		return 1;
	}
	/* type already set to unicast */
	public static int _netif_del(Object iface, Byte addr_str) {
		(Object)iface;
		(Object)addr_str;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("error: unable to delete IPv6 address.");
		return 1/* shell commands */;
	}
	/* parse interface */
	/* parse address */
	/* put packet together */
	/* and send it */
	public static int _gnrc_netif_config(int argc, byte[][] argv) {
		if (argc < 2) {
			 netif = ((Object)0);
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
	public static void uhcp_hdr_set( type) {
		this.setUhcp_magic(/*Error: Function owner not recognized*/htonl((true)));
		this.setVer_type(((false) << 4) | (type & -1024/**
		 * @brief UDP send function used by UHCP client / server
		 *
		 * Supposed to be implemented by UHCP clients.
		 *
		 * @param[in]   buf         buffer to send
		 * @param[in]   len         length of buf
		 * @param[in]   dst         ptr to IPv6 destination address
		 * @param[in]   dst_port    destination port
		 * @param[in]   dst_iface   interface number of destination interface
		 */));
	}
	/*
	 * Copyright (C) 2015 Martine Lenders <mlenders@inf.fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @{
	 *
	 * @file
	 */
	/* based on inet_pton4() by Paul Vixie */
	public static Object ipv4_addr_from_str(Object result, Object addr) {
		 saw_digit = new ();
		 octets = new ();
		 ch = new ();
		[] tmp = new ();
		 tp = new ();
		if ((result == ((Object)0)) || (addr == ((Object)0))) {
			return ((Object)0);
		} 
		saw_digit = 0;
		octets = 0;
		(tp = tmp) = 0;
		while ((ch = addr++) != (byte)'\0') {
			byte pch;
			if ((pch = /*Error: Function owner not recognized*/strchr("0123456789", ch)) != ((Object)0)) {
				 new = tp * 10 + /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(pch - "0123456789");
				if (new > 255) {
					return ((Object)0);
				} 
				tp = new;
				if (!saw_digit) {
					if (++octets > 4) {
						return ((Object)0);
					} 
					saw_digit = 1;
				} 
			}  else if (ch == (byte)'.' && saw_digit) {
				if (octets == 4) {
					return ((Object)0);
				} 
				++tp = 0;
				saw_digit = 0;
			} else {
					return ((Object)0);
			} 
		}
		if (octets < 4) {
			return ((Object)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(result, tmp, /*Error: Unsupported expression*/);
		return result/** @} */;
	}
	/**
	 * @file tinymt32.c
	 *
	 * @brief Tiny Mersenne Twister only 127 bit internal state
	 *
	 * @author Mutsuo Saito (Hiroshima University)
	 * @author Makoto Matsumoto (The University of Tokyo)
	 *
	 * Copyright (C) 2011 Mutsuo Saito, Makoto Matsumoto,
	 * Hiroshima University and The University of Tokyo.
	 * All rights reserved.
	 *
	 * The 3-clause BSD License is applied to this software, see
	 * LICENSE.txt
	 */
	/**
	 * This function represents a function used in the initialization
	 * by init_by_array
	 * @param x 32-bit integer
	 * @return 32-bit integer
	 */
	public static Object ini_func1(Object x) {
		return (x ^ (x >> 27)) * -1024/**
		 * This function represents a function used in the initialization
		 * by init_by_array
		 * @param x 32-bit integer
		 * @return 32-bit integer
		 */;
	}
	public static Object ini_func2(Object x) {
		return (x ^ (x >> 27)) * -1024/**
		 * This function certificate the period of 2^127-1.
		 * @param random tinymt state vector.
		 */;
	}
	/**
	 * Copyright (C) 2015 Kaspar Schleiser <kaspar@schleiser.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup sys_xtimer
	 *
	 * @{
	 * @file
	 * @brief xtimer posix wrapper
	 * @author Kaspar Schleiser <kaspar@schleiser.de>
	 * @}
	 */
	public static int sleep(int seconds) {
		ModernizedCProgram.xtimer_usleep64(seconds * (true));
		return 0;
	}
	public static int usleep(Object usec) {
		ModernizedCProgram.xtimer_usleep64(usec);
		return 0;
	}
	/*
	 * Copyright (C) 2014 Hamburg University of Applied Sciences (HAW)
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys
	 * @{
	 *
	 * @file
	 * @brief       Condition variable implementation
	 *
	 * @author      Martin Landsmann <martin.landsmann@haw-hamburg.de>
	 * @author      René Kijewski <rene.kijewski@fu-berlin.de>
	 *
	 * @}
	 */
	public static int pthread_cond_condattr_destroy() {
		if (attr != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("pthread_cond_condattr_destroy: currently attributes are not supported.\n");
		} 
		return 0;
	}
	public static int pthread_cond_condattr_init() {
		if (attr != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("pthread_cond_condattr_init: currently attributes are not supported.\n");
		} 
		return 0;
	}
	public static int pthread_condattr_getpshared(Object attr, Integer pshared) {
		(Object)attr;
		(Object)pshared;
		return 0;
	}
	public static int pthread_condattr_setpshared(int pshared) {
		(Object)attr;
		(Object)pshared;
		return 0;
	}
	public static int pthread_condattr_getclock(Object attr, Object clock_id) {
		(Object)attr;
		(Object)clock_id;
		return 0;
	}
	public static int pthread_condattr_setclock(Object clock_id) {
		(Object)attr;
		(Object)clock_id;
		return 0;
	}
	public static int pthread_cond_init( attr) {
		if (attr != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("pthread_cond_init: currently attributes are not supported.\n");
		} 
		Object generatedQueue = this.getQueue();
		generatedQueue.setFirst(((Object)0));
		return 0;
	}
	public static int pthread_cond_destroy() {
		cond.pthread_cond_init(((Object)0));
		return 0;
	}
	public static void _init_cond_wait(Object n) {
		n.setPriority(sched_active_thread.getPriority());
		n.setData(sched_active_pid);
		n.setNext(((Object)0));
		int old_state = /*Error: Function owner not recognized*/irq_disable();
		Object generatedQueue = this.getQueue();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/priority_queue_add((generatedQueue), n);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old_state);
	}
	public static int pthread_cond_wait(Object mutex) {
		if (cond == ((Object)0)) {
			return 22;
		} 
		 n = new ();
		cond._init_cond_wait(n);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock_and_sleep(mutex);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(mutex);
		return 0;
	}
	public static int pthread_cond_timedwait(Object mutex, Object abstime) {
		if (cond == ((Object)0)) {
			return 22;
		} 
		uint64_t now = ModernizedCProgram.xtimer_now_usec64();
		uint64_t then = ((uint64_t)abstime.getTv_sec() * (true)) + (abstime.getTv_nsec() / (true));
		int ret = 0;
		Object generatedQueue = this.getQueue();
		if (then > now) {
			xtimer_t timer = new xtimer_t();
			 n = new ();
			cond._init_cond_wait(n);
			ModernizedCProgram.xtimer_set_wakeup64(timer, (then - now), sched_active_pid);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock_and_sleep(mutex);
			if (n.getData() != --1024/* on signaling n.data is set to -1u */) {
				int old_state = /*Error: Function owner not recognized*/irq_disable();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/priority_queue_remove((generatedQueue), n);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old_state);
				ret = ETIMEDOUT;
			} 
			timer.xtimer_remove();
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(mutex);
				ret = ETIMEDOUT;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(mutex);
		return ret;
	}
	public static int pthread_cond_signal() {
		int old_state = /*Error: Function owner not recognized*/irq_disable();
		Object generatedQueue = this.getQueue();
		 head = /*Error: Function owner not recognized*/priority_queue_remove_head((generatedQueue));
		int other_prio = -1;
		if (head != ((Object)0)) {
			 other_thread = ()sched_threads[head.getData()];
			if (other_thread) {
				other_prio = other_thread.getPriority();
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_set_status(other_thread, STATUS_PENDING);
			} 
			head.setData(--1024);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old_state);
		if (other_prio >= 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_switch(other_prio);
		} 
		return 0;
	}
	public static int max_prio(int a, int b) {
		return (a < 0) ? b : ((a < b) ? a : b);
	}
	public static int pthread_cond_broadcast() {
		int old_state = /*Error: Function owner not recognized*/irq_disable();
		int other_prio = -1;
		Object generatedQueue = this.getQueue();
		while (1) {
			 head = /*Error: Function owner not recognized*/priority_queue_remove_head((generatedQueue));
			if (head == ((Object)0)) {
				break;
			} 
			 other_thread = ()sched_threads[head.getData()];
			if (other_thread) {
				other_prio = ModernizedCProgram.max_prio(other_prio, other_thread.getPriority());
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_set_status(other_thread, STATUS_PENDING);
			} 
			head.setData(--1024);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(old_state);
		if (other_prio >= 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sched_switch(other_prio);
		} 
		return 0;
	}
	public static void _fib_usage(int info) {
		switch (info) {
		case 0:
				{ 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\nsee <fibroute [add|del]> for more information\n<fibroute flush [interface]> removes all entries [associated with interface]\n");
					break;
				}
		case 1:
				{ 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\nbrief: adds a new entry to the FIB.\nusage: fibroute add <destination> via <next hop> [dev <device>]\n       <destination> - the destination address with optional prefix size, e.g. /116\n       <next hop>    - the address of the next-hop towards the <destination>\n       <device>      - the device id of the Interface to use. Optional if only one interface is available.\n");
					break;
				}
		case 2:
				{ 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\nbrief: adds a new entry to the FIB.\nusage: fibroute add <destination> via <next hop> [dev <device>] [lifetime <lifetime>]\n       <destination> - the destination address with optional prefix size, e.g. /116\n       <next hop>    - the address of the next-hop towards the <destination>\n       <device>      - the device id of the Interface to use. Optional if only one interface is available.\n       <lifetime>    - optional lifetime in ms when the entry automatically invalidates\n");
					break;
				}
		case 3:
				{ 
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\nbrief: deletes an entry from the FIB.\nusage: fibroute del <destination>\n       <destination> - the destination address of the entry to be deleted\n");
					break;
				}
		default:
				break;
		}
		;
	}
	public static void _fib_add(Object[] dest, Object next, Object pid, Object lifetime) {
		uint32_t prefix = 0;
		size_t i = /* Get the prefix length */0;
		for (i = /*Error: Function owner not recognized*/strlen(dest); i > 0; --i) {
			if (dest[i] == (byte)'/') {
				prefix = /*Error: Function owner not recognized*/atoi(dest[i + 1]);
				break;
			} 
			if (dest[i] == (byte)':' || dest[i] == (byte)'.') {
				i = /*Error: Function owner not recognized*/strlen(dest);
				break;
			} 
		}
		size_t dst_size = (i + 1);
		byte[] dst_arr = new byte[dst_size];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dst_arr, 0, dst_size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dst_arr, dest, i);
		byte dst = dst_arr[0];
		uint32_t dst_flags = 0;
		byte nxt = (byte)next;
		size_t nxt_size = (/*Error: Function owner not recognized*/strlen(next));
		uint32_t nxt_flags = 0;
		if (ModernizedCProgram.inet_pton(AF_INET6, (byte)dst, /* determine destination address */ModernizedCProgram.tmp_ipv6_dst)) {
			dst = ModernizedCProgram.tmp_ipv6_dst;
			dst_size = IN6ADDRSZ;
		}  else if (ModernizedCProgram.inet_pton(AF_INET, dest, ModernizedCProgram.tmp_ipv4_dst)) {
			dst = ModernizedCProgram.tmp_ipv4_dst;
			dst_size = INADDRSZ;
		} 
		if (ModernizedCProgram.inet_pton(AF_INET6, next, /* determine next-hop address */ModernizedCProgram.tmp_ipv6_nxt)) {
			nxt = ModernizedCProgram.tmp_ipv6_nxt;
			nxt_size = IN6ADDRSZ;
		}  else if (ModernizedCProgram.inet_pton(AF_INET, next, ModernizedCProgram.tmp_ipv4_nxt)) {
			nxt = ModernizedCProgram.tmp_ipv4_nxt;
			nxt_size = INADDRSZ;
		} 
		dst_flags |=  (prefix << FIB_FLAG_NET_PREFIX_SHIFT);
		ModernizedCProgram.fib_add_entry(gnrc_ipv6_fib_table, pid, dst, dst_size, dst_flags, nxt, nxt_size, nxt_flags, lifetime);
	}
	public static int _fib_route_handler(int argc, byte[][] argv) {
		if (argc == /* e.g. fibroute right now dont care about the adress/protocol family */1) {
			ModernizedCProgram.fib_print_routes(gnrc_ipv6_fib_table);
			return 0;
		} 
		if (argc == /* e.g. firoute [add|del] */2) {
			if ((/*Error: Function owner not recognized*/strcmp("add", argv[1]) == 0)) {
				ModernizedCProgram._fib_usage(2);
			}  else if ((/*Error: Function owner not recognized*/strcmp("del", argv[1]) == 0)) {
				ModernizedCProgram._fib_usage(3);
			}  else if ((/*Error: Function owner not recognized*/strcmp("flush", argv[1]) == 0)) {
				ModernizedCProgram.fib_flush(gnrc_ipv6_fib_table, KERNEL_PID_UNDEF);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("successfully flushed all entries");
			} else {
					ModernizedCProgram._fib_usage(0);
			} 
			return 1;
		} 
		if (argc > 2 && !((/*Error: Function owner not recognized*/strcmp("add", argv[1]) == 0) || (/*Error: Function owner not recognized*/strcmp("del", argv[1]) == 0) || (/*Error: Function owner not recognized*/strcmp("flush", argv[1]) == 0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\nunrecognized parameter2.\nPlease enter fibroute [add|del] for more information.");
			return 1;
		} 
		if ((argc == 5) && (/*Error: Function owner not recognized*/strcmp("add", argv[1]) == 0) && (/*Error: Function owner not recognized*/strcmp("via", argv[3]) == /* e.g. fibroute add <destination> via <next hop> */0)) {
			size_t ifnum = /*Error: Function owner not recognized*/gnrc_netif_numof();
			if (ifnum == 1) {
				 netif = /*Error: Function owner not recognized*/gnrc_netif_iter(((Object)0));
				ModernizedCProgram._fib_add(argv[2], argv[4], netif.getPid(), (uint32_t)FIB_LIFETIME_NO_EXPIRE);
			} else {
					ModernizedCProgram._fib_usage(1);
					return 1;
			} 
			return 0;
		} 
		if ((argc == 7) && (/*Error: Function owner not recognized*/strcmp("add", argv[1]) == 0) && (/*Error: Function owner not recognized*/strcmp("via", argv[3]) == /* e.g. fibroute add <destination> via <next hop> lifetime <lifetime> */0) && (/*Error: Function owner not recognized*/strcmp("lifetime", argv[5]) == 0)) {
			size_t ifnum = /*Error: Function owner not recognized*/gnrc_netif_numof();
			if (ifnum == 1) {
				 netif = /*Error: Function owner not recognized*/gnrc_netif_iter(((Object)0));
				ModernizedCProgram._fib_add(argv[2], argv[4], netif.getPid(), (uint32_t)/*Error: Function owner not recognized*/atoi(argv[6]));
			} else {
					ModernizedCProgram._fib_usage(1);
					return 1;
			} 
			return 0;
		} 
		if (argc == /* e.g. fibroute add <destination> via <next hop> dev <device> */7) {
			if ((/*Error: Function owner not recognized*/strcmp("add", argv[1]) == 0) && (/*Error: Function owner not recognized*/strcmp("via", argv[3]) == 0) && (/*Error: Function owner not recognized*/strcmp("dev", argv[5]) == 0)) {
				ModernizedCProgram._fib_add(argv[2], argv[4], ()/*Error: Function owner not recognized*/atoi(argv[6]), (uint32_t)FIB_LIFETIME_NO_EXPIRE);
			} else {
					ModernizedCProgram._fib_usage(1);
					return 1;
			} 
			return 0;
		} 
		if (argc == /* e.g. fibroute add <destination> via <next hop> dev <device> lifetime <lifetime> */9) {
			if ((/*Error: Function owner not recognized*/strcmp("add", argv[1]) == 0) && (/*Error: Function owner not recognized*/strcmp("via", argv[3]) == 0) && (/*Error: Function owner not recognized*/strcmp("dev", argv[5]) == 0) && (/*Error: Function owner not recognized*/strcmp("lifetime", argv[7]) == 0)) {
				ModernizedCProgram._fib_add(argv[2], argv[4], ()/*Error: Function owner not recognized*/atoi(argv[6]), (uint32_t)/*Error: Function owner not recognized*/atoi(argv[8]));
			} else {
					ModernizedCProgram._fib_usage(2);
					return 1;
			} 
			return 0;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\nunrecognized parameters.\nPlease enter fibroute [add|del] for more information.");
		return 1;
	}
	/*
	 * Copyright (C) 2017 Kaspar Schleiser <kaspar@schleiser.de>
	 *               2017 Inria
	 *               2017 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_riotboot_hdr
	 * @{
	 *
	 * @file
	 * @brief       RIOT header helpers and tools
	 *
	 * @author      Kaspar Schleiser <kaspar@schleiser.de>
	 * @author      Francisco Acosta <francisco.acosta@inria.fr>
	 *
	 * @}
	 */
	public static void riotboot_hdr_print(Object riotboot_hdr) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Image magic_number: 0x%08x\n", (int)riotboot_hdr.getMagic_number());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Image Version: 0x%08x\n", (int)riotboot_hdr.getVersion());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Image start address: 0x%08x\n", (int)riotboot_hdr.getStart_addr());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Header chksum: 0x%08x\n", (int)riotboot_hdr.getChksum());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\n");
	}
	public static int riotboot_hdr_validate(Object riotboot_hdr) {
		if (riotboot_hdr.getMagic_number() != RIOTBOOT_MAGIC) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s: riotboot_hdr magic number invalid\n", __func__);
			return -1;
		} 
		int res = ModernizedCProgram.riotboot_hdr_checksum(riotboot_hdr) == riotboot_hdr.getChksum() ? 0 : -1;
		if (res) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%s: riotboot_hdr checksum invalid\n", __func__);
		} 
		return res;
	}
	public static Object riotboot_hdr_checksum(Object riotboot_hdr) {
		return /*Error: Function owner not recognized*/fletcher32(()riotboot_hdr, ((size_t)(()0).getChksum()) / /*Error: Unsupported expression*/);
	}
	/*
	 * POSIX compatible implementation of barriers.
	 *
	 * Copyright (C) 2014 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup pthread
	 * @{
	 * @file
	 * @brief Attributes for synchronization barriers.
	 * @author René Kijewski <kijewski@inf.fu-berlin.de>
	 * @}
	 */
	public static int pthread_barrierattr_init() {
		this.setPshared(0);
		return 0;
	}
	public static int pthread_barrierattr_destroy() {
		(Object)attr;
		return 0;
	}
	public static int pthread_barrierattr_getpshared(Object attr, Integer pshared) {
		pshared = attr.getPshared();
		return 0;
	}
	public static int pthread_barrierattr_setpshared(int pshared) {
		this.setPshared(pshared);
		return 0;
	}
	public static void nhdp_writer_init() {
		rfc5444_writer_message _hello_msg = new rfc5444_writer_message();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_packet_write);
		ModernizedCProgram.nhdp_wr_curr_if_entry = ((Object)/* Reset current interface */0);
		ModernizedCProgram.nhdp_writer.setRfc5444_writer(/* Configure NHDP writer */ModernizedCProgram.msg_buffer);
		ModernizedCProgram.nhdp_writer.setRfc5444_writer(/*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.nhdp_writer.setRfc5444_writer(ModernizedCProgram.msg_addrtlvs);
		ModernizedCProgram.nhdp_writer.setRfc5444_writer(/*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_init(/* Initialize writer */ModernizedCProgram.nhdp_writer);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_register_msgcontentprovider(/* Register HELLO msg with 16 byte addresses and content provider */ModernizedCProgram.nhdp_writer, ModernizedCProgram._nhdp_message_content_provider, ModernizedCProgram._nhdp_addrtlvs, /*Error: Function owner not recognized*/ARRAY_SIZE(ModernizedCProgram._nhdp_addrtlvs));
		_hello_msg = /*Error: Function owner not recognized*/rfc5444_writer_register_message(ModernizedCProgram.nhdp_writer, RFC5444_MSGTYPE_HELLO, false, 16);
		_hello_msg.setRfc5444_writer_message(ModernizedCProgram._nhdp_add_hello_msg_header_cb);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_packet_write);
	}
	public static void nhdp_writer_cleanup() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_packet_write);
		ModernizedCProgram.nhdp_wr_curr_if_entry = ((Object)0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_cleanup(ModernizedCProgram.nhdp_writer);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_packet_write);
	}
	public static void nhdp_writer_register_if(Object new_if) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_packet_write);
		new_if.setAddPacketHeader(/* Add packet header callback to writer target of the interface */ModernizedCProgram._nhdp_add_packet_header_cb);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_register_target(ModernizedCProgram.nhdp_writer, /* Register target interface in writer */new_if);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_packet_write);
	}
	public static void nhdp_writer_send_hello() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_packet_write);
		ModernizedCProgram.nhdp_wr_curr_if_entry = /* Register interface as current sending interface */if_entry;
		Object generatedWr_target = this.getWr_target();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_create_message(ModernizedCProgram.nhdp_writer, /* Create HELLO message and send it using the given interface */RFC5444_MSGTYPE_HELLO, rfc5444_writer_singletarget_selector, generatedWr_target);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_flush(ModernizedCProgram.nhdp_writer, generatedWr_target, false);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_packet_write);
	}
	public static void nhdp_writer_add_addr(rfc5444_writer wr, nhdp_addr addr, Object type, Object value, Object metric_in, Object metric_out) {
		rfc5444_writer_address wr_addr = new rfc5444_writer_address();
		netaddr n_addr = new netaddr();
		addr.netaddr_from_nhdp_address(n_addr);
		switch (type) {
		case RFC5444_ADDRTLV_LINK_STATUS/* Fall through */:
		case RFC5444_ADDRTLV_OTHER_NEIGHB:
				wr_addr = /*Error: Function owner not recognized*/rfc5444_writer_add_address(wr, ModernizedCProgram._nhdp_message_content_provider.getRfc5444_writer_content_provider(), n_addr, false);
				break;
		case RFC5444_ADDRTLV_LOCAL_IF:
				wr_addr = /*Error: Function owner not recognized*/rfc5444_writer_add_address(wr, ModernizedCProgram._nhdp_message_content_provider.getRfc5444_writer_content_provider(), n_addr, true);
				break;
		default:
				return /*Error: Unsupported expression*/;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_add_addrtlv(wr, wr_addr, ModernizedCProgram._nhdp_addrtlvs[type], value, /*Error: Unsupported expression*/, false);
		if ((((true)) == (true)) && (metric_in != (/* Add LINK_METRIC TLV if necessary */false))) {
			switch (type) {
			case RFC5444_ADDRTLV_LINK_STATUS:
					metric_in |=  (true);
					metric_in |=  (metric_in == metric_out) ? (true) : -1024;
					break;
			case RFC5444_ADDRTLV_OTHER_NEIGHB:
					metric_in |=  (true);
					metric_in |=  (metric_in == metric_out) ? (true) : -1024;
					break;
			default:
					return /*Error: Unsupported expression*/;
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_add_addrtlv(wr, wr_addr, ModernizedCProgram._nhdp_addrtlvs[RFC5444_ADDRTLV_LINK_METRIC], metric_in, /*Error: sizeof expression not supported yet*/, true/*------------------------------------------------------------------------------------*/);
		} 
	}
	/* Internal function prototypes */
	/*------------------------------------------------------------------------------------*/
	/**
	 * Set the header for the currently constructed HELLO message
	 * Called by oonf_api during message creation
	 */
	public static void _nhdp_add_hello_msg_header_cb(Object msg) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_set_msg_header(wr, msg, false, false, false, /* No originator, no hopcount, no hoplimit, no sequence number */false/**
		 * Add validity time and interval time message TLVs to current message
		 * Called by oonf_api during message creation
		 */);
	}
	public static void _nhdp_add_message_tlvs_cb() {
		uint8_t validity_time = new uint8_t();
		uint8_t interval_time = new uint8_t();
		uint64_t val_tmp = (uint64_t)ModernizedCProgram.nhdp_wr_curr_if_entry.getValidity_time().getSeconds() * (/* Convert validity time and interval time to milliseconds */true) + (ModernizedCProgram.nhdp_wr_curr_if_entry.getValidity_time().getMicroseconds() / -1024);
		uint64_t int_tmp = (uint64_t)ModernizedCProgram.nhdp_wr_curr_if_entry.getHello_interval().getSeconds() * (true) + (ModernizedCProgram.nhdp_wr_curr_if_entry.getHello_interval().getMicroseconds() / -1024);
		validity_time = /*Error: Function owner not recognized*/rfc5444_timetlv_encode(/* Add validity time (mandatory) and interval time to msg */val_tmp);
		interval_time = /*Error: Function owner not recognized*/rfc5444_timetlv_encode(int_tmp);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_add_messagetlv(wr, RFC5444_MSGTLV_VALIDITY_TIME, 0, validity_time, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_add_messagetlv(wr, RFC5444_MSGTLV_INTERVAL_TIME, 0, interval_time, /*Error: sizeof expression not supported yet*/);
	}
	public static void _nhdp_add_addresses_cb() {
		ModernizedCProgram.lib_fill_wr_addresses(ModernizedCProgram.nhdp_wr_curr_if_entry.getIf_pid(), wr);
		ModernizedCProgram.iib_fill_wr_addresses(ModernizedCProgram.nhdp_wr_curr_if_entry.getIf_pid(), wr);
		ModernizedCProgram.nib_fill_wr_addresses(wr);
		ModernizedCProgram.nhdp_reset_addresses_tmp_usg(0/**
		 * Add packet header with sequence number to current packet
		 * Called by oonf_api during packet creation
		 */);
	}
	public static void _nhdp_add_packet_header_cb(rfc5444_writer writer, rfc5444_writer_target rfc5444_target) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_set_pkt_header(writer, rfc5444_target, true);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_set_pkt_seqno(writer, rfc5444_target, ++ModernizedCProgram.nhdp_wr_curr_if_entry.getSeq_no());
	}
	public static void __stack_chk_fail() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/core_panic(PANIC_SSP, "ssp: stack smashing detected");
	}
	public static int rtt_read(Byte buf_ptr, Object buf_size) {
		int16_t num_bytes_rem = new int16_t();
		uint16_t num_bytes_read = new uint16_t();
		int16_t rd_off = new int16_t();
		int16_t wr_off = new int16_t();
		rd_off = ModernizedCProgram.rtt_cb.getDown()[0].getRd_off();
		wr_off = ModernizedCProgram.rtt_cb.getDown()[0].getWr_off();
		num_bytes_read = 0;
		if (rd_off > /* Read from current read position to wrap-around of buffer, first */wr_off) {
			num_bytes_rem = ModernizedCProgram.rtt_cb.getDown()[0].getBuf_size() - rd_off;
			num_bytes_rem = (((num_bytes_rem) < ((int)buf_size)) ? (num_bytes_rem) : ((int)buf_size));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf_ptr, ModernizedCProgram.rtt_cb.getDown()[0].getBuf_ptr() + rd_off, num_bytes_rem);
			num_bytes_read += num_bytes_rem;
			buf_ptr += num_bytes_rem;
			buf_size -= num_bytes_rem;
			rd_off += num_bytes_rem;
			if (rd_off == ModernizedCProgram.rtt_cb.getDown()[0].getBuf_size()) {
				rd_off = 0;
			} 
		} 
		num_bytes_rem = wr_off - /* Read remaining items of buffer */rd_off;
		num_bytes_rem = (((num_bytes_rem) < ((int)buf_size)) ? (num_bytes_rem) : ((int)buf_size));
		if (num_bytes_rem > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf_ptr, ModernizedCProgram.rtt_cb.getDown()[0].getBuf_ptr() + rd_off, num_bytes_rem);
			num_bytes_read += num_bytes_rem;
			rd_off += num_bytes_rem;
		} 
		if (num_bytes_read) {
			ModernizedCProgram.rtt_cb.getDown()[0].setRd_off(rd_off);
		} 
		return num_bytes_read/**
		 * @brief write bytes to the up buffer. This function does not block.
		 *        The logic here is unmodified from SEGGER's reference, it is just
		 *        refactored to match code style. The string does not need to be null
		 *        terminated.
		 *
		 * @return the number of bytes read
		 */;
	}
	public static int rtt_write(Object buf_ptr, int num_bytes) {
		int num_bytes_to_write;
		int num_bytes_written;
		int rd_off;
		rd_off = ModernizedCProgram.rtt_cb.getUp()[0].getRd_off();
		num_bytes_to_write = rd_off - ModernizedCProgram.rtt_cb.getUp()[0].getWr_off() - 1;
		if (num_bytes_to_write < 0) {
			num_bytes_to_write += ModernizedCProgram.rtt_cb.getUp()[0].getBuf_size();
		} 
		if ((int)num_bytes > /* If the complete data does not fit in the buffer, trim the data */num_bytes_to_write) {
			num_bytes = num_bytes_to_write;
		} 
		if (num_bytes == /* Early out if there is nothing to do */0) {
			return 0;
		} 
		num_bytes_written = /* Write data to buffer and handle wrap-around if necessary */0;
		do {
			rd_off = ModernizedCProgram.rtt_cb.getUp()[0].getRd_off();
			num_bytes_to_write = rd_off - ModernizedCProgram.rtt_cb.getUp()[0].getWr_off() - 1;
			if (num_bytes_to_write < 0) {
				num_bytes_to_write += ModernizedCProgram.rtt_cb.getUp()[0].getBuf_size();
			} 
			num_bytes_to_write = (((num_bytes_to_write) < ((ModernizedCProgram.rtt_cb.getUp()[0].getBuf_size() - ModernizedCProgram.rtt_cb.getUp()[0].getWr_off()))) ? (num_bytes_to_write) : ((ModernizedCProgram.rtt_cb.getUp()[0].getBuf_size() - ModernizedCProgram.rtt_cb.getUp()[0].getWr_off())));
			num_bytes_to_write = (((num_bytes_to_write) < ((int)num_bytes)) ? (num_bytes_to_write) : ((int)num_bytes));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.rtt_cb.getUp()[0].getBuf_ptr() + ModernizedCProgram.rtt_cb.getUp()[0].getWr_off(), buf_ptr, num_bytes_to_write);
			num_bytes_written += num_bytes_to_write;
			buf_ptr += num_bytes_to_write;
			num_bytes -= num_bytes_to_write;
			ModernizedCProgram.rtt_cb.getUp()[0].getWr_off() += num_bytes_to_write;
			if (ModernizedCProgram.rtt_cb.getUp()[0].getWr_off() == ModernizedCProgram.rtt_cb.getUp()[0].getBuf_size()) {
				ModernizedCProgram.rtt_cb.getUp()[0].setWr_off(0);
			} 
		} while (num_bytes);
		return num_bytes_written;
	}
	public static void rtt_stdio_enable_stdin() {
		ModernizedCProgram.stdin_enabled = 1;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._rx_mutex);
	}
	public static void rtt_stdio_enable_blocking_stdout() {
		ModernizedCProgram.blocking_stdout = 1/* The reason we have this strange logic is as follows:
		   If we have an RTT console, we are powered, and so don't care
		   that polling uses a lot of power. If however, we do not
		   actually have an RTT console (because we are deployed on
		   a battery somewhere) then we REALLY don't want to poll
		   especially since we are not expecting to EVER get input. */;
	}
	/* $OpenBSD: subdi3.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Subtract two quad values.  This is trivial since a one-bit carry
	 * from a single u_int difference x-y occurs if and only if (x-y) > x.
	 */
	public static Object __subdi3(Object a, Object b) {
		Object aa;
		Object bb;
		Object diff;
		aa.setQ(a);
		bb.setQ(b);
		Object generatedUl = diff.getUl();
		generatedUl[(false)] = generatedUl[(false)] - generatedUl[(false)];
		generatedUl[(true)] = generatedUl[(true)] - generatedUl[(true)] - (generatedUl[(false)] > generatedUl[(false)]);
		Object generatedQ = diff.getQ();
		return generatedQ;
	}
	/* $OpenBSD: floatdidf.c,v 1.6 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Convert (signed) quad to double.
	 */
	public static double __floatdidf(Object x) {
		double d;
		Object u;
		int neg;
		/*
		     * Get an unsigned number first, by negating if necessary.
		     */
		if (x < 0) {
			u.setQ(-x);
			neg = 1;
		} else {
				u.setQ(x);
				neg = 0/*
				     * Now u.ul[H] has the factor of 2^32 (or whatever) and u.ul[L]
				     * has the units.  Ideally we could just set d, add INT_BITS to
				     * its exponent, and then add the units, but this is portable
				     * code and does not know how to get at an exponent.  Machine-
				     * specific code may be able to do this more efficiently.
				     */;
		} 
		Object generatedUl = u.getUl();
		d = (double)generatedUl[(true)] * (((int)1 << ((/*Error: Unsupported expression*/ * 8) - 2)) * 4.0);
		d += generatedUl[(false)];
		return neg ? -d : d;
	}
	public static  _get_free_socket() {
		for (int i = 0;
		 i < (SOCKET_POOL_SIZE + (SOCKET_POOL_SIZE * SOCKET_TCP_QUEUE_SIZE)); i++) {
			if (ModernizedCProgram._socket_pool[i].getDomain() == AF_UNSPEC) {
				return ModernizedCProgram._socket_pool[i];
			} 
		}
		return ((Object)0);
	}
	public static  _get_free_sock() {
		int i = /*Error: Function owner not recognized*/bf_get_unset(_sock_pool_used, SOCKET_POOL_SIZE);
		if (i < 0) {
			return ((Object)0);
		} 
		return ModernizedCProgram._sock_pool[i];
	}
	public static  _get_socket(int fd) {
		for (int i = 0;
		 i < (SOCKET_POOL_SIZE + (SOCKET_POOL_SIZE * SOCKET_TCP_QUEUE_SIZE)); i++) {
			if (ModernizedCProgram._socket_pool[i].getFd() == fd) {
				return ModernizedCProgram._socket_pool[i];
			} 
		}
		return ((Object)0);
	}
	public static int _get_sock_idx() {
		if ((ModernizedCProgram.sock < ModernizedCProgram._sock_pool[0]) || (ModernizedCProgram.sock > ModernizedCProgram._sock_pool[SOCKET_POOL_SIZE - 1])) {
			return -1;
		} 
		return ModernizedCProgram.sock - ModernizedCProgram._sock_pool[0];
	}
	public static int _choose_ipproto(int type, int protocol) {
		switch (type) {
		default:
				(Object)protocol;
				break;
		}
		(/*Error: Function owner not recognized*/_errno()) = EPROTONOSUPPORT;
		return -1;
	}
	public static Object _addr_truncate(Object out, Object out_len, Object in, Object target_size) {
		out_len = (out_len < target_size) ? out_len : target_size;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out, in, out_len);
		return out_len;
	}
	public static int _ep_to_sockaddr(Object ep, Object out) {
		(((ep.getFamily() == AF_INET) || (ep.getFamily() == AF_INET6)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(ep->family == AF_INET) || (ep->family == AF_INET6)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\posix_sockets.c", 187));
		Object generatedSockaddr_in = in_addr.getSockaddr_in();
		switch (ep.getFamily()) {
		case AF_INET:
				{ 
					sockaddr_in in_addr = (sockaddr_in)out;
					in_addr.setSockaddr_in(AF_INET);
					generatedSockaddr_in.setS_addr(ep.getAddr().getIpv4_u32());
					in_addr.setSockaddr_in(/*Error: Function owner not recognized*/htons(ep.getPort()));
					return /*Error: Unsupported expression*/;
				}
		default:
				return /* should not happen */0;
		}
	}
	public static int _sockaddr_to_ep(Object address, Object address_len, Object out) {
		((address != ((Object)0)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("address != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\posix_sockets.c", 216));
		Object generatedSockaddr_in = in_addr.getSockaddr_in();
		switch (address.getSa_family()) {
		case AF_INET:
				if (address_len < /*Error: Unsupported expression*/) {
					(/*Error: Function owner not recognized*/_errno()) = 22;
					return -1;
				} 
				sockaddr_in in_addr = (sockaddr_in)address;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(out, 0, /*Error: sizeof expression not supported yet*/);
				out.setFamily(AF_INET);
				out.getAddr().setIpv4_u32(generatedSockaddr_in.getS_addr());
				out.setPort(/*Error: Function owner not recognized*/ntohs(generatedSockaddr_in));
				break;
		default:
				(/*Error: Function owner not recognized*/_errno()) = EAFNOSUPPORT;
				return -1;
		}
		return 0;
	}
	public static int socket_close() {
		Object generatedPrivate_data = this.getPrivate_data();
		socket_t s = generatedPrivate_data.getPtr();
		int res = 0;
		Object generatedDomain = s.getDomain();
		(((generatedDomain == AF_INET) || (generatedDomain == AF_INET6)) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(s->domain == AF_INET) || (s->domain == AF_INET6)", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\posix_sockets.c", 255));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._socket_pool_mutex);
		Object generatedSock = s.getSock();
		Object generatedType = s.getType();
		if (generatedSock != ((Object)0)) {
			int idx = generatedSock._get_sock_idx();
			switch (generatedType) {
			default:
					(/*Error: Function owner not recognized*/_errno()) = EOPNOTSUPP;
					res = -1;
					break;
			}
			if (idx >= 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bf_unset(_sock_pool_used, idx);
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
		s.setSock(((Object)0));
		s.setDomain(AF_UNSPEC);
		return res;
	}
	public static int socket_fstat( filp, stat buf) {
		(Object)filp;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(buf, 0, /*Error: Unsupported expression*/);
		Object generatedSt_mode = buf.getSt_mode();
		generatedSt_mode |=  (S_IFSOCK | (-1024 | -1024 | -1024) | S_IRWXG | S_IRWXO);
		buf.setSt_blksize((true));
		return 0;
	}
	public static Object socket_lseek(Object off, int whence) {
		(Object)filp;
		(Object)off;
		(Object)whence;
		return -/* see http://pubs.opengroup.org/onlinepubs/9699919799/functions/lseek.html */29;
	}
	public static Object socket_read(Object buf, Object n) {
		Object generatedPrivate_data = this.getPrivate_data();
		return generatedPrivate_data.getPtr().socket_recvfrom(buf, n, 0, ((Object)0), ((Object)0));
	}
	public static Object socket_write(Object buf, Object n) {
		Object generatedPrivate_data = this.getPrivate_data();
		return generatedPrivate_data.getPtr().socket_sendto(buf, n, 0, ((Object)0), 0);
	}
	public static int socket(int domain, int type, int protocol) {
		int res = 0;
		socket_t s = new socket_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._socket_pool_mutex);
		s = ModernizedCProgram._get_free_socket();
		if (s == ((Object)0)) {
			(/*Error: Function owner not recognized*/_errno()) = 23;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
			return -1;
		} 
		switch (domain) {
		case AF_INET:
				{ 
					int fd = ModernizedCProgram.vfs_bind((true), 2, ModernizedCProgram.socket_ops, s);
					if (fd < 0) {
						(/*Error: Function owner not recognized*/_errno()) = 23;
						res = -1;
						break;
					} else {
							s.setFd(res = fd);
					} 
					s.setDomain(domain);
					s.setType(type);
					if ((s.setProtocol(ModernizedCProgram._choose_ipproto(type, protocol))) < 0) {
						res = -1;
						break;
					} 
					s.setBound(0);
					s.setSock(((Object)0));
					break;
				}
		default:
				(Object)type;
				(Object)protocol;
				(/*Error: Function owner not recognized*/_errno()) = EAFNOSUPPORT;
				res = -1;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
		return res;
	}
	public static int accept(int socket, Object address, Object address_len) {
		(Object)socket;
		(Object)address;
		(Object)address_len;
		(/*Error: Function owner not recognized*/_errno()) = -EOPNOTSUPP;
		return -1;
	}
	public static int bind(int socket, Object address, Object address_len) {
		socket_t s = new socket_t();
		int res = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(/* only store bind data, real bind happens in _bind_connect/listen */ModernizedCProgram._socket_pool_mutex);
		s = ModernizedCProgram._get_socket(socket);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
		if (s == ((Object)0)) {
			(/*Error: Function owner not recognized*/_errno()) = ENOTSOCK;
			return -1;
		} 
		Object generatedBound = s.getBound();
		if (generatedBound) {
			(/*Error: Function owner not recognized*/_errno()) = 22;
			return -1;
		} 
		Object generatedDomain = s.getDomain();
		if (address.getSa_family() != generatedDomain) {
			(/*Error: Function owner not recognized*/_errno()) = EAFNOSUPPORT;
			return -1;
		} 
		Object generatedType = s.getType();
		switch (generatedType) {
		default:
				(Object)res;
				(/*Error: Function owner not recognized*/_errno()) = EOPNOTSUPP;
				return -1;
		}
		Object generatedLocal = s.getLocal();
		if (ModernizedCProgram._sockaddr_to_ep(address, address_len, generatedLocal) < 0) {
			return -1;
		} 
		s.setBound(1);
		return 0;
	}
	public static int _bind_connect(Object address, Object address_len) {
		_sock_tl_ep r = new _sock_tl_ep();
		_sock_tl_ep remote = ((Object)0);
		_sock_tl_ep local = ((Object)0);
		int res;
		socket_sock_t sock = new socket_sock_t();
		(((s != ((Object)0)) && ((address == ((Object)0)) || (address_len > 0))) ? (Object)0 : /*Error: Function owner not recognized*/_assert("(s != NULL) && ((address == NULL) || (address_len > 0))", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\posix_sockets.c", 540));
		Object generatedDomain = this.getDomain();
		if (address != ((Object)0)) {
			if (address.getSa_family() != generatedDomain) {
				(/*Error: Function owner not recognized*/_errno()) = EAFNOSUPPORT;
				return -1;
			} 
			if (ModernizedCProgram._sockaddr_to_ep(address, address_len, r) < 0) {
				return -1;
			} 
			remote = r;
		} 
		Object generatedBound = this.getBound();
		Object generatedLocal = this.getLocal();
		if (generatedBound) {
			local = generatedLocal;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._socket_pool_mutex);
		sock = ModernizedCProgram._get_free_sock();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
		if (sock == ((Object)0)) {
			(/*Error: Function owner not recognized*/_errno()) = 12;
			return -1;
		} 
		Object generatedType = this.getType();
		switch (generatedType/* TODO apply flags if possible */) {
		default:
				(Object)local;
				(Object)remote;
				res = -EOPNOTSUPP;
				break;
		}
		if (res < 0) {
			(/*Error: Function owner not recognized*/_errno()) = -res;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(/* free sock again */ModernizedCProgram._socket_pool_mutex);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/bf_unset(_sock_pool_used, sock._get_sock_idx());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
			return -1;
		} 
		this.setSock(sock);
		return 0;
	}
	public static int connect(int socket, Object address, Object address_len) {
		socket_t s = new socket_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._socket_pool_mutex);
		s = ModernizedCProgram._get_socket(socket);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
		if (s == ((Object)0)) {
			(/*Error: Function owner not recognized*/_errno()) = ENOTSOCK;
			return -1;
		} 
		Object generatedSock = s.getSock();
		if (generatedSock != ((Object)0)) {
			{ 
				(/*Error: Function owner not recognized*/_errno()) = EISCONN;
			}
			return -1;
		} 
		return s._bind_connect(address, address_len);
	}
	public static int _getpeername(Object address, Object address_len) {
		_sock_tl_ep ep = new _sock_tl_ep();
		int res = 0;
		Object generatedSock = this.getSock();
		if (generatedSock == ((Object)0)) {
			return -ENOTCONN;
		} 
		Object generatedType = this.getType();
		switch (generatedType) {
		default:
				res = -EOPNOTSUPP;
				break;
		}
		if (res >= 0) {
			sockaddr_storage sa = new sockaddr_storage();
			 sa_len = ModernizedCProgram._ep_to_sockaddr(ep, sa);
			address_len = ModernizedCProgram._addr_truncate(address, address_len, sa, sa_len);
		} 
		return res;
	}
	public static int getpeername(int socket, Object address, Object address_len) {
		socket_t s = new socket_t();
		int res;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._socket_pool_mutex);
		s = ModernizedCProgram._get_socket(socket);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
		if (s == ((Object)0)) {
			(/*Error: Function owner not recognized*/_errno()) = ENOTSOCK;
			return -1;
		} 
		if ((res = s._getpeername(address, address_len)) < 0) {
			(/*Error: Function owner not recognized*/_errno()) = -res;
			return -1;
		} 
		return res;
	}
	public static int getsockname(int socket, Object address, Object address_len) {
		socket_t s = new socket_t();
		sockaddr_storage sa = new sockaddr_storage();
		 sa_len = new ();
		int res = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._socket_pool_mutex);
		s = ModernizedCProgram._get_socket(socket);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
		if (s == ((Object)0)) {
			(/*Error: Function owner not recognized*/_errno()) = ENOTSOCK;
			return -1;
		} 
		Object generatedSock = s.getSock();
		Object generatedLocal = s.getLocal();
		Object generatedType = s.getType();
		if (generatedSock == ((Object)0)) {
			sa_len = ModernizedCProgram._ep_to_sockaddr(generatedLocal, sa);
		} else {
				_sock_tl_ep ep = new _sock_tl_ep();
				switch (generatedType) {
				default:
						res = -EOPNOTSUPP;
						break;
				}
				sa_len = ModernizedCProgram._ep_to_sockaddr(ep, sa);
		} 
		if (res < 0) {
			(/*Error: Function owner not recognized*/_errno()) = -res;
			res = -1;
		} else {
				address_len = ModernizedCProgram._addr_truncate(address, address_len, sa, sa_len);
		} 
		return res;
	}
	public static int listen(int socket, int backlog) {
		/* TODO apply flags if possible *//* TODO apply flags if possible */(Object)socket;
		(Object)backlog;
		(/*Error: Function owner not recognized*/_errno()) = EOPNOTSUPP;
		return -1;
	}
	/* or this socket is already connected, this is an error */
	public static Object socket_recvfrom(Object buffer, Object length, int flags, Object address, Object address_len) {
		int res = 0;
		_sock_tl_ep ep = new _sock_tl_ep(/*Error: Invalid initializer*/);
		(Object)flags;
		if (s == ((Object)0)) {
			return -ENOTSOCK;
		} 
		Object generatedSock = this.getSock();
		if (generatedSock == ((Object)/* socket is not connected */0)) {
			if ((res = s._bind_connect(((Object)0), 0)) < /* bind implicitly */0) {
				return res;
			} 
		} 
		uint32_t recv_timeout = SOCK_NO_TIMEOUT;
		Object generatedType = this.getType();
		switch (generatedType) {
		default:
				(Object)recv_timeout;
				res = -EOPNOTSUPP;
				break;
		}
		if ((res >= 0) && (address != ((Object)0)) && (address_len != ((Object)0))) {
			switch (generatedType) {
			default:
					{ 
						sockaddr_storage sa = new sockaddr_storage();
						 sa_len = new ();
						sa_len = ModernizedCProgram._ep_to_sockaddr(ep, sa);
						address_len = ModernizedCProgram._addr_truncate(address, address_len, sa, sa_len);
						break;
					}
			}
		} 
		return res;
	}
	public static Object recvfrom(int socket, Object buffer, Object length, int flags, Object address, Object address_len) {
		socket_t s = new socket_t();
		int res;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._socket_pool_mutex);
		s = ModernizedCProgram._get_socket(socket);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
		res = s.socket_recvfrom(buffer, length, flags, address, address_len);
		if (res < 0) {
			(/*Error: Function owner not recognized*/_errno()) = -res;
			return -1;
		} 
		return res;
	}
	public static Object socket_sendto(Object buffer, Object length, int flags, Object address, Object address_len) {
		int res = 0;
		(Object)flags;
		if (s == ((Object)0)) {
			(/*Error: Function owner not recognized*/_errno()) = ENOTSOCK;
			return -1;
		} 
		Object generatedSock = this.getSock();
		if (generatedSock == ((Object)/* socket is not connected */0)) {
			if ((res = s._bind_connect(((Object)0), 0)) < /* bind implicitly */0) {
				return res;
			} 
		} 
		Object generatedType = this.getType();
		switch (generatedType) {
		default:
				res = -1;
				(/*Error: Function owner not recognized*/_errno()) = EOPNOTSUPP;
				break;
		}
		return res;
	}
	public static Object sendto(int socket, Object buffer, Object length, int flags, Object address, Object address_len) {
		socket_t s = new socket_t();
		int res;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram._socket_pool_mutex);
		s = ModernizedCProgram._get_socket(socket);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram._socket_pool_mutex);
		res = s.socket_sendto(buffer, length, flags, address, address_len);
		if (res < 0) {
			(/*Error: Function owner not recognized*/_errno()) = -res;
			return -1;
		} 
		return res/*
		 * This is a partial implementation of setsockopt for changing the receive
		 * timeout value of a socket.
		 */;
	}
	public static int setsockopt(int socket, int level, int option_name, Object option_value, Object option_len) {
		(Object)socket;
		(Object)level;
		(Object)option_name;
		(Object)option_value;
		(Object)option_len;
		return -1/**
		 * @}
		 */;
	}
	public static void test_utils_interactive_sync() {
		byte c = /* Print help on first loop */(byte)'\0';
		do {
			if (c == (byte)'r'/* This one should have a different case than the help message
			             * otherwise we match it when using 'expect' */) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("READY");
			}  else if (c != (byte)'\n' && c != (byte)'\r') {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("Help: Press s to start test, r to print it is ready");
			} 
			c = /*Error: Function owner not recognized*/getchar();
		} while (c != (byte)'s');
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("START");
	}
	/*
	 * Copyright 2013 INRIA.
	 * Copyright 2014 Ludwig Knüpfer <ludwig.knuepfer@fu-berlin.de>
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       Shell command implementation for the peripheral RTC interface
	 *
	 * @author  Oliver Hahm <oliver.hahm@inria.fr>
	 * @author  Ludwig Knüpfer <ludwig.knuepfer@fu-berlin.de>#
	 *
	 * @}
	 */
	public static void _alarm_handler(Object arg) {
		(Object)arg;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("The alarm rang");
	}
	public static int dow(int year, int month, int day) {
		int[] t = new int[]{0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, /* calculate the day of week using Tøndering's algorithm */4};
		year -= month < 3;
		return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
	}
	public static int _parse_time(byte[][] argv, Object time) {
		int i;
		byte end;
		i = /*Error: Function owner not recognized*/strtol(argv[0], end, 10);
		time.setTm_year(i - 1900);
		i = /*Error: Function owner not recognized*/strtol(end + 1, end, 10);
		time.setTm_mon(i - 1);
		i = /*Error: Function owner not recognized*/strtol(end + 1, end, 10);
		time.setTm_mday(i);
		i = /*Error: Function owner not recognized*/strtol(argv[1], end, 10);
		time.setTm_hour(i);
		i = /*Error: Function owner not recognized*/strtol(end + 1, end, 10);
		time.setTm_min(i);
		i = /*Error: Function owner not recognized*/strtol(end + 1, end, 10);
		time.setTm_sec(i);
		time.setTm_wday(ModernizedCProgram.dow(time.getTm_year() + 1900, time.getTm_mon() + 1, time.getTm_mday()));
		time.setTm_isdst(-/* undefined */1);
		return 0;
	}
	public static int _print_time(Object time) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("%04i-%02i-%02i %02i:%02i:%02i\n", time.getTm_year() + 1900, time.getTm_mon() + 1, time.getTm_mday(), time.getTm_hour(), time.getTm_min(), time.getTm_sec());
		return 0;
	}
	public static int _rtc_getalarm() {
		tm t = new tm();
		if (/*Error: Function owner not recognized*/rtc_get_alarm(t) == 0) {
			ModernizedCProgram._print_time(t);
			return 0;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("rtc: error getting alarm");
				return 1;
		} 
	}
	public static int _rtc_setalarm(Byte argv) {
		tm now = new tm();
		if (ModernizedCProgram._parse_time(argv, now) == 0) {
			if (/*Error: Function owner not recognized*/rtc_set_alarm(now, _alarm_handler, ((Object)0)) == -1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("rtc: error setting alarm");
				return 1;
			} 
			return 0;
		} 
		return 1;
	}
	public static int _rtc_gettime() {
		tm t = new tm();
		if (/*Error: Function owner not recognized*/rtc_get_time(t) == 0) {
			ModernizedCProgram._print_time(t);
			return 0;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("rtc: error getting time");
				return 1;
		} 
	}
	public static int _rtc_settime(Byte argv) {
		tm now = new tm();
		if (ModernizedCProgram._parse_time(argv, now) == 0) {
			if (/*Error: Function owner not recognized*/rtc_set_time(now) == -1) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("rtc: error setting time");
				return 1;
			} 
			return 0;
		} 
		return 1;
	}
	public static int _rtc_usage() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("usage: rtc <command> [arguments]");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("commands:");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\tpoweron\t\tpower the interface on");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\tpoweroff\tpower the interface off");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\tclearalarm\tdeactivate the current alarm");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\tgetalarm\tprint the currently alarm time");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\tsetalarm YYYY-MM-DD HH:MM:SS\n\t\t\tset an alarm for the specified time");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\tgettime\t\tprint the current time");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/puts("\tsettime YYYY-MM-DD HH:MM:SS\n\t\t\tset the current time");
		return 0;
	}
	public static int _rtc_handler(int argc, byte[][] argv) {
		if (argc < 2) {
			ModernizedCProgram._rtc_usage();
			return 1;
		}  else if (/*Error: Function owner not recognized*/strncmp(argv[1], "poweron", 7) == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rtc_poweron();
		}  else if (/*Error: Function owner not recognized*/strncmp(argv[1], "poweroff", 8) == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rtc_poweroff();
		}  else if (/*Error: Function owner not recognized*/strncmp(argv[1], "clearalarm", 8) == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rtc_clear_alarm();
		}  else if (/*Error: Function owner not recognized*/strncmp(argv[1], "getalarm", 8) == 0) {
			ModernizedCProgram._rtc_getalarm();
		}  else if ((/*Error: Function owner not recognized*/strncmp(argv[1], "setalarm", 8) == 0) && (argc == 4)) {
			ModernizedCProgram._rtc_setalarm(argv + 2);
		}  else if (/*Error: Function owner not recognized*/strncmp(argv[1], "gettime", 7) == 0) {
			ModernizedCProgram._rtc_gettime();
		}  else if ((/*Error: Function owner not recognized*/strncmp(argv[1], "settime", 7) == 0) && (argc == 4)) {
			ModernizedCProgram._rtc_settime(argv + 2);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("unknown command or missing parameters: %s\n\n", argv[1]);
				ModernizedCProgram._rtc_usage();
				return 1;
		} 
		return 0;
	}
	/* $OpenBSD: cmpdi2.c,v 1.5 2005/08/08 08:05:35 espie Exp $ */
	/*-
	 * Copyright (c) 1992, 1993
	 * The Regents of the University of California.  All rights reserved.
	 *
	 * This software was developed by the Computer Systems Engineering group
	 * at Lawrence Berkeley Laboratory under DARPA contract BG 91-66 and
	 * contributed to Berkeley.
	 *
	 * Redistribution and use in source and binary forms, with or without
	 * modification, are permitted provided that the following conditions
	 * are met:
	 * 1. Redistributions of source code must retain the above copyright
	 *    notice, this list of conditions and the following disclaimer.
	 * 2. Redistributions in binary form must reproduce the above copyright
	 *    notice, this list of conditions and the following disclaimer in the
	 *    documentation and/or other materials provided with the distribution.
	 * 3. Neither the name of the University nor the names of its contributors
	 *    may be used to endorse or promote products derived from this software
	 *    without specific prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
	 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
	 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
	 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
	 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
	 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
	 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
	 * SUCH DAMAGE.
	 */
	/*
	 * Return 0, 1, or 2 as a <, =, > b respectively.
	 * Both a and b are considered signed---which means only the high word is
	 * signed.
	 */
	public static int __cmpdi2(Object a, Object b) {
		Object aa;
		Object bb;
		aa.setQ(a);
		bb.setQ(b);
		Object generatedSl = aa.getSl();
		Object generatedUl = aa.getUl();
		return generatedSl[(true)] < generatedSl[(true)] ? 0 : generatedSl[(true)] > generatedSl[(true)] ? 2 : generatedUl[(false)] < generatedUl[(false)] ? 0 : generatedUl[(false)] > generatedUl[(false)] ? 2 : 1;
	}
	public static void nib_fill_wr_addresses(Object wr) {
		nib_entry_t nib_elt = new nib_entry_t();
		nhdp_addr_entry_t addr_elt = new nhdp_addr_entry_t();
		nib_lost_address_entry_t lost_elt = new nib_lost_address_entry_t();
		nib_lost_address_entry_t lost_tmp = new nib_lost_address_entry_t();
		timex_t now = new timex_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_nib_access);
		now.xtimer_now_timex();
		Object generatedSymmetric = nib_elt.getSymmetric();
		nhdp_addr generatedAddress = addr_elt.getAddress();
		Object generatedIn_tmp_table = generatedAddress.getIn_tmp_table();
		Object generatedMetric_in = nib_elt.getMetric_in();
		Object generatedMetric_out = nib_elt.getMetric_out();
		nhdp_addr_entry generatedNext = (addr_elt).getNext();
		nhdp_addr_entry generatedAddress_list_head = nib_elt.getAddress_list_head();
		for (nib_elt = ModernizedCProgram.nib_entry_head; nib_elt; nib_elt = generatedNext) {
			if (generatedSymmetric) {
				for (addr_elt = generatedAddress_list_head; addr_elt; addr_elt = generatedNext) {
					if (!((generatedIn_tmp_table & -1024) >> /* Check whether address is not already included with link status symmetric */1)) {
						ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, RFC5444_ADDRTLV_OTHER_NEIGHB, RFC5444_OTHERNEIGHB_SYMMETRIC, /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_in), /*Error: Function owner not recognized*/rfc5444_metric_encode(generatedMetric_out));
						generatedAddress.setIn_tmp_table((true));
					} 
				}
			} 
		}
		 generatedExpiration_time = lost_elt.getExpiration_time();
		for ((lost_elt) = (ModernizedCProgram.nib_lost_address_entry_head); (lost_elt) && (); (lost_elt) = /* Add lost addresses of neighbors to HELLO msg */lost_tmp) {
			if (ModernizedCProgram.timex_cmp(generatedExpiration_time, now) != 1) {
				/* Entry expired, remove it */lost_elt.rem_ln_entry();
			} else {
					if (!((generatedIn_tmp_table & /* Check if address is not already present in one of the temporary lists */-1024))) {
						ModernizedCProgram.nhdp_writer_add_addr(wr, generatedAddress, /* Address is not present in one of the lists, add it */RFC5444_ADDRTLV_OTHER_NEIGHB, RFC5444_OTHERNEIGHB_LOST, (false), (false));
					} 
			} 
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_nib_access);
	}
	public static void nib_reset_nb_entry_sym(nib_entry nib_entry,  now) {
		nhdp_addr_entry_t nb_elt = new nhdp_addr_entry_t();
		nib_entry.setSymmetric(0);
		nhdp_addr generatedAddress = nb_elt.getAddress();
		nhdp_addr_entry generatedNext = (nb_elt).getNext();
		nhdp_addr_entry generatedAddress_list_head = nib_entry.getAddress_list_head();
		for (nb_elt = generatedAddress_list_head; nb_elt; nb_elt = generatedNext) {
			if (ModernizedCProgram.add_lost_neighbor_address(generatedAddress, now) == -/* Add a Lost Neighbor Tuple for each address of the neighbor */1/* Insufficient memory */) {
				return /*Error: Unsupported expression*/;
			} 
		}
	}
	public static void rem_nib_entry(nib_entry nib_entry,  now) {
		ModernizedCProgram.clear_nb_addresses(nib_entry, now);
		nib_entry generatedNext = _tmp.getNext();
		do {
			int _tmp;
			if ((ModernizedCProgram.nib_entry_head) == (nib_entry)) {
				(ModernizedCProgram.nib_entry_head) = (ModernizedCProgram.nib_entry_head).getNext();
			} else {
					_tmp = ModernizedCProgram.nib_entry_head;
					while (generatedNext && (generatedNext != (nib_entry))) {
						_tmp = generatedNext;
					}
					if (generatedNext) {
						_tmp.setNext((generatedNext));
					} 
			} 
		} while (0);
		ModernizedCProgram.free(nib_entry/**
		 * Clear address list of a Neighbor Tuple and add Lost Neighbor Tuple for addresses
		 * no longer used by this neighbor
		 */);
	}
	public static void clear_nb_addresses(nib_entry nib_entry,  now) {
		nhdp_addr_entry_t nib_elt = new nhdp_addr_entry_t();
		nhdp_addr_entry_t nib_tmp = new nhdp_addr_entry_t();
		nhdp_addr generatedAddress = nib_elt.getAddress();
		Object generatedIn_tmp_table = generatedAddress.getIn_tmp_table();
		Object generatedUsg_count = generatedAddress.getUsg_count();
		Object generatedSymmetric = nib_entry.getSymmetric();
		nhdp_addr_entry generatedAddress_list_head = nib_entry.getAddress_list_head();
		for ((nib_elt) = (generatedAddress_list_head); (nib_elt) && (); (nib_elt) = nib_tmp) {
			if (!((generatedIn_tmp_table & -1024) >> /* Check whether address is still present in the new neighbor address list */5/* Address is not in the newly received address list of the neighbor */)) {
				generatedIn_tmp_table |=  (/* Add it to the Removed Address List */true);
				generatedUsg_count++;
				if (generatedSymmetric) {
					ModernizedCProgram.add_lost_neighbor_address(generatedAddress, /* Additionally create a Lost Neighbor Tuple for symmetric neighbors */now);
				} 
			} 
			/* Free the address entry */nib_elt.nhdp_free_addr_entry();
		}
		nib_entry.setAddress_list_head(NULL/**
		 * Add or update a Lost Neighbor Tuple
		 */);
	}
	public static int add_lost_neighbor_address(nhdp_addr lost_addr,  now) {
		nib_lost_address_entry_t elt = new nib_lost_address_entry_t();
		timex_t n_hold = ModernizedCProgram.timex_from_uint64(((uint64_t)((3 * (true)))) * (true));
		nhdp_addr generatedAddress = elt.getAddress();
		 generatedExpiration_time = elt.getExpiration_time();
		nib_lost_address_entry generatedNext = (elt).getNext();
		for (elt = ModernizedCProgram.nib_lost_address_entry_head; elt; elt = generatedNext) {
			if (generatedAddress == lost_addr) {
				if (ModernizedCProgram.timex_cmp(generatedExpiration_time, now) == -/* Existing entry for this address, no need to add a new one */1) {
					elt.setExpiration_time(ModernizedCProgram.timex_add(now, /* Entry expired, so just update expiration time */n_hold));
				} 
				return 0;
			} 
		}
		elt = ModernizedCProgram.malloc(/*Error: Unsupported expression*//* No existing entry, create a new one */);
		if (!elt) {
			return -/* Insufficient memory */1;
		} 
		Object generatedUsg_count = lost_addr.getUsg_count();
		generatedUsg_count++;
		elt.setAddress(lost_addr);
		elt.setExpiration_time(ModernizedCProgram.timex_add(now, n_hold));
		do {
			(elt).setNext(ModernizedCProgram.nib_lost_address_entry_head);
			ModernizedCProgram.nib_lost_address_entry_head = elt;
		} while (0);
		return 0/**
		 * Remove a given Lost Neighbor Tuple
		 */;
	}
	public static Object _exp_backoff_retrans_timer_factor(Object ns_sent, Object retrans_timer, Object factor) {
		((NDP_MIN_RANDOM_FACTOR <= factor) ? (Object)0 : /*Error: Function owner not recognized*/_assert("NDP_MIN_RANDOM_FACTOR <= factor", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\_nib-arsm.h", 107));
		((factor < NDP_MAX_RANDOM_FACTOR) ? (Object)0 : /*Error: Function owner not recognized*/_assert("factor < NDP_MAX_RANDOM_FACTOR", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\_nib-arsm.h", 108));
		((ns_sent <= NDP_MAX_NS_NUMOF) ? (Object)0 : /*Error: Function owner not recognized*/_assert("ns_sent <= NDP_MAX_NS_NUMOF", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\RIOT\\src\\_nib-arsm.h", 109/* backoff according to  https://tools.ietf.org/html/rfc7048 with
		     * BACKOFF_MULTIPLE == 2 */));
		uint32_t res = (uint32_t)(((uint64_t)(((uint32_t)1) << ns_sent) * retrans_timer * factor) / US_PER_MS);
		if (res > /* random factors were statically multiplied with 1000 */NDP_MAX_RETRANS_TIMER_MS) {
			res = NDP_MAX_RETRANS_TIMER_MS;
		} 
		return res/**
		 * @brief   Handler for @ref GNRC_IPV6_NIB_SND_UC_NS and
		 *          @ref GNRC_IPV6_NIB_SND_UC_NS event handler
		 *
		 * @param[in] nbr   Neighbor to send the neighbor solicitation to.
		 */;
	}
	/**
	 * @brief   Handler for @ref GNRC_IPV6_NIB_DELAY_TIMEOUT and
	 *          @ref GNRC_IPV6_NIB_REACH_TIMEOUT event handler
	 *
	 * @param[in] nbr   Neighbor to handle the state timeout for to.
	 */
	/**
	 * @brief   Probes neighbor with neighbor solicitations
	 *
	 * @param[in] nbr   Neighbor to probe.
	 * @param[in] reset Reset probe counter.
	 */
	/**
	 * @brief   Handles advertised link-layer information
	 *
	 * This can either be an TL2AO or for a link-layer without addresses just a
	 * neighbor advertisement.
	 *
	 * @param[in] netif     Interface the link-layer information was advertised
	 *                      over.
	 * @param[in] nce       Neighbor cache entry that is updated by the advertised
	 *                      link-layer information.
	 * @param[in] icmpv6    The ICMPv6 message (neighbor advertisement or redirect
	 *                      message) that carries the link-layer information.
	 * @param[in] tl2ao     The TL2AO carrying the link-layer information. May be
	 *                      NULL for link-layers without addresses.
	 */
	/**
	 * @brief   Recalculates the (randomized) reachable time of on a network
	 *          interface.
	 *
	 * @see [RFC 4861, section 6.3.4](https://tools.ietf.org/html/rfc4861#section-6.3.4)
	 *
	 * @param[in] netif Interface to set reachable time for.
	 */
	/**
	 * @brief   Sets a neighbor cache entry reachable and starts the required
	 *          event timers
	 *
	 * @param[in] netif Interface to the NCE
	 * @param[in] nce   The neighbor cache entry to set reachable
	 */
	/**
	 * @brief   Initializes interface for address registration state machine
	 *
	 * @param[in] netif An interface
	 */
	/**
	 * @brief   Gets neighbor unreachability state of a neighbor
	 *
	 * @param[in] nbr   Neighbor cache entry representing the neighbor.
	 *
	 * @return  Neighbor unreachability state of the @p nbr.
	 */
	/**
	 * @brief   Sets neighbor unreachablility state of a neighbor
	 *
	 * @param[in] netif The network interface (to signal routing protocol using
	 *                  gnrc_netif_t::ipv6::route_info_cb())
	 * @param[in] nbr   Neighbor cache entry representing the neighbor.
	 * @param[in] state Neighbor unreachability state for the neighbor.
	 */
	/**
	 * @brief   Checks if a node is in a reachable state
	 *
	 * A node is reachable if it is not in NUD state UNREACHABLE or INCOMPLETE
	 *
	 * @param[in] entry A node.
	 *
	 * @return  true, if @p entry is in a reachable state.
	 * @return  false, if @p entry is not in a reachable state.
	 */
	/* GNRC_IPV6_NIB_CONF_ARSM || defined(DOXYGEN) */
	/* GNRC_IPV6_NIB_CONF_ARSM || defined(DOXYGEN) */
	/* PRIV_NIB_ARSM_H */
	/** @} */
	/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C */
	public static int _gnrc_ipv6_nib(int argc, byte[][] argv) {
		int res = 1;
		if ((argc < 2) || (/*Error: Function owner not recognized*/strcmp(argv[1], "help") == 0)) {
			ModernizedCProgram._usage(argv);
			res = 0;
		}  else if (/*Error: Function owner not recognized*/strcmp(argv[1], "neigh") == 0) {
			res = ModernizedCProgram._nib_neigh(argc, argv);
		}  else if (/*Error: Function owner not recognized*/strcmp(argv[1], "prefix") == 0) {
			res = ModernizedCProgram._nib_prefix(argc, argv);
		}  else if (/*Error: Function owner not recognized*/strcmp(argv[1], "route") == 0) {
			res = ModernizedCProgram._nib_route(argc, argv);
		} else {
				ModernizedCProgram._usage(/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C */argv);
		} 
		return res;
	}
	public static void _usage_nib_neigh(byte[][] argv) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s %s [show|add|del|help]\n", argv[0], argv[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       %s %s add <iface> <ipv6 addr> [<l2 addr>]\n", argv[0], argv[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       %s %s del <iface> <ipv6 addr>\n", argv[0], argv[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       %s %s show [iface]\n", argv[0], argv[1]);
	}
	public static void _usage_nib_prefix(byte[][] argv) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s %s [show|add|del|help]\n", argv[0], argv[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       %s %s add <iface> <prefix>[/<prefix_len>] [<valid in sec>] [<pref in sec>]\n", argv[0], argv[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       %s %s del <iface> <prefix>[/<prefix_len>]\n", argv[0], argv[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       %s %s show [iface]\n", argv[0], argv[1]);
	}
	public static void _usage_nib_route(byte[][] argv) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("usage: %s %s [show|add|del|help]\n", argv[0], argv[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       %s %s add <iface> <prefix>[/<prefix_len>] <next_hop> [<ltime in sec>]\n", argv[0], argv[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       %s %s del <iface> <prefix>[/<prefix_len>]\n", argv[0], argv[1]);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("       %s %s show [iface]\n", argv[0], argv[1]);
	}
	public static Object _get_iface(int iface) {
		return (iface <= ((int)/* To prevent integer overflow we can't use pid_is_valid() since it
		      * itself would cause an overflow due to the cast to `kernel_pid_t` */KERNEL_PID_LAST)) ? /*Error: Function owner not recognized*/gnrc_netif_get_by_pid(iface) : ((Object)0);
	}
	public static int _nib_neigh(int argc, byte[][] argv) {
		if ((argc == 2) || (/*Error: Function owner not recognized*/strcmp(argv[2], "show") == 0)) {
			 entry = new ();
			Object state = ((Object)0);
			int iface = -1024;
			if (argc > 3) {
				iface = /*Error: Function owner not recognized*/atoi(argv[3]);
			} 
			while (/*Error: Function owner not recognized*/gnrc_ipv6_nib_nc_iter(iface, state, entry)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_nib_nc_print(entry);
			}
		}  else if ((argc > 2) && (/*Error: Function owner not recognized*/strcmp(argv[2], "help") == 0)) {
			ModernizedCProgram._usage_nib_neigh(argv);
		}  else if ((argc > 4) && (/*Error: Function owner not recognized*/strcmp(argv[2], "add") == 0)) {
			 ipv6_addr = new ();
			[] l2addr = new ();
			size_t l2addr_len = 0;
			int iface = /*Error: Function owner not recognized*/atoi(argv[3]);
			if (ModernizedCProgram._get_iface(iface) == ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Interface %u does not exist\n", iface);
				return 1;
			} 
			if (ModernizedCProgram.ipv6_addr_from_str(ipv6_addr, argv[4]) == ((Object)0)) {
				ModernizedCProgram._usage_nib_neigh(argv);
				return 1;
			} 
			if ((argc > /* TODO also check if interface supports link-layers or not */5) && (l2addr_len = /*Error: Function owner not recognized*/gnrc_netif_addr_from_str(argv[5], l2addr)) == 0) {
				ModernizedCProgram._usage_nib_neigh(argv);
				return 1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_nib_nc_set(ipv6_addr, iface, l2addr, l2addr_len);
		}  else if ((argc > 3) && (/*Error: Function owner not recognized*/strcmp(argv[2], "del") == 0)) {
			 ipv6_addr = new ();
			int iface = /*Error: Function owner not recognized*/atoi(argv[3]);
			if (ModernizedCProgram._get_iface(iface) == ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Interface %u does not exist\n", iface);
				return 1;
			} 
			if (ModernizedCProgram.ipv6_addr_from_str(ipv6_addr, argv[4]) == ((Object)0)) {
				ModernizedCProgram._usage_nib_neigh(argv);
				return 1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_nib_nc_del(ipv6_addr, iface);
		} else {
				ModernizedCProgram._usage_nib_neigh(argv);
				return 1;
		} 
		return 0;
	}
	public static int _nib_prefix(int argc, byte[][] argv) {
		if ((argc == 2) || (/*Error: Function owner not recognized*/strcmp(argv[2], "show") == 0)) {
			 entry = new ();
			Object state = ((Object)0);
			int iface = -1024;
			if (argc > 3) {
				iface = /*Error: Function owner not recognized*/atoi(argv[3]);
				if (ModernizedCProgram._get_iface(iface) == ((Object)0)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Interface %u does not exist\n", iface);
					return 1;
				} 
			} 
			while (/*Error: Function owner not recognized*/gnrc_ipv6_nib_pl_iter(iface, state, entry)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_nib_pl_print(entry);
			}
		}  else if ((argc > 2) && (/*Error: Function owner not recognized*/strcmp(argv[2], "help") == 0)) {
			ModernizedCProgram._usage_nib_prefix(argv);
		}  else if ((argc > 4) && (/*Error: Function owner not recognized*/strcmp(argv[2], "add") == 0)) {
			 pfx = new ();
			int iface = /*Error: Function owner not recognized*/atoi(argv[3]);
			int pfx_len = /*Error: Function owner not recognized*/ipv6_addr_split_prefix(argv[4]);
			 valid_ltime = UINT32_MAX;
			 pref_ltime = UINT32_MAX;
			if (ModernizedCProgram._get_iface(iface) == ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Interface %u does not exist\n", iface);
				return 1;
			} 
			if (ModernizedCProgram.ipv6_addr_from_str(pfx, argv[4]) == ((Object)0)) {
				ModernizedCProgram._usage_nib_prefix(argv);
				return 1;
			} 
			if (argc > 5) {
				 ltime_ms = /*Error: Function owner not recognized*/atoi(argv[5]);
				valid_ltime = (ltime_ms > UINT32_MAX / MS_PER_SEC) ? UINT32_MAX - 1 : ltime_ms * MS_PER_SEC;
			} 
			if (argc > 6) {
				 ltime_ms = /*Error: Function owner not recognized*/atoi(argv[6]);
				pref_ltime = (ltime_ms > UINT32_MAX / MS_PER_SEC) ? UINT32_MAX - 1 : ltime_ms * MS_PER_SEC;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_nib_pl_set(iface, pfx, pfx_len, valid_ltime, pref_ltime);
		}  else if ((argc > 4) && (/*Error: Function owner not recognized*/strcmp(argv[2], "del") == 0)) {
			 pfx = new ();
			int iface = /*Error: Function owner not recognized*/atoi(argv[3]);
			int pfx_len = /*Error: Function owner not recognized*/ipv6_addr_split_prefix(argv[4]);
			if (ModernizedCProgram._get_iface(iface) == ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Interface %u does not exist\n", iface);
				return 1;
			} 
			if (ModernizedCProgram.ipv6_addr_from_str(pfx, argv[4]) == ((Object)0)) {
				ModernizedCProgram._usage_nib_prefix(argv);
				return 1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_nib_pl_del(iface, pfx, pfx_len);
		} else {
				ModernizedCProgram._usage_nib_prefix(argv);
				return 1;
		} 
		return 0;
	}
	public static int _nib_route(int argc, byte[][] argv) {
		if ((argc == 2) || (/*Error: Function owner not recognized*/strcmp(argv[2], "show") == 0)) {
			 entry = new ();
			Object state = ((Object)0);
			int iface = -1024;
			if (argc > 3) {
				iface = /*Error: Function owner not recognized*/atoi(argv[3]);
				if (ModernizedCProgram._get_iface(iface) == ((Object)0)) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Interface %u does not exist\n", iface);
					return 1;
				} 
			} 
			while (/*Error: Function owner not recognized*/gnrc_ipv6_nib_ft_iter(((Object)0), iface, state, entry)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_nib_ft_print(entry);
			}
		}  else if ((argc > 2) && (/*Error: Function owner not recognized*/strcmp(argv[2], "help") == 0)) {
			ModernizedCProgram._usage_nib_route(argv);
		}  else if ((argc > 5) && (/*Error: Function owner not recognized*/strcmp(argv[2], "add") == 0)) {
			 pfx = IPV6_ADDR_UNSPECIFIED;
			 next_hop = new ();
			int iface = /*Error: Function owner not recognized*/atoi(argv[3]);
			int pfx_len = /*Error: Function owner not recognized*/ipv6_addr_split_prefix(argv[4]);
			 ltime = 0;
			if (ModernizedCProgram._get_iface(iface) == ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Interface %u does not exist\n", iface);
				return 1;
			} 
			if (ModernizedCProgram.ipv6_addr_from_str(pfx, argv[4]) == ((Object)0/* check if string equals "default"
			             * => keep pfx as unspecified address == default route */)) {
				if (/*Error: Function owner not recognized*/strcmp(argv[4], "default") != 0) {
					ModernizedCProgram._usage_nib_route(argv);
					return 1;
				} 
			} 
			if (ModernizedCProgram.ipv6_addr_from_str(next_hop, argv[5]) == ((Object)0)) {
				ModernizedCProgram._usage_nib_route(argv);
				return 1;
			} 
			if (argc > 6) {
				ltime = /*Error: Function owner not recognized*/atoi(argv[6]);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_nib_ft_add(pfx, pfx_len, next_hop, iface, ltime);
		}  else if ((argc > 4) && (/*Error: Function owner not recognized*/strcmp(argv[2], "del") == 0)) {
			 pfx = new ();
			int pfx_len = /*Error: Function owner not recognized*/ipv6_addr_split_prefix(argv[4]);
			if (ModernizedCProgram.ipv6_addr_from_str(pfx, argv[4]) == ((Object)0)) {
				ModernizedCProgram._usage_nib_route(argv);
				return 1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/gnrc_ipv6_nib_ft_del(pfx, pfx_len);
		} else {
				ModernizedCProgram._usage_nib_route(argv);
				return 1;
		} 
		return 0;
	}
	/* GNRC_IPV6_NIB_CONF_6LBR */
	/* GNRC_IPV6_NIB_CONF_6LBR */
	/* check addr */
	/* GNRC_IPV6_NIB_CONF_6LBR */
	/* GNRC_IPV6_NIB_CONF_MULTIHOP_P6C */
	/** @} */
	/*
	 * Copyright (C) 2019 Koen Zandberg
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 */
	/**
	 * @ingroup usbus_cdc_ecm
	 * @{
	 * @file Netdev implementation for ethernet control model
	 *
	 * @author  Koen Zandberg <koen@bergzand.net>
	 * @}
	 */
	public static void _signal_rx_flush(Object cdcecm) {
		cdcecm.getUsbus().usbus_event_post(cdcecm.getRx_flush());
	}
	public static void _signal_tx_xmit(Object cdcecm) {
		cdcecm.getUsbus().usbus_event_post(cdcecm.getTx_xmit());
	}
	public static Object _netdev_to_cdcecm(Object netdev) {
		return /*Error: Function owner not recognized*/container_of(netdev, usbus_cdcecm_device_t, netdev);
	}
	public static void cdcecm_netdev_setup(Object cdcecm) {
		cdcecm.getNetdev().setDriver(ModernizedCProgram.netdev_driver_cdcecm);
	}
	/**
	 * @brief set the @ref GNRC_LWMAC_TX_CONTINUE flag of the device
	 *
	 * @param[in] netif        ptr to the network interface
	 * @param[in] tx_continue  value for LWMAC tx-continue flag
	 *
	 */
	public static void gnrc_lwmac_set_tx_continue(Object netif, Object tx_continue) {
		if (tx_continue) {
			netif.getMac().getMac_info() |=  (true);
		} else {
				netif.getMac().getMac_info() &=  ~(true/**
				 * @brief get the @ref GNRC_LWMAC_TX_CONTINUE flag of the device
				 *
				 * @param[in] netif        ptr to the network interface
				 *
				 * @return                 true if tx continue
				 * @return                 false if tx will not continue
				 */);
		} 
	}
	public static Object gnrc_lwmac_get_tx_continue(Object netif) {
		return (netif.getMac().getMac_info() & (true/**
		 * @brief set the @ref GNRC_LWMAC_QUIT_TX flag of the device
		 *
		 * @param[in] netif        ptr to the network interface
		 * @param[in] quit_tx      value for @ref GNRC_LWMAC_QUIT_TX flag
		 *
		 */));
	}
	public static void gnrc_lwmac_set_quit_tx(Object netif, Object quit_tx) {
		if (quit_tx) {
			netif.getMac().getMac_info() |=  (true);
		} else {
				netif.getMac().getMac_info() &=  ~(true/**
				 * @brief get the @ref GNRC_LWMAC_QUIT_TX flag of the device
				 *
				 * @param[in] netif        ptr to the network interface
				 *
				 * @return                 true if quit tx
				 * @return                 false if will not quit tx
				 */);
		} 
	}
	public static Object gnrc_lwmac_get_quit_tx(Object netif) {
		return (netif.getMac().getMac_info() & (true/**
		 * @brief set the @ref GNRC_LWMAC_PHASE_BACKOFF flag of the device
		 *
		 * @param[in] netif        ptr to the network interface
		 * @param[in] backoff      value for LWMAC @ref GNRC_LWMAC_PHASE_BACKOFF flag
		 *
		 */));
	}
	public static void gnrc_lwmac_set_phase_backoff(Object netif, Object backoff) {
		if (backoff) {
			netif.getMac().getMac_info() |=  (true);
		} else {
				netif.getMac().getMac_info() &=  ~(true/**
				 * @brief get the @ref GNRC_LWMAC_PHASE_BACKOFF flag of the device
				 *
				 * @param[in] netif        ptr to the network interface
				 *
				 * @return                 true if will run phase-backoff
				 * @return                 false if will not run phase-backoff
				 */);
		} 
	}
	public static Object gnrc_lwmac_get_phase_backoff(Object netif) {
		return (netif.getMac().getMac_info() & (true/**
		 * @brief set the @ref GNRC_LWMAC_QUIT_RX flag of the device
		 *
		 * @param[in] netif        ptr to the network interface
		 * @param[in] quit_rx      value for LWMAC @ref GNRC_LWMAC_QUIT_RX flag
		 *
		 */));
	}
	public static void gnrc_lwmac_set_quit_rx(Object netif, Object quit_rx) {
		if (quit_rx) {
			netif.getMac().getMac_info() |=  (true);
		} else {
				netif.getMac().getMac_info() &=  ~(true/**
				 * @brief get the @ref GNRC_LWMAC_QUIT_RX flag of the device
				 *
				 * @param[in] netif        ptr to the network interface
				 *
				 * @return                 true if will quit rx
				 * @return                 false if will not quit rx
				 */);
		} 
	}
	public static Object gnrc_lwmac_get_quit_rx(Object netif) {
		return (netif.getMac().getMac_info() & (true/**
		 * @brief set the @ref GNRC_LWMAC_DUTYCYCLE_ACTIVE flag of LWMAC
		 *
		 * @param[in] netif        ptr to the network interface
		 * @param[in] active       value for LWMAC @ref GNRC_LWMAC_DUTYCYCLE_ACTIVE flag
		 *
		 */));
	}
	public static void gnrc_lwmac_set_dutycycle_active(Object netif, Object active) {
		if (active) {
			netif.getMac().getProt().getLwmac().getLwmac_info() |=  GNRC_LWMAC_DUTYCYCLE_ACTIVE;
		} else {
				netif.getMac().getProt().getLwmac().getLwmac_info() &=  ~GNRC_LWMAC_DUTYCYCLE_ACTIVE/**
				 * @brief get the @ref GNRC_LWMAC_DUTYCYCLE_ACTIVE flag of LWMAC
				 *
				 * @param[in] netif        ptr to the network interface
				 *
				 * @return                 true if active
				 * @return                 false if not active
				 */;
		} 
	}
	public static Object gnrc_lwmac_get_dutycycle_active(Object netif) {
		return (netif.getMac().getProt().getLwmac().getLwmac_info() & GNRC_LWMAC_DUTYCYCLE_ACTIVE/**
		 * @brief set the @ref GNRC_LWMAC_NEEDS_RESCHEDULE flag of LWMAC
		 *
		 * @param[in] netif        ptr to the network interface
		 * @param[in] reschedule   value for @ref GNRC_LWMAC_NEEDS_RESCHEDULE flag
		 *
		 */);
	}
	public static void gnrc_lwmac_set_reschedule(Object netif, Object reschedule) {
		if (reschedule) {
			netif.getMac().getProt().getLwmac().getLwmac_info() |=  GNRC_LWMAC_NEEDS_RESCHEDULE;
		} else {
				netif.getMac().getProt().getLwmac().getLwmac_info() &=  ~GNRC_LWMAC_NEEDS_RESCHEDULE/**
				 * @brief get the @ref GNRC_LWMAC_NEEDS_RESCHEDULE flag of LWMAC
				 *
				 * @param[in] netif        ptr to the network interface
				 *
				 * @return                 true if needs rescheduling
				 * @return                 false if no need for rescheduling
				 */;
		} 
	}
	public static Object gnrc_lwmac_get_reschedule(Object netif) {
		return (netif.getMac().getProt().getLwmac().getLwmac_info() & GNRC_LWMAC_NEEDS_RESCHEDULE/**
		 * @brief send a @ref net_gnrc_pkt "packet" over the network interface in LWMAC
		 *
		 * @internal
		 *
		 * @pre `netif != NULL && pkt != NULL`
		 *
		 * @note The function re-formats the content of @p pkt to a format expected
		 *       by the netdev_driver_t::send() method of gnrc_netif_t::dev and
		 *       releases the packet before returning (so no additional release
		 *       should be required after calling this method).
		 *
		 * @param[in] netif The network interface.
		 * @param[in] pkt   A packet to send.
		 *
		 * @return  The number of bytes actually sent on success
		 * @return  -EBADMSG, if the @ref net_gnrc_netif_hdr in @p pkt is missing
		 *          or is in an unexpected format.
		 * @return  -ENOTSUP, if sending @p pkt in the given format isn't supported
		 *          (e.g. empty payload with Ethernet).
		 * @return  Any negative error code reported by gnrc_netif_t::dev.
		 */);
	}
	public static Object _gnrc_lwmac_ticks_to_phase(Object ticks) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/assert(GNRC_LWMAC_WAKEUP_INTERVAL_US != 0);
		return (ticks % /*Error: Function owner not recognized*/RTT_US_TO_TICKS(GNRC_LWMAC_WAKEUP_INTERVAL_US/**
		 * @brief Get device's current phase
		 *
		 * @return               device phase
		 */));
	}
	public static Object _gnrc_lwmac_phase_now() {
		return ModernizedCProgram._gnrc_lwmac_ticks_to_phase(/*Error: Function owner not recognized*/rtt_get_counter());
	}
	public static Object _gnrc_lwmac_ticks_until_phase(Object phase) {
		long tmp = phase - ModernizedCProgram._gnrc_lwmac_phase_now();
		if (tmp < 0) {
			tmp += /*Error: Function owner not recognized*/RTT_US_TO_TICKS(/* Phase in next interval */GNRC_LWMAC_WAKEUP_INTERVAL_US);
		} 
		return (uint32_t)tmp/**
		 * @brief Store the received packet to the dispatch buffer and remove possible
		 *        duplicate packets.
		 *
		 * @param[in,out]   buffer      RX dispatch packet buffer
		 * @param[in]       pkt         received packet
		 *
		 * @return                      0 if correctly stored
		 * @return                      <0 on error
		 */;
	}
}
