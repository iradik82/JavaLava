package JavaClasses.Java18class81022constructorsKeywords;

public class Horse extends Animal {






    public Horse(String name,String breed,int age,double weight){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;

    }
   /* void printInfo(){
        String name="Hello";
        System.out.println("name "+this.name+" Breed "+breed+" age "+age+" Weight "+weight);
    }*/     //in Animal(parent) class

    public static void main(String[] args) {
        Horse horseObject=new Horse("Sprit","Stallion",20,400);
        horseObject.printInfo();
    }



}
