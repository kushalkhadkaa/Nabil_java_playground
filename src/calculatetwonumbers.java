import java.util.Scanner;
public class calculatetwonumbers {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  First Number");
        int number = input.nextInt();
        System.out.println("Enter Another Number");
        int number2 = input.nextInt();
        System.out.println(number + number2);
    }
}