package springcore1;
import java.util.*;
public class Employee
{
private int empid;
private String name;
private List<String> projects;
public Employee(int empid, String name, List<String> projects) 
{
	super();
	this.empid = empid;
	this.name = name;
	this.projects = projects;
}

public void display()
{
	System.out.println("the id is :"+empid);
	System.out.println("the name is :"+name);
	System.out.println("the project names are :");
		Iterator<String> itr=projects.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
