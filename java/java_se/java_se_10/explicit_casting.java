public class explicit_casting {
	public static void main(String args[]) {
		double doubleVar = 42.0d;
		float floatVar = (float) doubleVar;
		long longVar = (long) floatVar;
		int intVar = (int) longVar;
		short shortVar = (short) intVar;
		byte byteVar = (byte) shortVar;
	}
}