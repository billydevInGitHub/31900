package practice200322.abstractfactory;

public class FactoryY implements AbstractFactory {
    @Override
    public ProductA produceA() {
        return new ProductAY();
    }

    @Override
    public ProductB produceB() {
        return new ProductBY();
    }
}
