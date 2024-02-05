public class PolymorphismMain {
    public static void main(String[] args) {
        // Polymorphic behavior
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Calling the draw method without knowing the exact type

        rectangle.draw();
        circle.draw();
    }
}