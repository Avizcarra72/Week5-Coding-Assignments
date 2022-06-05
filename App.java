package myInterfaces;

public class App {

	public static void main(String[] args) {
   //Logger logger = new AsteriskLogger();
    Logger logger = new AsteriskLogger();
    logger.Log("Hello");
    logger.Error("Hello");
    
    Logger logger2 = new SpaceLogger();
    logger2.Log("Hello");
    logger2.Error("Hello");

	}

}
