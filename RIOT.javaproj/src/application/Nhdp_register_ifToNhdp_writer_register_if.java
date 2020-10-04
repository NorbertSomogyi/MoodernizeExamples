package application;

public class Nhdp_register_ifToNhdp_writer_register_if {
	
	
	private static int nhdp_register_if(Object if_pid, Object addr, Object addr_size, Object addr_type, Object max_pl_size, Object hello_int_ms, Object val_time_ms) {
		nhdp_if_entry_t if_entry = (null);
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
		ModernizedCProgram.nhdp_rcv_pid = /*Error: Function owner not recognized*/thread_create(ModernizedCProgram.nhdp_rcv_stack, /*Error: sizeof expression not supported yet*/, THREAD_PRIORITY_MAIN - /* Start the receiving thread */1, THREAD_CREATE_STACKTEST, ModernizedCProgram._nhdp_receiver, (null), "nhdp_rcv_thread");
		signal_msg.setType((/* Start sending periodic HELLO */true));
		signal_msg.getContent().setPtr(if_entry);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_try_send(signal_msg, /* TODO: msg_send or msg_try_send? */ModernizedCProgram.nhdp_pid);
		return 0;
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
	private static void nhdp_writer_register_if(Object new_if) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_packet_write);
		new_if.setAddPacketHeader(/* Add packet header callback to writer target of the interface */ModernizedCProgram._nhdp_add_packet_header_cb);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_writer_register_target(ModernizedCProgram.nhdp_writer, /* Register target interface in writer */new_if);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_unlock(ModernizedCProgram.mtx_packet_write);
	}
}
