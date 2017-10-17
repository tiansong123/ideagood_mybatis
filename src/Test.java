import nl.flotsam.xeger.Xeger;

public class Test {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(getMac());
		}
	}

	public static String getMac() {
		String regex = "([0-9A-F]{2}[:]){5}([0-9A-F]{2})";
		Xeger generator = new Xeger(regex);
		String result = generator.generate();
		assert result.matches(regex);
		return result;
	}
}
