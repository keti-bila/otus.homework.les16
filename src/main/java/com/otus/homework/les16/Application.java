package com.otus.homework.les16;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SpringConfig.class)
public class Application implements CommandLineRunner {

	private final Pizza pizzaForStudent;
	private final Pizza pizzaForWorker;

	public Application(@Qualifier(BeanNames.VEGAN_PIZZA) Pizza pizzaForStudent,
					   @Qualifier(BeanNames.MEAT_PIZZA) Pizza pizzaForWorker) {
		this.pizzaForStudent = pizzaForStudent;
		this.pizzaForWorker = pizzaForWorker;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(pizzaForStudent.readyToEat());
		System.out.println(pizzaForWorker.readyToEat());
	}
}
