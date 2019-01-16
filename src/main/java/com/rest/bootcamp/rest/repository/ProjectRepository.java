package com.rest.bootcamp.rest.repository;

import com.rest.bootcamp.rest.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins= "*")
@RepositoryRestController
public interface ProjectRepository extends CrudRepository<Project, Long> {
//    List<Project> findByName(@Param(value = "project_name") String project_name);
}
