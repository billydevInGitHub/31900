package b31900_Exp003_FactoryPattern;

import java.util.ArrayList;

interface Shape {
	void fillcolor();
	void draw();
}

class Rectangle implements Shape{
	private int intlength, intheight; 
	
	public Rectangle(int length, int height){
		intlength=length;
		intheight=height;
		System.out.println("rectangel constructed");
	}

	@Override
	public void fillcolor() {
		
		
	}

	@Override
	public void draw() {
		System.out.println("Rectangle draw");
		
	}
	
}

class Circle implements Shape{
	private int xPos,yPos;
	private int radius; 
	
	public Circle(int x , int y, int r){
		xPos=x;
		yPos=y;
		radius=r;
		System.out.println("Circle constructed");
	}

	@Override
	public void fillcolor() {
			
	}

	@Override
	public void draw() {
		System.out.println("Circle draw");
		
	}
	
}

class ShapeFactory {
	public static Shape createShape(String shapeType){
		switch(shapeType){
		case "Circle": return new Circle(10,10,29); 
		case "Rectangle" : return new Rectangle(10,20); 
		}
		return null;
	}
}

class Canvas{
	private ArrayList<Shape> shpList= new ArrayList<Shape>();
	public void addShape(String shptype){
		shpList.add(ShapeFactory.createShape(shptype));
	}
	public void redraw(){
		for(Shape s:shpList){
			s.draw();
		}
	}
	
}

public class TestFactoryPattern {

	//121PD134 
	public static void main(String[] args) {
		Canvas c =new Canvas();
		c.addShape("Rectangle");
		c.addShape("Circle");
		c.redraw();

	}

}
