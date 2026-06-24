public class Demo_12 {
    public static void main(String[] args) {
        //Function overloading.

        System.out.println(sum(45 , 45));

        System.out.println(sum(45 , 45 , 45));

        hello("shweat", 20);


    }
    static int sum(int a , int b){
        return (a + b);
    }
    static int sum(int a , int b , int c){
        return (a + b + c);
    }
    static void hello(String name , int age){
        System.out.println("hii " + name + " your age is " + age);
    }
    static void fun(){
        System.out.println();
    }
    


    
    
}
