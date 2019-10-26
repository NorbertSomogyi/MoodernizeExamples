package application;

public class func_hook {
	private Object call_addr;
	private Object func_addr;
	private Object hook_addr;
	private Object bounce_addr;
	private Object name;
	private hook_type type;
	private boolean is_64bit_jump;
	private boolean hooked;
	private boolean started;
	private boolean attempted_bounce;
	private Object unhook_data;
	private Object rehook_data;
	
	public func_hook(Object call_addr, Object func_addr, Object hook_addr, Object bounce_addr, Object name, hook_type type, boolean is_64bit_jump, boolean hooked, boolean started, boolean attempted_bounce, Object unhook_data, Object rehook_data) {
		setCall_addr(call_addr);
		setFunc_addr(func_addr);
		setHook_addr(hook_addr);
		setBounce_addr(bounce_addr);
		setName(name);
		setType(type);
		setIs_64bit_jump(is_64bit_jump);
		setHooked(hooked);
		setStarted(started);
		setAttempted_bounce(attempted_bounce);
		setUnhook_data(unhook_data);
		setRehook_data(rehook_data);
	}
	public func_hook() {
	}
	
	public void rehook() {
		hook.do_hook(0);
	}
	public void force_rehook() {
		hook.do_hook(1);
	}
	public void hook_init(Object func_addr, Object hook_addr, Object name) {
		.memset(hook, 0, );
		this.setFunc_addr((uintptr_t)func_addr);
		this.setHook_addr((uintptr_t)hook_addr);
		this.setName(name);
		Object generatedFunc_addr = this.getFunc_addr();
		ModernizedCProgram.fix_permissions((Object)(generatedFunc_addr - 5), 14 + 5);
		Object generatedUnhook_data = this.getUnhook_data();
		.memcpy(generatedUnhook_data, func_addr, 14);
	}
	public Object patch_size() {
		boolean generatedIs_64bit_jump = this.getIs_64bit_jump();
		return generatedIs_64bit_jump ? 14 : 5;
	}
	public void rehook64() {
		uint8_t[] data = new uint8_t();
		uintptr_t ptr_loc = (uintptr_t)((uint8_t)data + );
		Object generatedFunc_addr = this.getFunc_addr();
		ModernizedCProgram.fix_permissions((Object)generatedFunc_addr, 14);
		.memcpy(data, (Object)generatedFunc_addr, 14);
		.memcpy(data, ModernizedCProgram.longjmp64, );
		Object generatedHook_addr = this.getHook_addr();
		ptr_loc = generatedHook_addr;
		this.setCall_addr((Object)generatedFunc_addr);
		this.setType(hook_type.HOOKTYPE_FORWARD_OVERWRITE);
		this.setHooked(1);
		.memcpy((Object)generatedFunc_addr, data, 14);
	}
	public void hook_reverse_new(Object p) {
		Object generatedFunc_addr = this.getFunc_addr();
		this.setCall_addr((Object)(generatedFunc_addr + 2));
		this.setType(hook_type.HOOKTYPE_REVERSE_CHAIN);
		this.setHooked(1);
		p[0] = -1024;
		Object generatedHook_addr = this.getHook_addr();
		((uint32_t)p[1]) = (uint32_t)(generatedHook_addr - generatedFunc_addr);
		((uint16_t)p[5]) = -1024;
	}
	public void hook_reverse_chain(Object p) {
		hook_type generatedType = this.getType();
		if (generatedType != hook_type.HOOKTYPE_FORWARD_OVERWRITE) {
			return ;
		} 
		Object generatedFunc_addr = this.getFunc_addr();
		this.setCall_addr((Object)(generatedFunc_addr + ((int32_t)p[1])));
		this.setType(hook_type.HOOKTYPE_REVERSE_CHAIN);
		this.setHooked(1);
		Object generatedHook_addr = this.getHook_addr();
		((uint32_t)p[1]) = (uint32_t)(generatedHook_addr - generatedFunc_addr);
	}
	public void hook_forward_chain(Object p, Object offset) {
		int32_t cur_offset = (int32_t)p[6];
		hook_type generatedType = this.getType();
		if (generatedType != hook_type.HOOKTYPE_FORWARD_OVERWRITE) {
			return ;
		} 
		Object generatedFunc_addr = this.getFunc_addr();
		this.setCall_addr((Object)(generatedFunc_addr + 5 + cur_offset));
		this.setType(hook_type.HOOKTYPE_FORWARD_CHAIN);
		this.setHooked(1);
		((int32_t)p[6]) = (int32_t)offset;
	}
	public void hook_forward_overwrite(Object offset) {
		Object generatedFunc_addr = this.getFunc_addr();
		uint8_t ptr = (uint8_t)generatedFunc_addr;
		this.setCall_addr((Object)generatedFunc_addr);
		this.setType(hook_type.HOOKTYPE_FORWARD_OVERWRITE);
		this.setHooked(1);
		(ptr++) = -1024;
		((int32_t)ptr) = (int32_t)offset;
	}
	public void rehook32(boolean force, Object offset) {
		Object generatedFunc_addr = this.getFunc_addr();
		ModernizedCProgram.fix_permissions((Object)(generatedFunc_addr - 5), 5 * 2);
		boolean generatedStarted = this.getStarted();
		hook_type generatedType = this.getType();
		if (force || !generatedStarted) {
			uint8_t p = (uint8_t)generatedFunc_addr - 5;
			size_t nop_count = 0;
			for (size_t i = 0;
			 i < 5; /* check for reverse chain hook availability */i++) {
				if (p[i] == -1024) {
					nop_count++;
				} 
			}
			if (nop_count == 5 && p[5] == -1024 && p[6] == -1024) {
				hook.hook_reverse_new(p);
			}  else if (p[0] == -1024 && (uint16_t)p[5] == -1024) {
				hook.hook_reverse_chain(p);
			}  else if (p[5] == -1024) {
				hook.hook_forward_chain(p, offset);
			}  else if (generatedType != hook_type.HOOKTYPE_FORWARD_OVERWRITE) {
				this.setType(hook_type.HOOKTYPE_FORWARD_OVERWRITE);
			} 
			this.setStarted(1);
		} 
		if (generatedType == hook_type.HOOKTYPE_FORWARD_OVERWRITE) {
			hook.hook_forward_overwrite(offset/*
			 * Creates memory close to the target function, used to force the actual hook
			 * to use a 32bit jump instead of a 64bit jump, thus preventing the chance of
			 * overwriting adjacent functions, which can cause a crash.  (by R1CH)
			 */);
		} 
	}
	public void setup_64bit_bounce(Object offset) {
		MEMORY_BASIC_INFORMATION mbi = new MEMORY_BASIC_INFORMATION();
		uintptr_t address = new uintptr_t();
		uintptr_t newdiff = new uintptr_t();
		SYSTEM_INFO si = new SYSTEM_INFO();
		boolean success;
		int pagesize;
		int i;
		Object generatedFunc_addr = this.getFunc_addr();
		success = .VirtualQueryEx(.GetCurrentProcess(), (Object)generatedFunc_addr, mbi, );
		if (!success) {
			return ;
		} 
		.GetSystemInfo(si);
		Object generatedDwAllocationGranularity = si.getDwAllocationGranularity();
		pagesize = (int)generatedDwAllocationGranularity;
		Object generatedAllocationBase = mbi.getAllocationBase();
		address = (uintptr_t)generatedAllocationBase - pagesize;
		Object generatedBounce_addr = this.getBounce_addr();
		for (i = 0; i < 256; ) {
			this.setBounce_addr(.VirtualAlloc((LPVOID)address, pagesize, -1024 | -1024, -1024));
			if (generatedBounce_addr) {
				break;
			} 
		}
		Object generatedRegionSize = mbi.getRegionSize();
		if (!generatedBounce_addr) {
			address = (uintptr_t)generatedAllocationBase + generatedRegionSize + pagesize;
			for (i = 0; i < 256; ) {
				this.setBounce_addr(.VirtualAlloc((LPVOID)address, pagesize, -1024 | -1024, -1024));
				if (generatedBounce_addr) {
					break;
				} 
			}
		} 
		if (!generatedBounce_addr) {
			return ;
		} 
		if ((generatedFunc_addr + 5) > (uintptr_t)generatedBounce_addr) {
			newdiff = generatedFunc_addr + 5 - (uintptr_t)generatedBounce_addr;
		} else {
				newdiff = (uintptr_t)generatedBounce_addr - generatedFunc_addr + 5;
		} 
		Object generatedHook_addr = this.getHook_addr();
		if (newdiff <= -1024) {
			uint8_t addr = (uint8_t)generatedBounce_addr;
			.memset((generatedBounce_addr), (true), (pagesize));
			(addr++) = -1024;
			(addr++) = -1024;
			((uint32_t)addr) = 0;
			((uint64_t)(addr + 4)) = generatedHook_addr;
			this.setHook_addr((uint64_t)generatedBounce_addr);
			offset = generatedHook_addr - generatedFunc_addr - 5;
			this.setIs_64bit_jump(0);
		} 
	}
	public void do_hook(boolean force) {
		intptr_t offset = new intptr_t();
		boolean generatedHooked = this.getHooked();
		if (!force && generatedHooked) {
			return ;
		} 
		boolean generatedStarted = this.getStarted();
		hook_type generatedType = this.getType();
		Object generatedFunc_addr = this.getFunc_addr();
		Object generatedRehook_data = this.getRehook_data();
		if (generatedStarted && !/* copy back the memory that was previously encountered to preserve
			 * the current hook and any newer hooks on top */force) {
			uintptr_t addr = new uintptr_t();
			size_t size = new size_t();
			if (generatedType == hook_type.HOOKTYPE_REVERSE_CHAIN) {
				addr = generatedFunc_addr - 5;
				size = 5;
			} else {
					addr = generatedFunc_addr;
					size = hook.patch_size();
			} 
			.memcpy((Object)addr, generatedRehook_data, size);
			this.setHooked(1);
			return ;
		} 
		Object generatedHook_addr = this.getHook_addr();
		offset = generatedHook_addr - generatedFunc_addr - 5;
		hook.rehook32(force, offset);
	}
	public void unhook() {
		uintptr_t addr = new uintptr_t();
		size_t size = new size_t();
		boolean generatedHooked = this.getHooked();
		if (!generatedHooked) {
			return ;
		} 
		hook_type generatedType = this.getType();
		Object generatedFunc_addr = this.getFunc_addr();
		if (generatedType == hook_type.HOOKTYPE_REVERSE_CHAIN) {
			size = 5;
			addr = (generatedFunc_addr - 5);
		} else {
				size = hook.patch_size();
				addr = generatedFunc_addr;
		} 
		ModernizedCProgram.fix_permissions((Object)addr, size);
		Object generatedRehook_data = this.getRehook_data();
		.memcpy(generatedRehook_data, (Object)addr, size);
		Object generatedUnhook_data = this.getUnhook_data();
		if (generatedType == hook_type.HOOKTYPE_FORWARD_OVERWRITE) {
			.memcpy((Object)generatedFunc_addr, generatedUnhook_data, size);
		} 
		this.setHooked(0);
	}
	public Object getCall_addr() {
		return call_addr;
	}
	public void setCall_addr(Object newCall_addr) {
		call_addr = newCall_addr;
	}
	public Object getFunc_addr() {
		return func_addr;
	}
	public void setFunc_addr(Object newFunc_addr) {
		func_addr = newFunc_addr;
	}
	public Object getHook_addr() {
		return hook_addr;
	}
	public void setHook_addr(Object newHook_addr) {
		hook_addr = newHook_addr;
	}
	public Object getBounce_addr() {
		return bounce_addr;
	}
	public void setBounce_addr(Object newBounce_addr) {
		bounce_addr = newBounce_addr;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public hook_type getType() {
		return type;
	}
	public void setType(hook_type newType) {
		type = newType;
	}
	public boolean getIs_64bit_jump() {
		return is_64bit_jump;
	}
	public void setIs_64bit_jump(boolean newIs_64bit_jump) {
		is_64bit_jump = newIs_64bit_jump;
	}
	public boolean getHooked() {
		return hooked;
	}
	public void setHooked(boolean newHooked) {
		hooked = newHooked;
	}
	public boolean getStarted() {
		return started;
	}
	public void setStarted(boolean newStarted) {
		started = newStarted;
	}
	public boolean getAttempted_bounce() {
		return attempted_bounce;
	}
	public void setAttempted_bounce(boolean newAttempted_bounce) {
		attempted_bounce = newAttempted_bounce;
	}
	public Object getUnhook_data() {
		return unhook_data;
	}
	public void setUnhook_data(Object newUnhook_data) {
		unhook_data = newUnhook_data;
	}
	public Object getRehook_data() {
		return rehook_data;
	}
	public void setRehook_data(Object newRehook_data) {
		rehook_data = newRehook_data;
	}
}
