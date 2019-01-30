package com.connect.connect2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long task_id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "task", fetch = FetchType.LAZY)
    private List<Detail> detailList = new ArrayList<>();

    public Task() { }

    public Task(String name, String description, List<Detail> detailList) {
        this.name = name;
        this.description = description;
        this.detailList = detailList;
    }

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id=" + task_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", detailList=" + detailList +
                '}';
    }
}
