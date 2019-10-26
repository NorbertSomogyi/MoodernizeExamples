package application;

// Source operand addressing modes
public enum _D3DVS_ADDRESSMODE_TYPE {
	D3DVS_ADDRMODE_ABSOLUTE, 
	D3DVS_ADDRMODE_RELATIVE, 
	D3DVS_ADDRMODE_FORCE_DWORD
}
// Relative to register A0
// force 32-bit size enum
// Source operand swizzle definitions
//
// The following bits define where to take component X from:
// The following bits define where to take component Y from:
// The following bits define where to take component Z from:
// The following bits define where to take component W from:
// Value when there is no swizzle (X is taken from X, Y is taken from Y,
// Z is taken from Z, W is taken from W
//
