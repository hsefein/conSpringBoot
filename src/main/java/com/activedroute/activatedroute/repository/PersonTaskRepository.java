package com.activedroute.activatedroute.repository;

import com.activedroute.activatedroute.model.PersonTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins= "*", methods = { RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.OPTIONS, RequestMethod.GET }  )
@RepositoryRestResource
public interface PersonTaskRepository extends CrudRepository<PersonTask, Long> {
    List<PersonTask> findByPersonId (@Param(value = "person_id") Long person_id);
    List<PersonTask> findByTaskId (@Param(value = "task_id") Long task_id);
}
