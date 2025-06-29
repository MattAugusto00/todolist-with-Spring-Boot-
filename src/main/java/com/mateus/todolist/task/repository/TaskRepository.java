package com.mateus.todolist.task.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.todolist.task.model.Task;

public interface TaskRepository extends JpaRepository<Task, UUID> {
    
}
