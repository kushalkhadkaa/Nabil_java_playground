import java.util.Scanner;
public class SumOfPositiveNumberOnly {

    public static void main(String args[]){
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=input.nextInt();
        while(number>=0) {
            sum += number;

            System.out.println("Enter a Number");
            number = input.nextInt();
        }
        System.out.println("Sum="+sum);
        input.close();
    }
}
