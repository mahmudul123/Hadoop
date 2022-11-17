import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //creating scanner class object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        //reading the values from the user
        int num = scan.nextInt();
        //method calling
        Userdefined.findEvenOdd(num);
    }
}
