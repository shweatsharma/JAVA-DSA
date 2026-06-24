public class Demo_22{
    public static void main (String[]args){
        //Linear search algorithm.
        /*int [] nums = {11,22,33,44,55,66,77,88,99};
        int target = 11;
        int ans = search(nums , target);

        System.out.println(ans);*/

      /* /  Element exist karta hai ya nahi

            Array: {5, 8, 12, 7}
            Target: 10
            "Found / Not Found" print karo*/
            


        
    }
    //Search in the array.
    static int search(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }

        }
         return -1 ;

    }
}