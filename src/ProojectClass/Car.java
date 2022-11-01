package ProojectClass;
/*
Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount,
 otherwise 10% discount
 */
public class Car {
    int carPrice;
    String color;

    Car(int carPrice,String color){
        this.carPrice=carPrice;
        this.color=color;
    }

    double calculateSalePrice(){


        return carPrice;
    }
}
class Sedan extends Car {
    int lenght = 0;

    Sedan(int carPrice, String color, int lenght) {
        super(carPrice, color);
        this.lenght = lenght;
    }

    @Override
    double calculateSalePrice() {
        if (lenght > 20) {
            return carPrice - (carPrice / 100 * 5);
        }else {
            return  carPrice - (carPrice / 100 * 10);
        }


    }
}
class Truck extends Car {
    double weight;

    Truck(int carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice - (carPrice / 100 * 10);
        } else {
            return carPrice - (carPrice / 100 * 20);
        }

    }
}
class CarTester{
    public static void main(String[] args) {
        Sedan sed=new Sedan(3000,"Blue",34);
        System.out.println("Your price after discount "+sed.calculateSalePrice());

        Truck tr=new Truck(20000,"grey",4000);
        System.out.println("Your price after discount "+tr.calculateSalePrice());
    }
}
