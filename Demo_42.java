public class Demo_42 {
    public static void main(String[] args) {
        int [] num = {1,3,2,5,4};
        booble(num);

        for(int i = 0; i < num.length ;i++){
            System.out.println(num[i] + " ");
        }
    }
   
    
    static void booble(int [] num){
        for(int i = 0;i < num.length - 1; i++){
            for(int j = 0; j < num.length - 1 - i; j++){
                if(num[j] < num[j + 1]){
                    int swap = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = swap;

                }

            }
        }

    }
}
