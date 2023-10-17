package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("updation")
public class UpdateDemo implements CommandLineRunner, Ordered{
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String x = "update hdfcemploy set name=?, address=? where empno=?";
		int count = jt.update(x, "sandip", "pune", 101);
		System.out.println("row updated: "+count);
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

}
