// Програма, която чете едно число от конзолата, изчислява му корен квадратен и отпечатва резултата на екрана, с точност до 5-ия знак след запетаята.
import java.util.Scanner;
public class Zadacha1 {
    public static void main(String[] args) {
    float myFloat;
        System.out.println("Въведете число: ");
        Scanner scanner = new Scanner(System.in);
        myFloat = scanner.nextFloat();
        System.out.printf("Резултата ви е: %.5f", Math.sqrt(myFloat));



    }
}
