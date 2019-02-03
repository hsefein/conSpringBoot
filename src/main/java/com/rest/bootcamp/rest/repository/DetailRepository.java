package com.connect.connect2.repository;

import com.connect.connect2.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RepositoryRestController
public interface DetailRepository extends CrudRepository<Detail, Long> {
    List<Detail> findBystartdate (@Param(value = "detail_startdate") Date detail_startdate);
    List<Detail> findByenddate (@Param(value = "detail_enddate") Date detail_enddate);
    List<Project> findByProjectName (@Param(value = "project_name") String project_name);
    List<Task> findByTaskName (@Param(value = "task_name") String task_name);
    List<Bidder> findByBidderName (@Param(value = "bidder_name") String bidder_name);
}
