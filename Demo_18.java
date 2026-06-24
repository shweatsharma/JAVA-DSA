import java.util.Scanner;
public class Demo_18{
    public static void main (String[]args){
        // function / method in java.
        // 1, take input of 2 num and print the sum.
        int ans = sum();
        System.out.println("the sum is " + ans);
       
       
        
    }
     static int sum(){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1 ");
        int num1 = sc.nextInt();

        System.out.println("enter you second num");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;

        
    }
}