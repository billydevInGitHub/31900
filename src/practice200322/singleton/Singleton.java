package practice200322.singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getIntanace() {
        if (instance==null) {
            instance= new Singleton();
        }
        return instance;
    }
    public void log() {
        System.out.println("logging ...");
    }

    public static void main(String[] args) {
        int k=10;
        for (int i = 0; i < k; i++) {
            new Thread(()->{
                System.out.println(Singleton.getIntanace());
            }).start();
        }
    }
}
