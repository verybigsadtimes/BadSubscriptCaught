import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        try{
            for (int i = 0; i < 20; i++) {
                System.out.println("Please enter an integer:");
                array[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundException" + exception.getMessage());
        }
        System.out.println(Arrays.toString(array));
    }
}