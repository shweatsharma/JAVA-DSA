public class Demo_34 {
    public static void main(String[]args){
        Student s1 = new Student("Shweat" , 21);
        s1.cast();


    }
    
}
class Student{
    String name;
    int age;


    Student(String name , int age ){
        this.name = name;
        this.age = age;
    }


    //constructor
    void cast(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);

    }
    


}
