package com.div.springtesting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.div.springtesting.controller.MCFController;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {
	@Autowired
	private MCFController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
