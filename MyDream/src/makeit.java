public class makeit {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator(2.0);

        ShapeCalculator.pingxing px= shapeCalculator.new pingxing();
        double pingxing = px.calculateArea(3, 4);
        System.out.println("平行四边形的面积是："+pingxing);

        double juxing = shapeCalculator.juxing(3, 4);
        System.out.println("矩形的面积是："+juxing);

        double sanjiao = shapeCalculator.Sanjiao(3, 4);
        System.out.println("三角形的面积是："+sanjiao);

    }
}