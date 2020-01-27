package b31900_Exp004_AbstractFactory;

import java.util.ArrayList;


// from 121PD138
// Changed a bit of the code, remove the sub-interface of Shape, seems no need for this
interface Shape{
	void draw();
}

interface ShapeFactory{
	//this is abstract factory, it also return Shape interface!!
	// here we do not introduce the factory of factory method!! 
	public  Shape getShape(String type);
}

class PrintFriendlyFactory implements ShapeFactory{

	public  Shape getShape(String type) {
		switch(type){
		case "Circle" : return new PrintFriendlyCircle();   //different factory, the product selection should be the same !! !!
		case "Rectangle": return new PrintFriendlyRectangle();
		}
		return null;
	}
	
}

class DisplayFriendlyFactory implements ShapeFactory{

	@Override
	public  Shape getShape(String type) {
		switch(type){
		case "Circle": return new DisplayFriendlyCircle();  //different factory , the product selection should be the same !! !! 
		case "Rectangle": return new DisplayFriendlyRectangle();
		}
		return null;
	}
	
}

class PrintFriendlyCircle implements Shape{
	public void draw(){
		System.out.println("PrintFriendly circle draw");
	}
}

class PrintFriendlyRectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("PrintFriendly Rectangle draw");		
	}
}

class DisplayFriendlyCircle implements Shape{

	@Override
	public void draw() {
		System.out.println("DisplayFriendly circle draw");		
	}
	
}

class DisplayFriendlyRectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("DisplayFriendly Rectangle draw");	
		
	}
	
}

class Canvas{
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();
	public void addShape(String factoryType, String type){
		// here we do not use factory of factory method 
		// actually we can use factory of factory method
		if("DisplayFriendly".equals(factoryType)){

            shapeList.add(  (new DisplayFriendlyFactory()).getShape(type) );
			
		}else if ("PrintFriendly".equals(factoryType)){
			shapeList.add(  (new PrintFriendlyFactory()).getShape(type) );
		}else{
			throw new RuntimeException("factory type not supported"); 
		}
	}
	public void redraw(){
		for(Shape s : shapeList){
			s.draw();
		}
	}
}

public class TestAbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canvas c = new Canvas();
		c.addShape("DisplayFriendly", "Circle");
		c.addShape("PrintFriendly", "Rectangle");
		c.addShape("PrintFriendly", "Circle");
		c.redraw();

	}

}
