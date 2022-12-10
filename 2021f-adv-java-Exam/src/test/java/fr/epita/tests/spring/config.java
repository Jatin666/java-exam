package fr.epita.tests.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class config {
    @Configuration
    public class Config {

        @Bean //TestSPR1
        public String myFirstBean() {
            return "test from spring";
        }

    }
    }
