package ProojectClass;

public class Caranother {

        double carPrice;
        String color;

        double calculateSalePrice(){

            return carPrice;
        }
    }
    class Sedan1 extends Caranother {
        double length;
        double calculateSalePrice() {
            if(length > 20) {
                return carPrice *0.95;
            } else {
                return  carPrice * .9;
            }
        }
    }
    class Truck1 extends Caranother {
        double weight;

        double calculateSalePrice() {
            if(weight > 2000) {
                return carPrice * .9;
            } else
                return carPrice * .8;
        }
    }
    class TestCode {
        public static void main(String[] args) {
            Sedan1 sedan = new Sedan1();
            sedan.carPrice = 20000;
            sedan.length = 22;
            System.out.println(sedan.calculateSalePrice());

            Truck1 truck = new Truck1();
            truck.carPrice = 50000;
            truck.weight = 2500;
            System.out.println(truck.calculateSalePrice());
        }
    }

