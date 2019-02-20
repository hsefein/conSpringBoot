package com.activedroute.activatedroute.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "detail", types = {PersonTask.class})
public interface PersonTaskDetailProjection {
    PersonDetailProjection getPerson();
    TaskDetailProjection getTask();
}
