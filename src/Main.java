// Client code - Main
public class Main {
    public static void main(String[] args){
        // Creating two types of renderers
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        // Creating circles for different renderers
        Circle circle1 = new Circle(10, 10, 5, vector);
        Circle circle2 = new Circle(5, 7, 10, raster);

        // Drawing these circles
        circle1.draw();
        circle2.draw();

    }
}