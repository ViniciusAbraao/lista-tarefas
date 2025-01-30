package com.edu.vini.thyme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.edu.vini.thyme.services.TaskService;

@Controller
public class MainController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String home() {
        taskService.clearTasks();
        return "redirect:/create";
    }

}
