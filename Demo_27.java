public class Demo_27{
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int start = 0;
        int end = arr.length -1;

        while(start <= end ){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(target < arr[mid]){
                end = mid -1;

            }
            else{
                start = mid + 1;
            }   
        }        
        
    }
}