package beans;

public class CarFactory {
public  String carName;

public  void setCarName(String carName) {
	this.carName = carName;
}
//Instance factory method
public  Car getInstance() throws Exception
{	
	Car c=(Car)Class.forName(carName).newInstance();
	return c;
	
}
}

/*--Factory can have static and instance methods.
--Factory class main aim:
1. Hide Instantiation logic
2. By returning instance into interface ref.
3. Factories will make client independent irrespective of their implementations.
4. Connection(I)--implementations are given for this  Connection -OracleDriver(By Oracle)

Factory class: DriverManger.getConnection();
*/