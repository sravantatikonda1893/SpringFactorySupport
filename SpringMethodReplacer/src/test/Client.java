package test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;
public class Client {

	public static void main(String[] args) throws SQLException 

	{
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
//		Here 'b', is the proxy object which is a child class of Bank
		Bank b=(Bank)ap.getBean("b");
//Will show the proxy class using the below logic
		System.out.println(b.getClass().getCanonicalName());
		b.calInterest();
	b.deposit();
	b.withdraw();
	}

}
