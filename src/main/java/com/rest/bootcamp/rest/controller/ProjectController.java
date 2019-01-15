package com.rest.bootcamp.rest.controller;

import com.rest.bootcamp.rest.model.Project;
import com.rest.bootcamp.rest.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/project")
public class ProjectController
{
    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Project> getAllProjects()
    {
        return projectRepository.findAll();
    }
}
