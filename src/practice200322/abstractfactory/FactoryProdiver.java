package practice200322.abstractfactory;

public class FactoryProdiver {
    public static AbstractFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "X":
                return new FactoryX();
            case "Y":
                return new FactoryY();
        }
        return null;
    }
}
