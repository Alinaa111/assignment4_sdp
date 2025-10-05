// Refined Abstraction Circle
public class Circle extends Shape{
    // attributes of Circle
    private double x, y, radius;

    // constructor with attributes and drawing style
    public Circle(double x, double y, double radius, Renderer renderer) {
        super(renderer);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Override method for drawin
    @Override
    public void draw() {
        renderer.renderCircle(x, y, radius);
    }
}
