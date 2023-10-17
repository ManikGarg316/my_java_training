package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee implements CommandLineRunner, Ordered{
int empno;
String name;
String address;
int salary;
void input() {
	System.out.println("enter empno,name,address and salary");
	Scanner ob = new Scanner(System.in);
	empno = ob.nextInt();
	name = ob.next();
	address = ob.next();
	salary = ob.nextInt();
	ob.close();
}

void display() {
	System.out.println("The empno is: "+empno);
	System.out.println("The name is: "+name);
	System.out.println("The address is: "+address);
	System.out.println("The salary is: "+salary);
}

@Override
public int getOrder() {
	// TODO Auto-generated method stub
	return 1;
}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	System.out.println("this is employee");
}
}
