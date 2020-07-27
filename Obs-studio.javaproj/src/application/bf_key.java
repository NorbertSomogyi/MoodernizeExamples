package application;

public class bf_key {
	private Object s;
	private Object p;
	
	public bf_key(Object s, Object p) {
		setS(s);
		setP(p);
	}
	public bf_key() {
	}
	
	public void bf_enc(Object[] x) {
		 Xl = new ();
		 Xr = new ();
		 temp = new ();
		int i;
		Xl = x[0];
		Xr = x[1];
		for (i = 0; i < 16; ++i) {
			Xl ^=  ModernizedCProgram.key.getP()[i];
			Xr ^=  (((ModernizedCProgram.key.getS()[0][Xl >> 24] + ModernizedCProgram.key.getS()[1][Xl >> 16 & -1024]) ^ ModernizedCProgram.key.getS()[2][(Xl >> 8) & -1024]) + ModernizedCProgram.key.getS()[3][Xl & -1024]);
			temp = Xl;
			Xl = Xr;
			Xr = temp;
		}
		Xl ^=  ModernizedCProgram.key.getP()[16];
		Xr ^=  ModernizedCProgram.key.getP()[16 + 1];
		x[0] = Xr;
		x[1] = Xl;
	}
	public void bf_setkey(Object[] kp, int keybytes) {
		int i;
		int j;
		int k;
		 data = new ();
		[] d = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.key.getP(), ModernizedCProgram.bf_pinit, /*Error: sizeof expression not supported yet*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.key.getS(), ModernizedCProgram.bf_sinit, /*Error: sizeof expression not supported yet*/);
		j = 0;
		for (i = 0; i < 16 + 2; ++i) {
			data = -1024;
			for (k = 0; k < 4; ++k) {
				data = (data << 8) | kp[j];
				j = j + 1;
				if (j >= keybytes) {
					j = 0;
				} 
			}
			ModernizedCProgram.key.getP()[i] ^=  data;
		}
		d[0] = -1024;
		d[1] = -1024;
		for (i = 0; i < 16 + 2; i += 2) {
			ModernizedCProgram.key.bf_enc(d);
			ModernizedCProgram.key.getP()[i] = d[0];
			ModernizedCProgram.key.getP()[i + 1] = d[1];
		}
		for (i = 0; i < 4; ++i) {
			for (j = 0; j < 256; j += 2) {
				ModernizedCProgram.key.bf_enc(d);
				ModernizedCProgram.key.getS()[i][j] = d[0];
				ModernizedCProgram.key.getS()[i][j + 1] = d[1];
			}
		}
	}
	public Object getS() {
		return s;
	}
	public void setS(Object newS) {
		s = newS;
	}
	public Object getP() {
		return p;
	}
	public void setP(Object newP) {
		p = newP;
	}
}
