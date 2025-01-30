package com.edu.vini.thyme.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.vini.thyme.model.Task;

@Service
public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void deleteTask(Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }

    public void clearTasks() {
        tasks.clear();
    }
}
