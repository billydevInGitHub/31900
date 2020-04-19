package practice200322.abstractfactory;

public class FactoryX implements AbstractFactory {
    @Override
    public ProductA produceA() {
        return new ProductAX();
    }

    @Override
    public ProductB produceB() {
        return new ProductBX();
    }
}
