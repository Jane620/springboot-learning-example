package demo.springboot.web;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloControllerTest {

    @Test
    public void testsayHello(){
        assertEquals("Hello，Spring Boot！",new HelloController().sayHello());
    }
}
