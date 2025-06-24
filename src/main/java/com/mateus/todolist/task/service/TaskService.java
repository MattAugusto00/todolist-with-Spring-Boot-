package com.mateus.todolist.task.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.mateus.todolist.task.model.Task;
import com.mateus.todolist.task.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Task create(Task task) {
        return taskRepository.save(task);
    }

    public Task update(Task task) {
        return taskRepository.save(task);
    }

    public void delete(UUID id) {
        taskRepository.deleteById(id);
    }

    public Task findById(UUID id) {
        return taskRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public List<Task> listAll() {
        return taskRepository.findAll();
    }

}
