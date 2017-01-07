package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalInterest implements MethodReplacer {
//If we want to re-implement the logic of method calInterest of Bank class..
//	We need to create a new class implementing MethodReplacer interface
	@Override
	public Object reimplement(Object o, Method m, Object[] oarr) throws Throwable {

		System.out.println("New Calulate interest method");
		return o;
	}

}
