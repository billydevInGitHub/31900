package practice200322.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        FactoryProdiver.getFactory("X").produceA().information();
        FactoryProdiver.getFactory("X").produceB().information();
        FactoryProdiver.getFactory("Y").produceA().information();
        FactoryProdiver.getFactory("Y").produceB().information();
    }
}
