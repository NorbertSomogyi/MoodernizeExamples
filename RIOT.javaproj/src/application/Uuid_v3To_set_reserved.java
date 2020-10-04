package application;

public class Uuid_v3To_set_reserved {
	
	
	private static void uuid_v3(Object ns, Object name, Object len) {
		/* Digest calculation */ ctx = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_init(ctx);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(ctx, ns, /*Error: Unsupported expression*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_update(ctx, name, len);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/md5_final(ctx, uuid);
		uuid._set_version((true));
		uuid._set_reserved();
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
}
