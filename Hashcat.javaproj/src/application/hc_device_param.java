package application;

public class hc_device_param {
	private int device_id;
	private int device_id_alias_cnt;
	private Object device_id_alias_buf;
	private Object pcie_bus;
	private Object pcie_device;
	private Object pcie_function;
	private boolean skipped;
	private boolean skipped_warning;
	private Object device_processors;
	private Object device_maxmem_alloc;
	private Object device_global_mem;
	private Object device_available_mem;
	private Object device_maxclock_frequency;
	private Object device_maxworkgroup_size;
	private Object device_local_mem_size;
	private int device_local_mem_type;
	private Byte device_name;
	private int sm_major;
	private int sm_minor;
	private Object kernel_exec_timeout;
	private st_status_rc st_status;
	private int vector_width;
	private Object kernel_wgs1;
	private Object kernel_wgs12;
	private Object kernel_wgs2;
	private Object kernel_wgs23;
	private Object kernel_wgs3;
	private Object kernel_wgs4;
	private Object kernel_wgs_init2;
	private Object kernel_wgs_loop2;
	private Object kernel_wgs_mp;
	private Object kernel_wgs_mp_l;
	private Object kernel_wgs_mp_r;
	private Object kernel_wgs_amp;
	private Object kernel_wgs_tm;
	private Object kernel_wgs_memset;
	private Object kernel_wgs_atinit;
	private Object kernel_wgs_decompress;
	private Object kernel_wgs_aux1;
	private Object kernel_wgs_aux2;
	private Object kernel_wgs_aux3;
	private Object kernel_wgs_aux4;
	private Object kernel_preferred_wgs_multiple1;
	private Object kernel_preferred_wgs_multiple12;
	private Object kernel_preferred_wgs_multiple2;
	private Object kernel_preferred_wgs_multiple23;
	private Object kernel_preferred_wgs_multiple3;
	private Object kernel_preferred_wgs_multiple4;
	private Object kernel_preferred_wgs_multiple_init2;
	private Object kernel_preferred_wgs_multiple_loop2;
	private Object kernel_preferred_wgs_multiple_mp;
	private Object kernel_preferred_wgs_multiple_mp_l;
	private Object kernel_preferred_wgs_multiple_mp_r;
	private Object kernel_preferred_wgs_multiple_amp;
	private Object kernel_preferred_wgs_multiple_tm;
	private Object kernel_preferred_wgs_multiple_memset;
	private Object kernel_preferred_wgs_multiple_atinit;
	private Object kernel_preferred_wgs_multiple_decompress;
	private Object kernel_preferred_wgs_multiple_aux1;
	private Object kernel_preferred_wgs_multiple_aux2;
	private Object kernel_preferred_wgs_multiple_aux3;
	private Object kernel_preferred_wgs_multiple_aux4;
	private Object kernel_local_mem_size1;
	private Object kernel_local_mem_size12;
	private Object kernel_local_mem_size2;
	private Object kernel_local_mem_size23;
	private Object kernel_local_mem_size3;
	private Object kernel_local_mem_size4;
	private Object kernel_local_mem_size_init2;
	private Object kernel_local_mem_size_loop2;
	private Object kernel_local_mem_size_mp;
	private Object kernel_local_mem_size_mp_l;
	private Object kernel_local_mem_size_mp_r;
	private Object kernel_local_mem_size_amp;
	private Object kernel_local_mem_size_tm;
	private Object kernel_local_mem_size_memset;
	private Object kernel_local_mem_size_atinit;
	private Object kernel_local_mem_size_decompress;
	private Object kernel_local_mem_size_aux1;
	private Object kernel_local_mem_size_aux2;
	private Object kernel_local_mem_size_aux3;
	private Object kernel_local_mem_size_aux4;
	private Object kernel_accel;
	private Object kernel_accel_prev;
	private Object kernel_accel_min;
	private Object kernel_accel_max;
	private Object kernel_loops;
	private Object kernel_loops_prev;
	private Object kernel_loops_min;
	private Object kernel_loops_max;
	private Object kernel_loops_min_sav;
	private Object kernel_loops_max_sav;
	private Object kernel_threads;
	private Object kernel_threads_min;
	private Object kernel_threads_max;
	private Object kernel_power;
	private Object hardware_power;
	private Object size_pws;
	private Object size_pws_amp;
	private Object size_pws_comp;
	private Object size_pws_idx;
	private Object size_pws_pre;
	private Object size_pws_base;
	private Object size_tmps;
	private Object size_hooks;
	private Object size_bfs;
	private Object size_combs;
	private Object size_rules;
	private Object size_rules_c;
	private Object size_root_css;
	private Object size_markov_css;
	private Object size_digests;
	private Object size_salts;
	private Object size_esalts;
	private Object size_shown;
	private Object size_results;
	private Object size_plains;
	private Object size_st_digests;
	private Object size_st_salts;
	private Object size_st_esalts;
	private Object size_tm;
	private Object extra_buffer_size;
	private Byte scratch_buf;
	private hc_fp combs_fp;
	private pw[] combs_buf;
	private Object hooks_buf;
	private pw_idx pws_idx;
	private Object pws_comp;
	private Object pws_cnt;
	private pw_pre pws_pre_buf;
	private Object pws_pre_cnt;
	private pw_pre pws_base_buf;
	private Object pws_base_cnt;
	private Object words_off;
	private Object words_done;
	private Object outerloop_pos;
	private Object outerloop_left;
	private double outerloop_msec;
	private double outerloop_multi;
	private Object innerloop_pos;
	private Object innerloop_left;
	private Object exec_pos;
	private Object exec_msec;
	private Object exec_us_prev1;
	private Object exec_us_prev2;
	private Object exec_us_prev3;
	private Object exec_us_prev4;
	private Object exec_us_prev_init2;
	private Object exec_us_prev_loop2;
	private Object exec_us_prev_aux1;
	private Object exec_us_prev_aux2;
	private Object exec_us_prev_aux3;
	private Object exec_us_prev_aux4;
	private Object speed_pos;
	private Object speed_cnt;
	private Object speed_msec;
	private boolean speed_only_finish;
	private Object timer_speed;
	private boolean has_vadd3;
	private boolean has_vbfe;
	private boolean has_vperm;
	private boolean has_bfe;
	private boolean has_lop3;
	private boolean has_mov64;
	private boolean has_prmt;
	private double spin_damp;
	private Object kernel_params;
	private Object kernel_params_mp;
	private Object kernel_params_mp_r;
	private Object kernel_params_mp_l;
	private Object kernel_params_amp;
	private Object kernel_params_tm;
	private Object kernel_params_memset;
	private Object kernel_params_atinit;
	private Object kernel_params_decompress;
	private Object kernel_params_buf32;
	private Object kernel_params_buf64;
	private Object kernel_params_mp_buf32;
	private Object kernel_params_mp_buf64;
	private Object kernel_params_mp_r_buf32;
	private Object kernel_params_mp_r_buf64;
	private Object kernel_params_mp_l_buf32;
	private Object kernel_params_mp_l_buf64;
	private Object kernel_params_amp_buf32;
	private Object kernel_params_amp_buf64;
	private Object kernel_params_memset_buf32;
	private Object kernel_params_memset_buf64;
	private Object kernel_params_atinit_buf32;
	private Object kernel_params_atinit_buf64;
	private Object kernel_params_decompress_buf32;
	private Object kernel_params_decompress_buf64;
	private boolean is_cuda;
	private int cuda_warp_size;
	private Object cuda_device;
	private Object cuda_context;
	private Object cuda_stream;
	private Object cuda_event1;
	private Object cuda_event2;
	private Object cuda_module;
	private Object cuda_module_mp;
	private Object cuda_module_amp;
	private Object cuda_function1;
	private Object cuda_function12;
	private Object cuda_function2;
	private Object cuda_function23;
	private Object cuda_function3;
	private Object cuda_function4;
	private Object cuda_function_init2;
	private Object cuda_function_loop2;
	private Object cuda_function_mp;
	private Object cuda_function_mp_l;
	private Object cuda_function_mp_r;
	private Object cuda_function_amp;
	private Object cuda_function_tm;
	private Object cuda_function_memset;
	private Object cuda_function_atinit;
	private Object cuda_function_decompress;
	private Object cuda_function_aux1;
	private Object cuda_function_aux2;
	private Object cuda_function_aux3;
	private Object cuda_function_aux4;
	private Object cuda_d_pws_buf;
	private Object cuda_d_pws_amp_buf;
	private Object cuda_d_pws_comp_buf;
	private Object cuda_d_pws_idx;
	private Object cuda_d_words_buf_l;
	private Object cuda_d_words_buf_r;
	private Object cuda_d_rules;
	private Object cuda_d_rules_c;
	private Object cuda_d_combs;
	private Object cuda_d_combs_c;
	private Object cuda_d_bfs;
	private Object cuda_d_bfs_c;
	private Object cuda_d_tm_c;
	private Object cuda_d_bitmap_s1_a;
	private Object cuda_d_bitmap_s1_b;
	private Object cuda_d_bitmap_s1_c;
	private Object cuda_d_bitmap_s1_d;
	private Object cuda_d_bitmap_s2_a;
	private Object cuda_d_bitmap_s2_b;
	private Object cuda_d_bitmap_s2_c;
	private Object cuda_d_bitmap_s2_d;
	private Object cuda_d_plain_bufs;
	private Object cuda_d_digests_buf;
	private Object cuda_d_digests_shown;
	private Object cuda_d_salt_bufs;
	private Object cuda_d_esalt_bufs;
	private Object cuda_d_tmps;
	private Object cuda_d_hooks;
	private Object cuda_d_result;
	private Object cuda_d_extra0_buf;
	private Object cuda_d_extra1_buf;
	private Object cuda_d_extra2_buf;
	private Object cuda_d_extra3_buf;
	private Object cuda_d_root_css_buf;
	private Object cuda_d_markov_css_buf;
	private Object cuda_d_st_digests_buf;
	private Object cuda_d_st_salts_buf;
	private Object cuda_d_st_esalts_buf;
	private boolean is_opencl;
	private Byte opencl_driver_version;
	private Byte opencl_device_vendor;
	private Byte opencl_device_version;
	private Byte opencl_device_c_version;
	private Object opencl_device_type;
	private Object opencl_device_vendor_id;
	private Object opencl_platform_vendor_id;
	private Object opencl_device;
	
