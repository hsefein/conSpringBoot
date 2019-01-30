package com.connect.connect2.repository;

import com.connect.connect2.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins= "*")
@RepositoryRestController
public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findByName(@Param(value = "task_name") String task_name);
}
