package myInterfaces;

public class SpaceLogger implements Logger{

	@Override
	public void Log(String log) {
		System.out.println("\n"+String.join(" ", log.split(""))+"\n");
	}

	@Override
	public void Error(String error) {
				System.err.println("ERROR:" + String.join(" ", error.split("")));	
	}
	

}
