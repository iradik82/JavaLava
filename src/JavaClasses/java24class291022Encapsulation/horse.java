package JavaClasses.java24class291022Encapsulation;

public class horse {
    private String name;
  private String color;
  private double weight;
  private int age;
  private int id;


    public horse(String name, String color, double weight, int age, int id) {
        setName(name);
        setColor(color);
        setWeight(weight);
        setAge(age);
        setId(id);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>10){
            System.out.println("camon you will never remember that long name,make it shorter!");
        }else {
            this.name = name;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            System.out.println("Color can't be empty");
        }else {
            this.color = color;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}class check{
    public static void main(String[] args) {
        horse bob=new horse("Bolklfkgkglfb","grey",200,5,342);
        System.out.println(bob.getId()+" "+bob.getName());
    }
}
