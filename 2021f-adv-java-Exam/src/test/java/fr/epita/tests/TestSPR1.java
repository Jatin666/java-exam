package fr.epita.tests;


import fr.epita.tests.spring.config;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.inject.Inject;
import javax.inject.Named;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {config.Config.class})

public class TestSPR1 {
    static {
        System.setProperty("conf.file", "src/test/resources/conf.properties");
    }
    @Inject
    @Named("myFirstBean")
    String myBean;

    @Test
    public void myFirstBean(){
        Assertions.assertNotNull(myBean);;
        System.out.println(myBean);
    }

}
