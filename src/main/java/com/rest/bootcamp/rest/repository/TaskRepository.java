package com.rest.bootcamp.rest.repository;

import com.rest.bootcamp.rest.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
