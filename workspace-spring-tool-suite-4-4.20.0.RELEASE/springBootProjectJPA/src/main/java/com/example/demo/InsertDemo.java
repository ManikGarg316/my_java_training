package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("insertion")
public class InsertDemo implements CommandLineRunner, Ordered{
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String x = "insert into hdfcemploy values(?,?,?)";
		int count = jt.update(x, 101, "sandip", "Bangalore");
		System.out.println("row inserted: "+count);
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
