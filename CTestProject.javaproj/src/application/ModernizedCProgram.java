package application;

public class ModernizedCProgram {
	public static Byte globalCharPointer;
	public static int globalInt = 2;
	public static double globalFloat = 3.14;
	public static double globalDouble;
	public static byte globalChar;
	public static int[][][] x = new int[1][1][1];
	
	
	public static void testApiTransform() {
		System.out.println("Some text!");
		java.io.FileReader in = new java.io.FileReader("asd.txt");
		java.io.BufferedReader br = new java.io.BufferedReader(in);
		FILE f;
		while (br.readLine() != (true)) {
			System.out.print(br.readLine());
		}
		in.close();
	}
	public static void fieldReferences() {
		TestStruct test = new TestStruct(1, (byte)'A');
		int generatedX = test.getX();
		generatedX += 1;
		generatedX *= 2;
		int x = generatedX;
	}
	public static void testPointer(Integer x) {
		ModernizedCProgram.globalCharPointer++;
		Integer y;
		y = 2;
		y++;
		(x)++;
		PointerTester tester = new PointerTester();
		tester.setIntPointer(0);
		Integer generatedIntPointer = tester.getIntPointer();
		generatedIntPointer++;
	}
	public static boolean boolFunc(boolean b, Color c) {
		TestStruct t = new TestStruct();
		if (c == Color.RED) {
			c = Color.BLUE;
		} 
		return !b && (b ^ b) && !/*always evaluates to true*/false;
	}
	//Comment before function "testNull"
	public static Integer testNull() {
		byte c = (byte)'a';
		//Comment in testNull
		c++;
		return (null);
	}
	public static void testElseIf() {
		if (ModernizedCProgram.globalInt < /* Comment */0) {
			ModernizedCProgram.globalInt++;
		}  else if (ModernizedCProgram.globalInt > 0) {
			ModernizedCProgram.globalInt--;
			if (ModernizedCProgram.globalInt < 0) {
				if (ModernizedCProgram.globalInt < 0) {
				}  else if (ModernizedCProgram.globalInt < 0) {
				} 
			} 
		} else {
				ModernizedCProgram.globalInt = 0;
		} 
	}
	public static void testArrayIndex(int[] param) {
		param[2 * ModernizedCProgram.globalInt + 2] = 0;
		int[] array = new int[]{0, 1, 2, 3};
	}
	public static void testTernaryOperator(int param) {
		{ 
			param = 2;
			param = 2;
			param = 2;
			param = 2;
			;
		}
		param = ModernizedCProgram.globalInt < 2 ? ModernizedCProgram.globalInt : -param;
	}
	public static void testLogicalLiterals() {
		if ((true)) {
		} 
		boolean c = true ? 1 : 0;
		TestStruct t = new TestStruct();
		boolean b = true;
		if (b != false) {
			b = ModernizedCProgram.globalInt != 0;
		} 
		if (!false) {
			b = false;
		} 
		while (((false && b != true))) {
			boolean iterBool = b && c || true;
		}
	}
	public static void test() {
		ModernizedCProgram.globalInt = ModernizedCProgram.globalInt * 2;
		ModernizedCProgram.globalInt = ModernizedCProgram.globalInt - 2;
		ModernizedCProgram.globalInt = ModernizedCProgram.globalInt + ModernizedCProgram.globalInt + ModernizedCProgram.globalInt + ModernizedCProgram.globalInt;
		ModernizedCProgram.globalDouble = 3.4;
		ModernizedCProgram.globalDouble = ModernizedCProgram.globalDouble * 2;
		ModernizedCProgram.globalDouble = ModernizedCProgram.globalDouble / 3;
		ModernizedCProgram.globalInt = ModernizedCProgram.globalInt >> ModernizedCProgram.globalInt + 1;
		ModernizedCProgram.globalInt = ModernizedCProgram.globalInt << 2;
		ModernizedCProgram.globalInt = ModernizedCProgram.globalInt ^ 0;
	}
	public static void changeChar(byte newChar) {
		int localInt = 24;
		int wasdfer = localInt * 2 - 4 * 8;
		ModernizedCProgram.globalChar = newChar;
	}
	public static int castDoubleToInt(double n) {
		return (int)n;
	}
	public static void testComparators() {
		boolean b = ModernizedCProgram.globalInt == ModernizedCProgram.globalDouble;
		b = ModernizedCProgram.globalInt != ModernizedCProgram.globalDouble;
		b = ModernizedCProgram.globalInt < ModernizedCProgram.globalDouble;
		b = ModernizedCProgram.globalInt <= ModernizedCProgram.globalDouble;
		b = ModernizedCProgram.globalInt > ModernizedCProgram.globalDouble;
		b = ModernizedCProgram.globalInt >= ModernizedCProgram.globalDouble;
	}
	public static void testIfAndWhileAndFor() {
		int i = 0;
		for (i = 2; i <= 2 * ModernizedCProgram.globalInt + ModernizedCProgram.globalDouble; i--) {
			--i;
		}
		if (i != 1) {
			i = 1;
		}  else if (((true))) {
			while (i < 27) {
				if (i == 12) {
					i = 0;
				} 
				i = i + 1;
			}
		} 
	}
	public static void testDoWhile() {
		int i = 0;
		do {
			i++;
			if (i % 2 == 0) {
				break;
			} 
		} while (i <= 400);
	}
	public static void testFor(int i) {
		for (; i <= 2; i++) {
			;
		}
		for (int j = i;
		 j <= 2 * i; ++j) {
			j = 3 * i;
		}
	}
	public static int testSwitch(int controller) {
		switch (controller * 9) {
		case 14:
				controller = 0;
				break;
		case 27:
				controller = controller / 3;
				break;
		case 77:
		case 99:
				controller = 11;
				break;
		default:
				controller = 111;
		}
		return controller >>=  2;
	}
	public static int main() {
		int[][] array = new int[][]{{0, 1}, {2, 3}, {4, 5}};
		TestStruct testStruct = new TestStruct();
		TestStruct test = testStruct.createTest(65532, (byte)'f');
		int x;
		int y = 0;
		x = ((y * 2) + 4) / y;
		boolean b = ModernizedCProgram.globalInt == ModernizedCProgram.globalDouble;
		TestStruct test2 = new TestStruct();
		ModernizedCProgram.globalInt = 2/*x = ~x;
			x = +x;
			x = -x;*/;
		if (!((x > 0) || (x == 2))) {
			return x;
		} 
		int[] asd = new int[20];
		//TestStruct newStruct = copyTest(test);
		testStruct.createTest(1, (byte)'0');
		TestStruct asdfer = testStruct.createTest(1, (byte)'0');
		return 0;
	}
	public static void asdfertettet() {
		int xertet;
		// Comment between statements
		xertet = 2;
	}
}
