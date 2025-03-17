class Car {
    String brand;
    int speed;

    // 생성자
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", 120);
        myCar.displayInfo();
    }
}

