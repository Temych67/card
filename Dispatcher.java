package valenteinsCard;

public class Dispatcher {
	private static void	newLine() {
		System.out.println("");
		System.out.print("+:");
	}
	public static void main(String[] args) {
		for (int y = 0; y < 22; y++) {
			System.out.print("+:");
		}
		newLine();
		for (int y = 0; y < 40; y++) {
			System.out.print(" ");
			if (y == 39)
				System.out.print("+:");
		}
		newLine();
		for (int a = 0; a < 13; a++) {
			System.out.print(" ");
		}
		for (int a = 0; a < 4; a++) {
			if (a == 2)
				System.out.print(".");
			if (a == 0 || a == 3) {
				System.out.print(",");
			} else
				System.out.print("d88b");
		}
		for (int a = 0; a < 16; a++) {
			System.out.print(" ");
			if (a == 15)
				System.out.print("+:");
		}
		newLine();
		for (int a = 0; a < 13; a++) {
			System.out.print(" ");
		}
		for (int a = 0; a < 11; a++) {
			System.out.print("8");
		}
		for (int a = 0; a < 16; a++) {
			System.out.print(" ");
			if (a == 15)
				System.out.print("+:");
		}
		newLine();
		for (int a = 0; a < 13; a++) {
			System.out.print(" ");
		}
		for (int a = 0; a < 6; a++) {
			if (a == 0) {
				System.out.print("'Y8");
			}
			if (a == 5) {
				System.out.print("8Y'");
			} else
				System.out.print("8");
		}
		for (int b = 0; b < 16; b++) {
			System.out.print(" ");
			if (b == 15)
				System.out.print("+:");
		}
		newLine();
		for (int a = 0; a < 15; a++) {
			System.out.print(" ");
		}
		for (int a = 0; a < 2; a++) {
			if (a == 0) {
				System.out.print("'Y8");
			}
			if (a == 1) {
				System.out.print("8Y'");
			} else
				System.out.print("8");
		}
		for (int b = 0; b < 18; b++) {
			System.out.print(" ");
			if (b == 17)
				System.out.print("+:");
		}
		newLine();
		for (int a = 0; a < 17; a++) {
			System.out.print(" ");
		}
		System.out.print("'Y'");
		for (int b = 0; b < 20; b++) {
			System.out.print(" ");
			if (b == 19)
				System.out.print("+:");
		}
		newLine();
		for (int y = 0; y < 40; y++) {
			System.out.print(" ");
			if (y == 39)
				System.out.print("+:");
		}
		newLine();
		for (int y = 0; y < 21; y++) {
			System.out.print("+:");
		}
	}
}