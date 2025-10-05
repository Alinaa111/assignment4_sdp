// Concrete implementation VectorRenderer
public class VectorRenderer implements Renderer {
    // Override method for vector style drawing
    @Override
    public void renderCircle(double x, double y, double radius) {
        System.out.println("Drawing circle as vector at " + x + ", " + y + " with radius " + radius);
    }
}
