public class Demo_05 {
    public static void main(String[]args){
        //1.number positive , negative ya zero check karo.
       /*  int i = -5;
        if(i > 0){
            System.out.println("i is positive");

        }
        else{
            System.out.println("i is negative");
        }

        //2.even ya odd .
        int a = 29;
        if(a % 2 == 0){
            System.out.println("num is even");
        }
        else{
            System.out.println("num is odd");
        }

        //3.find largest in two num.
        int b = 45;
        int c = 99;
        if(b > c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest ");
        }

        //4.find largest in three num.
        int x = 56;
        int y = 67;
        int z = 98;

        if(x > y && x > z){
            System.out.println("x  is largest");
        }
        else if(y > x && y > z){
            System.out.println("y is largest ");
        }
        else{
            System.out.println("z is largest");
        }

        //5.pss or fail
        int m = 31;

        if(m >= 33){
            System.out.println("student pss");
        }
        else{
            System.out.println("student fail");
        }

        //6.eligible for vote or not.
        int v = 23;
        if (v >= 18){
            System.out.println("you are eligible for vote");
        }
        else{
            System.out.println("sorry you are not eligible");
            
        }

        //7.leep year or not

        int l = 1900;
        if(l % 4 == 0 && l % 100 != 0) {
            System.out.println("year is leap year");
        }
        else if(l % 400 == 0){
            System.out.println("year is leap year");
        }
        else{
            System.out.println("year is not a leap year");
        }

        //8.number divisible by 5 and 11 hai ya nhi.
        int d = 55;
        if(d % 5 == 0 && d % 11 == 0){
            System.out.println("num is divided by both");
        }
        else{
            System.out.println("num is not dividided by both");
        }

        //9.character vowel hai ya constant.
        char k = 'p';
        if(k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u'){
            System.out.println("k is vowel");
        }
        else{
            System.out.println("k is consotant");
        }

        //10. lowercase ya uppercase check karo.
        char h = 'D';
        if(h >= 'A' && h <= 'Z'){
            System.out.println("uppercase");
        }
        else{
            System.out.println("lowecase");
        }*/

        // medium level.
        //11. salary bonous.
        //salary > 50000 - 20% bonous.
        //warna 10%.

        int salary = 35000;
        if(salary >= 50000 ){
            System.out.println("total salary = " + (salary + 10000));
        }
        else{
            System.out.println(" total salary = " + (salary + 5000));
        }

        //12
         /*.Electricity bill:
        units < 100 → ₹5/unit
        units 100–200 → ₹7/unit
        units > 200 → ₹10/unit */

        int unit = 300;
        if(unit < 100){
            System.out.println("total unit =" + (unit * 5));

        }
        else if(unit >= 100 && unit <= 200 ){
            System.out.println("total unit =" + (unit * 7));
        }
        else{
            System.out.println("total unit = " + (unit * 10));
        }

        //13.
        /*
        Grade system:
        90+ → A
        75+ → B
        60+ → C
        40+ → D
        warna Fail
        */
       int  g = 76;

       if(g >=90 && g <= 100){
        System.out.println("you got grade A");
       }
       else if(g >= 75 && g <= 89){
        System.out.println("You got a b");

       }
       else if(g >= 60 && g <= 74){
        System.out.println("You got c");

       }
       else if(g >= 40 && g<= 59){
        System.out.println("you got d");

       }
       else{
        System.out.println("sorry you are fail");
       }

       //14.
       /*
       Triangle valid hai ya nahi:
       sum of angles = 180
       */

       int a = 50;
       int b = 70;
       int c = 60;

       if(a + b + c == 180){
        System.out.println(" yes it is triangle");
       }
       else{
        System.out.println("no this is not a triangle");
       }

      //15.Biggest among four number.
      int d = 50;
      int e = 78;
      int f = 90;
      int x = 67;

      if(d > e && d > f && d > x){
        System.out.println("D is largest");
      }
      else if(e > d && e > f && e > x){
        System.out.println("E is largest");
      }
      else if(f > d && f > e && f > x){
        System.out.println("F is largest");
      }
      else{
        System.out.println("X is largest");
      }

      //16.
      /*
      ATM withdrawal:
      balance enough hai to withdraw
      warna insufficient balance
      */

      int balance = 1523;
      int withdraw  = 20000;
      if(withdraw <= balance){
        System.out.println("withdrawal successful");
        System.out.println("reamining balannce =" + (balance - withdraw));
        
      }
      else{
        System.out.println("Insufficient balance");
      }

      //17.
      /*
      Shopping discount:
      amount > 5000 → 20% off
      amount > 2000 → 10% off
      warna no discoun
      */
     int amount = 6000;
     if(amount > 5000){
        double discount = amount * 20/100;
        System.out.println("Discount = " + discount);
        System.out.println("final amount is = " +(amount - discount));
    
     }
     else if (amount > 2000){
        double discount = amount *10/100;
        System.out.println("Discount = " + discount);
        System.out.println("final amount is  = " +(amount - discount));
    }
    else{
        System.out.println("no discopunt");
        System.out.println("final amount = " + amount);
    }

    //18.Number 3 digit hai ya nhi .


    //19.emperature:
    /*
    40 → Very Hot
    30 → Hot
    20 → Normal
    warna Cold
    */
   int tem = 12;
   if(tem >= 31 && tem <= 40){
    System.out.println("very hot");

   }
   else if(tem >= 25 && tem <= 30){
    System.out.println("hot");
   }
   else if (tem >= 15 && tem <= 24){
    System.out.println("Normal");

   }
   else{
    System.out.println("two much cold");
   }

     


















    }
    
}
