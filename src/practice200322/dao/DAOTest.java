package practice200322.dao;

public class DAOTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4,5,6);
        CircleDTO circleDTO = circle.getCircleDTO();
        CircleDAO circleDAO = CircleDAOFactory.getDAO("RDBMS");
        circleDAO.insertCircle(circleDTO);
        System.out.println(circleDAO.getCircle(0));
        circleDAO.deleteCircle(circleDTO);
    }
}
