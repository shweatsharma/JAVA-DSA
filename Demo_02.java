public class Demo_02 {
    public static void main(String[] args) {

        // implicit conversion .
        byte b = 34;
        int i = b;
        System.out.println(i);

        char c = 'a';
        int n = (int) c;
        System.out.println(n);

        int t = 300;
        byte e = (byte) t;
        System.out.println(e);

        // boolean to any data type

        double bool = 568.254;
        int o = (int) bool;
        System.out.println(o);
        
        
    }
    
}
