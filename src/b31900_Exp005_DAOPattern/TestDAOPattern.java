package b31900_Exp005_DAOPattern;

class Circle{
	private int xPos, yPos;
	private int radius;
	Circle(int x, int y, int r){
		xPos=x; yPos=y; radius=r;
	}
	public CircleTransfer getCircleTransfer(){
		CircleTransfer ct= new CircleTransfer();
		ct.setxPos(xPos);
		ct.setyPos(yPos);
		ct.setRadius(radius);
		return ct;
	}
}

class CircleTransfer{
	private int xPos, yPos;
	

	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	private int radius;
}

interface CircleDAO{
	 int insertCircleTransfer(CircleTransfer ct);
	 CircleTransfer getCircle(int id);
	 void deleteCircleTransfer(int id);
}

class RDBMCDAO implements CircleDAO{

	@Override
	public int insertCircleTransfer(CircleTransfer ct) {
		System.out.println("Circle inserted");
		return 0;
	}

	@Override
	public CircleTransfer getCircle(int id) {

		System.out.println("Circle found and returned");
		return null;
	}

	@Override
	public void deleteCircleTransfer(int id) {
        System.out.println("circle deleted");
		
	}
	
}

class CircleDAOFactory{
	public static CircleDAO getCircleDAO(String daoType){
		switch(daoType){
		case "rdbms": return new RDBMCDAO();
		default: return null;
		}
	}
}

public class TestDAOPattern {

	public static void main(String[] args) {
		CircleDAO cd= CircleDAOFactory.getCircleDAO("rdbms");
		Circle cl= new Circle(10,20,30);
		//better to get the circle transfer from the circle 
		CircleTransfer ct= cl.getCircleTransfer();
	    int cid= cd.insertCircleTransfer(ct);
	     cd.getCircle(cid);
	     cd.deleteCircleTransfer(cid);

	}

}
