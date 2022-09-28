//у желтого конфликт с оранжевым
import java.util.Scanner;
public class Main {

    private static final Circle circle = new Circle(-3, 2, 5);
    private static final Line1 line1 = new Line1(4, 9, 5);
    private static final Line2 line2 = new Line2(3, 1, 2);
    private static final Line3 line3 = new Line3(2, -1, 0);
    private static final Line4 line4    = new Line4(3, 2, 2);
    private static final Picture picture = new Picture(circle, line1, line2, line3, line4);

    public static void main(String[] args){
        if(Test.testPoints(picture)){
            System.out.println("All tests applied");
            double x = readCoordinates("Input x = ");
            double y = readCoordinates("Input y = ");

            if(isCoordinatesAreaCorrect(x)){
                System.out.println("Ошибка, введено некорректное значение х");
                return;
            }

            if(isCoordinatesAreaCorrect(y)){
                System.out.println("Ошибка, введено некорректное значение у");
                return;
            }
            printColorForPoint(x, y);
        } else {
            System.out.println("Tests failed");
        }
    }
    public static void printColorForPoint(double x, double y){
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(picture.getColor(x, y));
    }

    private static double readCoordinates(String text){
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static boolean isCoordinatesAreaCorrect(double value){
        return (value < -10) || (value > 10);
    }
}