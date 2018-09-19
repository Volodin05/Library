import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Simple simpy = new Simple();
		Palyndrom paly = new Palyndrom();

		System.out.println("Dly poiska chisel vvedite v diapozone ot 1 do vashego chisla 1;");
		System.out.println("Dly proverki slov na vozmojnosti ego palindroma vvedite 2;");

		switch(enterTheNumber()) {
			case 1: {
				simpy.startSearchSimple();
				break;
			} 
			case 2: {
				paly.startPalyndrom();
				break;
			} 
			default : {
				System.out.println("Oshibka");
			}
		}
	}

	public static int enterTheNumber() {
        Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
    }
}