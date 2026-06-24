class student {
    String name ;
    int age ;
    int roll ;
    String college ;
    void markattendence(){
        System.out.println("attendence marked by " + name);

    }
    void print(){
        System.out.println(name + " ,"+ age + " ,"+ roll + " ,"+ college);
    }


 }
public class Demo_16 {
    public static void main(String[]args){
        // object oriented programming(oop).
        //naming convention.
        student s1 = new student();
        student s2 = new student();

        s1.name = "shweat";
        s1.age = 20;
        s1.roll = 23;
        s1.college = "satyam";

        s2.name = "pratik";
        s2.age = 13;
        s2.roll = 24;
        s2.college = "bishop";
        
        
        s1.markattendence();
        s2.markattendence();
        s1.print();
        s2.print();
        

         
    }
    
}
