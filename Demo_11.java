public class Demo_11{
    public static void main(String[] args){
        //Function in java.
        
        greet();

        say("shweat");

        System.out.println(sum(45,36));

        System.out.println(sub(45, 60));

        System.out.println(multiply(12, 05));

        System.out.println(sum(56, 012));
        
        System.out.println(sum(45 , 045 , 45));
           
    }


      //no input no output.
      static void greet(){
        System.out.println("hello");
      }

      //input , no output.
      static void say(String name){
        System.out.println("hello " + name);
      }

      static int  sum (int a , int b){
        return (a + b);

      }
      static int sum(int a , int b , int c){
        return (a + b + c);
      }

      static int multiply(int a , int b){
        return (a * b);
      }

      static int sub (int a , int b ){
        return ( a- b );

      }






}     
