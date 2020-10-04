package application;

public class Trickle_startToXtimer_set_msg64 {
	
	
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
	private static void xtimer_set_msg64(Object timer, Object offset, Object msg, Object target_pid) {
		timer._xtimer_set_msg64(/*Error: Function owner not recognized*/_xtimer_ticks_from_usec64(offset), msg, target_pid);
	}
}
