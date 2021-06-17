package com.otus.homework.les16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Pizza pizzaForStudent = context.getBean("veganPizza", Pizza.class);
		System.out.println(pizzaForStudent.readyToEat());

		Pizza pizzaForWorker = context.getBean("meatPizza", Pizza.class);
		System.out.println(pizzaForWorker.readyToEat());
	}
}
