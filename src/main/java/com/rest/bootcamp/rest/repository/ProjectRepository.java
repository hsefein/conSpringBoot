package com.rest.bootcamp.rest.repository;

import com.rest.bootcamp.rest.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
