package practice200322.singleton;

public class DCL {
    private static volatile   DCL instance ;
    private DCL() {
    }

    public static DCL getInstance() {
        if (instance==null) {
            synchronized(DCL.class){
                if (instance==null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        int k=10;
        for (int i = 0; i < k; i++) {
            new Thread(()->{
                System.out.println(DCL.getInstance());
            }).start();
        }
    }
}
