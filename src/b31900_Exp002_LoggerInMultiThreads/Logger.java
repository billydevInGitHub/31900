package b31900_Exp002_LoggerInMultiThreads;

public class Logger {
	//from 121PD130
	
	private Logger(){
		
	}
	public static Logger myInstance; 
	
	public synchronized static Logger getInstance(){
		if(myInstance==null){
			myInstance=new Logger();
		}
		return myInstance; 
	}
	
	public void log(String s){
		System.err.println(s);
	}
}
