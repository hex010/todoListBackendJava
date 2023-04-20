package Todo.TodoListSpringBootJPA.repository;

import Todo.TodoListSpringBootJPA.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, String> {

}
