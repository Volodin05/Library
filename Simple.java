import java.util.Scanner;

public class Simple {

	public Simple() {
		
	}

	public void startSearchSimple() {
		System.out.println();
		System.out.println("Введите число");
		int n = enterNumber();
		for (int i = 2; i < n+1; i++) {
			if (isSimple(i)) {
				printNumber(n);
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

	private int enterNumber() throws Exception {
        System.out.println("Введите число:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return Integer.valueOf(reader.readLine());
        }
    }
}