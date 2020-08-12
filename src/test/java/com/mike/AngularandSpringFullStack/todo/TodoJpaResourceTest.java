package com.mike.AngularandSpringFullStack.todo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertTrue;

// TODO: odstranit chybu: java.lang.IllegalStateException: Failed to load ApplicationContext

@ContextConfiguration(locations = "classpath:application.properties")
//@RunWith(SpringRunner.class)
//@DataJpaTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodoJpaResourceTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    @BeforeAll
    static void init() {

    }

    @Test
    void homePageReturnsVesionNumberCorrectly_thenSuccess() {
        String renderedHtml = this.restTemplate.getForObject("http://localhost:" + port + "/", String.class);
        assertTrue(renderedHtml.contains("3.3.3"));
    }

    @Test
    void getAllTodos() {
    }

    @Test
    void getTodo() {
    }

    @Test
    void updateTodo() {
    }

    @Test
    void deleteTodo() {
    }

    @Test
    void createTodo() {
    }
}