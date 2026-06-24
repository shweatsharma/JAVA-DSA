public class Demo_28 {
    public static void main(String[] args) {

        student s1 = new student();

        student s2 = new student("shweat", 25, 101, "SIITM");

        student s3 = new student(null, 0, 0, null);

        System.out.println(s2.rollnumber);
    }
}

class student {
    String name;
    int age;
    int rollnumber;
    String college;

    student() {
    }

    student(String name) {
        this(name, 0, 0, null);
    }

    student(String name, int age, int rollnumber, String college) {
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
        this.college = college;
    }
}