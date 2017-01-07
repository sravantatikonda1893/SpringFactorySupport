package beans;

public class Test {

	private static Test t;
	private Test(){
	System.out.println("Test object");
}
//	Singleton class implementation
//	Direct Test class instantiation is not possible
public static Test getInstance()
{
	if(t==null)
	{
		t=new Test();
		return t;
	}
	else return t;
}
//We are restricting more than once instantiation by this method
protected Object clone()
        throws CloneNotSupportedException
{
throw new CloneNotSupportedException();	
}

}

/*
ResourceBundle is a singleton class. because it contains static content, it is not needed to instantiate more than once.
Hence, it returns the same object which it gave for first instantiation. 
By this, we save heap memory by allowing the instantiation of a static class more than once--
If the class has the dynamic content it is not recommended to put as singleton.
[ ResourcseBundle rb1= ResourcseBundle.getByndle();
 ResourcseBundle rb2= ResourcseBundle.getByndle();
S.o.pln(rb1==rb2);//true ]
*/ 
