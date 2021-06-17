package com.otus.homework.les16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Pizza pizzaForStudent = new Pizza(new VeganPizza());
		System.out.println(pizzaForStudent.readyToEat());

		Pizza pizzaForWorker = new Pizza(new MeatPizza());
		System.out.println(pizzaForWorker.readyToEat());
	}
}
