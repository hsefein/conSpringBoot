package com.activedroute.activatedroute.repository;

import com.activedroute.activatedroute.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@CrossOrigin(allowedHeaders = "*", origins= "*", methods = { RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.OPTIONS, RequestMethod.GET }  )
@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findByName (@Param(value = "person_name") String person_name);
//    List<Person> findByPersonId (@Param(value = "person_id") Long person_id);

}
