public class Demo_08 {
    public static void main(String[] args) {
        //1. 1 se 10 tak numbers print karo.
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //2. 1 se 100 tak even numbers print karo.
      /*   for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }

        //3.100 se 1 tak reverse counting print karo.
        for(int i = 100; i >= 1; i--){
            System.out.println(i);
        }*/

        //4.1 se N tak numbers ka sum nikalo.
      /*   int i ;
        int sum = 0;
        for( i = 1; i <= 10;i++){
            sum = sum +i;
            
        }
        System.out.println(sum);*/

        //5.N ka table print karo.
      /*   int n =5;
        for(int i = 1; i <= 10;i++){
            System.out.println(n + "x" + i + "=" +(n * 1));
        }*/

        //6. 1 se N tak odd numbers print karo. 
       /*  for(int i = 1 ; i <= 100; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }*/

        //7.1 to 50 tkk ka  sum print karo.
     /*    int sum = 0;
        for(int i = 1 ; i <= 50; i++){
            sum = sum +i;
        
        }
        System.out.println(sum);*/

        int add = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                continue;

            }
            add = add +i;
            System.out.println(i);
        }
        System.out.println(add);
    


          

    



    }
    
}
