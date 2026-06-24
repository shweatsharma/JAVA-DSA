public class Demo_31 {
    public static void main(String[] args) {
        //object deep drive.
        //call by value.
        int x = 4;
        int y = 5;
        System.out.println(x + " , " + y);

        addten(x ,y);
        System.out.println(x + " , " + y);

    }
    static void addten(int x , int y){
        x = x + 10;
        y = y + 10;
    }
    
}
