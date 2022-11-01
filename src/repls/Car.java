package repls;

class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    int price;

    public Car(String make, String model, int numberOfDoors, int topSpeed, int price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    Car(String make, String model, int topSpeed, int price) {
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
    }
}

