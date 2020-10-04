package application;

public class _exitToPm_set_lowest {
	
	
	private static void _exit(int n) {
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
	private static void pm_off() {
		ModernizedCProgram.pm_blocker.setVal_u32(0);
		ModernizedCProgram.pm_set_lowest();
		while (1) {
		}
	}
	private static void pm_set_lowest() {
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
}
