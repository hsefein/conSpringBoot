package com.activedroute.activatedroute.repository;

import com.activedroute.activatedroute.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins= "*", methods = { RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.OPTIONS, RequestMethod.GET }  )
@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findByName (@Param(value = "task_name") String task_name);
}
