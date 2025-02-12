package com.app.todo_app.controller;

import com.app.todo_app.model.Task;
import com.app.todo_app.services.TaskServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping
public class TaskController {

    private final TaskServices taskServices;

    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskServices.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping
    public String createTask(@RequestParam String title){
        taskServices.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        taskServices.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/completed")
    public String completeTask(@PathVariable Long id){
        taskServices.completeTask(id);
        return "redirect:/";
    }
}
