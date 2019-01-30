package com.connect.connect2.repository;

import com.connect.connect2.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RepositoryRestController
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    List<Owner> findByName (@Param(value = "owner_name") String owner_name);
}

