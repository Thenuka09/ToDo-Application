package com.app.todo_app.repository;

import com.app.todo_app.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    //List<Task> findByCompletedFalse();
}
