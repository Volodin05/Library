import java.util.Scanner;

public class Palyndrom {

	public Palyndrom() {

	}

	public void startPalyndrom() {
		System.out.println();
		System.out.println("Vvedite slovo");
		String str = getWord();
		System.out.println(isPalindrom(str));
	}

	public static String reverseString(String s){
		String reverse = "";
		for(int i = s.length()-1;i>=0;i--){
			reverse=reverse+s.charAt(i);
		}
		return reverse;
	}

	public static boolean isPalindrom(String s) {
			if(reverseString(s).equals(s)) {
				return true;
			}
		return false;
	}

	public String getWord() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}