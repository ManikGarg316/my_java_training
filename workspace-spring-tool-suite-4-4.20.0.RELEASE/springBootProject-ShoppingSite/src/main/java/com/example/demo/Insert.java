package com.example.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Insert implements CommandLineRunner, Ordered{
	@Autowired
	private JdbcTemplate jt;
	
	
	public void doTask() throws Exception {
		String x = "insert into products(product_id, name, price, date) values(?,?,?,?)";
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter product details: [id, name, price, date]");
		int id = ob.nextInt();
		String name = ob.next();
		float price = ob.nextFloat();
		String date = ob.next();
		int count = jt.update(x, id, name, price, date);
		System.out.println("row inserted: "+count);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Insertion started...");
		doTask();
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}