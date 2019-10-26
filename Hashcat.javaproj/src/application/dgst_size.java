package application;

// some algorithms (complicated ones with many branches) benefit from this
// if we have to iterate through each hash inside the comp kernel, for example if each hash has to be decrypted separately
// suggest keep guessing for modules the user maybe wants to use --keep-guessing
// if we want to use data from tmps buffer (for example get the PMK in WPA)
// sometimes the password should not be printed to potfile
public enum dgst_size {
	DGST_SIZE_4_2, 
	DGST_SIZE_4_4, 
	DGST_SIZE_4_5, 
	DGST_SIZE_4_6, 
	DGST_SIZE_4_7, 
	DGST_SIZE_4_8, 
	DGST_SIZE_4_16, 
	DGST_SIZE_4_32, 
	DGST_SIZE_4_64, 
	DGST_SIZE_8_8, 
	DGST_SIZE_8_16, 
	DGST_SIZE_8_25
}
// 8
// 16
// 20
// 24
// 28
// 32
// 64 !!!
