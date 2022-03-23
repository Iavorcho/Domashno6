import java.util.Scanner;
public class Zadacha2 {
    public static void main(String[] args) {
        int myNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете число: ");
        myNumber = scanner.nextInt();
        boolean oddOrEven = myNumber % 2 == 0;
        String output = oddOrEven ? "Числото е четно":"Числото е нечетно";
                System.out.println(output);


    }
}
