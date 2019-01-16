package com.rest.bootcamp.rest.repository;

import com.rest.bootcamp.rest.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(allowedHeaders = "*", origins= "*")
@RepositoryRestController
public interface TaskRepository extends CrudRepository<Task, Long> {
}
