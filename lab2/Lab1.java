import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Lab1 {
    public static void main(String[] argv) {

        String points = readFile();
        String areas = "";
        String[] threePoints = points.split("!");
        for (String point : threePoints) {
            String[] coordinates = point.split(",");
            if (coordinates.length == 9) {
                Point3d firstPoint = new Point3d(Double.valueOf(coordinates[0]), Double.valueOf(coordinates[1]), Double.valueOf(coordinates[2]));
                Point3d secondPoint = new Point3d(Double.valueOf(coordinates[3]), Double.valueOf(coordinates[4]), Double.valueOf(coordinates[5]));
                Point3d thridPoint = new Point3d(Double.valueOf(coordinates[6]), Double.valueOf(coordinates[7]), Double.valueOf(coordinates[8]));
                if (firstPoint.equals(secondPoint)) {
                    Error();
                } else if (secondPoint.equals(thridPoint)) {
                    Error();
                } else if (firstPoint.equals(thridPoint)) {
                    Error();
                } else {
                    areas += computeArea(firstPoint, secondPoint, thridPoint) + "\n";
                }
            }
        }

        writeFile(areas);

    }

    private static String readFile() {
        String everything = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("/C:/Users/vitvo/file.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return everything;
    }

    private static void writeFile(String str) {
        try{
            FileWriter writer = new FileWriter("areas.txt", false);
            writer.write(str);
            writer.flush();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void Error() {
        System.out.println("No ravni tochki");
    }

    private static double computeArea(Point3d firstPoint, Point3d secondPoint, Point3d thridPoint) {
        return Math.sqrt(
                (firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) *
                        (-firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) *
                        (firstPoint.distanceTo(secondPoint) - secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) *
                        (firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) - thridPoint.distanceTo(firstPoint))) / 4;
    }
} 