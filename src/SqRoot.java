import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class SqRoot {
    public static void main(String[] args) {
        NumberFormat nf = new DecimalFormat("#0.00");
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        input = sc.nextInt();
        try{
            if(input>0)
                System.out.println("The square root of " + input + " is " + (nf.format(Math.sqrt(input))));
            else if(input<0)
                throw(new ArithmeticException());
        }
        catch(ArithmeticException e){
            System.out.println("The integer can't be negative");
        }

    }

}