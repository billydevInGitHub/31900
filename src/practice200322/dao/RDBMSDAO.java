package practice200322.dao;

public class RDBMSDAO implements  CircleDAO {
    @Override
    public int insertCircle(CircleDTO circleDTO) {
        System.out.println("inserted circle");
        return 0;
    }

    @Override
    public void deleteCircle(CircleDTO circleDTO) {
        System.out.println("circle deleted");
    }

    @Override
    public CircleDTO getCircle(int circleID) {
        return new CircleDTO(3, 4, 5);
    }
}
