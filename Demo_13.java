public class Demo_13 {
    public static void main(String[] args) {
        // Chaining of function.

        fun1();
        System.out.println("byy");

        // scope of variable.
        
    }



    static void fun1(){
        fun2();
        System.out.println("hii");
    }
    static void fun2(){
        fun3();
        System.out.println("hello");
    }
    static void fun3(){
        System.out.println("how are you");
    }
    

}
