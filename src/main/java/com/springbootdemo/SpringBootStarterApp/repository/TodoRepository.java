package com.springbootdemo.SpringBootStarterApp.repository;

import com.springbootdemo.SpringBootStarterApp.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
