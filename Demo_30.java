import java.util.Scanner;
public class Demo_30{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //practice que for interview .
        //1.even/odd number.
        /*int  a = 0;
        if(a % 2 == 0){
            System.out.println("even num ");
        }
        else{
            System.out.println("negative num");
        }

        //2.largest of 3 num.
        int a = 45;
        int b = 65;
        int c = 85;
        if(a > b && a > c){
            System.out.println("A is largest");
        }
        else if(b > a && b > c){
            System.out.println("B is largest");
        }
        else if(c > a && c > b){
            System.out.println("C is largest");
        }
        else{
            System.out.println("all are equal");
        }

        //3.leap year.
        int year = 2005;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
            

        //4.Factoral.
        int a = 6;
        int fact = 1;
        for(int i = 1; i <= a;i++){
            fact = fact * i;
        }
        System.out.println(fact);
        */

        //5.Fibonacci series.
        int a = 3;
        int b = 5;

        System.out.println(a + " " + b );

        for(int i = 1; i < 10 ; i++){
            int c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;

        }

        //6.Prime num.
        //7.Reverse number.
        //8.Palindrome number.
        //9.Sum of digit.
        //10.Armstrong number.
        //11.Count digit.           


    }
}