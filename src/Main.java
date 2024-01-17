// First class
class FirstClass {
    // Private member variables
    private int price;
    private String title;

    // Public methods
    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

// Second class derived from FirstClass
class SecondClassDerived extends FirstClass {
    // Additional private member variables
    private double range;
    private int speed;

    // Constructor with parameters (passing parameters to the base class constructor)
    public SecondClassDerived(int price, String title, double range, int speed) {

        // Set values for the base class variables using the setters
        setPrice(price);
        setTitle(title);

        // Set values for the derived class variables
        this.range = range;
        this.speed = speed;
    }

    // Additional public methods in the derived class
    public double getrange() {
        return range;
    }

    public int getspeed() {
        return speed;
    }
    @Override
    public String getTitle() {

        return "Derived Title: " + super.getTitle();
    }
}

public class Main {
    public static void main(String[] args) {
        FirstClass object2 = new FirstClass();
        object2.setPrice(20);
        object2.setTitle("titl2");
        // Create an object of the derived class
        SecondClassDerived myObject = new SecondClassDerived(10, "Title", 5.5, 42);


        System.out.println("Price of firstclass: " + object2.getPrice());
        System.out.println("Title :" + object2.getTitle());
        // Demonstrate behavior of the derived class
        System.out.println("Price: " + myObject.getPrice());
        System.out.println("Title: " + myObject.getTitle());
        System.out.println("range: " + myObject.getrange());
        System.out.println("speed: " + myObject.getspeed());
        System.out.println();
    }
}
