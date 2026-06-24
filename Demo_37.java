public class Demo_37 {
    public static void main(String[]args){
        //Binary search.
        int [] arr ={2,3,5,9,14,16,18};
        int target = 15;
        int ans = celling(arr , target);
        System.out.println(ans);

    }

    static int celling(int[] arr , int target){
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
     return start;
    }
    
} 
    