	public hc_device_param(int device_id, int device_id_alias_cnt, Object device_id_alias_buf, Object pcie_bus, Object pcie_device, Object pcie_function, boolean skipped, boolean skipped_warning, Object device_processors, Object device_maxmem_alloc, Object device_global_mem, Object device_available_mem, Object device_maxclock_frequency, Object device_maxworkgroup_size, Object device_local_mem_size, int device_local_mem_type, Byte device_name, int sm_major, int sm_minor, Object kernel_exec_timeout, st_status_rc st_status, int vector_width, Object kernel_wgs1, Object kernel_wgs12, Object kernel_wgs2, Object kernel_wgs23, Object kernel_wgs3, Object kernel_wgs4, Object kernel_wgs_init2, Object kernel_wgs_loop2, Object kernel_wgs_mp, Object kernel_wgs_mp_l, Object kernel_wgs_mp_r, Object kernel_wgs_amp, Object kernel_wgs_tm, Object kernel_wgs_memset, Object kernel_wgs_atinit, Object kernel_wgs_decompress, Object kernel_wgs_aux1, Object kernel_wgs_aux2, Object kernel_wgs_aux3, Object kernel_wgs_aux4, Object kernel_preferred_wgs_multiple1, Object kernel_preferred_wgs_multiple12, Object kernel_preferred_wgs_multiple2, Object kernel_preferred_wgs_multiple23, Object kernel_preferred_wgs_multiple3, Object kernel_preferred_wgs_multiple4, Object kernel_preferred_wgs_multiple_init2, Object kernel_preferred_wgs_multiple_loop2, Object kernel_preferred_wgs_multiple_mp, Object kernel_preferred_wgs_multiple_mp_l, Object kernel_preferred_wgs_multiple_mp_r, Object kernel_preferred_wgs_multiple_amp, Object kernel_preferred_wgs_multiple_tm, Object kernel_preferred_wgs_multiple_memset, Object kernel_preferred_wgs_multiple_atinit, Object kernel_preferred_wgs_multiple_decompress, Object kernel_preferred_wgs_multiple_aux1, Object kernel_preferred_wgs_multiple_aux2, Object kernel_preferred_wgs_multiple_aux3, Object kernel_preferred_wgs_multiple_aux4, Object kernel_local_mem_size1, Object kernel_local_mem_size12, Object kernel_local_mem_size2, Object kernel_local_mem_size23, Object kernel_local_mem_size3, Object kernel_local_mem_size4, Object kernel_local_mem_size_init2, Object kernel_local_mem_size_loop2, Object kernel_local_mem_size_mp, Object kernel_local_mem_size_mp_l, Object kernel_local_mem_size_mp_r, Object kernel_local_mem_size_amp, Object kernel_local_mem_size_tm, Object kernel_local_mem_size_memset, Object kernel_local_mem_size_atinit, Object kernel_local_mem_size_decompress, Object kernel_local_mem_size_aux1, Object kernel_local_mem_size_aux2, Object kernel_local_mem_size_aux3, Object kernel_local_mem_size_aux4, Object kernel_accel, Object kernel_accel_prev, Object kernel_accel_min, Object kernel_accel_max, Object kernel_loops, Object kernel_loops_prev, Object kernel_loops_min, Object kernel_loops_max, Object kernel_loops_min_sav, Object kernel_loops_max_sav, Object kernel_threads, Object kernel_threads_min, Object kernel_threads_max, Object kernel_power, Object hardware_power, Object size_pws, Object size_pws_amp, Object size_pws_comp, Object size_pws_idx, Object size_pws_pre, Object size_pws_base, Object size_tmps, Object size_hooks, Object size_bfs, Object size_combs, Object size_rules, Object size_rules_c, Object size_root_css, Object size_markov_css, Object size_digests, Object size_salts, Object size_esalts, Object size_shown, Object size_results, Object size_plains, Object size_st_digests, Object size_st_salts, Object size_st_esalts, Object size_tm, Object extra_buffer_size, Byte scratch_buf, hc_fp combs_fp, pw[] combs_buf, Object hooks_buf, pw_idx pws_idx, Object pws_comp, Object pws_cnt, pw_pre pws_pre_buf, Object pws_pre_cnt, pw_pre pws_base_buf, Object pws_base_cnt, Object words_off, Object words_done, Object outerloop_pos, Object outerloop_left, double outerloop_msec, double outerloop_multi, Object innerloop_pos, Object innerloop_left, Object exec_pos, Object exec_msec, Object exec_us_prev1, Object exec_us_prev2, Object exec_us_prev3, Object exec_us_prev4, Object exec_us_prev_init2, Object exec_us_prev_loop2, Object exec_us_prev_aux1, Object exec_us_prev_aux2, Object exec_us_prev_aux3, Object exec_us_prev_aux4, Object speed_pos, Object speed_cnt, Object speed_msec, boolean speed_only_finish, Object timer_speed, boolean has_vadd3, boolean has_vbfe, boolean has_vperm, boolean has_bfe, boolean has_lop3, boolean has_mov64, boolean has_prmt, double spin_damp, Object kernel_params, Object kernel_params_mp, Object kernel_params_mp_r, Object kernel_params_mp_l, Object kernel_params_amp, Object kernel_params_tm, Object kernel_params_memset, Object kernel_params_atinit, Object kernel_params_decompress, Object kernel_params_buf32, Object kernel_params_buf64, Object kernel_params_mp_buf32, Object kernel_params_mp_buf64, Object kernel_params_mp_r_buf32, Object kernel_params_mp_r_buf64, Object kernel_params_mp_l_buf32, Object kernel_params_mp_l_buf64, Object kernel_params_amp_buf32, Object kernel_params_amp_buf64, Object kernel_params_memset_buf32, Object kernel_params_memset_buf64, Object kernel_params_atinit_buf32, Object kernel_params_atinit_buf64, Object kernel_params_decompress_buf32, Object kernel_params_decompress_buf64, boolean is_cuda, int cuda_warp_size, Object cuda_device, Object cuda_context, Object cuda_stream, Object cuda_event1, Object cuda_event2, Object cuda_module, Object cuda_module_mp, Object cuda_module_amp, Object cuda_function1, Object cuda_function12, Object cuda_function2, Object cuda_function23, Object cuda_function3, Object cuda_function4, Object cuda_function_init2, Object cuda_function_loop2, Object cuda_function_mp, Object cuda_function_mp_l, Object cuda_function_mp_r, Object cuda_function_amp, Object cuda_function_tm, Object cuda_function_memset, Object cuda_function_atinit, Object cuda_function_decompress, Object cuda_function_aux1, Object cuda_function_aux2, Object cuda_function_aux3, Object cuda_function_aux4, Object cuda_d_pws_buf, Object cuda_d_pws_amp_buf, Object cuda_d_pws_comp_buf, Object cuda_d_pws_idx, Object cuda_d_words_buf_l, Object cuda_d_words_buf_r, Object cuda_d_rules, Object cuda_d_rules_c, Object cuda_d_combs, Object cuda_d_combs_c, Object cuda_d_bfs, Object cuda_d_bfs_c, Object cuda_d_tm_c, Object cuda_d_bitmap_s1_a, Object cuda_d_bitmap_s1_b, Object cuda_d_bitmap_s1_c, Object cuda_d_bitmap_s1_d, Object cuda_d_bitmap_s2_a, Object cuda_d_bitmap_s2_b, Object cuda_d_bitmap_s2_c, Object cuda_d_bitmap_s2_d, Object cuda_d_plain_bufs, Object cuda_d_digests_buf, Object cuda_d_digests_shown, Object cuda_d_salt_bufs, Object cuda_d_esalt_bufs, Object cuda_d_tmps, Object cuda_d_hooks, Object cuda_d_result, Object cuda_d_extra0_buf, Object cuda_d_extra1_buf, Object cuda_d_extra2_buf, Object cuda_d_extra3_buf, Object cuda_d_root_css_buf, Object cuda_d_markov_css_buf, Object cuda_d_st_digests_buf, Object cuda_d_st_salts_buf, Object cuda_d_st_esalts_buf, boolean is_opencl, Byte opencl_driver_version, Byte opencl_device_vendor, Byte opencl_device_version, Byte opencl_device_c_version, Object opencl_device_type, Object opencl_device_vendor_id, Object opencl_platform_vendor_id, Object opencl_device) {
		setDevice_id(device_id);
		setDevice_id_alias_cnt(device_id_alias_cnt);
		setDevice_id_alias_buf(device_id_alias_buf);
		setPcie_bus(pcie_bus);
		setPcie_device(pcie_device);
		setPcie_function(pcie_function);
		setSkipped(skipped);
		setSkipped_warning(skipped_warning);
		setDevice_processors(device_processors);
		setDevice_maxmem_alloc(device_maxmem_alloc);
		setDevice_global_mem(device_global_mem);
		setDevice_available_mem(device_available_mem);
		setDevice_maxclock_frequency(device_maxclock_frequency);
		setDevice_maxworkgroup_size(device_maxworkgroup_size);
		setDevice_local_mem_size(device_local_mem_size);
		setDevice_local_mem_type(device_local_mem_type);
		setDevice_name(device_name);
		setSm_major(sm_major);
		setSm_minor(sm_minor);
		setKernel_exec_timeout(kernel_exec_timeout);
		setSt_status(st_status);
		setVector_width(vector_width);
		setKernel_wgs1(kernel_wgs1);
		setKernel_wgs12(kernel_wgs12);
		setKernel_wgs2(kernel_wgs2);
		setKernel_wgs23(kernel_wgs23);
		setKernel_wgs3(kernel_wgs3);
		setKernel_wgs4(kernel_wgs4);
		setKernel_wgs_init2(kernel_wgs_init2);
		setKernel_wgs_loop2(kernel_wgs_loop2);
		setKernel_wgs_mp(kernel_wgs_mp);
		setKernel_wgs_mp_l(kernel_wgs_mp_l);
		setKernel_wgs_mp_r(kernel_wgs_mp_r);
		setKernel_wgs_amp(kernel_wgs_amp);
		setKernel_wgs_tm(kernel_wgs_tm);
		setKernel_wgs_memset(kernel_wgs_memset);
		setKernel_wgs_atinit(kernel_wgs_atinit);
		setKernel_wgs_decompress(kernel_wgs_decompress);
		setKernel_wgs_aux1(kernel_wgs_aux1);
		setKernel_wgs_aux2(kernel_wgs_aux2);
		setKernel_wgs_aux3(kernel_wgs_aux3);
		setKernel_wgs_aux4(kernel_wgs_aux4);
		setKernel_preferred_wgs_multiple1(kernel_preferred_wgs_multiple1);
		setKernel_preferred_wgs_multiple12(kernel_preferred_wgs_multiple12);
		setKernel_preferred_wgs_multiple2(kernel_preferred_wgs_multiple2);
		setKernel_preferred_wgs_multiple23(kernel_preferred_wgs_multiple23);
		setKernel_preferred_wgs_multiple3(kernel_preferred_wgs_multiple3);
		setKernel_preferred_wgs_multiple4(kernel_preferred_wgs_multiple4);
		setKernel_preferred_wgs_multiple_init2(kernel_preferred_wgs_multiple_init2);
		setKernel_preferred_wgs_multiple_loop2(kernel_preferred_wgs_multiple_loop2);
		setKernel_preferred_wgs_multiple_mp(kernel_preferred_wgs_multiple_mp);
		setKernel_preferred_wgs_multiple_mp_l(kernel_preferred_wgs_multiple_mp_l);
		setKernel_preferred_wgs_multiple_mp_r(kernel_preferred_wgs_multiple_mp_r);
		setKernel_preferred_wgs_multiple_amp(kernel_preferred_wgs_multiple_amp);
		setKernel_preferred_wgs_multiple_tm(kernel_preferred_wgs_multiple_tm);
		setKernel_preferred_wgs_multiple_memset(kernel_preferred_wgs_multiple_memset);
		setKernel_preferred_wgs_multiple_atinit(kernel_preferred_wgs_multiple_atinit);
		setKernel_preferred_wgs_multiple_decompress(kernel_preferred_wgs_multiple_decompress);
		setKernel_preferred_wgs_multiple_aux1(kernel_preferred_wgs_multiple_aux1);
		setKernel_preferred_wgs_multiple_aux2(kernel_preferred_wgs_multiple_aux2);
		setKernel_preferred_wgs_multiple_aux3(kernel_preferred_wgs_multiple_aux3);
		setKernel_preferred_wgs_multiple_aux4(kernel_preferred_wgs_multiple_aux4);
		setKernel_local_mem_size1(kernel_local_mem_size1);
		setKernel_local_mem_size12(kernel_local_mem_size12);
		setKernel_local_mem_size2(kernel_local_mem_size2);
		setKernel_local_mem_size23(kernel_local_mem_size23);
		setKernel_local_mem_size3(kernel_local_mem_size3);
		setKernel_local_mem_size4(kernel_local_mem_size4);
		setKernel_local_mem_size_init2(kernel_local_mem_size_init2);
		setKernel_local_mem_size_loop2(kernel_local_mem_size_loop2);
		setKernel_local_mem_size_mp(kernel_local_mem_size_mp);
		setKernel_local_mem_size_mp_l(kernel_local_mem_size_mp_l);
		setKernel_local_mem_size_mp_r(kernel_local_mem_size_mp_r);
		setKernel_local_mem_size_amp(kernel_local_mem_size_amp);
		setKernel_local_mem_size_tm(kernel_local_mem_size_tm);
		setKernel_local_mem_size_memset(kernel_local_mem_size_memset);
		setKernel_local_mem_size_atinit(kernel_local_mem_size_atinit);
		setKernel_local_mem_size_decompress(kernel_local_mem_size_decompress);
		setKernel_local_mem_size_aux1(kernel_local_mem_size_aux1);
		setKernel_local_mem_size_aux2(kernel_local_mem_size_aux2);
		setKernel_local_mem_size_aux3(kernel_local_mem_size_aux3);
		setKernel_local_mem_size_aux4(kernel_local_mem_size_aux4);
		setKernel_accel(kernel_accel);
		setKernel_accel_prev(kernel_accel_prev);
		setKernel_accel_min(kernel_accel_min);
		setKernel_accel_max(kernel_accel_max);
		setKernel_loops(kernel_loops);
		setKernel_loops_prev(kernel_loops_prev);
		setKernel_loops_min(kernel_loops_min);
		setKernel_loops_max(kernel_loops_max);
		setKernel_loops_min_sav(kernel_loops_min_sav);
		setKernel_loops_max_sav(kernel_loops_max_sav);
		setKernel_threads(kernel_threads);
		setKernel_threads_min(kernel_threads_min);
		setKernel_threads_max(kernel_threads_max);
		setKernel_power(kernel_power);
		setHardware_power(hardware_power);
		setSize_pws(size_pws);
		setSize_pws_amp(size_pws_amp);
		setSize_pws_comp(size_pws_comp);
		setSize_pws_idx(size_pws_idx);
		setSize_pws_pre(size_pws_pre);
		setSize_pws_base(size_pws_base);
		setSize_tmps(size_tmps);
		setSize_hooks(size_hooks);
		setSize_bfs(size_bfs);
		setSize_combs(size_combs);
		setSize_rules(size_rules);
		setSize_rules_c(size_rules_c);
		setSize_root_css(size_root_css);
		setSize_markov_css(size_markov_css);
		setSize_digests(size_digests);
		setSize_salts(size_salts);
		setSize_esalts(size_esalts);
		setSize_shown(size_shown);
		setSize_results(size_results);
		setSize_plains(size_plains);
		setSize_st_digests(size_st_digests);
		setSize_st_salts(size_st_salts);
		setSize_st_esalts(size_st_esalts);
		setSize_tm(size_tm);
		setExtra_buffer_size(extra_buffer_size);
		setScratch_buf(scratch_buf);
		setCombs_fp(combs_fp);
		setCombs_buf(combs_buf);
		setHooks_buf(hooks_buf);
		setPws_idx(pws_idx);
		setPws_comp(pws_comp);
		setPws_cnt(pws_cnt);
		setPws_pre_buf(pws_pre_buf);
		setPws_pre_cnt(pws_pre_cnt);
		setPws_base_buf(pws_base_buf);
		setPws_base_cnt(pws_base_cnt);
		setWords_off(words_off);
		setWords_done(words_done);
		setOuterloop_pos(outerloop_pos);
		setOuterloop_left(outerloop_left);
		setOuterloop_msec(outerloop_msec);
		setOuterloop_multi(outerloop_multi);
		setInnerloop_pos(innerloop_pos);
		setInnerloop_left(innerloop_left);
		setExec_pos(exec_pos);
		setExec_msec(exec_msec);
		setExec_us_prev1(exec_us_prev1);
		setExec_us_prev2(exec_us_prev2);
		setExec_us_prev3(exec_us_prev3);
		setExec_us_prev4(exec_us_prev4);
		setExec_us_prev_init2(exec_us_prev_init2);
		setExec_us_prev_loop2(exec_us_prev_loop2);
		setExec_us_prev_aux1(exec_us_prev_aux1);
		setExec_us_prev_aux2(exec_us_prev_aux2);
		setExec_us_prev_aux3(exec_us_prev_aux3);
		setExec_us_prev_aux4(exec_us_prev_aux4);
		setSpeed_pos(speed_pos);
		setSpeed_cnt(speed_cnt);
		setSpeed_msec(speed_msec);
		setSpeed_only_finish(speed_only_finish);
		setTimer_speed(timer_speed);
		setHas_vadd3(has_vadd3);
		setHas_vbfe(has_vbfe);
		setHas_vperm(has_vperm);
		setHas_bfe(has_bfe);
		setHas_lop3(has_lop3);
		setHas_mov64(has_mov64);
		setHas_prmt(has_prmt);
		setSpin_damp(spin_damp);
		setKernel_params(kernel_params);
		setKernel_params_mp(kernel_params_mp);
		setKernel_params_mp_r(kernel_params_mp_r);
		setKernel_params_mp_l(kernel_params_mp_l);
		setKernel_params_amp(kernel_params_amp);
		setKernel_params_tm(kernel_params_tm);
		setKernel_params_memset(kernel_params_memset);
		setKernel_params_atinit(kernel_params_atinit);
		setKernel_params_decompress(kernel_params_decompress);
		setKernel_params_buf32(kernel_params_buf32);
		setKernel_params_buf64(kernel_params_buf64);
		setKernel_params_mp_buf32(kernel_params_mp_buf32);
		setKernel_params_mp_buf64(kernel_params_mp_buf64);
		setKernel_params_mp_r_buf32(kernel_params_mp_r_buf32);
		setKernel_params_mp_r_buf64(kernel_params_mp_r_buf64);
		setKernel_params_mp_l_buf32(kernel_params_mp_l_buf32);
		setKernel_params_mp_l_buf64(kernel_params_mp_l_buf64);
		setKernel_params_amp_buf32(kernel_params_amp_buf32);
		setKernel_params_amp_buf64(kernel_params_amp_buf64);
		setKernel_params_memset_buf32(kernel_params_memset_buf32);
		setKernel_params_memset_buf64(kernel_params_memset_buf64);
		setKernel_params_atinit_buf32(kernel_params_atinit_buf32);
		setKernel_params_atinit_buf64(kernel_params_atinit_buf64);
		setKernel_params_decompress_buf32(kernel_params_decompress_buf32);
		setKernel_params_decompress_buf64(kernel_params_decompress_buf64);
		setIs_cuda(is_cuda);
		setCuda_warp_size(cuda_warp_size);
		setCuda_device(cuda_device);
		setCuda_context(cuda_context);
		setCuda_stream(cuda_stream);
		setCuda_event1(cuda_event1);
		setCuda_event2(cuda_event2);
		setCuda_module(cuda_module);
		setCuda_module_mp(cuda_module_mp);
		setCuda_module_amp(cuda_module_amp);
		setCuda_function1(cuda_function1);
		setCuda_function12(cuda_function12);
		setCuda_function2(cuda_function2);
		setCuda_function23(cuda_function23);
		setCuda_function3(cuda_function3);
		setCuda_function4(cuda_function4);
		setCuda_function_init2(cuda_function_init2);
		setCuda_function_loop2(cuda_function_loop2);
		setCuda_function_mp(cuda_function_mp);
		setCuda_function_mp_l(cuda_function_mp_l);
		setCuda_function_mp_r(cuda_function_mp_r);
		setCuda_function_amp(cuda_function_amp);
		setCuda_function_tm(cuda_function_tm);
		setCuda_function_memset(cuda_function_memset);
		setCuda_function_atinit(cuda_function_atinit);
		setCuda_function_decompress(cuda_function_decompress);
		setCuda_function_aux1(cuda_function_aux1);
		setCuda_function_aux2(cuda_function_aux2);
		setCuda_function_aux3(cuda_function_aux3);
		setCuda_function_aux4(cuda_function_aux4);
		setCuda_d_pws_buf(cuda_d_pws_buf);
		setCuda_d_pws_amp_buf(cuda_d_pws_amp_buf);
		setCuda_d_pws_comp_buf(cuda_d_pws_comp_buf);
		setCuda_d_pws_idx(cuda_d_pws_idx);
		setCuda_d_words_buf_l(cuda_d_words_buf_l);
		setCuda_d_words_buf_r(cuda_d_words_buf_r);
		setCuda_d_rules(cuda_d_rules);
		setCuda_d_rules_c(cuda_d_rules_c);
		setCuda_d_combs(cuda_d_combs);
		setCuda_d_combs_c(cuda_d_combs_c);
		setCuda_d_bfs(cuda_d_bfs);
		setCuda_d_bfs_c(cuda_d_bfs_c);
		setCuda_d_tm_c(cuda_d_tm_c);
		setCuda_d_bitmap_s1_a(cuda_d_bitmap_s1_a);
		setCuda_d_bitmap_s1_b(cuda_d_bitmap_s1_b);
		setCuda_d_bitmap_s1_c(cuda_d_bitmap_s1_c);
		setCuda_d_bitmap_s1_d(cuda_d_bitmap_s1_d);
		setCuda_d_bitmap_s2_a(cuda_d_bitmap_s2_a);
		setCuda_d_bitmap_s2_b(cuda_d_bitmap_s2_b);
		setCuda_d_bitmap_s2_c(cuda_d_bitmap_s2_c);
		setCuda_d_bitmap_s2_d(cuda_d_bitmap_s2_d);
		setCuda_d_plain_bufs(cuda_d_plain_bufs);
		setCuda_d_digests_buf(cuda_d_digests_buf);
		setCuda_d_digests_shown(cuda_d_digests_shown);
		setCuda_d_salt_bufs(cuda_d_salt_bufs);
		setCuda_d_esalt_bufs(cuda_d_esalt_bufs);
		setCuda_d_tmps(cuda_d_tmps);
		setCuda_d_hooks(cuda_d_hooks);
		setCuda_d_result(cuda_d_result);
		setCuda_d_extra0_buf(cuda_d_extra0_buf);
		setCuda_d_extra1_buf(cuda_d_extra1_buf);
		setCuda_d_extra2_buf(cuda_d_extra2_buf);
		setCuda_d_extra3_buf(cuda_d_extra3_buf);
		setCuda_d_root_css_buf(cuda_d_root_css_buf);
		setCuda_d_markov_css_buf(cuda_d_markov_css_buf);
		setCuda_d_st_digests_buf(cuda_d_st_digests_buf);
		setCuda_d_st_salts_buf(cuda_d_st_salts_buf);
		setCuda_d_st_esalts_buf(cuda_d_st_esalts_buf);
		setIs_opencl(is_opencl);
		setOpencl_driver_version(opencl_driver_version);
		setOpencl_device_vendor(opencl_device_vendor);
		setOpencl_device_version(opencl_device_version);
		setOpencl_device_c_version(opencl_device_c_version);
		setOpencl_device_type(opencl_device_type);
		setOpencl_device_vendor_id(opencl_device_vendor_id);
		setOpencl_platform_vendor_id(opencl_platform_vendor_id);
		setOpencl_device(opencl_device);
	}
	public hc_device_param() {
	}
	
