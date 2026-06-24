import java.util.Scanner;
public class Demo_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 1. write a program to sum three number in java.
       /*  int a = 45;
        int b = 45;
        int c = 55;
        int sum = a + b + c;
        System.out.println(sum);

        // 2.write a program to calculate cgpa using marks out of hundred.
        double math = 55;
        double english = 65;
        double hindi = 75;
        double science = 85;
        double computer = 55;
        
        double total = math + english + hindi + science + computer;

        double percentage = total/500 * 100;
        double cgpa =  percentage / 9.5;

        System.out.println(cgpa);*/

        //3. write a java program to convert a string to lowecase.
      //  String name = "SHWEAT KUMAR";
       // System.out.println(name.toLowercase());

        //4. write a program to replace space with underscore

        //5.
      /*   write a program to find out whether a student is pass
       or fail; if it require total 40% to
      and at least 30 % in each subject to pass assume 3 subject
      and take a marks as input from user.
         */

     /*  System.out.println("enter you 5 subject num");
      int math = sc.nextInt();
      int english = sc.nextInt();
      int science = sc.nextInt();
      int hindi = sc.nextInt();
      int computer = sc.nextInt();
      int total = math + english + science + hindi + computer;
      double percentage = total / 500.0 * 100.0;
      System.out.println(percentage );
      if(percentage >= 40 && 
        math >= 33  && 
        english >= 33 && 
        science >= 33  && 
        hindi >= 33  &&  
        computer >= 33  ){
        System.out.println("you are pass");
      } 
      else{
        System.out.println(" you are fail");
      }*/

      // Array.
      // 1. creat an array of 5 float and calculate their sum.
      double sum = 0;
      float [] arr = {31.02f , 25.03f , 63.0f , 42.10f , 22.02f};
      for(int i = 0 ; i < arr.length ; i++){
        sum = sum + arr[i];   
      }
      System.out.println(sum);

      // 2. write a program to find out whether a given integer is present in an array or not.
       int [] num = {12 , 24 , 36 , 48 , 60};
       int target = 36;
       for(int i = 0 ; i < num.length; i++){
        if(num[i] == target){
            System.out.println("found");

        }
       }





        



    }
    
}
