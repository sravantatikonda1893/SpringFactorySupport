package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
//Through factory we are becoming independent. If we want to change from Audi to Honda we should change it in spring.xml
//<value>Honda</value> tag
public class Client {

	public static void main(String[] args) 

	{

		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
//		Implementation object is returned into interface reference.   
		Car c=	(Car)ap.getBean("cf");
		c.drive();
	}

}
