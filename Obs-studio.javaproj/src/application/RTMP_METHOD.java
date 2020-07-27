package application;

public class RTMP_METHOD {
	private AVal name;
	private int num;
	
	public RTMP_METHOD(AVal name, int num) {
		setName(name);
		setNum(num);
	}
	public RTMP_METHOD() {
	}
	
	public void AV_erase(Integer num, int i, int freeit) {
		if (freeit) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(vals[i].getName().getAv_val());
		} 
		(num)--;
		for (; i < num; i++) {
			vals[i] = vals[i + 1];
		}
		vals[i].getName().setAv_val(((Object)0));
		vals[i].getName().setAv_len(0);
		vals[i].setNum(0);
	}
	public void AV_clear(int num) {
		int i;
		for (i = 0; i < num; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(vals[i].getName().getAv_val());
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(vals);
	}
	public AVal getName() {
		return name;
	}
	public void setName(AVal newName) {
		name = newName;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int newNum) {
		num = newNum;
	}
}
