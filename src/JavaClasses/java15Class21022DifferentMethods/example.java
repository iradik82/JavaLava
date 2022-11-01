package JavaClasses.java15Class21022DifferentMethods;

public class example {

        static int topSpeed = 200;
        static int numberOfTyres = 2;
        String model; //instance variables
        int year; //instance variables

        void printTotalDistance(int noOfGallons, int avgMPG){
            double distance = avgMPG * noOfGallons;
            System.out.println("Your bike can go max "+distance+" Miles with "+noOfGallons+" Gallons.");

        }

        public static void main(String[] args) {
            example bike = new example();
            bike.printTotalDistance(10,20);
        }

    }

