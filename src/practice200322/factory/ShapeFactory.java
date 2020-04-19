package practice200322.factory;

public class ShapeFactory {
    public static Shape getShape(String type) {
        Shape retShape = null;
        switch (type) {
            case "Rec":
                retShape = new Rectangle();
                break;
            case "Cir":
                retShape = new Circle();
                break;
        }
        return retShape;
    }
}
