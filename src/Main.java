public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 3);

        System.out.println("Area of the rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());

        rectangle.resize(3);

        System.out.println("Area of the resized rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the resized rectangle: " + rectangle.getPerimeter());
    }
}