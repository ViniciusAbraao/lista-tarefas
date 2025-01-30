package com.edu.vini.thyme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edu.vini.thyme.model.Task;
import com.edu.vini.thyme.services.TaskService;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/create")
    public String criar() {
        return "create";
    }

    @PostMapping("/create")
    public String create(Task task) {
        Long id = (long) (taskService.getTasks().size() + 1);
        task.setId(id);
        taskService.addTask(task);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("list");
        mv.addObject("tasks", taskService.getTasks());
        return mv;
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/list";
    }
}
