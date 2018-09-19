import java.util.Scanner;

public class Simple {

	public Simple() {
		
	}

	public void startSearchSimple() {
		System.out.println();
		System.out.println("Vvedite chislo");
		int n = enterNumber();
		for (int i = 2; i < n+1; i++) {
			if (isSimpleNumberOrNo(i)) {
				printNumber(i);
			}
		}
	}

	private boolean isSimpleNumberOrNo(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			} 
		} 
		return true;
	}

	private void printNumber(int n) {
		System.out.println(n);
	}

	private int enterNumber() {
        Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
    }
}
