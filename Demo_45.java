public class Demo_45 {
    public static void main(String[]args){
        //print array.
       /*  int arr [] = {10,20,30,40,50,60,70,80,90,100};
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
        //find max element.
        int arr [] = {10,20,30,40,50,60,70,80,90,100};
        int max = arr[0];
        for(int i = 1; i <arr.length;i++){
            if(arr[i] > max){
                max = arr[i];

            }

        }
        System.out.println(max);
        

        // find min.
        int arr [] = {10,20,30,40,50,60,70,80,90,100};
        int min = arr[0];
        for(int i = 1;i < arr.length; i++ ){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
       

        // sum of array.
        int arr [] = {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        for(int i = 0; i <arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        

        //reverse array.
        int arr [] = {10,20,30,40,50,60,70,80,90,100};
        for(int i = arr.length - 1; i >= 0 ;i--){
            System.out.println(arr[i]);

        }
        

        //elemnt ko revesre.
        int arr [] = {10,20,30,40,50,60,70,80,90,100};
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;


        }
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        */

        //linear search.
        int arr [] = {10,20,30,40,50,60,70,80,90,100};
        int i ;
        int target = 100;
        boolean found = false;
        for( i = 0; i < arr.length ;i++){
            if(arr[i] == target){
                System.out.println("target found at index  " + i);
                found = true;
                break;
            }
            
        }
        if(!found){
            System.out.println("target not found");

        }
        
        //find the second largest element.
        //check if the array is shorted.
        



        
        







       




    }
}
