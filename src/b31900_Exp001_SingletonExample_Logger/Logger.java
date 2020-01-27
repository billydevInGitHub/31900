package b31900_Exp001_SingletonExample_Logger;

public class Logger {
	
	//originally copied from book 121PD129
	private Logger(){
		
	}

	// now sure if the following need to be public
	private static Logger log;
	public static Logger getInstance(){
		if(log==null){
			log=new Logger();
		}
		return log; 
	}
	
	public void log(String s) {
		System.err.println(s);

	}

}
