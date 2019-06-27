package com.app.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Book;
import com.app.repo.BookRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
@Autowired
private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		Map<String,String> m1=new HashMap<>();
		m1.put("M1","A1");m1.put("M2","A2");
		
		Properties p=new Properties();
		p.put("W1","Q1");p.put("W2","Q2");
		
		repo.save(new Book("JAVA","Rich",333.0,
				   Arrays.asList("AJ","CJ","MJ"),
				  new String[]{"A","B","C"},m1,p));
	}

}
