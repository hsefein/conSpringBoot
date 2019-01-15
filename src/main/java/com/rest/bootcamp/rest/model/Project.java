package com.rest.bootcamp.rest.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Project
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer project_id;
    private String project_name;

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
    private List<Task> taskList = new ArrayList<>();

    public Project(){}

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public String toString() {
        return "Project{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", taskList=" + taskList +
                '}';
    }
}
