public class Demo_25 {
    public static void main(String[]args){
        int arr [] = {10,20,30,40,50,60};
        int target = 50;
        int ans = search(arr , target);
        System.out.println(ans);

        int [] num = {10,20,30,40,50,60,70,80,90,100};
        int found = 70;
        int ans1 = binery(num , found);
        System.out.println(ans1);

    }
    static int search(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start ) / 2;
            
            if(arr[mid] == target){
                return mid;

            }
            else if (target < arr[mid]){
                end = mid + 1;
            }
            else{
                start = mid + 1;
            }
            
        }
        return -1;

    }
    static int binery(int [] num , int found){
        int start1 = 0;
        int end1 = num.length -1;

        while(start1 <= end1){
            int mid1 = start1 + (end1 - start1) / 2;

            if(num[mid1] == found){
                return mid1;
            }
            else if (found < num[mid1]){
                end1 = mid1 + 1;

            }
            else{
                start1 = mid1 + 1;
            }
        }
        return -1;
    }

}
