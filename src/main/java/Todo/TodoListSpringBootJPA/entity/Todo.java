package Todo.TodoListSpringBootJPA.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "todo")
public class Todo {
    @Id
    private String id;
    private String title;
    private String description;
    private boolean completed;
}
