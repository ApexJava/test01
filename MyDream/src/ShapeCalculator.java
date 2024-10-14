public class ShapeCalculator {
    private double scaleFactor;

    public ShapeCalculator(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public class pingxing implements Shape {
        @Override
        public double calculateArea(double base, double height) {
            return base*height*scaleFactor;
        }
    }

    public double juxing(double length,double height){
        Shape shape =new Shape() {
            @Override
            public double calculateArea(double a, double b) {
                return a * b ;
            }
        };return shape.calculateArea(length,height)*scaleFactor;
    }

    public double Sanjiao(double base, double height){
        Shape sanjiao =(double a,double b)->a*b*0.5;
        return sanjiao.calculateArea(base,height)*scaleFactor;
    }


}
