package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.query.entity.User;
import com.example.demo.query.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	UserRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUser() {

		User user = new User(0L, "foo");
		repository.save(user);

	}

}
