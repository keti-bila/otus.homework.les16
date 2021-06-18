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

    @Bean(name = BeanNames.VEGAN_PIZZA)
    public Pizza veganPizza(VeganPizza veganTaste) {
        return new Pizza(veganTaste);
    }

    @Bean(name = BeanNames.MEAT_PIZZA)
    public Pizza meatPizza(MeatPizza meatTaste) {
        return new Pizza(meatTaste);
    }
}