	public boolean brain_send(int sockfd, Object buf, Object len, int flags, Object status_ctx) {
		byte ptr = (byte)buf;
		ssize_t s_pos = new ssize_t();
		ssize_t s_len = len;
		for (s_pos = 0; s_pos < s_len - ModernizedCProgram.BRAIN_LINK_CHUNK_SIZE; s_pos += ModernizedCProgram.BRAIN_LINK_CHUNK_SIZE) {
			if (device_param.brain_send_all(sockfd, ptr + s_pos, ModernizedCProgram.BRAIN_LINK_CHUNK_SIZE, flags, status_ctx) == 0) {
				return 0;
			} 
			if (status_ctx) {
				if (status_ctx.getRun_thread_level1() == 0) {
					return 0;
				} 
			} 
		}
		if (device_param.brain_send_all(sockfd, ptr + s_pos, s_len - s_pos, flags, status_ctx) == 0) {
			return 0;
		} 
		if (status_ctx) {
			if (status_ctx.getRun_thread_level1() == 0) {
				return 0;
			} 
		} 
		return 1;
	}
	public boolean brain_recv(int sockfd, Object buf, Object len, int flags, Object status_ctx) {
		byte ptr = (byte)buf;
		ssize_t s_pos = new ssize_t();
		ssize_t s_len = len;
		for (s_pos = 0; s_pos < s_len - ModernizedCProgram.BRAIN_LINK_CHUNK_SIZE; s_pos += ModernizedCProgram.BRAIN_LINK_CHUNK_SIZE) {
			if (device_param.brain_recv_all(sockfd, ptr + s_pos, ModernizedCProgram.BRAIN_LINK_CHUNK_SIZE, flags, status_ctx) == 0) {
				return 0;
			} 
			if (status_ctx) {
				if (status_ctx.getRun_thread_level1() == 0) {
					return 0;
				} 
			} 
		}
		if (device_param.brain_recv_all(sockfd, ptr + s_pos, s_len - s_pos, flags, status_ctx) == 0) {
			return 0;
		} 
		if (status_ctx) {
			if (status_ctx.getRun_thread_level1() == 0) {
				return 0;
			} 
		} 
		return 1;
	}
	public boolean brain_send_all(int sockfd, Object buf, Object len, int flags, Object status_ctx) {
		Object generatedBrain_link_send_speed = this.getBrain_link_send_speed();
		link_speed_t link_speed = generatedBrain_link_send_speed;
		Object generatedTimer = link_speed.getTimer();
		int generatedPos = link_speed.getPos();
		if (device_param) {
			this.setBrain_link_send_active(1);
			ModernizedCProgram.hc_timer_set(generatedTimer[generatedPos]);
		} 
		ssize_t nsend = /*Error: Function owner not recognized*/send(sockfd, buf, len, flags);
		Object generatedBytes = link_speed.getBytes();
		Object generatedBrain_link_send_bytes = this.getBrain_link_send_bytes();
		if (device_param) {
			generatedBytes[generatedPos] = nsend;
			if (generatedPos++ == 10000) {
				link_speed.setPos(0);
			} 
			generatedBrain_link_send_bytes += nsend;
		} 
		if (nsend <= 0) {
			return 0;
		} 
		if (status_ctx && status_ctx.getRun_thread_level1() == 0) {
			return 0;
		} 
		while (nsend < (ssize_t)len) {
			byte buf_new = (byte)buf;
			if (device_param) {
				ModernizedCProgram.hc_timer_set(generatedTimer[generatedPos]);
			} 
			ssize_t nsend_new = /*Error: Function owner not recognized*/send(sockfd, buf_new + nsend, len - nsend, flags);
			if (device_param) {
				generatedBytes[generatedPos] = nsend_new;
				if (generatedPos++ == 10000) {
					link_speed.setPos(0);
				} 
				generatedBrain_link_send_bytes += nsend_new;
			} 
			if (nsend_new <= 0) {
				return 0;
			} 
			if (status_ctx && status_ctx.getRun_thread_level1() == 0) {
				break;
			} 
			nsend += nsend_new;
		}
		if (device_param) {
			this.setBrain_link_send_active(0);
		} 
		return 1;
	}
	public boolean brain_recv_all(int sockfd, Object buf, Object len, int flags, Object status_ctx) {
		Object generatedBrain_link_recv_speed = this.getBrain_link_recv_speed();
		link_speed_t link_speed = generatedBrain_link_recv_speed;
		Object generatedTimer = link_speed.getTimer();
		int generatedPos = link_speed.getPos();
		if (device_param) {
			this.setBrain_link_recv_active(1);
			ModernizedCProgram.hc_timer_set(generatedTimer[generatedPos]);
		} 
		ssize_t nrecv = /*Error: Function owner not recognized*/recv(sockfd, buf, len, flags);
		Object generatedBytes = link_speed.getBytes();
		Object generatedBrain_link_recv_bytes = this.getBrain_link_recv_bytes();
		if (device_param) {
			generatedBytes[generatedPos] = nrecv;
			if (generatedPos++ == 10000) {
				link_speed.setPos(0);
			} 
			generatedBrain_link_recv_bytes += nrecv;
		} 
		if (nrecv <= 0) {
			return 0;
		} 
		if (status_ctx && status_ctx.getRun_thread_level1() == 0) {
			return 0;
		} 
		while (nrecv < (ssize_t)len) {
			byte buf_new = (byte)buf;
			if (device_param) {
				ModernizedCProgram.hc_timer_set(generatedTimer[generatedPos]);
			} 
			ssize_t nrecv_new = /*Error: Function owner not recognized*/recv(sockfd, buf_new + nrecv, len - nrecv, flags);
			if (device_param) {
				generatedBytes[generatedPos] = nrecv_new;
				if (generatedPos++ == 10000) {
					link_speed.setPos(0);
				} 
				generatedBrain_link_recv_bytes += nrecv_new;
			} 
			if (nrecv_new <= 0) {
				return 0;
			} 
			if (status_ctx && status_ctx.getRun_thread_level1() == 0) {
				break;
			} 
			nrecv += nrecv_new;
		}
		if (device_param) {
			this.setBrain_link_recv_active(0);
		} 
		return 1;
	}
	public boolean brain_client_connect(Object status_ctx, Object host, Object port, Object password, Object brain_session, Object brain_attack, Object passwords_max, Object highest) {
		this.setBrain_link_client_fd(0);
		this.setBrain_link_recv_bytes(0);
		this.setBrain_link_send_bytes(0);
		this.setBrain_link_recv_active(0);
		this.setBrain_link_send_active(0);
		Object generatedBrain_link_recv_speed = this.getBrain_link_recv_speed();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedBrain_link_recv_speed, 0, /*Error: Unsupported expression*/);
		Object generatedBrain_link_send_speed = this.getBrain_link_send_speed();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(generatedBrain_link_send_speed, 0, /*Error: Unsupported expression*/);
		int brain_link_client_fd = /*Error: Function owner not recognized*/socket(2, 1, 0);
		if (brain_link_client_fd == -1) {
			(_iob[2]).brain_logging(0, "socket: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			return 0;
		} 
		addrinfo hints = new addrinfo();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(hints, 0, /*Error: sizeof expression not supported yet*/);
		hints.setAi_family(2);
		hints.setAi_socktype(1);
		byte[] port_str = new byte[8];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(port_str, 0, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(port_str, /*Error: sizeof expression not supported yet*/, "%i", port);
		byte host_real = (host == ((Object)0)) ? "127.0.0.1" : host;
		boolean connected = false;
		addrinfo address_info = new addrinfo();
		int rc_getaddrinfo = /*Error: Function owner not recognized*/getaddrinfo(host_real, port_str, hints, address_info);
		Object generatedAi_addr = address_info_ptr.getAi_addr();
		Object generatedAi_addrlen = address_info_ptr.getAi_addrlen();
		Object generatedAi_next = address_info_ptr.getAi_next();
		if (rc_getaddrinfo == 0) {
			addrinfo address_info_ptr = new addrinfo();
			for (address_info_ptr = address_info; address_info_ptr != ((Object)0); address_info_ptr = generatedAi_next) {
				if (ModernizedCProgram.brain_connect(brain_link_client_fd, generatedAi_addr, generatedAi_addrlen, ModernizedCProgram.BRAIN_CLIENT_CONNECT_TIMEOUT) == 0) {
					connected = true;
					break;
				} 
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/freeaddrinfo(address_info);
		} else {
				(_iob[2]).brain_logging(0, "%s: %s\n", host_real, /*Error: Function owner not recognized*/gai_strerrorA(rc_getaddrinfo));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
				return 0;
		} 
		if (connected == false) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		this.setBrain_link_client_fd(brain_link_client_fd);
		u32 brain_link_version = ModernizedCProgram.BRAIN_LINK_VERSION_CUR;
		if (((Object)0).brain_send(brain_link_client_fd, brain_link_version, /*Error: sizeof expression not supported yet*/, 0, ((Object)0)) == 0) {
			(_iob[2]).brain_logging(0, "brain_send: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		u32 brain_link_version_ok = 0;
		if (((Object)0).brain_recv(brain_link_client_fd, brain_link_version_ok, /*Error: sizeof expression not supported yet*/, 0, ((Object)0)) == 0) {
			(_iob[2]).brain_logging(0, "brain_recv: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		if (brain_link_version_ok == 0) {
			(_iob[2]).brain_logging(0, "Invalid brain server version\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		u32 challenge = 0;
		if (((Object)0).brain_recv(brain_link_client_fd, challenge, /*Error: sizeof expression not supported yet*/, 0, ((Object)0)) == 0) {
			(_iob[2]).brain_logging(0, "brain_recv: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		u64 response = ModernizedCProgram.brain_auth_hash(challenge, password, /*Error: Function owner not recognized*/strlen(password));
		if (((Object)0).brain_send(brain_link_client_fd, response, /*Error: sizeof expression not supported yet*/, 0, ((Object)0)) == 0) {
			(_iob[2]).brain_logging(0, "brain_send: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		u32 password_ok = 0;
		if (((Object)0).brain_recv(brain_link_client_fd, password_ok, /*Error: sizeof expression not supported yet*/, 0, ((Object)0)) == 0) {
			(_iob[2]).brain_logging(0, "brain_recv: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		if (password_ok == 0) {
			(_iob[2]).brain_logging(0, "Invalid brain server password\n");
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		if (device_param.brain_send(brain_link_client_fd, brain_session, /*Error: sizeof expression not supported yet*/, 0, status_ctx) == 0) {
			(_iob[2]).brain_logging(0, "brain_send: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		if (device_param.brain_send(brain_link_client_fd, brain_attack, /*Error: sizeof expression not supported yet*/, 0, status_ctx) == 0) {
			(_iob[2]).brain_logging(0, "brain_send: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		if (device_param.brain_send(brain_link_client_fd, passwords_max, /*Error: sizeof expression not supported yet*/, 0, status_ctx) == 0) {
			(_iob[2]).brain_logging(0, "brain_send: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		if (((Object)0).brain_recv(brain_link_client_fd, highest, /*Error: Unsupported expression*/, 0, ((Object)0)) == 0) {
			(_iob[2]).brain_logging(0, "brain_recv: %s\n", /*Error: Function owner not recognized*/strerror((/*Error: Function owner not recognized*/_errno())));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(brain_link_client_fd);
			return 0;
		} 
		return 1;
	}
	public void brain_client_disconnect() {
		Object generatedBrain_link_client_fd = this.getBrain_link_client_fd();
		if (generatedBrain_link_client_fd > 2) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/close(generatedBrain_link_client_fd);
		} 
		this.setBrain_link_client_fd(-1);
	}
	public boolean brain_client_reserve(Object status_ctx, Object words_off, Object work, Object overlap) {
		Object generatedBrain_link_client_fd = this.getBrain_link_client_fd();
		int brain_link_client_fd = generatedBrain_link_client_fd;
		if (brain_link_client_fd == -1) {
			return 0;
		} 
		u8 operation = brain_operation.BRAIN_OPERATION_ATTACK_RESERVE;
		if (device_param.brain_send(brain_link_client_fd, operation, /*Error: sizeof expression not supported yet*/, 0, status_ctx) == 0) {
			return 0;
		} 
		if (device_param.brain_send(brain_link_client_fd, words_off, /*Error: sizeof expression not supported yet*/, 0, status_ctx) == 0) {
			return 0;
		} 
		if (device_param.brain_send(brain_link_client_fd, work, /*Error: sizeof expression not supported yet*/, 0, status_ctx) == 0) {
			return 0;
		} 
		if (device_param.brain_recv(brain_link_client_fd, overlap, /*Error: Unsupported expression*/, 0, status_ctx) == 0) {
			return 0;
		} 
		return 1;
	}
	public boolean brain_client_commit(Object status_ctx) {
		Object generatedPws_cnt = this.getPws_cnt();
		if (generatedPws_cnt == 0) {
			return 1;
		} 
		Object generatedBrain_link_client_fd = this.getBrain_link_client_fd();
		int brain_link_client_fd = generatedBrain_link_client_fd;
		if (brain_link_client_fd == -1) {
			return 0;
		} 
		u8 operation = brain_operation.BRAIN_OPERATION_COMMIT;
		if (device_param.brain_send(brain_link_client_fd, operation, /*Error: sizeof expression not supported yet*/, 0, status_ctx) == 0) {
			return 0;
		} 
		return 1;
	}
	public boolean brain_client_lookup(Object status_ctx) {
		Object generatedPws_pre_cnt = this.getPws_pre_cnt();
		if (generatedPws_pre_cnt == 0) {
			return 1;
		} 
		Object generatedBrain_link_client_fd = this.getBrain_link_client_fd();
		int brain_link_client_fd = generatedBrain_link_client_fd;
		if (brain_link_client_fd == -1) {
			return 0;
		} 
		Object generatedBrain_link_in_buf = this.getBrain_link_in_buf();
		byte recvbuf = (byte)generatedBrain_link_in_buf;
		Object generatedBrain_link_out_buf = this.getBrain_link_out_buf();
		byte sendbuf = (byte)generatedBrain_link_out_buf;
		int in_size = 0;
		int out_size = generatedPws_pre_cnt * ModernizedCProgram.BRAIN_HASH_SIZE;
		u8 operation = brain_operation.BRAIN_OPERATION_HASH_LOOKUP;
		if (device_param.brain_send(brain_link_client_fd, operation, /*Error: sizeof expression not supported yet*/, 0, status_ctx) == 0) {
			return 0;
		} 
		if (device_param.brain_send(brain_link_client_fd, out_size, /*Error: sizeof expression not supported yet*/, 0, status_ctx) == 0) {
			return 0;
		} 
		if (device_param.brain_send(brain_link_client_fd, sendbuf, out_size, 0, status_ctx) == 0) {
			return 0;
		} 
		if (device_param.brain_recv(brain_link_client_fd, in_size, /*Error: sizeof expression not supported yet*/, 0, status_ctx) == 0) {
			return 0;
		} 
		Object generatedSize_brain_link_in = this.getSize_brain_link_in();
		if (in_size > (int)generatedSize_brain_link_in) {
			return 0;
		} 
		if (device_param.brain_recv(brain_link_client_fd, recvbuf, (size_t)in_size, 0, status_ctx) == 0) {
			return 0;
		} 
		return 1;
	}
	public void pw_pre_add(Object pw_buf, Object pw_len, Object base_buf, Object base_len, Object rule_idx) {
		Object generatedPws_pre_cnt = this.getPws_pre_cnt();
		Object generatedKernel_power = this.getKernel_power();
		pw_pre generatedPws_pre_buf = this.getPws_pre_buf();
		Object generatedPw_buf = pw_pre.getPw_buf();
		Object generatedBase_buf = pw_pre.getBase_buf();
		if (generatedPws_pre_cnt < generatedKernel_power) {
			pw_pre_t pw_pre = generatedPws_pre_buf + generatedPws_pre_cnt;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPw_buf, pw_buf, pw_len);
			pw_pre.setPw_len(pw_len);
			if (base_buf != ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedBase_buf, base_buf, base_len);
				pw_pre.setBase_len(base_len);
			} 
			pw_pre.setRule_idx(rule_idx);
			generatedPws_pre_cnt++;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[1]), "BUG pw_pre_add()!!\n");
				return /*Error: Unsupported expression*/;
		} 
	}
	public void pw_add(Object pw_buf, Object pw_len) {
		Object generatedPws_cnt = this.getPws_cnt();
		Object generatedKernel_power = this.getKernel_power();
		pw_idx generatedPws_idx = this.getPws_idx();
		Object generatedPws_comp = this.getPws_comp();
		Object generatedOff = pw_idx.getOff();
		Object generatedCnt = pw_idx.getCnt();
		if (generatedPws_cnt < generatedKernel_power) {
			pw_idx_t pw_idx = generatedPws_idx + generatedPws_cnt;
			u32 pw_len4 = (pw_len + 3) & ~3;
			u32 pw_len4_cnt = pw_len4 / 4;
			pw_idx.setCnt(pw_len4_cnt);
			pw_idx.setLen(pw_len);
			u8 dst = (u8)(generatedPws_comp + generatedOff);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dst, pw_buf, pw_len);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dst + pw_len, 0, pw_len4 - pw_len);
			pw_idx_t pw_idx_next = pw_idx + 1;
			pw_idx_next.setOff(generatedOff + generatedCnt);
			generatedPws_cnt++;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "BUG pw_add()!!\n");
				return /*Error: Unsupported expression*/;
		} 
	}
	public void rebuild_pws_compressed_append(Object pws_cnt, Object chr) {
		Object generatedSize_pws_comp = this.getSize_pws_comp();
		// append some data to each password candidateu32 tmp_pws_comp = (u32)ModernizedCProgram.hcmalloc(generatedSize_pws_comp);
		Object generatedSize_pws_idx = this.getSize_pws_idx();
		pw_idx_t tmp_pws_idx = (pw_idx_t)ModernizedCProgram.hcmalloc(generatedSize_pws_idx);
		pw_idx generatedPws_idx = this.getPws_idx();
		Object generatedOff = pw_idx_src.getOff();
		Object generatedLen = pw_idx_src.getLen();
		Object generatedPws_comp = this.getPws_comp();
		Object generatedCnt = pw_idx_dst.getCnt();
		for (u32 i = 0;
		 i < pws_cnt; i++) {
			pw_idx_t pw_idx_src = generatedPws_idx + i;
			pw_idx_t pw_idx_dst = tmp_pws_idx + i;
			u32 src_off = generatedOff;
			u32 src_len = generatedLen;
			u8[] buf = new u8();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf, generatedPws_comp + src_off, src_len);
			buf[src_len] = chr;
			u32 dst_len = src_len + 1;
			u32 dst_pw_len4 = (dst_len + 3) & ~3;
			u32 dst_pw_len4_cnt = dst_pw_len4 / 4;
			pw_idx_dst.setCnt(dst_pw_len4_cnt);
			pw_idx_dst.setLen(src_len);
			u8 dst = (u8)(tmp_pws_comp + generatedOff);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dst, buf, dst_len);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dst + dst_len, 0, dst_pw_len4 - dst_len);
			pw_idx_t pw_idx_dst_next = pw_idx_dst + 1;
			pw_idx_dst_next.setOff(generatedOff + generatedCnt);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPws_comp, tmp_pws_comp, generatedSize_pws_comp);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedPws_idx, tmp_pws_idx, generatedSize_pws_idx);
		ModernizedCProgram.hcfree(tmp_pws_comp);
		ModernizedCProgram.hcfree(tmp_pws_idx);
	}
	// this function is used if we have to modify the compressed pws buffer in order to
	public double get_avg_exec_time(Object last_num_entries) {
		Object generatedExec_pos = this.getExec_pos();
		int exec_pos = (int)generatedExec_pos - last_num_entries;
		if (exec_pos < 0) {
			exec_pos += 128;
		} 
		double exec_msec_sum = 0;
		int exec_msec_cnt = 0;
		Object generatedExec_msec = this.getExec_msec();
		for (int i = 0;
		 i < last_num_entries; i++) {
			double exec_msec = generatedExec_msec[(exec_pos + i) % 128];
			if (exec_msec > 0) {
				exec_msec_sum += exec_msec;
				exec_msec_cnt++;
			} 
		}
		if (exec_msec_cnt == 0) {
			return 0;
		} 
		return exec_msec_sum / exec_msec_cnt;
	}
	public void module_hook23(Object hook_salts_buf, Object salt_pos, Object pws_cnt) {
		Object generatedHooks_buf = this.getHooks_buf();
		seven_zip_hook_t hook_items = (seven_zip_hook_t)generatedHooks_buf;
		seven_zip_hook_salt_t seven_zips = (seven_zip_hook_salt_t)hook_salts_buf;
		seven_zip_hook_salt_t seven_zip = seven_zips[salt_pos];
		Object generatedData_type = seven_zip.getData_type();
		u8 data_type = generatedData_type;
		Object generatedData_buf = seven_zip.getData_buf();
		u32 data_buf = generatedData_buf;
		Object generatedUnpack_size = seven_zip.getUnpack_size();
		u32 unpack_size = generatedUnpack_size;
		Object generatedUkey = hook_item.getUkey();
		int generatedAes_len = seven_zip.getAes_len();
		Object generatedIv_buf = seven_zip.getIv_buf();
		Object generatedCrc = seven_zip.getCrc();
		Object generatedCrc_len = seven_zip.getCrc_len();
		Object generatedCoder_attributes = seven_zip.getCoder_attributes();
		for (u64 pw_pos = 0;
		 pw_pos < pws_cnt; pw_pos++) {
			seven_zip_hook_t hook_item = hook_items[pw_pos];
			u32 ukey = (u32)generatedUkey;
			AES_KEY aes_key = new AES_KEY();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(aes_key, 0, /*Error: sizeof expression not supported yet*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/aes256_set_decrypt_key(aes_key.getRdk(), ukey, (u32)ModernizedCProgram.te0, (u32)ModernizedCProgram.te1, (u32)ModernizedCProgram.te2, (u32)ModernizedCProgram.te3, (u32)ModernizedCProgram.td0, (u32)ModernizedCProgram.td1, (u32)ModernizedCProgram.td2, (u32)ModernizedCProgram.td3);
			int aes_len = generatedAes_len;
			u32[] data = new u32();
			u32[] out = new u32();
			u32[] iv = new u32();
			iv[0] = generatedIv_buf[0];
			iv[1] = generatedIv_buf[1];
			iv[2] = generatedIv_buf[2];
			iv[3] = generatedIv_buf[3];
			u32[] out_full = new u32();
			int i = 0;
			int j = 0;
			for (; i < aes_len - 16; ) {
				data[0] = data_buf[j + 0];
				data[1] = data_buf[j + 1];
				data[2] = data_buf[j + 2];
				data[3] = data_buf[j + 3];
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/aes256_decrypt(aes_key.getRdk(), data, out, (u32)ModernizedCProgram.td0, (u32)ModernizedCProgram.td1, (u32)ModernizedCProgram.td2, (u32)ModernizedCProgram.td3, (u32)ModernizedCProgram.td4);
				out[0] ^=  iv[0];
				out[1] ^=  iv[1];
				out[2] ^=  iv[2];
				out[3] ^=  iv[3];
				iv[0] = data[0];
				iv[1] = data[1];
				iv[2] = data[2];
				iv[3] = data[3];
				out_full[j + 0] = out[0];
				out_full[j + 1] = out[1];
				out_full[j + 2] = out[2];
				out_full[j + 3] = out[3];
			}
			data[0] = data_buf[j + 0];
			data[1] = data_buf[j + 1];
			data[2] = data_buf[j + 2];
			data[3] = data_buf[j + 3];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/aes256_decrypt(aes_key.getRdk(), data, out, (u32)ModernizedCProgram.td0, (u32)ModernizedCProgram.td1, (u32)ModernizedCProgram.td2, (u32)ModernizedCProgram.td3, (u32)ModernizedCProgram.td4);
			out[0] ^=  iv[0];
			out[1] ^=  iv[1];
			out[2] ^=  iv[2];
			out[3] ^=  iv[3];
			out_full[j + 0] = out[0];
			out_full[j + 1] = out[1];
			out_full[j + 2] = out[2];
			out_full[j + 3] = out[3/*
			     * check the CRC32 "hash"
			     */];
			u32 seven_zip_crc = generatedCrc;
			u32 crc = new u32();
			if (data_type == 0) {
				crc = ModernizedCProgram.cpu_crc32_buffer((u8)out_full, unpack_size);
			} else {
					u32 crc_len = generatedCrc_len;
					byte coder_attributes = generatedCoder_attributes;
					u8 compressed_data = (u8)out_full;
					SizeT compressed_data_len = aes_len;
					byte decompressed_data;
					decompressed_data = (byte)ModernizedCProgram.hcmalloc(crc_len);
					SizeT decompressed_data_len = crc_len;
					int ret;
					if (data_type == 1) {
						ret = ModernizedCProgram.hc_lzma1_decompress(compressed_data, compressed_data_len, decompressed_data, decompressed_data_len, coder_attributes);
					}  else if (data_type == 7) {
						ret = 1;
						z_stream inf = new z_stream();
						inf.setZalloc(0);
						inf.setZfree(0);
						inf.setOpaque(0);
						inf.setAvail_in(compressed_data_len);
						inf.setNext_in(compressed_data);
						inf.setAvail_out(decompressed_data_len);
						inf.setNext_out(decompressed_data);
						ModernizedCProgram.inflateInit2_((inf), (true), "1.2.11", (int)/*Error: Unsupported expression*/);
						int zlib_ret = ModernizedCProgram.inflate(inf, 0);
						ModernizedCProgram.inflateEnd(inf);
						if ((zlib_ret == 0) || (zlib_ret == 1)) {
							ret = 0;
						} 
					} else {
							ret = ModernizedCProgram.hc_lzma2_decompress(compressed_data, compressed_data_len, decompressed_data, decompressed_data_len, coder_attributes);
					} 
					if (ret != 0) {
						hook_item.setHook_success(0);
						ModernizedCProgram.hcfree(decompressed_data);
						continue;
					} 
					crc = ModernizedCProgram.cpu_crc32_buffer(decompressed_data, crc_len);
					ModernizedCProgram.hcfree(decompressed_data);
			} 
			if (crc == seven_zip_crc) {
				hook_item.setHook_success(1);
			} else {
					hook_item.setHook_success(0);
			} 
		}// this hook data needs to be updated (the "hook_success" variable):
	}
	public int getDevice_id() {
		return device_id;
	}
	public void setDevice_id(int newDevice_id) {
		device_id = newDevice_id;
	}
	public int getDevice_id_alias_cnt() {
		return device_id_alias_cnt;
	}
	public void setDevice_id_alias_cnt(int newDevice_id_alias_cnt) {
		device_id_alias_cnt = newDevice_id_alias_cnt;
	}
	public Object getDevice_id_alias_buf() {
		return device_id_alias_buf;
	}
	public void setDevice_id_alias_buf(Object newDevice_id_alias_buf) {
		device_id_alias_buf = newDevice_id_alias_buf;
	}
	public Object getPcie_bus() {
		return pcie_bus;
	}
	public void setPcie_bus(Object newPcie_bus) {
		pcie_bus = newPcie_bus;
	}
	public Object getPcie_device() {
		return pcie_device;
	}
	public void setPcie_device(Object newPcie_device) {
		pcie_device = newPcie_device;
	}
	public Object getPcie_function() {
		return pcie_function;
	}
	public void setPcie_function(Object newPcie_function) {
		pcie_function = newPcie_function;
	}
	public boolean getSkipped() {
		return skipped;
	}
	public void setSkipped(boolean newSkipped) {
		skipped = newSkipped;
	}
	public boolean getSkipped_warning() {
		return skipped_warning;
	}
	public void setSkipped_warning(boolean newSkipped_warning) {
		skipped_warning = newSkipped_warning;
	}
	public Object getDevice_processors() {
		return device_processors;
	}
	public void setDevice_processors(Object newDevice_processors) {
		device_processors = newDevice_processors;
	}
	public Object getDevice_maxmem_alloc() {
		return device_maxmem_alloc;
	}
	public void setDevice_maxmem_alloc(Object newDevice_maxmem_alloc) {
		device_maxmem_alloc = newDevice_maxmem_alloc;
	}
	public Object getDevice_global_mem() {
		return device_global_mem;
	}
	public void setDevice_global_mem(Object newDevice_global_mem) {
		device_global_mem = newDevice_global_mem;
	}
	public Object getDevice_available_mem() {
		return device_available_mem;
	}
	public void setDevice_available_mem(Object newDevice_available_mem) {
		device_available_mem = newDevice_available_mem;
	}
	public Object getDevice_maxclock_frequency() {
		return device_maxclock_frequency;
	}
	public void setDevice_maxclock_frequency(Object newDevice_maxclock_frequency) {
		device_maxclock_frequency = newDevice_maxclock_frequency;
	}
	public Object getDevice_maxworkgroup_size() {
		return device_maxworkgroup_size;
	}
	public void setDevice_maxworkgroup_size(Object newDevice_maxworkgroup_size) {
		device_maxworkgroup_size = newDevice_maxworkgroup_size;
	}
	public Object getDevice_local_mem_size() {
		return device_local_mem_size;
	}
	public void setDevice_local_mem_size(Object newDevice_local_mem_size) {
		device_local_mem_size = newDevice_local_mem_size;
	}
	public int getDevice_local_mem_type() {
		return device_local_mem_type;
	}
	public void setDevice_local_mem_type(int newDevice_local_mem_type) {
		device_local_mem_type = newDevice_local_mem_type;
	}
	public Byte getDevice_name() {
		return device_name;
	}
	public void setDevice_name(Byte newDevice_name) {
		device_name = newDevice_name;
	}
	public int getSm_major() {
		return sm_major;
	}
	public void setSm_major(int newSm_major) {
		sm_major = newSm_major;
	}
	public int getSm_minor() {
		return sm_minor;
	}
	public void setSm_minor(int newSm_minor) {
		sm_minor = newSm_minor;
	}
	public Object getKernel_exec_timeout() {
		return kernel_exec_timeout;
	}
	public void setKernel_exec_timeout(Object newKernel_exec_timeout) {
		kernel_exec_timeout = newKernel_exec_timeout;
	}
	public st_status_rc getSt_status() {
		return st_status;
	}
	public void setSt_status(st_status_rc newSt_status) {
		st_status = newSt_status;
	}
	public int getVector_width() {
		return vector_width;
	}
	public void setVector_width(int newVector_width) {
		vector_width = newVector_width;
	}
	public Object getKernel_wgs1() {
		return kernel_wgs1;
	}
	public void setKernel_wgs1(Object newKernel_wgs1) {
		kernel_wgs1 = newKernel_wgs1;
	}
	public Object getKernel_wgs12() {
		return kernel_wgs12;
	}
	public void setKernel_wgs12(Object newKernel_wgs12) {
		kernel_wgs12 = newKernel_wgs12;
	}
	public Object getKernel_wgs2() {
		return kernel_wgs2;
	}
	public void setKernel_wgs2(Object newKernel_wgs2) {
		kernel_wgs2 = newKernel_wgs2;
	}
	public Object getKernel_wgs23() {
		return kernel_wgs23;
	}
	public void setKernel_wgs23(Object newKernel_wgs23) {
		kernel_wgs23 = newKernel_wgs23;
	}
	public Object getKernel_wgs3() {
		return kernel_wgs3;
	}
	public void setKernel_wgs3(Object newKernel_wgs3) {
		kernel_wgs3 = newKernel_wgs3;
	}
	public Object getKernel_wgs4() {
		return kernel_wgs4;
	}
	public void setKernel_wgs4(Object newKernel_wgs4) {
		kernel_wgs4 = newKernel_wgs4;
	}
	public Object getKernel_wgs_init2() {
		return kernel_wgs_init2;
	}
	public void setKernel_wgs_init2(Object newKernel_wgs_init2) {
		kernel_wgs_init2 = newKernel_wgs_init2;
	}
	public Object getKernel_wgs_loop2() {
		return kernel_wgs_loop2;
	}
	public void setKernel_wgs_loop2(Object newKernel_wgs_loop2) {
		kernel_wgs_loop2 = newKernel_wgs_loop2;
	}
	public Object getKernel_wgs_mp() {
		return kernel_wgs_mp;
	}
	public void setKernel_wgs_mp(Object newKernel_wgs_mp) {
		kernel_wgs_mp = newKernel_wgs_mp;
	}
	public Object getKernel_wgs_mp_l() {
		return kernel_wgs_mp_l;
	}
	public void setKernel_wgs_mp_l(Object newKernel_wgs_mp_l) {
		kernel_wgs_mp_l = newKernel_wgs_mp_l;
	}
	public Object getKernel_wgs_mp_r() {
		return kernel_wgs_mp_r;
	}
	public void setKernel_wgs_mp_r(Object newKernel_wgs_mp_r) {
		kernel_wgs_mp_r = newKernel_wgs_mp_r;
	}
	public Object getKernel_wgs_amp() {
		return kernel_wgs_amp;
	}
	public void setKernel_wgs_amp(Object newKernel_wgs_amp) {
		kernel_wgs_amp = newKernel_wgs_amp;
	}
	public Object getKernel_wgs_tm() {
		return kernel_wgs_tm;
	}
	public void setKernel_wgs_tm(Object newKernel_wgs_tm) {
		kernel_wgs_tm = newKernel_wgs_tm;
	}
	public Object getKernel_wgs_memset() {
		return kernel_wgs_memset;
	}
	public void setKernel_wgs_memset(Object newKernel_wgs_memset) {
		kernel_wgs_memset = newKernel_wgs_memset;
	}
	public Object getKernel_wgs_atinit() {
		return kernel_wgs_atinit;
	}
	public void setKernel_wgs_atinit(Object newKernel_wgs_atinit) {
		kernel_wgs_atinit = newKernel_wgs_atinit;
	}
	public Object getKernel_wgs_decompress() {
		return kernel_wgs_decompress;
	}
	public void setKernel_wgs_decompress(Object newKernel_wgs_decompress) {
		kernel_wgs_decompress = newKernel_wgs_decompress;
	}
	public Object getKernel_wgs_aux1() {
		return kernel_wgs_aux1;
	}
	public void setKernel_wgs_aux1(Object newKernel_wgs_aux1) {
		kernel_wgs_aux1 = newKernel_wgs_aux1;
	}
	public Object getKernel_wgs_aux2() {
		return kernel_wgs_aux2;
	}
	public void setKernel_wgs_aux2(Object newKernel_wgs_aux2) {
		kernel_wgs_aux2 = newKernel_wgs_aux2;
	}
	public Object getKernel_wgs_aux3() {
		return kernel_wgs_aux3;
	}
	public void setKernel_wgs_aux3(Object newKernel_wgs_aux3) {
		kernel_wgs_aux3 = newKernel_wgs_aux3;
	}
	public Object getKernel_wgs_aux4() {
		return kernel_wgs_aux4;
	}
	public void setKernel_wgs_aux4(Object newKernel_wgs_aux4) {
		kernel_wgs_aux4 = newKernel_wgs_aux4;
	}
	public Object getKernel_preferred_wgs_multiple1() {
		return kernel_preferred_wgs_multiple1;
	}
	public void setKernel_preferred_wgs_multiple1(Object newKernel_preferred_wgs_multiple1) {
		kernel_preferred_wgs_multiple1 = newKernel_preferred_wgs_multiple1;
	}
	public Object getKernel_preferred_wgs_multiple12() {
		return kernel_preferred_wgs_multiple12;
	}
	public void setKernel_preferred_wgs_multiple12(Object newKernel_preferred_wgs_multiple12) {
		kernel_preferred_wgs_multiple12 = newKernel_preferred_wgs_multiple12;
	}
	public Object getKernel_preferred_wgs_multiple2() {
		return kernel_preferred_wgs_multiple2;
	}
	public void setKernel_preferred_wgs_multiple2(Object newKernel_preferred_wgs_multiple2) {
		kernel_preferred_wgs_multiple2 = newKernel_preferred_wgs_multiple2;
	}
	public Object getKernel_preferred_wgs_multiple23() {
		return kernel_preferred_wgs_multiple23;
	}
	public void setKernel_preferred_wgs_multiple23(Object newKernel_preferred_wgs_multiple23) {
		kernel_preferred_wgs_multiple23 = newKernel_preferred_wgs_multiple23;
	}
	public Object getKernel_preferred_wgs_multiple3() {
		return kernel_preferred_wgs_multiple3;
	}
	public void setKernel_preferred_wgs_multiple3(Object newKernel_preferred_wgs_multiple3) {
		kernel_preferred_wgs_multiple3 = newKernel_preferred_wgs_multiple3;
	}
	public Object getKernel_preferred_wgs_multiple4() {
		return kernel_preferred_wgs_multiple4;
	}
	public void setKernel_preferred_wgs_multiple4(Object newKernel_preferred_wgs_multiple4) {
		kernel_preferred_wgs_multiple4 = newKernel_preferred_wgs_multiple4;
	}
	public Object getKernel_preferred_wgs_multiple_init2() {
		return kernel_preferred_wgs_multiple_init2;
	}
	public void setKernel_preferred_wgs_multiple_init2(Object newKernel_preferred_wgs_multiple_init2) {
		kernel_preferred_wgs_multiple_init2 = newKernel_preferred_wgs_multiple_init2;
	}
	public Object getKernel_preferred_wgs_multiple_loop2() {
		return kernel_preferred_wgs_multiple_loop2;
	}
	public void setKernel_preferred_wgs_multiple_loop2(Object newKernel_preferred_wgs_multiple_loop2) {
		kernel_preferred_wgs_multiple_loop2 = newKernel_preferred_wgs_multiple_loop2;
	}
	public Object getKernel_preferred_wgs_multiple_mp() {
		return kernel_preferred_wgs_multiple_mp;
	}
	public void setKernel_preferred_wgs_multiple_mp(Object newKernel_preferred_wgs_multiple_mp) {
		kernel_preferred_wgs_multiple_mp = newKernel_preferred_wgs_multiple_mp;
	}
	public Object getKernel_preferred_wgs_multiple_mp_l() {
		return kernel_preferred_wgs_multiple_mp_l;
	}
	public void setKernel_preferred_wgs_multiple_mp_l(Object newKernel_preferred_wgs_multiple_mp_l) {
		kernel_preferred_wgs_multiple_mp_l = newKernel_preferred_wgs_multiple_mp_l;
	}
	public Object getKernel_preferred_wgs_multiple_mp_r() {
		return kernel_preferred_wgs_multiple_mp_r;
	}
	public void setKernel_preferred_wgs_multiple_mp_r(Object newKernel_preferred_wgs_multiple_mp_r) {
		kernel_preferred_wgs_multiple_mp_r = newKernel_preferred_wgs_multiple_mp_r;
	}
	public Object getKernel_preferred_wgs_multiple_amp() {
		return kernel_preferred_wgs_multiple_amp;
	}
	public void setKernel_preferred_wgs_multiple_amp(Object newKernel_preferred_wgs_multiple_amp) {
		kernel_preferred_wgs_multiple_amp = newKernel_preferred_wgs_multiple_amp;
	}
	public Object getKernel_preferred_wgs_multiple_tm() {
		return kernel_preferred_wgs_multiple_tm;
	}
	public void setKernel_preferred_wgs_multiple_tm(Object newKernel_preferred_wgs_multiple_tm) {
		kernel_preferred_wgs_multiple_tm = newKernel_preferred_wgs_multiple_tm;
	}
	public Object getKernel_preferred_wgs_multiple_memset() {
		return kernel_preferred_wgs_multiple_memset;
	}
	public void setKernel_preferred_wgs_multiple_memset(Object newKernel_preferred_wgs_multiple_memset) {
		kernel_preferred_wgs_multiple_memset = newKernel_preferred_wgs_multiple_memset;
	}
	public Object getKernel_preferred_wgs_multiple_atinit() {
		return kernel_preferred_wgs_multiple_atinit;
	}
	public void setKernel_preferred_wgs_multiple_atinit(Object newKernel_preferred_wgs_multiple_atinit) {
		kernel_preferred_wgs_multiple_atinit = newKernel_preferred_wgs_multiple_atinit;
	}
	public Object getKernel_preferred_wgs_multiple_decompress() {
		return kernel_preferred_wgs_multiple_decompress;
	}
	public void setKernel_preferred_wgs_multiple_decompress(Object newKernel_preferred_wgs_multiple_decompress) {
		kernel_preferred_wgs_multiple_decompress = newKernel_preferred_wgs_multiple_decompress;
	}
	public Object getKernel_preferred_wgs_multiple_aux1() {
		return kernel_preferred_wgs_multiple_aux1;
	}
	public void setKernel_preferred_wgs_multiple_aux1(Object newKernel_preferred_wgs_multiple_aux1) {
		kernel_preferred_wgs_multiple_aux1 = newKernel_preferred_wgs_multiple_aux1;
	}
	public Object getKernel_preferred_wgs_multiple_aux2() {
		return kernel_preferred_wgs_multiple_aux2;
	}
	public void setKernel_preferred_wgs_multiple_aux2(Object newKernel_preferred_wgs_multiple_aux2) {
		kernel_preferred_wgs_multiple_aux2 = newKernel_preferred_wgs_multiple_aux2;
	}
	public Object getKernel_preferred_wgs_multiple_aux3() {
		return kernel_preferred_wgs_multiple_aux3;
	}
	public void setKernel_preferred_wgs_multiple_aux3(Object newKernel_preferred_wgs_multiple_aux3) {
		kernel_preferred_wgs_multiple_aux3 = newKernel_preferred_wgs_multiple_aux3;
	}
	public Object getKernel_preferred_wgs_multiple_aux4() {
		return kernel_preferred_wgs_multiple_aux4;
	}
	public void setKernel_preferred_wgs_multiple_aux4(Object newKernel_preferred_wgs_multiple_aux4) {
		kernel_preferred_wgs_multiple_aux4 = newKernel_preferred_wgs_multiple_aux4;
	}
	public Object getKernel_local_mem_size1() {
		return kernel_local_mem_size1;
	}
	public void setKernel_local_mem_size1(Object newKernel_local_mem_size1) {
		kernel_local_mem_size1 = newKernel_local_mem_size1;
	}
	public Object getKernel_local_mem_size12() {
		return kernel_local_mem_size12;
	}
	public void setKernel_local_mem_size12(Object newKernel_local_mem_size12) {
		kernel_local_mem_size12 = newKernel_local_mem_size12;
	}
	public Object getKernel_local_mem_size2() {
		return kernel_local_mem_size2;
	}
	public void setKernel_local_mem_size2(Object newKernel_local_mem_size2) {
		kernel_local_mem_size2 = newKernel_local_mem_size2;
	}
	public Object getKernel_local_mem_size23() {
		return kernel_local_mem_size23;
	}
	public void setKernel_local_mem_size23(Object newKernel_local_mem_size23) {
		kernel_local_mem_size23 = newKernel_local_mem_size23;
	}
	public Object getKernel_local_mem_size3() {
		return kernel_local_mem_size3;
	}
	public void setKernel_local_mem_size3(Object newKernel_local_mem_size3) {
		kernel_local_mem_size3 = newKernel_local_mem_size3;
	}
	public Object getKernel_local_mem_size4() {
		return kernel_local_mem_size4;
	}
	public void setKernel_local_mem_size4(Object newKernel_local_mem_size4) {
		kernel_local_mem_size4 = newKernel_local_mem_size4;
	}
	public Object getKernel_local_mem_size_init2() {
		return kernel_local_mem_size_init2;
	}
	public void setKernel_local_mem_size_init2(Object newKernel_local_mem_size_init2) {
		kernel_local_mem_size_init2 = newKernel_local_mem_size_init2;
	}
	public Object getKernel_local_mem_size_loop2() {
		return kernel_local_mem_size_loop2;
	}
	public void setKernel_local_mem_size_loop2(Object newKernel_local_mem_size_loop2) {
		kernel_local_mem_size_loop2 = newKernel_local_mem_size_loop2;
	}
	public Object getKernel_local_mem_size_mp() {
		return kernel_local_mem_size_mp;
	}
	public void setKernel_local_mem_size_mp(Object newKernel_local_mem_size_mp) {
		kernel_local_mem_size_mp = newKernel_local_mem_size_mp;
	}
	public Object getKernel_local_mem_size_mp_l() {
		return kernel_local_mem_size_mp_l;
	}
	public void setKernel_local_mem_size_mp_l(Object newKernel_local_mem_size_mp_l) {
		kernel_local_mem_size_mp_l = newKernel_local_mem_size_mp_l;
	}
	public Object getKernel_local_mem_size_mp_r() {
		return kernel_local_mem_size_mp_r;
	}
	public void setKernel_local_mem_size_mp_r(Object newKernel_local_mem_size_mp_r) {
		kernel_local_mem_size_mp_r = newKernel_local_mem_size_mp_r;
	}
	public Object getKernel_local_mem_size_amp() {
		return kernel_local_mem_size_amp;
	}
	public void setKernel_local_mem_size_amp(Object newKernel_local_mem_size_amp) {
		kernel_local_mem_size_amp = newKernel_local_mem_size_amp;
	}
	public Object getKernel_local_mem_size_tm() {
		return kernel_local_mem_size_tm;
	}
	public void setKernel_local_mem_size_tm(Object newKernel_local_mem_size_tm) {
		kernel_local_mem_size_tm = newKernel_local_mem_size_tm;
	}
	public Object getKernel_local_mem_size_memset() {
		return kernel_local_mem_size_memset;
	}
	public void setKernel_local_mem_size_memset(Object newKernel_local_mem_size_memset) {
		kernel_local_mem_size_memset = newKernel_local_mem_size_memset;
	}
	public Object getKernel_local_mem_size_atinit() {
		return kernel_local_mem_size_atinit;
	}
	public void setKernel_local_mem_size_atinit(Object newKernel_local_mem_size_atinit) {
		kernel_local_mem_size_atinit = newKernel_local_mem_size_atinit;
	}
	public Object getKernel_local_mem_size_decompress() {
		return kernel_local_mem_size_decompress;
	}
	public void setKernel_local_mem_size_decompress(Object newKernel_local_mem_size_decompress) {
		kernel_local_mem_size_decompress = newKernel_local_mem_size_decompress;
	}
	public Object getKernel_local_mem_size_aux1() {
		return kernel_local_mem_size_aux1;
	}
	public void setKernel_local_mem_size_aux1(Object newKernel_local_mem_size_aux1) {
		kernel_local_mem_size_aux1 = newKernel_local_mem_size_aux1;
	}
	public Object getKernel_local_mem_size_aux2() {
		return kernel_local_mem_size_aux2;
	}
	public void setKernel_local_mem_size_aux2(Object newKernel_local_mem_size_aux2) {
		kernel_local_mem_size_aux2 = newKernel_local_mem_size_aux2;
	}
	public Object getKernel_local_mem_size_aux3() {
		return kernel_local_mem_size_aux3;
	}
	public void setKernel_local_mem_size_aux3(Object newKernel_local_mem_size_aux3) {
		kernel_local_mem_size_aux3 = newKernel_local_mem_size_aux3;
	}
	public Object getKernel_local_mem_size_aux4() {
		return kernel_local_mem_size_aux4;
	}
	public void setKernel_local_mem_size_aux4(Object newKernel_local_mem_size_aux4) {
		kernel_local_mem_size_aux4 = newKernel_local_mem_size_aux4;
	}
	public Object getKernel_accel() {
		return kernel_accel;
	}
	public void setKernel_accel(Object newKernel_accel) {
		kernel_accel = newKernel_accel;
	}
	public Object getKernel_accel_prev() {
		return kernel_accel_prev;
	}
	public void setKernel_accel_prev(Object newKernel_accel_prev) {
		kernel_accel_prev = newKernel_accel_prev;
	}
	public Object getKernel_accel_min() {
		return kernel_accel_min;
	}
	public void setKernel_accel_min(Object newKernel_accel_min) {
		kernel_accel_min = newKernel_accel_min;
	}
	public Object getKernel_accel_max() {
		return kernel_accel_max;
	}
	public void setKernel_accel_max(Object newKernel_accel_max) {
		kernel_accel_max = newKernel_accel_max;
	}
	public Object getKernel_loops() {
		return kernel_loops;
	}
	public void setKernel_loops(Object newKernel_loops) {
		kernel_loops = newKernel_loops;
	}
	public Object getKernel_loops_prev() {
		return kernel_loops_prev;
	}
	public void setKernel_loops_prev(Object newKernel_loops_prev) {
		kernel_loops_prev = newKernel_loops_prev;
	}
	public Object getKernel_loops_min() {
		return kernel_loops_min;
	}
	public void setKernel_loops_min(Object newKernel_loops_min) {
		kernel_loops_min = newKernel_loops_min;
	}
	public Object getKernel_loops_max() {
		return kernel_loops_max;
	}
	public void setKernel_loops_max(Object newKernel_loops_max) {
		kernel_loops_max = newKernel_loops_max;
	}
	public Object getKernel_loops_min_sav() {
		return kernel_loops_min_sav;
	}
	public void setKernel_loops_min_sav(Object newKernel_loops_min_sav) {
		kernel_loops_min_sav = newKernel_loops_min_sav;
	}
	public Object getKernel_loops_max_sav() {
		return kernel_loops_max_sav;
	}
	public void setKernel_loops_max_sav(Object newKernel_loops_max_sav) {
		kernel_loops_max_sav = newKernel_loops_max_sav;
	}
	public Object getKernel_threads() {
		return kernel_threads;
	}
	public void setKernel_threads(Object newKernel_threads) {
		kernel_threads = newKernel_threads;
	}
	public Object getKernel_threads_min() {
		return kernel_threads_min;
	}
	public void setKernel_threads_min(Object newKernel_threads_min) {
		kernel_threads_min = newKernel_threads_min;
	}
	public Object getKernel_threads_max() {
		return kernel_threads_max;
	}
	public void setKernel_threads_max(Object newKernel_threads_max) {
		kernel_threads_max = newKernel_threads_max;
	}
	public Object getKernel_power() {
		return kernel_power;
	}
	public void setKernel_power(Object newKernel_power) {
		kernel_power = newKernel_power;
	}
	public Object getHardware_power() {
		return hardware_power;
	}
	public void setHardware_power(Object newHardware_power) {
		hardware_power = newHardware_power;
	}
	public Object getSize_pws() {
		return size_pws;
	}
	public void setSize_pws(Object newSize_pws) {
		size_pws = newSize_pws;
	}
	public Object getSize_pws_amp() {
		return size_pws_amp;
	}
	public void setSize_pws_amp(Object newSize_pws_amp) {
		size_pws_amp = newSize_pws_amp;
	}
	public Object getSize_pws_comp() {
		return size_pws_comp;
	}
	public void setSize_pws_comp(Object newSize_pws_comp) {
		size_pws_comp = newSize_pws_comp;
	}
	public Object getSize_pws_idx() {
		return size_pws_idx;
	}
	public void setSize_pws_idx(Object newSize_pws_idx) {
		size_pws_idx = newSize_pws_idx;
	}
	public Object getSize_pws_pre() {
		return size_pws_pre;
	}
	public void setSize_pws_pre(Object newSize_pws_pre) {
		size_pws_pre = newSize_pws_pre;
	}
	public Object getSize_pws_base() {
		return size_pws_base;
	}
	public void setSize_pws_base(Object newSize_pws_base) {
		size_pws_base = newSize_pws_base;
	}
	public Object getSize_tmps() {
		return size_tmps;
	}
	public void setSize_tmps(Object newSize_tmps) {
		size_tmps = newSize_tmps;
	}
	public Object getSize_hooks() {
		return size_hooks;
	}
	public void setSize_hooks(Object newSize_hooks) {
		size_hooks = newSize_hooks;
	}
	public Object getSize_bfs() {
		return size_bfs;
	}
	public void setSize_bfs(Object newSize_bfs) {
		size_bfs = newSize_bfs;
	}
	public Object getSize_combs() {
		return size_combs;
	}
	public void setSize_combs(Object newSize_combs) {
		size_combs = newSize_combs;
	}
	public Object getSize_rules() {
		return size_rules;
	}
	public void setSize_rules(Object newSize_rules) {
		size_rules = newSize_rules;
	}
	public Object getSize_rules_c() {
		return size_rules_c;
	}
	public void setSize_rules_c(Object newSize_rules_c) {
		size_rules_c = newSize_rules_c;
	}
	public Object getSize_root_css() {
		return size_root_css;
	}
	public void setSize_root_css(Object newSize_root_css) {
		size_root_css = newSize_root_css;
	}
	public Object getSize_markov_css() {
		return size_markov_css;
	}
	public void setSize_markov_css(Object newSize_markov_css) {
		size_markov_css = newSize_markov_css;
	}
	public Object getSize_digests() {
		return size_digests;
	}
	public void setSize_digests(Object newSize_digests) {
		size_digests = newSize_digests;
	}
	public Object getSize_salts() {
		return size_salts;
	}
	public void setSize_salts(Object newSize_salts) {
		size_salts = newSize_salts;
	}
	public Object getSize_esalts() {
		return size_esalts;
	}
	public void setSize_esalts(Object newSize_esalts) {
		size_esalts = newSize_esalts;
	}
	public Object getSize_shown() {
		return size_shown;
	}
	public void setSize_shown(Object newSize_shown) {
		size_shown = newSize_shown;
	}
	public Object getSize_results() {
		return size_results;
	}
	public void setSize_results(Object newSize_results) {
		size_results = newSize_results;
	}
	public Object getSize_plains() {
		return size_plains;
	}
	public void setSize_plains(Object newSize_plains) {
		size_plains = newSize_plains;
	}
	public Object getSize_st_digests() {
		return size_st_digests;
	}
	public void setSize_st_digests(Object newSize_st_digests) {
		size_st_digests = newSize_st_digests;
	}
	public Object getSize_st_salts() {
		return size_st_salts;
	}
	public void setSize_st_salts(Object newSize_st_salts) {
		size_st_salts = newSize_st_salts;
	}
	public Object getSize_st_esalts() {
		return size_st_esalts;
	}
	public void setSize_st_esalts(Object newSize_st_esalts) {
		size_st_esalts = newSize_st_esalts;
	}
	public Object getSize_tm() {
		return size_tm;
	}
	public void setSize_tm(Object newSize_tm) {
		size_tm = newSize_tm;
	}
	public Object getExtra_buffer_size() {
		return extra_buffer_size;
	}
	public void setExtra_buffer_size(Object newExtra_buffer_size) {
		extra_buffer_size = newExtra_buffer_size;
	}
	public Byte getScratch_buf() {
		return scratch_buf;
	}
	public void setScratch_buf(Byte newScratch_buf) {
		scratch_buf = newScratch_buf;
	}
	public hc_fp getCombs_fp() {
		return combs_fp;
	}
	public void setCombs_fp(hc_fp newCombs_fp) {
		combs_fp = newCombs_fp;
	}
	public pw[] getCombs_buf() {
		return combs_buf;
	}
	public void setCombs_buf(pw[] newCombs_buf) {
		combs_buf = newCombs_buf;
	}
	public Object getHooks_buf() {
		return hooks_buf;
	}
	public void setHooks_buf(Object newHooks_buf) {
		hooks_buf = newHooks_buf;
	}
	public pw_idx getPws_idx() {
		return pws_idx;
	}
	public void setPws_idx(pw_idx newPws_idx) {
		pws_idx = newPws_idx;
	}
	public Object getPws_comp() {
		return pws_comp;
	}
	public void setPws_comp(Object newPws_comp) {
		pws_comp = newPws_comp;
	}
	public Object getPws_cnt() {
		return pws_cnt;
	}
	public void setPws_cnt(Object newPws_cnt) {
		pws_cnt = newPws_cnt;
	}
	public pw_pre getPws_pre_buf() {
		return pws_pre_buf;
	}
	public void setPws_pre_buf(pw_pre newPws_pre_buf) {
		pws_pre_buf = newPws_pre_buf;
	}
	public Object getPws_pre_cnt() {
		return pws_pre_cnt;
	}
	public void setPws_pre_cnt(Object newPws_pre_cnt) {
		pws_pre_cnt = newPws_pre_cnt;
	}
	public pw_pre getPws_base_buf() {
		return pws_base_buf;
	}
	public void setPws_base_buf(pw_pre newPws_base_buf) {
		pws_base_buf = newPws_base_buf;
	}
	public Object getPws_base_cnt() {
		return pws_base_cnt;
	}
	public void setPws_base_cnt(Object newPws_base_cnt) {
		pws_base_cnt = newPws_base_cnt;
	}
	public Object getWords_off() {
		return words_off;
	}
	public void setWords_off(Object newWords_off) {
		words_off = newWords_off;
	}
	public Object getWords_done() {
		return words_done;
	}
	public void setWords_done(Object newWords_done) {
		words_done = newWords_done;
	}
	public Object getOuterloop_pos() {
		return outerloop_pos;
	}
	public void setOuterloop_pos(Object newOuterloop_pos) {
		outerloop_pos = newOuterloop_pos;
	}
	public Object getOuterloop_left() {
		return outerloop_left;
	}
	public void setOuterloop_left(Object newOuterloop_left) {
		outerloop_left = newOuterloop_left;
	}
	public double getOuterloop_msec() {
		return outerloop_msec;
	}
	public void setOuterloop_msec(double newOuterloop_msec) {
		outerloop_msec = newOuterloop_msec;
	}
	public double getOuterloop_multi() {
		return outerloop_multi;
	}
	public void setOuterloop_multi(double newOuterloop_multi) {
		outerloop_multi = newOuterloop_multi;
	}
	public Object getInnerloop_pos() {
		return innerloop_pos;
	}
	public void setInnerloop_pos(Object newInnerloop_pos) {
		innerloop_pos = newInnerloop_pos;
	}
	public Object getInnerloop_left() {
		return innerloop_left;
	}
	public void setInnerloop_left(Object newInnerloop_left) {
		innerloop_left = newInnerloop_left;
	}
	public Object getExec_pos() {
		return exec_pos;
	}
	public void setExec_pos(Object newExec_pos) {
		exec_pos = newExec_pos;
	}
	public Object getExec_msec() {
		return exec_msec;
	}
	public void setExec_msec(Object newExec_msec) {
		exec_msec = newExec_msec;
	}
	public Object getExec_us_prev1() {
		return exec_us_prev1;
	}
	public void setExec_us_prev1(Object newExec_us_prev1) {
		exec_us_prev1 = newExec_us_prev1;
	}
	public Object getExec_us_prev2() {
		return exec_us_prev2;
	}
	public void setExec_us_prev2(Object newExec_us_prev2) {
		exec_us_prev2 = newExec_us_prev2;
	}
	public Object getExec_us_prev3() {
		return exec_us_prev3;
	}
	public void setExec_us_prev3(Object newExec_us_prev3) {
		exec_us_prev3 = newExec_us_prev3;
	}
	public Object getExec_us_prev4() {
		return exec_us_prev4;
	}
	public void setExec_us_prev4(Object newExec_us_prev4) {
		exec_us_prev4 = newExec_us_prev4;
	}
	public Object getExec_us_prev_init2() {
		return exec_us_prev_init2;
	}
	public void setExec_us_prev_init2(Object newExec_us_prev_init2) {
		exec_us_prev_init2 = newExec_us_prev_init2;
	}
	public Object getExec_us_prev_loop2() {
		return exec_us_prev_loop2;
	}
	public void setExec_us_prev_loop2(Object newExec_us_prev_loop2) {
		exec_us_prev_loop2 = newExec_us_prev_loop2;
	}
	public Object getExec_us_prev_aux1() {
		return exec_us_prev_aux1;
	}
	public void setExec_us_prev_aux1(Object newExec_us_prev_aux1) {
		exec_us_prev_aux1 = newExec_us_prev_aux1;
	}
	public Object getExec_us_prev_aux2() {
		return exec_us_prev_aux2;
	}
	public void setExec_us_prev_aux2(Object newExec_us_prev_aux2) {
		exec_us_prev_aux2 = newExec_us_prev_aux2;
	}
	public Object getExec_us_prev_aux3() {
		return exec_us_prev_aux3;
	}
	public void setExec_us_prev_aux3(Object newExec_us_prev_aux3) {
		exec_us_prev_aux3 = newExec_us_prev_aux3;
	}
	public Object getExec_us_prev_aux4() {
		return exec_us_prev_aux4;
	}
	public void setExec_us_prev_aux4(Object newExec_us_prev_aux4) {
		exec_us_prev_aux4 = newExec_us_prev_aux4;
	}
	public Object getSpeed_pos() {
		return speed_pos;
	}
	public void setSpeed_pos(Object newSpeed_pos) {
		speed_pos = newSpeed_pos;
	}
	public Object getSpeed_cnt() {
		return speed_cnt;
	}
	public void setSpeed_cnt(Object newSpeed_cnt) {
		speed_cnt = newSpeed_cnt;
	}
	public Object getSpeed_msec() {
		return speed_msec;
	}
	public void setSpeed_msec(Object newSpeed_msec) {
		speed_msec = newSpeed_msec;
	}
	public boolean getSpeed_only_finish() {
		return speed_only_finish;
	}
	public void setSpeed_only_finish(boolean newSpeed_only_finish) {
		speed_only_finish = newSpeed_only_finish;
	}
	public Object getTimer_speed() {
		return timer_speed;
	}
	public void setTimer_speed(Object newTimer_speed) {
		timer_speed = newTimer_speed;
	}
	public boolean getHas_vadd3() {
		return has_vadd3;
	}
	public void setHas_vadd3(boolean newHas_vadd3) {
		has_vadd3 = newHas_vadd3;
	}
	public boolean getHas_vbfe() {
		return has_vbfe;
	}
	public void setHas_vbfe(boolean newHas_vbfe) {
		has_vbfe = newHas_vbfe;
	}
	public boolean getHas_vperm() {
		return has_vperm;
	}
	public void setHas_vperm(boolean newHas_vperm) {
		has_vperm = newHas_vperm;
	}
	public boolean getHas_bfe() {
		return has_bfe;
	}
	public void setHas_bfe(boolean newHas_bfe) {
		has_bfe = newHas_bfe;
	}
	public boolean getHas_lop3() {
		return has_lop3;
	}
	public void setHas_lop3(boolean newHas_lop3) {
		has_lop3 = newHas_lop3;
	}
	public boolean getHas_mov64() {
		return has_mov64;
	}
	public void setHas_mov64(boolean newHas_mov64) {
		has_mov64 = newHas_mov64;
	}
	public boolean getHas_prmt() {
		return has_prmt;
	}
	public void setHas_prmt(boolean newHas_prmt) {
		has_prmt = newHas_prmt;
	}
	public double getSpin_damp() {
		return spin_damp;
	}
	public void setSpin_damp(double newSpin_damp) {
		spin_damp = newSpin_damp;
	}
	public Object getKernel_params() {
		return kernel_params;
	}
	public void setKernel_params(Object newKernel_params) {
		kernel_params = newKernel_params;
	}
	public Object getKernel_params_mp() {
		return kernel_params_mp;
	}
	public void setKernel_params_mp(Object newKernel_params_mp) {
		kernel_params_mp = newKernel_params_mp;
	}
	public Object getKernel_params_mp_r() {
		return kernel_params_mp_r;
	}
	public void setKernel_params_mp_r(Object newKernel_params_mp_r) {
		kernel_params_mp_r = newKernel_params_mp_r;
	}
	public Object getKernel_params_mp_l() {
		return kernel_params_mp_l;
	}
	public void setKernel_params_mp_l(Object newKernel_params_mp_l) {
		kernel_params_mp_l = newKernel_params_mp_l;
	}
	public Object getKernel_params_amp() {
		return kernel_params_amp;
	}
	public void setKernel_params_amp(Object newKernel_params_amp) {
		kernel_params_amp = newKernel_params_amp;
	}
	public Object getKernel_params_tm() {
		return kernel_params_tm;
	}
	public void setKernel_params_tm(Object newKernel_params_tm) {
		kernel_params_tm = newKernel_params_tm;
	}
	public Object getKernel_params_memset() {
		return kernel_params_memset;
	}
	public void setKernel_params_memset(Object newKernel_params_memset) {
		kernel_params_memset = newKernel_params_memset;
	}
	public Object getKernel_params_atinit() {
		return kernel_params_atinit;
	}
	public void setKernel_params_atinit(Object newKernel_params_atinit) {
		kernel_params_atinit = newKernel_params_atinit;
	}
	public Object getKernel_params_decompress() {
		return kernel_params_decompress;
	}
	public void setKernel_params_decompress(Object newKernel_params_decompress) {
		kernel_params_decompress = newKernel_params_decompress;
	}
	public Object getKernel_params_buf32() {
		return kernel_params_buf32;
	}
	public void setKernel_params_buf32(Object newKernel_params_buf32) {
		kernel_params_buf32 = newKernel_params_buf32;
	}
	public Object getKernel_params_buf64() {
		return kernel_params_buf64;
	}
	public void setKernel_params_buf64(Object newKernel_params_buf64) {
		kernel_params_buf64 = newKernel_params_buf64;
	}
	public Object getKernel_params_mp_buf32() {
		return kernel_params_mp_buf32;
	}
	public void setKernel_params_mp_buf32(Object newKernel_params_mp_buf32) {
		kernel_params_mp_buf32 = newKernel_params_mp_buf32;
	}
	public Object getKernel_params_mp_buf64() {
		return kernel_params_mp_buf64;
	}
	public void setKernel_params_mp_buf64(Object newKernel_params_mp_buf64) {
		kernel_params_mp_buf64 = newKernel_params_mp_buf64;
	}
	public Object getKernel_params_mp_r_buf32() {
		return kernel_params_mp_r_buf32;
	}
	public void setKernel_params_mp_r_buf32(Object newKernel_params_mp_r_buf32) {
		kernel_params_mp_r_buf32 = newKernel_params_mp_r_buf32;
	}
	public Object getKernel_params_mp_r_buf64() {
		return kernel_params_mp_r_buf64;
	}
	public void setKernel_params_mp_r_buf64(Object newKernel_params_mp_r_buf64) {
		kernel_params_mp_r_buf64 = newKernel_params_mp_r_buf64;
	}
	public Object getKernel_params_mp_l_buf32() {
		return kernel_params_mp_l_buf32;
	}
	public void setKernel_params_mp_l_buf32(Object newKernel_params_mp_l_buf32) {
		kernel_params_mp_l_buf32 = newKernel_params_mp_l_buf32;
	}
	public Object getKernel_params_mp_l_buf64() {
		return kernel_params_mp_l_buf64;
	}
	public void setKernel_params_mp_l_buf64(Object newKernel_params_mp_l_buf64) {
		kernel_params_mp_l_buf64 = newKernel_params_mp_l_buf64;
	}
	public Object getKernel_params_amp_buf32() {
		return kernel_params_amp_buf32;
	}
	public void setKernel_params_amp_buf32(Object newKernel_params_amp_buf32) {
		kernel_params_amp_buf32 = newKernel_params_amp_buf32;
	}
	public Object getKernel_params_amp_buf64() {
		return kernel_params_amp_buf64;
	}
	public void setKernel_params_amp_buf64(Object newKernel_params_amp_buf64) {
		kernel_params_amp_buf64 = newKernel_params_amp_buf64;
	}
	public Object getKernel_params_memset_buf32() {
		return kernel_params_memset_buf32;
	}
	public void setKernel_params_memset_buf32(Object newKernel_params_memset_buf32) {
		kernel_params_memset_buf32 = newKernel_params_memset_buf32;
	}
	public Object getKernel_params_memset_buf64() {
		return kernel_params_memset_buf64;
	}
	public void setKernel_params_memset_buf64(Object newKernel_params_memset_buf64) {
		kernel_params_memset_buf64 = newKernel_params_memset_buf64;
	}
	public Object getKernel_params_atinit_buf32() {
		return kernel_params_atinit_buf32;
	}
	public void setKernel_params_atinit_buf32(Object newKernel_params_atinit_buf32) {
		kernel_params_atinit_buf32 = newKernel_params_atinit_buf32;
	}
	public Object getKernel_params_atinit_buf64() {
		return kernel_params_atinit_buf64;
	}
	public void setKernel_params_atinit_buf64(Object newKernel_params_atinit_buf64) {
		kernel_params_atinit_buf64 = newKernel_params_atinit_buf64;
	}
	public Object getKernel_params_decompress_buf32() {
		return kernel_params_decompress_buf32;
	}
	public void setKernel_params_decompress_buf32(Object newKernel_params_decompress_buf32) {
		kernel_params_decompress_buf32 = newKernel_params_decompress_buf32;
	}
	public Object getKernel_params_decompress_buf64() {
		return kernel_params_decompress_buf64;
	}
	public void setKernel_params_decompress_buf64(Object newKernel_params_decompress_buf64) {
		kernel_params_decompress_buf64 = newKernel_params_decompress_buf64;
	}
	public boolean getIs_cuda() {
		return is_cuda;
	}
	public void setIs_cuda(boolean newIs_cuda) {
		is_cuda = newIs_cuda;
	}
	public int getCuda_warp_size() {
		return cuda_warp_size;
	}
	public void setCuda_warp_size(int newCuda_warp_size) {
		cuda_warp_size = newCuda_warp_size;
	}
	public Object getCuda_device() {
		return cuda_device;
	}
	public void setCuda_device(Object newCuda_device) {
		cuda_device = newCuda_device;
	}
	public Object getCuda_context() {
		return cuda_context;
	}
	public void setCuda_context(Object newCuda_context) {
		cuda_context = newCuda_context;
	}
	public Object getCuda_stream() {
		return cuda_stream;
	}
	public void setCuda_stream(Object newCuda_stream) {
		cuda_stream = newCuda_stream;
	}
	public Object getCuda_event1() {
		return cuda_event1;
	}
	public void setCuda_event1(Object newCuda_event1) {
		cuda_event1 = newCuda_event1;
	}
	public Object getCuda_event2() {
		return cuda_event2;
	}
	public void setCuda_event2(Object newCuda_event2) {
		cuda_event2 = newCuda_event2;
	}
	public Object getCuda_module() {
		return cuda_module;
	}
	public void setCuda_module(Object newCuda_module) {
		cuda_module = newCuda_module;
	}
	public Object getCuda_module_mp() {
		return cuda_module_mp;
	}
	public void setCuda_module_mp(Object newCuda_module_mp) {
		cuda_module_mp = newCuda_module_mp;
	}
	public Object getCuda_module_amp() {
		return cuda_module_amp;
	}
	public void setCuda_module_amp(Object newCuda_module_amp) {
		cuda_module_amp = newCuda_module_amp;
	}
	public Object getCuda_function1() {
		return cuda_function1;
	}
	public void setCuda_function1(Object newCuda_function1) {
		cuda_function1 = newCuda_function1;
	}
	public Object getCuda_function12() {
		return cuda_function12;
	}
	public void setCuda_function12(Object newCuda_function12) {
		cuda_function12 = newCuda_function12;
	}
	public Object getCuda_function2() {
		return cuda_function2;
	}
	public void setCuda_function2(Object newCuda_function2) {
		cuda_function2 = newCuda_function2;
	}
	public Object getCuda_function23() {
		return cuda_function23;
	}
	public void setCuda_function23(Object newCuda_function23) {
		cuda_function23 = newCuda_function23;
	}
	public Object getCuda_function3() {
		return cuda_function3;
	}
	public void setCuda_function3(Object newCuda_function3) {
		cuda_function3 = newCuda_function3;
	}
	public Object getCuda_function4() {
		return cuda_function4;
	}
	public void setCuda_function4(Object newCuda_function4) {
		cuda_function4 = newCuda_function4;
	}
	public Object getCuda_function_init2() {
		return cuda_function_init2;
	}
	public void setCuda_function_init2(Object newCuda_function_init2) {
		cuda_function_init2 = newCuda_function_init2;
	}
	public Object getCuda_function_loop2() {
		return cuda_function_loop2;
	}
	public void setCuda_function_loop2(Object newCuda_function_loop2) {
		cuda_function_loop2 = newCuda_function_loop2;
	}
	public Object getCuda_function_mp() {
		return cuda_function_mp;
	}
	public void setCuda_function_mp(Object newCuda_function_mp) {
		cuda_function_mp = newCuda_function_mp;
	}
	public Object getCuda_function_mp_l() {
		return cuda_function_mp_l;
	}
	public void setCuda_function_mp_l(Object newCuda_function_mp_l) {
		cuda_function_mp_l = newCuda_function_mp_l;
	}
	public Object getCuda_function_mp_r() {
		return cuda_function_mp_r;
	}
	public void setCuda_function_mp_r(Object newCuda_function_mp_r) {
		cuda_function_mp_r = newCuda_function_mp_r;
	}
	public Object getCuda_function_amp() {
		return cuda_function_amp;
	}
	public void setCuda_function_amp(Object newCuda_function_amp) {
		cuda_function_amp = newCuda_function_amp;
	}
	public Object getCuda_function_tm() {
		return cuda_function_tm;
	}
	public void setCuda_function_tm(Object newCuda_function_tm) {
		cuda_function_tm = newCuda_function_tm;
	}
	public Object getCuda_function_memset() {
		return cuda_function_memset;
	}
	public void setCuda_function_memset(Object newCuda_function_memset) {
		cuda_function_memset = newCuda_function_memset;
	}
	public Object getCuda_function_atinit() {
		return cuda_function_atinit;
	}
	public void setCuda_function_atinit(Object newCuda_function_atinit) {
		cuda_function_atinit = newCuda_function_atinit;
	}
	public Object getCuda_function_decompress() {
		return cuda_function_decompress;
	}
	public void setCuda_function_decompress(Object newCuda_function_decompress) {
		cuda_function_decompress = newCuda_function_decompress;
	}
	public Object getCuda_function_aux1() {
		return cuda_function_aux1;
	}
	public void setCuda_function_aux1(Object newCuda_function_aux1) {
		cuda_function_aux1 = newCuda_function_aux1;
	}
	public Object getCuda_function_aux2() {
		return cuda_function_aux2;
	}
	public void setCuda_function_aux2(Object newCuda_function_aux2) {
		cuda_function_aux2 = newCuda_function_aux2;
	}
	public Object getCuda_function_aux3() {
		return cuda_function_aux3;
	}
	public void setCuda_function_aux3(Object newCuda_function_aux3) {
		cuda_function_aux3 = newCuda_function_aux3;
	}
	public Object getCuda_function_aux4() {
		return cuda_function_aux4;
	}
	public void setCuda_function_aux4(Object newCuda_function_aux4) {
		cuda_function_aux4 = newCuda_function_aux4;
	}
	public Object getCuda_d_pws_buf() {
		return cuda_d_pws_buf;
	}
	public void setCuda_d_pws_buf(Object newCuda_d_pws_buf) {
		cuda_d_pws_buf = newCuda_d_pws_buf;
	}
	public Object getCuda_d_pws_amp_buf() {
		return cuda_d_pws_amp_buf;
	}
	public void setCuda_d_pws_amp_buf(Object newCuda_d_pws_amp_buf) {
		cuda_d_pws_amp_buf = newCuda_d_pws_amp_buf;
	}
	public Object getCuda_d_pws_comp_buf() {
		return cuda_d_pws_comp_buf;
	}
	public void setCuda_d_pws_comp_buf(Object newCuda_d_pws_comp_buf) {
		cuda_d_pws_comp_buf = newCuda_d_pws_comp_buf;
	}
	public Object getCuda_d_pws_idx() {
		return cuda_d_pws_idx;
	}
	public void setCuda_d_pws_idx(Object newCuda_d_pws_idx) {
		cuda_d_pws_idx = newCuda_d_pws_idx;
	}
	public Object getCuda_d_words_buf_l() {
		return cuda_d_words_buf_l;
	}
	public void setCuda_d_words_buf_l(Object newCuda_d_words_buf_l) {
		cuda_d_words_buf_l = newCuda_d_words_buf_l;
	}
	public Object getCuda_d_words_buf_r() {
		return cuda_d_words_buf_r;
	}
	public void setCuda_d_words_buf_r(Object newCuda_d_words_buf_r) {
		cuda_d_words_buf_r = newCuda_d_words_buf_r;
	}
	public Object getCuda_d_rules() {
		return cuda_d_rules;
	}
	public void setCuda_d_rules(Object newCuda_d_rules) {
		cuda_d_rules = newCuda_d_rules;
	}
	public Object getCuda_d_rules_c() {
		return cuda_d_rules_c;
	}
	public void setCuda_d_rules_c(Object newCuda_d_rules_c) {
		cuda_d_rules_c = newCuda_d_rules_c;
	}
	public Object getCuda_d_combs() {
		return cuda_d_combs;
	}
	public void setCuda_d_combs(Object newCuda_d_combs) {
		cuda_d_combs = newCuda_d_combs;
	}
	public Object getCuda_d_combs_c() {
		return cuda_d_combs_c;
	}
	public void setCuda_d_combs_c(Object newCuda_d_combs_c) {
		cuda_d_combs_c = newCuda_d_combs_c;
	}
	public Object getCuda_d_bfs() {
		return cuda_d_bfs;
	}
	public void setCuda_d_bfs(Object newCuda_d_bfs) {
		cuda_d_bfs = newCuda_d_bfs;
	}
	public Object getCuda_d_bfs_c() {
		return cuda_d_bfs_c;
	}
	public void setCuda_d_bfs_c(Object newCuda_d_bfs_c) {
		cuda_d_bfs_c = newCuda_d_bfs_c;
	}
	public Object getCuda_d_tm_c() {
		return cuda_d_tm_c;
	}
	public void setCuda_d_tm_c(Object newCuda_d_tm_c) {
		cuda_d_tm_c = newCuda_d_tm_c;
	}
	public Object getCuda_d_bitmap_s1_a() {
		return cuda_d_bitmap_s1_a;
	}
	public void setCuda_d_bitmap_s1_a(Object newCuda_d_bitmap_s1_a) {
		cuda_d_bitmap_s1_a = newCuda_d_bitmap_s1_a;
	}
	public Object getCuda_d_bitmap_s1_b() {
		return cuda_d_bitmap_s1_b;
	}
	public void setCuda_d_bitmap_s1_b(Object newCuda_d_bitmap_s1_b) {
		cuda_d_bitmap_s1_b = newCuda_d_bitmap_s1_b;
	}
	public Object getCuda_d_bitmap_s1_c() {
		return cuda_d_bitmap_s1_c;
	}
	public void setCuda_d_bitmap_s1_c(Object newCuda_d_bitmap_s1_c) {
		cuda_d_bitmap_s1_c = newCuda_d_bitmap_s1_c;
	}
	public Object getCuda_d_bitmap_s1_d() {
		return cuda_d_bitmap_s1_d;
	}
	public void setCuda_d_bitmap_s1_d(Object newCuda_d_bitmap_s1_d) {
		cuda_d_bitmap_s1_d = newCuda_d_bitmap_s1_d;
	}
	public Object getCuda_d_bitmap_s2_a() {
		return cuda_d_bitmap_s2_a;
	}
	public void setCuda_d_bitmap_s2_a(Object newCuda_d_bitmap_s2_a) {
		cuda_d_bitmap_s2_a = newCuda_d_bitmap_s2_a;
	}
	public Object getCuda_d_bitmap_s2_b() {
		return cuda_d_bitmap_s2_b;
	}
	public void setCuda_d_bitmap_s2_b(Object newCuda_d_bitmap_s2_b) {
		cuda_d_bitmap_s2_b = newCuda_d_bitmap_s2_b;
	}
	public Object getCuda_d_bitmap_s2_c() {
		return cuda_d_bitmap_s2_c;
	}
	public void setCuda_d_bitmap_s2_c(Object newCuda_d_bitmap_s2_c) {
		cuda_d_bitmap_s2_c = newCuda_d_bitmap_s2_c;
	}
	public Object getCuda_d_bitmap_s2_d() {
		return cuda_d_bitmap_s2_d;
	}
	public void setCuda_d_bitmap_s2_d(Object newCuda_d_bitmap_s2_d) {
		cuda_d_bitmap_s2_d = newCuda_d_bitmap_s2_d;
	}
	public Object getCuda_d_plain_bufs() {
		return cuda_d_plain_bufs;
	}
	public void setCuda_d_plain_bufs(Object newCuda_d_plain_bufs) {
		cuda_d_plain_bufs = newCuda_d_plain_bufs;
	}
	public Object getCuda_d_digests_buf() {
		return cuda_d_digests_buf;
	}
	public void setCuda_d_digests_buf(Object newCuda_d_digests_buf) {
		cuda_d_digests_buf = newCuda_d_digests_buf;
	}
	public Object getCuda_d_digests_shown() {
		return cuda_d_digests_shown;
	}
	public void setCuda_d_digests_shown(Object newCuda_d_digests_shown) {
		cuda_d_digests_shown = newCuda_d_digests_shown;
	}
	public Object getCuda_d_salt_bufs() {
		return cuda_d_salt_bufs;
	}
	public void setCuda_d_salt_bufs(Object newCuda_d_salt_bufs) {
		cuda_d_salt_bufs = newCuda_d_salt_bufs;
	}
	public Object getCuda_d_esalt_bufs() {
		return cuda_d_esalt_bufs;
	}
	public void setCuda_d_esalt_bufs(Object newCuda_d_esalt_bufs) {
		cuda_d_esalt_bufs = newCuda_d_esalt_bufs;
	}
	public Object getCuda_d_tmps() {
		return cuda_d_tmps;
	}
	public void setCuda_d_tmps(Object newCuda_d_tmps) {
		cuda_d_tmps = newCuda_d_tmps;
	}
	public Object getCuda_d_hooks() {
		return cuda_d_hooks;
	}
	public void setCuda_d_hooks(Object newCuda_d_hooks) {
		cuda_d_hooks = newCuda_d_hooks;
	}
	public Object getCuda_d_result() {
		return cuda_d_result;
	}
	public void setCuda_d_result(Object newCuda_d_result) {
		cuda_d_result = newCuda_d_result;
	}
	public Object getCuda_d_extra0_buf() {
		return cuda_d_extra0_buf;
	}
	public void setCuda_d_extra0_buf(Object newCuda_d_extra0_buf) {
		cuda_d_extra0_buf = newCuda_d_extra0_buf;
	}
	public Object getCuda_d_extra1_buf() {
		return cuda_d_extra1_buf;
	}
	public void setCuda_d_extra1_buf(Object newCuda_d_extra1_buf) {
		cuda_d_extra1_buf = newCuda_d_extra1_buf;
	}
	public Object getCuda_d_extra2_buf() {
		return cuda_d_extra2_buf;
	}
	public void setCuda_d_extra2_buf(Object newCuda_d_extra2_buf) {
		cuda_d_extra2_buf = newCuda_d_extra2_buf;
	}
	public Object getCuda_d_extra3_buf() {
		return cuda_d_extra3_buf;
	}
	public void setCuda_d_extra3_buf(Object newCuda_d_extra3_buf) {
		cuda_d_extra3_buf = newCuda_d_extra3_buf;
	}
	public Object getCuda_d_root_css_buf() {
		return cuda_d_root_css_buf;
	}
	public void setCuda_d_root_css_buf(Object newCuda_d_root_css_buf) {
		cuda_d_root_css_buf = newCuda_d_root_css_buf;
	}
	public Object getCuda_d_markov_css_buf() {
		return cuda_d_markov_css_buf;
	}
	public void setCuda_d_markov_css_buf(Object newCuda_d_markov_css_buf) {
		cuda_d_markov_css_buf = newCuda_d_markov_css_buf;
	}
	public Object getCuda_d_st_digests_buf() {
		return cuda_d_st_digests_buf;
	}
	public void setCuda_d_st_digests_buf(Object newCuda_d_st_digests_buf) {
		cuda_d_st_digests_buf = newCuda_d_st_digests_buf;
	}
	public Object getCuda_d_st_salts_buf() {
		return cuda_d_st_salts_buf;
	}
	public void setCuda_d_st_salts_buf(Object newCuda_d_st_salts_buf) {
		cuda_d_st_salts_buf = newCuda_d_st_salts_buf;
	}
	public Object getCuda_d_st_esalts_buf() {
		return cuda_d_st_esalts_buf;
	}
	public void setCuda_d_st_esalts_buf(Object newCuda_d_st_esalts_buf) {
		cuda_d_st_esalts_buf = newCuda_d_st_esalts_buf;
	}
	public boolean getIs_opencl() {
		return is_opencl;
	}
	public void setIs_opencl(boolean newIs_opencl) {
		is_opencl = newIs_opencl;
	}
	public Byte getOpencl_driver_version() {
		return opencl_driver_version;
	}
	public void setOpencl_driver_version(Byte newOpencl_driver_version) {
		opencl_driver_version = newOpencl_driver_version;
	}
	public Byte getOpencl_device_vendor() {
		return opencl_device_vendor;
	}
	public void setOpencl_device_vendor(Byte newOpencl_device_vendor) {
		opencl_device_vendor = newOpencl_device_vendor;
	}
	public Byte getOpencl_device_version() {
		return opencl_device_version;
	}
	public void setOpencl_device_version(Byte newOpencl_device_version) {
		opencl_device_version = newOpencl_device_version;
	}
	public Byte getOpencl_device_c_version() {
		return opencl_device_c_version;
	}
	public void setOpencl_device_c_version(Byte newOpencl_device_c_version) {
		opencl_device_c_version = newOpencl_device_c_version;
	}
	public Object getOpencl_device_type() {
		return opencl_device_type;
	}
	public void setOpencl_device_type(Object newOpencl_device_type) {
		opencl_device_type = newOpencl_device_type;
	}
	public Object getOpencl_device_vendor_id() {
		return opencl_device_vendor_id;
	}
	public void setOpencl_device_vendor_id(Object newOpencl_device_vendor_id) {
		opencl_device_vendor_id = newOpencl_device_vendor_id;
	}
	public Object getOpencl_platform_vendor_id() {
		return opencl_platform_vendor_id;
	}
	public void setOpencl_platform_vendor_id(Object newOpencl_platform_vendor_id) {
		opencl_platform_vendor_id = newOpencl_platform_vendor_id;
	}
	public Object getOpencl_device() {
		return opencl_device;
	}
	public void setOpencl_device(Object newOpencl_device) {
		opencl_device = newOpencl_device;
	}
}
