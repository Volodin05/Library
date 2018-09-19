import java.util.Scanner;

public class Lab1 {
	public static void main(String[] argv) {
		
		System.out.println("Введите 3 трехмерные точки");

		Point3d firstPoint = createNewPoint();
		Point3d secondPoint = createNewPoint();
		Point3d thridPoint = createNewPoint();

		if (firstPoint.equals(secondPoint)) {
			System.out.println("Не должно быть равных точек");
		} else if(secondPoint.equals(thridPoint)) {
			System.out.println("Не должно быть равных точек");
		} else if(firstPoint.equals(thridPoint)) {
			System.out.println("Не должно быть равных точек");
		} else {
			double result = computeArea(firstPoint, secondPoint, thridPoint);
			System.out.println("Площадь равна: " + result);
		}
	}

	public static Point3d createNewPoint() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("коодрината x: ");
		double x = scanner.nextDouble();
		System.out.println("координата y: ");
		double y = scanner.nextDouble();
		System.out.println("координатаz: ");
		double z = scanner.nextDouble();
		return new Point3d(x, y, z);
	}

	public static double computeArea(Point3d firstPoint, Point3d secondPoint, Point3d thridPoint) {
		return Math.sqrt(
			(firstPoint.getX() + secondPoint.getX() + thridPoint.getX()) * 
			(- firstPoint.getX() + secondPoint.getX() + thridPoint.getX()) * 
			(firstPoint.getX() - secondPoint.getX() + thridPoint.getX()) * 
			(firstPoint.getX() + secondPoint.getX() - thridPoint.getX())) / 4;
	}
} 