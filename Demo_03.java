public class Demo_03{
    public static void main(String[] args) {
        // if , else if ,else statment.
        
        //1.
        boolean b = true;
        if(b == true){
            System.out.println("Yes");

        }
        else{
            System.out.println("No");
        }

        //2.
        int n = 10;
        if(n % 2 == 0){
            System.out.println("i is even");
        }
        else{
            System.out.println("i is odd");
        }

        //Nested ifs.
        int t = 9;
        if(t > 6){
            if(t < 10){

            }
             else{

             }        
           
        }
        else{

        }

        //.
        if(t > 5 && t < 10){
        }

        // if ,else-if ladder.
        int i = 10;
        if(i == 5){
            System.out.println("i is 5");

        }
        else if(i == 6){
            System.out.println("i is 6");

        }
        else if(i == 10){
            System.out.println("is is 10");

        }
        else{
            System.out.println("kidmada");
        }
        
        int age = 56;
        if(age > 80){
            System.out.println("yor are old");
        }
        else if(age > 40){
            System.out.println("you are getting older");
        }
        else{
            System.out.println("budhe ");

        }

        

        



    }

}