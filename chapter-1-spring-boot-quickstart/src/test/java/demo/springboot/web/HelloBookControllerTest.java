package demo.springboot.web;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloBookControllerTest {

    @Test
    public void testsayHello(){
        assertEquals("Hello，《Spring Boot 2.x 核心技术实战 - 上 基础篇》！",new HelloBookController().sayHello());
    }
}
