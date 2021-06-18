package com.otus.homework.les16;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class ApplicationTests {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

	@Test
	void contextLoads() {
		Pizza meatLoverPizza = context.getBean("meatPizza", Pizza.class);
		String result = meatLoverPizza.readyToEat();

		Assert.isTrue(result.equals("Pizza is ready with taste: Meat"), "Pizza has wrong taste");
	}
}
