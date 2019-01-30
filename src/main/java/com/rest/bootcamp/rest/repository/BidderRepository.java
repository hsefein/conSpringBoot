package com.connect.connect2.repository;

import com.connect.connect2.model.Bidder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RepositoryRestController
public interface BidderRepository extends CrudRepository<Bidder, Long> {
//    List<Bidder> findByName (@Param(value = "bidder_name") String bidder_name);
}
