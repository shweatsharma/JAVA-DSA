public class Demo_21 {
    public static void main(String[]args){
        int[] num ={1,2,3,4,5,6,7};
        change(num);
       for(int i = 0; i < num.length;i++){
        System.out.println(num[i]);
       }

    } 
    static void change(int[]nm){
        nm[0] = 99;
        nm[2] = 45;
    }
}
