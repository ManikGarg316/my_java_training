package springcore1;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class Test {
	public static void main(String[] args) 
	{
	Resource res=new ClassPathResource("applicationContext.xml");//Takes the path of the xml file.
	BeanFactory fact=new XmlBeanFactory(res);
	
	Employee st=(Employee)fact.getBean("ob1");
st.display();
		
	}

}
