package com.rest.bootcamp.rest.controller;

import com.rest.bootcamp.rest.model.Task;
import com.rest.bootcamp.rest.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/tasks")
public class TaskController
{
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Task> getAllTasks()
    {
        return taskRepository.findAll();
    }
}
