package application;

public class Stdio_writeToUsbus_cdc_acm_flush {
	
	
	private static Object stdio_write(Object buffer, Object len) {
		ModernizedCProgram.usbus_cdc_acm_submit(ModernizedCProgram.cdcacm, buffer, len);
		ModernizedCProgram.usbus_cdc_acm_flush(ModernizedCProgram.cdcacm);
		return /* Use tsrb and flush */len;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/uart_write(/*Error: Function owner not recognized*/UART_DEV(0), (uint8_t)buffer, len);
		return len;
		byte[] buffer = (byte)in;
		int written = ModernizedCProgram.rtt_write(buffer, (int)len);
		xtimer_ticks32_t last_wakeup = ModernizedCProgram.xtimer_now();
		while (ModernizedCProgram.blocking_stdout && ((size_t)written < len)) {
			ModernizedCProgram.xtimer_periodic_wakeup(last_wakeup, -1024);
			written += ModernizedCProgram.rtt_write(buffer[written], len - written);
		}
		return (ssize_t)written;
	}
	/* Submit (ACM interface in) */
	private static Object usbus_cdc_acm_submit(Object cdcacm, Object buf, Object len) {
		return cdcacm.getTsrb().tsrb_add(buf, len);
	}
	/* flush event */
	private static void usbus_cdc_acm_flush(Object cdcacm) {
		if (cdcacm.getUsbus()) {
			cdcacm.getUsbus().usbus_event_post(cdcacm.getFlush());
		} 
	}
}
