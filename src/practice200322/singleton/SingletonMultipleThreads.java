package practice200322.singleton;

public class SingletonMultipleThreads {
    private static class Inner {
        private static SingletonMultipleThreads instance= new SingletonMultipleThreads();
    }

    private SingletonMultipleThreads() {
    }

    public static SingletonMultipleThreads getInstance() {
        return  Inner.instance;
    }

    public static void main(String[] args) {
        int k=10;
        for (int i = 0; i < k; i++) {
            new Thread(()->{
                System.out.println(SingletonMultipleThreads.getInstance());
            }).start();
        }
    }
}
