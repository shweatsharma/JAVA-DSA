public class Demo_46 {
    public static void main(String[]args){
        //Liner search.
        int arr [] = {10,20,30,40,50,60,70,80,90,100};
        int target = 70;
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target ){
                System.out.println("target found at index " + i);
                found = true;
                break;



            }
           

        }
         if(!found ){
                System.out.println("target not found");
            }


    }
    
}
