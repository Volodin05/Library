import java.util.Scanner;

public class Lab1 {
    public static void main(String[] argv) {

        String points = readFile();
        String areas = "";
        String[] threePoints = points.split(")");
        for (String point : threePoints) {
            String[] coordinates = point.split("(");
            if (coordinates.length == 9) {
                Point3D firstPoint = new Point3D(Double.valueOf(threePoints[0]), Double.valueOf(threePoints[1]), Double.valueOf(threePoints[2]));
                Point3D secondPoint = new Point3D(Double.valueOf(threePoints[3]), Double.valueOf(threePoints[4]), Double.valueOf(threePoints[5]));
                Point3D thridPoint = new Point3D(Double.valueOf(threePoints[6]), Double.valueOf(threePoints[7]), Double.valueOf(threePoints[8]));
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
            BufferedReader br = new BufferedReader(new FileReader("/Users/mac/IdeaProjects/Point3D/src/file.txt"));
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
        System.out.println("Не должно быть равных точек");
    }

    private static double computeArea(Point3D firstPoint, Point3D secondPoint, Point3D thridPoint) {
        return Math.sqrt(
                (firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) *
                        (-firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) *
                        (firstPoint.distanceTo(secondPoint) - secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) *
                        (firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) - thridPoint.distanceTo(firstPoint))) / 4;
    }
} 