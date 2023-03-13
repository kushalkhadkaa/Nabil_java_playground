import java.util.Scanner;
public class Userinputandbreak {
    public static void main(String args[]){
        Double number, sum= (double) 0;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Please enter a number : ");
            number =input.nextDouble();
            if(number<0.0){
                break;
            }
            sum+=number;
        }
System.out.println("Sum="+sum);
    }
}
