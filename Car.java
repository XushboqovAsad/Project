public class Car {


    public void getColor(String color) {
        System.out.println(color);
    }
    public void getModel(String model){
        System.out.println(model);
    }
    public void getType(String type){
        System.out.println(type);
    }
    public void getPrice(double price){
        System.out.println(price);
    }
    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.getColor("Black");
        mercedes.getModel("Mercedes");
        mercedes.getPrice(250000);
        mercedes.getType("Automathic");
    }
}


