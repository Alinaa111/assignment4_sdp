// Abstraction Shape
public abstract class Shape {
    // reference to a Renderer
    protected Renderer renderer;

    // constructor
    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    // Abstract method for drawing
    public abstract void draw();
}
