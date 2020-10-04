package application;

public class _periph_timer_callbackTo_lltimer_set {
	
	
	private static void _periph_timer_callback(Object arg, int chan) {
		(Object)arg;
		(Object)chan;
		ModernizedCProgram._timer_callback();
	}
	private static void _timer_callback() {
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
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("_timer_callback: overflowed while executing callbacks. %i\n", ModernizedCProgram.timer_list_head != (null));
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
	public static void _lltimer_set(Object target) {
		if (ModernizedCProgram._in_handler) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("_lltimer_set(): setting %u\n", ModernizedCProgram._xtimer_lltimer_mask(target));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/timer_set_absolute(/*Error: Function owner not recognized*/TIMER_DEV(0), (false), ModernizedCProgram._xtimer_lltimer_mask(target));
	}
}
