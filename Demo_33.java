public class Demo_33 {
    public static void main(String[]args){
        //practice of constructor.
        Car c1 = new Car("Toyota" , "Fortuner");
        Car c2 = new Car("honda " ," city");

        c1.show();
        c2.show();


    }
    
}
class Car{
    String brand;
    String model;


    Car(String brand , String model){
        this.brand = brand;
        this.model = model;
    }


    //constructor
    void show(){
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);

    }
    
}
