public class Demo_36 {
    public static void main(String[]args){
        //Binary search.
         int [] arr ={10,20,30,40,50,60,70,80};
        int target = 40;
        int ans = order(arr , target);
        System.out.println(ans);

    }

    static int order(int[] arr , int target){
       int start = 0;
        int end = arr.length - 1;
        // find whether the array is shoerted in accending or desecnding oder .
        boolean find;
        if(arr[start] < arr[end]){
            find = true;

        }else{
            find = false;
        }
        while(start <= end){
            //find the middle element.
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(find){
            if(target < arr[mid]){
                end = mid - 1;

            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                // ans found.
                return mid;
            }
        }
     }
     return -1;
    }
    
} 
    

