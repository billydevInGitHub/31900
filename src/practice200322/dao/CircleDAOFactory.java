package practice200322.dao;

public class CircleDAOFactory {
    public static CircleDAO getDAO(String name) {
        switch (name) {
            case "RDBMS":
                return new RDBMSDAO();
        }
        return null;
    }
}
