import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class Test {
	public static void main(String[] args) 
	{
	Resource res=new ClassPathResource("applicationContext.xml");//Takes the path of the xml file.
	BeanFactory fact=new XmlBeanFactory(res);
	
	Student stud=(Student)fact.getBean("obj1");
	stud.display();
	
	Student stud1=(Student)fact.getBean("obj2");
	stud1.display();
	
	
	}

}
