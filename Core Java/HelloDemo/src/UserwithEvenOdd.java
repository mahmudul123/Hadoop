import java.util.Scanner;

public class UserwithEvenOdd {
    public static void main(String[] args) {
        //creating Scanner class object
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number:");
        //Reading value from user
        int num = scan.nextInt();
        //method calling
        findEvenOdd(num);
    }
    //user Defind method
    public static void findEvenOdd(int num){
        //method Body
        if(num%2 == 0)
            System.out.println(num+" is Even");
        else
            System.out.println(num+" is Odd");
    }
}
