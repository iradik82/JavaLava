package repls;

public class repl173 {
    public static void main(String[] args) {
        ChaiTea Chai=new ChaiTea("Chai Tea");
        Chai.addSugar();
        LemonTea lemonTea=new LemonTea("Lemon Tea");
        lemonTea.addSugar();
    }
}
abstract class tea{
    String teaType;

    tea(String teaType){
        this.teaType=teaType;
    }
    void addSugar(){};
}
class ChaiTea extends tea{

    ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class LemonTea extends tea{

    LemonTea(String teaType) {
        super(teaType);
    }
    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 1 spoon of sugar");
    }
}