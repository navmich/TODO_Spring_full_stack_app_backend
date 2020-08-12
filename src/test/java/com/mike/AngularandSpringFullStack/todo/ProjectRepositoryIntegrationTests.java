package com.mike.AngularandSpringFullStack.todo;

import com.mike.AngularandSpringFullStack.AngularAndSpringFullStackApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(classes= AngularAndSpringFullStackApplication.class)
@RunWith(SpringRunner.class)
@DataJpaTest
@SqlGroup({@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = {"classpath:schema.sql", "classpath:data.sql"}),
        @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = {"classpath:drop.sql"})})
public class ProjectRepositoryIntegrationTests {

    @Autowired
    TodoJpaRepository repository;

    @Test
    public void ifNewTodoSaved_thenSuccess() {
        Todo todo = new Todo();
        todo.setUsername("Ales");
        todo.setTitle("Nakoupit");
        todo.setDescription("koupit mleko a vejce");
        todo.setDone(false);

        repository.save(todo);

        assertEquals(11, repository.findAll().size());
    }
}
