package practice200322.factory;

public class FactoryTest {
    public static void main(String[] args) {
        Shape s = ShapeFactory.getShape("Rec");
        s.draw();
    }
}
