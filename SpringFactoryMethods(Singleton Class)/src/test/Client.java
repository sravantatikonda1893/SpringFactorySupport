package test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring_byName.xml");
		Test t1=(Test)ap.getBean("t");
		Test t2=(Test)ap.getBean("t");
		System.out.println(t1==t2);//true
//		As both are singleton classes
		Calendar c1=(Calendar)ap.getBean("c");
		Calendar c2=(Calendar)ap.getBean("c");
		System.out.println(c1==c2);//true
	}

}

/*--Calender class is also Singleton class. 
We can obtain its instance by using its method getInstance()(factory method).
Calender c=Calender.getInstance();--singleton classes return same objects.
*/