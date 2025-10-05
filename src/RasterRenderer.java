// Concrete implementation RasterRenderer
public class RasterRenderer implements Renderer {
    // Override method for pixel style drawing
    @Override
    public void renderCircle(double x, double y, double radius) {
        System.out.println("Drawing circle as pixels at " + x + ", " + y + " with radius " + radius);
    }
}
