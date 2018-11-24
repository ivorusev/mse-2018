package com.oop.springboot.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.oop.springboot.demo.rest.KnightRestService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private KnightRestService service;

	@Test
	public void contextLoads() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getForEntity("http://localhost:8099/get-knights", List.class);
		// assertTrue(actual.isEmpty());
	}

}
