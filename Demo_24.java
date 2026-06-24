public class Demo_24{
    public static void main(String[] args){
        //
        // find the middle element.
        // target is greater than middle element search to right side
        //otherwise search in left side.
        int [] arr = {10,20,30,40,50,60,70,80,90};
        int target = 50;

        int ans = search(arr , target);
        System.out.println("index = " + ans);


    }
    //return index.
    //return -1 if it does not exist.
    static int search(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
        

}