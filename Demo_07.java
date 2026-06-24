public class Demo_07{
    public static void main(String[]args){

        // nested loops.
        /*    for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
            
        }*/

        //jump statement.
        //break.
        //continue.
     /*    int b ;
        for(int i = 1; i <= 10;i++){
            System.out.println(i);
        
        if(i == 5){
            break;
        }
    }*/
    //whether a num is prime or not.
   // int p = 9;
    //int i;
   /*  for( i = 2;i < p;i++){
        if(p % i == 0){
            System.out.println("the num is not prime");
            break;
            
        }
        
    }
    if(i == p){
        System.out.println("the num is prime");
    }*/

    //continue.
    for(int i = 1; i <= 10;i++){
        if(i % 2 != 0){
            continue;
        }
        System.out.println(i);
    }
        
    

    
    }
}