package ReviewClass;
//Static VS instancelocal
public class Dog {

        String name;  // instance var
        int weight;   // instance var
        static String breed;  // static ( the breed is same in all objects because it is static)

        void printInfo() {
            System.out.println("Dog features:"+name+", "+weight+", "+breed);
        }

    }
    class Shelter {
        public static void main(String[] args) {
            Dog.breed = "Husky";
            Dog dog1 = new Dog();
            // how to access instance var
            dog1.name = "Bobby";
            dog1.weight = 5;
            dog1.printInfo();  // Dog features:Bobby, 5, Husky

            Dog dog2 = new Dog();
            System.out.println(dog2.name);  // Null
            dog2.name = "Tommy";
            dog2.weight = 10;
            dog2.printInfo();  // Dog features:Tommy, 10, Husky
            System.out.println(dog2.name); // Tommy

            System.out.println("MAKING CHANGES");

            dog1.name = "Bobik";
            dog1.breed = "german";

            dog1.printInfo();  // Dog features:Bobik, 5, german
            dog2.printInfo();  // Dog features:Tommy, 10, german
        }
        }