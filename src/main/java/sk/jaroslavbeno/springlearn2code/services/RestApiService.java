package sk.jaroslavbeno.springlearn2code.services;

import sk.jaroslavbeno.springlearn2code.model.Employee;
import sk.jaroslavbeno.springlearn2code.model.Todo;
import sk.jaroslavbeno.springlearn2code.model.TodoList;

import java.util.List;

public interface RestApiService {
    Employee getEmployee(Long id);
    Todo getTodo(Long id);
    List<Todo> getTodos();
    TodoList getTodoList();
}
