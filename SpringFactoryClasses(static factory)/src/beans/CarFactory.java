package beans;

public class CarFactory {
public static String carName;

public static void setCarName(String carName) {
	CarFactory.carName = carName;
}
//By default Spring will make this class as singleton. Hence, we don't need to write singleton code
public static Car getInstance() throws Exception
{	
	Car c=(Car)Class.forName(carName).newInstance();
	return c;
	
}
}

/*But, factory classes return other objects(Static factory)...
Logger l=LoggerFactory.getLogger();
Validator v=ValidatorFactory.getValidator();
*/