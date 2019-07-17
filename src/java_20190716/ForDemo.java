package java_20190716;

public class ForDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("d");
		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5 - j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int first = 2; first <= 9; first++)
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d\n", first, second, first * second);
			}
	}

}
