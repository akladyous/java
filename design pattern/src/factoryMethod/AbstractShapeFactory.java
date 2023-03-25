package factoryMethod;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        System.out.println("get shape");
        return factoryMethod();
    }
};

class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}

class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        System.out.println("factory method");
        return new Circle();
    }
}