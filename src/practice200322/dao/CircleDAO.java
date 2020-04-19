package practice200322.dao;

public interface CircleDAO {
    int insertCircle(CircleDTO circleDTO);

    void deleteCircle(CircleDTO circleDTO);

    CircleDTO getCircle(int circleID);
}
