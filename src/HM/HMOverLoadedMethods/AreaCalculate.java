package HM.HMOverLoadedMethods;
/*
Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box

Use separate class to test your code
 */
 public class AreaCalculate {

    void area(int a, int b){
        int area=a*b;
        area=area*area;
        System.out.println("Rectangle area with "+a+" "+b+" = "+ area);

    }

    void area(double b,double a){
        double area=b*a;

        System.out.println("square area with "+a+" "+b+" = "+area );

    }
    void area(int a,int b,int c){
        int area=a*b*c;
        System.out.println("box area with "+a+" "+b+" "+c+" = "+area);
}
}
 class areas{
    public static void main(String[] args) {
        AreaCalculate ar=new AreaCalculate();
        ar.area(10,4);
        ar.area(4.3,4.3);
        ar.area(4,2,8);
    }
}
