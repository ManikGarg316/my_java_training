package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component("ob1")
public class MyMessage implements CommandLineRunner, Ordered {
public void welcome() {
	System.out.println("welcome to spring boot");
}

public int sum(int a, int b) {
	return a+b;
}

@Override
public int getOrder() {
	// TODO Auto-generated method stub
	return 3;
}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	System.out.println("this is message");
}
}
