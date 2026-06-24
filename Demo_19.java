import java.util.Scanner;
public class Demo_19 {
    public static void main(String[]args){
       /*  String message = greet();
        System.out.println(message);
        int ans = sum(45,65);
        System.out.println("The sum is " + ans);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        String message = hello(name);
        System.out.println(message);


        

    }
    static int sum (int a , int b){
        int sum = a + b;
        return sum;
    }
    static String greet(){
        String greeting = "how are you ";

        return greeting;
    }
    static String hello(String name){
        String hii = "hello  " + name;
        return hii;

    }
    
}
