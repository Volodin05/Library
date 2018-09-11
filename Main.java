import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Simple simpy = new Laba();
		Palyndrom paly = new Palyndrom();

		System.out.println("Для поиска простых чисел введите в диапазоне от 1 до вашего числа введите 1;");
		System.out.println("Для проверки слова на возможность ег палиндрома введите 2;");

		int num = enterTheNumber();

		switch(num) {
			case 1: {
				simpy.startSearchSimple();
				break;
			} 
			case 2: {
				paly.startPalyndrom();
				break;
			} 
			default : {
				System.out.println("Ошибка ввода");
			}
		}
	}

	public int enterTheNumber() throws Exception {
        System.out.println("Введите число:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return Integer.valueOf(reader.readLine());
        }
    }
}