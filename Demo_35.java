public class Demo_35{
    public static void main(String[]args){
        //Assending array.
        //Binary search.
        int [] arr ={10,20,30,40,50,60,70,80};
        int target = 1;
        int ans = search(arr , target);
        System.out.println(ans);



    }

    //return the index.
    static int search(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            //find the middle element.
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;

            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
} 