package b31900_Exp009SingletonInnerClass;

@SuppressWarnings("LossyEncoding")
public class Singleton {
	    private Singleton(){

	    }
	    private static class Inner{
	        private static Singleton instance=new Singleton();
	    }
	    //������
	    //synchronized
	    //<init>
	    public static Singleton getInstance(){
	        return Inner.instance;
	    }

	    //�㷺��һ�ֵ���ģʽ
}
