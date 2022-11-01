package HM.HMInheritance;

/*
Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
 In circle class create a method to calculate the area of circle. Test your code
 */
public class ShapeClass {
    int radius;

    public ShapeClass(int radius) {

        this.radius = radius;
    }


}
      class circleClass extends ShapeClass{
          public circleClass(int radius) {
              super(radius);
          }

          void rad(int radius){
        this.radius=radius;
        int b=radius*2;
         System.out.println("Area with "+radius+" = "+b);

    }
}

class Radius{
    public static void main(String[] args) {
        circleClass rad=new circleClass(7);
        rad.rad(7);
    }
}
