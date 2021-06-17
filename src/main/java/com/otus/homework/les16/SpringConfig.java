package com.otus.homework.les16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.otus.homework.les16")
public class SpringConfig {

    @Bean
    public VeganPizza veganTaste() {
        return new VeganPizza();
    }

    @Bean
    public MeatPizza meatTaste() {
        return new MeatPizza();
    }

    @Bean
    public Pizza veganPizza() {
        return new Pizza(veganTaste());
    }

    @Bean
    public Pizza meatPizza() {
        return new Pizza(meatTaste());
    }
}
