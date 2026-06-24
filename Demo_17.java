class student {
    String name ;
    int age;
    int roll;
    String college;
  
   void markattendence(){
        System.out.println("attendence marked by " + name);
   }
   //default
   student (){
    
   }
   //parametrized constructor.
   student(String n , int a , int rn , String coll){
    name  = n;
    age = a;
    roll = rn;
    college = coll;



   }

}
public class Demo_17 {
    public static void main(String[] args) {
        //constructor.
        //default constructor.
        //parametrized constructor. 
        student s1 = new student("rohit" , 20 , 102 , "satyam");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.roll);
        System.out.println(s1.college);
         
        
    }
    
}
