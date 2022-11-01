package ProojectClass;

public interface Shape {
        void CalculateArea();
        void Calculateperimiter();
        double radius = 3;
        double pie=3.14;
        double length = 5;
        double weight = 4;


    }
    class Circle implements Shape{

        @Override
        public void CalculateArea() {
            System.out.println(Math.PI*Math.pow(radius, 2));
        }

        @Override
        public void Calculateperimiter() {
            System.out.println(2*Math.PI*radius);
        }
    }
    class Square implements Shape {

        @Override
        public void CalculateArea() {
            System.out.println(Math.pow(radius, 2));
        }

        @Override
        public void Calculateperimiter() {
            System.out.println(4 * radius);
        }


    }
    class ShapeTester{
        public static void main(String[] args) {
            Shape[]Size={new Circle(),new Square()};
            for(Shape shape :Size) {
                shape.CalculateArea();
                shape.Calculateperimiter();
            }
        }
    }

