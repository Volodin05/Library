import java.util.Scanner;

public class Palyndrom {

	public Palyndrom() {

	}

	public void startPalyndrom() {
		System.out.println();
		System.out.println("Введите слово которое вам непонятно");
		String str = getWord();
		System.out.println(isPalindrom(str));
	}

	public boolean isPalindrom(String str) {
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public String getWord() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}