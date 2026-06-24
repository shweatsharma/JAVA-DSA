public class Demo_23{
    public static void main (String[]args){
        // print the array
        int[] arr = {10, 20, 30, 40, 50};
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }

        //sum of array.
        int sum = 0;
        int[] arr1 = {5, 10, 15, 20};
        for(int i = 0; i < arr1.length;i++){
            sum = sum + arr1[i];
        }
        System.out.println(sum);

        //maximum element of array.
        int[] arr2 = {5, 10, 15, 20};
        int max = arr2[0];
        for(int i = 0;i < arr2.length;i++){
            if(arr2[i] > max){
                max = arr2[i];
            }
        }
        System.out.println("maximum = " + max);

        //minimum element of array.
        int[] arr4 = {5, 10, 15, 20};
        int min = arr4[0];
        for(int i = 0; i < arr4.length;i++){
            if(arr4[i] < min){
                min = arr4[i];
            }
        }
        System.out.println("minimum = " + min);

        // maximum.
        int[] num = {100, 2, 500, 1, 45};
        int big = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] > big){
                big = num[i];
            }
        }
        System.out.println("big = " + big);

        // minimum.
        int[] num1 = {100, 2, 500, 1, 45};
        int small = num1[0];
        for(int i = 0; i < num1.length;i++){
            if(num1[i] < small ){
                small = num1[i];
            }
        }
        System.out.println( " small = " + small);

        // reverse array.
        int [] rev = {1,2,3,4,5,6};
        for(int i = rev.length - 1;i >= 0;i--){
            System.out.println(rev[i]);
        }
        // linear search.
        int linear[] = {10,20,30,40,50};
        int target = 30;
        for(int i = 0 ; i < linear.length; i++){
            if (linear[i] == target){
                System.out.println("Target found =" + i);
                break;

            }
        }

        // count even / odd.
        int evod [] = {10,15,20,25,30,35};
        int evencount = 0;
        int oddcount = 0;
        for(int i = 0; i < evod.length;i++){
            if(evod[i] % 2 == 0){
                evencount++;
            }
            else{
                oddcount++;

            }
        } 
        System.out.println("even count = " + evencount);
        System.out.println("odd count = " + oddcount);

        // second largest num.
        int second [] = {10,20,30,40,50};
        int largest = second[0];
        int secondlargest = second[0];

        for(int i = 0; i < second.length;i++){
            if(second[i] > largest){
                secondlargest = largest;
                largest = second[i];

            }

        }
        System.out.println(largest);
        System.out.println(secondlargest);

        // remove duplicates.
        int dup [] = {1,2,1,2,3,4,5};

        for(int i = 0; i < dup.length;i++){

        }

        //check shorted array.
        int sho [] ={10,20,30,25,15,50};
        for(int i = 0; i < sho.length;i++){

        }
        




        

    }
   
}