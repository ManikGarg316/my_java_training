package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Delete implements CommandLineRunner, Ordered{
	@Autowired
	private JdbcTemplate jt;
	
	
	public void doTask() throws Exception {
		String x = "delete from products where DATEDIFF(CURRENT_DATE(), date) > 365";
		int count = jt.update(x);
		System.out.println("row deleted: "+count);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Deletion started...");
		doTask();
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 3;
	}

}