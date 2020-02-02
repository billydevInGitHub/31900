package b31900_Exp007_NewAbstractFactoryPattern;





interface ProductA{
	public void productInfo(); 
}

interface ProductB{
	public void productInfo(); 
}

class ProductAX implements ProductA{
	public void productInfo() {
		System.out.println("Product AX");
	}
}

class ProductAY implements ProductA{
	public void productInfo() {
		System.out.println("Product AY");
	}
}

class ProductBX implements ProductB{
	public void productInfo() {
		System.out.println("Product BX");
	}
}

class ProductBY implements ProductB{
	public void productInfo() {
		System.out.println("Product BY");
	}
}

interface AbstractFactory{ //this is not the factory of factory, just an abstract factory
	ProductA produceA();
	ProductB produceB();
}

class FactoryX implements AbstractFactory{
	public ProductA produceA() {
		return new ProductAX();
	}
	
	public ProductB produceB() {
		return new ProductBX();
	}
}

class FactoryY implements AbstractFactory{
	public ProductA produceA() {
		return new ProductAY();
	}
	
	public ProductB produceB() {
		return new ProductBY();
	}
}




	
class FactoryProvider {
	public static  AbstractFactory getFactory(String factoryXYType) {
		switch(factoryXYType) {
		case "X": return new FactoryX();	
		case "Y": return new FactoryY();
	}
		return new FactoryX();
	}
}


public class AbstractDesign {

	public static void main(String[] args) {
		FactoryProvider.getFactory("X").produceA().productInfo();//XA combination , there should be 4 combinations
		FactoryProvider.getFactory("Y").produceB().productInfo();
	}
}
