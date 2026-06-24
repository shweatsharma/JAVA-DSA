public class Demo_41 {
    public static void main(String[] args) {
     //Array ko Bubble Sort se ascending order me sort karo.
     int [] arr = {5,4,3,1,2};
     bubble(arr);
     for(int i = 0; i < arr.length;i++){
        System.out.println(arr[i] + " ");
     }

    }

    static void bubble(int[]arr){
        for(int i = 0 ; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i;j++){
                if (arr[j] > arr[j + 1]){
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }
    
}
