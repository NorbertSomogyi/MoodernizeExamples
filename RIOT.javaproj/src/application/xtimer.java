package application;

/**
 * @brief xtimer timer structure
 */
/**< reference to next timer in timer lists */
public class xtimer {
	private xtimer next;
	private Object target;
	private Object long_target;
	private Object callback;
	private Object arg;
	
	public xtimer(xtimer next, Object target, Object long_target, Object callback, Object arg) {
		setNext(next);
		setTarget(target);
		setLong_target(long_target);
		setCallback(callback);
		setArg(arg);
	}
	public xtimer() {
	}
	
	public int _is_set() {
		Object generatedTarget = this.getTarget();
		Object generatedLong_target = this.getLong_target();
		return (generatedTarget || generatedLong_target);
	}
	public void _xtimer_set64(Object offset, Object long_offset) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG(" _xtimer_set64() offset=%u long_offset=%u\n", offset, long_offset);
		Object generatedTarget = this.getTarget();
		Object generatedLong_target = this.getLong_target();
		if (!long_offset) {
			timer._xtimer_set((uint32_t)/* timer fits into the short timer */offset);
		} else {
				int state = /*Error: Function owner not recognized*/irq_disable();
				if (timer._is_set()) {
					timer._remove();
				} 
				ModernizedCProgram._xtimer_now_internal(generatedTarget, generatedLong_target);
				generatedTarget += offset;
				generatedLong_target += long_offset;
				if (generatedTarget < offset) {
					generatedLong_target++;
				} 
				ModernizedCProgram.long_list_head._add_timer_to_long_list(timer);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(state);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("xtimer_set64(): added longterm timer (long_target=%u target=%u)\n", generatedLong_target, generatedTarget);
		} 
	}
	public void _xtimer_set(Object offset) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("timer_set(): offset=%u now=%u (%u)\n", offset, ModernizedCProgram.xtimer_now().getTicks32(), ModernizedCProgram._xtimer_lltimer_now());
		Object generatedCallback = this.getCallback();
		if (!generatedCallback) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("timer_set(): timer has no callback.\n");
			return /*Error: Unsupported expression*/;
		} 
		timer.xtimer_remove();
		if (offset < 30) {
			ModernizedCProgram._xtimer_spin(offset);
			timer._shoot();
		} else {
				uint32_t target = ModernizedCProgram._xtimer_now() + offset;
				timer._xtimer_set_absolute(target);
		} 
	}
	public void _shoot() {
		Object generatedArg = this.getArg();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedArg);
	}
	public int _xtimer_set_absolute(Object target) {
		uint32_t now = ModernizedCProgram._xtimer_now();
		int res = 0;
		this.setNext((null));
		uint32_t offset = (target - now);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("timer_set_absolute(): now=%u target=%u offset=%u\n", now, target, offset);
		if (offset <= 30) {
			ModernizedCProgram.xtimer_spin_until(/* backoff */target);
			timer._shoot();
			return 0;
		} 
		int state = /*Error: Function owner not recognized*/irq_disable();
		if (timer._is_set()) {
			timer._remove();
		} 
		this.setTarget(target);
		this.setLong_target(ModernizedCProgram._long_cnt/* Ensure timer is fired in right timer period.
		     * Backoff condition above ensures that 'target - XTIMER_OVERHEAD` is later
		     * than 'now', also for values when now will overflow and the value of target
		     * is smaller then now.
		     * If `target < XTIMER_OVERHEAD` the new target will be at the end of this
		     * 32bit period, as `target - XTIMER_OVERHEAD` is a big number instead of a
		     * small at the beginning of the next period. */);
		target = target - 20;
		Object generatedLong_target = this.getLong_target();
		if (target < /* 32 bit target overflow, target is in next 32bit period */now) {
			generatedLong_target++;
		} 
		if ((generatedLong_target > ModernizedCProgram._long_cnt) || !ModernizedCProgram._this_high_period(target)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("xtimer_set_absolute(): the timer doesn't fit into the low-level timer's mask.\n");
			ModernizedCProgram.long_list_head._add_timer_to_long_list(timer);
		} else {
				if (ModernizedCProgram._xtimer_lltimer_mask(now) >= target) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("xtimer_set_absolute(): the timer will expire in the next timer period\n");
					ModernizedCProgram.overflow_list_head._add_timer_to_list(timer);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("timer_set_absolute(): timer will expire in this timer period.\n");
						ModernizedCProgram.timer_list_head._add_timer_to_list(timer);
						if (ModernizedCProgram.timer_list_head == timer) {
							/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DEBUG("timer_set_absolute(): timer is new list head. updating lltimer.\n");
							ModernizedCProgram._lltimer_set(target);
						} 
				} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(state);
		return res;
	}
	public void _add_timer_to_list(xtimer timer) {
		Object generatedTarget = (list_head).getTarget();
		xtimer generatedNext = (list_head).getNext();
		while (list_head && generatedTarget <= generatedTarget) {
			list_head = (generatedNext);
		}
		timer.setNext(list_head);
		list_head = timer;
	}
	public void _add_timer_to_long_list(xtimer timer) {
		Object generatedLong_target = (list_head).getLong_target();
		Object generatedTarget = (list_head).getTarget();
		xtimer generatedNext = (list_head).getNext();
		while (list_head && ((generatedLong_target < generatedLong_target) || ((generatedLong_target == generatedLong_target) && (generatedTarget <= generatedTarget)))) {
			list_head = (generatedNext);
		}
		timer.setNext(list_head);
		list_head = timer;
	}
	public int _remove_timer_from_list(xtimer timer) {
		xtimer generatedNext = timer.getNext();
		while (list_head) {
			if (list_head == timer) {
				list_head = generatedNext;
				return 1;
			} 
			list_head = (generatedNext);
		}
		return 0;
	}
	public void _remove() {
		xtimer generatedNext = this.getNext();
		if (ModernizedCProgram.timer_list_head == timer) {
			uint32_t next = new uint32_t();
			ModernizedCProgram.timer_list_head = generatedNext;
			if (ModernizedCProgram.timer_list_head) {
				next = ModernizedCProgram.timer_list_head.getTarget() - /* schedule callback on next timer target time */20;
			} else {
					next = ModernizedCProgram._xtimer_lltimer_mask(-1024);
			} 
			ModernizedCProgram._lltimer_set(next);
		} else {
				if (!ModernizedCProgram.timer_list_head._remove_timer_from_list(timer)) {
					if (!ModernizedCProgram.overflow_list_head._remove_timer_from_list(timer)) {
						ModernizedCProgram.long_list_head._remove_timer_from_list(timer);
					} 
				} 
		} 
	}
	public void xtimer_remove() {
		int state = /*Error: Function owner not recognized*/irq_disable();
		if (timer._is_set()) {
			timer._remove();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/irq_restore(state);
	}
	public xtimer _compare(xtimer b) {
		Object generatedTarget = this.getTarget();
		if (a && b) {
			return ((generatedTarget <= generatedTarget) ? a : b);
		} else {
				return (a ? a : b);
		} 
	}
	/**
	 * @brief merge two timer lists, return head of new list
	 */
	public xtimer _merge_lists(xtimer head_b) {
		xtimer_t result_head = head_a._compare(head_b);
		xtimer_t pos = result_head;
		xtimer generatedNext = this.getNext();
		while (1) {
			head_a = generatedNext;
			head_b = generatedNext;
			if (!head_a) {
				pos.setNext(head_b);
				break;
			} 
			if (!head_b) {
				pos.setNext(head_a);
				break;
			} 
			pos.setNext(head_a._compare(head_b));
			pos = generatedNext;
		}
		return result_head/**
		 * @brief parse long timers list and copy those that will expire in the current
		 *        short timer period
		 */;
	}
	public void _setup_msg(Object msg, Object target_pid) {
		this.setCallback(_callback_msg);
		this.setArg((Object)msg);
		msg.setSender_pid(/* use sender_pid field to get target_pid into callback function */target_pid);
	}
	public void _xtimer_set_msg(Object offset, Object msg, Object target_pid) {
		timer._setup_msg(msg, target_pid);
		timer._xtimer_set(offset);
	}
	public void _xtimer_set_msg64(Object offset, Object msg, Object target_pid) {
		timer._setup_msg(msg, target_pid);
		timer._xtimer_set64(offset, offset >> 32);
	}
	public void _xtimer_set_wakeup(Object offset, Object pid) {
		this.setCallback(_callback_wakeup);
		this.setArg((Object)((intptr_t)pid));
		timer._xtimer_set(offset);
	}
	public void _xtimer_set_wakeup64(Object offset, Object pid) {
		this.setCallback(_callback_wakeup);
		this.setArg((Object)((intptr_t)pid));
		timer._xtimer_set64(offset, offset >> 32);
	}
	public void _setup_timer_msg(Object m) {
		m.setType(MSG_XTIMER);
		m.getContent().setPtr(m);
		this.setTarget(this.setLong_target(0));
	}
	/* Waits for incoming message or timeout. */
	public int _msg_wait(Object m, Object tmsg) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/msg_receive(m);
		if (m.getType() == MSG_XTIMER && m.getContent().getPtr() == tmsg) {
			return -/* we hit the timeout */1;
		} else {
				t.xtimer_remove();
				return 1;
		} 
	}
	public xtimer getNext() {
		return next;
	}
	public void setNext(xtimer newNext) {
		next = newNext;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object newTarget) {
		target = newTarget;
	}
	public Object getLong_target() {
		return long_target;
	}
	public void setLong_target(Object newLong_target) {
		long_target = newLong_target;
	}
	public Object getCallback() {
		return callback;
	}
	public void setCallback(Object newCallback) {
		callback = newCallback;
	}
	public Object getArg() {
		return arg;
	}
	public void setArg(Object newArg) {
		arg = newArg;
	}
}
