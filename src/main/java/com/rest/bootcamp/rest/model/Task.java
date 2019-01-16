package com.rest.bootcamp.rest.model;

import javax.persistence.*;

@Entity
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long task_id;
    private String task_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    public Task(){}

    public Task(String task_name, Project project) {
        this.task_name = task_name;
        this.project = project;
    }

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id=" + task_id +
                ", task_name='" + task_name + '\'' +
                ", project=" + project +
                '}';
    }
}
