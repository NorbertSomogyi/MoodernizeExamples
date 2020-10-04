package application;

public class Nhdp_initToNhdp_reader_init {
	
	
	private static void nhdp_init() {
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
	private static void nhdp_writer_init() {
		rfc5444_writer_message _hello_msg = new rfc5444_writer_message();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/mutex_lock(ModernizedCProgram.mtx_packet_write);
		ModernizedCProgram.nhdp_wr_curr_if_entry = (null);
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
	private static void nhdp_reader_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_reader_init(/* Initialize reader */ModernizedCProgram.reader);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_reader_add_packet_consumer(ModernizedCProgram.reader, ModernizedCProgram._nhdp_packet_consumer, NULL, /* Register packet consumer for sequence number processing */0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_reader_add_message_consumer(ModernizedCProgram.reader, /* Register HELLO message consumer */ModernizedCProgram._nhdp_msg_consumer, ModernizedCProgram._nhdp_msg_tlvs, /*Error: Function owner not recognized*/ARRAY_SIZE(ModernizedCProgram._nhdp_msg_tlvs));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/rfc5444_reader_add_message_consumer(ModernizedCProgram.reader, ModernizedCProgram._nhdp_address_consumer, ModernizedCProgram._nhdp_addr_tlvs, /*Error: Function owner not recognized*/ARRAY_SIZE(ModernizedCProgram._nhdp_addr_tlvs));
	}
}
