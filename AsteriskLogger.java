package myInterfaces;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String log) {
		System.out.println("***"+ log + "***" + "\n" );	
	}

	@Override
	public void Error(String error) {
		
		System.err.println("*****************");
		System.err.println("***Error:" + error + "***");
		System.err.println("*****************");
		
	}

}
