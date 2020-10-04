package application;

public class Mangle_reflectToMangle_reverse {
	
	
	private static int mangle_reflect(Byte arr, int arr_len) {
		if ((arr_len * 2) >= 256) {
			return (arr_len);
		} 
		ModernizedCProgram.mangle_double(arr, arr_len);
		ModernizedCProgram.mangle_reverse(arr + arr_len, arr_len);
		return (arr_len * 2);
	}
	private static int mangle_double(byte[] arr, int arr_len) {
		if ((arr_len * 2) >= 256) {
			return (arr_len);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(arr[arr_len], arr, (size_t)arr_len);
		return (arr_len * 2);
	}
	private static int mangle_reverse(Byte arr, int arr_len) {
		int l;
		for (l = 0; l < arr_len; l++) {
			int r = arr_len - 1 - l;
			if (l >= r) {
				break;
			} 
			ModernizedCProgram.MANGLE_SWITCH(arr, l, r);
		}
		return (arr_len);
	}
}
